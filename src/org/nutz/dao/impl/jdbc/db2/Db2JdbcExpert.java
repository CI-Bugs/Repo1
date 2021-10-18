package org.nutz.dao.impl.jdbc.db2;

import org.nutz.dao.DB;
import org.nutz.dao.Dao;
import org.nutz.dao.Sqls;
import org.nutz.dao.entity.Entity;
import org.nutz.dao.entity.MappingField;
import org.nutz.dao.entity.PkType;
import org.nutz.dao.impl.jdbc.AbstractJdbcExpert;
import org.nutz.dao.jdbc.JdbcExpertConfigFile;
import org.nutz.dao.jdbc.ValueAdaptor;
import org.nutz.dao.pager.Pager;
import org.nutz.dao.sql.Pojo;
import org.nutz.dao.sql.Sql;
import org.nutz.dao.util.Pojos;

public class Db2JdbcExpert extends AbstractJdbcExpert {

    public Db2JdbcExpert(JdbcExpertConfigFile conf) {
        super(conf);
    }

    public String getDatabaseType() {
        return DB.DB2.name();
    }

    // TODO not tested!!
    public boolean createEntity(Dao dao, Entity<?> en) {
        StringBuilder sb = new StringBuilder("CREATE TABLE " + en.getTableName() + "(");
        // 创建字段
        for (MappingField mf : en.getMappingFields()) {
            if (mf.isReadonly())
                continue;
            sb.append('\n').append(mf.getColumnName());
            sb.append(' ').append(evalFieldType(mf));
            // 非主键的 @Name，应该加入唯一性约束
            if (mf.isName() && en.getPkType() != PkType.NAME) {
                sb.append(" UNIQUE NOT NULL");
            }
            // 普通字段
            else {
                if (mf.isNotNull() || mf.isPk())
                    sb.append(" NOT NULL");
                if (mf.hasDefaultValue()) {
                    addDefaultValue(sb, mf);
                }
                if (mf.isAutoIncreasement())
                    sb.append(" generated by default as identity ");
                if (mf.isPk() && en.getPks().size() == 1) {
                    sb.append(" primary key ");
                }
            }
            sb.append(',');
        }
        // 结束表字段设置
        sb.setCharAt(sb.length() - 1, ')');

        // 执行创建语句
        dao.execute(Sqls.create(sb.toString()));

        // 创建联合主键
        if (en.getPks().size() > 1) {
            sb = new StringBuilder();
            sb.append("ALTER TABLE ").append(en.getTableName()).append(" ADD CONSTRAINT PK_");
            sb.append(makePksName(en));
            sb.append(" PRIMARY KEY (");
            for (MappingField mf : en.getPks()) {
                sb.append(mf.getColumnName()).append(",");
            }
            sb.setCharAt(sb.length() - 1, ')');
            dao.execute(Sqls.create(sb.toString()));
        }

        // 创建关联表
        createRelation(dao, en);
        // 创建索引
        dao.execute(createIndexs(en).toArray(new Sql[0]));
        // 添加注释(表注释与字段注释)
        addComment(dao, en);

        return true;
    }

    public String evalFieldType(MappingField mf) {
        if (mf.getCustomDbType() != null)
            return mf.getCustomDbType();
        switch (mf.getColumnType()) {
        case BOOLEAN:
            return "SMALLINT";
        case INT:
            // 用户自定义了宽度
            // if (mf.getWidth() > 0)
            // return "decimal(" + mf.getWidth() + ")";
            // 用数据库的默认宽度
            return "INTEGER";

        case FLOAT:
            // 用户自定义了精度
            if (mf.getWidth() > 0 && mf.getPrecision() > 0) {
                return "decimal(" + mf.getWidth() + "," + mf.getPrecision() + ")";
            }
            // 用默认精度
            if (mf.getTypeMirror().isDouble())
                return "decimal(15,10)";
            return "FLOAT";
        case TIMESTAMP:
        	return "TIMESTAMP";
        default:
            break;
        }
        return super.evalFieldType(mf);
    }

    public void formatQuery(Pojo pojo) {
        Pager pager = pojo.getContext().getPager();
        // 需要进行分页
        if (null != pager && pager.getPageNumber() > 0) {
            // 之前插入
            pojo.insertFirst(Pojos.Items.wrap("SELECT * FROM ("
                                                + "SELECT ROW_NUMBER() OVER() AS ROWNUM, "
                                                + "T.* FROM ("));
            // 之后插入
            pojo.append(Pojos.Items.wrapf(    ") T) AS A WHERE ROWNUM BETWEEN %d AND %d",
                                            pager.getOffset() + 1,
                                            pager.getOffset() + pager.getPageSize()));
        }
    }

    public void formatQuery(Sql sql) {
        Pager pager = sql.getContext().getPager();
        if (null != pager && pager.getPageNumber() > 0) {
            String pre = "SELECT * FROM (SELECT ROW_NUMBER() OVER() AS ROWNUM, T.* FROM (";
            String last = String.format(    ") T) AS A WHERE ROWNUM BETWEEN %d AND %d",
                    pager.getOffset() + 1,
                    pager.getOffset() + pager.getPageSize());
            sql.setSourceSql(pre + sql.getSourceSql() + last);
        }
    }
    
    public ValueAdaptor getAdaptor(MappingField ef) {
        if (ef.getTypeMirror().isBoolean())
            return new DB2BooleanAdaptor();
        return super.getAdaptor(ef);
    }
}
