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
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.SECONDARY_READ_PREFERENCE_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "secondary_read_preference" + "'", str0, "secondary_read_preference");
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DISABLE_INDEX_REFRESH_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "disable_index_refresh" + "'", str0, "disable_index_refresh");
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.THROTTLE_SIZE_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "throttle_size" + "'", str0, "throttle_size");
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("disable_index_refresh");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?disable_index_refresh?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.BULK_TIMEOUT_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "bulk_timeout" + "'", str0, "bulk_timeout");
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("throttle_size");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?throttle_size? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        java.lang.Class<?> wildcardClass2 = basicDBObject1.getClass();
        org.junit.Assert.assertNotNull(basicDBObject1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.ADMIN_DB_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "admin" + "'", str0, "admin");
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.OPTIONS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "options" + "'", str0, "options");
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.PORT_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "port" + "'", str0, "port");
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.SCRIPT_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "script" + "'", str0, "script");
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.elasticsearch.common.settings.Settings settings2 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        org.elasticsearch.river.RiverSettings riverSettings4 = new org.elasticsearch.river.RiverSettings(settings2, strMap3);
        org.elasticsearch.script.ScriptService scriptService5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("port", "secondary_read_preference", riverSettings4, scriptService5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.SKIP_INITIAL_IMPORT_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "skip_initial_import" + "'", str0, "skip_initial_import");
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.LOCAL_DB_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "local" + "'", str0, "local");
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.CONCURRENT_REQUESTS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "concurrent_requests" + "'", str0, "concurrent_requests");
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DROP_COLLECTION_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "drop_collection" + "'", str0, "drop_collection");
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.FILTER_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "filter" + "'", str0, "filter");
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.TYPE_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "type" + "'", str0, "type");
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        int int0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DEFAULT_DB_PORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 27017 + "'", int0 == 27017);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.elasticsearch.common.unit.TimeValue timeValue0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DEFAULT_FLUSH_INTERVAL;
        org.junit.Assert.assertNotNull(timeValue0);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.elasticsearch.common.settings.Settings settings2 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        org.elasticsearch.river.RiverSettings riverSettings4 = new org.elasticsearch.river.RiverSettings(settings2, strMap3);
        org.elasticsearch.script.ScriptService scriptService5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("", "disable_index_refresh", riverSettings4, scriptService5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        int int0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DEFAULT_BULK_ACTIONS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1000 + "'", int0 == 1000);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.INITIAL_TIMESTAMP_SCRIPT_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "script" + "'", str0, "script");
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.INITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "script_type" + "'", str0, "script_type");
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.PARENT_TYPES_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "parent_types" + "'", str0, "parent_types");
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.BULK_SIZE_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "bulk_size" + "'", str0, "bulk_size");
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        javax.net.SocketFactory socketFactory0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.getSSLSocketFactory();
        org.junit.Assert.assertNotNull(socketFactory0);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.IMPORT_ALL_COLLECTIONS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "import_all_collections" + "'", str0, "import_all_collections");
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.SSL_VERIFY_CERT_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ssl_verify_certificate" + "'", str0, "ssl_verify_certificate");
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
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.elasticsearch.common.logging.ESLogger eSLogger0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.logger;
        java.lang.Class<?> wildcardClass1 = eSLogger0.getClass();
        org.junit.Assert.assertNotNull(eSLogger0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.GRIDFS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "gridfs" + "'", str0, "gridfs");
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.SCRIPT_TYPE_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "script_type" + "'", str0, "script_type");
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.NAME_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "name" + "'", str0, "name");
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.SERVERS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "servers" + "'", str0, "servers");
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.EXCLUDE_FIELDS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "exclude_fields" + "'", str0, "exclude_fields");
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.SIZE_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "size" + "'", str0, "size");
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.FLUSH_INTERVAL_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "flush_interval" + "'", str0, "flush_interval");
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        int int0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DEFAULT_CONCURRENT_REQUESTS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.ADVANCED_TRANSFORMATION_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "advanced_transformation" + "'", str0, "advanced_transformation");
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
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
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory0 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        java.lang.Class<?> wildcardClass1 = docScoreNativeScriptFactory0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DEFAULT_DB_HOST;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "localhost" + "'", str0, "localhost");
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.STORE_STATISTICS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "store_statistics" + "'", str0, "store_statistics");
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("bulk_size");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?bulk_size?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("import_all_collections");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?import_all_collections?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.HOST_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "host" + "'", str0, "host");
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("user", "throttle_size");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?throttle_size? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        org.apache.lucene.search.Scorer scorer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setScorer(scorer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "user" + "'", obj2, "user");
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
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
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.INCLUDE_COLLECTION_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "include_collection" + "'", str0, "include_collection");
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
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
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.SOCKET_TIMEOUT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "socket_timeout" + "'", str0, "socket_timeout");
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.INITIAL_TIMESTAMP_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "initial_timestamp" + "'", str0, "initial_timestamp");
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("concurrent_requests", "store_statistics");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?store_statistics?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.INCLUDE_FIELDS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "include_fields" + "'", str0, "include_fields");
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.PASSWORD_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "password" + "'", str0, "password");
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.SSL_CONNECTION_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ssl" + "'", str0, "ssl");
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DB_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "db" + "'", str0, "db");
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.CONCURRENT_BULK_REQUESTS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "concurrent_bulk_requests" + "'", str0, "concurrent_bulk_requests");
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString11();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb-1638820218387" + "'", str1, "mongodb-1638820218387");
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.Class<?> wildcardClass1 = builder0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("filter", "name", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?name? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.INDEX_OBJECT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index" + "'", str0, "index");
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        org.apache.lucene.index.AtomicReaderContext atomicReaderContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextReader(atomicReaderContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (-1L) + "'", obj2, (-1L));
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("script_type");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?script_type?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.bson.types.Binary binary8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder5.initialTimestamp(binary8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("exclude_fields", "mongodb-1638820218326");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?mongodb-1638820218326?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.COLLECTION_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "collection" + "'", str0, "collection");
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        int int6 = builder2.getsocketTimeout();
        builder2.setmongoSecondaryReadPreference(false);
        int int9 = builder2.socketTimeout;
        builder2.mongoAdminUser = "secondary_read_preference";
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        builder0.mongoAdminPassword = "name";
        java.lang.String str5 = builder0.mongoCollection;
        java.util.Set<java.lang.String> strSet6 = builder0.includeFields;
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = builder0.getinitialTimestamp();
        org.bson.types.BSONTimestamp bSONTimestamp8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.initialTimestamp(bSONTimestamp8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ts must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("user", "filter");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?filter? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString11();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString17();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb-1638820218387" + "'", str1, "mongodb-1638820218387");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mongodb-1638820218449" + "'", str2, "mongodb-1638820218449");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_river" + "'", str3, "_river");
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory5 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject7 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript8 = docScoreNativeScriptFactory5.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject7);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory9 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject11 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript12 = docScoreNativeScriptFactory9.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject11);
        com.mongodb.BasicDBObject basicDBObject14 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript15 = docScoreNativeScriptFactory9.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject14);
        org.elasticsearch.script.ExecutableScript executableScript16 = docScoreNativeScriptFactory5.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject14);
        org.elasticsearch.common.settings.Settings settings17 = null;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory18 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject20 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript21 = docScoreNativeScriptFactory18.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject20);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory22 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject24 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript25 = docScoreNativeScriptFactory22.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject24);
        com.mongodb.BasicDBObject basicDBObject27 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript28 = docScoreNativeScriptFactory22.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject27);
        org.elasticsearch.script.ExecutableScript executableScript29 = docScoreNativeScriptFactory18.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject27);
        org.elasticsearch.river.RiverSettings riverSettings30 = new org.elasticsearch.river.RiverSettings(settings17, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject27);
        org.elasticsearch.script.ExecutableScript executableScript31 = docScoreNativeScriptFactory5.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject27);
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "user" + "'", obj2, "user");
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + false + "'", obj4, false);
        org.junit.Assert.assertNotNull(basicDBObject7);
        org.junit.Assert.assertNotNull(executableScript8);
        org.junit.Assert.assertNotNull(basicDBObject11);
        org.junit.Assert.assertNotNull(executableScript12);
        org.junit.Assert.assertNotNull(basicDBObject14);
        org.junit.Assert.assertNotNull(executableScript15);
        org.junit.Assert.assertNotNull(executableScript16);
        org.junit.Assert.assertNotNull(basicDBObject20);
        org.junit.Assert.assertNotNull(executableScript21);
        org.junit.Assert.assertNotNull(basicDBObject24);
        org.junit.Assert.assertNotNull(executableScript25);
        org.junit.Assert.assertNotNull(basicDBObject27);
        org.junit.Assert.assertNotNull(executableScript28);
        org.junit.Assert.assertNotNull(executableScript29);
        org.junit.Assert.assertNotNull(executableScript31);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString11();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString17();
        org.elasticsearch.river.RiverSettings riverSettings3 = serializedObjectSupporter0.deserializeObjectRiverSettings2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString17();
        org.elasticsearch.river.RiverSettings riverSettings5 = serializedObjectSupporter0.deserializeObjectRiverSettings5();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb-1638820218387" + "'", str1, "mongodb-1638820218387");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mongodb-1638820218449" + "'", str2, "mongodb-1638820218449");
        org.junit.Assert.assertNull(riverSettings3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb-1638820218449" + "'", str4, "mongodb-1638820218449");
        org.junit.Assert.assertNull(riverSettings5);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.advancedTransformation(false);
        builder2.setimportAllCollections(false);
        boolean boolean8 = builder2.importAllCollections;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextSource(strMap3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (-1L) + "'", obj2, (-1L));
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.elasticsearch.common.settings.Settings settings2 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        org.elasticsearch.river.RiverSettings riverSettings4 = new org.elasticsearch.river.RiverSettings(settings2, strMap3);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = riverSettings4.settings();
        org.elasticsearch.script.ScriptService scriptService6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("type", "mongodb-1638820218363", riverSettings4, scriptService6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString11();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString17();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString7();
        java.lang.Class<?> wildcardClass5 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb-1638820218387" + "'", str1, "mongodb-1638820218387");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mongodb-1638820218449" + "'", str2, "mongodb-1638820218449");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "mongodb-1638820218326" + "'", str3, "mongodb-1638820218326");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb-1638820218326" + "'", str4, "mongodb-1638820218326");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.ACTIONS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "actions" + "'", str0, "actions");
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        int int6 = builder2.getsocketTimeout();
        builder2.setmongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet12 = builder11.parentTypes;
        java.util.List<com.mongodb.ServerAddress> serverAddressList13 = builder11.mongoServers;
        builder2.setmongoServers(serverAddressList13);
        builder2.setthrottleSize(0);
        boolean boolean17 = builder2.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder2.disableIndexRefresh(false);
        builder2.mongoLocalUser = "exclude_fields";
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNull(strSet12);
        org.junit.Assert.assertNotNull(serverAddressList13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("ssl_verify_certificate");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?ssl_verify_certificate?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        java.lang.Object obj6 = null;
        docScoreSearchScript0.setNextVar("", obj6);
        // The following exception was thrown during execution in test generation
        try {
            long long8 = docScoreSearchScript0.runAsLong();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "user" + "'", obj2, "user");
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + false + "'", obj4, false);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.CREDENTIALS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "credentials" + "'", str0, "credentials");
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        builder2.setmongoCollection("hi!");
        builder2.importAllCollections = true;
        com.mongodb.MongoClientOptions mongoClientOptions7 = null;
        builder2.mongoClientOptions = mongoClientOptions7;
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        boolean boolean8 = builder5.mongoUseSSL;
        java.lang.String str9 = builder5.gettypeName();
        java.lang.String str10 = builder5.getincludeCollection();
        builder5.setimportAllCollections(true);
        builder5.mongoDb = "mongodb-1638820218326";
        java.lang.String str15 = builder5.mongoDb;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "mongodb-1638820218326" + "'", str15, "mongodb-1638820218326");
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings1 = serializedObjectSupporter0.deserializeObjectRiverSettings9();
        org.elasticsearch.river.RiverSettings riverSettings2 = serializedObjectSupporter0.deserializeObjectRiverSettings5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString15();
        org.junit.Assert.assertNull(riverSettings1);
        org.junit.Assert.assertNull(riverSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "mongodb-1638820218424" + "'", str3, "mongodb-1638820218424");
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.advancedTransformation(false);
        java.lang.String str6 = builder5.getindexName();
        builder5.mongoDb = "throttle_size";
        java.lang.String str9 = builder5.getmongoAdminPassword();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder5.scriptType("");
        java.lang.Class<?> wildcardClass12 = builder5.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.parentTypes;
        builder2.indexName = "disable_index_refresh";
        builder2.setriverName("ssl_verify_certificate");
        builder2.setmongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = builder2.initialTimestamp;
        builder2.riverIndexName = "db";
        builder2.throttleSize = 1;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNull(wildcardTimestamp10);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = mongoDBRiverDefinition8.getInitialTimestamp();
        boolean boolean11 = mongoDBRiverDefinition8.getimportAllCollections();
        java.lang.String str12 = mongoDBRiverDefinition8.getSTORE_STATISTICS_FIELD();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "store_statistics" + "'", str12, "store_statistics");
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("user", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory3 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject5 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript6 = docScoreNativeScriptFactory3.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject5);
        builder0.setmongoCollectionFilter(basicDBObject5);
        java.lang.String str8 = builder0.getriverIndexName();
        com.mongodb.MongoClientOptions mongoClientOptions9 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoClientOptions(mongoClientOptions9);
        org.bson.types.Binary binary11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.initialTimestamp(binary11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(basicDBObject5);
        org.junit.Assert.assertNotNull(executableScript6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        int int6 = builder2.getsocketTimeout();
        builder2.setmongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet12 = builder11.parentTypes;
        java.util.List<com.mongodb.ServerAddress> serverAddressList13 = builder11.mongoServers;
        builder2.setmongoServers(serverAddressList13);
        builder2.setthrottleSize(0);
        builder2.mongoCollection = "null.size";
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNull(strSet12);
        org.junit.Assert.assertNotNull(serverAddressList13);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        int int6 = builder2.getsocketTimeout();
        builder2.setmongoSecondaryReadPreference(false);
        builder2.setskipInitialImport(true);
        builder2.mongoAdminPassword = "mongodb-1638820217755";
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        builder0.mongoAdminPassword = "name";
        boolean boolean5 = builder0.mongoSecondaryReadPreference;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory6 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject8 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript9 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject8);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory10 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject12 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript13 = docScoreNativeScriptFactory10.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject12);
        com.mongodb.BasicDBObject basicDBObject15 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript16 = docScoreNativeScriptFactory10.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject15);
        org.elasticsearch.script.ExecutableScript executableScript17 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject15);
        builder0.setmongoCollectionFilter(basicDBObject15);
        builder0.mongoLocalPassword = "initial_timestamp";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder0.storeStatistics(false);
        builder0.mongoUseSSL = false;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(basicDBObject8);
        org.junit.Assert.assertNotNull(executableScript9);
        org.junit.Assert.assertNotNull(basicDBObject12);
        org.junit.Assert.assertNotNull(executableScript13);
        org.junit.Assert.assertNotNull(basicDBObject15);
        org.junit.Assert.assertNotNull(executableScript16);
        org.junit.Assert.assertNotNull(executableScript17);
        org.junit.Assert.assertNotNull(builder22);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getADMIN_DB_FIELD();
        java.util.List<com.mongodb.ServerAddress> serverAddressList11 = mongoDBRiverDefinition8.mongoServers;
        java.lang.String str12 = mongoDBRiverDefinition8.mongoAdminPassword;
        java.lang.String str13 = mongoDBRiverDefinition8.getACTIONS_FIELD();
        java.lang.String str14 = mongoDBRiverDefinition8.getFLUSH_INTERVAL_FIELD();
        com.mongodb.MongoClientOptions mongoClientOptions15 = mongoDBRiverDefinition8.mongoClientOptions;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertNotNull(serverAddressList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "actions" + "'", str13, "actions");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "flush_interval" + "'", str14, "flush_interval");
        org.junit.Assert.assertNull(mongoClientOptions15);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.getmongoCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet5 = builder4.parentTypes;
        boolean boolean6 = builder4.skipInitialImport;
        java.lang.String[] strArray37 = new java.lang.String[] { "disable_index_refresh", "port", "secondary_read_preference", "import_all_collections", "bulk_timeout", "type", "script", "mongodb-1638820218449", "options", "gridfs", "port", "throttle_size", "ssl", "concurrent_bulk_requests", "hi!", "advanced_transformation", "bulk_size", "local", "name", "exclude_fields", "import_all_collections", "script_type", "socket_timeout", "type", "store_statistics", "store_statistics", "servers", "localhost", "ssl", "ssl_verify_certificate" };
        java.util.LinkedHashSet<java.lang.String> strSet38 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet38, strArray37);
        builder4.setincludeFields((java.util.Set<java.lang.String>) strSet38);
        builder0.parentTypes = strSet38;
        java.lang.String str42 = builder0.mongoAdminPassword;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        int int6 = builder2.getsocketTimeout();
        builder2.setmongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder2.mongoSSLVerifyCertificate(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder2.indexName("password");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.mongoUseSSL(true);
        builder12.setdisableIndexRefresh(false);
        builder12.statisticsTypeName = "null.size";
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        java.lang.Object obj6 = null;
        docScoreSearchScript0.setNextVar("", obj6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.advancedTransformation(false);
        docScoreSearchScript0.setNextVar("flush_interval", (java.lang.Object) builder11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = docScoreSearchScript0.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "user" + "'", obj2, "user");
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + false + "'", obj4, false);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder0.includeFields;
        boolean boolean4 = builder0.getmongoGridFS();
        java.util.Set<java.lang.String> strSet5 = builder0.parentTypes;
        boolean boolean6 = builder0.getmongoSSLVerifyCertificate();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory3 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject5 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript6 = docScoreNativeScriptFactory3.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject5);
        builder0.setmongoCollectionFilter(basicDBObject5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.mongoDb("mongodb-1638820218387");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.advancedTransformation(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory13 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject15 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript16 = docScoreNativeScriptFactory13.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject15);
        builder10.setmongoCollectionFilter(basicDBObject15);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder10.mongoDb("mongodb-1638820218387");
        java.lang.String[] strArray25 = new java.lang.String[] { "throttle_size", "", "db", "db", "local" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        builder10.setparentTypes((java.util.Set<java.lang.String>) strSet26);
        builder9.parentTypes = strSet26;
        com.mongodb.BasicDBObject basicDBObject30 = builder9.mongoCollectionFilter;
        java.lang.String str31 = builder9.getmongoLocalUser();
        org.bson.types.Binary binary32 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder9.initialTimestamp(binary32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(basicDBObject5);
        org.junit.Assert.assertNotNull(executableScript6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(basicDBObject15);
        org.junit.Assert.assertNotNull(executableScript16);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(basicDBObject30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("ssl_verify_certificate", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        java.lang.Object obj6 = null;
        docScoreSearchScript0.setNextVar("", obj6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet12 = builder11.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder11.mongoCollection("size");
        int int15 = builder11.getsocketTimeout();
        builder11.settypeName("initial_timestamp");
        builder11.setriverName("size");
        java.util.Set<java.lang.String> strSet20 = builder11.excludeFields;
        java.lang.String str21 = builder11.getmongoDb();
        docScoreSearchScript0.setNextVar("exclude_fields", (java.lang.Object) str21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj23 = docScoreSearchScript0.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "user" + "'", obj2, "user");
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + false + "'", obj4, false);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNull(strSet12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(strSet20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        java.lang.Object obj6 = null;
        docScoreSearchScript0.setNextVar("", obj6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.advancedTransformation(false);
        docScoreSearchScript0.setNextVar("flush_interval", (java.lang.Object) builder11);
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextDocId(1000);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "user" + "'", obj2, "user");
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + false + "'", obj4, false);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder2.setindexName("gridfs");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.getmongoCollection();
        builder0.setmongoUseSSL(true);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.parentTypes;
        builder2.indexName = "disable_index_refresh";
        org.bson.types.Binary binary6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder2.initialTimestamp(binary6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setmongoAdminUser("disable_index_refresh");
        builder5.setriverIndexName("ssl_verify_certificate");
        builder5.mongoCollection = "null.size";
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        boolean boolean9 = mongoDBRiverDefinition8.getadvancedTransformation();
        java.lang.String str10 = mongoDBRiverDefinition8.getDEFAULT_DB_HOST();
        java.lang.String str11 = mongoDBRiverDefinition8.getINCLUDE_FIELDS_FIELD();
        java.lang.String str12 = mongoDBRiverDefinition8.indexName;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "localhost" + "'", str10, "localhost");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "include_fields" + "'", str11, "include_fields");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "name" + "'", str12, "name");
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getSSL_CONNECTION_FIELD();
        com.mongodb.MongoClientOptions mongoClientOptions10 = mongoDBRiverDefinition8.getMongoClientOptions();
        java.util.Set<java.lang.String> strSet11 = mongoDBRiverDefinition8.excludeFields;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ssl" + "'", str9, "ssl");
        org.junit.Assert.assertNull(mongoClientOptions10);
        org.junit.Assert.assertNull(strSet11);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString11();
        org.elasticsearch.river.RiverSettings riverSettings2 = serializedObjectSupporter0.deserializeObjectRiverSettings1();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb-1638820218387" + "'", str1, "mongodb-1638820218387");
        org.junit.Assert.assertNull(riverSettings2);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        builder2.setmongoCollection("hi!");
        builder2.importAllCollections = true;
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = builder2.getinitialTimestamp();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(wildcardTimestamp7);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("hi!", "mongodb-1638820218449");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?mongodb-1638820218449?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory3 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject5 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript6 = docScoreNativeScriptFactory3.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject5);
        builder0.setmongoCollectionFilter(basicDBObject5);
        java.lang.String str8 = builder0.getriverIndexName();
        com.mongodb.MongoClientOptions mongoClientOptions9 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoClientOptions(mongoClientOptions9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet14 = builder13.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.advancedTransformation(false);
        builder15.mongoAdminPassword = "name";
        java.lang.String str20 = builder15.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet24 = builder23.parentTypes;
        boolean boolean25 = builder23.skipInitialImport;
        java.lang.String[] strArray56 = new java.lang.String[] { "disable_index_refresh", "port", "secondary_read_preference", "import_all_collections", "bulk_timeout", "type", "script", "mongodb-1638820218449", "options", "gridfs", "port", "throttle_size", "ssl", "concurrent_bulk_requests", "hi!", "advanced_transformation", "bulk_size", "local", "name", "exclude_fields", "import_all_collections", "script_type", "socket_timeout", "type", "store_statistics", "store_statistics", "servers", "localhost", "ssl", "ssl_verify_certificate" };
        java.util.LinkedHashSet<java.lang.String> strSet57 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet57, strArray56);
        builder23.setincludeFields((java.util.Set<java.lang.String>) strSet57);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder15.includeFields((java.util.Set<java.lang.String>) strSet57);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = builder13.excludeFields((java.util.Set<java.lang.String>) strSet57);
        builder0.includeFields = strSet57;
        java.util.Set<java.lang.String> strSet63 = null;
        builder0.setparentTypes(strSet63);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(basicDBObject5);
        org.junit.Assert.assertNotNull(executableScript6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNull(strSet14);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNull(strSet24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder61);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString11();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString17();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb-1638820218387" + "'", str1, "mongodb-1638820218387");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mongodb-1638820218449" + "'", str2, "mongodb-1638820218449");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "mongodb-1638820217755" + "'", str3, "mongodb-1638820217755");
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getADMIN_DB_FIELD();
        java.util.List<com.mongodb.ServerAddress> serverAddressList11 = mongoDBRiverDefinition8.mongoServers;
        boolean boolean12 = mongoDBRiverDefinition8.isImportAllCollections();
        java.lang.String str13 = mongoDBRiverDefinition8.getTypeName();
        java.lang.String str14 = mongoDBRiverDefinition8.getSSL_VERIFY_CERT_FIELD();
        com.mongodb.MongoClientOptions mongoClientOptions15 = mongoDBRiverDefinition8.getMongoClientOptions();
        java.lang.String str16 = mongoDBRiverDefinition8.getINDEX_OBJECT();
        java.lang.String str17 = mongoDBRiverDefinition8.mongoDb;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertNotNull(serverAddressList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ssl_verify_certificate" + "'", str14, "ssl_verify_certificate");
        org.junit.Assert.assertNull(mongoClientOptions15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "index" + "'", str16, "index");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder0.includeFields;
        boolean boolean4 = builder0.getmongoGridFS();
        boolean boolean5 = builder0.mongoUseSSL;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = mongoDBRiverDefinition8.getInitialTimestamp();
        boolean boolean11 = mongoDBRiverDefinition8.getimportAllCollections();
        int int12 = mongoDBRiverDefinition8.getSocketTimeout();
        boolean boolean13 = mongoDBRiverDefinition8.getdisableIndexRefresh();
        java.lang.String str14 = mongoDBRiverDefinition8.getACTIONS_FIELD();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "actions" + "'", str14, "actions");
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getADMIN_DB_FIELD();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue11 = mongoDBRiverDefinition8.getDEFAULT_BULK_SIZE();
        boolean boolean12 = mongoDBRiverDefinition8.getmongoGridFS();
        boolean boolean13 = mongoDBRiverDefinition8.mongoGridFS;
        java.lang.String str14 = mongoDBRiverDefinition8.statisticsIndexName;
        java.lang.String str15 = mongoDBRiverDefinition8.getPASSWORD_FIELD();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertNotNull(byteSizeValue11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "password" + "'", str15, "password");
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        docScoreSearchScript0.setNextScore((float) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.advancedTransformation(false);
        builder5.mongoAdminPassword = "name";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder5.mongoUseSSL(false);
        builder11.setmongoAdminUser("throttle_size");
        com.mongodb.MongoClientOptions mongoClientOptions14 = null;
        builder11.mongoClientOptions = mongoClientOptions14;
        builder11.setriverIndexName("script_type");
        com.mongodb.BasicDBObject basicDBObject19 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        builder11.mongoCollectionFilter = basicDBObject19;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "user" + "'", obj2, "user");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(basicDBObject19);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.advancedTransformation(false);
        builder4.mongoAdminPassword = "name";
        java.lang.String str9 = builder4.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet13 = builder12.parentTypes;
        boolean boolean14 = builder12.skipInitialImport;
        java.lang.String[] strArray45 = new java.lang.String[] { "disable_index_refresh", "port", "secondary_read_preference", "import_all_collections", "bulk_timeout", "type", "script", "mongodb-1638820218449", "options", "gridfs", "port", "throttle_size", "ssl", "concurrent_bulk_requests", "hi!", "advanced_transformation", "bulk_size", "local", "name", "exclude_fields", "import_all_collections", "script_type", "socket_timeout", "type", "store_statistics", "store_statistics", "servers", "localhost", "ssl", "ssl_verify_certificate" };
        java.util.LinkedHashSet<java.lang.String> strSet46 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet46, strArray45);
        builder12.setincludeFields((java.util.Set<java.lang.String>) strSet46);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder4.includeFields((java.util.Set<java.lang.String>) strSet46);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder2.excludeFields((java.util.Set<java.lang.String>) strSet46);
        java.lang.String str51 = builder2.getindexName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder2.mongoGridFS(false);
        builder53.setdropCollection(false);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(strSet13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(builder53);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("flush_interval", "user", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?user?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        docScoreSearchScript0.setNextScore((float) 'a');
        org.apache.lucene.index.AtomicReaderContext atomicReaderContext8 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextReader(atomicReaderContext8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (-1L) + "'", obj2, (-1L));
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder0.includeFields;
        boolean boolean4 = builder0.getmongoGridFS();
        java.util.Set<java.lang.String> strSet5 = builder0.parentTypes;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.advancedTransformation(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.advancedTransformation(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory11 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject13 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript14 = docScoreNativeScriptFactory11.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject13);
        builder8.setmongoCollectionFilter(basicDBObject13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder8.mongoDb("mongodb-1638820218387");
        java.lang.String[] strArray23 = new java.lang.String[] { "throttle_size", "", "db", "db", "local" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        builder8.setparentTypes((java.util.Set<java.lang.String>) strSet24);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder0.parentTypes((java.util.Set<java.lang.String>) strSet24);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet31 = builder30.parentTypes;
        java.util.List<com.mongodb.ServerAddress> serverAddressList32 = builder30.mongoServers;
        builder27.mongoServers = serverAddressList32;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder27.skipInitialImport(true);
        builder27.disableIndexRefresh = false;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(basicDBObject13);
        org.junit.Assert.assertNotNull(executableScript14);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNull(strSet31);
        org.junit.Assert.assertNotNull(serverAddressList32);
        org.junit.Assert.assertNotNull(builder35);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.elasticsearch.common.settings.Settings settings2 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        org.elasticsearch.river.RiverSettings riverSettings4 = new org.elasticsearch.river.RiverSettings(settings2, strMap3);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = riverSettings4.settings();
        org.elasticsearch.script.ScriptService scriptService6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("", "collection", riverSettings4, scriptService6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString11();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString17();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString18();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString16();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString9();
        org.elasticsearch.river.RiverSettings riverSettings7 = serializedObjectSupporter0.deserializeObjectRiverSettings5();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb-1638820218387" + "'", str1, "mongodb-1638820218387");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mongodb-1638820218449" + "'", str2, "mongodb-1638820218449");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "mongodb-1638820218326" + "'", str3, "mongodb-1638820218326");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_river" + "'", str4, "_river");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_river" + "'", str5, "_river");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "mongodb-1638820218363" + "'", str6, "mongodb-1638820218363");
        org.junit.Assert.assertNull(riverSettings7);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        builder0.mongoAdminPassword = "name";
        boolean boolean5 = builder0.mongoSecondaryReadPreference;
        com.mongodb.BasicDBObject basicDBObject6 = builder0.mongoOplogFilter;
        builder0.setdisableIndexRefresh(false);
        java.lang.String str9 = builder0.gettypeName();
        java.lang.String str10 = builder0.gettypeName();
        builder0.typeName = "index";
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(basicDBObject6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getADMIN_DB_FIELD();
        java.lang.String str11 = mongoDBRiverDefinition8.getNAME_FIELD();
        boolean boolean12 = mongoDBRiverDefinition8.mongoUseSSL;
        java.lang.String str13 = mongoDBRiverDefinition8.getEXCLUDE_FIELDS_FIELD();
        java.lang.String str14 = mongoDBRiverDefinition8.riverName;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "name" + "'", str11, "name");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "exclude_fields" + "'", str13, "exclude_fields");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.parentTypes;
        java.lang.String str4 = builder2.getriverIndexName();
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory5 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject7 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript8 = docScoreNativeScriptFactory5.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject7);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory9 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject11 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript12 = docScoreNativeScriptFactory9.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject11);
        com.mongodb.BasicDBObject basicDBObject14 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript15 = docScoreNativeScriptFactory9.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject14);
        org.elasticsearch.script.ExecutableScript executableScript16 = docScoreNativeScriptFactory5.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject14);
        org.elasticsearch.common.settings.Settings settings17 = null;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory18 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject20 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript21 = docScoreNativeScriptFactory18.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject20);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory22 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject24 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript25 = docScoreNativeScriptFactory22.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject24);
        com.mongodb.BasicDBObject basicDBObject27 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript28 = docScoreNativeScriptFactory22.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject27);
        org.elasticsearch.script.ExecutableScript executableScript29 = docScoreNativeScriptFactory18.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject27);
        org.elasticsearch.river.RiverSettings riverSettings30 = new org.elasticsearch.river.RiverSettings(settings17, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject27);
        org.elasticsearch.script.ExecutableScript executableScript31 = docScoreNativeScriptFactory5.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject27);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder2.mongoOplogFilter(basicDBObject27);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder2.statisticsIndexName("password");
        java.lang.String str35 = builder34.mongoLocalPassword;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder34.mongoLocalPassword("");
        java.lang.String str38 = builder37.getmongoLocalPassword();
        builder37.mongoCollection = "disable_index_refresh";
        int int41 = builder37.connectTimeout;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(basicDBObject7);
        org.junit.Assert.assertNotNull(executableScript8);
        org.junit.Assert.assertNotNull(basicDBObject11);
        org.junit.Assert.assertNotNull(executableScript12);
        org.junit.Assert.assertNotNull(basicDBObject14);
        org.junit.Assert.assertNotNull(executableScript15);
        org.junit.Assert.assertNotNull(executableScript16);
        org.junit.Assert.assertNotNull(basicDBObject20);
        org.junit.Assert.assertNotNull(executableScript21);
        org.junit.Assert.assertNotNull(basicDBObject24);
        org.junit.Assert.assertNotNull(executableScript25);
        org.junit.Assert.assertNotNull(basicDBObject27);
        org.junit.Assert.assertNotNull(executableScript28);
        org.junit.Assert.assertNotNull(executableScript29);
        org.junit.Assert.assertNotNull(executableScript31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getADMIN_DB_FIELD();
        boolean boolean11 = mongoDBRiverDefinition8.mongoSecondaryReadPreference;
        com.mongodb.MongoClientOptions mongoClientOptions12 = mongoDBRiverDefinition8.mongoClientOptions;
        java.lang.String str13 = mongoDBRiverDefinition8.getRiverName();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(mongoClientOptions12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getGRIDFS_FIELD();
        java.lang.String str11 = mongoDBRiverDefinition8.getINITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD();
        java.lang.String str12 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        java.lang.Class<?> wildcardClass13 = mongoDBRiverDefinition8.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "gridfs" + "'", str10, "gridfs");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "script_type" + "'", str11, "script_type");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "throttle_size" + "'", str12, "throttle_size");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("exclude_fields", "drop_collection");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?drop_collection?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        docScoreSearchScript0.setNextScore((float) '4');
        docScoreSearchScript0.setNextScore((float) '4');
        org.apache.lucene.index.AtomicReaderContext atomicReaderContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextReader(atomicReaderContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (-1L) + "'", obj2, (-1L));
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getACTIONS_FIELD();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = mongoDBRiverDefinition8.initialTimestamp;
        int int11 = mongoDBRiverDefinition8.connectTimeout;
        java.lang.String str12 = mongoDBRiverDefinition8.getSSL_CONNECTION_FIELD();
        java.lang.String str13 = mongoDBRiverDefinition8.getBULK_TIMEOUT_FIELD();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "actions" + "'", str9, "actions");
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ssl" + "'", str12, "ssl");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "bulk_timeout" + "'", str13, "bulk_timeout");
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString11();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString17();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString11();
        org.elasticsearch.river.RiverSettings riverSettings5 = serializedObjectSupporter0.deserializeObjectRiverSettings9();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb-1638820218387" + "'", str1, "mongodb-1638820218387");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mongodb-1638820218449" + "'", str2, "mongodb-1638820218449");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "mongodb-1638820218326" + "'", str3, "mongodb-1638820218326");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb-1638820218387" + "'", str4, "mongodb-1638820218387");
        org.junit.Assert.assertNull(riverSettings5);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.parentTypes;
        builder2.indexName = "disable_index_refresh";
        builder2.setriverName("ssl_verify_certificate");
        com.mongodb.MongoClientOptions mongoClientOptions8 = builder2.mongoClientOptions;
        builder2.disableIndexRefresh = false;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder2.connectTimeout(10);
        org.bson.types.BSONTimestamp bSONTimestamp13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.initialTimestamp(bSONTimestamp13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ts must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNull(mongoClientOptions8);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory3 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject5 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript6 = docScoreNativeScriptFactory3.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject5);
        builder0.setmongoCollectionFilter(basicDBObject5);
        java.lang.String str8 = builder0.getriverIndexName();
        com.mongodb.MongoClientOptions mongoClientOptions9 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoClientOptions(mongoClientOptions9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet14 = builder13.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.advancedTransformation(false);
        builder15.mongoAdminPassword = "name";
        java.lang.String str20 = builder15.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet24 = builder23.parentTypes;
        boolean boolean25 = builder23.skipInitialImport;
        java.lang.String[] strArray56 = new java.lang.String[] { "disable_index_refresh", "port", "secondary_read_preference", "import_all_collections", "bulk_timeout", "type", "script", "mongodb-1638820218449", "options", "gridfs", "port", "throttle_size", "ssl", "concurrent_bulk_requests", "hi!", "advanced_transformation", "bulk_size", "local", "name", "exclude_fields", "import_all_collections", "script_type", "socket_timeout", "type", "store_statistics", "store_statistics", "servers", "localhost", "ssl", "ssl_verify_certificate" };
        java.util.LinkedHashSet<java.lang.String> strSet57 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet57, strArray56);
        builder23.setincludeFields((java.util.Set<java.lang.String>) strSet57);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder15.includeFields((java.util.Set<java.lang.String>) strSet57);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = builder13.excludeFields((java.util.Set<java.lang.String>) strSet57);
        builder0.includeFields = strSet57;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder64 = builder0.disableIndexRefresh(false);
        java.lang.String str65 = builder0.scriptType;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(basicDBObject5);
        org.junit.Assert.assertNotNull(executableScript6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNull(strSet14);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNull(strSet24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNull(str65);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString11();
        org.elasticsearch.river.RiverSettings riverSettings2 = serializedObjectSupporter0.deserializeObjectRiverSettings2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString10();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString12();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb-1638820218387" + "'", str1, "mongodb-1638820218387");
        org.junit.Assert.assertNull(riverSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_river" + "'", str3, "_river");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_river" + "'", str4, "_river");
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.getmongoCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.riverName("flush_interval");
        boolean boolean4 = builder0.getmongoSSLVerifyCertificate();
        builder0.setmongoCollection("size");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = builder2.getinitialTimestamp();
        builder2.scriptType = "servers";
        builder2.indexName = "advanced_transformation";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.advancedTransformation(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory14 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject16 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript17 = docScoreNativeScriptFactory14.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject16);
        builder11.setmongoCollectionFilter(basicDBObject16);
        java.lang.String str19 = builder11.getriverIndexName();
        com.mongodb.MongoClientOptions mongoClientOptions20 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder11.mongoClientOptions(mongoClientOptions20);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder22.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet25 = builder24.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.advancedTransformation(false);
        builder26.mongoAdminPassword = "name";
        java.lang.String str31 = builder26.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder32.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet35 = builder34.parentTypes;
        boolean boolean36 = builder34.skipInitialImport;
        java.lang.String[] strArray67 = new java.lang.String[] { "disable_index_refresh", "port", "secondary_read_preference", "import_all_collections", "bulk_timeout", "type", "script", "mongodb-1638820218449", "options", "gridfs", "port", "throttle_size", "ssl", "concurrent_bulk_requests", "hi!", "advanced_transformation", "bulk_size", "local", "name", "exclude_fields", "import_all_collections", "script_type", "socket_timeout", "type", "store_statistics", "store_statistics", "servers", "localhost", "ssl", "ssl_verify_certificate" };
        java.util.LinkedHashSet<java.lang.String> strSet68 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet68, strArray67);
        builder34.setincludeFields((java.util.Set<java.lang.String>) strSet68);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder71 = builder26.includeFields((java.util.Set<java.lang.String>) strSet68);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder72 = builder24.excludeFields((java.util.Set<java.lang.String>) strSet68);
        builder11.includeFields = strSet68;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder74 = builder2.excludeFields((java.util.Set<java.lang.String>) strSet68);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter75 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings76 = serializedObjectSupporter75.deserializeObjectRiverSettings9();
        org.elasticsearch.river.RiverSettings riverSettings77 = serializedObjectSupporter75.deserializeObjectRiverSettings5();
        builder2.serializedObjectSupporter = serializedObjectSupporter75;
        java.lang.String str79 = serializedObjectSupporter75.deserializeObjectString11();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(basicDBObject16);
        org.junit.Assert.assertNotNull(executableScript17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNull(strSet25);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNull(strSet35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(builder71);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertNull(riverSettings76);
        org.junit.Assert.assertNull(riverSettings77);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "mongodb-1638820218387" + "'", str79, "mongodb-1638820218387");
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.advancedTransformation(false);
        java.lang.String str6 = builder5.getindexName();
        builder5.mongoDb = "throttle_size";
        java.lang.String str9 = builder5.getmongoAdminPassword();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder5.scriptType("");
        org.bson.types.BSONTimestamp bSONTimestamp12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder5.initialTimestamp(bSONTimestamp12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ts must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        int int6 = builder2.getsocketTimeout();
        builder2.setmongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder2.mongoSSLVerifyCertificate(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder2.indexName("password");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.dropCollection(false);
        com.mongodb.BasicDBObject basicDBObject15 = builder12.getmongoOplogFilter();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNull(basicDBObject15);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getSSL_CONNECTION_FIELD();
        boolean boolean10 = mongoDBRiverDefinition8.isMongoGridFS();
        java.lang.String str11 = mongoDBRiverDefinition8.mongoAdminUser;
        java.lang.String str12 = mongoDBRiverDefinition8.statisticsIndexName;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ssl" + "'", str9, "ssl");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getACTIONS_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getDB_FIELD();
        java.lang.String str11 = mongoDBRiverDefinition8.getINDEX_OBJECT();
        boolean boolean12 = mongoDBRiverDefinition8.isStoreStatistics();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "actions" + "'", str9, "actions");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "db" + "'", str10, "db");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "index" + "'", str11, "index");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("admin", "advanced_transformation", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?advanced_transformation?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        boolean boolean10 = mongoDBRiverDefinition8.getmongoGridFS();
        com.mongodb.BasicDBObject basicDBObject11 = mongoDBRiverDefinition8.mongoOplogFilter;
        java.util.Set<java.lang.String> strSet12 = mongoDBRiverDefinition8.getIncludeFields();
        java.lang.String str13 = mongoDBRiverDefinition8.typeName;
        java.lang.String str14 = mongoDBRiverDefinition8.includeCollection;
        java.lang.Class<?> wildcardClass15 = mongoDBRiverDefinition8.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(basicDBObject11);
        org.junit.Assert.assertNull(strSet12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getSCRIPT_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getACTIONS_FIELD();
        java.lang.String str11 = mongoDBRiverDefinition8.getFILTER_FIELD();
        java.lang.String str12 = mongoDBRiverDefinition8.scriptType;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "script" + "'", str9, "script");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "actions" + "'", str10, "actions");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "filter" + "'", str11, "filter");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        builder0.mongoAdminPassword = "name";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.mongoAdminPassword("index");
        builder0.mongoDb = "bulk";
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        boolean boolean8 = builder5.mongoUseSSL;
        com.mongodb.MongoClientOptions mongoClientOptions9 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder5.mongoClientOptions(mongoClientOptions9);
        java.util.Set<java.lang.String> strSet11 = null;
        builder5.excludeFields = strSet11;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getADMIN_DB_FIELD();
        java.util.List<com.mongodb.ServerAddress> serverAddressList11 = mongoDBRiverDefinition8.mongoServers;
        boolean boolean12 = mongoDBRiverDefinition8.isImportAllCollections();
        boolean boolean13 = mongoDBRiverDefinition8.skipInitialImport;
        java.util.Set<java.lang.String> strSet14 = mongoDBRiverDefinition8.includeFields;
        java.util.List<com.mongodb.ServerAddress> serverAddressList15 = mongoDBRiverDefinition8.getMongoServers();
        java.lang.String str16 = mongoDBRiverDefinition8.getPASSWORD_FIELD();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertNotNull(serverAddressList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(strSet14);
        org.junit.Assert.assertNotNull(serverAddressList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "password" + "'", str16, "password");
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        boolean boolean10 = mongoDBRiverDefinition8.getmongoSecondaryReadPreference();
        boolean boolean11 = mongoDBRiverDefinition8.mongoSecondaryReadPreference;
        java.lang.String str12 = mongoDBRiverDefinition8.getRiverIndexName();
        java.lang.String str13 = mongoDBRiverDefinition8.getRiverName();
        java.lang.String str14 = mongoDBRiverDefinition8.script;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        boolean boolean10 = mongoDBRiverDefinition8.getmongoGridFS();
        com.mongodb.BasicDBObject basicDBObject11 = mongoDBRiverDefinition8.mongoOplogFilter;
        java.util.Set<java.lang.String> strSet12 = mongoDBRiverDefinition8.getIncludeFields();
        java.lang.String str13 = mongoDBRiverDefinition8.getDROP_COLLECTION_FIELD();
        java.lang.String str14 = mongoDBRiverDefinition8.getUSER_FIELD();
        java.lang.String str15 = mongoDBRiverDefinition8.getSTORE_STATISTICS_FIELD();
        com.mongodb.MongoClientOptions mongoClientOptions16 = mongoDBRiverDefinition8.mongoClientOptions;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(basicDBObject11);
        org.junit.Assert.assertNull(strSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "drop_collection" + "'", str13, "drop_collection");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "user" + "'", str14, "user");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "store_statistics" + "'", str15, "store_statistics");
        org.junit.Assert.assertNull(mongoClientOptions16);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.parentTypes;
        builder2.indexName = "disable_index_refresh";
        builder2.setriverName("ssl_verify_certificate");
        builder2.setmongoSecondaryReadPreference(true);
        java.lang.String str10 = builder2.getmongoCollection();
        builder2.setincludeCollection("hi!");
        org.bson.types.BSONTimestamp bSONTimestamp13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder2.initialTimestamp(bSONTimestamp13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ts must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        int int6 = builder2.getsocketTimeout();
        builder2.setmongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder2.mongoSSLVerifyCertificate(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder2.includeCollection("concurrent_bulk_requests");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.lang.String str3 = builder2.riverIndexName;
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter4 = builder2.serializedObjectSupporter;
        org.bson.types.Binary binary5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder2.initialTimestamp(binary5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(serializedObjectSupporter4);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory3 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject5 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript6 = docScoreNativeScriptFactory3.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject5);
        builder0.setmongoCollectionFilter(basicDBObject5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.mongoDb("mongodb-1638820218387");
        java.lang.String[] strArray15 = new java.lang.String[] { "throttle_size", "", "db", "db", "local" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        builder0.setparentTypes((java.util.Set<java.lang.String>) strSet16);
        java.lang.Class<?> wildcardClass19 = strSet16.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(basicDBObject5);
        org.junit.Assert.assertNotNull(executableScript6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString11();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString12();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString11();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString6();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb-1638820218387" + "'", str1, "mongodb-1638820218387");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_river" + "'", str2, "_river");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "mongodb-1638820218387" + "'", str3, "mongodb-1638820218387");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_river" + "'", str4, "_river");
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        builder0.mongoAdminPassword = "name";
        java.lang.String str5 = builder0.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet9 = builder8.parentTypes;
        boolean boolean10 = builder8.skipInitialImport;
        java.lang.String[] strArray41 = new java.lang.String[] { "disable_index_refresh", "port", "secondary_read_preference", "import_all_collections", "bulk_timeout", "type", "script", "mongodb-1638820218449", "options", "gridfs", "port", "throttle_size", "ssl", "concurrent_bulk_requests", "hi!", "advanced_transformation", "bulk_size", "local", "name", "exclude_fields", "import_all_collections", "script_type", "socket_timeout", "type", "store_statistics", "store_statistics", "servers", "localhost", "ssl", "ssl_verify_certificate" };
        java.util.LinkedHashSet<java.lang.String> strSet42 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet42, strArray41);
        builder8.setincludeFields((java.util.Set<java.lang.String>) strSet42);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder0.includeFields((java.util.Set<java.lang.String>) strSet42);
        builder0.importAllCollections = false;
        builder0.riverIndexName = "parent_types";
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp50 = builder0.getinitialTimestamp();
        builder0.riverName = "mongodb-1638820217755";
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(strSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNull(wildcardTimestamp50);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        builder2.mongoGridFS = true;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder2.mongoUseSSL(false);
        builder6.setimportAllCollections(true);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getADMIN_DB_FIELD();
        java.util.List<com.mongodb.ServerAddress> serverAddressList11 = mongoDBRiverDefinition8.mongoServers;
        com.mongodb.BasicDBObject basicDBObject12 = mongoDBRiverDefinition8.getMongoOplogFilter();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertNotNull(serverAddressList11);
        org.junit.Assert.assertNull(basicDBObject12);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory3 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject5 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript6 = docScoreNativeScriptFactory3.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject5);
        builder0.setmongoCollectionFilter(basicDBObject5);
        java.lang.String str8 = builder0.getriverIndexName();
        com.mongodb.MongoClientOptions mongoClientOptions9 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoClientOptions(mongoClientOptions9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet14 = builder13.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.advancedTransformation(false);
        builder15.mongoAdminPassword = "name";
        java.lang.String str20 = builder15.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet24 = builder23.parentTypes;
        boolean boolean25 = builder23.skipInitialImport;
        java.lang.String[] strArray56 = new java.lang.String[] { "disable_index_refresh", "port", "secondary_read_preference", "import_all_collections", "bulk_timeout", "type", "script", "mongodb-1638820218449", "options", "gridfs", "port", "throttle_size", "ssl", "concurrent_bulk_requests", "hi!", "advanced_transformation", "bulk_size", "local", "name", "exclude_fields", "import_all_collections", "script_type", "socket_timeout", "type", "store_statistics", "store_statistics", "servers", "localhost", "ssl", "ssl_verify_certificate" };
        java.util.LinkedHashSet<java.lang.String> strSet57 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet57, strArray56);
        builder23.setincludeFields((java.util.Set<java.lang.String>) strSet57);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder15.includeFields((java.util.Set<java.lang.String>) strSet57);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = builder13.excludeFields((java.util.Set<java.lang.String>) strSet57);
        builder0.includeFields = strSet57;
        builder0.setadvancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder66 = builder0.script("servers");
        boolean boolean67 = builder66.getmongoSecondaryReadPreference();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(basicDBObject5);
        org.junit.Assert.assertNotNull(executableScript6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNull(strSet14);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNull(strSet24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getADMIN_DB_FIELD();
        boolean boolean11 = mongoDBRiverDefinition8.mongoSecondaryReadPreference;
        com.mongodb.MongoClientOptions mongoClientOptions12 = mongoDBRiverDefinition8.mongoClientOptions;
        java.lang.String str13 = mongoDBRiverDefinition8.mongoDb;
        boolean boolean14 = mongoDBRiverDefinition8.storeStatistics;
        boolean boolean15 = mongoDBRiverDefinition8.getmongoGridFS();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(mongoClientOptions12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("script", "index");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?index?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        docScoreSearchScript0.setNextVar("advanced_transformation", (java.lang.Object) "filter");
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        java.lang.Object obj8 = null;
        java.lang.Object obj9 = docScoreSearchScript0.unwrap(obj8);
        org.apache.lucene.index.AtomicReaderContext atomicReaderContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextReader(atomicReaderContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "user" + "'", obj2, "user");
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("throttle_size", "bulk_size", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?bulk_size?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString11();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString17();
        org.elasticsearch.river.RiverSettings riverSettings3 = serializedObjectSupporter0.deserializeObjectRiverSettings3();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString14();
        java.lang.Class<?> wildcardClass5 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb-1638820218387" + "'", str1, "mongodb-1638820218387");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mongodb-1638820218449" + "'", str2, "mongodb-1638820218449");
        org.junit.Assert.assertNull(riverSettings3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_river" + "'", str4, "_river");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.parentTypes;
        builder2.indexName = "disable_index_refresh";
        builder2.setriverName("ssl_verify_certificate");
        com.mongodb.MongoClientOptions mongoClientOptions8 = builder2.mongoClientOptions;
        builder2.setdisableIndexRefresh(true);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNull(mongoClientOptions8);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        boolean boolean10 = mongoDBRiverDefinition8.getmongoSecondaryReadPreference();
        boolean boolean11 = mongoDBRiverDefinition8.mongoSecondaryReadPreference;
        java.lang.String str12 = mongoDBRiverDefinition8.getHOST_FIELD();
        org.elasticsearch.common.unit.TimeValue timeValue13 = mongoDBRiverDefinition8.getDEFAULT_FLUSH_INTERVAL();
        java.lang.String str14 = mongoDBRiverDefinition8.getMongoAdminUser();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = mongoDBRiverDefinition8.getInitialTimestamp();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "host" + "'", str12, "host");
        org.junit.Assert.assertNotNull(timeValue13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(wildcardTimestamp15);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("ssl_verify_certificate", "", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.lang.String str3 = builder2.riverIndexName;
        com.mongodb.MongoClientOptions mongoClientOptions4 = builder2.mongoClientOptions;
        builder2.setsocketTimeout((int) (short) 10);
        builder2.importAllCollections = false;
        builder2.mongoAdminPassword = "exclude_fields";
        java.lang.String str11 = builder2.mongoDb;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(mongoClientOptions4);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        builder0.mongoAdminPassword = "name";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.mongoAdminPassword("index");
        java.util.Set<java.lang.String> strSet9 = builder0.excludeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder0.dropCollection(false);
        builder11.mongoAdminUser = "import_all_collections";
        builder11.setscriptType("host");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(strSet9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.parentTypes;
        java.util.List<com.mongodb.ServerAddress> serverAddressList4 = builder2.mongoServers;
        builder2.setmongoSecondaryReadPreference(true);
        builder2.setmongoUseSSL(false);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(serverAddressList4);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        builder2.mongoGridFS = true;
        builder2.mongoAdminUser = "bulk";
        int int7 = builder2.getsocketTimeout();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        builder0.mongoAdminPassword = "name";
        builder0.setmongoAdminPassword("mongodb-1638820218326");
        java.lang.String str7 = builder0.getmongoLocalUser();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.mongoUseSSL(false);
        org.bson.types.Binary binary10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder0.initialTimestamp(binary10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.elasticsearch.common.settings.Settings settings2 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        org.elasticsearch.river.RiverSettings riverSettings4 = new org.elasticsearch.river.RiverSettings(settings2, strMap3);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = riverSettings4.settings();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = riverSettings4.settings();
        org.elasticsearch.common.settings.Settings settings7 = riverSettings4.globalSettings();
        org.elasticsearch.script.ScriptService scriptService8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("socket_timeout", "mongodb-1638820218264", riverSettings4, scriptService8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(settings7);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        boolean boolean8 = builder5.mongoUseSSL;
        java.lang.String str9 = builder5.gettypeName();
        java.lang.String str10 = builder5.getincludeCollection();
        builder5.setimportAllCollections(true);
        builder5.setthrottleSize(0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        org.apache.lucene.index.AtomicReaderContext atomicReaderContext3 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextReader(atomicReaderContext3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "user" + "'", obj2, "user");
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        boolean boolean9 = mongoDBRiverDefinition8.getadvancedTransformation();
        java.lang.String str10 = mongoDBRiverDefinition8.getDEFAULT_DB_HOST();
        java.lang.String str11 = mongoDBRiverDefinition8.getINCLUDE_FIELDS_FIELD();
        java.lang.String str12 = mongoDBRiverDefinition8.getSECONDARY_READ_PREFERENCE_FIELD();
        boolean boolean13 = mongoDBRiverDefinition8.getadvancedTransformation();
        boolean boolean14 = mongoDBRiverDefinition8.mongoGridFS;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "localhost" + "'", str10, "localhost");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "include_fields" + "'", str11, "include_fields");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "secondary_read_preference" + "'", str12, "secondary_read_preference");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder0.includeFields;
        boolean boolean4 = builder0.getmongoGridFS();
        java.util.Set<java.lang.String> strSet5 = builder0.parentTypes;
        com.mongodb.MongoClientOptions mongoClientOptions6 = builder0.getmongoClientOptions();
        builder0.statisticsTypeName = "bulk_timeout";
        java.lang.String str9 = builder0.getstatisticsIndexName();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertNull(mongoClientOptions6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getADMIN_DB_FIELD();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue11 = mongoDBRiverDefinition8.getDEFAULT_BULK_SIZE();
        boolean boolean12 = mongoDBRiverDefinition8.getmongoGridFS();
        boolean boolean13 = mongoDBRiverDefinition8.mongoGridFS;
        java.lang.String str14 = mongoDBRiverDefinition8.getEXCLUDE_FIELDS_FIELD();
        java.lang.String str15 = mongoDBRiverDefinition8.getDEFAULT_DB_HOST();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertNotNull(byteSizeValue11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "exclude_fields" + "'", str14, "exclude_fields");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "localhost" + "'", str15, "localhost");
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        builder0.mongoAdminPassword = "name";
        builder0.setmongoAdminPassword("mongodb-1638820218326");
        java.lang.String str7 = builder0.getmongoLocalUser();
        builder0.setstoreStatistics(true);
        builder0.setstatisticsTypeName("ssl");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getSCRIPT_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getACTIONS_FIELD();
        java.lang.String str11 = mongoDBRiverDefinition8.getFILTER_FIELD();
        boolean boolean12 = mongoDBRiverDefinition8.isImportAllCollections();
        int int13 = mongoDBRiverDefinition8.throttleSize;
        java.util.List<com.mongodb.ServerAddress> serverAddressList14 = mongoDBRiverDefinition8.mongoServers;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "script" + "'", str9, "script");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "actions" + "'", str10, "actions");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "filter" + "'", str11, "filter");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(serverAddressList14);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        builder0.mongoAdminPassword = "name";
        java.lang.String str5 = builder0.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet9 = builder8.parentTypes;
        boolean boolean10 = builder8.skipInitialImport;
        java.lang.String[] strArray41 = new java.lang.String[] { "disable_index_refresh", "port", "secondary_read_preference", "import_all_collections", "bulk_timeout", "type", "script", "mongodb-1638820218449", "options", "gridfs", "port", "throttle_size", "ssl", "concurrent_bulk_requests", "hi!", "advanced_transformation", "bulk_size", "local", "name", "exclude_fields", "import_all_collections", "script_type", "socket_timeout", "type", "store_statistics", "store_statistics", "servers", "localhost", "ssl", "ssl_verify_certificate" };
        java.util.LinkedHashSet<java.lang.String> strSet42 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet42, strArray41);
        builder8.setincludeFields((java.util.Set<java.lang.String>) strSet42);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder0.includeFields((java.util.Set<java.lang.String>) strSet42);
        builder0.importAllCollections = false;
        builder0.riverIndexName = "parent_types";
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp50 = builder0.getinitialTimestamp();
        java.lang.String str51 = builder0.statisticsIndexName;
        builder0.setstatisticsIndexName("");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(strSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNull(wildcardTimestamp50);
        org.junit.Assert.assertNull(str51);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getADMIN_DB_FIELD();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue11 = mongoDBRiverDefinition8.getDEFAULT_BULK_SIZE();
        boolean boolean12 = mongoDBRiverDefinition8.getmongoGridFS();
        boolean boolean13 = mongoDBRiverDefinition8.isDisableIndexRefresh();
        boolean boolean14 = mongoDBRiverDefinition8.isAdvancedTransformation();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertNotNull(byteSizeValue11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        builder0.mongoAdminPassword = "name";
        boolean boolean5 = builder0.mongoSecondaryReadPreference;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory6 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject8 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript9 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject8);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory10 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject12 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript13 = docScoreNativeScriptFactory10.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject12);
        com.mongodb.BasicDBObject basicDBObject15 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript16 = docScoreNativeScriptFactory10.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject15);
        org.elasticsearch.script.ExecutableScript executableScript17 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject15);
        builder0.setmongoCollectionFilter(basicDBObject15);
        builder0.mongoLocalPassword = "initial_timestamp";
        boolean boolean21 = builder0.mongoUseSSL;
        org.bson.types.Binary binary22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder0.initialTimestamp(binary22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(basicDBObject8);
        org.junit.Assert.assertNotNull(executableScript9);
        org.junit.Assert.assertNotNull(basicDBObject12);
        org.junit.Assert.assertNotNull(executableScript13);
        org.junit.Assert.assertNotNull(basicDBObject15);
        org.junit.Assert.assertNotNull(executableScript16);
        org.junit.Assert.assertNotNull(executableScript17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder0.includeFields;
        boolean boolean4 = builder0.getmongoGridFS();
        java.util.Set<java.lang.String> strSet5 = builder0.parentTypes;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.advancedTransformation(true);
        builder0.mongoGridFS = false;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        boolean boolean10 = mongoDBRiverDefinition8.getmongoGridFS();
        com.mongodb.BasicDBObject basicDBObject11 = mongoDBRiverDefinition8.mongoOplogFilter;
        java.util.Set<java.lang.String> strSet12 = mongoDBRiverDefinition8.excludeFields;
        java.lang.String str13 = mongoDBRiverDefinition8.getMongoAdminPassword();
        java.lang.String str14 = mongoDBRiverDefinition8.getTypeName();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(basicDBObject11);
        org.junit.Assert.assertNull(strSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        builder0.mongoAdminPassword = "name";
        builder0.setmongoAdminPassword("mongodb-1638820218326");
        builder0.includeCollection = "mongodb-1638820218363";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoAdminPassword("include_fields");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str12 = builder11.getmongoCollection();
        builder11.setdropCollection(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet18 = builder17.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder17.advancedTransformation(false);
        builder17.setimportAllCollections(false);
        builder17.riverName = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder25.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet28 = builder27.parentTypes;
        boolean boolean29 = builder27.skipInitialImport;
        java.lang.String[] strArray60 = new java.lang.String[] { "disable_index_refresh", "port", "secondary_read_preference", "import_all_collections", "bulk_timeout", "type", "script", "mongodb-1638820218449", "options", "gridfs", "port", "throttle_size", "ssl", "concurrent_bulk_requests", "hi!", "advanced_transformation", "bulk_size", "local", "name", "exclude_fields", "import_all_collections", "script_type", "socket_timeout", "type", "store_statistics", "store_statistics", "servers", "localhost", "ssl", "ssl_verify_certificate" };
        java.util.LinkedHashSet<java.lang.String> strSet61 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet61, strArray60);
        builder27.setincludeFields((java.util.Set<java.lang.String>) strSet61);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder64 = builder17.includeFields((java.util.Set<java.lang.String>) strSet61);
        builder11.parentTypes = strSet61;
        builder10.parentTypes = strSet61;
        boolean boolean67 = builder10.dropCollection;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNull(strSet18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNull(strSet28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("mongodb-1638820218449", "skip_initial_import", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?skip_initial_import?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        int int6 = builder2.getsocketTimeout();
        builder2.setmongoSecondaryReadPreference(false);
        builder2.setskipInitialImport(true);
        com.mongodb.BasicDBObject basicDBObject11 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder2.mongoOplogFilter(basicDBObject11);
        builder2.setmongoCollection("index");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString11();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString17();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString18();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString16();
        org.elasticsearch.river.RiverSettings riverSettings6 = serializedObjectSupporter0.deserializeObjectRiverSettings5();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb-1638820218387" + "'", str1, "mongodb-1638820218387");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mongodb-1638820218449" + "'", str2, "mongodb-1638820218449");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "mongodb-1638820218326" + "'", str3, "mongodb-1638820218326");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_river" + "'", str4, "_river");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_river" + "'", str5, "_river");
        org.junit.Assert.assertNull(riverSettings6);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        int int6 = builder2.getsocketTimeout();
        builder2.setmongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet12 = builder11.parentTypes;
        java.util.List<com.mongodb.ServerAddress> serverAddressList13 = builder11.mongoServers;
        builder2.setmongoServers(serverAddressList13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder2.throttleSize((int) (short) 1);
        java.lang.String str17 = builder2.getindexName();
        java.util.Set<java.lang.String> strSet18 = builder2.parentTypes;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNull(strSet12);
        org.junit.Assert.assertNotNull(serverAddressList13);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(strSet18);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("host", "index");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?index?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getADMIN_DB_FIELD();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue11 = mongoDBRiverDefinition8.getDEFAULT_BULK_SIZE();
        boolean boolean12 = mongoDBRiverDefinition8.getmongoGridFS();
        boolean boolean13 = mongoDBRiverDefinition8.mongoGridFS;
        java.lang.String str14 = mongoDBRiverDefinition8.getBULK_SIZE_FIELD();
        boolean boolean15 = mongoDBRiverDefinition8.isMongoUseSSL();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertNotNull(byteSizeValue11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "bulk_size" + "'", str14, "bulk_size");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        java.lang.String str6 = builder5.mongoAdminPassword;
        java.lang.String str7 = builder5.mongoCollection;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "size" + "'", str7, "size");
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getADMIN_DB_FIELD();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue11 = mongoDBRiverDefinition8.getDEFAULT_BULK_SIZE();
        boolean boolean12 = mongoDBRiverDefinition8.getmongoGridFS();
        boolean boolean13 = mongoDBRiverDefinition8.mongoGridFS;
        java.util.Set<java.lang.String> strSet14 = mongoDBRiverDefinition8.parentTypes;
        java.lang.String str15 = mongoDBRiverDefinition8.getSKIP_INITIAL_IMPORT_FIELD();
        boolean boolean16 = mongoDBRiverDefinition8.mongoGridFS;
        boolean boolean17 = mongoDBRiverDefinition8.mongoUseSSL;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertNotNull(byteSizeValue11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(strSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "skip_initial_import" + "'", str15, "skip_initial_import");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet9 = builder8.parentTypes;
        builder8.indexName = "disable_index_refresh";
        builder8.setriverName("ssl_verify_certificate");
        builder8.setmongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = builder8.initialTimestamp;
        builder8.riverIndexName = "db";
        docScoreSearchScript0.setNextVar("null.size", (java.lang.Object) builder8);
        org.apache.lucene.search.Scorer scorer20 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setScorer(scorer20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "user" + "'", obj2, "user");
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + false + "'", obj4, false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(strSet9);
        org.junit.Assert.assertNull(wildcardTimestamp16);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.advancedTransformation(false);
        builder2.setimportAllCollections(false);
        builder2.riverName = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet13 = builder12.parentTypes;
        boolean boolean14 = builder12.skipInitialImport;
        java.lang.String[] strArray45 = new java.lang.String[] { "disable_index_refresh", "port", "secondary_read_preference", "import_all_collections", "bulk_timeout", "type", "script", "mongodb-1638820218449", "options", "gridfs", "port", "throttle_size", "ssl", "concurrent_bulk_requests", "hi!", "advanced_transformation", "bulk_size", "local", "name", "exclude_fields", "import_all_collections", "script_type", "socket_timeout", "type", "store_statistics", "store_statistics", "servers", "localhost", "ssl", "ssl_verify_certificate" };
        java.util.LinkedHashSet<java.lang.String> strSet46 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet46, strArray45);
        builder12.setincludeFields((java.util.Set<java.lang.String>) strSet46);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder2.includeFields((java.util.Set<java.lang.String>) strSet46);
        builder49.storeStatistics = false;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(strSet13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(builder49);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getSCRIPT_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getACTIONS_FIELD();
        java.lang.String str11 = mongoDBRiverDefinition8.getFILTER_FIELD();
        java.lang.String str12 = mongoDBRiverDefinition8.getSKIP_INITIAL_IMPORT_FIELD();
        boolean boolean13 = mongoDBRiverDefinition8.getmongoGridFS();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "script" + "'", str9, "script");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "actions" + "'", str10, "actions");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "filter" + "'", str11, "filter");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "skip_initial_import" + "'", str12, "skip_initial_import");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getADMIN_DB_FIELD();
        boolean boolean11 = mongoDBRiverDefinition8.mongoSecondaryReadPreference;
        java.lang.String str12 = mongoDBRiverDefinition8.getDROP_COLLECTION_FIELD();
        java.lang.String str13 = mongoDBRiverDefinition8.getBULK_TIMEOUT_FIELD();
        boolean boolean14 = mongoDBRiverDefinition8.isImportAllCollections();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "drop_collection" + "'", str12, "drop_collection");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "bulk_timeout" + "'", str13, "bulk_timeout");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions4 = null;
        builder2.setmongoClientOptions(mongoClientOptions4);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getACTIONS_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getDB_FIELD();
        boolean boolean11 = mongoDBRiverDefinition8.getadvancedTransformation();
        java.lang.String str12 = mongoDBRiverDefinition8.getDROP_COLLECTION_FIELD();
        java.lang.Class<?> wildcardClass13 = mongoDBRiverDefinition8.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "actions" + "'", str9, "actions");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "db" + "'", str10, "db");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "drop_collection" + "'", str12, "drop_collection");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        java.lang.Object obj7 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        docScoreSearchScript0.setNextScore((float) (byte) 100);
        java.lang.Object obj11 = docScoreSearchScript0.unwrap((java.lang.Object) (-1));
        org.apache.lucene.search.Scorer scorer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setScorer(scorer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (-1L) + "'", obj2, (-1L));
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + false + "'", obj7, false);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + (-1) + "'", obj11, (-1));
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder1.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet4 = builder3.parentTypes;
        java.lang.String str5 = builder3.getriverIndexName();
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory6 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject8 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript9 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject8);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory10 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject12 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript13 = docScoreNativeScriptFactory10.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject12);
        com.mongodb.BasicDBObject basicDBObject15 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript16 = docScoreNativeScriptFactory10.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject15);
        org.elasticsearch.script.ExecutableScript executableScript17 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject15);
        org.elasticsearch.common.settings.Settings settings18 = null;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory19 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject21 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript22 = docScoreNativeScriptFactory19.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject21);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory23 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject25 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript26 = docScoreNativeScriptFactory23.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject25);
        com.mongodb.BasicDBObject basicDBObject28 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript29 = docScoreNativeScriptFactory23.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject28);
        org.elasticsearch.script.ExecutableScript executableScript30 = docScoreNativeScriptFactory19.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject28);
        org.elasticsearch.river.RiverSettings riverSettings31 = new org.elasticsearch.river.RiverSettings(settings18, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject28);
        org.elasticsearch.script.ExecutableScript executableScript32 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject28);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder3.mongoOplogFilter(basicDBObject28);
        org.elasticsearch.river.RiverSettings riverSettings34 = new org.elasticsearch.river.RiverSettings(settings0, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject28);
        java.util.Map<java.lang.String, java.lang.Object> strMap35 = riverSettings34.settings();
        org.elasticsearch.common.settings.Settings settings36 = riverSettings34.globalSettings();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(basicDBObject8);
        org.junit.Assert.assertNotNull(executableScript9);
        org.junit.Assert.assertNotNull(basicDBObject12);
        org.junit.Assert.assertNotNull(executableScript13);
        org.junit.Assert.assertNotNull(basicDBObject15);
        org.junit.Assert.assertNotNull(executableScript16);
        org.junit.Assert.assertNotNull(executableScript17);
        org.junit.Assert.assertNotNull(basicDBObject21);
        org.junit.Assert.assertNotNull(executableScript22);
        org.junit.Assert.assertNotNull(basicDBObject25);
        org.junit.Assert.assertNotNull(executableScript26);
        org.junit.Assert.assertNotNull(basicDBObject28);
        org.junit.Assert.assertNotNull(executableScript29);
        org.junit.Assert.assertNotNull(executableScript30);
        org.junit.Assert.assertNotNull(executableScript32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(strMap35);
        org.junit.Assert.assertNull(settings36);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        java.lang.String str8 = builder5.mongoAdminUser;
        builder5.mongoUseSSL = false;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        boolean boolean10 = mongoDBRiverDefinition8.getmongoGridFS();
        com.mongodb.BasicDBObject basicDBObject11 = mongoDBRiverDefinition8.mongoOplogFilter;
        java.util.Set<java.lang.String> strSet12 = mongoDBRiverDefinition8.getIncludeFields();
        java.lang.String str13 = mongoDBRiverDefinition8.getDROP_COLLECTION_FIELD();
        java.lang.String str14 = mongoDBRiverDefinition8.getUSER_FIELD();
        java.lang.String str15 = mongoDBRiverDefinition8.getStatisticsTypeName();
        int int16 = mongoDBRiverDefinition8.connectTimeout;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(basicDBObject11);
        org.junit.Assert.assertNull(strSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "drop_collection" + "'", str13, "drop_collection");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "user" + "'", str14, "user");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings1 = serializedObjectSupporter0.deserializeObjectRiverSettings5();
        org.elasticsearch.river.RiverSettings riverSettings2 = serializedObjectSupporter0.deserializeObjectRiverSettings2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString14();
        org.junit.Assert.assertNull(riverSettings1);
        org.junit.Assert.assertNull(riverSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_river" + "'", str3, "_river");
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        builder0.mongoAdminPassword = "name";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.mongoAdminPassword("index");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.dropCollection(false);
        com.mongodb.BasicDBObject basicDBObject11 = builder10.getmongoOplogFilter();
        com.mongodb.MongoClientOptions mongoClientOptions12 = null;
        builder10.setmongoClientOptions(mongoClientOptions12);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNull(basicDBObject11);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.getmongoCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.riverName("flush_interval");
        boolean boolean4 = builder3.getimportAllCollections();
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter5 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str6 = serializedObjectSupporter5.deserializeObjectString11();
        java.lang.String str7 = serializedObjectSupporter5.deserializeObjectString17();
        java.lang.String str8 = serializedObjectSupporter5.deserializeObjectString7();
        org.elasticsearch.river.RiverSettings riverSettings9 = serializedObjectSupporter5.deserializeObjectRiverSettings8();
        org.elasticsearch.river.RiverSettings riverSettings10 = serializedObjectSupporter5.deserializeObjectRiverSettings6();
        org.elasticsearch.river.RiverSettings riverSettings11 = serializedObjectSupporter5.deserializeObjectRiverSettings4();
        java.lang.String str12 = serializedObjectSupporter5.deserializeObjectString18();
        builder3.serializedObjectSupporter = serializedObjectSupporter5;
        builder3.settypeName("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "mongodb-1638820218387" + "'", str6, "mongodb-1638820218387");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongodb-1638820218449" + "'", str7, "mongodb-1638820218449");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "mongodb-1638820218326" + "'", str8, "mongodb-1638820218326");
        org.junit.Assert.assertNull(riverSettings9);
        org.junit.Assert.assertNull(riverSettings10);
        org.junit.Assert.assertNull(riverSettings11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_river" + "'", str12, "_river");
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("size", "mongodb-1638820218264", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?mongodb-1638820218264?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings1 = serializedObjectSupporter0.deserializeObjectRiverSettings9();
        org.elasticsearch.river.RiverSettings riverSettings2 = serializedObjectSupporter0.deserializeObjectRiverSettings5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString9();
        org.junit.Assert.assertNull(riverSettings1);
        org.junit.Assert.assertNull(riverSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "mongodb-1638820218363" + "'", str3, "mongodb-1638820218363");
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getADMIN_DB_FIELD();
        java.lang.String str11 = mongoDBRiverDefinition8.getNAME_FIELD();
        boolean boolean12 = mongoDBRiverDefinition8.mongoGridFS;
        java.lang.String str13 = mongoDBRiverDefinition8.getSCRIPT_TYPE_FIELD();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "name" + "'", str11, "name");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "script_type" + "'", str13, "script_type");
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings1 = serializedObjectSupporter0.deserializeObjectRiverSettings9();
        org.elasticsearch.river.RiverSettings riverSettings2 = serializedObjectSupporter0.deserializeObjectRiverSettings5();
        org.elasticsearch.river.RiverSettings riverSettings3 = serializedObjectSupporter0.deserializeObjectRiverSettings2();
        org.junit.Assert.assertNull(riverSettings1);
        org.junit.Assert.assertNull(riverSettings2);
        org.junit.Assert.assertNull(riverSettings3);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        builder0.mongoAdminPassword = "name";
        builder0.mongoSSLVerifyCertificate = true;
        builder0.setmongoLocalPassword("throttle_size");
        builder0.settypeName("mongodb-1638820218424");
        int int11 = builder0.getconnectTimeout();
        builder0.setmongoSecondaryReadPreference(true);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        builder0.mongoAdminPassword = "name";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoUseSSL(false);
        builder6.setmongoAdminUser("throttle_size");
        java.lang.Class<?> wildcardClass9 = builder6.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("actions");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?actions?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder0.includeFields;
        boolean boolean4 = builder0.getmongoGridFS();
        java.util.Set<java.lang.String> strSet5 = builder0.parentTypes;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.advancedTransformation(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.advancedTransformation(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory11 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject13 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript14 = docScoreNativeScriptFactory11.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject13);
        builder8.setmongoCollectionFilter(basicDBObject13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder8.mongoDb("mongodb-1638820218387");
        java.lang.String[] strArray23 = new java.lang.String[] { "throttle_size", "", "db", "db", "local" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        builder8.setparentTypes((java.util.Set<java.lang.String>) strSet24);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder0.parentTypes((java.util.Set<java.lang.String>) strSet24);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet31 = builder30.parentTypes;
        java.util.List<com.mongodb.ServerAddress> serverAddressList32 = builder30.mongoServers;
        builder27.mongoServers = serverAddressList32;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder27.skipInitialImport(true);
        java.lang.String str36 = builder27.getindexName();
        java.lang.String str37 = builder27.riverIndexName;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(basicDBObject13);
        org.junit.Assert.assertNotNull(executableScript14);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNull(strSet31);
        org.junit.Assert.assertNotNull(serverAddressList32);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str37);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTypeName();
        java.lang.String str10 = mongoDBRiverDefinition8.getMongoDb();
        java.lang.String str11 = mongoDBRiverDefinition8.getDROP_COLLECTION_FIELD();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "drop_collection" + "'", str11, "drop_collection");
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.parentTypes;
        boolean boolean4 = builder2.skipInitialImport;
        int int5 = builder2.getsocketTimeout();
        java.util.Set<java.lang.String> strSet6 = builder2.excludeFields;
        java.lang.String str7 = builder2.getstatisticsTypeName();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getSKIP_INITIAL_IMPORT_FIELD();
        boolean boolean10 = mongoDBRiverDefinition8.getmongoGridFS();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "skip_initial_import" + "'", str9, "skip_initial_import");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getADMIN_DB_FIELD();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue11 = mongoDBRiverDefinition8.getDEFAULT_BULK_SIZE();
        boolean boolean12 = mongoDBRiverDefinition8.getmongoGridFS();
        boolean boolean13 = mongoDBRiverDefinition8.mongoGridFS;
        boolean boolean14 = mongoDBRiverDefinition8.getmongoGridFS();
        java.lang.String str15 = mongoDBRiverDefinition8.riverIndexName;
        java.lang.String str16 = mongoDBRiverDefinition8.getSSL_VERIFY_CERT_FIELD();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertNotNull(byteSizeValue11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ssl_verify_certificate" + "'", str16, "ssl_verify_certificate");
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getADMIN_DB_FIELD();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue11 = mongoDBRiverDefinition8.getDEFAULT_BULK_SIZE();
        boolean boolean12 = mongoDBRiverDefinition8.getmongoGridFS();
        java.lang.String str13 = mongoDBRiverDefinition8.getMongoOplogNamespace();
        java.lang.String str14 = mongoDBRiverDefinition8.getPASSWORD_FIELD();
        boolean boolean15 = mongoDBRiverDefinition8.getadvancedTransformation();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertNotNull(byteSizeValue11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "null.size" + "'", str13, "null.size");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "password" + "'", str14, "password");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("mongodb-1638820218264", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet9 = builder8.parentTypes;
        builder8.indexName = "disable_index_refresh";
        builder8.setriverName("ssl_verify_certificate");
        builder8.setmongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = builder8.initialTimestamp;
        builder8.riverIndexName = "db";
        docScoreSearchScript0.setNextVar("null.size", (java.lang.Object) builder8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet24 = builder23.parentTypes;
        java.lang.String str25 = builder23.getriverIndexName();
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory26 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject28 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript29 = docScoreNativeScriptFactory26.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject28);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory30 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject32 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript33 = docScoreNativeScriptFactory30.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject32);
        com.mongodb.BasicDBObject basicDBObject35 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript36 = docScoreNativeScriptFactory30.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject35);
        org.elasticsearch.script.ExecutableScript executableScript37 = docScoreNativeScriptFactory26.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject35);
        org.elasticsearch.common.settings.Settings settings38 = null;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory39 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject41 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript42 = docScoreNativeScriptFactory39.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject41);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory43 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject45 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript46 = docScoreNativeScriptFactory43.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject45);
        com.mongodb.BasicDBObject basicDBObject48 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript49 = docScoreNativeScriptFactory43.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject48);
        org.elasticsearch.script.ExecutableScript executableScript50 = docScoreNativeScriptFactory39.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject48);
        org.elasticsearch.river.RiverSettings riverSettings51 = new org.elasticsearch.river.RiverSettings(settings38, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject48);
        org.elasticsearch.script.ExecutableScript executableScript52 = docScoreNativeScriptFactory26.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject48);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder23.mongoOplogFilter(basicDBObject48);
        boolean boolean54 = builder53.mongoUseSSL;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder53.mongoLocalPassword("_river");
        boolean boolean57 = builder56.dropCollection;
        java.util.List<com.mongodb.ServerAddress> serverAddressList58 = builder56.mongoServers;
        docScoreSearchScript0.setNextVar("local", (java.lang.Object) serverAddressList58);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj60 = docScoreSearchScript0.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "user" + "'", obj2, "user");
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + false + "'", obj4, false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(strSet9);
        org.junit.Assert.assertNull(wildcardTimestamp16);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNull(strSet24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(basicDBObject28);
        org.junit.Assert.assertNotNull(executableScript29);
        org.junit.Assert.assertNotNull(basicDBObject32);
        org.junit.Assert.assertNotNull(executableScript33);
        org.junit.Assert.assertNotNull(basicDBObject35);
        org.junit.Assert.assertNotNull(executableScript36);
        org.junit.Assert.assertNotNull(executableScript37);
        org.junit.Assert.assertNotNull(basicDBObject41);
        org.junit.Assert.assertNotNull(executableScript42);
        org.junit.Assert.assertNotNull(basicDBObject45);
        org.junit.Assert.assertNotNull(executableScript46);
        org.junit.Assert.assertNotNull(basicDBObject48);
        org.junit.Assert.assertNotNull(executableScript49);
        org.junit.Assert.assertNotNull(executableScript50);
        org.junit.Assert.assertNotNull(executableScript52);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(serverAddressList58);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getADMIN_DB_FIELD();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue11 = mongoDBRiverDefinition8.getDEFAULT_BULK_SIZE();
        boolean boolean12 = mongoDBRiverDefinition8.getmongoGridFS();
        boolean boolean13 = mongoDBRiverDefinition8.mongoGridFS;
        java.util.Set<java.lang.String> strSet14 = mongoDBRiverDefinition8.parentTypes;
        java.lang.String str15 = mongoDBRiverDefinition8.getSKIP_INITIAL_IMPORT_FIELD();
        java.lang.String str16 = mongoDBRiverDefinition8.getMongoOplogNamespace();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertNotNull(byteSizeValue11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(strSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "skip_initial_import" + "'", str15, "skip_initial_import");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "null.size" + "'", str16, "null.size");
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        builder0.mongoAdminPassword = "name";
        java.lang.String str5 = builder0.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet9 = builder8.parentTypes;
        boolean boolean10 = builder8.skipInitialImport;
        java.lang.String[] strArray41 = new java.lang.String[] { "disable_index_refresh", "port", "secondary_read_preference", "import_all_collections", "bulk_timeout", "type", "script", "mongodb-1638820218449", "options", "gridfs", "port", "throttle_size", "ssl", "concurrent_bulk_requests", "hi!", "advanced_transformation", "bulk_size", "local", "name", "exclude_fields", "import_all_collections", "script_type", "socket_timeout", "type", "store_statistics", "store_statistics", "servers", "localhost", "ssl", "ssl_verify_certificate" };
        java.util.LinkedHashSet<java.lang.String> strSet42 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet42, strArray41);
        builder8.setincludeFields((java.util.Set<java.lang.String>) strSet42);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder0.includeFields((java.util.Set<java.lang.String>) strSet42);
        java.lang.String str46 = builder45.getriverName();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(strSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNull(str46);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getADMIN_DB_FIELD();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue11 = mongoDBRiverDefinition8.getDEFAULT_BULK_SIZE();
        boolean boolean12 = mongoDBRiverDefinition8.getmongoGridFS();
        java.lang.String str13 = mongoDBRiverDefinition8.getMongoOplogNamespace();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = mongoDBRiverDefinition8.initialTimestamp;
        boolean boolean15 = mongoDBRiverDefinition8.getmongoUseSSL();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertNotNull(byteSizeValue11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "null.size" + "'", str13, "null.size");
        org.junit.Assert.assertNull(wildcardTimestamp14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        boolean boolean10 = mongoDBRiverDefinition8.getmongoGridFS();
        com.mongodb.BasicDBObject basicDBObject11 = mongoDBRiverDefinition8.mongoOplogFilter;
        java.util.Set<java.lang.String> strSet12 = mongoDBRiverDefinition8.getIncludeFields();
        java.lang.String str13 = mongoDBRiverDefinition8.typeName;
        java.lang.String str14 = mongoDBRiverDefinition8.includeCollection;
        java.lang.String str15 = mongoDBRiverDefinition8.getACTIONS_FIELD();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(basicDBObject11);
        org.junit.Assert.assertNull(strSet12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "actions" + "'", str15, "actions");
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        builder0.mongoAdminPassword = "name";
        java.lang.String str5 = builder0.mongoCollection;
        java.lang.String str6 = builder0.includeCollection;
        java.lang.String str7 = builder0.mongoLocalUser;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.parentTypes;
        java.lang.String str4 = builder2.getriverIndexName();
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory5 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject7 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript8 = docScoreNativeScriptFactory5.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject7);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory9 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject11 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript12 = docScoreNativeScriptFactory9.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject11);
        com.mongodb.BasicDBObject basicDBObject14 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript15 = docScoreNativeScriptFactory9.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject14);
        org.elasticsearch.script.ExecutableScript executableScript16 = docScoreNativeScriptFactory5.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject14);
        org.elasticsearch.common.settings.Settings settings17 = null;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory18 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject20 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript21 = docScoreNativeScriptFactory18.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject20);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory22 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject24 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript25 = docScoreNativeScriptFactory22.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject24);
        com.mongodb.BasicDBObject basicDBObject27 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript28 = docScoreNativeScriptFactory22.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject27);
        org.elasticsearch.script.ExecutableScript executableScript29 = docScoreNativeScriptFactory18.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject27);
        org.elasticsearch.river.RiverSettings riverSettings30 = new org.elasticsearch.river.RiverSettings(settings17, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject27);
        org.elasticsearch.script.ExecutableScript executableScript31 = docScoreNativeScriptFactory5.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject27);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder2.mongoOplogFilter(basicDBObject27);
        boolean boolean33 = builder32.mongoUseSSL;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder32.mongoLocalPassword("_river");
        boolean boolean36 = builder35.dropCollection;
        java.util.List<com.mongodb.ServerAddress> serverAddressList37 = builder35.mongoServers;
        java.lang.String str38 = builder35.getscriptType();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(basicDBObject7);
        org.junit.Assert.assertNotNull(executableScript8);
        org.junit.Assert.assertNotNull(basicDBObject11);
        org.junit.Assert.assertNotNull(executableScript12);
        org.junit.Assert.assertNotNull(basicDBObject14);
        org.junit.Assert.assertNotNull(executableScript15);
        org.junit.Assert.assertNotNull(executableScript16);
        org.junit.Assert.assertNotNull(basicDBObject20);
        org.junit.Assert.assertNotNull(executableScript21);
        org.junit.Assert.assertNotNull(basicDBObject24);
        org.junit.Assert.assertNotNull(executableScript25);
        org.junit.Assert.assertNotNull(basicDBObject27);
        org.junit.Assert.assertNotNull(executableScript28);
        org.junit.Assert.assertNotNull(executableScript29);
        org.junit.Assert.assertNotNull(executableScript31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(serverAddressList37);
        org.junit.Assert.assertNull(str38);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.parentTypes;
        boolean boolean4 = builder2.skipInitialImport;
        com.mongodb.MongoClientOptions mongoClientOptions5 = builder2.getmongoClientOptions();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder2.socketTimeout((int) (byte) -1);
        java.lang.String str8 = builder2.typeName;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(mongoClientOptions5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        java.lang.Object obj6 = null;
        docScoreSearchScript0.setNextVar("", obj6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet12 = builder11.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder11.mongoCollection("size");
        int int15 = builder11.getsocketTimeout();
        builder11.settypeName("initial_timestamp");
        builder11.setriverName("size");
        java.util.Set<java.lang.String> strSet20 = builder11.excludeFields;
        java.lang.String str21 = builder11.getmongoDb();
        docScoreSearchScript0.setNextVar("exclude_fields", (java.lang.Object) str21);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder24.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet27 = builder26.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder26.mongoCollection("size");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp30 = builder26.getinitialTimestamp();
        docScoreSearchScript0.setNextVar("skip_initial_import", (java.lang.Object) builder26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = docScoreSearchScript0.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "user" + "'", obj2, "user");
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + false + "'", obj4, false);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNull(strSet12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(strSet20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNull(strSet27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNull(wildcardTimestamp30);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getADMIN_DB_FIELD();
        java.lang.String str11 = mongoDBRiverDefinition8.getNAME_FIELD();
        boolean boolean12 = mongoDBRiverDefinition8.mongoUseSSL;
        boolean boolean13 = mongoDBRiverDefinition8.isAdvancedTransformation();
        boolean boolean14 = mongoDBRiverDefinition8.importAllCollections;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "name" + "'", str11, "name");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        boolean boolean10 = mongoDBRiverDefinition8.getmongoSecondaryReadPreference();
        boolean boolean11 = mongoDBRiverDefinition8.mongoSecondaryReadPreference;
        java.lang.String str12 = mongoDBRiverDefinition8.getHOST_FIELD();
        org.elasticsearch.common.unit.TimeValue timeValue13 = mongoDBRiverDefinition8.getDEFAULT_FLUSH_INTERVAL();
        java.lang.String str14 = mongoDBRiverDefinition8.getNAME_FIELD();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "host" + "'", str12, "host");
        org.junit.Assert.assertNotNull(timeValue13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "name" + "'", str14, "name");
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet9 = builder8.parentTypes;
        builder8.indexName = "disable_index_refresh";
        builder8.setriverName("ssl_verify_certificate");
        builder8.setmongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = builder8.initialTimestamp;
        builder8.riverIndexName = "db";
        docScoreSearchScript0.setNextVar("null.size", (java.lang.Object) builder8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet24 = builder23.parentTypes;
        java.lang.String str25 = builder23.getriverIndexName();
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory26 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject28 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript29 = docScoreNativeScriptFactory26.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject28);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory30 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject32 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript33 = docScoreNativeScriptFactory30.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject32);
        com.mongodb.BasicDBObject basicDBObject35 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript36 = docScoreNativeScriptFactory30.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject35);
        org.elasticsearch.script.ExecutableScript executableScript37 = docScoreNativeScriptFactory26.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject35);
        org.elasticsearch.common.settings.Settings settings38 = null;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory39 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject41 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript42 = docScoreNativeScriptFactory39.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject41);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory43 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject45 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript46 = docScoreNativeScriptFactory43.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject45);
        com.mongodb.BasicDBObject basicDBObject48 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript49 = docScoreNativeScriptFactory43.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject48);
        org.elasticsearch.script.ExecutableScript executableScript50 = docScoreNativeScriptFactory39.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject48);
        org.elasticsearch.river.RiverSettings riverSettings51 = new org.elasticsearch.river.RiverSettings(settings38, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject48);
        org.elasticsearch.script.ExecutableScript executableScript52 = docScoreNativeScriptFactory26.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject48);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder23.mongoOplogFilter(basicDBObject48);
        boolean boolean54 = builder53.mongoUseSSL;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder53.mongoLocalPassword("_river");
        boolean boolean57 = builder56.dropCollection;
        java.util.List<com.mongodb.ServerAddress> serverAddressList58 = builder56.mongoServers;
        docScoreSearchScript0.setNextVar("local", (java.lang.Object) serverAddressList58);
        // The following exception was thrown during execution in test generation
        try {
            double double60 = docScoreSearchScript0.runAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "user" + "'", obj2, "user");
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + false + "'", obj4, false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(strSet9);
        org.junit.Assert.assertNull(wildcardTimestamp16);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNull(strSet24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(basicDBObject28);
        org.junit.Assert.assertNotNull(executableScript29);
        org.junit.Assert.assertNotNull(basicDBObject32);
        org.junit.Assert.assertNotNull(executableScript33);
        org.junit.Assert.assertNotNull(basicDBObject35);
        org.junit.Assert.assertNotNull(executableScript36);
        org.junit.Assert.assertNotNull(executableScript37);
        org.junit.Assert.assertNotNull(basicDBObject41);
        org.junit.Assert.assertNotNull(executableScript42);
        org.junit.Assert.assertNotNull(basicDBObject45);
        org.junit.Assert.assertNotNull(executableScript46);
        org.junit.Assert.assertNotNull(basicDBObject48);
        org.junit.Assert.assertNotNull(executableScript49);
        org.junit.Assert.assertNotNull(executableScript50);
        org.junit.Assert.assertNotNull(executableScript52);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(serverAddressList58);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        java.lang.Object obj7 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        docScoreSearchScript0.setNextScore((float) (byte) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet13 = builder12.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder12.mongoCollection("size");
        int int16 = builder12.getsocketTimeout();
        builder12.setmongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder12.mongoSSLVerifyCertificate(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder12.indexName("password");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder22.mongoUseSSL(true);
        builder22.setthrottleSize((-1));
        java.util.List<com.mongodb.ServerAddress> serverAddressList27 = builder22.mongoServers;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder22.storeStatistics(false);
        builder29.setmongoUseSSL(true);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory32 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.common.settings.Settings settings33 = null;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory34 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject36 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript37 = docScoreNativeScriptFactory34.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject36);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory38 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject40 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript41 = docScoreNativeScriptFactory38.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject40);
        com.mongodb.BasicDBObject basicDBObject43 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript44 = docScoreNativeScriptFactory38.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject43);
        org.elasticsearch.script.ExecutableScript executableScript45 = docScoreNativeScriptFactory34.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject43);
        org.elasticsearch.river.RiverSettings riverSettings46 = new org.elasticsearch.river.RiverSettings(settings33, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject43);
        org.elasticsearch.script.ExecutableScript executableScript47 = docScoreNativeScriptFactory32.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject43);
        builder29.mongoCollectionFilter = basicDBObject43;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (-1L) + "'", obj2, (-1L));
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + false + "'", obj7, false);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(strSet13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(serverAddressList27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(basicDBObject36);
        org.junit.Assert.assertNotNull(executableScript37);
        org.junit.Assert.assertNotNull(basicDBObject40);
        org.junit.Assert.assertNotNull(executableScript41);
        org.junit.Assert.assertNotNull(basicDBObject43);
        org.junit.Assert.assertNotNull(executableScript44);
        org.junit.Assert.assertNotNull(executableScript45);
        org.junit.Assert.assertNotNull(executableScript47);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("mongodb-1638820218387", "include_fields");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?include_fields?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings1 = serializedObjectSupporter0.deserializeObjectRiverSettings9();
        org.elasticsearch.river.RiverSettings riverSettings2 = serializedObjectSupporter0.deserializeObjectRiverSettings5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString12();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString10();
        org.elasticsearch.river.RiverSettings riverSettings5 = serializedObjectSupporter0.deserializeObjectRiverSettings6();
        org.junit.Assert.assertNull(riverSettings1);
        org.junit.Assert.assertNull(riverSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_river" + "'", str3, "_river");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_river" + "'", str4, "_river");
        org.junit.Assert.assertNull(riverSettings5);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("drop_collection", "exclude_fields");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?exclude_fields?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.lang.String str3 = builder2.riverIndexName;
        builder2.statisticsIndexName = "store_statistics";
        builder2.setmongoSSLVerifyCertificate(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder2.importAllCollections(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder2.dropCollection(false);
        java.lang.String str12 = builder11.getincludeCollection();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.lang.String str3 = builder2.riverIndexName;
        builder2.statisticsIndexName = "store_statistics";
        builder2.setmongoSSLVerifyCertificate(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder2.importAllCollections(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder2.dropCollection(false);
        java.util.Set<java.lang.String> strSet12 = builder11.getparentTypes();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNull(strSet12);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        builder0.mongoAdminPassword = "name";
        builder0.setmongoAdminPassword("mongodb-1638820218326");
        java.lang.String str7 = builder0.gettypeName();
        builder0.setdropCollection(false);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getADMIN_DB_FIELD();
        java.util.List<com.mongodb.ServerAddress> serverAddressList11 = mongoDBRiverDefinition8.mongoServers;
        boolean boolean12 = mongoDBRiverDefinition8.isImportAllCollections();
        boolean boolean13 = mongoDBRiverDefinition8.skipInitialImport;
        java.lang.String str14 = mongoDBRiverDefinition8.getINITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD();
        boolean boolean15 = mongoDBRiverDefinition8.isStoreStatistics();
        java.lang.String str16 = mongoDBRiverDefinition8.getSCRIPT_TYPE_FIELD();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertNotNull(serverAddressList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "script_type" + "'", str14, "script_type");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "script_type" + "'", str16, "script_type");
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder0.includeFields;
        boolean boolean4 = builder0.getmongoGridFS();
        java.util.Set<java.lang.String> strSet5 = builder0.parentTypes;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.advancedTransformation(true);
        builder0.setriverIndexName("flush_interval");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet13 = builder12.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.advancedTransformation(false);
        builder14.mongoAdminPassword = "name";
        java.lang.String str19 = builder14.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet23 = builder22.parentTypes;
        boolean boolean24 = builder22.skipInitialImport;
        java.lang.String[] strArray55 = new java.lang.String[] { "disable_index_refresh", "port", "secondary_read_preference", "import_all_collections", "bulk_timeout", "type", "script", "mongodb-1638820218449", "options", "gridfs", "port", "throttle_size", "ssl", "concurrent_bulk_requests", "hi!", "advanced_transformation", "bulk_size", "local", "name", "exclude_fields", "import_all_collections", "script_type", "socket_timeout", "type", "store_statistics", "store_statistics", "servers", "localhost", "ssl", "ssl_verify_certificate" };
        java.util.LinkedHashSet<java.lang.String> strSet56 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet56, strArray55);
        builder22.setincludeFields((java.util.Set<java.lang.String>) strSet56);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = builder14.includeFields((java.util.Set<java.lang.String>) strSet56);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder12.excludeFields((java.util.Set<java.lang.String>) strSet56);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = builder0.includeFields((java.util.Set<java.lang.String>) strSet56);
        boolean boolean62 = builder0.mongoSecondaryReadPreference;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(strSet13);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNull(strSet23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        builder0.mongoAdminPassword = "name";
        boolean boolean5 = builder0.mongoSecondaryReadPreference;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory6 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject8 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript9 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject8);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory10 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject12 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript13 = docScoreNativeScriptFactory10.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject12);
        com.mongodb.BasicDBObject basicDBObject15 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript16 = docScoreNativeScriptFactory10.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject15);
        org.elasticsearch.script.ExecutableScript executableScript17 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject15);
        builder0.setmongoCollectionFilter(basicDBObject15);
        builder0.mongoLocalPassword = "initial_timestamp";
        com.mongodb.MongoClientOptions mongoClientOptions21 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder0.mongoClientOptions(mongoClientOptions21);
        builder0.setmongoLocalPassword("include_collection");
        java.lang.String str25 = builder0.getriverName();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(basicDBObject8);
        org.junit.Assert.assertNotNull(executableScript9);
        org.junit.Assert.assertNotNull(basicDBObject12);
        org.junit.Assert.assertNotNull(executableScript13);
        org.junit.Assert.assertNotNull(basicDBObject15);
        org.junit.Assert.assertNotNull(executableScript16);
        org.junit.Assert.assertNotNull(executableScript17);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        int int8 = builder5.getthrottleSize();
        java.util.Set<java.lang.String> strSet9 = builder5.parentTypes;
        java.util.List<com.mongodb.ServerAddress> serverAddressList10 = builder5.getmongoServers();
        java.lang.String str11 = builder5.getmongoAdminUser();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(strSet9);
        org.junit.Assert.assertNotNull(serverAddressList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoCollection("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoLocalUser("");
        builder2.setriverName("socket_timeout");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getADMIN_DB_FIELD();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue11 = mongoDBRiverDefinition8.getDEFAULT_BULK_SIZE();
        boolean boolean12 = mongoDBRiverDefinition8.getmongoGridFS();
        boolean boolean13 = mongoDBRiverDefinition8.isDisableIndexRefresh();
        boolean boolean14 = mongoDBRiverDefinition8.isStoreStatistics();
        boolean boolean15 = mongoDBRiverDefinition8.isImportAllCollections();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertNotNull(byteSizeValue11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getADMIN_DB_FIELD();
        java.lang.String str11 = mongoDBRiverDefinition8.getNAME_FIELD();
        boolean boolean12 = mongoDBRiverDefinition8.mongoGridFS;
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue13 = mongoDBRiverDefinition8.getDEFAULT_BULK_SIZE();
        java.lang.String str14 = mongoDBRiverDefinition8.getTypeName();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "name" + "'", str11, "name");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(byteSizeValue13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.socketTimeout(0);
        java.lang.String str8 = builder5.mongoDb;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings1 = serializedObjectSupporter0.deserializeObjectRiverSettings9();
        org.elasticsearch.river.RiverSettings riverSettings2 = serializedObjectSupporter0.deserializeObjectRiverSettings5();
        org.elasticsearch.river.RiverSettings riverSettings3 = serializedObjectSupporter0.deserializeObjectRiverSettings3();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString10();
        org.junit.Assert.assertNull(riverSettings1);
        org.junit.Assert.assertNull(riverSettings2);
        org.junit.Assert.assertNull(riverSettings3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_river" + "'", str4, "_river");
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        builder0.mongoAdminPassword = "name";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.mongoAdminPassword("index");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.dropCollection(false);
        java.lang.String str11 = builder10.mongoLocalUser;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.parentTypes;
        boolean boolean4 = builder2.skipInitialImport;
        com.mongodb.MongoClientOptions mongoClientOptions5 = builder2.getmongoClientOptions();
        builder2.mongoAdminPassword = "port";
        java.lang.String str8 = builder2.getincludeCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder2.typeName("flush_interval");
        java.lang.String str11 = builder10.statisticsTypeName;
        builder10.setdisableIndexRefresh(true);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(mongoClientOptions5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        builder2.mongoGridFS = true;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder2.mongoUseSSL(false);
        builder6.skipInitialImport = false;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getADMIN_DB_FIELD();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue11 = mongoDBRiverDefinition8.getDEFAULT_BULK_SIZE();
        boolean boolean12 = mongoDBRiverDefinition8.getmongoGridFS();
        boolean boolean13 = mongoDBRiverDefinition8.mongoGridFS;
        java.util.Set<java.lang.String> strSet14 = mongoDBRiverDefinition8.parentTypes;
        java.lang.String str15 = mongoDBRiverDefinition8.getSKIP_INITIAL_IMPORT_FIELD();
        boolean boolean16 = mongoDBRiverDefinition8.mongoGridFS;
        java.lang.String str17 = mongoDBRiverDefinition8.getSIZE_FIELD();
        java.lang.String str18 = mongoDBRiverDefinition8.getCONCURRENT_BULK_REQUESTS_FIELD();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertNotNull(byteSizeValue11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(strSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "skip_initial_import" + "'", str15, "skip_initial_import");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "size" + "'", str17, "size");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "concurrent_bulk_requests" + "'", str18, "concurrent_bulk_requests");
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getADMIN_DB_FIELD();
        int int11 = mongoDBRiverDefinition8.socketTimeout;
        java.lang.String str12 = mongoDBRiverDefinition8.riverIndexName;
        java.lang.String str13 = mongoDBRiverDefinition8.scriptType;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings1 = serializedObjectSupporter0.deserializeObjectRiverSettings4();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString16();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString16();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(riverSettings1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_river" + "'", str2, "_river");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_river" + "'", str3, "_river");
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.parentTypes;
        boolean boolean4 = builder2.skipInitialImport;
        java.lang.String[] strArray35 = new java.lang.String[] { "disable_index_refresh", "port", "secondary_read_preference", "import_all_collections", "bulk_timeout", "type", "script", "mongodb-1638820218449", "options", "gridfs", "port", "throttle_size", "ssl", "concurrent_bulk_requests", "hi!", "advanced_transformation", "bulk_size", "local", "name", "exclude_fields", "import_all_collections", "script_type", "socket_timeout", "type", "store_statistics", "store_statistics", "servers", "localhost", "ssl", "ssl_verify_certificate" };
        java.util.LinkedHashSet<java.lang.String> strSet36 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet36, strArray35);
        builder2.setincludeFields((java.util.Set<java.lang.String>) strSet36);
        boolean boolean39 = builder2.dropCollection;
        java.util.Set<java.lang.String> strSet40 = builder2.getparentTypes();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(strSet40);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.getmongoCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.riverName("flush_interval");
        builder3.importAllCollections = true;
        org.bson.types.BSONTimestamp bSONTimestamp6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder3.initialTimestamp(bSONTimestamp6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ts must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getADMIN_DB_FIELD();
        java.lang.String str11 = mongoDBRiverDefinition8.statisticsTypeName;
        boolean boolean12 = mongoDBRiverDefinition8.getdropCollection();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder0.includeFields;
        boolean boolean4 = builder0.getmongoGridFS();
        java.util.Set<java.lang.String> strSet5 = builder0.parentTypes;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.advancedTransformation(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.advancedTransformation(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory11 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject13 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript14 = docScoreNativeScriptFactory11.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject13);
        builder8.setmongoCollectionFilter(basicDBObject13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder8.mongoDb("mongodb-1638820218387");
        java.lang.String[] strArray23 = new java.lang.String[] { "throttle_size", "", "db", "db", "local" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        builder8.setparentTypes((java.util.Set<java.lang.String>) strSet24);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder0.parentTypes((java.util.Set<java.lang.String>) strSet24);
        java.util.List<com.mongodb.ServerAddress> serverAddressList28 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder0.mongoServers(serverAddressList28);
        java.lang.String str30 = builder29.getincludeCollection();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(basicDBObject13);
        org.junit.Assert.assertNotNull(executableScript14);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        builder0.mongoAdminPassword = "name";
        boolean boolean5 = builder0.mongoSecondaryReadPreference;
        com.mongodb.BasicDBObject basicDBObject6 = builder0.mongoOplogFilter;
        builder0.setdisableIndexRefresh(false);
        java.lang.String str9 = builder0.gettypeName();
        builder0.skipInitialImport = false;
        builder0.setmongoDb("admin");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(basicDBObject6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getACTIONS_FIELD();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = mongoDBRiverDefinition8.initialTimestamp;
        boolean boolean11 = mongoDBRiverDefinition8.isMongoUseSSL();
        java.lang.String str12 = mongoDBRiverDefinition8.getOPTIONS_FIELD();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "actions" + "'", str9, "actions");
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "options" + "'", str12, "options");
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        builder0.mongoAdminPassword = "name";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.mongoAdminPassword("index");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.dropCollection(false);
        builder0.setmongoGridFS(false);
        java.lang.String str13 = builder0.getmongoAdminUser();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString11();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString17();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString18();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString16();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString9();
        org.elasticsearch.river.RiverSettings riverSettings7 = serializedObjectSupporter0.deserializeObjectRiverSettings9();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb-1638820218387" + "'", str1, "mongodb-1638820218387");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mongodb-1638820218449" + "'", str2, "mongodb-1638820218449");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "mongodb-1638820218326" + "'", str3, "mongodb-1638820218326");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_river" + "'", str4, "_river");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_river" + "'", str5, "_river");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "mongodb-1638820218363" + "'", str6, "mongodb-1638820218363");
        org.junit.Assert.assertNull(riverSettings7);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("", "mongodb-1638820218363");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?mongodb-1638820218363?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        builder0.mongoAdminPassword = "name";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.mongoAdminPassword("index");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.dropCollection(false);
        com.mongodb.MongoClientOptions mongoClientOptions11 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.mongoClientOptions(mongoClientOptions11);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder0.disableIndexRefresh(true);
        java.lang.Class<?> wildcardClass15 = builder14.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet9 = builder8.parentTypes;
        builder8.indexName = "disable_index_refresh";
        builder8.setriverName("ssl_verify_certificate");
        builder8.setmongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = builder8.initialTimestamp;
        builder8.riverIndexName = "db";
        docScoreSearchScript0.setNextVar("null.size", (java.lang.Object) builder8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet24 = builder23.parentTypes;
        java.lang.String str25 = builder23.getriverIndexName();
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory26 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject28 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript29 = docScoreNativeScriptFactory26.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject28);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory30 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject32 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript33 = docScoreNativeScriptFactory30.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject32);
        com.mongodb.BasicDBObject basicDBObject35 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript36 = docScoreNativeScriptFactory30.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject35);
        org.elasticsearch.script.ExecutableScript executableScript37 = docScoreNativeScriptFactory26.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject35);
        org.elasticsearch.common.settings.Settings settings38 = null;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory39 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject41 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript42 = docScoreNativeScriptFactory39.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject41);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory43 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject45 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript46 = docScoreNativeScriptFactory43.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject45);
        com.mongodb.BasicDBObject basicDBObject48 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript49 = docScoreNativeScriptFactory43.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject48);
        org.elasticsearch.script.ExecutableScript executableScript50 = docScoreNativeScriptFactory39.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject48);
        org.elasticsearch.river.RiverSettings riverSettings51 = new org.elasticsearch.river.RiverSettings(settings38, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject48);
        org.elasticsearch.script.ExecutableScript executableScript52 = docScoreNativeScriptFactory26.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject48);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder23.mongoOplogFilter(basicDBObject48);
        boolean boolean54 = builder53.mongoUseSSL;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder53.mongoLocalPassword("_river");
        boolean boolean57 = builder56.dropCollection;
        java.util.List<com.mongodb.ServerAddress> serverAddressList58 = builder56.mongoServers;
        docScoreSearchScript0.setNextVar("local", (java.lang.Object) serverAddressList58);
        org.apache.lucene.index.AtomicReaderContext atomicReaderContext60 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextReader(atomicReaderContext60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "user" + "'", obj2, "user");
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + false + "'", obj4, false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(strSet9);
        org.junit.Assert.assertNull(wildcardTimestamp16);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNull(strSet24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(basicDBObject28);
        org.junit.Assert.assertNotNull(executableScript29);
        org.junit.Assert.assertNotNull(basicDBObject32);
        org.junit.Assert.assertNotNull(executableScript33);
        org.junit.Assert.assertNotNull(basicDBObject35);
        org.junit.Assert.assertNotNull(executableScript36);
        org.junit.Assert.assertNotNull(executableScript37);
        org.junit.Assert.assertNotNull(basicDBObject41);
        org.junit.Assert.assertNotNull(executableScript42);
        org.junit.Assert.assertNotNull(basicDBObject45);
        org.junit.Assert.assertNotNull(executableScript46);
        org.junit.Assert.assertNotNull(basicDBObject48);
        org.junit.Assert.assertNotNull(executableScript49);
        org.junit.Assert.assertNotNull(executableScript50);
        org.junit.Assert.assertNotNull(executableScript52);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(serverAddressList58);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.elasticsearch.common.settings.Settings settings2 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        org.elasticsearch.river.RiverSettings riverSettings4 = new org.elasticsearch.river.RiverSettings(settings2, strMap3);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = riverSettings4.settings();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = riverSettings4.settings();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = riverSettings4.settings();
        org.elasticsearch.script.ScriptService scriptService8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("ssl_verify_certificate", "flush_interval", riverSettings4, scriptService8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(strMap7);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        boolean boolean10 = mongoDBRiverDefinition8.getmongoGridFS();
        com.mongodb.BasicDBObject basicDBObject11 = mongoDBRiverDefinition8.mongoOplogFilter;
        java.util.Set<java.lang.String> strSet12 = mongoDBRiverDefinition8.getIncludeFields();
        java.util.Set<java.lang.String> strSet13 = mongoDBRiverDefinition8.includeFields;
        java.lang.String str14 = mongoDBRiverDefinition8.getCONCURRENT_BULK_REQUESTS_FIELD();
        java.lang.String str15 = mongoDBRiverDefinition8.getINDEX_OBJECT();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = mongoDBRiverDefinition8.getInitialTimestamp();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(basicDBObject11);
        org.junit.Assert.assertNull(strSet12);
        org.junit.Assert.assertNull(strSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "concurrent_bulk_requests" + "'", str14, "concurrent_bulk_requests");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "index" + "'", str15, "index");
        org.junit.Assert.assertNull(wildcardTimestamp16);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        java.lang.Object obj6 = null;
        docScoreSearchScript0.setNextVar("", obj6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet12 = builder11.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder11.mongoCollection("size");
        int int15 = builder11.getsocketTimeout();
        builder11.settypeName("initial_timestamp");
        builder11.setriverName("size");
        java.util.Set<java.lang.String> strSet20 = builder11.excludeFields;
        java.lang.String str21 = builder11.getmongoDb();
        docScoreSearchScript0.setNextVar("exclude_fields", (java.lang.Object) str21);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.util.Set<java.lang.String> strSet25 = builder24.getexcludeFields();
        com.mongodb.BasicDBObject basicDBObject26 = builder24.mongoCollectionFilter;
        docScoreSearchScript0.setNextVar("", (java.lang.Object) builder24);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet31 = builder30.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder30.mongoCollection("size");
        builder33.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition36 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder33);
        java.lang.String str37 = mongoDBRiverDefinition36.getTHROTTLE_SIZE_FIELD();
        boolean boolean38 = mongoDBRiverDefinition36.getmongoGridFS();
        com.mongodb.BasicDBObject basicDBObject39 = mongoDBRiverDefinition36.mongoOplogFilter;
        java.util.Set<java.lang.String> strSet40 = mongoDBRiverDefinition36.getIncludeFields();
        java.lang.String str41 = mongoDBRiverDefinition36.typeName;
        java.lang.String str42 = mongoDBRiverDefinition36.includeCollection;
        com.mongodb.BasicDBObject basicDBObject43 = mongoDBRiverDefinition36.mongoCollectionFilter;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "user" + "'", obj2, "user");
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + false + "'", obj4, false);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNull(strSet12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(strSet20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(strSet25);
        org.junit.Assert.assertNotNull(basicDBObject26);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNull(strSet31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "throttle_size" + "'", str37, "throttle_size");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(basicDBObject39);
        org.junit.Assert.assertNull(strSet40);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(basicDBObject43);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        builder0.mongoAdminPassword = "name";
        boolean boolean5 = builder0.mongoSecondaryReadPreference;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory6 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject8 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript9 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject8);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory10 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject12 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript13 = docScoreNativeScriptFactory10.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject12);
        com.mongodb.BasicDBObject basicDBObject15 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript16 = docScoreNativeScriptFactory10.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject15);
        org.elasticsearch.script.ExecutableScript executableScript17 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject15);
        builder0.setmongoCollectionFilter(basicDBObject15);
        builder0.mongoLocalPassword = "initial_timestamp";
        java.util.List<com.mongodb.ServerAddress> serverAddressList21 = builder0.mongoServers;
        java.lang.String str22 = builder0.scriptType;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(basicDBObject8);
        org.junit.Assert.assertNotNull(executableScript9);
        org.junit.Assert.assertNotNull(basicDBObject12);
        org.junit.Assert.assertNotNull(executableScript13);
        org.junit.Assert.assertNotNull(basicDBObject15);
        org.junit.Assert.assertNotNull(executableScript16);
        org.junit.Assert.assertNotNull(executableScript17);
        org.junit.Assert.assertNotNull(serverAddressList21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        builder0.mongoAdminPassword = "name";
        builder0.setmongoAdminPassword("mongodb-1638820218326");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.includeCollection("filter");
        org.bson.types.BSONTimestamp bSONTimestamp9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.initialTimestamp(bSONTimestamp9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ts must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        builder0.mongoAdminPassword = "name";
        java.lang.String str5 = builder0.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet9 = builder8.parentTypes;
        boolean boolean10 = builder8.skipInitialImport;
        java.lang.String[] strArray41 = new java.lang.String[] { "disable_index_refresh", "port", "secondary_read_preference", "import_all_collections", "bulk_timeout", "type", "script", "mongodb-1638820218449", "options", "gridfs", "port", "throttle_size", "ssl", "concurrent_bulk_requests", "hi!", "advanced_transformation", "bulk_size", "local", "name", "exclude_fields", "import_all_collections", "script_type", "socket_timeout", "type", "store_statistics", "store_statistics", "servers", "localhost", "ssl", "ssl_verify_certificate" };
        java.util.LinkedHashSet<java.lang.String> strSet42 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet42, strArray41);
        builder8.setincludeFields((java.util.Set<java.lang.String>) strSet42);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder0.includeFields((java.util.Set<java.lang.String>) strSet42);
        builder45.riverName = "disable_index_refresh";
        java.lang.String str48 = builder45.getriverIndexName();
        builder45.setindexName("secondary_read_preference");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(strSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNull(str48);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getACTIONS_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getDB_FIELD();
        boolean boolean11 = mongoDBRiverDefinition8.getadvancedTransformation();
        java.lang.String str12 = mongoDBRiverDefinition8.getDROP_COLLECTION_FIELD();
        boolean boolean13 = mongoDBRiverDefinition8.getimportAllCollections();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "actions" + "'", str9, "actions");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "db" + "'", str10, "db");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "drop_collection" + "'", str12, "drop_collection");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getADMIN_DB_FIELD();
        java.lang.String str11 = mongoDBRiverDefinition8.getNAME_FIELD();
        boolean boolean12 = mongoDBRiverDefinition8.mongoUseSSL;
        boolean boolean13 = mongoDBRiverDefinition8.isAdvancedTransformation();
        boolean boolean14 = mongoDBRiverDefinition8.getdisableIndexRefresh();
        boolean boolean15 = mongoDBRiverDefinition8.getmongoSSLVerifyCertificate();
        java.lang.String str16 = mongoDBRiverDefinition8.getMongoLocalUser();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "name" + "'", str11, "name");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getFLUSH_INTERVAL_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getCOLLECTION_FIELD();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = mongoDBRiverDefinition8.initialTimestamp;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "flush_interval" + "'", str9, "flush_interval");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "collection" + "'", str10, "collection");
        org.junit.Assert.assertNull(wildcardTimestamp11);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("gridfs", "localhost");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?localhost?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        boolean boolean9 = mongoDBRiverDefinition8.getadvancedTransformation();
        java.lang.String str10 = mongoDBRiverDefinition8.getDEFAULT_DB_HOST();
        java.lang.String str11 = mongoDBRiverDefinition8.getSOCKET_TIMEOUT();
        java.lang.String str12 = mongoDBRiverDefinition8.includeCollection;
        boolean boolean13 = mongoDBRiverDefinition8.getdropCollection();
        java.lang.String str14 = mongoDBRiverDefinition8.getMongoAdminPassword();
        java.lang.String str15 = mongoDBRiverDefinition8.getFLUSH_INTERVAL_FIELD();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "localhost" + "'", str10, "localhost");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "socket_timeout" + "'", str11, "socket_timeout");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "flush_interval" + "'", str15, "flush_interval");
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.advancedTransformation(false);
        builder4.mongoAdminPassword = "name";
        java.lang.String str9 = builder4.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet13 = builder12.parentTypes;
        boolean boolean14 = builder12.skipInitialImport;
        java.lang.String[] strArray45 = new java.lang.String[] { "disable_index_refresh", "port", "secondary_read_preference", "import_all_collections", "bulk_timeout", "type", "script", "mongodb-1638820218449", "options", "gridfs", "port", "throttle_size", "ssl", "concurrent_bulk_requests", "hi!", "advanced_transformation", "bulk_size", "local", "name", "exclude_fields", "import_all_collections", "script_type", "socket_timeout", "type", "store_statistics", "store_statistics", "servers", "localhost", "ssl", "ssl_verify_certificate" };
        java.util.LinkedHashSet<java.lang.String> strSet46 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet46, strArray45);
        builder12.setincludeFields((java.util.Set<java.lang.String>) strSet46);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder4.includeFields((java.util.Set<java.lang.String>) strSet46);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder2.excludeFields((java.util.Set<java.lang.String>) strSet46);
        java.lang.String str51 = builder2.getindexName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder2.mongoGridFS(false);
        builder53.setriverIndexName("options");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(strSet13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(builder53);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory3 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject5 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript6 = docScoreNativeScriptFactory3.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject5);
        builder0.setmongoCollectionFilter(basicDBObject5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.statisticsIndexName("name");
        org.elasticsearch.common.settings.Settings settings10 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.advancedTransformation(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory14 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject16 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript17 = docScoreNativeScriptFactory14.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject16);
        builder11.setmongoCollectionFilter(basicDBObject16);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder11.mongoDb("mongodb-1638820218387");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.advancedTransformation(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory24 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject26 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript27 = docScoreNativeScriptFactory24.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject26);
        builder21.setmongoCollectionFilter(basicDBObject26);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder21.mongoDb("mongodb-1638820218387");
        java.lang.String[] strArray36 = new java.lang.String[] { "throttle_size", "", "db", "db", "local" };
        java.util.LinkedHashSet<java.lang.String> strSet37 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet37, strArray36);
        builder21.setparentTypes((java.util.Set<java.lang.String>) strSet37);
        builder20.parentTypes = strSet37;
        com.mongodb.BasicDBObject basicDBObject41 = builder20.mongoCollectionFilter;
        org.elasticsearch.river.RiverSettings riverSettings42 = new org.elasticsearch.river.RiverSettings(settings10, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject41);
        builder9.mongoOplogFilter = basicDBObject41;
        builder9.mongoLocalPassword = "hi!";
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(basicDBObject5);
        org.junit.Assert.assertNotNull(executableScript6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(basicDBObject16);
        org.junit.Assert.assertNotNull(executableScript17);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(basicDBObject26);
        org.junit.Assert.assertNotNull(executableScript27);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(basicDBObject41);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        boolean boolean10 = mongoDBRiverDefinition8.getmongoGridFS();
        com.mongodb.BasicDBObject basicDBObject11 = mongoDBRiverDefinition8.mongoOplogFilter;
        java.util.Set<java.lang.String> strSet12 = mongoDBRiverDefinition8.getIncludeFields();
        java.lang.String str13 = mongoDBRiverDefinition8.getDROP_COLLECTION_FIELD();
        java.lang.String str14 = mongoDBRiverDefinition8.getSECONDARY_READ_PREFERENCE_FIELD();
        java.lang.String str15 = mongoDBRiverDefinition8.getINCLUDE_COLLECTION_FIELD();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(basicDBObject11);
        org.junit.Assert.assertNull(strSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "drop_collection" + "'", str13, "drop_collection");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "secondary_read_preference" + "'", str14, "secondary_read_preference");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "include_collection" + "'", str15, "include_collection");
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        builder2.setmongoGridFS(true);
        boolean boolean6 = builder2.disableIndexRefresh;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder2.statisticsTypeName("");
        builder2.advancedTransformation = true;
        boolean boolean11 = builder2.dropCollection;
        java.lang.String str12 = builder2.typeName;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        int int6 = builder2.getsocketTimeout();
        builder2.settypeName("initial_timestamp");
        int int9 = builder2.socketTimeout;
        java.lang.String str10 = builder2.getscript();
        builder2.settypeName("");
        builder2.mongoGridFS = true;
        builder2.throttleSize = '4';
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        builder0.mongoAdminPassword = "name";
        boolean boolean5 = builder0.mongoSecondaryReadPreference;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory6 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject8 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript9 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject8);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory10 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject12 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript13 = docScoreNativeScriptFactory10.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject12);
        com.mongodb.BasicDBObject basicDBObject15 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript16 = docScoreNativeScriptFactory10.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject15);
        org.elasticsearch.script.ExecutableScript executableScript17 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject15);
        builder0.setmongoCollectionFilter(basicDBObject15);
        builder0.mongoLocalPassword = "initial_timestamp";
        com.mongodb.MongoClientOptions mongoClientOptions21 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder0.mongoClientOptions(mongoClientOptions21);
        builder0.setmongoLocalPassword("include_collection");
        builder0.socketTimeout = (byte) 1;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(basicDBObject8);
        org.junit.Assert.assertNotNull(executableScript9);
        org.junit.Assert.assertNotNull(basicDBObject12);
        org.junit.Assert.assertNotNull(executableScript13);
        org.junit.Assert.assertNotNull(basicDBObject15);
        org.junit.Assert.assertNotNull(executableScript16);
        org.junit.Assert.assertNotNull(executableScript17);
        org.junit.Assert.assertNotNull(builder22);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("port", "db", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?db?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        builder2.setmongoGridFS(true);
        boolean boolean6 = builder2.disableIndexRefresh;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder2.disableIndexRefresh(false);
        java.lang.String str9 = builder2.getmongoDb();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getADMIN_DB_FIELD();
        boolean boolean11 = mongoDBRiverDefinition8.mongoSecondaryReadPreference;
        int int12 = mongoDBRiverDefinition8.getThrottleSize();
        java.lang.String str13 = mongoDBRiverDefinition8.getMongoOplogNamespace();
        java.lang.String str14 = mongoDBRiverDefinition8.getSSL_VERIFY_CERT_FIELD();
        int int15 = mongoDBRiverDefinition8.getDEFAULT_CONCURRENT_REQUESTS();
        boolean boolean16 = mongoDBRiverDefinition8.isMongoSSLVerifyCertificate();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "null.size" + "'", str13, "null.size");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ssl_verify_certificate" + "'", str14, "ssl_verify_certificate");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        boolean boolean10 = mongoDBRiverDefinition8.getmongoSecondaryReadPreference();
        boolean boolean11 = mongoDBRiverDefinition8.mongoSecondaryReadPreference;
        java.lang.String str12 = mongoDBRiverDefinition8.getHOST_FIELD();
        org.elasticsearch.common.unit.TimeValue timeValue13 = mongoDBRiverDefinition8.getDEFAULT_FLUSH_INTERVAL();
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter14 = mongoDBRiverDefinition8.serializedObjectSupporter;
        boolean boolean15 = mongoDBRiverDefinition8.storeStatistics;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "host" + "'", str12, "host");
        org.junit.Assert.assertNotNull(timeValue13);
        org.junit.Assert.assertNull(serializedObjectSupporter14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        builder0.mongoAdminPassword = "name";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoUseSSL(false);
        builder6.setmongoAdminUser("throttle_size");
        com.mongodb.MongoClientOptions mongoClientOptions9 = null;
        builder6.mongoClientOptions = mongoClientOptions9;
        builder6.setriverIndexName("script_type");
        builder6.riverName = "_river";
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory3 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject5 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript6 = docScoreNativeScriptFactory3.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject5);
        builder0.setmongoCollectionFilter(basicDBObject5);
        java.lang.String str8 = builder0.getriverIndexName();
        com.mongodb.MongoClientOptions mongoClientOptions9 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoClientOptions(mongoClientOptions9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet14 = builder13.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.advancedTransformation(false);
        builder15.mongoAdminPassword = "name";
        java.lang.String str20 = builder15.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet24 = builder23.parentTypes;
        boolean boolean25 = builder23.skipInitialImport;
        java.lang.String[] strArray56 = new java.lang.String[] { "disable_index_refresh", "port", "secondary_read_preference", "import_all_collections", "bulk_timeout", "type", "script", "mongodb-1638820218449", "options", "gridfs", "port", "throttle_size", "ssl", "concurrent_bulk_requests", "hi!", "advanced_transformation", "bulk_size", "local", "name", "exclude_fields", "import_all_collections", "script_type", "socket_timeout", "type", "store_statistics", "store_statistics", "servers", "localhost", "ssl", "ssl_verify_certificate" };
        java.util.LinkedHashSet<java.lang.String> strSet57 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet57, strArray56);
        builder23.setincludeFields((java.util.Set<java.lang.String>) strSet57);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder15.includeFields((java.util.Set<java.lang.String>) strSet57);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = builder13.excludeFields((java.util.Set<java.lang.String>) strSet57);
        builder0.includeFields = strSet57;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder64 = builder0.mongoSecondaryReadPreference(true);
        org.bson.types.BSONTimestamp bSONTimestamp65 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder66 = builder0.initialTimestamp(bSONTimestamp65);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ts must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(basicDBObject5);
        org.junit.Assert.assertNotNull(executableScript6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNull(strSet14);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNull(strSet24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder64);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.parentTypes;
        java.lang.String str4 = builder2.getriverIndexName();
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory5 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject7 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript8 = docScoreNativeScriptFactory5.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject7);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory9 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject11 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript12 = docScoreNativeScriptFactory9.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject11);
        com.mongodb.BasicDBObject basicDBObject14 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript15 = docScoreNativeScriptFactory9.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject14);
        org.elasticsearch.script.ExecutableScript executableScript16 = docScoreNativeScriptFactory5.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject14);
        org.elasticsearch.common.settings.Settings settings17 = null;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory18 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject20 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript21 = docScoreNativeScriptFactory18.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject20);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory22 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject24 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript25 = docScoreNativeScriptFactory22.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject24);
        com.mongodb.BasicDBObject basicDBObject27 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript28 = docScoreNativeScriptFactory22.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject27);
        org.elasticsearch.script.ExecutableScript executableScript29 = docScoreNativeScriptFactory18.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject27);
        org.elasticsearch.river.RiverSettings riverSettings30 = new org.elasticsearch.river.RiverSettings(settings17, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject27);
        org.elasticsearch.script.ExecutableScript executableScript31 = docScoreNativeScriptFactory5.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject27);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder2.mongoOplogFilter(basicDBObject27);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder2.statisticsIndexName("password");
        java.lang.String str35 = builder34.mongoLocalPassword;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder34.mongoLocalPassword("");
        boolean boolean38 = builder37.getadvancedTransformation();
        builder37.setmongoSecondaryReadPreference(false);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(basicDBObject7);
        org.junit.Assert.assertNotNull(executableScript8);
        org.junit.Assert.assertNotNull(basicDBObject11);
        org.junit.Assert.assertNotNull(executableScript12);
        org.junit.Assert.assertNotNull(basicDBObject14);
        org.junit.Assert.assertNotNull(executableScript15);
        org.junit.Assert.assertNotNull(executableScript16);
        org.junit.Assert.assertNotNull(basicDBObject20);
        org.junit.Assert.assertNotNull(executableScript21);
        org.junit.Assert.assertNotNull(basicDBObject24);
        org.junit.Assert.assertNotNull(executableScript25);
        org.junit.Assert.assertNotNull(basicDBObject27);
        org.junit.Assert.assertNotNull(executableScript28);
        org.junit.Assert.assertNotNull(executableScript29);
        org.junit.Assert.assertNotNull(executableScript31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        builder0.mongoAdminPassword = "name";
        builder0.mongoSSLVerifyCertificate = true;
        builder0.setmongoLocalPassword("throttle_size");
        builder0.settypeName("mongodb-1638820218424");
        int int11 = builder0.getconnectTimeout();
        java.lang.String str12 = builder0.getmongoDb();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder13.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet16 = builder15.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder15.mongoCollection("size");
        builder18.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder18);
        boolean boolean22 = mongoDBRiverDefinition21.getadvancedTransformation();
        java.lang.String str23 = mongoDBRiverDefinition21.getDEFAULT_DB_HOST();
        java.lang.String str24 = mongoDBRiverDefinition21.getINCLUDE_FIELDS_FIELD();
        java.lang.String str25 = mongoDBRiverDefinition21.getSECONDARY_READ_PREFERENCE_FIELD();
        java.lang.String str26 = mongoDBRiverDefinition21.getBULK_FIELD();
        java.lang.String str27 = mongoDBRiverDefinition21.getBULK_SIZE_FIELD();
        com.mongodb.BasicDBObject basicDBObject28 = mongoDBRiverDefinition21.getMongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder0.mongoCollectionFilter(basicDBObject28);
        int int30 = builder29.throttleSize;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNull(strSet16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "localhost" + "'", str23, "localhost");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "include_fields" + "'", str24, "include_fields");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "secondary_read_preference" + "'", str25, "secondary_read_preference");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "bulk" + "'", str26, "bulk");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "bulk_size" + "'", str27, "bulk_size");
        org.junit.Assert.assertNotNull(basicDBObject28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder0.includeFields;
        boolean boolean4 = builder0.getmongoGridFS();
        java.util.Set<java.lang.String> strSet5 = builder0.parentTypes;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.advancedTransformation(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.advancedTransformation(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory11 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject13 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript14 = docScoreNativeScriptFactory11.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject13);
        builder8.setmongoCollectionFilter(basicDBObject13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder8.mongoDb("mongodb-1638820218387");
        java.lang.String[] strArray23 = new java.lang.String[] { "throttle_size", "", "db", "db", "local" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        builder8.setparentTypes((java.util.Set<java.lang.String>) strSet24);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder0.parentTypes((java.util.Set<java.lang.String>) strSet24);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.throttleSize((int) (byte) 100);
        java.lang.String str30 = builder27.getmongoLocalPassword();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(basicDBObject13);
        org.junit.Assert.assertNotNull(executableScript14);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        builder0.mongoAdminPassword = "name";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.mongoAdminPassword("index");
        int int9 = builder0.getconnectTimeout();
        java.lang.String str10 = builder0.getriverIndexName();
        java.lang.String str11 = builder0.getmongoAdminUser();
        java.util.List<com.mongodb.ServerAddress> serverAddressList12 = builder0.mongoServers;
        int int13 = builder0.getthrottleSize();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(serverAddressList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString11();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString17();
        org.elasticsearch.river.RiverSettings riverSettings3 = serializedObjectSupporter0.deserializeObjectRiverSettings2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString11();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb-1638820218387" + "'", str1, "mongodb-1638820218387");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mongodb-1638820218449" + "'", str2, "mongodb-1638820218449");
        org.junit.Assert.assertNull(riverSettings3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb-1638820218387" + "'", str4, "mongodb-1638820218387");
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.elasticsearch.common.settings.Settings settings2 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder3.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet6 = builder5.parentTypes;
        java.lang.String str7 = builder5.getriverIndexName();
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory8 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject10 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript11 = docScoreNativeScriptFactory8.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject10);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory12 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject14 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript15 = docScoreNativeScriptFactory12.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject14);
        com.mongodb.BasicDBObject basicDBObject17 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript18 = docScoreNativeScriptFactory12.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject17);
        org.elasticsearch.script.ExecutableScript executableScript19 = docScoreNativeScriptFactory8.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject17);
        org.elasticsearch.common.settings.Settings settings20 = null;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory21 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject23 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript24 = docScoreNativeScriptFactory21.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject23);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory25 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject27 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript28 = docScoreNativeScriptFactory25.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject27);
        com.mongodb.BasicDBObject basicDBObject30 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript31 = docScoreNativeScriptFactory25.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject30);
        org.elasticsearch.script.ExecutableScript executableScript32 = docScoreNativeScriptFactory21.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject30);
        org.elasticsearch.river.RiverSettings riverSettings33 = new org.elasticsearch.river.RiverSettings(settings20, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject30);
        org.elasticsearch.script.ExecutableScript executableScript34 = docScoreNativeScriptFactory8.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject30);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder5.mongoOplogFilter(basicDBObject30);
        org.elasticsearch.river.RiverSettings riverSettings36 = new org.elasticsearch.river.RiverSettings(settings2, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject30);
        org.elasticsearch.script.ScriptService scriptService37 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition38 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("drop_collection", "concurrent_requests", riverSettings36, scriptService37);
        java.util.Map<java.lang.String, java.lang.Object> strMap39 = riverSettings36.settings();
        java.util.Map<java.lang.String, java.lang.Object> strMap40 = riverSettings36.settings();
        java.util.Map<java.lang.String, java.lang.Object> strMap41 = riverSettings36.settings();
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(basicDBObject10);
        org.junit.Assert.assertNotNull(executableScript11);
        org.junit.Assert.assertNotNull(basicDBObject14);
        org.junit.Assert.assertNotNull(executableScript15);
        org.junit.Assert.assertNotNull(basicDBObject17);
        org.junit.Assert.assertNotNull(executableScript18);
        org.junit.Assert.assertNotNull(executableScript19);
        org.junit.Assert.assertNotNull(basicDBObject23);
        org.junit.Assert.assertNotNull(executableScript24);
        org.junit.Assert.assertNotNull(basicDBObject27);
        org.junit.Assert.assertNotNull(executableScript28);
        org.junit.Assert.assertNotNull(basicDBObject30);
        org.junit.Assert.assertNotNull(executableScript31);
        org.junit.Assert.assertNotNull(executableScript32);
        org.junit.Assert.assertNotNull(executableScript34);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition38);
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertNotNull(strMap40);
        org.junit.Assert.assertNotNull(strMap41);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.parentTypes;
        java.lang.String str4 = builder2.getriverIndexName();
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory5 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject7 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript8 = docScoreNativeScriptFactory5.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject7);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory9 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject11 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript12 = docScoreNativeScriptFactory9.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject11);
        com.mongodb.BasicDBObject basicDBObject14 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript15 = docScoreNativeScriptFactory9.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject14);
        org.elasticsearch.script.ExecutableScript executableScript16 = docScoreNativeScriptFactory5.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject14);
        org.elasticsearch.common.settings.Settings settings17 = null;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory18 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject20 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript21 = docScoreNativeScriptFactory18.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject20);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory22 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject24 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript25 = docScoreNativeScriptFactory22.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject24);
        com.mongodb.BasicDBObject basicDBObject27 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript28 = docScoreNativeScriptFactory22.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject27);
        org.elasticsearch.script.ExecutableScript executableScript29 = docScoreNativeScriptFactory18.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject27);
        org.elasticsearch.river.RiverSettings riverSettings30 = new org.elasticsearch.river.RiverSettings(settings17, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject27);
        org.elasticsearch.script.ExecutableScript executableScript31 = docScoreNativeScriptFactory5.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject27);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder2.mongoOplogFilter(basicDBObject27);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder2.scriptType("host");
        java.lang.String str35 = builder34.riverIndexName;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(basicDBObject7);
        org.junit.Assert.assertNotNull(executableScript8);
        org.junit.Assert.assertNotNull(basicDBObject11);
        org.junit.Assert.assertNotNull(executableScript12);
        org.junit.Assert.assertNotNull(basicDBObject14);
        org.junit.Assert.assertNotNull(executableScript15);
        org.junit.Assert.assertNotNull(executableScript16);
        org.junit.Assert.assertNotNull(basicDBObject20);
        org.junit.Assert.assertNotNull(executableScript21);
        org.junit.Assert.assertNotNull(basicDBObject24);
        org.junit.Assert.assertNotNull(executableScript25);
        org.junit.Assert.assertNotNull(basicDBObject27);
        org.junit.Assert.assertNotNull(executableScript28);
        org.junit.Assert.assertNotNull(executableScript29);
        org.junit.Assert.assertNotNull(executableScript31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        boolean boolean10 = mongoDBRiverDefinition8.getmongoGridFS();
        com.mongodb.BasicDBObject basicDBObject11 = mongoDBRiverDefinition8.mongoOplogFilter;
        java.lang.String str12 = mongoDBRiverDefinition8.getTypeName();
        java.lang.String str13 = mongoDBRiverDefinition8.getTYPE_FIELD();
        com.mongodb.BasicDBObject basicDBObject14 = mongoDBRiverDefinition8.getMongoCollectionFilter();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(basicDBObject11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "type" + "'", str13, "type");
        org.junit.Assert.assertNotNull(basicDBObject14);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory3 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject5 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript6 = docScoreNativeScriptFactory3.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject5);
        builder0.setmongoCollectionFilter(basicDBObject5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.mongoDb("mongodb-1638820218387");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.advancedTransformation(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory13 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject15 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript16 = docScoreNativeScriptFactory13.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject15);
        builder10.setmongoCollectionFilter(basicDBObject15);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder10.mongoDb("mongodb-1638820218387");
        java.lang.String[] strArray25 = new java.lang.String[] { "throttle_size", "", "db", "db", "local" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        builder10.setparentTypes((java.util.Set<java.lang.String>) strSet26);
        builder9.parentTypes = strSet26;
        com.mongodb.BasicDBObject basicDBObject30 = builder9.mongoCollectionFilter;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder9.script("type");
        builder9.setstatisticsIndexName("exclude_fields");
        java.lang.String str35 = builder9.getscriptType();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(basicDBObject5);
        org.junit.Assert.assertNotNull(executableScript6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(basicDBObject15);
        org.junit.Assert.assertNotNull(executableScript16);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(basicDBObject30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        builder0.mongoAdminPassword = "name";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoUseSSL(false);
        java.lang.String str7 = builder0.includeCollection;
        boolean boolean8 = builder0.getskipInitialImport();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str10 = builder9.getmongoCollection();
        builder9.setdropCollection(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder13.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet16 = builder15.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder15.advancedTransformation(false);
        builder15.setimportAllCollections(false);
        builder15.riverName = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet26 = builder25.parentTypes;
        boolean boolean27 = builder25.skipInitialImport;
        java.lang.String[] strArray58 = new java.lang.String[] { "disable_index_refresh", "port", "secondary_read_preference", "import_all_collections", "bulk_timeout", "type", "script", "mongodb-1638820218449", "options", "gridfs", "port", "throttle_size", "ssl", "concurrent_bulk_requests", "hi!", "advanced_transformation", "bulk_size", "local", "name", "exclude_fields", "import_all_collections", "script_type", "socket_timeout", "type", "store_statistics", "store_statistics", "servers", "localhost", "ssl", "ssl_verify_certificate" };
        java.util.LinkedHashSet<java.lang.String> strSet59 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet59, strArray58);
        builder25.setincludeFields((java.util.Set<java.lang.String>) strSet59);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = builder15.includeFields((java.util.Set<java.lang.String>) strSet59);
        builder9.parentTypes = strSet59;
        builder0.excludeFields = strSet59;
        java.lang.Class<?> wildcardClass65 = strSet59.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNull(strSet16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNull(strSet26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory1 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript4 = docScoreNativeScriptFactory1.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject3);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory5 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject7 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript8 = docScoreNativeScriptFactory5.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject7);
        com.mongodb.BasicDBObject basicDBObject10 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript11 = docScoreNativeScriptFactory5.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject10);
        org.elasticsearch.script.ExecutableScript executableScript12 = docScoreNativeScriptFactory1.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject10);
        org.elasticsearch.river.RiverSettings riverSettings13 = new org.elasticsearch.river.RiverSettings(settings0, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject10);
        org.elasticsearch.common.settings.Settings settings14 = riverSettings13.globalSettings();
        org.junit.Assert.assertNotNull(basicDBObject3);
        org.junit.Assert.assertNotNull(executableScript4);
        org.junit.Assert.assertNotNull(basicDBObject7);
        org.junit.Assert.assertNotNull(executableScript8);
        org.junit.Assert.assertNotNull(basicDBObject10);
        org.junit.Assert.assertNotNull(executableScript11);
        org.junit.Assert.assertNotNull(executableScript12);
        org.junit.Assert.assertNull(settings14);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        int int6 = builder2.getsocketTimeout();
        builder2.setmongoSecondaryReadPreference(false);
        java.lang.String str9 = builder2.mongoAdminPassword;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder2.mongoUseSSL(false);
        org.bson.types.Binary binary12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.initialTimestamp(binary12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.advancedTransformation(false);
        java.lang.String str6 = builder5.getindexName();
        builder5.mongoDb = "throttle_size";
        java.lang.String str9 = builder5.getmongoAdminPassword();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder5.scriptType("");
        java.lang.String str12 = builder5.getmongoCollection();
        java.lang.String str13 = builder5.getindexName();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder0.includeFields;
        boolean boolean4 = builder0.storeStatistics;
        java.lang.Class<?> wildcardClass5 = builder0.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.lang.String str3 = builder2.riverIndexName;
        java.util.Set<java.lang.String> strSet4 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.includeFields(strSet4);
        java.lang.String str6 = builder2.riverIndexName;
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder2.getmongoClientOptions();
        builder2.statisticsIndexName = "_river";
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(mongoClientOptions7);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        boolean boolean9 = mongoDBRiverDefinition8.getadvancedTransformation();
        java.lang.String str10 = mongoDBRiverDefinition8.getDEFAULT_DB_HOST();
        java.lang.String str11 = mongoDBRiverDefinition8.getINCLUDE_FIELDS_FIELD();
        java.lang.String str12 = mongoDBRiverDefinition8.getSCRIPT_TYPE_FIELD();
        java.lang.String str13 = mongoDBRiverDefinition8.getRiverName();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "localhost" + "'", str10, "localhost");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "include_fields" + "'", str11, "include_fields");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "script_type" + "'", str12, "script_type");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings1 = serializedObjectSupporter0.deserializeObjectRiverSettings9();
        org.elasticsearch.river.RiverSettings riverSettings2 = serializedObjectSupporter0.deserializeObjectRiverSettings8();
        org.elasticsearch.river.RiverSettings riverSettings3 = serializedObjectSupporter0.deserializeObjectRiverSettings9();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString15();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString6();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString15();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString11();
        org.junit.Assert.assertNull(riverSettings1);
        org.junit.Assert.assertNull(riverSettings2);
        org.junit.Assert.assertNull(riverSettings3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb-1638820218424" + "'", str4, "mongodb-1638820218424");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_river" + "'", str5, "_river");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "mongodb-1638820218424" + "'", str6, "mongodb-1638820218424");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongodb-1638820218387" + "'", str7, "mongodb-1638820218387");
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        java.lang.Object obj6 = null;
        docScoreSearchScript0.setNextVar("", obj6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet12 = builder11.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder11.mongoCollection("size");
        int int15 = builder11.getsocketTimeout();
        builder11.settypeName("initial_timestamp");
        builder11.setriverName("size");
        java.util.Set<java.lang.String> strSet20 = builder11.excludeFields;
        java.lang.String str21 = builder11.getmongoDb();
        docScoreSearchScript0.setNextVar("exclude_fields", (java.lang.Object) str21);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder24.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet27 = builder26.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder26.mongoCollection("size");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp30 = builder26.getinitialTimestamp();
        docScoreSearchScript0.setNextVar("skip_initial_import", (java.lang.Object) builder26);
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextDocId((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "user" + "'", obj2, "user");
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + false + "'", obj4, false);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNull(strSet12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(strSet20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNull(strSet27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNull(wildcardTimestamp30);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.parentTypes;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.typeName("host");
        java.util.List<com.mongodb.ServerAddress> serverAddressList6 = builder5.getmongoServers();
        builder5.setconnectTimeout(1000);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(serverAddressList6);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.advancedTransformation(false);
        builder2.setimportAllCollections(false);
        builder2.riverName = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet13 = builder12.parentTypes;
        boolean boolean14 = builder12.skipInitialImport;
        java.lang.String[] strArray45 = new java.lang.String[] { "disable_index_refresh", "port", "secondary_read_preference", "import_all_collections", "bulk_timeout", "type", "script", "mongodb-1638820218449", "options", "gridfs", "port", "throttle_size", "ssl", "concurrent_bulk_requests", "hi!", "advanced_transformation", "bulk_size", "local", "name", "exclude_fields", "import_all_collections", "script_type", "socket_timeout", "type", "store_statistics", "store_statistics", "servers", "localhost", "ssl", "ssl_verify_certificate" };
        java.util.LinkedHashSet<java.lang.String> strSet46 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet46, strArray45);
        builder12.setincludeFields((java.util.Set<java.lang.String>) strSet46);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder2.includeFields((java.util.Set<java.lang.String>) strSet46);
        java.lang.String str50 = builder2.getincludeCollection();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(strSet13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setmongoAdminUser("disable_index_refresh");
        java.lang.String str8 = builder5.getmongoDb();
        boolean boolean9 = builder5.skipInitialImport;
        boolean boolean10 = builder5.getimportAllCollections();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder5.dropCollection(false);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder0.includeFields;
        boolean boolean4 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoLocalUser("gridfs");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet10 = builder9.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder9.mongoCollection("size");
        builder12.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder12);
        java.lang.String str16 = mongoDBRiverDefinition15.getTHROTTLE_SIZE_FIELD();
        java.lang.String str17 = mongoDBRiverDefinition15.getGRIDFS_FIELD();
        java.lang.String str18 = mongoDBRiverDefinition15.getINITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD();
        java.lang.String str19 = mongoDBRiverDefinition15.getTYPE_FIELD();
        java.util.List<com.mongodb.ServerAddress> serverAddressList20 = mongoDBRiverDefinition15.getMongoServers();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder6.mongoServers(serverAddressList20);
        org.bson.types.Binary binary22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.initialTimestamp(binary22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(strSet10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "throttle_size" + "'", str16, "throttle_size");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "gridfs" + "'", str17, "gridfs");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "script_type" + "'", str18, "script_type");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "type" + "'", str19, "type");
        org.junit.Assert.assertNotNull(serverAddressList20);
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        builder0.mongoAdminPassword = "name";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.mongoAdminPassword("index");
        int int9 = builder0.getconnectTimeout();
        java.lang.String str10 = builder0.getriverIndexName();
        java.lang.String str11 = builder0.getmongoAdminUser();
        boolean boolean12 = builder0.getimportAllCollections();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.parentTypes;
        java.lang.String str4 = builder2.getriverIndexName();
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory5 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject7 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript8 = docScoreNativeScriptFactory5.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject7);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory9 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject11 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript12 = docScoreNativeScriptFactory9.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject11);
        com.mongodb.BasicDBObject basicDBObject14 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript15 = docScoreNativeScriptFactory9.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject14);
        org.elasticsearch.script.ExecutableScript executableScript16 = docScoreNativeScriptFactory5.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject14);
        org.elasticsearch.common.settings.Settings settings17 = null;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory18 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject20 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript21 = docScoreNativeScriptFactory18.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject20);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory22 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject24 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript25 = docScoreNativeScriptFactory22.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject24);
        com.mongodb.BasicDBObject basicDBObject27 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript28 = docScoreNativeScriptFactory22.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject27);
        org.elasticsearch.script.ExecutableScript executableScript29 = docScoreNativeScriptFactory18.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject27);
        org.elasticsearch.river.RiverSettings riverSettings30 = new org.elasticsearch.river.RiverSettings(settings17, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject27);
        org.elasticsearch.script.ExecutableScript executableScript31 = docScoreNativeScriptFactory5.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject27);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder2.mongoOplogFilter(basicDBObject27);
        boolean boolean33 = builder32.mongoUseSSL;
        java.util.List<com.mongodb.ServerAddress> serverAddressList34 = builder32.getmongoServers();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp35 = builder32.initialTimestamp;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(basicDBObject7);
        org.junit.Assert.assertNotNull(executableScript8);
        org.junit.Assert.assertNotNull(basicDBObject11);
        org.junit.Assert.assertNotNull(executableScript12);
        org.junit.Assert.assertNotNull(basicDBObject14);
        org.junit.Assert.assertNotNull(executableScript15);
        org.junit.Assert.assertNotNull(executableScript16);
        org.junit.Assert.assertNotNull(basicDBObject20);
        org.junit.Assert.assertNotNull(executableScript21);
        org.junit.Assert.assertNotNull(basicDBObject24);
        org.junit.Assert.assertNotNull(executableScript25);
        org.junit.Assert.assertNotNull(basicDBObject27);
        org.junit.Assert.assertNotNull(executableScript28);
        org.junit.Assert.assertNotNull(executableScript29);
        org.junit.Assert.assertNotNull(executableScript31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(serverAddressList34);
        org.junit.Assert.assertNull(wildcardTimestamp35);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getADMIN_DB_FIELD();
        java.util.List<com.mongodb.ServerAddress> serverAddressList11 = mongoDBRiverDefinition8.mongoServers;
        boolean boolean12 = mongoDBRiverDefinition8.isImportAllCollections();
        boolean boolean13 = mongoDBRiverDefinition8.skipInitialImport;
        java.lang.String str14 = mongoDBRiverDefinition8.getINITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD();
        java.lang.String str15 = mongoDBRiverDefinition8.getINITIAL_TIMESTAMP_FIELD();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertNotNull(serverAddressList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "script_type" + "'", str14, "script_type");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "initial_timestamp" + "'", str15, "initial_timestamp");
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.parentTypes;
        java.lang.String str4 = builder2.getriverIndexName();
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory5 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject7 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript8 = docScoreNativeScriptFactory5.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject7);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory9 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject11 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript12 = docScoreNativeScriptFactory9.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject11);
        com.mongodb.BasicDBObject basicDBObject14 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript15 = docScoreNativeScriptFactory9.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject14);
        org.elasticsearch.script.ExecutableScript executableScript16 = docScoreNativeScriptFactory5.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject14);
        org.elasticsearch.common.settings.Settings settings17 = null;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory18 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject20 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript21 = docScoreNativeScriptFactory18.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject20);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory22 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject24 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript25 = docScoreNativeScriptFactory22.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject24);
        com.mongodb.BasicDBObject basicDBObject27 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript28 = docScoreNativeScriptFactory22.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject27);
        org.elasticsearch.script.ExecutableScript executableScript29 = docScoreNativeScriptFactory18.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject27);
        org.elasticsearch.river.RiverSettings riverSettings30 = new org.elasticsearch.river.RiverSettings(settings17, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject27);
        org.elasticsearch.script.ExecutableScript executableScript31 = docScoreNativeScriptFactory5.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject27);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder2.mongoOplogFilter(basicDBObject27);
        boolean boolean33 = builder32.mongoUseSSL;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder32.mongoLocalPassword("_river");
        java.lang.String str36 = builder35.getmongoLocalUser();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(basicDBObject7);
        org.junit.Assert.assertNotNull(executableScript8);
        org.junit.Assert.assertNotNull(basicDBObject11);
        org.junit.Assert.assertNotNull(executableScript12);
        org.junit.Assert.assertNotNull(basicDBObject14);
        org.junit.Assert.assertNotNull(executableScript15);
        org.junit.Assert.assertNotNull(executableScript16);
        org.junit.Assert.assertNotNull(basicDBObject20);
        org.junit.Assert.assertNotNull(executableScript21);
        org.junit.Assert.assertNotNull(basicDBObject24);
        org.junit.Assert.assertNotNull(executableScript25);
        org.junit.Assert.assertNotNull(basicDBObject27);
        org.junit.Assert.assertNotNull(executableScript28);
        org.junit.Assert.assertNotNull(executableScript29);
        org.junit.Assert.assertNotNull(executableScript31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        int int6 = builder2.getsocketTimeout();
        builder2.setmongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder2.mongoSSLVerifyCertificate(true);
        boolean boolean11 = builder2.getmongoGridFS();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder0.includeFields;
        boolean boolean4 = builder0.getmongoGridFS();
        java.util.Set<java.lang.String> strSet5 = builder0.parentTypes;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.advancedTransformation(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.advancedTransformation(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory11 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject13 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript14 = docScoreNativeScriptFactory11.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject13);
        builder8.setmongoCollectionFilter(basicDBObject13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder8.mongoDb("mongodb-1638820218387");
        java.lang.String[] strArray23 = new java.lang.String[] { "throttle_size", "", "db", "db", "local" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        builder8.setparentTypes((java.util.Set<java.lang.String>) strSet24);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder0.parentTypes((java.util.Set<java.lang.String>) strSet24);
        org.bson.types.BSONTimestamp bSONTimestamp28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder0.initialTimestamp(bSONTimestamp28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ts must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(basicDBObject13);
        org.junit.Assert.assertNotNull(executableScript14);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(builder27);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        java.lang.Object obj6 = null;
        docScoreSearchScript0.setNextVar("", obj6);
        org.apache.lucene.search.Scorer scorer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setScorer(scorer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "user" + "'", obj2, "user");
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + false + "'", obj4, false);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory3 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject5 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript6 = docScoreNativeScriptFactory3.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject5);
        builder0.setmongoCollectionFilter(basicDBObject5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.mongoDb("mongodb-1638820218387");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.advancedTransformation(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory13 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject15 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript16 = docScoreNativeScriptFactory13.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject15);
        builder10.setmongoCollectionFilter(basicDBObject15);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder10.mongoDb("mongodb-1638820218387");
        java.lang.String[] strArray25 = new java.lang.String[] { "throttle_size", "", "db", "db", "local" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        builder10.setparentTypes((java.util.Set<java.lang.String>) strSet26);
        builder9.parentTypes = strSet26;
        com.mongodb.BasicDBObject basicDBObject30 = builder9.mongoCollectionFilter;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder9.importAllCollections(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition33 = builder9.build();
        java.lang.String str34 = builder9.mongoAdminPassword;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(basicDBObject5);
        org.junit.Assert.assertNotNull(executableScript6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(basicDBObject15);
        org.junit.Assert.assertNotNull(executableScript16);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(basicDBObject30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString11();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString6();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString18();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb-1638820218387" + "'", str1, "mongodb-1638820218387");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_river" + "'", str2, "_river");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_river" + "'", str3, "_river");
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        java.lang.Object obj7 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextSource(strMap8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (-1L) + "'", obj2, (-1L));
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + false + "'", obj7, false);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString11();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString17();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        org.elasticsearch.river.RiverSettings riverSettings4 = serializedObjectSupporter0.deserializeObjectRiverSettings8();
        org.elasticsearch.river.RiverSettings riverSettings5 = serializedObjectSupporter0.deserializeObjectRiverSettings6();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString11();
        org.elasticsearch.river.RiverSettings riverSettings7 = serializedObjectSupporter0.deserializeObjectRiverSettings3();
        org.elasticsearch.river.RiverSettings riverSettings8 = serializedObjectSupporter0.deserializeObjectRiverSettings3();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString9();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString11();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb-1638820218387" + "'", str1, "mongodb-1638820218387");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mongodb-1638820218449" + "'", str2, "mongodb-1638820218449");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "mongodb-1638820218326" + "'", str3, "mongodb-1638820218326");
        org.junit.Assert.assertNull(riverSettings4);
        org.junit.Assert.assertNull(riverSettings5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "mongodb-1638820218387" + "'", str6, "mongodb-1638820218387");
        org.junit.Assert.assertNull(riverSettings7);
        org.junit.Assert.assertNull(riverSettings8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "mongodb-1638820218363" + "'", str9, "mongodb-1638820218363");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_river" + "'", str10, "_river");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "mongodb-1638820218387" + "'", str11, "mongodb-1638820218387");
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getADMIN_DB_FIELD();
        java.util.List<com.mongodb.ServerAddress> serverAddressList11 = mongoDBRiverDefinition8.mongoServers;
        boolean boolean12 = mongoDBRiverDefinition8.isImportAllCollections();
        boolean boolean13 = mongoDBRiverDefinition8.skipInitialImport;
        java.lang.String str14 = mongoDBRiverDefinition8.getINITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD();
        java.lang.String str15 = mongoDBRiverDefinition8.getSECONDARY_READ_PREFERENCE_FIELD();
        java.lang.String str16 = mongoDBRiverDefinition8.getADMIN_DB_FIELD();
        java.lang.String str17 = mongoDBRiverDefinition8.getPORT_FIELD();
        java.lang.String str18 = mongoDBRiverDefinition8.getBULK_SIZE_FIELD();
        java.lang.String str19 = mongoDBRiverDefinition8.getScript();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertNotNull(serverAddressList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "script_type" + "'", str14, "script_type");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "secondary_read_preference" + "'", str15, "secondary_read_preference");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "admin" + "'", str16, "admin");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "port" + "'", str17, "port");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "bulk_size" + "'", str18, "bulk_size");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("credentials", "mongodb-1638820218264");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?mongodb-1638820218264?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings1 = serializedObjectSupporter0.deserializeObjectRiverSettings9();
        org.elasticsearch.river.RiverSettings riverSettings2 = serializedObjectSupporter0.deserializeObjectRiverSettings8();
        org.elasticsearch.river.RiverSettings riverSettings3 = serializedObjectSupporter0.deserializeObjectRiverSettings9();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString15();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString6();
        org.elasticsearch.river.RiverSettings riverSettings6 = serializedObjectSupporter0.deserializeObjectRiverSettings6();
        org.elasticsearch.river.RiverSettings riverSettings7 = serializedObjectSupporter0.deserializeObjectRiverSettings2();
        org.elasticsearch.river.RiverSettings riverSettings8 = serializedObjectSupporter0.deserializeObjectRiverSettings8();
        org.junit.Assert.assertNull(riverSettings1);
        org.junit.Assert.assertNull(riverSettings2);
        org.junit.Assert.assertNull(riverSettings3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb-1638820218424" + "'", str4, "mongodb-1638820218424");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_river" + "'", str5, "_river");
        org.junit.Assert.assertNull(riverSettings6);
        org.junit.Assert.assertNull(riverSettings7);
        org.junit.Assert.assertNull(riverSettings8);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("drop_collection", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        int int6 = builder2.getsocketTimeout();
        builder2.settypeName("initial_timestamp");
        com.mongodb.MongoClientOptions mongoClientOptions9 = builder2.getmongoClientOptions();
        java.util.Set<java.lang.String> strSet10 = builder2.getexcludeFields();
        builder2.setmongoLocalUser("parent_types");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder2.importAllCollections(true);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(mongoClientOptions9);
        org.junit.Assert.assertNull(strSet10);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("mongodb-1638820218449", "local");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?local?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.lang.String str3 = builder2.riverIndexName;
        builder2.statisticsIndexName = "store_statistics";
        builder2.setmongoSSLVerifyCertificate(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder2.importAllCollections(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder2.dropCollection(false);
        builder2.includeCollection = "connect_timeout";
        builder2.setmongoAdminPassword("_river");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString11();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString17();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString3();
        org.elasticsearch.river.RiverSettings riverSettings5 = serializedObjectSupporter0.deserializeObjectRiverSettings9();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString6();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString8();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString8();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb-1638820218387" + "'", str1, "mongodb-1638820218387");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mongodb-1638820218449" + "'", str2, "mongodb-1638820218449");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "mongodb-1638820217755" + "'", str3, "mongodb-1638820217755");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb-1638820218264" + "'", str4, "mongodb-1638820218264");
        org.junit.Assert.assertNull(riverSettings5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_river" + "'", str6, "_river");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_river" + "'", str7, "_river");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_river" + "'", str8, "_river");
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.lang.String str3 = builder0.riverIndexName;
        boolean boolean4 = builder0.skipInitialImport;
        java.util.Set<java.lang.String> strSet5 = builder0.getexcludeFields();
        com.mongodb.BasicDBObject basicDBObject6 = builder0.getmongoOplogFilter();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertNull(basicDBObject6);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        boolean boolean10 = mongoDBRiverDefinition8.getmongoGridFS();
        com.mongodb.BasicDBObject basicDBObject11 = mongoDBRiverDefinition8.mongoOplogFilter;
        java.util.Set<java.lang.String> strSet12 = mongoDBRiverDefinition8.excludeFields;
        java.lang.String str13 = mongoDBRiverDefinition8.getMongoAdminPassword();
        boolean boolean14 = mongoDBRiverDefinition8.mongoUseSSL;
        boolean boolean15 = mongoDBRiverDefinition8.mongoSecondaryReadPreference;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(basicDBObject11);
        org.junit.Assert.assertNull(strSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getADMIN_DB_FIELD();
        boolean boolean11 = mongoDBRiverDefinition8.mongoSecondaryReadPreference;
        java.lang.String str12 = mongoDBRiverDefinition8.getDROP_COLLECTION_FIELD();
        java.util.Set<java.lang.String> strSet13 = mongoDBRiverDefinition8.excludeFields;
        java.lang.String str14 = mongoDBRiverDefinition8.getPARENT_TYPES_FIELD();
        com.mongodb.BasicDBObject basicDBObject15 = mongoDBRiverDefinition8.getMongoOplogFilter();
        java.lang.String str16 = mongoDBRiverDefinition8.getHOST_FIELD();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "drop_collection" + "'", str12, "drop_collection");
        org.junit.Assert.assertNull(strSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "parent_types" + "'", str14, "parent_types");
        org.junit.Assert.assertNull(basicDBObject15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "host" + "'", str16, "host");
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = builder2.getinitialTimestamp();
        builder2.scriptType = "servers";
        builder2.indexName = "advanced_transformation";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.advancedTransformation(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory14 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject16 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript17 = docScoreNativeScriptFactory14.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject16);
        builder11.setmongoCollectionFilter(basicDBObject16);
        java.lang.String str19 = builder11.getriverIndexName();
        com.mongodb.MongoClientOptions mongoClientOptions20 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder11.mongoClientOptions(mongoClientOptions20);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder22.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet25 = builder24.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.advancedTransformation(false);
        builder26.mongoAdminPassword = "name";
        java.lang.String str31 = builder26.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder32.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet35 = builder34.parentTypes;
        boolean boolean36 = builder34.skipInitialImport;
        java.lang.String[] strArray67 = new java.lang.String[] { "disable_index_refresh", "port", "secondary_read_preference", "import_all_collections", "bulk_timeout", "type", "script", "mongodb-1638820218449", "options", "gridfs", "port", "throttle_size", "ssl", "concurrent_bulk_requests", "hi!", "advanced_transformation", "bulk_size", "local", "name", "exclude_fields", "import_all_collections", "script_type", "socket_timeout", "type", "store_statistics", "store_statistics", "servers", "localhost", "ssl", "ssl_verify_certificate" };
        java.util.LinkedHashSet<java.lang.String> strSet68 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet68, strArray67);
        builder34.setincludeFields((java.util.Set<java.lang.String>) strSet68);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder71 = builder26.includeFields((java.util.Set<java.lang.String>) strSet68);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder72 = builder24.excludeFields((java.util.Set<java.lang.String>) strSet68);
        builder11.includeFields = strSet68;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder74 = builder2.excludeFields((java.util.Set<java.lang.String>) strSet68);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter75 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings76 = serializedObjectSupporter75.deserializeObjectRiverSettings9();
        org.elasticsearch.river.RiverSettings riverSettings77 = serializedObjectSupporter75.deserializeObjectRiverSettings5();
        builder2.serializedObjectSupporter = serializedObjectSupporter75;
        java.lang.String str79 = serializedObjectSupporter75.deserializeObjectString3();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(basicDBObject16);
        org.junit.Assert.assertNotNull(executableScript17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNull(strSet25);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNull(strSet35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(builder71);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertNull(riverSettings76);
        org.junit.Assert.assertNull(riverSettings77);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "mongodb-1638820218264" + "'", str79, "mongodb-1638820218264");
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        boolean boolean10 = mongoDBRiverDefinition8.getmongoSecondaryReadPreference();
        java.lang.String str11 = mongoDBRiverDefinition8.getLOCAL_DB_FIELD();
        boolean boolean12 = mongoDBRiverDefinition8.isAdvancedTransformation();
        java.lang.String str13 = mongoDBRiverDefinition8.getSECONDARY_READ_PREFERENCE_FIELD();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "local" + "'", str11, "local");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "secondary_read_preference" + "'", str13, "secondary_read_preference");
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("mongodb-1638820218424", "index");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?index?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getSKIP_INITIAL_IMPORT_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getBULK_FIELD();
        java.lang.String str11 = mongoDBRiverDefinition8.getACTIONS_FIELD();
        java.lang.String str12 = mongoDBRiverDefinition8.getIncludeCollection();
        boolean boolean13 = mongoDBRiverDefinition8.skipInitialImport;
        java.lang.String str14 = mongoDBRiverDefinition8.getDISABLE_INDEX_REFRESH_FIELD();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "skip_initial_import" + "'", str9, "skip_initial_import");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "bulk" + "'", str10, "bulk");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "actions" + "'", str11, "actions");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "disable_index_refresh" + "'", str14, "disable_index_refresh");
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        int int10 = mongoDBRiverDefinition8.connectTimeout;
        java.lang.String str11 = mongoDBRiverDefinition8.getMongoAdminPassword();
        java.lang.String str12 = mongoDBRiverDefinition8.getINCLUDE_FIELDS_FIELD();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "include_fields" + "'", str12, "include_fields");
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getADMIN_DB_FIELD();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue11 = mongoDBRiverDefinition8.getDEFAULT_BULK_SIZE();
        boolean boolean12 = mongoDBRiverDefinition8.getmongoGridFS();
        boolean boolean13 = mongoDBRiverDefinition8.mongoGridFS;
        java.lang.String str14 = mongoDBRiverDefinition8.getBULK_SIZE_FIELD();
        com.mongodb.BasicDBObject basicDBObject15 = mongoDBRiverDefinition8.mongoCollectionFilter;
        com.mongodb.BasicDBObject basicDBObject16 = mongoDBRiverDefinition8.getMongoOplogFilter();
        boolean boolean17 = mongoDBRiverDefinition8.isAdvancedTransformation();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertNotNull(byteSizeValue11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "bulk_size" + "'", str14, "bulk_size");
        org.junit.Assert.assertNotNull(basicDBObject15);
        org.junit.Assert.assertNull(basicDBObject16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("password", "ssl_verify_certificate");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?ssl_verify_certificate?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString11();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString17();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString18();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString16();
        org.elasticsearch.river.RiverSettings riverSettings6 = serializedObjectSupporter0.deserializeObjectRiverSettings5();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString11();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb-1638820218387" + "'", str1, "mongodb-1638820218387");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mongodb-1638820218449" + "'", str2, "mongodb-1638820218449");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "mongodb-1638820218326" + "'", str3, "mongodb-1638820218326");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_river" + "'", str4, "_river");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_river" + "'", str5, "_river");
        org.junit.Assert.assertNull(riverSettings6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongodb-1638820218387" + "'", str7, "mongodb-1638820218387");
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        boolean boolean10 = mongoDBRiverDefinition8.getmongoGridFS();
        com.mongodb.BasicDBObject basicDBObject11 = mongoDBRiverDefinition8.mongoOplogFilter;
        java.util.Set<java.lang.String> strSet12 = mongoDBRiverDefinition8.getIncludeFields();
        java.lang.String str13 = mongoDBRiverDefinition8.getDROP_COLLECTION_FIELD();
        java.lang.String str14 = mongoDBRiverDefinition8.getUSER_FIELD();
        boolean boolean15 = mongoDBRiverDefinition8.mongoUseSSL;
        java.lang.String str16 = mongoDBRiverDefinition8.mongoLocalPassword;
        java.lang.String str17 = mongoDBRiverDefinition8.getSSL_VERIFY_CERT_FIELD();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(basicDBObject11);
        org.junit.Assert.assertNull(strSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "drop_collection" + "'", str13, "drop_collection");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "user" + "'", str14, "user");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ssl_verify_certificate" + "'", str17, "ssl_verify_certificate");
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder0.includeFields;
        boolean boolean4 = builder0.storeStatistics;
        java.lang.String str5 = builder0.mongoAdminPassword;
        builder0.setmongoAdminUser("bulk_timeout");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        int int6 = builder2.getsocketTimeout();
        builder2.setmongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet12 = builder11.parentTypes;
        java.util.List<com.mongodb.ServerAddress> serverAddressList13 = builder11.mongoServers;
        builder2.setmongoServers(serverAddressList13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder2.throttleSize((int) (short) 1);
        builder16.connectTimeout = (short) 10;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNull(strSet12);
        org.junit.Assert.assertNotNull(serverAddressList13);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getADMIN_DB_FIELD();
        boolean boolean11 = mongoDBRiverDefinition8.mongoSecondaryReadPreference;
        boolean boolean12 = mongoDBRiverDefinition8.isImportAllCollections();
        com.mongodb.BasicDBObject basicDBObject13 = mongoDBRiverDefinition8.mongoCollectionFilter;
        java.lang.String str14 = mongoDBRiverDefinition8.getPASSWORD_FIELD();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(basicDBObject13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "password" + "'", str14, "password");
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getADMIN_DB_FIELD();
        java.util.List<com.mongodb.ServerAddress> serverAddressList11 = mongoDBRiverDefinition8.mongoServers;
        boolean boolean12 = mongoDBRiverDefinition8.isImportAllCollections();
        java.lang.String str13 = mongoDBRiverDefinition8.getPARENT_TYPES_FIELD();
        java.lang.String str14 = mongoDBRiverDefinition8.getADMIN_DB_FIELD();
        boolean boolean15 = mongoDBRiverDefinition8.mongoUseSSL;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertNotNull(serverAddressList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "parent_types" + "'", str13, "parent_types");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getACTIONS_FIELD();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = mongoDBRiverDefinition8.initialTimestamp;
        int int11 = mongoDBRiverDefinition8.connectTimeout;
        java.lang.String str12 = mongoDBRiverDefinition8.scriptType;
        java.lang.String str13 = mongoDBRiverDefinition8.getStatisticsTypeName();
        java.lang.String str14 = mongoDBRiverDefinition8.getPORT_FIELD();
        java.lang.String str15 = mongoDBRiverDefinition8.getMongoAdminUser();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "actions" + "'", str9, "actions");
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "port" + "'", str14, "port");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings1 = serializedObjectSupporter0.deserializeObjectRiverSettings9();
        org.elasticsearch.river.RiverSettings riverSettings2 = serializedObjectSupporter0.deserializeObjectRiverSettings4();
        org.junit.Assert.assertNull(riverSettings1);
        org.junit.Assert.assertNull(riverSettings2);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.CONNECTION_TIMEOUT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "connect_timeout" + "'", str0, "connect_timeout");
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("script_type", "connect_timeout");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?connect_timeout?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        boolean boolean10 = mongoDBRiverDefinition8.getmongoGridFS();
        java.lang.String str11 = mongoDBRiverDefinition8.getPASSWORD_FIELD();
        boolean boolean12 = mongoDBRiverDefinition8.mongoSecondaryReadPreference;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "password" + "'", str11, "password");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory3 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject5 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript6 = docScoreNativeScriptFactory3.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject5);
        builder0.setmongoCollectionFilter(basicDBObject5);
        builder0.setimportAllCollections(true);
        builder0.connectTimeout = 100;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(basicDBObject5);
        org.junit.Assert.assertNotNull(executableScript6);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getGRIDFS_FIELD();
        java.lang.String str11 = mongoDBRiverDefinition8.getINITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD();
        org.elasticsearch.common.logging.ESLogger eSLogger12 = mongoDBRiverDefinition8.getlogger();
        java.lang.String str13 = mongoDBRiverDefinition8.getCONNECTION_TIMEOUT();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "gridfs" + "'", str10, "gridfs");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "script_type" + "'", str11, "script_type");
        org.junit.Assert.assertNotNull(eSLogger12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "connect_timeout" + "'", str13, "connect_timeout");
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getGRIDFS_FIELD();
        java.lang.String str11 = mongoDBRiverDefinition8.getINITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD();
        java.lang.String str12 = mongoDBRiverDefinition8.getPORT_FIELD();
        int int13 = mongoDBRiverDefinition8.throttleSize;
        java.lang.String str14 = mongoDBRiverDefinition8.mongoLocalPassword;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "gridfs" + "'", str10, "gridfs");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "script_type" + "'", str11, "script_type");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "port" + "'", str12, "port");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        builder0.mongoAdminPassword = "name";
        builder0.setmongoAdminPassword("mongodb-1638820218326");
        builder0.includeCollection = "mongodb-1638820218363";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoAdminPassword("include_fields");
        boolean boolean11 = builder10.getskipInitialImport();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getSSL_CONNECTION_FIELD();
        boolean boolean10 = mongoDBRiverDefinition8.isMongoGridFS();
        java.lang.String str11 = mongoDBRiverDefinition8.getSERVERS_FIELD();
        java.lang.Class<?> wildcardClass12 = mongoDBRiverDefinition8.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ssl" + "'", str9, "ssl");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "servers" + "'", str11, "servers");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory3 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject5 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript6 = docScoreNativeScriptFactory3.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject5);
        builder0.setmongoCollectionFilter(basicDBObject5);
        java.lang.String str8 = builder0.getriverIndexName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("");
        builder0.setmongoSecondaryReadPreference(true);
        builder0.settypeName("concurrent_requests");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(basicDBObject5);
        org.junit.Assert.assertNotNull(executableScript6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.parentTypes;
        java.lang.String str4 = builder2.getriverIndexName();
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory5 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject7 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript8 = docScoreNativeScriptFactory5.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject7);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory9 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject11 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript12 = docScoreNativeScriptFactory9.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject11);
        com.mongodb.BasicDBObject basicDBObject14 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript15 = docScoreNativeScriptFactory9.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject14);
        org.elasticsearch.script.ExecutableScript executableScript16 = docScoreNativeScriptFactory5.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject14);
        org.elasticsearch.common.settings.Settings settings17 = null;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory18 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject20 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript21 = docScoreNativeScriptFactory18.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject20);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory22 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject24 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript25 = docScoreNativeScriptFactory22.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject24);
        com.mongodb.BasicDBObject basicDBObject27 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript28 = docScoreNativeScriptFactory22.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject27);
        org.elasticsearch.script.ExecutableScript executableScript29 = docScoreNativeScriptFactory18.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject27);
        org.elasticsearch.river.RiverSettings riverSettings30 = new org.elasticsearch.river.RiverSettings(settings17, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject27);
        org.elasticsearch.script.ExecutableScript executableScript31 = docScoreNativeScriptFactory5.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject27);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder2.mongoOplogFilter(basicDBObject27);
        boolean boolean33 = builder32.skipInitialImport;
        builder32.advancedTransformation = false;
        boolean boolean36 = builder32.disableIndexRefresh;
        com.mongodb.MongoClientOptions mongoClientOptions37 = builder32.mongoClientOptions;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(basicDBObject7);
        org.junit.Assert.assertNotNull(executableScript8);
        org.junit.Assert.assertNotNull(basicDBObject11);
        org.junit.Assert.assertNotNull(executableScript12);
        org.junit.Assert.assertNotNull(basicDBObject14);
        org.junit.Assert.assertNotNull(executableScript15);
        org.junit.Assert.assertNotNull(executableScript16);
        org.junit.Assert.assertNotNull(basicDBObject20);
        org.junit.Assert.assertNotNull(executableScript21);
        org.junit.Assert.assertNotNull(basicDBObject24);
        org.junit.Assert.assertNotNull(executableScript25);
        org.junit.Assert.assertNotNull(basicDBObject27);
        org.junit.Assert.assertNotNull(executableScript28);
        org.junit.Assert.assertNotNull(executableScript29);
        org.junit.Assert.assertNotNull(executableScript31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(mongoClientOptions37);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString15();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString6();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString14();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb-1638820218424" + "'", str1, "mongodb-1638820218424");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_river" + "'", str2, "_river");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "mongodb-1638820218299" + "'", str3, "mongodb-1638820218299");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_river" + "'", str4, "_river");
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory3 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject5 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript6 = docScoreNativeScriptFactory3.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject5);
        builder0.setmongoCollectionFilter(basicDBObject5);
        java.lang.String str8 = builder0.getriverIndexName();
        com.mongodb.MongoClientOptions mongoClientOptions9 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoClientOptions(mongoClientOptions9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet14 = builder13.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.advancedTransformation(false);
        builder15.mongoAdminPassword = "name";
        java.lang.String str20 = builder15.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet24 = builder23.parentTypes;
        boolean boolean25 = builder23.skipInitialImport;
        java.lang.String[] strArray56 = new java.lang.String[] { "disable_index_refresh", "port", "secondary_read_preference", "import_all_collections", "bulk_timeout", "type", "script", "mongodb-1638820218449", "options", "gridfs", "port", "throttle_size", "ssl", "concurrent_bulk_requests", "hi!", "advanced_transformation", "bulk_size", "local", "name", "exclude_fields", "import_all_collections", "script_type", "socket_timeout", "type", "store_statistics", "store_statistics", "servers", "localhost", "ssl", "ssl_verify_certificate" };
        java.util.LinkedHashSet<java.lang.String> strSet57 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet57, strArray56);
        builder23.setincludeFields((java.util.Set<java.lang.String>) strSet57);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder15.includeFields((java.util.Set<java.lang.String>) strSet57);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = builder13.excludeFields((java.util.Set<java.lang.String>) strSet57);
        builder0.includeFields = strSet57;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder64 = builder0.mongoSecondaryReadPreference(true);
        builder0.riverIndexName = "ssl_verify_certificate";
        int int67 = builder0.throttleSize;
        builder0.setmongoLocalPassword("bulk_size");
        java.util.Set<java.lang.String> strSet70 = builder0.includeFields;
        java.lang.String str71 = builder0.typeName;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(basicDBObject5);
        org.junit.Assert.assertNotNull(executableScript6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNull(strSet14);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNull(strSet24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(strSet70);
        org.junit.Assert.assertNull(str71);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getADMIN_DB_FIELD();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue11 = mongoDBRiverDefinition8.getDEFAULT_BULK_SIZE();
        boolean boolean12 = mongoDBRiverDefinition8.getmongoGridFS();
        boolean boolean13 = mongoDBRiverDefinition8.mongoGridFS;
        java.lang.String str14 = mongoDBRiverDefinition8.getEXCLUDE_FIELDS_FIELD();
        java.lang.String str15 = mongoDBRiverDefinition8.typeName;
        boolean boolean16 = mongoDBRiverDefinition8.getadvancedTransformation();
        java.util.List<com.mongodb.ServerAddress> serverAddressList17 = mongoDBRiverDefinition8.mongoServers;
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp18 = mongoDBRiverDefinition8.initialTimestamp;
        java.util.Set<java.lang.String> strSet19 = mongoDBRiverDefinition8.getIncludeFields();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertNotNull(byteSizeValue11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "exclude_fields" + "'", str14, "exclude_fields");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(serverAddressList17);
        org.junit.Assert.assertNull(wildcardTimestamp18);
        org.junit.Assert.assertNull(strSet19);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        boolean boolean9 = mongoDBRiverDefinition8.getadvancedTransformation();
        java.lang.String str10 = mongoDBRiverDefinition8.getDEFAULT_DB_HOST();
        java.lang.String str11 = mongoDBRiverDefinition8.getINCLUDE_FIELDS_FIELD();
        java.lang.String str12 = mongoDBRiverDefinition8.getSECONDARY_READ_PREFERENCE_FIELD();
        java.lang.String str13 = mongoDBRiverDefinition8.getStatisticsIndexName();
        java.lang.String str14 = mongoDBRiverDefinition8.indexName;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "localhost" + "'", str10, "localhost");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "include_fields" + "'", str11, "include_fields");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "secondary_read_preference" + "'", str12, "secondary_read_preference");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "name" + "'", str14, "name");
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        boolean boolean10 = mongoDBRiverDefinition8.getmongoGridFS();
        com.mongodb.BasicDBObject basicDBObject11 = mongoDBRiverDefinition8.mongoOplogFilter;
        java.util.Set<java.lang.String> strSet12 = mongoDBRiverDefinition8.getIncludeFields();
        java.util.Set<java.lang.String> strSet13 = mongoDBRiverDefinition8.includeFields;
        boolean boolean14 = mongoDBRiverDefinition8.getstoreStatistics();
        java.lang.String str15 = mongoDBRiverDefinition8.getIncludeCollection();
        java.lang.String str16 = mongoDBRiverDefinition8.getINITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(basicDBObject11);
        org.junit.Assert.assertNull(strSet12);
        org.junit.Assert.assertNull(strSet13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "script_type" + "'", str16, "script_type");
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.elasticsearch.common.settings.Settings settings2 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        org.elasticsearch.river.RiverSettings riverSettings4 = new org.elasticsearch.river.RiverSettings(settings2, strMap3);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = riverSettings4.settings();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = riverSettings4.settings();
        org.elasticsearch.common.settings.Settings settings7 = riverSettings4.globalSettings();
        org.elasticsearch.common.settings.Settings settings8 = riverSettings4.globalSettings();
        org.elasticsearch.script.ScriptService scriptService9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition10 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("exclude_fields", "host", riverSettings4, scriptService9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strMap5);
        org.junit.Assert.assertNull(strMap6);
        org.junit.Assert.assertNull(settings7);
        org.junit.Assert.assertNull(settings8);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        java.lang.Object obj7 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        org.apache.lucene.search.Scorer scorer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setScorer(scorer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (-1L) + "'", obj2, (-1L));
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + false + "'", obj7, false);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getADMIN_DB_FIELD();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue11 = mongoDBRiverDefinition8.getDEFAULT_BULK_SIZE();
        boolean boolean12 = mongoDBRiverDefinition8.getmongoGridFS();
        boolean boolean13 = mongoDBRiverDefinition8.mongoGridFS;
        java.lang.String str14 = mongoDBRiverDefinition8.getBULK_SIZE_FIELD();
        com.mongodb.BasicDBObject basicDBObject15 = mongoDBRiverDefinition8.mongoCollectionFilter;
        com.mongodb.BasicDBObject basicDBObject16 = mongoDBRiverDefinition8.getMongoOplogFilter();
        int int17 = mongoDBRiverDefinition8.getSocketTimeout();
        java.lang.String str18 = mongoDBRiverDefinition8.getNAME_FIELD();
        java.lang.String str19 = mongoDBRiverDefinition8.getOPTIONS_FIELD();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertNotNull(byteSizeValue11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "bulk_size" + "'", str14, "bulk_size");
        org.junit.Assert.assertNotNull(basicDBObject15);
        org.junit.Assert.assertNull(basicDBObject16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "name" + "'", str18, "name");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "options" + "'", str19, "options");
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        builder0.mongoAdminPassword = "name";
        java.lang.String str5 = builder0.mongoCollection;
        java.lang.String str6 = builder0.includeCollection;
        java.lang.String str7 = builder0.getstatisticsTypeName();
        builder0.script = "include_collection";
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter10 = builder0.serializedObjectSupporter;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet14 = builder13.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder13.mongoCollection("size");
        builder13.setscript("index");
        java.util.List<com.mongodb.ServerAddress> serverAddressList19 = builder13.mongoServers;
        builder0.setmongoServers(serverAddressList19);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder0.indexName("mongodb-1638820218326");
        builder0.setmongoSecondaryReadPreference(false);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(serializedObjectSupporter10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNull(strSet14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(serverAddressList19);
        org.junit.Assert.assertNotNull(builder22);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getGRIDFS_FIELD();
        java.lang.String str11 = mongoDBRiverDefinition8.getINITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD();
        org.elasticsearch.common.logging.ESLogger eSLogger12 = mongoDBRiverDefinition8.getlogger();
        boolean boolean13 = mongoDBRiverDefinition8.getmongoUseSSL();
        java.lang.String str14 = mongoDBRiverDefinition8.mongoCollection;
        boolean boolean15 = mongoDBRiverDefinition8.mongoGridFS;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "gridfs" + "'", str10, "gridfs");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "script_type" + "'", str11, "script_type");
        org.junit.Assert.assertNotNull(eSLogger12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "size" + "'", str14, "size");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        builder0.mongoAdminPassword = "name";
        builder0.setmongoAdminPassword("mongodb-1638820218326");
        builder0.includeCollection = "mongodb-1638820218363";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoAdminPassword("include_fields");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet14 = builder13.parentTypes;
        builder13.indexName = "disable_index_refresh";
        builder13.setriverName("ssl_verify_certificate");
        builder13.setmongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp21 = builder13.initialTimestamp;
        builder13.riverIndexName = "db";
        com.mongodb.BasicDBObject basicDBObject24 = builder13.mongoCollectionFilter;
        builder10.setmongoCollectionFilter(basicDBObject24);
        builder10.skipInitialImport = true;
        builder10.setstatisticsTypeName("size");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNull(strSet14);
        org.junit.Assert.assertNull(wildcardTimestamp21);
        org.junit.Assert.assertNotNull(basicDBObject24);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = mongoDBRiverDefinition8.getInitialTimestamp();
        boolean boolean11 = mongoDBRiverDefinition8.getimportAllCollections();
        java.util.Set<java.lang.String> strSet12 = mongoDBRiverDefinition8.getParentTypes();
        java.lang.String str13 = mongoDBRiverDefinition8.getPARENT_TYPES_FIELD();
        int int14 = mongoDBRiverDefinition8.getDEFAULT_BULK_ACTIONS();
        java.lang.String str15 = mongoDBRiverDefinition8.getINCLUDE_FIELDS_FIELD();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(strSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "parent_types" + "'", str13, "parent_types");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1000 + "'", int14 == 1000);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "include_fields" + "'", str15, "include_fields");
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("port", "_river", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?_river?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        int int6 = builder2.getsocketTimeout();
        builder2.setmongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder2.mongoSSLVerifyCertificate(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder2.indexName("password");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.mongoUseSSL(true);
        builder12.setdisableIndexRefresh(false);
        java.lang.String str17 = builder12.getindexName();
        com.mongodb.BasicDBObject basicDBObject18 = builder12.getmongoCollectionFilter();
        boolean boolean19 = builder12.storeStatistics;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "password" + "'", str17, "password");
        org.junit.Assert.assertNotNull(basicDBObject18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getADMIN_DB_FIELD();
        java.util.List<com.mongodb.ServerAddress> serverAddressList11 = mongoDBRiverDefinition8.mongoServers;
        boolean boolean12 = mongoDBRiverDefinition8.isImportAllCollections();
        java.lang.String str13 = mongoDBRiverDefinition8.getTypeName();
        java.lang.String str14 = mongoDBRiverDefinition8.mongoLocalPassword;
        int int15 = mongoDBRiverDefinition8.connectTimeout;
        java.lang.String str16 = mongoDBRiverDefinition8.script;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertNotNull(serverAddressList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        boolean boolean10 = mongoDBRiverDefinition8.getmongoSecondaryReadPreference();
        boolean boolean11 = mongoDBRiverDefinition8.mongoSecondaryReadPreference;
        java.lang.String str12 = mongoDBRiverDefinition8.getDEFAULT_DB_HOST();
        java.lang.String str13 = mongoDBRiverDefinition8.getTYPE_FIELD();
        java.lang.String str14 = mongoDBRiverDefinition8.getTYPE_FIELD();
        int int15 = mongoDBRiverDefinition8.throttleSize;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "localhost" + "'", str12, "localhost");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "type" + "'", str13, "type");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "type" + "'", str14, "type");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder0.includeFields;
        boolean boolean4 = builder0.getmongoGridFS();
        java.util.Set<java.lang.String> strSet5 = builder0.parentTypes;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.advancedTransformation(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.advancedTransformation(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory11 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject13 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript14 = docScoreNativeScriptFactory11.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject13);
        builder8.setmongoCollectionFilter(basicDBObject13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder8.mongoDb("mongodb-1638820218387");
        java.lang.String[] strArray23 = new java.lang.String[] { "throttle_size", "", "db", "db", "local" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        builder8.setparentTypes((java.util.Set<java.lang.String>) strSet24);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder0.parentTypes((java.util.Set<java.lang.String>) strSet24);
        java.util.List<com.mongodb.ServerAddress> serverAddressList28 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder0.mongoServers(serverAddressList28);
        java.lang.String str30 = builder0.getmongoLocalUser();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(basicDBObject13);
        org.junit.Assert.assertNotNull(executableScript14);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.parentTypes;
        java.lang.String str4 = builder2.getriverIndexName();
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory5 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject7 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript8 = docScoreNativeScriptFactory5.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject7);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory9 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject11 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript12 = docScoreNativeScriptFactory9.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject11);
        com.mongodb.BasicDBObject basicDBObject14 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript15 = docScoreNativeScriptFactory9.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject14);
        org.elasticsearch.script.ExecutableScript executableScript16 = docScoreNativeScriptFactory5.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject14);
        org.elasticsearch.common.settings.Settings settings17 = null;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory18 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject20 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript21 = docScoreNativeScriptFactory18.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject20);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory22 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject24 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript25 = docScoreNativeScriptFactory22.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject24);
        com.mongodb.BasicDBObject basicDBObject27 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript28 = docScoreNativeScriptFactory22.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject27);
        org.elasticsearch.script.ExecutableScript executableScript29 = docScoreNativeScriptFactory18.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject27);
        org.elasticsearch.river.RiverSettings riverSettings30 = new org.elasticsearch.river.RiverSettings(settings17, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject27);
        org.elasticsearch.script.ExecutableScript executableScript31 = docScoreNativeScriptFactory5.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject27);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder2.mongoOplogFilter(basicDBObject27);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder2.statisticsIndexName("password");
        java.lang.String str35 = builder34.mongoLocalPassword;
        com.mongodb.MongoClientOptions mongoClientOptions36 = builder34.mongoClientOptions;
        java.lang.String str37 = builder34.getriverIndexName();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(basicDBObject7);
        org.junit.Assert.assertNotNull(executableScript8);
        org.junit.Assert.assertNotNull(basicDBObject11);
        org.junit.Assert.assertNotNull(executableScript12);
        org.junit.Assert.assertNotNull(basicDBObject14);
        org.junit.Assert.assertNotNull(executableScript15);
        org.junit.Assert.assertNotNull(executableScript16);
        org.junit.Assert.assertNotNull(basicDBObject20);
        org.junit.Assert.assertNotNull(executableScript21);
        org.junit.Assert.assertNotNull(basicDBObject24);
        org.junit.Assert.assertNotNull(executableScript25);
        org.junit.Assert.assertNotNull(basicDBObject27);
        org.junit.Assert.assertNotNull(executableScript28);
        org.junit.Assert.assertNotNull(executableScript29);
        org.junit.Assert.assertNotNull(executableScript31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNull(mongoClientOptions36);
        org.junit.Assert.assertNull(str37);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString11();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString17();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString18();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString8();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString7();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb-1638820218387" + "'", str1, "mongodb-1638820218387");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mongodb-1638820218449" + "'", str2, "mongodb-1638820218449");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "mongodb-1638820218326" + "'", str3, "mongodb-1638820218326");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_river" + "'", str4, "_river");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_river" + "'", str5, "_river");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "mongodb-1638820218326" + "'", str6, "mongodb-1638820218326");
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        builder0.mongoAdminPassword = "name";
        builder0.mongoSSLVerifyCertificate = true;
        builder0.setmongoLocalPassword("throttle_size");
        int int9 = builder0.connectTimeout;
        java.lang.Class<?> wildcardClass10 = builder0.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.lang.String str3 = builder2.riverIndexName;
        java.util.Set<java.lang.String> strSet4 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.includeFields(strSet4);
        builder2.setindexName("mongodb-1638820218449");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.advancedTransformation(false);
        builder8.mongoAdminPassword = "name";
        java.lang.String str13 = builder8.mongoCollection;
        java.util.Set<java.lang.String> strSet14 = builder8.includeFields;
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = builder8.getinitialTimestamp();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet19 = builder16.includeFields;
        boolean boolean20 = builder16.getmongoGridFS();
        java.util.Set<java.lang.String> strSet21 = builder16.parentTypes;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder16.advancedTransformation(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder24.advancedTransformation(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory27 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject29 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript30 = docScoreNativeScriptFactory27.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject29);
        builder24.setmongoCollectionFilter(basicDBObject29);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder24.mongoDb("mongodb-1638820218387");
        java.lang.String[] strArray39 = new java.lang.String[] { "throttle_size", "", "db", "db", "local" };
        java.util.LinkedHashSet<java.lang.String> strSet40 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet40, strArray39);
        builder24.setparentTypes((java.util.Set<java.lang.String>) strSet40);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder16.parentTypes((java.util.Set<java.lang.String>) strSet40);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder8.includeFields((java.util.Set<java.lang.String>) strSet40);
        builder2.includeFields = strSet40;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder46.advancedTransformation(false);
        builder46.mongoAdminPassword = "name";
        java.lang.String str51 = builder46.mongoCollection;
        java.lang.String str52 = builder46.includeCollection;
        java.lang.String str53 = builder46.getstatisticsTypeName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder54.advancedTransformation(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory57 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject59 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript60 = docScoreNativeScriptFactory57.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject59);
        builder54.setmongoCollectionFilter(basicDBObject59);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = builder54.mongoDb("mongodb-1638820218387");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder64 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder66 = builder64.advancedTransformation(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory67 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject69 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript70 = docScoreNativeScriptFactory67.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject69);
        builder64.setmongoCollectionFilter(basicDBObject69);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder73 = builder64.mongoDb("mongodb-1638820218387");
        java.lang.String[] strArray79 = new java.lang.String[] { "throttle_size", "", "db", "db", "local" };
        java.util.LinkedHashSet<java.lang.String> strSet80 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet80, strArray79);
        builder64.setparentTypes((java.util.Set<java.lang.String>) strSet80);
        builder63.parentTypes = strSet80;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder84 = builder46.includeFields((java.util.Set<java.lang.String>) strSet80);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder85 = builder2.includeFields((java.util.Set<java.lang.String>) strSet80);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter86 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str87 = serializedObjectSupporter86.deserializeObjectString11();
        java.lang.String str88 = serializedObjectSupporter86.deserializeObjectString6();
        java.lang.String str89 = serializedObjectSupporter86.deserializeObjectString1();
        org.elasticsearch.river.RiverSettings riverSettings90 = serializedObjectSupporter86.deserializeObjectRiverSettings7();
        builder85.serializedObjectSupporter = serializedObjectSupporter86;
        java.lang.String str92 = serializedObjectSupporter86.deserializeObjectString11();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(strSet14);
        org.junit.Assert.assertNull(wildcardTimestamp15);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNull(strSet19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(strSet21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(basicDBObject29);
        org.junit.Assert.assertNotNull(executableScript30);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(basicDBObject59);
        org.junit.Assert.assertNotNull(executableScript60);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(basicDBObject69);
        org.junit.Assert.assertNotNull(executableScript70);
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(builder84);
        org.junit.Assert.assertNotNull(builder85);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "mongodb-1638820218387" + "'", str87, "mongodb-1638820218387");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "_river" + "'", str88, "_river");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "mongodb-1638820217755" + "'", str89, "mongodb-1638820217755");
        org.junit.Assert.assertNull(riverSettings90);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "mongodb-1638820218387" + "'", str92, "mongodb-1638820218387");
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getADMIN_DB_FIELD();
        java.util.List<com.mongodb.ServerAddress> serverAddressList11 = mongoDBRiverDefinition8.mongoServers;
        boolean boolean12 = mongoDBRiverDefinition8.isImportAllCollections();
        java.lang.String str13 = mongoDBRiverDefinition8.getTypeName();
        java.lang.String str14 = mongoDBRiverDefinition8.mongoLocalPassword;
        java.lang.String str15 = mongoDBRiverDefinition8.getHOST_FIELD();
        int int16 = mongoDBRiverDefinition8.socketTimeout;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertNotNull(serverAddressList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "host" + "'", str15, "host");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.parentTypes;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.typeName("host");
        builder2.statisticsTypeName = "concurrent_requests";
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString11();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString17();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString7();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString8();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString16();
        org.elasticsearch.river.RiverSettings riverSettings7 = serializedObjectSupporter0.deserializeObjectRiverSettings9();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString5();
        org.elasticsearch.river.RiverSettings riverSettings9 = serializedObjectSupporter0.deserializeObjectRiverSettings1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb-1638820218387" + "'", str1, "mongodb-1638820218387");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mongodb-1638820218449" + "'", str2, "mongodb-1638820218449");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "mongodb-1638820218326" + "'", str3, "mongodb-1638820218326");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb-1638820218326" + "'", str4, "mongodb-1638820218326");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_river" + "'", str5, "_river");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_river" + "'", str6, "_river");
        org.junit.Assert.assertNull(riverSettings7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "mongodb-1638820218299" + "'", str8, "mongodb-1638820218299");
        org.junit.Assert.assertNull(riverSettings9);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        int int6 = builder2.getsocketTimeout();
        builder2.settypeName("initial_timestamp");
        com.mongodb.MongoClientOptions mongoClientOptions9 = builder2.getmongoClientOptions();
        builder2.storeStatistics = true;
        builder2.mongoGridFS = true;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(mongoClientOptions9);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.advancedTransformation(false);
        builder4.mongoAdminPassword = "name";
        java.lang.String str9 = builder4.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet13 = builder12.parentTypes;
        boolean boolean14 = builder12.skipInitialImport;
        java.lang.String[] strArray45 = new java.lang.String[] { "disable_index_refresh", "port", "secondary_read_preference", "import_all_collections", "bulk_timeout", "type", "script", "mongodb-1638820218449", "options", "gridfs", "port", "throttle_size", "ssl", "concurrent_bulk_requests", "hi!", "advanced_transformation", "bulk_size", "local", "name", "exclude_fields", "import_all_collections", "script_type", "socket_timeout", "type", "store_statistics", "store_statistics", "servers", "localhost", "ssl", "ssl_verify_certificate" };
        java.util.LinkedHashSet<java.lang.String> strSet46 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet46, strArray45);
        builder12.setincludeFields((java.util.Set<java.lang.String>) strSet46);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder4.includeFields((java.util.Set<java.lang.String>) strSet46);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder2.excludeFields((java.util.Set<java.lang.String>) strSet46);
        java.lang.String str51 = builder2.getindexName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder2.mongoGridFS(false);
        com.mongodb.MongoClientOptions mongoClientOptions54 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder53.mongoClientOptions(mongoClientOptions54);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder53.statisticsIndexName("servers");
        org.bson.types.Binary binary58 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = builder53.initialTimestamp(binary58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(strSet13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder57);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        builder0.mongoAdminPassword = "name";
        builder0.setmongoAdminPassword("mongodb-1638820218326");
        java.lang.String str7 = builder0.getmongoLocalUser();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.mongoUseSSL(false);
        builder0.mongoAdminPassword = "advanced_transformation";
        boolean boolean12 = builder0.mongoGridFS;
        builder0.mongoCollection = "bulk_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet18 = builder17.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder17.advancedTransformation(false);
        builder17.setimportAllCollections(false);
        builder17.riverName = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder25.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet28 = builder27.parentTypes;
        boolean boolean29 = builder27.skipInitialImport;
        java.lang.String[] strArray60 = new java.lang.String[] { "disable_index_refresh", "port", "secondary_read_preference", "import_all_collections", "bulk_timeout", "type", "script", "mongodb-1638820218449", "options", "gridfs", "port", "throttle_size", "ssl", "concurrent_bulk_requests", "hi!", "advanced_transformation", "bulk_size", "local", "name", "exclude_fields", "import_all_collections", "script_type", "socket_timeout", "type", "store_statistics", "store_statistics", "servers", "localhost", "ssl", "ssl_verify_certificate" };
        java.util.LinkedHashSet<java.lang.String> strSet61 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet61, strArray60);
        builder27.setincludeFields((java.util.Set<java.lang.String>) strSet61);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder64 = builder17.includeFields((java.util.Set<java.lang.String>) strSet61);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder66 = builder64.statisticsTypeName("bulk_size");
        java.util.List<com.mongodb.ServerAddress> serverAddressList67 = builder66.getmongoServers();
        builder0.mongoServers = serverAddressList67;
        java.lang.String str69 = builder0.statisticsIndexName;
        builder0.setstatisticsTypeName("advanced_transformation");
        int int72 = builder0.getsocketTimeout();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNull(strSet18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNull(strSet28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(serverAddressList67);
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        boolean boolean10 = mongoDBRiverDefinition8.getmongoSecondaryReadPreference();
        int int11 = mongoDBRiverDefinition8.connectTimeout;
        java.lang.String str12 = mongoDBRiverDefinition8.getSCRIPT_FIELD();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "script" + "'", str12, "script");
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        boolean boolean10 = mongoDBRiverDefinition8.getmongoGridFS();
        com.mongodb.BasicDBObject basicDBObject11 = mongoDBRiverDefinition8.mongoOplogFilter;
        java.lang.String str12 = mongoDBRiverDefinition8.getSTORE_STATISTICS_FIELD();
        com.mongodb.BasicDBObject basicDBObject13 = mongoDBRiverDefinition8.getMongoCollectionFilter();
        java.lang.String str14 = mongoDBRiverDefinition8.getSCRIPT_TYPE_FIELD();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(basicDBObject11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "store_statistics" + "'", str12, "store_statistics");
        org.junit.Assert.assertNotNull(basicDBObject13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "script_type" + "'", str14, "script_type");
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.parentTypes;
        java.lang.String str4 = builder2.getriverIndexName();
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory5 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject7 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript8 = docScoreNativeScriptFactory5.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject7);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory9 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject11 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript12 = docScoreNativeScriptFactory9.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject11);
        com.mongodb.BasicDBObject basicDBObject14 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript15 = docScoreNativeScriptFactory9.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject14);
        org.elasticsearch.script.ExecutableScript executableScript16 = docScoreNativeScriptFactory5.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject14);
        org.elasticsearch.common.settings.Settings settings17 = null;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory18 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject20 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript21 = docScoreNativeScriptFactory18.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject20);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory22 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject24 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript25 = docScoreNativeScriptFactory22.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject24);
        com.mongodb.BasicDBObject basicDBObject27 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript28 = docScoreNativeScriptFactory22.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject27);
        org.elasticsearch.script.ExecutableScript executableScript29 = docScoreNativeScriptFactory18.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject27);
        org.elasticsearch.river.RiverSettings riverSettings30 = new org.elasticsearch.river.RiverSettings(settings17, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject27);
        org.elasticsearch.script.ExecutableScript executableScript31 = docScoreNativeScriptFactory5.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject27);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder2.mongoOplogFilter(basicDBObject27);
        java.lang.String str33 = builder2.mongoLocalPassword;
        builder2.statisticsIndexName = "mongodb-1638820217755";
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(basicDBObject7);
        org.junit.Assert.assertNotNull(executableScript8);
        org.junit.Assert.assertNotNull(basicDBObject11);
        org.junit.Assert.assertNotNull(executableScript12);
        org.junit.Assert.assertNotNull(basicDBObject14);
        org.junit.Assert.assertNotNull(executableScript15);
        org.junit.Assert.assertNotNull(executableScript16);
        org.junit.Assert.assertNotNull(basicDBObject20);
        org.junit.Assert.assertNotNull(executableScript21);
        org.junit.Assert.assertNotNull(basicDBObject24);
        org.junit.Assert.assertNotNull(executableScript25);
        org.junit.Assert.assertNotNull(basicDBObject27);
        org.junit.Assert.assertNotNull(executableScript28);
        org.junit.Assert.assertNotNull(executableScript29);
        org.junit.Assert.assertNotNull(executableScript31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.parentTypes;
        java.lang.String str4 = builder2.getriverIndexName();
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter5 = builder2.serializedObjectSupporter;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(serializedObjectSupporter5);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet9 = builder8.parentTypes;
        builder8.indexName = "disable_index_refresh";
        builder8.setriverName("ssl_verify_certificate");
        builder8.setmongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = builder8.initialTimestamp;
        builder8.riverIndexName = "db";
        builder8.setscript("db");
        docScoreSearchScript0.setNextVar("user", (java.lang.Object) "db");
        org.apache.lucene.index.AtomicReaderContext atomicReaderContext22 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextReader(atomicReaderContext22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "user" + "'", obj2, "user");
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + false + "'", obj4, false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(strSet9);
        org.junit.Assert.assertNull(wildcardTimestamp16);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        builder0.mongoAdminPassword = "name";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.mongoAdminPassword("index");
        java.util.Set<java.lang.String> strSet9 = builder0.excludeFields;
        builder0.connectTimeout = 10;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder0.skipInitialImport(false);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(strSet9);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        boolean boolean10 = mongoDBRiverDefinition8.getmongoSecondaryReadPreference();
        boolean boolean11 = mongoDBRiverDefinition8.mongoSecondaryReadPreference;
        java.lang.String str12 = mongoDBRiverDefinition8.getPARENT_TYPES_FIELD();
        java.lang.String str13 = mongoDBRiverDefinition8.getFLUSH_INTERVAL_FIELD();
        boolean boolean14 = mongoDBRiverDefinition8.mongoSSLVerifyCertificate;
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = mongoDBRiverDefinition8.initialTimestamp;
        java.lang.String str16 = mongoDBRiverDefinition8.getPASSWORD_FIELD();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "parent_types" + "'", str12, "parent_types");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "flush_interval" + "'", str13, "flush_interval");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(wildcardTimestamp15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "password" + "'", str16, "password");
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.getmongoCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet5 = builder4.parentTypes;
        boolean boolean6 = builder4.skipInitialImport;
        java.lang.String[] strArray37 = new java.lang.String[] { "disable_index_refresh", "port", "secondary_read_preference", "import_all_collections", "bulk_timeout", "type", "script", "mongodb-1638820218449", "options", "gridfs", "port", "throttle_size", "ssl", "concurrent_bulk_requests", "hi!", "advanced_transformation", "bulk_size", "local", "name", "exclude_fields", "import_all_collections", "script_type", "socket_timeout", "type", "store_statistics", "store_statistics", "servers", "localhost", "ssl", "ssl_verify_certificate" };
        java.util.LinkedHashSet<java.lang.String> strSet38 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet38, strArray37);
        builder4.setincludeFields((java.util.Set<java.lang.String>) strSet38);
        builder0.parentTypes = strSet38;
        builder0.includeCollection = "connect_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder0.throttleSize((int) (byte) 100);
        org.bson.types.BSONTimestamp bSONTimestamp46 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder45.initialTimestamp(bSONTimestamp46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ts must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(builder45);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getADMIN_DB_FIELD();
        java.util.List<com.mongodb.ServerAddress> serverAddressList11 = mongoDBRiverDefinition8.mongoServers;
        boolean boolean12 = mongoDBRiverDefinition8.isImportAllCollections();
        java.lang.String str13 = mongoDBRiverDefinition8.getTypeName();
        java.lang.String str14 = mongoDBRiverDefinition8.getSSL_VERIFY_CERT_FIELD();
        com.mongodb.MongoClientOptions mongoClientOptions15 = mongoDBRiverDefinition8.getMongoClientOptions();
        java.lang.String str16 = mongoDBRiverDefinition8.getINDEX_OBJECT();
        java.lang.String str17 = mongoDBRiverDefinition8.getBULK_FIELD();
        java.lang.String str18 = mongoDBRiverDefinition8.mongoLocalUser;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertNotNull(serverAddressList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ssl_verify_certificate" + "'", str14, "ssl_verify_certificate");
        org.junit.Assert.assertNull(mongoClientOptions15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "index" + "'", str16, "index");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "bulk" + "'", str17, "bulk");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("script", "actions", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?actions?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        builder0.mongoAdminPassword = "name";
        java.lang.String str5 = builder0.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet9 = builder8.parentTypes;
        boolean boolean10 = builder8.skipInitialImport;
        java.lang.String[] strArray41 = new java.lang.String[] { "disable_index_refresh", "port", "secondary_read_preference", "import_all_collections", "bulk_timeout", "type", "script", "mongodb-1638820218449", "options", "gridfs", "port", "throttle_size", "ssl", "concurrent_bulk_requests", "hi!", "advanced_transformation", "bulk_size", "local", "name", "exclude_fields", "import_all_collections", "script_type", "socket_timeout", "type", "store_statistics", "store_statistics", "servers", "localhost", "ssl", "ssl_verify_certificate" };
        java.util.LinkedHashSet<java.lang.String> strSet42 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet42, strArray41);
        builder8.setincludeFields((java.util.Set<java.lang.String>) strSet42);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder0.includeFields((java.util.Set<java.lang.String>) strSet42);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder46.advancedTransformation(false);
        builder46.mongoAdminPassword = "name";
        boolean boolean51 = builder46.mongoSecondaryReadPreference;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory52 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject54 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript55 = docScoreNativeScriptFactory52.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject54);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory56 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject58 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript59 = docScoreNativeScriptFactory56.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject58);
        com.mongodb.BasicDBObject basicDBObject61 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript62 = docScoreNativeScriptFactory56.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject61);
        org.elasticsearch.script.ExecutableScript executableScript63 = docScoreNativeScriptFactory52.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject61);
        builder46.setmongoCollectionFilter(basicDBObject61);
        builder46.mongoLocalPassword = "initial_timestamp";
        java.util.List<com.mongodb.ServerAddress> serverAddressList67 = builder46.mongoServers;
        builder0.setmongoServers(serverAddressList67);
        boolean boolean69 = builder0.disableIndexRefresh;
        builder0.setscript("mongodb-1638820217755");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(strSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(basicDBObject54);
        org.junit.Assert.assertNotNull(executableScript55);
        org.junit.Assert.assertNotNull(basicDBObject58);
        org.junit.Assert.assertNotNull(executableScript59);
        org.junit.Assert.assertNotNull(basicDBObject61);
        org.junit.Assert.assertNotNull(executableScript62);
        org.junit.Assert.assertNotNull(executableScript63);
        org.junit.Assert.assertNotNull(serverAddressList67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("null.size", "hi!");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?hi!?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder2.setscript("index");
        java.util.List<com.mongodb.ServerAddress> serverAddressList8 = builder2.mongoServers;
        boolean boolean9 = builder2.getmongoSSLVerifyCertificate();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(serverAddressList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet9 = builder8.parentTypes;
        builder8.indexName = "disable_index_refresh";
        builder8.setriverName("ssl_verify_certificate");
        builder8.setmongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = builder8.initialTimestamp;
        builder8.riverIndexName = "db";
        docScoreSearchScript0.setNextVar("null.size", (java.lang.Object) builder8);
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        docScoreSearchScript0.setNextScore((-1.0f));
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder24.advancedTransformation(false);
        builder24.mongoAdminPassword = "name";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder24.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder24.mongoAdminPassword("index");
        java.lang.String str33 = builder32.gettypeName();
        org.elasticsearch.common.settings.Settings settings34 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder35.advancedTransformation(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory38 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject40 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript41 = docScoreNativeScriptFactory38.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject40);
        builder35.setmongoCollectionFilter(basicDBObject40);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder35.mongoDb("mongodb-1638820218387");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder45.advancedTransformation(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory48 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject50 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript51 = docScoreNativeScriptFactory48.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject50);
        builder45.setmongoCollectionFilter(basicDBObject50);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder45.mongoDb("mongodb-1638820218387");
        java.lang.String[] strArray60 = new java.lang.String[] { "throttle_size", "", "db", "db", "local" };
        java.util.LinkedHashSet<java.lang.String> strSet61 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet61, strArray60);
        builder45.setparentTypes((java.util.Set<java.lang.String>) strSet61);
        builder44.parentTypes = strSet61;
        com.mongodb.BasicDBObject basicDBObject65 = builder44.mongoCollectionFilter;
        org.elasticsearch.river.RiverSettings riverSettings66 = new org.elasticsearch.river.RiverSettings(settings34, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject65);
        builder32.mongoCollectionFilter = basicDBObject65;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "user" + "'", obj2, "user");
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + false + "'", obj4, false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(strSet9);
        org.junit.Assert.assertNull(wildcardTimestamp16);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(basicDBObject40);
        org.junit.Assert.assertNotNull(executableScript41);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(basicDBObject50);
        org.junit.Assert.assertNotNull(executableScript51);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(basicDBObject65);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        docScoreSearchScript0.setNextScore((float) '4');
        docScoreSearchScript0.setNextScore((float) '4');
        docScoreSearchScript0.setNextScore((float) 1000);
        org.apache.lucene.index.AtomicReaderContext atomicReaderContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextReader(atomicReaderContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + (-1L) + "'", obj2, (-1L));
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.lang.String str3 = builder2.riverIndexName;
        com.mongodb.MongoClientOptions mongoClientOptions4 = builder2.mongoClientOptions;
        builder2.setsocketTimeout((int) (short) 10);
        java.lang.String str7 = builder2.indexName;
        java.lang.String str8 = builder2.includeCollection;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(mongoClientOptions4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        builder0.mongoAdminPassword = "name";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.mongoAdminPassword("index");
        java.util.Set<java.lang.String> strSet9 = builder0.excludeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder0.dropCollection(false);
        builder11.mongoAdminUser = "import_all_collections";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet17 = builder14.includeFields;
        boolean boolean18 = builder14.getmongoGridFS();
        java.util.Set<java.lang.String> strSet19 = builder14.parentTypes;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder14.advancedTransformation(true);
        builder14.setriverIndexName("flush_interval");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder24.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet27 = builder26.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.advancedTransformation(false);
        builder28.mongoAdminPassword = "name";
        java.lang.String str33 = builder28.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet37 = builder36.parentTypes;
        boolean boolean38 = builder36.skipInitialImport;
        java.lang.String[] strArray69 = new java.lang.String[] { "disable_index_refresh", "port", "secondary_read_preference", "import_all_collections", "bulk_timeout", "type", "script", "mongodb-1638820218449", "options", "gridfs", "port", "throttle_size", "ssl", "concurrent_bulk_requests", "hi!", "advanced_transformation", "bulk_size", "local", "name", "exclude_fields", "import_all_collections", "script_type", "socket_timeout", "type", "store_statistics", "store_statistics", "servers", "localhost", "ssl", "ssl_verify_certificate" };
        java.util.LinkedHashSet<java.lang.String> strSet70 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet70, strArray69);
        builder36.setincludeFields((java.util.Set<java.lang.String>) strSet70);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder73 = builder28.includeFields((java.util.Set<java.lang.String>) strSet70);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder74 = builder26.excludeFields((java.util.Set<java.lang.String>) strSet70);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder75 = builder14.includeFields((java.util.Set<java.lang.String>) strSet70);
        builder11.setexcludeFields((java.util.Set<java.lang.String>) strSet70);
        int int77 = builder11.throttleSize;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(strSet9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNull(strSet17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(strSet19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNull(strSet27);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNull(strSet37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertNotNull(builder75);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        builder0.mongoAdminPassword = "name";
        java.lang.String str5 = builder0.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet9 = builder8.parentTypes;
        boolean boolean10 = builder8.skipInitialImport;
        java.lang.String[] strArray41 = new java.lang.String[] { "disable_index_refresh", "port", "secondary_read_preference", "import_all_collections", "bulk_timeout", "type", "script", "mongodb-1638820218449", "options", "gridfs", "port", "throttle_size", "ssl", "concurrent_bulk_requests", "hi!", "advanced_transformation", "bulk_size", "local", "name", "exclude_fields", "import_all_collections", "script_type", "socket_timeout", "type", "store_statistics", "store_statistics", "servers", "localhost", "ssl", "ssl_verify_certificate" };
        java.util.LinkedHashSet<java.lang.String> strSet42 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet42, strArray41);
        builder8.setincludeFields((java.util.Set<java.lang.String>) strSet42);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder0.includeFields((java.util.Set<java.lang.String>) strSet42);
        com.mongodb.MongoClientOptions mongoClientOptions46 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder0.mongoClientOptions(mongoClientOptions46);
        builder0.setmongoLocalUser("concurrent_requests");
        builder0.setdisableIndexRefresh(true);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(strSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder2.mongoLocalPassword("drop_collection");
        com.mongodb.MongoClientOptions mongoClientOptions8 = null;
        builder7.setmongoClientOptions(mongoClientOptions8);
        builder7.setscriptType("mongodb-1638820218424");
        builder7.setincludeCollection("ssl");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder5.includeCollection("throttle_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder5.statisticsIndexName("");
        java.lang.String str13 = builder5.indexName;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "name" + "'", str13, "name");
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder0.includeFields;
        builder0.setsocketTimeout(10);
        boolean boolean6 = builder0.storeStatistics;
        java.lang.String str7 = builder0.mongoLocalUser;
        int int8 = builder0.getthrottleSize();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        java.lang.Object obj6 = null;
        docScoreSearchScript0.setNextVar("", obj6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.advancedTransformation(false);
        docScoreSearchScript0.setNextVar("flush_interval", (java.lang.Object) builder11);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = docScoreSearchScript0.runAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "user" + "'", obj2, "user");
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + false + "'", obj4, false);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.parentTypes;
        java.util.List<com.mongodb.ServerAddress> serverAddressList4 = builder2.mongoServers;
        com.mongodb.BasicDBObject basicDBObject5 = builder2.getmongoOplogFilter();
        builder2.setthrottleSize(0);
        builder2.setdisableIndexRefresh(true);
        java.lang.String str10 = builder2.statisticsTypeName;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(serverAddressList4);
        org.junit.Assert.assertNull(basicDBObject5);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.advancedTransformation(false);
        java.lang.String str6 = builder5.getindexName();
        builder5.mongoDb = "throttle_size";
        java.lang.String str9 = builder5.getmongoAdminPassword();
        builder5.mongoSecondaryReadPreference = true;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet15 = builder14.parentTypes;
        boolean boolean16 = builder14.skipInitialImport;
        java.lang.String[] strArray47 = new java.lang.String[] { "disable_index_refresh", "port", "secondary_read_preference", "import_all_collections", "bulk_timeout", "type", "script", "mongodb-1638820218449", "options", "gridfs", "port", "throttle_size", "ssl", "concurrent_bulk_requests", "hi!", "advanced_transformation", "bulk_size", "local", "name", "exclude_fields", "import_all_collections", "script_type", "socket_timeout", "type", "store_statistics", "store_statistics", "servers", "localhost", "ssl", "ssl_verify_certificate" };
        java.util.LinkedHashSet<java.lang.String> strSet48 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet48, strArray47);
        builder14.setincludeFields((java.util.Set<java.lang.String>) strSet48);
        builder5.setexcludeFields((java.util.Set<java.lang.String>) strSet48);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNull(strSet15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString11();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString17();
        org.elasticsearch.river.RiverSettings riverSettings3 = serializedObjectSupporter0.deserializeObjectRiverSettings3();
        org.elasticsearch.river.RiverSettings riverSettings4 = serializedObjectSupporter0.deserializeObjectRiverSettings1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString15();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb-1638820218387" + "'", str1, "mongodb-1638820218387");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mongodb-1638820218449" + "'", str2, "mongodb-1638820218449");
        org.junit.Assert.assertNull(riverSettings3);
        org.junit.Assert.assertNull(riverSettings4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "mongodb-1638820218424" + "'", str5, "mongodb-1638820218424");
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder0.includeFields;
        boolean boolean4 = builder0.storeStatistics;
        com.mongodb.MongoClientOptions mongoClientOptions5 = builder0.mongoClientOptions;
        builder0.setthrottleSize(100);
        builder0.throttleSize = ' ';
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(mongoClientOptions5);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setmongoAdminUser("disable_index_refresh");
        java.lang.String str8 = builder5.indexName;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory9 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject11 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript12 = docScoreNativeScriptFactory9.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject11);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory13 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject15 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript16 = docScoreNativeScriptFactory13.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject15);
        com.mongodb.BasicDBObject basicDBObject18 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript19 = docScoreNativeScriptFactory13.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
        org.elasticsearch.script.ExecutableScript executableScript20 = docScoreNativeScriptFactory9.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder5.mongoCollectionFilter(basicDBObject18);
        java.lang.String str22 = builder21.riverName;
        com.mongodb.MongoClientOptions mongoClientOptions23 = builder21.mongoClientOptions;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(basicDBObject11);
        org.junit.Assert.assertNotNull(executableScript12);
        org.junit.Assert.assertNotNull(basicDBObject15);
        org.junit.Assert.assertNotNull(executableScript16);
        org.junit.Assert.assertNotNull(basicDBObject18);
        org.junit.Assert.assertNotNull(executableScript19);
        org.junit.Assert.assertNotNull(executableScript20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(mongoClientOptions23);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.parentTypes;
        boolean boolean4 = builder2.skipInitialImport;
        com.mongodb.MongoClientOptions mongoClientOptions5 = builder2.getmongoClientOptions();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder2.socketTimeout((int) (byte) -1);
        int int8 = builder7.getconnectTimeout();
        builder7.mongoCollection = "parent_types";
        boolean boolean11 = builder7.skipInitialImport;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(mongoClientOptions5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.advancedTransformation(false);
        builder2.setimportAllCollections(false);
        builder2.riverName = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet13 = builder12.parentTypes;
        boolean boolean14 = builder12.skipInitialImport;
        java.lang.String[] strArray45 = new java.lang.String[] { "disable_index_refresh", "port", "secondary_read_preference", "import_all_collections", "bulk_timeout", "type", "script", "mongodb-1638820218449", "options", "gridfs", "port", "throttle_size", "ssl", "concurrent_bulk_requests", "hi!", "advanced_transformation", "bulk_size", "local", "name", "exclude_fields", "import_all_collections", "script_type", "socket_timeout", "type", "store_statistics", "store_statistics", "servers", "localhost", "ssl", "ssl_verify_certificate" };
        java.util.LinkedHashSet<java.lang.String> strSet46 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet46, strArray45);
        builder12.setincludeFields((java.util.Set<java.lang.String>) strSet46);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder2.includeFields((java.util.Set<java.lang.String>) strSet46);
        com.mongodb.MongoClientOptions mongoClientOptions50 = builder2.mongoClientOptions;
        builder2.script = "gridfs";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder2.indexName("size");
        boolean boolean55 = builder54.getadvancedTransformation();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(strSet13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNull(mongoClientOptions50);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        java.lang.Object obj6 = null;
        docScoreSearchScript0.setNextVar("", obj6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet12 = builder11.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder11.mongoCollection("size");
        int int15 = builder11.getsocketTimeout();
        builder11.settypeName("initial_timestamp");
        builder11.setriverName("size");
        java.util.Set<java.lang.String> strSet20 = builder11.excludeFields;
        java.lang.String str21 = builder11.getmongoDb();
        docScoreSearchScript0.setNextVar("exclude_fields", (java.lang.Object) str21);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.util.Set<java.lang.String> strSet25 = builder24.getexcludeFields();
        com.mongodb.BasicDBObject basicDBObject26 = builder24.mongoCollectionFilter;
        docScoreSearchScript0.setNextVar("", (java.lang.Object) builder24);
        // The following exception was thrown during execution in test generation
        try {
            double double28 = docScoreSearchScript0.runAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "user" + "'", obj2, "user");
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + false + "'", obj4, false);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNull(strSet12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(strSet20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(strSet25);
        org.junit.Assert.assertNotNull(basicDBObject26);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        int int6 = builder2.getsocketTimeout();
        builder2.setmongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder2.mongoSSLVerifyCertificate(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder2.indexName("password");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.mongoUseSSL(true);
        builder12.setdisableIndexRefresh(false);
        java.lang.String str17 = builder12.getindexName();
        builder12.setmongoSSLVerifyCertificate(true);
        java.lang.String str20 = builder12.getscriptType();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "password" + "'", str17, "password");
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getACTIONS_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getDB_FIELD();
        boolean boolean11 = mongoDBRiverDefinition8.getadvancedTransformation();
        java.lang.String str12 = mongoDBRiverDefinition8.getRiverIndexName();
        boolean boolean13 = mongoDBRiverDefinition8.getmongoSSLVerifyCertificate();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "actions" + "'", str9, "actions");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "db" + "'", str10, "db");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString15();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString14();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb-1638820218424" + "'", str1, "mongodb-1638820218424");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_river" + "'", str2, "_river");
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.mongoLocalUser;
        java.lang.String str11 = mongoDBRiverDefinition8.getSCRIPT_FIELD();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "script" + "'", str11, "script");
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        java.lang.Object obj6 = null;
        docScoreSearchScript0.setNextVar("", obj6);
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextDocId(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "user" + "'", obj2, "user");
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + false + "'", obj4, false);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings1 = serializedObjectSupporter0.deserializeObjectRiverSettings6();
        org.elasticsearch.river.RiverSettings riverSettings2 = serializedObjectSupporter0.deserializeObjectRiverSettings4();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(riverSettings1);
        org.junit.Assert.assertNull(riverSettings2);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        boolean boolean10 = mongoDBRiverDefinition8.getmongoSecondaryReadPreference();
        boolean boolean11 = mongoDBRiverDefinition8.mongoSecondaryReadPreference;
        java.lang.String str12 = mongoDBRiverDefinition8.getPARENT_TYPES_FIELD();
        boolean boolean13 = mongoDBRiverDefinition8.getmongoGridFS();
        java.lang.String str14 = mongoDBRiverDefinition8.getMongoCollection();
        boolean boolean15 = mongoDBRiverDefinition8.getadvancedTransformation();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "parent_types" + "'", str12, "parent_types");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "size" + "'", str14, "size");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTypeName();
        int int10 = mongoDBRiverDefinition8.getDEFAULT_CONCURRENT_REQUESTS();
        java.lang.String str11 = mongoDBRiverDefinition8.getACTIONS_FIELD();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "actions" + "'", str11, "actions");
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getADMIN_DB_FIELD();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue11 = mongoDBRiverDefinition8.getDEFAULT_BULK_SIZE();
        boolean boolean12 = mongoDBRiverDefinition8.getmongoGridFS();
        boolean boolean13 = mongoDBRiverDefinition8.mongoGridFS;
        java.lang.String str14 = mongoDBRiverDefinition8.getEXCLUDE_FIELDS_FIELD();
        java.lang.String str15 = mongoDBRiverDefinition8.typeName;
        java.lang.String str16 = mongoDBRiverDefinition8.getMongoCollection();
        java.lang.String str17 = mongoDBRiverDefinition8.getTYPE_FIELD();
        java.util.Set<java.lang.String> strSet18 = mongoDBRiverDefinition8.getExcludeFields();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue19 = mongoDBRiverDefinition8.getDEFAULT_BULK_SIZE();
        int int20 = mongoDBRiverDefinition8.getThrottleSize();
        java.lang.String str21 = mongoDBRiverDefinition8.getCONCURRENT_BULK_REQUESTS_FIELD();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertNotNull(byteSizeValue11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "exclude_fields" + "'", str14, "exclude_fields");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "size" + "'", str16, "size");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "type" + "'", str17, "type");
        org.junit.Assert.assertNull(strSet18);
        org.junit.Assert.assertNotNull(byteSizeValue19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "concurrent_bulk_requests" + "'", str21, "concurrent_bulk_requests");
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("name", "credentials");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?credentials?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getADMIN_DB_FIELD();
        java.lang.String str11 = mongoDBRiverDefinition8.riverName;
        boolean boolean12 = mongoDBRiverDefinition8.storeStatistics;
        java.lang.String str13 = mongoDBRiverDefinition8.statisticsTypeName;
        java.lang.String str14 = mongoDBRiverDefinition8.getSSL_CONNECTION_FIELD();
        java.lang.String str15 = mongoDBRiverDefinition8.getPARENT_TYPES_FIELD();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ssl" + "'", str14, "ssl");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "parent_types" + "'", str15, "parent_types");
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.parentTypes;
        boolean boolean4 = builder2.skipInitialImport;
        com.mongodb.MongoClientOptions mongoClientOptions5 = builder2.getmongoClientOptions();
        builder2.indexName = "servers";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder2.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.advancedTransformation(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory13 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject15 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript16 = docScoreNativeScriptFactory13.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject15);
        builder10.setmongoCollectionFilter(basicDBObject15);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder10.mongoDb("mongodb-1638820218387");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.advancedTransformation(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory23 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject25 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript26 = docScoreNativeScriptFactory23.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject25);
        builder20.setmongoCollectionFilter(basicDBObject25);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder20.mongoDb("mongodb-1638820218387");
        java.lang.String[] strArray35 = new java.lang.String[] { "throttle_size", "", "db", "db", "local" };
        java.util.LinkedHashSet<java.lang.String> strSet36 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet36, strArray35);
        builder20.setparentTypes((java.util.Set<java.lang.String>) strSet36);
        builder19.parentTypes = strSet36;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder9.excludeFields((java.util.Set<java.lang.String>) strSet36);
        java.lang.String str41 = builder40.getscript();
        boolean boolean42 = builder40.dropCollection;
        java.lang.String str43 = builder40.riverName;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(mongoClientOptions5);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(basicDBObject15);
        org.junit.Assert.assertNotNull(executableScript16);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(basicDBObject25);
        org.junit.Assert.assertNotNull(executableScript26);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(str43);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getSKIP_INITIAL_IMPORT_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getBULK_FIELD();
        java.lang.String str11 = mongoDBRiverDefinition8.getACTIONS_FIELD();
        int int12 = mongoDBRiverDefinition8.throttleSize;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "skip_initial_import" + "'", str9, "skip_initial_import");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "bulk" + "'", str10, "bulk");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "actions" + "'", str11, "actions");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        boolean boolean10 = mongoDBRiverDefinition8.getmongoSecondaryReadPreference();
        boolean boolean11 = mongoDBRiverDefinition8.mongoSecondaryReadPreference;
        java.lang.String str12 = mongoDBRiverDefinition8.getPARENT_TYPES_FIELD();
        java.lang.String str13 = mongoDBRiverDefinition8.getFLUSH_INTERVAL_FIELD();
        boolean boolean14 = mongoDBRiverDefinition8.mongoSSLVerifyCertificate;
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = mongoDBRiverDefinition8.initialTimestamp;
        java.lang.String str16 = mongoDBRiverDefinition8.getStatisticsTypeName();
        boolean boolean17 = mongoDBRiverDefinition8.isDropCollection();
        java.util.Set<java.lang.String> strSet18 = mongoDBRiverDefinition8.getIncludeFields();
        java.lang.String str19 = mongoDBRiverDefinition8.getINCLUDE_COLLECTION_FIELD();
        int int20 = mongoDBRiverDefinition8.throttleSize;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "parent_types" + "'", str12, "parent_types");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "flush_interval" + "'", str13, "flush_interval");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(wildcardTimestamp15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(strSet18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "include_collection" + "'", str19, "include_collection");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet9 = builder8.parentTypes;
        builder8.indexName = "disable_index_refresh";
        builder8.setriverName("ssl_verify_certificate");
        builder8.setmongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = builder8.initialTimestamp;
        builder8.riverIndexName = "db";
        docScoreSearchScript0.setNextVar("null.size", (java.lang.Object) builder8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet24 = builder23.parentTypes;
        java.lang.String str25 = builder23.getriverIndexName();
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory26 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject28 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript29 = docScoreNativeScriptFactory26.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject28);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory30 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject32 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript33 = docScoreNativeScriptFactory30.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject32);
        com.mongodb.BasicDBObject basicDBObject35 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript36 = docScoreNativeScriptFactory30.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject35);
        org.elasticsearch.script.ExecutableScript executableScript37 = docScoreNativeScriptFactory26.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject35);
        org.elasticsearch.common.settings.Settings settings38 = null;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory39 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject41 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript42 = docScoreNativeScriptFactory39.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject41);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory43 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject45 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript46 = docScoreNativeScriptFactory43.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject45);
        com.mongodb.BasicDBObject basicDBObject48 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript49 = docScoreNativeScriptFactory43.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject48);
        org.elasticsearch.script.ExecutableScript executableScript50 = docScoreNativeScriptFactory39.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject48);
        org.elasticsearch.river.RiverSettings riverSettings51 = new org.elasticsearch.river.RiverSettings(settings38, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject48);
        org.elasticsearch.script.ExecutableScript executableScript52 = docScoreNativeScriptFactory26.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject48);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder23.mongoOplogFilter(basicDBObject48);
        boolean boolean54 = builder53.mongoUseSSL;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder53.mongoLocalPassword("_river");
        boolean boolean57 = builder56.dropCollection;
        java.util.List<com.mongodb.ServerAddress> serverAddressList58 = builder56.mongoServers;
        docScoreSearchScript0.setNextVar("local", (java.lang.Object) serverAddressList58);
        // The following exception was thrown during execution in test generation
        try {
            long long60 = docScoreSearchScript0.runAsLong();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "user" + "'", obj2, "user");
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + false + "'", obj4, false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(strSet9);
        org.junit.Assert.assertNull(wildcardTimestamp16);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNull(strSet24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(basicDBObject28);
        org.junit.Assert.assertNotNull(executableScript29);
        org.junit.Assert.assertNotNull(basicDBObject32);
        org.junit.Assert.assertNotNull(executableScript33);
        org.junit.Assert.assertNotNull(basicDBObject35);
        org.junit.Assert.assertNotNull(executableScript36);
        org.junit.Assert.assertNotNull(executableScript37);
        org.junit.Assert.assertNotNull(basicDBObject41);
        org.junit.Assert.assertNotNull(executableScript42);
        org.junit.Assert.assertNotNull(basicDBObject45);
        org.junit.Assert.assertNotNull(executableScript46);
        org.junit.Assert.assertNotNull(basicDBObject48);
        org.junit.Assert.assertNotNull(executableScript49);
        org.junit.Assert.assertNotNull(executableScript50);
        org.junit.Assert.assertNotNull(executableScript52);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(serverAddressList58);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        builder0.mongoAdminPassword = "name";
        java.lang.String str5 = builder0.riverName;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getGRIDFS_FIELD();
        boolean boolean11 = mongoDBRiverDefinition8.isDisableIndexRefresh();
        java.lang.String str12 = mongoDBRiverDefinition8.getStatisticsTypeName();
        java.lang.String str13 = mongoDBRiverDefinition8.getSKIP_INITIAL_IMPORT_FIELD();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "gridfs" + "'", str10, "gridfs");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "skip_initial_import" + "'", str13, "skip_initial_import");
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = builder2.getinitialTimestamp();
        builder2.scriptType = "servers";
        builder2.indexName = "advanced_transformation";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.advancedTransformation(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory14 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject16 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript17 = docScoreNativeScriptFactory14.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject16);
        builder11.setmongoCollectionFilter(basicDBObject16);
        java.lang.String str19 = builder11.getriverIndexName();
        com.mongodb.MongoClientOptions mongoClientOptions20 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder11.mongoClientOptions(mongoClientOptions20);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder22.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet25 = builder24.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.advancedTransformation(false);
        builder26.mongoAdminPassword = "name";
        java.lang.String str31 = builder26.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder32.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet35 = builder34.parentTypes;
        boolean boolean36 = builder34.skipInitialImport;
        java.lang.String[] strArray67 = new java.lang.String[] { "disable_index_refresh", "port", "secondary_read_preference", "import_all_collections", "bulk_timeout", "type", "script", "mongodb-1638820218449", "options", "gridfs", "port", "throttle_size", "ssl", "concurrent_bulk_requests", "hi!", "advanced_transformation", "bulk_size", "local", "name", "exclude_fields", "import_all_collections", "script_type", "socket_timeout", "type", "store_statistics", "store_statistics", "servers", "localhost", "ssl", "ssl_verify_certificate" };
        java.util.LinkedHashSet<java.lang.String> strSet68 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet68, strArray67);
        builder34.setincludeFields((java.util.Set<java.lang.String>) strSet68);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder71 = builder26.includeFields((java.util.Set<java.lang.String>) strSet68);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder72 = builder24.excludeFields((java.util.Set<java.lang.String>) strSet68);
        builder11.includeFields = strSet68;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder74 = builder2.excludeFields((java.util.Set<java.lang.String>) strSet68);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter75 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings76 = serializedObjectSupporter75.deserializeObjectRiverSettings9();
        org.elasticsearch.river.RiverSettings riverSettings77 = serializedObjectSupporter75.deserializeObjectRiverSettings5();
        builder2.serializedObjectSupporter = serializedObjectSupporter75;
        org.elasticsearch.river.RiverSettings riverSettings79 = serializedObjectSupporter75.deserializeObjectRiverSettings2();
        java.lang.String str80 = serializedObjectSupporter75.deserializeObjectString2();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(basicDBObject16);
        org.junit.Assert.assertNotNull(executableScript17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNull(strSet25);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNull(strSet35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(builder71);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertNull(riverSettings76);
        org.junit.Assert.assertNull(riverSettings77);
        org.junit.Assert.assertNull(riverSettings79);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "_river" + "'", str80, "_river");
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getACTIONS_FIELD();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = mongoDBRiverDefinition8.initialTimestamp;
        java.lang.String str11 = mongoDBRiverDefinition8.getUSER_FIELD();
        java.lang.String str12 = mongoDBRiverDefinition8.getRiverName();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "actions" + "'", str9, "actions");
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "user" + "'", str11, "user");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.advancedTransformation(false);
        java.lang.String str6 = builder5.getindexName();
        builder5.mongoDb = "throttle_size";
        java.lang.String str9 = builder5.getmongoAdminPassword();
        builder5.mongoSecondaryReadPreference = true;
        builder5.setconnectTimeout(27017);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getACTIONS_FIELD();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = mongoDBRiverDefinition8.initialTimestamp;
        java.lang.String str11 = mongoDBRiverDefinition8.getMongoOplogNamespace();
        int int12 = mongoDBRiverDefinition8.getDEFAULT_BULK_ACTIONS();
        boolean boolean13 = mongoDBRiverDefinition8.importAllCollections;
        boolean boolean14 = mongoDBRiverDefinition8.getstoreStatistics();
        int int15 = mongoDBRiverDefinition8.getThrottleSize();
        boolean boolean16 = mongoDBRiverDefinition8.mongoGridFS;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "actions" + "'", str9, "actions");
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "null.size" + "'", str11, "null.size");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1000 + "'", int12 == 1000);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        builder0.mongoAdminPassword = "name";
        java.lang.String str5 = builder0.mongoCollection;
        java.util.Set<java.lang.String> strSet6 = builder0.includeFields;
        builder0.setstatisticsIndexName("ssl_verify_certificate");
        builder0.mongoDb = "bulk_timeout";
        builder0.riverIndexName = "servers";
        java.lang.String str13 = builder0.includeCollection;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.getmongoCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet5 = builder4.parentTypes;
        boolean boolean6 = builder4.skipInitialImport;
        java.lang.String[] strArray37 = new java.lang.String[] { "disable_index_refresh", "port", "secondary_read_preference", "import_all_collections", "bulk_timeout", "type", "script", "mongodb-1638820218449", "options", "gridfs", "port", "throttle_size", "ssl", "concurrent_bulk_requests", "hi!", "advanced_transformation", "bulk_size", "local", "name", "exclude_fields", "import_all_collections", "script_type", "socket_timeout", "type", "store_statistics", "store_statistics", "servers", "localhost", "ssl", "ssl_verify_certificate" };
        java.util.LinkedHashSet<java.lang.String> strSet38 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet38, strArray37);
        builder4.setincludeFields((java.util.Set<java.lang.String>) strSet38);
        builder0.parentTypes = strSet38;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder0.throttleSize(100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder43.includeCollection("drop_collection");
        com.mongodb.MongoClientOptions mongoClientOptions46 = builder43.mongoClientOptions;
        java.lang.String str47 = builder43.mongoDb;
        builder43.mongoLocalUser = "parent_types";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNull(mongoClientOptions46);
        org.junit.Assert.assertNull(str47);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory3 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject5 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript6 = docScoreNativeScriptFactory3.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject5);
        builder0.setmongoCollectionFilter(basicDBObject5);
        java.lang.String str8 = builder0.mongoDb;
        builder0.setmongoGridFS(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.advancedTransformation(false);
        builder11.mongoAdminPassword = "name";
        java.lang.String str16 = builder11.mongoCollection;
        java.util.Set<java.lang.String> strSet17 = builder11.includeFields;
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp18 = builder11.getinitialTimestamp();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet22 = builder21.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.advancedTransformation(false);
        builder23.mongoAdminPassword = "name";
        java.lang.String str28 = builder23.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder29.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet32 = builder31.parentTypes;
        boolean boolean33 = builder31.skipInitialImport;
        java.lang.String[] strArray64 = new java.lang.String[] { "disable_index_refresh", "port", "secondary_read_preference", "import_all_collections", "bulk_timeout", "type", "script", "mongodb-1638820218449", "options", "gridfs", "port", "throttle_size", "ssl", "concurrent_bulk_requests", "hi!", "advanced_transformation", "bulk_size", "local", "name", "exclude_fields", "import_all_collections", "script_type", "socket_timeout", "type", "store_statistics", "store_statistics", "servers", "localhost", "ssl", "ssl_verify_certificate" };
        java.util.LinkedHashSet<java.lang.String> strSet65 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet65, strArray64);
        builder31.setincludeFields((java.util.Set<java.lang.String>) strSet65);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder68 = builder23.includeFields((java.util.Set<java.lang.String>) strSet65);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder69 = builder21.excludeFields((java.util.Set<java.lang.String>) strSet65);
        builder11.includeFields = strSet65;
        builder0.includeFields = strSet65;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(basicDBObject5);
        org.junit.Assert.assertNotNull(executableScript6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(strSet17);
        org.junit.Assert.assertNull(wildcardTimestamp18);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNull(strSet22);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNull(strSet32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(builder68);
        org.junit.Assert.assertNotNull(builder69);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString11();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString17();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        org.elasticsearch.river.RiverSettings riverSettings4 = serializedObjectSupporter0.deserializeObjectRiverSettings8();
        org.elasticsearch.river.RiverSettings riverSettings5 = serializedObjectSupporter0.deserializeObjectRiverSettings6();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString11();
        org.elasticsearch.river.RiverSettings riverSettings7 = serializedObjectSupporter0.deserializeObjectRiverSettings3();
        org.elasticsearch.river.RiverSettings riverSettings8 = serializedObjectSupporter0.deserializeObjectRiverSettings3();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString9();
        org.elasticsearch.river.RiverSettings riverSettings10 = serializedObjectSupporter0.deserializeObjectRiverSettings6();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb-1638820218387" + "'", str1, "mongodb-1638820218387");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mongodb-1638820218449" + "'", str2, "mongodb-1638820218449");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "mongodb-1638820218326" + "'", str3, "mongodb-1638820218326");
        org.junit.Assert.assertNull(riverSettings4);
        org.junit.Assert.assertNull(riverSettings5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "mongodb-1638820218387" + "'", str6, "mongodb-1638820218387");
        org.junit.Assert.assertNull(riverSettings7);
        org.junit.Assert.assertNull(riverSettings8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "mongodb-1638820218363" + "'", str9, "mongodb-1638820218363");
        org.junit.Assert.assertNull(riverSettings10);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.getmongoCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.riverName("flush_interval");
        boolean boolean4 = builder0.getmongoSSLVerifyCertificate();
        boolean boolean5 = builder0.mongoSecondaryReadPreference;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.util.Set<java.lang.String> strSet1 = builder0.getexcludeFields();
        java.lang.String str2 = builder0.mongoLocalPassword;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.riverIndexName("password");
        java.lang.String str5 = builder0.riverIndexName;
        org.junit.Assert.assertNull(strSet1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "password" + "'", str5, "password");
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder2.mongoLocalPassword("drop_collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder2.mongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet13 = builder12.parentTypes;
        java.lang.String str14 = builder12.getriverIndexName();
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory15 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject17 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript18 = docScoreNativeScriptFactory15.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject17);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory19 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject21 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript22 = docScoreNativeScriptFactory19.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject21);
        com.mongodb.BasicDBObject basicDBObject24 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript25 = docScoreNativeScriptFactory19.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject24);
        org.elasticsearch.script.ExecutableScript executableScript26 = docScoreNativeScriptFactory15.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject24);
        org.elasticsearch.common.settings.Settings settings27 = null;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory28 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject30 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript31 = docScoreNativeScriptFactory28.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject30);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory32 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject34 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript35 = docScoreNativeScriptFactory32.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject34);
        com.mongodb.BasicDBObject basicDBObject37 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript38 = docScoreNativeScriptFactory32.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject37);
        org.elasticsearch.script.ExecutableScript executableScript39 = docScoreNativeScriptFactory28.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject37);
        org.elasticsearch.river.RiverSettings riverSettings40 = new org.elasticsearch.river.RiverSettings(settings27, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject37);
        org.elasticsearch.script.ExecutableScript executableScript41 = docScoreNativeScriptFactory15.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject37);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder12.mongoOplogFilter(basicDBObject37);
        boolean boolean43 = builder42.skipInitialImport;
        builder42.advancedTransformation = false;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder46.advancedTransformation(false);
        builder46.mongoAdminPassword = "name";
        java.lang.String str51 = builder46.mongoCollection;
        java.lang.String str52 = builder46.includeCollection;
        java.lang.String str53 = builder46.getstatisticsTypeName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder54.advancedTransformation(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory57 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject59 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript60 = docScoreNativeScriptFactory57.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject59);
        builder54.setmongoCollectionFilter(basicDBObject59);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = builder54.mongoDb("mongodb-1638820218387");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder64 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder66 = builder64.advancedTransformation(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory67 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject69 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript70 = docScoreNativeScriptFactory67.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject69);
        builder64.setmongoCollectionFilter(basicDBObject69);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder73 = builder64.mongoDb("mongodb-1638820218387");
        java.lang.String[] strArray79 = new java.lang.String[] { "throttle_size", "", "db", "db", "local" };
        java.util.LinkedHashSet<java.lang.String> strSet80 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet80, strArray79);
        builder64.setparentTypes((java.util.Set<java.lang.String>) strSet80);
        builder63.parentTypes = strSet80;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder84 = builder46.includeFields((java.util.Set<java.lang.String>) strSet80);
        builder42.setincludeFields((java.util.Set<java.lang.String>) strSet80);
        builder9.includeFields = strSet80;
        org.bson.types.Binary binary87 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder88 = builder9.initialTimestamp(binary87);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(strSet13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(basicDBObject17);
        org.junit.Assert.assertNotNull(executableScript18);
        org.junit.Assert.assertNotNull(basicDBObject21);
        org.junit.Assert.assertNotNull(executableScript22);
        org.junit.Assert.assertNotNull(basicDBObject24);
        org.junit.Assert.assertNotNull(executableScript25);
        org.junit.Assert.assertNotNull(executableScript26);
        org.junit.Assert.assertNotNull(basicDBObject30);
        org.junit.Assert.assertNotNull(executableScript31);
        org.junit.Assert.assertNotNull(basicDBObject34);
        org.junit.Assert.assertNotNull(executableScript35);
        org.junit.Assert.assertNotNull(basicDBObject37);
        org.junit.Assert.assertNotNull(executableScript38);
        org.junit.Assert.assertNotNull(executableScript39);
        org.junit.Assert.assertNotNull(executableScript41);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(basicDBObject59);
        org.junit.Assert.assertNotNull(executableScript60);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(basicDBObject69);
        org.junit.Assert.assertNotNull(executableScript70);
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(builder84);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.lang.String str3 = builder2.riverIndexName;
        com.mongodb.MongoClientOptions mongoClientOptions4 = builder2.mongoClientOptions;
        builder2.skipInitialImport = false;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder2.mongoLocalPassword("mongodb-1638820218449");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(mongoClientOptions4);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        builder0.mongoAdminPassword = "name";
        java.lang.String str5 = builder0.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet9 = builder8.parentTypes;
        boolean boolean10 = builder8.skipInitialImport;
        java.lang.String[] strArray41 = new java.lang.String[] { "disable_index_refresh", "port", "secondary_read_preference", "import_all_collections", "bulk_timeout", "type", "script", "mongodb-1638820218449", "options", "gridfs", "port", "throttle_size", "ssl", "concurrent_bulk_requests", "hi!", "advanced_transformation", "bulk_size", "local", "name", "exclude_fields", "import_all_collections", "script_type", "socket_timeout", "type", "store_statistics", "store_statistics", "servers", "localhost", "ssl", "ssl_verify_certificate" };
        java.util.LinkedHashSet<java.lang.String> strSet42 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet42, strArray41);
        builder8.setincludeFields((java.util.Set<java.lang.String>) strSet42);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder0.includeFields((java.util.Set<java.lang.String>) strSet42);
        boolean boolean46 = builder45.getdisableIndexRefresh();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder45.typeName("actions");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder49.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet52 = builder49.includeFields;
        boolean boolean53 = builder49.getmongoGridFS();
        java.util.Set<java.lang.String> strSet54 = builder49.parentTypes;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder49.advancedTransformation(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = builder57.advancedTransformation(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory60 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject62 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript63 = docScoreNativeScriptFactory60.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject62);
        builder57.setmongoCollectionFilter(basicDBObject62);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder66 = builder57.mongoDb("mongodb-1638820218387");
        java.lang.String[] strArray72 = new java.lang.String[] { "throttle_size", "", "db", "db", "local" };
        java.util.LinkedHashSet<java.lang.String> strSet73 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet73, strArray72);
        builder57.setparentTypes((java.util.Set<java.lang.String>) strSet73);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder76 = builder49.parentTypes((java.util.Set<java.lang.String>) strSet73);
        builder48.setexcludeFields((java.util.Set<java.lang.String>) strSet73);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(strSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNull(strSet52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(strSet54);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(basicDBObject62);
        org.junit.Assert.assertNotNull(executableScript63);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(builder76);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.parentTypes;
        java.lang.String str4 = builder2.getriverIndexName();
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory5 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject7 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript8 = docScoreNativeScriptFactory5.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject7);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory9 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject11 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript12 = docScoreNativeScriptFactory9.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject11);
        com.mongodb.BasicDBObject basicDBObject14 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript15 = docScoreNativeScriptFactory9.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject14);
        org.elasticsearch.script.ExecutableScript executableScript16 = docScoreNativeScriptFactory5.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject14);
        org.elasticsearch.common.settings.Settings settings17 = null;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory18 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject20 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript21 = docScoreNativeScriptFactory18.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject20);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory22 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject24 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript25 = docScoreNativeScriptFactory22.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject24);
        com.mongodb.BasicDBObject basicDBObject27 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript28 = docScoreNativeScriptFactory22.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject27);
        org.elasticsearch.script.ExecutableScript executableScript29 = docScoreNativeScriptFactory18.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject27);
        org.elasticsearch.river.RiverSettings riverSettings30 = new org.elasticsearch.river.RiverSettings(settings17, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject27);
        org.elasticsearch.script.ExecutableScript executableScript31 = docScoreNativeScriptFactory5.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject27);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder2.mongoOplogFilter(basicDBObject27);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder2.statisticsIndexName("password");
        java.lang.String str35 = builder34.mongoLocalPassword;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder34.mongoLocalPassword("");
        java.lang.String str38 = builder37.getmongoLocalPassword();
        boolean boolean39 = builder37.getstoreStatistics();
        java.lang.String str40 = builder37.mongoAdminUser;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(basicDBObject7);
        org.junit.Assert.assertNotNull(executableScript8);
        org.junit.Assert.assertNotNull(basicDBObject11);
        org.junit.Assert.assertNotNull(executableScript12);
        org.junit.Assert.assertNotNull(basicDBObject14);
        org.junit.Assert.assertNotNull(executableScript15);
        org.junit.Assert.assertNotNull(executableScript16);
        org.junit.Assert.assertNotNull(basicDBObject20);
        org.junit.Assert.assertNotNull(executableScript21);
        org.junit.Assert.assertNotNull(basicDBObject24);
        org.junit.Assert.assertNotNull(executableScript25);
        org.junit.Assert.assertNotNull(basicDBObject27);
        org.junit.Assert.assertNotNull(executableScript28);
        org.junit.Assert.assertNotNull(executableScript29);
        org.junit.Assert.assertNotNull(executableScript31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder0.includeFields;
        boolean boolean4 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoLocalUser("gridfs");
        java.util.List<com.mongodb.ServerAddress> serverAddressList7 = builder6.mongoServers;
        java.util.Set<java.lang.String> strSet8 = builder6.getincludeFields();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(serverAddressList7);
        org.junit.Assert.assertNull(strSet8);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        boolean boolean9 = mongoDBRiverDefinition8.getadvancedTransformation();
        java.lang.String str10 = mongoDBRiverDefinition8.getDEFAULT_DB_HOST();
        org.elasticsearch.common.unit.TimeValue timeValue11 = mongoDBRiverDefinition8.getDEFAULT_FLUSH_INTERVAL();
        boolean boolean12 = mongoDBRiverDefinition8.isDropCollection();
        boolean boolean13 = mongoDBRiverDefinition8.getimportAllCollections();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "localhost" + "'", str10, "localhost");
        org.junit.Assert.assertNotNull(timeValue11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        boolean boolean9 = mongoDBRiverDefinition8.getadvancedTransformation();
        java.lang.String str10 = mongoDBRiverDefinition8.getDEFAULT_DB_HOST();
        java.lang.String str11 = mongoDBRiverDefinition8.getINCLUDE_FIELDS_FIELD();
        java.lang.String str12 = mongoDBRiverDefinition8.getSECONDARY_READ_PREFERENCE_FIELD();
        java.lang.String str13 = mongoDBRiverDefinition8.getBULK_FIELD();
        boolean boolean14 = mongoDBRiverDefinition8.isMongoGridFS();
        java.lang.String str15 = mongoDBRiverDefinition8.getSSL_VERIFY_CERT_FIELD();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "localhost" + "'", str10, "localhost");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "include_fields" + "'", str11, "include_fields");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "secondary_read_preference" + "'", str12, "secondary_read_preference");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "bulk" + "'", str13, "bulk");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ssl_verify_certificate" + "'", str15, "ssl_verify_certificate");
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getADMIN_DB_FIELD();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue11 = mongoDBRiverDefinition8.getDEFAULT_BULK_SIZE();
        boolean boolean12 = mongoDBRiverDefinition8.getmongoGridFS();
        boolean boolean13 = mongoDBRiverDefinition8.mongoGridFS;
        boolean boolean14 = mongoDBRiverDefinition8.storeStatistics;
        java.util.List<com.mongodb.ServerAddress> serverAddressList15 = mongoDBRiverDefinition8.getMongoServers();
        java.lang.String str16 = mongoDBRiverDefinition8.getSTORE_STATISTICS_FIELD();
        java.lang.String str17 = mongoDBRiverDefinition8.getSOCKET_TIMEOUT();
        int int18 = mongoDBRiverDefinition8.getDEFAULT_DB_PORT();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertNotNull(byteSizeValue11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(serverAddressList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "store_statistics" + "'", str16, "store_statistics");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "socket_timeout" + "'", str17, "socket_timeout");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 27017 + "'", int18 == 27017);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        int int6 = builder2.getsocketTimeout();
        builder2.setmongoSecondaryReadPreference(false);
        builder2.setskipInitialImport(true);
        com.mongodb.BasicDBObject basicDBObject11 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder2.mongoOplogFilter(basicDBObject11);
        builder12.setmongoGridFS(false);
        boolean boolean15 = builder12.getmongoUseSSL();
        java.lang.String str16 = builder12.getscriptType();
        java.lang.String str17 = builder12.mongoLocalPassword;
        builder12.setadvancedTransformation(true);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.advancedTransformation(false);
        builder2.setimportAllCollections(false);
        builder2.riverName = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet13 = builder12.parentTypes;
        boolean boolean14 = builder12.skipInitialImport;
        java.lang.String[] strArray45 = new java.lang.String[] { "disable_index_refresh", "port", "secondary_read_preference", "import_all_collections", "bulk_timeout", "type", "script", "mongodb-1638820218449", "options", "gridfs", "port", "throttle_size", "ssl", "concurrent_bulk_requests", "hi!", "advanced_transformation", "bulk_size", "local", "name", "exclude_fields", "import_all_collections", "script_type", "socket_timeout", "type", "store_statistics", "store_statistics", "servers", "localhost", "ssl", "ssl_verify_certificate" };
        java.util.LinkedHashSet<java.lang.String> strSet46 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet46, strArray45);
        builder12.setincludeFields((java.util.Set<java.lang.String>) strSet46);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder2.includeFields((java.util.Set<java.lang.String>) strSet46);
        com.mongodb.MongoClientOptions mongoClientOptions50 = builder2.mongoClientOptions;
        builder2.script = "gridfs";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder53.advancedTransformation(false);
        builder53.mongoAdminPassword = "name";
        builder53.setmongoAdminPassword("mongodb-1638820218326");
        java.lang.String str60 = builder53.getmongoLocalUser();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = builder53.mongoUseSSL(false);
        builder53.mongoAdminPassword = "advanced_transformation";
        boolean boolean65 = builder53.mongoGridFS;
        builder53.mongoCollection = "bulk_timeout";
        builder53.riverIndexName = "db";
        java.lang.String[] strArray93 = new java.lang.String[] { "disable_index_refresh", "hi!", "advanced_transformation", "initial_timestamp", "index", "include_collection", "mongodb-1638820218449", "exclude_fields", "", "null.size", "concurrent_requests", "admin", "local", "index", "advanced_transformation", "mongodb-1638820218299", "initial_timestamp", "drop_collection", "throttle_size", "parent_types", "skip_initial_import", "mongodb-1638820218424", "mongodb-1638820218424" };
        java.util.LinkedHashSet<java.lang.String> strSet94 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean95 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet94, strArray93);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder96 = builder53.excludeFields((java.util.Set<java.lang.String>) strSet94);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder97 = builder2.includeFields((java.util.Set<java.lang.String>) strSet94);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition98 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder2);
        java.lang.String str99 = builder2.getmongoLocalPassword();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(strSet13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNull(mongoClientOptions50);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(strArray93);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertNotNull(builder96);
        org.junit.Assert.assertNotNull(builder97);
        org.junit.Assert.assertEquals("'" + str99 + "' != '" + "" + "'", str99, "");
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        int int6 = builder2.getsocketTimeout();
        builder2.settypeName("initial_timestamp");
        builder2.setriverName("size");
        java.util.Set<java.lang.String> strSet11 = builder2.excludeFields;
        java.lang.String str12 = builder2.getmongoDb();
        java.lang.String str13 = builder2.getriverIndexName();
        org.bson.types.BSONTimestamp bSONTimestamp14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder2.initialTimestamp(bSONTimestamp14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ts must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(strSet11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getADMIN_DB_FIELD();
        java.util.Set<java.lang.String> strSet11 = mongoDBRiverDefinition8.parentTypes;
        java.lang.String str12 = mongoDBRiverDefinition8.getSSL_VERIFY_CERT_FIELD();
        boolean boolean13 = mongoDBRiverDefinition8.storeStatistics;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertNull(strSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ssl_verify_certificate" + "'", str12, "ssl_verify_certificate");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        int int6 = builder2.getsocketTimeout();
        builder2.setmongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder2.mongoSSLVerifyCertificate(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder2.indexName("password");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.mongoUseSSL(true);
        builder12.setthrottleSize((-1));
        java.util.List<com.mongodb.ServerAddress> serverAddressList17 = builder12.mongoServers;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder12.storeStatistics(false);
        builder19.setmongoUseSSL(true);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory22 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.common.settings.Settings settings23 = null;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory24 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject26 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript27 = docScoreNativeScriptFactory24.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject26);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory28 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject30 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript31 = docScoreNativeScriptFactory28.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject30);
        com.mongodb.BasicDBObject basicDBObject33 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript34 = docScoreNativeScriptFactory28.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject33);
        org.elasticsearch.script.ExecutableScript executableScript35 = docScoreNativeScriptFactory24.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject33);
        org.elasticsearch.river.RiverSettings riverSettings36 = new org.elasticsearch.river.RiverSettings(settings23, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject33);
        org.elasticsearch.script.ExecutableScript executableScript37 = docScoreNativeScriptFactory22.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject33);
        builder19.mongoCollectionFilter = basicDBObject33;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder19.storeStatistics(true);
        builder40.riverIndexName = "mongodb-1638820218264";
        java.lang.String str43 = builder40.getscript();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(serverAddressList17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(basicDBObject26);
        org.junit.Assert.assertNotNull(executableScript27);
        org.junit.Assert.assertNotNull(basicDBObject30);
        org.junit.Assert.assertNotNull(executableScript31);
        org.junit.Assert.assertNotNull(basicDBObject33);
        org.junit.Assert.assertNotNull(executableScript34);
        org.junit.Assert.assertNotNull(executableScript35);
        org.junit.Assert.assertNotNull(executableScript37);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNull(str43);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString11();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString12();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb-1638820218387" + "'", str1, "mongodb-1638820218387");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_river" + "'", str2, "_river");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_river" + "'", str3, "_river");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb-1638820217755" + "'", str4, "mongodb-1638820217755");
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getADMIN_DB_FIELD();
        java.util.List<com.mongodb.ServerAddress> serverAddressList11 = mongoDBRiverDefinition8.mongoServers;
        boolean boolean12 = mongoDBRiverDefinition8.isImportAllCollections();
        boolean boolean13 = mongoDBRiverDefinition8.skipInitialImport;
        java.lang.String str14 = mongoDBRiverDefinition8.getINITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD();
        boolean boolean15 = mongoDBRiverDefinition8.getmongoUseSSL();
        java.util.Set<java.lang.String> strSet16 = mongoDBRiverDefinition8.getIncludeFields();
        java.lang.String str17 = mongoDBRiverDefinition8.getIncludeCollection();
        java.lang.String str18 = mongoDBRiverDefinition8.getCREDENTIALS_FIELD();
        java.lang.String str19 = mongoDBRiverDefinition8.getGRIDFS_FIELD();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertNotNull(serverAddressList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "script_type" + "'", str14, "script_type");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(strSet16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "credentials" + "'", str18, "credentials");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "gridfs" + "'", str19, "gridfs");
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        builder0.mongoAdminPassword = "name";
        java.lang.String str5 = builder0.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet9 = builder8.parentTypes;
        boolean boolean10 = builder8.skipInitialImport;
        java.lang.String[] strArray41 = new java.lang.String[] { "disable_index_refresh", "port", "secondary_read_preference", "import_all_collections", "bulk_timeout", "type", "script", "mongodb-1638820218449", "options", "gridfs", "port", "throttle_size", "ssl", "concurrent_bulk_requests", "hi!", "advanced_transformation", "bulk_size", "local", "name", "exclude_fields", "import_all_collections", "script_type", "socket_timeout", "type", "store_statistics", "store_statistics", "servers", "localhost", "ssl", "ssl_verify_certificate" };
        java.util.LinkedHashSet<java.lang.String> strSet42 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet42, strArray41);
        builder8.setincludeFields((java.util.Set<java.lang.String>) strSet42);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder0.includeFields((java.util.Set<java.lang.String>) strSet42);
        builder45.riverName = "disable_index_refresh";
        builder45.setindexName("actions");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder45.storeStatistics(true);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(strSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder51);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory3 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject5 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript6 = docScoreNativeScriptFactory3.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject5);
        builder0.setmongoCollectionFilter(basicDBObject5);
        java.lang.String str8 = builder0.getriverIndexName();
        com.mongodb.MongoClientOptions mongoClientOptions9 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoClientOptions(mongoClientOptions9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet14 = builder13.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.advancedTransformation(false);
        builder15.mongoAdminPassword = "name";
        java.lang.String str20 = builder15.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet24 = builder23.parentTypes;
        boolean boolean25 = builder23.skipInitialImport;
        java.lang.String[] strArray56 = new java.lang.String[] { "disable_index_refresh", "port", "secondary_read_preference", "import_all_collections", "bulk_timeout", "type", "script", "mongodb-1638820218449", "options", "gridfs", "port", "throttle_size", "ssl", "concurrent_bulk_requests", "hi!", "advanced_transformation", "bulk_size", "local", "name", "exclude_fields", "import_all_collections", "script_type", "socket_timeout", "type", "store_statistics", "store_statistics", "servers", "localhost", "ssl", "ssl_verify_certificate" };
        java.util.LinkedHashSet<java.lang.String> strSet57 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet57, strArray56);
        builder23.setincludeFields((java.util.Set<java.lang.String>) strSet57);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder15.includeFields((java.util.Set<java.lang.String>) strSet57);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = builder13.excludeFields((java.util.Set<java.lang.String>) strSet57);
        builder0.includeFields = strSet57;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder64 = builder0.mongoSecondaryReadPreference(true);
        builder0.riverIndexName = "ssl_verify_certificate";
        int int67 = builder0.throttleSize;
        builder0.setmongoLocalPassword("bulk_size");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp70 = builder0.getinitialTimestamp();
        builder0.mongoLocalPassword = "mongodb-1638820218264";
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(basicDBObject5);
        org.junit.Assert.assertNotNull(executableScript6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNull(strSet14);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNull(strSet24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNull(wildcardTimestamp70);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("secondary_read_preference", "db", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?db?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = mongoDBRiverDefinition8.getInitialTimestamp();
        boolean boolean11 = mongoDBRiverDefinition8.getimportAllCollections();
        java.util.Set<java.lang.String> strSet12 = mongoDBRiverDefinition8.getParentTypes();
        java.lang.String str13 = mongoDBRiverDefinition8.getPARENT_TYPES_FIELD();
        boolean boolean14 = mongoDBRiverDefinition8.isSkipInitialImport();
        java.lang.String str15 = mongoDBRiverDefinition8.getMongoAdminPassword();
        boolean boolean16 = mongoDBRiverDefinition8.getmongoUseSSL();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(strSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "parent_types" + "'", str13, "parent_types");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        int int6 = builder2.getsocketTimeout();
        builder2.settypeName("initial_timestamp");
        builder2.setriverName("size");
        java.util.Set<java.lang.String> strSet11 = builder2.getincludeFields();
        java.util.Set<java.lang.String> strSet12 = builder2.getparentTypes();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(strSet11);
        org.junit.Assert.assertNull(strSet12);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = builder5.getmongoCollection();
        org.bson.types.Binary binary10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder5.initialTimestamp(binary10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "size" + "'", str9, "size");
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.parentTypes;
        boolean boolean4 = builder2.skipInitialImport;
        com.mongodb.MongoClientOptions mongoClientOptions5 = builder2.getmongoClientOptions();
        builder2.indexName = "servers";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder2.disableIndexRefresh(true);
        java.util.Set<java.lang.String> strSet10 = builder9.getexcludeFields();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder9.mongoSSLVerifyCertificate(false);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(mongoClientOptions5);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(strSet10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.parentTypes;
        java.lang.String str4 = builder2.getriverIndexName();
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory5 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject7 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript8 = docScoreNativeScriptFactory5.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject7);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory9 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject11 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript12 = docScoreNativeScriptFactory9.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject11);
        com.mongodb.BasicDBObject basicDBObject14 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript15 = docScoreNativeScriptFactory9.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject14);
        org.elasticsearch.script.ExecutableScript executableScript16 = docScoreNativeScriptFactory5.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject14);
        org.elasticsearch.common.settings.Settings settings17 = null;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory18 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject20 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript21 = docScoreNativeScriptFactory18.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject20);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory22 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject24 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript25 = docScoreNativeScriptFactory22.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject24);
        com.mongodb.BasicDBObject basicDBObject27 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript28 = docScoreNativeScriptFactory22.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject27);
        org.elasticsearch.script.ExecutableScript executableScript29 = docScoreNativeScriptFactory18.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject27);
        org.elasticsearch.river.RiverSettings riverSettings30 = new org.elasticsearch.river.RiverSettings(settings17, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject27);
        org.elasticsearch.script.ExecutableScript executableScript31 = docScoreNativeScriptFactory5.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject27);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder2.mongoOplogFilter(basicDBObject27);
        boolean boolean33 = builder32.mongoUseSSL;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder32.mongoLocalPassword("_river");
        java.lang.String str36 = builder32.mongoAdminPassword;
        boolean boolean37 = builder32.getadvancedTransformation();
        boolean boolean38 = builder32.getdropCollection();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(basicDBObject7);
        org.junit.Assert.assertNotNull(executableScript8);
        org.junit.Assert.assertNotNull(basicDBObject11);
        org.junit.Assert.assertNotNull(executableScript12);
        org.junit.Assert.assertNotNull(basicDBObject14);
        org.junit.Assert.assertNotNull(executableScript15);
        org.junit.Assert.assertNotNull(executableScript16);
        org.junit.Assert.assertNotNull(basicDBObject20);
        org.junit.Assert.assertNotNull(executableScript21);
        org.junit.Assert.assertNotNull(basicDBObject24);
        org.junit.Assert.assertNotNull(executableScript25);
        org.junit.Assert.assertNotNull(basicDBObject27);
        org.junit.Assert.assertNotNull(executableScript28);
        org.junit.Assert.assertNotNull(executableScript29);
        org.junit.Assert.assertNotNull(executableScript31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.parentTypes;
        builder2.indexName = "disable_index_refresh";
        builder2.setriverName("ssl_verify_certificate");
        builder2.setmongoSecondaryReadPreference(true);
        java.lang.String str10 = builder2.getmongoCollection();
        builder2.setincludeCollection("hi!");
        builder2.setthrottleSize((int) (byte) -1);
        builder2.setdisableIndexRefresh(false);
        java.lang.String str17 = builder2.getscript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder2.riverIndexName("user");
        java.lang.String str20 = builder19.scriptType;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("mongodb-1638820218326", "mongodb-1638820218424");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?mongodb-1638820218424?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("bulk_size", "store_statistics");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?store_statistics?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        builder0.mongoAdminPassword = "name";
        builder0.setmongoAdminPassword("mongodb-1638820218326");
        builder0.includeCollection = "mongodb-1638820218363";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoAdminPassword("include_fields");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet14 = builder13.parentTypes;
        builder13.indexName = "disable_index_refresh";
        builder13.setriverName("ssl_verify_certificate");
        builder13.setmongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp21 = builder13.initialTimestamp;
        builder13.riverIndexName = "db";
        com.mongodb.BasicDBObject basicDBObject24 = builder13.mongoCollectionFilter;
        builder10.setmongoCollectionFilter(basicDBObject24);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder10.mongoCollection("import_all_collections");
        org.bson.types.BSONTimestamp bSONTimestamp28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder10.initialTimestamp(bSONTimestamp28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ts must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNull(strSet14);
        org.junit.Assert.assertNull(wildcardTimestamp21);
        org.junit.Assert.assertNotNull(basicDBObject24);
        org.junit.Assert.assertNotNull(builder27);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder5.includeCollection("throttle_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.disableIndexRefresh(true);
        builder10.setmongoDb("user");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.advancedTransformation(false);
        builder2.setimportAllCollections(false);
        builder2.riverName = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet13 = builder12.parentTypes;
        boolean boolean14 = builder12.skipInitialImport;
        java.lang.String[] strArray45 = new java.lang.String[] { "disable_index_refresh", "port", "secondary_read_preference", "import_all_collections", "bulk_timeout", "type", "script", "mongodb-1638820218449", "options", "gridfs", "port", "throttle_size", "ssl", "concurrent_bulk_requests", "hi!", "advanced_transformation", "bulk_size", "local", "name", "exclude_fields", "import_all_collections", "script_type", "socket_timeout", "type", "store_statistics", "store_statistics", "servers", "localhost", "ssl", "ssl_verify_certificate" };
        java.util.LinkedHashSet<java.lang.String> strSet46 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet46, strArray45);
        builder12.setincludeFields((java.util.Set<java.lang.String>) strSet46);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder2.includeFields((java.util.Set<java.lang.String>) strSet46);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter50 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str51 = serializedObjectSupporter50.deserializeObjectString11();
        java.lang.String str52 = serializedObjectSupporter50.deserializeObjectString6();
        org.elasticsearch.river.RiverSettings riverSettings53 = serializedObjectSupporter50.deserializeObjectRiverSettings8();
        org.elasticsearch.river.RiverSettings riverSettings54 = serializedObjectSupporter50.deserializeObjectRiverSettings7();
        builder2.serializedObjectSupporter = serializedObjectSupporter50;
        org.elasticsearch.river.RiverSettings riverSettings56 = serializedObjectSupporter50.deserializeObjectRiverSettings8();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(strSet13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "mongodb-1638820218387" + "'", str51, "mongodb-1638820218387");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "_river" + "'", str52, "_river");
        org.junit.Assert.assertNull(riverSettings53);
        org.junit.Assert.assertNull(riverSettings54);
        org.junit.Assert.assertNull(riverSettings56);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getACTIONS_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getDB_FIELD();
        java.lang.String str11 = mongoDBRiverDefinition8.getUSER_FIELD();
        java.lang.String str12 = mongoDBRiverDefinition8.getINITIAL_TIMESTAMP_FIELD();
        boolean boolean13 = mongoDBRiverDefinition8.isMongoSecondaryReadPreference();
        java.lang.String str14 = mongoDBRiverDefinition8.getBULK_FIELD();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "actions" + "'", str9, "actions");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "db" + "'", str10, "db");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "user" + "'", str11, "user");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "initial_timestamp" + "'", str12, "initial_timestamp");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "bulk" + "'", str14, "bulk");
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        boolean boolean10 = mongoDBRiverDefinition8.getmongoSecondaryReadPreference();
        boolean boolean11 = mongoDBRiverDefinition8.mongoSecondaryReadPreference;
        com.mongodb.BasicDBObject basicDBObject12 = mongoDBRiverDefinition8.getMongoOplogFilter();
        com.mongodb.BasicDBObject basicDBObject13 = mongoDBRiverDefinition8.getMongoCollectionFilter();
        boolean boolean14 = mongoDBRiverDefinition8.getdropCollection();
        boolean boolean15 = mongoDBRiverDefinition8.getmongoGridFS();
        java.lang.String str16 = mongoDBRiverDefinition8.getEXCLUDE_FIELDS_FIELD();
        boolean boolean17 = mongoDBRiverDefinition8.getdisableIndexRefresh();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(basicDBObject12);
        org.junit.Assert.assertNotNull(basicDBObject13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "exclude_fields" + "'", str16, "exclude_fields");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString11();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString17();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString7();
        org.elasticsearch.river.RiverSettings riverSettings4 = serializedObjectSupporter0.deserializeObjectRiverSettings8();
        org.elasticsearch.river.RiverSettings riverSettings5 = serializedObjectSupporter0.deserializeObjectRiverSettings6();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString11();
        org.elasticsearch.river.RiverSettings riverSettings7 = serializedObjectSupporter0.deserializeObjectRiverSettings3();
        org.elasticsearch.river.RiverSettings riverSettings8 = serializedObjectSupporter0.deserializeObjectRiverSettings3();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString9();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str11 = serializedObjectSupporter0.deserializeObjectString12();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb-1638820218387" + "'", str1, "mongodb-1638820218387");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mongodb-1638820218449" + "'", str2, "mongodb-1638820218449");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "mongodb-1638820218326" + "'", str3, "mongodb-1638820218326");
        org.junit.Assert.assertNull(riverSettings4);
        org.junit.Assert.assertNull(riverSettings5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "mongodb-1638820218387" + "'", str6, "mongodb-1638820218387");
        org.junit.Assert.assertNull(riverSettings7);
        org.junit.Assert.assertNull(riverSettings8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "mongodb-1638820218363" + "'", str9, "mongodb-1638820218363");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_river" + "'", str10, "_river");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_river" + "'", str11, "_river");
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        boolean boolean3 = builder0.getdropCollection();
        java.lang.String str4 = builder0.script;
        boolean boolean5 = builder0.mongoSSLVerifyCertificate;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        int int6 = builder2.getsocketTimeout();
        java.lang.String str7 = builder2.mongoAdminPassword;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder2.socketTimeout((int) (short) -1);
        java.util.Set<java.lang.String> strSet10 = builder9.getexcludeFields();
        builder9.setstoreStatistics(false);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(strSet10);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.script = "skip_initial_import";
        java.lang.String str8 = builder5.getmongoLocalPassword();
        java.lang.String str9 = builder5.mongoDb;
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = builder5.initialTimestamp;
        boolean boolean11 = builder5.getimportAllCollections();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(wildcardTimestamp10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getADMIN_DB_FIELD();
        java.util.List<com.mongodb.ServerAddress> serverAddressList11 = mongoDBRiverDefinition8.mongoServers;
        java.lang.String str12 = mongoDBRiverDefinition8.mongoAdminPassword;
        java.lang.String str13 = mongoDBRiverDefinition8.getACTIONS_FIELD();
        java.lang.String str14 = mongoDBRiverDefinition8.getFLUSH_INTERVAL_FIELD();
        java.lang.Class<?> wildcardClass15 = mongoDBRiverDefinition8.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertNotNull(serverAddressList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "actions" + "'", str13, "actions");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "flush_interval" + "'", str14, "flush_interval");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        boolean boolean10 = mongoDBRiverDefinition8.getmongoSecondaryReadPreference();
        java.lang.String str11 = mongoDBRiverDefinition8.getLOCAL_DB_FIELD();
        boolean boolean12 = mongoDBRiverDefinition8.isImportAllCollections();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "local" + "'", str11, "local");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.advancedTransformation(false);
        builder5.mongoAdminUser = "actions";
        java.lang.String str8 = builder5.getmongoAdminUser();
        com.mongodb.MongoClientOptions mongoClientOptions9 = null;
        builder5.setmongoClientOptions(mongoClientOptions9);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "actions" + "'", str8, "actions");
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        builder0.mongoAdminPassword = "name";
        java.lang.String str5 = builder0.mongoCollection;
        java.util.Set<java.lang.String> strSet6 = builder0.includeFields;
        builder0.setstatisticsIndexName("ssl_verify_certificate");
        builder0.setstatisticsTypeName("disable_index_refresh");
        int int11 = builder0.throttleSize;
        java.util.Set<java.lang.String> strSet12 = builder0.excludeFields;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(strSet12);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder0.includeFields;
        boolean boolean4 = builder0.getmongoGridFS();
        java.util.Set<java.lang.String> strSet5 = builder0.parentTypes;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.advancedTransformation(true);
        builder0.setriverIndexName("flush_interval");
        java.lang.String str10 = builder0.statisticsIndexName;
        builder0.setmongoCollection("bulk_timeout");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.advancedTransformation(false);
        java.lang.String str6 = builder5.getindexName();
        java.lang.String str7 = builder5.mongoAdminPassword;
        boolean boolean8 = builder5.getimportAllCollections();
        java.lang.String str9 = builder5.gettypeName();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        builder0.mongoAdminPassword = "name";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoUseSSL(false);
        java.lang.String str7 = builder0.includeCollection;
        builder0.riverName = "disable_index_refresh";
        com.mongodb.MongoClientOptions mongoClientOptions10 = null;
        builder0.mongoClientOptions = mongoClientOptions10;
        java.lang.String str12 = builder0.getscript();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory3 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject5 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript6 = docScoreNativeScriptFactory3.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject5);
        builder0.setmongoCollectionFilter(basicDBObject5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.mongoDb("mongodb-1638820218387");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.advancedTransformation(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory13 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject15 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript16 = docScoreNativeScriptFactory13.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject15);
        builder10.setmongoCollectionFilter(basicDBObject15);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder10.mongoDb("mongodb-1638820218387");
        java.lang.String[] strArray25 = new java.lang.String[] { "throttle_size", "", "db", "db", "local" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        builder10.setparentTypes((java.util.Set<java.lang.String>) strSet26);
        builder9.parentTypes = strSet26;
        com.mongodb.BasicDBObject basicDBObject30 = builder9.mongoCollectionFilter;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder9.importAllCollections(true);
        builder32.setmongoGridFS(false);
        boolean boolean35 = builder32.getadvancedTransformation();
        builder32.mongoAdminPassword = "mongodb-1638820218363";
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(basicDBObject5);
        org.junit.Assert.assertNotNull(executableScript6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(basicDBObject15);
        org.junit.Assert.assertNotNull(executableScript16);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(basicDBObject30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        int int6 = builder2.getsocketTimeout();
        builder2.setmongoSecondaryReadPreference(false);
        java.lang.String str9 = builder2.mongoAdminPassword;
        java.lang.String str10 = builder2.getstatisticsTypeName();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getADMIN_DB_FIELD();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue11 = mongoDBRiverDefinition8.getDEFAULT_BULK_SIZE();
        boolean boolean12 = mongoDBRiverDefinition8.getmongoGridFS();
        java.lang.String str13 = mongoDBRiverDefinition8.getMongoOplogNamespace();
        boolean boolean14 = mongoDBRiverDefinition8.mongoSecondaryReadPreference;
        java.lang.String str15 = mongoDBRiverDefinition8.getSSL_VERIFY_CERT_FIELD();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "admin" + "'", str10, "admin");
        org.junit.Assert.assertNotNull(byteSizeValue11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "null.size" + "'", str13, "null.size");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ssl_verify_certificate" + "'", str15, "ssl_verify_certificate");
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        builder0.mongoAdminPassword = "name";
        java.lang.String str5 = builder0.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet9 = builder8.parentTypes;
        boolean boolean10 = builder8.skipInitialImport;
        java.lang.String[] strArray41 = new java.lang.String[] { "disable_index_refresh", "port", "secondary_read_preference", "import_all_collections", "bulk_timeout", "type", "script", "mongodb-1638820218449", "options", "gridfs", "port", "throttle_size", "ssl", "concurrent_bulk_requests", "hi!", "advanced_transformation", "bulk_size", "local", "name", "exclude_fields", "import_all_collections", "script_type", "socket_timeout", "type", "store_statistics", "store_statistics", "servers", "localhost", "ssl", "ssl_verify_certificate" };
        java.util.LinkedHashSet<java.lang.String> strSet42 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet42, strArray41);
        builder8.setincludeFields((java.util.Set<java.lang.String>) strSet42);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder0.includeFields((java.util.Set<java.lang.String>) strSet42);
        boolean boolean46 = builder45.getmongoSecondaryReadPreference();
        java.lang.String str47 = builder45.mongoCollection;
        java.util.Set<java.lang.String> strSet48 = builder45.excludeFields;
        builder45.includeCollection = "";
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(strSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNull(strSet48);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder0.includeFields;
        java.lang.String str4 = builder0.getriverIndexName();
        builder0.scriptType = "credentials";
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        boolean boolean10 = mongoDBRiverDefinition8.getmongoGridFS();
        com.mongodb.BasicDBObject basicDBObject11 = mongoDBRiverDefinition8.mongoOplogFilter;
        java.util.Set<java.lang.String> strSet12 = mongoDBRiverDefinition8.getIncludeFields();
        java.lang.String str13 = mongoDBRiverDefinition8.getSSL_CONNECTION_FIELD();
        boolean boolean14 = mongoDBRiverDefinition8.isStoreStatistics();
        java.lang.String str15 = mongoDBRiverDefinition8.scriptType;
        java.util.Set<java.lang.String> strSet16 = mongoDBRiverDefinition8.parentTypes;
        java.lang.String str17 = mongoDBRiverDefinition8.script;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(basicDBObject11);
        org.junit.Assert.assertNull(strSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ssl" + "'", str13, "ssl");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(strSet16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.getmongoCollection();
        builder0.setdropCollection(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet7 = builder6.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder6.advancedTransformation(false);
        builder6.setimportAllCollections(false);
        builder6.riverName = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet17 = builder16.parentTypes;
        boolean boolean18 = builder16.skipInitialImport;
        java.lang.String[] strArray49 = new java.lang.String[] { "disable_index_refresh", "port", "secondary_read_preference", "import_all_collections", "bulk_timeout", "type", "script", "mongodb-1638820218449", "options", "gridfs", "port", "throttle_size", "ssl", "concurrent_bulk_requests", "hi!", "advanced_transformation", "bulk_size", "local", "name", "exclude_fields", "import_all_collections", "script_type", "socket_timeout", "type", "store_statistics", "store_statistics", "servers", "localhost", "ssl", "ssl_verify_certificate" };
        java.util.LinkedHashSet<java.lang.String> strSet50 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet50, strArray49);
        builder16.setincludeFields((java.util.Set<java.lang.String>) strSet50);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder6.includeFields((java.util.Set<java.lang.String>) strSet50);
        builder0.parentTypes = strSet50;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder0.mongoSSLVerifyCertificate(true);
        java.lang.String str57 = builder56.typeName;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(strSet7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNull(strSet17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNull(str57);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoCollection("size");
        builder5.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str9 = mongoDBRiverDefinition8.getTHROTTLE_SIZE_FIELD();
        boolean boolean10 = mongoDBRiverDefinition8.getmongoGridFS();
        com.mongodb.BasicDBObject basicDBObject11 = mongoDBRiverDefinition8.mongoOplogFilter;
        java.util.Set<java.lang.String> strSet12 = mongoDBRiverDefinition8.getIncludeFields();
        java.lang.String str13 = mongoDBRiverDefinition8.getDROP_COLLECTION_FIELD();
        java.lang.String str14 = mongoDBRiverDefinition8.getUSER_FIELD();
        com.mongodb.MongoClientOptions mongoClientOptions15 = mongoDBRiverDefinition8.getMongoClientOptions();
        boolean boolean16 = mongoDBRiverDefinition8.isMongoUseSSL();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(basicDBObject11);
        org.junit.Assert.assertNull(strSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "drop_collection" + "'", str13, "drop_collection");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "user" + "'", str14, "user");
        org.junit.Assert.assertNull(mongoClientOptions15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("admin", "connect_timeout");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?connect_timeout?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("collection", "exclude_fields", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?exclude_fields?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.getmongoCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet5 = builder4.parentTypes;
        boolean boolean6 = builder4.skipInitialImport;
        java.lang.String[] strArray37 = new java.lang.String[] { "disable_index_refresh", "port", "secondary_read_preference", "import_all_collections", "bulk_timeout", "type", "script", "mongodb-1638820218449", "options", "gridfs", "port", "throttle_size", "ssl", "concurrent_bulk_requests", "hi!", "advanced_transformation", "bulk_size", "local", "name", "exclude_fields", "import_all_collections", "script_type", "socket_timeout", "type", "store_statistics", "store_statistics", "servers", "localhost", "ssl", "ssl_verify_certificate" };
        java.util.LinkedHashSet<java.lang.String> strSet38 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet38, strArray37);
        builder4.setincludeFields((java.util.Set<java.lang.String>) strSet38);
        builder0.parentTypes = strSet38;
        boolean boolean42 = builder0.getimportAllCollections();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }
}

