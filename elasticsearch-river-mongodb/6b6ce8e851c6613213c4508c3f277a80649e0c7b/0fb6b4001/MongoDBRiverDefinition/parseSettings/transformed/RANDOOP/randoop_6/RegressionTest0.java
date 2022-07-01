import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test00001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00001");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.EXCLUDE_FIELDS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "exclude_fields" + "'", str0, "exclude_fields");
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("", "exclude_fields");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?exclude_fields?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.PARENT_TYPES_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "parent_types" + "'", str0, "parent_types");
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        int int0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DEFAULT_DB_PORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 27017 + "'", int0 == 27017);
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.BULK_TIMEOUT_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "bulk_timeout" + "'", str0, "bulk_timeout");
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        org.elasticsearch.common.unit.TimeValue timeValue0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DEFAULT_FLUSH_INTERVAL;
        org.junit.Assert.assertNotNull(timeValue0);
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.SSL_VERIFY_CERT_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ssl_verify_certificate" + "'", str0, "ssl_verify_certificate");
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.ADMIN_DB_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "admin" + "'", str0, "admin");
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.INDEX_OBJECT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index" + "'", str0, "index");
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DISABLE_INDEX_REFRESH_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "disable_index_refresh" + "'", str0, "disable_index_refresh");
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        javax.net.SocketFactory socketFactory0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.getSSLSocketFactory();
        org.junit.Assert.assertNotNull(socketFactory0);
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DEFAULT_DB_HOST;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "localhost" + "'", str0, "localhost");
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("", "hi!", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?hi!?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.SIZE_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "size" + "'", str0, "size");
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.SCRIPT_TYPE_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "script_type" + "'", str0, "script_type");
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.CREDENTIALS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "credentials" + "'", str0, "credentials");
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("script_type");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?script_type?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.COLLECTION_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "collection" + "'", str0, "collection");
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.CONNECTION_TIMEOUT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "connect_timeout" + "'", str0, "connect_timeout");
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.SKIP_INITIAL_IMPORT_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "skip_initial_import" + "'", str0, "skip_initial_import");
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.ADVANCED_TRANSFORMATION_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "advanced_transformation" + "'", str0, "advanced_transformation");
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.CONCURRENT_BULK_REQUESTS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "concurrent_bulk_requests" + "'", str0, "concurrent_bulk_requests");
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.INCLUDE_COLLECTION_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "include_collection" + "'", str0, "include_collection");
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DB_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "db" + "'", str0, "db");
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.SSL_CONNECTION_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ssl" + "'", str0, "ssl");
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.LOCAL_DB_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "local" + "'", str0, "local");
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DROP_COLLECTION_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "drop_collection" + "'", str0, "drop_collection");
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DEFAULT_BULK_SIZE;
        org.junit.Assert.assertNotNull(byteSizeValue0);
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
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
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        org.elasticsearch.common.settings.Settings settings2 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        org.elasticsearch.river.RiverSettings riverSettings4 = new org.elasticsearch.river.RiverSettings(settings2, strMap3);
        org.elasticsearch.script.ScriptService scriptService5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("script_type", "bulk_timeout", riverSettings4, scriptService5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.BULK_SIZE_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "bulk_size" + "'", str0, "bulk_size");
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.INITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "script_type" + "'", str0, "script_type");
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.SCRIPT_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "script" + "'", str0, "script");
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        int int0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DEFAULT_BULK_ACTIONS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1000 + "'", int0 == 1000);
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        org.elasticsearch.common.settings.Settings settings2 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        org.elasticsearch.river.RiverSettings riverSettings4 = new org.elasticsearch.river.RiverSettings(settings2, strMap3);
        org.elasticsearch.script.ScriptService scriptService5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("drop_collection", "connect_timeout", riverSettings4, scriptService5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.INCLUDE_FIELDS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "include_fields" + "'", str0, "include_fields");
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("skip_initial_import", "", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.SECONDARY_READ_PREFERENCE_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "secondary_read_preference" + "'", str0, "secondary_read_preference");
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.INITIAL_TIMESTAMP_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "initial_timestamp" + "'", str0, "initial_timestamp");
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.TYPE_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "type" + "'", str0, "type");
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.CONCURRENT_REQUESTS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "concurrent_requests" + "'", str0, "concurrent_requests");
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("concurrent_bulk_requests");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?concurrent_bulk_requests?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.BULK_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "bulk" + "'", str0, "bulk");
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.NAME_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "name" + "'", str0, "name");
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.IMPORT_ALL_COLLECTIONS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "import_all_collections" + "'", str0, "import_all_collections");
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.SERVERS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "servers" + "'", str0, "servers");
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("admin", "exclude_fields", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?exclude_fields?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.FLUSH_INTERVAL_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "flush_interval" + "'", str0, "flush_interval");
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        org.elasticsearch.common.settings.Settings settings2 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        org.elasticsearch.river.RiverSettings riverSettings4 = new org.elasticsearch.river.RiverSettings(settings2, strMap3);
        org.elasticsearch.script.ScriptService scriptService5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("db", "advanced_transformation", riverSettings4, scriptService5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.PORT_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "port" + "'", str0, "port");
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextSource(strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("db", "ssl_verify_certificate", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?ssl_verify_certificate?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.USER_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "user" + "'", str0, "user");
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.PASSWORD_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "password" + "'", str0, "password");
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("index", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
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
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.STORE_STATISTICS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "store_statistics" + "'", str0, "store_statistics");
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.apache.lucene.index.AtomicReaderContext atomicReaderContext1 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextReader(atomicReaderContext1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.GRIDFS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "gridfs" + "'", str0, "gridfs");
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 0L);
        org.apache.lucene.index.AtomicReaderContext atomicReaderContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextReader(atomicReaderContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("credentials", "password", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?password?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.FILTER_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "filter" + "'", str0, "filter");
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("store_statistics", "concurrent_requests", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?concurrent_requests?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.THROTTLE_SIZE_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "throttle_size" + "'", str0, "throttle_size");
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("password", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("throttle_size", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.INITIAL_TIMESTAMP_SCRIPT_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "script" + "'", str0, "script");
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("ssl");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?ssl?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("password", "import_all_collections");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?import_all_collections?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("", "filter", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?filter? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 'a');
        org.apache.lucene.search.Scorer scorer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setScorer(scorer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("filter", "concurrent_requests");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?concurrent_requests?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("size", "name");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?name? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("concurrent_bulk_requests", "credentials", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?credentials?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("store_statistics", "parent_types");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?parent_types?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextSource(strMap3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + true + "'", obj2, true);
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("ssl_verify_certificate", "bulk_size");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?bulk_size?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        docScoreSearchScript0.setNextVar("connect_timeout", (java.lang.Object) "type");
        org.apache.lucene.search.Scorer scorer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setScorer(scorer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + true + "'", obj2, true);
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.HOST_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "host" + "'", str0, "host");
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("bulk_size", "include_collection");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?include_collection?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        docScoreSearchScript0.setNextVar("connect_timeout", (java.lang.Object) "type");
        java.lang.Object obj7 = docScoreSearchScript0.unwrap((java.lang.Object) "ssl");
        java.lang.Class<?> wildcardClass8 = obj7.getClass();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + true + "'", obj2, true);
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "ssl" + "'", obj7, "ssl");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("", "localhost");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?localhost?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("secondary_read_preference", "ssl", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?ssl?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("filter");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?filter? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        org.elasticsearch.common.settings.Settings settings2 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        org.elasticsearch.river.RiverSettings riverSettings4 = new org.elasticsearch.river.RiverSettings(settings2, strMap3);
        org.elasticsearch.script.ScriptService scriptService5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("parent_types", "db", riverSettings4, scriptService5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.script("script");
        org.bson.types.BSONTimestamp bSONTimestamp3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.initialTimestamp(bSONTimestamp3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ts must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        docScoreSearchScript0.setNextScore(100.0f);
        org.apache.lucene.search.Scorer scorer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setScorer(scorer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + true + "'", obj2, true);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = builder0.initialTimestamp;
        builder0.setstatisticsTypeName("ssl_verify_certificate");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.scriptType("drop_collection");
        java.lang.Class<?> wildcardClass10 = builder0.getClass();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("initial_timestamp", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextScore((float) ' ');
        org.apache.lucene.search.Scorer scorer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setScorer(scorer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("name");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?name? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = builder0.initialTimestamp;
        builder0.mongoDb = "initial_timestamp";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.mongoAdminPassword("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder11.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet14 = builder11.excludeFields;
        com.mongodb.BasicDBObject basicDBObject15 = builder11.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = builder11.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray17 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList18 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList18, serverAddressArray17);
        builder11.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList18);
        builder10.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder22.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet25 = builder22.excludeFields;
        com.mongodb.BasicDBObject basicDBObject26 = builder22.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp27 = builder22.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray28 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList29 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList29, serverAddressArray28);
        builder22.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList29);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder10.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList29);
        builder9.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList29);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(strSet14);
        org.junit.Assert.assertNotNull(basicDBObject15);
        org.junit.Assert.assertNull(wildcardTimestamp16);
        org.junit.Assert.assertNotNull(serverAddressArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(strSet25);
        org.junit.Assert.assertNotNull(basicDBObject26);
        org.junit.Assert.assertNull(wildcardTimestamp27);
        org.junit.Assert.assertNotNull(serverAddressArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(builder32);
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        int int0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DEFAULT_CONCURRENT_REQUESTS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        builder0.setmongoAdminPassword("initial_timestamp");
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        org.elasticsearch.common.settings.Settings settings2 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        org.elasticsearch.river.RiverSettings riverSettings4 = new org.elasticsearch.river.RiverSettings(settings2, strMap3);
        org.elasticsearch.common.settings.Settings settings5 = riverSettings4.globalSettings();
        org.elasticsearch.script.ScriptService scriptService6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("gridfs", "db", riverSettings4, scriptService6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(settings5);
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getHOST_FIELD();
        java.lang.String str12 = mongoDBRiverDefinition9.getCONCURRENT_BULK_REQUESTS_FIELD();
        boolean boolean13 = mongoDBRiverDefinition9.getskipInitialImport();
        boolean boolean14 = mongoDBRiverDefinition9.isDisableIndexRefresh();
        java.lang.String str15 = mongoDBRiverDefinition9.getTypeName();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "host" + "'", str11, "host");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "concurrent_bulk_requests" + "'", str12, "concurrent_bulk_requests");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.ACTIONS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "actions" + "'", str0, "actions");
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.script("script");
        com.mongodb.BasicDBObject basicDBObject3 = builder2.getmongoCollectionFilter();
        builder2.setmongoLocalPassword("exclude_fields");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder2.connectTimeout((-1));
        org.bson.types.Binary binary8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.initialTimestamp(binary8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(basicDBObject3);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        boolean boolean3 = builder0.getmongoSSLVerifyCertificate();
        java.lang.String str4 = builder0.getriverIndexName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.socketTimeout(100);
        boolean boolean7 = builder0.getimportAllCollections();
        int int8 = builder0.socketTimeout;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoGridFS(true);
        org.bson.types.BSONTimestamp bSONTimestamp11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.initialTimestamp(bSONTimestamp11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ts must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        builder0.setmongoAdminPassword("store_statistics");
        builder0.setdisableIndexRefresh(false);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.env.Environment environment1 = null;
        java.util.Set<org.elasticsearch.script.ScriptEngineService> scriptEngineServiceSet2 = null;
        org.elasticsearch.watcher.ResourceWatcherService resourceWatcherService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.script.ScriptService scriptService4 = new org.elasticsearch.script.ScriptService(settings0, environment1, scriptEngineServiceSet2, resourceWatcherService3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getCOLLECTION_FIELD();
        java.util.Set<java.lang.String> strSet12 = mongoDBRiverDefinition9.excludeFields;
        boolean boolean13 = mongoDBRiverDefinition9.getstoreStatistics();
        boolean boolean14 = mongoDBRiverDefinition9.getmongoGridFS();
        java.lang.String str15 = mongoDBRiverDefinition9.getCONCURRENT_REQUESTS_FIELD();
        java.lang.String str16 = mongoDBRiverDefinition9.getLOCAL_DB_FIELD();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "collection" + "'", str11, "collection");
        org.junit.Assert.assertNull(strSet12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "concurrent_requests" + "'", str15, "concurrent_requests");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "local" + "'", str16, "local");
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder1.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet4 = builder1.excludeFields;
        com.mongodb.BasicDBObject basicDBObject5 = builder1.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = builder1.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray7 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList8 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList8, serverAddressArray7);
        builder1.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList8);
        builder0.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList8);
        builder0.mongoLocalUser = "credentials";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder0.mongoAdminUser("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.mongoSecondaryReadPreference(false);
        int int18 = builder17.getthrottleSize();
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertNotNull(basicDBObject5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNotNull(serverAddressArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        org.elasticsearch.common.settings.Settings settings2 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        org.elasticsearch.river.RiverSettings riverSettings4 = new org.elasticsearch.river.RiverSettings(settings2, strMap3);
        org.elasticsearch.script.ScriptService scriptService5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("hi!", "skip_initial_import", riverSettings4, scriptService5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.script("script");
        com.mongodb.BasicDBObject basicDBObject3 = builder2.getmongoCollectionFilter();
        builder2.setmongoLocalPassword("exclude_fields");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder2.connectTimeout((-1));
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.mongoGridFS(false);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = builder9.getinitialTimestamp();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(basicDBObject3);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(wildcardTimestamp10);
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        java.lang.String str4 = builder0.getmongoLocalPassword();
        builder0.mongoGridFS = false;
        com.mongodb.MongoClientOptions mongoClientOptions7 = null;
        builder0.mongoClientOptions = mongoClientOptions7;
        java.lang.String str9 = builder0.getindexName();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.script("script");
        java.lang.String str3 = builder0.statisticsIndexName;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = builder0.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray6 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList7 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList7, serverAddressArray6);
        builder0.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList7);
        java.lang.String str10 = builder0.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.dropCollection(true);
        java.lang.String str13 = builder12.typeName;
        builder12.setmongoSecondaryReadPreference(false);
        boolean boolean16 = builder12.mongoGridFS;
        builder12.setmongoUseSSL(false);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNotNull(serverAddressArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getCOLLECTION_FIELD();
        java.util.Set<java.lang.String> strSet12 = mongoDBRiverDefinition9.excludeFields;
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = mongoDBRiverDefinition9.getInitialTimestamp();
        java.util.Set<java.lang.String> strSet14 = mongoDBRiverDefinition9.excludeFields;
        boolean boolean15 = mongoDBRiverDefinition9.isMongoGridFS();
        java.lang.Class<?> wildcardClass16 = mongoDBRiverDefinition9.getClass();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "collection" + "'", str11, "collection");
        org.junit.Assert.assertNull(strSet12);
        org.junit.Assert.assertNull(wildcardTimestamp13);
        org.junit.Assert.assertNull(strSet14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("collection", "size");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?size?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        boolean boolean3 = builder0.getmongoSSLVerifyCertificate();
        java.lang.String str4 = builder0.getriverIndexName();
        builder0.setimportAllCollections(false);
        java.lang.String str7 = builder0.getriverName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = builder0.initialTimestamp;
        builder0.mongoDb = "initial_timestamp";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.mongoAdminPassword("hi!");
        java.util.Set<java.lang.String> strSet10 = builder0.getparentTypes();
        java.lang.String str11 = builder0.getindexName();
        org.bson.types.Binary binary12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder0.initialTimestamp(binary12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(strSet10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        boolean boolean11 = mongoDBRiverDefinition9.mongoGridFS;
        boolean boolean12 = mongoDBRiverDefinition9.advancedTransformation;
        java.lang.String str13 = mongoDBRiverDefinition9.getADMIN_DB_FIELD();
        java.lang.String str14 = mongoDBRiverDefinition9.getBULK_TIMEOUT_FIELD();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "bulk_timeout" + "'", str14, "bulk_timeout");
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = builder0.initialTimestamp;
        builder0.setstatisticsTypeName("ssl_verify_certificate");
        boolean boolean8 = builder0.getmongoUseSSL();
        builder0.mongoCollection = "db";
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        boolean boolean3 = builder0.getmongoSSLVerifyCertificate();
        java.lang.String str4 = builder0.getriverIndexName();
        builder0.setimportAllCollections(false);
        builder0.setriverIndexName("gridfs");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = builder0.getinitialTimestamp();
        builder0.setconnectTimeout(0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(wildcardTimestamp9);
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        docScoreSearchScript0.setNextScore((float) 10L);
        docScoreSearchScript0.setNextScore(0.0f);
        org.apache.lucene.index.AtomicReaderContext atomicReaderContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextReader(atomicReaderContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + true + "'", obj2, true);
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getTypeName();
        java.lang.String str12 = mongoDBRiverDefinition9.statisticsTypeName;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        builder0.setmongoAdminPassword("store_statistics");
        com.mongodb.BasicDBObject basicDBObject11 = builder0.mongoOplogFilter;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(basicDBObject11);
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getHOST_FIELD();
        java.lang.String str12 = mongoDBRiverDefinition9.getCONCURRENT_BULK_REQUESTS_FIELD();
        boolean boolean13 = mongoDBRiverDefinition9.getskipInitialImport();
        boolean boolean14 = mongoDBRiverDefinition9.isDisableIndexRefresh();
        org.elasticsearch.common.unit.TimeValue timeValue15 = mongoDBRiverDefinition9.getDEFAULT_FLUSH_INTERVAL();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "host" + "'", str11, "host");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "concurrent_bulk_requests" + "'", str12, "concurrent_bulk_requests");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(timeValue15);
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.SOCKET_TIMEOUT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "socket_timeout" + "'", str0, "socket_timeout");
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("", "secondary_read_preference");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?secondary_read_preference?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.script("script");
        builder0.mongoUseSSL = true;
        builder0.scriptType = "concurrent_bulk_requests";
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.OPTIONS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "options" + "'", str0, "options");
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        builder0.setmongoAdminPassword("store_statistics");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.scriptType("bulk_size");
        builder0.setmongoGridFS(true);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        org.elasticsearch.common.settings.Settings settings2 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        org.elasticsearch.river.RiverSettings riverSettings4 = new org.elasticsearch.river.RiverSettings(settings2, strMap3);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = riverSettings4.settings();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = riverSettings4.settings();
        org.elasticsearch.common.settings.Settings settings7 = riverSettings4.globalSettings();
        org.elasticsearch.script.ScriptService scriptService8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("ssl_verify_certificate", "ssl_verify_certificate", riverSettings4, scriptService8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(settings7);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = builder0.initialTimestamp;
        builder0.setstatisticsTypeName("ssl_verify_certificate");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.scriptType("drop_collection");
        java.lang.String str10 = builder0.getmongoDb();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("password", "host", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?host?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = builder0.initialTimestamp;
        builder0.setstatisticsTypeName("ssl_verify_certificate");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.mongoSSLVerifyCertificate(true);
        builder0.statisticsTypeName = "import_all_collections";
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getIndexName();
        java.lang.String str12 = mongoDBRiverDefinition9.getSECONDARY_READ_PREFERENCE_FIELD();
        boolean boolean13 = mongoDBRiverDefinition9.isImportAllCollections();
        java.lang.String str14 = mongoDBRiverDefinition9.getPARENT_TYPES_FIELD();
        int int15 = mongoDBRiverDefinition9.getConnectTimeout();
        java.lang.String str16 = mongoDBRiverDefinition9.getINDEX_OBJECT();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "secondary_read_preference" + "'", str12, "secondary_read_preference");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "parent_types" + "'", str14, "parent_types");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "index" + "'", str16, "index");
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        boolean boolean11 = mongoDBRiverDefinition9.mongoGridFS;
        java.lang.String str12 = mongoDBRiverDefinition9.getINITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD();
        java.util.Set<java.lang.String> strSet13 = mongoDBRiverDefinition9.getExcludeFields();
        boolean boolean14 = mongoDBRiverDefinition9.disableIndexRefresh;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "script_type" + "'", str12, "script_type");
        org.junit.Assert.assertNull(strSet13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = builder0.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray6 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList7 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList7, serverAddressArray6);
        builder0.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList7);
        java.lang.String str10 = builder0.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.dropCollection(true);
        builder12.setriverIndexName("flush_interval");
        boolean boolean15 = builder12.disableIndexRefresh;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNotNull(serverAddressArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = builder0.initialTimestamp;
        builder0.mongoDb = "initial_timestamp";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.mongoAdminPassword("hi!");
        java.util.Set<java.lang.String> strSet10 = builder0.getparentTypes();
        java.lang.String str11 = builder0.getindexName();
        java.lang.String str12 = builder0.getincludeCollection();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(strSet10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getIndexName();
        java.lang.String str12 = mongoDBRiverDefinition9.getSECONDARY_READ_PREFERENCE_FIELD();
        boolean boolean13 = mongoDBRiverDefinition9.isImportAllCollections();
        java.lang.String str14 = mongoDBRiverDefinition9.getPARENT_TYPES_FIELD();
        boolean boolean15 = mongoDBRiverDefinition9.isMongoGridFS();
        boolean boolean16 = mongoDBRiverDefinition9.dropCollection;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "secondary_read_preference" + "'", str12, "secondary_read_preference");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "parent_types" + "'", str14, "parent_types");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("local", "exclude_fields", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?exclude_fields?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        docScoreSearchScript0.setNextScore((float) 10L);
        org.apache.lucene.search.Scorer scorer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setScorer(scorer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + true + "'", obj2, true);
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.script("script");
        java.lang.String[] strArray34 = new java.lang.String[] { "include_collection", "host", "hi!", "drop_collection", "size", "filter", "bulk_timeout", "drop_collection", "concurrent_bulk_requests", "servers", "localhost", "store_statistics", "script", "secondary_read_preference", "throttle_size", "parent_types", "db", "type", "admin", "filter", "servers", "user", "secondary_read_preference", "connect_timeout", "local", "host", "drop_collection", "user", "password", "ssl_verify_certificate", "password" };
        java.util.LinkedHashSet<java.lang.String> strSet35 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet35, strArray34);
        builder2.setparentTypes((java.util.Set<java.lang.String>) strSet35);
        boolean boolean38 = builder2.getadvancedTransformation();
        boolean boolean39 = builder2.mongoSecondaryReadPreference;
        builder2.setscript("collection");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getIndexName();
        java.lang.String str12 = mongoDBRiverDefinition9.getSECONDARY_READ_PREFERENCE_FIELD();
        java.lang.String str13 = mongoDBRiverDefinition9.script;
        java.lang.String str14 = mongoDBRiverDefinition9.getGRIDFS_FIELD();
        java.lang.Class<?> wildcardClass15 = mongoDBRiverDefinition9.getClass();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "secondary_read_preference" + "'", str12, "secondary_read_preference");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "gridfs" + "'", str14, "gridfs");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        boolean boolean11 = mongoDBRiverDefinition9.mongoGridFS;
        boolean boolean12 = mongoDBRiverDefinition9.advancedTransformation;
        java.lang.String str13 = mongoDBRiverDefinition9.typeName;
        java.util.Set<java.lang.String> strSet14 = mongoDBRiverDefinition9.parentTypes;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(strSet14);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getTypeName();
        com.mongodb.MongoClientOptions mongoClientOptions12 = mongoDBRiverDefinition9.getMongoClientOptions();
        java.lang.String str13 = mongoDBRiverDefinition9.scriptType;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(mongoClientOptions12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getIndexName();
        java.lang.String str12 = mongoDBRiverDefinition9.getSECONDARY_READ_PREFERENCE_FIELD();
        java.util.Set<java.lang.String> strSet13 = mongoDBRiverDefinition9.excludeFields;
        java.lang.String str14 = mongoDBRiverDefinition9.getOPTIONS_FIELD();
        java.lang.String str15 = mongoDBRiverDefinition9.mongoAdminUser;
        java.util.List<com.mongodb.ServerAddress> serverAddressList16 = mongoDBRiverDefinition9.mongoServers;
        java.lang.String str17 = mongoDBRiverDefinition9.getTHROTTLE_SIZE_FIELD();
        java.lang.String str18 = mongoDBRiverDefinition9.mongoLocalPassword;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "secondary_read_preference" + "'", str12, "secondary_read_preference");
        org.junit.Assert.assertNull(strSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "options" + "'", str14, "options");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(serverAddressList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "throttle_size" + "'", str17, "throttle_size");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextVar("disable_index_refresh", (java.lang.Object) "index");
        org.apache.lucene.index.AtomicReaderContext atomicReaderContext6 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextReader(atomicReaderContext6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("advanced_transformation", "bulk_timeout");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?bulk_timeout?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("ssl", "admin");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?admin?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder1.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet4 = builder1.excludeFields;
        com.mongodb.BasicDBObject basicDBObject5 = builder1.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = builder1.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray7 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList8 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList8, serverAddressArray7);
        builder1.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList8);
        builder0.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder12.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet15 = builder12.excludeFields;
        com.mongodb.BasicDBObject basicDBObject16 = builder12.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp17 = builder12.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray18 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList19 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList19, serverAddressArray18);
        builder12.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList19);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder0.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList19);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder23.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet26 = builder23.excludeFields;
        builder23.setmongoCollection("initial_timestamp");
        boolean boolean29 = builder23.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder23.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition32 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder31);
        java.lang.String str33 = mongoDBRiverDefinition32.includeCollection;
        java.lang.String str34 = mongoDBRiverDefinition32.getCOLLECTION_FIELD();
        java.util.Set<java.lang.String> strSet35 = mongoDBRiverDefinition32.excludeFields;
        boolean boolean36 = mongoDBRiverDefinition32.getstoreStatistics();
        boolean boolean37 = mongoDBRiverDefinition32.getmongoGridFS();
        java.lang.String str38 = mongoDBRiverDefinition32.getSECONDARY_READ_PREFERENCE_FIELD();
        int int39 = mongoDBRiverDefinition32.socketTimeout;
        com.mongodb.BasicDBObject basicDBObject40 = mongoDBRiverDefinition32.mongoCollectionFilter;
        builder0.setmongoCollectionFilter(basicDBObject40);
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertNotNull(basicDBObject5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNotNull(serverAddressArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strSet15);
        org.junit.Assert.assertNotNull(basicDBObject16);
        org.junit.Assert.assertNull(wildcardTimestamp17);
        org.junit.Assert.assertNotNull(serverAddressArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNull(strSet26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "collection" + "'", str34, "collection");
        org.junit.Assert.assertNull(strSet35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "secondary_read_preference" + "'", str38, "secondary_read_preference");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(basicDBObject40);
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        boolean boolean3 = builder0.getmongoSSLVerifyCertificate();
        boolean boolean4 = builder0.getadvancedTransformation();
        org.bson.types.Binary binary5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.initialTimestamp(binary5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = builder0.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray6 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList7 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList7, serverAddressArray6);
        builder0.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList7);
        java.lang.String str10 = builder0.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.dropCollection(true);
        java.lang.String str13 = builder0.mongoCollection;
        java.lang.String str14 = builder0.includeCollection;
        boolean boolean15 = builder0.getstoreStatistics();
        java.util.Set<java.lang.String> strSet16 = builder0.parentTypes;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNotNull(serverAddressArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(strSet16);
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder1.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet4 = builder1.excludeFields;
        com.mongodb.BasicDBObject basicDBObject5 = builder1.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = builder1.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray7 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList8 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList8, serverAddressArray7);
        builder1.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList8);
        builder0.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList8);
        builder0.mongoLocalUser = "credentials";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder0.mongoAdminUser("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.mongoSecondaryReadPreference(false);
        boolean boolean18 = builder15.advancedTransformation;
        builder15.setthrottleSize((-1));
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertNotNull(basicDBObject5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNotNull(serverAddressArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 'a');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder3.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet6 = builder3.excludeFields;
        builder3.setmongoCollection("initial_timestamp");
        boolean boolean9 = builder3.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder3.skipInitialImport(false);
        builder3.disableIndexRefresh = true;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder3.socketTimeout((int) (short) 1);
        builder3.includeCollection = "gridfs";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder3.importAllCollections(false);
        java.util.Set<java.lang.String> strSet20 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.includeFields(strSet20);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder22.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet25 = builder22.excludeFields;
        builder22.setmongoCollection("initial_timestamp");
        boolean boolean28 = builder22.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder22.skipInitialImport(false);
        java.lang.String str31 = builder30.typeName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder32.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet35 = builder32.excludeFields;
        com.mongodb.BasicDBObject basicDBObject36 = builder32.getmongoCollectionFilter();
        java.lang.String str37 = builder32.mongoLocalUser;
        com.mongodb.ServerAddress[] serverAddressArray38 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList39 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList39, serverAddressArray38);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder32.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList39);
        boolean boolean42 = builder41.dropCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder43.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet46 = builder43.excludeFields;
        com.mongodb.BasicDBObject basicDBObject47 = builder43.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp48 = builder43.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray49 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList50 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList50, serverAddressArray49);
        builder43.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList50);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder41.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList50);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder54.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet57 = builder54.excludeFields;
        com.mongodb.BasicDBObject basicDBObject58 = builder54.getmongoCollectionFilter();
        java.lang.String str59 = builder54.mongoLocalUser;
        com.mongodb.ServerAddress[] serverAddressArray60 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList61 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList61, serverAddressArray60);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = builder54.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList61);
        java.lang.String str64 = builder54.mongoAdminPassword;
        java.lang.String[] strArray69 = new java.lang.String[] { "admin", "script_type", "credentials", "password" };
        java.util.LinkedHashSet<java.lang.String> strSet70 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet70, strArray69);
        builder54.setincludeFields((java.util.Set<java.lang.String>) strSet70);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder73 = builder41.excludeFields((java.util.Set<java.lang.String>) strSet70);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder74 = builder30.parentTypes((java.util.Set<java.lang.String>) strSet70);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder75 = builder21.excludeFields((java.util.Set<java.lang.String>) strSet70);
        java.lang.Object obj76 = docScoreSearchScript0.unwrap((java.lang.Object) builder21);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder77 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder77.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet80 = builder77.excludeFields;
        builder77.setmongoCollection("initial_timestamp");
        boolean boolean83 = builder77.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder85 = builder77.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition86 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder85);
        java.lang.String str87 = mongoDBRiverDefinition86.includeCollection;
        boolean boolean88 = mongoDBRiverDefinition86.mongoGridFS;
        boolean boolean89 = mongoDBRiverDefinition86.advancedTransformation;
        java.lang.String str90 = mongoDBRiverDefinition86.getADMIN_DB_FIELD();
        boolean boolean91 = mongoDBRiverDefinition86.getdisableIndexRefresh();
        boolean boolean92 = mongoDBRiverDefinition86.isMongoSecondaryReadPreference();
        java.lang.Object obj93 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition86);
        org.apache.lucene.search.Scorer scorer94 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setScorer(scorer94);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNull(strSet25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(strSet35);
        org.junit.Assert.assertNotNull(basicDBObject36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(serverAddressArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(strSet46);
        org.junit.Assert.assertNotNull(basicDBObject47);
        org.junit.Assert.assertNull(wildcardTimestamp48);
        org.junit.Assert.assertNotNull(serverAddressArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNull(strSet57);
        org.junit.Assert.assertNotNull(basicDBObject58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(serverAddressArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertNotNull(builder75);
        org.junit.Assert.assertNotNull(obj76);
        org.junit.Assert.assertNull(strSet80);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(builder85);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "admin" + "'", str90, "admin");
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(obj93);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        java.lang.String str4 = builder0.getmongoLocalPassword();
        builder0.mongoGridFS = false;
        com.mongodb.MongoClientOptions mongoClientOptions7 = null;
        builder0.mongoClientOptions = mongoClientOptions7;
        java.lang.String str9 = builder0.getincludeCollection();
        com.mongodb.MongoClientOptions mongoClientOptions10 = null;
        builder0.setmongoClientOptions(mongoClientOptions10);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoSSLVerifyCertificate(true);
        java.util.Set<java.lang.String> strSet6 = builder5.excludeFields;
        boolean boolean7 = builder5.getdropCollection();
        builder5.setimportAllCollections(false);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoSSLVerifyCertificate(true);
        java.util.Set<java.lang.String> strSet6 = builder5.excludeFields;
        boolean boolean7 = builder5.getdropCollection();
        builder5.setindexName("script_type");
        builder5.throttleSize = (short) 100;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getHOST_FIELD();
        java.lang.String str12 = mongoDBRiverDefinition9.getMongoLocalPassword();
        boolean boolean13 = mongoDBRiverDefinition9.getmongoSecondaryReadPreference();
        boolean boolean14 = mongoDBRiverDefinition9.isImportAllCollections();
        java.lang.String str15 = mongoDBRiverDefinition9.statisticsTypeName;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "host" + "'", str11, "host");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getIndexName();
        java.lang.String str12 = mongoDBRiverDefinition9.getSECONDARY_READ_PREFERENCE_FIELD();
        java.lang.String str13 = mongoDBRiverDefinition9.getStatisticsTypeName();
        java.lang.String str14 = mongoDBRiverDefinition9.getHOST_FIELD();
        java.lang.String str15 = mongoDBRiverDefinition9.getTHROTTLE_SIZE_FIELD();
        int int16 = mongoDBRiverDefinition9.getDEFAULT_DB_PORT();
        boolean boolean17 = mongoDBRiverDefinition9.getmongoSecondaryReadPreference();
        boolean boolean18 = mongoDBRiverDefinition9.isSkipInitialImport();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "secondary_read_preference" + "'", str12, "secondary_read_preference");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "host" + "'", str14, "host");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "throttle_size" + "'", str15, "throttle_size");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 27017 + "'", int16 == 27017);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("disable_index_refresh", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getTypeName();
        com.mongodb.BasicDBObject basicDBObject12 = mongoDBRiverDefinition9.getMongoCollectionFilter();
        java.util.Set<java.lang.String> strSet13 = mongoDBRiverDefinition9.parentTypes;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(basicDBObject12);
        org.junit.Assert.assertNull(strSet13);
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getHOST_FIELD();
        boolean boolean12 = mongoDBRiverDefinition9.isAdvancedTransformation();
        java.util.Set<java.lang.String> strSet13 = mongoDBRiverDefinition9.excludeFields;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = strSet13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "host" + "'", str11, "host");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(strSet13);
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getIndexName();
        java.lang.String str12 = mongoDBRiverDefinition9.getSECONDARY_READ_PREFERENCE_FIELD();
        java.lang.String str13 = mongoDBRiverDefinition9.mongoAdminUser;
        java.util.Set<java.lang.String> strSet14 = mongoDBRiverDefinition9.excludeFields;
        boolean boolean15 = mongoDBRiverDefinition9.getstoreStatistics();
        com.mongodb.BasicDBObject basicDBObject16 = mongoDBRiverDefinition9.getMongoOplogFilter();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "secondary_read_preference" + "'", str12, "secondary_read_preference");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(strSet14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(basicDBObject16);
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        java.lang.String str5 = builder0.mongoLocalUser;
        builder0.setscript("drop_collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder8.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet11 = builder8.excludeFields;
        com.mongodb.BasicDBObject basicDBObject12 = builder8.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder0.mongoCollectionFilter(basicDBObject12);
        builder13.mongoSecondaryReadPreference = false;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder13.mongoCollection("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder13);
        builder13.advancedTransformation = true;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(strSet11);
        org.junit.Assert.assertNotNull(basicDBObject12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        java.lang.String str5 = builder0.mongoLocalUser;
        com.mongodb.ServerAddress[] serverAddressArray6 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList7 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList7, serverAddressArray6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList7);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder0.getmongoClientOptions();
        builder0.riverName = "script_type";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder13.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet16 = builder13.excludeFields;
        com.mongodb.BasicDBObject basicDBObject17 = builder13.getmongoCollectionFilter();
        builder0.setmongoOplogFilter(basicDBObject17);
        boolean boolean19 = builder0.mongoGridFS;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder0.mongoAdminPassword("user");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder0.importAllCollections(false);
        java.lang.String str24 = builder23.mongoCollection;
        builder23.advancedTransformation = true;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(serverAddressArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(mongoClientOptions10);
        org.junit.Assert.assertNull(strSet16);
        org.junit.Assert.assertNotNull(basicDBObject17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getHOST_FIELD();
        java.lang.String str12 = mongoDBRiverDefinition9.getMongoLocalPassword();
        java.lang.String str13 = mongoDBRiverDefinition9.scriptType;
        org.elasticsearch.common.logging.ESLogger eSLogger14 = mongoDBRiverDefinition9.getlogger();
        java.util.Set<java.lang.String> strSet15 = mongoDBRiverDefinition9.getIncludeFields();
        java.lang.String str16 = mongoDBRiverDefinition9.getGRIDFS_FIELD();
        java.lang.String str17 = mongoDBRiverDefinition9.statisticsIndexName;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "host" + "'", str11, "host");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(eSLogger14);
        org.junit.Assert.assertNull(strSet15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "gridfs" + "'", str16, "gridfs");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        builder0.disableIndexRefresh = true;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.importAllCollections(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder13.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet16 = builder13.excludeFields;
        com.mongodb.BasicDBObject basicDBObject17 = builder13.getmongoCollectionFilter();
        java.lang.String str18 = builder13.mongoLocalUser;
        com.mongodb.ServerAddress[] serverAddressArray19 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList20 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList20, serverAddressArray19);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder13.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList20);
        boolean boolean23 = builder22.dropCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder24.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet27 = builder24.excludeFields;
        com.mongodb.BasicDBObject basicDBObject28 = builder24.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp29 = builder24.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray30 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList31 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList31, serverAddressArray30);
        builder24.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList31);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder22.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList31);
        builder12.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList31);
        com.mongodb.MongoClientOptions mongoClientOptions36 = null;
        builder12.mongoClientOptions = mongoClientOptions36;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(strSet16);
        org.junit.Assert.assertNotNull(basicDBObject17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(serverAddressArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(strSet27);
        org.junit.Assert.assertNotNull(basicDBObject28);
        org.junit.Assert.assertNull(wildcardTimestamp29);
        org.junit.Assert.assertNotNull(serverAddressArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(builder34);
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("host", "advanced_transformation");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?advanced_transformation?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = builder0.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray6 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList7 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList7, serverAddressArray6);
        builder0.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList7);
        java.lang.String str10 = builder0.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.dropCollection(true);
        java.lang.String str13 = builder12.typeName;
        builder12.setmongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder16.setmongoSecondaryReadPreference(false);
        boolean boolean19 = builder16.getmongoSSLVerifyCertificate();
        java.lang.String str20 = builder16.getriverIndexName();
        builder16.setimportAllCollections(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder16.mongoUseSSL(true);
        builder16.setdisableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder16.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder29.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet32 = builder29.excludeFields;
        java.lang.String str33 = builder29.getmongoLocalPassword();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.script("script");
        java.lang.String[] strArray68 = new java.lang.String[] { "include_collection", "host", "hi!", "drop_collection", "size", "filter", "bulk_timeout", "drop_collection", "concurrent_bulk_requests", "servers", "localhost", "store_statistics", "script", "secondary_read_preference", "throttle_size", "parent_types", "db", "type", "admin", "filter", "servers", "user", "secondary_read_preference", "connect_timeout", "local", "host", "drop_collection", "user", "password", "ssl_verify_certificate", "password" };
        java.util.LinkedHashSet<java.lang.String> strSet69 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet69, strArray68);
        builder36.setparentTypes((java.util.Set<java.lang.String>) strSet69);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder72 = builder29.parentTypes((java.util.Set<java.lang.String>) strSet69);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder73 = builder28.parentTypes((java.util.Set<java.lang.String>) strSet69);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder74 = builder12.excludeFields((java.util.Set<java.lang.String>) strSet69);
        java.lang.String str75 = builder74.getstatisticsIndexName();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNotNull(serverAddressArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNull(strSet32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertNull(str75);
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        org.elasticsearch.common.logging.ESLogger eSLogger3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.logger;
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) eSLogger3);
        org.apache.lucene.search.Scorer scorer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setScorer(scorer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + true + "'", obj2, true);
        org.junit.Assert.assertNotNull(eSLogger3);
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        java.lang.String str4 = builder0.getmongoLocalPassword();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.script("script");
        java.lang.String[] strArray39 = new java.lang.String[] { "include_collection", "host", "hi!", "drop_collection", "size", "filter", "bulk_timeout", "drop_collection", "concurrent_bulk_requests", "servers", "localhost", "store_statistics", "script", "secondary_read_preference", "throttle_size", "parent_types", "db", "type", "admin", "filter", "servers", "user", "secondary_read_preference", "connect_timeout", "local", "host", "drop_collection", "user", "password", "ssl_verify_certificate", "password" };
        java.util.LinkedHashSet<java.lang.String> strSet40 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet40, strArray39);
        builder7.setparentTypes((java.util.Set<java.lang.String>) strSet40);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder0.parentTypes((java.util.Set<java.lang.String>) strSet40);
        org.bson.types.Binary binary44 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder43.initialTimestamp(binary44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(builder43);
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        org.elasticsearch.common.settings.Settings settings2 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        org.elasticsearch.river.RiverSettings riverSettings4 = new org.elasticsearch.river.RiverSettings(settings2, strMap3);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = riverSettings4.settings();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = riverSettings4.settings();
        org.elasticsearch.script.ScriptService scriptService7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("index", "initial_timestamp", riverSettings4, scriptService7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        org.elasticsearch.common.settings.Settings settings0 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = null;
        org.elasticsearch.river.RiverSettings riverSettings2 = new org.elasticsearch.river.RiverSettings(settings0, strMap1);
        org.elasticsearch.common.settings.Settings settings3 = riverSettings2.globalSettings();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = settings3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(settings3);
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getIndexName();
        java.lang.String str12 = mongoDBRiverDefinition9.getSECONDARY_READ_PREFERENCE_FIELD();
        java.lang.String str13 = mongoDBRiverDefinition9.mongoAdminUser;
        java.util.Set<java.lang.String> strSet14 = mongoDBRiverDefinition9.excludeFields;
        java.lang.String str15 = mongoDBRiverDefinition9.riverName;
        java.lang.String str16 = mongoDBRiverDefinition9.getCOLLECTION_FIELD();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "secondary_read_preference" + "'", str12, "secondary_read_preference");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(strSet14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "collection" + "'", str16, "collection");
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getTypeName();
        java.lang.String str12 = mongoDBRiverDefinition9.getLOCAL_DB_FIELD();
        java.lang.String str13 = mongoDBRiverDefinition9.getSSL_CONNECTION_FIELD();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "local" + "'", str12, "local");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ssl" + "'", str13, "ssl");
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder1.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet4 = builder1.excludeFields;
        com.mongodb.BasicDBObject basicDBObject5 = builder1.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = builder1.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray7 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList8 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList8, serverAddressArray7);
        builder1.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList8);
        builder0.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList8);
        builder0.mongoLocalUser = "credentials";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder0.mongoAdminUser("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.mongoSecondaryReadPreference(false);
        java.lang.String str18 = builder15.getindexName();
        boolean boolean19 = builder15.skipInitialImport;
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertNotNull(basicDBObject5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNotNull(serverAddressArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        java.lang.String str5 = builder0.mongoLocalUser;
        builder0.dropCollection = true;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.script("script");
        com.mongodb.BasicDBObject basicDBObject3 = builder2.getmongoCollectionFilter();
        builder2.setmongoLocalPassword("exclude_fields");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder6.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet9 = builder6.excludeFields;
        com.mongodb.BasicDBObject basicDBObject10 = builder6.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = builder6.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray12 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList13 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList13, serverAddressArray12);
        builder6.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder2.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList13);
        builder2.statisticsTypeName = "host";
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(basicDBObject3);
        org.junit.Assert.assertNull(strSet9);
        org.junit.Assert.assertNotNull(basicDBObject10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNotNull(serverAddressArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getHOST_FIELD();
        java.lang.String str12 = mongoDBRiverDefinition9.getINITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD();
        java.lang.String str13 = mongoDBRiverDefinition9.mongoCollection;
        boolean boolean14 = mongoDBRiverDefinition9.getmongoSecondaryReadPreference();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "host" + "'", str11, "host");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "script_type" + "'", str12, "script_type");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "initial_timestamp" + "'", str13, "initial_timestamp");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        builder0.disableIndexRefresh = true;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.importAllCollections(false);
        builder12.mongoDb = "hi!";
        com.mongodb.MongoClientOptions mongoClientOptions15 = null;
        builder12.mongoClientOptions = mongoClientOptions15;
        builder12.setmongoSecondaryReadPreference(true);
        builder12.setmongoGridFS(false);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("collection");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?collection?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        builder0.disableIndexRefresh = true;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.socketTimeout((int) (short) 1);
        builder0.includeCollection = "gridfs";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder0.importAllCollections(false);
        int int17 = builder16.getconnectTimeout();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getCOLLECTION_FIELD();
        java.util.Set<java.lang.String> strSet12 = mongoDBRiverDefinition9.excludeFields;
        boolean boolean13 = mongoDBRiverDefinition9.getstoreStatistics();
        java.lang.String str14 = mongoDBRiverDefinition9.getSCRIPT_TYPE_FIELD();
        boolean boolean15 = mongoDBRiverDefinition9.getmongoUseSSL();
        java.lang.String str16 = mongoDBRiverDefinition9.getCONCURRENT_REQUESTS_FIELD();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "collection" + "'", str11, "collection");
        org.junit.Assert.assertNull(strSet12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "script_type" + "'", str14, "script_type");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "concurrent_requests" + "'", str16, "concurrent_requests");
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder1.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet4 = builder1.excludeFields;
        com.mongodb.BasicDBObject basicDBObject5 = builder1.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = builder1.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray7 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList8 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList8, serverAddressArray7);
        builder1.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList8);
        builder0.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder0.skipInitialImport(true);
        org.bson.types.BSONTimestamp bSONTimestamp14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder13.initialTimestamp(bSONTimestamp14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ts must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertNotNull(basicDBObject5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNotNull(serverAddressArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        org.elasticsearch.common.settings.Settings settings2 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        org.elasticsearch.river.RiverSettings riverSettings4 = new org.elasticsearch.river.RiverSettings(settings2, strMap3);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = riverSettings4.settings();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = riverSettings4.settings();
        org.elasticsearch.script.ScriptService scriptService7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("servers", "advanced_transformation", riverSettings4, scriptService7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = builder0.initialTimestamp;
        builder0.setstatisticsTypeName("ssl_verify_certificate");
        boolean boolean8 = builder0.getmongoUseSSL();
        int int9 = builder0.throttleSize;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder0.throttleSize(10);
        builder0.scriptType = "skip_initial_import";
        builder0.scriptType = "script";
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("hi!");
        boolean boolean6 = builder0.importAllCollections;
        builder0.setconnectTimeout((int) (short) 10);
        builder0.mongoCollection = "";
        java.lang.String str11 = builder0.mongoAdminUser;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        java.lang.String str5 = builder0.mongoLocalUser;
        com.mongodb.ServerAddress[] serverAddressArray6 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList7 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList7, serverAddressArray6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList7);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder0.getmongoClientOptions();
        builder0.riverName = "script_type";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder13.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet16 = builder13.excludeFields;
        com.mongodb.BasicDBObject basicDBObject17 = builder13.getmongoCollectionFilter();
        builder0.setmongoOplogFilter(basicDBObject17);
        boolean boolean19 = builder0.mongoGridFS;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder0.mongoAdminPassword("user");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder0.importAllCollections(false);
        java.lang.String str24 = builder0.typeName;
        java.util.Set<java.lang.String> strSet25 = null;
        builder0.setparentTypes(strSet25);
        java.lang.String str27 = builder0.getscript();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(serverAddressArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(mongoClientOptions10);
        org.junit.Assert.assertNull(strSet16);
        org.junit.Assert.assertNotNull(basicDBObject17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.script("script");
        com.mongodb.BasicDBObject basicDBObject12 = builder11.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder0.mongoCollectionFilter(basicDBObject12);
        builder13.setmongoAdminPassword("ssl");
        builder13.setthrottleSize(35);
        java.lang.String str18 = builder13.getstatisticsTypeName();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(basicDBObject12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = builder0.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray6 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList7 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList7, serverAddressArray6);
        builder0.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList7);
        java.lang.String str10 = builder0.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.dropCollection(true);
        java.lang.String str13 = builder0.mongoCollection;
        java.lang.String str14 = builder0.includeCollection;
        builder0.mongoAdminPassword = "collection";
        boolean boolean17 = builder0.getadvancedTransformation();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNotNull(serverAddressArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        docScoreSearchScript0.setNextScore((float) 10L);
        java.lang.Object obj5 = null;
        java.lang.Object obj6 = docScoreSearchScript0.unwrap(obj5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder7.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet10 = builder7.excludeFields;
        builder7.setmongoCollection("initial_timestamp");
        boolean boolean13 = builder7.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder7.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.script("script");
        com.mongodb.BasicDBObject basicDBObject19 = builder18.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder7.mongoCollectionFilter(basicDBObject19);
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + true + "'", obj2, true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(strSet10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(basicDBObject19);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getCOLLECTION_FIELD();
        java.util.Set<java.lang.String> strSet12 = mongoDBRiverDefinition9.excludeFields;
        boolean boolean13 = mongoDBRiverDefinition9.getstoreStatistics();
        boolean boolean14 = mongoDBRiverDefinition9.getmongoGridFS();
        java.lang.String str15 = mongoDBRiverDefinition9.getSECONDARY_READ_PREFERENCE_FIELD();
        int int16 = mongoDBRiverDefinition9.socketTimeout;
        java.lang.String str17 = mongoDBRiverDefinition9.getCONCURRENT_BULK_REQUESTS_FIELD();
        java.lang.String str18 = mongoDBRiverDefinition9.getRiverIndexName();
        boolean boolean19 = mongoDBRiverDefinition9.isSkipInitialImport();
        java.lang.String str20 = mongoDBRiverDefinition9.getSSL_CONNECTION_FIELD();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "collection" + "'", str11, "collection");
        org.junit.Assert.assertNull(strSet12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "secondary_read_preference" + "'", str15, "secondary_read_preference");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "concurrent_bulk_requests" + "'", str17, "concurrent_bulk_requests");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ssl" + "'", str20, "ssl");
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoSSLVerifyCertificate(true);
        java.util.Set<java.lang.String> strSet6 = builder5.excludeFields;
        boolean boolean7 = builder5.getdisableIndexRefresh();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getHOST_FIELD();
        java.lang.String str12 = mongoDBRiverDefinition9.getMongoLocalPassword();
        java.lang.String str13 = mongoDBRiverDefinition9.script;
        boolean boolean14 = mongoDBRiverDefinition9.mongoSSLVerifyCertificate;
        java.lang.String str15 = mongoDBRiverDefinition9.getSCRIPT_FIELD();
        com.mongodb.BasicDBObject basicDBObject16 = mongoDBRiverDefinition9.mongoOplogFilter;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "host" + "'", str11, "host");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "script" + "'", str15, "script");
        org.junit.Assert.assertNull(basicDBObject16);
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("hi!");
        boolean boolean6 = builder0.importAllCollections;
        java.lang.String str7 = builder0.mongoAdminPassword;
        java.lang.String str8 = builder0.mongoLocalPassword;
        builder0.setstatisticsTypeName("concurrent_requests");
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getHOST_FIELD();
        java.lang.String str12 = mongoDBRiverDefinition9.getMongoLocalPassword();
        java.lang.String str13 = mongoDBRiverDefinition9.script;
        java.lang.String str14 = mongoDBRiverDefinition9.mongoAdminUser;
        java.lang.String str15 = mongoDBRiverDefinition9.getCONNECTION_TIMEOUT();
        java.lang.String str16 = mongoDBRiverDefinition9.getFILTER_FIELD();
        java.lang.String str17 = mongoDBRiverDefinition9.getMongoCollection();
        int int18 = mongoDBRiverDefinition9.connectTimeout;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "host" + "'", str11, "host");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "connect_timeout" + "'", str15, "connect_timeout");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "filter" + "'", str16, "filter");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "initial_timestamp" + "'", str17, "initial_timestamp");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getCOLLECTION_FIELD();
        java.util.Set<java.lang.String> strSet12 = mongoDBRiverDefinition9.excludeFields;
        boolean boolean13 = mongoDBRiverDefinition9.getstoreStatistics();
        boolean boolean14 = mongoDBRiverDefinition9.getmongoGridFS();
        java.lang.String str15 = mongoDBRiverDefinition9.getINITIAL_TIMESTAMP_SCRIPT_FIELD();
        java.lang.String str16 = mongoDBRiverDefinition9.getMongoDb();
        boolean boolean17 = mongoDBRiverDefinition9.isAdvancedTransformation();
        boolean boolean18 = mongoDBRiverDefinition9.importAllCollections;
        com.mongodb.BasicDBObject basicDBObject19 = mongoDBRiverDefinition9.getMongoCollectionFilter();
        boolean boolean20 = mongoDBRiverDefinition9.getmongoUseSSL();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "collection" + "'", str11, "collection");
        org.junit.Assert.assertNull(strSet12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "script" + "'", str15, "script");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(basicDBObject19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.script("script");
        com.mongodb.BasicDBObject basicDBObject3 = builder2.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.typeName("connect_timeout");
        boolean boolean6 = builder2.mongoGridFS;
        boolean boolean7 = builder2.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = builder2.build();
        java.lang.String str9 = mongoDBRiverDefinition8.mongoDb;
        java.lang.String str10 = mongoDBRiverDefinition8.getMongoLocalPassword();
        boolean boolean11 = mongoDBRiverDefinition8.getdropCollection();
        boolean boolean12 = mongoDBRiverDefinition8.mongoUseSSL;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(basicDBObject3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        java.lang.String str5 = builder0.mongoLocalUser;
        com.mongodb.ServerAddress[] serverAddressArray6 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList7 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList7, serverAddressArray6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList7);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder0.getmongoClientOptions();
        builder0.riverName = "script_type";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder13.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet16 = builder13.excludeFields;
        com.mongodb.BasicDBObject basicDBObject17 = builder13.getmongoCollectionFilter();
        builder0.setmongoOplogFilter(basicDBObject17);
        boolean boolean19 = builder0.mongoGridFS;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder0.mongoAdminPassword("user");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder0.importAllCollections(false);
        builder0.setmongoSecondaryReadPreference(false);
        com.mongodb.MongoClientOptions mongoClientOptions26 = null;
        builder0.mongoClientOptions = mongoClientOptions26;
        builder0.settypeName("import_all_collections");
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(serverAddressArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(mongoClientOptions10);
        org.junit.Assert.assertNull(strSet16);
        org.junit.Assert.assertNotNull(basicDBObject17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        java.lang.String str5 = builder0.mongoLocalUser;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.scriptType("include_collection");
        java.lang.String str8 = builder0.typeName;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.script("script");
        com.mongodb.BasicDBObject basicDBObject12 = builder11.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder0.mongoCollectionFilter(basicDBObject12);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder0.mongoSecondaryReadPreference(false);
        java.lang.Class<?> wildcardClass16 = builder15.getClass();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(basicDBObject12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getIndexName();
        java.lang.String str12 = mongoDBRiverDefinition9.getSECONDARY_READ_PREFERENCE_FIELD();
        java.lang.String str13 = mongoDBRiverDefinition9.mongoAdminUser;
        java.util.Set<java.lang.String> strSet14 = mongoDBRiverDefinition9.excludeFields;
        java.lang.String str15 = mongoDBRiverDefinition9.riverName;
        java.lang.String str16 = mongoDBRiverDefinition9.mongoLocalUser;
        java.lang.String str17 = mongoDBRiverDefinition9.getSTORE_STATISTICS_FIELD();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "secondary_read_preference" + "'", str12, "secondary_read_preference");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(strSet14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "store_statistics" + "'", str17, "store_statistics");
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        java.lang.String str5 = builder0.mongoLocalUser;
        builder0.setscript("drop_collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.skipInitialImport(true);
        java.lang.String str10 = builder0.getriverIndexName();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoSSLVerifyCertificate(true);
        java.util.Set<java.lang.String> strSet6 = builder5.excludeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder7.setmongoSecondaryReadPreference(false);
        boolean boolean10 = builder7.getmongoSSLVerifyCertificate();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder11.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet14 = builder11.excludeFields;
        com.mongodb.BasicDBObject basicDBObject15 = builder11.getmongoCollectionFilter();
        java.lang.String str16 = builder11.mongoLocalUser;
        com.mongodb.ServerAddress[] serverAddressArray17 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList18 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList18, serverAddressArray17);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder11.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList18);
        com.mongodb.MongoClientOptions mongoClientOptions21 = builder11.getmongoClientOptions();
        builder11.riverName = "script_type";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder24.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet27 = builder24.excludeFields;
        com.mongodb.BasicDBObject basicDBObject28 = builder24.getmongoCollectionFilter();
        builder11.setmongoOplogFilter(basicDBObject28);
        com.mongodb.BasicDBObject basicDBObject30 = builder11.mongoOplogFilter;
        builder7.setmongoOplogFilter(basicDBObject30);
        builder5.setmongoCollectionFilter(basicDBObject30);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder5.scriptType("");
        builder5.mongoAdminPassword = "";
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(strSet14);
        org.junit.Assert.assertNotNull(basicDBObject15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(serverAddressArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNull(mongoClientOptions21);
        org.junit.Assert.assertNull(strSet27);
        org.junit.Assert.assertNotNull(basicDBObject28);
        org.junit.Assert.assertNotNull(basicDBObject30);
        org.junit.Assert.assertNotNull(builder34);
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getHOST_FIELD();
        java.lang.String str12 = mongoDBRiverDefinition9.getMongoLocalPassword();
        java.lang.String str13 = mongoDBRiverDefinition9.script;
        boolean boolean14 = mongoDBRiverDefinition9.mongoSSLVerifyCertificate;
        boolean boolean15 = mongoDBRiverDefinition9.mongoSecondaryReadPreference;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "host" + "'", str11, "host");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 0L);
        org.apache.lucene.search.Scorer scorer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setScorer(scorer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getHOST_FIELD();
        java.lang.String str12 = mongoDBRiverDefinition9.getMongoLocalPassword();
        boolean boolean13 = mongoDBRiverDefinition9.getmongoSecondaryReadPreference();
        java.util.List<com.mongodb.ServerAddress> serverAddressList14 = mongoDBRiverDefinition9.mongoServers;
        java.util.Set<java.lang.String> strSet15 = mongoDBRiverDefinition9.getExcludeFields();
        int int16 = mongoDBRiverDefinition9.getDEFAULT_DB_PORT();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "host" + "'", str11, "host");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(serverAddressList14);
        org.junit.Assert.assertNull(strSet15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 27017 + "'", int16 == 27017);
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("concurrent_bulk_requests", "password", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?password?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.includeCollection("exclude_fields");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = builder0.initialTimestamp;
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getCOLLECTION_FIELD();
        java.util.Set<java.lang.String> strSet12 = mongoDBRiverDefinition9.excludeFields;
        boolean boolean13 = mongoDBRiverDefinition9.getstoreStatistics();
        boolean boolean14 = mongoDBRiverDefinition9.getmongoGridFS();
        java.lang.String str15 = mongoDBRiverDefinition9.getINITIAL_TIMESTAMP_SCRIPT_FIELD();
        int int16 = mongoDBRiverDefinition9.getDEFAULT_CONCURRENT_REQUESTS();
        java.util.Set<java.lang.String> strSet17 = mongoDBRiverDefinition9.parentTypes;
        com.mongodb.MongoClientOptions mongoClientOptions18 = mongoDBRiverDefinition9.getMongoClientOptions();
        java.lang.String str19 = mongoDBRiverDefinition9.getOPTIONS_FIELD();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "collection" + "'", str11, "collection");
        org.junit.Assert.assertNull(strSet12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "script" + "'", str15, "script");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertNull(strSet17);
        org.junit.Assert.assertNull(mongoClientOptions18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "options" + "'", str19, "options");
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        builder0.setmongoAdminPassword("store_statistics");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.scriptType("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.dropCollection(true);
        com.mongodb.BasicDBObject basicDBObject15 = builder14.getmongoOplogFilter();
        builder14.advancedTransformation = true;
        java.lang.String str18 = builder14.script;
        builder14.mongoSecondaryReadPreference = false;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNull(basicDBObject15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        java.lang.String str5 = builder0.mongoLocalUser;
        builder0.setscript("drop_collection");
        boolean boolean8 = builder0.getmongoSecondaryReadPreference();
        java.lang.String str9 = builder0.includeCollection;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = builder0.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray6 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList7 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList7, serverAddressArray6);
        builder0.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList7);
        java.lang.String str10 = builder0.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.dropCollection(true);
        java.lang.String str13 = builder0.mongoCollection;
        java.lang.String str14 = builder0.includeCollection;
        java.lang.String str15 = builder0.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder16.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet19 = builder16.excludeFields;
        com.mongodb.BasicDBObject basicDBObject20 = builder16.getmongoCollectionFilter();
        java.lang.String str21 = builder16.mongoLocalUser;
        com.mongodb.ServerAddress[] serverAddressArray22 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList23 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList23, serverAddressArray22);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder16.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList23);
        com.mongodb.MongoClientOptions mongoClientOptions26 = builder16.getmongoClientOptions();
        builder16.riverName = "script_type";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder29.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet32 = builder29.excludeFields;
        com.mongodb.BasicDBObject basicDBObject33 = builder29.getmongoCollectionFilter();
        builder16.setmongoOplogFilter(basicDBObject33);
        com.mongodb.BasicDBObject basicDBObject35 = builder16.mongoOplogFilter;
        builder0.setmongoOplogFilter(basicDBObject35);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNotNull(serverAddressArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(strSet19);
        org.junit.Assert.assertNotNull(basicDBObject20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(serverAddressArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNull(mongoClientOptions26);
        org.junit.Assert.assertNull(strSet32);
        org.junit.Assert.assertNotNull(basicDBObject33);
        org.junit.Assert.assertNotNull(basicDBObject35);
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getIndexName();
        java.lang.String str12 = mongoDBRiverDefinition9.getSECONDARY_READ_PREFERENCE_FIELD();
        java.lang.String str13 = mongoDBRiverDefinition9.script;
        java.lang.String str14 = mongoDBRiverDefinition9.getGRIDFS_FIELD();
        int int15 = mongoDBRiverDefinition9.getDEFAULT_CONCURRENT_REQUESTS();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = mongoDBRiverDefinition9.getInitialTimestamp();
        java.lang.String str17 = mongoDBRiverDefinition9.getIMPORT_ALL_COLLECTIONS_FIELD();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "secondary_read_preference" + "'", str12, "secondary_read_preference");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "gridfs" + "'", str14, "gridfs");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertNull(wildcardTimestamp16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "import_all_collections" + "'", str17, "import_all_collections");
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getIndexName();
        java.lang.String str12 = mongoDBRiverDefinition9.getSECONDARY_READ_PREFERENCE_FIELD();
        java.lang.String str13 = mongoDBRiverDefinition9.getINCLUDE_FIELDS_FIELD();
        boolean boolean14 = mongoDBRiverDefinition9.isMongoUseSSL();
        boolean boolean15 = mongoDBRiverDefinition9.isSkipInitialImport();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "secondary_read_preference" + "'", str12, "secondary_read_preference");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "include_fields" + "'", str13, "include_fields");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getHOST_FIELD();
        java.lang.String str12 = mongoDBRiverDefinition9.getMongoLocalPassword();
        java.lang.String str13 = mongoDBRiverDefinition9.script;
        java.lang.String str14 = mongoDBRiverDefinition9.mongoAdminUser;
        java.lang.String str15 = mongoDBRiverDefinition9.getCONNECTION_TIMEOUT();
        java.lang.String str16 = mongoDBRiverDefinition9.getMongoLocalUser();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "host" + "'", str11, "host");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "connect_timeout" + "'", str15, "connect_timeout");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        builder8.importAllCollections = true;
        builder8.mongoDb = "throttle_size";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder13.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet16 = builder13.excludeFields;
        com.mongodb.BasicDBObject basicDBObject17 = builder13.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp18 = builder13.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray19 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList20 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList20, serverAddressArray19);
        builder13.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList20);
        builder13.setdisableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder25.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet28 = builder25.excludeFields;
        builder25.setmongoCollection("initial_timestamp");
        boolean boolean31 = builder25.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder25.skipInitialImport(false);
        builder25.disableIndexRefresh = true;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder25.socketTimeout((int) (short) 1);
        java.util.List<com.mongodb.ServerAddress> serverAddressList38 = builder25.mongoServers;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder13.mongoServers(serverAddressList38);
        builder8.mongoServers = serverAddressList38;
        java.lang.String str41 = builder8.riverIndexName;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(strSet16);
        org.junit.Assert.assertNotNull(basicDBObject17);
        org.junit.Assert.assertNull(wildcardTimestamp18);
        org.junit.Assert.assertNotNull(serverAddressArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(strSet28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(serverAddressList38);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNull(str41);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.includeCollection("exclude_fields");
        java.lang.String str5 = builder4.getmongoLocalUser();
        builder4.mongoGridFS = true;
        builder4.setmongoSSLVerifyCertificate(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder4.includeCollection("disable_index_refresh");
        org.bson.types.BSONTimestamp bSONTimestamp12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.initialTimestamp(bSONTimestamp12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ts must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 'a');
        org.elasticsearch.common.settings.Settings settings3 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder4.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet7 = builder4.excludeFields;
        com.mongodb.BasicDBObject basicDBObject8 = builder4.getmongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings9 = new org.elasticsearch.river.RiverSettings(settings3, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject8);
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strSet7);
        org.junit.Assert.assertNotNull(basicDBObject8);
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getIndexName();
        java.lang.String str12 = mongoDBRiverDefinition9.getSECONDARY_READ_PREFERENCE_FIELD();
        java.lang.String str13 = mongoDBRiverDefinition9.script;
        java.lang.String str14 = mongoDBRiverDefinition9.getGRIDFS_FIELD();
        int int15 = mongoDBRiverDefinition9.getDEFAULT_CONCURRENT_REQUESTS();
        boolean boolean16 = mongoDBRiverDefinition9.getimportAllCollections();
        java.lang.String str17 = mongoDBRiverDefinition9.getINCLUDE_FIELDS_FIELD();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "secondary_read_preference" + "'", str12, "secondary_read_preference");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "gridfs" + "'", str14, "gridfs");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "include_fields" + "'", str17, "include_fields");
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        java.lang.String str5 = builder0.mongoLocalUser;
        com.mongodb.ServerAddress[] serverAddressArray6 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList7 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList7, serverAddressArray6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList7);
        java.lang.String str10 = builder0.mongoAdminPassword;
        boolean boolean11 = builder0.advancedTransformation;
        boolean boolean12 = builder0.importAllCollections;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(serverAddressArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        docScoreSearchScript0.setNextScore((float) 10L);
        java.lang.Object obj5 = null;
        java.lang.Object obj6 = docScoreSearchScript0.unwrap(obj5);
        // The following exception was thrown during execution in test generation
        try {
            long long7 = docScoreSearchScript0.runAsLong();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + true + "'", obj2, true);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getHOST_FIELD();
        boolean boolean12 = mongoDBRiverDefinition9.getmongoSecondaryReadPreference();
        int int13 = mongoDBRiverDefinition9.connectTimeout;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "host" + "'", str11, "host");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = builder0.initialTimestamp;
        builder0.setstatisticsTypeName("ssl_verify_certificate");
        boolean boolean8 = builder0.getmongoUseSSL();
        builder0.setmongoAdminUser("size");
        builder0.setconnectTimeout(1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder0.mongoLocalPassword("ssl_verify_certificate");
        builder0.throttleSize = (byte) 0;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getHOST_FIELD();
        java.lang.String str12 = mongoDBRiverDefinition9.getMongoLocalPassword();
        java.lang.String str13 = mongoDBRiverDefinition9.script;
        java.lang.String str14 = mongoDBRiverDefinition9.mongoAdminUser;
        int int15 = mongoDBRiverDefinition9.getDEFAULT_BULK_ACTIONS();
        java.lang.String str16 = mongoDBRiverDefinition9.getBULK_FIELD();
        java.lang.String str17 = mongoDBRiverDefinition9.getDISABLE_INDEX_REFRESH_FIELD();
        java.lang.String str18 = mongoDBRiverDefinition9.getIMPORT_ALL_COLLECTIONS_FIELD();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "host" + "'", str11, "host");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1000 + "'", int15 == 1000);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "bulk" + "'", str16, "bulk");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "disable_index_refresh" + "'", str17, "disable_index_refresh");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "import_all_collections" + "'", str18, "import_all_collections");
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.script("script");
        com.mongodb.BasicDBObject basicDBObject3 = builder2.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.typeName("connect_timeout");
        boolean boolean6 = builder2.mongoGridFS;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.script("script");
        java.lang.String[] strArray41 = new java.lang.String[] { "include_collection", "host", "hi!", "drop_collection", "size", "filter", "bulk_timeout", "drop_collection", "concurrent_bulk_requests", "servers", "localhost", "store_statistics", "script", "secondary_read_preference", "throttle_size", "parent_types", "db", "type", "admin", "filter", "servers", "user", "secondary_read_preference", "connect_timeout", "local", "host", "drop_collection", "user", "password", "ssl_verify_certificate", "password" };
        java.util.LinkedHashSet<java.lang.String> strSet42 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet42, strArray41);
        builder9.setparentTypes((java.util.Set<java.lang.String>) strSet42);
        builder2.setparentTypes((java.util.Set<java.lang.String>) strSet42);
        java.lang.String str46 = builder2.mongoDb;
        builder2.disableIndexRefresh = false;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder2.scriptType("credentials");
        org.bson.types.Binary binary51 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder50.initialTimestamp(binary51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(basicDBObject3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(builder50);
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = builder0.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray6 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList7 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList7, serverAddressArray6);
        builder0.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList7);
        java.lang.String str10 = builder0.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.dropCollection(true);
        java.lang.String str13 = builder12.typeName;
        builder12.setmongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder16.setmongoSecondaryReadPreference(false);
        boolean boolean19 = builder16.getmongoSSLVerifyCertificate();
        java.lang.String str20 = builder16.getriverIndexName();
        builder16.setimportAllCollections(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder16.mongoUseSSL(true);
        builder16.setdisableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder16.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder29.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet32 = builder29.excludeFields;
        java.lang.String str33 = builder29.getmongoLocalPassword();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.script("script");
        java.lang.String[] strArray68 = new java.lang.String[] { "include_collection", "host", "hi!", "drop_collection", "size", "filter", "bulk_timeout", "drop_collection", "concurrent_bulk_requests", "servers", "localhost", "store_statistics", "script", "secondary_read_preference", "throttle_size", "parent_types", "db", "type", "admin", "filter", "servers", "user", "secondary_read_preference", "connect_timeout", "local", "host", "drop_collection", "user", "password", "ssl_verify_certificate", "password" };
        java.util.LinkedHashSet<java.lang.String> strSet69 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet69, strArray68);
        builder36.setparentTypes((java.util.Set<java.lang.String>) strSet69);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder72 = builder29.parentTypes((java.util.Set<java.lang.String>) strSet69);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder73 = builder28.parentTypes((java.util.Set<java.lang.String>) strSet69);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder74 = builder12.excludeFields((java.util.Set<java.lang.String>) strSet69);
        builder74.setskipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder78 = builder74.dropCollection(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder80 = builder74.scriptType("ssl_verify_certificate");
        java.lang.String str81 = builder80.mongoDb;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNotNull(serverAddressArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNull(strSet32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertNotNull(builder78);
        org.junit.Assert.assertNotNull(builder80);
        org.junit.Assert.assertNull(str81);
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.script("script");
        com.mongodb.BasicDBObject basicDBObject3 = builder2.getmongoCollectionFilter();
        builder2.setmongoLocalPassword("exclude_fields");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder2.connectTimeout((-1));
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.mongoGridFS(false);
        boolean boolean10 = builder7.mongoUseSSL;
        builder7.setdisableIndexRefresh(false);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(basicDBObject3);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getHOST_FIELD();
        java.lang.String str12 = mongoDBRiverDefinition9.getCONCURRENT_BULK_REQUESTS_FIELD();
        java.lang.String str13 = mongoDBRiverDefinition9.getSECONDARY_READ_PREFERENCE_FIELD();
        java.lang.String str14 = mongoDBRiverDefinition9.getCONNECTION_TIMEOUT();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "host" + "'", str11, "host");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "concurrent_bulk_requests" + "'", str12, "concurrent_bulk_requests");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "secondary_read_preference" + "'", str13, "secondary_read_preference");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "connect_timeout" + "'", str14, "connect_timeout");
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        boolean boolean3 = builder0.getmongoSSLVerifyCertificate();
        java.lang.String str4 = builder0.getriverIndexName();
        builder0.connectTimeout = ' ';
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = builder0.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray6 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList7 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList7, serverAddressArray6);
        builder0.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList7);
        java.lang.String str10 = builder0.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.dropCollection(true);
        java.lang.String str13 = builder0.mongoCollection;
        java.lang.String str14 = builder0.includeCollection;
        builder0.mongoAdminPassword = "collection";
        java.lang.String str17 = builder0.getmongoCollection();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNotNull(serverAddressArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder1.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet4 = builder1.excludeFields;
        com.mongodb.BasicDBObject basicDBObject5 = builder1.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = builder1.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray7 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList8 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList8, serverAddressArray7);
        builder1.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList8);
        builder0.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList8);
        builder0.mongoLocalUser = "credentials";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder0.advancedTransformation(false);
        builder0.mongoAdminUser = "options";
        com.mongodb.BasicDBObject basicDBObject18 = builder0.getmongoCollectionFilter();
        builder0.setmongoLocalPassword("advanced_transformation");
        boolean boolean21 = builder0.getmongoSSLVerifyCertificate();
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertNotNull(basicDBObject5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNotNull(serverAddressArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(basicDBObject18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = builder0.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray6 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList7 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList7, serverAddressArray6);
        builder0.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList7);
        java.lang.String str10 = builder0.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.dropCollection(true);
        java.lang.String str13 = builder0.mongoCollection;
        java.lang.String str14 = builder0.includeCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition15 = builder0.build();
        builder0.advancedTransformation = true;
        java.util.Set<java.lang.String> strSet18 = builder0.excludeFields;
        org.bson.types.Binary binary19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder0.initialTimestamp(binary19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNotNull(serverAddressArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition15);
        org.junit.Assert.assertNull(strSet18);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        boolean boolean3 = builder0.getmongoSSLVerifyCertificate();
        java.lang.String str4 = builder0.getriverIndexName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.socketTimeout(100);
        builder0.disableIndexRefresh = true;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getCOLLECTION_FIELD();
        java.util.Set<java.lang.String> strSet12 = mongoDBRiverDefinition9.excludeFields;
        boolean boolean13 = mongoDBRiverDefinition9.getstoreStatistics();
        boolean boolean14 = mongoDBRiverDefinition9.getmongoGridFS();
        java.lang.String str15 = mongoDBRiverDefinition9.getINITIAL_TIMESTAMP_SCRIPT_FIELD();
        java.lang.String str16 = mongoDBRiverDefinition9.getMongoDb();
        boolean boolean17 = mongoDBRiverDefinition9.isMongoSecondaryReadPreference();
        java.lang.String str18 = mongoDBRiverDefinition9.getTypeName();
        java.lang.String str19 = mongoDBRiverDefinition9.mongoCollection;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "collection" + "'", str11, "collection");
        org.junit.Assert.assertNull(strSet12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "script" + "'", str15, "script");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "initial_timestamp" + "'", str19, "initial_timestamp");
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getIndexName();
        java.lang.String str12 = mongoDBRiverDefinition9.getSECONDARY_READ_PREFERENCE_FIELD();
        java.lang.String str13 = mongoDBRiverDefinition9.mongoAdminUser;
        java.util.Set<java.lang.String> strSet14 = mongoDBRiverDefinition9.parentTypes;
        java.lang.String str15 = mongoDBRiverDefinition9.getTHROTTLE_SIZE_FIELD();
        java.util.List<com.mongodb.ServerAddress> serverAddressList16 = mongoDBRiverDefinition9.mongoServers;
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp17 = mongoDBRiverDefinition9.initialTimestamp;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "secondary_read_preference" + "'", str12, "secondary_read_preference");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(strSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "throttle_size" + "'", str15, "throttle_size");
        org.junit.Assert.assertNotNull(serverAddressList16);
        org.junit.Assert.assertNull(wildcardTimestamp17);
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.script("script");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder3.script("script");
        java.lang.String[] strArray37 = new java.lang.String[] { "include_collection", "host", "hi!", "drop_collection", "size", "filter", "bulk_timeout", "drop_collection", "concurrent_bulk_requests", "servers", "localhost", "store_statistics", "script", "secondary_read_preference", "throttle_size", "parent_types", "db", "type", "admin", "filter", "servers", "user", "secondary_read_preference", "connect_timeout", "local", "host", "drop_collection", "user", "password", "ssl_verify_certificate", "password" };
        java.util.LinkedHashSet<java.lang.String> strSet38 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet38, strArray37);
        builder5.setparentTypes((java.util.Set<java.lang.String>) strSet38);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder0.excludeFields((java.util.Set<java.lang.String>) strSet38);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder41.mongoDb("");
        com.mongodb.BasicDBObject basicDBObject44 = builder41.getmongoOplogFilter();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNull(basicDBObject44);
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder1.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet4 = builder1.excludeFields;
        com.mongodb.BasicDBObject basicDBObject5 = builder1.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = builder1.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray7 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList8 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList8, serverAddressArray7);
        builder1.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList8);
        builder0.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList8);
        builder0.mongoLocalUser = "credentials";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder0.advancedTransformation(false);
        java.lang.String str16 = builder15.statisticsTypeName;
        java.util.Set<java.lang.String> strSet17 = builder15.getexcludeFields();
        int int18 = builder15.connectTimeout;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder20.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet23 = builder20.excludeFields;
        com.mongodb.BasicDBObject basicDBObject24 = builder20.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp25 = builder20.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray26 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList27 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList27, serverAddressArray26);
        builder20.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList27);
        builder19.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList27);
        builder19.mongoLocalUser = "credentials";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder19.mongoAdminUser("ssl");
        builder19.setmongoUseSSL(false);
        java.util.List<com.mongodb.ServerAddress> serverAddressList37 = builder19.getmongoServers();
        builder15.mongoServers = serverAddressList37;
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertNotNull(basicDBObject5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNotNull(serverAddressArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(strSet17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(strSet23);
        org.junit.Assert.assertNotNull(basicDBObject24);
        org.junit.Assert.assertNull(wildcardTimestamp25);
        org.junit.Assert.assertNotNull(serverAddressArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(serverAddressList37);
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("bulk_timeout", "flush_interval", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?flush_interval? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        java.lang.String str5 = builder0.mongoLocalUser;
        com.mongodb.ServerAddress[] serverAddressArray6 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList7 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList7, serverAddressArray6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList7);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder0.getmongoClientOptions();
        builder0.riverName = "script_type";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder13.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet16 = builder13.excludeFields;
        com.mongodb.BasicDBObject basicDBObject17 = builder13.getmongoCollectionFilter();
        builder0.setmongoOplogFilter(basicDBObject17);
        com.mongodb.BasicDBObject basicDBObject19 = builder0.mongoOplogFilter;
        java.lang.String str20 = builder0.riverName;
        builder0.dropCollection = true;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder0.riverName("secondary_read_preference");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder0.disableIndexRefresh(true);
        builder26.setriverIndexName("user");
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(serverAddressArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(mongoClientOptions10);
        org.junit.Assert.assertNull(strSet16);
        org.junit.Assert.assertNotNull(basicDBObject17);
        org.junit.Assert.assertNotNull(basicDBObject19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "script_type" + "'", str20, "script_type");
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getHOST_FIELD();
        boolean boolean12 = mongoDBRiverDefinition9.isAdvancedTransformation();
        java.util.Set<java.lang.String> strSet13 = mongoDBRiverDefinition9.excludeFields;
        java.lang.String str14 = mongoDBRiverDefinition9.getTypeName();
        java.lang.String str15 = mongoDBRiverDefinition9.getCONCURRENT_REQUESTS_FIELD();
        java.lang.String str16 = mongoDBRiverDefinition9.getRiverName();
        java.lang.String str17 = mongoDBRiverDefinition9.typeName;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "host" + "'", str11, "host");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(strSet13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "concurrent_requests" + "'", str15, "concurrent_requests");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        builder0.disableIndexRefresh = true;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.importAllCollections(false);
        builder0.setriverIndexName("exclude_fields");
        java.lang.String str15 = builder0.mongoLocalUser;
        builder0.mongoCollection = "port";
        boolean boolean18 = builder0.mongoGridFS;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.disableIndexRefresh;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder2.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet5 = builder2.excludeFields;
        builder2.setmongoCollection("initial_timestamp");
        boolean boolean8 = builder2.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder2.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder10);
        java.lang.String str12 = mongoDBRiverDefinition11.includeCollection;
        java.lang.String str13 = mongoDBRiverDefinition11.getTypeName();
        com.mongodb.BasicDBObject basicDBObject14 = mongoDBRiverDefinition11.getMongoCollectionFilter();
        builder0.mongoOplogFilter = basicDBObject14;
        org.bson.types.Binary binary16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder0.initialTimestamp(binary16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(basicDBObject14);
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getHOST_FIELD();
        boolean boolean12 = mongoDBRiverDefinition9.isAdvancedTransformation();
        java.lang.String str13 = mongoDBRiverDefinition9.getINCLUDE_COLLECTION_FIELD();
        boolean boolean14 = mongoDBRiverDefinition9.getmongoSSLVerifyCertificate();
        java.lang.String str15 = mongoDBRiverDefinition9.getHOST_FIELD();
        boolean boolean16 = mongoDBRiverDefinition9.mongoSSLVerifyCertificate;
        java.lang.String str17 = mongoDBRiverDefinition9.mongoLocalUser;
        com.mongodb.BasicDBObject basicDBObject18 = mongoDBRiverDefinition9.mongoOplogFilter;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "host" + "'", str11, "host");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "include_collection" + "'", str13, "include_collection");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "host" + "'", str15, "host");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(basicDBObject18);
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = builder0.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray6 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList7 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList7, serverAddressArray6);
        builder0.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList7);
        java.lang.String str10 = builder0.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.dropCollection(true);
        java.lang.String str13 = builder12.typeName;
        builder12.setmongoSecondaryReadPreference(false);
        boolean boolean16 = builder12.mongoGridFS;
        java.lang.String str17 = builder12.statisticsTypeName;
        java.lang.String str18 = builder12.getstatisticsTypeName();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNotNull(serverAddressArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getIndexName();
        java.lang.String str12 = mongoDBRiverDefinition9.getSECONDARY_READ_PREFERENCE_FIELD();
        java.lang.String str13 = mongoDBRiverDefinition9.getStatisticsTypeName();
        java.lang.String str14 = mongoDBRiverDefinition9.getHOST_FIELD();
        java.lang.String str15 = mongoDBRiverDefinition9.getTHROTTLE_SIZE_FIELD();
        int int16 = mongoDBRiverDefinition9.getDEFAULT_CONCURRENT_REQUESTS();
        java.lang.String str17 = mongoDBRiverDefinition9.getTYPE_FIELD();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "secondary_read_preference" + "'", str12, "secondary_read_preference");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "host" + "'", str14, "host");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "throttle_size" + "'", str15, "throttle_size");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "type" + "'", str17, "type");
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        builder0.disableIndexRefresh = true;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.importAllCollections(false);
        builder0.setriverIndexName("exclude_fields");
        builder0.setmongoLocalUser("filter");
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoSSLVerifyCertificate(true);
        builder0.script = "import_all_collections";
        boolean boolean8 = builder0.getadvancedTransformation();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoAdminUser("bulk_size");
        builder0.setdisableIndexRefresh(false);
        org.bson.types.Binary binary13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder0.initialTimestamp(binary13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        builder0.disableIndexRefresh = true;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.importAllCollections(false);
        java.lang.String str13 = builder12.mongoLocalUser;
        int int14 = builder12.throttleSize;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.disableIndexRefresh;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder2.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet5 = builder2.excludeFields;
        builder2.setmongoCollection("initial_timestamp");
        boolean boolean8 = builder2.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder2.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder10);
        java.lang.String str12 = mongoDBRiverDefinition11.includeCollection;
        java.lang.String str13 = mongoDBRiverDefinition11.getTypeName();
        com.mongodb.BasicDBObject basicDBObject14 = mongoDBRiverDefinition11.getMongoCollectionFilter();
        builder0.mongoOplogFilter = basicDBObject14;
        java.lang.String str16 = builder0.mongoLocalUser;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(basicDBObject14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoSSLVerifyCertificate(true);
        java.util.Set<java.lang.String> strSet6 = builder5.excludeFields;
        boolean boolean7 = builder5.dropCollection;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        java.lang.String str5 = builder0.mongoLocalUser;
        com.mongodb.ServerAddress[] serverAddressArray6 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList7 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList7, serverAddressArray6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList7);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder0.getmongoClientOptions();
        builder0.riverName = "script_type";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder13.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet16 = builder13.excludeFields;
        com.mongodb.BasicDBObject basicDBObject17 = builder13.getmongoCollectionFilter();
        builder0.setmongoOplogFilter(basicDBObject17);
        com.mongodb.BasicDBObject basicDBObject19 = builder0.mongoOplogFilter;
        java.lang.String str20 = builder0.riverName;
        com.mongodb.BasicDBObject basicDBObject21 = builder0.getmongoOplogFilter();
        int int22 = builder0.connectTimeout;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(serverAddressArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(mongoClientOptions10);
        org.junit.Assert.assertNull(strSet16);
        org.junit.Assert.assertNotNull(basicDBObject17);
        org.junit.Assert.assertNotNull(basicDBObject19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "script_type" + "'", str20, "script_type");
        org.junit.Assert.assertNotNull(basicDBObject21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("flush_interval", "disable_index_refresh");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?disable_index_refresh?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        java.lang.String str4 = builder0.getmongoLocalPassword();
        builder0.disableIndexRefresh = true;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.mongoAdminUser("");
        builder8.mongoCollection = "hi!";
        builder8.mongoUseSSL = true;
        builder8.setriverName("actions");
        java.lang.String str15 = builder8.indexName;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getHOST_FIELD();
        java.lang.String str12 = mongoDBRiverDefinition9.getUSER_FIELD();
        java.util.Set<java.lang.String> strSet13 = mongoDBRiverDefinition9.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions14 = mongoDBRiverDefinition9.mongoClientOptions;
        boolean boolean15 = mongoDBRiverDefinition9.isImportAllCollections();
        java.util.Set<java.lang.String> strSet16 = mongoDBRiverDefinition9.getIncludeFields();
        java.lang.String str17 = mongoDBRiverDefinition9.getGRIDFS_FIELD();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "host" + "'", str11, "host");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "user" + "'", str12, "user");
        org.junit.Assert.assertNull(strSet13);
        org.junit.Assert.assertNull(mongoClientOptions14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(strSet16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "gridfs" + "'", str17, "gridfs");
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("store_statistics", "socket_timeout");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?socket_timeout?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        java.lang.String str5 = builder0.mongoLocalUser;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.scriptType("include_collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.indexName("");
        int int10 = builder9.getsocketTimeout();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getIndexName();
        java.lang.String str12 = mongoDBRiverDefinition9.getSECONDARY_READ_PREFERENCE_FIELD();
        java.lang.String str13 = mongoDBRiverDefinition9.script;
        java.lang.String str14 = mongoDBRiverDefinition9.getGRIDFS_FIELD();
        java.lang.String str15 = mongoDBRiverDefinition9.getCONCURRENT_REQUESTS_FIELD();
        com.mongodb.BasicDBObject basicDBObject16 = mongoDBRiverDefinition9.getMongoOplogFilter();
        java.lang.String str17 = mongoDBRiverDefinition9.getSTORE_STATISTICS_FIELD();
        java.lang.String str18 = mongoDBRiverDefinition9.includeCollection;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "secondary_read_preference" + "'", str12, "secondary_read_preference");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "gridfs" + "'", str14, "gridfs");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "concurrent_requests" + "'", str15, "concurrent_requests");
        org.junit.Assert.assertNull(basicDBObject16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "store_statistics" + "'", str17, "store_statistics");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 'a');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder3.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet6 = builder3.excludeFields;
        builder3.setmongoCollection("initial_timestamp");
        boolean boolean9 = builder3.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder3.skipInitialImport(false);
        builder3.disableIndexRefresh = true;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder3.socketTimeout((int) (short) 1);
        builder3.includeCollection = "gridfs";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder3.importAllCollections(false);
        java.util.Set<java.lang.String> strSet20 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.includeFields(strSet20);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder22.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet25 = builder22.excludeFields;
        builder22.setmongoCollection("initial_timestamp");
        boolean boolean28 = builder22.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder22.skipInitialImport(false);
        java.lang.String str31 = builder30.typeName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder32.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet35 = builder32.excludeFields;
        com.mongodb.BasicDBObject basicDBObject36 = builder32.getmongoCollectionFilter();
        java.lang.String str37 = builder32.mongoLocalUser;
        com.mongodb.ServerAddress[] serverAddressArray38 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList39 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList39, serverAddressArray38);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder32.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList39);
        boolean boolean42 = builder41.dropCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder43.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet46 = builder43.excludeFields;
        com.mongodb.BasicDBObject basicDBObject47 = builder43.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp48 = builder43.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray49 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList50 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList50, serverAddressArray49);
        builder43.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList50);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder41.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList50);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder54.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet57 = builder54.excludeFields;
        com.mongodb.BasicDBObject basicDBObject58 = builder54.getmongoCollectionFilter();
        java.lang.String str59 = builder54.mongoLocalUser;
        com.mongodb.ServerAddress[] serverAddressArray60 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList61 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList61, serverAddressArray60);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = builder54.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList61);
        java.lang.String str64 = builder54.mongoAdminPassword;
        java.lang.String[] strArray69 = new java.lang.String[] { "admin", "script_type", "credentials", "password" };
        java.util.LinkedHashSet<java.lang.String> strSet70 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet70, strArray69);
        builder54.setincludeFields((java.util.Set<java.lang.String>) strSet70);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder73 = builder41.excludeFields((java.util.Set<java.lang.String>) strSet70);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder74 = builder30.parentTypes((java.util.Set<java.lang.String>) strSet70);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder75 = builder21.excludeFields((java.util.Set<java.lang.String>) strSet70);
        java.lang.Object obj76 = docScoreSearchScript0.unwrap((java.lang.Object) builder21);
        // The following exception was thrown during execution in test generation
        try {
            double double77 = docScoreSearchScript0.runAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNull(strSet25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(strSet35);
        org.junit.Assert.assertNotNull(basicDBObject36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(serverAddressArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(strSet46);
        org.junit.Assert.assertNotNull(basicDBObject47);
        org.junit.Assert.assertNull(wildcardTimestamp48);
        org.junit.Assert.assertNotNull(serverAddressArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNull(strSet57);
        org.junit.Assert.assertNotNull(basicDBObject58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(serverAddressArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertNotNull(builder75);
        org.junit.Assert.assertNotNull(obj76);
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = builder0.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray6 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList7 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList7, serverAddressArray6);
        builder0.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList7);
        java.lang.String str10 = builder0.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.dropCollection(true);
        java.lang.String str13 = builder0.mongoCollection;
        java.lang.String str14 = builder0.includeCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition15 = builder0.build();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder0.mongoSSLVerifyCertificate(true);
        builder0.setstatisticsTypeName("parent_types");
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNotNull(serverAddressArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        builder0.disableIndexRefresh = true;
        com.mongodb.MongoClientOptions mongoClientOptions11 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.mongoClientOptions(mongoClientOptions11);
        org.bson.types.Binary binary13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder0.initialTimestamp(binary13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoSSLVerifyCertificate(true);
        builder0.script = "import_all_collections";
        boolean boolean8 = builder0.getadvancedTransformation();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoAdminUser("bulk_size");
        com.mongodb.BasicDBObject basicDBObject11 = builder10.getmongoCollectionFilter();
        com.mongodb.MongoClientOptions mongoClientOptions12 = builder10.mongoClientOptions;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(basicDBObject11);
        org.junit.Assert.assertNull(mongoClientOptions12);
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoSSLVerifyCertificate(true);
        java.lang.String str6 = builder0.getscript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.script("user");
        java.util.Set<java.lang.String> strSet9 = builder0.parentTypes;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(strSet9);
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder1.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet4 = builder1.excludeFields;
        com.mongodb.BasicDBObject basicDBObject5 = builder1.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = builder1.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray7 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList8 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList8, serverAddressArray7);
        builder1.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList8);
        builder0.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList8);
        builder0.mongoLocalUser = "credentials";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder0.mongoAdminUser("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.mongoSecondaryReadPreference(false);
        builder15.setadvancedTransformation(true);
        java.lang.String str20 = builder15.getindexName();
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertNotNull(basicDBObject5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNotNull(serverAddressArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getCOLLECTION_FIELD();
        java.util.Set<java.lang.String> strSet12 = mongoDBRiverDefinition9.excludeFields;
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = mongoDBRiverDefinition9.getInitialTimestamp();
        boolean boolean14 = mongoDBRiverDefinition9.isStoreStatistics();
        boolean boolean15 = mongoDBRiverDefinition9.getdropCollection();
        java.lang.String str16 = mongoDBRiverDefinition9.getScriptType();
        java.lang.String str17 = mongoDBRiverDefinition9.scriptType;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "collection" + "'", str11, "collection");
        org.junit.Assert.assertNull(strSet12);
        org.junit.Assert.assertNull(wildcardTimestamp13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.script("script");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder3.script("script");
        java.lang.String[] strArray37 = new java.lang.String[] { "include_collection", "host", "hi!", "drop_collection", "size", "filter", "bulk_timeout", "drop_collection", "concurrent_bulk_requests", "servers", "localhost", "store_statistics", "script", "secondary_read_preference", "throttle_size", "parent_types", "db", "type", "admin", "filter", "servers", "user", "secondary_read_preference", "connect_timeout", "local", "host", "drop_collection", "user", "password", "ssl_verify_certificate", "password" };
        java.util.LinkedHashSet<java.lang.String> strSet38 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet38, strArray37);
        builder5.setparentTypes((java.util.Set<java.lang.String>) strSet38);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder0.excludeFields((java.util.Set<java.lang.String>) strSet38);
        java.lang.String str42 = builder41.getmongoCollection();
        builder41.setmongoAdminPassword("ssl_verify_certificate");
        builder41.setscriptType("actions");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNull(str42);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.includeCollection("exclude_fields");
        builder4.riverName = "host";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.riverIndexName("concurrent_bulk_requests");
        java.util.Set<java.lang.String> strSet9 = builder4.parentTypes;
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(strSet9);
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getIndexName();
        java.lang.String str12 = mongoDBRiverDefinition9.getSECONDARY_READ_PREFERENCE_FIELD();
        java.lang.String str13 = mongoDBRiverDefinition9.riverName;
        java.lang.String str14 = mongoDBRiverDefinition9.indexName;
        java.lang.String str15 = mongoDBRiverDefinition9.getScript();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = mongoDBRiverDefinition9.getInitialTimestamp();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "secondary_read_preference" + "'", str12, "secondary_read_preference");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(wildcardTimestamp16);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = builder0.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray6 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList7 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList7, serverAddressArray6);
        builder0.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList7);
        java.lang.String str10 = builder0.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.dropCollection(true);
        java.lang.String str13 = builder0.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder0.connectTimeout(1);
        java.lang.String str16 = builder15.getmongoAdminUser();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNotNull(serverAddressArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("ssl", "user", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?user?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("bulk", "advanced_transformation");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?advanced_transformation?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder1.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet4 = builder1.excludeFields;
        com.mongodb.BasicDBObject basicDBObject5 = builder1.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = builder1.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray7 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList8 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList8, serverAddressArray7);
        builder1.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList8);
        builder0.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList8);
        builder0.mongoLocalUser = "credentials";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder0.advancedTransformation(false);
        java.lang.String str16 = builder15.statisticsTypeName;
        java.util.Set<java.lang.String> strSet17 = builder15.getexcludeFields();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder18.setmongoSecondaryReadPreference(false);
        boolean boolean21 = builder18.getmongoSSLVerifyCertificate();
        java.lang.String str22 = builder18.getriverIndexName();
        builder18.setimportAllCollections(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder18.mongoUseSSL(true);
        boolean boolean27 = builder18.getstoreStatistics();
        builder18.statisticsTypeName = "disable_index_refresh";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder30.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet33 = builder30.excludeFields;
        com.mongodb.BasicDBObject basicDBObject34 = builder30.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp35 = builder30.initialTimestamp;
        builder30.setstatisticsTypeName("ssl_verify_certificate");
        boolean boolean38 = builder30.getmongoUseSSL();
        java.lang.String str39 = builder30.indexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder40.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet43 = builder40.excludeFields;
        java.lang.String str44 = builder40.getmongoLocalPassword();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder45.script("script");
        java.lang.String[] strArray79 = new java.lang.String[] { "include_collection", "host", "hi!", "drop_collection", "size", "filter", "bulk_timeout", "drop_collection", "concurrent_bulk_requests", "servers", "localhost", "store_statistics", "script", "secondary_read_preference", "throttle_size", "parent_types", "db", "type", "admin", "filter", "servers", "user", "secondary_read_preference", "connect_timeout", "local", "host", "drop_collection", "user", "password", "ssl_verify_certificate", "password" };
        java.util.LinkedHashSet<java.lang.String> strSet80 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet80, strArray79);
        builder47.setparentTypes((java.util.Set<java.lang.String>) strSet80);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder83 = builder40.parentTypes((java.util.Set<java.lang.String>) strSet80);
        java.util.Set<java.lang.String> strSet84 = builder40.parentTypes;
        builder30.setincludeFields(strSet84);
        builder18.setincludeFields(strSet84);
        builder15.includeFields = strSet84;
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertNotNull(basicDBObject5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNotNull(serverAddressArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(strSet17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(strSet33);
        org.junit.Assert.assertNotNull(basicDBObject34);
        org.junit.Assert.assertNull(wildcardTimestamp35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(strSet43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(builder83);
        org.junit.Assert.assertNotNull(strSet84);
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getIndexName();
        java.lang.String str12 = mongoDBRiverDefinition9.getSECONDARY_READ_PREFERENCE_FIELD();
        java.lang.String str13 = mongoDBRiverDefinition9.script;
        java.lang.String str14 = mongoDBRiverDefinition9.getGRIDFS_FIELD();
        java.lang.String str15 = mongoDBRiverDefinition9.mongoCollection;
        java.lang.String str16 = mongoDBRiverDefinition9.getMongoAdminUser();
        int int17 = mongoDBRiverDefinition9.getDEFAULT_DB_PORT();
        boolean boolean18 = mongoDBRiverDefinition9.isStoreStatistics();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "secondary_read_preference" + "'", str12, "secondary_read_preference");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "gridfs" + "'", str14, "gridfs");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "initial_timestamp" + "'", str15, "initial_timestamp");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 27017 + "'", int17 == 27017);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        builder0.disableIndexRefresh = true;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.socketTimeout((int) (short) 1);
        java.util.List<com.mongodb.ServerAddress> serverAddressList13 = builder0.mongoServers;
        builder0.skipInitialImport = false;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(serverAddressList13);
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getIndexName();
        java.lang.String str12 = mongoDBRiverDefinition9.getSECONDARY_READ_PREFERENCE_FIELD();
        java.util.Set<java.lang.String> strSet13 = mongoDBRiverDefinition9.excludeFields;
        java.lang.String str14 = mongoDBRiverDefinition9.getOPTIONS_FIELD();
        java.lang.String str15 = mongoDBRiverDefinition9.mongoAdminUser;
        java.util.List<com.mongodb.ServerAddress> serverAddressList16 = mongoDBRiverDefinition9.mongoServers;
        java.lang.String str17 = mongoDBRiverDefinition9.getTHROTTLE_SIZE_FIELD();
        java.lang.String str18 = mongoDBRiverDefinition9.getSIZE_FIELD();
        java.lang.String str19 = mongoDBRiverDefinition9.script;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "secondary_read_preference" + "'", str12, "secondary_read_preference");
        org.junit.Assert.assertNull(strSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "options" + "'", str14, "options");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(serverAddressList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "throttle_size" + "'", str17, "throttle_size");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "size" + "'", str18, "size");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.script("script");
        int int3 = builder2.throttleSize;
        builder2.setmongoAdminUser("import_all_collections");
        java.lang.String str6 = builder2.mongoLocalPassword;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = builder0.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray6 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList7 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList7, serverAddressArray6);
        builder0.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList7);
        java.lang.String str10 = builder0.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.dropCollection(true);
        java.lang.String str13 = builder0.mongoCollection;
        java.lang.String str14 = builder0.includeCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition15 = builder0.build();
        builder0.setstatisticsIndexName("user");
        builder0.setmongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder0.includeCollection("collection");
        builder21.setimportAllCollections(true);
        java.lang.String str24 = builder21.includeCollection;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNotNull(serverAddressArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition15);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "collection" + "'", str24, "collection");
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.script("script");
        com.mongodb.BasicDBObject basicDBObject3 = builder2.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.typeName("connect_timeout");
        boolean boolean6 = builder2.mongoGridFS;
        boolean boolean7 = builder2.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = builder2.build();
        java.lang.String str9 = mongoDBRiverDefinition8.mongoDb;
        boolean boolean10 = mongoDBRiverDefinition8.mongoUseSSL;
        java.lang.String str11 = mongoDBRiverDefinition8.getMongoCollection();
        java.lang.String str12 = mongoDBRiverDefinition8.getINITIAL_TIMESTAMP_SCRIPT_FIELD();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(basicDBObject3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "script" + "'", str12, "script");
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getIndexName();
        java.lang.String str12 = mongoDBRiverDefinition9.getSECONDARY_READ_PREFERENCE_FIELD();
        java.lang.String str13 = mongoDBRiverDefinition9.script;
        java.lang.String str14 = mongoDBRiverDefinition9.getGRIDFS_FIELD();
        int int15 = mongoDBRiverDefinition9.getDEFAULT_CONCURRENT_REQUESTS();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = mongoDBRiverDefinition9.getInitialTimestamp();
        com.mongodb.BasicDBObject basicDBObject17 = mongoDBRiverDefinition9.mongoCollectionFilter;
        java.util.List<com.mongodb.ServerAddress> serverAddressList18 = mongoDBRiverDefinition9.getMongoServers();
        java.lang.String str19 = mongoDBRiverDefinition9.getMongoDb();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "secondary_read_preference" + "'", str12, "secondary_read_preference");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "gridfs" + "'", str14, "gridfs");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertNull(wildcardTimestamp16);
        org.junit.Assert.assertNotNull(basicDBObject17);
        org.junit.Assert.assertNotNull(serverAddressList18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getIndexName();
        java.lang.String str12 = mongoDBRiverDefinition9.getSECONDARY_READ_PREFERENCE_FIELD();
        java.lang.String str13 = mongoDBRiverDefinition9.getStatisticsTypeName();
        java.lang.String str14 = mongoDBRiverDefinition9.getHOST_FIELD();
        int int15 = mongoDBRiverDefinition9.connectTimeout;
        int int16 = mongoDBRiverDefinition9.getSocketTimeout();
        java.lang.String str17 = mongoDBRiverDefinition9.getMongoLocalPassword();
        java.lang.String str18 = mongoDBRiverDefinition9.getSCRIPT_TYPE_FIELD();
        java.lang.String str19 = mongoDBRiverDefinition9.getACTIONS_FIELD();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "secondary_read_preference" + "'", str12, "secondary_read_preference");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "host" + "'", str14, "host");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "script_type" + "'", str18, "script_type");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "actions" + "'", str19, "actions");
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        java.lang.String str5 = builder0.mongoLocalUser;
        com.mongodb.ServerAddress[] serverAddressArray6 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList7 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList7, serverAddressArray6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList7);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder0.getmongoClientOptions();
        builder0.riverName = "script_type";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder13.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet16 = builder13.excludeFields;
        com.mongodb.BasicDBObject basicDBObject17 = builder13.getmongoCollectionFilter();
        builder0.setmongoOplogFilter(basicDBObject17);
        com.mongodb.BasicDBObject basicDBObject19 = builder0.mongoOplogFilter;
        java.lang.String str20 = builder0.riverName;
        builder0.dropCollection = true;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder0.riverName("secondary_read_preference");
        builder24.mongoLocalUser = "include_collection";
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(serverAddressArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(mongoClientOptions10);
        org.junit.Assert.assertNull(strSet16);
        org.junit.Assert.assertNotNull(basicDBObject17);
        org.junit.Assert.assertNotNull(basicDBObject19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "script_type" + "'", str20, "script_type");
        org.junit.Assert.assertNotNull(builder24);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = builder0.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray6 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList7 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList7, serverAddressArray6);
        builder0.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList7);
        java.lang.String str10 = builder0.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.dropCollection(true);
        boolean boolean13 = builder12.mongoSSLVerifyCertificate;
        java.lang.String[] strArray31 = new java.lang.String[] { "connect_timeout", "script_type", "collection", "secondary_read_preference", "throttle_size", "host", "actions", "drop_collection", "name", "initial_timestamp", "size", "script_type", "throttle_size", "hi!", "advanced_transformation", "name", "concurrent_requests" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder12.includeFields((java.util.Set<java.lang.String>) strSet32);
        boolean boolean35 = builder12.getimportAllCollections();
        builder12.includeCollection = "servers";
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNotNull(serverAddressArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("local", "collection");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?collection?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getHOST_FIELD();
        java.lang.String str12 = mongoDBRiverDefinition9.getINITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD();
        java.lang.String str13 = mongoDBRiverDefinition9.getINITIAL_TIMESTAMP_FIELD();
        java.lang.String str14 = mongoDBRiverDefinition9.statisticsTypeName;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "host" + "'", str11, "host");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "script_type" + "'", str12, "script_type");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "initial_timestamp" + "'", str13, "initial_timestamp");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getIndexName();
        java.lang.String str12 = mongoDBRiverDefinition9.getSECONDARY_READ_PREFERENCE_FIELD();
        java.util.Set<java.lang.String> strSet13 = mongoDBRiverDefinition9.excludeFields;
        java.lang.String str14 = mongoDBRiverDefinition9.getOPTIONS_FIELD();
        java.lang.String str15 = mongoDBRiverDefinition9.mongoAdminUser;
        boolean boolean16 = mongoDBRiverDefinition9.isStoreStatistics();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "secondary_read_preference" + "'", str12, "secondary_read_preference");
        org.junit.Assert.assertNull(strSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "options" + "'", str14, "options");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.script("script");
        com.mongodb.BasicDBObject basicDBObject3 = builder2.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.typeName("connect_timeout");
        boolean boolean6 = builder2.mongoGridFS;
        boolean boolean7 = builder2.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = builder2.build();
        java.lang.String str9 = mongoDBRiverDefinition8.getADMIN_DB_FIELD();
        int int10 = mongoDBRiverDefinition8.getDEFAULT_DB_PORT();
        java.lang.String str11 = mongoDBRiverDefinition8.getMongoLocalUser();
        java.lang.String str12 = mongoDBRiverDefinition8.mongoDb;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(basicDBObject3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 27017 + "'", int10 == 27017);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getHOST_FIELD();
        java.lang.String str12 = mongoDBRiverDefinition9.getMongoLocalPassword();
        java.lang.String str13 = mongoDBRiverDefinition9.script;
        java.lang.String str14 = mongoDBRiverDefinition9.mongoAdminUser;
        int int15 = mongoDBRiverDefinition9.getDEFAULT_BULK_ACTIONS();
        java.lang.String str16 = mongoDBRiverDefinition9.getTYPE_FIELD();
        boolean boolean17 = mongoDBRiverDefinition9.mongoSSLVerifyCertificate;
        java.lang.String str18 = mongoDBRiverDefinition9.getStatisticsIndexName();
        int int19 = mongoDBRiverDefinition9.getThrottleSize();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "host" + "'", str11, "host");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1000 + "'", int15 == 1000);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "type" + "'", str16, "type");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = builder0.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray6 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList7 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList7, serverAddressArray6);
        builder0.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList7);
        java.lang.String str10 = builder0.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.dropCollection(true);
        java.lang.String str13 = builder0.mongoCollection;
        java.lang.String str14 = builder0.includeCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition15 = builder0.build();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder0.mongoSSLVerifyCertificate(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.scriptType("bulk_size");
        builder17.setstatisticsIndexName("user");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder22.script("script");
        com.mongodb.BasicDBObject basicDBObject25 = builder24.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder24.typeName("connect_timeout");
        boolean boolean28 = builder24.mongoGridFS;
        java.lang.String str29 = builder24.mongoDb;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder24.typeName("concurrent_requests");
        java.lang.String str32 = builder24.getmongoAdminUser();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder33.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet36 = builder33.excludeFields;
        com.mongodb.BasicDBObject basicDBObject37 = builder33.getmongoCollectionFilter();
        java.lang.String str38 = builder33.mongoLocalUser;
        com.mongodb.ServerAddress[] serverAddressArray39 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList40 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList40, serverAddressArray39);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder33.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList40);
        java.lang.String str43 = builder33.mongoAdminPassword;
        java.lang.String[] strArray48 = new java.lang.String[] { "admin", "script_type", "credentials", "password" };
        java.util.LinkedHashSet<java.lang.String> strSet49 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet49, strArray48);
        builder33.setincludeFields((java.util.Set<java.lang.String>) strSet49);
        builder24.setexcludeFields((java.util.Set<java.lang.String>) strSet49);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder17.excludeFields((java.util.Set<java.lang.String>) strSet49);
        builder53.socketTimeout = (short) 1;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNotNull(serverAddressArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(basicDBObject25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNull(strSet36);
        org.junit.Assert.assertNotNull(basicDBObject37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(serverAddressArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(builder53);
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextScore((float) ' ');
        docScoreSearchScript0.setNextScore((float) (short) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder8.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet11 = builder8.excludeFields;
        com.mongodb.BasicDBObject basicDBObject12 = builder8.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = builder8.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray14 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList15 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList15, serverAddressArray14);
        builder8.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList15);
        java.lang.String str18 = builder8.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder8.dropCollection(true);
        boolean boolean21 = builder20.mongoSSLVerifyCertificate;
        java.lang.String[] strArray39 = new java.lang.String[] { "connect_timeout", "script_type", "collection", "secondary_read_preference", "throttle_size", "host", "actions", "drop_collection", "name", "initial_timestamp", "size", "script_type", "throttle_size", "hi!", "advanced_transformation", "name", "concurrent_requests" };
        java.util.LinkedHashSet<java.lang.String> strSet40 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet40, strArray39);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder20.includeFields((java.util.Set<java.lang.String>) strSet40);
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) strSet40);
        org.apache.lucene.index.AtomicReaderContext atomicReaderContext44 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextReader(atomicReaderContext44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strSet11);
        org.junit.Assert.assertNotNull(basicDBObject12);
        org.junit.Assert.assertNull(wildcardTimestamp13);
        org.junit.Assert.assertNotNull(serverAddressArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(builder42);
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = builder0.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray6 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList7 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList7, serverAddressArray6);
        builder0.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList7);
        java.lang.String str10 = builder0.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.dropCollection(true);
        java.lang.String str13 = builder0.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder0.connectTimeout(1);
        java.util.List<com.mongodb.ServerAddress> serverAddressList16 = builder0.getmongoServers();
        java.lang.String str17 = builder0.statisticsIndexName;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNotNull(serverAddressArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(serverAddressList16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory0 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder1.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet4 = builder1.excludeFields;
        com.mongodb.BasicDBObject basicDBObject5 = builder1.getmongoCollectionFilter();
        java.lang.String str6 = builder1.mongoLocalUser;
        com.mongodb.ServerAddress[] serverAddressArray7 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList8 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList8, serverAddressArray7);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder1.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList8);
        com.mongodb.MongoClientOptions mongoClientOptions11 = builder1.getmongoClientOptions();
        builder1.mongoSecondaryReadPreference = false;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder14.setmongoSecondaryReadPreference(false);
        boolean boolean17 = builder14.getmongoSSLVerifyCertificate();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder18.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet21 = builder18.excludeFields;
        com.mongodb.BasicDBObject basicDBObject22 = builder18.getmongoCollectionFilter();
        java.lang.String str23 = builder18.mongoLocalUser;
        com.mongodb.ServerAddress[] serverAddressArray24 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList25 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList25, serverAddressArray24);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder18.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList25);
        com.mongodb.MongoClientOptions mongoClientOptions28 = builder18.getmongoClientOptions();
        builder18.riverName = "script_type";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder31.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet34 = builder31.excludeFields;
        com.mongodb.BasicDBObject basicDBObject35 = builder31.getmongoCollectionFilter();
        builder18.setmongoOplogFilter(basicDBObject35);
        com.mongodb.BasicDBObject basicDBObject37 = builder18.mongoOplogFilter;
        builder14.setmongoOplogFilter(basicDBObject37);
        builder1.mongoCollectionFilter = basicDBObject37;
        org.elasticsearch.script.ExecutableScript executableScript40 = docScoreNativeScriptFactory0.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject37);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder41.script("script");
        com.mongodb.BasicDBObject basicDBObject44 = builder43.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder43.typeName("connect_timeout");
        boolean boolean47 = builder43.mongoGridFS;
        java.lang.String str48 = builder43.mongoDb;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder43.typeName("concurrent_requests");
        java.lang.String str51 = builder43.getmongoAdminUser();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder52.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet55 = builder52.excludeFields;
        com.mongodb.BasicDBObject basicDBObject56 = builder52.getmongoCollectionFilter();
        java.lang.String str57 = builder52.mongoLocalUser;
        com.mongodb.ServerAddress[] serverAddressArray58 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList59 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList59, serverAddressArray58);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = builder52.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList59);
        java.lang.String str62 = builder52.mongoAdminPassword;
        java.lang.String[] strArray67 = new java.lang.String[] { "admin", "script_type", "credentials", "password" };
        java.util.LinkedHashSet<java.lang.String> strSet68 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet68, strArray67);
        builder52.setincludeFields((java.util.Set<java.lang.String>) strSet68);
        builder43.setexcludeFields((java.util.Set<java.lang.String>) strSet68);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder72 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder72.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet75 = builder72.excludeFields;
        builder72.setmongoCollection("initial_timestamp");
        boolean boolean78 = builder72.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder80 = builder72.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder81 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder83 = builder81.script("script");
        com.mongodb.BasicDBObject basicDBObject84 = builder83.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder85 = builder72.mongoCollectionFilter(basicDBObject84);
        builder43.setmongoCollectionFilter(basicDBObject84);
        org.elasticsearch.script.ExecutableScript executableScript87 = docScoreNativeScriptFactory0.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject84);
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertNotNull(basicDBObject5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(serverAddressArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNull(mongoClientOptions11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(strSet21);
        org.junit.Assert.assertNotNull(basicDBObject22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(serverAddressArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNull(mongoClientOptions28);
        org.junit.Assert.assertNull(strSet34);
        org.junit.Assert.assertNotNull(basicDBObject35);
        org.junit.Assert.assertNotNull(basicDBObject37);
        org.junit.Assert.assertNotNull(executableScript40);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(basicDBObject44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNull(strSet55);
        org.junit.Assert.assertNotNull(basicDBObject56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(serverAddressArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNull(strSet75);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(builder80);
        org.junit.Assert.assertNotNull(builder83);
        org.junit.Assert.assertNotNull(basicDBObject84);
        org.junit.Assert.assertNotNull(builder85);
        org.junit.Assert.assertNotNull(executableScript87);
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("options", "initial_timestamp");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?initial_timestamp?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = builder0.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray6 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList7 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList7, serverAddressArray6);
        builder0.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList7);
        builder0.setdisableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder12.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet15 = builder12.excludeFields;
        builder12.setmongoCollection("initial_timestamp");
        boolean boolean18 = builder12.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder12.skipInitialImport(false);
        builder12.disableIndexRefresh = true;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder12.socketTimeout((int) (short) 1);
        java.util.List<com.mongodb.ServerAddress> serverAddressList25 = builder12.mongoServers;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder0.mongoServers(serverAddressList25);
        java.util.Set<java.lang.String> strSet27 = builder0.includeFields;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNotNull(serverAddressArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(strSet15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(serverAddressList25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNull(strSet27);
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getIndexName();
        java.lang.String str12 = mongoDBRiverDefinition9.getSECONDARY_READ_PREFERENCE_FIELD();
        java.util.Set<java.lang.String> strSet13 = mongoDBRiverDefinition9.excludeFields;
        java.lang.String str14 = mongoDBRiverDefinition9.getOPTIONS_FIELD();
        java.lang.String str15 = mongoDBRiverDefinition9.mongoAdminUser;
        java.lang.String str16 = mongoDBRiverDefinition9.getBULK_TIMEOUT_FIELD();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "secondary_read_preference" + "'", str12, "secondary_read_preference");
        org.junit.Assert.assertNull(strSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "options" + "'", str14, "options");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "bulk_timeout" + "'", str16, "bulk_timeout");
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("advanced_transformation", "filter", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?filter? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getIndexName();
        java.lang.String str12 = mongoDBRiverDefinition9.getSECONDARY_READ_PREFERENCE_FIELD();
        java.lang.String str13 = mongoDBRiverDefinition9.mongoAdminUser;
        java.util.Set<java.lang.String> strSet14 = mongoDBRiverDefinition9.parentTypes;
        java.lang.String str15 = mongoDBRiverDefinition9.getTHROTTLE_SIZE_FIELD();
        java.util.List<com.mongodb.ServerAddress> serverAddressList16 = mongoDBRiverDefinition9.mongoServers;
        java.lang.String str17 = mongoDBRiverDefinition9.getStatisticsTypeName();
        java.util.Set<java.lang.String> strSet18 = mongoDBRiverDefinition9.getExcludeFields();
        boolean boolean19 = mongoDBRiverDefinition9.isImportAllCollections();
        java.lang.String str20 = mongoDBRiverDefinition9.getScript();
        java.lang.String str21 = mongoDBRiverDefinition9.getINITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "secondary_read_preference" + "'", str12, "secondary_read_preference");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(strSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "throttle_size" + "'", str15, "throttle_size");
        org.junit.Assert.assertNotNull(serverAddressList16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(strSet18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "script_type" + "'", str21, "script_type");
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoSSLVerifyCertificate(true);
        builder0.script = "import_all_collections";
        boolean boolean8 = builder0.getadvancedTransformation();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoAdminUser("bulk_size");
        int int11 = builder10.socketTimeout;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder10.mongoLocalUser("parent_types");
        java.lang.String str14 = builder10.getindexName();
        builder10.socketTimeout = 100;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder18.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet21 = builder18.excludeFields;
        com.mongodb.BasicDBObject basicDBObject22 = builder18.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp23 = builder18.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray24 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList25 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList25, serverAddressArray24);
        builder18.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList25);
        builder17.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList25);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder29.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet32 = builder29.excludeFields;
        com.mongodb.BasicDBObject basicDBObject33 = builder29.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp34 = builder29.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray35 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList36 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList36, serverAddressArray35);
        builder29.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList36);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder17.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList36);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder17.indexName("");
        int int42 = builder41.getthrottleSize();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp43 = builder41.getinitialTimestamp();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder44.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet47 = builder44.excludeFields;
        com.mongodb.BasicDBObject basicDBObject48 = builder44.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp49 = builder44.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray50 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList51 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList51, serverAddressArray50);
        builder44.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList51);
        java.lang.String str54 = builder44.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder44.dropCollection(true);
        java.lang.String str57 = builder44.mongoCollection;
        java.lang.String str58 = builder44.includeCollection;
        boolean boolean59 = builder44.getstoreStatistics();
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory60 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        java.util.Map<java.lang.String, java.lang.Object> strMap61 = null;
        org.elasticsearch.script.ExecutableScript executableScript62 = docScoreNativeScriptFactory60.newScript(strMap61);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder63.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet66 = builder63.excludeFields;
        com.mongodb.BasicDBObject basicDBObject67 = builder63.getmongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript68 = docScoreNativeScriptFactory60.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject67);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder69 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder69.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet72 = builder69.excludeFields;
        builder69.setmongoCollection("initial_timestamp");
        boolean boolean75 = builder69.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder77 = builder69.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition78 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder77);
        java.lang.String str79 = mongoDBRiverDefinition78.includeCollection;
        java.lang.String str80 = mongoDBRiverDefinition78.getCOLLECTION_FIELD();
        java.util.Set<java.lang.String> strSet81 = mongoDBRiverDefinition78.excludeFields;
        boolean boolean82 = mongoDBRiverDefinition78.getstoreStatistics();
        boolean boolean83 = mongoDBRiverDefinition78.getmongoGridFS();
        java.lang.String str84 = mongoDBRiverDefinition78.getSECONDARY_READ_PREFERENCE_FIELD();
        int int85 = mongoDBRiverDefinition78.socketTimeout;
        com.mongodb.BasicDBObject basicDBObject86 = mongoDBRiverDefinition78.mongoCollectionFilter;
        org.elasticsearch.script.ExecutableScript executableScript87 = docScoreNativeScriptFactory60.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject86);
        builder44.setmongoCollectionFilter(basicDBObject86);
        builder41.mongoOplogFilter = basicDBObject86;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder90 = builder10.mongoCollectionFilter(basicDBObject86);
        java.lang.String str91 = builder90.statisticsIndexName;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(strSet21);
        org.junit.Assert.assertNotNull(basicDBObject22);
        org.junit.Assert.assertNull(wildcardTimestamp23);
        org.junit.Assert.assertNotNull(serverAddressArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(strSet32);
        org.junit.Assert.assertNotNull(basicDBObject33);
        org.junit.Assert.assertNull(wildcardTimestamp34);
        org.junit.Assert.assertNotNull(serverAddressArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNull(wildcardTimestamp43);
        org.junit.Assert.assertNull(strSet47);
        org.junit.Assert.assertNotNull(basicDBObject48);
        org.junit.Assert.assertNull(wildcardTimestamp49);
        org.junit.Assert.assertNotNull(serverAddressArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(executableScript62);
        org.junit.Assert.assertNull(strSet66);
        org.junit.Assert.assertNotNull(basicDBObject67);
        org.junit.Assert.assertNotNull(executableScript68);
        org.junit.Assert.assertNull(strSet72);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(builder77);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "collection" + "'", str80, "collection");
        org.junit.Assert.assertNull(strSet81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "secondary_read_preference" + "'", str84, "secondary_read_preference");
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
        org.junit.Assert.assertNotNull(basicDBObject86);
        org.junit.Assert.assertNotNull(executableScript87);
        org.junit.Assert.assertNotNull(builder90);
        org.junit.Assert.assertNull(str91);
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.script("script");
        com.mongodb.BasicDBObject basicDBObject3 = builder2.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.typeName("connect_timeout");
        boolean boolean6 = builder2.mongoGridFS;
        boolean boolean7 = builder2.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = builder2.build();
        builder2.setmongoSecondaryReadPreference(false);
        builder2.setscriptType("initial_timestamp");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(basicDBObject3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition8);
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = builder0.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray6 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList7 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList7, serverAddressArray6);
        builder0.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList7);
        java.lang.String str10 = builder0.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.dropCollection(true);
        java.lang.String str13 = builder0.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder0.connectTimeout(1);
        java.util.List<com.mongodb.ServerAddress> serverAddressList16 = builder0.getmongoServers();
        boolean boolean17 = builder0.getstoreStatistics();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNotNull(serverAddressArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(serverAddressList16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getIndexName();
        java.lang.String str12 = mongoDBRiverDefinition9.getSECONDARY_READ_PREFERENCE_FIELD();
        boolean boolean13 = mongoDBRiverDefinition9.isImportAllCollections();
        boolean boolean14 = mongoDBRiverDefinition9.mongoSSLVerifyCertificate;
        boolean boolean15 = mongoDBRiverDefinition9.getskipInitialImport();
        boolean boolean16 = mongoDBRiverDefinition9.isAdvancedTransformation();
        java.lang.Class<?> wildcardClass17 = mongoDBRiverDefinition9.getClass();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "secondary_read_preference" + "'", str12, "secondary_read_preference");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getHOST_FIELD();
        java.lang.String str12 = mongoDBRiverDefinition9.getMongoLocalPassword();
        java.lang.String str13 = mongoDBRiverDefinition9.script;
        java.lang.String str14 = mongoDBRiverDefinition9.mongoAdminUser;
        java.lang.String str15 = mongoDBRiverDefinition9.getCONNECTION_TIMEOUT();
        java.lang.String str16 = mongoDBRiverDefinition9.getDB_FIELD();
        java.lang.String str17 = mongoDBRiverDefinition9.getSSL_VERIFY_CERT_FIELD();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "host" + "'", str11, "host");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "connect_timeout" + "'", str15, "connect_timeout");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "db" + "'", str16, "db");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ssl_verify_certificate" + "'", str17, "ssl_verify_certificate");
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.includeCollection("exclude_fields");
        java.lang.String str5 = builder4.getmongoLocalUser();
        builder4.mongoGridFS = true;
        builder4.setmongoSSLVerifyCertificate(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder4.includeCollection("disable_index_refresh");
        org.bson.types.Binary binary12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.initialTimestamp(binary12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        java.lang.String str5 = builder0.mongoLocalUser;
        com.mongodb.ServerAddress[] serverAddressArray6 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList7 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList7, serverAddressArray6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList7);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder0.getmongoClientOptions();
        builder0.riverName = "script_type";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder13.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet16 = builder13.excludeFields;
        com.mongodb.BasicDBObject basicDBObject17 = builder13.getmongoCollectionFilter();
        builder0.setmongoOplogFilter(basicDBObject17);
        com.mongodb.BasicDBObject basicDBObject19 = builder0.mongoOplogFilter;
        java.lang.String str20 = builder0.riverName;
        builder0.dropCollection = true;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder0.riverName("secondary_read_preference");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder0.disableIndexRefresh(true);
        builder26.setmongoGridFS(false);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(serverAddressArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(mongoClientOptions10);
        org.junit.Assert.assertNull(strSet16);
        org.junit.Assert.assertNotNull(basicDBObject17);
        org.junit.Assert.assertNotNull(basicDBObject19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "script_type" + "'", str20, "script_type");
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        boolean boolean3 = builder0.getmongoSSLVerifyCertificate();
        java.lang.String str4 = builder0.getriverIndexName();
        builder0.setimportAllCollections(false);
        int int7 = builder0.getconnectTimeout();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.mongoLocalPassword("db");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder10.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet13 = builder10.excludeFields;
        builder10.setmongoCollection("initial_timestamp");
        boolean boolean16 = builder10.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder10.skipInitialImport(false);
        builder10.disableIndexRefresh = true;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder10.socketTimeout((int) (short) 1);
        builder10.includeCollection = "gridfs";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder10.importAllCollections(false);
        java.util.Set<java.lang.String> strSet27 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.includeFields(strSet27);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder29.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet32 = builder29.excludeFields;
        builder29.setmongoCollection("initial_timestamp");
        boolean boolean35 = builder29.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder29.skipInitialImport(false);
        java.lang.String str38 = builder37.typeName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder39.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet42 = builder39.excludeFields;
        com.mongodb.BasicDBObject basicDBObject43 = builder39.getmongoCollectionFilter();
        java.lang.String str44 = builder39.mongoLocalUser;
        com.mongodb.ServerAddress[] serverAddressArray45 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList46 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList46, serverAddressArray45);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder39.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList46);
        boolean boolean49 = builder48.dropCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder50.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet53 = builder50.excludeFields;
        com.mongodb.BasicDBObject basicDBObject54 = builder50.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp55 = builder50.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray56 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList57 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList57, serverAddressArray56);
        builder50.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList57);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder48.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList57);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder61.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet64 = builder61.excludeFields;
        com.mongodb.BasicDBObject basicDBObject65 = builder61.getmongoCollectionFilter();
        java.lang.String str66 = builder61.mongoLocalUser;
        com.mongodb.ServerAddress[] serverAddressArray67 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList68 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList68, serverAddressArray67);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder70 = builder61.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList68);
        java.lang.String str71 = builder61.mongoAdminPassword;
        java.lang.String[] strArray76 = new java.lang.String[] { "admin", "script_type", "credentials", "password" };
        java.util.LinkedHashSet<java.lang.String> strSet77 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet77, strArray76);
        builder61.setincludeFields((java.util.Set<java.lang.String>) strSet77);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder80 = builder48.excludeFields((java.util.Set<java.lang.String>) strSet77);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder81 = builder37.parentTypes((java.util.Set<java.lang.String>) strSet77);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder82 = builder28.excludeFields((java.util.Set<java.lang.String>) strSet77);
        builder0.excludeFields = strSet77;
        java.lang.Class<?> wildcardClass84 = strSet77.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(strSet13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNull(strSet32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(strSet42);
        org.junit.Assert.assertNotNull(basicDBObject43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(serverAddressArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(strSet53);
        org.junit.Assert.assertNotNull(basicDBObject54);
        org.junit.Assert.assertNull(wildcardTimestamp55);
        org.junit.Assert.assertNotNull(serverAddressArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNull(strSet64);
        org.junit.Assert.assertNotNull(basicDBObject65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNotNull(serverAddressArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(builder80);
        org.junit.Assert.assertNotNull(builder81);
        org.junit.Assert.assertNotNull(builder82);
        org.junit.Assert.assertNotNull(wildcardClass84);
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        java.lang.String str5 = builder0.mongoLocalUser;
        com.mongodb.ServerAddress[] serverAddressArray6 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList7 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList7, serverAddressArray6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList7);
        java.lang.String str10 = builder0.mongoAdminPassword;
        java.lang.String str11 = builder0.gettypeName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder12.setmongoSecondaryReadPreference(false);
        boolean boolean15 = builder12.getmongoSSLVerifyCertificate();
        java.lang.String str16 = builder12.getriverIndexName();
        builder12.setimportAllCollections(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder12.mongoUseSSL(true);
        builder12.setdisableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder12.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder25.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet28 = builder25.excludeFields;
        java.lang.String str29 = builder25.getmongoLocalPassword();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder30.script("script");
        java.lang.String[] strArray64 = new java.lang.String[] { "include_collection", "host", "hi!", "drop_collection", "size", "filter", "bulk_timeout", "drop_collection", "concurrent_bulk_requests", "servers", "localhost", "store_statistics", "script", "secondary_read_preference", "throttle_size", "parent_types", "db", "type", "admin", "filter", "servers", "user", "secondary_read_preference", "connect_timeout", "local", "host", "drop_collection", "user", "password", "ssl_verify_certificate", "password" };
        java.util.LinkedHashSet<java.lang.String> strSet65 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet65, strArray64);
        builder32.setparentTypes((java.util.Set<java.lang.String>) strSet65);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder68 = builder25.parentTypes((java.util.Set<java.lang.String>) strSet65);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder69 = builder24.parentTypes((java.util.Set<java.lang.String>) strSet65);
        builder0.setparentTypes((java.util.Set<java.lang.String>) strSet65);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition71 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory72 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder73 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder73.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet76 = builder73.excludeFields;
        com.mongodb.BasicDBObject basicDBObject77 = builder73.getmongoCollectionFilter();
        java.lang.String str78 = builder73.mongoLocalUser;
        com.mongodb.ServerAddress[] serverAddressArray79 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList80 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList80, serverAddressArray79);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder82 = builder73.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList80);
        com.mongodb.MongoClientOptions mongoClientOptions83 = builder73.getmongoClientOptions();
        builder73.riverName = "script_type";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder86 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder86.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet89 = builder86.excludeFields;
        com.mongodb.BasicDBObject basicDBObject90 = builder86.getmongoCollectionFilter();
        builder73.setmongoOplogFilter(basicDBObject90);
        org.elasticsearch.script.ExecutableScript executableScript92 = docScoreNativeScriptFactory72.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject90);
        builder0.setmongoOplogFilter(basicDBObject90);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(serverAddressArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNull(strSet28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(builder68);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNull(strSet76);
        org.junit.Assert.assertNotNull(basicDBObject77);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertNotNull(serverAddressArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(builder82);
        org.junit.Assert.assertNull(mongoClientOptions83);
        org.junit.Assert.assertNull(strSet89);
        org.junit.Assert.assertNotNull(basicDBObject90);
        org.junit.Assert.assertNotNull(executableScript92);
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getCOLLECTION_FIELD();
        java.util.Set<java.lang.String> strSet12 = mongoDBRiverDefinition9.excludeFields;
        boolean boolean13 = mongoDBRiverDefinition9.getstoreStatistics();
        boolean boolean14 = mongoDBRiverDefinition9.getmongoGridFS();
        java.lang.String str15 = mongoDBRiverDefinition9.getINITIAL_TIMESTAMP_SCRIPT_FIELD();
        java.lang.String str16 = mongoDBRiverDefinition9.getMongoDb();
        boolean boolean17 = mongoDBRiverDefinition9.isAdvancedTransformation();
        boolean boolean18 = mongoDBRiverDefinition9.importAllCollections;
        java.lang.String str19 = mongoDBRiverDefinition9.getMongoLocalPassword();
        boolean boolean20 = mongoDBRiverDefinition9.isAdvancedTransformation();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "collection" + "'", str11, "collection");
        org.junit.Assert.assertNull(strSet12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "script" + "'", str15, "script");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = builder0.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray6 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList7 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList7, serverAddressArray6);
        builder0.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList7);
        builder0.setdisableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder12.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet15 = builder12.excludeFields;
        builder12.setmongoCollection("initial_timestamp");
        boolean boolean18 = builder12.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder12.skipInitialImport(false);
        builder12.disableIndexRefresh = true;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder12.socketTimeout((int) (short) 1);
        java.util.List<com.mongodb.ServerAddress> serverAddressList25 = builder12.mongoServers;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder0.mongoServers(serverAddressList25);
        java.lang.String str27 = builder0.getmongoCollection();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNotNull(serverAddressArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(strSet15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(serverAddressList25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        java.lang.String str5 = builder0.mongoLocalUser;
        com.mongodb.ServerAddress[] serverAddressArray6 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList7 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList7, serverAddressArray6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList7);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder0.getmongoClientOptions();
        builder0.riverName = "script_type";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder13.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet16 = builder13.excludeFields;
        com.mongodb.BasicDBObject basicDBObject17 = builder13.getmongoCollectionFilter();
        builder0.setmongoOplogFilter(basicDBObject17);
        boolean boolean19 = builder0.mongoGridFS;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder0.mongoAdminPassword("user");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder0.importAllCollections(false);
        builder0.setmongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder0.mongoLocalUser("user");
        builder0.mongoSSLVerifyCertificate = false;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder31.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet34 = builder31.excludeFields;
        com.mongodb.BasicDBObject basicDBObject35 = builder31.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp36 = builder31.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray37 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList38 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList38, serverAddressArray37);
        builder31.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList38);
        builder30.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList38);
        builder30.mongoLocalUser = "credentials";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder30.mongoAdminUser("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder45.mongoSecondaryReadPreference(false);
        boolean boolean48 = builder45.mongoGridFS;
        com.mongodb.ServerAddress[] serverAddressArray49 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList50 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList50, serverAddressArray49);
        builder45.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList50);
        builder0.mongoServers = serverAddressList50;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(serverAddressArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(mongoClientOptions10);
        org.junit.Assert.assertNull(strSet16);
        org.junit.Assert.assertNotNull(basicDBObject17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNull(strSet34);
        org.junit.Assert.assertNotNull(basicDBObject35);
        org.junit.Assert.assertNull(wildcardTimestamp36);
        org.junit.Assert.assertNotNull(serverAddressArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(serverAddressArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        boolean boolean11 = mongoDBRiverDefinition9.mongoGridFS;
        boolean boolean12 = mongoDBRiverDefinition9.advancedTransformation;
        org.elasticsearch.common.unit.TimeValue timeValue13 = mongoDBRiverDefinition9.getDEFAULT_FLUSH_INTERVAL();
        boolean boolean14 = mongoDBRiverDefinition9.getmongoGridFS();
        java.lang.String str15 = mongoDBRiverDefinition9.getSCRIPT_TYPE_FIELD();
        com.mongodb.MongoClientOptions mongoClientOptions16 = mongoDBRiverDefinition9.mongoClientOptions;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(timeValue13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "script_type" + "'", str15, "script_type");
        org.junit.Assert.assertNull(mongoClientOptions16);
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        boolean boolean11 = mongoDBRiverDefinition9.mongoGridFS;
        boolean boolean12 = mongoDBRiverDefinition9.advancedTransformation;
        java.lang.String str13 = mongoDBRiverDefinition9.getADMIN_DB_FIELD();
        boolean boolean14 = mongoDBRiverDefinition9.getdisableIndexRefresh();
        boolean boolean15 = mongoDBRiverDefinition9.isMongoSecondaryReadPreference();
        java.lang.String str16 = mongoDBRiverDefinition9.mongoCollection;
        boolean boolean17 = mongoDBRiverDefinition9.isMongoSSLVerifyCertificate();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "initial_timestamp" + "'", str16, "initial_timestamp");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        java.lang.String str5 = builder0.mongoLocalUser;
        com.mongodb.ServerAddress[] serverAddressArray6 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList7 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList7, serverAddressArray6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList7);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder0.getmongoClientOptions();
        builder0.riverName = "script_type";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder13.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet16 = builder13.excludeFields;
        com.mongodb.BasicDBObject basicDBObject17 = builder13.getmongoCollectionFilter();
        builder0.setmongoOplogFilter(basicDBObject17);
        boolean boolean19 = builder0.mongoGridFS;
        boolean boolean20 = builder0.getadvancedTransformation();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder21.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet24 = builder21.excludeFields;
        com.mongodb.BasicDBObject basicDBObject25 = builder21.getmongoCollectionFilter();
        java.lang.String str26 = builder21.mongoLocalUser;
        com.mongodb.ServerAddress[] serverAddressArray27 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList28 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList28, serverAddressArray27);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder21.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList28);
        boolean boolean31 = builder30.dropCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder32.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet35 = builder32.excludeFields;
        com.mongodb.BasicDBObject basicDBObject36 = builder32.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp37 = builder32.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray38 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList39 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList39, serverAddressArray38);
        builder32.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList39);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder30.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList39);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder43.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet46 = builder43.excludeFields;
        com.mongodb.BasicDBObject basicDBObject47 = builder43.getmongoCollectionFilter();
        java.lang.String str48 = builder43.mongoLocalUser;
        com.mongodb.ServerAddress[] serverAddressArray49 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList50 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList50, serverAddressArray49);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder43.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList50);
        java.lang.String str53 = builder43.mongoAdminPassword;
        java.lang.String[] strArray58 = new java.lang.String[] { "admin", "script_type", "credentials", "password" };
        java.util.LinkedHashSet<java.lang.String> strSet59 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet59, strArray58);
        builder43.setincludeFields((java.util.Set<java.lang.String>) strSet59);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = builder30.excludeFields((java.util.Set<java.lang.String>) strSet59);
        builder0.includeFields = strSet59;
        java.lang.String str64 = builder0.mongoAdminUser;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder66 = builder0.mongoSSLVerifyCertificate(false);
        builder0.mongoGridFS = false;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(serverAddressArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(mongoClientOptions10);
        org.junit.Assert.assertNull(strSet16);
        org.junit.Assert.assertNotNull(basicDBObject17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(strSet24);
        org.junit.Assert.assertNotNull(basicDBObject25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(serverAddressArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(strSet35);
        org.junit.Assert.assertNotNull(basicDBObject36);
        org.junit.Assert.assertNull(wildcardTimestamp37);
        org.junit.Assert.assertNotNull(serverAddressArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNull(strSet46);
        org.junit.Assert.assertNotNull(basicDBObject47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(serverAddressArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNotNull(builder66);
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        java.lang.String str5 = builder0.mongoLocalUser;
        com.mongodb.ServerAddress[] serverAddressArray6 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList7 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList7, serverAddressArray6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList7);
        boolean boolean10 = builder9.dropCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder9.riverIndexName("filter");
        builder12.setincludeCollection("advanced_transformation");
        builder12.scriptType = "advanced_transformation";
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(serverAddressArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        java.lang.String str4 = builder0.getmongoLocalPassword();
        builder0.mongoGridFS = false;
        com.mongodb.MongoClientOptions mongoClientOptions7 = null;
        builder0.mongoClientOptions = mongoClientOptions7;
        builder0.setriverName("options");
        org.bson.types.Binary binary11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.initialTimestamp(binary11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        java.lang.String str5 = builder0.mongoLocalUser;
        builder0.setscript("drop_collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder8.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet11 = builder8.excludeFields;
        com.mongodb.BasicDBObject basicDBObject12 = builder8.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder0.mongoCollectionFilter(basicDBObject12);
        int int14 = builder13.connectTimeout;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(strSet11);
        org.junit.Assert.assertNotNull(basicDBObject12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getHOST_FIELD();
        boolean boolean12 = mongoDBRiverDefinition9.isAdvancedTransformation();
        java.lang.String str13 = mongoDBRiverDefinition9.getINCLUDE_COLLECTION_FIELD();
        boolean boolean14 = mongoDBRiverDefinition9.getmongoSSLVerifyCertificate();
        java.lang.String str15 = mongoDBRiverDefinition9.getHOST_FIELD();
        boolean boolean16 = mongoDBRiverDefinition9.mongoSSLVerifyCertificate;
        java.lang.String str17 = mongoDBRiverDefinition9.getPASSWORD_FIELD();
        boolean boolean18 = mongoDBRiverDefinition9.isAdvancedTransformation();
        java.lang.String str19 = mongoDBRiverDefinition9.getScriptType();
        java.lang.String str20 = mongoDBRiverDefinition9.getOPTIONS_FIELD();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "host" + "'", str11, "host");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "include_collection" + "'", str13, "include_collection");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "host" + "'", str15, "host");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "password" + "'", str17, "password");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "options" + "'", str20, "options");
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        java.lang.String str5 = builder0.mongoLocalUser;
        builder0.setscript("drop_collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder8.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet11 = builder8.excludeFields;
        com.mongodb.BasicDBObject basicDBObject12 = builder8.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder0.mongoCollectionFilter(basicDBObject12);
        com.mongodb.MongoClientOptions mongoClientOptions14 = builder13.mongoClientOptions;
        java.lang.String str15 = builder13.includeCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder13.build();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder17.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet20 = builder17.excludeFields;
        builder17.setmongoCollection("initial_timestamp");
        boolean boolean23 = builder17.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder17.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition26 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder25);
        java.lang.String str27 = mongoDBRiverDefinition26.includeCollection;
        java.lang.String str28 = mongoDBRiverDefinition26.getHOST_FIELD();
        java.lang.String str29 = mongoDBRiverDefinition26.getMongoLocalPassword();
        java.lang.String str30 = mongoDBRiverDefinition26.scriptType;
        org.elasticsearch.common.logging.ESLogger eSLogger31 = mongoDBRiverDefinition26.getlogger();
        java.lang.String str32 = mongoDBRiverDefinition26.script;
        java.util.List<com.mongodb.ServerAddress> serverAddressList33 = mongoDBRiverDefinition26.getMongoServers();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder13.mongoServers(serverAddressList33);
        boolean boolean35 = builder13.importAllCollections;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(strSet11);
        org.junit.Assert.assertNotNull(basicDBObject12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNull(mongoClientOptions14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition16);
        org.junit.Assert.assertNull(strSet20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "host" + "'", str28, "host");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(eSLogger31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(serverAddressList33);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getCOLLECTION_FIELD();
        java.util.Set<java.lang.String> strSet12 = mongoDBRiverDefinition9.excludeFields;
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = mongoDBRiverDefinition9.getInitialTimestamp();
        boolean boolean14 = mongoDBRiverDefinition9.isStoreStatistics();
        boolean boolean15 = mongoDBRiverDefinition9.isMongoSecondaryReadPreference();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "collection" + "'", str11, "collection");
        org.junit.Assert.assertNull(strSet12);
        org.junit.Assert.assertNull(wildcardTimestamp13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = builder0.initialTimestamp;
        builder0.mongoCollection = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.typeName("exclude_fields");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder10.setmongoSecondaryReadPreference(false);
        boolean boolean13 = builder10.getmongoSSLVerifyCertificate();
        java.lang.String str14 = builder10.getriverIndexName();
        builder10.setimportAllCollections(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder10.mongoUseSSL(true);
        builder10.setdisableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder10.script("bulk");
        com.mongodb.BasicDBObject basicDBObject23 = builder10.mongoCollectionFilter;
        builder0.mongoCollectionFilter = basicDBObject23;
        java.lang.String str25 = builder0.indexName;
        builder0.setmongoLocalUser("secondary_read_preference");
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(basicDBObject23);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = builder0.initialTimestamp;
        builder0.setstatisticsTypeName("ssl_verify_certificate");
        boolean boolean8 = builder0.getmongoUseSSL();
        builder0.setmongoAdminUser("size");
        java.lang.String str11 = builder0.includeCollection;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        builder0.disableIndexRefresh = true;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.socketTimeout((int) (short) 1);
        java.lang.String str13 = builder0.riverIndexName;
        org.bson.types.Binary binary14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder0.initialTimestamp(binary14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        boolean boolean3 = builder0.getmongoSSLVerifyCertificate();
        java.lang.String str4 = builder0.getriverIndexName();
        builder0.setimportAllCollections(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.mongoUseSSL(true);
        boolean boolean9 = builder0.getstoreStatistics();
        java.lang.String str10 = builder0.getscriptType();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        boolean boolean3 = builder0.getmongoSSLVerifyCertificate();
        java.lang.String str4 = builder0.getriverIndexName();
        builder0.setimportAllCollections(false);
        int int7 = builder0.getconnectTimeout();
        java.lang.String str8 = builder0.mongoLocalPassword;
        builder0.mongoSecondaryReadPreference = false;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = builder0.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray6 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList7 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList7, serverAddressArray6);
        builder0.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList7);
        java.lang.String str10 = builder0.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.dropCollection(true);
        java.lang.String str13 = builder12.typeName;
        builder12.setmongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder16.setmongoSecondaryReadPreference(false);
        boolean boolean19 = builder16.getmongoSSLVerifyCertificate();
        java.lang.String str20 = builder16.getriverIndexName();
        builder16.setimportAllCollections(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder16.mongoUseSSL(true);
        builder16.setdisableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder16.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder29.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet32 = builder29.excludeFields;
        java.lang.String str33 = builder29.getmongoLocalPassword();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.script("script");
        java.lang.String[] strArray68 = new java.lang.String[] { "include_collection", "host", "hi!", "drop_collection", "size", "filter", "bulk_timeout", "drop_collection", "concurrent_bulk_requests", "servers", "localhost", "store_statistics", "script", "secondary_read_preference", "throttle_size", "parent_types", "db", "type", "admin", "filter", "servers", "user", "secondary_read_preference", "connect_timeout", "local", "host", "drop_collection", "user", "password", "ssl_verify_certificate", "password" };
        java.util.LinkedHashSet<java.lang.String> strSet69 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet69, strArray68);
        builder36.setparentTypes((java.util.Set<java.lang.String>) strSet69);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder72 = builder29.parentTypes((java.util.Set<java.lang.String>) strSet69);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder73 = builder28.parentTypes((java.util.Set<java.lang.String>) strSet69);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder74 = builder12.excludeFields((java.util.Set<java.lang.String>) strSet69);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder76 = builder12.mongoDb("type");
        boolean boolean77 = builder12.getstoreStatistics();
        builder12.script = "password";
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNotNull(serverAddressArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNull(strSet32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertNotNull(builder76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getCOLLECTION_FIELD();
        java.util.Set<java.lang.String> strSet12 = mongoDBRiverDefinition9.excludeFields;
        boolean boolean13 = mongoDBRiverDefinition9.getstoreStatistics();
        boolean boolean14 = mongoDBRiverDefinition9.getmongoGridFS();
        java.lang.String str15 = mongoDBRiverDefinition9.getINITIAL_TIMESTAMP_SCRIPT_FIELD();
        java.lang.String str16 = mongoDBRiverDefinition9.getMongoDb();
        boolean boolean17 = mongoDBRiverDefinition9.isAdvancedTransformation();
        boolean boolean18 = mongoDBRiverDefinition9.importAllCollections;
        com.mongodb.BasicDBObject basicDBObject19 = mongoDBRiverDefinition9.getMongoCollectionFilter();
        java.lang.String str20 = mongoDBRiverDefinition9.getMongoAdminUser();
        int int21 = mongoDBRiverDefinition9.getConnectTimeout();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "collection" + "'", str11, "collection");
        org.junit.Assert.assertNull(strSet12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "script" + "'", str15, "script");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(basicDBObject19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getCOLLECTION_FIELD();
        java.util.Set<java.lang.String> strSet12 = mongoDBRiverDefinition9.excludeFields;
        boolean boolean13 = mongoDBRiverDefinition9.getstoreStatistics();
        boolean boolean14 = mongoDBRiverDefinition9.getmongoGridFS();
        java.lang.String str15 = mongoDBRiverDefinition9.getCONCURRENT_REQUESTS_FIELD();
        java.lang.String str16 = mongoDBRiverDefinition9.getTypeName();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp17 = mongoDBRiverDefinition9.initialTimestamp;
        java.util.Set<java.lang.String> strSet18 = mongoDBRiverDefinition9.getIncludeFields();
        boolean boolean19 = mongoDBRiverDefinition9.isImportAllCollections();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "collection" + "'", str11, "collection");
        org.junit.Assert.assertNull(strSet12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "concurrent_requests" + "'", str15, "concurrent_requests");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(wildcardTimestamp17);
        org.junit.Assert.assertNull(strSet18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        java.lang.String str5 = builder0.mongoLocalUser;
        com.mongodb.ServerAddress[] serverAddressArray6 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList7 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList7, serverAddressArray6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList7);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder0.getmongoClientOptions();
        builder0.riverName = "script_type";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder13.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet16 = builder13.excludeFields;
        com.mongodb.BasicDBObject basicDBObject17 = builder13.getmongoCollectionFilter();
        builder0.setmongoOplogFilter(basicDBObject17);
        boolean boolean19 = builder0.mongoGridFS;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder0.mongoAdminPassword("user");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder0.importAllCollections(false);
        java.lang.String str24 = builder0.typeName;
        java.util.Set<java.lang.String> strSet25 = null;
        builder0.setparentTypes(strSet25);
        java.util.Set<java.lang.String> strSet27 = builder0.getincludeFields();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(serverAddressArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(mongoClientOptions10);
        org.junit.Assert.assertNull(strSet16);
        org.junit.Assert.assertNotNull(basicDBObject17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(strSet27);
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getCOLLECTION_FIELD();
        java.util.Set<java.lang.String> strSet12 = mongoDBRiverDefinition9.excludeFields;
        boolean boolean13 = mongoDBRiverDefinition9.getstoreStatistics();
        boolean boolean14 = mongoDBRiverDefinition9.getmongoGridFS();
        java.lang.String str15 = mongoDBRiverDefinition9.getSECONDARY_READ_PREFERENCE_FIELD();
        int int16 = mongoDBRiverDefinition9.socketTimeout;
        boolean boolean17 = mongoDBRiverDefinition9.isSkipInitialImport();
        java.lang.String str18 = mongoDBRiverDefinition9.getDEFAULT_DB_HOST();
        java.lang.String str19 = mongoDBRiverDefinition9.getSERVERS_FIELD();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "collection" + "'", str11, "collection");
        org.junit.Assert.assertNull(strSet12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "secondary_read_preference" + "'", str15, "secondary_read_preference");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "localhost" + "'", str18, "localhost");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "servers" + "'", str19, "servers");
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        builder0.setconnectTimeout(35);
        builder0.riverIndexName = "db";
        java.lang.String str11 = builder0.riverName;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder1.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet4 = builder1.excludeFields;
        com.mongodb.BasicDBObject basicDBObject5 = builder1.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = builder1.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray7 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList8 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList8, serverAddressArray7);
        builder1.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList8);
        builder0.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder12.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet15 = builder12.excludeFields;
        com.mongodb.BasicDBObject basicDBObject16 = builder12.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp17 = builder12.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray18 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList19 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList19, serverAddressArray18);
        builder12.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList19);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder0.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList19);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder0.indexName("");
        int int25 = builder24.getthrottleSize();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp26 = builder24.getinitialTimestamp();
        builder24.socketTimeout = (byte) 1;
        java.lang.String str29 = builder24.scriptType;
        int int30 = builder24.connectTimeout;
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertNotNull(basicDBObject5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNotNull(serverAddressArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strSet15);
        org.junit.Assert.assertNotNull(basicDBObject16);
        org.junit.Assert.assertNull(wildcardTimestamp17);
        org.junit.Assert.assertNotNull(serverAddressArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(wildcardTimestamp26);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        builder0.setmongoAdminPassword("store_statistics");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.scriptType("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.dropCollection(true);
        com.mongodb.BasicDBObject basicDBObject15 = builder14.getmongoOplogFilter();
        builder14.advancedTransformation = true;
        builder14.setriverIndexName("concurrent_requests");
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNull(basicDBObject15);
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.includeCollection("exclude_fields");
        java.lang.String str5 = builder4.getmongoLocalUser();
        builder4.mongoGridFS = true;
        java.lang.String str8 = builder4.getscript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder4.mongoAdminPassword("");
        java.lang.String str11 = builder10.scriptType;
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.mongoSSLVerifyCertificate;
        java.lang.String str2 = builder0.getmongoDb();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.includeCollection("exclude_fields");
        boolean boolean5 = builder4.advancedTransformation;
        java.util.Set<java.lang.String> strSet6 = builder4.getexcludeFields();
        int int7 = builder4.getconnectTimeout();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder4.storeStatistics(true);
        java.util.Set<java.lang.String> strSet10 = builder9.getexcludeFields();
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(strSet10);
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.script("script");
        com.mongodb.BasicDBObject basicDBObject12 = builder11.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder0.mongoCollectionFilter(basicDBObject12);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder0.mongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder16.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet19 = builder16.excludeFields;
        com.mongodb.BasicDBObject basicDBObject20 = builder16.getmongoCollectionFilter();
        java.lang.String str21 = builder16.mongoLocalUser;
        com.mongodb.ServerAddress[] serverAddressArray22 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList23 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList23, serverAddressArray22);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder16.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList23);
        com.mongodb.MongoClientOptions mongoClientOptions26 = builder16.getmongoClientOptions();
        builder16.riverName = "script_type";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder29.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet32 = builder29.excludeFields;
        com.mongodb.BasicDBObject basicDBObject33 = builder29.getmongoCollectionFilter();
        builder16.setmongoOplogFilter(basicDBObject33);
        com.mongodb.BasicDBObject basicDBObject35 = builder16.mongoOplogFilter;
        builder0.mongoCollectionFilter = basicDBObject35;
        builder0.setthrottleSize((int) ' ');
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(basicDBObject12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNull(strSet19);
        org.junit.Assert.assertNotNull(basicDBObject20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(serverAddressArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNull(mongoClientOptions26);
        org.junit.Assert.assertNull(strSet32);
        org.junit.Assert.assertNotNull(basicDBObject33);
        org.junit.Assert.assertNotNull(basicDBObject35);
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.script("script");
        com.mongodb.BasicDBObject basicDBObject3 = builder2.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.typeName("connect_timeout");
        boolean boolean6 = builder2.mongoGridFS;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.script("script");
        java.lang.String[] strArray41 = new java.lang.String[] { "include_collection", "host", "hi!", "drop_collection", "size", "filter", "bulk_timeout", "drop_collection", "concurrent_bulk_requests", "servers", "localhost", "store_statistics", "script", "secondary_read_preference", "throttle_size", "parent_types", "db", "type", "admin", "filter", "servers", "user", "secondary_read_preference", "connect_timeout", "local", "host", "drop_collection", "user", "password", "ssl_verify_certificate", "password" };
        java.util.LinkedHashSet<java.lang.String> strSet42 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet42, strArray41);
        builder9.setparentTypes((java.util.Set<java.lang.String>) strSet42);
        builder2.setparentTypes((java.util.Set<java.lang.String>) strSet42);
        java.lang.String str46 = builder2.mongoDb;
        boolean boolean47 = builder2.getmongoUseSSL();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(basicDBObject3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoSSLVerifyCertificate(true);
        java.util.Set<java.lang.String> strSet6 = builder5.excludeFields;
        java.lang.String str7 = builder5.mongoAdminUser;
        builder5.setscript("");
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        java.lang.String str5 = builder0.mongoLocalUser;
        com.mongodb.ServerAddress[] serverAddressArray6 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList7 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList7, serverAddressArray6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList7);
        boolean boolean10 = builder9.dropCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder11.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet14 = builder11.excludeFields;
        com.mongodb.BasicDBObject basicDBObject15 = builder11.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = builder11.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray17 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList18 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList18, serverAddressArray17);
        builder11.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder9.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder22.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet25 = builder22.excludeFields;
        com.mongodb.BasicDBObject basicDBObject26 = builder22.getmongoCollectionFilter();
        java.lang.String str27 = builder22.mongoLocalUser;
        com.mongodb.ServerAddress[] serverAddressArray28 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList29 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList29, serverAddressArray28);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder22.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList29);
        java.lang.String str32 = builder22.mongoAdminPassword;
        java.lang.String[] strArray37 = new java.lang.String[] { "admin", "script_type", "credentials", "password" };
        java.util.LinkedHashSet<java.lang.String> strSet38 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet38, strArray37);
        builder22.setincludeFields((java.util.Set<java.lang.String>) strSet38);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder9.excludeFields((java.util.Set<java.lang.String>) strSet38);
        java.lang.String str42 = builder41.getmongoCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder41.importAllCollections(false);
        boolean boolean45 = builder44.getimportAllCollections();
        java.lang.String str46 = builder44.getscriptType();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(serverAddressArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(strSet14);
        org.junit.Assert.assertNotNull(basicDBObject15);
        org.junit.Assert.assertNull(wildcardTimestamp16);
        org.junit.Assert.assertNotNull(serverAddressArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNull(strSet25);
        org.junit.Assert.assertNotNull(basicDBObject26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(serverAddressArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(str46);
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        java.lang.String str5 = builder0.mongoLocalUser;
        com.mongodb.ServerAddress[] serverAddressArray6 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList7 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList7, serverAddressArray6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList7);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder0.getmongoClientOptions();
        builder0.mongoSecondaryReadPreference = false;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder13.setmongoSecondaryReadPreference(false);
        boolean boolean16 = builder13.getmongoSSLVerifyCertificate();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder17.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet20 = builder17.excludeFields;
        com.mongodb.BasicDBObject basicDBObject21 = builder17.getmongoCollectionFilter();
        java.lang.String str22 = builder17.mongoLocalUser;
        com.mongodb.ServerAddress[] serverAddressArray23 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList24 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList24, serverAddressArray23);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder17.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList24);
        com.mongodb.MongoClientOptions mongoClientOptions27 = builder17.getmongoClientOptions();
        builder17.riverName = "script_type";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder30.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet33 = builder30.excludeFields;
        com.mongodb.BasicDBObject basicDBObject34 = builder30.getmongoCollectionFilter();
        builder17.setmongoOplogFilter(basicDBObject34);
        com.mongodb.BasicDBObject basicDBObject36 = builder17.mongoOplogFilter;
        builder13.setmongoOplogFilter(basicDBObject36);
        builder0.mongoCollectionFilter = basicDBObject36;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder0.includeCollection("hi!");
        boolean boolean41 = builder0.mongoGridFS;
        boolean boolean42 = builder0.mongoSecondaryReadPreference;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(serverAddressArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(mongoClientOptions10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(strSet20);
        org.junit.Assert.assertNotNull(basicDBObject21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(serverAddressArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNull(mongoClientOptions27);
        org.junit.Assert.assertNull(strSet33);
        org.junit.Assert.assertNotNull(basicDBObject34);
        org.junit.Assert.assertNotNull(basicDBObject36);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.script("script");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder3.script("script");
        java.lang.String[] strArray37 = new java.lang.String[] { "include_collection", "host", "hi!", "drop_collection", "size", "filter", "bulk_timeout", "drop_collection", "concurrent_bulk_requests", "servers", "localhost", "store_statistics", "script", "secondary_read_preference", "throttle_size", "parent_types", "db", "type", "admin", "filter", "servers", "user", "secondary_read_preference", "connect_timeout", "local", "host", "drop_collection", "user", "password", "ssl_verify_certificate", "password" };
        java.util.LinkedHashSet<java.lang.String> strSet38 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet38, strArray37);
        builder5.setparentTypes((java.util.Set<java.lang.String>) strSet38);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder0.excludeFields((java.util.Set<java.lang.String>) strSet38);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder42.script("script");
        com.mongodb.BasicDBObject basicDBObject45 = builder44.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder0.mongoOplogFilter(basicDBObject45);
        builder46.setindexName("null.initial_timestamp");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(basicDBObject45);
        org.junit.Assert.assertNotNull(builder46);
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        java.lang.String str5 = builder0.mongoLocalUser;
        com.mongodb.ServerAddress[] serverAddressArray6 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList7 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList7, serverAddressArray6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList7);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder0.getmongoClientOptions();
        builder0.riverName = "script_type";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder13.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet16 = builder13.excludeFields;
        com.mongodb.BasicDBObject basicDBObject17 = builder13.getmongoCollectionFilter();
        builder0.setmongoOplogFilter(basicDBObject17);
        boolean boolean19 = builder0.mongoGridFS;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder0.mongoAdminPassword("user");
        java.lang.String str22 = builder21.getmongoLocalPassword();
        java.lang.String str23 = builder21.mongoLocalUser;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder24.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet27 = builder24.excludeFields;
        com.mongodb.BasicDBObject basicDBObject28 = builder24.getmongoCollectionFilter();
        java.lang.String str29 = builder24.mongoLocalUser;
        builder24.setscript("drop_collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder32.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet35 = builder32.excludeFields;
        com.mongodb.BasicDBObject basicDBObject36 = builder32.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder24.mongoCollectionFilter(basicDBObject36);
        builder21.setmongoCollectionFilter(basicDBObject36);
        builder21.setdropCollection(false);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(serverAddressArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(mongoClientOptions10);
        org.junit.Assert.assertNull(strSet16);
        org.junit.Assert.assertNotNull(basicDBObject17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(strSet27);
        org.junit.Assert.assertNotNull(basicDBObject28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNull(strSet35);
        org.junit.Assert.assertNotNull(basicDBObject36);
        org.junit.Assert.assertNotNull(builder37);
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoSSLVerifyCertificate(true);
        builder0.script = "import_all_collections";
        boolean boolean8 = builder0.getadvancedTransformation();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoAdminUser("bulk_size");
        builder0.setdisableIndexRefresh(false);
        builder0.settypeName("ssl_verify_certificate");
        org.bson.types.BSONTimestamp bSONTimestamp15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder0.initialTimestamp(bSONTimestamp15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ts must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getHOST_FIELD();
        java.lang.String str12 = mongoDBRiverDefinition9.getMongoLocalPassword();
        java.lang.String str13 = mongoDBRiverDefinition9.scriptType;
        java.lang.String str14 = mongoDBRiverDefinition9.getBULK_SIZE_FIELD();
        java.lang.String str15 = mongoDBRiverDefinition9.getDB_FIELD();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "host" + "'", str11, "host");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "bulk_size" + "'", str14, "bulk_size");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "db" + "'", str15, "db");
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        java.lang.String str5 = builder0.mongoLocalUser;
        builder0.setscript("drop_collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder8.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet11 = builder8.excludeFields;
        com.mongodb.BasicDBObject basicDBObject12 = builder8.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder0.mongoCollectionFilter(basicDBObject12);
        builder13.throttleSize = '#';
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder13.importAllCollections(true);
        builder13.advancedTransformation = false;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder20.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet23 = builder20.excludeFields;
        builder20.setmongoCollection("initial_timestamp");
        boolean boolean26 = builder20.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder20.skipInitialImport(false);
        builder20.disableIndexRefresh = true;
        boolean boolean31 = builder20.mongoSecondaryReadPreference;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder32.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet35 = builder32.excludeFields;
        com.mongodb.BasicDBObject basicDBObject36 = builder32.getmongoCollectionFilter();
        java.lang.String str37 = builder32.mongoLocalUser;
        builder32.setscript("drop_collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder40.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet43 = builder40.excludeFields;
        com.mongodb.BasicDBObject basicDBObject44 = builder40.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder32.mongoCollectionFilter(basicDBObject44);
        builder45.mongoSecondaryReadPreference = false;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder48.script("script");
        com.mongodb.BasicDBObject basicDBObject51 = builder50.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder50.typeName("connect_timeout");
        boolean boolean54 = builder50.mongoGridFS;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder55.script("script");
        java.lang.String[] strArray89 = new java.lang.String[] { "include_collection", "host", "hi!", "drop_collection", "size", "filter", "bulk_timeout", "drop_collection", "concurrent_bulk_requests", "servers", "localhost", "store_statistics", "script", "secondary_read_preference", "throttle_size", "parent_types", "db", "type", "admin", "filter", "servers", "user", "secondary_read_preference", "connect_timeout", "local", "host", "drop_collection", "user", "password", "ssl_verify_certificate", "password" };
        java.util.LinkedHashSet<java.lang.String> strSet90 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet90, strArray89);
        builder57.setparentTypes((java.util.Set<java.lang.String>) strSet90);
        builder50.setparentTypes((java.util.Set<java.lang.String>) strSet90);
        builder45.setincludeFields((java.util.Set<java.lang.String>) strSet90);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder95 = builder20.parentTypes((java.util.Set<java.lang.String>) strSet90);
        builder13.excludeFields = strSet90;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(strSet11);
        org.junit.Assert.assertNotNull(basicDBObject12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNull(strSet23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(strSet35);
        org.junit.Assert.assertNotNull(basicDBObject36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNull(strSet43);
        org.junit.Assert.assertNotNull(basicDBObject44);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(basicDBObject51);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(strArray89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertNotNull(builder95);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("socket_timeout", "include_fields");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?include_fields?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getHOST_FIELD();
        java.lang.String str12 = mongoDBRiverDefinition9.getMongoLocalPassword();
        java.lang.String str13 = mongoDBRiverDefinition9.script;
        java.lang.String str14 = mongoDBRiverDefinition9.mongoAdminUser;
        int int15 = mongoDBRiverDefinition9.getDEFAULT_BULK_ACTIONS();
        java.lang.String str16 = mongoDBRiverDefinition9.getTYPE_FIELD();
        boolean boolean17 = mongoDBRiverDefinition9.mongoSSLVerifyCertificate;
        java.lang.String str18 = mongoDBRiverDefinition9.getTYPE_FIELD();
        java.lang.String str19 = mongoDBRiverDefinition9.getPARENT_TYPES_FIELD();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "host" + "'", str11, "host");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1000 + "'", int15 == 1000);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "type" + "'", str16, "type");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "type" + "'", str18, "type");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "parent_types" + "'", str19, "parent_types");
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getIndexName();
        java.lang.String str12 = mongoDBRiverDefinition9.getSECONDARY_READ_PREFERENCE_FIELD();
        java.lang.String str13 = mongoDBRiverDefinition9.mongoAdminUser;
        boolean boolean14 = mongoDBRiverDefinition9.isImportAllCollections();
        boolean boolean15 = mongoDBRiverDefinition9.isImportAllCollections();
        java.lang.String str16 = mongoDBRiverDefinition9.getINITIAL_TIMESTAMP_FIELD();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "secondary_read_preference" + "'", str12, "secondary_read_preference");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "initial_timestamp" + "'", str16, "initial_timestamp");
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getIndexName();
        java.lang.String str12 = mongoDBRiverDefinition9.getSECONDARY_READ_PREFERENCE_FIELD();
        java.util.Set<java.lang.String> strSet13 = mongoDBRiverDefinition9.excludeFields;
        java.lang.String str14 = mongoDBRiverDefinition9.getOPTIONS_FIELD();
        java.lang.String str15 = mongoDBRiverDefinition9.mongoAdminUser;
        java.util.List<com.mongodb.ServerAddress> serverAddressList16 = mongoDBRiverDefinition9.mongoServers;
        java.lang.String str17 = mongoDBRiverDefinition9.script;
        java.lang.String str18 = mongoDBRiverDefinition9.getACTIONS_FIELD();
        java.lang.String str19 = mongoDBRiverDefinition9.getCONNECTION_TIMEOUT();
        boolean boolean20 = mongoDBRiverDefinition9.isDisableIndexRefresh();
        java.lang.String str21 = mongoDBRiverDefinition9.getCONCURRENT_BULK_REQUESTS_FIELD();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "secondary_read_preference" + "'", str12, "secondary_read_preference");
        org.junit.Assert.assertNull(strSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "options" + "'", str14, "options");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(serverAddressList16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "actions" + "'", str18, "actions");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "connect_timeout" + "'", str19, "connect_timeout");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "concurrent_bulk_requests" + "'", str21, "concurrent_bulk_requests");
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("ssl_verify_certificate", "exclude_fields");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?exclude_fields?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.script("script");
        int int3 = builder2.throttleSize;
        java.util.List<com.mongodb.ServerAddress> serverAddressList4 = builder2.mongoServers;
        boolean boolean5 = builder2.storeStatistics;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(serverAddressList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("hi!");
        java.lang.String str6 = builder0.getstatisticsTypeName();
        builder0.setthrottleSize((int) (byte) 0);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getHOST_FIELD();
        java.lang.String str12 = mongoDBRiverDefinition9.getMongoLocalPassword();
        java.lang.String str13 = mongoDBRiverDefinition9.getINITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD();
        com.mongodb.MongoClientOptions mongoClientOptions14 = mongoDBRiverDefinition9.mongoClientOptions;
        java.lang.String str15 = mongoDBRiverDefinition9.getSTORE_STATISTICS_FIELD();
        java.lang.String str16 = mongoDBRiverDefinition9.includeCollection;
        int int17 = mongoDBRiverDefinition9.getSocketTimeout();
        int int18 = mongoDBRiverDefinition9.getConnectTimeout();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "host" + "'", str11, "host");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "script_type" + "'", str13, "script_type");
        org.junit.Assert.assertNull(mongoClientOptions14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "store_statistics" + "'", str15, "store_statistics");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.disableIndexRefresh(true);
        builder10.socketTimeout = 'a';
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoSSLVerifyCertificate(true);
        builder0.script = "import_all_collections";
        boolean boolean8 = builder0.getadvancedTransformation();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoAdminUser("bulk_size");
        com.mongodb.BasicDBObject basicDBObject11 = builder10.getmongoCollectionFilter();
        java.lang.String str12 = builder10.getstatisticsIndexName();
        builder10.mongoAdminUser = "flush_interval";
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(basicDBObject11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        java.lang.String str5 = builder0.mongoLocalUser;
        com.mongodb.ServerAddress[] serverAddressArray6 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList7 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList7, serverAddressArray6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList7);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder0.getmongoClientOptions();
        builder0.mongoSecondaryReadPreference = false;
        java.lang.String str13 = builder0.statisticsIndexName;
        boolean boolean14 = builder0.mongoSSLVerifyCertificate;
        java.util.Set<java.lang.String> strSet15 = builder0.parentTypes;
        builder0.mongoCollection = "drop_collection";
        com.mongodb.BasicDBObject basicDBObject18 = builder0.getmongoOplogFilter();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(serverAddressArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(mongoClientOptions10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(strSet15);
        org.junit.Assert.assertNull(basicDBObject18);
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.script("script");
        com.mongodb.BasicDBObject basicDBObject12 = builder11.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder0.mongoCollectionFilter(basicDBObject12);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder0.mongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.mongoAdminUser("parent_types");
        builder15.setsocketTimeout(8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder15.advancedTransformation(false);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(basicDBObject12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoSSLVerifyCertificate(true);
        boolean boolean6 = builder0.mongoSSLVerifyCertificate;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder7.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet10 = builder7.excludeFields;
        com.mongodb.BasicDBObject basicDBObject11 = builder7.getmongoCollectionFilter();
        java.lang.String str12 = builder7.mongoLocalUser;
        com.mongodb.ServerAddress[] serverAddressArray13 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList14 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList14, serverAddressArray13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder7.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList14);
        java.lang.String str17 = builder7.mongoAdminPassword;
        java.lang.String[] strArray22 = new java.lang.String[] { "admin", "script_type", "credentials", "password" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        builder7.setincludeFields((java.util.Set<java.lang.String>) strSet23);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder0.parentTypes((java.util.Set<java.lang.String>) strSet23);
        int int27 = builder26.connectTimeout;
        java.lang.String str28 = builder26.getriverName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder26.riverIndexName("ssl");
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(strSet10);
        org.junit.Assert.assertNotNull(basicDBObject11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(serverAddressArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(builder30);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        java.lang.String str5 = builder0.mongoLocalUser;
        builder0.setscript("drop_collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder8.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet11 = builder8.excludeFields;
        com.mongodb.BasicDBObject basicDBObject12 = builder8.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder0.mongoCollectionFilter(basicDBObject12);
        java.lang.String str14 = builder0.getstatisticsIndexName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder0.mongoUseSSL(false);
        builder16.setriverIndexName("");
        com.mongodb.MongoClientOptions mongoClientOptions19 = null;
        builder16.setmongoClientOptions(mongoClientOptions19);
        boolean boolean21 = builder16.mongoUseSSL;
        java.lang.String str22 = builder16.statisticsIndexName;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(strSet11);
        org.junit.Assert.assertNotNull(basicDBObject12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getIndexName();
        java.lang.String str12 = mongoDBRiverDefinition9.getSECONDARY_READ_PREFERENCE_FIELD();
        boolean boolean13 = mongoDBRiverDefinition9.isImportAllCollections();
        java.lang.String str14 = mongoDBRiverDefinition9.getPARENT_TYPES_FIELD();
        int int15 = mongoDBRiverDefinition9.getConnectTimeout();
        boolean boolean16 = mongoDBRiverDefinition9.importAllCollections;
        java.lang.String str17 = mongoDBRiverDefinition9.getSECONDARY_READ_PREFERENCE_FIELD();
        boolean boolean18 = mongoDBRiverDefinition9.disableIndexRefresh;
        java.lang.String str19 = mongoDBRiverDefinition9.mongoAdminUser;
        com.mongodb.BasicDBObject basicDBObject20 = mongoDBRiverDefinition9.mongoOplogFilter;
        java.lang.String str21 = mongoDBRiverDefinition9.script;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "secondary_read_preference" + "'", str12, "secondary_read_preference");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "parent_types" + "'", str14, "parent_types");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "secondary_read_preference" + "'", str17, "secondary_read_preference");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(basicDBObject20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        builder0.setmongoAdminPassword("store_statistics");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.scriptType("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.statisticsTypeName("throttle_size");
        builder14.setadvancedTransformation(false);
        java.lang.String str17 = builder14.getstatisticsIndexName();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = builder0.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray6 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList7 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList7, serverAddressArray6);
        builder0.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList7);
        builder0.setdisableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder12.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet15 = builder12.excludeFields;
        builder12.setmongoCollection("initial_timestamp");
        boolean boolean18 = builder12.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder12.skipInitialImport(false);
        builder12.disableIndexRefresh = true;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder12.socketTimeout((int) (short) 1);
        java.util.List<com.mongodb.ServerAddress> serverAddressList25 = builder12.mongoServers;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder0.mongoServers(serverAddressList25);
        builder26.statisticsIndexName = "host";
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNotNull(serverAddressArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(strSet15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(serverAddressList25);
        org.junit.Assert.assertNotNull(builder26);
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("", "bulk", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?bulk?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getCOLLECTION_FIELD();
        java.util.Set<java.lang.String> strSet12 = mongoDBRiverDefinition9.excludeFields;
        boolean boolean13 = mongoDBRiverDefinition9.getstoreStatistics();
        boolean boolean14 = mongoDBRiverDefinition9.getmongoGridFS();
        java.lang.String str15 = mongoDBRiverDefinition9.getINITIAL_TIMESTAMP_SCRIPT_FIELD();
        java.lang.String str16 = mongoDBRiverDefinition9.getMongoDb();
        boolean boolean17 = mongoDBRiverDefinition9.isMongoSecondaryReadPreference();
        boolean boolean18 = mongoDBRiverDefinition9.isStoreStatistics();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "collection" + "'", str11, "collection");
        org.junit.Assert.assertNull(strSet12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "script" + "'", str15, "script");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoSSLVerifyCertificate(true);
        builder0.script = "import_all_collections";
        java.lang.String str8 = builder0.script;
        java.lang.String str9 = builder0.scriptType;
        builder0.mongoGridFS = false;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "import_all_collections" + "'", str8, "import_all_collections");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        boolean boolean3 = builder0.getmongoSSLVerifyCertificate();
        java.lang.String str4 = builder0.getriverIndexName();
        builder0.setimportAllCollections(false);
        int int7 = builder0.getconnectTimeout();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.mongoLocalPassword("db");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder10.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet13 = builder10.excludeFields;
        builder10.setmongoCollection("initial_timestamp");
        boolean boolean16 = builder10.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder10.skipInitialImport(false);
        builder10.disableIndexRefresh = true;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder10.socketTimeout((int) (short) 1);
        builder10.includeCollection = "gridfs";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder10.importAllCollections(false);
        java.util.Set<java.lang.String> strSet27 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.includeFields(strSet27);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder29.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet32 = builder29.excludeFields;
        builder29.setmongoCollection("initial_timestamp");
        boolean boolean35 = builder29.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder29.skipInitialImport(false);
        java.lang.String str38 = builder37.typeName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder39.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet42 = builder39.excludeFields;
        com.mongodb.BasicDBObject basicDBObject43 = builder39.getmongoCollectionFilter();
        java.lang.String str44 = builder39.mongoLocalUser;
        com.mongodb.ServerAddress[] serverAddressArray45 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList46 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList46, serverAddressArray45);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder39.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList46);
        boolean boolean49 = builder48.dropCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder50.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet53 = builder50.excludeFields;
        com.mongodb.BasicDBObject basicDBObject54 = builder50.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp55 = builder50.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray56 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList57 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList57, serverAddressArray56);
        builder50.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList57);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder48.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList57);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder61.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet64 = builder61.excludeFields;
        com.mongodb.BasicDBObject basicDBObject65 = builder61.getmongoCollectionFilter();
        java.lang.String str66 = builder61.mongoLocalUser;
        com.mongodb.ServerAddress[] serverAddressArray67 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList68 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList68, serverAddressArray67);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder70 = builder61.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList68);
        java.lang.String str71 = builder61.mongoAdminPassword;
        java.lang.String[] strArray76 = new java.lang.String[] { "admin", "script_type", "credentials", "password" };
        java.util.LinkedHashSet<java.lang.String> strSet77 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet77, strArray76);
        builder61.setincludeFields((java.util.Set<java.lang.String>) strSet77);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder80 = builder48.excludeFields((java.util.Set<java.lang.String>) strSet77);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder81 = builder37.parentTypes((java.util.Set<java.lang.String>) strSet77);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder82 = builder28.excludeFields((java.util.Set<java.lang.String>) strSet77);
        builder0.excludeFields = strSet77;
        java.lang.String str84 = builder0.riverName;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(strSet13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNull(strSet32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(strSet42);
        org.junit.Assert.assertNotNull(basicDBObject43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(serverAddressArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(strSet53);
        org.junit.Assert.assertNotNull(basicDBObject54);
        org.junit.Assert.assertNull(wildcardTimestamp55);
        org.junit.Assert.assertNotNull(serverAddressArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNull(strSet64);
        org.junit.Assert.assertNotNull(basicDBObject65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNotNull(serverAddressArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(builder80);
        org.junit.Assert.assertNotNull(builder81);
        org.junit.Assert.assertNotNull(builder82);
        org.junit.Assert.assertNull(str84);
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getIndexName();
        java.lang.String str12 = mongoDBRiverDefinition9.getSECONDARY_READ_PREFERENCE_FIELD();
        java.util.Set<java.lang.String> strSet13 = mongoDBRiverDefinition9.excludeFields;
        java.lang.String str14 = mongoDBRiverDefinition9.getOPTIONS_FIELD();
        java.lang.String str15 = mongoDBRiverDefinition9.mongoAdminUser;
        boolean boolean16 = mongoDBRiverDefinition9.getdropCollection();
        boolean boolean17 = mongoDBRiverDefinition9.isDropCollection();
        java.lang.String str18 = mongoDBRiverDefinition9.getFLUSH_INTERVAL_FIELD();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "secondary_read_preference" + "'", str12, "secondary_read_preference");
        org.junit.Assert.assertNull(strSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "options" + "'", str14, "options");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "flush_interval" + "'", str18, "flush_interval");
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        java.lang.String str5 = builder0.mongoLocalUser;
        com.mongodb.ServerAddress[] serverAddressArray6 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList7 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList7, serverAddressArray6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList7);
        java.lang.String str10 = builder9.getmongoLocalPassword();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder9);
        com.mongodb.MongoClientOptions mongoClientOptions12 = mongoDBRiverDefinition11.getMongoClientOptions();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(serverAddressArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(mongoClientOptions12);
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        java.lang.String str5 = builder0.mongoLocalUser;
        com.mongodb.ServerAddress[] serverAddressArray6 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList7 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList7, serverAddressArray6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList7);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder0.getmongoClientOptions();
        builder0.riverName = "script_type";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder13.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet16 = builder13.excludeFields;
        com.mongodb.BasicDBObject basicDBObject17 = builder13.getmongoCollectionFilter();
        builder0.setmongoOplogFilter(basicDBObject17);
        boolean boolean19 = builder0.mongoGridFS;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder0.mongoAdminPassword("user");
        boolean boolean22 = builder21.mongoSecondaryReadPreference;
        boolean boolean23 = builder21.getimportAllCollections();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(serverAddressArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(mongoClientOptions10);
        org.junit.Assert.assertNull(strSet16);
        org.junit.Assert.assertNotNull(basicDBObject17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = builder0.initialTimestamp;
        builder0.setstatisticsTypeName("ssl_verify_certificate");
        java.util.Set<java.lang.String> strSet8 = builder0.getexcludeFields();
        builder0.disableIndexRefresh = false;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(strSet8);
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        java.lang.String str5 = builder0.mongoLocalUser;
        com.mongodb.ServerAddress[] serverAddressArray6 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList7 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList7, serverAddressArray6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList7);
        boolean boolean10 = builder9.dropCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder11.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet14 = builder11.excludeFields;
        com.mongodb.BasicDBObject basicDBObject15 = builder11.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = builder11.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray17 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList18 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList18, serverAddressArray17);
        builder11.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder9.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder22.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet25 = builder22.excludeFields;
        com.mongodb.BasicDBObject basicDBObject26 = builder22.getmongoCollectionFilter();
        java.lang.String str27 = builder22.mongoLocalUser;
        com.mongodb.ServerAddress[] serverAddressArray28 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList29 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList29, serverAddressArray28);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder22.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList29);
        java.lang.String str32 = builder22.mongoAdminPassword;
        java.lang.String[] strArray37 = new java.lang.String[] { "admin", "script_type", "credentials", "password" };
        java.util.LinkedHashSet<java.lang.String> strSet38 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet38, strArray37);
        builder22.setincludeFields((java.util.Set<java.lang.String>) strSet38);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder9.excludeFields((java.util.Set<java.lang.String>) strSet38);
        java.lang.String str42 = builder41.getmongoCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder41.importAllCollections(true);
        java.lang.String str45 = builder44.typeName;
        builder44.mongoGridFS = true;
        com.mongodb.MongoClientOptions mongoClientOptions48 = builder44.getmongoClientOptions();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(serverAddressArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(strSet14);
        org.junit.Assert.assertNotNull(basicDBObject15);
        org.junit.Assert.assertNull(wildcardTimestamp16);
        org.junit.Assert.assertNotNull(serverAddressArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNull(strSet25);
        org.junit.Assert.assertNotNull(basicDBObject26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(serverAddressArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(mongoClientOptions48);
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("db");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?db?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        boolean boolean11 = mongoDBRiverDefinition9.mongoGridFS;
        boolean boolean12 = mongoDBRiverDefinition9.mongoGridFS;
        boolean boolean13 = mongoDBRiverDefinition9.getmongoSecondaryReadPreference();
        java.lang.String str14 = mongoDBRiverDefinition9.getBULK_SIZE_FIELD();
        java.lang.String str15 = mongoDBRiverDefinition9.getCONNECTION_TIMEOUT();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "bulk_size" + "'", str14, "bulk_size");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "connect_timeout" + "'", str15, "connect_timeout");
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.script("script");
        com.mongodb.BasicDBObject basicDBObject3 = builder2.getmongoCollectionFilter();
        builder2.setmongoLocalPassword("exclude_fields");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder6.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet9 = builder6.excludeFields;
        com.mongodb.BasicDBObject basicDBObject10 = builder6.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = builder6.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray12 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList13 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList13, serverAddressArray12);
        builder6.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder2.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder2.mongoCollection("local");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.mongoLocalPassword("advanced_transformation");
        builder18.setadvancedTransformation(false);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(basicDBObject3);
        org.junit.Assert.assertNull(strSet9);
        org.junit.Assert.assertNotNull(basicDBObject10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNotNull(serverAddressArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("advanced_transformation", "", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        builder0.setmongoAdminPassword("store_statistics");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.scriptType("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.dropCollection(true);
        com.mongodb.BasicDBObject basicDBObject15 = builder14.getmongoOplogFilter();
        builder14.advancedTransformation = true;
        java.lang.String str18 = builder14.script;
        builder14.throttleSize = '4';
        java.lang.String str21 = builder14.mongoLocalUser;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNull(basicDBObject15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder1.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet4 = builder1.excludeFields;
        com.mongodb.BasicDBObject basicDBObject5 = builder1.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = builder1.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray7 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList8 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList8, serverAddressArray7);
        builder1.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList8);
        builder0.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder12.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet15 = builder12.excludeFields;
        com.mongodb.BasicDBObject basicDBObject16 = builder12.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp17 = builder12.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray18 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList19 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList19, serverAddressArray18);
        builder12.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList19);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder0.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList19);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder0.indexName("");
        int int25 = builder0.getsocketTimeout();
        builder0.mongoAdminUser = "store_statistics";
        com.mongodb.MongoClientOptions mongoClientOptions28 = null;
        builder0.mongoClientOptions = mongoClientOptions28;
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertNotNull(basicDBObject5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNotNull(serverAddressArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strSet15);
        org.junit.Assert.assertNotNull(basicDBObject16);
        org.junit.Assert.assertNull(wildcardTimestamp17);
        org.junit.Assert.assertNotNull(serverAddressArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        boolean boolean3 = builder0.getmongoSSLVerifyCertificate();
        java.lang.String str4 = builder0.getriverIndexName();
        builder0.setimportAllCollections(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.mongoUseSSL(true);
        java.util.Set<java.lang.String> strSet9 = builder8.excludeFields;
        boolean boolean10 = builder8.getstoreStatistics();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(strSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.script("script");
        com.mongodb.BasicDBObject basicDBObject3 = builder2.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.typeName("connect_timeout");
        boolean boolean6 = builder2.mongoGridFS;
        java.lang.String str7 = builder2.mongoDb;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder2.typeName("concurrent_requests");
        java.lang.String str10 = builder2.getmongoAdminUser();
        builder2.setmongoUseSSL(true);
        builder2.mongoSSLVerifyCertificate = false;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(basicDBObject3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getHOST_FIELD();
        boolean boolean12 = mongoDBRiverDefinition9.isAdvancedTransformation();
        java.lang.String str13 = mongoDBRiverDefinition9.getINCLUDE_COLLECTION_FIELD();
        boolean boolean14 = mongoDBRiverDefinition9.getmongoSSLVerifyCertificate();
        java.lang.String str15 = mongoDBRiverDefinition9.getHOST_FIELD();
        java.lang.String str16 = mongoDBRiverDefinition9.getINITIAL_TIMESTAMP_SCRIPT_FIELD();
        java.lang.String str17 = mongoDBRiverDefinition9.getScriptType();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "host" + "'", str11, "host");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "include_collection" + "'", str13, "include_collection");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "host" + "'", str15, "host");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "script" + "'", str16, "script");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        boolean boolean11 = mongoDBRiverDefinition9.mongoGridFS;
        java.lang.String str12 = mongoDBRiverDefinition9.getINITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD();
        boolean boolean13 = mongoDBRiverDefinition9.getdisableIndexRefresh();
        java.lang.String str14 = mongoDBRiverDefinition9.indexName;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "script_type" + "'", str12, "script_type");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        java.lang.String str5 = builder0.mongoLocalUser;
        com.mongodb.ServerAddress[] serverAddressArray6 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList7 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList7, serverAddressArray6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList7);
        boolean boolean10 = builder9.dropCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder9.riverIndexName("filter");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder9.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder9.mongoAdminUser("credentials");
        builder9.dropCollection = false;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(serverAddressArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getHOST_FIELD();
        java.lang.String str12 = mongoDBRiverDefinition9.getMongoLocalPassword();
        java.lang.String str13 = mongoDBRiverDefinition9.getINITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD();
        com.mongodb.MongoClientOptions mongoClientOptions14 = mongoDBRiverDefinition9.mongoClientOptions;
        java.lang.String str15 = mongoDBRiverDefinition9.getEXCLUDE_FIELDS_FIELD();
        boolean boolean16 = mongoDBRiverDefinition9.getmongoSSLVerifyCertificate();
        boolean boolean17 = mongoDBRiverDefinition9.getimportAllCollections();
        java.lang.String str18 = mongoDBRiverDefinition9.getEXCLUDE_FIELDS_FIELD();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "host" + "'", str11, "host");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "script_type" + "'", str13, "script_type");
        org.junit.Assert.assertNull(mongoClientOptions14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "exclude_fields" + "'", str15, "exclude_fields");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "exclude_fields" + "'", str18, "exclude_fields");
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder1.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet4 = builder1.excludeFields;
        com.mongodb.BasicDBObject basicDBObject5 = builder1.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = builder1.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray7 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList8 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList8, serverAddressArray7);
        builder1.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList8);
        builder0.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList8);
        builder0.mongoLocalUser = "credentials";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder0.mongoAdminUser("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.mongoSecondaryReadPreference(false);
        builder15.advancedTransformation = true;
        builder15.setscriptType("script");
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertNotNull(basicDBObject5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNotNull(serverAddressArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder1.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet4 = builder1.excludeFields;
        com.mongodb.BasicDBObject basicDBObject5 = builder1.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = builder1.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray7 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList8 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList8, serverAddressArray7);
        builder1.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList8);
        builder0.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList8);
        builder0.mongoLocalUser = "credentials";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder0.mongoAdminUser("ssl");
        builder0.setmongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder0.mongoLocalUser("db");
        builder0.indexName = "include_fields";
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertNotNull(basicDBObject5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNotNull(serverAddressArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = builder0.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray6 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList7 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList7, serverAddressArray6);
        builder0.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList7);
        java.lang.String str10 = builder0.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.dropCollection(true);
        boolean boolean13 = builder12.mongoSSLVerifyCertificate;
        java.lang.String str14 = builder12.typeName;
        builder12.typeName = "include_fields";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder17.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet20 = builder17.excludeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder17.mongoSSLVerifyCertificate(true);
        java.util.Set<java.lang.String> strSet23 = builder22.excludeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder24.setmongoSecondaryReadPreference(false);
        boolean boolean27 = builder24.getmongoSSLVerifyCertificate();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder28.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet31 = builder28.excludeFields;
        com.mongodb.BasicDBObject basicDBObject32 = builder28.getmongoCollectionFilter();
        java.lang.String str33 = builder28.mongoLocalUser;
        com.mongodb.ServerAddress[] serverAddressArray34 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList35 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList35, serverAddressArray34);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder28.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList35);
        com.mongodb.MongoClientOptions mongoClientOptions38 = builder28.getmongoClientOptions();
        builder28.riverName = "script_type";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder41.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet44 = builder41.excludeFields;
        com.mongodb.BasicDBObject basicDBObject45 = builder41.getmongoCollectionFilter();
        builder28.setmongoOplogFilter(basicDBObject45);
        com.mongodb.BasicDBObject basicDBObject47 = builder28.mongoOplogFilter;
        builder24.setmongoOplogFilter(basicDBObject47);
        builder22.setmongoCollectionFilter(basicDBObject47);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder12.mongoCollectionFilter(basicDBObject47);
        boolean boolean51 = builder12.mongoSSLVerifyCertificate;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNotNull(serverAddressArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(strSet20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNull(strSet23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(strSet31);
        org.junit.Assert.assertNotNull(basicDBObject32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(serverAddressArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNull(mongoClientOptions38);
        org.junit.Assert.assertNull(strSet44);
        org.junit.Assert.assertNotNull(basicDBObject45);
        org.junit.Assert.assertNotNull(basicDBObject47);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = builder0.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray6 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList7 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList7, serverAddressArray6);
        builder0.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList7);
        builder0.setdisableIndexRefresh(true);
        java.lang.String str12 = builder0.riverName;
        builder0.setmongoGridFS(true);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNotNull(serverAddressArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        java.lang.String str9 = builder8.typeName;
        java.util.Set<java.lang.String> strSet10 = builder8.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        org.bson.types.Binary binary12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder8.initialTimestamp(binary12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(strSet10);
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        org.elasticsearch.common.settings.Settings settings2 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        org.elasticsearch.river.RiverSettings riverSettings4 = new org.elasticsearch.river.RiverSettings(settings2, strMap3);
        org.elasticsearch.common.settings.Settings settings5 = riverSettings4.globalSettings();
        org.elasticsearch.script.ScriptService scriptService6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("flush_interval", "db", riverSettings4, scriptService6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(settings5);
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        com.mongodb.MongoClientOptions mongoClientOptions3 = null;
        builder0.mongoClientOptions = mongoClientOptions3;
        builder0.mongoGridFS = true;
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextScore((float) ' ');
        org.apache.lucene.index.AtomicReaderContext atomicReaderContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextReader(atomicReaderContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        docScoreSearchScript0.setNextScore((float) 10L);
        docScoreSearchScript0.setNextScore(0.0f);
        org.apache.lucene.search.Scorer scorer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setScorer(scorer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + true + "'", obj2, true);
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = builder0.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray6 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList7 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList7, serverAddressArray6);
        builder0.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList7);
        java.lang.String str10 = builder0.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.dropCollection(true);
        java.lang.String str13 = builder12.typeName;
        builder12.setmongoSecondaryReadPreference(false);
        boolean boolean16 = builder12.mongoGridFS;
        builder12.mongoGridFS = false;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNotNull(serverAddressArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getCOLLECTION_FIELD();
        boolean boolean12 = mongoDBRiverDefinition9.isImportAllCollections();
        boolean boolean13 = mongoDBRiverDefinition9.mongoGridFS;
        java.lang.String str14 = mongoDBRiverDefinition9.getCONCURRENT_BULK_REQUESTS_FIELD();
        int int15 = mongoDBRiverDefinition9.getConnectTimeout();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "collection" + "'", str11, "collection");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "concurrent_bulk_requests" + "'", str14, "concurrent_bulk_requests");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = builder0.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray6 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList7 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList7, serverAddressArray6);
        builder0.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList7);
        builder0.setdisableIndexRefresh(true);
        java.lang.String str12 = builder0.riverName;
        boolean boolean13 = builder0.getdropCollection();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNotNull(serverAddressArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getIndexName();
        java.lang.String str12 = mongoDBRiverDefinition9.getSECONDARY_READ_PREFERENCE_FIELD();
        java.lang.String str13 = mongoDBRiverDefinition9.script;
        java.util.List<com.mongodb.ServerAddress> serverAddressList14 = mongoDBRiverDefinition9.getMongoServers();
        java.lang.String str15 = mongoDBRiverDefinition9.getTYPE_FIELD();
        java.lang.String str16 = mongoDBRiverDefinition9.mongoAdminPassword;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "secondary_read_preference" + "'", str12, "secondary_read_preference");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(serverAddressList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "type" + "'", str15, "type");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.script("script");
        com.mongodb.BasicDBObject basicDBObject3 = builder2.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.typeName("connect_timeout");
        boolean boolean6 = builder2.mongoGridFS;
        boolean boolean7 = builder2.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = builder2.build();
        builder2.setstatisticsIndexName("password");
        builder2.mongoAdminPassword = "";
        builder2.mongoCollection = "concurrent_requests";
        builder2.importAllCollections = true;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(basicDBObject3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition8);
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getIndexName();
        java.lang.String str12 = mongoDBRiverDefinition9.getSECONDARY_READ_PREFERENCE_FIELD();
        java.lang.String str13 = mongoDBRiverDefinition9.script;
        java.lang.String str14 = mongoDBRiverDefinition9.getGRIDFS_FIELD();
        java.lang.String str15 = mongoDBRiverDefinition9.mongoCollection;
        java.util.List<com.mongodb.ServerAddress> serverAddressList16 = mongoDBRiverDefinition9.getMongoServers();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "secondary_read_preference" + "'", str12, "secondary_read_preference");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "gridfs" + "'", str14, "gridfs");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "initial_timestamp" + "'", str15, "initial_timestamp");
        org.junit.Assert.assertNotNull(serverAddressList16);
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.script("script");
        com.mongodb.BasicDBObject basicDBObject3 = builder2.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.typeName("connect_timeout");
        boolean boolean6 = builder2.mongoGridFS;
        boolean boolean7 = builder2.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = builder2.build();
        builder2.setstatisticsIndexName("password");
        builder2.scriptType = "gridfs";
        builder2.connectTimeout = 0;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(basicDBObject3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition8);
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = builder0.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray6 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList7 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList7, serverAddressArray6);
        builder0.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList7);
        java.lang.String str10 = builder0.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.dropCollection(true);
        java.lang.String str13 = builder12.typeName;
        builder12.setmongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder16.setmongoSecondaryReadPreference(false);
        boolean boolean19 = builder16.getmongoSSLVerifyCertificate();
        java.lang.String str20 = builder16.getriverIndexName();
        builder16.setimportAllCollections(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder16.mongoUseSSL(true);
        builder16.setdisableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder16.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder29.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet32 = builder29.excludeFields;
        java.lang.String str33 = builder29.getmongoLocalPassword();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.script("script");
        java.lang.String[] strArray68 = new java.lang.String[] { "include_collection", "host", "hi!", "drop_collection", "size", "filter", "bulk_timeout", "drop_collection", "concurrent_bulk_requests", "servers", "localhost", "store_statistics", "script", "secondary_read_preference", "throttle_size", "parent_types", "db", "type", "admin", "filter", "servers", "user", "secondary_read_preference", "connect_timeout", "local", "host", "drop_collection", "user", "password", "ssl_verify_certificate", "password" };
        java.util.LinkedHashSet<java.lang.String> strSet69 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet69, strArray68);
        builder36.setparentTypes((java.util.Set<java.lang.String>) strSet69);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder72 = builder29.parentTypes((java.util.Set<java.lang.String>) strSet69);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder73 = builder28.parentTypes((java.util.Set<java.lang.String>) strSet69);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder74 = builder12.excludeFields((java.util.Set<java.lang.String>) strSet69);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder76 = builder12.mongoDb("type");
        java.lang.String str77 = builder76.mongoLocalPassword;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNotNull(serverAddressArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNull(strSet32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertNotNull(builder76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = builder0.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray6 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList7 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList7, serverAddressArray6);
        builder0.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList7);
        java.lang.String str10 = builder0.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.dropCollection(true);
        java.lang.String str13 = builder12.typeName;
        builder12.setscript("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder12.storeStatistics(false);
        int int18 = builder12.getthrottleSize();
        builder12.importAllCollections = false;
        boolean boolean21 = builder12.getmongoSecondaryReadPreference();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNotNull(serverAddressArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getCOLLECTION_FIELD();
        java.util.Set<java.lang.String> strSet12 = mongoDBRiverDefinition9.excludeFields;
        boolean boolean13 = mongoDBRiverDefinition9.getstoreStatistics();
        boolean boolean14 = mongoDBRiverDefinition9.getmongoGridFS();
        java.lang.String str15 = mongoDBRiverDefinition9.getSECONDARY_READ_PREFERENCE_FIELD();
        int int16 = mongoDBRiverDefinition9.socketTimeout;
        java.lang.String str17 = mongoDBRiverDefinition9.getMongoLocalPassword();
        java.lang.String str18 = mongoDBRiverDefinition9.getPASSWORD_FIELD();
        java.lang.String str19 = mongoDBRiverDefinition9.mongoAdminPassword;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "collection" + "'", str11, "collection");
        org.junit.Assert.assertNull(strSet12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "secondary_read_preference" + "'", str15, "secondary_read_preference");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "password" + "'", str18, "password");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getIndexName();
        java.lang.String str12 = mongoDBRiverDefinition9.getSECONDARY_READ_PREFERENCE_FIELD();
        java.lang.String str13 = mongoDBRiverDefinition9.script;
        java.util.List<com.mongodb.ServerAddress> serverAddressList14 = mongoDBRiverDefinition9.getMongoServers();
        java.lang.String str15 = mongoDBRiverDefinition9.getTYPE_FIELD();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = mongoDBRiverDefinition9.initialTimestamp;
        java.lang.String str17 = mongoDBRiverDefinition9.getSOCKET_TIMEOUT();
        boolean boolean18 = mongoDBRiverDefinition9.isImportAllCollections();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "secondary_read_preference" + "'", str12, "secondary_read_preference");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(serverAddressList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "type" + "'", str15, "type");
        org.junit.Assert.assertNull(wildcardTimestamp16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "socket_timeout" + "'", str17, "socket_timeout");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder1.script("script");
        com.mongodb.BasicDBObject basicDBObject4 = builder3.getmongoCollectionFilter();
        builder3.mongoUseSSL = false;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory7 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder8.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet11 = builder8.excludeFields;
        com.mongodb.BasicDBObject basicDBObject12 = builder8.getmongoCollectionFilter();
        java.lang.String str13 = builder8.mongoLocalUser;
        com.mongodb.ServerAddress[] serverAddressArray14 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList15 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList15, serverAddressArray14);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder8.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList15);
        com.mongodb.MongoClientOptions mongoClientOptions18 = builder8.getmongoClientOptions();
        builder8.riverName = "script_type";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder21.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet24 = builder21.excludeFields;
        com.mongodb.BasicDBObject basicDBObject25 = builder21.getmongoCollectionFilter();
        builder8.setmongoOplogFilter(basicDBObject25);
        org.elasticsearch.script.ExecutableScript executableScript27 = docScoreNativeScriptFactory7.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject25);
        builder3.mongoOplogFilter = basicDBObject25;
        org.elasticsearch.river.RiverSettings riverSettings29 = new org.elasticsearch.river.RiverSettings(settings0, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject25);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertNull(strSet11);
        org.junit.Assert.assertNotNull(basicDBObject12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(serverAddressArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNull(mongoClientOptions18);
        org.junit.Assert.assertNull(strSet24);
        org.junit.Assert.assertNotNull(basicDBObject25);
        org.junit.Assert.assertNotNull(executableScript27);
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getHOST_FIELD();
        java.lang.String str12 = mongoDBRiverDefinition9.getCONCURRENT_BULK_REQUESTS_FIELD();
        boolean boolean13 = mongoDBRiverDefinition9.getskipInitialImport();
        boolean boolean14 = mongoDBRiverDefinition9.isDisableIndexRefresh();
        boolean boolean15 = mongoDBRiverDefinition9.mongoSSLVerifyCertificate;
        java.lang.String str16 = mongoDBRiverDefinition9.mongoLocalUser;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "host" + "'", str11, "host");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "concurrent_bulk_requests" + "'", str12, "concurrent_bulk_requests");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = builder0.initialTimestamp;
        builder0.mongoDb = "initial_timestamp";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.mongoAdminPassword("hi!");
        boolean boolean10 = builder9.getmongoSecondaryReadPreference();
        com.mongodb.BasicDBObject basicDBObject11 = builder9.getmongoOplogFilter();
        builder9.mongoSecondaryReadPreference = false;
        java.lang.String str14 = builder9.getriverName();
        org.bson.types.Binary binary15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder9.initialTimestamp(binary15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(basicDBObject11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        java.lang.String str5 = builder0.mongoLocalUser;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.scriptType("include_collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.indexName("");
        builder0.mongoCollection = "bulk_size";
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.script("script");
        com.mongodb.BasicDBObject basicDBObject3 = builder2.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.typeName("connect_timeout");
        com.mongodb.BasicDBObject basicDBObject6 = builder2.getmongoOplogFilter();
        builder2.mongoUseSSL = false;
        java.lang.String str9 = builder2.getmongoLocalPassword();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(basicDBObject3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(basicDBObject6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        java.lang.String str5 = builder0.mongoLocalUser;
        builder0.setscript("drop_collection");
        boolean boolean8 = builder0.mongoUseSSL;
        java.lang.String str9 = builder0.getmongoAdminPassword();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getCOLLECTION_FIELD();
        java.util.Set<java.lang.String> strSet12 = mongoDBRiverDefinition9.excludeFields;
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = mongoDBRiverDefinition9.getInitialTimestamp();
        boolean boolean14 = mongoDBRiverDefinition9.isStoreStatistics();
        java.util.Set<java.lang.String> strSet15 = mongoDBRiverDefinition9.excludeFields;
        java.lang.String str16 = mongoDBRiverDefinition9.script;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "collection" + "'", str11, "collection");
        org.junit.Assert.assertNull(strSet12);
        org.junit.Assert.assertNull(wildcardTimestamp13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(strSet15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        java.lang.String str5 = builder0.mongoLocalUser;
        builder0.setscript("drop_collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.skipInitialImport(true);
        int int10 = builder0.getsocketTimeout();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str12 = mongoDBRiverDefinition11.getDISABLE_INDEX_REFRESH_FIELD();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "disable_index_refresh" + "'", str12, "disable_index_refresh");
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getIndexName();
        java.lang.String str12 = mongoDBRiverDefinition9.getSECONDARY_READ_PREFERENCE_FIELD();
        java.lang.String str13 = mongoDBRiverDefinition9.mongoAdminUser;
        boolean boolean14 = mongoDBRiverDefinition9.isImportAllCollections();
        boolean boolean15 = mongoDBRiverDefinition9.isImportAllCollections();
        java.lang.String str16 = mongoDBRiverDefinition9.getDB_FIELD();
        boolean boolean17 = mongoDBRiverDefinition9.isDisableIndexRefresh();
        java.lang.String str18 = mongoDBRiverDefinition9.getHOST_FIELD();
        java.lang.String str19 = mongoDBRiverDefinition9.getHOST_FIELD();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "secondary_read_preference" + "'", str12, "secondary_read_preference");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "db" + "'", str16, "db");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "host" + "'", str18, "host");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "host" + "'", str19, "host");
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.script("script");
        com.mongodb.BasicDBObject basicDBObject3 = builder2.getmongoCollectionFilter();
        builder2.setmongoLocalPassword("exclude_fields");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder2.connectTimeout((-1));
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.mongoGridFS(false);
        java.util.Set<java.lang.String> strSet10 = builder9.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder9.script("actions");
        java.lang.String str13 = builder9.riverIndexName;
        boolean boolean14 = builder9.getmongoSecondaryReadPreference();
        java.util.Set<java.lang.String> strSet15 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder9.excludeFields(strSet15);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(basicDBObject3);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(strSet10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = builder0.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray6 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList7 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList7, serverAddressArray6);
        builder0.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList7);
        java.lang.String str10 = builder0.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.dropCollection(true);
        java.lang.String str13 = builder12.typeName;
        builder12.setmongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder16.setmongoSecondaryReadPreference(false);
        boolean boolean19 = builder16.getmongoSSLVerifyCertificate();
        java.lang.String str20 = builder16.getriverIndexName();
        builder16.setimportAllCollections(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder16.mongoUseSSL(true);
        builder16.setdisableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder16.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder29.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet32 = builder29.excludeFields;
        java.lang.String str33 = builder29.getmongoLocalPassword();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.script("script");
        java.lang.String[] strArray68 = new java.lang.String[] { "include_collection", "host", "hi!", "drop_collection", "size", "filter", "bulk_timeout", "drop_collection", "concurrent_bulk_requests", "servers", "localhost", "store_statistics", "script", "secondary_read_preference", "throttle_size", "parent_types", "db", "type", "admin", "filter", "servers", "user", "secondary_read_preference", "connect_timeout", "local", "host", "drop_collection", "user", "password", "ssl_verify_certificate", "password" };
        java.util.LinkedHashSet<java.lang.String> strSet69 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet69, strArray68);
        builder36.setparentTypes((java.util.Set<java.lang.String>) strSet69);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder72 = builder29.parentTypes((java.util.Set<java.lang.String>) strSet69);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder73 = builder28.parentTypes((java.util.Set<java.lang.String>) strSet69);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder74 = builder12.excludeFields((java.util.Set<java.lang.String>) strSet69);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder76 = builder12.mongoDb("type");
        boolean boolean77 = builder12.getstoreStatistics();
        java.util.Set<java.lang.String> strSet78 = builder12.getparentTypes();
        builder12.setskipInitialImport(true);
        boolean boolean81 = builder12.advancedTransformation;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNotNull(serverAddressArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNull(strSet32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertNotNull(builder76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNull(strSet78);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder1.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet4 = builder1.excludeFields;
        com.mongodb.BasicDBObject basicDBObject5 = builder1.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = builder1.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray7 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList8 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList8, serverAddressArray7);
        builder1.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList8);
        builder0.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder12.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet15 = builder12.excludeFields;
        com.mongodb.BasicDBObject basicDBObject16 = builder12.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp17 = builder12.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray18 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList19 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList19, serverAddressArray18);
        builder12.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList19);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder0.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList19);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder0.indexName("");
        int int25 = builder24.getthrottleSize();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp26 = builder24.getinitialTimestamp();
        builder24.socketTimeout = (byte) 1;
        java.lang.String str29 = builder24.scriptType;
        java.util.List<com.mongodb.ServerAddress> serverAddressList30 = builder24.mongoServers;
        boolean boolean31 = builder24.mongoUseSSL;
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertNotNull(basicDBObject5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNotNull(serverAddressArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strSet15);
        org.junit.Assert.assertNotNull(basicDBObject16);
        org.junit.Assert.assertNull(wildcardTimestamp17);
        org.junit.Assert.assertNotNull(serverAddressArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(wildcardTimestamp26);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(serverAddressList30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        boolean boolean11 = mongoDBRiverDefinition9.mongoGridFS;
        boolean boolean12 = mongoDBRiverDefinition9.advancedTransformation;
        java.lang.String str13 = mongoDBRiverDefinition9.getADMIN_DB_FIELD();
        boolean boolean14 = mongoDBRiverDefinition9.getdisableIndexRefresh();
        java.lang.String str15 = mongoDBRiverDefinition9.getCONCURRENT_REQUESTS_FIELD();
        java.lang.String str16 = mongoDBRiverDefinition9.mongoCollection;
        java.lang.String str17 = mongoDBRiverDefinition9.getADVANCED_TRANSFORMATION_FIELD();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "concurrent_requests" + "'", str15, "concurrent_requests");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "initial_timestamp" + "'", str16, "initial_timestamp");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "advanced_transformation" + "'", str17, "advanced_transformation");
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder1.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet4 = builder1.excludeFields;
        com.mongodb.BasicDBObject basicDBObject5 = builder1.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = builder1.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray7 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList8 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList8, serverAddressArray7);
        builder1.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList8);
        builder0.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder12.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet15 = builder12.excludeFields;
        com.mongodb.BasicDBObject basicDBObject16 = builder12.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp17 = builder12.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray18 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList19 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList19, serverAddressArray18);
        builder12.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList19);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder0.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList19);
        com.mongodb.MongoClientOptions mongoClientOptions23 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder22.mongoClientOptions(mongoClientOptions23);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder25.script("script");
        java.lang.String[] strArray59 = new java.lang.String[] { "include_collection", "host", "hi!", "drop_collection", "size", "filter", "bulk_timeout", "drop_collection", "concurrent_bulk_requests", "servers", "localhost", "store_statistics", "script", "secondary_read_preference", "throttle_size", "parent_types", "db", "type", "admin", "filter", "servers", "user", "secondary_read_preference", "connect_timeout", "local", "host", "drop_collection", "user", "password", "ssl_verify_certificate", "password" };
        java.util.LinkedHashSet<java.lang.String> strSet60 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet60, strArray59);
        builder27.setparentTypes((java.util.Set<java.lang.String>) strSet60);
        builder22.setparentTypes((java.util.Set<java.lang.String>) strSet60);
        builder22.riverName = "null.initial_timestamp";
        java.lang.String str66 = builder22.script;
        builder22.statisticsIndexName = "ssl";
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertNotNull(basicDBObject5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNotNull(serverAddressArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strSet15);
        org.junit.Assert.assertNotNull(basicDBObject16);
        org.junit.Assert.assertNull(wildcardTimestamp17);
        org.junit.Assert.assertNotNull(serverAddressArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNull(str66);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        org.elasticsearch.common.settings.Settings settings2 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        org.elasticsearch.river.RiverSettings riverSettings4 = new org.elasticsearch.river.RiverSettings(settings2, strMap3);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = riverSettings4.settings();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = riverSettings4.settings();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = riverSettings4.settings();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = riverSettings4.settings();
        org.elasticsearch.script.ScriptService scriptService9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition10 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("null.initial_timestamp", "parent_types", riverSettings4, scriptService9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap7);
        org.junit.Assert.assertNull(strMap8);
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("", "bulk_size");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?bulk_size?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder1.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet4 = builder1.excludeFields;
        com.mongodb.BasicDBObject basicDBObject5 = builder1.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = builder1.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray7 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList8 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList8, serverAddressArray7);
        builder1.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList8);
        builder0.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder12.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet15 = builder12.excludeFields;
        com.mongodb.BasicDBObject basicDBObject16 = builder12.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp17 = builder12.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray18 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList19 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList19, serverAddressArray18);
        builder12.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList19);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder0.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList19);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder0.indexName("");
        builder24.setskipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.script("script");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder30.script("script");
        java.lang.String[] strArray64 = new java.lang.String[] { "include_collection", "host", "hi!", "drop_collection", "size", "filter", "bulk_timeout", "drop_collection", "concurrent_bulk_requests", "servers", "localhost", "store_statistics", "script", "secondary_read_preference", "throttle_size", "parent_types", "db", "type", "admin", "filter", "servers", "user", "secondary_read_preference", "connect_timeout", "local", "host", "drop_collection", "user", "password", "ssl_verify_certificate", "password" };
        java.util.LinkedHashSet<java.lang.String> strSet65 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet65, strArray64);
        builder32.setparentTypes((java.util.Set<java.lang.String>) strSet65);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder68 = builder27.excludeFields((java.util.Set<java.lang.String>) strSet65);
        builder24.setparentTypes((java.util.Set<java.lang.String>) strSet65);
        int int70 = builder24.getsocketTimeout();
        java.lang.String str71 = builder24.getriverName();
        builder24.mongoSSLVerifyCertificate = false;
        builder24.setmongoLocalUser("");
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertNotNull(basicDBObject5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNotNull(serverAddressArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strSet15);
        org.junit.Assert.assertNotNull(basicDBObject16);
        org.junit.Assert.assertNull(wildcardTimestamp17);
        org.junit.Assert.assertNotNull(serverAddressArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(builder68);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNull(str71);
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 'a');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder3.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet6 = builder3.excludeFields;
        builder3.setmongoCollection("initial_timestamp");
        boolean boolean9 = builder3.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder3.skipInitialImport(false);
        builder3.disableIndexRefresh = true;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder3.socketTimeout((int) (short) 1);
        builder3.includeCollection = "gridfs";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder3.importAllCollections(false);
        java.util.Set<java.lang.String> strSet20 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.includeFields(strSet20);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder22.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet25 = builder22.excludeFields;
        builder22.setmongoCollection("initial_timestamp");
        boolean boolean28 = builder22.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder22.skipInitialImport(false);
        java.lang.String str31 = builder30.typeName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder32.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet35 = builder32.excludeFields;
        com.mongodb.BasicDBObject basicDBObject36 = builder32.getmongoCollectionFilter();
        java.lang.String str37 = builder32.mongoLocalUser;
        com.mongodb.ServerAddress[] serverAddressArray38 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList39 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList39, serverAddressArray38);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder32.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList39);
        boolean boolean42 = builder41.dropCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder43.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet46 = builder43.excludeFields;
        com.mongodb.BasicDBObject basicDBObject47 = builder43.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp48 = builder43.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray49 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList50 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList50, serverAddressArray49);
        builder43.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList50);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder41.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList50);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder54.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet57 = builder54.excludeFields;
        com.mongodb.BasicDBObject basicDBObject58 = builder54.getmongoCollectionFilter();
        java.lang.String str59 = builder54.mongoLocalUser;
        com.mongodb.ServerAddress[] serverAddressArray60 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList61 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList61, serverAddressArray60);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = builder54.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList61);
        java.lang.String str64 = builder54.mongoAdminPassword;
        java.lang.String[] strArray69 = new java.lang.String[] { "admin", "script_type", "credentials", "password" };
        java.util.LinkedHashSet<java.lang.String> strSet70 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet70, strArray69);
        builder54.setincludeFields((java.util.Set<java.lang.String>) strSet70);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder73 = builder41.excludeFields((java.util.Set<java.lang.String>) strSet70);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder74 = builder30.parentTypes((java.util.Set<java.lang.String>) strSet70);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder75 = builder21.excludeFields((java.util.Set<java.lang.String>) strSet70);
        java.lang.Object obj76 = docScoreSearchScript0.unwrap((java.lang.Object) builder21);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder77 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder77.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet80 = builder77.excludeFields;
        builder77.setmongoCollection("initial_timestamp");
        boolean boolean83 = builder77.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder85 = builder77.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition86 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder85);
        java.lang.String str87 = mongoDBRiverDefinition86.includeCollection;
        boolean boolean88 = mongoDBRiverDefinition86.mongoGridFS;
        boolean boolean89 = mongoDBRiverDefinition86.advancedTransformation;
        java.lang.String str90 = mongoDBRiverDefinition86.getADMIN_DB_FIELD();
        boolean boolean91 = mongoDBRiverDefinition86.getdisableIndexRefresh();
        boolean boolean92 = mongoDBRiverDefinition86.isMongoSecondaryReadPreference();
        java.lang.Object obj93 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition86);
        java.lang.String str94 = mongoDBRiverDefinition86.includeCollection;
        java.lang.String str95 = mongoDBRiverDefinition86.getSTORE_STATISTICS_FIELD();
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNull(strSet25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(strSet35);
        org.junit.Assert.assertNotNull(basicDBObject36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(serverAddressArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(strSet46);
        org.junit.Assert.assertNotNull(basicDBObject47);
        org.junit.Assert.assertNull(wildcardTimestamp48);
        org.junit.Assert.assertNotNull(serverAddressArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNull(strSet57);
        org.junit.Assert.assertNotNull(basicDBObject58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(serverAddressArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertNotNull(builder75);
        org.junit.Assert.assertNotNull(obj76);
        org.junit.Assert.assertNull(strSet80);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(builder85);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "admin" + "'", str90, "admin");
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(obj93);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "" + "'", str94, "");
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "store_statistics" + "'", str95, "store_statistics");
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        java.lang.String str9 = builder8.typeName;
        builder8.mongoAdminUser = "null.initial_timestamp";
        builder8.setmongoLocalPassword("options");
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("store_statistics", "ssl", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?ssl?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getIndexName();
        java.lang.String str12 = mongoDBRiverDefinition9.getSECONDARY_READ_PREFERENCE_FIELD();
        java.lang.String str13 = mongoDBRiverDefinition9.mongoAdminUser;
        java.util.Set<java.lang.String> strSet14 = mongoDBRiverDefinition9.parentTypes;
        com.mongodb.BasicDBObject basicDBObject15 = mongoDBRiverDefinition9.mongoOplogFilter;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "secondary_read_preference" + "'", str12, "secondary_read_preference");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(strSet14);
        org.junit.Assert.assertNull(basicDBObject15);
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder1.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet4 = builder1.excludeFields;
        com.mongodb.BasicDBObject basicDBObject5 = builder1.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = builder1.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray7 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList8 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList8, serverAddressArray7);
        builder1.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList8);
        builder0.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder12.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet15 = builder12.excludeFields;
        com.mongodb.BasicDBObject basicDBObject16 = builder12.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp17 = builder12.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray18 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList19 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList19, serverAddressArray18);
        builder12.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList19);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder0.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList19);
        com.mongodb.MongoClientOptions mongoClientOptions23 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder22.mongoClientOptions(mongoClientOptions23);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder25.script("script");
        java.lang.String[] strArray59 = new java.lang.String[] { "include_collection", "host", "hi!", "drop_collection", "size", "filter", "bulk_timeout", "drop_collection", "concurrent_bulk_requests", "servers", "localhost", "store_statistics", "script", "secondary_read_preference", "throttle_size", "parent_types", "db", "type", "admin", "filter", "servers", "user", "secondary_read_preference", "connect_timeout", "local", "host", "drop_collection", "user", "password", "ssl_verify_certificate", "password" };
        java.util.LinkedHashSet<java.lang.String> strSet60 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet60, strArray59);
        builder27.setparentTypes((java.util.Set<java.lang.String>) strSet60);
        builder22.setparentTypes((java.util.Set<java.lang.String>) strSet60);
        builder22.riverName = "null.initial_timestamp";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder66 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder67 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder67.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet70 = builder67.excludeFields;
        com.mongodb.BasicDBObject basicDBObject71 = builder67.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp72 = builder67.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray73 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList74 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList74, serverAddressArray73);
        builder67.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList74);
        builder66.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList74);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder78 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder78.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet81 = builder78.excludeFields;
        com.mongodb.BasicDBObject basicDBObject82 = builder78.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp83 = builder78.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray84 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList85 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList85, serverAddressArray84);
        builder78.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList85);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder88 = builder66.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList85);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder90 = builder66.indexName("");
        int int91 = builder90.getthrottleSize();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp92 = builder90.getinitialTimestamp();
        builder90.socketTimeout = (byte) 1;
        java.lang.String str95 = builder90.scriptType;
        java.util.List<com.mongodb.ServerAddress> serverAddressList96 = builder90.mongoServers;
        builder22.setmongoServers(serverAddressList96);
        java.lang.String str98 = builder22.getstatisticsIndexName();
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertNotNull(basicDBObject5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNotNull(serverAddressArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strSet15);
        org.junit.Assert.assertNotNull(basicDBObject16);
        org.junit.Assert.assertNull(wildcardTimestamp17);
        org.junit.Assert.assertNotNull(serverAddressArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNull(strSet70);
        org.junit.Assert.assertNotNull(basicDBObject71);
        org.junit.Assert.assertNull(wildcardTimestamp72);
        org.junit.Assert.assertNotNull(serverAddressArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNull(strSet81);
        org.junit.Assert.assertNotNull(basicDBObject82);
        org.junit.Assert.assertNull(wildcardTimestamp83);
        org.junit.Assert.assertNotNull(serverAddressArray84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(builder88);
        org.junit.Assert.assertNotNull(builder90);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertNull(wildcardTimestamp92);
        org.junit.Assert.assertNull(str95);
        org.junit.Assert.assertNotNull(serverAddressList96);
        org.junit.Assert.assertNull(str98);
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getTypeName();
        com.mongodb.BasicDBObject basicDBObject12 = mongoDBRiverDefinition9.getMongoCollectionFilter();
        boolean boolean13 = mongoDBRiverDefinition9.isMongoSSLVerifyCertificate();
        java.lang.String str14 = mongoDBRiverDefinition9.getDISABLE_INDEX_REFRESH_FIELD();
        java.util.Set<java.lang.String> strSet15 = mongoDBRiverDefinition9.getExcludeFields();
        boolean boolean16 = mongoDBRiverDefinition9.getdisableIndexRefresh();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(basicDBObject12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "disable_index_refresh" + "'", str14, "disable_index_refresh");
        org.junit.Assert.assertNull(strSet15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory0 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder1.script("script");
        com.mongodb.BasicDBObject basicDBObject4 = builder3.getmongoCollectionFilter();
        builder3.mongoUseSSL = false;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory7 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder8.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet11 = builder8.excludeFields;
        com.mongodb.BasicDBObject basicDBObject12 = builder8.getmongoCollectionFilter();
        java.lang.String str13 = builder8.mongoLocalUser;
        com.mongodb.ServerAddress[] serverAddressArray14 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList15 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList15, serverAddressArray14);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder8.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList15);
        com.mongodb.MongoClientOptions mongoClientOptions18 = builder8.getmongoClientOptions();
        builder8.riverName = "script_type";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder21.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet24 = builder21.excludeFields;
        com.mongodb.BasicDBObject basicDBObject25 = builder21.getmongoCollectionFilter();
        builder8.setmongoOplogFilter(basicDBObject25);
        org.elasticsearch.script.ExecutableScript executableScript27 = docScoreNativeScriptFactory7.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject25);
        builder3.mongoOplogFilter = basicDBObject25;
        org.elasticsearch.script.ExecutableScript executableScript29 = docScoreNativeScriptFactory0.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject25);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder30.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet33 = builder30.excludeFields;
        com.mongodb.BasicDBObject basicDBObject34 = builder30.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp35 = builder30.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray36 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList37 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList37, serverAddressArray36);
        builder30.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList37);
        java.lang.String str40 = builder30.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder30.dropCollection(true);
        boolean boolean43 = builder42.mongoSSLVerifyCertificate;
        java.lang.String str44 = builder42.typeName;
        builder42.mongoGridFS = true;
        builder42.mongoLocalPassword = "skip_initial_import";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder49.script("script");
        int int52 = builder51.throttleSize;
        java.util.List<com.mongodb.ServerAddress> serverAddressList53 = builder51.mongoServers;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder54.setmongoSecondaryReadPreference(false);
        boolean boolean57 = builder54.getmongoSSLVerifyCertificate();
        java.lang.String str58 = builder54.getriverIndexName();
        builder54.setimportAllCollections(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = builder54.mongoUseSSL(true);
        builder54.setdisableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder66 = builder54.script("bulk");
        com.mongodb.BasicDBObject basicDBObject67 = builder54.mongoCollectionFilter;
        builder51.setmongoOplogFilter(basicDBObject67);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder69 = builder42.mongoCollectionFilter(basicDBObject67);
        org.elasticsearch.script.ExecutableScript executableScript70 = docScoreNativeScriptFactory0.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject67);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory71 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        java.util.Map<java.lang.String, java.lang.Object> strMap72 = null;
        org.elasticsearch.script.ExecutableScript executableScript73 = docScoreNativeScriptFactory71.newScript(strMap72);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder74 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder74.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet77 = builder74.excludeFields;
        com.mongodb.BasicDBObject basicDBObject78 = builder74.getmongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript79 = docScoreNativeScriptFactory71.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject78);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder80 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder80.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet83 = builder80.excludeFields;
        builder80.setmongoCollection("initial_timestamp");
        boolean boolean86 = builder80.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder88 = builder80.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition89 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder88);
        java.lang.String str90 = mongoDBRiverDefinition89.includeCollection;
        java.lang.String str91 = mongoDBRiverDefinition89.getCOLLECTION_FIELD();
        java.util.Set<java.lang.String> strSet92 = mongoDBRiverDefinition89.excludeFields;
        boolean boolean93 = mongoDBRiverDefinition89.getstoreStatistics();
        boolean boolean94 = mongoDBRiverDefinition89.getmongoGridFS();
        java.lang.String str95 = mongoDBRiverDefinition89.getSECONDARY_READ_PREFERENCE_FIELD();
        int int96 = mongoDBRiverDefinition89.socketTimeout;
        com.mongodb.BasicDBObject basicDBObject97 = mongoDBRiverDefinition89.mongoCollectionFilter;
        org.elasticsearch.script.ExecutableScript executableScript98 = docScoreNativeScriptFactory71.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject97);
        org.elasticsearch.script.ExecutableScript executableScript99 = docScoreNativeScriptFactory0.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject97);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertNull(strSet11);
        org.junit.Assert.assertNotNull(basicDBObject12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(serverAddressArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNull(mongoClientOptions18);
        org.junit.Assert.assertNull(strSet24);
        org.junit.Assert.assertNotNull(basicDBObject25);
        org.junit.Assert.assertNotNull(executableScript27);
        org.junit.Assert.assertNotNull(executableScript29);
        org.junit.Assert.assertNull(strSet33);
        org.junit.Assert.assertNotNull(basicDBObject34);
        org.junit.Assert.assertNull(wildcardTimestamp35);
        org.junit.Assert.assertNotNull(serverAddressArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(serverAddressList53);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(basicDBObject67);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(executableScript70);
        org.junit.Assert.assertNotNull(executableScript73);
        org.junit.Assert.assertNull(strSet77);
        org.junit.Assert.assertNotNull(basicDBObject78);
        org.junit.Assert.assertNotNull(executableScript79);
        org.junit.Assert.assertNull(strSet83);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(builder88);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "collection" + "'", str91, "collection");
        org.junit.Assert.assertNull(strSet92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "secondary_read_preference" + "'", str95, "secondary_read_preference");
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 0 + "'", int96 == 0);
        org.junit.Assert.assertNotNull(basicDBObject97);
        org.junit.Assert.assertNotNull(executableScript98);
        org.junit.Assert.assertNotNull(executableScript99);
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        java.lang.String str5 = builder0.mongoLocalUser;
        builder0.setscript("drop_collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.skipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.socketTimeout((int) (short) -1);
        boolean boolean12 = builder11.storeStatistics;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = builder0.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray6 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList7 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList7, serverAddressArray6);
        builder0.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList7);
        java.lang.String str10 = builder0.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.dropCollection(true);
        builder12.setriverIndexName("flush_interval");
        int int15 = builder12.socketTimeout;
        builder12.setstatisticsIndexName("");
        java.lang.String str18 = builder12.mongoLocalPassword;
        java.lang.String str19 = builder12.indexName;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNotNull(serverAddressArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoSSLVerifyCertificate(true);
        java.util.List<com.mongodb.ServerAddress> serverAddressList6 = builder0.getmongoServers();
        int int7 = builder0.getsocketTimeout();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.mongoGridFS(false);
        java.lang.String str10 = builder0.riverIndexName;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(serverAddressList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("local", "name");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?name? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = builder0.initialTimestamp;
        builder0.mongoDb = "initial_timestamp";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.mongoAdminPassword("hi!");
        builder0.setsocketTimeout((int) (short) 1);
        builder0.typeName = "disable_index_refresh";
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        builder0.setmongoAdminPassword("store_statistics");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.scriptType("bulk_size");
        java.lang.String str13 = builder12.getincludeCollection();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = builder0.initialTimestamp;
        builder0.mongoCollection = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.mongoAdminUser("socket_timeout");
        boolean boolean10 = builder0.getmongoUseSSL();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        docScoreSearchScript0.setNextScore((float) 10L);
        java.lang.Object obj5 = null;
        java.lang.Object obj6 = docScoreSearchScript0.unwrap(obj5);
        org.apache.lucene.search.Scorer scorer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setScorer(scorer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + true + "'", obj2, true);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.script("script");
        com.mongodb.BasicDBObject basicDBObject3 = builder2.getmongoCollectionFilter();
        builder2.throttleSize = 0;
        int int6 = builder2.socketTimeout;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(basicDBObject3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getIndexName();
        java.lang.String str12 = mongoDBRiverDefinition9.getSECONDARY_READ_PREFERENCE_FIELD();
        boolean boolean13 = mongoDBRiverDefinition9.isImportAllCollections();
        java.lang.String str14 = mongoDBRiverDefinition9.getPARENT_TYPES_FIELD();
        java.lang.String str15 = mongoDBRiverDefinition9.getNAME_FIELD();
        java.util.Set<java.lang.String> strSet16 = mongoDBRiverDefinition9.getExcludeFields();
        java.lang.String str17 = mongoDBRiverDefinition9.mongoLocalPassword;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "secondary_read_preference" + "'", str12, "secondary_read_preference");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "parent_types" + "'", str14, "parent_types");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "name" + "'", str15, "name");
        org.junit.Assert.assertNull(strSet16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        org.elasticsearch.common.settings.Settings settings2 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        org.elasticsearch.river.RiverSettings riverSettings4 = new org.elasticsearch.river.RiverSettings(settings2, strMap3);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = riverSettings4.settings();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = riverSettings4.settings();
        org.elasticsearch.script.ScriptService scriptService7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("store_statistics", "null.initial_timestamp", riverSettings4, scriptService7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.script("script");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder3.script("script");
        java.lang.String[] strArray37 = new java.lang.String[] { "include_collection", "host", "hi!", "drop_collection", "size", "filter", "bulk_timeout", "drop_collection", "concurrent_bulk_requests", "servers", "localhost", "store_statistics", "script", "secondary_read_preference", "throttle_size", "parent_types", "db", "type", "admin", "filter", "servers", "user", "secondary_read_preference", "connect_timeout", "local", "host", "drop_collection", "user", "password", "ssl_verify_certificate", "password" };
        java.util.LinkedHashSet<java.lang.String> strSet38 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet38, strArray37);
        builder5.setparentTypes((java.util.Set<java.lang.String>) strSet38);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder0.excludeFields((java.util.Set<java.lang.String>) strSet38);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder42.script("script");
        com.mongodb.BasicDBObject basicDBObject45 = builder44.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder0.mongoOplogFilter(basicDBObject45);
        int int47 = builder46.getconnectTimeout();
        boolean boolean48 = builder46.disableIndexRefresh;
        boolean boolean49 = builder46.getmongoGridFS();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(basicDBObject45);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getCOLLECTION_FIELD();
        java.util.Set<java.lang.String> strSet12 = mongoDBRiverDefinition9.excludeFields;
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = mongoDBRiverDefinition9.getInitialTimestamp();
        java.lang.String str14 = mongoDBRiverDefinition9.getSCRIPT_TYPE_FIELD();
        boolean boolean15 = mongoDBRiverDefinition9.advancedTransformation;
        java.lang.String str16 = mongoDBRiverDefinition9.getADMIN_DB_FIELD();
        java.lang.String str17 = mongoDBRiverDefinition9.getINCLUDE_COLLECTION_FIELD();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "collection" + "'", str11, "collection");
        org.junit.Assert.assertNull(strSet12);
        org.junit.Assert.assertNull(wildcardTimestamp13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "script_type" + "'", str14, "script_type");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "include_collection" + "'", str17, "include_collection");
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        java.lang.String str5 = builder0.mongoLocalUser;
        com.mongodb.ServerAddress[] serverAddressArray6 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList7 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList7, serverAddressArray6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList7);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder0.getmongoClientOptions();
        builder0.riverName = "script_type";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder13.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet16 = builder13.excludeFields;
        com.mongodb.BasicDBObject basicDBObject17 = builder13.getmongoCollectionFilter();
        builder0.setmongoOplogFilter(basicDBObject17);
        boolean boolean19 = builder0.mongoGridFS;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder0.mongoAdminPassword("user");
        builder21.scriptType = "include_collection";
        boolean boolean24 = builder21.storeStatistics;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(serverAddressArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(mongoClientOptions10);
        org.junit.Assert.assertNull(strSet16);
        org.junit.Assert.assertNotNull(basicDBObject17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getIndexName();
        java.lang.String str12 = mongoDBRiverDefinition9.getSECONDARY_READ_PREFERENCE_FIELD();
        boolean boolean13 = mongoDBRiverDefinition9.isImportAllCollections();
        boolean boolean14 = mongoDBRiverDefinition9.isMongoSSLVerifyCertificate();
        boolean boolean15 = mongoDBRiverDefinition9.getmongoSSLVerifyCertificate();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "secondary_read_preference" + "'", str12, "secondary_read_preference");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        builder0.disableIndexRefresh = true;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.importAllCollections(false);
        builder12.riverName = "throttle_size";
        builder12.setmongoAdminUser("localhost");
        builder12.setmongoCollection("db");
        boolean boolean19 = builder12.getdisableIndexRefresh();
        int int20 = builder12.getthrottleSize();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getIndexName();
        java.lang.String str12 = mongoDBRiverDefinition9.getSECONDARY_READ_PREFERENCE_FIELD();
        boolean boolean13 = mongoDBRiverDefinition9.isImportAllCollections();
        boolean boolean14 = mongoDBRiverDefinition9.isDisableIndexRefresh();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "secondary_read_preference" + "'", str12, "secondary_read_preference");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        java.lang.String str4 = builder0.getmongoLocalPassword();
        builder0.disableIndexRefresh = true;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.mongoAdminUser("");
        builder8.mongoCollection = "hi!";
        builder8.setmongoAdminPassword("options");
        java.lang.String str13 = builder8.getscript();
        java.util.Set<java.lang.String> strSet14 = null;
        builder8.setexcludeFields(strSet14);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.script("script");
        java.lang.String[] strArray34 = new java.lang.String[] { "include_collection", "host", "hi!", "drop_collection", "size", "filter", "bulk_timeout", "drop_collection", "concurrent_bulk_requests", "servers", "localhost", "store_statistics", "script", "secondary_read_preference", "throttle_size", "parent_types", "db", "type", "admin", "filter", "servers", "user", "secondary_read_preference", "connect_timeout", "local", "host", "drop_collection", "user", "password", "ssl_verify_certificate", "password" };
        java.util.LinkedHashSet<java.lang.String> strSet35 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet35, strArray34);
        builder2.setparentTypes((java.util.Set<java.lang.String>) strSet35);
        boolean boolean38 = builder2.getadvancedTransformation();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder2.scriptType("import_all_collections");
        java.lang.Class<?> wildcardClass41 = builder2.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getCOLLECTION_FIELD();
        int int12 = mongoDBRiverDefinition9.throttleSize;
        java.lang.String str13 = mongoDBRiverDefinition9.getRiverName();
        org.elasticsearch.common.unit.TimeValue timeValue14 = mongoDBRiverDefinition9.getDEFAULT_FLUSH_INTERVAL();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = mongoDBRiverDefinition9.getInitialTimestamp();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "collection" + "'", str11, "collection");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(timeValue14);
        org.junit.Assert.assertNull(wildcardTimestamp15);
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getIndexName();
        java.lang.String str12 = mongoDBRiverDefinition9.getSECONDARY_READ_PREFERENCE_FIELD();
        java.lang.String str13 = mongoDBRiverDefinition9.script;
        java.lang.String str14 = mongoDBRiverDefinition9.getGRIDFS_FIELD();
        boolean boolean15 = mongoDBRiverDefinition9.disableIndexRefresh;
        boolean boolean16 = mongoDBRiverDefinition9.getdropCollection();
        java.lang.String str17 = mongoDBRiverDefinition9.script;
        java.lang.String str18 = mongoDBRiverDefinition9.getPORT_FIELD();
        java.lang.String str19 = mongoDBRiverDefinition9.getRiverIndexName();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "secondary_read_preference" + "'", str12, "secondary_read_preference");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "gridfs" + "'", str14, "gridfs");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "port" + "'", str18, "port");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getIndexName();
        java.lang.String str12 = mongoDBRiverDefinition9.getSECONDARY_READ_PREFERENCE_FIELD();
        java.util.Set<java.lang.String> strSet13 = mongoDBRiverDefinition9.excludeFields;
        java.lang.String str14 = mongoDBRiverDefinition9.getOPTIONS_FIELD();
        java.lang.String str15 = mongoDBRiverDefinition9.mongoAdminUser;
        boolean boolean16 = mongoDBRiverDefinition9.getdropCollection();
        boolean boolean17 = mongoDBRiverDefinition9.isDropCollection();
        java.lang.String str18 = mongoDBRiverDefinition9.getDEFAULT_DB_HOST();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "secondary_read_preference" + "'", str12, "secondary_read_preference");
        org.junit.Assert.assertNull(strSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "options" + "'", str14, "options");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "localhost" + "'", str18, "localhost");
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder1.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet4 = builder1.excludeFields;
        com.mongodb.BasicDBObject basicDBObject5 = builder1.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = builder1.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray7 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList8 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList8, serverAddressArray7);
        builder1.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList8);
        builder0.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder12.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet15 = builder12.excludeFields;
        com.mongodb.BasicDBObject basicDBObject16 = builder12.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp17 = builder12.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray18 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList19 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList19, serverAddressArray18);
        builder12.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList19);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder0.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList19);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder0.indexName("");
        int int25 = builder24.getthrottleSize();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp26 = builder24.getinitialTimestamp();
        builder24.socketTimeout = (byte) 1;
        java.lang.String str29 = builder24.scriptType;
        java.util.List<com.mongodb.ServerAddress> serverAddressList30 = builder24.mongoServers;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder24.statisticsIndexName("connect_timeout");
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertNotNull(basicDBObject5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNotNull(serverAddressArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strSet15);
        org.junit.Assert.assertNotNull(basicDBObject16);
        org.junit.Assert.assertNull(wildcardTimestamp17);
        org.junit.Assert.assertNotNull(serverAddressArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(wildcardTimestamp26);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(serverAddressList30);
        org.junit.Assert.assertNotNull(builder32);
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = builder0.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray6 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList7 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList7, serverAddressArray6);
        builder0.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList7);
        java.lang.String str10 = builder0.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.dropCollection(true);
        boolean boolean13 = builder12.mongoSSLVerifyCertificate;
        java.lang.String str14 = builder12.typeName;
        builder12.mongoGridFS = true;
        builder12.mongoSSLVerifyCertificate = false;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNotNull(serverAddressArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.script("script");
        com.mongodb.BasicDBObject basicDBObject3 = builder2.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.typeName("connect_timeout");
        boolean boolean6 = builder2.mongoGridFS;
        boolean boolean7 = builder2.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = builder2.build();
        java.lang.String str9 = mongoDBRiverDefinition8.getADMIN_DB_FIELD();
        int int10 = mongoDBRiverDefinition8.getDEFAULT_DB_PORT();
        java.lang.String str11 = mongoDBRiverDefinition8.getMongoLocalUser();
        java.lang.String str12 = mongoDBRiverDefinition8.getRiverIndexName();
        java.lang.String str13 = mongoDBRiverDefinition8.getACTIONS_FIELD();
        int int14 = mongoDBRiverDefinition8.getConnectTimeout();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(basicDBObject3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "admin" + "'", str9, "admin");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 27017 + "'", int10 == 27017);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "actions" + "'", str13, "actions");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = builder0.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray6 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList7 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList7, serverAddressArray6);
        builder0.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList7);
        java.lang.String str10 = builder0.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.dropCollection(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder0.mongoCollection("script");
        java.lang.String str15 = builder0.getmongoCollection();
        java.lang.String str16 = builder0.getmongoLocalUser();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNotNull(serverAddressArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "script" + "'", str15, "script");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder4.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet7 = builder4.excludeFields;
        builder4.setmongoCollection("initial_timestamp");
        boolean boolean10 = builder4.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder4.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder12);
        java.lang.String str14 = mongoDBRiverDefinition13.includeCollection;
        java.lang.String str15 = mongoDBRiverDefinition13.getCOLLECTION_FIELD();
        boolean boolean16 = mongoDBRiverDefinition13.isImportAllCollections();
        boolean boolean17 = mongoDBRiverDefinition13.mongoGridFS;
        docScoreSearchScript0.setNextVar("collection", (java.lang.Object) mongoDBRiverDefinition13);
        java.lang.String str19 = mongoDBRiverDefinition13.getStatisticsTypeName();
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + true + "'", obj2, true);
        org.junit.Assert.assertNull(strSet7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "collection" + "'", str15, "collection");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getHOST_FIELD();
        java.lang.String str12 = mongoDBRiverDefinition9.getMongoLocalPassword();
        java.lang.String str13 = mongoDBRiverDefinition9.script;
        java.lang.String str14 = mongoDBRiverDefinition9.mongoAdminUser;
        int int15 = mongoDBRiverDefinition9.getDEFAULT_BULK_ACTIONS();
        boolean boolean16 = mongoDBRiverDefinition9.getmongoSSLVerifyCertificate();
        java.lang.String str17 = mongoDBRiverDefinition9.mongoLocalUser;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "host" + "'", str11, "host");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1000 + "'", int15 == 1000);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getCOLLECTION_FIELD();
        java.util.Set<java.lang.String> strSet12 = mongoDBRiverDefinition9.excludeFields;
        java.lang.String str13 = mongoDBRiverDefinition9.getOPTIONS_FIELD();
        java.lang.String str14 = mongoDBRiverDefinition9.getIndexName();
        int int15 = mongoDBRiverDefinition9.getDEFAULT_DB_PORT();
        java.lang.String str16 = mongoDBRiverDefinition9.getSSL_VERIFY_CERT_FIELD();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "collection" + "'", str11, "collection");
        org.junit.Assert.assertNull(strSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "options" + "'", str13, "options");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 27017 + "'", int15 == 27017);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ssl_verify_certificate" + "'", str16, "ssl_verify_certificate");
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getHOST_FIELD();
        java.lang.String str12 = mongoDBRiverDefinition9.getMongoLocalPassword();
        java.lang.String str13 = mongoDBRiverDefinition9.script;
        boolean boolean14 = mongoDBRiverDefinition9.isMongoUseSSL();
        java.lang.String str15 = mongoDBRiverDefinition9.getScriptType();
        java.lang.String str16 = mongoDBRiverDefinition9.getFLUSH_INTERVAL_FIELD();
        java.lang.String str17 = mongoDBRiverDefinition9.getACTIONS_FIELD();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "host" + "'", str11, "host");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "flush_interval" + "'", str16, "flush_interval");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "actions" + "'", str17, "actions");
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getIndexName();
        java.lang.String str12 = mongoDBRiverDefinition9.riverName;
        java.lang.String str13 = mongoDBRiverDefinition9.getScript();
        java.lang.String str14 = mongoDBRiverDefinition9.getBULK_SIZE_FIELD();
        java.lang.String str15 = mongoDBRiverDefinition9.mongoAdminUser;
        int int16 = mongoDBRiverDefinition9.throttleSize;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "bulk_size" + "'", str14, "bulk_size");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getIndexName();
        java.lang.String str12 = mongoDBRiverDefinition9.getSECONDARY_READ_PREFERENCE_FIELD();
        java.util.Set<java.lang.String> strSet13 = mongoDBRiverDefinition9.excludeFields;
        java.lang.String str14 = mongoDBRiverDefinition9.getOPTIONS_FIELD();
        java.lang.String str15 = mongoDBRiverDefinition9.mongoAdminUser;
        java.util.List<com.mongodb.ServerAddress> serverAddressList16 = mongoDBRiverDefinition9.mongoServers;
        boolean boolean17 = mongoDBRiverDefinition9.disableIndexRefresh;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "secondary_read_preference" + "'", str12, "secondary_read_preference");
        org.junit.Assert.assertNull(strSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "options" + "'", str14, "options");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(serverAddressList16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        org.elasticsearch.common.settings.Settings settings2 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        org.elasticsearch.river.RiverSettings riverSettings4 = new org.elasticsearch.river.RiverSettings(settings2, strMap3);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = riverSettings4.settings();
        org.elasticsearch.script.ScriptService scriptService6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("script_type", "name", riverSettings4, scriptService6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getHOST_FIELD();
        java.lang.String str12 = mongoDBRiverDefinition9.getMongoLocalPassword();
        java.lang.String str13 = mongoDBRiverDefinition9.scriptType;
        java.lang.String str14 = mongoDBRiverDefinition9.getBULK_SIZE_FIELD();
        java.lang.String str15 = mongoDBRiverDefinition9.typeName;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "host" + "'", str11, "host");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "bulk_size" + "'", str14, "bulk_size");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getHOST_FIELD();
        boolean boolean12 = mongoDBRiverDefinition9.isAdvancedTransformation();
        java.lang.String str13 = mongoDBRiverDefinition9.getINCLUDE_COLLECTION_FIELD();
        boolean boolean14 = mongoDBRiverDefinition9.getmongoSSLVerifyCertificate();
        java.lang.String str15 = mongoDBRiverDefinition9.getHOST_FIELD();
        boolean boolean16 = mongoDBRiverDefinition9.mongoSSLVerifyCertificate;
        java.lang.String str17 = mongoDBRiverDefinition9.getPASSWORD_FIELD();
        boolean boolean18 = mongoDBRiverDefinition9.isAdvancedTransformation();
        java.util.Set<java.lang.String> strSet19 = mongoDBRiverDefinition9.getIncludeFields();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "host" + "'", str11, "host");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "include_collection" + "'", str13, "include_collection");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "host" + "'", str15, "host");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "password" + "'", str17, "password");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(strSet19);
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        java.lang.String str5 = builder0.mongoLocalUser;
        builder0.setstatisticsTypeName("ssl");
        boolean boolean8 = builder0.dropCollection;
        java.util.Set<java.lang.String> strSet9 = builder0.includeFields;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(strSet9);
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        java.lang.String str5 = builder0.mongoLocalUser;
        com.mongodb.ServerAddress[] serverAddressArray6 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList7 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList7, serverAddressArray6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList7);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder0.getmongoClientOptions();
        builder0.mongoSecondaryReadPreference = false;
        java.lang.String str13 = builder0.statisticsIndexName;
        boolean boolean14 = builder0.mongoSSLVerifyCertificate;
        builder0.connectTimeout = 10;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(serverAddressArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(mongoClientOptions10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        java.lang.String str4 = builder0.getmongoLocalPassword();
        builder0.disableIndexRefresh = true;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.mongoAdminUser("");
        builder8.mongoCollection = "hi!";
        builder8.setmongoAdminPassword("options");
        java.lang.String str13 = builder8.getscript();
        builder8.script = "disable_index_refresh";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder8.mongoLocalPassword("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder8.typeName("advanced_transformation");
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoSSLVerifyCertificate(true);
        java.util.Set<java.lang.String> strSet6 = builder5.excludeFields;
        java.lang.String str7 = builder5.mongoAdminUser;
        com.mongodb.MongoClientOptions mongoClientOptions8 = builder5.mongoClientOptions;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder5.dropCollection(true);
        builder10.mongoGridFS = true;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(mongoClientOptions8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getHOST_FIELD();
        java.lang.String str12 = mongoDBRiverDefinition9.getUSER_FIELD();
        java.util.Set<java.lang.String> strSet13 = mongoDBRiverDefinition9.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions14 = mongoDBRiverDefinition9.mongoClientOptions;
        java.lang.String str15 = mongoDBRiverDefinition9.getTYPE_FIELD();
        boolean boolean16 = mongoDBRiverDefinition9.advancedTransformation;
        java.lang.String str17 = mongoDBRiverDefinition9.getIncludeCollection();
        java.lang.String str18 = mongoDBRiverDefinition9.getMongoAdminPassword();
        boolean boolean19 = mongoDBRiverDefinition9.getdropCollection();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "host" + "'", str11, "host");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "user" + "'", str12, "user");
        org.junit.Assert.assertNull(strSet13);
        org.junit.Assert.assertNull(mongoClientOptions14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "type" + "'", str15, "type");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder1.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet4 = builder1.excludeFields;
        com.mongodb.BasicDBObject basicDBObject5 = builder1.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = builder1.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray7 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList8 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList8, serverAddressArray7);
        builder1.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList8);
        builder0.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList8);
        builder0.mongoLocalUser = "credentials";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder0.mongoAdminUser("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.mongoSecondaryReadPreference(false);
        boolean boolean18 = builder15.advancedTransformation;
        com.mongodb.MongoClientOptions mongoClientOptions19 = null;
        builder15.mongoClientOptions = mongoClientOptions19;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder15.disableIndexRefresh(false);
        java.util.Set<java.lang.String> strSet23 = builder22.parentTypes;
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertNotNull(basicDBObject5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNotNull(serverAddressArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNull(strSet23);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getHOST_FIELD();
        java.lang.String str12 = mongoDBRiverDefinition9.getMongoLocalPassword();
        java.lang.String str13 = mongoDBRiverDefinition9.script;
        java.lang.String str14 = mongoDBRiverDefinition9.mongoAdminUser;
        java.lang.String str15 = mongoDBRiverDefinition9.getBULK_FIELD();
        boolean boolean16 = mongoDBRiverDefinition9.mongoGridFS;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "host" + "'", str11, "host");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "bulk" + "'", str15, "bulk");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.includeCollection("exclude_fields");
        builder4.mongoSecondaryReadPreference = false;
        java.lang.String str7 = builder4.includeCollection;
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "exclude_fields" + "'", str7, "exclude_fields");
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        builder0.disableIndexRefresh = true;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.socketTimeout((int) (short) 1);
        java.util.List<com.mongodb.ServerAddress> serverAddressList13 = builder0.mongoServers;
        builder0.connectTimeout = 0;
        java.util.Set<java.lang.String> strSet16 = builder0.parentTypes;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(serverAddressList13);
        org.junit.Assert.assertNull(strSet16);
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        builder0.setconnectTimeout(35);
        builder0.riverIndexName = "db";
        builder0.settypeName("secondary_read_preference");
        int int13 = builder0.getconnectTimeout();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = builder0.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray6 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList7 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList7, serverAddressArray6);
        builder0.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList7);
        builder0.setdisableIndexRefresh(true);
        java.lang.String str12 = builder0.getmongoCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder0.dropCollection(false);
        java.lang.String str15 = builder14.getindexName();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNotNull(serverAddressArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder1.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet4 = builder1.excludeFields;
        com.mongodb.BasicDBObject basicDBObject5 = builder1.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = builder1.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray7 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList8 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList8, serverAddressArray7);
        builder1.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList8);
        builder0.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder12.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet15 = builder12.excludeFields;
        com.mongodb.BasicDBObject basicDBObject16 = builder12.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp17 = builder12.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray18 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList19 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList19, serverAddressArray18);
        builder12.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList19);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder0.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList19);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder0.indexName("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder26.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet29 = builder26.excludeFields;
        com.mongodb.BasicDBObject basicDBObject30 = builder26.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp31 = builder26.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray32 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList33 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList33, serverAddressArray32);
        builder26.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList33);
        builder25.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList33);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder37.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet40 = builder37.excludeFields;
        com.mongodb.BasicDBObject basicDBObject41 = builder37.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp42 = builder37.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray43 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList44 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList44, serverAddressArray43);
        builder37.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList44);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder25.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList44);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder25.indexName("");
        int int50 = builder49.getthrottleSize();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp51 = builder49.getinitialTimestamp();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder52.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet55 = builder52.excludeFields;
        com.mongodb.BasicDBObject basicDBObject56 = builder52.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp57 = builder52.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray58 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList59 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList59, serverAddressArray58);
        builder52.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList59);
        java.lang.String str62 = builder52.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder64 = builder52.dropCollection(true);
        java.lang.String str65 = builder52.mongoCollection;
        java.lang.String str66 = builder52.includeCollection;
        boolean boolean67 = builder52.getstoreStatistics();
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory68 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        java.util.Map<java.lang.String, java.lang.Object> strMap69 = null;
        org.elasticsearch.script.ExecutableScript executableScript70 = docScoreNativeScriptFactory68.newScript(strMap69);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder71 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder71.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet74 = builder71.excludeFields;
        com.mongodb.BasicDBObject basicDBObject75 = builder71.getmongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript76 = docScoreNativeScriptFactory68.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject75);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder77 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder77.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet80 = builder77.excludeFields;
        builder77.setmongoCollection("initial_timestamp");
        boolean boolean83 = builder77.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder85 = builder77.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition86 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder85);
        java.lang.String str87 = mongoDBRiverDefinition86.includeCollection;
        java.lang.String str88 = mongoDBRiverDefinition86.getCOLLECTION_FIELD();
        java.util.Set<java.lang.String> strSet89 = mongoDBRiverDefinition86.excludeFields;
        boolean boolean90 = mongoDBRiverDefinition86.getstoreStatistics();
        boolean boolean91 = mongoDBRiverDefinition86.getmongoGridFS();
        java.lang.String str92 = mongoDBRiverDefinition86.getSECONDARY_READ_PREFERENCE_FIELD();
        int int93 = mongoDBRiverDefinition86.socketTimeout;
        com.mongodb.BasicDBObject basicDBObject94 = mongoDBRiverDefinition86.mongoCollectionFilter;
        org.elasticsearch.script.ExecutableScript executableScript95 = docScoreNativeScriptFactory68.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject94);
        builder52.setmongoCollectionFilter(basicDBObject94);
        builder49.mongoOplogFilter = basicDBObject94;
        builder0.mongoCollectionFilter = basicDBObject94;
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertNotNull(basicDBObject5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNotNull(serverAddressArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strSet15);
        org.junit.Assert.assertNotNull(basicDBObject16);
        org.junit.Assert.assertNull(wildcardTimestamp17);
        org.junit.Assert.assertNotNull(serverAddressArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNull(strSet29);
        org.junit.Assert.assertNotNull(basicDBObject30);
        org.junit.Assert.assertNull(wildcardTimestamp31);
        org.junit.Assert.assertNotNull(serverAddressArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(strSet40);
        org.junit.Assert.assertNotNull(basicDBObject41);
        org.junit.Assert.assertNull(wildcardTimestamp42);
        org.junit.Assert.assertNotNull(serverAddressArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNull(wildcardTimestamp51);
        org.junit.Assert.assertNull(strSet55);
        org.junit.Assert.assertNotNull(basicDBObject56);
        org.junit.Assert.assertNull(wildcardTimestamp57);
        org.junit.Assert.assertNotNull(serverAddressArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(executableScript70);
        org.junit.Assert.assertNull(strSet74);
        org.junit.Assert.assertNotNull(basicDBObject75);
        org.junit.Assert.assertNotNull(executableScript76);
        org.junit.Assert.assertNull(strSet80);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(builder85);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "collection" + "'", str88, "collection");
        org.junit.Assert.assertNull(strSet89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "secondary_read_preference" + "'", str92, "secondary_read_preference");
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 0 + "'", int93 == 0);
        org.junit.Assert.assertNotNull(basicDBObject94);
        org.junit.Assert.assertNotNull(executableScript95);
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoSSLVerifyCertificate(true);
        builder0.script = "import_all_collections";
        boolean boolean8 = builder0.getadvancedTransformation();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoAdminUser("bulk_size");
        builder0.setsocketTimeout(1000);
        builder0.setindexName("");
        int int15 = builder0.throttleSize;
        java.util.Set<java.lang.String> strSet16 = builder0.parentTypes;
        builder0.setstatisticsIndexName("host");
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(strSet16);
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder8.importAllCollections(false);
        java.lang.String str12 = builder8.mongoCollection;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "initial_timestamp" + "'", str12, "initial_timestamp");
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getIndexName();
        java.lang.String str12 = mongoDBRiverDefinition9.getSECONDARY_READ_PREFERENCE_FIELD();
        boolean boolean13 = mongoDBRiverDefinition9.isImportAllCollections();
        java.lang.String str14 = mongoDBRiverDefinition9.getPARENT_TYPES_FIELD();
        int int15 = mongoDBRiverDefinition9.getConnectTimeout();
        boolean boolean16 = mongoDBRiverDefinition9.importAllCollections;
        boolean boolean17 = mongoDBRiverDefinition9.getstoreStatistics();
        boolean boolean18 = mongoDBRiverDefinition9.mongoUseSSL;
        java.lang.String str19 = mongoDBRiverDefinition9.getFLUSH_INTERVAL_FIELD();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "secondary_read_preference" + "'", str12, "secondary_read_preference");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "parent_types" + "'", str14, "parent_types");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "flush_interval" + "'", str19, "flush_interval");
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.mongoSSLVerifyCertificate;
        java.lang.String str2 = builder0.mongoAdminUser;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getIndexName();
        java.lang.String str12 = mongoDBRiverDefinition9.getSECONDARY_READ_PREFERENCE_FIELD();
        java.util.Set<java.lang.String> strSet13 = mongoDBRiverDefinition9.excludeFields;
        java.lang.String str14 = mongoDBRiverDefinition9.getOPTIONS_FIELD();
        java.lang.String str15 = mongoDBRiverDefinition9.getINDEX_OBJECT();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "secondary_read_preference" + "'", str12, "secondary_read_preference");
        org.junit.Assert.assertNull(strSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "options" + "'", str14, "options");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "index" + "'", str15, "index");
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.script("script");
        com.mongodb.BasicDBObject basicDBObject3 = builder2.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.typeName("connect_timeout");
        boolean boolean6 = builder2.mongoGridFS;
        boolean boolean7 = builder2.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = builder2.build();
        builder2.setstatisticsIndexName("password");
        builder2.mongoAdminPassword = "";
        builder2.setthrottleSize((int) (short) 100);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(basicDBObject3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition8);
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        boolean boolean3 = builder0.getmongoSSLVerifyCertificate();
        java.lang.String str4 = builder0.getriverIndexName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.socketTimeout(100);
        int int7 = builder6.getthrottleSize();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder6.skipInitialImport(false);
        builder9.advancedTransformation = true;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder9.skipInitialImport(true);
        java.lang.String str14 = builder9.getstatisticsTypeName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        java.lang.String str5 = builder0.mongoLocalUser;
        com.mongodb.ServerAddress[] serverAddressArray6 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList7 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList7, serverAddressArray6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList7);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder0.getmongoClientOptions();
        builder0.riverName = "script_type";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder13.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet16 = builder13.excludeFields;
        com.mongodb.BasicDBObject basicDBObject17 = builder13.getmongoCollectionFilter();
        builder0.setmongoOplogFilter(basicDBObject17);
        boolean boolean19 = builder0.mongoGridFS;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder0.mongoAdminPassword("user");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder0.importAllCollections(false);
        java.util.Set<java.lang.String> strSet24 = builder0.includeFields;
        java.lang.String str25 = builder0.mongoCollection;
        java.lang.String str26 = builder0.mongoLocalPassword;
        java.lang.String str27 = builder0.getscript();
        java.lang.String str28 = builder0.mongoCollection;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(serverAddressArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(mongoClientOptions10);
        org.junit.Assert.assertNull(strSet16);
        org.junit.Assert.assertNotNull(basicDBObject17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNull(strSet24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getHOST_FIELD();
        boolean boolean12 = mongoDBRiverDefinition9.isAdvancedTransformation();
        java.lang.String str13 = mongoDBRiverDefinition9.getINCLUDE_COLLECTION_FIELD();
        boolean boolean14 = mongoDBRiverDefinition9.getmongoSSLVerifyCertificate();
        java.lang.String str15 = mongoDBRiverDefinition9.getSSL_CONNECTION_FIELD();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "host" + "'", str11, "host");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "include_collection" + "'", str13, "include_collection");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ssl" + "'", str15, "ssl");
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getCOLLECTION_FIELD();
        int int12 = mongoDBRiverDefinition9.throttleSize;
        java.lang.String str13 = mongoDBRiverDefinition9.getRiverName();
        java.lang.String str14 = mongoDBRiverDefinition9.getPARENT_TYPES_FIELD();
        java.lang.String str15 = mongoDBRiverDefinition9.getSERVERS_FIELD();
        java.lang.String str16 = mongoDBRiverDefinition9.mongoLocalUser;
        java.lang.Class<?> wildcardClass17 = mongoDBRiverDefinition9.getClass();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "collection" + "'", str11, "collection");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "parent_types" + "'", str14, "parent_types");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "servers" + "'", str15, "servers");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = builder0.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray6 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList7 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList7, serverAddressArray6);
        builder0.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList7);
        java.lang.String str10 = builder0.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.dropCollection(true);
        java.lang.String str13 = builder0.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder0.connectTimeout(1);
        java.util.Set<java.lang.String> strSet16 = builder15.excludeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder15.skipInitialImport(false);
        java.lang.String str19 = builder18.scriptType;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNotNull(serverAddressArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNull(strSet16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getHOST_FIELD();
        java.lang.String str12 = mongoDBRiverDefinition9.getMongoLocalPassword();
        java.lang.String str13 = mongoDBRiverDefinition9.script;
        java.lang.String str14 = mongoDBRiverDefinition9.mongoAdminUser;
        int int15 = mongoDBRiverDefinition9.getDEFAULT_BULK_ACTIONS();
        java.lang.String str16 = mongoDBRiverDefinition9.getBULK_FIELD();
        java.lang.String str17 = mongoDBRiverDefinition9.getDISABLE_INDEX_REFRESH_FIELD();
        java.lang.String str18 = mongoDBRiverDefinition9.getTYPE_FIELD();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "host" + "'", str11, "host");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1000 + "'", int15 == 1000);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "bulk" + "'", str16, "bulk");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "disable_index_refresh" + "'", str17, "disable_index_refresh");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "type" + "'", str18, "type");
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getSCRIPT_TYPE_FIELD();
        java.lang.String str12 = mongoDBRiverDefinition9.getOPTIONS_FIELD();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "script_type" + "'", str11, "script_type");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "options" + "'", str12, "options");
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = builder0.initialTimestamp;
        builder0.setstatisticsTypeName("ssl_verify_certificate");
        java.util.Set<java.lang.String> strSet8 = builder0.getexcludeFields();
        builder0.scriptType = "initial_timestamp";
        builder0.setscriptType("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder0.disableIndexRefresh(false);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNull(strSet8);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoSSLVerifyCertificate(true);
        boolean boolean6 = builder0.mongoSSLVerifyCertificate;
        java.lang.String str7 = builder0.scriptType;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.mongoSecondaryReadPreference(true);
        builder9.setincludeCollection("user");
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = builder0.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray6 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList7 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList7, serverAddressArray6);
        builder0.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList7);
        java.lang.String str10 = builder0.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.dropCollection(true);
        java.lang.String str13 = builder12.typeName;
        builder12.setmongoSecondaryReadPreference(false);
        boolean boolean16 = builder12.getmongoGridFS();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNotNull(serverAddressArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getHOST_FIELD();
        java.lang.String str12 = mongoDBRiverDefinition9.getUSER_FIELD();
        java.util.Set<java.lang.String> strSet13 = mongoDBRiverDefinition9.includeFields;
        boolean boolean14 = mongoDBRiverDefinition9.isSkipInitialImport();
        java.lang.String str15 = mongoDBRiverDefinition9.getMongoCollection();
        org.elasticsearch.common.unit.TimeValue timeValue16 = mongoDBRiverDefinition9.getDEFAULT_FLUSH_INTERVAL();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "host" + "'", str11, "host");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "user" + "'", str12, "user");
        org.junit.Assert.assertNull(strSet13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "initial_timestamp" + "'", str15, "initial_timestamp");
        org.junit.Assert.assertNotNull(timeValue16);
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getCOLLECTION_FIELD();
        java.util.Set<java.lang.String> strSet12 = mongoDBRiverDefinition9.excludeFields;
        boolean boolean13 = mongoDBRiverDefinition9.getstoreStatistics();
        boolean boolean14 = mongoDBRiverDefinition9.getmongoGridFS();
        java.lang.String str15 = mongoDBRiverDefinition9.getINITIAL_TIMESTAMP_SCRIPT_FIELD();
        java.lang.String str16 = mongoDBRiverDefinition9.getMongoDb();
        java.lang.String str17 = mongoDBRiverDefinition9.getTypeName();
        java.lang.String str18 = mongoDBRiverDefinition9.riverName;
        java.lang.String str19 = mongoDBRiverDefinition9.scriptType;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "collection" + "'", str11, "collection");
        org.junit.Assert.assertNull(strSet12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "script" + "'", str15, "script");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoSSLVerifyCertificate(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.typeName("secondary_read_preference");
        com.mongodb.MongoClientOptions mongoClientOptions8 = builder7.mongoClientOptions;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(mongoClientOptions8);
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        java.lang.String str5 = builder0.mongoLocalUser;
        builder0.setscript("drop_collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder8.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet11 = builder8.excludeFields;
        com.mongodb.BasicDBObject basicDBObject12 = builder8.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder0.mongoCollectionFilter(basicDBObject12);
        java.lang.String str14 = builder0.gettypeName();
        boolean boolean15 = builder0.storeStatistics;
        builder0.setriverName("user");
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(strSet11);
        org.junit.Assert.assertNotNull(basicDBObject12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = builder0.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray6 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList7 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList7, serverAddressArray6);
        builder0.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList7);
        java.lang.String str10 = builder0.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.dropCollection(true);
        java.lang.String str13 = builder0.mongoCollection;
        java.lang.String str14 = builder0.includeCollection;
        java.lang.String str15 = builder0.statisticsIndexName;
        boolean boolean16 = builder0.storeStatistics;
        int int17 = builder0.getthrottleSize();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertNull(wildcardTimestamp5);
        org.junit.Assert.assertNotNull(serverAddressArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("import_all_collections", "parent_types");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?parent_types?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        boolean boolean11 = mongoDBRiverDefinition9.mongoGridFS;
        boolean boolean12 = mongoDBRiverDefinition9.advancedTransformation;
        java.lang.String str13 = mongoDBRiverDefinition9.getADMIN_DB_FIELD();
        boolean boolean14 = mongoDBRiverDefinition9.skipInitialImport;
        java.lang.String str15 = mongoDBRiverDefinition9.getTHROTTLE_SIZE_FIELD();
        boolean boolean16 = mongoDBRiverDefinition9.getstoreStatistics();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "throttle_size" + "'", str15, "throttle_size");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getHOST_FIELD();
        java.lang.String str12 = mongoDBRiverDefinition9.getMongoLocalPassword();
        java.lang.String str13 = mongoDBRiverDefinition9.scriptType;
        org.elasticsearch.common.logging.ESLogger eSLogger14 = mongoDBRiverDefinition9.getlogger();
        java.lang.String str15 = mongoDBRiverDefinition9.script;
        java.util.List<com.mongodb.ServerAddress> serverAddressList16 = mongoDBRiverDefinition9.getMongoServers();
        java.lang.String str17 = mongoDBRiverDefinition9.getEXCLUDE_FIELDS_FIELD();
        java.lang.String str18 = mongoDBRiverDefinition9.scriptType;
        boolean boolean19 = mongoDBRiverDefinition9.isMongoSecondaryReadPreference();
        java.lang.String str20 = mongoDBRiverDefinition9.getSKIP_INITIAL_IMPORT_FIELD();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "host" + "'", str11, "host");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(eSLogger14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(serverAddressList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "exclude_fields" + "'", str17, "exclude_fields");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "skip_initial_import" + "'", str20, "skip_initial_import");
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.script("script");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder3.script("script");
        java.lang.String[] strArray37 = new java.lang.String[] { "include_collection", "host", "hi!", "drop_collection", "size", "filter", "bulk_timeout", "drop_collection", "concurrent_bulk_requests", "servers", "localhost", "store_statistics", "script", "secondary_read_preference", "throttle_size", "parent_types", "db", "type", "admin", "filter", "servers", "user", "secondary_read_preference", "connect_timeout", "local", "host", "drop_collection", "user", "password", "ssl_verify_certificate", "password" };
        java.util.LinkedHashSet<java.lang.String> strSet38 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet38, strArray37);
        builder5.setparentTypes((java.util.Set<java.lang.String>) strSet38);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder0.excludeFields((java.util.Set<java.lang.String>) strSet38);
        java.lang.String str42 = builder41.getmongoCollection();
        builder41.setmongoAdminPassword("ssl_verify_certificate");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder41.skipInitialImport(false);
        java.lang.String str47 = builder46.riverIndexName;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNull(str47);
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        com.mongodb.BasicDBObject basicDBObject4 = builder0.getmongoCollectionFilter();
        java.lang.String str5 = builder0.mongoLocalUser;
        com.mongodb.ServerAddress[] serverAddressArray6 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList7 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList7, serverAddressArray6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList7);
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder0.getmongoClientOptions();
        builder0.riverName = "script_type";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder13.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet16 = builder13.excludeFields;
        com.mongodb.BasicDBObject basicDBObject17 = builder13.getmongoCollectionFilter();
        builder0.setmongoOplogFilter(basicDBObject17);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder0.statisticsTypeName("host");
        com.mongodb.MongoClientOptions mongoClientOptions21 = null;
        builder0.setmongoClientOptions(mongoClientOptions21);
        org.bson.types.Binary binary23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder0.initialTimestamp(binary23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(basicDBObject4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(serverAddressArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(mongoClientOptions10);
        org.junit.Assert.assertNull(strSet16);
        org.junit.Assert.assertNotNull(basicDBObject17);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getIndexName();
        java.lang.String str12 = mongoDBRiverDefinition9.getSECONDARY_READ_PREFERENCE_FIELD();
        java.lang.String str13 = mongoDBRiverDefinition9.mongoAdminUser;
        boolean boolean14 = mongoDBRiverDefinition9.isImportAllCollections();
        boolean boolean15 = mongoDBRiverDefinition9.isImportAllCollections();
        java.lang.String str16 = mongoDBRiverDefinition9.getDB_FIELD();
        java.lang.String str17 = mongoDBRiverDefinition9.getSCRIPT_FIELD();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "secondary_read_preference" + "'", str12, "secondary_read_preference");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "db" + "'", str16, "db");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "script" + "'", str17, "script");
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getHOST_FIELD();
        java.lang.String str12 = mongoDBRiverDefinition9.getMongoLocalPassword();
        java.lang.String str13 = mongoDBRiverDefinition9.scriptType;
        org.elasticsearch.common.logging.ESLogger eSLogger14 = mongoDBRiverDefinition9.getlogger();
        java.lang.String str15 = mongoDBRiverDefinition9.script;
        java.util.Set<java.lang.String> strSet16 = mongoDBRiverDefinition9.getExcludeFields();
        java.lang.String str17 = mongoDBRiverDefinition9.statisticsTypeName;
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "host" + "'", str11, "host");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(eSLogger14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(strSet16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        boolean boolean11 = mongoDBRiverDefinition9.mongoGridFS;
        boolean boolean12 = mongoDBRiverDefinition9.mongoGridFS;
        boolean boolean13 = mongoDBRiverDefinition9.getmongoSecondaryReadPreference();
        java.lang.String str14 = mongoDBRiverDefinition9.getINCLUDE_COLLECTION_FIELD();
        java.lang.String str15 = mongoDBRiverDefinition9.script;
        java.lang.String str16 = mongoDBRiverDefinition9.getDEFAULT_DB_HOST();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "include_collection" + "'", str14, "include_collection");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "localhost" + "'", str16, "localhost");
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        builder8.importAllCollections = true;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder8.mongoLocalPassword("port");
        builder12.setmongoUseSSL(false);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition9.getCOLLECTION_FIELD();
        java.util.Set<java.lang.String> strSet12 = mongoDBRiverDefinition9.excludeFields;
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = mongoDBRiverDefinition9.getInitialTimestamp();
        java.lang.String str14 = mongoDBRiverDefinition9.mongoCollection;
        java.lang.String str15 = mongoDBRiverDefinition9.getTHROTTLE_SIZE_FIELD();
        java.lang.String str16 = mongoDBRiverDefinition9.getFILTER_FIELD();
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "collection" + "'", str11, "collection");
        org.junit.Assert.assertNull(strSet12);
        org.junit.Assert.assertNull(wildcardTimestamp13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "initial_timestamp" + "'", str14, "initial_timestamp");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "throttle_size" + "'", str15, "throttle_size");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "filter" + "'", str16, "filter");
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 'a');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder3.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet6 = builder3.excludeFields;
        builder3.setmongoCollection("initial_timestamp");
        boolean boolean9 = builder3.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder3.skipInitialImport(false);
        builder3.disableIndexRefresh = true;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder3.socketTimeout((int) (short) 1);
        builder3.includeCollection = "gridfs";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder3.importAllCollections(false);
        java.util.Set<java.lang.String> strSet20 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.includeFields(strSet20);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder22.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet25 = builder22.excludeFields;
        builder22.setmongoCollection("initial_timestamp");
        boolean boolean28 = builder22.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder22.skipInitialImport(false);
        java.lang.String str31 = builder30.typeName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder32.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet35 = builder32.excludeFields;
        com.mongodb.BasicDBObject basicDBObject36 = builder32.getmongoCollectionFilter();
        java.lang.String str37 = builder32.mongoLocalUser;
        com.mongodb.ServerAddress[] serverAddressArray38 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList39 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList39, serverAddressArray38);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder32.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList39);
        boolean boolean42 = builder41.dropCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder43.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet46 = builder43.excludeFields;
        com.mongodb.BasicDBObject basicDBObject47 = builder43.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp48 = builder43.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray49 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList50 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList50, serverAddressArray49);
        builder43.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList50);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder41.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList50);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder54.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet57 = builder54.excludeFields;
        com.mongodb.BasicDBObject basicDBObject58 = builder54.getmongoCollectionFilter();
        java.lang.String str59 = builder54.mongoLocalUser;
        com.mongodb.ServerAddress[] serverAddressArray60 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList61 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList61, serverAddressArray60);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = builder54.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList61);
        java.lang.String str64 = builder54.mongoAdminPassword;
        java.lang.String[] strArray69 = new java.lang.String[] { "admin", "script_type", "credentials", "password" };
        java.util.LinkedHashSet<java.lang.String> strSet70 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet70, strArray69);
        builder54.setincludeFields((java.util.Set<java.lang.String>) strSet70);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder73 = builder41.excludeFields((java.util.Set<java.lang.String>) strSet70);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder74 = builder30.parentTypes((java.util.Set<java.lang.String>) strSet70);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder75 = builder21.excludeFields((java.util.Set<java.lang.String>) strSet70);
        java.lang.Object obj76 = docScoreSearchScript0.unwrap((java.lang.Object) builder21);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder77 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder77.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet80 = builder77.excludeFields;
        com.mongodb.BasicDBObject basicDBObject81 = builder77.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp82 = builder77.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray83 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList84 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList84, serverAddressArray83);
        builder77.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList84);
        java.lang.String str87 = builder77.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder89 = builder77.dropCollection(true);
        java.lang.String str90 = builder89.typeName;
        builder89.setmongoSecondaryReadPreference(false);
        builder89.setstatisticsTypeName("gridfs");
        java.lang.String str95 = builder89.script;
        java.lang.Object obj96 = docScoreSearchScript0.unwrap((java.lang.Object) builder89);
        // The following exception was thrown during execution in test generation
        try {
            float float97 = docScoreSearchScript0.runAsFloat();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNull(strSet25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(strSet35);
        org.junit.Assert.assertNotNull(basicDBObject36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(serverAddressArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(strSet46);
        org.junit.Assert.assertNotNull(basicDBObject47);
        org.junit.Assert.assertNull(wildcardTimestamp48);
        org.junit.Assert.assertNotNull(serverAddressArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNull(strSet57);
        org.junit.Assert.assertNotNull(basicDBObject58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(serverAddressArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertNotNull(builder75);
        org.junit.Assert.assertNotNull(obj76);
        org.junit.Assert.assertNull(strSet80);
        org.junit.Assert.assertNotNull(basicDBObject81);
        org.junit.Assert.assertNull(wildcardTimestamp82);
        org.junit.Assert.assertNotNull(serverAddressArray83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNull(str87);
        org.junit.Assert.assertNotNull(builder89);
        org.junit.Assert.assertNull(str90);
        org.junit.Assert.assertNull(str95);
        org.junit.Assert.assertNotNull(obj96);
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet3 = builder0.excludeFields;
        builder0.setmongoCollection("initial_timestamp");
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.skipInitialImport(false);
        builder0.setmongoAdminPassword("store_statistics");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.scriptType("bulk_size");
        builder12.setskipInitialImport(true);
        builder12.scriptType = "connect_timeout";
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder12);
    }
}

