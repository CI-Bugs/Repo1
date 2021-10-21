package com.peterphi.std.guice.web.rest.service.servicedescription.freemarker;

import com.peterphi.std.util.DOMUtils;
import com.peterphi.std.util.jaxb.JAXBSerialiser;
import com.peterphi.std.util.jaxb.MultiXSDGenerator;
import com.peterphi.std.util.jaxb.type.MultiXSDSchemaFiles;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.IOException;
import java.util.Arrays;

public class SchemaGenerateUtil
{
	public String generate(JAXBSerialiser serialiser) throws IOException
	{
		final MultiXSDSchemaFiles schemas = new MultiXSDGenerator().withLoosenXmlAnyConstraints(true).generate(serialiser);

		if (schemas.files.size() == 1)
		{
			// Single schema, can be serialised as a simple XSD
			return DOMUtils.serialise(schemas.files.get(0).schemaElement());
		}
		else
		{
			// Complex schema, needs to be represented with multi-xsd schema
			return JAXBSerialiser.getInstance(MultiXSDSchemaFiles.class).serialise(schemas);
		}
	}


	/**
	 * Retrieve a schema description for a type
	 *
	 * @param clazz
	 *
	 * @return
	 */
	public String getSchema(Class<?> clazz)
	{
		if (clazz == Integer.class || clazz == Integer.TYPE)
		{
			return "integer [" + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE + "]";
		}
		else if (clazz == Long.class || clazz == Long.TYPE)
		{
			return "long [" + Long.MIN_VALUE + " to " + Long.MAX_VALUE + "]";
		}
		else if (clazz == Double.class || clazz == Double.TYPE)
		{
			return "double [" + Double.MIN_VALUE + " to " + Double.MAX_VALUE + "]";
		}
		else if (clazz == Boolean.class || clazz == Boolean.TYPE)
		{
			return "boolean [true, false]";
		}
		else if (clazz == Void.class)
		{
			return "void";
		}
		else if (clazz == Byte[].class || clazz == byte[].class)
		{
			return "binary stream";
		}
		else if (clazz.isEnum())
		{
			return "enum " + Arrays.asList(clazz.getEnumConstants());
		}
		else if (clazz.isAnnotationPresent(XmlRootElement.class))
		{
			try
			{
				final JAXBSerialiser serialiser = JAXBSerialiser.getMoxy(clazz);

				return generate(serialiser);
			}
			catch (Exception e)
			{
				// Ignore
				return "error generating schema for " + clazz + ": " + e.getMessage();
			}
		}
		else if (clazz.isAnnotationPresent(XmlType.class) || clazz.isAnnotationPresent(XmlEnum.class))
		{
			// Class generated by JAXB XSD To Java (as a result we have to emit the entire schema rather than being able to provide a specific sub-schema for the type in question because XmlRootElement is not specified)
			try
			{
				final JAXBSerialiser serialiser = JAXBSerialiser.getMoxy(clazz.getPackage().getName());

				return generate(serialiser);
			}
			catch (Exception e)
			{
				// Ignore
				return "error generating schema for XSD-To-Java package schema for class " + clazz + ": " + e.getMessage();
			}
		}
		else
		{
			return clazz.toString();
		}
	}
}