import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        org.elasticsearch.common.ParseField parseField0 = org.elasticsearch.script.ScriptService.VALUE_SCRIPT_ID;
        org.junit.Assert.assertNotNull(parseField0);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.GRIDFS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "gridfs" + "'", str0, "gridfs");
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.INDEX_OBJECT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index" + "'", str0, "index");
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DEFAULT_DB_HOST;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "localhost" + "'", str0, "localhost");
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.PORT_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "port" + "'", str0, "port");
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.elasticsearch.common.ParseField parseField0 = org.elasticsearch.script.ScriptService.KEY_SCRIPT_FILE;
        org.junit.Assert.assertNotNull(parseField0);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.STORE_STATISTICS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "store_statistics" + "'", str0, "store_statistics");
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        java.lang.String str0 = org.elasticsearch.script.ScriptService.SCRIPT_INDEX;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + ".scripts" + "'", str0, ".scripts");
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.elasticsearch.common.ParseField parseField0 = org.elasticsearch.script.ScriptService.VALUE_SCRIPT_INLINE;
        org.junit.Assert.assertNotNull(parseField0);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        int int0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DEFAULT_CONCURRENT_REQUESTS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.BULK_SIZE_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "bulk_size" + "'", str0, "bulk_size");
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.elasticsearch.common.ParseField parseField0 = org.elasticsearch.script.ScriptService.KEY_SCRIPT_INLINE;
        org.junit.Assert.assertNotNull(parseField0);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.elasticsearch.script.ScriptService.ScriptType scriptType0 = null;
        org.elasticsearch.common.io.stream.StreamOutput streamOutput1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.script.ScriptService.ScriptType.writeTo(scriptType0, streamOutput1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.SKIP_INITIAL_IMPORT_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "skip_initial_import" + "'", str0, "skip_initial_import");
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.INITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "script_type" + "'", str0, "script_type");
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        java.lang.String str0 = org.elasticsearch.script.ScriptService.DISABLE_DYNAMIC_SCRIPTING_SETTING;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "script.disable_dynamic" + "'", str0, "script.disable_dynamic");
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.ADVANCED_TRANSFORMATION_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "advanced_transformation" + "'", str0, "advanced_transformation");
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.LOCAL_DB_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "local" + "'", str0, "local");
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.INCLUDE_FIELDS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "include_fields" + "'", str0, "include_fields");
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        javax.net.SocketFactory socketFactory0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.getSSLSocketFactory();
        org.junit.Assert.assertNotNull(socketFactory0);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        int int0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DEFAULT_DB_PORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 27017 + "'", int0 == 27017);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.IS_MONGOS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "is_mongos" + "'", str0, "is_mongos");
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.NAME_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "name" + "'", str0, "name");
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.CREDENTIALS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "credentials" + "'", str0, "credentials");
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.SERVERS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "servers" + "'", str0, "servers");
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.COLLECTION_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "collection" + "'", str0, "collection");
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.SECONDARY_READ_PREFERENCE_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "secondary_read_preference" + "'", str0, "secondary_read_preference");
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("secondary_read_preference");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?secondary_read_preference?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.FILTER_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "filter" + "'", str0, "filter");
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DISABLE_INDEX_REFRESH_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "disable_index_refresh" + "'", str0, "disable_index_refresh");
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.USER_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "user" + "'", str0, "user");
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.BULK_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "bulk" + "'", str0, "bulk");
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.SOCKET_TIMEOUT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "socket_timeout" + "'", str0, "socket_timeout");
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.PARENT_TYPES_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "parent_types" + "'", str0, "parent_types");
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.CONCURRENT_REQUESTS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "concurrent_requests" + "'", str0, "concurrent_requests");
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.OPTIONS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "options" + "'", str0, "options");
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.BULK_TIMEOUT_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "bulk_timeout" + "'", str0, "bulk_timeout");
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.elasticsearch.common.ParseField parseField0 = org.elasticsearch.script.ScriptService.SCRIPT_ID;
        org.junit.Assert.assertNotNull(parseField0);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.elasticsearch.common.ParseField parseField0 = org.elasticsearch.script.ScriptService.SCRIPT_INLINE;
        org.junit.Assert.assertNotNull(parseField0);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.EXCLUDE_FIELDS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "exclude_fields" + "'", str0, "exclude_fields");
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.PASSWORD_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "password" + "'", str0, "password");
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        int int0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DEFAULT_SOCKET_TIMEOUT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 60000 + "'", int0 == 60000);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        java.lang.String str0 = org.elasticsearch.script.ScriptService.DEFAULT_SCRIPTING_LANGUAGE_SETTING;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "script.default_lang" + "'", str0, "script.default_lang");
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.elasticsearch.common.ParseField parseField0 = org.elasticsearch.script.ScriptService.VALUE_SCRIPT_FILE;
        org.junit.Assert.assertNotNull(parseField0);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.SCRIPT_TYPE_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "script_type" + "'", str0, "script_type");
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.ADMIN_DB_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "admin" + "'", str0, "admin");
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        java.lang.String str0 = org.elasticsearch.script.ScriptService.DISABLE_DYNAMIC_SCRIPTING_DEFAULT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "sandbox" + "'", str0, "sandbox");
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.SSL_VERIFY_CERT_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ssl_verify_certificate" + "'", str0, "ssl_verify_certificate");
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("concurrent_requests", (java.lang.Object) (-1));
        org.apache.lucene.search.Scorer scorer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setScorer(scorer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.SSL_CONNECTION_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ssl" + "'", str0, "ssl");
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.SCRIPT_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "script" + "'", str0, "script");
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.IMPORT_ALL_COLLECTIONS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "import_all_collections" + "'", str0, "import_all_collections");
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.elasticsearch.script.ScriptService.ScriptType scriptType0 = org.elasticsearch.script.ScriptService.ScriptType.FILE;
        org.elasticsearch.common.io.stream.StreamOutput streamOutput1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.script.ScriptService.ScriptType.writeTo(scriptType0, streamOutput1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + scriptType0 + "' != '" + org.elasticsearch.script.ScriptService.ScriptType.FILE + "'", scriptType0.equals(org.elasticsearch.script.ScriptService.ScriptType.FILE));
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.CONCURRENT_BULK_REQUESTS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "concurrent_bulk_requests" + "'", str0, "concurrent_bulk_requests");
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.apache.lucene.search.Scorer scorer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setScorer(scorer1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DROP_COLLECTION_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "drop_collection" + "'", str0, "drop_collection");
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.elasticsearch.common.ParseField parseField0 = org.elasticsearch.script.ScriptService.SCRIPT_LANG;
        org.junit.Assert.assertNotNull(parseField0);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        int int0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DEFAULT_BULK_ACTIONS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1000 + "'", int0 == 1000);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.elasticsearch.common.ParseField parseField0 = org.elasticsearch.script.ScriptService.SCRIPT_FILE;
        org.junit.Assert.assertNotNull(parseField0);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("filter", (java.lang.Object) "gridfs");
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextSource(strMap4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.THROTTLE_SIZE_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "throttle_size" + "'", str0, "throttle_size");
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.SIZE_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "size" + "'", str0, "size");
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.TYPE_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "type" + "'", str0, "type");
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.INITIAL_TIMESTAMP_SCRIPT_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "script" + "'", str0, "script");
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.INITIAL_TIMESTAMP_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "initial_timestamp" + "'", str0, "initial_timestamp");
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.elasticsearch.common.unit.TimeValue timeValue0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DEFAULT_FLUSH_INTERVAL;
        org.junit.Assert.assertNotNull(timeValue0);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.ACTIONS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "actions" + "'", str0, "actions");
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("concurrent_requests", (java.lang.Object) (-1));
        org.apache.lucene.index.AtomicReaderContext atomicReaderContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextReader(atomicReaderContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.HOST_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "host" + "'", str0, "host");
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.elasticsearch.common.io.stream.StreamInput streamInput0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.script.ScriptService.ScriptType scriptType1 = org.elasticsearch.script.ScriptService.ScriptType.readFrom(streamInput0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.elasticsearch.common.ParseField parseField0 = org.elasticsearch.script.ScriptService.KEY_SCRIPT_ID;
        org.junit.Assert.assertNotNull(parseField0);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("hi!");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?hi!?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.env.Environment environment1 = null;
        org.elasticsearch.script.ScriptEngineService[] scriptEngineServiceArray2 = new org.elasticsearch.script.ScriptEngineService[] {};
        java.util.LinkedHashSet<org.elasticsearch.script.ScriptEngineService> scriptEngineServiceSet3 = new java.util.LinkedHashSet<org.elasticsearch.script.ScriptEngineService>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<org.elasticsearch.script.ScriptEngineService>) scriptEngineServiceSet3, scriptEngineServiceArray2);
        org.elasticsearch.watcher.ResourceWatcherService resourceWatcherService5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.script.ScriptService scriptService6 = new org.elasticsearch.script.ScriptService(settings0, environment1, (java.util.Set<org.elasticsearch.script.ScriptEngineService>) scriptEngineServiceSet3, resourceWatcherService5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(scriptEngineServiceArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory0 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean2 = builder1.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder1.script("bulk");
        com.mongodb.BasicDBObject basicDBObject5 = builder4.getmongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript6 = docScoreNativeScriptFactory0.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject5);
        java.lang.Class<?> wildcardClass7 = docScoreNativeScriptFactory0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(basicDBObject5);
        org.junit.Assert.assertNotNull(executableScript6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.disableIndexRefresh(false);
        builder5.setmongoAdminUser("bulk");
        builder5.settypeName("drop_collection");
        java.lang.String str10 = builder5.getmongoCollection();
        builder5.setriverName("script_type");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.INCLUDE_COLLECTION_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "include_collection" + "'", str0, "include_collection");
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.FLUSH_INTERVAL_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "flush_interval" + "'", str0, "flush_interval");
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.elasticsearch.script.ScriptService.ScriptType scriptType0 = org.elasticsearch.script.ScriptService.ScriptType.INDEXED;
        org.elasticsearch.common.io.stream.StreamOutput streamOutput1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.script.ScriptService.ScriptType.writeTo(scriptType0, streamOutput1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + scriptType0 + "' != '" + org.elasticsearch.script.ScriptService.ScriptType.INDEXED + "'", scriptType0.equals(org.elasticsearch.script.ScriptService.ScriptType.INDEXED));
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DEFAULT_BULK_SIZE;
        org.junit.Assert.assertNotNull(byteSizeValue0);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DB_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "db" + "'", str0, "db");
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        int int0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DEFAULT_CONNECT_TIMEOUT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 30000 + "'", int0 == 30000);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("options", "skip_initial_import");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?skip_initial_import?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("servers", "bulk");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?bulk?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("script_type");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?script_type?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("advanced_transformation");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?advanced_transformation?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder3.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = null;
        builder3.setmongoOplogFilter(basicDBObject6);
        builder3.statisticsIndexName = "socket_timeout";
        java.lang.String str10 = builder3.riverIndexName;
        boolean boolean11 = builder3.advancedTransformation;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder3.dropCollection(true);
        java.lang.Class<?> wildcardClass14 = builder3.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList2 = mongoDBRiverDefinition1.mongoServers;
        org.elasticsearch.common.unit.TimeValue timeValue3 = mongoDBRiverDefinition1.getDEFAULT_FLUSH_INTERVAL();
        java.lang.String str4 = mongoDBRiverDefinition1.getDISABLE_INDEX_REFRESH_FIELD();
        java.lang.String str5 = mongoDBRiverDefinition1.getSIZE_FIELD();
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertNotNull(serverAddressList2);
        org.junit.Assert.assertNotNull(timeValue3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "disable_index_refresh" + "'", str4, "disable_index_refresh");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "size" + "'", str5, "size");
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("host", "disable_index_refresh", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?disable_index_refresh?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("concurrent_requests", (java.lang.Object) (-1));
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean6 = builder5.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder5.script("bulk");
        com.mongodb.BasicDBObject basicDBObject9 = null;
        builder8.setmongoOplogFilter(basicDBObject9);
        docScoreSearchScript0.setNextVar("script_type", (java.lang.Object) basicDBObject9);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory12 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean14 = builder13.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder13.script("bulk");
        com.mongodb.BasicDBObject basicDBObject17 = builder16.getmongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript18 = docScoreNativeScriptFactory12.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject17);
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(basicDBObject17);
        org.junit.Assert.assertNotNull(executableScript18);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.lang.String str2 = mongoDBRiverDefinition1.getINDEX_OBJECT();
        java.util.Set<java.lang.String> strSet3 = mongoDBRiverDefinition1.parentTypes;
        boolean boolean4 = mongoDBRiverDefinition1.isStoreStatistics();
        boolean boolean5 = mongoDBRiverDefinition1.dropCollection;
        java.lang.String str6 = mongoDBRiverDefinition1.getCOLLECTION_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition1.getBULK_FIELD();
        boolean boolean8 = mongoDBRiverDefinition1.mongoGridFS;
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "index" + "'", str2, "index");
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "collection" + "'", str6, "collection");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "bulk" + "'", str7, "bulk");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        builder3.skipInitialImport = false;
        builder3.setscriptType("script");
        java.lang.String[] strArray25 = new java.lang.String[] { "exclude_fields", "servers", "secondary_read_preference", "name", "exclude_fields", "bulk_timeout", "skip_initial_import", "bulk", "script", "disable_index_refresh", "script.default_lang", "skip_initial_import", "gridfs", "user", "port", "parent_types", "size" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder3.excludeFields((java.util.Set<java.lang.String>) strSet26);
        java.lang.String str29 = builder3.typeName;
        int int30 = builder3.socketTimeout;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.CONNECT_TIMEOUT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "connect_timeout" + "'", str0, "connect_timeout");
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder3.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = null;
        builder3.setmongoOplogFilter(basicDBObject6);
        builder3.statisticsIndexName = "socket_timeout";
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = builder3.initialTimestamp;
        builder3.setmongoAdminUser("concurrent_requests");
        builder3.setdropCollection(false);
        builder3.setdisableIndexRefresh(false);
        java.lang.String str17 = builder3.getindexName();
        builder3.typeName = "host";
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.elasticsearch.action.get.GetResponse getResponse0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.elasticsearch.script.ScriptService.getScriptFromResponse(getResponse0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.elasticsearch.common.settings.Settings settings2 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        org.elasticsearch.river.RiverSettings riverSettings4 = new org.elasticsearch.river.RiverSettings(settings2, strMap3);
        org.elasticsearch.common.settings.Settings settings5 = riverSettings4.globalSettings();
        org.elasticsearch.script.ScriptService scriptService6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("gridfs", "flush_interval", riverSettings4, scriptService6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(settings5);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString7();
        org.elasticsearch.river.RiverSettings riverSettings2 = serializedObjectSupporter0.deserializeObjectRiverSettings4();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb-1638820218326" + "'", str1, "mongodb-1638820218326");
        org.junit.Assert.assertNotNull(riverSettings2);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder3.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = null;
        builder3.setmongoOplogFilter(basicDBObject6);
        builder3.statisticsIndexName = "socket_timeout";
        org.bson.types.BSONTimestamp bSONTimestamp10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder3.initialTimestamp(bSONTimestamp10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ts must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        java.lang.String str2 = builder0.getscript();
        boolean boolean3 = builder0.dropCollection;
        builder0.indexName = "";
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory6 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean8 = builder7.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder7.script("bulk");
        com.mongodb.BasicDBObject basicDBObject11 = builder10.getmongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript12 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject11);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder0.mongoOplogFilter(basicDBObject11);
        builder0.storeStatistics = true;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder0.mongoSSLVerifyCertificate(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder0.mongoDb("admin");
        builder19.script = "script";
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(basicDBObject11);
        org.junit.Assert.assertNotNull(executableScript12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString7();
        org.elasticsearch.river.RiverSettings riverSettings2 = serializedObjectSupporter0.deserializeObjectRiverSettings4();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString3();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb-1638820218326" + "'", str1, "mongodb-1638820218326");
        org.junit.Assert.assertNotNull(riverSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "mongodb-1638820218264" + "'", str3, "mongodb-1638820218264");
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder3.mongoAdminUser("socket_timeout");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = builder5.initialTimestamp;
        int int7 = builder5.getsocketTimeout();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder3.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = null;
        builder3.setmongoOplogFilter(basicDBObject6);
        builder3.statisticsIndexName = "socket_timeout";
        java.lang.String str10 = builder3.riverIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder3.skipInitialImport(false);
        builder12.riverName = "skip_initial_import";
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean3 = builder2.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.script("bulk");
        builder2.riverName = "concurrent_bulk_requests";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder2.connectTimeout((int) (byte) 10);
        docScoreSearchScript0.setNextVar("port", (java.lang.Object) builder9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition12 = builder11.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList13 = mongoDBRiverDefinition12.mongoServers;
        org.elasticsearch.common.unit.TimeValue timeValue14 = mongoDBRiverDefinition12.getDEFAULT_FLUSH_INTERVAL();
        boolean boolean15 = mongoDBRiverDefinition12.dropCollection;
        boolean boolean16 = mongoDBRiverDefinition12.isMongoSecondaryReadPreference();
        java.lang.Object obj17 = docScoreSearchScript0.unwrap((java.lang.Object) boolean16);
        org.apache.lucene.search.Scorer scorer18 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setScorer(scorer18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition12);
        org.junit.Assert.assertNotNull(serverAddressList13);
        org.junit.Assert.assertNotNull(timeValue14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + false + "'", obj17, false);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString7();
        org.elasticsearch.river.RiverSettings riverSettings2 = serializedObjectSupporter0.deserializeObjectRiverSettings6();
        org.elasticsearch.common.settings.Settings settings3 = riverSettings2.globalSettings();
        org.elasticsearch.env.Environment environment4 = null;
        org.elasticsearch.script.ScriptEngineService[] scriptEngineServiceArray5 = new org.elasticsearch.script.ScriptEngineService[] {};
        java.util.LinkedHashSet<org.elasticsearch.script.ScriptEngineService> scriptEngineServiceSet6 = new java.util.LinkedHashSet<org.elasticsearch.script.ScriptEngineService>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.elasticsearch.script.ScriptEngineService>) scriptEngineServiceSet6, scriptEngineServiceArray5);
        org.elasticsearch.watcher.ResourceWatcherService resourceWatcherService8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.script.ScriptService scriptService9 = new org.elasticsearch.script.ScriptService(settings3, environment4, (java.util.Set<org.elasticsearch.script.ScriptEngineService>) scriptEngineServiceSet6, resourceWatcherService8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb-1638820218326" + "'", str1, "mongodb-1638820218326");
        org.junit.Assert.assertNotNull(riverSettings2);
        org.junit.Assert.assertNotNull(settings3);
        org.junit.Assert.assertNotNull(scriptEngineServiceArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString7();
        org.elasticsearch.river.RiverSettings riverSettings2 = serializedObjectSupporter0.deserializeObjectRiverSettings6();
        org.elasticsearch.common.settings.Settings settings3 = riverSettings2.globalSettings();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean5 = builder4.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder4.script("bulk");
        com.mongodb.BasicDBObject basicDBObject8 = null;
        builder7.setmongoOplogFilter(basicDBObject8);
        com.mongodb.BasicDBObject basicDBObject10 = null;
        builder7.setmongoOplogFilter(basicDBObject10);
        builder7.statisticsIndexName = "socket_timeout";
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = builder7.initialTimestamp;
        com.mongodb.BasicDBObject basicDBObject15 = builder7.mongoCollectionFilter;
        org.elasticsearch.river.RiverSettings riverSettings16 = new org.elasticsearch.river.RiverSettings(settings3, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject15);
        org.elasticsearch.env.Environment environment17 = null;
        org.elasticsearch.script.ScriptEngineService[] scriptEngineServiceArray18 = new org.elasticsearch.script.ScriptEngineService[] {};
        java.util.LinkedHashSet<org.elasticsearch.script.ScriptEngineService> scriptEngineServiceSet19 = new java.util.LinkedHashSet<org.elasticsearch.script.ScriptEngineService>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.elasticsearch.script.ScriptEngineService>) scriptEngineServiceSet19, scriptEngineServiceArray18);
        org.elasticsearch.watcher.ResourceWatcherService resourceWatcherService21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.script.ScriptService scriptService22 = new org.elasticsearch.script.ScriptService(settings3, environment17, (java.util.Set<org.elasticsearch.script.ScriptEngineService>) scriptEngineServiceSet19, resourceWatcherService21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb-1638820218326" + "'", str1, "mongodb-1638820218326");
        org.junit.Assert.assertNotNull(riverSettings2);
        org.junit.Assert.assertNotNull(settings3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(wildcardTimestamp14);
        org.junit.Assert.assertNotNull(basicDBObject15);
        org.junit.Assert.assertNotNull(scriptEngineServiceArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("concurrent_requests", (java.lang.Object) (-1));
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean6 = builder5.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder5.script("bulk");
        com.mongodb.BasicDBObject basicDBObject9 = null;
        builder8.setmongoOplogFilter(basicDBObject9);
        docScoreSearchScript0.setNextVar("script_type", (java.lang.Object) basicDBObject9);
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextDocId((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("mongodb-1638820218299");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?mongodb-1638820218299?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        com.mongodb.BasicDBObject basicDBObject2 = builder0.mongoCollectionFilter;
        builder0.setstatisticsIndexName("options");
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertNotNull(basicDBObject2);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder3.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = null;
        builder3.setmongoOplogFilter(basicDBObject6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder3.riverIndexName("socket_timeout");
        builder3.setriverName("sandbox");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = builder3.getinitialTimestamp();
        java.util.Set<java.lang.String> strSet13 = builder3.includeFields;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(wildcardTimestamp12);
        org.junit.Assert.assertNull(strSet13);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.util.Set<java.lang.String> strSet1 = builder0.getexcludeFields();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.mongoLocalUser("credentials");
        java.lang.String str4 = builder3.script;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean6 = builder5.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder5.script("bulk");
        com.mongodb.BasicDBObject basicDBObject9 = null;
        builder8.setmongoOplogFilter(basicDBObject9);
        com.mongodb.BasicDBObject basicDBObject11 = null;
        builder8.setmongoOplogFilter(basicDBObject11);
        builder8.statisticsIndexName = "socket_timeout";
        builder8.setconnectTimeout((int) (byte) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean18 = builder17.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder17.script("bulk");
        com.mongodb.BasicDBObject basicDBObject21 = null;
        builder20.setmongoOplogFilter(basicDBObject21);
        com.mongodb.BasicDBObject basicDBObject23 = null;
        builder20.setmongoOplogFilter(basicDBObject23);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean26 = builder25.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder25.script("bulk");
        builder28.skipInitialImport = false;
        builder28.setscriptType("script");
        java.lang.String[] strArray50 = new java.lang.String[] { "exclude_fields", "servers", "secondary_read_preference", "name", "exclude_fields", "bulk_timeout", "skip_initial_import", "bulk", "script", "disable_index_refresh", "script.default_lang", "skip_initial_import", "gridfs", "user", "port", "parent_types", "size" };
        java.util.LinkedHashSet<java.lang.String> strSet51 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet51, strArray50);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder28.excludeFields((java.util.Set<java.lang.String>) strSet51);
        builder20.setexcludeFields((java.util.Set<java.lang.String>) strSet51);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder8.includeFields((java.util.Set<java.lang.String>) strSet51);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder3.excludeFields((java.util.Set<java.lang.String>) strSet51);
        java.lang.Boolean boolean57 = builder56.getisMongos();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp58 = builder56.getinitialTimestamp();
        org.junit.Assert.assertNull(strSet1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNull(boolean57);
        org.junit.Assert.assertNull(wildcardTimestamp58);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString4();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_river" + "'", str1, "_river");
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("user", "mongodb-1638820218449", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?mongodb-1638820218449?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder3.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = null;
        builder3.setmongoOplogFilter(basicDBObject6);
        boolean boolean8 = builder3.mongoGridFS;
        java.lang.String[] strArray51 = new java.lang.String[] { "credentials", "script.default_lang", "admin", "servers", "bulk", "script_type", "filter", "drop_collection", "local", "options", "store_statistics", "import_all_collections", "", "user", "secondary_read_preference", "actions", "concurrent_requests", "exclude_fields", "script_type", "exclude_fields", "socket_timeout", "admin", "filter", "user", "throttle_size", "bulk_timeout", "name", "local", "local", "skip_initial_import", "filter", ".scripts", "store_statistics", "concurrent_requests", "gridfs", "collection", "password", "script_type", "socket_timeout", "ssl_verify_certificate", "store_statistics", "size" };
        java.util.LinkedHashSet<java.lang.String> strSet52 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet52, strArray51);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder3.includeFields((java.util.Set<java.lang.String>) strSet52);
        int int55 = builder54.throttleSize;
        builder54.typeName = "null.null";
        builder54.indexName = "hi!";
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean3 = builder2.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.script("bulk");
        builder2.riverName = "concurrent_bulk_requests";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder2.connectTimeout((int) (byte) 10);
        docScoreSearchScript0.setNextVar("port", (java.lang.Object) builder9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean12 = builder11.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder11.script("bulk");
        com.mongodb.BasicDBObject basicDBObject15 = null;
        builder14.setmongoOplogFilter(basicDBObject15);
        com.mongodb.BasicDBObject basicDBObject17 = null;
        builder14.setmongoOplogFilter(basicDBObject17);
        builder14.statisticsIndexName = "socket_timeout";
        builder14.setmongoUseSSL(false);
        java.lang.Object obj23 = docScoreSearchScript0.unwrap((java.lang.Object) builder14);
        org.apache.lucene.index.AtomicReaderContext atomicReaderContext24 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextReader(atomicReaderContext24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder3.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = null;
        builder3.setmongoOplogFilter(basicDBObject6);
        builder3.statisticsIndexName = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder3.throttleSize((int) (short) 0);
        builder3.mongoLocalPassword = "script.disable_dynamic";
        builder3.riverName = "include_fields";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder3.connectTimeout((int) (byte) 10);
        builder17.setimportAllCollections(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("password", "throttle_size");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?throttle_size? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("concurrent_requests", (java.lang.Object) (-1));
        docScoreSearchScript0.setNextVar("skip_initial_import", (java.lang.Object) 100);
        org.apache.lucene.index.AtomicReaderContext atomicReaderContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextReader(atomicReaderContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("servers", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.disableIndexRefresh(false);
        builder5.setthrottleSize((int) ' ');
        boolean boolean8 = builder5.getadvancedTransformation();
        java.lang.String str9 = builder5.mongoLocalPassword;
        java.lang.String str10 = builder5.getmongoCollection();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean3 = builder2.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.script("bulk");
        builder2.riverName = "concurrent_bulk_requests";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder2.connectTimeout((int) (byte) 10);
        docScoreSearchScript0.setNextVar("port", (java.lang.Object) builder9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean12 = builder11.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder11.script("bulk");
        builder11.riverName = "concurrent_bulk_requests";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder11.connectTimeout((int) (byte) 10);
        java.lang.Object obj19 = docScoreSearchScript0.unwrap((java.lang.Object) builder18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean21 = builder20.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder20.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder20.disableIndexRefresh(false);
        java.lang.String str26 = builder25.getstatisticsTypeName();
        builder25.setmongoGridFS(true);
        org.elasticsearch.common.settings.Settings settings29 = null;
        org.elasticsearch.common.settings.Settings settings30 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean32 = builder31.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder31.script("bulk");
        com.mongodb.BasicDBObject basicDBObject35 = null;
        builder34.setmongoOplogFilter(basicDBObject35);
        com.mongodb.BasicDBObject basicDBObject37 = null;
        builder34.setmongoOplogFilter(basicDBObject37);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean40 = builder39.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder39.script("bulk");
        builder42.skipInitialImport = false;
        builder42.setscriptType("script");
        java.lang.String[] strArray64 = new java.lang.String[] { "exclude_fields", "servers", "secondary_read_preference", "name", "exclude_fields", "bulk_timeout", "skip_initial_import", "bulk", "script", "disable_index_refresh", "script.default_lang", "skip_initial_import", "gridfs", "user", "port", "parent_types", "size" };
        java.util.LinkedHashSet<java.lang.String> strSet65 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet65, strArray64);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder67 = builder42.excludeFields((java.util.Set<java.lang.String>) strSet65);
        builder34.setexcludeFields((java.util.Set<java.lang.String>) strSet65);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder70 = builder34.throttleSize(100);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory71 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder72 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean73 = builder72.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder75 = builder72.script("bulk");
        com.mongodb.BasicDBObject basicDBObject76 = builder75.getmongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript77 = docScoreNativeScriptFactory71.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject76);
        builder34.mongoCollectionFilter = basicDBObject76;
        org.elasticsearch.river.RiverSettings riverSettings79 = new org.elasticsearch.river.RiverSettings(settings30, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject76);
        org.elasticsearch.river.RiverSettings riverSettings80 = new org.elasticsearch.river.RiverSettings(settings29, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject76);
        builder25.mongoOplogFilter = basicDBObject76;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject76);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(builder75);
        org.junit.Assert.assertNotNull(basicDBObject76);
        org.junit.Assert.assertNotNull(executableScript77);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString7();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString17();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString18();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb-1638820218326" + "'", str1, "mongodb-1638820218326");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mongodb-1638820218449" + "'", str2, "mongodb-1638820218449");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_river" + "'", str3, "_river");
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        builder3.skipInitialImport = false;
        builder3.setscriptType("script");
        java.lang.String[] strArray25 = new java.lang.String[] { "exclude_fields", "servers", "secondary_read_preference", "name", "exclude_fields", "bulk_timeout", "skip_initial_import", "bulk", "script", "disable_index_refresh", "script.default_lang", "skip_initial_import", "gridfs", "user", "port", "parent_types", "size" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder3.excludeFields((java.util.Set<java.lang.String>) strSet26);
        int int29 = builder28.getconnectTimeout();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("bulk_timeout", "collection", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?collection?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder3.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = null;
        builder3.setmongoOplogFilter(basicDBObject6);
        builder3.statisticsIndexName = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder3.throttleSize((int) (short) 0);
        builder3.mongoLocalPassword = "script.disable_dynamic";
        builder3.riverName = "include_fields";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder3.connectTimeout((int) (byte) 10);
        builder17.mongoAdminUser = "include_collection";
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder3.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = null;
        builder3.setmongoOplogFilter(basicDBObject6);
        builder3.statisticsIndexName = "socket_timeout";
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = builder3.initialTimestamp;
        com.mongodb.BasicDBObject basicDBObject11 = builder3.mongoCollectionFilter;
        boolean boolean12 = builder3.mongoSecondaryReadPreference;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertNotNull(basicDBObject11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList2 = mongoDBRiverDefinition1.mongoServers;
        org.elasticsearch.common.unit.TimeValue timeValue3 = mongoDBRiverDefinition1.getDEFAULT_FLUSH_INTERVAL();
        boolean boolean4 = mongoDBRiverDefinition1.dropCollection;
        boolean boolean5 = mongoDBRiverDefinition1.getmongoSecondaryReadPreference();
        boolean boolean6 = mongoDBRiverDefinition1.isMongoSecondaryReadPreference();
        int int7 = mongoDBRiverDefinition1.getDEFAULT_DB_PORT();
        java.lang.String str8 = mongoDBRiverDefinition1.getSSL_CONNECTION_FIELD();
        java.lang.String str9 = mongoDBRiverDefinition1.getMongoAdminUser();
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertNotNull(serverAddressList2);
        org.junit.Assert.assertNotNull(timeValue3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 27017 + "'", int7 == 27017);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ssl" + "'", str8, "ssl");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.disableIndexRefresh(false);
        java.lang.String str6 = builder5.getstatisticsTypeName();
        java.lang.String str7 = builder5.riverName;
        int int8 = builder5.connectTimeout;
        java.lang.String[] strArray55 = new java.lang.String[] { "type", "index", "", "db", "null.null", "_river", "mongodb-1638820217755", "mongodb-1638820218449", "local", "script.default_lang", "bulk_size", "host", "size", ".scripts", "secondary_read_preference", "script", "script_type", "mongodb-1638820218424", "script", "bulk_timeout", "collection", "mongodb-1638820218424", "initial_timestamp", "skip_initial_import", "", "port", "initial_timestamp", "mongodb-1638820217755", ".scripts", "index", "password", ".scripts", "flush_interval", "is_mongos", "ssl_verify_certificate", "servers", "localhost", "script.disable_dynamic", "ssl_verify_certificate", "bulk", "connect_timeout", "mongodb-1638820218449", "", "skip_initial_import", "mongodb-1638820218449", "connect_timeout" };
        java.util.LinkedHashSet<java.lang.String> strSet56 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet56, strArray55);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = builder5.parentTypes((java.util.Set<java.lang.String>) strSet56);
        java.lang.String str59 = builder5.getscriptType();
        java.util.Set<java.lang.String> strSet60 = builder5.getexcludeFields();
        boolean boolean61 = builder5.getmongoGridFS();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNull(strSet60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean3 = builder2.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.script("bulk");
        builder2.riverName = "concurrent_bulk_requests";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder2.connectTimeout((int) (byte) 10);
        docScoreSearchScript0.setNextVar("port", (java.lang.Object) builder9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean12 = builder11.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder11.script("bulk");
        com.mongodb.BasicDBObject basicDBObject15 = null;
        builder14.setmongoOplogFilter(basicDBObject15);
        com.mongodb.BasicDBObject basicDBObject17 = null;
        builder14.setmongoOplogFilter(basicDBObject17);
        builder14.statisticsIndexName = "socket_timeout";
        builder14.setmongoUseSSL(false);
        java.lang.Object obj23 = docScoreSearchScript0.unwrap((java.lang.Object) builder14);
        // The following exception was thrown during execution in test generation
        try {
            long long24 = docScoreSearchScript0.runAsLong();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.lang.String str2 = mongoDBRiverDefinition1.getINDEX_OBJECT();
        java.util.Set<java.lang.String> strSet3 = mongoDBRiverDefinition1.parentTypes;
        boolean boolean4 = mongoDBRiverDefinition1.isStoreStatistics();
        boolean boolean5 = mongoDBRiverDefinition1.dropCollection;
        java.lang.String str6 = mongoDBRiverDefinition1.getCOLLECTION_FIELD();
        com.mongodb.BasicDBObject basicDBObject7 = mongoDBRiverDefinition1.getMongoCollectionFilter();
        java.lang.String str8 = mongoDBRiverDefinition1.getTYPE_FIELD();
        java.lang.String str9 = mongoDBRiverDefinition1.getSERVERS_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition1.getINITIAL_TIMESTAMP_FIELD();
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "index" + "'", str2, "index");
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "collection" + "'", str6, "collection");
        org.junit.Assert.assertNotNull(basicDBObject7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "type" + "'", str8, "type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "servers" + "'", str9, "servers");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "initial_timestamp" + "'", str10, "initial_timestamp");
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList2 = mongoDBRiverDefinition1.mongoServers;
        org.elasticsearch.common.unit.TimeValue timeValue3 = mongoDBRiverDefinition1.getDEFAULT_FLUSH_INTERVAL();
        boolean boolean4 = mongoDBRiverDefinition1.dropCollection;
        boolean boolean5 = mongoDBRiverDefinition1.isMongoSecondaryReadPreference();
        java.lang.String str6 = mongoDBRiverDefinition1.getStatisticsTypeName();
        java.lang.String str7 = mongoDBRiverDefinition1.getMongoLocalPassword();
        java.lang.String str8 = mongoDBRiverDefinition1.getIndexName();
        boolean boolean9 = mongoDBRiverDefinition1.mongoUseSSL;
        java.lang.String str10 = mongoDBRiverDefinition1.getSOCKET_TIMEOUT();
        boolean boolean11 = mongoDBRiverDefinition1.getmongoSecondaryReadPreference();
        int int12 = mongoDBRiverDefinition1.connectTimeout;
        boolean boolean13 = mongoDBRiverDefinition1.isDisableIndexRefresh();
        boolean boolean14 = mongoDBRiverDefinition1.skipInitialImport;
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = mongoDBRiverDefinition1.getInitialTimestamp();
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertNotNull(serverAddressList2);
        org.junit.Assert.assertNotNull(timeValue3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "socket_timeout" + "'", str10, "socket_timeout");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(wildcardTimestamp15);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoOplogFilter();
        builder0.setmongoLocalPassword("initial_timestamp");
        org.bson.types.Binary binary7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.initialTimestamp(binary7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(basicDBObject4);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList2 = mongoDBRiverDefinition1.mongoServers;
        org.elasticsearch.common.unit.TimeValue timeValue3 = mongoDBRiverDefinition1.getDEFAULT_FLUSH_INTERVAL();
        boolean boolean4 = mongoDBRiverDefinition1.dropCollection;
        boolean boolean5 = mongoDBRiverDefinition1.isMongoSecondaryReadPreference();
        java.lang.String str6 = mongoDBRiverDefinition1.getStatisticsTypeName();
        java.lang.String str7 = mongoDBRiverDefinition1.getMongoLocalPassword();
        java.lang.String str8 = mongoDBRiverDefinition1.getCONNECT_TIMEOUT();
        java.lang.String str9 = mongoDBRiverDefinition1.script;
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertNotNull(serverAddressList2);
        org.junit.Assert.assertNotNull(timeValue3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "connect_timeout" + "'", str8, "connect_timeout");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.lang.String str2 = mongoDBRiverDefinition1.getINDEX_OBJECT();
        java.util.Set<java.lang.String> strSet3 = mongoDBRiverDefinition1.parentTypes;
        boolean boolean4 = mongoDBRiverDefinition1.isStoreStatistics();
        boolean boolean5 = mongoDBRiverDefinition1.dropCollection;
        java.lang.String str6 = mongoDBRiverDefinition1.getCOLLECTION_FIELD();
        com.mongodb.BasicDBObject basicDBObject7 = mongoDBRiverDefinition1.getMongoCollectionFilter();
        java.lang.String str8 = mongoDBRiverDefinition1.statisticsIndexName;
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "index" + "'", str2, "index");
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "collection" + "'", str6, "collection");
        org.junit.Assert.assertNotNull(basicDBObject7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString7();
        org.elasticsearch.river.RiverSettings riverSettings2 = serializedObjectSupporter0.deserializeObjectRiverSettings6();
        org.elasticsearch.common.settings.Settings settings3 = riverSettings2.globalSettings();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean5 = builder4.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder4.script("bulk");
        com.mongodb.BasicDBObject basicDBObject8 = null;
        builder7.setmongoOplogFilter(basicDBObject8);
        com.mongodb.BasicDBObject basicDBObject10 = null;
        builder7.setmongoOplogFilter(basicDBObject10);
        builder7.statisticsIndexName = "socket_timeout";
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = builder7.initialTimestamp;
        com.mongodb.BasicDBObject basicDBObject15 = builder7.mongoCollectionFilter;
        org.elasticsearch.river.RiverSettings riverSettings16 = new org.elasticsearch.river.RiverSettings(settings3, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject15);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition18 = builder17.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList19 = mongoDBRiverDefinition18.mongoServers;
        org.elasticsearch.common.unit.TimeValue timeValue20 = mongoDBRiverDefinition18.getDEFAULT_FLUSH_INTERVAL();
        boolean boolean21 = mongoDBRiverDefinition18.dropCollection;
        boolean boolean22 = mongoDBRiverDefinition18.isMongoSecondaryReadPreference();
        java.lang.String str23 = mongoDBRiverDefinition18.getStatisticsTypeName();
        java.lang.String str24 = mongoDBRiverDefinition18.getMongoLocalPassword();
        java.lang.String str25 = mongoDBRiverDefinition18.getCONNECT_TIMEOUT();
        java.util.Set<java.lang.String> strSet26 = mongoDBRiverDefinition18.getExcludeFields();
        com.mongodb.BasicDBObject basicDBObject27 = mongoDBRiverDefinition18.mongoCollectionFilter;
        org.elasticsearch.river.RiverSettings riverSettings28 = new org.elasticsearch.river.RiverSettings(settings3, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject27);
        org.elasticsearch.env.Environment environment29 = null;
        org.elasticsearch.script.ScriptEngineService[] scriptEngineServiceArray30 = new org.elasticsearch.script.ScriptEngineService[] {};
        java.util.LinkedHashSet<org.elasticsearch.script.ScriptEngineService> scriptEngineServiceSet31 = new java.util.LinkedHashSet<org.elasticsearch.script.ScriptEngineService>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<org.elasticsearch.script.ScriptEngineService>) scriptEngineServiceSet31, scriptEngineServiceArray30);
        org.elasticsearch.watcher.ResourceWatcherService resourceWatcherService33 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.script.ScriptService scriptService34 = new org.elasticsearch.script.ScriptService(settings3, environment29, (java.util.Set<org.elasticsearch.script.ScriptEngineService>) scriptEngineServiceSet31, resourceWatcherService33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb-1638820218326" + "'", str1, "mongodb-1638820218326");
        org.junit.Assert.assertNotNull(riverSettings2);
        org.junit.Assert.assertNotNull(settings3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(wildcardTimestamp14);
        org.junit.Assert.assertNotNull(basicDBObject15);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition18);
        org.junit.Assert.assertNotNull(serverAddressList19);
        org.junit.Assert.assertNotNull(timeValue20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "connect_timeout" + "'", str25, "connect_timeout");
        org.junit.Assert.assertNull(strSet26);
        org.junit.Assert.assertNotNull(basicDBObject27);
        org.junit.Assert.assertNotNull(scriptEngineServiceArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder3.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = null;
        builder3.setmongoOplogFilter(basicDBObject6);
        builder3.statisticsIndexName = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder3.throttleSize((int) (short) 0);
        builder3.connectTimeout = 27017;
        builder3.throttleSize = 10;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("hi!", "mongodb-1638820218363");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?mongodb-1638820218363?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.lang.String str2 = mongoDBRiverDefinition1.getINDEX_OBJECT();
        java.util.Set<java.lang.String> strSet3 = mongoDBRiverDefinition1.parentTypes;
        java.lang.String str4 = mongoDBRiverDefinition1.riverName;
        boolean boolean5 = mongoDBRiverDefinition1.getimportAllCollections();
        java.lang.String str6 = mongoDBRiverDefinition1.getBULK_TIMEOUT_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition1.scriptType;
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "index" + "'", str2, "index");
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "bulk_timeout" + "'", str6, "bulk_timeout");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter4 = null;
        builder0.serializedObjectSupporter = serializedObjectSupporter4;
        boolean boolean6 = builder0.getstoreStatistics();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        java.lang.String str2 = builder0.getscript();
        boolean boolean3 = builder0.dropCollection;
        builder0.indexName = "";
        java.util.Set<java.lang.String> strSet6 = builder0.excludeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.socketTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.statisticsTypeName("include_collection");
        java.lang.String str11 = builder10.getstatisticsIndexName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        builder3.skipInitialImport = false;
        builder3.setscriptType("script");
        java.lang.String[] strArray25 = new java.lang.String[] { "exclude_fields", "servers", "secondary_read_preference", "name", "exclude_fields", "bulk_timeout", "skip_initial_import", "bulk", "script", "disable_index_refresh", "script.default_lang", "skip_initial_import", "gridfs", "user", "port", "parent_types", "size" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder3.excludeFields((java.util.Set<java.lang.String>) strSet26);
        java.lang.String str29 = builder3.typeName;
        builder3.setstatisticsIndexName("name");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter32 = null;
        builder3.serializedObjectSupporter = serializedObjectSupporter32;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder3.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = null;
        builder3.setmongoOplogFilter(basicDBObject6);
        builder3.statisticsIndexName = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder3.throttleSize((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.throttleSize((int) (short) 100);
        com.mongodb.MongoClientOptions mongoClientOptions14 = null;
        builder11.setmongoClientOptions(mongoClientOptions14);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.lang.String str2 = mongoDBRiverDefinition1.getINDEX_OBJECT();
        java.util.Set<java.lang.String> strSet3 = mongoDBRiverDefinition1.parentTypes;
        boolean boolean4 = mongoDBRiverDefinition1.isStoreStatistics();
        boolean boolean5 = mongoDBRiverDefinition1.getskipInitialImport();
        boolean boolean6 = mongoDBRiverDefinition1.mongoSSLVerifyCertificate;
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = mongoDBRiverDefinition1.getInitialTimestamp();
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "index" + "'", str2, "index");
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(wildcardTimestamp7);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.lang.String str2 = mongoDBRiverDefinition1.getINDEX_OBJECT();
        java.util.Set<java.lang.String> strSet3 = mongoDBRiverDefinition1.parentTypes;
        boolean boolean4 = mongoDBRiverDefinition1.isStoreStatistics();
        boolean boolean5 = mongoDBRiverDefinition1.dropCollection;
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter6 = null;
        mongoDBRiverDefinition1.serializedObjectSupporter = serializedObjectSupporter6;
        java.lang.String str8 = mongoDBRiverDefinition1.getSOCKET_TIMEOUT();
        java.lang.String str9 = mongoDBRiverDefinition1.getPASSWORD_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition1.getMongoAdminUser();
        boolean boolean11 = mongoDBRiverDefinition1.getskipInitialImport();
        java.lang.String str12 = mongoDBRiverDefinition1.getIS_MONGOS_FIELD();
        boolean boolean13 = mongoDBRiverDefinition1.isMongoGridFS();
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "index" + "'", str2, "index");
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "socket_timeout" + "'", str8, "socket_timeout");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "password" + "'", str9, "password");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "is_mongos" + "'", str12, "is_mongos");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder3.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = null;
        builder3.setmongoOplogFilter(basicDBObject6);
        builder3.statisticsIndexName = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder3.throttleSize((int) (short) 0);
        builder3.connectTimeout = 27017;
        builder3.setconnectTimeout((int) (short) 100);
        boolean boolean16 = builder3.getmongoGridFS();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        builder0.riverName = "concurrent_bulk_requests";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.connectTimeout((int) (byte) 10);
        org.bson.types.Binary binary8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.initialTimestamp(binary8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.disableIndexRefresh(false);
        java.lang.String str6 = builder5.getstatisticsTypeName();
        java.lang.String str7 = builder5.riverName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder5.socketTimeout(100);
        boolean boolean10 = builder9.mongoSSLVerifyCertificate;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder3.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = null;
        builder3.setmongoOplogFilter(basicDBObject6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean9 = builder8.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder8.script("bulk");
        builder11.skipInitialImport = false;
        builder11.setscriptType("script");
        java.lang.String[] strArray33 = new java.lang.String[] { "exclude_fields", "servers", "secondary_read_preference", "name", "exclude_fields", "bulk_timeout", "skip_initial_import", "bulk", "script", "disable_index_refresh", "script.default_lang", "skip_initial_import", "gridfs", "user", "port", "parent_types", "size" };
        java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder11.excludeFields((java.util.Set<java.lang.String>) strSet34);
        builder3.setexcludeFields((java.util.Set<java.lang.String>) strSet34);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder3.throttleSize(100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder3.riverIndexName("bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder3.importAllCollections(false);
        builder43.isMongos = true;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder3.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = null;
        builder3.setmongoOplogFilter(basicDBObject6);
        builder3.statisticsIndexName = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder3.throttleSize((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.throttleSize((int) (byte) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder11.mongoSSLVerifyCertificate(false);
        builder11.setimportAllCollections(true);
        boolean boolean18 = builder11.dropCollection;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.script("store_statistics");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.mongoSSLVerifyCertificate(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.isMongos((java.lang.Boolean) true);
        org.bson.types.Binary binary7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.initialTimestamp(binary7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("script_type", "disable_index_refresh");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?disable_index_refresh?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.lang.String str2 = mongoDBRiverDefinition1.getINDEX_OBJECT();
        java.util.Set<java.lang.String> strSet3 = mongoDBRiverDefinition1.parentTypes;
        java.lang.String str4 = mongoDBRiverDefinition1.riverName;
        java.lang.String str5 = mongoDBRiverDefinition1.getScriptType();
        int int6 = mongoDBRiverDefinition1.connectTimeout;
        java.util.Set<java.lang.String> strSet7 = mongoDBRiverDefinition1.excludeFields;
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "index" + "'", str2, "index");
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(strSet7);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        builder3.skipInitialImport = false;
        builder3.setscriptType("script");
        java.lang.String[] strArray25 = new java.lang.String[] { "exclude_fields", "servers", "secondary_read_preference", "name", "exclude_fields", "bulk_timeout", "skip_initial_import", "bulk", "script", "disable_index_refresh", "script.default_lang", "skip_initial_import", "gridfs", "user", "port", "parent_types", "size" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder3.excludeFields((java.util.Set<java.lang.String>) strSet26);
        builder3.setscript("local");
        java.util.Set<java.lang.String> strSet31 = builder3.getexcludeFields();
        java.lang.String str32 = builder3.typeName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder3.mongoCollection("mongodb-1638820217755");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.mongoSecondaryReadPreference(false);
        com.mongodb.MongoClientOptions mongoClientOptions37 = null;
        builder34.mongoClientOptions = mongoClientOptions37;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.lang.String str2 = mongoDBRiverDefinition1.getINDEX_OBJECT();
        java.util.Set<java.lang.String> strSet3 = mongoDBRiverDefinition1.parentTypes;
        boolean boolean4 = mongoDBRiverDefinition1.isStoreStatistics();
        boolean boolean5 = mongoDBRiverDefinition1.importAllCollections;
        java.lang.String str6 = mongoDBRiverDefinition1.mongoAdminPassword;
        com.mongodb.BasicDBObject basicDBObject7 = mongoDBRiverDefinition1.getMongoCollectionFilter();
        boolean boolean8 = mongoDBRiverDefinition1.mongoSecondaryReadPreference;
        java.lang.String str9 = mongoDBRiverDefinition1.mongoDb;
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "index" + "'", str2, "index");
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(basicDBObject7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("concurrent_requests", (java.lang.Object) (-1));
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean6 = builder5.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder5.script("bulk");
        com.mongodb.BasicDBObject basicDBObject9 = null;
        builder8.setmongoOplogFilter(basicDBObject9);
        docScoreSearchScript0.setNextVar("script_type", (java.lang.Object) basicDBObject9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean14 = builder13.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder13.script("bulk");
        com.mongodb.BasicDBObject basicDBObject17 = null;
        builder16.setmongoOplogFilter(basicDBObject17);
        com.mongodb.BasicDBObject basicDBObject19 = null;
        builder16.setmongoOplogFilter(basicDBObject19);
        builder16.statisticsIndexName = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder16.advancedTransformation(false);
        docScoreSearchScript0.setNextVar("mongodb-1638820218363", (java.lang.Object) builder24);
        org.apache.lucene.index.AtomicReaderContext atomicReaderContext26 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextReader(atomicReaderContext26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder24);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        java.lang.String str2 = builder0.getscript();
        boolean boolean3 = builder0.dropCollection;
        builder0.indexName = "";
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory6 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean8 = builder7.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder7.script("bulk");
        com.mongodb.BasicDBObject basicDBObject11 = builder10.getmongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript12 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject11);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder0.mongoOplogFilter(basicDBObject11);
        builder0.storeStatistics = true;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder0.mongoSSLVerifyCertificate(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder0.mongoDb("admin");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.mongoCollection("script.default_lang");
        java.util.Set<java.lang.String> strSet22 = builder21.parentTypes;
        boolean boolean23 = builder21.importAllCollections;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(basicDBObject11);
        org.junit.Assert.assertNotNull(executableScript12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNull(strSet22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList2 = mongoDBRiverDefinition1.mongoServers;
        org.elasticsearch.common.unit.TimeValue timeValue3 = mongoDBRiverDefinition1.getDEFAULT_FLUSH_INTERVAL();
        boolean boolean4 = mongoDBRiverDefinition1.dropCollection;
        boolean boolean5 = mongoDBRiverDefinition1.getmongoSecondaryReadPreference();
        int int6 = mongoDBRiverDefinition1.socketTimeout;
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertNotNull(serverAddressList2);
        org.junit.Assert.assertNotNull(timeValue3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList2 = mongoDBRiverDefinition1.mongoServers;
        org.elasticsearch.common.unit.TimeValue timeValue3 = mongoDBRiverDefinition1.getDEFAULT_FLUSH_INTERVAL();
        boolean boolean4 = mongoDBRiverDefinition1.dropCollection;
        boolean boolean5 = mongoDBRiverDefinition1.isMongoSecondaryReadPreference();
        java.lang.String str6 = mongoDBRiverDefinition1.getStatisticsTypeName();
        java.lang.String str7 = mongoDBRiverDefinition1.getMongoLocalPassword();
        java.lang.String str8 = mongoDBRiverDefinition1.getIndexName();
        boolean boolean9 = mongoDBRiverDefinition1.mongoUseSSL;
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = mongoDBRiverDefinition1.getInitialTimestamp();
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter11 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        mongoDBRiverDefinition1.serializedObjectSupporter = serializedObjectSupporter11;
        java.lang.String str13 = serializedObjectSupporter11.deserializeObjectString5();
        java.lang.String str14 = serializedObjectSupporter11.deserializeObjectString17();
        java.lang.String str15 = serializedObjectSupporter11.deserializeObjectString13();
        java.lang.String str16 = serializedObjectSupporter11.deserializeObjectString12();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = serializedObjectSupporter11.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertNotNull(serverAddressList2);
        org.junit.Assert.assertNotNull(timeValue3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "mongodb-1638820218299" + "'", str13, "mongodb-1638820218299");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "mongodb-1638820218449" + "'", str14, "mongodb-1638820218449");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "mongodb-1638820218408" + "'", str15, "mongodb-1638820218408");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_river" + "'", str16, "_river");
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder3.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = null;
        builder3.setmongoOplogFilter(basicDBObject6);
        builder3.statisticsIndexName = "socket_timeout";
        builder3.setriverName("store_statistics");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = builder3.getinitialTimestamp();
        builder3.mongoLocalPassword = "script";
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(wildcardTimestamp12);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.lang.String str2 = mongoDBRiverDefinition1.getINDEX_OBJECT();
        java.util.Set<java.lang.String> strSet3 = mongoDBRiverDefinition1.parentTypes;
        java.lang.String str4 = mongoDBRiverDefinition1.riverName;
        boolean boolean5 = mongoDBRiverDefinition1.getimportAllCollections();
        java.lang.String str6 = mongoDBRiverDefinition1.getSERVERS_FIELD();
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "index" + "'", str2, "index");
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "servers" + "'", str6, "servers");
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList2 = mongoDBRiverDefinition1.mongoServers;
        org.elasticsearch.common.unit.TimeValue timeValue3 = mongoDBRiverDefinition1.getDEFAULT_FLUSH_INTERVAL();
        java.lang.String str4 = mongoDBRiverDefinition1.getINDEX_OBJECT();
        java.lang.String str5 = mongoDBRiverDefinition1.getSSL_CONNECTION_FIELD();
        java.lang.String str6 = mongoDBRiverDefinition1.getPASSWORD_FIELD();
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertNotNull(serverAddressList2);
        org.junit.Assert.assertNotNull(timeValue3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "index" + "'", str4, "index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ssl" + "'", str5, "ssl");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "password" + "'", str6, "password");
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList2 = mongoDBRiverDefinition1.mongoServers;
        org.elasticsearch.common.unit.TimeValue timeValue3 = mongoDBRiverDefinition1.getDEFAULT_FLUSH_INTERVAL();
        java.lang.String str4 = mongoDBRiverDefinition1.getDISABLE_INDEX_REFRESH_FIELD();
        java.util.Set<java.lang.String> strSet5 = mongoDBRiverDefinition1.parentTypes;
        int int6 = mongoDBRiverDefinition1.throttleSize;
        java.lang.String str7 = mongoDBRiverDefinition1.statisticsIndexName;
        boolean boolean8 = mongoDBRiverDefinition1.isSkipInitialImport();
        java.lang.String str9 = mongoDBRiverDefinition1.getSSL_CONNECTION_FIELD();
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertNotNull(serverAddressList2);
        org.junit.Assert.assertNotNull(timeValue3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "disable_index_refresh" + "'", str4, "disable_index_refresh");
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ssl" + "'", str9, "ssl");
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean3 = builder2.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.script("bulk");
        builder2.riverName = "concurrent_bulk_requests";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder2.connectTimeout((int) (byte) 10);
        docScoreSearchScript0.setNextVar("port", (java.lang.Object) builder9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean12 = builder11.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder11.script("bulk");
        builder11.riverName = "concurrent_bulk_requests";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder11.connectTimeout((int) (byte) 10);
        java.lang.Object obj19 = docScoreSearchScript0.unwrap((java.lang.Object) builder18);
        docScoreSearchScript0.setNextScore((float) 8);
        org.apache.lucene.index.AtomicReaderContext atomicReaderContext22 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextReader(atomicReaderContext22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.disableIndexRefresh(false);
        java.lang.String str6 = builder5.getstatisticsTypeName();
        builder5.scriptType = "user";
        builder5.includeCollection = "include_fields";
        builder5.setmongoAdminUser(".scripts");
        builder5.setthrottleSize((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder3.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = null;
        builder3.setmongoOplogFilter(basicDBObject6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean9 = builder8.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder8.script("bulk");
        builder11.skipInitialImport = false;
        builder11.setscriptType("script");
        java.lang.String[] strArray33 = new java.lang.String[] { "exclude_fields", "servers", "secondary_read_preference", "name", "exclude_fields", "bulk_timeout", "skip_initial_import", "bulk", "script", "disable_index_refresh", "script.default_lang", "skip_initial_import", "gridfs", "user", "port", "parent_types", "size" };
        java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder11.excludeFields((java.util.Set<java.lang.String>) strSet34);
        builder3.setexcludeFields((java.util.Set<java.lang.String>) strSet34);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder3.throttleSize(100);
        builder39.script = "script";
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder39);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.elasticsearch.common.logging.ESLogger eSLogger0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.logger;
        org.junit.Assert.assertNotNull(eSLogger0);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder3.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = null;
        builder3.setmongoOplogFilter(basicDBObject6);
        builder3.statisticsIndexName = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder3.throttleSize((int) (short) 0);
        boolean boolean12 = builder11.mongoSSLVerifyCertificate;
        com.mongodb.MongoClientOptions mongoClientOptions13 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder11.mongoClientOptions(mongoClientOptions13);
        builder14.setmongoSSLVerifyCertificate(false);
        org.bson.types.BSONTimestamp bSONTimestamp17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder14.initialTimestamp(bSONTimestamp17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ts must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString7();
        org.elasticsearch.river.RiverSettings riverSettings2 = serializedObjectSupporter0.deserializeObjectRiverSettings6();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        org.elasticsearch.river.RiverSettings riverSettings4 = serializedObjectSupporter0.deserializeObjectRiverSettings9();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString10();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb-1638820218326" + "'", str1, "mongodb-1638820218326");
        org.junit.Assert.assertNotNull(riverSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "mongodb-1638820217755" + "'", str3, "mongodb-1638820217755");
        org.junit.Assert.assertNotNull(riverSettings4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_river" + "'", str5, "_river");
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("options", "drop_collection");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?drop_collection?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean3 = builder2.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.script("bulk");
        builder2.riverName = "concurrent_bulk_requests";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder2.connectTimeout((int) (byte) 10);
        docScoreSearchScript0.setNextVar("port", (java.lang.Object) builder9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean12 = builder11.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder11.script("bulk");
        builder11.riverName = "concurrent_bulk_requests";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder11.connectTimeout((int) (byte) 10);
        java.lang.Object obj19 = docScoreSearchScript0.unwrap((java.lang.Object) builder18);
        org.apache.lucene.index.AtomicReaderContext atomicReaderContext20 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextReader(atomicReaderContext20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString7();
        org.elasticsearch.river.RiverSettings riverSettings2 = serializedObjectSupporter0.deserializeObjectRiverSettings6();
        org.elasticsearch.common.settings.Settings settings3 = riverSettings2.globalSettings();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean5 = builder4.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder4.script("bulk");
        com.mongodb.BasicDBObject basicDBObject8 = null;
        builder7.setmongoOplogFilter(basicDBObject8);
        com.mongodb.BasicDBObject basicDBObject10 = null;
        builder7.setmongoOplogFilter(basicDBObject10);
        builder7.statisticsIndexName = "socket_timeout";
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = builder7.initialTimestamp;
        com.mongodb.BasicDBObject basicDBObject15 = builder7.mongoCollectionFilter;
        org.elasticsearch.river.RiverSettings riverSettings16 = new org.elasticsearch.river.RiverSettings(settings3, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject15);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean18 = builder17.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder17.script("bulk");
        com.mongodb.BasicDBObject basicDBObject21 = null;
        builder20.setmongoOplogFilter(basicDBObject21);
        com.mongodb.BasicDBObject basicDBObject23 = null;
        builder20.setmongoOplogFilter(basicDBObject23);
        builder20.statisticsIndexName = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder20.throttleSize((int) (short) 0);
        builder20.mongoLocalPassword = "script.disable_dynamic";
        java.lang.String str31 = builder20.getmongoCollection();
        boolean boolean32 = builder20.mongoSSLVerifyCertificate;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean34 = builder33.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder33.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder33.disableIndexRefresh(false);
        java.lang.String str39 = builder38.getstatisticsTypeName();
        java.lang.String str40 = builder38.riverName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean42 = builder41.getdropCollection();
        java.lang.String str43 = builder41.getscript();
        boolean boolean44 = builder41.dropCollection;
        builder41.indexName = "";
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory47 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean49 = builder48.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder48.script("bulk");
        com.mongodb.BasicDBObject basicDBObject52 = builder51.getmongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript53 = docScoreNativeScriptFactory47.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject52);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder41.mongoOplogFilter(basicDBObject52);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder38.mongoCollectionFilter(basicDBObject52);
        builder20.setmongoOplogFilter(basicDBObject52);
        org.elasticsearch.river.RiverSettings riverSettings57 = new org.elasticsearch.river.RiverSettings(settings3, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject52);
        org.elasticsearch.env.Environment environment58 = null;
        org.elasticsearch.script.ScriptEngineService[] scriptEngineServiceArray59 = new org.elasticsearch.script.ScriptEngineService[] {};
        java.util.LinkedHashSet<org.elasticsearch.script.ScriptEngineService> scriptEngineServiceSet60 = new java.util.LinkedHashSet<org.elasticsearch.script.ScriptEngineService>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<org.elasticsearch.script.ScriptEngineService>) scriptEngineServiceSet60, scriptEngineServiceArray59);
        org.elasticsearch.watcher.ResourceWatcherService resourceWatcherService62 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.script.ScriptService scriptService63 = new org.elasticsearch.script.ScriptService(settings3, environment58, (java.util.Set<org.elasticsearch.script.ScriptEngineService>) scriptEngineServiceSet60, resourceWatcherService62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb-1638820218326" + "'", str1, "mongodb-1638820218326");
        org.junit.Assert.assertNotNull(riverSettings2);
        org.junit.Assert.assertNotNull(settings3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(wildcardTimestamp14);
        org.junit.Assert.assertNotNull(basicDBObject15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(basicDBObject52);
        org.junit.Assert.assertNotNull(executableScript53);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(scriptEngineServiceArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("concurrent_requests", (java.lang.Object) (-1));
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean6 = builder5.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder5.script("bulk");
        com.mongodb.BasicDBObject basicDBObject9 = null;
        builder8.setmongoOplogFilter(basicDBObject9);
        docScoreSearchScript0.setNextVar("script_type", (java.lang.Object) basicDBObject9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean14 = builder13.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder13.script("bulk");
        com.mongodb.BasicDBObject basicDBObject17 = null;
        builder16.setmongoOplogFilter(basicDBObject17);
        com.mongodb.BasicDBObject basicDBObject19 = null;
        builder16.setmongoOplogFilter(basicDBObject19);
        builder16.statisticsIndexName = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder16.advancedTransformation(false);
        docScoreSearchScript0.setNextVar("mongodb-1638820218363", (java.lang.Object) builder24);
        org.apache.lucene.search.Scorer scorer26 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setScorer(scorer26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder24);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings1 = serializedObjectSupporter0.deserializeObjectRiverSettings4();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(riverSettings1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mongodb-1638820218299" + "'", str2, "mongodb-1638820218299");
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList2 = mongoDBRiverDefinition1.mongoServers;
        org.elasticsearch.common.unit.TimeValue timeValue3 = mongoDBRiverDefinition1.getDEFAULT_FLUSH_INTERVAL();
        java.lang.String str4 = mongoDBRiverDefinition1.getDISABLE_INDEX_REFRESH_FIELD();
        java.util.Set<java.lang.String> strSet5 = mongoDBRiverDefinition1.parentTypes;
        int int6 = mongoDBRiverDefinition1.throttleSize;
        java.lang.String str7 = mongoDBRiverDefinition1.getMongoCollection();
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertNotNull(serverAddressList2);
        org.junit.Assert.assertNotNull(timeValue3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "disable_index_refresh" + "'", str4, "disable_index_refresh");
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("concurrent_requests", (java.lang.Object) (-1));
        docScoreSearchScript0.setNextVar("skip_initial_import", (java.lang.Object) 100);
        org.apache.lucene.search.Scorer scorer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setScorer(scorer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList2 = mongoDBRiverDefinition1.mongoServers;
        org.elasticsearch.common.unit.TimeValue timeValue3 = mongoDBRiverDefinition1.getDEFAULT_FLUSH_INTERVAL();
        boolean boolean4 = mongoDBRiverDefinition1.dropCollection;
        boolean boolean5 = mongoDBRiverDefinition1.isMongoSecondaryReadPreference();
        java.lang.String str6 = mongoDBRiverDefinition1.getStatisticsTypeName();
        java.lang.String str7 = mongoDBRiverDefinition1.getMongoLocalPassword();
        java.lang.String str8 = mongoDBRiverDefinition1.getIndexName();
        boolean boolean9 = mongoDBRiverDefinition1.mongoUseSSL;
        java.lang.String str10 = mongoDBRiverDefinition1.getSOCKET_TIMEOUT();
        boolean boolean11 = mongoDBRiverDefinition1.getmongoSecondaryReadPreference();
        java.lang.String str12 = mongoDBRiverDefinition1.mongoCollection;
        boolean boolean13 = mongoDBRiverDefinition1.getmongoGridFS();
        java.lang.Class<?> wildcardClass14 = mongoDBRiverDefinition1.getClass();
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertNotNull(serverAddressList2);
        org.junit.Assert.assertNotNull(timeValue3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "socket_timeout" + "'", str10, "socket_timeout");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.script("store_statistics");
        java.lang.String str3 = builder0.getscript();
        java.lang.String str4 = builder0.getstatisticsTypeName();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = builder0.getinitialTimestamp();
        java.lang.String str6 = builder0.getmongoLocalPassword();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "store_statistics" + "'", str3, "store_statistics");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString7();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString17();
        org.elasticsearch.river.RiverSettings riverSettings3 = serializedObjectSupporter0.deserializeObjectRiverSettings6();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString10();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString4();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb-1638820218326" + "'", str1, "mongodb-1638820218326");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mongodb-1638820218449" + "'", str2, "mongodb-1638820218449");
        org.junit.Assert.assertNotNull(riverSettings3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb-1638820218299" + "'", str4, "mongodb-1638820218299");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_river" + "'", str5, "_river");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_river" + "'", str6, "_river");
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.disableIndexRefresh(false);
        java.lang.String str6 = builder5.getstatisticsTypeName();
        builder5.storeStatistics = false;
        builder5.setadvancedTransformation(false);
        java.lang.String str11 = builder5.mongoDb;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder3.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = null;
        builder3.setmongoOplogFilter(basicDBObject6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean9 = builder8.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder8.script("bulk");
        builder11.skipInitialImport = false;
        builder11.setscriptType("script");
        java.lang.String[] strArray33 = new java.lang.String[] { "exclude_fields", "servers", "secondary_read_preference", "name", "exclude_fields", "bulk_timeout", "skip_initial_import", "bulk", "script", "disable_index_refresh", "script.default_lang", "skip_initial_import", "gridfs", "user", "port", "parent_types", "size" };
        java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder11.excludeFields((java.util.Set<java.lang.String>) strSet34);
        builder3.setexcludeFields((java.util.Set<java.lang.String>) strSet34);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder3.throttleSize(100);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter40 = null;
        builder39.serializedObjectSupporter = serializedObjectSupporter40;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder39.mongoGridFS(true);
        builder43.setmongoLocalPassword("sandbox");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder43);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString4();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString15();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString17();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString12();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_river" + "'", str1, "_river");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mongodb-1638820218424" + "'", str2, "mongodb-1638820218424");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "mongodb-1638820217755" + "'", str3, "mongodb-1638820217755");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb-1638820218449" + "'", str4, "mongodb-1638820218449");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_river" + "'", str5, "_river");
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList2 = mongoDBRiverDefinition1.mongoServers;
        java.lang.String str3 = mongoDBRiverDefinition1.getBULK_TIMEOUT_FIELD();
        java.util.Set<java.lang.String> strSet4 = mongoDBRiverDefinition1.getParentTypes();
        java.lang.String str5 = mongoDBRiverDefinition1.getFILTER_FIELD();
        com.mongodb.BasicDBObject basicDBObject6 = mongoDBRiverDefinition1.getMongoOplogFilter();
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertNotNull(serverAddressList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "bulk_timeout" + "'", str3, "bulk_timeout");
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "filter" + "'", str5, "filter");
        org.junit.Assert.assertNull(basicDBObject6);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.disableIndexRefresh(false);
        java.lang.String str6 = builder5.getstatisticsTypeName();
        java.util.Set<java.lang.String> strSet7 = builder5.excludeFields;
        java.lang.String str8 = builder5.mongoLocalUser;
        builder5.setimportAllCollections(false);
        java.lang.String str11 = builder5.getmongoLocalPassword();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        java.lang.String str2 = builder0.getscript();
        boolean boolean3 = builder0.dropCollection;
        builder0.indexName = "";
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory6 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean8 = builder7.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder7.script("bulk");
        com.mongodb.BasicDBObject basicDBObject11 = builder10.getmongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript12 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject11);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder0.mongoOplogFilter(basicDBObject11);
        builder0.storeStatistics = true;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder0.mongoSSLVerifyCertificate(false);
        com.mongodb.BasicDBObject basicDBObject18 = builder17.mongoOplogFilter;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder17.socketTimeout((int) (byte) 0);
        com.mongodb.BasicDBObject basicDBObject21 = builder20.mongoOplogFilter;
        org.bson.types.Binary binary22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder20.initialTimestamp(binary22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(basicDBObject11);
        org.junit.Assert.assertNotNull(executableScript12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(basicDBObject18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(basicDBObject21);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList2 = mongoDBRiverDefinition1.mongoServers;
        org.elasticsearch.common.unit.TimeValue timeValue3 = mongoDBRiverDefinition1.getDEFAULT_FLUSH_INTERVAL();
        boolean boolean4 = mongoDBRiverDefinition1.dropCollection;
        boolean boolean5 = mongoDBRiverDefinition1.getmongoSecondaryReadPreference();
        boolean boolean6 = mongoDBRiverDefinition1.isMongoSecondaryReadPreference();
        int int7 = mongoDBRiverDefinition1.getDEFAULT_DB_PORT();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = mongoDBRiverDefinition1.getInitialTimestamp();
        boolean boolean9 = mongoDBRiverDefinition1.isImportAllCollections();
        org.elasticsearch.common.unit.TimeValue timeValue10 = mongoDBRiverDefinition1.getDEFAULT_FLUSH_INTERVAL();
        java.lang.String str11 = mongoDBRiverDefinition1.getPASSWORD_FIELD();
        java.lang.String str12 = mongoDBRiverDefinition1.getINITIAL_TIMESTAMP_SCRIPT_FIELD();
        com.mongodb.BasicDBObject basicDBObject13 = mongoDBRiverDefinition1.mongoOplogFilter;
        int int14 = mongoDBRiverDefinition1.getDEFAULT_CONCURRENT_REQUESTS();
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertNotNull(serverAddressList2);
        org.junit.Assert.assertNotNull(timeValue3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 27017 + "'", int7 == 27017);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(timeValue10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "password" + "'", str11, "password");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "script" + "'", str12, "script");
        org.junit.Assert.assertNull(basicDBObject13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.disableIndexRefresh(false);
        builder5.setthrottleSize((int) ' ');
        boolean boolean8 = builder5.getadvancedTransformation();
        builder5.setsocketTimeout((int) (short) -1);
        boolean boolean11 = builder5.mongoUseSSL;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean3 = builder2.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.script("bulk");
        builder2.riverName = "concurrent_bulk_requests";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder2.connectTimeout((int) (byte) 10);
        docScoreSearchScript0.setNextVar("port", (java.lang.Object) builder9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean12 = builder11.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder11.script("bulk");
        builder11.riverName = "concurrent_bulk_requests";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder11.connectTimeout((int) (byte) 10);
        java.lang.Object obj19 = docScoreSearchScript0.unwrap((java.lang.Object) builder18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean21 = builder20.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder20.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder20.disableIndexRefresh(false);
        java.lang.String str26 = builder25.getstatisticsTypeName();
        java.util.Set<java.lang.String> strSet27 = builder25.excludeFields;
        java.lang.Object obj28 = docScoreSearchScript0.unwrap((java.lang.Object) strSet27);
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextDocId((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(strSet27);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder3.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = null;
        builder3.setmongoOplogFilter(basicDBObject6);
        boolean boolean8 = builder3.mongoGridFS;
        builder3.setindexName("initial_timestamp");
        boolean boolean11 = builder3.advancedTransformation;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean13 = builder12.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder12.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder12.disableIndexRefresh(false);
        java.lang.String str18 = builder17.getstatisticsTypeName();
        java.lang.String str19 = builder17.riverName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder17.mongoAdminPassword("size");
        builder21.setmongoCollection("advanced_transformation");
        boolean boolean24 = builder21.getdropCollection();
        boolean boolean25 = builder21.getmongoSecondaryReadPreference();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.util.Set<java.lang.String> strSet27 = builder26.getexcludeFields();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder26.mongoLocalUser("credentials");
        java.lang.String str30 = builder29.script;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean32 = builder31.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder31.script("bulk");
        com.mongodb.BasicDBObject basicDBObject35 = null;
        builder34.setmongoOplogFilter(basicDBObject35);
        com.mongodb.BasicDBObject basicDBObject37 = null;
        builder34.setmongoOplogFilter(basicDBObject37);
        builder34.statisticsIndexName = "socket_timeout";
        builder34.setconnectTimeout((int) (byte) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean44 = builder43.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder43.script("bulk");
        com.mongodb.BasicDBObject basicDBObject47 = null;
        builder46.setmongoOplogFilter(basicDBObject47);
        com.mongodb.BasicDBObject basicDBObject49 = null;
        builder46.setmongoOplogFilter(basicDBObject49);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean52 = builder51.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder51.script("bulk");
        builder54.skipInitialImport = false;
        builder54.setscriptType("script");
        java.lang.String[] strArray76 = new java.lang.String[] { "exclude_fields", "servers", "secondary_read_preference", "name", "exclude_fields", "bulk_timeout", "skip_initial_import", "bulk", "script", "disable_index_refresh", "script.default_lang", "skip_initial_import", "gridfs", "user", "port", "parent_types", "size" };
        java.util.LinkedHashSet<java.lang.String> strSet77 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet77, strArray76);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder79 = builder54.excludeFields((java.util.Set<java.lang.String>) strSet77);
        builder46.setexcludeFields((java.util.Set<java.lang.String>) strSet77);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder81 = builder34.includeFields((java.util.Set<java.lang.String>) strSet77);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder82 = builder29.excludeFields((java.util.Set<java.lang.String>) strSet77);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder83 = builder21.excludeFields((java.util.Set<java.lang.String>) strSet77);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder84 = builder3.parentTypes((java.util.Set<java.lang.String>) strSet77);
        org.bson.types.Binary binary85 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder86 = builder84.initialTimestamp(binary85);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(strSet27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(builder79);
        org.junit.Assert.assertNotNull(builder81);
        org.junit.Assert.assertNotNull(builder82);
        org.junit.Assert.assertNotNull(builder83);
        org.junit.Assert.assertNotNull(builder84);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList2 = mongoDBRiverDefinition1.mongoServers;
        org.elasticsearch.common.unit.TimeValue timeValue3 = mongoDBRiverDefinition1.getDEFAULT_FLUSH_INTERVAL();
        boolean boolean4 = mongoDBRiverDefinition1.dropCollection;
        boolean boolean5 = mongoDBRiverDefinition1.getmongoSecondaryReadPreference();
        boolean boolean6 = mongoDBRiverDefinition1.isMongoSecondaryReadPreference();
        int int7 = mongoDBRiverDefinition1.getDEFAULT_DB_PORT();
        java.lang.String str8 = mongoDBRiverDefinition1.getBULK_TIMEOUT_FIELD();
        int int9 = mongoDBRiverDefinition1.getDEFAULT_CONCURRENT_REQUESTS();
        com.mongodb.BasicDBObject basicDBObject10 = mongoDBRiverDefinition1.mongoCollectionFilter;
        java.lang.String str11 = mongoDBRiverDefinition1.getBULK_SIZE_FIELD();
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertNotNull(serverAddressList2);
        org.junit.Assert.assertNotNull(timeValue3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 27017 + "'", int7 == 27017);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "bulk_timeout" + "'", str8, "bulk_timeout");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertNotNull(basicDBObject10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "bulk_size" + "'", str11, "bulk_size");
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder3.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = null;
        builder3.setmongoOplogFilter(basicDBObject6);
        builder3.statisticsIndexName = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder3.throttleSize((int) (short) 0);
        builder3.connectTimeout = 27017;
        builder3.setconnectTimeout((int) (short) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean17 = builder16.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder16.script("bulk");
        com.mongodb.BasicDBObject basicDBObject20 = null;
        builder19.setmongoOplogFilter(basicDBObject20);
        com.mongodb.BasicDBObject basicDBObject22 = null;
        builder19.setmongoOplogFilter(basicDBObject22);
        boolean boolean24 = builder19.mongoGridFS;
        java.lang.String[] strArray67 = new java.lang.String[] { "credentials", "script.default_lang", "admin", "servers", "bulk", "script_type", "filter", "drop_collection", "local", "options", "store_statistics", "import_all_collections", "", "user", "secondary_read_preference", "actions", "concurrent_requests", "exclude_fields", "script_type", "exclude_fields", "socket_timeout", "admin", "filter", "user", "throttle_size", "bulk_timeout", "name", "local", "local", "skip_initial_import", "filter", ".scripts", "store_statistics", "concurrent_requests", "gridfs", "collection", "password", "script_type", "socket_timeout", "ssl_verify_certificate", "store_statistics", "size" };
        java.util.LinkedHashSet<java.lang.String> strSet68 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet68, strArray67);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder70 = builder19.includeFields((java.util.Set<java.lang.String>) strSet68);
        builder3.setexcludeFields((java.util.Set<java.lang.String>) strSet68);
        java.lang.String str72 = builder3.indexName;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertNull(str72);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean3 = builder2.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.script("bulk");
        builder2.riverName = "concurrent_bulk_requests";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder2.connectTimeout((int) (byte) 10);
        docScoreSearchScript0.setNextVar("port", (java.lang.Object) builder9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean12 = builder11.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder11.script("bulk");
        builder11.riverName = "concurrent_bulk_requests";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder11.connectTimeout((int) (byte) 10);
        java.lang.Object obj19 = docScoreSearchScript0.unwrap((java.lang.Object) builder18);
        docScoreSearchScript0.setNextScore((float) 8);
        org.apache.lucene.search.Scorer scorer22 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setScorer(scorer22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("port");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?port?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("localhost", "sandbox", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?sandbox?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("skip_initial_import");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?skip_initial_import?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.disableIndexRefresh(false);
        java.lang.String str6 = builder5.getstatisticsTypeName();
        builder5.scriptType = "user";
        builder5.includeCollection = "include_fields";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder5.importAllCollections(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder5.scriptType("gridfs");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder5.mongoAdminPassword("collection");
        builder5.mongoLocalUser = "local";
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList2 = mongoDBRiverDefinition1.mongoServers;
        java.lang.String str3 = mongoDBRiverDefinition1.getINITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD();
        boolean boolean4 = mongoDBRiverDefinition1.getmongoSecondaryReadPreference();
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertNotNull(serverAddressList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "script_type" + "'", str3, "script_type");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean3 = builder2.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.script("bulk");
        builder2.riverName = "concurrent_bulk_requests";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder2.connectTimeout((int) (byte) 10);
        docScoreSearchScript0.setNextVar("port", (java.lang.Object) builder9);
        org.apache.lucene.index.AtomicReaderContext atomicReaderContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextReader(atomicReaderContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder3.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = null;
        builder3.setmongoOplogFilter(basicDBObject6);
        builder3.statisticsIndexName = "socket_timeout";
        java.lang.String str10 = builder3.riverIndexName;
        builder3.setstoreStatistics(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder3.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = null;
        builder3.setmongoOplogFilter(basicDBObject6);
        builder3.statisticsIndexName = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder3.throttleSize((int) (short) 0);
        builder3.mongoLocalPassword = "script.disable_dynamic";
        java.lang.String str14 = builder3.getindexName();
        builder3.mongoUseSSL = true;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.disableIndexRefresh(false);
        java.lang.String str6 = builder5.getstatisticsTypeName();
        java.lang.String str7 = builder5.riverName;
        builder5.indexName = "script.default_lang";
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter10 = null;
        builder5.serializedObjectSupporter = serializedObjectSupporter10;
        java.lang.String str12 = builder5.getmongoLocalUser();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter2 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str3 = serializedObjectSupporter2.deserializeObjectString7();
        org.elasticsearch.river.RiverSettings riverSettings4 = serializedObjectSupporter2.deserializeObjectRiverSettings6();
        org.elasticsearch.common.settings.Settings settings5 = riverSettings4.globalSettings();
        org.elasticsearch.script.ScriptService scriptService6 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("include_fields", "script", riverSettings4, scriptService6);
        java.lang.String str8 = mongoDBRiverDefinition7.getADVANCED_TRANSFORMATION_FIELD();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "mongodb-1638820218326" + "'", str3, "mongodb-1638820218326");
        org.junit.Assert.assertNotNull(riverSettings4);
        org.junit.Assert.assertNotNull(settings5);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "advanced_transformation" + "'", str8, "advanced_transformation");
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.lang.String str2 = mongoDBRiverDefinition1.getINDEX_OBJECT();
        java.util.Set<java.lang.String> strSet3 = mongoDBRiverDefinition1.parentTypes;
        java.lang.String str4 = mongoDBRiverDefinition1.riverName;
        boolean boolean5 = mongoDBRiverDefinition1.disableIndexRefresh;
        java.lang.String str6 = mongoDBRiverDefinition1.mongoLocalPassword;
        java.lang.String str7 = mongoDBRiverDefinition1.getINITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD();
        boolean boolean8 = mongoDBRiverDefinition1.isDropCollection();
        java.lang.String str9 = mongoDBRiverDefinition1.getRiverName();
        java.lang.String str10 = mongoDBRiverDefinition1.getSERVERS_FIELD();
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "index" + "'", str2, "index");
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "script_type" + "'", str7, "script_type");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "servers" + "'", str10, "servers");
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("mongodb-1638820218424", "port");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?port?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        com.mongodb.BasicDBObject basicDBObject4 = builder3.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = builder3.getinitialTimestamp();
        builder3.mongoUseSSL = true;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.lang.String str2 = mongoDBRiverDefinition1.getINDEX_OBJECT();
        java.util.Set<java.lang.String> strSet3 = mongoDBRiverDefinition1.parentTypes;
        boolean boolean4 = mongoDBRiverDefinition1.isStoreStatistics();
        boolean boolean5 = mongoDBRiverDefinition1.importAllCollections;
        java.lang.String str6 = mongoDBRiverDefinition1.mongoAdminPassword;
        com.mongodb.BasicDBObject basicDBObject7 = mongoDBRiverDefinition1.getMongoCollectionFilter();
        java.lang.String str8 = mongoDBRiverDefinition1.getINITIAL_TIMESTAMP_FIELD();
        java.lang.String str9 = mongoDBRiverDefinition1.getTypeName();
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "index" + "'", str2, "index");
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(basicDBObject7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "initial_timestamp" + "'", str8, "initial_timestamp");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString18();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_river" + "'", str1, "_river");
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString7();
        org.elasticsearch.river.RiverSettings riverSettings2 = serializedObjectSupporter0.deserializeObjectRiverSettings6();
        org.elasticsearch.common.settings.Settings settings3 = riverSettings2.globalSettings();
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory4 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter5 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str6 = serializedObjectSupporter5.deserializeObjectString4();
        org.elasticsearch.river.RiverSettings riverSettings7 = serializedObjectSupporter5.deserializeObjectRiverSettings3();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = riverSettings7.settings();
        org.elasticsearch.script.ExecutableScript executableScript9 = docScoreNativeScriptFactory4.newScript(strMap8);
        org.elasticsearch.river.RiverSettings riverSettings10 = new org.elasticsearch.river.RiverSettings(settings3, strMap8);
        org.elasticsearch.env.Environment environment11 = null;
        org.elasticsearch.script.ScriptEngineService[] scriptEngineServiceArray12 = new org.elasticsearch.script.ScriptEngineService[] {};
        java.util.LinkedHashSet<org.elasticsearch.script.ScriptEngineService> scriptEngineServiceSet13 = new java.util.LinkedHashSet<org.elasticsearch.script.ScriptEngineService>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.elasticsearch.script.ScriptEngineService>) scriptEngineServiceSet13, scriptEngineServiceArray12);
        org.elasticsearch.watcher.ResourceWatcherService resourceWatcherService15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.script.ScriptService scriptService16 = new org.elasticsearch.script.ScriptService(settings3, environment11, (java.util.Set<org.elasticsearch.script.ScriptEngineService>) scriptEngineServiceSet13, resourceWatcherService15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb-1638820218326" + "'", str1, "mongodb-1638820218326");
        org.junit.Assert.assertNotNull(riverSettings2);
        org.junit.Assert.assertNotNull(settings3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_river" + "'", str6, "_river");
        org.junit.Assert.assertNotNull(riverSettings7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(executableScript9);
        org.junit.Assert.assertNotNull(scriptEngineServiceArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder3.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = null;
        builder3.setmongoOplogFilter(basicDBObject6);
        builder3.statisticsIndexName = "socket_timeout";
        java.lang.String str10 = builder3.riverIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder3.skipInitialImport(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory13 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean15 = builder14.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder14.script("bulk");
        com.mongodb.BasicDBObject basicDBObject18 = builder17.getmongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript19 = docScoreNativeScriptFactory13.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder3.mongoCollectionFilter(basicDBObject18);
        java.lang.Boolean boolean21 = builder3.getisMongos();
        builder3.setriverIndexName("mongodb-1638820218326");
        builder3.importAllCollections = true;
        builder3.advancedTransformation = true;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(basicDBObject18);
        org.junit.Assert.assertNotNull(executableScript19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNull(boolean21);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder3.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = null;
        builder3.setmongoOplogFilter(basicDBObject6);
        builder3.statisticsIndexName = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder3.throttleSize((int) (short) 0);
        boolean boolean12 = builder11.getmongoUseSSL();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder11.mongoLocalUser("mongodb-1638820218299");
        builder11.statisticsIndexName = "index";
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder3.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = null;
        builder3.setmongoOplogFilter(basicDBObject6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder3.riverIndexName("socket_timeout");
        builder3.setriverName("sandbox");
        builder3.connectTimeout = 'a';
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder3.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = null;
        builder3.setmongoOplogFilter(basicDBObject6);
        builder3.statisticsIndexName = "socket_timeout";
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = builder3.initialTimestamp;
        builder3.setmongoAdminUser("bulk");
        org.bson.types.BSONTimestamp bSONTimestamp13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder3.initialTimestamp(bSONTimestamp13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ts must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(wildcardTimestamp10);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.script("store_statistics");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.mongoSSLVerifyCertificate(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.storeStatistics(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.statisticsTypeName("");
        java.lang.String str11 = builder10.getriverName();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.util.Set<java.lang.String> strSet1 = builder0.getexcludeFields();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.mongoLocalUser("credentials");
        java.lang.String str4 = builder3.script;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean6 = builder5.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder5.script("bulk");
        com.mongodb.BasicDBObject basicDBObject9 = null;
        builder8.setmongoOplogFilter(basicDBObject9);
        com.mongodb.BasicDBObject basicDBObject11 = null;
        builder8.setmongoOplogFilter(basicDBObject11);
        builder8.statisticsIndexName = "socket_timeout";
        builder8.setconnectTimeout((int) (byte) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean18 = builder17.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder17.script("bulk");
        com.mongodb.BasicDBObject basicDBObject21 = null;
        builder20.setmongoOplogFilter(basicDBObject21);
        com.mongodb.BasicDBObject basicDBObject23 = null;
        builder20.setmongoOplogFilter(basicDBObject23);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean26 = builder25.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder25.script("bulk");
        builder28.skipInitialImport = false;
        builder28.setscriptType("script");
        java.lang.String[] strArray50 = new java.lang.String[] { "exclude_fields", "servers", "secondary_read_preference", "name", "exclude_fields", "bulk_timeout", "skip_initial_import", "bulk", "script", "disable_index_refresh", "script.default_lang", "skip_initial_import", "gridfs", "user", "port", "parent_types", "size" };
        java.util.LinkedHashSet<java.lang.String> strSet51 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet51, strArray50);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder28.excludeFields((java.util.Set<java.lang.String>) strSet51);
        builder20.setexcludeFields((java.util.Set<java.lang.String>) strSet51);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder8.includeFields((java.util.Set<java.lang.String>) strSet51);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder3.excludeFields((java.util.Set<java.lang.String>) strSet51);
        java.lang.Boolean boolean57 = builder56.getisMongos();
        java.util.Set<java.lang.String> strSet58 = builder56.getincludeFields();
        org.junit.Assert.assertNull(strSet1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNull(boolean57);
        org.junit.Assert.assertNull(strSet58);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList2 = mongoDBRiverDefinition1.mongoServers;
        org.elasticsearch.common.unit.TimeValue timeValue3 = mongoDBRiverDefinition1.getDEFAULT_FLUSH_INTERVAL();
        boolean boolean4 = mongoDBRiverDefinition1.dropCollection;
        java.lang.String str5 = mongoDBRiverDefinition1.getDB_FIELD();
        java.lang.String str6 = mongoDBRiverDefinition1.getMongoCollection();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue7 = mongoDBRiverDefinition1.getDEFAULT_BULK_SIZE();
        boolean boolean8 = mongoDBRiverDefinition1.importAllCollections;
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertNotNull(serverAddressList2);
        org.junit.Assert.assertNotNull(timeValue3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "db" + "'", str5, "db");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(byteSizeValue7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.script("store_statistics");
        builder2.socketTimeout = (byte) -1;
        com.mongodb.BasicDBObject basicDBObject5 = null;
        builder2.mongoOplogFilter = basicDBObject5;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder2.storeStatistics(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.riverIndexName("throttle_size");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString7();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString17();
        org.elasticsearch.river.RiverSettings riverSettings3 = serializedObjectSupporter0.deserializeObjectRiverSettings6();
        org.elasticsearch.river.RiverSettings riverSettings4 = serializedObjectSupporter0.deserializeObjectRiverSettings9();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString16();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb-1638820218326" + "'", str1, "mongodb-1638820218326");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mongodb-1638820218449" + "'", str2, "mongodb-1638820218449");
        org.junit.Assert.assertNotNull(riverSettings3);
        org.junit.Assert.assertNotNull(riverSettings4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_river" + "'", str5, "_river");
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.lang.String str2 = mongoDBRiverDefinition1.getINDEX_OBJECT();
        java.util.Set<java.lang.String> strSet3 = mongoDBRiverDefinition1.parentTypes;
        boolean boolean4 = mongoDBRiverDefinition1.isStoreStatistics();
        boolean boolean5 = mongoDBRiverDefinition1.dropCollection;
        java.lang.String str6 = mongoDBRiverDefinition1.getCOLLECTION_FIELD();
        int int7 = mongoDBRiverDefinition1.getDEFAULT_CONCURRENT_REQUESTS();
        java.lang.String str8 = mongoDBRiverDefinition1.mongoDb;
        java.lang.String str9 = mongoDBRiverDefinition1.getRiverIndexName();
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "index" + "'", str2, "index");
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "collection" + "'", str6, "collection");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("index", "gridfs");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?gridfs?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder3.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = null;
        builder3.setmongoOplogFilter(basicDBObject6);
        builder3.statisticsIndexName = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder3.throttleSize((int) (short) 0);
        builder3.mongoLocalPassword = "script.disable_dynamic";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder3.importAllCollections(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder3.mongoLocalUser("ssl_verify_certificate");
        java.lang.String str18 = builder3.mongoDb;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("throttle_size", "servers", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?servers?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.lang.String str2 = mongoDBRiverDefinition1.getINDEX_OBJECT();
        java.util.Set<java.lang.String> strSet3 = mongoDBRiverDefinition1.parentTypes;
        java.lang.String str4 = mongoDBRiverDefinition1.riverName;
        boolean boolean5 = mongoDBRiverDefinition1.disableIndexRefresh;
        java.lang.String str6 = mongoDBRiverDefinition1.riverIndexName;
        java.lang.String str7 = mongoDBRiverDefinition1.getRiverName();
        java.lang.String str8 = mongoDBRiverDefinition1.getUSER_FIELD();
        java.lang.String str9 = mongoDBRiverDefinition1.getSCRIPT_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition1.getCONCURRENT_REQUESTS_FIELD();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue11 = mongoDBRiverDefinition1.getDEFAULT_BULK_SIZE();
        java.lang.String str12 = mongoDBRiverDefinition1.getRiverIndexName();
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "index" + "'", str2, "index");
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "user" + "'", str8, "user");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "script" + "'", str9, "script");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "concurrent_requests" + "'", str10, "concurrent_requests");
        org.junit.Assert.assertNotNull(byteSizeValue11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString7();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString17();
        org.elasticsearch.river.RiverSettings riverSettings3 = serializedObjectSupporter0.deserializeObjectRiverSettings6();
        org.elasticsearch.river.RiverSettings riverSettings4 = serializedObjectSupporter0.deserializeObjectRiverSettings2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString9();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb-1638820218326" + "'", str1, "mongodb-1638820218326");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mongodb-1638820218449" + "'", str2, "mongodb-1638820218449");
        org.junit.Assert.assertNotNull(riverSettings3);
        org.junit.Assert.assertNotNull(riverSettings4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "mongodb-1638820217755" + "'", str5, "mongodb-1638820217755");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "mongodb-1638820218363" + "'", str6, "mongodb-1638820218363");
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList2 = mongoDBRiverDefinition1.mongoServers;
        org.elasticsearch.common.unit.TimeValue timeValue3 = mongoDBRiverDefinition1.getDEFAULT_FLUSH_INTERVAL();
        boolean boolean4 = mongoDBRiverDefinition1.dropCollection;
        boolean boolean5 = mongoDBRiverDefinition1.isMongoSecondaryReadPreference();
        java.lang.String str6 = mongoDBRiverDefinition1.getStatisticsTypeName();
        java.lang.String str7 = mongoDBRiverDefinition1.getMongoLocalPassword();
        boolean boolean8 = mongoDBRiverDefinition1.isMongoSSLVerifyCertificate();
        java.lang.String str9 = mongoDBRiverDefinition1.getEXCLUDE_FIELDS_FIELD();
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertNotNull(serverAddressList2);
        org.junit.Assert.assertNotNull(timeValue3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "exclude_fields" + "'", str9, "exclude_fields");
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder3.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = null;
        builder3.setmongoOplogFilter(basicDBObject6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean9 = builder8.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder8.script("bulk");
        builder11.skipInitialImport = false;
        builder11.setscriptType("script");
        java.lang.String[] strArray33 = new java.lang.String[] { "exclude_fields", "servers", "secondary_read_preference", "name", "exclude_fields", "bulk_timeout", "skip_initial_import", "bulk", "script", "disable_index_refresh", "script.default_lang", "skip_initial_import", "gridfs", "user", "port", "parent_types", "size" };
        java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder11.excludeFields((java.util.Set<java.lang.String>) strSet34);
        builder3.setexcludeFields((java.util.Set<java.lang.String>) strSet34);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder3.throttleSize(100);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory40 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean42 = builder41.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder41.script("bulk");
        com.mongodb.BasicDBObject basicDBObject45 = builder44.getmongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript46 = docScoreNativeScriptFactory40.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject45);
        builder3.mongoCollectionFilter = basicDBObject45;
        builder3.connectTimeout = (-1);
        builder3.setdropCollection(false);
        builder3.indexName = "host";
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(basicDBObject45);
        org.junit.Assert.assertNotNull(executableScript46);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.disableIndexRefresh(false);
        java.lang.String str6 = builder5.getstatisticsTypeName();
        builder5.scriptType = "user";
        builder5.includeCollection = "include_fields";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition12 = builder11.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList13 = mongoDBRiverDefinition12.mongoServers;
        org.elasticsearch.common.unit.TimeValue timeValue14 = mongoDBRiverDefinition12.getDEFAULT_FLUSH_INTERVAL();
        boolean boolean15 = mongoDBRiverDefinition12.dropCollection;
        boolean boolean16 = mongoDBRiverDefinition12.isMongoSecondaryReadPreference();
        java.lang.String str17 = mongoDBRiverDefinition12.getStatisticsTypeName();
        java.lang.String str18 = mongoDBRiverDefinition12.getMongoLocalPassword();
        java.lang.String str19 = mongoDBRiverDefinition12.getCONNECT_TIMEOUT();
        java.util.Set<java.lang.String> strSet20 = mongoDBRiverDefinition12.getExcludeFields();
        com.mongodb.BasicDBObject basicDBObject21 = mongoDBRiverDefinition12.mongoCollectionFilter;
        builder5.setmongoCollectionFilter(basicDBObject21);
        org.bson.types.Binary binary23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder5.initialTimestamp(binary23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition12);
        org.junit.Assert.assertNotNull(serverAddressList13);
        org.junit.Assert.assertNotNull(timeValue14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "connect_timeout" + "'", str19, "connect_timeout");
        org.junit.Assert.assertNull(strSet20);
        org.junit.Assert.assertNotNull(basicDBObject21);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.disableIndexRefresh(false);
        java.lang.String str6 = builder5.getstatisticsTypeName();
        builder5.scriptType = "user";
        builder5.includeCollection = "include_fields";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder5.importAllCollections(true);
        builder5.setscriptType("mongodb-1638820217755");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.disableIndexRefresh(false);
        java.lang.String str6 = builder5.getstatisticsTypeName();
        java.util.Set<java.lang.String> strSet7 = builder5.excludeFields;
        java.lang.String str8 = builder5.mongoLocalUser;
        builder5.setimportAllCollections(false);
        boolean boolean11 = builder5.advancedTransformation;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.disableIndexRefresh(false);
        java.lang.String str6 = builder5.getstatisticsTypeName();
        java.lang.String str7 = builder5.riverName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder5.mongoAdminPassword("size");
        java.lang.String str10 = builder5.mongoCollection;
        java.lang.String str11 = builder5.mongoDb;
        java.lang.String str12 = builder5.getmongoCollection();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder3.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = null;
        builder3.setmongoOplogFilter(basicDBObject6);
        builder3.statisticsIndexName = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder3.advancedTransformation(false);
        builder11.connectTimeout = '#';
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.disableIndexRefresh(false);
        java.lang.String str6 = builder5.getstatisticsTypeName();
        java.lang.String str7 = builder5.riverName;
        builder5.setimportAllCollections(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder5.connectTimeout(27017);
        java.lang.String str12 = builder11.mongoAdminUser;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder11.mongoAdminUser("localhost");
        org.bson.types.BSONTimestamp bSONTimestamp15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.initialTimestamp(bSONTimestamp15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ts must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.disableIndexRefresh(false);
        java.lang.String str6 = builder5.getstatisticsTypeName();
        java.lang.String str7 = builder5.riverName;
        int int8 = builder5.connectTimeout;
        java.lang.Boolean boolean9 = builder5.isMongos;
        java.lang.String str10 = builder5.mongoLocalPassword;
        org.bson.types.Binary binary11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder5.initialTimestamp(binary11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(boolean9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.disableIndexRefresh(false);
        java.lang.String str6 = builder5.getstatisticsTypeName();
        java.lang.String str7 = builder5.riverName;
        builder5.setimportAllCollections(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = builder10.build();
        com.mongodb.BasicDBObject basicDBObject12 = builder10.mongoCollectionFilter;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory13 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean15 = builder14.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder14.script("bulk");
        builder14.riverName = "concurrent_bulk_requests";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder14.connectTimeout((int) (byte) 10);
        builder21.setadvancedTransformation(false);
        java.util.Set<java.lang.String> strSet24 = builder21.getexcludeFields();
        com.mongodb.BasicDBObject basicDBObject25 = builder21.mongoCollectionFilter;
        org.elasticsearch.script.ExecutableScript executableScript26 = docScoreNativeScriptFactory13.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject25);
        builder10.setmongoOplogFilter(basicDBObject25);
        builder5.mongoCollectionFilter = basicDBObject25;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition11);
        org.junit.Assert.assertNotNull(basicDBObject12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNull(strSet24);
        org.junit.Assert.assertNotNull(basicDBObject25);
        org.junit.Assert.assertNotNull(executableScript26);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList2 = mongoDBRiverDefinition1.mongoServers;
        org.elasticsearch.common.unit.TimeValue timeValue3 = mongoDBRiverDefinition1.getDEFAULT_FLUSH_INTERVAL();
        boolean boolean4 = mongoDBRiverDefinition1.dropCollection;
        boolean boolean5 = mongoDBRiverDefinition1.isMongoSecondaryReadPreference();
        java.lang.String str6 = mongoDBRiverDefinition1.getStatisticsTypeName();
        java.lang.String str7 = mongoDBRiverDefinition1.getMongoLocalPassword();
        java.lang.String str8 = mongoDBRiverDefinition1.getIndexName();
        boolean boolean9 = mongoDBRiverDefinition1.mongoUseSSL;
        java.lang.String str10 = mongoDBRiverDefinition1.mongoLocalPassword;
        java.lang.String str11 = mongoDBRiverDefinition1.getINITIAL_TIMESTAMP_SCRIPT_FIELD();
        boolean boolean12 = mongoDBRiverDefinition1.disableIndexRefresh;
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertNotNull(serverAddressList2);
        org.junit.Assert.assertNotNull(timeValue3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "script" + "'", str11, "script");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.disableIndexRefresh(false);
        java.lang.String str6 = builder5.getstatisticsTypeName();
        java.lang.String str7 = builder5.riverName;
        builder5.indexName = "script.default_lang";
        int int10 = builder5.getthrottleSize();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.lang.String str2 = mongoDBRiverDefinition1.getINDEX_OBJECT();
        java.util.Set<java.lang.String> strSet3 = mongoDBRiverDefinition1.parentTypes;
        java.lang.String str4 = mongoDBRiverDefinition1.riverName;
        boolean boolean5 = mongoDBRiverDefinition1.getimportAllCollections();
        java.lang.String str6 = mongoDBRiverDefinition1.getBULK_TIMEOUT_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition1.getDROP_COLLECTION_FIELD();
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "index" + "'", str2, "index");
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "bulk_timeout" + "'", str6, "bulk_timeout");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "drop_collection" + "'", str7, "drop_collection");
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("_river", "host");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?host?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.disableIndexRefresh(false);
        java.lang.String str6 = builder5.getstatisticsTypeName();
        java.lang.String str7 = builder5.riverName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder5.socketTimeout(100);
        java.lang.String str10 = builder9.mongoLocalPassword;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("concurrent_requests", (java.lang.Object) (-1));
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean6 = builder5.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder5.script("bulk");
        com.mongodb.BasicDBObject basicDBObject9 = null;
        builder8.setmongoOplogFilter(basicDBObject9);
        docScoreSearchScript0.setNextVar("script_type", (java.lang.Object) basicDBObject9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean14 = builder13.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder13.script("bulk");
        com.mongodb.BasicDBObject basicDBObject17 = null;
        builder16.setmongoOplogFilter(basicDBObject17);
        com.mongodb.BasicDBObject basicDBObject19 = null;
        builder16.setmongoOplogFilter(basicDBObject19);
        builder16.statisticsIndexName = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder16.advancedTransformation(false);
        docScoreSearchScript0.setNextVar("mongodb-1638820218363", (java.lang.Object) builder24);
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextDocId((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder24);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("name", "concurrent_requests");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?concurrent_requests?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList2 = mongoDBRiverDefinition1.mongoServers;
        java.lang.String str3 = mongoDBRiverDefinition1.getINITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD();
        java.lang.String str4 = mongoDBRiverDefinition1.getADVANCED_TRANSFORMATION_FIELD();
        boolean boolean5 = mongoDBRiverDefinition1.storeStatistics;
        boolean boolean6 = mongoDBRiverDefinition1.advancedTransformation;
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertNotNull(serverAddressList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "script_type" + "'", str3, "script_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "advanced_transformation" + "'", str4, "advanced_transformation");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.elasticsearch.script.ScriptService.ScriptType scriptType0 = org.elasticsearch.script.ScriptService.ScriptType.INLINE;
        org.elasticsearch.common.io.stream.StreamOutput streamOutput1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.script.ScriptService.ScriptType.writeTo(scriptType0, streamOutput1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + scriptType0 + "' != '" + org.elasticsearch.script.ScriptService.ScriptType.INLINE + "'", scriptType0.equals(org.elasticsearch.script.ScriptService.ScriptType.INLINE));
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean2 = builder1.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder1.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder1.disableIndexRefresh(false);
        java.lang.Object obj7 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        org.apache.lucene.search.Scorer scorer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setScorer(scorer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + false + "'", obj7, false);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.disableIndexRefresh(false);
        java.lang.String str6 = builder5.getstatisticsTypeName();
        java.lang.String str7 = builder5.riverName;
        builder5.setimportAllCollections(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder5.connectTimeout(27017);
        boolean boolean12 = builder11.dropCollection;
        builder11.setmongoLocalUser("admin");
        builder11.setdropCollection(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder11.indexName("host");
        boolean boolean19 = builder11.mongoSSLVerifyCertificate;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder3.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = null;
        builder3.setmongoOplogFilter(basicDBObject6);
        builder3.statisticsIndexName = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder3.throttleSize((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.throttleSize((int) (byte) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder11.mongoSSLVerifyCertificate(false);
        builder11.setimportAllCollections(true);
        java.util.Set<java.lang.String> strSet18 = builder11.getincludeFields();
        builder11.mongoDb = "advanced_transformation";
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNull(strSet18);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder3.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = null;
        builder3.setmongoOplogFilter(basicDBObject6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean9 = builder8.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder8.script("bulk");
        builder11.skipInitialImport = false;
        builder11.setscriptType("script");
        java.lang.String[] strArray33 = new java.lang.String[] { "exclude_fields", "servers", "secondary_read_preference", "name", "exclude_fields", "bulk_timeout", "skip_initial_import", "bulk", "script", "disable_index_refresh", "script.default_lang", "skip_initial_import", "gridfs", "user", "port", "parent_types", "size" };
        java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder11.excludeFields((java.util.Set<java.lang.String>) strSet34);
        builder3.setexcludeFields((java.util.Set<java.lang.String>) strSet34);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder3.throttleSize(100);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory40 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean42 = builder41.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder41.script("bulk");
        com.mongodb.BasicDBObject basicDBObject45 = builder44.getmongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript46 = docScoreNativeScriptFactory40.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject45);
        builder3.mongoCollectionFilter = basicDBObject45;
        builder3.connectTimeout = (-1);
        builder3.storeStatistics = true;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(basicDBObject45);
        org.junit.Assert.assertNotNull(executableScript46);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList2 = mongoDBRiverDefinition1.mongoServers;
        org.elasticsearch.common.unit.TimeValue timeValue3 = mongoDBRiverDefinition1.getDEFAULT_FLUSH_INTERVAL();
        boolean boolean4 = mongoDBRiverDefinition1.dropCollection;
        boolean boolean5 = mongoDBRiverDefinition1.getmongoSecondaryReadPreference();
        boolean boolean6 = mongoDBRiverDefinition1.isMongoSecondaryReadPreference();
        int int7 = mongoDBRiverDefinition1.getDEFAULT_DB_PORT();
        boolean boolean8 = mongoDBRiverDefinition1.getstoreStatistics();
        java.lang.String str9 = mongoDBRiverDefinition1.typeName;
        java.lang.String str10 = mongoDBRiverDefinition1.getRiverIndexName();
        boolean boolean11 = mongoDBRiverDefinition1.isDropCollection();
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertNotNull(serverAddressList2);
        org.junit.Assert.assertNotNull(timeValue3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 27017 + "'", int7 == 27017);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder3.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = null;
        builder3.setmongoOplogFilter(basicDBObject6);
        builder3.statisticsIndexName = "socket_timeout";
        builder3.setconnectTimeout((int) (byte) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean13 = builder12.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder12.script("bulk");
        com.mongodb.BasicDBObject basicDBObject16 = null;
        builder15.setmongoOplogFilter(basicDBObject16);
        com.mongodb.BasicDBObject basicDBObject18 = null;
        builder15.setmongoOplogFilter(basicDBObject18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean21 = builder20.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder20.script("bulk");
        builder23.skipInitialImport = false;
        builder23.setscriptType("script");
        java.lang.String[] strArray45 = new java.lang.String[] { "exclude_fields", "servers", "secondary_read_preference", "name", "exclude_fields", "bulk_timeout", "skip_initial_import", "bulk", "script", "disable_index_refresh", "script.default_lang", "skip_initial_import", "gridfs", "user", "port", "parent_types", "size" };
        java.util.LinkedHashSet<java.lang.String> strSet46 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet46, strArray45);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder23.excludeFields((java.util.Set<java.lang.String>) strSet46);
        builder15.setexcludeFields((java.util.Set<java.lang.String>) strSet46);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder3.includeFields((java.util.Set<java.lang.String>) strSet46);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder50.mongoCollection("user");
        builder50.setmongoAdminPassword("disable_index_refresh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder52);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.lang.String str2 = mongoDBRiverDefinition1.getINDEX_OBJECT();
        java.util.Set<java.lang.String> strSet3 = mongoDBRiverDefinition1.parentTypes;
        boolean boolean4 = mongoDBRiverDefinition1.isStoreStatistics();
        boolean boolean5 = mongoDBRiverDefinition1.isSkipInitialImport();
        java.lang.String str6 = mongoDBRiverDefinition1.getBULK_SIZE_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition1.getPORT_FIELD();
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "index" + "'", str2, "index");
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "bulk_size" + "'", str6, "bulk_size");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "port" + "'", str7, "port");
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder3.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = null;
        builder3.setmongoOplogFilter(basicDBObject6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean9 = builder8.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder8.script("bulk");
        builder11.skipInitialImport = false;
        builder11.setscriptType("script");
        java.lang.String[] strArray33 = new java.lang.String[] { "exclude_fields", "servers", "secondary_read_preference", "name", "exclude_fields", "bulk_timeout", "skip_initial_import", "bulk", "script", "disable_index_refresh", "script.default_lang", "skip_initial_import", "gridfs", "user", "port", "parent_types", "size" };
        java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder11.excludeFields((java.util.Set<java.lang.String>) strSet34);
        builder3.setexcludeFields((java.util.Set<java.lang.String>) strSet34);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean39 = builder38.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder38.script("bulk");
        builder38.riverName = "concurrent_bulk_requests";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean45 = builder44.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder44.script("bulk");
        builder47.skipInitialImport = false;
        builder47.setscriptType("script");
        java.lang.String[] strArray69 = new java.lang.String[] { "exclude_fields", "servers", "secondary_read_preference", "name", "exclude_fields", "bulk_timeout", "skip_initial_import", "bulk", "script", "disable_index_refresh", "script.default_lang", "skip_initial_import", "gridfs", "user", "port", "parent_types", "size" };
        java.util.LinkedHashSet<java.lang.String> strSet70 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet70, strArray69);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder72 = builder47.excludeFields((java.util.Set<java.lang.String>) strSet70);
        builder38.setparentTypes((java.util.Set<java.lang.String>) strSet70);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder74 = builder3.includeFields((java.util.Set<java.lang.String>) strSet70);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder76 = builder3.throttleSize(1000);
        builder76.setskipInitialImport(false);
        boolean boolean79 = builder76.mongoSSLVerifyCertificate;
        java.util.Set<java.lang.String> strSet80 = builder76.getparentTypes();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertNotNull(builder76);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNull(strSet80);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList2 = mongoDBRiverDefinition1.mongoServers;
        org.elasticsearch.common.unit.TimeValue timeValue3 = mongoDBRiverDefinition1.getDEFAULT_FLUSH_INTERVAL();
        boolean boolean4 = mongoDBRiverDefinition1.dropCollection;
        boolean boolean5 = mongoDBRiverDefinition1.isMongoSecondaryReadPreference();
        boolean boolean6 = mongoDBRiverDefinition1.mongoUseSSL;
        java.lang.String str7 = mongoDBRiverDefinition1.getTHROTTLE_SIZE_FIELD();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue8 = mongoDBRiverDefinition1.getDEFAULT_BULK_SIZE();
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertNotNull(serverAddressList2);
        org.junit.Assert.assertNotNull(timeValue3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "throttle_size" + "'", str7, "throttle_size");
        org.junit.Assert.assertNotNull(byteSizeValue8);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList2 = mongoDBRiverDefinition1.mongoServers;
        org.elasticsearch.common.unit.TimeValue timeValue3 = mongoDBRiverDefinition1.getDEFAULT_FLUSH_INTERVAL();
        boolean boolean4 = mongoDBRiverDefinition1.dropCollection;
        boolean boolean5 = mongoDBRiverDefinition1.getmongoSecondaryReadPreference();
        boolean boolean6 = mongoDBRiverDefinition1.isMongoSecondaryReadPreference();
        int int7 = mongoDBRiverDefinition1.getDEFAULT_DB_PORT();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = mongoDBRiverDefinition1.getInitialTimestamp();
        java.lang.String str9 = mongoDBRiverDefinition1.getCREDENTIALS_FIELD();
        com.mongodb.BasicDBObject basicDBObject10 = mongoDBRiverDefinition1.getMongoCollectionFilter();
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertNotNull(serverAddressList2);
        org.junit.Assert.assertNotNull(timeValue3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 27017 + "'", int7 == 27017);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "credentials" + "'", str9, "credentials");
        org.junit.Assert.assertNotNull(basicDBObject10);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("concurrent_requests", (java.lang.Object) (-1));
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean6 = builder5.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder5.script("bulk");
        com.mongodb.BasicDBObject basicDBObject9 = null;
        builder8.setmongoOplogFilter(basicDBObject9);
        docScoreSearchScript0.setNextVar("script_type", (java.lang.Object) basicDBObject9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean14 = builder13.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder13.script("bulk");
        com.mongodb.BasicDBObject basicDBObject17 = null;
        builder16.setmongoOplogFilter(basicDBObject17);
        com.mongodb.BasicDBObject basicDBObject19 = null;
        builder16.setmongoOplogFilter(basicDBObject19);
        builder16.statisticsIndexName = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder16.advancedTransformation(false);
        docScoreSearchScript0.setNextVar("mongodb-1638820218363", (java.lang.Object) builder24);
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextDocId((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder24);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean2 = builder1.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder1.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder1.disableIndexRefresh(false);
        java.lang.Object obj7 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean9 = builder8.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder8.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder8.disableIndexRefresh(false);
        java.lang.String str14 = builder13.getstatisticsTypeName();
        builder13.setmongoGridFS(true);
        org.elasticsearch.common.settings.Settings settings17 = null;
        org.elasticsearch.common.settings.Settings settings18 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean20 = builder19.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder19.script("bulk");
        com.mongodb.BasicDBObject basicDBObject23 = null;
        builder22.setmongoOplogFilter(basicDBObject23);
        com.mongodb.BasicDBObject basicDBObject25 = null;
        builder22.setmongoOplogFilter(basicDBObject25);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean28 = builder27.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder27.script("bulk");
        builder30.skipInitialImport = false;
        builder30.setscriptType("script");
        java.lang.String[] strArray52 = new java.lang.String[] { "exclude_fields", "servers", "secondary_read_preference", "name", "exclude_fields", "bulk_timeout", "skip_initial_import", "bulk", "script", "disable_index_refresh", "script.default_lang", "skip_initial_import", "gridfs", "user", "port", "parent_types", "size" };
        java.util.LinkedHashSet<java.lang.String> strSet53 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet53, strArray52);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder30.excludeFields((java.util.Set<java.lang.String>) strSet53);
        builder22.setexcludeFields((java.util.Set<java.lang.String>) strSet53);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = builder22.throttleSize(100);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory59 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean61 = builder60.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = builder60.script("bulk");
        com.mongodb.BasicDBObject basicDBObject64 = builder63.getmongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript65 = docScoreNativeScriptFactory59.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject64);
        builder22.mongoCollectionFilter = basicDBObject64;
        org.elasticsearch.river.RiverSettings riverSettings67 = new org.elasticsearch.river.RiverSettings(settings18, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject64);
        org.elasticsearch.river.RiverSettings riverSettings68 = new org.elasticsearch.river.RiverSettings(settings17, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject64);
        builder13.mongoOplogFilter = basicDBObject64;
        builder13.throttleSize = '#';
        java.lang.Object obj72 = docScoreSearchScript0.unwrap((java.lang.Object) builder13);
        org.apache.lucene.search.Scorer scorer73 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setScorer(scorer73);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + false + "'", obj7, false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(basicDBObject64);
        org.junit.Assert.assertNotNull(executableScript65);
        org.junit.Assert.assertNotNull(obj72);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder3.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = null;
        builder3.setmongoOplogFilter(basicDBObject6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean9 = builder8.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder8.script("bulk");
        builder11.skipInitialImport = false;
        builder11.setscriptType("script");
        java.lang.String[] strArray33 = new java.lang.String[] { "exclude_fields", "servers", "secondary_read_preference", "name", "exclude_fields", "bulk_timeout", "skip_initial_import", "bulk", "script", "disable_index_refresh", "script.default_lang", "skip_initial_import", "gridfs", "user", "port", "parent_types", "size" };
        java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder11.excludeFields((java.util.Set<java.lang.String>) strSet34);
        builder3.setexcludeFields((java.util.Set<java.lang.String>) strSet34);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder3.throttleSize(100);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter40 = null;
        builder39.serializedObjectSupporter = serializedObjectSupporter40;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder39.mongoDb("bulk_timeout");
        java.lang.String str44 = builder43.getincludeCollection();
        int int45 = builder43.throttleSize;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 100 + "'", int45 == 100);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder3.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = null;
        builder3.setmongoOplogFilter(basicDBObject6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean9 = builder8.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder8.script("bulk");
        builder11.skipInitialImport = false;
        builder11.setscriptType("script");
        java.lang.String[] strArray33 = new java.lang.String[] { "exclude_fields", "servers", "secondary_read_preference", "name", "exclude_fields", "bulk_timeout", "skip_initial_import", "bulk", "script", "disable_index_refresh", "script.default_lang", "skip_initial_import", "gridfs", "user", "port", "parent_types", "size" };
        java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder11.excludeFields((java.util.Set<java.lang.String>) strSet34);
        builder3.setexcludeFields((java.util.Set<java.lang.String>) strSet34);
        java.lang.String str38 = builder3.riverIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder3.includeCollection("bulk_size");
        builder3.disableIndexRefresh = true;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(builder40);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString4();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString9();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString11();
        org.elasticsearch.river.RiverSettings riverSettings4 = serializedObjectSupporter0.deserializeObjectRiverSettings9();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString11();
        org.elasticsearch.river.RiverSettings riverSettings6 = serializedObjectSupporter0.deserializeObjectRiverSettings1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_river" + "'", str1, "_river");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mongodb-1638820218363" + "'", str2, "mongodb-1638820218363");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "mongodb-1638820218387" + "'", str3, "mongodb-1638820218387");
        org.junit.Assert.assertNotNull(riverSettings4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "mongodb-1638820218387" + "'", str5, "mongodb-1638820218387");
        org.junit.Assert.assertNotNull(riverSettings6);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("script_type", "user");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?user?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder3.mongoAdminUser("socket_timeout");
        java.lang.String str6 = builder5.riverName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder5.riverName("script.disable_dynamic");
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory9 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean11 = builder10.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder10.script("bulk");
        com.mongodb.BasicDBObject basicDBObject14 = builder13.getmongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript15 = docScoreNativeScriptFactory9.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject14);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder8.mongoCollectionFilter(basicDBObject14);
        builder16.riverName = "mongodb-1638820218299";
        com.mongodb.MongoClientOptions mongoClientOptions19 = null;
        builder16.mongoClientOptions = mongoClientOptions19;
        int int21 = builder16.getconnectTimeout();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(basicDBObject14);
        org.junit.Assert.assertNotNull(executableScript15);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString7();
        org.elasticsearch.river.RiverSettings riverSettings2 = serializedObjectSupporter0.deserializeObjectRiverSettings6();
        org.elasticsearch.common.settings.Settings settings3 = riverSettings2.globalSettings();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean5 = builder4.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder4.script("bulk");
        com.mongodb.BasicDBObject basicDBObject8 = null;
        builder7.setmongoOplogFilter(basicDBObject8);
        com.mongodb.BasicDBObject basicDBObject10 = null;
        builder7.setmongoOplogFilter(basicDBObject10);
        builder7.statisticsIndexName = "socket_timeout";
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = builder7.initialTimestamp;
        com.mongodb.BasicDBObject basicDBObject15 = builder7.mongoCollectionFilter;
        org.elasticsearch.river.RiverSettings riverSettings16 = new org.elasticsearch.river.RiverSettings(settings3, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject15);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean18 = builder17.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder17.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder17.disableIndexRefresh(false);
        java.lang.String str23 = builder22.getstatisticsTypeName();
        builder22.setmongoGridFS(true);
        org.elasticsearch.common.settings.Settings settings26 = null;
        org.elasticsearch.common.settings.Settings settings27 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean29 = builder28.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder28.script("bulk");
        com.mongodb.BasicDBObject basicDBObject32 = null;
        builder31.setmongoOplogFilter(basicDBObject32);
        com.mongodb.BasicDBObject basicDBObject34 = null;
        builder31.setmongoOplogFilter(basicDBObject34);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean37 = builder36.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder36.script("bulk");
        builder39.skipInitialImport = false;
        builder39.setscriptType("script");
        java.lang.String[] strArray61 = new java.lang.String[] { "exclude_fields", "servers", "secondary_read_preference", "name", "exclude_fields", "bulk_timeout", "skip_initial_import", "bulk", "script", "disable_index_refresh", "script.default_lang", "skip_initial_import", "gridfs", "user", "port", "parent_types", "size" };
        java.util.LinkedHashSet<java.lang.String> strSet62 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet62, strArray61);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder64 = builder39.excludeFields((java.util.Set<java.lang.String>) strSet62);
        builder31.setexcludeFields((java.util.Set<java.lang.String>) strSet62);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder67 = builder31.throttleSize(100);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory68 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder69 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean70 = builder69.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder72 = builder69.script("bulk");
        com.mongodb.BasicDBObject basicDBObject73 = builder72.getmongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript74 = docScoreNativeScriptFactory68.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject73);
        builder31.mongoCollectionFilter = basicDBObject73;
        org.elasticsearch.river.RiverSettings riverSettings76 = new org.elasticsearch.river.RiverSettings(settings27, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject73);
        org.elasticsearch.river.RiverSettings riverSettings77 = new org.elasticsearch.river.RiverSettings(settings26, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject73);
        builder22.mongoOplogFilter = basicDBObject73;
        com.mongodb.BasicDBObject basicDBObject79 = builder22.getmongoOplogFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder80 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean81 = builder80.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder83 = builder80.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder85 = builder83.mongoAdminUser("socket_timeout");
        java.lang.String str86 = builder85.riverName;
        com.mongodb.BasicDBObject basicDBObject87 = builder85.mongoCollectionFilter;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder88 = builder22.mongoOplogFilter(basicDBObject87);
        org.elasticsearch.river.RiverSettings riverSettings89 = new org.elasticsearch.river.RiverSettings(settings3, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject87);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb-1638820218326" + "'", str1, "mongodb-1638820218326");
        org.junit.Assert.assertNotNull(riverSettings2);
        org.junit.Assert.assertNotNull(settings3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(wildcardTimestamp14);
        org.junit.Assert.assertNotNull(basicDBObject15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNotNull(basicDBObject73);
        org.junit.Assert.assertNotNull(executableScript74);
        org.junit.Assert.assertNotNull(basicDBObject79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(builder83);
        org.junit.Assert.assertNotNull(builder85);
        org.junit.Assert.assertNull(str86);
        org.junit.Assert.assertNotNull(basicDBObject87);
        org.junit.Assert.assertNotNull(builder88);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder3.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = null;
        builder3.setmongoOplogFilter(basicDBObject6);
        builder3.statisticsIndexName = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder3.throttleSize((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder3.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder3.storeStatistics(true);
        builder15.dropCollection = false;
        java.lang.String str18 = builder15.getriverName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList2 = mongoDBRiverDefinition1.mongoServers;
        org.elasticsearch.common.unit.TimeValue timeValue3 = mongoDBRiverDefinition1.getDEFAULT_FLUSH_INTERVAL();
        java.lang.String str4 = mongoDBRiverDefinition1.getINDEX_OBJECT();
        java.lang.String str5 = mongoDBRiverDefinition1.getSSL_CONNECTION_FIELD();
        java.lang.String str6 = mongoDBRiverDefinition1.getMongoOplogNamespace();
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertNotNull(serverAddressList2);
        org.junit.Assert.assertNotNull(timeValue3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "index" + "'", str4, "index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ssl" + "'", str5, "ssl");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "null.null" + "'", str6, "null.null");
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("filter", (java.lang.Object) "gridfs");
        org.apache.lucene.index.AtomicReaderContext atomicReaderContext4 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextReader(atomicReaderContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter4 = null;
        builder0.serializedObjectSupporter = serializedObjectSupporter4;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.mongoAdminPassword("options");
        boolean boolean8 = builder7.getmongoGridFS();
        builder7.mongoLocalUser = "script.default_lang";
        int int11 = builder7.connectTimeout;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean3 = builder2.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.script("bulk");
        builder2.riverName = "concurrent_bulk_requests";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder2.connectTimeout((int) (byte) 10);
        docScoreSearchScript0.setNextVar("port", (java.lang.Object) builder9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition12 = builder11.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList13 = mongoDBRiverDefinition12.mongoServers;
        org.elasticsearch.common.unit.TimeValue timeValue14 = mongoDBRiverDefinition12.getDEFAULT_FLUSH_INTERVAL();
        boolean boolean15 = mongoDBRiverDefinition12.dropCollection;
        boolean boolean16 = mongoDBRiverDefinition12.isMongoSecondaryReadPreference();
        java.lang.Object obj17 = docScoreSearchScript0.unwrap((java.lang.Object) boolean16);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition19 = builder18.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList20 = mongoDBRiverDefinition19.mongoServers;
        org.elasticsearch.common.unit.TimeValue timeValue21 = mongoDBRiverDefinition19.getDEFAULT_FLUSH_INTERVAL();
        boolean boolean22 = mongoDBRiverDefinition19.dropCollection;
        boolean boolean23 = mongoDBRiverDefinition19.isMongoSecondaryReadPreference();
        java.lang.String str24 = mongoDBRiverDefinition19.getStatisticsTypeName();
        java.lang.String str25 = mongoDBRiverDefinition19.getMongoLocalPassword();
        java.lang.String str26 = mongoDBRiverDefinition19.getIndexName();
        boolean boolean27 = mongoDBRiverDefinition19.mongoUseSSL;
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp28 = mongoDBRiverDefinition19.getInitialTimestamp();
        boolean boolean29 = mongoDBRiverDefinition19.getstoreStatistics();
        java.lang.Object obj30 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition19);
        org.apache.lucene.index.AtomicReaderContext atomicReaderContext31 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextReader(atomicReaderContext31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition12);
        org.junit.Assert.assertNotNull(serverAddressList13);
        org.junit.Assert.assertNotNull(timeValue14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + false + "'", obj17, false);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition19);
        org.junit.Assert.assertNotNull(serverAddressList20);
        org.junit.Assert.assertNotNull(timeValue21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(wildcardTimestamp28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(obj30);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        builder0.riverName = "concurrent_bulk_requests";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.connectTimeout((int) (byte) 10);
        com.mongodb.BasicDBObject basicDBObject8 = builder7.getmongoOplogFilter();
        builder7.setmongoAdminPassword("gridfs");
        builder7.storeStatistics = true;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(basicDBObject8);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean3 = builder2.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.script("bulk");
        builder2.riverName = "concurrent_bulk_requests";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder2.connectTimeout((int) (byte) 10);
        docScoreSearchScript0.setNextVar("port", (java.lang.Object) builder9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean12 = builder11.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder11.script("bulk");
        builder11.riverName = "concurrent_bulk_requests";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder11.connectTimeout((int) (byte) 10);
        java.lang.Object obj19 = docScoreSearchScript0.unwrap((java.lang.Object) builder18);
        org.apache.lucene.search.Scorer scorer20 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setScorer(scorer20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder3.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = null;
        builder3.setmongoOplogFilter(basicDBObject6);
        boolean boolean8 = builder3.mongoGridFS;
        java.lang.String[] strArray51 = new java.lang.String[] { "credentials", "script.default_lang", "admin", "servers", "bulk", "script_type", "filter", "drop_collection", "local", "options", "store_statistics", "import_all_collections", "", "user", "secondary_read_preference", "actions", "concurrent_requests", "exclude_fields", "script_type", "exclude_fields", "socket_timeout", "admin", "filter", "user", "throttle_size", "bulk_timeout", "name", "local", "local", "skip_initial_import", "filter", ".scripts", "store_statistics", "concurrent_requests", "gridfs", "collection", "password", "script_type", "socket_timeout", "ssl_verify_certificate", "store_statistics", "size" };
        java.util.LinkedHashSet<java.lang.String> strSet52 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet52, strArray51);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder3.includeFields((java.util.Set<java.lang.String>) strSet52);
        java.lang.String str55 = builder3.mongoLocalPassword;
        builder3.setadvancedTransformation(true);
        java.lang.String str58 = builder3.getmongoAdminUser();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        builder0.riverName = "concurrent_bulk_requests";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.connectTimeout((int) (byte) 10);
        com.mongodb.BasicDBObject basicDBObject8 = builder7.getmongoOplogFilter();
        java.lang.String str9 = builder7.statisticsTypeName;
        boolean boolean10 = builder7.getdisableIndexRefresh();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(basicDBObject8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.disableIndexRefresh(false);
        java.lang.String str6 = builder5.getstatisticsTypeName();
        java.lang.String str7 = builder5.riverName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder5.socketTimeout(100);
        boolean boolean10 = builder5.dropCollection;
        java.lang.String str11 = builder5.riverIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder5.riverIndexName("secondary_read_preference");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder5.mongoSecondaryReadPreference(false);
        builder5.riverIndexName = "script.default_lang";
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList2 = mongoDBRiverDefinition1.mongoServers;
        boolean boolean3 = mongoDBRiverDefinition1.isMongoSecondaryReadPreference();
        java.util.Set<java.lang.String> strSet4 = mongoDBRiverDefinition1.getIncludeFields();
        java.lang.String str5 = mongoDBRiverDefinition1.getRiverName();
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertNotNull(serverAddressList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder3.mongoAdminUser("socket_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.throttleSize(27017);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = builder5.initialTimestamp;
        java.lang.String str9 = builder5.mongoCollection;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.lang.String str2 = mongoDBRiverDefinition1.getINDEX_OBJECT();
        boolean boolean3 = mongoDBRiverDefinition1.mongoUseSSL;
        java.util.Set<java.lang.String> strSet4 = mongoDBRiverDefinition1.getExcludeFields();
        java.lang.String str5 = mongoDBRiverDefinition1.getIncludeCollection();
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "index" + "'", str2, "index");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        builder3.skipInitialImport = false;
        builder3.setscriptType("script");
        java.lang.String[] strArray25 = new java.lang.String[] { "exclude_fields", "servers", "secondary_read_preference", "name", "exclude_fields", "bulk_timeout", "skip_initial_import", "bulk", "script", "disable_index_refresh", "script.default_lang", "skip_initial_import", "gridfs", "user", "port", "parent_types", "size" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder3.excludeFields((java.util.Set<java.lang.String>) strSet26);
        java.lang.String str29 = builder3.getscript();
        builder3.setmongoGridFS(true);
        java.lang.String str32 = builder3.getriverName();
        builder3.mongoCollection = "flush_interval";
        java.lang.String str35 = builder3.gettypeName();
        boolean boolean36 = builder3.getskipInitialImport();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "bulk" + "'", str29, "bulk");
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList2 = mongoDBRiverDefinition1.mongoServers;
        org.elasticsearch.common.unit.TimeValue timeValue3 = mongoDBRiverDefinition1.getDEFAULT_FLUSH_INTERVAL();
        boolean boolean4 = mongoDBRiverDefinition1.dropCollection;
        boolean boolean5 = mongoDBRiverDefinition1.getmongoSecondaryReadPreference();
        boolean boolean6 = mongoDBRiverDefinition1.isMongoSecondaryReadPreference();
        int int7 = mongoDBRiverDefinition1.getDEFAULT_DB_PORT();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = mongoDBRiverDefinition1.getInitialTimestamp();
        boolean boolean9 = mongoDBRiverDefinition1.advancedTransformation;
        java.lang.Boolean boolean10 = mongoDBRiverDefinition1.isMongos();
        boolean boolean11 = mongoDBRiverDefinition1.isSkipInitialImport();
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertNotNull(serverAddressList2);
        org.junit.Assert.assertNotNull(timeValue3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 27017 + "'", int7 == 27017);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder3.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = null;
        builder3.setmongoOplogFilter(basicDBObject6);
        builder3.statisticsIndexName = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder3.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean13 = builder12.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder12.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder12.disableIndexRefresh(false);
        java.lang.String str18 = builder17.getstatisticsTypeName();
        builder17.setmongoGridFS(true);
        org.elasticsearch.common.settings.Settings settings21 = null;
        org.elasticsearch.common.settings.Settings settings22 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean24 = builder23.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder23.script("bulk");
        com.mongodb.BasicDBObject basicDBObject27 = null;
        builder26.setmongoOplogFilter(basicDBObject27);
        com.mongodb.BasicDBObject basicDBObject29 = null;
        builder26.setmongoOplogFilter(basicDBObject29);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean32 = builder31.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder31.script("bulk");
        builder34.skipInitialImport = false;
        builder34.setscriptType("script");
        java.lang.String[] strArray56 = new java.lang.String[] { "exclude_fields", "servers", "secondary_read_preference", "name", "exclude_fields", "bulk_timeout", "skip_initial_import", "bulk", "script", "disable_index_refresh", "script.default_lang", "skip_initial_import", "gridfs", "user", "port", "parent_types", "size" };
        java.util.LinkedHashSet<java.lang.String> strSet57 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet57, strArray56);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = builder34.excludeFields((java.util.Set<java.lang.String>) strSet57);
        builder26.setexcludeFields((java.util.Set<java.lang.String>) strSet57);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = builder26.throttleSize(100);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory63 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder64 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean65 = builder64.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder67 = builder64.script("bulk");
        com.mongodb.BasicDBObject basicDBObject68 = builder67.getmongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript69 = docScoreNativeScriptFactory63.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject68);
        builder26.mongoCollectionFilter = basicDBObject68;
        org.elasticsearch.river.RiverSettings riverSettings71 = new org.elasticsearch.river.RiverSettings(settings22, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject68);
        org.elasticsearch.river.RiverSettings riverSettings72 = new org.elasticsearch.river.RiverSettings(settings21, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject68);
        builder17.mongoOplogFilter = basicDBObject68;
        builder11.setmongoOplogFilter(basicDBObject68);
        java.lang.String str75 = builder11.getscript();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(basicDBObject68);
        org.junit.Assert.assertNotNull(executableScript69);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "bulk" + "'", str75, "bulk");
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.lang.String str2 = mongoDBRiverDefinition1.getINDEX_OBJECT();
        java.util.Set<java.lang.String> strSet3 = mongoDBRiverDefinition1.parentTypes;
        boolean boolean4 = mongoDBRiverDefinition1.isStoreStatistics();
        boolean boolean5 = mongoDBRiverDefinition1.dropCollection;
        com.mongodb.MongoClientOptions mongoClientOptions6 = mongoDBRiverDefinition1.getMongoClientOptions();
        java.lang.String str7 = mongoDBRiverDefinition1.getDB_FIELD();
        java.lang.String str8 = mongoDBRiverDefinition1.getDEFAULT_DB_HOST();
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "index" + "'", str2, "index");
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(mongoClientOptions6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "db" + "'", str7, "db");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "localhost" + "'", str8, "localhost");
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList2 = mongoDBRiverDefinition1.mongoServers;
        org.elasticsearch.common.unit.TimeValue timeValue3 = mongoDBRiverDefinition1.getDEFAULT_FLUSH_INTERVAL();
        boolean boolean4 = mongoDBRiverDefinition1.dropCollection;
        boolean boolean5 = mongoDBRiverDefinition1.getmongoSecondaryReadPreference();
        boolean boolean6 = mongoDBRiverDefinition1.isMongoSecondaryReadPreference();
        int int7 = mongoDBRiverDefinition1.getDEFAULT_DB_PORT();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = mongoDBRiverDefinition1.getInitialTimestamp();
        boolean boolean9 = mongoDBRiverDefinition1.isImportAllCollections();
        com.mongodb.BasicDBObject basicDBObject10 = mongoDBRiverDefinition1.mongoOplogFilter;
        boolean boolean11 = mongoDBRiverDefinition1.getstoreStatistics();
        java.lang.String str12 = mongoDBRiverDefinition1.getIS_MONGOS_FIELD();
        java.lang.String str13 = mongoDBRiverDefinition1.getStatisticsIndexName();
        java.lang.String str14 = mongoDBRiverDefinition1.getACTIONS_FIELD();
        java.lang.String str15 = mongoDBRiverDefinition1.getADVANCED_TRANSFORMATION_FIELD();
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertNotNull(serverAddressList2);
        org.junit.Assert.assertNotNull(timeValue3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 27017 + "'", int7 == 27017);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(basicDBObject10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "is_mongos" + "'", str12, "is_mongos");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "actions" + "'", str14, "actions");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "advanced_transformation" + "'", str15, "advanced_transformation");
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings1 = serializedObjectSupporter0.deserializeObjectRiverSettings4();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString17();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString14();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString6();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString6();
        org.elasticsearch.river.RiverSettings riverSettings6 = serializedObjectSupporter0.deserializeObjectRiverSettings7();
        org.junit.Assert.assertNotNull(riverSettings1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mongodb-1638820218449" + "'", str2, "mongodb-1638820218449");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_river" + "'", str3, "_river");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_river" + "'", str4, "_river");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_river" + "'", str5, "_river");
        org.junit.Assert.assertNotNull(riverSettings6);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.lang.String str2 = mongoDBRiverDefinition1.getINDEX_OBJECT();
        java.util.Set<java.lang.String> strSet3 = mongoDBRiverDefinition1.parentTypes;
        boolean boolean4 = mongoDBRiverDefinition1.isStoreStatistics();
        boolean boolean5 = mongoDBRiverDefinition1.importAllCollections;
        java.lang.String str6 = mongoDBRiverDefinition1.mongoAdminPassword;
        java.lang.String str7 = mongoDBRiverDefinition1.getPORT_FIELD();
        java.lang.String str8 = mongoDBRiverDefinition1.mongoAdminPassword;
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "index" + "'", str2, "index");
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "port" + "'", str7, "port");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder3.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = null;
        builder3.setmongoOplogFilter(basicDBObject6);
        builder3.statisticsIndexName = "socket_timeout";
        java.lang.String str10 = builder3.riverIndexName;
        boolean boolean11 = builder3.advancedTransformation;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder3.dropCollection(true);
        builder13.mongoAdminPassword = "_river";
        int int16 = builder13.getsocketTimeout();
        boolean boolean17 = builder13.getadvancedTransformation();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList2 = mongoDBRiverDefinition1.mongoServers;
        boolean boolean3 = mongoDBRiverDefinition1.isMongoSecondaryReadPreference();
        boolean boolean4 = mongoDBRiverDefinition1.dropCollection;
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertNotNull(serverAddressList2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.disableIndexRefresh(false);
        java.lang.String str6 = builder5.getstatisticsTypeName();
        java.lang.String str7 = builder5.riverName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder5.socketTimeout(100);
        int int10 = builder5.getconnectTimeout();
        org.bson.types.BSONTimestamp bSONTimestamp11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder5.initialTimestamp(bSONTimestamp11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ts must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder3.mongoAdminUser("socket_timeout");
        java.lang.String str6 = builder5.riverName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder5.connectTimeout((int) (short) 1);
        boolean boolean9 = builder5.skipInitialImport;
        builder5.mongoLocalUser = "type";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder5.statisticsTypeName("password");
        java.util.Set<java.lang.String> strSet14 = builder5.excludeFields;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNull(strSet14);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        java.lang.String str2 = builder0.getscript();
        boolean boolean3 = builder0.dropCollection;
        builder0.indexName = "";
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory6 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean8 = builder7.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder7.script("bulk");
        com.mongodb.BasicDBObject basicDBObject11 = builder10.getmongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript12 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject11);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder0.mongoOplogFilter(basicDBObject11);
        builder0.storeStatistics = true;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder0.mongoSSLVerifyCertificate(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder0.mongoDb("admin");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.mongoCollection("script.default_lang");
        java.lang.String str22 = builder21.mongoLocalPassword;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder21.dropCollection(false);
        builder21.setmongoUseSSL(false);
        builder21.setincludeCollection("mongodb-1638820218449");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(basicDBObject11);
        org.junit.Assert.assertNotNull(executableScript12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(builder24);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("bulk_size", "host");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?host?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder3.mongoAdminUser("socket_timeout");
        java.lang.String str6 = builder5.riverName;
        com.mongodb.BasicDBObject basicDBObject7 = builder5.mongoCollectionFilter;
        java.lang.String str8 = builder5.getincludeCollection();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(basicDBObject7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("collection");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?collection?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        java.lang.String str2 = builder0.getscript();
        boolean boolean3 = builder0.dropCollection;
        builder0.indexName = "";
        java.util.Set<java.lang.String> strSet6 = builder0.excludeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.socketTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.statisticsTypeName("include_collection");
        java.util.List<com.mongodb.ServerAddress> serverAddressList11 = builder10.getmongoServers();
        int int12 = builder10.getsocketTimeout();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(serverAddressList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.disableIndexRefresh(false);
        java.lang.String str6 = builder5.getstatisticsTypeName();
        builder5.scriptType = "user";
        builder5.includeCollection = "include_fields";
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory11 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean13 = builder12.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder12.script("bulk");
        com.mongodb.BasicDBObject basicDBObject16 = builder15.getmongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript17 = docScoreNativeScriptFactory11.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject16);
        builder5.setmongoCollectionFilter(basicDBObject16);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder5.includeCollection("secondary_read_preference");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.scriptType("is_mongos");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean24 = builder23.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder23.script("bulk");
        com.mongodb.BasicDBObject basicDBObject27 = null;
        builder26.setmongoOplogFilter(basicDBObject27);
        com.mongodb.BasicDBObject basicDBObject29 = null;
        builder26.setmongoOplogFilter(basicDBObject29);
        builder26.statisticsIndexName = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder26.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean36 = builder35.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder35.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder35.disableIndexRefresh(false);
        java.lang.String str41 = builder40.getstatisticsTypeName();
        builder40.setmongoGridFS(true);
        org.elasticsearch.common.settings.Settings settings44 = null;
        org.elasticsearch.common.settings.Settings settings45 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean47 = builder46.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder46.script("bulk");
        com.mongodb.BasicDBObject basicDBObject50 = null;
        builder49.setmongoOplogFilter(basicDBObject50);
        com.mongodb.BasicDBObject basicDBObject52 = null;
        builder49.setmongoOplogFilter(basicDBObject52);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean55 = builder54.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder54.script("bulk");
        builder57.skipInitialImport = false;
        builder57.setscriptType("script");
        java.lang.String[] strArray79 = new java.lang.String[] { "exclude_fields", "servers", "secondary_read_preference", "name", "exclude_fields", "bulk_timeout", "skip_initial_import", "bulk", "script", "disable_index_refresh", "script.default_lang", "skip_initial_import", "gridfs", "user", "port", "parent_types", "size" };
        java.util.LinkedHashSet<java.lang.String> strSet80 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet80, strArray79);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder82 = builder57.excludeFields((java.util.Set<java.lang.String>) strSet80);
        builder49.setexcludeFields((java.util.Set<java.lang.String>) strSet80);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder85 = builder49.throttleSize(100);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory86 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder87 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean88 = builder87.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder90 = builder87.script("bulk");
        com.mongodb.BasicDBObject basicDBObject91 = builder90.getmongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript92 = docScoreNativeScriptFactory86.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject91);
        builder49.mongoCollectionFilter = basicDBObject91;
        org.elasticsearch.river.RiverSettings riverSettings94 = new org.elasticsearch.river.RiverSettings(settings45, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject91);
        org.elasticsearch.river.RiverSettings riverSettings95 = new org.elasticsearch.river.RiverSettings(settings44, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject91);
        builder40.mongoOplogFilter = basicDBObject91;
        builder34.setmongoOplogFilter(basicDBObject91);
        builder20.setmongoCollectionFilter(basicDBObject91);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(basicDBObject16);
        org.junit.Assert.assertNotNull(executableScript17);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(builder82);
        org.junit.Assert.assertNotNull(builder85);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(builder90);
        org.junit.Assert.assertNotNull(basicDBObject91);
        org.junit.Assert.assertNotNull(executableScript92);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList2 = mongoDBRiverDefinition1.mongoServers;
        org.elasticsearch.common.unit.TimeValue timeValue3 = mongoDBRiverDefinition1.getDEFAULT_FLUSH_INTERVAL();
        java.lang.String str4 = mongoDBRiverDefinition1.getDISABLE_INDEX_REFRESH_FIELD();
        java.util.Set<java.lang.String> strSet5 = mongoDBRiverDefinition1.parentTypes;
        java.lang.String str6 = mongoDBRiverDefinition1.getLOCAL_DB_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition1.getBULK_SIZE_FIELD();
        java.lang.Boolean boolean8 = mongoDBRiverDefinition1.getisMongos();
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertNotNull(serverAddressList2);
        org.junit.Assert.assertNotNull(timeValue3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "disable_index_refresh" + "'", str4, "disable_index_refresh");
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "local" + "'", str6, "local");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "bulk_size" + "'", str7, "bulk_size");
        org.junit.Assert.assertNull(boolean8);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.lang.String str2 = mongoDBRiverDefinition1.getINDEX_OBJECT();
        java.util.Set<java.lang.String> strSet3 = mongoDBRiverDefinition1.parentTypes;
        boolean boolean4 = mongoDBRiverDefinition1.isStoreStatistics();
        boolean boolean5 = mongoDBRiverDefinition1.importAllCollections;
        java.lang.String str6 = mongoDBRiverDefinition1.getSIZE_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition1.getSKIP_INITIAL_IMPORT_FIELD();
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "index" + "'", str2, "index");
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "size" + "'", str6, "size");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "skip_initial_import" + "'", str7, "skip_initial_import");
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder3.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = null;
        builder3.setmongoOplogFilter(basicDBObject6);
        builder3.statisticsIndexName = "socket_timeout";
        java.lang.String str10 = builder3.riverIndexName;
        boolean boolean11 = builder3.advancedTransformation;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder3.dropCollection(true);
        builder3.skipInitialImport = true;
        builder3.setisMongos((java.lang.Boolean) false);
        builder3.mongoAdminUser = "concurrent_bulk_requests";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean21 = builder20.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder20.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.mongoAdminUser("socket_timeout");
        java.lang.String[] strArray67 = new java.lang.String[] { "user", "gridfs", "socket_timeout", "socket_timeout", "exclude_fields", "bulk_timeout", "actions", "disable_index_refresh", "bulk_size", "size", "script.disable_dynamic", "size", "index", "concurrent_requests", "type", "", "concurrent_requests", "script_type", "initial_timestamp", "import_all_collections", "throttle_size", "skip_initial_import", "ssl_verify_certificate", "script", "name", "concurrent_requests", "port", "bulk", "options", "script.disable_dynamic", "size", "", "script.disable_dynamic", "user", "parent_types", "bulk_size", "initial_timestamp", ".scripts", "sandbox", "script", "include_fields" };
        java.util.LinkedHashSet<java.lang.String> strSet68 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet68, strArray67);
        builder25.setincludeFields((java.util.Set<java.lang.String>) strSet68);
        builder3.setexcludeFields((java.util.Set<java.lang.String>) strSet68);
        builder3.setdropCollection(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList2 = mongoDBRiverDefinition1.mongoServers;
        org.elasticsearch.common.unit.TimeValue timeValue3 = mongoDBRiverDefinition1.getDEFAULT_FLUSH_INTERVAL();
        boolean boolean4 = mongoDBRiverDefinition1.dropCollection;
        boolean boolean5 = mongoDBRiverDefinition1.getmongoSecondaryReadPreference();
        boolean boolean6 = mongoDBRiverDefinition1.isMongoSecondaryReadPreference();
        int int7 = mongoDBRiverDefinition1.getDEFAULT_DB_PORT();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = mongoDBRiverDefinition1.getInitialTimestamp();
        boolean boolean9 = mongoDBRiverDefinition1.isImportAllCollections();
        com.mongodb.BasicDBObject basicDBObject10 = mongoDBRiverDefinition1.mongoOplogFilter;
        boolean boolean11 = mongoDBRiverDefinition1.getstoreStatistics();
        java.lang.String str12 = mongoDBRiverDefinition1.getMongoLocalPassword();
        java.lang.String str13 = mongoDBRiverDefinition1.getINITIAL_TIMESTAMP_SCRIPT_FIELD();
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertNotNull(serverAddressList2);
        org.junit.Assert.assertNotNull(timeValue3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 27017 + "'", int7 == 27017);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(basicDBObject10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "script" + "'", str13, "script");
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.disableIndexRefresh(false);
        java.lang.String str6 = builder5.getstatisticsTypeName();
        java.lang.String str7 = builder5.riverName;
        builder5.setimportAllCollections(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder5.connectTimeout(27017);
        boolean boolean12 = builder11.dropCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder11.mongoSecondaryReadPreference(true);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory15 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean17 = builder16.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder16.script("bulk");
        builder16.riverName = "concurrent_bulk_requests";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder16.connectTimeout((int) (byte) 10);
        builder23.setadvancedTransformation(false);
        java.util.Set<java.lang.String> strSet26 = builder23.getexcludeFields();
        com.mongodb.BasicDBObject basicDBObject27 = builder23.mongoCollectionFilter;
        org.elasticsearch.script.ExecutableScript executableScript28 = docScoreNativeScriptFactory15.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject27);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean30 = builder29.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder29.script("bulk");
        com.mongodb.BasicDBObject basicDBObject33 = null;
        builder32.setmongoOplogFilter(basicDBObject33);
        com.mongodb.BasicDBObject basicDBObject35 = null;
        builder32.setmongoOplogFilter(basicDBObject35);
        boolean boolean37 = builder32.mongoGridFS;
        java.lang.String[] strArray80 = new java.lang.String[] { "credentials", "script.default_lang", "admin", "servers", "bulk", "script_type", "filter", "drop_collection", "local", "options", "store_statistics", "import_all_collections", "", "user", "secondary_read_preference", "actions", "concurrent_requests", "exclude_fields", "script_type", "exclude_fields", "socket_timeout", "admin", "filter", "user", "throttle_size", "bulk_timeout", "name", "local", "local", "skip_initial_import", "filter", ".scripts", "store_statistics", "concurrent_requests", "gridfs", "collection", "password", "script_type", "socket_timeout", "ssl_verify_certificate", "store_statistics", "size" };
        java.util.LinkedHashSet<java.lang.String> strSet81 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet81, strArray80);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder83 = builder32.includeFields((java.util.Set<java.lang.String>) strSet81);
        int int84 = builder83.throttleSize;
        java.lang.String str85 = builder83.scriptType;
        com.mongodb.BasicDBObject basicDBObject86 = builder83.mongoCollectionFilter;
        org.elasticsearch.script.ExecutableScript executableScript87 = docScoreNativeScriptFactory15.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject86);
        builder14.mongoCollectionFilter = basicDBObject86;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNull(strSet26);
        org.junit.Assert.assertNotNull(basicDBObject27);
        org.junit.Assert.assertNotNull(executableScript28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(builder83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertNull(str85);
        org.junit.Assert.assertNotNull(basicDBObject86);
        org.junit.Assert.assertNotNull(executableScript87);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.lang.String str2 = mongoDBRiverDefinition1.getINDEX_OBJECT();
        java.util.Set<java.lang.String> strSet3 = mongoDBRiverDefinition1.parentTypes;
        java.lang.String str4 = mongoDBRiverDefinition1.riverName;
        boolean boolean5 = mongoDBRiverDefinition1.disableIndexRefresh;
        java.lang.String str6 = mongoDBRiverDefinition1.mongoLocalPassword;
        java.lang.String str7 = mongoDBRiverDefinition1.getINITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD();
        boolean boolean8 = mongoDBRiverDefinition1.isDropCollection();
        java.lang.String str9 = mongoDBRiverDefinition1.getRiverName();
        java.lang.String str10 = mongoDBRiverDefinition1.getACTIONS_FIELD();
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "index" + "'", str2, "index");
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "script_type" + "'", str7, "script_type");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "actions" + "'", str10, "actions");
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean3 = builder2.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.script("bulk");
        builder2.riverName = "concurrent_bulk_requests";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder2.connectTimeout((int) (byte) 10);
        docScoreSearchScript0.setNextVar("port", (java.lang.Object) builder9);
        docScoreSearchScript0.setNextScore((float) 1);
        org.apache.lucene.search.Scorer scorer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setScorer(scorer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder3.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = null;
        builder3.setmongoOplogFilter(basicDBObject6);
        builder3.statisticsIndexName = "socket_timeout";
        java.lang.String str10 = builder3.riverIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder3.skipInitialImport(false);
        java.lang.String str13 = builder3.getmongoLocalPassword();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean15 = builder14.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder14.script("bulk");
        com.mongodb.BasicDBObject basicDBObject18 = null;
        builder17.setmongoOplogFilter(basicDBObject18);
        com.mongodb.BasicDBObject basicDBObject20 = null;
        builder17.setmongoOplogFilter(basicDBObject20);
        boolean boolean22 = builder17.mongoGridFS;
        java.lang.String[] strArray65 = new java.lang.String[] { "credentials", "script.default_lang", "admin", "servers", "bulk", "script_type", "filter", "drop_collection", "local", "options", "store_statistics", "import_all_collections", "", "user", "secondary_read_preference", "actions", "concurrent_requests", "exclude_fields", "script_type", "exclude_fields", "socket_timeout", "admin", "filter", "user", "throttle_size", "bulk_timeout", "name", "local", "local", "skip_initial_import", "filter", ".scripts", "store_statistics", "concurrent_requests", "gridfs", "collection", "password", "script_type", "socket_timeout", "ssl_verify_certificate", "store_statistics", "size" };
        java.util.LinkedHashSet<java.lang.String> strSet66 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet66, strArray65);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder68 = builder17.includeFields((java.util.Set<java.lang.String>) strSet66);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder69 = builder3.excludeFields((java.util.Set<java.lang.String>) strSet66);
        java.util.List<com.mongodb.ServerAddress> serverAddressList70 = builder3.getmongoServers();
        boolean boolean71 = builder3.getskipInitialImport();
        boolean boolean72 = builder3.getskipInitialImport();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(builder68);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(serverAddressList70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("concurrent_requests", (java.lang.Object) (-1));
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean6 = builder5.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder5.script("bulk");
        com.mongodb.BasicDBObject basicDBObject9 = null;
        builder8.setmongoOplogFilter(basicDBObject9);
        docScoreSearchScript0.setNextVar("script_type", (java.lang.Object) basicDBObject9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean14 = builder13.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder13.script("bulk");
        com.mongodb.BasicDBObject basicDBObject17 = null;
        builder16.setmongoOplogFilter(basicDBObject17);
        com.mongodb.BasicDBObject basicDBObject19 = null;
        builder16.setmongoOplogFilter(basicDBObject19);
        builder16.statisticsIndexName = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder16.advancedTransformation(false);
        docScoreSearchScript0.setNextVar("mongodb-1638820218363", (java.lang.Object) builder24);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean27 = builder26.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder26.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder26.disableIndexRefresh(false);
        java.lang.String str32 = builder31.getstatisticsTypeName();
        builder31.scriptType = "user";
        builder31.includeCollection = "include_fields";
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory37 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean39 = builder38.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder38.script("bulk");
        com.mongodb.BasicDBObject basicDBObject42 = builder41.getmongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript43 = docScoreNativeScriptFactory37.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject42);
        builder31.setmongoCollectionFilter(basicDBObject42);
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(basicDBObject42);
        org.junit.Assert.assertNotNull(executableScript43);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.script("store_statistics");
        builder2.socketTimeout = (byte) -1;
        com.mongodb.BasicDBObject basicDBObject5 = null;
        builder2.mongoOplogFilter = basicDBObject5;
        builder2.socketTimeout = 8;
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("password", "flush_interval", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?flush_interval? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString4();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString15();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString18();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString11();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_river" + "'", str1, "_river");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mongodb-1638820218424" + "'", str2, "mongodb-1638820218424");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_river" + "'", str3, "_river");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb-1638820218387" + "'", str4, "mongodb-1638820218387");
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.lang.String str2 = mongoDBRiverDefinition1.getINDEX_OBJECT();
        java.util.Set<java.lang.String> strSet3 = mongoDBRiverDefinition1.parentTypes;
        boolean boolean4 = mongoDBRiverDefinition1.isStoreStatistics();
        boolean boolean5 = mongoDBRiverDefinition1.importAllCollections;
        java.lang.String str6 = mongoDBRiverDefinition1.mongoAdminPassword;
        com.mongodb.BasicDBObject basicDBObject7 = mongoDBRiverDefinition1.getMongoCollectionFilter();
        boolean boolean8 = mongoDBRiverDefinition1.getstoreStatistics();
        com.mongodb.BasicDBObject basicDBObject9 = mongoDBRiverDefinition1.mongoOplogFilter;
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "index" + "'", str2, "index");
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(basicDBObject7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(basicDBObject9);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("concurrent_requests", (java.lang.Object) (-1));
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean6 = builder5.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder5.script("bulk");
        com.mongodb.BasicDBObject basicDBObject9 = null;
        builder8.setmongoOplogFilter(basicDBObject9);
        docScoreSearchScript0.setNextVar("script_type", (java.lang.Object) basicDBObject9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean14 = builder13.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder13.script("bulk");
        com.mongodb.BasicDBObject basicDBObject17 = null;
        builder16.setmongoOplogFilter(basicDBObject17);
        com.mongodb.BasicDBObject basicDBObject19 = null;
        builder16.setmongoOplogFilter(basicDBObject19);
        builder16.statisticsIndexName = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder16.advancedTransformation(false);
        docScoreSearchScript0.setNextVar("mongodb-1638820218363", (java.lang.Object) builder24);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj26 = docScoreSearchScript0.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder24);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.disableIndexRefresh(false);
        java.lang.String str6 = builder0.mongoAdminUser;
        java.lang.String str7 = builder0.getmongoAdminUser();
        int int8 = builder0.connectTimeout;
        builder0.statisticsTypeName = "db";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean12 = builder11.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder11.script("bulk");
        builder14.skipInitialImport = false;
        builder14.setscriptType("script");
        java.lang.String[] strArray36 = new java.lang.String[] { "exclude_fields", "servers", "secondary_read_preference", "name", "exclude_fields", "bulk_timeout", "skip_initial_import", "bulk", "script", "disable_index_refresh", "script.default_lang", "skip_initial_import", "gridfs", "user", "port", "parent_types", "size" };
        java.util.LinkedHashSet<java.lang.String> strSet37 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet37, strArray36);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder14.excludeFields((java.util.Set<java.lang.String>) strSet37);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder0.includeFields((java.util.Set<java.lang.String>) strSet37);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder0.script("connect_timeout");
        builder0.setdisableIndexRefresh(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder3.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = null;
        builder3.setmongoOplogFilter(basicDBObject6);
        builder3.statisticsIndexName = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder3.throttleSize((int) (short) 0);
        builder3.connectTimeout = 27017;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder3.throttleSize(1);
        builder15.includeCollection = "credentials";
        builder15.setstoreStatistics(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder15.statisticsIndexName("index");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.statisticsTypeName("admin");
        builder21.setmongoGridFS(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.script("store_statistics");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder26.mongoSSLVerifyCertificate(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder30.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder32.storeStatistics(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.mongoGridFS(false);
        builder34.setskipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean40 = builder39.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder39.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder39.disableIndexRefresh(false);
        java.lang.String str45 = builder44.getstatisticsTypeName();
        java.lang.String str46 = builder44.riverName;
        int int47 = builder44.connectTimeout;
        java.lang.String[] strArray94 = new java.lang.String[] { "type", "index", "", "db", "null.null", "_river", "mongodb-1638820217755", "mongodb-1638820218449", "local", "script.default_lang", "bulk_size", "host", "size", ".scripts", "secondary_read_preference", "script", "script_type", "mongodb-1638820218424", "script", "bulk_timeout", "collection", "mongodb-1638820218424", "initial_timestamp", "skip_initial_import", "", "port", "initial_timestamp", "mongodb-1638820217755", ".scripts", "index", "password", ".scripts", "flush_interval", "is_mongos", "ssl_verify_certificate", "servers", "localhost", "script.disable_dynamic", "ssl_verify_certificate", "bulk", "connect_timeout", "mongodb-1638820218449", "", "skip_initial_import", "mongodb-1638820218449", "connect_timeout" };
        java.util.LinkedHashSet<java.lang.String> strSet95 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean96 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet95, strArray94);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder97 = builder44.parentTypes((java.util.Set<java.lang.String>) strSet95);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder98 = builder34.excludeFields((java.util.Set<java.lang.String>) strSet95);
        builder21.setincludeFields((java.util.Set<java.lang.String>) strSet95);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(strArray94);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
        org.junit.Assert.assertNotNull(builder97);
        org.junit.Assert.assertNotNull(builder98);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList2 = mongoDBRiverDefinition1.mongoServers;
        java.lang.String str3 = mongoDBRiverDefinition1.getBULK_TIMEOUT_FIELD();
        java.util.Set<java.lang.String> strSet4 = mongoDBRiverDefinition1.getParentTypes();
        java.lang.String str5 = mongoDBRiverDefinition1.statisticsIndexName;
        int int6 = mongoDBRiverDefinition1.getDEFAULT_CONCURRENT_REQUESTS();
        boolean boolean7 = mongoDBRiverDefinition1.isStoreStatistics();
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertNotNull(serverAddressList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "bulk_timeout" + "'", str3, "bulk_timeout");
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder3.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = null;
        builder3.setmongoOplogFilter(basicDBObject6);
        builder3.statisticsIndexName = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder3.throttleSize((int) (short) 0);
        boolean boolean12 = builder11.mongoSSLVerifyCertificate;
        com.mongodb.MongoClientOptions mongoClientOptions13 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder11.mongoClientOptions(mongoClientOptions13);
        java.util.Set<java.lang.String> strSet15 = builder14.parentTypes;
        boolean boolean16 = builder14.storeStatistics;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNull(strSet15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder3.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = null;
        builder3.setmongoOplogFilter(basicDBObject6);
        builder3.statisticsIndexName = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder3.throttleSize((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder3.isMongos((java.lang.Boolean) true);
        builder3.setmongoUseSSL(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        builder3.skipInitialImport = false;
        builder3.setscriptType("script");
        java.lang.String[] strArray25 = new java.lang.String[] { "exclude_fields", "servers", "secondary_read_preference", "name", "exclude_fields", "bulk_timeout", "skip_initial_import", "bulk", "script", "disable_index_refresh", "script.default_lang", "skip_initial_import", "gridfs", "user", "port", "parent_types", "size" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder3.excludeFields((java.util.Set<java.lang.String>) strSet26);
        java.lang.String str29 = builder3.getscript();
        builder3.setmongoGridFS(true);
        builder3.scriptType = "drop_collection";
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "bulk" + "'", str29, "bulk");
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        java.lang.String str2 = builder0.getscript();
        boolean boolean3 = builder0.dropCollection;
        builder0.indexName = "";
        builder0.setincludeCollection("store_statistics");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString7();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString17();
        org.elasticsearch.river.RiverSettings riverSettings3 = serializedObjectSupporter0.deserializeObjectRiverSettings6();
        org.elasticsearch.river.RiverSettings riverSettings4 = serializedObjectSupporter0.deserializeObjectRiverSettings2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb-1638820218326" + "'", str1, "mongodb-1638820218326");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mongodb-1638820218449" + "'", str2, "mongodb-1638820218449");
        org.junit.Assert.assertNotNull(riverSettings3);
        org.junit.Assert.assertNotNull(riverSettings4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "mongodb-1638820217755" + "'", str5, "mongodb-1638820217755");
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList2 = mongoDBRiverDefinition1.mongoServers;
        org.elasticsearch.common.unit.TimeValue timeValue3 = mongoDBRiverDefinition1.getDEFAULT_FLUSH_INTERVAL();
        boolean boolean4 = mongoDBRiverDefinition1.dropCollection;
        boolean boolean5 = mongoDBRiverDefinition1.getmongoSecondaryReadPreference();
        boolean boolean6 = mongoDBRiverDefinition1.isMongoSecondaryReadPreference();
        int int7 = mongoDBRiverDefinition1.getDEFAULT_DB_PORT();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = mongoDBRiverDefinition1.getInitialTimestamp();
        java.lang.String str9 = mongoDBRiverDefinition1.getCREDENTIALS_FIELD();
        java.util.Set<java.lang.String> strSet10 = mongoDBRiverDefinition1.getIncludeFields();
        java.lang.String str11 = mongoDBRiverDefinition1.scriptType;
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertNotNull(serverAddressList2);
        org.junit.Assert.assertNotNull(timeValue3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 27017 + "'", int7 == 27017);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "credentials" + "'", str9, "credentials");
        org.junit.Assert.assertNull(strSet10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString4();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString14();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString12();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_river" + "'", str1, "_river");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_river" + "'", str2, "_river");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_river" + "'", str3, "_river");
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        java.lang.String str2 = builder0.getscript();
        boolean boolean3 = builder0.dropCollection;
        builder0.indexName = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean7 = builder6.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder6.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder6.disableIndexRefresh(false);
        java.lang.String str12 = builder11.getstatisticsTypeName();
        builder11.setmongoGridFS(true);
        org.elasticsearch.common.settings.Settings settings15 = null;
        org.elasticsearch.common.settings.Settings settings16 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean18 = builder17.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder17.script("bulk");
        com.mongodb.BasicDBObject basicDBObject21 = null;
        builder20.setmongoOplogFilter(basicDBObject21);
        com.mongodb.BasicDBObject basicDBObject23 = null;
        builder20.setmongoOplogFilter(basicDBObject23);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean26 = builder25.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder25.script("bulk");
        builder28.skipInitialImport = false;
        builder28.setscriptType("script");
        java.lang.String[] strArray50 = new java.lang.String[] { "exclude_fields", "servers", "secondary_read_preference", "name", "exclude_fields", "bulk_timeout", "skip_initial_import", "bulk", "script", "disable_index_refresh", "script.default_lang", "skip_initial_import", "gridfs", "user", "port", "parent_types", "size" };
        java.util.LinkedHashSet<java.lang.String> strSet51 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet51, strArray50);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder28.excludeFields((java.util.Set<java.lang.String>) strSet51);
        builder20.setexcludeFields((java.util.Set<java.lang.String>) strSet51);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder20.throttleSize(100);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory57 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean59 = builder58.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = builder58.script("bulk");
        com.mongodb.BasicDBObject basicDBObject62 = builder61.getmongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript63 = docScoreNativeScriptFactory57.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject62);
        builder20.mongoCollectionFilter = basicDBObject62;
        org.elasticsearch.river.RiverSettings riverSettings65 = new org.elasticsearch.river.RiverSettings(settings16, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject62);
        org.elasticsearch.river.RiverSettings riverSettings66 = new org.elasticsearch.river.RiverSettings(settings15, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject62);
        builder11.mongoOplogFilter = basicDBObject62;
        com.mongodb.BasicDBObject basicDBObject68 = builder11.getmongoOplogFilter();
        builder0.setmongoCollectionFilter(basicDBObject68);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(basicDBObject62);
        org.junit.Assert.assertNotNull(executableScript63);
        org.junit.Assert.assertNotNull(basicDBObject68);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList2 = mongoDBRiverDefinition1.mongoServers;
        org.elasticsearch.common.unit.TimeValue timeValue3 = mongoDBRiverDefinition1.getDEFAULT_FLUSH_INTERVAL();
        boolean boolean4 = mongoDBRiverDefinition1.dropCollection;
        boolean boolean5 = mongoDBRiverDefinition1.getmongoSecondaryReadPreference();
        boolean boolean6 = mongoDBRiverDefinition1.isMongoSecondaryReadPreference();
        int int7 = mongoDBRiverDefinition1.getDEFAULT_DB_PORT();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = mongoDBRiverDefinition1.getInitialTimestamp();
        boolean boolean9 = mongoDBRiverDefinition1.isImportAllCollections();
        com.mongodb.BasicDBObject basicDBObject10 = mongoDBRiverDefinition1.mongoOplogFilter;
        boolean boolean11 = mongoDBRiverDefinition1.getstoreStatistics();
        java.lang.String str12 = mongoDBRiverDefinition1.getIS_MONGOS_FIELD();
        java.lang.String str13 = mongoDBRiverDefinition1.getStatisticsIndexName();
        java.lang.String str14 = mongoDBRiverDefinition1.getACTIONS_FIELD();
        java.lang.String str15 = mongoDBRiverDefinition1.getTHROTTLE_SIZE_FIELD();
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertNotNull(serverAddressList2);
        org.junit.Assert.assertNotNull(timeValue3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 27017 + "'", int7 == 27017);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(basicDBObject10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "is_mongos" + "'", str12, "is_mongos");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "actions" + "'", str14, "actions");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "throttle_size" + "'", str15, "throttle_size");
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean2 = builder1.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder1.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder1.disableIndexRefresh(false);
        java.lang.Object obj7 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = builder8.build();
        java.lang.String str10 = mongoDBRiverDefinition9.getINDEX_OBJECT();
        java.util.Set<java.lang.String> strSet11 = mongoDBRiverDefinition9.parentTypes;
        boolean boolean12 = mongoDBRiverDefinition9.isStoreStatistics();
        boolean boolean13 = mongoDBRiverDefinition9.dropCollection;
        java.lang.String str14 = mongoDBRiverDefinition9.scriptType;
        java.lang.String str15 = mongoDBRiverDefinition9.getTHROTTLE_SIZE_FIELD();
        java.lang.Object obj16 = docScoreSearchScript0.unwrap((java.lang.Object) str15);
        org.apache.lucene.index.AtomicReaderContext atomicReaderContext17 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextReader(atomicReaderContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + false + "'", obj7, false);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "index" + "'", str10, "index");
        org.junit.Assert.assertNull(strSet11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "throttle_size" + "'", str15, "throttle_size");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + "throttle_size" + "'", obj16, "throttle_size");
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        java.lang.String str2 = builder0.getscript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean4 = builder3.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder3.script("bulk");
        com.mongodb.BasicDBObject basicDBObject7 = null;
        builder6.setmongoOplogFilter(basicDBObject7);
        com.mongodb.BasicDBObject basicDBObject9 = null;
        builder6.setmongoOplogFilter(basicDBObject9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean12 = builder11.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder11.script("bulk");
        builder14.skipInitialImport = false;
        builder14.setscriptType("script");
        java.lang.String[] strArray36 = new java.lang.String[] { "exclude_fields", "servers", "secondary_read_preference", "name", "exclude_fields", "bulk_timeout", "skip_initial_import", "bulk", "script", "disable_index_refresh", "script.default_lang", "skip_initial_import", "gridfs", "user", "port", "parent_types", "size" };
        java.util.LinkedHashSet<java.lang.String> strSet37 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet37, strArray36);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder14.excludeFields((java.util.Set<java.lang.String>) strSet37);
        builder6.setexcludeFields((java.util.Set<java.lang.String>) strSet37);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder6.throttleSize(100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder6.riverIndexName("bulk_timeout");
        java.util.Set<java.lang.String> strSet45 = builder6.getexcludeFields();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder0.parentTypes(strSet45);
        java.lang.String str47 = builder0.getriverIndexName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(strSet45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNull(str47);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder3.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = null;
        builder3.setmongoOplogFilter(basicDBObject6);
        builder3.statisticsIndexName = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder3.throttleSize((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.throttleSize((int) (byte) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder11.mongoSSLVerifyCertificate(false);
        java.lang.String str16 = builder11.getmongoCollection();
        builder11.setmongoLocalUser("db");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList2 = mongoDBRiverDefinition1.mongoServers;
        org.elasticsearch.common.unit.TimeValue timeValue3 = mongoDBRiverDefinition1.getDEFAULT_FLUSH_INTERVAL();
        boolean boolean4 = mongoDBRiverDefinition1.dropCollection;
        boolean boolean5 = mongoDBRiverDefinition1.getmongoSecondaryReadPreference();
        boolean boolean6 = mongoDBRiverDefinition1.isMongoSecondaryReadPreference();
        int int7 = mongoDBRiverDefinition1.getDEFAULT_DB_PORT();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = mongoDBRiverDefinition1.getInitialTimestamp();
        boolean boolean9 = mongoDBRiverDefinition1.isImportAllCollections();
        int int10 = mongoDBRiverDefinition1.getDEFAULT_DB_PORT();
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter11 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str12 = serializedObjectSupporter11.deserializeObjectString4();
        org.elasticsearch.river.RiverSettings riverSettings13 = serializedObjectSupporter11.deserializeObjectRiverSettings4();
        org.elasticsearch.river.RiverSettings riverSettings14 = serializedObjectSupporter11.deserializeObjectRiverSettings1();
        mongoDBRiverDefinition1.serializedObjectSupporter = serializedObjectSupporter11;
        java.lang.String str16 = serializedObjectSupporter11.deserializeObjectString16();
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertNotNull(serverAddressList2);
        org.junit.Assert.assertNotNull(timeValue3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 27017 + "'", int7 == 27017);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 27017 + "'", int10 == 27017);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_river" + "'", str12, "_river");
        org.junit.Assert.assertNotNull(riverSettings13);
        org.junit.Assert.assertNotNull(riverSettings14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_river" + "'", str16, "_river");
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.lang.String str2 = mongoDBRiverDefinition1.getINDEX_OBJECT();
        java.util.Set<java.lang.String> strSet3 = mongoDBRiverDefinition1.parentTypes;
        java.lang.String str4 = mongoDBRiverDefinition1.riverName;
        boolean boolean5 = mongoDBRiverDefinition1.disableIndexRefresh;
        java.lang.String str6 = mongoDBRiverDefinition1.riverIndexName;
        java.lang.String str7 = mongoDBRiverDefinition1.getRiverName();
        java.lang.String str8 = mongoDBRiverDefinition1.getUSER_FIELD();
        java.lang.String str9 = mongoDBRiverDefinition1.getSCRIPT_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition1.getCONCURRENT_REQUESTS_FIELD();
        java.lang.String str11 = mongoDBRiverDefinition1.getINITIAL_TIMESTAMP_FIELD();
        java.lang.String str12 = mongoDBRiverDefinition1.getIMPORT_ALL_COLLECTIONS_FIELD();
        java.lang.Class<?> wildcardClass13 = mongoDBRiverDefinition1.getClass();
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "index" + "'", str2, "index");
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "user" + "'", str8, "user");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "script" + "'", str9, "script");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "concurrent_requests" + "'", str10, "concurrent_requests");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "initial_timestamp" + "'", str11, "initial_timestamp");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "import_all_collections" + "'", str12, "import_all_collections");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        java.lang.String str2 = builder0.getscript();
        boolean boolean3 = builder0.dropCollection;
        builder0.indexName = "";
        int int6 = builder0.getsocketTimeout();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("servers", "flush_interval", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?flush_interval? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder3.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = null;
        builder3.setmongoOplogFilter(basicDBObject6);
        builder3.statisticsIndexName = "socket_timeout";
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = builder3.initialTimestamp;
        builder3.setmongoAdminUser("concurrent_requests");
        builder3.setdropCollection(false);
        builder3.setscriptType("mongodb-1638820218363");
        boolean boolean17 = builder3.skipInitialImport;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList2 = mongoDBRiverDefinition1.mongoServers;
        org.elasticsearch.common.unit.TimeValue timeValue3 = mongoDBRiverDefinition1.getDEFAULT_FLUSH_INTERVAL();
        boolean boolean4 = mongoDBRiverDefinition1.dropCollection;
        boolean boolean5 = mongoDBRiverDefinition1.getmongoSecondaryReadPreference();
        boolean boolean6 = mongoDBRiverDefinition1.isMongoSecondaryReadPreference();
        int int7 = mongoDBRiverDefinition1.getDEFAULT_DB_PORT();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = mongoDBRiverDefinition1.getInitialTimestamp();
        boolean boolean9 = mongoDBRiverDefinition1.advancedTransformation;
        int int10 = mongoDBRiverDefinition1.getDEFAULT_SOCKET_TIMEOUT();
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertNotNull(serverAddressList2);
        org.junit.Assert.assertNotNull(timeValue3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 27017 + "'", int7 == 27017);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 60000 + "'", int10 == 60000);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.lang.String str2 = mongoDBRiverDefinition1.getINDEX_OBJECT();
        java.util.Set<java.lang.String> strSet3 = mongoDBRiverDefinition1.parentTypes;
        java.lang.String str4 = mongoDBRiverDefinition1.riverName;
        boolean boolean5 = mongoDBRiverDefinition1.disableIndexRefresh;
        java.util.List<com.mongodb.ServerAddress> serverAddressList6 = mongoDBRiverDefinition1.getMongoServers();
        boolean boolean7 = mongoDBRiverDefinition1.getdropCollection();
        java.lang.String str8 = mongoDBRiverDefinition1.getLOCAL_DB_FIELD();
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "index" + "'", str2, "index");
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(serverAddressList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "local" + "'", str8, "local");
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        java.lang.String str2 = builder0.getscript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean4 = builder3.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder3.script("bulk");
        com.mongodb.BasicDBObject basicDBObject7 = null;
        builder6.setmongoOplogFilter(basicDBObject7);
        com.mongodb.BasicDBObject basicDBObject9 = null;
        builder6.setmongoOplogFilter(basicDBObject9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean12 = builder11.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder11.script("bulk");
        builder14.skipInitialImport = false;
        builder14.setscriptType("script");
        java.lang.String[] strArray36 = new java.lang.String[] { "exclude_fields", "servers", "secondary_read_preference", "name", "exclude_fields", "bulk_timeout", "skip_initial_import", "bulk", "script", "disable_index_refresh", "script.default_lang", "skip_initial_import", "gridfs", "user", "port", "parent_types", "size" };
        java.util.LinkedHashSet<java.lang.String> strSet37 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet37, strArray36);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder14.excludeFields((java.util.Set<java.lang.String>) strSet37);
        builder6.setexcludeFields((java.util.Set<java.lang.String>) strSet37);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder6.throttleSize(100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder6.riverIndexName("bulk_timeout");
        java.util.Set<java.lang.String> strSet45 = builder6.getexcludeFields();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder0.parentTypes(strSet45);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder0.riverName("throttle_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder0.includeCollection("mongodb-1638820218387");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(strSet45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        java.lang.String str2 = builder0.getscript();
        boolean boolean3 = builder0.dropCollection;
        builder0.indexName = "";
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory6 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean8 = builder7.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder7.script("bulk");
        com.mongodb.BasicDBObject basicDBObject11 = builder10.getmongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript12 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject11);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder0.mongoOplogFilter(basicDBObject11);
        builder0.storeStatistics = true;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder0.mongoSSLVerifyCertificate(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder0.mongoDb("admin");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.mongoCollection("script.default_lang");
        java.lang.String str22 = builder21.mongoLocalPassword;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder21.dropCollection(false);
        builder21.setmongoUseSSL(false);
        builder21.setthrottleSize((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(basicDBObject11);
        org.junit.Assert.assertNotNull(executableScript12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(builder24);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.disableIndexRefresh(false);
        int int6 = builder0.getsocketTimeout();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.dropCollection(true);
        builder8.setriverIndexName("credentials");
        java.lang.String str11 = builder8.mongoAdminPassword;
        java.util.Set<java.lang.String> strSet12 = null;
        builder8.includeFields = strSet12;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.elasticsearch.common.settings.Settings settings2 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        org.elasticsearch.river.RiverSettings riverSettings4 = new org.elasticsearch.river.RiverSettings(settings2, strMap3);
        org.elasticsearch.common.settings.Settings settings5 = riverSettings4.globalSettings();
        org.elasticsearch.script.ScriptService scriptService6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("mongodb-1638820218408", "user", riverSettings4, scriptService6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(settings5);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList2 = mongoDBRiverDefinition1.mongoServers;
        org.elasticsearch.common.unit.TimeValue timeValue3 = mongoDBRiverDefinition1.getDEFAULT_FLUSH_INTERVAL();
        boolean boolean4 = mongoDBRiverDefinition1.dropCollection;
        boolean boolean5 = mongoDBRiverDefinition1.getmongoSecondaryReadPreference();
        boolean boolean6 = mongoDBRiverDefinition1.isMongoSecondaryReadPreference();
        java.lang.String str7 = mongoDBRiverDefinition1.getRiverName();
        boolean boolean8 = mongoDBRiverDefinition1.getmongoSSLVerifyCertificate();
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertNotNull(serverAddressList2);
        org.junit.Assert.assertNotNull(timeValue3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.lang.String str2 = mongoDBRiverDefinition1.getINDEX_OBJECT();
        java.util.Set<java.lang.String> strSet3 = mongoDBRiverDefinition1.parentTypes;
        int int4 = mongoDBRiverDefinition1.getSocketTimeout();
        java.lang.String str5 = mongoDBRiverDefinition1.getTYPE_FIELD();
        java.lang.String str6 = mongoDBRiverDefinition1.getIS_MONGOS_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition1.getSECONDARY_READ_PREFERENCE_FIELD();
        java.lang.String str8 = mongoDBRiverDefinition1.getSOCKET_TIMEOUT();
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "index" + "'", str2, "index");
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "type" + "'", str5, "type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "is_mongos" + "'", str6, "is_mongos");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "secondary_read_preference" + "'", str7, "secondary_read_preference");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "socket_timeout" + "'", str8, "socket_timeout");
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder3.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = null;
        builder3.setmongoOplogFilter(basicDBObject6);
        builder3.statisticsIndexName = "socket_timeout";
        java.lang.String str10 = builder3.riverIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder3.skipInitialImport(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory13 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean15 = builder14.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder14.script("bulk");
        com.mongodb.BasicDBObject basicDBObject18 = builder17.getmongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript19 = docScoreNativeScriptFactory13.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder3.mongoCollectionFilter(basicDBObject18);
        java.lang.String str21 = builder20.mongoCollection;
        builder20.setconnectTimeout(0);
        org.bson.types.BSONTimestamp bSONTimestamp24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder20.initialTimestamp(bSONTimestamp24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ts must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(basicDBObject18);
        org.junit.Assert.assertNotNull(executableScript19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString7();
        org.elasticsearch.river.RiverSettings riverSettings2 = serializedObjectSupporter0.deserializeObjectRiverSettings6();
        org.elasticsearch.common.settings.Settings settings3 = riverSettings2.globalSettings();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean5 = builder4.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder4.script("bulk");
        com.mongodb.BasicDBObject basicDBObject8 = null;
        builder7.setmongoOplogFilter(basicDBObject8);
        com.mongodb.BasicDBObject basicDBObject10 = null;
        builder7.setmongoOplogFilter(basicDBObject10);
        builder7.statisticsIndexName = "socket_timeout";
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = builder7.initialTimestamp;
        com.mongodb.BasicDBObject basicDBObject15 = builder7.mongoCollectionFilter;
        org.elasticsearch.river.RiverSettings riverSettings16 = new org.elasticsearch.river.RiverSettings(settings3, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject15);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean18 = builder17.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder17.script("bulk");
        com.mongodb.BasicDBObject basicDBObject21 = null;
        builder20.setmongoOplogFilter(basicDBObject21);
        com.mongodb.BasicDBObject basicDBObject23 = null;
        builder20.setmongoOplogFilter(basicDBObject23);
        builder20.statisticsIndexName = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder20.throttleSize((int) (short) 0);
        builder20.mongoLocalPassword = "script.disable_dynamic";
        java.lang.String str31 = builder20.getmongoCollection();
        boolean boolean32 = builder20.mongoSSLVerifyCertificate;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean34 = builder33.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder33.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder33.disableIndexRefresh(false);
        java.lang.String str39 = builder38.getstatisticsTypeName();
        java.lang.String str40 = builder38.riverName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean42 = builder41.getdropCollection();
        java.lang.String str43 = builder41.getscript();
        boolean boolean44 = builder41.dropCollection;
        builder41.indexName = "";
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory47 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean49 = builder48.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder48.script("bulk");
        com.mongodb.BasicDBObject basicDBObject52 = builder51.getmongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript53 = docScoreNativeScriptFactory47.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject52);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder41.mongoOplogFilter(basicDBObject52);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder38.mongoCollectionFilter(basicDBObject52);
        builder20.setmongoOplogFilter(basicDBObject52);
        org.elasticsearch.river.RiverSettings riverSettings57 = new org.elasticsearch.river.RiverSettings(settings3, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject52);
        java.lang.Class<?> wildcardClass58 = basicDBObject52.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb-1638820218326" + "'", str1, "mongodb-1638820218326");
        org.junit.Assert.assertNotNull(riverSettings2);
        org.junit.Assert.assertNotNull(settings3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(wildcardTimestamp14);
        org.junit.Assert.assertNotNull(basicDBObject15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(basicDBObject52);
        org.junit.Assert.assertNotNull(executableScript53);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder3.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = null;
        builder3.setmongoOplogFilter(basicDBObject6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean9 = builder8.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder8.script("bulk");
        builder11.skipInitialImport = false;
        builder11.setscriptType("script");
        java.lang.String[] strArray33 = new java.lang.String[] { "exclude_fields", "servers", "secondary_read_preference", "name", "exclude_fields", "bulk_timeout", "skip_initial_import", "bulk", "script", "disable_index_refresh", "script.default_lang", "skip_initial_import", "gridfs", "user", "port", "parent_types", "size" };
        java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder11.excludeFields((java.util.Set<java.lang.String>) strSet34);
        builder3.setexcludeFields((java.util.Set<java.lang.String>) strSet34);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder3.throttleSize(100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder3.riverIndexName("bulk_timeout");
        builder3.connectTimeout = (byte) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder3.mongoSSLVerifyCertificate(true);
        builder3.setriverIndexName("mongodb-1638820218449");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder45);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("concurrent_requests", (java.lang.Object) (-1));
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean6 = builder5.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder5.script("bulk");
        com.mongodb.BasicDBObject basicDBObject9 = null;
        builder8.setmongoOplogFilter(basicDBObject9);
        docScoreSearchScript0.setNextVar("script_type", (java.lang.Object) basicDBObject9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean14 = builder13.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder13.script("bulk");
        com.mongodb.BasicDBObject basicDBObject17 = null;
        builder16.setmongoOplogFilter(basicDBObject17);
        com.mongodb.BasicDBObject basicDBObject19 = null;
        builder16.setmongoOplogFilter(basicDBObject19);
        builder16.statisticsIndexName = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder16.advancedTransformation(false);
        docScoreSearchScript0.setNextVar("mongodb-1638820218363", (java.lang.Object) builder24);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter26 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str27 = serializedObjectSupporter26.deserializeObjectString7();
        org.elasticsearch.river.RiverSettings riverSettings28 = serializedObjectSupporter26.deserializeObjectRiverSettings6();
        org.elasticsearch.common.settings.Settings settings29 = riverSettings28.globalSettings();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean31 = builder30.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder30.script("bulk");
        com.mongodb.BasicDBObject basicDBObject34 = null;
        builder33.setmongoOplogFilter(basicDBObject34);
        com.mongodb.BasicDBObject basicDBObject36 = null;
        builder33.setmongoOplogFilter(basicDBObject36);
        builder33.statisticsIndexName = "socket_timeout";
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp40 = builder33.initialTimestamp;
        com.mongodb.BasicDBObject basicDBObject41 = builder33.mongoCollectionFilter;
        org.elasticsearch.river.RiverSettings riverSettings42 = new org.elasticsearch.river.RiverSettings(settings29, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject41);
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "mongodb-1638820218326" + "'", str27, "mongodb-1638820218326");
        org.junit.Assert.assertNotNull(riverSettings28);
        org.junit.Assert.assertNotNull(settings29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNull(wildcardTimestamp40);
        org.junit.Assert.assertNotNull(basicDBObject41);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList2 = mongoDBRiverDefinition1.mongoServers;
        org.elasticsearch.common.unit.TimeValue timeValue3 = mongoDBRiverDefinition1.getDEFAULT_FLUSH_INTERVAL();
        boolean boolean4 = mongoDBRiverDefinition1.dropCollection;
        boolean boolean5 = mongoDBRiverDefinition1.isMongoSecondaryReadPreference();
        java.lang.String str6 = mongoDBRiverDefinition1.getStatisticsTypeName();
        java.lang.String str7 = mongoDBRiverDefinition1.getMongoLocalPassword();
        java.lang.String str8 = mongoDBRiverDefinition1.getIndexName();
        boolean boolean9 = mongoDBRiverDefinition1.mongoUseSSL;
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = mongoDBRiverDefinition1.getInitialTimestamp();
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter11 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        mongoDBRiverDefinition1.serializedObjectSupporter = serializedObjectSupporter11;
        java.lang.String str13 = mongoDBRiverDefinition1.getIndexName();
        boolean boolean14 = mongoDBRiverDefinition1.skipInitialImport;
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertNotNull(serverAddressList2);
        org.junit.Assert.assertNotNull(timeValue3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.util.Set<java.lang.String> strSet1 = builder0.getexcludeFields();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.mongoLocalUser("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder3.mongoAdminUser("mongodb-1638820218449");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = builder5.initialTimestamp;
        int int7 = builder5.throttleSize;
        org.junit.Assert.assertNull(strSet1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        java.lang.String str2 = builder0.getscript();
        boolean boolean3 = builder0.dropCollection;
        builder0.indexName = "";
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory6 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean8 = builder7.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder7.script("bulk");
        com.mongodb.BasicDBObject basicDBObject11 = builder10.getmongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript12 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject11);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder0.mongoOplogFilter(basicDBObject11);
        builder0.storeStatistics = true;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder0.mongoSSLVerifyCertificate(false);
        com.mongodb.BasicDBObject basicDBObject18 = builder17.mongoOplogFilter;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder17.socketTimeout((int) (byte) 0);
        builder17.setriverName("collection");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(basicDBObject11);
        org.junit.Assert.assertNotNull(executableScript12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(basicDBObject18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder3.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = null;
        builder3.setmongoOplogFilter(basicDBObject6);
        builder3.statisticsIndexName = "socket_timeout";
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = builder3.initialTimestamp;
        com.mongodb.BasicDBObject basicDBObject11 = builder3.mongoCollectionFilter;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder3.script("include_fields");
        com.mongodb.MongoClientOptions mongoClientOptions14 = null;
        builder3.mongoClientOptions = mongoClientOptions14;
        java.lang.String str16 = builder3.getstatisticsIndexName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertNotNull(basicDBObject11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "socket_timeout" + "'", str16, "socket_timeout");
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString7();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString4();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString14();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb-1638820218326" + "'", str1, "mongodb-1638820218326");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_river" + "'", str2, "_river");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_river" + "'", str3, "_river");
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList2 = mongoDBRiverDefinition1.mongoServers;
        org.elasticsearch.common.unit.TimeValue timeValue3 = mongoDBRiverDefinition1.getDEFAULT_FLUSH_INTERVAL();
        boolean boolean4 = mongoDBRiverDefinition1.dropCollection;
        boolean boolean5 = mongoDBRiverDefinition1.isMongoSecondaryReadPreference();
        boolean boolean6 = mongoDBRiverDefinition1.mongoUseSSL;
        boolean boolean7 = mongoDBRiverDefinition1.disableIndexRefresh;
        java.lang.String str8 = mongoDBRiverDefinition1.getEXCLUDE_FIELDS_FIELD();
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertNotNull(serverAddressList2);
        org.junit.Assert.assertNotNull(timeValue3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "exclude_fields" + "'", str8, "exclude_fields");
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList2 = mongoDBRiverDefinition1.mongoServers;
        org.elasticsearch.common.unit.TimeValue timeValue3 = mongoDBRiverDefinition1.getDEFAULT_FLUSH_INTERVAL();
        boolean boolean4 = mongoDBRiverDefinition1.dropCollection;
        boolean boolean5 = mongoDBRiverDefinition1.isMongoSecondaryReadPreference();
        java.lang.String str6 = mongoDBRiverDefinition1.getStatisticsTypeName();
        java.lang.String str7 = mongoDBRiverDefinition1.getMongoLocalPassword();
        java.lang.String str8 = mongoDBRiverDefinition1.getCONNECT_TIMEOUT();
        java.lang.String str9 = mongoDBRiverDefinition1.getSKIP_INITIAL_IMPORT_FIELD();
        boolean boolean10 = mongoDBRiverDefinition1.getadvancedTransformation();
        java.lang.String str11 = mongoDBRiverDefinition1.getIndexName();
        boolean boolean12 = mongoDBRiverDefinition1.isAdvancedTransformation();
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertNotNull(serverAddressList2);
        org.junit.Assert.assertNotNull(timeValue3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "connect_timeout" + "'", str8, "connect_timeout");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "skip_initial_import" + "'", str9, "skip_initial_import");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder3.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = null;
        builder3.setmongoOplogFilter(basicDBObject6);
        builder3.statisticsIndexName = "socket_timeout";
        builder3.setconnectTimeout((int) (byte) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean13 = builder12.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder12.script("bulk");
        com.mongodb.BasicDBObject basicDBObject16 = null;
        builder15.setmongoOplogFilter(basicDBObject16);
        com.mongodb.BasicDBObject basicDBObject18 = null;
        builder15.setmongoOplogFilter(basicDBObject18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean21 = builder20.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder20.script("bulk");
        builder23.skipInitialImport = false;
        builder23.setscriptType("script");
        java.lang.String[] strArray45 = new java.lang.String[] { "exclude_fields", "servers", "secondary_read_preference", "name", "exclude_fields", "bulk_timeout", "skip_initial_import", "bulk", "script", "disable_index_refresh", "script.default_lang", "skip_initial_import", "gridfs", "user", "port", "parent_types", "size" };
        java.util.LinkedHashSet<java.lang.String> strSet46 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet46, strArray45);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder23.excludeFields((java.util.Set<java.lang.String>) strSet46);
        builder15.setexcludeFields((java.util.Set<java.lang.String>) strSet46);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder3.includeFields((java.util.Set<java.lang.String>) strSet46);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder50.mongoCollection("user");
        java.lang.String str53 = builder50.includeCollection;
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter54 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str55 = serializedObjectSupporter54.deserializeObjectString7();
        org.elasticsearch.river.RiverSettings riverSettings56 = serializedObjectSupporter54.deserializeObjectRiverSettings6();
        org.elasticsearch.common.settings.Settings settings57 = riverSettings56.globalSettings();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean59 = builder58.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = builder58.script("bulk");
        com.mongodb.BasicDBObject basicDBObject62 = null;
        builder61.setmongoOplogFilter(basicDBObject62);
        com.mongodb.BasicDBObject basicDBObject64 = null;
        builder61.setmongoOplogFilter(basicDBObject64);
        builder61.statisticsIndexName = "socket_timeout";
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp68 = builder61.initialTimestamp;
        com.mongodb.BasicDBObject basicDBObject69 = builder61.mongoCollectionFilter;
        org.elasticsearch.river.RiverSettings riverSettings70 = new org.elasticsearch.river.RiverSettings(settings57, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject69);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder71 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition72 = builder71.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList73 = mongoDBRiverDefinition72.mongoServers;
        org.elasticsearch.common.unit.TimeValue timeValue74 = mongoDBRiverDefinition72.getDEFAULT_FLUSH_INTERVAL();
        boolean boolean75 = mongoDBRiverDefinition72.dropCollection;
        boolean boolean76 = mongoDBRiverDefinition72.isMongoSecondaryReadPreference();
        java.lang.String str77 = mongoDBRiverDefinition72.getStatisticsTypeName();
        java.lang.String str78 = mongoDBRiverDefinition72.getMongoLocalPassword();
        java.lang.String str79 = mongoDBRiverDefinition72.getCONNECT_TIMEOUT();
        java.util.Set<java.lang.String> strSet80 = mongoDBRiverDefinition72.getExcludeFields();
        com.mongodb.BasicDBObject basicDBObject81 = mongoDBRiverDefinition72.mongoCollectionFilter;
        org.elasticsearch.river.RiverSettings riverSettings82 = new org.elasticsearch.river.RiverSettings(settings57, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject81);
        builder50.mongoOplogFilter = basicDBObject81;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "mongodb-1638820218326" + "'", str55, "mongodb-1638820218326");
        org.junit.Assert.assertNotNull(riverSettings56);
        org.junit.Assert.assertNotNull(settings57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNull(wildcardTimestamp68);
        org.junit.Assert.assertNotNull(basicDBObject69);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition72);
        org.junit.Assert.assertNotNull(serverAddressList73);
        org.junit.Assert.assertNotNull(timeValue74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNull(str77);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "connect_timeout" + "'", str79, "connect_timeout");
        org.junit.Assert.assertNull(strSet80);
        org.junit.Assert.assertNotNull(basicDBObject81);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList2 = mongoDBRiverDefinition1.mongoServers;
        org.elasticsearch.common.unit.TimeValue timeValue3 = mongoDBRiverDefinition1.getDEFAULT_FLUSH_INTERVAL();
        boolean boolean4 = mongoDBRiverDefinition1.dropCollection;
        boolean boolean5 = mongoDBRiverDefinition1.isMongoSecondaryReadPreference();
        java.lang.String str6 = mongoDBRiverDefinition1.getCONCURRENT_REQUESTS_FIELD();
        int int7 = mongoDBRiverDefinition1.getDEFAULT_DB_PORT();
        java.lang.Boolean boolean8 = mongoDBRiverDefinition1.isMongos;
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertNotNull(serverAddressList2);
        org.junit.Assert.assertNotNull(timeValue3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "concurrent_requests" + "'", str6, "concurrent_requests");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 27017 + "'", int7 == 27017);
        org.junit.Assert.assertNull(boolean8);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.lang.String str2 = mongoDBRiverDefinition1.getINDEX_OBJECT();
        java.util.Set<java.lang.String> strSet3 = mongoDBRiverDefinition1.parentTypes;
        boolean boolean4 = mongoDBRiverDefinition1.isStoreStatistics();
        boolean boolean5 = mongoDBRiverDefinition1.dropCollection;
        java.lang.String str6 = mongoDBRiverDefinition1.getCOLLECTION_FIELD();
        com.mongodb.BasicDBObject basicDBObject7 = mongoDBRiverDefinition1.getMongoCollectionFilter();
        java.lang.String str8 = mongoDBRiverDefinition1.getTYPE_FIELD();
        int int9 = mongoDBRiverDefinition1.connectTimeout;
        java.lang.String str10 = mongoDBRiverDefinition1.getSSL_VERIFY_CERT_FIELD();
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "index" + "'", str2, "index");
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "collection" + "'", str6, "collection");
        org.junit.Assert.assertNotNull(basicDBObject7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "type" + "'", str8, "type");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ssl_verify_certificate" + "'", str10, "ssl_verify_certificate");
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString4();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString9();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString11();
        org.elasticsearch.river.RiverSettings riverSettings4 = serializedObjectSupporter0.deserializeObjectRiverSettings9();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString11();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString16();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_river" + "'", str1, "_river");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mongodb-1638820218363" + "'", str2, "mongodb-1638820218363");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "mongodb-1638820218387" + "'", str3, "mongodb-1638820218387");
        org.junit.Assert.assertNotNull(riverSettings4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "mongodb-1638820218387" + "'", str5, "mongodb-1638820218387");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_river" + "'", str6, "_river");
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString4();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString14();
        org.elasticsearch.river.RiverSettings riverSettings3 = serializedObjectSupporter0.deserializeObjectRiverSettings2();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = riverSettings3.settings();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_river" + "'", str1, "_river");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_river" + "'", str2, "_river");
        org.junit.Assert.assertNotNull(riverSettings3);
        org.junit.Assert.assertNotNull(strMap4);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString4();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString15();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString17();
        org.elasticsearch.river.RiverSettings riverSettings5 = serializedObjectSupporter0.deserializeObjectRiverSettings6();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString7();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString18();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_river" + "'", str1, "_river");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mongodb-1638820218424" + "'", str2, "mongodb-1638820218424");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "mongodb-1638820217755" + "'", str3, "mongodb-1638820217755");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb-1638820218449" + "'", str4, "mongodb-1638820218449");
        org.junit.Assert.assertNotNull(riverSettings5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "mongodb-1638820218326" + "'", str6, "mongodb-1638820218326");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_river" + "'", str7, "_river");
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder3.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = null;
        builder3.setmongoOplogFilter(basicDBObject6);
        builder3.statisticsIndexName = "socket_timeout";
        java.lang.String str10 = builder3.riverIndexName;
        boolean boolean11 = builder3.advancedTransformation;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder3.dropCollection(true);
        boolean boolean14 = builder13.getdisableIndexRefresh();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList2 = mongoDBRiverDefinition1.mongoServers;
        org.elasticsearch.common.unit.TimeValue timeValue3 = mongoDBRiverDefinition1.getDEFAULT_FLUSH_INTERVAL();
        boolean boolean4 = mongoDBRiverDefinition1.dropCollection;
        boolean boolean5 = mongoDBRiverDefinition1.getmongoSecondaryReadPreference();
        boolean boolean6 = mongoDBRiverDefinition1.isStoreStatistics();
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertNotNull(serverAddressList2);
        org.junit.Assert.assertNotNull(timeValue3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean3 = builder2.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.script("bulk");
        builder2.riverName = "concurrent_bulk_requests";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder2.connectTimeout((int) (byte) 10);
        docScoreSearchScript0.setNextVar("port", (java.lang.Object) builder9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean12 = builder11.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder11.script("bulk");
        com.mongodb.BasicDBObject basicDBObject15 = null;
        builder14.setmongoOplogFilter(basicDBObject15);
        com.mongodb.BasicDBObject basicDBObject17 = null;
        builder14.setmongoOplogFilter(basicDBObject17);
        builder14.statisticsIndexName = "socket_timeout";
        builder14.setmongoUseSSL(false);
        java.lang.Object obj23 = docScoreSearchScript0.unwrap((java.lang.Object) builder14);
        boolean boolean24 = builder14.getstoreStatistics();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList2 = mongoDBRiverDefinition1.mongoServers;
        org.elasticsearch.common.unit.TimeValue timeValue3 = mongoDBRiverDefinition1.getDEFAULT_FLUSH_INTERVAL();
        java.lang.String str4 = mongoDBRiverDefinition1.getINDEX_OBJECT();
        java.lang.String str5 = mongoDBRiverDefinition1.getSSL_CONNECTION_FIELD();
        java.lang.String str6 = mongoDBRiverDefinition1.indexName;
        java.lang.String str7 = mongoDBRiverDefinition1.getRiverName();
        java.lang.Class<?> wildcardClass8 = mongoDBRiverDefinition1.getClass();
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertNotNull(serverAddressList2);
        org.junit.Assert.assertNotNull(timeValue3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "index" + "'", str4, "index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ssl" + "'", str5, "ssl");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.disableIndexRefresh(false);
        java.lang.String str6 = builder5.getstatisticsTypeName();
        builder5.storeStatistics = false;
        java.lang.Boolean boolean9 = builder5.isMongos;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(boolean9);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.disableIndexRefresh(false);
        java.lang.String str6 = builder5.getstatisticsTypeName();
        java.lang.String str7 = builder5.riverName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder5.mongoAdminPassword("size");
        builder9.throttleSize = (byte) 10;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = builder12.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList14 = mongoDBRiverDefinition13.mongoServers;
        org.elasticsearch.common.unit.TimeValue timeValue15 = mongoDBRiverDefinition13.getDEFAULT_FLUSH_INTERVAL();
        boolean boolean16 = mongoDBRiverDefinition13.dropCollection;
        boolean boolean17 = mongoDBRiverDefinition13.isMongoSecondaryReadPreference();
        java.lang.String str18 = mongoDBRiverDefinition13.getStatisticsTypeName();
        java.lang.String str19 = mongoDBRiverDefinition13.getMongoLocalPassword();
        java.lang.String str20 = mongoDBRiverDefinition13.getIndexName();
        boolean boolean21 = mongoDBRiverDefinition13.mongoUseSSL;
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp22 = mongoDBRiverDefinition13.getInitialTimestamp();
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter23 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        mongoDBRiverDefinition13.serializedObjectSupporter = serializedObjectSupporter23;
        java.lang.String str25 = serializedObjectSupporter23.deserializeObjectString5();
        java.lang.String str26 = serializedObjectSupporter23.deserializeObjectString17();
        java.lang.String str27 = serializedObjectSupporter23.deserializeObjectString13();
        builder9.serializedObjectSupporter = serializedObjectSupporter23;
        java.lang.String str29 = serializedObjectSupporter23.deserializeObjectString14();
        java.lang.String str30 = serializedObjectSupporter23.deserializeObjectString14();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition13);
        org.junit.Assert.assertNotNull(serverAddressList14);
        org.junit.Assert.assertNotNull(timeValue15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(wildcardTimestamp22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "mongodb-1638820218299" + "'", str25, "mongodb-1638820218299");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "mongodb-1638820218449" + "'", str26, "mongodb-1638820218449");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "mongodb-1638820218408" + "'", str27, "mongodb-1638820218408");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "_river" + "'", str29, "_river");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "_river" + "'", str30, "_river");
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList2 = mongoDBRiverDefinition1.mongoServers;
        org.elasticsearch.common.unit.TimeValue timeValue3 = mongoDBRiverDefinition1.getDEFAULT_FLUSH_INTERVAL();
        boolean boolean4 = mongoDBRiverDefinition1.dropCollection;
        java.lang.String str5 = mongoDBRiverDefinition1.getDB_FIELD();
        java.lang.String str6 = mongoDBRiverDefinition1.getHOST_FIELD();
        boolean boolean7 = mongoDBRiverDefinition1.isMongoSecondaryReadPreference();
        java.lang.Boolean boolean8 = mongoDBRiverDefinition1.isMongos();
        boolean boolean9 = mongoDBRiverDefinition1.mongoSSLVerifyCertificate;
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertNotNull(serverAddressList2);
        org.junit.Assert.assertNotNull(timeValue3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "db" + "'", str5, "db");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "host" + "'", str6, "host");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder3.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = null;
        builder3.setmongoOplogFilter(basicDBObject6);
        builder3.statisticsIndexName = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder3.throttleSize((int) (short) 0);
        builder3.mongoLocalPassword = "script.disable_dynamic";
        java.lang.String str14 = builder3.getindexName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder3.indexName("user");
        builder3.mongoLocalPassword = "throttle_size";
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.lang.String str2 = mongoDBRiverDefinition1.getINDEX_OBJECT();
        java.util.Set<java.lang.String> strSet3 = mongoDBRiverDefinition1.parentTypes;
        java.lang.String str4 = mongoDBRiverDefinition1.riverName;
        boolean boolean5 = mongoDBRiverDefinition1.disableIndexRefresh;
        java.lang.String str6 = mongoDBRiverDefinition1.riverIndexName;
        java.lang.String str7 = mongoDBRiverDefinition1.getRiverName();
        java.lang.String str8 = mongoDBRiverDefinition1.statisticsTypeName;
        boolean boolean9 = mongoDBRiverDefinition1.getmongoSecondaryReadPreference();
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "index" + "'", str2, "index");
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList2 = mongoDBRiverDefinition1.mongoServers;
        org.elasticsearch.common.unit.TimeValue timeValue3 = mongoDBRiverDefinition1.getDEFAULT_FLUSH_INTERVAL();
        java.lang.String str4 = mongoDBRiverDefinition1.getDISABLE_INDEX_REFRESH_FIELD();
        java.util.Set<java.lang.String> strSet5 = mongoDBRiverDefinition1.parentTypes;
        boolean boolean6 = mongoDBRiverDefinition1.isMongoGridFS();
        java.lang.String str7 = mongoDBRiverDefinition1.getEXCLUDE_FIELDS_FIELD();
        java.lang.String str8 = mongoDBRiverDefinition1.getMongoDb();
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertNotNull(serverAddressList2);
        org.junit.Assert.assertNotNull(timeValue3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "disable_index_refresh" + "'", str4, "disable_index_refresh");
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "exclude_fields" + "'", str7, "exclude_fields");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.lang.String str2 = mongoDBRiverDefinition1.getINDEX_OBJECT();
        java.util.Set<java.lang.String> strSet3 = mongoDBRiverDefinition1.parentTypes;
        boolean boolean4 = mongoDBRiverDefinition1.isStoreStatistics();
        boolean boolean5 = mongoDBRiverDefinition1.dropCollection;
        java.lang.String str6 = mongoDBRiverDefinition1.getCOLLECTION_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition1.getCOLLECTION_FIELD();
        java.lang.String str8 = mongoDBRiverDefinition1.getFILTER_FIELD();
        int int9 = mongoDBRiverDefinition1.socketTimeout;
        boolean boolean10 = mongoDBRiverDefinition1.getimportAllCollections();
        java.lang.String str11 = mongoDBRiverDefinition1.getBULK_TIMEOUT_FIELD();
        java.lang.String str12 = mongoDBRiverDefinition1.getEXCLUDE_FIELDS_FIELD();
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "index" + "'", str2, "index");
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "collection" + "'", str6, "collection");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "collection" + "'", str7, "collection");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "filter" + "'", str8, "filter");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "bulk_timeout" + "'", str11, "bulk_timeout");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "exclude_fields" + "'", str12, "exclude_fields");
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder3.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = null;
        builder3.setmongoOplogFilter(basicDBObject6);
        builder3.statisticsIndexName = "socket_timeout";
        java.lang.String str10 = builder3.riverIndexName;
        boolean boolean11 = builder3.advancedTransformation;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder3.scriptType("type");
        boolean boolean14 = builder3.getmongoUseSSL();
        builder3.setmongoLocalUser("parent_types");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.disableIndexRefresh(false);
        java.lang.String str6 = builder5.getstatisticsTypeName();
        java.lang.String str7 = builder5.riverName;
        int int8 = builder5.connectTimeout;
        java.lang.String str9 = builder5.getmongoDb();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder5.mongoLocalPassword("include_collection");
        com.mongodb.BasicDBObject basicDBObject12 = builder5.getmongoOplogFilter();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNull(basicDBObject12);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder3.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = null;
        builder3.setmongoOplogFilter(basicDBObject6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean9 = builder8.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder8.script("bulk");
        builder11.skipInitialImport = false;
        builder11.setscriptType("script");
        java.lang.String[] strArray33 = new java.lang.String[] { "exclude_fields", "servers", "secondary_read_preference", "name", "exclude_fields", "bulk_timeout", "skip_initial_import", "bulk", "script", "disable_index_refresh", "script.default_lang", "skip_initial_import", "gridfs", "user", "port", "parent_types", "size" };
        java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder11.excludeFields((java.util.Set<java.lang.String>) strSet34);
        builder3.setexcludeFields((java.util.Set<java.lang.String>) strSet34);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder3.throttleSize(100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder3.riverIndexName("bulk_timeout");
        builder3.connectTimeout = (byte) 0;
        org.bson.types.BSONTimestamp bSONTimestamp44 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder3.initialTimestamp(bSONTimestamp44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ts must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder3.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = null;
        builder3.setmongoOplogFilter(basicDBObject6);
        builder3.statisticsIndexName = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder3.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean13 = builder12.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder12.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder12.disableIndexRefresh(false);
        java.lang.String str18 = builder17.getstatisticsTypeName();
        builder17.setmongoGridFS(true);
        org.elasticsearch.common.settings.Settings settings21 = null;
        org.elasticsearch.common.settings.Settings settings22 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean24 = builder23.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder23.script("bulk");
        com.mongodb.BasicDBObject basicDBObject27 = null;
        builder26.setmongoOplogFilter(basicDBObject27);
        com.mongodb.BasicDBObject basicDBObject29 = null;
        builder26.setmongoOplogFilter(basicDBObject29);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean32 = builder31.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder31.script("bulk");
        builder34.skipInitialImport = false;
        builder34.setscriptType("script");
        java.lang.String[] strArray56 = new java.lang.String[] { "exclude_fields", "servers", "secondary_read_preference", "name", "exclude_fields", "bulk_timeout", "skip_initial_import", "bulk", "script", "disable_index_refresh", "script.default_lang", "skip_initial_import", "gridfs", "user", "port", "parent_types", "size" };
        java.util.LinkedHashSet<java.lang.String> strSet57 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet57, strArray56);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = builder34.excludeFields((java.util.Set<java.lang.String>) strSet57);
        builder26.setexcludeFields((java.util.Set<java.lang.String>) strSet57);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = builder26.throttleSize(100);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory63 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder64 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean65 = builder64.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder67 = builder64.script("bulk");
        com.mongodb.BasicDBObject basicDBObject68 = builder67.getmongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript69 = docScoreNativeScriptFactory63.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject68);
        builder26.mongoCollectionFilter = basicDBObject68;
        org.elasticsearch.river.RiverSettings riverSettings71 = new org.elasticsearch.river.RiverSettings(settings22, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject68);
        org.elasticsearch.river.RiverSettings riverSettings72 = new org.elasticsearch.river.RiverSettings(settings21, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject68);
        builder17.mongoOplogFilter = basicDBObject68;
        builder11.setmongoOplogFilter(basicDBObject68);
        boolean boolean75 = builder11.importAllCollections;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(basicDBObject68);
        org.junit.Assert.assertNotNull(executableScript69);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.disableIndexRefresh(false);
        java.lang.String str6 = builder5.getstatisticsTypeName();
        java.lang.String str7 = builder5.riverName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder5.socketTimeout(100);
        boolean boolean10 = builder5.dropCollection;
        java.lang.String str11 = builder5.riverIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder5.riverIndexName("secondary_read_preference");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder13.mongoDb("connect_timeout");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("include_fields", "mongodb-1638820218424");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?mongodb-1638820218424?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString4();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString15();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString17();
        org.elasticsearch.river.RiverSettings riverSettings5 = serializedObjectSupporter0.deserializeObjectRiverSettings6();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString15();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_river" + "'", str1, "_river");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mongodb-1638820218424" + "'", str2, "mongodb-1638820218424");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "mongodb-1638820217755" + "'", str3, "mongodb-1638820217755");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb-1638820218449" + "'", str4, "mongodb-1638820218449");
        org.junit.Assert.assertNotNull(riverSettings5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "mongodb-1638820218424" + "'", str6, "mongodb-1638820218424");
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        builder0.riverName = "concurrent_bulk_requests";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.connectTimeout((int) (byte) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.statisticsTypeName("credentials");
        java.lang.String str10 = builder0.getmongoAdminPassword();
        boolean boolean11 = builder0.getdropCollection();
        boolean boolean12 = builder0.getmongoGridFS();
        com.mongodb.BasicDBObject basicDBObject13 = builder0.getmongoOplogFilter();
        java.lang.String str14 = builder0.typeName;
        java.lang.String str15 = builder0.getriverIndexName();
        boolean boolean16 = builder0.getdropCollection();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(basicDBObject13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder3.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = null;
        builder3.setmongoOplogFilter(basicDBObject6);
        builder3.statisticsIndexName = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder3.throttleSize((int) (short) 0);
        builder3.mongoLocalPassword = "script.disable_dynamic";
        builder3.riverName = "include_fields";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean17 = builder16.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder16.script("bulk");
        com.mongodb.BasicDBObject basicDBObject20 = null;
        builder19.setmongoOplogFilter(basicDBObject20);
        com.mongodb.BasicDBObject basicDBObject22 = null;
        builder19.setmongoOplogFilter(basicDBObject22);
        builder19.statisticsIndexName = "socket_timeout";
        java.lang.String str26 = builder19.riverIndexName;
        boolean boolean27 = builder19.advancedTransformation;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder19.dropCollection(true);
        builder19.skipInitialImport = true;
        builder19.setisMongos((java.lang.Boolean) false);
        builder19.mongoAdminUser = "concurrent_bulk_requests";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean37 = builder36.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder36.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder39.mongoAdminUser("socket_timeout");
        java.lang.String[] strArray83 = new java.lang.String[] { "user", "gridfs", "socket_timeout", "socket_timeout", "exclude_fields", "bulk_timeout", "actions", "disable_index_refresh", "bulk_size", "size", "script.disable_dynamic", "size", "index", "concurrent_requests", "type", "", "concurrent_requests", "script_type", "initial_timestamp", "import_all_collections", "throttle_size", "skip_initial_import", "ssl_verify_certificate", "script", "name", "concurrent_requests", "port", "bulk", "options", "script.disable_dynamic", "size", "", "script.disable_dynamic", "user", "parent_types", "bulk_size", "initial_timestamp", ".scripts", "sandbox", "script", "include_fields" };
        java.util.LinkedHashSet<java.lang.String> strSet84 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet84, strArray83);
        builder41.setincludeFields((java.util.Set<java.lang.String>) strSet84);
        builder19.setexcludeFields((java.util.Set<java.lang.String>) strSet84);
        builder3.parentTypes = strSet84;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString7();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString15();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString10();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString4();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb-1638820218326" + "'", str1, "mongodb-1638820218326");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mongodb-1638820218424" + "'", str2, "mongodb-1638820218424");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_river" + "'", str3, "_river");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_river" + "'", str4, "_river");
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("include_fields", "collection", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?collection?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder3.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = null;
        builder3.setmongoOplogFilter(basicDBObject6);
        builder3.statisticsIndexName = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder3.advancedTransformation(false);
        java.lang.String str12 = builder3.mongoLocalPassword;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.disableIndexRefresh(false);
        java.lang.String str6 = builder5.getstatisticsTypeName();
        builder5.scriptType = "user";
        builder5.includeCollection = "include_fields";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder5.importAllCollections(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder5.scriptType("gridfs");
        builder5.setstatisticsTypeName("advanced_transformation");
        builder5.isMongos = false;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList2 = mongoDBRiverDefinition1.mongoServers;
        org.elasticsearch.common.unit.TimeValue timeValue3 = mongoDBRiverDefinition1.getDEFAULT_FLUSH_INTERVAL();
        java.lang.String str4 = mongoDBRiverDefinition1.getINDEX_OBJECT();
        java.lang.String str5 = mongoDBRiverDefinition1.getSSL_CONNECTION_FIELD();
        java.lang.String str6 = mongoDBRiverDefinition1.getCONCURRENT_BULK_REQUESTS_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition1.getINITIAL_TIMESTAMP_FIELD();
        java.lang.String str8 = mongoDBRiverDefinition1.getCONNECT_TIMEOUT();
        boolean boolean9 = mongoDBRiverDefinition1.getmongoGridFS();
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertNotNull(serverAddressList2);
        org.junit.Assert.assertNotNull(timeValue3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "index" + "'", str4, "index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ssl" + "'", str5, "ssl");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "concurrent_bulk_requests" + "'", str6, "concurrent_bulk_requests");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "initial_timestamp" + "'", str7, "initial_timestamp");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "connect_timeout" + "'", str8, "connect_timeout");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        java.lang.String str2 = builder0.getscript();
        boolean boolean3 = builder0.dropCollection;
        builder0.indexName = "";
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory6 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean8 = builder7.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder7.script("bulk");
        com.mongodb.BasicDBObject basicDBObject11 = builder10.getmongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript12 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject11);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder0.mongoOplogFilter(basicDBObject11);
        builder0.storeStatistics = true;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder0.mongoSSLVerifyCertificate(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder0.mongoDb("admin");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.mongoCollection("script.default_lang");
        java.util.Set<java.lang.String> strSet22 = builder21.parentTypes;
        boolean boolean23 = builder21.getskipInitialImport();
        boolean boolean24 = builder21.getdisableIndexRefresh();
        int int25 = builder21.getconnectTimeout();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(basicDBObject11);
        org.junit.Assert.assertNotNull(executableScript12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNull(strSet22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList2 = mongoDBRiverDefinition1.mongoServers;
        org.elasticsearch.common.unit.TimeValue timeValue3 = mongoDBRiverDefinition1.getDEFAULT_FLUSH_INTERVAL();
        boolean boolean4 = mongoDBRiverDefinition1.dropCollection;
        boolean boolean5 = mongoDBRiverDefinition1.getmongoSecondaryReadPreference();
        boolean boolean6 = mongoDBRiverDefinition1.isMongoSecondaryReadPreference();
        int int7 = mongoDBRiverDefinition1.getDEFAULT_DB_PORT();
        com.mongodb.BasicDBObject basicDBObject8 = mongoDBRiverDefinition1.mongoCollectionFilter;
        java.util.Set<java.lang.String> strSet9 = mongoDBRiverDefinition1.parentTypes;
        java.lang.String str10 = mongoDBRiverDefinition1.getCONCURRENT_REQUESTS_FIELD();
        boolean boolean11 = mongoDBRiverDefinition1.getmongoGridFS();
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertNotNull(serverAddressList2);
        org.junit.Assert.assertNotNull(timeValue3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 27017 + "'", int7 == 27017);
        org.junit.Assert.assertNotNull(basicDBObject8);
        org.junit.Assert.assertNull(strSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "concurrent_requests" + "'", str10, "concurrent_requests");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.lang.String str2 = mongoDBRiverDefinition1.getINDEX_OBJECT();
        java.util.Set<java.lang.String> strSet3 = mongoDBRiverDefinition1.parentTypes;
        java.lang.String str4 = mongoDBRiverDefinition1.riverName;
        boolean boolean5 = mongoDBRiverDefinition1.disableIndexRefresh;
        java.lang.String str6 = mongoDBRiverDefinition1.getScriptType();
        boolean boolean7 = mongoDBRiverDefinition1.isMongoSSLVerifyCertificate();
        boolean boolean8 = mongoDBRiverDefinition1.storeStatistics;
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "index" + "'", str2, "index");
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.disableIndexRefresh(false);
        builder5.indexName = "include_fields";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder5.mongoGridFS(true);
        builder9.setmongoCollection("is_mongos");
        builder9.setmongoGridFS(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList2 = mongoDBRiverDefinition1.mongoServers;
        java.lang.String str3 = mongoDBRiverDefinition1.getBULK_TIMEOUT_FIELD();
        java.util.Set<java.lang.String> strSet4 = mongoDBRiverDefinition1.getParentTypes();
        int int5 = mongoDBRiverDefinition1.throttleSize;
        java.lang.Boolean boolean6 = mongoDBRiverDefinition1.getisMongos();
        java.lang.String str7 = mongoDBRiverDefinition1.getDEFAULT_DB_HOST();
        java.lang.String str8 = mongoDBRiverDefinition1.getCONCURRENT_BULK_REQUESTS_FIELD();
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertNotNull(serverAddressList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "bulk_timeout" + "'", str3, "bulk_timeout");
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(boolean6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "localhost" + "'", str7, "localhost");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "concurrent_bulk_requests" + "'", str8, "concurrent_bulk_requests");
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.lang.String str2 = mongoDBRiverDefinition1.getINDEX_OBJECT();
        java.util.Set<java.lang.String> strSet3 = mongoDBRiverDefinition1.parentTypes;
        java.lang.String str4 = mongoDBRiverDefinition1.riverName;
        boolean boolean5 = mongoDBRiverDefinition1.disableIndexRefresh;
        java.lang.String str6 = mongoDBRiverDefinition1.mongoLocalPassword;
        java.lang.String str7 = mongoDBRiverDefinition1.getIndexName();
        java.lang.Boolean boolean8 = mongoDBRiverDefinition1.getisMongos();
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "index" + "'", str2, "index");
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(boolean8);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.lang.String str2 = mongoDBRiverDefinition1.getINDEX_OBJECT();
        java.util.Set<java.lang.String> strSet3 = mongoDBRiverDefinition1.parentTypes;
        java.lang.String str4 = mongoDBRiverDefinition1.riverName;
        boolean boolean5 = mongoDBRiverDefinition1.disableIndexRefresh;
        com.mongodb.BasicDBObject basicDBObject6 = mongoDBRiverDefinition1.mongoOplogFilter;
        java.util.List<com.mongodb.ServerAddress> serverAddressList7 = mongoDBRiverDefinition1.getMongoServers();
        org.elasticsearch.common.unit.TimeValue timeValue8 = mongoDBRiverDefinition1.getDEFAULT_FLUSH_INTERVAL();
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "index" + "'", str2, "index");
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(basicDBObject6);
        org.junit.Assert.assertNotNull(serverAddressList7);
        org.junit.Assert.assertNotNull(timeValue8);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter2 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str3 = serializedObjectSupporter2.deserializeObjectString4();
        org.elasticsearch.river.RiverSettings riverSettings4 = serializedObjectSupporter2.deserializeObjectRiverSettings3();
        java.lang.String str5 = serializedObjectSupporter2.deserializeObjectString12();
        java.lang.String str6 = serializedObjectSupporter2.deserializeObjectString10();
        org.elasticsearch.river.RiverSettings riverSettings7 = serializedObjectSupporter2.deserializeObjectRiverSettings6();
        org.elasticsearch.script.ScriptService scriptService8 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("size", "mongodb-1638820218299", riverSettings7, scriptService8);
        boolean boolean10 = mongoDBRiverDefinition9.isSkipInitialImport();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_river" + "'", str3, "_river");
        org.junit.Assert.assertNotNull(riverSettings4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_river" + "'", str5, "_river");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_river" + "'", str6, "_river");
        org.junit.Assert.assertNotNull(riverSettings7);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList2 = mongoDBRiverDefinition1.mongoServers;
        java.lang.String str3 = mongoDBRiverDefinition1.getBULK_TIMEOUT_FIELD();
        java.util.Set<java.lang.String> strSet4 = mongoDBRiverDefinition1.getParentTypes();
        int int5 = mongoDBRiverDefinition1.throttleSize;
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = mongoDBRiverDefinition1.getInitialTimestamp();
        boolean boolean7 = mongoDBRiverDefinition1.getmongoUseSSL();
        java.lang.String str8 = mongoDBRiverDefinition1.getCONCURRENT_BULK_REQUESTS_FIELD();
        boolean boolean9 = mongoDBRiverDefinition1.isImportAllCollections();
        int int10 = mongoDBRiverDefinition1.getDEFAULT_CONNECT_TIMEOUT();
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertNotNull(serverAddressList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "bulk_timeout" + "'", str3, "bulk_timeout");
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "concurrent_bulk_requests" + "'", str8, "concurrent_bulk_requests");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 30000 + "'", int10 == 30000);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        java.lang.String str2 = builder0.getscript();
        boolean boolean3 = builder0.dropCollection;
        builder0.indexName = "";
        java.util.Set<java.lang.String> strSet6 = builder0.excludeFields;
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = builder0.getinitialTimestamp();
        builder0.setmongoSSLVerifyCertificate(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.disableIndexRefresh(false);
        java.lang.String str6 = builder5.getstatisticsTypeName();
        java.lang.String str7 = builder5.riverName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder5.mongoAdminPassword("size");
        builder9.setmongoCollection("advanced_transformation");
        boolean boolean12 = builder9.getdropCollection();
        boolean boolean13 = builder9.getmongoSecondaryReadPreference();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.util.Set<java.lang.String> strSet15 = builder14.getexcludeFields();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder14.mongoLocalUser("credentials");
        java.lang.String str18 = builder17.script;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean20 = builder19.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder19.script("bulk");
        com.mongodb.BasicDBObject basicDBObject23 = null;
        builder22.setmongoOplogFilter(basicDBObject23);
        com.mongodb.BasicDBObject basicDBObject25 = null;
        builder22.setmongoOplogFilter(basicDBObject25);
        builder22.statisticsIndexName = "socket_timeout";
        builder22.setconnectTimeout((int) (byte) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean32 = builder31.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder31.script("bulk");
        com.mongodb.BasicDBObject basicDBObject35 = null;
        builder34.setmongoOplogFilter(basicDBObject35);
        com.mongodb.BasicDBObject basicDBObject37 = null;
        builder34.setmongoOplogFilter(basicDBObject37);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean40 = builder39.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder39.script("bulk");
        builder42.skipInitialImport = false;
        builder42.setscriptType("script");
        java.lang.String[] strArray64 = new java.lang.String[] { "exclude_fields", "servers", "secondary_read_preference", "name", "exclude_fields", "bulk_timeout", "skip_initial_import", "bulk", "script", "disable_index_refresh", "script.default_lang", "skip_initial_import", "gridfs", "user", "port", "parent_types", "size" };
        java.util.LinkedHashSet<java.lang.String> strSet65 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet65, strArray64);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder67 = builder42.excludeFields((java.util.Set<java.lang.String>) strSet65);
        builder34.setexcludeFields((java.util.Set<java.lang.String>) strSet65);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder69 = builder22.includeFields((java.util.Set<java.lang.String>) strSet65);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder70 = builder17.excludeFields((java.util.Set<java.lang.String>) strSet65);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder71 = builder9.excludeFields((java.util.Set<java.lang.String>) strSet65);
        boolean boolean72 = builder9.mongoSSLVerifyCertificate;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(strSet15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertNotNull(builder71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.lang.String str2 = mongoDBRiverDefinition1.getINDEX_OBJECT();
        java.util.Set<java.lang.String> strSet3 = mongoDBRiverDefinition1.parentTypes;
        java.lang.String str4 = mongoDBRiverDefinition1.riverName;
        boolean boolean5 = mongoDBRiverDefinition1.disableIndexRefresh;
        java.util.List<com.mongodb.ServerAddress> serverAddressList6 = mongoDBRiverDefinition1.getMongoServers();
        boolean boolean7 = mongoDBRiverDefinition1.getdropCollection();
        java.lang.String str8 = mongoDBRiverDefinition1.getSCRIPT_FIELD();
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "index" + "'", str2, "index");
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(serverAddressList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "script" + "'", str8, "script");
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder3.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = null;
        builder3.setmongoOplogFilter(basicDBObject6);
        builder3.statisticsIndexName = "socket_timeout";
        java.lang.String str10 = builder3.riverIndexName;
        boolean boolean11 = builder3.advancedTransformation;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder3.dropCollection(true);
        builder13.disableIndexRefresh = true;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString7();
        org.elasticsearch.river.RiverSettings riverSettings2 = serializedObjectSupporter0.deserializeObjectRiverSettings4();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString17();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString6();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb-1638820218326" + "'", str1, "mongodb-1638820218326");
        org.junit.Assert.assertNotNull(riverSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "mongodb-1638820218449" + "'", str3, "mongodb-1638820218449");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_river" + "'", str4, "_river");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_river" + "'", str5, "_river");
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString7();
        org.elasticsearch.river.RiverSettings riverSettings2 = serializedObjectSupporter0.deserializeObjectRiverSettings6();
        org.elasticsearch.common.settings.Settings settings3 = riverSettings2.globalSettings();
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory4 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter5 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str6 = serializedObjectSupporter5.deserializeObjectString4();
        org.elasticsearch.river.RiverSettings riverSettings7 = serializedObjectSupporter5.deserializeObjectRiverSettings3();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = riverSettings7.settings();
        org.elasticsearch.script.ExecutableScript executableScript9 = docScoreNativeScriptFactory4.newScript(strMap8);
        org.elasticsearch.river.RiverSettings riverSettings10 = new org.elasticsearch.river.RiverSettings(settings3, strMap8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.script("store_statistics");
        java.lang.String str14 = builder13.mongoCollection;
        java.lang.String str15 = builder13.getincludeCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder13.mongoGridFS(false);
        com.mongodb.BasicDBObject basicDBObject18 = builder17.getmongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings19 = new org.elasticsearch.river.RiverSettings(settings3, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean21 = builder20.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder20.script("bulk");
        com.mongodb.BasicDBObject basicDBObject24 = null;
        builder23.setmongoOplogFilter(basicDBObject24);
        com.mongodb.BasicDBObject basicDBObject26 = null;
        builder23.setmongoOplogFilter(basicDBObject26);
        builder23.statisticsIndexName = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder23.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean33 = builder32.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder32.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder32.disableIndexRefresh(false);
        java.lang.String str38 = builder37.getstatisticsTypeName();
        builder37.setmongoGridFS(true);
        org.elasticsearch.common.settings.Settings settings41 = null;
        org.elasticsearch.common.settings.Settings settings42 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean44 = builder43.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder43.script("bulk");
        com.mongodb.BasicDBObject basicDBObject47 = null;
        builder46.setmongoOplogFilter(basicDBObject47);
        com.mongodb.BasicDBObject basicDBObject49 = null;
        builder46.setmongoOplogFilter(basicDBObject49);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean52 = builder51.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder51.script("bulk");
        builder54.skipInitialImport = false;
        builder54.setscriptType("script");
        java.lang.String[] strArray76 = new java.lang.String[] { "exclude_fields", "servers", "secondary_read_preference", "name", "exclude_fields", "bulk_timeout", "skip_initial_import", "bulk", "script", "disable_index_refresh", "script.default_lang", "skip_initial_import", "gridfs", "user", "port", "parent_types", "size" };
        java.util.LinkedHashSet<java.lang.String> strSet77 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet77, strArray76);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder79 = builder54.excludeFields((java.util.Set<java.lang.String>) strSet77);
        builder46.setexcludeFields((java.util.Set<java.lang.String>) strSet77);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder82 = builder46.throttleSize(100);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory83 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder84 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean85 = builder84.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder87 = builder84.script("bulk");
        com.mongodb.BasicDBObject basicDBObject88 = builder87.getmongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript89 = docScoreNativeScriptFactory83.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject88);
        builder46.mongoCollectionFilter = basicDBObject88;
        org.elasticsearch.river.RiverSettings riverSettings91 = new org.elasticsearch.river.RiverSettings(settings42, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject88);
        org.elasticsearch.river.RiverSettings riverSettings92 = new org.elasticsearch.river.RiverSettings(settings41, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject88);
        builder37.mongoOplogFilter = basicDBObject88;
        builder31.setmongoOplogFilter(basicDBObject88);
        org.elasticsearch.river.RiverSettings riverSettings95 = new org.elasticsearch.river.RiverSettings(settings3, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject88);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb-1638820218326" + "'", str1, "mongodb-1638820218326");
        org.junit.Assert.assertNotNull(riverSettings2);
        org.junit.Assert.assertNotNull(settings3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_river" + "'", str6, "_river");
        org.junit.Assert.assertNotNull(riverSettings7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(executableScript9);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(basicDBObject18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(builder79);
        org.junit.Assert.assertNotNull(builder82);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(builder87);
        org.junit.Assert.assertNotNull(basicDBObject88);
        org.junit.Assert.assertNotNull(executableScript89);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder3.mongoAdminUser("socket_timeout");
        java.lang.String str6 = builder5.mongoAdminPassword;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.lang.String str2 = mongoDBRiverDefinition1.getINDEX_OBJECT();
        java.util.Set<java.lang.String> strSet3 = mongoDBRiverDefinition1.parentTypes;
        boolean boolean4 = mongoDBRiverDefinition1.isStoreStatistics();
        boolean boolean5 = mongoDBRiverDefinition1.isStoreStatistics();
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "index" + "'", str2, "index");
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        builder0.riverName = "concurrent_bulk_requests";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.isMongos((java.lang.Boolean) true);
        builder0.settypeName("port");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder3.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = null;
        builder3.setmongoOplogFilter(basicDBObject6);
        boolean boolean8 = builder3.mongoGridFS;
        java.lang.String[] strArray51 = new java.lang.String[] { "credentials", "script.default_lang", "admin", "servers", "bulk", "script_type", "filter", "drop_collection", "local", "options", "store_statistics", "import_all_collections", "", "user", "secondary_read_preference", "actions", "concurrent_requests", "exclude_fields", "script_type", "exclude_fields", "socket_timeout", "admin", "filter", "user", "throttle_size", "bulk_timeout", "name", "local", "local", "skip_initial_import", "filter", ".scripts", "store_statistics", "concurrent_requests", "gridfs", "collection", "password", "script_type", "socket_timeout", "ssl_verify_certificate", "store_statistics", "size" };
        java.util.LinkedHashSet<java.lang.String> strSet52 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet52, strArray51);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder3.includeFields((java.util.Set<java.lang.String>) strSet52);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder3.throttleSize((int) (byte) 0);
        builder3.storeStatistics = true;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder56);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList2 = mongoDBRiverDefinition1.mongoServers;
        org.elasticsearch.common.unit.TimeValue timeValue3 = mongoDBRiverDefinition1.getDEFAULT_FLUSH_INTERVAL();
        boolean boolean4 = mongoDBRiverDefinition1.dropCollection;
        boolean boolean5 = mongoDBRiverDefinition1.isMongoSecondaryReadPreference();
        java.lang.String str6 = mongoDBRiverDefinition1.getStatisticsTypeName();
        java.lang.String str7 = mongoDBRiverDefinition1.getMongoLocalPassword();
        java.lang.String str8 = mongoDBRiverDefinition1.getIndexName();
        boolean boolean9 = mongoDBRiverDefinition1.isMongoSSLVerifyCertificate();
        java.lang.String str10 = mongoDBRiverDefinition1.getFILTER_FIELD();
        java.lang.String str11 = mongoDBRiverDefinition1.getUSER_FIELD();
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertNotNull(serverAddressList2);
        org.junit.Assert.assertNotNull(timeValue3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "filter" + "'", str10, "filter");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "user" + "'", str11, "user");
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder3.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = null;
        builder3.setmongoOplogFilter(basicDBObject6);
        builder3.statisticsIndexName = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder3.throttleSize((int) (short) 0);
        boolean boolean12 = builder11.getmongoUseSSL();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder11.mongoLocalUser("mongodb-1638820218299");
        builder14.disableIndexRefresh = true;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean3 = builder2.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.script("bulk");
        builder2.riverName = "concurrent_bulk_requests";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder2.connectTimeout((int) (byte) 10);
        docScoreSearchScript0.setNextVar("port", (java.lang.Object) builder9);
        docScoreSearchScript0.setNextScore((float) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean15 = builder14.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder14.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder14.disableIndexRefresh(false);
        builder19.setthrottleSize((int) ' ');
        boolean boolean22 = builder19.getadvancedTransformation();
        java.lang.String str23 = builder19.mongoLocalPassword;
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter24 = null;
        builder19.serializedObjectSupporter = serializedObjectSupporter24;
        java.lang.String str26 = builder19.getincludeCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder19.isMongos((java.lang.Boolean) true);
        builder19.setindexName("script.default_lang");
        java.lang.String str31 = builder19.mongoAdminPassword;
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp32 = builder19.getinitialTimestamp();
        docScoreSearchScript0.setNextVar("import_all_collections", (java.lang.Object) builder19);
        docScoreSearchScript0.setNextScore((float) (byte) -1);
        org.apache.lucene.index.AtomicReaderContext atomicReaderContext36 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextReader(atomicReaderContext36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNull(wildcardTimestamp32);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder3.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = null;
        builder3.setmongoOplogFilter(basicDBObject6);
        builder3.statisticsIndexName = "socket_timeout";
        java.lang.String str10 = builder3.riverIndexName;
        boolean boolean11 = builder3.advancedTransformation;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder3.dropCollection(true);
        builder3.skipInitialImport = true;
        boolean boolean16 = builder3.dropCollection;
        builder3.setriverIndexName("");
        builder3.setmongoDb("port");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.lang.String str2 = mongoDBRiverDefinition1.getINDEX_OBJECT();
        java.util.Set<java.lang.String> strSet3 = mongoDBRiverDefinition1.parentTypes;
        boolean boolean4 = mongoDBRiverDefinition1.isStoreStatistics();
        boolean boolean5 = mongoDBRiverDefinition1.dropCollection;
        java.lang.String str6 = mongoDBRiverDefinition1.getCOLLECTION_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition1.getCOLLECTION_FIELD();
        java.lang.String str8 = mongoDBRiverDefinition1.getFILTER_FIELD();
        java.util.List<com.mongodb.ServerAddress> serverAddressList9 = mongoDBRiverDefinition1.mongoServers;
        java.lang.String str10 = mongoDBRiverDefinition1.mongoCollection;
        java.lang.String str11 = mongoDBRiverDefinition1.getIndexName();
        java.lang.String str12 = mongoDBRiverDefinition1.getINDEX_OBJECT();
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "index" + "'", str2, "index");
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "collection" + "'", str6, "collection");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "collection" + "'", str7, "collection");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "filter" + "'", str8, "filter");
        org.junit.Assert.assertNotNull(serverAddressList9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "index" + "'", str12, "index");
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder3.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = null;
        builder3.setmongoOplogFilter(basicDBObject6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean9 = builder8.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder8.script("bulk");
        builder11.skipInitialImport = false;
        builder11.setscriptType("script");
        java.lang.String[] strArray33 = new java.lang.String[] { "exclude_fields", "servers", "secondary_read_preference", "name", "exclude_fields", "bulk_timeout", "skip_initial_import", "bulk", "script", "disable_index_refresh", "script.default_lang", "skip_initial_import", "gridfs", "user", "port", "parent_types", "size" };
        java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder11.excludeFields((java.util.Set<java.lang.String>) strSet34);
        builder3.setexcludeFields((java.util.Set<java.lang.String>) strSet34);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder3.throttleSize(100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder3.riverIndexName("bulk_timeout");
        builder3.mongoGridFS = false;
        com.mongodb.MongoClientOptions mongoClientOptions44 = null;
        builder3.setmongoClientOptions(mongoClientOptions44);
        builder3.setindexName("credentials");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.disableIndexRefresh(false);
        java.lang.String str6 = builder5.getstatisticsTypeName();
        java.lang.String str7 = builder5.riverName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder5.socketTimeout(100);
        boolean boolean10 = builder5.dropCollection;
        java.lang.String str11 = builder5.riverIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder5.riverIndexName("secondary_read_preference");
        builder13.mongoGridFS = true;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder13.mongoLocalUser("exclude_fields");
        java.util.List<com.mongodb.ServerAddress> serverAddressList18 = builder13.mongoServers;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(serverAddressList18);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder3.mongoAdminUser("socket_timeout");
        java.lang.String str6 = builder5.riverName;
        com.mongodb.BasicDBObject basicDBObject7 = builder5.mongoCollectionFilter;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder5.includeCollection("disable_index_refresh");
        boolean boolean10 = builder5.getdropCollection();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(basicDBObject7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        builder3.skipInitialImport = false;
        builder3.setscriptType("script");
        java.lang.String[] strArray25 = new java.lang.String[] { "exclude_fields", "servers", "secondary_read_preference", "name", "exclude_fields", "bulk_timeout", "skip_initial_import", "bulk", "script", "disable_index_refresh", "script.default_lang", "skip_initial_import", "gridfs", "user", "port", "parent_types", "size" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder3.excludeFields((java.util.Set<java.lang.String>) strSet26);
        builder3.setscript("local");
        java.util.Set<java.lang.String> strSet31 = builder3.getexcludeFields();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder3.riverIndexName("filter");
        java.lang.String str34 = builder3.getscriptType();
        builder3.skipInitialImport = true;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "script" + "'", str34, "script");
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.disableIndexRefresh(false);
        java.lang.String str6 = builder0.mongoAdminUser;
        java.lang.String str7 = builder0.getmongoAdminUser();
        int int8 = builder0.connectTimeout;
        org.bson.types.Binary binary9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.initialTimestamp(binary9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean3 = builder2.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.script("bulk");
        builder2.riverName = "concurrent_bulk_requests";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder2.connectTimeout((int) (byte) 10);
        docScoreSearchScript0.setNextVar("port", (java.lang.Object) builder9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition12 = builder11.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList13 = mongoDBRiverDefinition12.mongoServers;
        org.elasticsearch.common.unit.TimeValue timeValue14 = mongoDBRiverDefinition12.getDEFAULT_FLUSH_INTERVAL();
        boolean boolean15 = mongoDBRiverDefinition12.dropCollection;
        boolean boolean16 = mongoDBRiverDefinition12.isMongoSecondaryReadPreference();
        java.lang.Object obj17 = docScoreSearchScript0.unwrap((java.lang.Object) boolean16);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition19 = builder18.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList20 = mongoDBRiverDefinition19.mongoServers;
        org.elasticsearch.common.unit.TimeValue timeValue21 = mongoDBRiverDefinition19.getDEFAULT_FLUSH_INTERVAL();
        boolean boolean22 = mongoDBRiverDefinition19.dropCollection;
        boolean boolean23 = mongoDBRiverDefinition19.isMongoSecondaryReadPreference();
        java.lang.String str24 = mongoDBRiverDefinition19.getStatisticsTypeName();
        java.lang.String str25 = mongoDBRiverDefinition19.getMongoLocalPassword();
        java.lang.String str26 = mongoDBRiverDefinition19.getIndexName();
        boolean boolean27 = mongoDBRiverDefinition19.mongoUseSSL;
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp28 = mongoDBRiverDefinition19.getInitialTimestamp();
        boolean boolean29 = mongoDBRiverDefinition19.getstoreStatistics();
        java.lang.Object obj30 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition19);
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition34 = builder33.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList35 = mongoDBRiverDefinition34.mongoServers;
        org.elasticsearch.common.unit.TimeValue timeValue36 = mongoDBRiverDefinition34.getDEFAULT_FLUSH_INTERVAL();
        boolean boolean37 = mongoDBRiverDefinition34.dropCollection;
        boolean boolean38 = mongoDBRiverDefinition34.isMongoSecondaryReadPreference();
        java.lang.String str39 = mongoDBRiverDefinition34.getStatisticsTypeName();
        java.lang.String str40 = mongoDBRiverDefinition34.getMongoLocalPassword();
        java.lang.String str41 = mongoDBRiverDefinition34.getIndexName();
        boolean boolean42 = mongoDBRiverDefinition34.mongoUseSSL;
        java.lang.String str43 = mongoDBRiverDefinition34.getSOCKET_TIMEOUT();
        boolean boolean44 = mongoDBRiverDefinition34.getmongoSecondaryReadPreference();
        int int45 = mongoDBRiverDefinition34.connectTimeout;
        boolean boolean46 = mongoDBRiverDefinition34.isDisableIndexRefresh();
        boolean boolean47 = mongoDBRiverDefinition34.skipInitialImport;
        java.lang.Boolean boolean48 = mongoDBRiverDefinition34.isMongos();
        java.lang.Object obj49 = docScoreSearchScript0.unwrap((java.lang.Object) boolean48);
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextDocId(60000);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition12);
        org.junit.Assert.assertNotNull(serverAddressList13);
        org.junit.Assert.assertNotNull(timeValue14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + false + "'", obj17, false);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition19);
        org.junit.Assert.assertNotNull(serverAddressList20);
        org.junit.Assert.assertNotNull(timeValue21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(wildcardTimestamp28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition34);
        org.junit.Assert.assertNotNull(serverAddressList35);
        org.junit.Assert.assertNotNull(timeValue36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "socket_timeout" + "'", str43, "socket_timeout");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(boolean48);
        org.junit.Assert.assertNull(obj49);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("filter", (java.lang.Object) "gridfs");
        org.apache.lucene.search.Scorer scorer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setScorer(scorer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder3.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = null;
        builder3.setmongoOplogFilter(basicDBObject6);
        builder3.statisticsIndexName = "socket_timeout";
        java.lang.String str10 = builder3.riverIndexName;
        boolean boolean11 = builder3.advancedTransformation;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder3.scriptType("type");
        java.lang.String str14 = builder3.getscriptType();
        builder3.setriverIndexName("mongodb-1638820218424");
        builder3.indexName = "concurrent_bulk_requests";
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "type" + "'", str14, "type");
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        builder3.skipInitialImport = false;
        builder3.setscriptType("script");
        java.lang.String[] strArray25 = new java.lang.String[] { "exclude_fields", "servers", "secondary_read_preference", "name", "exclude_fields", "bulk_timeout", "skip_initial_import", "bulk", "script", "disable_index_refresh", "script.default_lang", "skip_initial_import", "gridfs", "user", "port", "parent_types", "size" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder3.excludeFields((java.util.Set<java.lang.String>) strSet26);
        builder3.setscript("local");
        java.util.Set<java.lang.String> strSet31 = builder3.getexcludeFields();
        java.lang.String str32 = builder3.typeName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition34 = builder33.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList35 = mongoDBRiverDefinition34.mongoServers;
        org.elasticsearch.common.unit.TimeValue timeValue36 = mongoDBRiverDefinition34.getDEFAULT_FLUSH_INTERVAL();
        boolean boolean37 = mongoDBRiverDefinition34.dropCollection;
        boolean boolean38 = mongoDBRiverDefinition34.getmongoSecondaryReadPreference();
        boolean boolean39 = mongoDBRiverDefinition34.isMongoSecondaryReadPreference();
        java.util.List<com.mongodb.ServerAddress> serverAddressList40 = mongoDBRiverDefinition34.mongoServers;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder3.mongoServers(serverAddressList40);
        java.lang.String str42 = builder41.getriverIndexName();
        boolean boolean43 = builder41.getadvancedTransformation();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition34);
        org.junit.Assert.assertNotNull(serverAddressList35);
        org.junit.Assert.assertNotNull(timeValue36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(serverAddressList40);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.disableIndexRefresh(false);
        int int6 = builder0.getsocketTimeout();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.dropCollection(true);
        boolean boolean9 = builder8.getdropCollection();
        builder8.mongoSecondaryReadPreference = false;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean3 = builder2.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.script("bulk");
        builder2.riverName = "concurrent_bulk_requests";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder2.connectTimeout((int) (byte) 10);
        docScoreSearchScript0.setNextVar("port", (java.lang.Object) builder9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean12 = builder11.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder11.script("bulk");
        builder11.riverName = "concurrent_bulk_requests";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder11.connectTimeout((int) (byte) 10);
        java.lang.Object obj19 = docScoreSearchScript0.unwrap((java.lang.Object) builder18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean21 = builder20.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder20.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder20.disableIndexRefresh(false);
        java.lang.String str26 = builder25.getstatisticsTypeName();
        java.util.Set<java.lang.String> strSet27 = builder25.excludeFields;
        java.lang.Object obj28 = docScoreSearchScript0.unwrap((java.lang.Object) strSet27);
        docScoreSearchScript0.setNextScore((float) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double31 = docScoreSearchScript0.runAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(strSet27);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder3.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = null;
        builder3.setmongoOplogFilter(basicDBObject6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder3.riverIndexName("socket_timeout");
        java.lang.String str10 = builder9.getriverName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder9.advancedTransformation(true);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = builder9.initialTimestamp;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder9.riverIndexName("mongodb-1638820218408");
        java.lang.String str16 = builder15.getstatisticsTypeName();
        java.lang.String str17 = builder15.getriverIndexName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(wildcardTimestamp13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "mongodb-1638820218408" + "'", str17, "mongodb-1638820218408");
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        builder0.riverName = "concurrent_bulk_requests";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.connectTimeout((int) (byte) 10);
        builder7.setadvancedTransformation(false);
        java.util.Set<java.lang.String> strSet10 = builder7.getexcludeFields();
        com.mongodb.BasicDBObject basicDBObject11 = builder7.mongoCollectionFilter;
        java.util.Set<java.lang.String> strSet12 = builder7.parentTypes;
        builder7.throttleSize = (-1);
        java.lang.Boolean boolean15 = builder7.getisMongos();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(strSet10);
        org.junit.Assert.assertNotNull(basicDBObject11);
        org.junit.Assert.assertNull(strSet12);
        org.junit.Assert.assertNull(boolean15);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder3.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = null;
        builder3.setmongoOplogFilter(basicDBObject6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean9 = builder8.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder8.script("bulk");
        builder11.skipInitialImport = false;
        builder11.setscriptType("script");
        java.lang.String[] strArray33 = new java.lang.String[] { "exclude_fields", "servers", "secondary_read_preference", "name", "exclude_fields", "bulk_timeout", "skip_initial_import", "bulk", "script", "disable_index_refresh", "script.default_lang", "skip_initial_import", "gridfs", "user", "port", "parent_types", "size" };
        java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder11.excludeFields((java.util.Set<java.lang.String>) strSet34);
        builder3.setexcludeFields((java.util.Set<java.lang.String>) strSet34);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean39 = builder38.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder38.script("bulk");
        builder38.riverName = "concurrent_bulk_requests";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean45 = builder44.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder44.script("bulk");
        builder47.skipInitialImport = false;
        builder47.setscriptType("script");
        java.lang.String[] strArray69 = new java.lang.String[] { "exclude_fields", "servers", "secondary_read_preference", "name", "exclude_fields", "bulk_timeout", "skip_initial_import", "bulk", "script", "disable_index_refresh", "script.default_lang", "skip_initial_import", "gridfs", "user", "port", "parent_types", "size" };
        java.util.LinkedHashSet<java.lang.String> strSet70 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet70, strArray69);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder72 = builder47.excludeFields((java.util.Set<java.lang.String>) strSet70);
        builder38.setparentTypes((java.util.Set<java.lang.String>) strSet70);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder74 = builder3.includeFields((java.util.Set<java.lang.String>) strSet70);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder76 = builder3.throttleSize(1000);
        builder76.setskipInitialImport(false);
        builder76.setstatisticsTypeName("localhost");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder82 = builder76.indexName("script_type");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertNotNull(builder76);
        org.junit.Assert.assertNotNull(builder82);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("_river", "db", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?db?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder3.mongoAdminUser("socket_timeout");
        java.lang.String str6 = builder5.riverName;
        builder5.disableIndexRefresh = false;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean10 = builder9.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder9.script("bulk");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter13 = null;
        builder9.serializedObjectSupporter = serializedObjectSupporter13;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder9.mongoAdminPassword("options");
        boolean boolean17 = builder16.getmongoGridFS();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean19 = builder18.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder18.script("bulk");
        builder21.skipInitialImport = false;
        builder21.setscriptType("script");
        java.lang.String[] strArray43 = new java.lang.String[] { "exclude_fields", "servers", "secondary_read_preference", "name", "exclude_fields", "bulk_timeout", "skip_initial_import", "bulk", "script", "disable_index_refresh", "script.default_lang", "skip_initial_import", "gridfs", "user", "port", "parent_types", "size" };
        java.util.LinkedHashSet<java.lang.String> strSet44 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet44, strArray43);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder21.excludeFields((java.util.Set<java.lang.String>) strSet44);
        builder16.setparentTypes((java.util.Set<java.lang.String>) strSet44);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder5.includeFields((java.util.Set<java.lang.String>) strSet44);
        java.lang.String str49 = builder5.mongoCollection;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNull(str49);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.lang.String str2 = mongoDBRiverDefinition1.getINDEX_OBJECT();
        java.util.Set<java.lang.String> strSet3 = mongoDBRiverDefinition1.parentTypes;
        java.lang.String str4 = mongoDBRiverDefinition1.riverName;
        boolean boolean5 = mongoDBRiverDefinition1.disableIndexRefresh;
        java.lang.String str6 = mongoDBRiverDefinition1.riverIndexName;
        java.lang.String str7 = mongoDBRiverDefinition1.getRiverName();
        java.lang.String str8 = mongoDBRiverDefinition1.getUSER_FIELD();
        java.lang.String str9 = mongoDBRiverDefinition1.getSCRIPT_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition1.getCONCURRENT_REQUESTS_FIELD();
        java.lang.String str11 = mongoDBRiverDefinition1.getINITIAL_TIMESTAMP_FIELD();
        java.lang.String str12 = mongoDBRiverDefinition1.getIMPORT_ALL_COLLECTIONS_FIELD();
        boolean boolean13 = mongoDBRiverDefinition1.isStoreStatistics();
        java.lang.String str14 = mongoDBRiverDefinition1.getCONCURRENT_BULK_REQUESTS_FIELD();
        com.mongodb.BasicDBObject basicDBObject15 = mongoDBRiverDefinition1.getMongoCollectionFilter();
        java.lang.String str16 = mongoDBRiverDefinition1.getOPTIONS_FIELD();
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "index" + "'", str2, "index");
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "user" + "'", str8, "user");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "script" + "'", str9, "script");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "concurrent_requests" + "'", str10, "concurrent_requests");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "initial_timestamp" + "'", str11, "initial_timestamp");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "import_all_collections" + "'", str12, "import_all_collections");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "concurrent_bulk_requests" + "'", str14, "concurrent_bulk_requests");
        org.junit.Assert.assertNotNull(basicDBObject15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "options" + "'", str16, "options");
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean3 = builder2.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.script("bulk");
        builder2.riverName = "concurrent_bulk_requests";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder2.connectTimeout((int) (byte) 10);
        docScoreSearchScript0.setNextVar("port", (java.lang.Object) builder9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition12 = builder11.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList13 = mongoDBRiverDefinition12.mongoServers;
        org.elasticsearch.common.unit.TimeValue timeValue14 = mongoDBRiverDefinition12.getDEFAULT_FLUSH_INTERVAL();
        boolean boolean15 = mongoDBRiverDefinition12.dropCollection;
        boolean boolean16 = mongoDBRiverDefinition12.isMongoSecondaryReadPreference();
        java.lang.Object obj17 = docScoreSearchScript0.unwrap((java.lang.Object) boolean16);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition19 = builder18.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList20 = mongoDBRiverDefinition19.mongoServers;
        org.elasticsearch.common.unit.TimeValue timeValue21 = mongoDBRiverDefinition19.getDEFAULT_FLUSH_INTERVAL();
        boolean boolean22 = mongoDBRiverDefinition19.dropCollection;
        boolean boolean23 = mongoDBRiverDefinition19.isMongoSecondaryReadPreference();
        java.lang.String str24 = mongoDBRiverDefinition19.getStatisticsTypeName();
        java.lang.String str25 = mongoDBRiverDefinition19.getMongoLocalPassword();
        java.lang.String str26 = mongoDBRiverDefinition19.getIndexName();
        boolean boolean27 = mongoDBRiverDefinition19.mongoUseSSL;
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp28 = mongoDBRiverDefinition19.getInitialTimestamp();
        boolean boolean29 = mongoDBRiverDefinition19.getstoreStatistics();
        java.lang.Object obj30 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition19);
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean35 = builder34.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder34.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder37.mongoAdminUser("socket_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder39.throttleSize(27017);
        docScoreSearchScript0.setNextVar(".scripts", (java.lang.Object) builder39);
        org.apache.lucene.search.Scorer scorer43 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setScorer(scorer43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition12);
        org.junit.Assert.assertNotNull(serverAddressList13);
        org.junit.Assert.assertNotNull(timeValue14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + false + "'", obj17, false);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition19);
        org.junit.Assert.assertNotNull(serverAddressList20);
        org.junit.Assert.assertNotNull(timeValue21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(wildcardTimestamp28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList2 = mongoDBRiverDefinition1.mongoServers;
        org.elasticsearch.common.unit.TimeValue timeValue3 = mongoDBRiverDefinition1.getDEFAULT_FLUSH_INTERVAL();
        java.lang.String str4 = mongoDBRiverDefinition1.getINDEX_OBJECT();
        int int5 = mongoDBRiverDefinition1.getDEFAULT_DB_PORT();
        int int6 = mongoDBRiverDefinition1.socketTimeout;
        java.lang.String str7 = mongoDBRiverDefinition1.getNAME_FIELD();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = mongoDBRiverDefinition1.initialTimestamp;
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertNotNull(serverAddressList2);
        org.junit.Assert.assertNotNull(timeValue3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "index" + "'", str4, "index");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27017 + "'", int5 == 27017);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "name" + "'", str7, "name");
        org.junit.Assert.assertNull(wildcardTimestamp8);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder3.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = null;
        builder3.setmongoOplogFilter(basicDBObject6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder3.riverIndexName("socket_timeout");
        java.lang.String str10 = builder9.getriverName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder9.throttleSize(1000);
        builder9.setmongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder9.importAllCollections(false);
        builder16.setconnectTimeout((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.lang.String str2 = mongoDBRiverDefinition1.getINDEX_OBJECT();
        java.util.Set<java.lang.String> strSet3 = mongoDBRiverDefinition1.parentTypes;
        boolean boolean4 = mongoDBRiverDefinition1.isStoreStatistics();
        boolean boolean5 = mongoDBRiverDefinition1.importAllCollections;
        java.lang.String str6 = mongoDBRiverDefinition1.mongoAdminPassword;
        com.mongodb.BasicDBObject basicDBObject7 = mongoDBRiverDefinition1.getMongoCollectionFilter();
        boolean boolean8 = mongoDBRiverDefinition1.mongoSecondaryReadPreference;
        boolean boolean9 = mongoDBRiverDefinition1.importAllCollections;
        java.lang.String str10 = mongoDBRiverDefinition1.getSIZE_FIELD();
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "index" + "'", str2, "index");
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(basicDBObject7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "size" + "'", str10, "size");
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.lang.String str2 = mongoDBRiverDefinition1.getINDEX_OBJECT();
        java.util.Set<java.lang.String> strSet3 = mongoDBRiverDefinition1.parentTypes;
        java.lang.String str4 = mongoDBRiverDefinition1.riverName;
        java.lang.String str5 = mongoDBRiverDefinition1.getScriptType();
        java.lang.String str6 = mongoDBRiverDefinition1.mongoLocalPassword;
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue7 = mongoDBRiverDefinition1.getDEFAULT_BULK_SIZE();
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "index" + "'", str2, "index");
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(byteSizeValue7);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.lang.String str2 = mongoDBRiverDefinition1.getINDEX_OBJECT();
        java.util.Set<java.lang.String> strSet3 = mongoDBRiverDefinition1.parentTypes;
        java.lang.String str4 = mongoDBRiverDefinition1.riverName;
        boolean boolean5 = mongoDBRiverDefinition1.disableIndexRefresh;
        java.lang.String str6 = mongoDBRiverDefinition1.riverIndexName;
        java.lang.String str7 = mongoDBRiverDefinition1.getRiverName();
        java.lang.String str8 = mongoDBRiverDefinition1.getUSER_FIELD();
        java.lang.String str9 = mongoDBRiverDefinition1.getSCRIPT_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition1.getNAME_FIELD();
        int int11 = mongoDBRiverDefinition1.getDEFAULT_CONCURRENT_REQUESTS();
        boolean boolean12 = mongoDBRiverDefinition1.getstoreStatistics();
        java.lang.String str13 = mongoDBRiverDefinition1.getSIZE_FIELD();
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "index" + "'", str2, "index");
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "user" + "'", str8, "user");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "script" + "'", str9, "script");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "name" + "'", str10, "name");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "size" + "'", str13, "size");
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString7();
        org.elasticsearch.river.RiverSettings riverSettings2 = serializedObjectSupporter0.deserializeObjectRiverSettings4();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString17();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString6();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb-1638820218326" + "'", str1, "mongodb-1638820218326");
        org.junit.Assert.assertNotNull(riverSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "mongodb-1638820218449" + "'", str3, "mongodb-1638820218449");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_river" + "'", str4, "_river");
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter4 = null;
        builder0.serializedObjectSupporter = serializedObjectSupporter4;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.mongoAdminPassword("options");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.isMongos((java.lang.Boolean) false);
        java.lang.String str10 = builder9.mongoAdminUser;
        boolean boolean11 = builder9.advancedTransformation;
        org.bson.types.Binary binary12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder9.initialTimestamp(binary12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder3.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = null;
        builder3.setmongoOplogFilter(basicDBObject6);
        builder3.statisticsIndexName = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder3.throttleSize((int) (short) 0);
        boolean boolean12 = builder11.getmongoUseSSL();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder11.mongoCollection("throttle_size");
        builder11.setmongoCollection("ssl");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter2 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str3 = serializedObjectSupporter2.deserializeObjectString4();
        org.elasticsearch.river.RiverSettings riverSettings4 = serializedObjectSupporter2.deserializeObjectRiverSettings3();
        java.lang.String str5 = serializedObjectSupporter2.deserializeObjectString12();
        java.lang.String str6 = serializedObjectSupporter2.deserializeObjectString10();
        org.elasticsearch.river.RiverSettings riverSettings7 = serializedObjectSupporter2.deserializeObjectRiverSettings6();
        org.elasticsearch.script.ScriptService scriptService8 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("size", "mongodb-1638820218299", riverSettings7, scriptService8);
        java.lang.String str10 = mongoDBRiverDefinition9.getBULK_SIZE_FIELD();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_river" + "'", str3, "_river");
        org.junit.Assert.assertNotNull(riverSettings4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_river" + "'", str5, "_river");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_river" + "'", str6, "_river");
        org.junit.Assert.assertNotNull(riverSettings7);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "bulk_size" + "'", str10, "bulk_size");
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder3.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = null;
        builder3.setmongoOplogFilter(basicDBObject6);
        builder3.statisticsIndexName = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder3.throttleSize((int) (short) 0);
        builder3.mongoLocalPassword = "script.disable_dynamic";
        builder3.riverName = "include_fields";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder3.connectTimeout((int) (byte) 10);
        builder17.setconnectTimeout((int) (short) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder17.mongoAdminUser("name");
        java.lang.String str22 = builder21.getmongoCollection();
        builder21.statisticsIndexName = "type";
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList2 = mongoDBRiverDefinition1.mongoServers;
        org.elasticsearch.common.unit.TimeValue timeValue3 = mongoDBRiverDefinition1.getDEFAULT_FLUSH_INTERVAL();
        boolean boolean4 = mongoDBRiverDefinition1.dropCollection;
        boolean boolean5 = mongoDBRiverDefinition1.isMongoSecondaryReadPreference();
        java.lang.String str6 = mongoDBRiverDefinition1.getStatisticsTypeName();
        java.lang.String str7 = mongoDBRiverDefinition1.getMongoLocalPassword();
        java.lang.String str8 = mongoDBRiverDefinition1.getIndexName();
        boolean boolean9 = mongoDBRiverDefinition1.mongoUseSSL;
        java.lang.String str10 = mongoDBRiverDefinition1.mongoLocalPassword;
        java.lang.String str11 = mongoDBRiverDefinition1.riverName;
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertNotNull(serverAddressList2);
        org.junit.Assert.assertNotNull(timeValue3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        builder0.riverName = "concurrent_bulk_requests";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.connectTimeout((int) (byte) 10);
        builder7.setincludeCollection("credentials");
        builder7.setmongoLocalPassword("skip_initial_import");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("local", "include_fields", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?include_fields?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList2 = mongoDBRiverDefinition1.mongoServers;
        org.elasticsearch.common.unit.TimeValue timeValue3 = mongoDBRiverDefinition1.getDEFAULT_FLUSH_INTERVAL();
        boolean boolean4 = mongoDBRiverDefinition1.dropCollection;
        boolean boolean5 = mongoDBRiverDefinition1.getmongoSecondaryReadPreference();
        boolean boolean6 = mongoDBRiverDefinition1.isMongoSecondaryReadPreference();
        int int7 = mongoDBRiverDefinition1.getDEFAULT_DB_PORT();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = mongoDBRiverDefinition1.getInitialTimestamp();
        java.lang.String str9 = mongoDBRiverDefinition1.mongoCollection;
        java.lang.String str10 = mongoDBRiverDefinition1.mongoCollection;
        java.util.Set<java.lang.String> strSet11 = mongoDBRiverDefinition1.excludeFields;
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertNotNull(serverAddressList2);
        org.junit.Assert.assertNotNull(timeValue3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 27017 + "'", int7 == 27017);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(strSet11);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        com.mongodb.BasicDBObject basicDBObject4 = builder3.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = builder3.getinitialTimestamp();
        int int6 = builder3.getsocketTimeout();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder3.throttleSize((-1));
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.script("store_statistics");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.mongoSSLVerifyCertificate(false);
        int int5 = builder4.connectTimeout;
        java.util.Set<java.lang.String> strSet6 = builder4.getexcludeFields();
        java.lang.String str7 = builder4.getstatisticsIndexName();
        boolean boolean8 = builder4.getstoreStatistics();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean2 = builder1.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder1.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder1.disableIndexRefresh(false);
        java.lang.Object obj7 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        org.apache.lucene.index.AtomicReaderContext atomicReaderContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextReader(atomicReaderContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + false + "'", obj7, false);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder3.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = null;
        builder3.setmongoOplogFilter(basicDBObject6);
        builder3.statisticsIndexName = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder3.throttleSize((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder3.isMongos((java.lang.Boolean) true);
        builder3.statisticsIndexName = "flush_interval";
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter2 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str3 = serializedObjectSupporter2.deserializeObjectString7();
        org.elasticsearch.river.RiverSettings riverSettings4 = serializedObjectSupporter2.deserializeObjectRiverSettings4();
        java.lang.String str5 = serializedObjectSupporter2.deserializeObjectString3();
        org.elasticsearch.river.RiverSettings riverSettings6 = serializedObjectSupporter2.deserializeObjectRiverSettings3();
        org.elasticsearch.script.ScriptService scriptService7 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("connect_timeout", "ssl_verify_certificate", riverSettings6, scriptService7);
        boolean boolean9 = mongoDBRiverDefinition8.isSkipInitialImport();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "mongodb-1638820218326" + "'", str3, "mongodb-1638820218326");
        org.junit.Assert.assertNotNull(riverSettings4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "mongodb-1638820218264" + "'", str5, "mongodb-1638820218264");
        org.junit.Assert.assertNotNull(riverSettings6);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.lang.String str2 = mongoDBRiverDefinition1.getINDEX_OBJECT();
        java.util.Set<java.lang.String> strSet3 = mongoDBRiverDefinition1.parentTypes;
        boolean boolean4 = mongoDBRiverDefinition1.isStoreStatistics();
        java.lang.String str5 = mongoDBRiverDefinition1.getRiverIndexName();
        boolean boolean6 = mongoDBRiverDefinition1.mongoUseSSL;
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "index" + "'", str2, "index");
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.lang.String str2 = mongoDBRiverDefinition1.getINDEX_OBJECT();
        java.util.Set<java.lang.String> strSet3 = mongoDBRiverDefinition1.parentTypes;
        boolean boolean4 = mongoDBRiverDefinition1.isStoreStatistics();
        boolean boolean5 = mongoDBRiverDefinition1.importAllCollections;
        boolean boolean6 = mongoDBRiverDefinition1.isDropCollection();
        boolean boolean7 = mongoDBRiverDefinition1.isSkipInitialImport();
        java.lang.String str8 = mongoDBRiverDefinition1.getTYPE_FIELD();
        java.lang.String str9 = mongoDBRiverDefinition1.getUSER_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition1.scriptType;
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "index" + "'", str2, "index");
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "type" + "'", str8, "type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "user" + "'", str9, "user");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder3.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = null;
        builder3.setmongoOplogFilter(basicDBObject6);
        builder3.statisticsIndexName = "socket_timeout";
        java.lang.String str10 = builder3.riverIndexName;
        boolean boolean11 = builder3.advancedTransformation;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder3.dropCollection(true);
        builder13.mongoAdminPassword = "_river";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition17 = builder16.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList18 = mongoDBRiverDefinition17.mongoServers;
        org.elasticsearch.common.unit.TimeValue timeValue19 = mongoDBRiverDefinition17.getDEFAULT_FLUSH_INTERVAL();
        boolean boolean20 = mongoDBRiverDefinition17.dropCollection;
        boolean boolean21 = mongoDBRiverDefinition17.isMongoSecondaryReadPreference();
        java.lang.String str22 = mongoDBRiverDefinition17.getStatisticsTypeName();
        java.lang.String str23 = mongoDBRiverDefinition17.getMongoLocalPassword();
        java.lang.String str24 = mongoDBRiverDefinition17.getCONNECT_TIMEOUT();
        java.util.Set<java.lang.String> strSet25 = mongoDBRiverDefinition17.getExcludeFields();
        com.mongodb.BasicDBObject basicDBObject26 = mongoDBRiverDefinition17.mongoCollectionFilter;
        builder13.setmongoCollectionFilter(basicDBObject26);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder13.socketTimeout((int) (short) 1);
        java.util.List<com.mongodb.ServerAddress> serverAddressList30 = null;
        builder13.mongoServers = serverAddressList30;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition17);
        org.junit.Assert.assertNotNull(serverAddressList18);
        org.junit.Assert.assertNotNull(timeValue19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "connect_timeout" + "'", str24, "connect_timeout");
        org.junit.Assert.assertNull(strSet25);
        org.junit.Assert.assertNotNull(basicDBObject26);
        org.junit.Assert.assertNotNull(builder29);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList2 = mongoDBRiverDefinition1.mongoServers;
        org.elasticsearch.common.unit.TimeValue timeValue3 = mongoDBRiverDefinition1.getDEFAULT_FLUSH_INTERVAL();
        boolean boolean4 = mongoDBRiverDefinition1.dropCollection;
        boolean boolean5 = mongoDBRiverDefinition1.isMongoSecondaryReadPreference();
        boolean boolean6 = mongoDBRiverDefinition1.mongoUseSSL;
        java.lang.String str7 = mongoDBRiverDefinition1.typeName;
        java.util.Set<java.lang.String> strSet8 = mongoDBRiverDefinition1.includeFields;
        java.lang.String str9 = mongoDBRiverDefinition1.getINITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD();
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertNotNull(serverAddressList2);
        org.junit.Assert.assertNotNull(timeValue3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(strSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "script_type" + "'", str9, "script_type");
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder3.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = null;
        builder3.setmongoOplogFilter(basicDBObject6);
        boolean boolean8 = builder3.mongoGridFS;
        java.lang.String[] strArray51 = new java.lang.String[] { "credentials", "script.default_lang", "admin", "servers", "bulk", "script_type", "filter", "drop_collection", "local", "options", "store_statistics", "import_all_collections", "", "user", "secondary_read_preference", "actions", "concurrent_requests", "exclude_fields", "script_type", "exclude_fields", "socket_timeout", "admin", "filter", "user", "throttle_size", "bulk_timeout", "name", "local", "local", "skip_initial_import", "filter", ".scripts", "store_statistics", "concurrent_requests", "gridfs", "collection", "password", "script_type", "socket_timeout", "ssl_verify_certificate", "store_statistics", "size" };
        java.util.LinkedHashSet<java.lang.String> strSet52 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet52, strArray51);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder3.includeFields((java.util.Set<java.lang.String>) strSet52);
        java.lang.String str55 = builder3.mongoLocalPassword;
        builder3.setadvancedTransformation(true);
        java.util.List<com.mongodb.ServerAddress> serverAddressList58 = builder3.mongoServers;
        java.lang.String str59 = builder3.mongoDb;
        java.lang.String str60 = builder3.gettypeName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(serverAddressList58);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNull(str60);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder3.mongoAdminUser("socket_timeout");
        java.lang.String str6 = builder5.riverName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder5.connectTimeout((int) (short) 1);
        boolean boolean9 = builder5.skipInitialImport;
        java.lang.String str10 = builder5.mongoLocalUser;
        java.lang.String str11 = builder5.getscript();
        builder5.setdisableIndexRefresh(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "bulk" + "'", str11, "bulk");
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.script("store_statistics");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.mongoSSLVerifyCertificate(false);
        int int5 = builder4.connectTimeout;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = builder6.build();
        java.lang.String str8 = mongoDBRiverDefinition7.getINDEX_OBJECT();
        java.util.Set<java.lang.String> strSet9 = mongoDBRiverDefinition7.parentTypes;
        java.lang.String str10 = mongoDBRiverDefinition7.riverName;
        boolean boolean11 = mongoDBRiverDefinition7.disableIndexRefresh;
        java.util.List<com.mongodb.ServerAddress> serverAddressList12 = mongoDBRiverDefinition7.getMongoServers();
        builder4.setmongoServers(serverAddressList12);
        int int14 = builder4.throttleSize;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "index" + "'", str8, "index");
        org.junit.Assert.assertNull(strSet9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(serverAddressList12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder3.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = null;
        builder3.setmongoOplogFilter(basicDBObject6);
        builder3.statisticsIndexName = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder3.throttleSize((int) (short) 0);
        boolean boolean12 = builder11.mongoSSLVerifyCertificate;
        com.mongodb.MongoClientOptions mongoClientOptions13 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder11.mongoClientOptions(mongoClientOptions13);
        builder14.setmongoSSLVerifyCertificate(false);
        com.mongodb.BasicDBObject basicDBObject17 = builder14.mongoOplogFilter;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNull(basicDBObject17);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.lang.String str2 = mongoDBRiverDefinition1.getINDEX_OBJECT();
        java.util.Set<java.lang.String> strSet3 = mongoDBRiverDefinition1.parentTypes;
        java.lang.String str4 = mongoDBRiverDefinition1.riverName;
        boolean boolean5 = mongoDBRiverDefinition1.disableIndexRefresh;
        java.lang.String str6 = mongoDBRiverDefinition1.mongoLocalPassword;
        java.lang.String str7 = mongoDBRiverDefinition1.getINITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD();
        boolean boolean8 = mongoDBRiverDefinition1.isDropCollection();
        java.lang.String str9 = mongoDBRiverDefinition1.getRiverName();
        java.lang.String str10 = mongoDBRiverDefinition1.getIS_MONGOS_FIELD();
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "index" + "'", str2, "index");
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "script_type" + "'", str7, "script_type");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "is_mongos" + "'", str10, "is_mongos");
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.disableIndexRefresh(false);
        java.lang.String str6 = builder5.getstatisticsTypeName();
        java.lang.String str7 = builder5.riverName;
        builder5.statisticsTypeName = "name";
        builder5.throttleSize = 0;
        java.lang.String str12 = builder5.statisticsTypeName;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "name" + "'", str12, "name");
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder3.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = null;
        builder3.setmongoOplogFilter(basicDBObject6);
        builder3.mongoAdminUser = "mongodb-1638820217755";
        builder3.setmongoDb("credentials");
        builder3.mongoLocalUser = "name";
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.script("store_statistics");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.mongoSSLVerifyCertificate(false);
        builder0.dropCollection = true;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.mongoAdminPassword("import_all_collections");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.script("store_statistics");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.mongoSSLVerifyCertificate(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.storeStatistics(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.statisticsTypeName("");
        builder10.throttleSize = '#';
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.disableIndexRefresh(false);
        builder5.setthrottleSize((int) ' ');
        boolean boolean8 = builder5.getadvancedTransformation();
        java.lang.String str9 = builder5.mongoLocalPassword;
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter10 = null;
        builder5.serializedObjectSupporter = serializedObjectSupporter10;
        java.lang.String str12 = builder5.getincludeCollection();
        builder5.setriverIndexName("bulk_size");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter4 = null;
        builder0.serializedObjectSupporter = serializedObjectSupporter4;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.mongoAdminPassword("options");
        boolean boolean8 = builder7.getmongoGridFS();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder7.mongoAdminUser("bulk_timeout");
        builder10.mongoAdminUser = "filter";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder10.dropCollection(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        builder3.skipInitialImport = false;
        builder3.setscriptType("script");
        java.lang.String[] strArray25 = new java.lang.String[] { "exclude_fields", "servers", "secondary_read_preference", "name", "exclude_fields", "bulk_timeout", "skip_initial_import", "bulk", "script", "disable_index_refresh", "script.default_lang", "skip_initial_import", "gridfs", "user", "port", "parent_types", "size" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder3.excludeFields((java.util.Set<java.lang.String>) strSet26);
        java.lang.String str29 = builder28.getriverIndexName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder28.mongoCollection("type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder31.mongoSSLVerifyCertificate(true);
        boolean boolean34 = builder31.advancedTransformation;
        boolean boolean35 = builder31.mongoUseSSL;
        java.lang.String str36 = builder31.riverIndexName;
        builder31.riverName = "servers";
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList2 = mongoDBRiverDefinition1.mongoServers;
        org.elasticsearch.common.unit.TimeValue timeValue3 = mongoDBRiverDefinition1.getDEFAULT_FLUSH_INTERVAL();
        boolean boolean4 = mongoDBRiverDefinition1.dropCollection;
        java.lang.String str5 = mongoDBRiverDefinition1.getDB_FIELD();
        java.util.Set<java.lang.String> strSet6 = mongoDBRiverDefinition1.getExcludeFields();
        int int7 = mongoDBRiverDefinition1.getDEFAULT_DB_PORT();
        boolean boolean8 = mongoDBRiverDefinition1.isMongoSSLVerifyCertificate();
        java.lang.String str9 = mongoDBRiverDefinition1.getCONNECT_TIMEOUT();
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertNotNull(serverAddressList2);
        org.junit.Assert.assertNotNull(timeValue3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "db" + "'", str5, "db");
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 27017 + "'", int7 == 27017);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "connect_timeout" + "'", str9, "connect_timeout");
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder3.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = null;
        builder3.setmongoOplogFilter(basicDBObject6);
        boolean boolean8 = builder3.mongoGridFS;
        builder3.setindexName("initial_timestamp");
        boolean boolean11 = builder3.advancedTransformation;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean13 = builder12.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder12.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder12.disableIndexRefresh(false);
        java.lang.String str18 = builder17.getstatisticsTypeName();
        java.lang.String str19 = builder17.riverName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder17.mongoAdminPassword("size");
        builder21.setmongoCollection("advanced_transformation");
        boolean boolean24 = builder21.getdropCollection();
        boolean boolean25 = builder21.getmongoSecondaryReadPreference();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.util.Set<java.lang.String> strSet27 = builder26.getexcludeFields();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder26.mongoLocalUser("credentials");
        java.lang.String str30 = builder29.script;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean32 = builder31.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder31.script("bulk");
        com.mongodb.BasicDBObject basicDBObject35 = null;
        builder34.setmongoOplogFilter(basicDBObject35);
        com.mongodb.BasicDBObject basicDBObject37 = null;
        builder34.setmongoOplogFilter(basicDBObject37);
        builder34.statisticsIndexName = "socket_timeout";
        builder34.setconnectTimeout((int) (byte) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean44 = builder43.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder43.script("bulk");
        com.mongodb.BasicDBObject basicDBObject47 = null;
        builder46.setmongoOplogFilter(basicDBObject47);
        com.mongodb.BasicDBObject basicDBObject49 = null;
        builder46.setmongoOplogFilter(basicDBObject49);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean52 = builder51.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder51.script("bulk");
        builder54.skipInitialImport = false;
        builder54.setscriptType("script");
        java.lang.String[] strArray76 = new java.lang.String[] { "exclude_fields", "servers", "secondary_read_preference", "name", "exclude_fields", "bulk_timeout", "skip_initial_import", "bulk", "script", "disable_index_refresh", "script.default_lang", "skip_initial_import", "gridfs", "user", "port", "parent_types", "size" };
        java.util.LinkedHashSet<java.lang.String> strSet77 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet77, strArray76);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder79 = builder54.excludeFields((java.util.Set<java.lang.String>) strSet77);
        builder46.setexcludeFields((java.util.Set<java.lang.String>) strSet77);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder81 = builder34.includeFields((java.util.Set<java.lang.String>) strSet77);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder82 = builder29.excludeFields((java.util.Set<java.lang.String>) strSet77);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder83 = builder21.excludeFields((java.util.Set<java.lang.String>) strSet77);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder84 = builder3.parentTypes((java.util.Set<java.lang.String>) strSet77);
        builder3.mongoDb = "initial_timestamp";
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(strSet27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(builder79);
        org.junit.Assert.assertNotNull(builder81);
        org.junit.Assert.assertNotNull(builder82);
        org.junit.Assert.assertNotNull(builder83);
        org.junit.Assert.assertNotNull(builder84);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.disableIndexRefresh(false);
        builder5.setthrottleSize((int) ' ');
        boolean boolean8 = builder5.getadvancedTransformation();
        java.lang.String str9 = builder5.getriverName();
        java.lang.String str10 = builder5.statisticsIndexName;
        boolean boolean11 = builder5.mongoSecondaryReadPreference;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString2();
        org.elasticsearch.river.RiverSettings riverSettings2 = serializedObjectSupporter0.deserializeObjectRiverSettings4();
        org.elasticsearch.common.settings.Settings settings3 = riverSettings2.globalSettings();
        org.elasticsearch.env.Environment environment4 = null;
        org.elasticsearch.script.ScriptEngineService[] scriptEngineServiceArray5 = new org.elasticsearch.script.ScriptEngineService[] {};
        java.util.LinkedHashSet<org.elasticsearch.script.ScriptEngineService> scriptEngineServiceSet6 = new java.util.LinkedHashSet<org.elasticsearch.script.ScriptEngineService>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.elasticsearch.script.ScriptEngineService>) scriptEngineServiceSet6, scriptEngineServiceArray5);
        org.elasticsearch.watcher.ResourceWatcherService resourceWatcherService8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.script.ScriptService scriptService9 = new org.elasticsearch.script.ScriptService(settings3, environment4, (java.util.Set<org.elasticsearch.script.ScriptEngineService>) scriptEngineServiceSet6, resourceWatcherService8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_river" + "'", str1, "_river");
        org.junit.Assert.assertNotNull(riverSettings2);
        org.junit.Assert.assertNotNull(settings3);
        org.junit.Assert.assertNotNull(scriptEngineServiceArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder3.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = null;
        builder3.setmongoOplogFilter(basicDBObject6);
        builder3.statisticsIndexName = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder3.throttleSize((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.throttleSize((int) (byte) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder11.mongoSSLVerifyCertificate(false);
        builder15.mongoGridFS = true;
        builder15.setdropCollection(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList2 = mongoDBRiverDefinition1.mongoServers;
        org.elasticsearch.common.unit.TimeValue timeValue3 = mongoDBRiverDefinition1.getDEFAULT_FLUSH_INTERVAL();
        boolean boolean4 = mongoDBRiverDefinition1.dropCollection;
        java.lang.String str5 = mongoDBRiverDefinition1.getDB_FIELD();
        java.lang.String str6 = mongoDBRiverDefinition1.getMongoCollection();
        java.lang.String str7 = mongoDBRiverDefinition1.getCONNECT_TIMEOUT();
        org.elasticsearch.common.unit.TimeValue timeValue8 = mongoDBRiverDefinition1.getDEFAULT_FLUSH_INTERVAL();
        com.mongodb.BasicDBObject basicDBObject9 = mongoDBRiverDefinition1.mongoOplogFilter;
        java.lang.String str10 = mongoDBRiverDefinition1.getMongoDb();
        boolean boolean11 = mongoDBRiverDefinition1.isDisableIndexRefresh();
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertNotNull(serverAddressList2);
        org.junit.Assert.assertNotNull(timeValue3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "db" + "'", str5, "db");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "connect_timeout" + "'", str7, "connect_timeout");
        org.junit.Assert.assertNotNull(timeValue8);
        org.junit.Assert.assertNull(basicDBObject9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString7();
        org.elasticsearch.river.RiverSettings riverSettings2 = serializedObjectSupporter0.deserializeObjectRiverSettings4();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString3();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString11();
        org.elasticsearch.river.RiverSettings riverSettings5 = serializedObjectSupporter0.deserializeObjectRiverSettings7();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb-1638820218326" + "'", str1, "mongodb-1638820218326");
        org.junit.Assert.assertNotNull(riverSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "mongodb-1638820218264" + "'", str3, "mongodb-1638820218264");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb-1638820218387" + "'", str4, "mongodb-1638820218387");
        org.junit.Assert.assertNotNull(riverSettings5);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.lang.String str2 = mongoDBRiverDefinition1.getINDEX_OBJECT();
        java.util.Set<java.lang.String> strSet3 = mongoDBRiverDefinition1.parentTypes;
        boolean boolean4 = mongoDBRiverDefinition1.isStoreStatistics();
        boolean boolean5 = mongoDBRiverDefinition1.importAllCollections;
        java.lang.String str6 = mongoDBRiverDefinition1.mongoAdminPassword;
        com.mongodb.BasicDBObject basicDBObject7 = mongoDBRiverDefinition1.getMongoCollectionFilter();
        java.lang.String str8 = mongoDBRiverDefinition1.getINITIAL_TIMESTAMP_FIELD();
        java.util.Set<java.lang.String> strSet9 = mongoDBRiverDefinition1.parentTypes;
        boolean boolean10 = mongoDBRiverDefinition1.mongoSecondaryReadPreference;
        java.util.Set<java.lang.String> strSet11 = mongoDBRiverDefinition1.includeFields;
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "index" + "'", str2, "index");
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(basicDBObject7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "initial_timestamp" + "'", str8, "initial_timestamp");
        org.junit.Assert.assertNull(strSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(strSet11);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList2 = mongoDBRiverDefinition1.mongoServers;
        org.elasticsearch.common.unit.TimeValue timeValue3 = mongoDBRiverDefinition1.getDEFAULT_FLUSH_INTERVAL();
        boolean boolean4 = mongoDBRiverDefinition1.dropCollection;
        boolean boolean5 = mongoDBRiverDefinition1.isMongoSecondaryReadPreference();
        java.lang.String str6 = mongoDBRiverDefinition1.getStatisticsTypeName();
        org.elasticsearch.common.unit.TimeValue timeValue7 = mongoDBRiverDefinition1.getDEFAULT_FLUSH_INTERVAL();
        java.lang.String str8 = mongoDBRiverDefinition1.getPARENT_TYPES_FIELD();
        java.lang.String str9 = mongoDBRiverDefinition1.getSSL_VERIFY_CERT_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition1.getIS_MONGOS_FIELD();
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertNotNull(serverAddressList2);
        org.junit.Assert.assertNotNull(timeValue3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(timeValue7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "parent_types" + "'", str8, "parent_types");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ssl_verify_certificate" + "'", str9, "ssl_verify_certificate");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "is_mongos" + "'", str10, "is_mongos");
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.lang.String str2 = mongoDBRiverDefinition1.getINDEX_OBJECT();
        java.util.Set<java.lang.String> strSet3 = mongoDBRiverDefinition1.parentTypes;
        boolean boolean4 = mongoDBRiverDefinition1.isStoreStatistics();
        boolean boolean5 = mongoDBRiverDefinition1.importAllCollections;
        boolean boolean6 = mongoDBRiverDefinition1.isDropCollection();
        boolean boolean7 = mongoDBRiverDefinition1.isSkipInitialImport();
        boolean boolean8 = mongoDBRiverDefinition1.mongoSecondaryReadPreference;
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "index" + "'", str2, "index");
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("user", "script_type", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?script_type?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList2 = mongoDBRiverDefinition1.mongoServers;
        org.elasticsearch.common.unit.TimeValue timeValue3 = mongoDBRiverDefinition1.getDEFAULT_FLUSH_INTERVAL();
        boolean boolean4 = mongoDBRiverDefinition1.dropCollection;
        boolean boolean5 = mongoDBRiverDefinition1.isMongoSecondaryReadPreference();
        java.lang.String str6 = mongoDBRiverDefinition1.getStatisticsTypeName();
        java.lang.String str7 = mongoDBRiverDefinition1.getMongoLocalPassword();
        java.lang.String str8 = mongoDBRiverDefinition1.getCONNECT_TIMEOUT();
        java.lang.String str9 = mongoDBRiverDefinition1.indexName;
        java.lang.String str10 = mongoDBRiverDefinition1.statisticsIndexName;
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertNotNull(serverAddressList2);
        org.junit.Assert.assertNotNull(timeValue3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "connect_timeout" + "'", str8, "connect_timeout");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("mongodb-1638820218408", "bulk_size");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?bulk_size?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder3.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = null;
        builder3.setmongoOplogFilter(basicDBObject6);
        builder3.statisticsIndexName = "socket_timeout";
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = builder3.initialTimestamp;
        builder3.setadvancedTransformation(true);
        java.lang.String str13 = builder3.getmongoDb();
        java.lang.String str14 = builder3.scriptType;
        boolean boolean15 = builder3.getmongoGridFS();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        java.lang.String str2 = builder0.getscript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean4 = builder3.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder3.script("bulk");
        com.mongodb.BasicDBObject basicDBObject7 = null;
        builder6.setmongoOplogFilter(basicDBObject7);
        com.mongodb.BasicDBObject basicDBObject9 = null;
        builder6.setmongoOplogFilter(basicDBObject9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean12 = builder11.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder11.script("bulk");
        builder14.skipInitialImport = false;
        builder14.setscriptType("script");
        java.lang.String[] strArray36 = new java.lang.String[] { "exclude_fields", "servers", "secondary_read_preference", "name", "exclude_fields", "bulk_timeout", "skip_initial_import", "bulk", "script", "disable_index_refresh", "script.default_lang", "skip_initial_import", "gridfs", "user", "port", "parent_types", "size" };
        java.util.LinkedHashSet<java.lang.String> strSet37 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet37, strArray36);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder14.excludeFields((java.util.Set<java.lang.String>) strSet37);
        builder6.setexcludeFields((java.util.Set<java.lang.String>) strSet37);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder6.throttleSize(100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder6.riverIndexName("bulk_timeout");
        java.util.Set<java.lang.String> strSet45 = builder6.getexcludeFields();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder0.parentTypes(strSet45);
        builder46.mongoAdminUser = "size";
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(strSet45);
        org.junit.Assert.assertNotNull(builder46);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.disableIndexRefresh(false);
        java.lang.String str6 = builder0.mongoAdminUser;
        java.lang.String str7 = builder0.getmongoAdminUser();
        int int8 = builder0.connectTimeout;
        builder0.statisticsTypeName = "db";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean12 = builder11.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder11.script("bulk");
        builder14.skipInitialImport = false;
        builder14.setscriptType("script");
        java.lang.String[] strArray36 = new java.lang.String[] { "exclude_fields", "servers", "secondary_read_preference", "name", "exclude_fields", "bulk_timeout", "skip_initial_import", "bulk", "script", "disable_index_refresh", "script.default_lang", "skip_initial_import", "gridfs", "user", "port", "parent_types", "size" };
        java.util.LinkedHashSet<java.lang.String> strSet37 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet37, strArray36);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder14.excludeFields((java.util.Set<java.lang.String>) strSet37);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder0.includeFields((java.util.Set<java.lang.String>) strSet37);
        int int41 = builder40.getsocketTimeout();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.disableIndexRefresh(false);
        int int6 = builder0.getsocketTimeout();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.dropCollection(true);
        builder8.setriverIndexName("credentials");
        int int11 = builder8.socketTimeout;
        boolean boolean12 = builder8.mongoSSLVerifyCertificate;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean3 = builder2.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.script("bulk");
        builder2.riverName = "concurrent_bulk_requests";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder2.connectTimeout((int) (byte) 10);
        docScoreSearchScript0.setNextVar("port", (java.lang.Object) builder9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean12 = builder11.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder11.script("bulk");
        builder11.riverName = "concurrent_bulk_requests";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder11.connectTimeout((int) (byte) 10);
        java.lang.Object obj19 = docScoreSearchScript0.unwrap((java.lang.Object) builder18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean21 = builder20.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder20.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder20.disableIndexRefresh(false);
        java.lang.String str26 = builder25.getstatisticsTypeName();
        java.util.Set<java.lang.String> strSet27 = builder25.excludeFields;
        java.lang.Object obj28 = docScoreSearchScript0.unwrap((java.lang.Object) strSet27);
        docScoreSearchScript0.setNextScore((float) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj31 = docScoreSearchScript0.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(strSet27);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder3.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = null;
        builder3.setmongoOplogFilter(basicDBObject6);
        builder3.statisticsIndexName = "socket_timeout";
        java.lang.String str10 = builder3.riverIndexName;
        boolean boolean11 = builder3.advancedTransformation;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder3.dropCollection(true);
        builder3.skipInitialImport = true;
        boolean boolean16 = builder3.dropCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition18 = builder17.build();
        java.lang.String str19 = mongoDBRiverDefinition18.getINDEX_OBJECT();
        java.util.Set<java.lang.String> strSet20 = mongoDBRiverDefinition18.parentTypes;
        boolean boolean21 = mongoDBRiverDefinition18.isStoreStatistics();
        boolean boolean22 = mongoDBRiverDefinition18.dropCollection;
        java.lang.String str23 = mongoDBRiverDefinition18.getCOLLECTION_FIELD();
        com.mongodb.BasicDBObject basicDBObject24 = mongoDBRiverDefinition18.getMongoCollectionFilter();
        builder3.mongoCollectionFilter = basicDBObject24;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition27 = builder26.build();
        com.mongodb.BasicDBObject basicDBObject28 = builder26.getmongoCollectionFilter();
        builder3.setmongoCollectionFilter(basicDBObject28);
        builder3.setadvancedTransformation(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "index" + "'", str19, "index");
        org.junit.Assert.assertNull(strSet20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "collection" + "'", str23, "collection");
        org.junit.Assert.assertNotNull(basicDBObject24);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition27);
        org.junit.Assert.assertNotNull(basicDBObject28);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList2 = mongoDBRiverDefinition1.mongoServers;
        org.elasticsearch.common.unit.TimeValue timeValue3 = mongoDBRiverDefinition1.getDEFAULT_FLUSH_INTERVAL();
        boolean boolean4 = mongoDBRiverDefinition1.dropCollection;
        boolean boolean5 = mongoDBRiverDefinition1.isMongoSecondaryReadPreference();
        java.lang.String str6 = mongoDBRiverDefinition1.getStatisticsTypeName();
        java.lang.String str7 = mongoDBRiverDefinition1.getMongoLocalPassword();
        java.lang.String str8 = mongoDBRiverDefinition1.getCONNECT_TIMEOUT();
        boolean boolean9 = mongoDBRiverDefinition1.isMongoGridFS();
        java.lang.String str10 = mongoDBRiverDefinition1.getRiverIndexName();
        java.lang.String str11 = mongoDBRiverDefinition1.scriptType;
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertNotNull(serverAddressList2);
        org.junit.Assert.assertNotNull(timeValue3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "connect_timeout" + "'", str8, "connect_timeout");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList2 = mongoDBRiverDefinition1.mongoServers;
        java.lang.String str3 = mongoDBRiverDefinition1.getBULK_TIMEOUT_FIELD();
        java.util.Set<java.lang.String> strSet4 = mongoDBRiverDefinition1.getParentTypes();
        int int5 = mongoDBRiverDefinition1.throttleSize;
        java.lang.Boolean boolean6 = mongoDBRiverDefinition1.getisMongos();
        int int7 = mongoDBRiverDefinition1.getDEFAULT_DB_PORT();
        java.lang.String str8 = mongoDBRiverDefinition1.getHOST_FIELD();
        java.lang.String str9 = mongoDBRiverDefinition1.getFLUSH_INTERVAL_FIELD();
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertNotNull(serverAddressList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "bulk_timeout" + "'", str3, "bulk_timeout");
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(boolean6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 27017 + "'", int7 == 27017);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "host" + "'", str8, "host");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "flush_interval" + "'", str9, "flush_interval");
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.disableIndexRefresh(false);
        java.lang.String str6 = builder5.getstatisticsTypeName();
        java.lang.String str7 = builder5.riverName;
        builder5.statisticsTypeName = "name";
        builder5.throttleSize = 0;
        builder5.setincludeCollection("script_type");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean3 = builder2.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.script("bulk");
        builder2.riverName = "concurrent_bulk_requests";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder2.connectTimeout((int) (byte) 10);
        docScoreSearchScript0.setNextVar("port", (java.lang.Object) builder9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition12 = builder11.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList13 = mongoDBRiverDefinition12.mongoServers;
        org.elasticsearch.common.unit.TimeValue timeValue14 = mongoDBRiverDefinition12.getDEFAULT_FLUSH_INTERVAL();
        boolean boolean15 = mongoDBRiverDefinition12.dropCollection;
        boolean boolean16 = mongoDBRiverDefinition12.isMongoSecondaryReadPreference();
        java.lang.Object obj17 = docScoreSearchScript0.unwrap((java.lang.Object) boolean16);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition19 = builder18.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList20 = mongoDBRiverDefinition19.mongoServers;
        org.elasticsearch.common.unit.TimeValue timeValue21 = mongoDBRiverDefinition19.getDEFAULT_FLUSH_INTERVAL();
        boolean boolean22 = mongoDBRiverDefinition19.dropCollection;
        boolean boolean23 = mongoDBRiverDefinition19.isMongoSecondaryReadPreference();
        java.lang.String str24 = mongoDBRiverDefinition19.getStatisticsTypeName();
        java.lang.String str25 = mongoDBRiverDefinition19.getMongoLocalPassword();
        java.lang.String str26 = mongoDBRiverDefinition19.getIndexName();
        boolean boolean27 = mongoDBRiverDefinition19.mongoUseSSL;
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp28 = mongoDBRiverDefinition19.getInitialTimestamp();
        boolean boolean29 = mongoDBRiverDefinition19.getstoreStatistics();
        java.lang.Object obj30 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition19);
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        org.apache.lucene.index.AtomicReaderContext atomicReaderContext33 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextReader(atomicReaderContext33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition12);
        org.junit.Assert.assertNotNull(serverAddressList13);
        org.junit.Assert.assertNotNull(timeValue14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + false + "'", obj17, false);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition19);
        org.junit.Assert.assertNotNull(serverAddressList20);
        org.junit.Assert.assertNotNull(timeValue21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(wildcardTimestamp28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(obj30);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("script");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?script?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.disableIndexRefresh(false);
        java.lang.String str6 = builder5.getstatisticsTypeName();
        builder5.storeStatistics = false;
        builder5.setadvancedTransformation(false);
        com.mongodb.MongoClientOptions mongoClientOptions11 = builder5.mongoClientOptions;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(mongoClientOptions11);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.lang.String str2 = mongoDBRiverDefinition1.getINDEX_OBJECT();
        java.util.Set<java.lang.String> strSet3 = mongoDBRiverDefinition1.parentTypes;
        boolean boolean4 = mongoDBRiverDefinition1.isStoreStatistics();
        boolean boolean5 = mongoDBRiverDefinition1.dropCollection;
        java.lang.String str6 = mongoDBRiverDefinition1.getCOLLECTION_FIELD();
        int int7 = mongoDBRiverDefinition1.getDEFAULT_CONCURRENT_REQUESTS();
        int int8 = mongoDBRiverDefinition1.getDEFAULT_CONCURRENT_REQUESTS();
        int int9 = mongoDBRiverDefinition1.getDEFAULT_CONNECT_TIMEOUT();
        int int10 = mongoDBRiverDefinition1.getDEFAULT_DB_PORT();
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "index" + "'", str2, "index");
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "collection" + "'", str6, "collection");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 30000 + "'", int9 == 30000);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 27017 + "'", int10 == 27017);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList2 = mongoDBRiverDefinition1.mongoServers;
        org.elasticsearch.common.unit.TimeValue timeValue3 = mongoDBRiverDefinition1.getDEFAULT_FLUSH_INTERVAL();
        boolean boolean4 = mongoDBRiverDefinition1.dropCollection;
        boolean boolean5 = mongoDBRiverDefinition1.isMongoSecondaryReadPreference();
        java.util.Set<java.lang.String> strSet6 = mongoDBRiverDefinition1.excludeFields;
        com.mongodb.BasicDBObject basicDBObject7 = mongoDBRiverDefinition1.mongoOplogFilter;
        java.util.Set<java.lang.String> strSet8 = mongoDBRiverDefinition1.excludeFields;
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertNotNull(serverAddressList2);
        org.junit.Assert.assertNotNull(timeValue3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertNull(basicDBObject7);
        org.junit.Assert.assertNull(strSet8);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder3.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = null;
        builder3.setmongoOplogFilter(basicDBObject6);
        builder3.statisticsIndexName = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder3.throttleSize((int) (short) 0);
        boolean boolean12 = builder11.mongoSSLVerifyCertificate;
        builder11.connectTimeout = (-1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder11.mongoAdminUser("");
        java.lang.Class<?> wildcardClass17 = builder16.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder3.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = null;
        builder3.setmongoOplogFilter(basicDBObject6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean9 = builder8.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder8.script("bulk");
        builder11.skipInitialImport = false;
        builder11.setscriptType("script");
        java.lang.String[] strArray33 = new java.lang.String[] { "exclude_fields", "servers", "secondary_read_preference", "name", "exclude_fields", "bulk_timeout", "skip_initial_import", "bulk", "script", "disable_index_refresh", "script.default_lang", "skip_initial_import", "gridfs", "user", "port", "parent_types", "size" };
        java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder11.excludeFields((java.util.Set<java.lang.String>) strSet34);
        builder3.setexcludeFields((java.util.Set<java.lang.String>) strSet34);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder3.throttleSize(100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder3.riverIndexName("bulk_timeout");
        java.util.Set<java.lang.String> strSet42 = builder3.getexcludeFields();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean44 = builder43.getdropCollection();
        java.lang.String str45 = builder43.getscript();
        boolean boolean46 = builder43.dropCollection;
        com.mongodb.ServerAddress[] serverAddressArray47 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList48 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList48, serverAddressArray47);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder43.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList48);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean52 = builder51.getdropCollection();
        java.lang.String str53 = builder51.getscript();
        boolean boolean54 = builder51.dropCollection;
        com.mongodb.ServerAddress[] serverAddressArray55 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList56 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList56, serverAddressArray55);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = builder51.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList56);
        builder43.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList56);
        builder3.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList56);
        builder3.setstatisticsIndexName("index");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(strSet42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(serverAddressArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(serverAddressArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(builder58);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.lang.String str2 = mongoDBRiverDefinition1.getINDEX_OBJECT();
        java.util.Set<java.lang.String> strSet3 = mongoDBRiverDefinition1.parentTypes;
        java.lang.String str4 = mongoDBRiverDefinition1.riverName;
        boolean boolean5 = mongoDBRiverDefinition1.disableIndexRefresh;
        java.lang.String str6 = mongoDBRiverDefinition1.mongoLocalPassword;
        java.util.List<com.mongodb.ServerAddress> serverAddressList7 = mongoDBRiverDefinition1.getMongoServers();
        int int8 = mongoDBRiverDefinition1.throttleSize;
        java.lang.String str9 = mongoDBRiverDefinition1.riverIndexName;
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "index" + "'", str2, "index");
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(serverAddressList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.lang.String str2 = mongoDBRiverDefinition1.getINDEX_OBJECT();
        java.util.Set<java.lang.String> strSet3 = mongoDBRiverDefinition1.parentTypes;
        boolean boolean4 = mongoDBRiverDefinition1.isStoreStatistics();
        boolean boolean5 = mongoDBRiverDefinition1.importAllCollections;
        java.lang.String str6 = mongoDBRiverDefinition1.mongoAdminPassword;
        com.mongodb.BasicDBObject basicDBObject7 = mongoDBRiverDefinition1.getMongoCollectionFilter();
        boolean boolean8 = mongoDBRiverDefinition1.mongoSecondaryReadPreference;
        java.util.Set<java.lang.String> strSet9 = mongoDBRiverDefinition1.parentTypes;
        java.lang.String str10 = mongoDBRiverDefinition1.getSECONDARY_READ_PREFERENCE_FIELD();
        java.lang.String str11 = mongoDBRiverDefinition1.getFLUSH_INTERVAL_FIELD();
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "index" + "'", str2, "index");
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(basicDBObject7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(strSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "secondary_read_preference" + "'", str10, "secondary_read_preference");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "flush_interval" + "'", str11, "flush_interval");
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList2 = mongoDBRiverDefinition1.mongoServers;
        org.elasticsearch.common.unit.TimeValue timeValue3 = mongoDBRiverDefinition1.getDEFAULT_FLUSH_INTERVAL();
        boolean boolean4 = mongoDBRiverDefinition1.dropCollection;
        boolean boolean5 = mongoDBRiverDefinition1.getmongoSecondaryReadPreference();
        boolean boolean6 = mongoDBRiverDefinition1.isMongoSecondaryReadPreference();
        int int7 = mongoDBRiverDefinition1.getDEFAULT_DB_PORT();
        com.mongodb.BasicDBObject basicDBObject8 = mongoDBRiverDefinition1.mongoCollectionFilter;
        java.util.Set<java.lang.String> strSet9 = mongoDBRiverDefinition1.parentTypes;
        java.lang.String str10 = mongoDBRiverDefinition1.getCONCURRENT_REQUESTS_FIELD();
        java.lang.Boolean boolean11 = mongoDBRiverDefinition1.getisMongos();
        java.lang.String str12 = mongoDBRiverDefinition1.scriptType;
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertNotNull(serverAddressList2);
        org.junit.Assert.assertNotNull(timeValue3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 27017 + "'", int7 == 27017);
        org.junit.Assert.assertNotNull(basicDBObject8);
        org.junit.Assert.assertNull(strSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "concurrent_requests" + "'", str10, "concurrent_requests");
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList2 = mongoDBRiverDefinition1.mongoServers;
        java.lang.String str3 = mongoDBRiverDefinition1.getBULK_TIMEOUT_FIELD();
        java.util.Set<java.lang.String> strSet4 = mongoDBRiverDefinition1.getParentTypes();
        int int5 = mongoDBRiverDefinition1.throttleSize;
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = mongoDBRiverDefinition1.getInitialTimestamp();
        boolean boolean7 = mongoDBRiverDefinition1.getdisableIndexRefresh();
        java.lang.String str8 = mongoDBRiverDefinition1.getOPTIONS_FIELD();
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertNotNull(serverAddressList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "bulk_timeout" + "'", str3, "bulk_timeout");
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "options" + "'", str8, "options");
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.lang.String str2 = mongoDBRiverDefinition1.getINDEX_OBJECT();
        java.util.Set<java.lang.String> strSet3 = mongoDBRiverDefinition1.parentTypes;
        boolean boolean4 = mongoDBRiverDefinition1.isStoreStatistics();
        boolean boolean5 = mongoDBRiverDefinition1.dropCollection;
        java.lang.String str6 = mongoDBRiverDefinition1.getSCRIPT_TYPE_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition1.getSIZE_FIELD();
        java.lang.String str8 = mongoDBRiverDefinition1.getTHROTTLE_SIZE_FIELD();
        java.lang.String str9 = mongoDBRiverDefinition1.getDROP_COLLECTION_FIELD();
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "index" + "'", str2, "index");
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "script_type" + "'", str6, "script_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "size" + "'", str7, "size");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "throttle_size" + "'", str8, "throttle_size");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "drop_collection" + "'", str9, "drop_collection");
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList2 = mongoDBRiverDefinition1.mongoServers;
        org.elasticsearch.common.unit.TimeValue timeValue3 = mongoDBRiverDefinition1.getDEFAULT_FLUSH_INTERVAL();
        boolean boolean4 = mongoDBRiverDefinition1.dropCollection;
        boolean boolean5 = mongoDBRiverDefinition1.getmongoSecondaryReadPreference();
        boolean boolean6 = mongoDBRiverDefinition1.isMongoSecondaryReadPreference();
        int int7 = mongoDBRiverDefinition1.getDEFAULT_DB_PORT();
        java.lang.String str8 = mongoDBRiverDefinition1.getBULK_TIMEOUT_FIELD();
        int int9 = mongoDBRiverDefinition1.getDEFAULT_CONCURRENT_REQUESTS();
        java.lang.String str10 = mongoDBRiverDefinition1.getNAME_FIELD();
        java.lang.String str11 = mongoDBRiverDefinition1.getADVANCED_TRANSFORMATION_FIELD();
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertNotNull(serverAddressList2);
        org.junit.Assert.assertNotNull(timeValue3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 27017 + "'", int7 == 27017);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "bulk_timeout" + "'", str8, "bulk_timeout");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "name" + "'", str10, "name");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "advanced_transformation" + "'", str11, "advanced_transformation");
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList2 = mongoDBRiverDefinition1.mongoServers;
        java.lang.String str3 = mongoDBRiverDefinition1.getBULK_TIMEOUT_FIELD();
        java.lang.String str4 = mongoDBRiverDefinition1.getNAME_FIELD();
        java.lang.String str5 = mongoDBRiverDefinition1.getCONCURRENT_REQUESTS_FIELD();
        int int6 = mongoDBRiverDefinition1.getDEFAULT_SOCKET_TIMEOUT();
        com.mongodb.MongoClientOptions mongoClientOptions7 = mongoDBRiverDefinition1.getMongoClientOptions();
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertNotNull(serverAddressList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "bulk_timeout" + "'", str3, "bulk_timeout");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "name" + "'", str4, "name");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "concurrent_requests" + "'", str5, "concurrent_requests");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 60000 + "'", int6 == 60000);
        org.junit.Assert.assertNull(mongoClientOptions7);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder3.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = null;
        builder3.setmongoOplogFilter(basicDBObject6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean9 = builder8.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder8.script("bulk");
        builder11.skipInitialImport = false;
        builder11.setscriptType("script");
        java.lang.String[] strArray33 = new java.lang.String[] { "exclude_fields", "servers", "secondary_read_preference", "name", "exclude_fields", "bulk_timeout", "skip_initial_import", "bulk", "script", "disable_index_refresh", "script.default_lang", "skip_initial_import", "gridfs", "user", "port", "parent_types", "size" };
        java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder11.excludeFields((java.util.Set<java.lang.String>) strSet34);
        builder3.setexcludeFields((java.util.Set<java.lang.String>) strSet34);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder3.throttleSize(100);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter40 = null;
        builder39.serializedObjectSupporter = serializedObjectSupporter40;
        builder39.mongoSecondaryReadPreference = false;
        com.mongodb.MongoClientOptions mongoClientOptions44 = builder39.getmongoClientOptions();
        org.elasticsearch.common.settings.Settings settings45 = null;
        org.elasticsearch.common.settings.Settings settings46 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean48 = builder47.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder47.script("bulk");
        com.mongodb.BasicDBObject basicDBObject51 = null;
        builder50.setmongoOplogFilter(basicDBObject51);
        com.mongodb.BasicDBObject basicDBObject53 = null;
        builder50.setmongoOplogFilter(basicDBObject53);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean56 = builder55.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = builder55.script("bulk");
        builder58.skipInitialImport = false;
        builder58.setscriptType("script");
        java.lang.String[] strArray80 = new java.lang.String[] { "exclude_fields", "servers", "secondary_read_preference", "name", "exclude_fields", "bulk_timeout", "skip_initial_import", "bulk", "script", "disable_index_refresh", "script.default_lang", "skip_initial_import", "gridfs", "user", "port", "parent_types", "size" };
        java.util.LinkedHashSet<java.lang.String> strSet81 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet81, strArray80);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder83 = builder58.excludeFields((java.util.Set<java.lang.String>) strSet81);
        builder50.setexcludeFields((java.util.Set<java.lang.String>) strSet81);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder86 = builder50.throttleSize(100);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory87 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder88 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean89 = builder88.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder91 = builder88.script("bulk");
        com.mongodb.BasicDBObject basicDBObject92 = builder91.getmongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript93 = docScoreNativeScriptFactory87.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject92);
        builder50.mongoCollectionFilter = basicDBObject92;
        org.elasticsearch.river.RiverSettings riverSettings95 = new org.elasticsearch.river.RiverSettings(settings46, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject92);
        org.elasticsearch.river.RiverSettings riverSettings96 = new org.elasticsearch.river.RiverSettings(settings45, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject92);
        builder39.mongoOplogFilter = basicDBObject92;
        builder39.setmongoSecondaryReadPreference(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNull(mongoClientOptions44);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(builder83);
        org.junit.Assert.assertNotNull(builder86);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(builder91);
        org.junit.Assert.assertNotNull(basicDBObject92);
        org.junit.Assert.assertNotNull(executableScript93);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder3.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = null;
        builder3.setmongoOplogFilter(basicDBObject6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean9 = builder8.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder8.script("bulk");
        builder11.skipInitialImport = false;
        builder11.setscriptType("script");
        java.lang.String[] strArray33 = new java.lang.String[] { "exclude_fields", "servers", "secondary_read_preference", "name", "exclude_fields", "bulk_timeout", "skip_initial_import", "bulk", "script", "disable_index_refresh", "script.default_lang", "skip_initial_import", "gridfs", "user", "port", "parent_types", "size" };
        java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder11.excludeFields((java.util.Set<java.lang.String>) strSet34);
        builder3.setexcludeFields((java.util.Set<java.lang.String>) strSet34);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder3.throttleSize(100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder3.riverIndexName("bulk_timeout");
        boolean boolean42 = builder3.getadvancedTransformation();
        builder3.setmongoGridFS(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList2 = mongoDBRiverDefinition1.mongoServers;
        java.lang.String str3 = mongoDBRiverDefinition1.getINITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD();
        int int4 = mongoDBRiverDefinition1.connectTimeout;
        java.lang.String str5 = mongoDBRiverDefinition1.getINDEX_OBJECT();
        java.lang.Boolean boolean6 = mongoDBRiverDefinition1.isMongos();
        java.lang.String str7 = mongoDBRiverDefinition1.mongoAdminPassword;
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertNotNull(serverAddressList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "script_type" + "'", str3, "script_type");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "index" + "'", str5, "index");
        org.junit.Assert.assertNull(boolean6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString4();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString15();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString18();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_river" + "'", str1, "_river");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mongodb-1638820218424" + "'", str2, "mongodb-1638820218424");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_river" + "'", str3, "_river");
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.script("store_statistics");
        java.lang.String str3 = builder2.getstatisticsIndexName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.script("flush_interval");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.connectTimeout((int) (byte) 0);
        com.mongodb.BasicDBObject basicDBObject8 = builder7.getmongoOplogFilter();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(basicDBObject8);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.lang.String str2 = mongoDBRiverDefinition1.getINDEX_OBJECT();
        java.util.Set<java.lang.String> strSet3 = mongoDBRiverDefinition1.parentTypes;
        java.lang.String str4 = mongoDBRiverDefinition1.riverName;
        boolean boolean5 = mongoDBRiverDefinition1.disableIndexRefresh;
        java.util.List<com.mongodb.ServerAddress> serverAddressList6 = mongoDBRiverDefinition1.mongoServers;
        java.lang.String str7 = mongoDBRiverDefinition1.getMongoOplogNamespace();
        int int8 = mongoDBRiverDefinition1.socketTimeout;
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "index" + "'", str2, "index");
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(serverAddressList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null.null" + "'", str7, "null.null");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = builder0.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList2 = mongoDBRiverDefinition1.mongoServers;
        org.elasticsearch.common.unit.TimeValue timeValue3 = mongoDBRiverDefinition1.getDEFAULT_FLUSH_INTERVAL();
        java.lang.String str4 = mongoDBRiverDefinition1.getINDEX_OBJECT();
        java.lang.String str5 = mongoDBRiverDefinition1.getSSL_CONNECTION_FIELD();
        java.lang.String str6 = mongoDBRiverDefinition1.getTYPE_FIELD();
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition1);
        org.junit.Assert.assertNotNull(serverAddressList2);
        org.junit.Assert.assertNotNull(timeValue3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "index" + "'", str4, "index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ssl" + "'", str5, "ssl");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "type" + "'", str6, "type");
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean3 = builder2.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.script("bulk");
        builder2.riverName = "concurrent_bulk_requests";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder2.connectTimeout((int) (byte) 10);
        docScoreSearchScript0.setNextVar("port", (java.lang.Object) builder9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean12 = builder11.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder11.script("bulk");
        builder11.riverName = "concurrent_bulk_requests";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder11.connectTimeout((int) (byte) 10);
        java.lang.Object obj19 = docScoreSearchScript0.unwrap((java.lang.Object) builder18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean21 = builder20.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder20.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder20.disableIndexRefresh(false);
        java.lang.String str26 = builder25.getstatisticsTypeName();
        java.util.Set<java.lang.String> strSet27 = builder25.excludeFields;
        java.lang.Object obj28 = docScoreSearchScript0.unwrap((java.lang.Object) strSet27);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean31 = builder30.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder30.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder30.disableIndexRefresh(false);
        java.lang.String str36 = builder35.getstatisticsTypeName();
        java.lang.String str37 = builder35.riverName;
        builder35.setimportAllCollections(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder35.connectTimeout(27017);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder41.advancedTransformation(false);
        java.lang.String str44 = builder41.getincludeCollection();
        docScoreSearchScript0.setNextVar("", (java.lang.Object) str44);
        org.apache.lucene.search.Scorer scorer46 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setScorer(scorer46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(strSet27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean3 = builder2.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.script("bulk");
        builder2.riverName = "concurrent_bulk_requests";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder2.connectTimeout((int) (byte) 10);
        docScoreSearchScript0.setNextVar("port", (java.lang.Object) builder9);
        docScoreSearchScript0.setNextScore((float) (short) 1);
        org.apache.lucene.search.Scorer scorer13 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setScorer(scorer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString4();
        org.elasticsearch.river.RiverSettings riverSettings2 = serializedObjectSupporter0.deserializeObjectRiverSettings3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString12();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString3();
        org.elasticsearch.river.RiverSettings riverSettings6 = serializedObjectSupporter0.deserializeObjectRiverSettings7();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString12();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_river" + "'", str1, "_river");
        org.junit.Assert.assertNotNull(riverSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_river" + "'", str3, "_river");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb-1638820218299" + "'", str4, "mongodb-1638820218299");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "mongodb-1638820218264" + "'", str5, "mongodb-1638820218264");
        org.junit.Assert.assertNotNull(riverSettings6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_river" + "'", str7, "_river");
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.disableIndexRefresh(false);
        java.lang.String str6 = builder5.getstatisticsTypeName();
        java.lang.String str7 = builder5.riverName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder5.socketTimeout(100);
        boolean boolean10 = builder5.dropCollection;
        java.lang.String str11 = builder5.riverIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder5.riverIndexName("secondary_read_preference");
        builder13.mongoGridFS = true;
        java.util.Set<java.lang.String> strSet16 = builder13.includeFields;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNull(strSet16);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder3.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = null;
        builder3.setmongoOplogFilter(basicDBObject6);
        java.lang.String str8 = builder3.typeName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean10 = builder9.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder9.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.mongoAdminUser("socket_timeout");
        java.lang.String str15 = builder14.riverName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder14.connectTimeout((int) (short) 1);
        com.mongodb.BasicDBObject basicDBObject18 = builder14.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder3.mongoCollectionFilter(basicDBObject18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.mongoCollection("concurrent_requests");
        boolean boolean22 = builder19.getmongoGridFS();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(basicDBObject18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder3.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = null;
        builder3.setmongoOplogFilter(basicDBObject6);
        boolean boolean8 = builder3.mongoGridFS;
        com.mongodb.MongoClientOptions mongoClientOptions9 = null;
        builder3.setmongoClientOptions(mongoClientOptions9);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("host", "options");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?options?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("bulk");
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder3.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = null;
        builder3.setmongoOplogFilter(basicDBObject6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder3.riverIndexName("socket_timeout");
        java.lang.String str10 = builder9.getriverName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder9.throttleSize(1000);
        java.util.Set<java.lang.String> strSet13 = builder9.excludeFields;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(strSet13);
    }
}

