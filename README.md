# CI-Bugs 

This is a collection of 102 regression bugs from the real time build pipe line (Travis) from 40 diverse projects. At first sight this might look as only a read me page but it has the complete dataset within the branches of this repo. Please read the below instructions carefully to setup the bugs.

## Setup

There are 2 ways to setup the bugs of this benchmark

1. Refer the original links of the bugs from the respective githubs shared in the table belo
2. Refer to the repository created here (branches created for each bug, bugs copied from various projects)

### Method 1
The table below contains details (scroll the table to right to see all columns)
1. Bug Id
2. Count of files modified
3. Count of lines modified
4. Buggy Commit
5. Fixed Commit
6. Diff Link

<!--
|Bug Id|Files modified|Lines modified|Buggy Commit|Fixed Commit|Diff Compare|
| ------------- | ------------- |-------------  | ------------- | ------------- |-------------  |
|Bug1|1|1|https://github.com/petergeneric/stdlib/commit/b63a6a839e276ac66a45b4e114894fb20cd7fa00 |https://github.com/petergeneric/stdlib/commit/e423651b7c715465271a4da4482d2cf2a9b3c955 |https://github.com/petergeneric/stdlib/compare/b63a6a839e276ac66a45b4e114894fb20cd7fa00..e423651b7c715465271a4da4482d2cf2a9b3c955 |
|Bug2|1|2|https://github.com/petergeneric/stdlib/commit/babdc2ac4bc058b470b1995e3965de8d44e9959d |https://github.com/petergeneric/stdlib/commit/4c51a3b3fcb881ab4177655389beac1796aec844 |https://github.com/petergeneric/stdlib/compare/babdc2ac4bc058b470b1995e3965de8d44e9959d..4c51a3b3fcb881ab4177655389beac1796aec844 |
|Bug3|1|1|https://github.com/davidmoten/rxjava-jdbc/commit/a32e185515b382657025cab5a099419a0cb53ce0 |https://github.com/davidmoten/rxjava-jdbc/commit/f1c233ea90a8eda2f1a40fefb6914a1bc43fd386 |https://github.com/davidmoten/rxjava-jdbc/compare/a32e185515b382657025cab5a099419a0cb53ce0..f1c233ea90a8eda2f1a40fefb6914a1bc43fd386 |
|Bug4|5|9|https://github.com/raphw/byte-buddy/commit/e1e2448fdf8b852f93399d075c39fda580e2ecc8 |https://github.com/raphw/byte-buddy/commit/8d601b3d69e598e0a67c964d2863ad7fcacd7e2b |https://github.com/raphw/byte-buddy/compare/e1e2448fdf8b852f93399d075c39fda580e2ecc8..8d601b3d69e598e0a67c964d2863ad7fcacd7e2b |
|Bug5|2|3|https://github.com/raphw/byte-buddy/commit/6c0f13fca731b3dc2b7346843e82bde8f2dc7907 |https://github.com/raphw/byte-buddy/commit/82c18a6fb4d38bb259a6da50e8b21bb919a48445 |https://github.com/raphw/byte-buddy/compare/6c0f13fca731b3dc2b7346843e82bde8f2dc7907..82c18a6fb4d38bb259a6da50e8b21bb919a48445 |
|Bug6|2|2|https://github.com/raphw/byte-buddy/commit/fbe90792a756f2d8ab93c644e9660d8e9a68bfe3 |https://github.com/raphw/byte-buddy/commit/0082105d9167c1247a2b7e623af05cd8b347f383 |https://github.com/raphw/byte-buddy/compare/fbe90792a756f2d8ab93c644e9660d8e9a68bfe3..0082105d9167c1247a2b7e623af05cd8b347f383 |
|Bug7|1|2|https://github.com/raphw/byte-buddy/commit/6dc2e39a295c0a401572db07a06980d8ada3d756 |https://github.com/raphw/byte-buddy/commit/7af7682f3ec0b25637f7462d3cd78e14262b628a |https://github.com/raphw/byte-buddy/compare/6dc2e39a295c0a401572db07a06980d8ada3d756..7af7682f3ec0b25637f7462d3cd78e14262b628a |
|Bug8|2|2|https://github.com/raphw/byte-buddy/commit/2a86dee218e5a3541ce72e0b126b5b742641f677 |https://github.com/raphw/byte-buddy/commit/f259f30b877e9c8eb952b853f2bb829d4a169b14 |https://github.com/raphw/byte-buddy/compare/2a86dee218e5a3541ce72e0b126b5b742641f677..f259f30b877e9c8eb952b853f2bb829d4a169b14 |
|Bug9|2|33|https://github.com/raphw/byte-buddy/commit/95aa155a555326e6a93d12bd9fa0bc41cbe5ece4 |https://github.com/raphw/byte-buddy/commit/0429d543594d94beef328b59b3facffa0b2864f1 |https://github.com/raphw/byte-buddy/compare/95aa155a555326e6a93d12bd9fa0bc41cbe5ece4..0429d543594d94beef328b59b3facffa0b2864f1 |
|Bug10|7|44|https://github.com/raphw/byte-buddy/commit/5ae39ba44121adfcb0ec201cdfa5148f2836355d |https://github.com/raphw/byte-buddy/commit/b1a06db21dcabdad76b5bd47121546ea96aef2e6 |https://github.com/raphw/byte-buddy/compare/5ae39ba44121adfcb0ec201cdfa5148f2836355d..b1a06db21dcabdad76b5bd47121546ea96aef2e6 |
|Bug11|1|5|https://github.com/chewiebug/GCViewer/commit/cbe1f1d68b53b95034b38bfc884855639d499e09 |https://github.com/chewiebug/GCViewer/commit/f395e2f8bd6dac839b4f9b38fe6278ca5623aa1f |https://github.com/chewiebug/GCViewer/compare/cbe1f1d68b53b95034b38bfc884855639d499e09..f395e2f8bd6dac839b4f9b38fe6278ca5623aa1f |
|Bug12|1|1|https://github.com/ontop/ontop/commit/87ed6c57918e3978f3825388b82bae15bbb5250b |https://github.com/ontop/ontop/commit/b1f2de252c2d547e3f851f9395ed94b975d40475 |https://github.com/ontop/ontop/compare/87ed6c57918e3978f3825388b82bae15bbb5250b..b1f2de252c2d547e3f851f9395ed94b975d40475 |
|Bug13|1|1|https://github.com/SpigotMC/BungeeCord/commit/d9a8311b8e40a0d390a993e409933f8ee737c12e |https://github.com/SpigotMC/BungeeCord/commit/2df29701edc984c97c6e860aa0ad8e47654fd6d4 |https://github.com/SpigotMC/BungeeCord/compare/d9a8311b8e40a0d390a993e409933f8ee737c12e..2df29701edc984c97c6e860aa0ad8e47654fd6d4 |
|Bug14|2|6|https://github.com/square/retrofit/commit/1411059b62c1abfe51b1b10d63ae8c254c0786a7 |https://github.com/square/retrofit/commit/fe1d01684c96d55224c67e67c31c3fd8faa05c24 |https://github.com/square/retrofit/compare/1411059b62c1abfe51b1b10d63ae8c254c0786a7..fe1d01684c96d55224c67e67c31c3fd8faa05c24 |
|Bug15|1|1|https://github.com/nutzam/nutz/commit/a1935ccca641f32cc5267265b416a0fe6c383e06 |https://github.com/nutzam/nutz/commit/f17f65cdc3d3c79e0f8cd41fe1b6e74ac798ad2d |https://github.com/nutzam/nutz/compare/a1935ccca641f32cc5267265b416a0fe6c383e06..f17f65cdc3d3c79e0f8cd41fe1b6e74ac798ad2d |
|Bug16|1|1|https://github.com/tananaev/traccar/commit/e512848dc07145664f3c5d0adff7a9f88b2f17b6 |https://github.com/tananaev/traccar/commit/7bd6551a2f5712d63bea7e8711944fbeb78323c8 |https://github.com/tananaev/traccar/compare/e512848dc07145664f3c5d0adff7a9f88b2f17b6..7bd6551a2f5712d63bea7e8711944fbeb78323c8 |
|Bug17|1|1|https://github.com/tananaev/traccar/commit/6883ecf8462e26f63d2709426c2cacf5dd318c49 |https://github.com/tananaev/traccar/commit/670acf03fb75e56fc0efc0c1fcfac04060bfb985 |https://github.com/tananaev/traccar/compare/6883ecf8462e26f63d2709426c2cacf5dd318c49..670acf03fb75e56fc0efc0c1fcfac04060bfb985 |
|Bug18|1|1|https://github.com/tananaev/traccar/commit/a6b8f7f7ef0fa3b58dcdfee38b18e61bd7ce18b4 |https://github.com/tananaev/traccar/commit/30d5a99aab58f8db6f3096d073db9b68c4b93c9d |https://github.com/tananaev/traccar/compare/a6b8f7f7ef0fa3b58dcdfee38b18e61bd7ce18b4..30d5a99aab58f8db6f3096d073db9b68c4b93c9d |
|Bug19|1|11|https://github.com/tananaev/traccar/commit/173d054219f1e37e7089c23cac0f530915834ee4 |https://github.com/tananaev/traccar/commit/766064092ca4f85eacfa741e1ff772ea5b981d1a |https://github.com/tananaev/traccar/compare/173d054219f1e37e7089c23cac0f530915834ee4..766064092ca4f85eacfa741e1ff772ea5b981d1a |
|Bug20|1|1|https://github.com/fayder/restcountries/commit/a3c566bde8046f65b12bafd813b68acbeb67fc5a |https://github.com/fayder/restcountries/commit/3382320ecfe0b4e5705eabfc3631b814468495bf |https://github.com/fayder/restcountries/compare/a3c566bde8046f65b12bafd813b68acbeb67fc5a..3382320ecfe0b4e5705eabfc3631b814468495bf |
|Bug21|4|12|https://github.com/ImmobilienScout24/deadcode4j/commit/5d32dbef57eb4c7534f45c2c3027d1c0a9a80ddd |https://github.com/ImmobilienScout24/deadcode4j/commit/cc3738ddb73424aef775cd9401714cb77b3bb957 |https://github.com/ImmobilienScout24/deadcode4j/compare/5d32dbef57eb4c7534f45c2c3027d1c0a9a80ddd..cc3738ddb73424aef775cd9401714cb77b3bb957 |
|Bug22|1|1|https://github.com/mybatis/mybatis-3/commit/5da14eb064a04cd54dbefe6e8f516a191111e87b |https://github.com/mybatis/mybatis-3/commit/34f7433dea4bb94a96db1246c30feac73ab4695f |https://github.com/mybatis/mybatis-3/compare/5da14eb064a04cd54dbefe6e8f516a191111e87b..34f7433dea4bb94a96db1246c30feac73ab4695f |
|Bug23|1|1|https://github.com/openpnp/openpnp/commit/0143f8ebe02d584081b720a2e65d38878ad54f2f |https://github.com/openpnp/openpnp/commit/28b80706342d7679fac29a3b9fe1f7847a72be0b |https://github.com/openpnp/openpnp/compare/0143f8ebe02d584081b720a2e65d38878ad54f2f..28b80706342d7679fac29a3b9fe1f7847a72be0b |
|Bug24|5|65|https://github.com/NitorCreations/nflow/commit/5fd873e39fa6e8a4820d1dcb904f765c5d496641 |https://github.com/NitorCreations/nflow/commit/f17768aa7f97b4fb71b95d6a6201491db3d04403 |https://github.com/NitorCreations/nflow/compare/5fd873e39fa6e8a4820d1dcb904f765c5d496641..f17768aa7f97b4fb71b95d6a6201491db3d04403 |
|Bug25|3|65|https://github.com/orbit/orbit/commit/bdafdffdcc7138b90fff09d97db0204e4488e506 |https://github.com/orbit/orbit/commit/272ff154b13c34a104050bb0cfdc9fba743f24b8 |https://github.com/orbit/orbit/compare/bdafdffdcc7138b90fff09d97db0204e4488e506..272ff154b13c34a104050bb0cfdc9fba743f24b8 |
|Bug26|4|16|https://github.com/owlcs/owlapi/commit/ae2e1e7125b264d6b710f366cd7dd02b1d9978e4 |https://github.com/owlcs/owlapi/commit/960ce941ef632c9a1239f35a565ae9b9b02a0956 |https://github.com/owlcs/owlapi/compare/ae2e1e7125b264d6b710f366cd7dd02b1d9978e4..960ce941ef632c9a1239f35a565ae9b9b02a0956 |
|Bug27|2|9|https://github.com/yamcs/yamcs/commit/c9c352c9da4e92d2a96ca757ed77647de809c82e |https://github.com/yamcs/yamcs/commit/a5504853f85492c7aa759df9b17ebc0a3f3b9f71 |https://github.com/yamcs/yamcs/compare/c9c352c9da4e92d2a96ca757ed77647de809c82e..a5504853f85492c7aa759df9b17ebc0a3f3b9f71 |
|Bug28|1|2|https://github.com/spring-projects/spring-data-jpa/commit/081d67aa2fb8402b54acb823876c40391b219c02 |https://github.com/spring-projects/spring-data-jpa/commit/36f04fadb77de097583a827abd68bfa95d7ef234 |https://github.com/spring-projects/spring-data-jpa/compare/081d67aa2fb8402b54acb823876c40391b219c02..36f04fadb77de097583a827abd68bfa95d7ef234 |
|Bug29|1|5|https://github.com/apache/struts/commit/1643568095edd8e0f9a3147c0edf396cd6906b44 |https://github.com/apache/struts/commit/0bd2e705897b365740e72229dbd9eb64c8c32229 |https://github.com/apache/struts/compare/1643568095edd8e0f9a3147c0edf396cd6906b44..0bd2e705897b365740e72229dbd9eb64c8c32229 |
|Bug30|1|2|https://github.com/orbit/orbit/commit/bc9f363f4cd6d926eea0e77a70a1dfad7acccfe4 |https://github.com/orbit/orbit/commit/d8261fd8cfb6bcd690d63fe86f4a0ddd44326fce |https://github.com/orbit/orbit/compare/bc9f363f4cd6d926eea0e77a70a1dfad7acccfe4..d8261fd8cfb6bcd690d63fe86f4a0ddd44326fce |
|Bug31|1|1|https://github.com/owlcs/owlapi/commit/691fc830c4610233826a8cba991904f3f58528ad |https://github.com/owlcs/owlapi/commit/99d5d04dd372d2a0eb4f207d9aea1cb0d92caa24 |https://github.com/owlcs/owlapi/compare/691fc830c4610233826a8cba991904f3f58528ad..99d5d04dd372d2a0eb4f207d9aea1cb0d92caa24 |
|Bug32|1|1|https://github.com/apache/commons-lang/commit/314b6b56bec4af56dba667d66a25c1613f4bc800 |https://github.com/apache/commons-lang/commit/8cafd87c83f4197f7e8d14de8cba453c844266c0 |https://github.com/apache/commons-lang/compare/314b6b56bec4af56dba667d66a25c1613f4bc800..8cafd87c83f4197f7e8d14de8cba453c844266c0 |
|Bug33|1|1|https://github.com/davidmoten/rxjava-jdbc/commit/244c6c062de6929d85347ef4b5a4e08bbd987c68 |https://github.com/davidmoten/rxjava-jdbc/commit/179b9626e3c0e2256b8c58d2fff6a211691909e7 |https://github.com/davidmoten/rxjava-jdbc/compare/244c6c062de6929d85347ef4b5a4e08bbd987c68..179b9626e3c0e2256b8c58d2fff6a211691909e7 |
|Bug34|2|2|https://github.com/FluentLenium/FluentLenium/commit/3a4ea068c977a9131cf7920520c915949ad54ef4 |https://github.com/FluentLenium/FluentLenium/commit/89a25e7535b1f51c88caaeddfd4db18d44dc7c77 |https://github.com/FluentLenium/FluentLenium/compare/3a4ea068c977a9131cf7920520c915949ad54ef4..89a25e7535b1f51c88caaeddfd4db18d44dc7c77 |
|Bug35|1|2|https://github.com/openmicroscopy/bioformats/commit/e01cdd9b036d74209de5f7a5149a41a941c79e25 |https://github.com/openmicroscopy/bioformats/commit/557e4d6e98988ac6066bf36f7f01d3f68c19f8e6 |https://github.com/openmicroscopy/bioformats/compare/e01cdd9b036d74209de5f7a5149a41a941c79e25..557e4d6e98988ac6066bf36f7f01d3f68c19f8e6 |
|Bug38|5|23|https://github.com/square/okhttp/commit/7bc25677c2b2a7f256d55c06aa990a08f74c3266 |https://github.com/square/okhttp/commit/92e64f0279f1ce10ddd280fe048a92f6a959203d |https://github.com/square/okhttp/compare/7bc25677c2b2a7f256d55c06aa990a08f74c3266..92e64f0279f1ce10ddd280fe048a92f6a959203d |
|Bug41|5|23|https://github.com/alibaba/fastjson/commit/ea8544e8807c |https://github.com/alibaba/fastjson/commit/dedabc63083f |https://github.com/alibaba/fastjson/compare/ea8544e8807c..dedabc63083f |
|Bug42|2|12|https://github.com/alibaba/fastjson/commit/6fafae2392d7 |https://github.com/alibaba/fastjson/commit/354d504928c8 |https://github.com/alibaba/fastjson/compare/6fafae2392d7..354d504928c8 |
|Bug43|1|3|https://github.com/alibaba/fastjson/commit/3552361e4afb |https://github.com/alibaba/fastjson/commit/a09dca3cca2d |https://github.com/alibaba/fastjson/compare/3552361e4afb..a09dca3cca2d |
|Bug44|7|43|https://github.com/alibaba/fastjson/commit/4792fb25cc78 |https://github.com/alibaba/fastjson/commit/4488fbb015fc |https://github.com/alibaba/fastjson/compare/4792fb25cc78..4488fbb015fc |
|Bug45|1|1|https://github.com/alibaba/fastjson/commit/b38baa27dd4d |https://github.com/alibaba/fastjson/commit/0ca37a7045d7 |https://github.com/alibaba/fastjson/compare/b38baa27dd4d..0ca37a7045d7 |
|Bug46|1|3|https://github.com/alibaba/fastjson/commit/f07a588bcfe7 |https://github.com/alibaba/fastjson/commit/23ffd479eeb6 |https://github.com/alibaba/fastjson/compare/f07a588bcfe7..23ffd479eeb6 |
|Bug47|1|1|https://github.com/alibaba/fastjson/commit/5108d325e5a9 |https://github.com/alibaba/fastjson/commit/7f5a70dc663e |https://github.com/alibaba/fastjson/compare/5108d325e5a9..7f5a70dc663e |
|Bug48|1|1|https://github.com/apache/pdfbox/commit/0c45b8bc5076 |https://github.com/apache/pdfbox/commit/84b999737f60 |https://github.com/apache/pdfbox/compare/0c45b8bc5076..84b999737f60 |
|Bug49|1|2|https://github.com/apache/pdfbox/commit/2f2514a72db1 |https://github.com/apache/pdfbox/commit/be521c95ec08 |https://github.com/apache/pdfbox/compare/2f2514a72db1..be521c95ec08 |
|Bug50|1|1|https://github.com/apache/commons-lang/commit/314b6b56bec4 |https://github.com/apache/commons-lang/commit/8cafd87c83f4 |https://github.com/apache/commons-lang/compare/314b6b56bec4..8cafd87c83f4 |
|Bug51|1|1|https://github.com/biojava/biojava/commit/a2f863298fa7 |https://github.com/biojava/biojava/commit/08af4178ccc8 |https://github.com/biojava/biojava/compare/a2f863298fa7..08af4178ccc8 |
|Bug52|1|1|https://github.com/brettwooldridge/HikariCP/commit/72c9e828d073 |https://github.com/brettwooldridge/HikariCP/commit/913efb763d32 |https://github.com/brettwooldridge/HikariCP/compare/72c9e828d073..913efb763d32 |
|Bug53|1|6|https://github.com/brettwooldridge/HikariCP/commit/779770c2c8a9 |https://github.com/brettwooldridge/HikariCP/commit/06996380b524 |https://github.com/brettwooldridge/HikariCP/compare/779770c2c8a9..06996380b524 |
|Bug54|1|1|https://github.com/brettwooldridge/HikariCP/commit/fcd99ad97c74 |https://github.com/brettwooldridge/HikariCP/commit/e156d7169383 |https://github.com/brettwooldridge/HikariCP/compare/fcd99ad97c74..e156d7169383 |
|Bug55|1|1|https://github.com/brettwooldridge/HikariCP/commit/c46d0e4fbf78 |https://github.com/brettwooldridge/HikariCP/commit/dd095f61f2e8 |https://github.com/brettwooldridge/HikariCP/compare/c46d0e4fbf78..dd095f61f2e8 |
|Bug56|1|2|https://github.com/brettwooldridge/HikariCP/commit/616a832 |https://github.com/brettwooldridge/HikariCP/commit/cefc2af |https://github.com/brettwooldridge/HikariCP/compare/616a832..cefc2af |
|Bug57|1|1|https://github.com/brettwooldridge/HikariCP/commit/4fbc2aa94b03 |https://github.com/brettwooldridge/HikariCP/commit/182c8c58ab98 |https://github.com/brettwooldridge/HikariCP/compare/4fbc2aa94b03..182c8c58ab98 |
|Bug58|1|4|https://github.com/brettwooldridge/HikariCP/commit/e451097 |https://github.com/brettwooldridge/HikariCP/commit/01d30f3 |https://github.com/brettwooldridge/HikariCP/compare/e451097..01d30f3 |
|Bug59|1|2|https://github.com/brettwooldridge/HikariCP/commit/3d2a082 |https://github.com/brettwooldridge/HikariCP/commit/ce4ff92 |https://github.com/brettwooldridge/HikariCP/compare/3d2a082..ce4ff92 |
|Bug60|1|3|https://github.com/brettwooldridge/HikariCP/commit/657de54b482d |https://github.com/brettwooldridge/HikariCP/commit/8f84e1fb125f |https://github.com/brettwooldridge/HikariCP/compare/657de54b482d..8f84e1fb125f |
|Bug61|1|1|https://github.com/caelum/vraptor4/commit/1f2c2c712a15 |https://github.com/caelum/vraptor4/commit/cf46c58546c7 |https://github.com/caelum/vraptor4/compare/1f2c2c712a15..cf46c58546c7 |
|Bug62|1|2|https://github.com/caelum/vraptor4/commit/6b2dd9d |https://github.com/caelum/vraptor4/commit/50177d3 |https://github.com/caelum/vraptor4/compare/6b2dd9d..50177d3 |
|Bug63|1|1|https://github.com/caelum/vraptor4/commit/ac5bb38 |https://github.com/caelum/vraptor4/commit/1735489 |https://github.com/caelum/vraptor4/compare/ac5bb38..1735489|
|Bug64|1|1|https://github.com/datacleaner/DataCleaner/commit/a691bcc |https://github.com/datacleaner/DataCleaner/commit/7130e5a |https://github.com/datacleaner/DataCleaner/compare/a691bcc..7130e5a |
|Bug65|2|5|https://github.com/datacleaner/DataCleaner/commit/6fc746a |https://github.com/datacleaner/DataCleaner/commit/140784b |https://github.com/datacleaner/DataCleaner/compare/6fc746a..140784b |
|Bug66|1|6|https://github.com/datacleaner/DataCleaner/commit/50ac287 |https://github.com/datacleaner/DataCleaner/commit/bbb115a |https://github.com/datacleaner/DataCleaner/compare/50ac287..bbb115a |
|Bug67|1|5|https://github.com/datacleaner/DataCleaner/commit/d4732abd803f |https://github.com/datacleaner/DataCleaner/commit/382281f11ce6 |https://github.com/datacleaner/DataCleaner/compare/d4732abd803f..382281f11ce6 |
|Bug68|1|3|https://github.com/datacleaner/DataCleaner/commit/997e4ad6c65b |https://github.com/datacleaner/DataCleaner/commit/8fe718e98689 |https://github.com/datacleaner/DataCleaner/compare/997e4ad6c65b..8fe718e98689 |
|Bug69|2|5|https://github.com/datacleaner/DataCleaner/commit/e2f9fd51b0fb |https://github.com/datacleaner/DataCleaner/commit/2d03e1bb5e4c |https://github.com/datacleaner/DataCleaner/compare/e2f9fd51b0fb..2d03e1bb5e4c |
|Bug70|1|1|https://github.com/datacleaner/DataCleaner/commit/c58913f00197 |https://github.com/datacleaner/DataCleaner/commit/6a14d18a4e9e |https://github.com/datacleaner/DataCleaner/compare/c58913f00197..6a14d18a4e9e |
|Bug71|1|3|https://github.com/datacleaner/DataCleaner/commit/b6824cbdd9b1 |https://github.com/datacleaner/DataCleaner/commit/c9ffd4b9ba4d |https://github.com/datacleaner/DataCleaner/compare/b6824cbdd9b1..c9ffd4b9ba4d |
|Bug72|1|2|https://github.com/google/error-prone/commit/17f75c5 |https://github.com/google/error-prone/commit/153fd2d |https://github.com/google/error-prone/compare/17f75c5..153fd2d |
|Bug73|1|5|https://github.com/jamesagnew/hapi-fhir/commit/11c5ab78929e |https://github.com/jamesagnew/hapi-fhir/commit/1577859340a1 |https://github.com/jamesagnew/hapi-fhir/compare/11c5ab78929e..1577859340a1 |
|Bug74|1|4|https://github.com/jamesagnew/hapi-fhir/commit/2733812535cb |https://github.com/jamesagnew/hapi-fhir/commit/1577859340a1 |https://github.com/jamesagnew/hapi-fhir/compare/2733812535cb..1577859340a1 |
|Bug75|1|1|https://github.com/jamesagnew/hapi-fhir/commit/a0260b9ea979 |https://github.com/jamesagnew/hapi-fhir/commit/66ec863bdedb |https://github.com/jamesagnew/hapi-fhir/compare/a0260b9ea979..66ec863bdedb |
|Bug76|1|1|https://github.com/jamesagnew/hapi-fhir/commit/b96932a5c531 |https://github.com/jamesagnew/hapi-fhir/commit/6cf3d865f0f4 |https://github.com/jamesagnew/hapi-fhir/compare/b96932a5c531..6cf3d865f0f4 |
|Bug77|1|1|https://github.com/keycloak/keycloak/commit/09090ce |https://github.com/keycloak/keycloak/commit/3451639 |https://github.com/keycloak/keycloak/compare/09090ce..3451639|
|Bug78|1|1|https://github.com/mikera/vectorz/commit/1cf486045691 |https://github.com/mikera/vectorz/commit/c008bfa1607b |https://github.com/mikera/vectorz/compare/1cf486045691..c008bfa1607b |
|Bug79|1|3|https://github.com/mikera/vectorz/commit/3eee45ec7a3e |https://github.com/mikera/vectorz/commit/cc07d6f6cc75 |https://github.com/mikera/vectorz/compare/3eee45ec7a3e..cc07d6f6cc75 |
|Bug80|1|1|https://github.com/mybatis/mybatis-3/commit/5da14eb064a0 |https://github.com/mybatis/mybatis-3/commit/34f7433dea4b |https://github.com/mybatis/mybatis-3/compare/5da14eb064a0..34f7433dea4b |
|Bug81|1|1|https://github.com/mybatis/mybatis-3/commit/43500e9fb522 |https://github.com/mybatis/mybatis-3/commit/80a0cd014b13 |https://github.com/mybatis/mybatis-3/compare/43500e9fb522..80a0cd014b13 |
|Bug82|1|2|https://github.com/nutzam/nutz/commit/d8c20cde3515 |https://github.com/nutzam/nutz/commit/1e1df6b3c36e |https://github.com/nutzam/nutz/compare/d8c20cde3515..1e1df6b3c36e |
|Bug83|1|1|https://github.com/nutzam/nutz/commit/1b757e31ea90 |https://github.com/nutzam/nutz/commit/0add00d450e2 |https://github.com/nutzam/nutz/compare/1b757e31ea90..0add00d450e2 |
|Bug84|1|1|https://github.com/nutzam/nutz/commit/a6fe8cd2d599 |https://github.com/nutzam/nutz/commit/e06580a6dcfb |https://github.com/nutzam/nutz/compare/a6fe8cd2d599..e06580a6dcfb |
|Bug85|1|2|https://github.com/openpnp/openpnp/commit/0143f8ebe02d |https://github.com/openpnp/openpnp/commit/28b80706342d |https://github.com/openpnp/openpnp/compare/0143f8ebe02d..28b80706342d |
|Bug87|1|1|https://github.com/owlcs/owlapi/commit/b3e2e8fbf9d3 |https://github.com/owlcs/owlapi/commit/4a4680d49023 |https://github.com/owlcs/owlapi/compare/b3e2e8fbf9d3..4a4680d49023 |
|Bug88|1|1|https://github.com/owlcs/owlapi/commit/fdd5f4269864 |https://github.com/owlcs/owlapi/commit/5dc890c9eab6 |https://github.com/owlcs/owlapi/compare/fdd5f4269864..5dc890c9eab6 |
|Bug89|1|3|https://github.com/owlcs/owlapi/commit/44b9a02fd653 |https://github.com/owlcs/owlapi/commit/a77ee9c4fded |https://github.com/owlcs/owlapi/compare/44b9a02fd653..a77ee9c4fded |
|Bug90|1|1|https://github.com/owlcs/owlapi/commit/691fc830c461 |https://github.com/owlcs/owlapi/commit/99d5d04dd372 |https://github.com/owlcs/owlapi/compare/691fc830c461..99d5d04dd372 |
|Bug91|1|5|https://github.com/rackerlabs/blueflood/commit/e986a13 |https://github.com/rackerlabs/blueflood/commit/64f7816 |https://github.com/rackerlabs/blueflood/compare/e986a13..64f7816 |
|Bug92|1|2|https://github.com/redpen-cc/redpen/commit/13fe0f2 |https://github.com/redpen-cc/redpen/commit/43a8a8f |https://github.com/redpen-cc/redpen/compare/13fe0f2..43a8a8f |
|Bug93|1|2|https://github.com/redpen-cc/redpen/commit/12dd7c558c3c |https://github.com/redpen-cc/redpen/commit/6ca46a844205 |https://github.com/redpen-cc/redpen/compare/12dd7c558c3c..6ca46a844205 |
|Bug94|1|1|https://github.com/redpen-cc/redpen/commit/e6f195a |https://github.com/redpen-cc/redpen/commit/ae5ab1b |https://github.com/redpen-cc/redpen/compare/e6f195a..ae5ab1b |
|Bug95|1|1|https://github.com/swagger-api/swagger-core/commit/22df2f4 |https://github.com/swagger-api/swagger-core/commit/edeca22 |https://github.com/swagger-api/swagger-core/compare/22df2f4..edeca22 |
|Bug96|1|2|https://github.com/tananaev/traccar/commit/6883ecf8462e |https://github.com/tananaev/traccar/commit/670acf03fb75 |https://github.com/tananaev/traccar/compare/6883ecf8462e..670acf03fb75 |
|Bug97|1|3|https://github.com/tananaev/traccar/commit/727e7bfad908 |https://github.com/tananaev/traccar/commit/8aa3c641b0ee |https://github.com/tananaev/traccar/compare/727e7bfad908..8aa3c641b0ee |
|Bug98|2|3|https://github.com/tananaev/traccar/commit/a6b8f7f7ef0f |https://github.com/tananaev/traccar/commit/30d5a99aab58 |https://github.com/tananaev/traccar/compare/a6b8f7f7ef0f..30d5a99aab58 |
|Bug99|1|4|https://github.com/tananaev/traccar/commit/e512848dc071 |https://github.com/tananaev/traccar/commit/7bd6551a2f57 |https://github.com/tananaev/traccar/compare/e512848dc071..7bd6551a2f57 |
|Bug100|1|1|https://github.com/timmolter/XChange/commit/4e2a12b |https://github.com/timmolter/XChange/commit/8ed7c2d |https://github.com/timmolter/XChange/compare/4e2a12b..8ed7c2d |
|Bug101|1|1|https://github.com/timmolter/XChange/commit/367cf6d |https://github.com/timmolter/XChange/commit/b7a96f6 |https://github.com/timmolter/XChange/compare/367cf6d..b7a96f6 |
|Bug102|1|1|https://github.com/vavr-io/vavr/commit/26f895a66585 |https://github.com/vavr-io/vavr/commit/e4d5d44eac50 |https://github.com/vavr-io/vavr/compare/26f895a66585..e4d5d44eac50 |
|Bug103|1|1|https://github.com/vavr-io/vavr/commit/d68f0cc41f99 |https://github.com/vavr-io/vavr/commit/d51c4b018d3a |https://github.com/vavr-io/vavr/compare/d68f0cc41f99..d51c4b018d3a |
|Bug104|1|1|https://github.com/vavr-io/vavr/commit/0dab3ed3e076 |https://github.com/vavr-io/vavr/commit/faf9ac29da13 |https://github.com/vavr-io/vavr/compare/0dab3ed3e076..faf9ac29da13 |
|Bug105|1|1|https://github.com/xetorthio/jedis/commit/8af9fe1 |https://github.com/xetorthio/jedis/commit/8c1bf69 |https://github.com/xetorthio/jedis/compare/8af9fe1..8c1bf69 |
|Bug106|1|3|https://github.com/yegor256/takes/commit/5388dd0 |https://github.com/yegor256/takes/commit/bad5f15 |https://github.com/yegor256/takes/compare/5388dd0..bad5f15 |
|Bug107|1|1|https://github.com/chewiebug/GCViewer/commit/cbe1f1d68b53 |https://github.com/chewiebug/GCViewer/commit/f395e2f8bd6dac |https://github.com/chewiebug/GCViewer/compare/cbe1f1d68b53..f395e2f8bd6dac |
-->
|BugId|Filesmodified|Linesmodified|BuggyCommit|FixedCommit|
|-------------|-------------|-------------|-------------|-------------|
|Bug1|1|1|https://github.com/petergeneric/stdlib/commit/b63a6a839e276ac66a45b4e114894fb20cd7fa00|https://github.com/petergeneric/stdlib/commit/e423651b7c715465271a4da4482d2cf2a9b3c955|
|Bug2|1|2|https://github.com/petergeneric/stdlib/commit/babdc2ac4bc058b470b1995e3965de8d44e9959d|https://github.com/petergeneric/stdlib/commit/4c51a3b3fcb881ab4177655389beac1796aec844|
|Bug3|1|1|https://github.com/davidmoten/rxjava-jdbc/commit/a32e185515b382657025cab5a099419a0cb53ce0|https://github.com/davidmoten/rxjava-jdbc/commit/f1c233ea90a8eda2f1a40fefb6914a1bc43fd386|
|Bug4|5|9|https://github.com/raphw/byte-buddy/commit/e1e2448fdf8b852f93399d075c39fda580e2ecc8|https://github.com/raphw/byte-buddy/commit/8d601b3d69e598e0a67c964d2863ad7fcacd7e2b|
|Bug5|2|3|https://github.com/raphw/byte-buddy/commit/6c0f13fca731b3dc2b7346843e82bde8f2dc7907|https://github.com/raphw/byte-buddy/commit/82c18a6fb4d38bb259a6da50e8b21bb919a48445|
|Bug6|2|2|https://github.com/raphw/byte-buddy/commit/fbe90792a756f2d8ab93c644e9660d8e9a68bfe3|https://github.com/raphw/byte-buddy/commit/0082105d9167c1247a2b7e623af05cd8b347f383|
|Bug7|1|2|https://github.com/raphw/byte-buddy/commit/6dc2e39a295c0a401572db07a06980d8ada3d756|https://github.com/raphw/byte-buddy/commit/7af7682f3ec0b25637f7462d3cd78e14262b628a|
|Bug8|2|2|https://github.com/raphw/byte-buddy/commit/2a86dee218e5a3541ce72e0b126b5b742641f677|https://github.com/raphw/byte-buddy/commit/f259f30b877e9c8eb952b853f2bb829d4a169b14|
|Bug9|2|33|https://github.com/raphw/byte-buddy/commit/95aa155a555326e6a93d12bd9fa0bc41cbe5ece4|https://github.com/raphw/byte-buddy/commit/0429d543594d94beef328b59b3facffa0b2864f1|
|Bug10|7|44|https://github.com/raphw/byte-buddy/commit/5ae39ba44121adfcb0ec201cdfa5148f2836355d|https://github.com/raphw/byte-buddy/commit/b1a06db21dcabdad76b5bd47121546ea96aef2e6|
|Bug11|1|5|https://github.com/chewiebug/GCViewer/commit/cbe1f1d68b53b95034b38bfc884855639d499e09|https://github.com/chewiebug/GCViewer/commit/f395e2f8bd6dac839b4f9b38fe6278ca5623aa1f|
|Bug12|1|1|https://github.com/ontop/ontop/commit/87ed6c57918e3978f3825388b82bae15bbb5250b|https://github.com/ontop/ontop/commit/b1f2de252c2d547e3f851f9395ed94b975d40475|
|Bug13|1|1|https://github.com/SpigotMC/BungeeCord/commit/d9a8311b8e40a0d390a993e409933f8ee737c12e|https://github.com/SpigotMC/BungeeCord/commit/2df29701edc984c97c6e860aa0ad8e47654fd6d4|
|Bug14|2|6|https://github.com/square/retrofit/commit/1411059b62c1abfe51b1b10d63ae8c254c0786a7|https://github.com/square/retrofit/commit/fe1d01684c96d55224c67e67c31c3fd8faa05c24|
|Bug15|1|1|https://github.com/nutzam/nutz/commit/a1935ccca641f32cc5267265b416a0fe6c383e06|https://github.com/nutzam/nutz/commit/f17f65cdc3d3c79e0f8cd41fe1b6e74ac798ad2d|
|Bug16|1|1|https://github.com/tananaev/traccar/commit/e512848dc07145664f3c5d0adff7a9f88b2f17b6|https://github.com/tananaev/traccar/commit/7bd6551a2f5712d63bea7e8711944fbeb78323c8|
|Bug17|1|1|https://github.com/tananaev/traccar/commit/6883ecf8462e26f63d2709426c2cacf5dd318c49|https://github.com/tananaev/traccar/commit/670acf03fb75e56fc0efc0c1fcfac04060bfb985|
|Bug18|1|1|https://github.com/tananaev/traccar/commit/a6b8f7f7ef0fa3b58dcdfee38b18e61bd7ce18b4|https://github.com/tananaev/traccar/commit/30d5a99aab58f8db6f3096d073db9b68c4b93c9d|
|Bug19|1|11|https://github.com/tananaev/traccar/commit/173d054219f1e37e7089c23cac0f530915834ee4|https://github.com/tananaev/traccar/commit/766064092ca4f85eacfa741e1ff772ea5b981d1a|
|Bug20|1|1|https://github.com/fayder/restcountries/commit/a3c566bde8046f65b12bafd813b68acbeb67fc5a|https://github.com/fayder/restcountries/commit/3382320ecfe0b4e5705eabfc3631b814468495bf|
|Bug21|4|12|https://github.com/ImmobilienScout24/deadcode4j/commit/5d32dbef57eb4c7534f45c2c3027d1c0a9a80ddd|https://github.com/ImmobilienScout24/deadcode4j/commit/cc3738ddb73424aef775cd9401714cb77b3bb957|
|Bug22|1|1|https://github.com/mybatis/mybatis-3/commit/5da14eb064a04cd54dbefe6e8f516a191111e87b|https://github.com/mybatis/mybatis-3/commit/34f7433dea4bb94a96db1246c30feac73ab4695f|
|Bug23|1|1|https://github.com/openpnp/openpnp/commit/0143f8ebe02d584081b720a2e65d38878ad54f2f|https://github.com/openpnp/openpnp/commit/28b80706342d7679fac29a3b9fe1f7847a72be0b|
|Bug24|5|65|https://github.com/NitorCreations/nflow/commit/5fd873e39fa6e8a4820d1dcb904f765c5d496641|https://github.com/NitorCreations/nflow/commit/f17768aa7f97b4fb71b95d6a6201491db3d04403|
|Bug25|3|65|https://github.com/orbit/orbit/commit/bdafdffdcc7138b90fff09d97db0204e4488e506|https://github.com/orbit/orbit/commit/272ff154b13c34a104050bb0cfdc9fba743f24b8|
|Bug26|4|16|https://github.com/owlcs/owlapi/commit/ae2e1e7125b264d6b710f366cd7dd02b1d9978e4|https://github.com/owlcs/owlapi/commit/960ce941ef632c9a1239f35a565ae9b9b02a0956|
|Bug27|2|9|https://github.com/yamcs/yamcs/commit/c9c352c9da4e92d2a96ca757ed77647de809c82e|https://github.com/yamcs/yamcs/commit/a5504853f85492c7aa759df9b17ebc0a3f3b9f71|
|Bug28|1|2|https://github.com/spring-projects/spring-data-jpa/commit/081d67aa2fb8402b54acb823876c40391b219c02|https://github.com/spring-projects/spring-data-jpa/commit/36f04fadb77de097583a827abd68bfa95d7ef234|
|Bug29|1|5|https://github.com/apache/struts/commit/1643568095edd8e0f9a3147c0edf396cd6906b44|https://github.com/apache/struts/commit/0bd2e705897b365740e72229dbd9eb64c8c32229|
|Bug30|1|2|https://github.com/orbit/orbit/commit/bc9f363f4cd6d926eea0e77a70a1dfad7acccfe4|https://github.com/orbit/orbit/commit/d8261fd8cfb6bcd690d63fe86f4a0ddd44326fce|
|Bug31|1|1|https://github.com/owlcs/owlapi/commit/691fc830c4610233826a8cba991904f3f58528ad|https://github.com/owlcs/owlapi/commit/99d5d04dd372d2a0eb4f207d9aea1cb0d92caa24|
|Bug32|1|1|https://github.com/apache/commons-lang/commit/314b6b56bec4af56dba667d66a25c1613f4bc800|https://github.com/apache/commons-lang/commit/8cafd87c83f4197f7e8d14de8cba453c844266c0|
|Bug33|1|1|https://github.com/davidmoten/rxjava-jdbc/commit/244c6c062de6929d85347ef4b5a4e08bbd987c68|https://github.com/davidmoten/rxjava-jdbc/commit/179b9626e3c0e2256b8c58d2fff6a211691909e7|
|Bug34|2|2|https://github.com/FluentLenium/FluentLenium/commit/3a4ea068c977a9131cf7920520c915949ad54ef4|https://github.com/FluentLenium/FluentLenium/commit/89a25e7535b1f51c88caaeddfd4db18d44dc7c77|
|Bug35|1|2|https://github.com/openmicroscopy/bioformats/commit/e01cdd9b036d74209de5f7a5149a41a941c79e25|https://github.com/openmicroscopy/bioformats/commit/557e4d6e98988ac6066bf36f7f01d3f68c19f8e6|
|Bug38|5|23|https://github.com/square/okhttp/commit/7bc25677c2b2a7f256d55c06aa990a08f74c3266|https://github.com/square/okhttp/commit/92e64f0279f1ce10ddd280fe048a92f6a959203d|
|Bug41|5|23|https://github.com/alibaba/fastjson/commit/ea8544e8807c|https://github.com/alibaba/fastjson/commit/dedabc63083f|
|Bug42|2|12|https://github.com/alibaba/fastjson/commit/6fafae2392d7|https://github.com/alibaba/fastjson/commit/354d504928c8|
|Bug43|1|3|https://github.com/alibaba/fastjson/commit/3552361e4afb|https://github.com/alibaba/fastjson/commit/a09dca3cca2d|
|Bug44|7|43|https://github.com/alibaba/fastjson/commit/4792fb25cc78|https://github.com/alibaba/fastjson/commit/4488fbb015fc|
|Bug45|1|1|https://github.com/alibaba/fastjson/commit/b38baa27dd4d|https://github.com/alibaba/fastjson/commit/0ca37a7045d7|
|Bug46|1|3|https://github.com/alibaba/fastjson/commit/f07a588bcfe7|https://github.com/alibaba/fastjson/commit/23ffd479eeb6|
|Bug47|1|1|https://github.com/alibaba/fastjson/commit/5108d325e5a9|https://github.com/alibaba/fastjson/commit/7f5a70dc663e|
|Bug48|1|1|https://github.com/apache/pdfbox/commit/0c45b8bc5076|https://github.com/apache/pdfbox/commit/84b999737f60|
|Bug49|1|2|https://github.com/apache/pdfbox/commit/2f2514a72db1|https://github.com/apache/pdfbox/commit/be521c95ec08|
|Bug50|1|1|https://github.com/apache/commons-lang/commit/314b6b56bec4|https://github.com/apache/commons-lang/commit/8cafd87c83f4|
|Bug51|1|1|https://github.com/biojava/biojava/commit/a2f863298fa7|https://github.com/biojava/biojava/commit/08af4178ccc8|
|Bug52|1|1|https://github.com/brettwooldridge/HikariCP/commit/72c9e828d073|https://github.com/brettwooldridge/HikariCP/commit/913efb763d32|
|Bug53|1|6|https://github.com/brettwooldridge/HikariCP/commit/779770c2c8a9|https://github.com/brettwooldridge/HikariCP/commit/06996380b524|
|Bug54|1|1|https://github.com/brettwooldridge/HikariCP/commit/fcd99ad97c74|https://github.com/brettwooldridge/HikariCP/commit/e156d7169383|
|Bug55|1|1|https://github.com/brettwooldridge/HikariCP/commit/c46d0e4fbf78|https://github.com/brettwooldridge/HikariCP/commit/dd095f61f2e8|
|Bug56|1|2|https://github.com/brettwooldridge/HikariCP/commit/616a832|https://github.com/brettwooldridge/HikariCP/commit/cefc2af|
|Bug57|1|1|https://github.com/brettwooldridge/HikariCP/commit/4fbc2aa94b03|https://github.com/brettwooldridge/HikariCP/commit/182c8c58ab98|
|Bug58|1|4|https://github.com/brettwooldridge/HikariCP/commit/e451097|https://github.com/brettwooldridge/HikariCP/commit/01d30f3|
|Bug59|1|2|https://github.com/brettwooldridge/HikariCP/commit/3d2a082|https://github.com/brettwooldridge/HikariCP/commit/ce4ff92|
|Bug60|1|3|https://github.com/brettwooldridge/HikariCP/commit/657de54b482d|https://github.com/brettwooldridge/HikariCP/commit/8f84e1fb125f|
|Bug61|1|1|https://github.com/caelum/vraptor4/commit/1f2c2c712a15|https://github.com/caelum/vraptor4/commit/cf46c58546c7|
|Bug62|1|2|https://github.com/caelum/vraptor4/commit/6b2dd9d|https://github.com/caelum/vraptor4/commit/50177d3|
|Bug63|1|1|https://github.com/caelum/vraptor4/commit/ac5bb38|https://github.com/caelum/vraptor4/commit/1735489|
|Bug64|1|1|https://github.com/datacleaner/DataCleaner/commit/a691bcc|https://github.com/datacleaner/DataCleaner/commit/7130e5a|
|Bug65|2|5|https://github.com/datacleaner/DataCleaner/commit/6fc746a|https://github.com/datacleaner/DataCleaner/commit/140784b|
|Bug66|1|6|https://github.com/datacleaner/DataCleaner/commit/50ac287|https://github.com/datacleaner/DataCleaner/commit/bbb115a|
|Bug67|1|5|https://github.com/datacleaner/DataCleaner/commit/d4732abd803f|https://github.com/datacleaner/DataCleaner/commit/382281f11ce6|
|Bug68|1|3|https://github.com/datacleaner/DataCleaner/commit/997e4ad6c65b|https://github.com/datacleaner/DataCleaner/commit/8fe718e98689|
|Bug69|2|5|https://github.com/datacleaner/DataCleaner/commit/e2f9fd51b0fb|https://github.com/datacleaner/DataCleaner/commit/2d03e1bb5e4c|
|Bug70|1|1|https://github.com/datacleaner/DataCleaner/commit/c58913f00197|https://github.com/datacleaner/DataCleaner/commit/6a14d18a4e9e|
|Bug71|1|3|https://github.com/datacleaner/DataCleaner/commit/b6824cbdd9b1|https://github.com/datacleaner/DataCleaner/commit/c9ffd4b9ba4d|
|Bug72|1|2|https://github.com/google/error-prone/commit/17f75c5|https://github.com/google/error-prone/commit/153fd2d|
|Bug73|1|5|https://github.com/jamesagnew/hapi-fhir/commit/11c5ab78929e|https://github.com/jamesagnew/hapi-fhir/commit/1577859340a1|
|Bug74|1|4|https://github.com/jamesagnew/hapi-fhir/commit/2733812535cb|https://github.com/jamesagnew/hapi-fhir/commit/1577859340a1|
|Bug75|1|1|https://github.com/jamesagnew/hapi-fhir/commit/a0260b9ea979|https://github.com/jamesagnew/hapi-fhir/commit/66ec863bdedb|
|Bug76|1|1|https://github.com/jamesagnew/hapi-fhir/commit/b96932a5c531|https://github.com/jamesagnew/hapi-fhir/commit/6cf3d865f0f4|
|Bug77|1|1|https://github.com/keycloak/keycloak/commit/09090ce|https://github.com/keycloak/keycloak/commit/3451639|
|Bug78|1|1|https://github.com/mikera/vectorz/commit/1cf486045691|https://github.com/mikera/vectorz/commit/c008bfa1607b|
|Bug79|1|3|https://github.com/mikera/vectorz/commit/3eee45ec7a3e|https://github.com/mikera/vectorz/commit/cc07d6f6cc75|
|Bug80|1|1|https://github.com/mybatis/mybatis-3/commit/5da14eb064a0|https://github.com/mybatis/mybatis-3/commit/34f7433dea4b|
|Bug81|1|1|https://github.com/mybatis/mybatis-3/commit/43500e9fb522|https://github.com/mybatis/mybatis-3/commit/80a0cd014b13|
|Bug82|1|2|https://github.com/nutzam/nutz/commit/d8c20cde3515|https://github.com/nutzam/nutz/commit/1e1df6b3c36e|
|Bug83|1|1|https://github.com/nutzam/nutz/commit/1b757e31ea90|https://github.com/nutzam/nutz/commit/0add00d450e2|
|Bug84|1|1|https://github.com/nutzam/nutz/commit/a6fe8cd2d599|https://github.com/nutzam/nutz/commit/e06580a6dcfb|
|Bug85|1|2|https://github.com/openpnp/openpnp/commit/0143f8ebe02d|https://github.com/openpnp/openpnp/commit/28b80706342d|
|Bug87|1|1|https://github.com/owlcs/owlapi/commit/b3e2e8fbf9d3|https://github.com/owlcs/owlapi/commit/4a4680d49023|
|Bug88|1|1|https://github.com/owlcs/owlapi/commit/fdd5f4269864|https://github.com/owlcs/owlapi/commit/5dc890c9eab6|
|Bug89|1|3|https://github.com/owlcs/owlapi/commit/44b9a02fd653|https://github.com/owlcs/owlapi/commit/a77ee9c4fded|
|Bug90|1|1|https://github.com/owlcs/owlapi/commit/691fc830c461|https://github.com/owlcs/owlapi/commit/99d5d04dd372|
|Bug91|1|5|https://github.com/rackerlabs/blueflood/commit/e986a13|https://github.com/rackerlabs/blueflood/commit/64f7816|
|Bug92|1|2|https://github.com/redpen-cc/redpen/commit/13fe0f2|https://github.com/redpen-cc/redpen/commit/43a8a8f|
|Bug93|1|2|https://github.com/redpen-cc/redpen/commit/12dd7c558c3c|https://github.com/redpen-cc/redpen/commit/6ca46a844205|
|Bug94|1|1|https://github.com/redpen-cc/redpen/commit/e6f195a|https://github.com/redpen-cc/redpen/commit/ae5ab1b|
|Bug95|1|1|https://github.com/swagger-api/swagger-core/commit/22df2f4|https://github.com/swagger-api/swagger-core/commit/edeca22|
|Bug96|1|2|https://github.com/tananaev/traccar/commit/6883ecf8462e|https://github.com/tananaev/traccar/commit/670acf03fb75|
|Bug97|1|3|https://github.com/tananaev/traccar/commit/727e7bfad908|https://github.com/tananaev/traccar/commit/8aa3c641b0ee|
|Bug98|2|3|https://github.com/tananaev/traccar/commit/a6b8f7f7ef0f|https://github.com/tananaev/traccar/commit/30d5a99aab58|
|Bug99|1|4|https://github.com/tananaev/traccar/commit/e512848dc071|https://github.com/tananaev/traccar/commit/7bd6551a2f57|
|Bug100|1|1|https://github.com/timmolter/XChange/commit/4e2a12b|https://github.com/timmolter/XChange/commit/8ed7c2d|
|Bug101|1|1|https://github.com/timmolter/XChange/commit/367cf6d|https://github.com/timmolter/XChange/commit/b7a96f6|
|Bug102|1|1|https://github.com/vavr-io/vavr/commit/26f895a66585|https://github.com/vavr-io/vavr/commit/e4d5d44eac50|
|Bug103|1|1|https://github.com/vavr-io/vavr/commit/d68f0cc41f99|https://github.com/vavr-io/vavr/commit/d51c4b018d3a|
|Bug104|1|1|https://github.com/vavr-io/vavr/commit/0dab3ed3e076|https://github.com/vavr-io/vavr/commit/faf9ac29da13|
|Bug105|1|1|https://github.com/xetorthio/jedis/commit/8af9fe1|https://github.com/xetorthio/jedis/commit/8c1bf69|
|Bug106|1|3|https://github.com/yegor256/takes/commit/5388dd0|https://github.com/yegor256/takes/commit/bad5f15|
|Bug107|1|1|https://github.com/chewiebug/GCViewer/commit/cbe1f1d68b53|https://github.com/chewiebug/GCViewer/commit/f395e2f8bd6dac|


### Method 2
The bugs are setup in the branches of this repo. Each bug is setup in a seperate branch.

Each branch as 3 commits.
- Initial commit (ignore this commit)
- Buggy commit 
- Fixed commit

To setup a bug, below are the steps
- Clone the repo 
- Chckout the required buggy branch 
- Take the last 2 commits (Buggy and Fixed Commit)
  - *Every commit has link to the original github in comments for reference. 

#### Example to setup a bug

#### 1. Clone the Repo
- git clone https://github.com/CIBugs/Repo1.git

#### 2. Checkout a specific Bug
- git checkout <'bug id'>
  - e.g. : git checkout Bug1
- cd Repo1
  
#### 3. Get all commits for the bug and pick 2 commits (Fixed and Buggy)
- git log --pretty=format:"%h - %s"
  - 804fcb6a3 - Fixed from https://github.com/petergeneric/stdlib/commit/e423651b7c715465271a4da4482d2cf2a9b3c955
  - 4e628d461 - Buggy from https://github.com/petergeneric/stdlib/commit/b63a6a839e276ac66a45b4e114894fb20cd7fa00
  - 4daa8d962 - Initial commit

#### 4. Point to Fixed Commit
- git reset --hard <'commit id'>
  - e.g. : git reset --hard 804fcb6a3
  
#### 5. Point to Buggy Commit
- git reset --hard <'commit id'>  
  - e.g. : git reset --hard 4e628d461

## Bugs and Project Details
| Organization  | Project | Bugs |
| ------------- | ------------- |-------------  |
|alibaba|fastjson|7|
|apache|commons-lang|2|
|apache|pdfbox|2|
|apache|struts|1
|biojava|biojava|1|
|brettwooldridge|HikariCP|9|
|caelum|vraptor4|3|
|chewiebug|GCViewer|2|
|datacleaner|DataCleaner|8|
|davidmoten|rxjava-jdbc|2|
|fayder|restcountries|1|
|FluentLenium|FluentLenium|1|
|google|error-prone|1|
|ImmobilienScout24|deadcode4j|1|
|jamesagnew|hapi-fhir|4|
|keycloak|keycloak|1|
|mikera|vectorz|2|
|mybatis|mybatis-3|3|
|NitorCreations|nflow|2|
|nutzam|nutz|2|
|ontop|ontop|1|
|openmicroscopy|bioformats|1|
|openpnp|openpnp|2|
|orbit|orbit|2|
|owlcs|owlapi|7|
|petergeneric|stdlib|2|
|rackerlabs|blueflood|1|
|raphw|byte-buddy|7|
|redpen-cc|redpen|3|
|SpigotMC|BungeeCord|1|
|spring-projects|spring-data-jpa|1|
|square|okhttp|1|
|square|retrofit|1|
|swagger-api|swagger-core|1|
|tananaev|traccar|9|
|timmolter|XChange|2|
|vavr-io|vavr|3|
|xetorthio|jedis|1|
|yamcs|yamcs|1|
