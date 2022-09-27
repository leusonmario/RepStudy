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
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.HOST_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "host" + "'", str0, "host");
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.PORT_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "port" + "'", str0, "port");
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
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.SERVERS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "servers" + "'", str0, "servers");
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.SKIP_INITIAL_IMPORT_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "skip_initial_import" + "'", str0, "skip_initial_import");
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.THROTTLE_SIZE_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "throttle_size" + "'", str0, "throttle_size");
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.INITIAL_TIMESTAMP_SCRIPT_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "script" + "'", str0, "script");
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DEFAULT_BULK_SIZE;
        org.junit.Assert.assertNotNull(byteSizeValue0);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.INDEX_OBJECT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index" + "'", str0, "index");
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.SSL_VERIFY_CERT_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ssl_verify_certificate" + "'", str0, "ssl_verify_certificate");
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("local");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?local?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoAdminUser("disable_index_refresh");
        org.bson.types.Binary binary5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder2.initialTimestamp(binary5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        int int0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DEFAULT_DB_PORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 27017 + "'", int0 == 27017);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("port", "index");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?index?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder5.mongoAdminPassword("");
        java.lang.String[] strArray12 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        builder8.excludeFields = strSet13;
        builder2.setexcludeFields((java.util.Set<java.lang.String>) strSet13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder2.mongoUseSSL(false);
        java.lang.String str19 = builder2.getmongoDb();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.gettypeName();
        builder0.setmongoDb("concurrent_bulk_requests");
        builder0.riverName = "throttle_size";
        java.lang.String str6 = builder0.getmongoDb();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "concurrent_bulk_requests" + "'", str6, "concurrent_bulk_requests");
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.CONCURRENT_BULK_REQUESTS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "concurrent_bulk_requests" + "'", str0, "concurrent_bulk_requests");
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.EXCLUDE_FIELDS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "exclude_fields" + "'", str0, "exclude_fields");
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions2 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder1.mongoClientOptions(mongoClientOptions2);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder3.script("disable_index_refresh");
        com.mongodb.BasicDBObject basicDBObject6 = builder5.mongoCollectionFilter;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(basicDBObject6);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        com.mongodb.BasicDBObject basicDBObject3 = null;
        builder0.setmongoOplogFilter(basicDBObject3);
        boolean boolean5 = builder0.importAllCollections;
        builder0.setmongoGridFS(false);
        boolean boolean8 = builder0.getadvancedTransformation();
        org.bson.types.Binary binary9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.initialTimestamp(binary9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.INITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "script_type" + "'", str0, "script_type");
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.mongoAdminPassword("");
        builder0.setdisableIndexRefresh(false);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("local", "skip_initial_import");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?skip_initial_import?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.elasticsearch.common.logging.ESLogger eSLogger0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.logger;
        org.junit.Assert.assertNotNull(eSLogger0);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("include_fields", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DISABLE_INDEX_REFRESH_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "disable_index_refresh" + "'", str0, "disable_index_refresh");
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions5 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoClientOptions(mongoClientOptions5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.script("disable_index_refresh");
        com.mongodb.BasicDBObject basicDBObject9 = builder8.mongoCollectionFilter;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(basicDBObject9);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.FLUSH_INTERVAL_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "flush_interval" + "'", str0, "flush_interval");
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.CONNECTION_TIMEOUT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "connect_timeout" + "'", str0, "connect_timeout");
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.SSL_CONNECTION_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ssl" + "'", str0, "ssl");
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("local", "name");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?name? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.ADVANCED_TRANSFORMATION_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "advanced_transformation" + "'", str0, "advanced_transformation");
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.CREDENTIALS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "credentials" + "'", str0, "credentials");
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
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
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("concurrent_bulk_requests", "mongodb-1638820218387", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        int int0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DEFAULT_CONCURRENT_REQUESTS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.getDISABLE_INDEX_REFRESH_FIELD();
        boolean boolean4 = mongoDBRiverDefinition2.isDisableIndexRefresh();
        java.lang.String str5 = mongoDBRiverDefinition2.getEXCLUDE_FIELDS_FIELD();
        java.lang.Class<?> wildcardClass6 = mongoDBRiverDefinition2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "disable_index_refresh" + "'", str3, "disable_index_refresh");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "exclude_fields" + "'", str5, "exclude_fields");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.INCLUDE_FIELDS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "include_fields" + "'", str0, "include_fields");
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean2 = mongoDBRiverDefinition1.storeStatistics;
        boolean boolean3 = mongoDBRiverDefinition1.isDisableIndexRefresh();
        java.lang.String str4 = mongoDBRiverDefinition1.getMongoLocalUser();
        java.util.Set<java.lang.String> strSet5 = mongoDBRiverDefinition1.getIncludeFields();
        java.lang.String str6 = mongoDBRiverDefinition1.getINITIAL_TIMESTAMP_SCRIPT_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition1.includeCollection;
        java.lang.String str8 = mongoDBRiverDefinition1.getMongoAdminPassword();
        boolean boolean9 = mongoDBRiverDefinition1.getmongoUseSSL();
        boolean boolean10 = mongoDBRiverDefinition1.isDisableIndexRefresh();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "script" + "'", str6, "script");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions5 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoClientOptions(mongoClientOptions5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.script("disable_index_refresh");
        java.lang.String str9 = builder8.getmongoDb();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions11 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoClientOptions(mongoClientOptions11);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.script("disable_index_refresh");
        com.mongodb.BasicDBObject basicDBObject15 = builder14.mongoCollectionFilter;
        builder8.mongoCollectionFilter = basicDBObject15;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(basicDBObject15);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.script("disable_index_refresh");
        com.mongodb.BasicDBObject basicDBObject5 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoCollectionFilter(basicDBObject5);
        builder6.statisticsIndexName = "host";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.mongoLocalPassword("throttle_size");
        org.bson.types.BSONTimestamp bSONTimestamp11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder6.initialTimestamp(bSONTimestamp11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ts must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.BULK_TIMEOUT_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "bulk_timeout" + "'", str0, "bulk_timeout");
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.NAME_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "name" + "'", str0, "name");
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.SOCKET_TIMEOUT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "socket_timeout" + "'", str0, "socket_timeout");
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder5.mongoAdminPassword("");
        java.lang.String[] strArray12 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        builder8.excludeFields = strSet13;
        builder2.setexcludeFields((java.util.Set<java.lang.String>) strSet13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder2.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder18);
        java.lang.Class<?> wildcardClass20 = builder18.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean2 = mongoDBRiverDefinition1.storeStatistics;
        boolean boolean3 = mongoDBRiverDefinition1.isDisableIndexRefresh();
        java.lang.String str4 = mongoDBRiverDefinition1.getMongoLocalUser();
        java.util.Set<java.lang.String> strSet5 = mongoDBRiverDefinition1.getIncludeFields();
        java.lang.String str6 = mongoDBRiverDefinition1.getINITIAL_TIMESTAMP_SCRIPT_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition1.includeCollection;
        java.lang.String str8 = mongoDBRiverDefinition1.getMongoAdminPassword();
        java.lang.String str9 = mongoDBRiverDefinition1.getDROP_COLLECTION_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition1.mongoAdminPassword;
        java.lang.String str11 = mongoDBRiverDefinition1.getMongoCollection();
        int int12 = mongoDBRiverDefinition1.getSocketTimeout();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "script" + "'", str6, "script");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "drop_collection" + "'", str9, "drop_collection");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DROP_COLLECTION_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "drop_collection" + "'", str0, "drop_collection");
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
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
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setthrottleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.importAllCollections(true);
        builder0.setindexName("drop_collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.mongoAdminUser("disable_index_refresh");
        java.lang.String[] strArray32 = new java.lang.String[] { "mongodb-1638820218387", "mongodb-1638820218387", "localhost", "", "localhost", "host", "user", "hi!", "actions", "exclude_fields", "throttle_size", "ssl_verify_certificate", "local", "disable_index_refresh", "user", "port", "actions", "host" };
        java.util.LinkedHashSet<java.lang.String> strSet33 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet33, strArray32);
        builder11.excludeFields = strSet33;
        builder0.includeFields = strSet33;
        org.bson.types.BSONTimestamp bSONTimestamp37 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder0.initialTimestamp(bSONTimestamp37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ts must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.OPTIONS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "options" + "'", str0, "options");
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.SCRIPT_TYPE_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "script_type" + "'", str0, "script_type");
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.BULK_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "bulk" + "'", str0, "bulk");
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("script_type", "mongodb-1638820218264");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?mongodb-1638820218264?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        com.mongodb.BasicDBObject basicDBObject3 = null;
        builder0.setmongoOplogFilter(basicDBObject3);
        boolean boolean5 = builder0.importAllCollections;
        builder0.setmongoGridFS(false);
        boolean boolean8 = builder0.getmongoSecondaryReadPreference();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.elasticsearch.common.unit.TimeValue timeValue0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DEFAULT_FLUSH_INTERVAL;
        org.junit.Assert.assertNotNull(timeValue0);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.SECONDARY_READ_PREFERENCE_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "secondary_read_preference" + "'", str0, "secondary_read_preference");
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.GRIDFS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "gridfs" + "'", str0, "gridfs");
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.PARENT_TYPES_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "parent_types" + "'", str0, "parent_types");
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("port", "ssl");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?ssl?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString4();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_river" + "'", str1, "_river");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mongodb-1638820217755" + "'", str2, "mongodb-1638820217755");
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.INCLUDE_COLLECTION_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "include_collection" + "'", str0, "include_collection");
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("bulk_size", "advanced_transformation");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?advanced_transformation?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("_river");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?_river?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("secondary_read_preference", "secondary_read_preference");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?secondary_read_preference?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("user", "drop_collection", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?drop_collection?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.ADMIN_DB_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "admin" + "'", str0, "admin");
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString11();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString17();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString9();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb-1638820218387" + "'", str1, "mongodb-1638820218387");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mongodb-1638820218449" + "'", str2, "mongodb-1638820218449");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "mongodb-1638820218363" + "'", str3, "mongodb-1638820218363");
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        docScoreSearchScript0.setNextScore(0.0f);
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
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        int int0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DEFAULT_BULK_ACTIONS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1000 + "'", int0 == 1000);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DB_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "db" + "'", str0, "db");
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder2);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoAdminPassword("");
        java.lang.String[] strArray9 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        builder5.excludeFields = strSet10;
        java.lang.String str13 = builder5.indexName;
        docScoreSearchScript0.setNextVar("actions", (java.lang.Object) builder5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder21);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder21.mongoAdminPassword("");
        java.lang.String[] strArray28 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet29 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet29, strArray28);
        builder24.excludeFields = strSet29;
        builder18.setexcludeFields((java.util.Set<java.lang.String>) strSet29);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) strSet29);
        org.apache.lucene.index.AtomicReaderContext atomicReaderContext34 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextReader(atomicReaderContext34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.ACTIONS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "actions" + "'", str0, "actions");
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder5.mongoAdminPassword("");
        java.lang.String[] strArray12 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        builder8.excludeFields = strSet13;
        builder2.setexcludeFields((java.util.Set<java.lang.String>) strSet13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder2.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder18);
        java.lang.String str20 = mongoDBRiverDefinition19.getINITIAL_TIMESTAMP_SCRIPT_FIELD();
        com.mongodb.MongoClientOptions mongoClientOptions21 = mongoDBRiverDefinition19.mongoClientOptions;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "script" + "'", str20, "script");
        org.junit.Assert.assertNull(mongoClientOptions21);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("script_type", "_river");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?_river?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("db");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?db?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.USER_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "user" + "'", str0, "user");
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.PASSWORD_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "password" + "'", str0, "password");
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.getDISABLE_INDEX_REFRESH_FIELD();
        boolean boolean4 = mongoDBRiverDefinition2.isDisableIndexRefresh();
        java.lang.String str5 = mongoDBRiverDefinition2.getACTIONS_FIELD();
        java.lang.String str6 = mongoDBRiverDefinition2.getBULK_FIELD();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "disable_index_refresh" + "'", str3, "disable_index_refresh");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "actions" + "'", str5, "actions");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "bulk" + "'", str6, "bulk");
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.COLLECTION_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "collection" + "'", str0, "collection");
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setthrottleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.importAllCollections(true);
        java.lang.String str7 = builder6.gettypeName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions9 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoClientOptions(mongoClientOptions9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.script("disable_index_refresh");
        com.mongodb.BasicDBObject basicDBObject13 = builder12.mongoCollectionFilter;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder6.mongoCollectionFilter(basicDBObject13);
        org.bson.types.BSONTimestamp bSONTimestamp15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder6.initialTimestamp(bSONTimestamp15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ts must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(basicDBObject13);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("index", "mongodb-1638820218363", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        java.util.List<com.mongodb.ServerAddress> serverAddressList3 = builder2.getmongoServers();
        builder2.setmongoLocalUser("secondary_read_preference");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(serverAddressList3);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.TYPE_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "type" + "'", str0, "type");
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.CONCURRENT_REQUESTS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "concurrent_requests" + "'", str0, "concurrent_requests");
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.elasticsearch.river.RiverSettings riverSettings2 = null;
        org.elasticsearch.script.ScriptService scriptService3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("credentials", "actions", riverSettings2, scriptService3);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchNullPointerException; message: No settings specified");
        } catch (org.elasticsearch.ElasticsearchNullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.IMPORT_ALL_COLLECTIONS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "import_all_collections" + "'", str0, "import_all_collections");
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        int int3 = builder0.getsocketTimeout();
        boolean boolean4 = builder0.mongoSecondaryReadPreference;
        java.lang.String str5 = builder0.getmongoAdminUser();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
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
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.getScriptType();
        java.util.Set<java.lang.String> strSet3 = mongoDBRiverDefinition1.getIncludeFields();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(strSet3);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.LOCAL_DB_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "local" + "'", str0, "local");
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("mongodb-1638820218363", "hi!", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?hi!?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("import_all_collections", "db");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?db?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.script("disable_index_refresh");
        com.mongodb.BasicDBObject basicDBObject5 = builder4.mongoCollectionFilter;
        boolean boolean6 = builder4.getadvancedTransformation();
        builder4.disableIndexRefresh = true;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(basicDBObject5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean2 = mongoDBRiverDefinition1.storeStatistics;
        boolean boolean3 = mongoDBRiverDefinition1.isSkipInitialImport();
        java.lang.String str4 = mongoDBRiverDefinition1.getMongoCollection();
        java.lang.String str5 = mongoDBRiverDefinition1.getGRIDFS_FIELD();
        java.lang.String str6 = mongoDBRiverDefinition1.typeName;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "gridfs" + "'", str5, "gridfs");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean2 = mongoDBRiverDefinition1.storeStatistics;
        boolean boolean3 = mongoDBRiverDefinition1.isDisableIndexRefresh();
        java.lang.String str4 = mongoDBRiverDefinition1.getMongoLocalUser();
        java.util.Set<java.lang.String> strSet5 = mongoDBRiverDefinition1.getIncludeFields();
        java.lang.String str6 = mongoDBRiverDefinition1.getINITIAL_TIMESTAMP_SCRIPT_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition1.includeCollection;
        java.lang.String str8 = mongoDBRiverDefinition1.getMongoAdminPassword();
        java.lang.String str9 = mongoDBRiverDefinition1.getDROP_COLLECTION_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition1.mongoAdminPassword;
        java.lang.String str11 = mongoDBRiverDefinition1.getMongoCollection();
        com.mongodb.BasicDBObject basicDBObject12 = mongoDBRiverDefinition1.getMongoCollectionFilter();
        java.lang.String str13 = mongoDBRiverDefinition1.getScriptType();
        java.lang.String str14 = mongoDBRiverDefinition1.getSTORE_STATISTICS_FIELD();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "script" + "'", str6, "script");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "drop_collection" + "'", str9, "drop_collection");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(basicDBObject12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "store_statistics" + "'", str14, "store_statistics");
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString11();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString17();
        org.elasticsearch.river.RiverSettings riverSettings3 = serializedObjectSupporter0.deserializeObjectRiverSettings7();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb-1638820218387" + "'", str1, "mongodb-1638820218387");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mongodb-1638820218449" + "'", str2, "mongodb-1638820218449");
        org.junit.Assert.assertNull(riverSettings3);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.gettypeName();
        builder0.setmongoDb("concurrent_bulk_requests");
        builder0.riverName = "throttle_size";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.socketTimeout((int) (byte) 0);
        java.util.Set<java.lang.String> strSet8 = builder7.getparentTypes();
        builder7.setconnectTimeout(0);
        builder7.setthrottleSize((int) (byte) 1);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(strSet8);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings1 = serializedObjectSupporter0.deserializeObjectRiverSettings4();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString11();
        org.elasticsearch.river.RiverSettings riverSettings3 = serializedObjectSupporter0.deserializeObjectRiverSettings6();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString15();
        org.junit.Assert.assertNull(riverSettings1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mongodb-1638820218387" + "'", str2, "mongodb-1638820218387");
        org.junit.Assert.assertNull(riverSettings3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb-1638820218424" + "'", str4, "mongodb-1638820218424");
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.getDISABLE_INDEX_REFRESH_FIELD();
        java.lang.String str4 = mongoDBRiverDefinition2.getRiverName();
        java.util.List<com.mongodb.ServerAddress> serverAddressList5 = mongoDBRiverDefinition2.getMongoServers();
        boolean boolean6 = mongoDBRiverDefinition2.getimportAllCollections();
        java.lang.String str7 = mongoDBRiverDefinition2.riverName;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "disable_index_refresh" + "'", str3, "disable_index_refresh");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(serverAddressList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.typeName("port");
        builder2.mongoSSLVerifyCertificate = true;
        com.mongodb.BasicDBObject basicDBObject8 = builder2.mongoCollectionFilter;
        java.lang.String str9 = builder2.statisticsTypeName;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(basicDBObject8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
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
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean2 = mongoDBRiverDefinition1.storeStatistics;
        boolean boolean3 = mongoDBRiverDefinition1.isDisableIndexRefresh();
        java.lang.String str4 = mongoDBRiverDefinition1.getMongoLocalUser();
        java.util.Set<java.lang.String> strSet5 = mongoDBRiverDefinition1.getIncludeFields();
        java.lang.String str6 = mongoDBRiverDefinition1.getINITIAL_TIMESTAMP_SCRIPT_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition1.includeCollection;
        java.lang.String str8 = mongoDBRiverDefinition1.getADVANCED_TRANSFORMATION_FIELD();
        java.util.Set<java.lang.String> strSet9 = mongoDBRiverDefinition1.excludeFields;
        java.lang.String str10 = mongoDBRiverDefinition1.indexName;
        java.lang.String str11 = mongoDBRiverDefinition1.getMongoDb();
        java.lang.String str12 = mongoDBRiverDefinition1.script;
        java.lang.String str13 = mongoDBRiverDefinition1.getINITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "script" + "'", str6, "script");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "advanced_transformation" + "'", str8, "advanced_transformation");
        org.junit.Assert.assertNull(strSet9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "script_type" + "'", str13, "script_type");
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.typeName("port");
        builder5.mongoCollection = "index";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder5.riverName("advanced_transformation");
        org.bson.types.BSONTimestamp bSONTimestamp10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder5.initialTimestamp(bSONTimestamp10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ts must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.typeName("port");
        builder5.mongoCollection = "index";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder5.mongoDb("flush_interval");
        builder5.riverIndexName = "password";
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean2 = mongoDBRiverDefinition1.storeStatistics;
        boolean boolean3 = mongoDBRiverDefinition1.isDisableIndexRefresh();
        java.lang.String str4 = mongoDBRiverDefinition1.getMongoLocalUser();
        java.util.Set<java.lang.String> strSet5 = mongoDBRiverDefinition1.getIncludeFields();
        java.lang.String str6 = mongoDBRiverDefinition1.getINITIAL_TIMESTAMP_SCRIPT_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition1.includeCollection;
        java.lang.String str8 = mongoDBRiverDefinition1.getMongoAdminPassword();
        java.lang.String str9 = mongoDBRiverDefinition1.getDROP_COLLECTION_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition1.mongoAdminPassword;
        java.lang.String str11 = mongoDBRiverDefinition1.getMongoCollection();
        com.mongodb.BasicDBObject basicDBObject12 = mongoDBRiverDefinition1.getMongoCollectionFilter();
        java.lang.String str13 = mongoDBRiverDefinition1.getScriptType();
        java.lang.String str14 = mongoDBRiverDefinition1.scriptType;
        java.lang.String str15 = mongoDBRiverDefinition1.getSIZE_FIELD();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "script" + "'", str6, "script");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "drop_collection" + "'", str9, "drop_collection");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(basicDBObject12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "size" + "'", str15, "size");
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean2 = mongoDBRiverDefinition1.storeStatistics;
        boolean boolean3 = mongoDBRiverDefinition1.isSkipInitialImport();
        java.lang.String str4 = mongoDBRiverDefinition1.getMongoCollection();
        boolean boolean5 = mongoDBRiverDefinition1.getadvancedTransformation();
        boolean boolean6 = mongoDBRiverDefinition1.mongoGridFS;
        java.lang.String str7 = mongoDBRiverDefinition1.getINCLUDE_FIELDS_FIELD();
        java.lang.String str8 = mongoDBRiverDefinition1.riverName;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "include_fields" + "'", str7, "include_fields");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.SCRIPT_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "script" + "'", str0, "script");
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        com.mongodb.BasicDBObject basicDBObject3 = null;
        builder0.setmongoOplogFilter(basicDBObject3);
        boolean boolean5 = builder0.importAllCollections;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.mongoLocalPassword("name");
        builder0.mongoLocalPassword = "concurrent_bulk_requests";
        builder0.setscriptType("flush_interval");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str13 = mongoDBRiverDefinition12.mongoLocalUser;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.typeName("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder2.skipInitialImport(true);
        java.util.Set<java.lang.String> strSet8 = builder2.getexcludeFields();
        builder2.statisticsIndexName = "drop_collection";
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(strSet8);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.script("disable_index_refresh");
        java.lang.String str5 = builder4.getmongoDb();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions7 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoClientOptions(mongoClientOptions7);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.script("disable_index_refresh");
        com.mongodb.BasicDBObject basicDBObject11 = builder10.mongoCollectionFilter;
        builder4.mongoCollectionFilter = basicDBObject11;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder4);
        boolean boolean14 = builder4.advancedTransformation;
        java.lang.String str15 = builder4.getscriptType();
        builder4.riverIndexName = "store_statistics";
        builder4.mongoAdminUser = "mongodb-1638820218264";
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(basicDBObject11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.SIZE_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "size" + "'", str0, "size");
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        com.mongodb.BasicDBObject basicDBObject3 = null;
        builder0.setmongoOplogFilter(basicDBObject3);
        boolean boolean5 = builder0.importAllCollections;
        builder0.setmongoGridFS(false);
        int int8 = builder0.throttleSize;
        java.lang.String str9 = builder0.getscript();
        boolean boolean10 = builder0.skipInitialImport;
        boolean boolean11 = builder0.getmongoSecondaryReadPreference();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder0.riverName("mongodb-1638820218363");
        builder13.riverIndexName = "null.null";
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoLocalUser = "store_statistics";
        int int4 = builder0.connectTimeout;
        java.util.Set<java.lang.String> strSet5 = builder0.excludeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.riverName("parent_types");
        org.bson.types.BSONTimestamp bSONTimestamp8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.initialTimestamp(bSONTimestamp8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ts must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        int int3 = mongoDBRiverDefinition2.getConnectTimeout();
        java.util.Set<java.lang.String> strSet4 = mongoDBRiverDefinition2.includeFields;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(strSet4);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.gettypeName();
        builder0.setmongoDb("concurrent_bulk_requests");
        builder0.riverName = "throttle_size";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.socketTimeout((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.disableIndexRefresh(false);
        java.lang.Class<?> wildcardClass10 = builder0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.script("disable_index_refresh");
        com.mongodb.BasicDBObject basicDBObject5 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoCollectionFilter(basicDBObject5);
        builder6.statisticsIndexName = "host";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.riverIndexName("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder10);
        java.lang.String str12 = builder10.includeCollection;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("mongodb-1638820218424");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?mongodb-1638820218424?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.gettypeName();
        builder0.setmongoDb("concurrent_bulk_requests");
        builder0.riverName = "throttle_size";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.socketTimeout((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder10);
        boolean boolean12 = mongoDBRiverDefinition11.storeStatistics;
        boolean boolean13 = mongoDBRiverDefinition11.isDisableIndexRefresh();
        java.lang.String str14 = mongoDBRiverDefinition11.getMongoLocalUser();
        java.util.Set<java.lang.String> strSet15 = mongoDBRiverDefinition11.getIncludeFields();
        java.lang.String str16 = mongoDBRiverDefinition11.getINITIAL_TIMESTAMP_SCRIPT_FIELD();
        java.lang.String str17 = mongoDBRiverDefinition11.includeCollection;
        java.lang.String str18 = mongoDBRiverDefinition11.getMongoAdminPassword();
        java.lang.String str19 = mongoDBRiverDefinition11.getDROP_COLLECTION_FIELD();
        java.lang.String str20 = mongoDBRiverDefinition11.mongoAdminPassword;
        java.lang.String str21 = mongoDBRiverDefinition11.getMongoCollection();
        com.mongodb.BasicDBObject basicDBObject22 = mongoDBRiverDefinition11.getMongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder9.mongoOplogFilter(basicDBObject22);
        boolean boolean24 = builder23.mongoSSLVerifyCertificate;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder23.storeStatistics(true);
        builder23.setstatisticsIndexName("mongodb-1638820218326");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(strSet15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "script" + "'", str16, "script");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "drop_collection" + "'", str19, "drop_collection");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(basicDBObject22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(builder26);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setthrottleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.importAllCollections(true);
        java.lang.String str7 = builder6.gettypeName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder6.statisticsIndexName("_river");
        builder9.mongoDb = "port";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder9.mongoAdminPassword("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder13.statisticsTypeName("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder13);
        java.lang.String str17 = mongoDBRiverDefinition16.getSKIP_INITIAL_IMPORT_FIELD();
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "skip_initial_import" + "'", str17, "skip_initial_import");
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        builder2.setsocketTimeout((int) '4');
        builder2.setscript("flush_interval");
        builder2.storeStatistics = false;
        builder2.mongoUseSSL = false;
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean2 = mongoDBRiverDefinition1.storeStatistics;
        boolean boolean3 = mongoDBRiverDefinition1.isDisableIndexRefresh();
        java.lang.String str4 = mongoDBRiverDefinition1.getMongoLocalUser();
        java.util.Set<java.lang.String> strSet5 = mongoDBRiverDefinition1.getIncludeFields();
        java.lang.String str6 = mongoDBRiverDefinition1.getINITIAL_TIMESTAMP_SCRIPT_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition1.includeCollection;
        java.lang.String str8 = mongoDBRiverDefinition1.getMongoAdminPassword();
        java.lang.String str9 = mongoDBRiverDefinition1.getSECONDARY_READ_PREFERENCE_FIELD();
        int int10 = mongoDBRiverDefinition1.socketTimeout;
        java.lang.String str11 = mongoDBRiverDefinition1.mongoDb;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "script" + "'", str6, "script");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "secondary_read_preference" + "'", str9, "secondary_read_preference");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.gettypeName();
        builder0.setmongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str5 = mongoDBRiverDefinition4.getACTIONS_FIELD();
        boolean boolean6 = mongoDBRiverDefinition4.storeStatistics;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "actions" + "'", str5, "actions");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean2 = mongoDBRiverDefinition1.storeStatistics;
        java.lang.String str3 = mongoDBRiverDefinition1.getTypeName();
        java.lang.String str4 = mongoDBRiverDefinition1.getIndexName();
        java.lang.String str5 = mongoDBRiverDefinition1.getMongoAdminUser();
        java.lang.String str6 = mongoDBRiverDefinition1.getMongoOplogNamespace();
        java.lang.String str7 = mongoDBRiverDefinition1.getDB_FIELD();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "null.null" + "'", str6, "null.null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "db" + "'", str7, "db");
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.FILTER_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "filter" + "'", str0, "filter");
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.STORE_STATISTICS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "store_statistics" + "'", str0, "store_statistics");
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder4);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder4);
        java.lang.String str7 = mongoDBRiverDefinition6.getDISABLE_INDEX_REFRESH_FIELD();
        boolean boolean8 = mongoDBRiverDefinition6.isDisableIndexRefresh();
        java.lang.String str9 = mongoDBRiverDefinition6.getEXCLUDE_FIELDS_FIELD();
        java.lang.Object obj10 = docScoreSearchScript0.unwrap((java.lang.Object) str9);
        org.apache.lucene.search.Scorer scorer11 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setScorer(scorer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "disable_index_refresh" + "'", str7, "disable_index_refresh");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "exclude_fields" + "'", str9, "exclude_fields");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "exclude_fields" + "'", obj10, "exclude_fields");
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.getDISABLE_INDEX_REFRESH_FIELD();
        java.util.List<com.mongodb.ServerAddress> serverAddressList4 = mongoDBRiverDefinition2.getMongoServers();
        java.lang.String str5 = mongoDBRiverDefinition2.getSTORE_STATISTICS_FIELD();
        com.mongodb.BasicDBObject basicDBObject6 = mongoDBRiverDefinition2.getMongoCollectionFilter();
        java.lang.String str7 = mongoDBRiverDefinition2.getINITIAL_TIMESTAMP_SCRIPT_FIELD();
        java.lang.String str8 = mongoDBRiverDefinition2.mongoCollection;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "disable_index_refresh" + "'", str3, "disable_index_refresh");
        org.junit.Assert.assertNotNull(serverAddressList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "store_statistics" + "'", str5, "store_statistics");
        org.junit.Assert.assertNotNull(basicDBObject6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "script" + "'", str7, "script");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        com.mongodb.BasicDBObject basicDBObject3 = null;
        builder0.setmongoOplogFilter(basicDBObject3);
        boolean boolean5 = builder0.importAllCollections;
        java.lang.String[] strArray19 = new java.lang.String[] { "concurrent_bulk_requests", "host", "hi!", "bulk_size", "drop_collection", "mongodb-1638820218387", "servers", "host", "disable_index_refresh", "mongodb-1638820218387", "", "bulk_size", "mongodb-1638820218387" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        builder0.parentTypes = strSet20;
        builder0.setconnectTimeout((int) '#');
        com.mongodb.BasicDBObject basicDBObject25 = builder0.getmongoOplogFilter();
        builder0.mongoSecondaryReadPreference = true;
        builder0.setmongoAdminUser("mongodb-1638820218424");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(basicDBObject25);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("mongodb-1638820218299", "_river");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?_river?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.INITIAL_TIMESTAMP_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "initial_timestamp" + "'", str0, "initial_timestamp");
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString4();
        org.elasticsearch.river.RiverSettings riverSettings2 = serializedObjectSupporter0.deserializeObjectRiverSettings6();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString3();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString9();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_river" + "'", str1, "_river");
        org.junit.Assert.assertNull(riverSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "mongodb-1638820218264" + "'", str3, "mongodb-1638820218264");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb-1638820218363" + "'", str4, "mongodb-1638820218363");
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.script("disable_index_refresh");
        java.util.List<com.mongodb.ServerAddress> serverAddressList5 = builder2.getmongoServers();
        builder2.setthrottleSize((int) (byte) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder2.mongoLocalPassword("throttle_size");
        org.bson.types.Binary binary10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder2.initialTimestamp(binary10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(serverAddressList5);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder5.mongoAdminPassword("");
        java.lang.String[] strArray12 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        builder8.excludeFields = strSet13;
        builder2.setexcludeFields((java.util.Set<java.lang.String>) strSet13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder2.mongoUseSSL(false);
        java.lang.String str19 = builder18.getindexName();
        boolean boolean20 = builder18.disableIndexRefresh;
        com.mongodb.MongoClientOptions mongoClientOptions21 = null;
        builder18.mongoClientOptions = mongoClientOptions21;
        int int23 = builder18.getconnectTimeout();
        builder18.mongoLocalUser = "";
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.mongoAdminPassword("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder9.mongoAdminPassword("");
        java.lang.String[] strArray16 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        builder12.excludeFields = strSet17;
        builder6.setexcludeFields((java.util.Set<java.lang.String>) strSet17);
        builder3.parentTypes = strSet17;
        builder3.mongoLocalPassword = "size";
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean2 = mongoDBRiverDefinition1.storeStatistics;
        boolean boolean3 = mongoDBRiverDefinition1.isSkipInitialImport();
        java.lang.String str4 = mongoDBRiverDefinition1.getMongoCollection();
        java.lang.String str5 = mongoDBRiverDefinition1.getGRIDFS_FIELD();
        com.mongodb.BasicDBObject basicDBObject6 = mongoDBRiverDefinition1.mongoCollectionFilter;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "gridfs" + "'", str5, "gridfs");
        org.junit.Assert.assertNotNull(basicDBObject6);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings1 = serializedObjectSupporter0.deserializeObjectRiverSettings8();
        org.elasticsearch.river.RiverSettings riverSettings2 = serializedObjectSupporter0.deserializeObjectRiverSettings4();
        org.elasticsearch.river.RiverSettings riverSettings3 = serializedObjectSupporter0.deserializeObjectRiverSettings3();
        org.junit.Assert.assertNull(riverSettings1);
        org.junit.Assert.assertNull(riverSettings2);
        org.junit.Assert.assertNull(riverSettings3);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean2 = mongoDBRiverDefinition1.storeStatistics;
        boolean boolean3 = mongoDBRiverDefinition1.isDisableIndexRefresh();
        java.lang.String str4 = mongoDBRiverDefinition1.getMongoLocalUser();
        java.util.Set<java.lang.String> strSet5 = mongoDBRiverDefinition1.getIncludeFields();
        java.lang.String str6 = mongoDBRiverDefinition1.getINITIAL_TIMESTAMP_SCRIPT_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition1.includeCollection;
        java.lang.String str8 = mongoDBRiverDefinition1.getADVANCED_TRANSFORMATION_FIELD();
        java.util.Set<java.lang.String> strSet9 = mongoDBRiverDefinition1.excludeFields;
        boolean boolean10 = mongoDBRiverDefinition1.mongoSecondaryReadPreference;
        java.lang.String str11 = mongoDBRiverDefinition1.getLOCAL_DB_FIELD();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "script" + "'", str6, "script");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "advanced_transformation" + "'", str8, "advanced_transformation");
        org.junit.Assert.assertNull(strSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "local" + "'", str11, "local");
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("exclude_fields", "admin");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?admin?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder2.advancedTransformation(false);
        builder2.throttleSize = (byte) 100;
        org.bson.types.Binary binary9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder2.initialTimestamp(binary9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        java.util.List<com.mongodb.ServerAddress> serverAddressList3 = builder2.getmongoServers();
        java.lang.String str4 = builder2.typeName;
        boolean boolean5 = builder2.dropCollection;
        builder2.setmongoDb("secondary_read_preference");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(serverAddressList3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("bulk", "store_statistics");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?store_statistics?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.BULK_SIZE_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "bulk_size" + "'", str0, "bulk_size");
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.typeName("mongodb-1638820218449");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder9.mongoAdminPassword("");
        java.lang.String[] strArray16 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        builder12.excludeFields = strSet17;
        builder6.setexcludeFields((java.util.Set<java.lang.String>) strSet17);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder6.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition23 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder22);
        boolean boolean24 = builder22.dropCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder25.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder29.socketTimeout((int) (byte) 1);
        com.mongodb.BasicDBObject basicDBObject32 = builder31.getmongoCollectionFilter();
        builder22.setmongoCollectionFilter(basicDBObject32);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder3.mongoCollectionFilter(basicDBObject32);
        org.bson.types.BSONTimestamp bSONTimestamp35 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.initialTimestamp(bSONTimestamp35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ts must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(basicDBObject32);
        org.junit.Assert.assertNotNull(builder34);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        javax.net.SocketFactory socketFactory0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.getSSLSocketFactory();
        org.junit.Assert.assertNotNull(socketFactory0);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setthrottleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.importAllCollections(true);
        java.lang.String str7 = builder6.gettypeName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions9 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoClientOptions(mongoClientOptions9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.script("disable_index_refresh");
        com.mongodb.BasicDBObject basicDBObject13 = builder12.mongoCollectionFilter;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder6.mongoCollectionFilter(basicDBObject13);
        builder14.storeStatistics = false;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder14.includeCollection("options");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder14);
        builder14.riverIndexName = "db";
        org.bson.types.Binary binary22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder14.initialTimestamp(binary22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(basicDBObject13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("gridfs", "skip_initial_import");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?skip_initial_import?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean2 = mongoDBRiverDefinition1.storeStatistics;
        boolean boolean3 = mongoDBRiverDefinition1.isDisableIndexRefresh();
        java.lang.String str4 = mongoDBRiverDefinition1.getMongoLocalUser();
        java.util.Set<java.lang.String> strSet5 = mongoDBRiverDefinition1.getIncludeFields();
        java.lang.String str6 = mongoDBRiverDefinition1.getINITIAL_TIMESTAMP_SCRIPT_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition1.includeCollection;
        java.lang.String str8 = mongoDBRiverDefinition1.getMongoAdminPassword();
        boolean boolean9 = mongoDBRiverDefinition1.getmongoUseSSL();
        boolean boolean10 = mongoDBRiverDefinition1.isStoreStatistics();
        java.util.Set<java.lang.String> strSet11 = mongoDBRiverDefinition1.excludeFields;
        java.lang.String str12 = mongoDBRiverDefinition1.getRiverIndexName();
        java.lang.String str13 = mongoDBRiverDefinition1.getCOLLECTION_FIELD();
        java.lang.Class<?> wildcardClass14 = mongoDBRiverDefinition1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "script" + "'", str6, "script");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(strSet11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "collection" + "'", str13, "collection");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.socketTimeout((int) ' ');
        builder2.importAllCollections = false;
        boolean boolean5 = builder2.disableIndexRefresh;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings1 = serializedObjectSupporter0.deserializeObjectRiverSettings4();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString11();
        org.elasticsearch.river.RiverSettings riverSettings3 = serializedObjectSupporter0.deserializeObjectRiverSettings5();
        org.elasticsearch.river.RiverSettings riverSettings4 = serializedObjectSupporter0.deserializeObjectRiverSettings9();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        org.elasticsearch.river.RiverSettings riverSettings6 = serializedObjectSupporter0.deserializeObjectRiverSettings4();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString6();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(riverSettings1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mongodb-1638820218387" + "'", str2, "mongodb-1638820218387");
        org.junit.Assert.assertNull(riverSettings3);
        org.junit.Assert.assertNull(riverSettings4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "mongodb-1638820217755" + "'", str5, "mongodb-1638820217755");
        org.junit.Assert.assertNull(riverSettings6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_river" + "'", str7, "_river");
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.getDISABLE_INDEX_REFRESH_FIELD();
        boolean boolean4 = mongoDBRiverDefinition2.isDisableIndexRefresh();
        java.lang.String str5 = mongoDBRiverDefinition2.getUSER_FIELD();
        java.lang.String str6 = mongoDBRiverDefinition2.getNAME_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition2.getSTORE_STATISTICS_FIELD();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "disable_index_refresh" + "'", str3, "disable_index_refresh");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "user" + "'", str5, "user");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "name" + "'", str6, "name");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "store_statistics" + "'", str7, "store_statistics");
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.gettypeName();
        builder0.setmongoDb("concurrent_bulk_requests");
        builder0.riverName = "throttle_size";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.socketTimeout((int) (byte) 0);
        builder7.setriverIndexName("script_type");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.socketTimeout((int) ' ');
        builder2.importAllCollections = false;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder2.socketTimeout((int) (short) -1);
        org.bson.types.BSONTimestamp bSONTimestamp7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder2.initialTimestamp(bSONTimestamp7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ts must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder2);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoAdminPassword("");
        java.lang.String[] strArray9 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        builder5.excludeFields = strSet10;
        java.lang.String str13 = builder5.indexName;
        docScoreSearchScript0.setNextVar("actions", (java.lang.Object) builder5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder21);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder21.mongoAdminPassword("");
        java.lang.String[] strArray28 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet29 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet29, strArray28);
        builder24.excludeFields = strSet29;
        builder18.setexcludeFields((java.util.Set<java.lang.String>) strSet29);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) strSet29);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition35 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder34);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition36 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder34);
        builder34.setthrottleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition40 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder39);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder39.mongoAdminPassword("");
        java.lang.String[] strArray46 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet47 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet47, strArray46);
        builder42.excludeFields = strSet47;
        com.mongodb.BasicDBObject basicDBObject50 = builder42.mongoCollectionFilter;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder34.mongoOplogFilter(basicDBObject50);
        java.lang.Object obj52 = docScoreSearchScript0.unwrap((java.lang.Object) builder34);
        org.apache.lucene.index.AtomicReaderContext atomicReaderContext53 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextReader(atomicReaderContext53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(basicDBObject50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(obj52);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.gettypeName();
        builder0.setmongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str5 = builder0.mongoAdminPassword;
        boolean boolean6 = builder0.getimportAllCollections();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.script("disable_index_refresh");
        com.mongodb.BasicDBObject basicDBObject5 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoCollectionFilter(basicDBObject5);
        builder6.statisticsIndexName = "host";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.riverIndexName("ssl");
        java.lang.String str11 = builder10.getmongoDb();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder5.mongoAdminPassword("");
        java.lang.String[] strArray12 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        builder8.excludeFields = strSet13;
        builder2.setexcludeFields((java.util.Set<java.lang.String>) strSet13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder2.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.includeCollection("concurrent_requests");
        builder18.setriverIndexName("mongodb-1638820218299");
        org.bson.types.Binary binary23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder18.initialTimestamp(binary23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.getDISABLE_INDEX_REFRESH_FIELD();
        boolean boolean4 = mongoDBRiverDefinition2.isDisableIndexRefresh();
        java.lang.String str5 = mongoDBRiverDefinition2.getEXCLUDE_FIELDS_FIELD();
        boolean boolean6 = mongoDBRiverDefinition2.isAdvancedTransformation();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "disable_index_refresh" + "'", str3, "disable_index_refresh");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "exclude_fields" + "'", str5, "exclude_fields");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean2 = mongoDBRiverDefinition1.storeStatistics;
        boolean boolean3 = mongoDBRiverDefinition1.isDisableIndexRefresh();
        java.lang.String str4 = mongoDBRiverDefinition1.getADMIN_DB_FIELD();
        java.util.Set<java.lang.String> strSet5 = mongoDBRiverDefinition1.excludeFields;
        java.lang.String str6 = mongoDBRiverDefinition1.mongoAdminPassword;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.mongoAdminPassword("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder9.mongoAdminPassword("");
        java.lang.String[] strArray16 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        builder12.excludeFields = strSet17;
        builder6.setexcludeFields((java.util.Set<java.lang.String>) strSet17);
        builder3.parentTypes = strSet17;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder22.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder24.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder27);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder27.mongoAdminPassword("");
        java.lang.String[] strArray34 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet35 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet35, strArray34);
        builder30.excludeFields = strSet35;
        builder24.setexcludeFields((java.util.Set<java.lang.String>) strSet35);
        builder3.setparentTypes((java.util.Set<java.lang.String>) strSet35);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder3.mongoAdminUser("admin");
        java.lang.String str42 = builder41.riverIndexName;
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNull(str42);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.typeName("mongodb-1638820218449");
        boolean boolean4 = builder0.getmongoGridFS();
        com.mongodb.MongoClientOptions mongoClientOptions5 = null;
        builder0.mongoClientOptions = mongoClientOptions5;
        builder0.mongoSSLVerifyCertificate = false;
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("import_all_collections", "ssl_verify_certificate");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?ssl_verify_certificate?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.mongoAdminPassword("");
        java.lang.String[] strArray7 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        builder3.excludeFields = strSet8;
        builder3.mongoGridFS = true;
        boolean boolean13 = builder3.mongoSSLVerifyCertificate;
        builder3.setskipInitialImport(false);
        builder3.disableIndexRefresh = false;
        java.lang.String str18 = builder3.script;
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.script("disable_index_refresh");
        com.mongodb.BasicDBObject basicDBObject5 = builder4.mongoCollectionFilter;
        boolean boolean6 = builder4.getadvancedTransformation();
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
        org.junit.Assert.assertNotNull(basicDBObject5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setthrottleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.importAllCollections(true);
        builder6.setadvancedTransformation(false);
        builder6.setmongoAdminUser("flush_interval");
        builder6.setscript("drop_collection");
        boolean boolean13 = builder6.disableIndexRefresh;
        com.mongodb.BasicDBObject basicDBObject14 = builder6.getmongoOplogFilter();
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(basicDBObject14);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("servers", "mongodb-1638820218449", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?mongodb-1638820218449?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setthrottleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.importAllCollections(true);
        java.lang.String str7 = builder6.gettypeName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions9 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoClientOptions(mongoClientOptions9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.script("disable_index_refresh");
        com.mongodb.BasicDBObject basicDBObject13 = builder12.mongoCollectionFilter;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder6.mongoCollectionFilter(basicDBObject13);
        builder14.setmongoLocalUser("skip_initial_import");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder14.statisticsIndexName("host");
        java.lang.String str19 = builder14.getmongoLocalPassword();
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(basicDBObject13);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.script("disable_index_refresh");
        com.mongodb.BasicDBObject basicDBObject5 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoCollectionFilter(basicDBObject5);
        builder6.statisticsIndexName = "host";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.mongoLocalPassword("throttle_size");
        java.util.Set<java.lang.String> strSet11 = builder6.excludeFields;
        builder6.setmongoUseSSL(false);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNull(strSet11);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder5.mongoAdminPassword("");
        java.lang.String[] strArray12 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        builder8.excludeFields = strSet13;
        builder2.setexcludeFields((java.util.Set<java.lang.String>) strSet13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder2.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder18);
        java.lang.String str20 = mongoDBRiverDefinition19.getSERVERS_FIELD();
        int int21 = mongoDBRiverDefinition19.getDEFAULT_DB_PORT();
        int int22 = mongoDBRiverDefinition19.getThrottleSize();
        int int23 = mongoDBRiverDefinition19.getDEFAULT_DB_PORT();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "servers" + "'", str20, "servers");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 27017 + "'", int21 == 27017);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 27017 + "'", int23 == 27017);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder2);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoAdminPassword("");
        java.lang.String[] strArray9 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        builder5.excludeFields = strSet10;
        java.lang.String str13 = builder5.indexName;
        docScoreSearchScript0.setNextVar("actions", (java.lang.Object) builder5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder21);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder21.mongoAdminPassword("");
        java.lang.String[] strArray28 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet29 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet29, strArray28);
        builder24.excludeFields = strSet29;
        builder18.setexcludeFields((java.util.Set<java.lang.String>) strSet29);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) strSet29);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions35 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.mongoClientOptions(mongoClientOptions35);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder36.script("disable_index_refresh");
        com.mongodb.BasicDBObject basicDBObject39 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder38.mongoCollectionFilter(basicDBObject39);
        builder40.statisticsIndexName = "host";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition44 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder43);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition45 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder43);
        com.mongodb.BasicDBObject basicDBObject46 = null;
        builder43.setmongoOplogFilter(basicDBObject46);
        boolean boolean48 = builder43.importAllCollections;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition50 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder49);
        boolean boolean51 = mongoDBRiverDefinition50.storeStatistics;
        boolean boolean52 = mongoDBRiverDefinition50.isDisableIndexRefresh();
        java.lang.String str53 = mongoDBRiverDefinition50.getMongoLocalUser();
        java.util.Set<java.lang.String> strSet54 = mongoDBRiverDefinition50.getIncludeFields();
        java.lang.String str55 = mongoDBRiverDefinition50.getINITIAL_TIMESTAMP_SCRIPT_FIELD();
        java.lang.String str56 = mongoDBRiverDefinition50.includeCollection;
        java.lang.String str57 = mongoDBRiverDefinition50.getMongoAdminPassword();
        java.lang.String str58 = mongoDBRiverDefinition50.getDROP_COLLECTION_FIELD();
        java.lang.String str59 = mongoDBRiverDefinition50.mongoAdminPassword;
        java.lang.String str60 = mongoDBRiverDefinition50.getMongoCollection();
        com.mongodb.BasicDBObject basicDBObject61 = mongoDBRiverDefinition50.getMongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = builder43.mongoOplogFilter(basicDBObject61);
        builder40.mongoOplogFilter = basicDBObject61;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNull(strSet54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "script" + "'", str55, "script");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "drop_collection" + "'", str58, "drop_collection");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNotNull(basicDBObject61);
        org.junit.Assert.assertNotNull(builder62);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.gettypeName();
        builder0.setmongoDb("concurrent_bulk_requests");
        builder0.riverName = "throttle_size";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.socketTimeout((int) (byte) 0);
        java.lang.String str8 = builder0.getindexName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("bulk");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?bulk?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean2 = mongoDBRiverDefinition1.storeStatistics;
        boolean boolean3 = mongoDBRiverDefinition1.isDisableIndexRefresh();
        boolean boolean4 = mongoDBRiverDefinition1.getmongoSecondaryReadPreference();
        java.lang.String str5 = mongoDBRiverDefinition1.getADMIN_DB_FIELD();
        boolean boolean6 = mongoDBRiverDefinition1.isDropCollection();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter5 = builder2.serializedObjectSupporter;
        builder2.setmongoAdminPassword("mongodb-1638820218424");
        java.lang.String str8 = builder2.getriverName();
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter9 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings10 = serializedObjectSupporter9.deserializeObjectRiverSettings4();
        org.elasticsearch.river.RiverSettings riverSettings11 = serializedObjectSupporter9.deserializeObjectRiverSettings1();
        builder2.serializedObjectSupporter = serializedObjectSupporter9;
        java.lang.String str13 = serializedObjectSupporter9.deserializeObjectString1();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNull(serializedObjectSupporter5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(riverSettings10);
        org.junit.Assert.assertNull(riverSettings11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "mongodb-1638820217755" + "'", str13, "mongodb-1638820217755");
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.typeName("mongodb-1638820218449");
        boolean boolean4 = builder0.getmongoGridFS();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.storeStatistics(false);
        int int7 = builder6.socketTimeout;
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setthrottleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.importAllCollections(true);
        builder6.indexName = "null.null";
        java.lang.String str9 = builder6.typeName;
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.gettypeName();
        builder0.setmongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str5 = mongoDBRiverDefinition4.getFILTER_FIELD();
        java.lang.String str6 = mongoDBRiverDefinition4.getSCRIPT_FIELD();
        boolean boolean7 = mongoDBRiverDefinition4.isMongoUseSSL();
        boolean boolean8 = mongoDBRiverDefinition4.isAdvancedTransformation();
        boolean boolean9 = mongoDBRiverDefinition4.isAdvancedTransformation();
        java.lang.String str10 = mongoDBRiverDefinition4.getStatisticsTypeName();
        com.mongodb.MongoClientOptions mongoClientOptions11 = mongoDBRiverDefinition4.mongoClientOptions;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "filter" + "'", str5, "filter");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "script" + "'", str6, "script");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(mongoClientOptions11);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder2);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoAdminPassword("");
        java.lang.String[] strArray9 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        builder5.excludeFields = strSet10;
        java.lang.String str13 = builder5.indexName;
        docScoreSearchScript0.setNextVar("actions", (java.lang.Object) builder5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder21);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder21.mongoAdminPassword("");
        java.lang.String[] strArray28 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet29 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet29, strArray28);
        builder24.excludeFields = strSet29;
        builder18.setexcludeFields((java.util.Set<java.lang.String>) strSet29);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) strSet29);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition35 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder34);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition36 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder34);
        builder34.setthrottleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition40 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder39);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder39.mongoAdminPassword("");
        java.lang.String[] strArray46 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet47 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet47, strArray46);
        builder42.excludeFields = strSet47;
        com.mongodb.BasicDBObject basicDBObject50 = builder42.mongoCollectionFilter;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder34.mongoOplogFilter(basicDBObject50);
        java.lang.Object obj52 = docScoreSearchScript0.unwrap((java.lang.Object) builder34);
        org.apache.lucene.search.Scorer scorer53 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setScorer(scorer53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(basicDBObject50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(obj52);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setthrottleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.importAllCollections(true);
        java.lang.String str7 = builder6.gettypeName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder6.statisticsIndexName("_river");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder9);
        java.lang.String str11 = mongoDBRiverDefinition10.getHOST_FIELD();
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "host" + "'", str11, "host");
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean2 = mongoDBRiverDefinition1.storeStatistics;
        boolean boolean3 = mongoDBRiverDefinition1.isDisableIndexRefresh();
        java.lang.String str4 = mongoDBRiverDefinition1.getMongoLocalUser();
        java.util.Set<java.lang.String> strSet5 = mongoDBRiverDefinition1.getIncludeFields();
        java.lang.String str6 = mongoDBRiverDefinition1.indexName;
        java.lang.String str7 = mongoDBRiverDefinition1.mongoCollection;
        java.lang.String str8 = mongoDBRiverDefinition1.getHOST_FIELD();
        java.lang.String str9 = mongoDBRiverDefinition1.statisticsTypeName;
        java.util.List<com.mongodb.ServerAddress> serverAddressList10 = mongoDBRiverDefinition1.getMongoServers();
        java.util.List<com.mongodb.ServerAddress> serverAddressList11 = mongoDBRiverDefinition1.mongoServers;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "host" + "'", str8, "host");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(serverAddressList10);
        org.junit.Assert.assertNotNull(serverAddressList11);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean2 = mongoDBRiverDefinition1.storeStatistics;
        boolean boolean3 = mongoDBRiverDefinition1.isDisableIndexRefresh();
        java.lang.String str4 = mongoDBRiverDefinition1.getMongoLocalUser();
        java.lang.String str5 = mongoDBRiverDefinition1.getINCLUDE_FIELDS_FIELD();
        java.lang.String str6 = mongoDBRiverDefinition1.getINITIAL_TIMESTAMP_FIELD();
        boolean boolean7 = mongoDBRiverDefinition1.mongoUseSSL;
        java.lang.String str8 = mongoDBRiverDefinition1.getTypeName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "include_fields" + "'", str5, "include_fields");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "initial_timestamp" + "'", str6, "initial_timestamp");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("", "advanced_transformation");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?advanced_transformation?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("include_collection", "gridfs");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?gridfs?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.socketTimeout((int) (byte) 1);
        builder6.setmongoLocalUser("servers");
        builder6.disableIndexRefresh = false;
        boolean boolean11 = builder6.getskipInitialImport();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.typeName("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder2.skipInitialImport(true);
        java.lang.String str8 = builder7.getmongoDb();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder7.riverName("include_fields");
        java.lang.Class<?> wildcardClass11 = builder7.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean2 = mongoDBRiverDefinition1.storeStatistics;
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = mongoDBRiverDefinition1.initialTimestamp;
        java.lang.String str4 = mongoDBRiverDefinition1.getSKIP_INITIAL_IMPORT_FIELD();
        java.lang.String str5 = mongoDBRiverDefinition1.getStatisticsTypeName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "skip_initial_import" + "'", str4, "skip_initial_import");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean2 = mongoDBRiverDefinition1.storeStatistics;
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp3 = mongoDBRiverDefinition1.initialTimestamp;
        java.lang.String str4 = mongoDBRiverDefinition1.statisticsTypeName;
        com.mongodb.BasicDBObject basicDBObject5 = mongoDBRiverDefinition1.mongoOplogFilter;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(wildcardTimestamp3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(basicDBObject5);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder5.mongoAdminPassword("");
        java.lang.String[] strArray12 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        builder8.excludeFields = strSet13;
        builder2.setexcludeFields((java.util.Set<java.lang.String>) strSet13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder2.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder18);
        java.lang.String str20 = mongoDBRiverDefinition19.getADMIN_DB_FIELD();
        java.lang.String str21 = mongoDBRiverDefinition19.getDEFAULT_DB_HOST();
        java.lang.String str22 = mongoDBRiverDefinition19.getDB_FIELD();
        int int23 = mongoDBRiverDefinition19.getConnectTimeout();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "admin" + "'", str20, "admin");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "localhost" + "'", str21, "localhost");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "db" + "'", str22, "db");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setthrottleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.importAllCollections(true);
        java.lang.String str7 = builder6.gettypeName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder6.statisticsIndexName("_river");
        builder9.mongoDb = "port";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder9.mongoAdminPassword("hi!");
        builder13.advancedTransformation = false;
        com.mongodb.MongoClientOptions mongoClientOptions16 = builder13.getmongoClientOptions();
        java.lang.String str17 = builder13.statisticsTypeName;
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNull(mongoClientOptions16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean2 = mongoDBRiverDefinition1.storeStatistics;
        boolean boolean3 = mongoDBRiverDefinition1.isDisableIndexRefresh();
        java.lang.String str4 = mongoDBRiverDefinition1.getMongoLocalUser();
        java.util.Set<java.lang.String> strSet5 = mongoDBRiverDefinition1.getIncludeFields();
        java.lang.String str6 = mongoDBRiverDefinition1.getINITIAL_TIMESTAMP_SCRIPT_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition1.includeCollection;
        java.lang.String str8 = mongoDBRiverDefinition1.getMongoAdminPassword();
        java.lang.String str9 = mongoDBRiverDefinition1.getSECONDARY_READ_PREFERENCE_FIELD();
        boolean boolean10 = mongoDBRiverDefinition1.isMongoSSLVerifyCertificate();
        java.lang.String str11 = mongoDBRiverDefinition1.getTYPE_FIELD();
        boolean boolean12 = mongoDBRiverDefinition1.isAdvancedTransformation();
        boolean boolean13 = mongoDBRiverDefinition1.getmongoGridFS();
        com.mongodb.BasicDBObject basicDBObject14 = mongoDBRiverDefinition1.mongoCollectionFilter;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "script" + "'", str6, "script");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "secondary_read_preference" + "'", str9, "secondary_read_preference");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "type" + "'", str11, "type");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(basicDBObject14);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean2 = mongoDBRiverDefinition1.storeStatistics;
        boolean boolean3 = mongoDBRiverDefinition1.isSkipInitialImport();
        java.lang.String str4 = mongoDBRiverDefinition1.getMongoCollection();
        boolean boolean5 = mongoDBRiverDefinition1.getadvancedTransformation();
        boolean boolean6 = mongoDBRiverDefinition1.getmongoGridFS();
        int int7 = mongoDBRiverDefinition1.getConnectTimeout();
        boolean boolean8 = mongoDBRiverDefinition1.disableIndexRefresh;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean2 = mongoDBRiverDefinition1.storeStatistics;
        boolean boolean3 = mongoDBRiverDefinition1.isSkipInitialImport();
        java.lang.String str4 = mongoDBRiverDefinition1.getMongoCollection();
        boolean boolean5 = mongoDBRiverDefinition1.getadvancedTransformation();
        boolean boolean6 = mongoDBRiverDefinition1.mongoGridFS;
        boolean boolean7 = mongoDBRiverDefinition1.getskipInitialImport();
        int int8 = mongoDBRiverDefinition1.throttleSize;
        java.lang.String str9 = mongoDBRiverDefinition1.getSOCKET_TIMEOUT();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "socket_timeout" + "'", str9, "socket_timeout");
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("socket_timeout", "bulk");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?bulk?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.getDISABLE_INDEX_REFRESH_FIELD();
        boolean boolean4 = mongoDBRiverDefinition2.isDisableIndexRefresh();
        java.lang.String str5 = mongoDBRiverDefinition2.getUSER_FIELD();
        org.elasticsearch.common.logging.ESLogger eSLogger6 = mongoDBRiverDefinition2.getlogger();
        java.lang.String str7 = mongoDBRiverDefinition2.getIncludeCollection();
        java.lang.String str8 = mongoDBRiverDefinition2.getIMPORT_ALL_COLLECTIONS_FIELD();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "disable_index_refresh" + "'", str3, "disable_index_refresh");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "user" + "'", str5, "user");
        org.junit.Assert.assertNotNull(eSLogger6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "import_all_collections" + "'", str8, "import_all_collections");
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("servers", "ssl", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?ssl?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        builder2.setsocketTimeout((int) '4');
        builder2.setscript("flush_interval");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = builder2.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList8 = mongoDBRiverDefinition7.mongoServers;
        int int9 = mongoDBRiverDefinition7.getThrottleSize();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition7);
        org.junit.Assert.assertNotNull(serverAddressList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoLocalUser = "store_statistics";
        int int4 = builder0.connectTimeout;
        java.util.Set<java.lang.String> strSet5 = builder0.excludeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.riverName("parent_types");
        builder7.scriptType = "include_fields";
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.typeName("mongodb-1638820218449");
        boolean boolean4 = builder0.getmongoGridFS();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.storeStatistics(false);
        java.lang.String str7 = builder6.getscript();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder10.mongoAdminPassword("");
        java.lang.String[] strArray17 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        builder13.excludeFields = strSet18;
        builder7.setexcludeFields((java.util.Set<java.lang.String>) strSet18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder7.mongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.dropCollection(true);
        docScoreSearchScript0.setNextVar("", (java.lang.Object) true);
        org.apache.lucene.index.AtomicReaderContext atomicReaderContext27 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextReader(atomicReaderContext27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.mongoAdminPassword("");
        builder3.setsocketTimeout((int) (short) 10);
        boolean boolean6 = builder3.getmongoUseSSL();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = builder3.getinitialTimestamp();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(wildcardTimestamp7);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.getDISABLE_INDEX_REFRESH_FIELD();
        boolean boolean4 = mongoDBRiverDefinition2.getskipInitialImport();
        java.lang.String str5 = mongoDBRiverDefinition2.includeCollection;
        java.lang.String str6 = mongoDBRiverDefinition2.getMongoAdminPassword();
        boolean boolean7 = mongoDBRiverDefinition2.skipInitialImport;
        java.lang.String str8 = mongoDBRiverDefinition2.getTypeName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "disable_index_refresh" + "'", str3, "disable_index_refresh");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.getDISABLE_INDEX_REFRESH_FIELD();
        boolean boolean4 = mongoDBRiverDefinition2.isDisableIndexRefresh();
        java.lang.String str5 = mongoDBRiverDefinition2.getACTIONS_FIELD();
        java.lang.String str6 = mongoDBRiverDefinition2.getMongoOplogNamespace();
        boolean boolean7 = mongoDBRiverDefinition2.isMongoGridFS();
        java.lang.String str8 = mongoDBRiverDefinition2.getLOCAL_DB_FIELD();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "disable_index_refresh" + "'", str3, "disable_index_refresh");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "actions" + "'", str5, "actions");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "null.null" + "'", str6, "null.null");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "local" + "'", str8, "local");
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = builder0.mongoAdminPassword;
        java.lang.String str3 = builder0.riverIndexName;
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript4 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder6.mongoAdminPassword("");
        java.lang.String[] strArray13 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        builder9.excludeFields = strSet14;
        java.lang.String str17 = builder9.indexName;
        docScoreSearchScript4.setNextVar("actions", (java.lang.Object) builder9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder22.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition26 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder25);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder25.mongoAdminPassword("");
        java.lang.String[] strArray32 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet33 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet33, strArray32);
        builder28.excludeFields = strSet33;
        builder22.setexcludeFields((java.util.Set<java.lang.String>) strSet33);
        docScoreSearchScript4.setNextVar("type", (java.lang.Object) strSet33);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder0.parentTypes((java.util.Set<java.lang.String>) strSet33);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition39 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder38);
        java.lang.String str40 = mongoDBRiverDefinition39.mongoAdminPassword;
        java.lang.String str41 = mongoDBRiverDefinition39.getMongoLocalPassword();
        java.lang.String str42 = mongoDBRiverDefinition39.getMongoAdminUser();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        builder2.setsocketTimeout((int) '4');
        builder2.setscript("flush_interval");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = builder2.build();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder2);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition7);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        builder2.setsocketTimeout((int) '4');
        builder2.setscript("flush_interval");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = builder2.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList8 = mongoDBRiverDefinition7.mongoServers;
        com.mongodb.BasicDBObject basicDBObject9 = mongoDBRiverDefinition7.mongoOplogFilter;
        int int10 = mongoDBRiverDefinition7.getConnectTimeout();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition7);
        org.junit.Assert.assertNotNull(serverAddressList8);
        org.junit.Assert.assertNull(basicDBObject9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings1 = serializedObjectSupporter0.deserializeObjectRiverSettings4();
        org.elasticsearch.river.RiverSettings riverSettings2 = serializedObjectSupporter0.deserializeObjectRiverSettings1();
        org.elasticsearch.river.RiverSettings riverSettings3 = serializedObjectSupporter0.deserializeObjectRiverSettings7();
        org.elasticsearch.river.RiverSettings riverSettings4 = serializedObjectSupporter0.deserializeObjectRiverSettings5();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        org.elasticsearch.river.RiverSettings riverSettings6 = serializedObjectSupporter0.deserializeObjectRiverSettings6();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString17();
        org.junit.Assert.assertNull(riverSettings1);
        org.junit.Assert.assertNull(riverSettings2);
        org.junit.Assert.assertNull(riverSettings3);
        org.junit.Assert.assertNull(riverSettings4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "mongodb-1638820217755" + "'", str5, "mongodb-1638820217755");
        org.junit.Assert.assertNull(riverSettings6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mongodb-1638820218449" + "'", str7, "mongodb-1638820218449");
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.mongoAdminPassword("");
        java.lang.String[] strArray7 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        builder3.excludeFields = strSet8;
        builder3.mongoGridFS = true;
        boolean boolean13 = builder3.mongoSSLVerifyCertificate;
        builder3.setskipInitialImport(false);
        builder3.disableIndexRefresh = false;
        java.lang.String str18 = builder3.statisticsIndexName;
        builder3.mongoLocalPassword = "mongodb-1638820218363";
        builder3.mongoLocalPassword = "collection";
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.getDISABLE_INDEX_REFRESH_FIELD();
        java.lang.String str4 = mongoDBRiverDefinition2.getRiverName();
        java.lang.String str5 = mongoDBRiverDefinition2.mongoAdminPassword;
        int int6 = mongoDBRiverDefinition2.getSocketTimeout();
        boolean boolean7 = mongoDBRiverDefinition2.skipInitialImport;
        java.lang.String str8 = mongoDBRiverDefinition2.getIMPORT_ALL_COLLECTIONS_FIELD();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "disable_index_refresh" + "'", str3, "disable_index_refresh");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "import_all_collections" + "'", str8, "import_all_collections");
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.mongoAdminPassword("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder9.mongoAdminPassword("");
        java.lang.String[] strArray16 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        builder12.excludeFields = strSet17;
        builder6.setexcludeFields((java.util.Set<java.lang.String>) strSet17);
        builder3.parentTypes = strSet17;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions23 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder22.mongoClientOptions(mongoClientOptions23);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder24.script("disable_index_refresh");
        com.mongodb.BasicDBObject basicDBObject27 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.mongoCollectionFilter(basicDBObject27);
        builder28.statisticsIndexName = "host";
        builder28.setmongoAdminUser("skip_initial_import");
        builder28.setdropCollection(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions36 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder35.mongoClientOptions(mongoClientOptions36);
        builder37.setsocketTimeout((int) '4');
        builder37.setscript("flush_interval");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter42 = builder37.serializedObjectSupporter;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str44 = builder43.gettypeName();
        builder43.setmongoDb("concurrent_bulk_requests");
        builder43.riverName = "throttle_size";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder43.socketTimeout((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder43.mongoAdminUser("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition53 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder52);
        com.mongodb.ServerAddress[] serverAddressArray54 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList55 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList55, serverAddressArray54);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder52.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList55);
        builder37.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList55);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = builder28.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList55);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder3.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList55);
        boolean boolean61 = builder60.dropCollection;
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNull(serializedObjectSupporter42);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(serverAddressArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean2 = mongoDBRiverDefinition1.storeStatistics;
        boolean boolean3 = mongoDBRiverDefinition1.isSkipInitialImport();
        java.lang.String str4 = mongoDBRiverDefinition1.getMongoCollection();
        boolean boolean5 = mongoDBRiverDefinition1.isMongoSecondaryReadPreference();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.gettypeName();
        builder0.setmongoDb("concurrent_bulk_requests");
        builder0.riverName = "throttle_size";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.socketTimeout((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder10);
        boolean boolean12 = mongoDBRiverDefinition11.storeStatistics;
        boolean boolean13 = mongoDBRiverDefinition11.isDisableIndexRefresh();
        java.lang.String str14 = mongoDBRiverDefinition11.getMongoLocalUser();
        java.util.Set<java.lang.String> strSet15 = mongoDBRiverDefinition11.getIncludeFields();
        java.lang.String str16 = mongoDBRiverDefinition11.getINITIAL_TIMESTAMP_SCRIPT_FIELD();
        java.lang.String str17 = mongoDBRiverDefinition11.includeCollection;
        java.lang.String str18 = mongoDBRiverDefinition11.getMongoAdminPassword();
        java.lang.String str19 = mongoDBRiverDefinition11.getDROP_COLLECTION_FIELD();
        java.lang.String str20 = mongoDBRiverDefinition11.mongoAdminPassword;
        java.lang.String str21 = mongoDBRiverDefinition11.getMongoCollection();
        com.mongodb.BasicDBObject basicDBObject22 = mongoDBRiverDefinition11.getMongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder9.mongoOplogFilter(basicDBObject22);
        org.bson.types.Binary binary24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.initialTimestamp(binary24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(strSet15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "script" + "'", str16, "script");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "drop_collection" + "'", str19, "drop_collection");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(basicDBObject22);
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.socketTimeout((int) (byte) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.dropCollection(true);
        builder8.setskipInitialImport(true);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.script("disable_index_refresh");
        com.mongodb.BasicDBObject basicDBObject5 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoCollectionFilter(basicDBObject5);
        builder6.statisticsIndexName = "host";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.riverIndexName("ssl");
        builder6.setadvancedTransformation(false);
        builder6.setskipInitialImport(true);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.mongoAdminPassword("");
        builder3.setincludeCollection("flush_interval");
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        docScoreSearchScript0.setNextScore(0.0f);
        org.elasticsearch.common.settings.Settings settings6 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder7);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder7.typeName("mongodb-1638820218449");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder13.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder16);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder16.mongoAdminPassword("");
        java.lang.String[] strArray23 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        builder19.excludeFields = strSet24;
        builder13.setexcludeFields((java.util.Set<java.lang.String>) strSet24);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder13.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition30 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder29);
        boolean boolean31 = builder29.dropCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder32.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder36.socketTimeout((int) (byte) 1);
        com.mongodb.BasicDBObject basicDBObject39 = builder38.getmongoCollectionFilter();
        builder29.setmongoCollectionFilter(basicDBObject39);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder10.mongoCollectionFilter(basicDBObject39);
        org.elasticsearch.river.RiverSettings riverSettings42 = new org.elasticsearch.river.RiverSettings(settings6, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject39);
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(basicDBObject39);
        org.junit.Assert.assertNotNull(builder41);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.getDISABLE_INDEX_REFRESH_FIELD();
        boolean boolean4 = mongoDBRiverDefinition2.isDisableIndexRefresh();
        java.lang.String str5 = mongoDBRiverDefinition2.getUSER_FIELD();
        boolean boolean6 = mongoDBRiverDefinition2.mongoSecondaryReadPreference;
        java.lang.String str7 = mongoDBRiverDefinition2.getACTIONS_FIELD();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "disable_index_refresh" + "'", str3, "disable_index_refresh");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "user" + "'", str5, "user");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "actions" + "'", str7, "actions");
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        builder2.setsocketTimeout((int) '4');
        builder2.setscript("flush_interval");
        boolean boolean7 = builder2.getskipInitialImport();
        java.lang.String str8 = builder2.getindexName();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.gettypeName();
        builder0.setmongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str5 = mongoDBRiverDefinition4.getFILTER_FIELD();
        java.lang.String str6 = mongoDBRiverDefinition4.getMongoCollection();
        boolean boolean7 = mongoDBRiverDefinition4.isMongoSSLVerifyCertificate();
        int int8 = mongoDBRiverDefinition4.getDEFAULT_BULK_ACTIONS();
        java.lang.String str9 = mongoDBRiverDefinition4.getMongoLocalUser();
        java.lang.String str10 = mongoDBRiverDefinition4.getIMPORT_ALL_COLLECTIONS_FIELD();
        org.elasticsearch.common.unit.TimeValue timeValue11 = mongoDBRiverDefinition4.getDEFAULT_FLUSH_INTERVAL();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "filter" + "'", str5, "filter");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1000 + "'", int8 == 1000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "import_all_collections" + "'", str10, "import_all_collections");
        org.junit.Assert.assertNotNull(timeValue11);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setthrottleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.importAllCollections(true);
        java.lang.String str7 = builder6.gettypeName();
        java.lang.String str8 = builder6.riverIndexName;
        builder6.statisticsIndexName = "mongodb-1638820218363";
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean2 = mongoDBRiverDefinition1.storeStatistics;
        boolean boolean3 = mongoDBRiverDefinition1.isDisableIndexRefresh();
        java.lang.String str4 = mongoDBRiverDefinition1.getMongoLocalUser();
        java.util.Set<java.lang.String> strSet5 = mongoDBRiverDefinition1.getIncludeFields();
        java.lang.String str6 = mongoDBRiverDefinition1.indexName;
        java.lang.String str7 = mongoDBRiverDefinition1.getMongoOplogNamespace();
        boolean boolean8 = mongoDBRiverDefinition1.isDropCollection();
        java.lang.String str9 = mongoDBRiverDefinition1.getRiverIndexName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null.null" + "'", str7, "null.null");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder10.mongoAdminPassword("");
        java.lang.String[] strArray17 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        builder13.excludeFields = strSet18;
        builder7.setexcludeFields((java.util.Set<java.lang.String>) strSet18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder7.mongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.dropCollection(true);
        docScoreSearchScript0.setNextVar("", (java.lang.Object) true);
        org.apache.lucene.search.Scorer scorer27 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setScorer(scorer27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.socketTimeout((int) (byte) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.statisticsIndexName("size");
        org.bson.types.BSONTimestamp bSONTimestamp9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder4.initialTimestamp(bSONTimestamp9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ts must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.gettypeName();
        builder0.setmongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str5 = mongoDBRiverDefinition4.getFILTER_FIELD();
        java.lang.String str6 = mongoDBRiverDefinition4.getMongoCollection();
        com.mongodb.BasicDBObject basicDBObject7 = mongoDBRiverDefinition4.mongoCollectionFilter;
        java.lang.String str8 = mongoDBRiverDefinition4.getINITIAL_TIMESTAMP_SCRIPT_FIELD();
        boolean boolean9 = mongoDBRiverDefinition4.isMongoSSLVerifyCertificate();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "filter" + "'", str5, "filter");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(basicDBObject7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "script" + "'", str8, "script");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.script("disable_index_refresh");
        com.mongodb.BasicDBObject basicDBObject5 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoCollectionFilter(basicDBObject5);
        builder4.setstoreStatistics(false);
        builder4.riverName = "secondary_read_preference";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder4);
        com.mongodb.MongoClientOptions mongoClientOptions12 = null;
        builder4.setmongoClientOptions(mongoClientOptions12);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder5.mongoAdminPassword("");
        java.lang.String[] strArray12 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        builder8.excludeFields = strSet13;
        builder2.setexcludeFields((java.util.Set<java.lang.String>) strSet13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder2.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder18);
        java.lang.String str20 = mongoDBRiverDefinition19.getADMIN_DB_FIELD();
        java.lang.String str21 = mongoDBRiverDefinition19.typeName;
        java.lang.String str22 = mongoDBRiverDefinition19.getBULK_FIELD();
        boolean boolean23 = mongoDBRiverDefinition19.getmongoSecondaryReadPreference();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "admin" + "'", str20, "admin");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "bulk" + "'", str22, "bulk");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.gettypeName();
        builder0.setmongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str5 = mongoDBRiverDefinition4.getFILTER_FIELD();
        java.lang.String str6 = mongoDBRiverDefinition4.getMongoCollection();
        boolean boolean7 = mongoDBRiverDefinition4.isMongoSSLVerifyCertificate();
        int int8 = mongoDBRiverDefinition4.getDEFAULT_BULK_ACTIONS();
        java.lang.String str9 = mongoDBRiverDefinition4.getSTORE_STATISTICS_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition4.typeName;
        java.util.Set<java.lang.String> strSet11 = mongoDBRiverDefinition4.getParentTypes();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "filter" + "'", str5, "filter");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1000 + "'", int8 == 1000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "store_statistics" + "'", str9, "store_statistics");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(strSet11);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.getDISABLE_INDEX_REFRESH_FIELD();
        boolean boolean4 = mongoDBRiverDefinition2.isDisableIndexRefresh();
        java.lang.String str5 = mongoDBRiverDefinition2.getUSER_FIELD();
        java.lang.String str6 = mongoDBRiverDefinition2.getNAME_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition2.getFLUSH_INTERVAL_FIELD();
        java.lang.String str8 = mongoDBRiverDefinition2.getStatisticsTypeName();
        java.lang.String str9 = mongoDBRiverDefinition2.getMongoLocalPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "disable_index_refresh" + "'", str3, "disable_index_refresh");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "user" + "'", str5, "user");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "name" + "'", str6, "name");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "flush_interval" + "'", str7, "flush_interval");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean2 = mongoDBRiverDefinition1.storeStatistics;
        boolean boolean3 = mongoDBRiverDefinition1.isDisableIndexRefresh();
        java.lang.String str4 = mongoDBRiverDefinition1.getMongoLocalUser();
        java.util.Set<java.lang.String> strSet5 = mongoDBRiverDefinition1.getIncludeFields();
        java.lang.String str6 = mongoDBRiverDefinition1.getINITIAL_TIMESTAMP_SCRIPT_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition1.includeCollection;
        java.lang.String str8 = mongoDBRiverDefinition1.getMongoAdminPassword();
        java.lang.String str9 = mongoDBRiverDefinition1.getDROP_COLLECTION_FIELD();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue10 = mongoDBRiverDefinition1.getDEFAULT_BULK_SIZE();
        java.lang.String str11 = mongoDBRiverDefinition1.getADMIN_DB_FIELD();
        java.lang.String str12 = mongoDBRiverDefinition1.getMongoDb();
        java.lang.String str13 = mongoDBRiverDefinition1.mongoAdminPassword;
        java.lang.Class<?> wildcardClass14 = mongoDBRiverDefinition1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "script" + "'", str6, "script");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "drop_collection" + "'", str9, "drop_collection");
        org.junit.Assert.assertNotNull(byteSizeValue10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "admin" + "'", str11, "admin");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString4();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString17();
        org.elasticsearch.river.RiverSettings riverSettings4 = serializedObjectSupporter0.deserializeObjectRiverSettings2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_river" + "'", str1, "_river");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mongodb-1638820217755" + "'", str2, "mongodb-1638820217755");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "mongodb-1638820218449" + "'", str3, "mongodb-1638820218449");
        org.junit.Assert.assertNull(riverSettings4);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings1 = serializedObjectSupporter0.deserializeObjectRiverSettings4();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString11();
        org.elasticsearch.river.RiverSettings riverSettings3 = serializedObjectSupporter0.deserializeObjectRiverSettings5();
        org.elasticsearch.river.RiverSettings riverSettings4 = serializedObjectSupporter0.deserializeObjectRiverSettings3();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString17();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString4();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(riverSettings1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mongodb-1638820218387" + "'", str2, "mongodb-1638820218387");
        org.junit.Assert.assertNull(riverSettings3);
        org.junit.Assert.assertNull(riverSettings4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "mongodb-1638820218449" + "'", str5, "mongodb-1638820218449");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_river" + "'", str6, "_river");
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        com.mongodb.BasicDBObject basicDBObject3 = null;
        builder0.setmongoOplogFilter(basicDBObject3);
        boolean boolean5 = builder0.importAllCollections;
        builder0.setmongoGridFS(false);
        int int8 = builder0.throttleSize;
        java.lang.String str9 = builder0.getscript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder0.mongoSSLVerifyCertificate(false);
        builder0.setincludeCollection("ssl_verify_certificate");
        builder0.mongoAdminPassword = "credentials";
        java.lang.String str16 = builder0.includeCollection;
        java.lang.String str17 = builder0.mongoDb;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ssl_verify_certificate" + "'", str16, "ssl_verify_certificate");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.typeName("mongodb-1638820218449");
        boolean boolean4 = builder0.getmongoGridFS();
        com.mongodb.MongoClientOptions mongoClientOptions5 = null;
        builder0.mongoClientOptions = mongoClientOptions5;
        java.util.Set<java.lang.String> strSet7 = builder0.getincludeFields();
        java.lang.String str8 = builder0.mongoAdminPassword;
        builder0.settypeName("concurrent_requests");
        builder0.riverIndexName = "_river";
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean2 = mongoDBRiverDefinition1.storeStatistics;
        boolean boolean3 = mongoDBRiverDefinition1.isDisableIndexRefresh();
        java.lang.String str4 = mongoDBRiverDefinition1.getMongoLocalUser();
        java.util.Set<java.lang.String> strSet5 = mongoDBRiverDefinition1.getIncludeFields();
        java.lang.String str6 = mongoDBRiverDefinition1.getCOLLECTION_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition1.getMongoOplogNamespace();
        java.lang.String str8 = mongoDBRiverDefinition1.getSTORE_STATISTICS_FIELD();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "collection" + "'", str6, "collection");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null.null" + "'", str7, "null.null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "store_statistics" + "'", str8, "store_statistics");
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings1 = serializedObjectSupporter0.deserializeObjectRiverSettings4();
        org.elasticsearch.river.RiverSettings riverSettings2 = serializedObjectSupporter0.deserializeObjectRiverSettings1();
        org.elasticsearch.river.RiverSettings riverSettings3 = serializedObjectSupporter0.deserializeObjectRiverSettings7();
        org.elasticsearch.river.RiverSettings riverSettings4 = serializedObjectSupporter0.deserializeObjectRiverSettings5();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString16();
        org.junit.Assert.assertNull(riverSettings1);
        org.junit.Assert.assertNull(riverSettings2);
        org.junit.Assert.assertNull(riverSettings3);
        org.junit.Assert.assertNull(riverSettings4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "mongodb-1638820217755" + "'", str5, "mongodb-1638820217755");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_river" + "'", str6, "_river");
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        int int3 = builder0.getsocketTimeout();
        java.lang.String str4 = builder0.mongoLocalUser;
        builder0.script = "admin";
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder1);
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder1.setmongoOplogFilter(basicDBObject4);
        boolean boolean6 = builder1.importAllCollections;
        java.lang.String[] strArray20 = new java.lang.String[] { "concurrent_bulk_requests", "host", "hi!", "bulk_size", "drop_collection", "mongodb-1638820218387", "servers", "host", "disable_index_refresh", "mongodb-1638820218387", "", "bulk_size", "mongodb-1638820218387" };
        java.util.LinkedHashSet<java.lang.String> strSet21 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet21, strArray20);
        builder1.parentTypes = strSet21;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder24.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.socketTimeout((int) (byte) 1);
        com.mongodb.BasicDBObject basicDBObject31 = builder30.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder1.mongoCollectionFilter(basicDBObject31);
        org.elasticsearch.river.RiverSettings riverSettings33 = new org.elasticsearch.river.RiverSettings(settings0, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject31);
        java.util.Map<java.lang.String, java.lang.Object> strMap34 = riverSettings33.settings();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(basicDBObject31);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(strMap34);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.getDISABLE_INDEX_REFRESH_FIELD();
        boolean boolean4 = mongoDBRiverDefinition2.isDisableIndexRefresh();
        java.lang.String str5 = mongoDBRiverDefinition2.getACTIONS_FIELD();
        java.lang.String str6 = mongoDBRiverDefinition2.getMongoOplogNamespace();
        boolean boolean7 = mongoDBRiverDefinition2.isMongoGridFS();
        java.lang.String str8 = mongoDBRiverDefinition2.mongoLocalPassword;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "disable_index_refresh" + "'", str3, "disable_index_refresh");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "actions" + "'", str5, "actions");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "null.null" + "'", str6, "null.null");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString11();
        org.elasticsearch.river.RiverSettings riverSettings2 = serializedObjectSupporter0.deserializeObjectRiverSettings2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb-1638820218387" + "'", str1, "mongodb-1638820218387");
        org.junit.Assert.assertNull(riverSettings2);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings1 = serializedObjectSupporter0.deserializeObjectRiverSettings8();
        org.elasticsearch.river.RiverSettings riverSettings2 = serializedObjectSupporter0.deserializeObjectRiverSettings4();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString16();
        org.elasticsearch.river.RiverSettings riverSettings4 = serializedObjectSupporter0.deserializeObjectRiverSettings6();
        org.junit.Assert.assertNull(riverSettings1);
        org.junit.Assert.assertNull(riverSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_river" + "'", str3, "_river");
        org.junit.Assert.assertNull(riverSettings4);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("collection", "host", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?host?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder4);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder4);
        java.lang.String str7 = mongoDBRiverDefinition6.getDISABLE_INDEX_REFRESH_FIELD();
        boolean boolean8 = mongoDBRiverDefinition6.isDisableIndexRefresh();
        java.lang.String str9 = mongoDBRiverDefinition6.getEXCLUDE_FIELDS_FIELD();
        java.lang.Object obj10 = docScoreSearchScript0.unwrap((java.lang.Object) str9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder12);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder12);
        java.lang.String str15 = mongoDBRiverDefinition14.getDISABLE_INDEX_REFRESH_FIELD();
        java.lang.String str16 = mongoDBRiverDefinition14.getRiverName();
        java.util.List<com.mongodb.ServerAddress> serverAddressList17 = mongoDBRiverDefinition14.getMongoServers();
        docScoreSearchScript0.setNextVar("import_all_collections", (java.lang.Object) mongoDBRiverDefinition14);
        org.apache.lucene.index.AtomicReaderContext atomicReaderContext19 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextReader(atomicReaderContext19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "disable_index_refresh" + "'", str7, "disable_index_refresh");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "exclude_fields" + "'", str9, "exclude_fields");
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "exclude_fields" + "'", obj10, "exclude_fields");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "disable_index_refresh" + "'", str15, "disable_index_refresh");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(serverAddressList17);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("size", "concurrent_requests");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?concurrent_requests?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings1 = serializedObjectSupporter0.deserializeObjectRiverSettings4();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString11();
        org.elasticsearch.river.RiverSettings riverSettings3 = serializedObjectSupporter0.deserializeObjectRiverSettings5();
        org.elasticsearch.river.RiverSettings riverSettings4 = serializedObjectSupporter0.deserializeObjectRiverSettings9();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        org.elasticsearch.river.RiverSettings riverSettings6 = serializedObjectSupporter0.deserializeObjectRiverSettings4();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString6();
        org.elasticsearch.river.RiverSettings riverSettings8 = serializedObjectSupporter0.deserializeObjectRiverSettings3();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(riverSettings1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mongodb-1638820218387" + "'", str2, "mongodb-1638820218387");
        org.junit.Assert.assertNull(riverSettings3);
        org.junit.Assert.assertNull(riverSettings4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "mongodb-1638820217755" + "'", str5, "mongodb-1638820217755");
        org.junit.Assert.assertNull(riverSettings6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_river" + "'", str7, "_river");
        org.junit.Assert.assertNull(riverSettings8);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.socketTimeout((int) (byte) 1);
        builder6.setimportAllCollections(false);
        boolean boolean9 = builder6.getdropCollection();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder5.mongoAdminPassword("");
        java.lang.String[] strArray12 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        builder8.excludeFields = strSet13;
        builder2.setexcludeFields((java.util.Set<java.lang.String>) strSet13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder2.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder18);
        java.lang.String str20 = mongoDBRiverDefinition19.getRiverIndexName();
        org.elasticsearch.common.unit.TimeValue timeValue21 = mongoDBRiverDefinition19.getDEFAULT_FLUSH_INTERVAL();
        java.lang.String str22 = mongoDBRiverDefinition19.mongoAdminUser;
        com.mongodb.BasicDBObject basicDBObject23 = mongoDBRiverDefinition19.getMongoOplogFilter();
        int int24 = mongoDBRiverDefinition19.getDEFAULT_DB_PORT();
        java.lang.String str25 = mongoDBRiverDefinition19.getPARENT_TYPES_FIELD();
        java.lang.String str26 = mongoDBRiverDefinition19.getINCLUDE_COLLECTION_FIELD();
        java.lang.String str27 = mongoDBRiverDefinition19.statisticsTypeName;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(timeValue21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "disable_index_refresh" + "'", str22, "disable_index_refresh");
        org.junit.Assert.assertNull(basicDBObject23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 27017 + "'", int24 == 27017);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "parent_types" + "'", str25, "parent_types");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "include_collection" + "'", str26, "include_collection");
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean2 = mongoDBRiverDefinition1.storeStatistics;
        java.lang.String str3 = mongoDBRiverDefinition1.getTypeName();
        org.elasticsearch.common.unit.TimeValue timeValue4 = mongoDBRiverDefinition1.getDEFAULT_FLUSH_INTERVAL();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(timeValue4);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.getDISABLE_INDEX_REFRESH_FIELD();
        boolean boolean4 = mongoDBRiverDefinition2.getskipInitialImport();
        java.lang.String str5 = mongoDBRiverDefinition2.getSECONDARY_READ_PREFERENCE_FIELD();
        com.mongodb.BasicDBObject basicDBObject6 = mongoDBRiverDefinition2.getMongoOplogFilter();
        java.lang.String str7 = mongoDBRiverDefinition2.mongoLocalUser;
        boolean boolean8 = mongoDBRiverDefinition2.isMongoSecondaryReadPreference();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "disable_index_refresh" + "'", str3, "disable_index_refresh");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "secondary_read_preference" + "'", str5, "secondary_read_preference");
        org.junit.Assert.assertNull(basicDBObject6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.typeName("mongodb-1638820218449");
        boolean boolean4 = builder0.getmongoGridFS();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.storeStatistics(false);
        builder6.indexName = "mongodb-1638820218387";
        java.lang.String str9 = builder6.getmongoLocalUser();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        int int3 = builder0.getsocketTimeout();
        int int4 = builder0.connectTimeout;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.riverName("credentials");
        org.bson.types.Binary binary7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.initialTimestamp(binary7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean2 = mongoDBRiverDefinition1.storeStatistics;
        boolean boolean3 = mongoDBRiverDefinition1.isDisableIndexRefresh();
        java.lang.String str4 = mongoDBRiverDefinition1.getMongoLocalUser();
        java.util.Set<java.lang.String> strSet5 = mongoDBRiverDefinition1.getIncludeFields();
        java.lang.String str6 = mongoDBRiverDefinition1.getINITIAL_TIMESTAMP_SCRIPT_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition1.includeCollection;
        java.lang.String str8 = mongoDBRiverDefinition1.getMongoAdminPassword();
        boolean boolean9 = mongoDBRiverDefinition1.getmongoUseSSL();
        boolean boolean10 = mongoDBRiverDefinition1.isStoreStatistics();
        java.util.Set<java.lang.String> strSet11 = mongoDBRiverDefinition1.getIncludeFields();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "script" + "'", str6, "script");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(strSet11);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        com.mongodb.BasicDBObject basicDBObject3 = null;
        builder0.setmongoOplogFilter(basicDBObject3);
        boolean boolean5 = builder0.importAllCollections;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.mongoLocalPassword("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str9 = builder8.gettypeName();
        builder8.setmongoDb("concurrent_bulk_requests");
        builder8.riverName = "throttle_size";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder8.socketTimeout((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder8.mongoAdminUser("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder17);
        com.mongodb.ServerAddress[] serverAddressArray19 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList20 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList20, serverAddressArray19);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder17.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList20);
        builder0.mongoServers = serverAddressList20;
        builder0.mongoAdminPassword = "disable_index_refresh";
        java.lang.Class<?> wildcardClass26 = builder0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(serverAddressArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean2 = mongoDBRiverDefinition1.storeStatistics;
        boolean boolean3 = mongoDBRiverDefinition1.isDisableIndexRefresh();
        java.lang.String str4 = mongoDBRiverDefinition1.getMongoLocalUser();
        java.util.Set<java.lang.String> strSet5 = mongoDBRiverDefinition1.getIncludeFields();
        java.lang.String str6 = mongoDBRiverDefinition1.getINITIAL_TIMESTAMP_SCRIPT_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition1.includeCollection;
        java.lang.String str8 = mongoDBRiverDefinition1.getMongoAdminPassword();
        java.lang.String str9 = mongoDBRiverDefinition1.getSECONDARY_READ_PREFERENCE_FIELD();
        boolean boolean10 = mongoDBRiverDefinition1.isMongoSSLVerifyCertificate();
        java.lang.String str11 = mongoDBRiverDefinition1.getTYPE_FIELD();
        boolean boolean12 = mongoDBRiverDefinition1.getstoreStatistics();
        java.lang.String str13 = mongoDBRiverDefinition1.getTypeName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "script" + "'", str6, "script");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "secondary_read_preference" + "'", str9, "secondary_read_preference");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "type" + "'", str11, "type");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.mongoAdminPassword("");
        java.lang.String[] strArray7 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        builder3.excludeFields = strSet8;
        builder3.disableIndexRefresh = false;
        builder3.setdisableIndexRefresh(true);
        int int15 = builder3.getthrottleSize();
        org.bson.types.Binary binary16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder3.initialTimestamp(binary16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder5.mongoAdminPassword("");
        java.lang.String[] strArray12 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        builder8.excludeFields = strSet13;
        builder2.setexcludeFields((java.util.Set<java.lang.String>) strSet13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder2.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder18);
        java.lang.String str20 = mongoDBRiverDefinition19.getRiverIndexName();
        boolean boolean21 = mongoDBRiverDefinition19.getmongoGridFS();
        boolean boolean22 = mongoDBRiverDefinition19.getmongoSecondaryReadPreference();
        java.lang.String str23 = mongoDBRiverDefinition19.getPORT_FIELD();
        java.lang.String str24 = mongoDBRiverDefinition19.getFILTER_FIELD();
        java.lang.String str25 = mongoDBRiverDefinition19.getMongoLocalUser();
        java.lang.String str26 = mongoDBRiverDefinition19.getDB_FIELD();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "port" + "'", str23, "port");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "filter" + "'", str24, "filter");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "db" + "'", str26, "db");
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean2 = mongoDBRiverDefinition1.storeStatistics;
        boolean boolean3 = mongoDBRiverDefinition1.isDisableIndexRefresh();
        boolean boolean4 = mongoDBRiverDefinition1.getmongoSecondaryReadPreference();
        java.lang.String str5 = mongoDBRiverDefinition1.getSKIP_INITIAL_IMPORT_FIELD();
        java.lang.String str6 = mongoDBRiverDefinition1.getSERVERS_FIELD();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "skip_initial_import" + "'", str5, "skip_initial_import");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "servers" + "'", str6, "servers");
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("script_type", "servers");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?servers?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((float) (short) 100);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter9 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString4();
        java.lang.String str11 = serializedObjectSupporter9.deserializeObjectString1();
        docScoreSearchScript0.setNextVar("include_fields", (java.lang.Object) str11);
        docScoreSearchScript0.setNextScore((float) 1L);
        org.apache.lucene.search.Scorer scorer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setScorer(scorer15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_river" + "'", str10, "_river");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "mongodb-1638820217755" + "'", str11, "mongodb-1638820217755");
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        com.mongodb.BasicDBObject basicDBObject3 = null;
        builder0.setmongoOplogFilter(basicDBObject3);
        boolean boolean5 = builder0.importAllCollections;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.mongoLocalPassword("name");
        builder0.mongoLocalPassword = "concurrent_bulk_requests";
        builder0.setscriptType("flush_interval");
        builder0.setdropCollection(true);
        int int14 = builder0.getsocketTimeout();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.script("disable_index_refresh");
        boolean boolean5 = builder2.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder2.mongoLocalUser("options");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder2.statisticsIndexName("collection");
        builder9.advancedTransformation = false;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setthrottleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.importAllCollections(true);
        java.lang.String str7 = builder6.gettypeName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder6.statisticsIndexName("_river");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder9);
        java.lang.String str11 = mongoDBRiverDefinition10.getSIZE_FIELD();
        java.lang.String str12 = mongoDBRiverDefinition10.typeName;
        java.lang.String str13 = mongoDBRiverDefinition10.getMongoAdminUser();
        java.lang.String str14 = mongoDBRiverDefinition10.getTypeName();
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "size" + "'", str11, "size");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder5.mongoAdminPassword("");
        java.lang.String[] strArray12 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        builder8.excludeFields = strSet13;
        builder2.setexcludeFields((java.util.Set<java.lang.String>) strSet13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder2.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder18);
        java.lang.String str20 = mongoDBRiverDefinition19.getADMIN_DB_FIELD();
        java.lang.String str21 = mongoDBRiverDefinition19.typeName;
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter22 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings23 = serializedObjectSupporter22.deserializeObjectRiverSettings4();
        java.lang.String str24 = serializedObjectSupporter22.deserializeObjectString11();
        org.elasticsearch.river.RiverSettings riverSettings25 = serializedObjectSupporter22.deserializeObjectRiverSettings5();
        org.elasticsearch.river.RiverSettings riverSettings26 = serializedObjectSupporter22.deserializeObjectRiverSettings9();
        java.lang.String str27 = serializedObjectSupporter22.deserializeObjectString1();
        mongoDBRiverDefinition19.serializedObjectSupporter = serializedObjectSupporter22;
        org.elasticsearch.river.RiverSettings riverSettings29 = serializedObjectSupporter22.deserializeObjectRiverSettings2();
        java.lang.String str30 = serializedObjectSupporter22.deserializeObjectString14();
        java.lang.String str31 = serializedObjectSupporter22.deserializeObjectString2();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "admin" + "'", str20, "admin");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(riverSettings23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "mongodb-1638820218387" + "'", str24, "mongodb-1638820218387");
        org.junit.Assert.assertNull(riverSettings25);
        org.junit.Assert.assertNull(riverSettings26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "mongodb-1638820217755" + "'", str27, "mongodb-1638820217755");
        org.junit.Assert.assertNull(riverSettings29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "_river" + "'", str30, "_river");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "_river" + "'", str31, "_river");
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        com.mongodb.BasicDBObject basicDBObject3 = null;
        builder0.setmongoOplogFilter(basicDBObject3);
        builder0.setmongoCollection("name");
        java.lang.String str7 = builder0.mongoAdminUser;
        java.util.Set<java.lang.String> strSet8 = builder0.parentTypes;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(strSet8);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.getScriptType();
        boolean boolean3 = mongoDBRiverDefinition1.getimportAllCollections();
        java.lang.String str4 = mongoDBRiverDefinition1.getSIZE_FIELD();
        java.lang.String str5 = mongoDBRiverDefinition1.getINITIAL_TIMESTAMP_FIELD();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "size" + "'", str4, "size");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "initial_timestamp" + "'", str5, "initial_timestamp");
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.socketTimeout((int) ' ');
        builder2.importAllCollections = false;
        builder2.throttleSize = (byte) 10;
        java.lang.String str7 = builder2.getmongoDb();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder2.dropCollection(true);
        boolean boolean10 = builder2.mongoGridFS;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        java.util.List<com.mongodb.ServerAddress> serverAddressList3 = builder2.getmongoServers();
        java.lang.String str4 = builder2.typeName;
        builder2.script = "script_type";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder2.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder14);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder14.mongoAdminPassword("");
        java.lang.String[] strArray21 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        builder17.excludeFields = strSet22;
        builder11.setexcludeFields((java.util.Set<java.lang.String>) strSet22);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder11.mongoUseSSL(false);
        builder11.storeStatistics = false;
        java.lang.String str30 = builder11.getincludeCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder31.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder33.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition37 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder36);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder36.mongoAdminPassword("");
        java.lang.String[] strArray43 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet44 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet44, strArray43);
        builder39.excludeFields = strSet44;
        builder33.setexcludeFields((java.util.Set<java.lang.String>) strSet44);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder33.mongoSecondaryReadPreference(false);
        boolean boolean50 = builder49.storeStatistics;
        builder49.setmongoLocalUser("host");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition54 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder53);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition55 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder53);
        builder53.setthrottleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = builder53.importAllCollections(true);
        builder53.setindexName("drop_collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder64 = builder62.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder66 = builder64.mongoAdminUser("disable_index_refresh");
        java.lang.String[] strArray85 = new java.lang.String[] { "mongodb-1638820218387", "mongodb-1638820218387", "localhost", "", "localhost", "host", "user", "hi!", "actions", "exclude_fields", "throttle_size", "ssl_verify_certificate", "local", "disable_index_refresh", "user", "port", "actions", "host" };
        java.util.LinkedHashSet<java.lang.String> strSet86 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet86, strArray85);
        builder64.excludeFields = strSet86;
        builder53.includeFields = strSet86;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder90 = builder49.excludeFields((java.util.Set<java.lang.String>) strSet86);
        builder11.setincludeFields((java.util.Set<java.lang.String>) strSet86);
        java.lang.String str92 = builder11.getmongoAdminPassword();
        java.util.Set<java.lang.String> strSet93 = builder11.excludeFields;
        builder2.setexcludeFields(strSet93);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(serverAddressList3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNotNull(builder90);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
        org.junit.Assert.assertNotNull(strSet93);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.gettypeName();
        builder0.setmongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str5 = mongoDBRiverDefinition4.getFILTER_FIELD();
        java.lang.String str6 = mongoDBRiverDefinition4.getMongoCollection();
        com.mongodb.BasicDBObject basicDBObject7 = mongoDBRiverDefinition4.mongoCollectionFilter;
        java.lang.String str8 = mongoDBRiverDefinition4.getINITIAL_TIMESTAMP_SCRIPT_FIELD();
        java.lang.String str9 = mongoDBRiverDefinition4.getMongoCollection();
        java.lang.String str10 = mongoDBRiverDefinition4.getScriptType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "filter" + "'", str5, "filter");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(basicDBObject7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "script" + "'", str8, "script");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.socketTimeout = (short) 10;
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter3 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings4 = serializedObjectSupporter3.deserializeObjectRiverSettings4();
        java.lang.String str5 = serializedObjectSupporter3.deserializeObjectString11();
        org.elasticsearch.river.RiverSettings riverSettings6 = serializedObjectSupporter3.deserializeObjectRiverSettings5();
        org.elasticsearch.river.RiverSettings riverSettings7 = serializedObjectSupporter3.deserializeObjectRiverSettings3();
        builder0.serializedObjectSupporter = serializedObjectSupporter3;
        java.lang.String str9 = builder0.mongoCollection;
        java.lang.Class<?> wildcardClass10 = builder0.getClass();
        org.junit.Assert.assertNull(riverSettings4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "mongodb-1638820218387" + "'", str5, "mongodb-1638820218387");
        org.junit.Assert.assertNull(riverSettings6);
        org.junit.Assert.assertNull(riverSettings7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.gettypeName();
        builder0.setmongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str5 = mongoDBRiverDefinition4.getFILTER_FIELD();
        java.lang.String str6 = mongoDBRiverDefinition4.getSCRIPT_FIELD();
        boolean boolean7 = mongoDBRiverDefinition4.isMongoUseSSL();
        java.lang.String str8 = mongoDBRiverDefinition4.getTypeName();
        java.lang.String str9 = mongoDBRiverDefinition4.riverName;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "filter" + "'", str5, "filter");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "script" + "'", str6, "script");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder5.mongoAdminPassword("");
        java.lang.String[] strArray12 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        builder8.excludeFields = strSet13;
        builder2.setexcludeFields((java.util.Set<java.lang.String>) strSet13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder2.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder18);
        boolean boolean20 = builder18.dropCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder25.socketTimeout((int) (byte) 1);
        com.mongodb.BasicDBObject basicDBObject28 = builder27.getmongoCollectionFilter();
        builder18.setmongoCollectionFilter(basicDBObject28);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder18.script("mongodb-1638820218408");
        builder31.setscript("name");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(basicDBObject28);
        org.junit.Assert.assertNotNull(builder31);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean2 = mongoDBRiverDefinition1.storeStatistics;
        boolean boolean3 = mongoDBRiverDefinition1.isSkipInitialImport();
        java.lang.String str4 = mongoDBRiverDefinition1.getMongoCollection();
        boolean boolean5 = mongoDBRiverDefinition1.getadvancedTransformation();
        boolean boolean6 = mongoDBRiverDefinition1.mongoGridFS;
        org.elasticsearch.common.unit.TimeValue timeValue7 = mongoDBRiverDefinition1.getDEFAULT_FLUSH_INTERVAL();
        int int8 = mongoDBRiverDefinition1.socketTimeout;
        java.lang.String str9 = mongoDBRiverDefinition1.getOPTIONS_FIELD();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(timeValue7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "options" + "'", str9, "options");
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("_river", "admin", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?admin?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        com.mongodb.BasicDBObject basicDBObject3 = null;
        builder0.setmongoOplogFilter(basicDBObject3);
        boolean boolean5 = builder0.importAllCollections;
        java.lang.String[] strArray19 = new java.lang.String[] { "concurrent_bulk_requests", "host", "hi!", "bulk_size", "drop_collection", "mongodb-1638820218387", "servers", "host", "disable_index_refresh", "mongodb-1638820218387", "", "bulk_size", "mongodb-1638820218387" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        builder0.parentTypes = strSet20;
        builder0.statisticsTypeName = "bulk_size";
        java.lang.String str25 = builder0.mongoDb;
        java.lang.String str26 = builder0.getmongoDb();
        org.bson.types.BSONTimestamp bSONTimestamp27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder0.initialTimestamp(bSONTimestamp27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ts must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.socketTimeout((int) ' ');
        int int3 = builder2.getsocketTimeout();
        java.lang.String str4 = builder2.scriptType;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str8 = mongoDBRiverDefinition7.getDISABLE_INDEX_REFRESH_FIELD();
        boolean boolean9 = mongoDBRiverDefinition7.isDisableIndexRefresh();
        java.lang.String str10 = mongoDBRiverDefinition7.getUSER_FIELD();
        java.lang.String str11 = mongoDBRiverDefinition7.getNAME_FIELD();
        java.lang.String str12 = mongoDBRiverDefinition7.getFLUSH_INTERVAL_FIELD();
        java.lang.String str13 = mongoDBRiverDefinition7.mongoAdminUser;
        java.util.List<com.mongodb.ServerAddress> serverAddressList14 = mongoDBRiverDefinition7.mongoServers;
        builder2.mongoServers = serverAddressList14;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "disable_index_refresh" + "'", str8, "disable_index_refresh");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "user" + "'", str10, "user");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "name" + "'", str11, "name");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "flush_interval" + "'", str12, "flush_interval");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(serverAddressList14);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = builder0.mongoAdminPassword;
        java.lang.String str3 = builder0.riverIndexName;
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript4 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder6.mongoAdminPassword("");
        java.lang.String[] strArray13 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        builder9.excludeFields = strSet14;
        java.lang.String str17 = builder9.indexName;
        docScoreSearchScript4.setNextVar("actions", (java.lang.Object) builder9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder22.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition26 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder25);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder25.mongoAdminPassword("");
        java.lang.String[] strArray32 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet33 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet33, strArray32);
        builder28.excludeFields = strSet33;
        builder22.setexcludeFields((java.util.Set<java.lang.String>) strSet33);
        docScoreSearchScript4.setNextVar("type", (java.lang.Object) strSet33);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder0.parentTypes((java.util.Set<java.lang.String>) strSet33);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition39 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder38);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp40 = mongoDBRiverDefinition39.initialTimestamp;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNull(wildcardTimestamp40);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder5.mongoAdminPassword("");
        java.lang.String[] strArray12 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        builder8.excludeFields = strSet13;
        builder2.setexcludeFields((java.util.Set<java.lang.String>) strSet13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder2.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder18);
        java.lang.String str20 = mongoDBRiverDefinition19.getSERVERS_FIELD();
        int int21 = mongoDBRiverDefinition19.getDEFAULT_DB_PORT();
        int int22 = mongoDBRiverDefinition19.getThrottleSize();
        java.lang.String str23 = mongoDBRiverDefinition19.getMongoDb();
        java.lang.String str24 = mongoDBRiverDefinition19.getFLUSH_INTERVAL_FIELD();
        java.lang.String str25 = mongoDBRiverDefinition19.getFILTER_FIELD();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "servers" + "'", str20, "servers");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 27017 + "'", int21 == 27017);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "flush_interval" + "'", str24, "flush_interval");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "filter" + "'", str25, "filter");
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings1 = serializedObjectSupporter0.deserializeObjectRiverSettings4();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString11();
        org.elasticsearch.river.RiverSettings riverSettings3 = serializedObjectSupporter0.deserializeObjectRiverSettings5();
        org.elasticsearch.river.RiverSettings riverSettings4 = serializedObjectSupporter0.deserializeObjectRiverSettings9();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        org.elasticsearch.river.RiverSettings riverSettings6 = serializedObjectSupporter0.deserializeObjectRiverSettings4();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString6();
        org.elasticsearch.river.RiverSettings riverSettings8 = serializedObjectSupporter0.deserializeObjectRiverSettings3();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString4();
        org.junit.Assert.assertNull(riverSettings1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mongodb-1638820218387" + "'", str2, "mongodb-1638820218387");
        org.junit.Assert.assertNull(riverSettings3);
        org.junit.Assert.assertNull(riverSettings4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "mongodb-1638820217755" + "'", str5, "mongodb-1638820217755");
        org.junit.Assert.assertNull(riverSettings6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_river" + "'", str7, "_river");
        org.junit.Assert.assertNull(riverSettings8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_river" + "'", str9, "_river");
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.typeName("mongodb-1638820218449");
        java.util.List<com.mongodb.ServerAddress> serverAddressList4 = builder3.mongoServers;
        int int5 = builder3.getconnectTimeout();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(serverAddressList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.script("disable_index_refresh");
        java.lang.String str5 = builder4.getmongoDb();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions7 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoClientOptions(mongoClientOptions7);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.script("disable_index_refresh");
        com.mongodb.BasicDBObject basicDBObject11 = builder10.mongoCollectionFilter;
        builder4.mongoCollectionFilter = basicDBObject11;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder4.riverName("db");
        java.lang.String str15 = builder4.getriverName();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(basicDBObject11);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "db" + "'", str15, "db");
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoAdminUser("disable_index_refresh");
        java.util.Set<java.lang.String> strSet5 = builder2.excludeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder2.scriptType("mongodb-1638820218387");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.mongoLocalPassword("_river");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.riverIndexName("mongodb-1638820218387");
        java.util.List<com.mongodb.ServerAddress> serverAddressList12 = builder11.getmongoServers();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder11.importAllCollections(false);
        builder14.setthrottleSize((int) (short) 100);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(serverAddressList12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean2 = mongoDBRiverDefinition1.storeStatistics;
        boolean boolean3 = mongoDBRiverDefinition1.isDisableIndexRefresh();
        java.lang.String str4 = mongoDBRiverDefinition1.mongoAdminUser;
        boolean boolean5 = mongoDBRiverDefinition1.isDisableIndexRefresh();
        java.lang.String str6 = mongoDBRiverDefinition1.getGRIDFS_FIELD();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "gridfs" + "'", str6, "gridfs");
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean2 = mongoDBRiverDefinition1.storeStatistics;
        java.lang.String str3 = mongoDBRiverDefinition1.getTypeName();
        java.lang.String str4 = mongoDBRiverDefinition1.getIndexName();
        java.lang.String str5 = mongoDBRiverDefinition1.getSCRIPT_TYPE_FIELD();
        boolean boolean6 = mongoDBRiverDefinition1.disableIndexRefresh;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "script_type" + "'", str5, "script_type");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoAdminUser("disable_index_refresh");
        java.lang.String str5 = builder2.script;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        java.util.List<com.mongodb.ServerAddress> serverAddressList3 = builder2.getmongoServers();
        java.lang.String str4 = builder2.typeName;
        builder2.script = "script_type";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder2.disableIndexRefresh(true);
        java.lang.Class<?> wildcardClass9 = builder2.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(serverAddressList3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.getDISABLE_INDEX_REFRESH_FIELD();
        java.util.List<com.mongodb.ServerAddress> serverAddressList4 = mongoDBRiverDefinition2.getMongoServers();
        java.lang.String str5 = mongoDBRiverDefinition2.indexName;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "disable_index_refresh" + "'", str3, "disable_index_refresh");
        org.junit.Assert.assertNotNull(serverAddressList4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean2 = mongoDBRiverDefinition1.storeStatistics;
        boolean boolean3 = mongoDBRiverDefinition1.isSkipInitialImport();
        java.lang.String str4 = mongoDBRiverDefinition1.getMongoCollection();
        boolean boolean5 = mongoDBRiverDefinition1.getadvancedTransformation();
        boolean boolean6 = mongoDBRiverDefinition1.getmongoGridFS();
        boolean boolean7 = mongoDBRiverDefinition1.mongoGridFS;
        java.lang.String str8 = mongoDBRiverDefinition1.getBULK_TIMEOUT_FIELD();
        java.lang.String str9 = mongoDBRiverDefinition1.getMongoLocalPassword();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "bulk_timeout" + "'", str8, "bulk_timeout");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean2 = mongoDBRiverDefinition1.storeStatistics;
        boolean boolean3 = mongoDBRiverDefinition1.isDisableIndexRefresh();
        boolean boolean4 = mongoDBRiverDefinition1.getmongoSecondaryReadPreference();
        boolean boolean5 = mongoDBRiverDefinition1.dropCollection;
        java.lang.String str6 = mongoDBRiverDefinition1.getINITIAL_TIMESTAMP_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition1.includeCollection;
        java.util.Set<java.lang.String> strSet8 = mongoDBRiverDefinition1.parentTypes;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "initial_timestamp" + "'", str6, "initial_timestamp");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(strSet8);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        com.mongodb.BasicDBObject basicDBObject3 = null;
        builder0.setmongoOplogFilter(basicDBObject3);
        builder0.setmongoCollection("name");
        java.lang.String str7 = builder0.getmongoAdminPassword();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str9 = builder8.gettypeName();
        builder8.setmongoDb("concurrent_bulk_requests");
        builder8.riverName = "throttle_size";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder8.socketTimeout((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder8.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder18);
        boolean boolean20 = mongoDBRiverDefinition19.storeStatistics;
        boolean boolean21 = mongoDBRiverDefinition19.isDisableIndexRefresh();
        java.lang.String str22 = mongoDBRiverDefinition19.getMongoLocalUser();
        java.util.Set<java.lang.String> strSet23 = mongoDBRiverDefinition19.getIncludeFields();
        java.lang.String str24 = mongoDBRiverDefinition19.getINITIAL_TIMESTAMP_SCRIPT_FIELD();
        java.lang.String str25 = mongoDBRiverDefinition19.includeCollection;
        java.lang.String str26 = mongoDBRiverDefinition19.getMongoAdminPassword();
        java.lang.String str27 = mongoDBRiverDefinition19.getDROP_COLLECTION_FIELD();
        java.lang.String str28 = mongoDBRiverDefinition19.mongoAdminPassword;
        java.lang.String str29 = mongoDBRiverDefinition19.getMongoCollection();
        com.mongodb.BasicDBObject basicDBObject30 = mongoDBRiverDefinition19.getMongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder17.mongoOplogFilter(basicDBObject30);
        builder0.setmongoOplogFilter(basicDBObject30);
        java.lang.String str33 = builder0.indexName;
        java.lang.String str34 = builder0.script;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition35 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        com.mongodb.MongoClientOptions mongoClientOptions36 = mongoDBRiverDefinition35.getMongoClientOptions();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(strSet23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "script" + "'", str24, "script");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "drop_collection" + "'", str27, "drop_collection");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(basicDBObject30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(mongoClientOptions36);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.socketTimeout((int) (byte) 1);
        com.mongodb.BasicDBObject basicDBObject7 = builder6.mongoOplogFilter;
        builder6.setstoreStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder10);
        builder10.setthrottleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder10.importAllCollections(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder17);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder17.typeName("mongodb-1638820218449");
        java.util.List<com.mongodb.ServerAddress> serverAddressList21 = builder20.mongoServers;
        builder16.setmongoServers(serverAddressList21);
        builder6.setmongoServers(serverAddressList21);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(basicDBObject7);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(serverAddressList21);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.script("disable_index_refresh");
        com.mongodb.BasicDBObject basicDBObject5 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoCollectionFilter(basicDBObject5);
        builder6.statisticsIndexName = "host";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder9);
        com.mongodb.BasicDBObject basicDBObject12 = null;
        builder9.setmongoOplogFilter(basicDBObject12);
        boolean boolean14 = builder9.importAllCollections;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder15);
        boolean boolean17 = mongoDBRiverDefinition16.storeStatistics;
        boolean boolean18 = mongoDBRiverDefinition16.isDisableIndexRefresh();
        java.lang.String str19 = mongoDBRiverDefinition16.getMongoLocalUser();
        java.util.Set<java.lang.String> strSet20 = mongoDBRiverDefinition16.getIncludeFields();
        java.lang.String str21 = mongoDBRiverDefinition16.getINITIAL_TIMESTAMP_SCRIPT_FIELD();
        java.lang.String str22 = mongoDBRiverDefinition16.includeCollection;
        java.lang.String str23 = mongoDBRiverDefinition16.getMongoAdminPassword();
        java.lang.String str24 = mongoDBRiverDefinition16.getDROP_COLLECTION_FIELD();
        java.lang.String str25 = mongoDBRiverDefinition16.mongoAdminPassword;
        java.lang.String str26 = mongoDBRiverDefinition16.getMongoCollection();
        com.mongodb.BasicDBObject basicDBObject27 = mongoDBRiverDefinition16.getMongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder9.mongoOplogFilter(basicDBObject27);
        builder6.mongoOplogFilter = basicDBObject27;
        java.lang.String str30 = builder6.mongoCollection;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(strSet20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "script" + "'", str21, "script");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "drop_collection" + "'", str24, "drop_collection");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(basicDBObject27);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        com.mongodb.BasicDBObject basicDBObject3 = null;
        builder0.setmongoOplogFilter(basicDBObject3);
        boolean boolean5 = builder0.importAllCollections;
        builder0.setmongoGridFS(false);
        int int8 = builder0.throttleSize;
        java.lang.String str9 = builder0.getscript();
        builder0.setadvancedTransformation(false);
        org.bson.types.BSONTimestamp bSONTimestamp12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder0.initialTimestamp(bSONTimestamp12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ts must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder5.mongoAdminPassword("");
        java.lang.String[] strArray12 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        builder8.excludeFields = strSet13;
        builder2.setexcludeFields((java.util.Set<java.lang.String>) strSet13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder2.mongoUseSSL(false);
        java.lang.String str19 = builder18.getindexName();
        boolean boolean20 = builder18.getadvancedTransformation();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder18);
        java.lang.String str22 = mongoDBRiverDefinition21.getStatisticsIndexName();
        java.lang.String str23 = mongoDBRiverDefinition21.getSECONDARY_READ_PREFERENCE_FIELD();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "secondary_read_preference" + "'", str23, "secondary_read_preference");
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.typeName("mongodb-1638820218449");
        java.util.List<com.mongodb.ServerAddress> serverAddressList4 = builder3.mongoServers;
        builder3.script = "skip_initial_import";
        int int7 = builder3.getthrottleSize();
        java.lang.String str8 = builder3.getmongoDb();
        builder3.includeCollection = "ssl";
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(serverAddressList4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("servers", "connect_timeout");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?connect_timeout?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.gettypeName();
        builder0.setmongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str5 = mongoDBRiverDefinition4.getACTIONS_FIELD();
        boolean boolean6 = mongoDBRiverDefinition4.storeStatistics;
        java.lang.String str7 = mongoDBRiverDefinition4.getMongoAdminPassword();
        boolean boolean8 = mongoDBRiverDefinition4.isMongoSSLVerifyCertificate();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "actions" + "'", str5, "actions");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean2 = mongoDBRiverDefinition1.storeStatistics;
        boolean boolean3 = mongoDBRiverDefinition1.isDisableIndexRefresh();
        java.lang.String str4 = mongoDBRiverDefinition1.getMongoLocalUser();
        java.util.Set<java.lang.String> strSet5 = mongoDBRiverDefinition1.getIncludeFields();
        java.lang.String str6 = mongoDBRiverDefinition1.getINITIAL_TIMESTAMP_SCRIPT_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition1.includeCollection;
        java.lang.String str8 = mongoDBRiverDefinition1.getMongoAdminPassword();
        java.lang.String str9 = mongoDBRiverDefinition1.getSECONDARY_READ_PREFERENCE_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition1.getTHROTTLE_SIZE_FIELD();
        java.lang.String str11 = mongoDBRiverDefinition1.includeCollection;
        java.lang.String str12 = mongoDBRiverDefinition1.getCREDENTIALS_FIELD();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "script" + "'", str6, "script");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "secondary_read_preference" + "'", str9, "secondary_read_preference");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "throttle_size" + "'", str10, "throttle_size");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "credentials" + "'", str12, "credentials");
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.getDISABLE_INDEX_REFRESH_FIELD();
        java.lang.String str4 = mongoDBRiverDefinition2.getRiverName();
        java.lang.String str5 = mongoDBRiverDefinition2.mongoAdminPassword;
        java.lang.String str6 = mongoDBRiverDefinition2.getOPTIONS_FIELD();
        boolean boolean7 = mongoDBRiverDefinition2.isAdvancedTransformation();
        java.lang.String str8 = mongoDBRiverDefinition2.getCREDENTIALS_FIELD();
        boolean boolean9 = mongoDBRiverDefinition2.getmongoSSLVerifyCertificate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "disable_index_refresh" + "'", str3, "disable_index_refresh");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "options" + "'", str6, "options");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "credentials" + "'", str8, "credentials");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setthrottleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.importAllCollections(true);
        java.lang.String str7 = builder6.gettypeName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder6.statisticsIndexName("_river");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder9);
        java.lang.String str11 = mongoDBRiverDefinition10.getSIZE_FIELD();
        java.lang.String str12 = mongoDBRiverDefinition10.typeName;
        java.lang.String str13 = mongoDBRiverDefinition10.getMongoAdminUser();
        java.lang.String str14 = mongoDBRiverDefinition10.getSCRIPT_FIELD();
        boolean boolean15 = mongoDBRiverDefinition10.isMongoGridFS();
        boolean boolean16 = mongoDBRiverDefinition10.getadvancedTransformation();
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "size" + "'", str11, "size");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "script" + "'", str14, "script");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder5.mongoAdminPassword("");
        java.lang.String[] strArray12 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        builder8.excludeFields = strSet13;
        builder2.setexcludeFields((java.util.Set<java.lang.String>) strSet13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder2.mongoUseSSL(false);
        java.lang.String str19 = builder18.getindexName();
        boolean boolean20 = builder18.getadvancedTransformation();
        builder18.setmongoLocalUser("mongodb-1638820217755");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder18.disableIndexRefresh(false);
        java.lang.String str25 = builder18.scriptType;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("script");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?script?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        com.mongodb.BasicDBObject basicDBObject3 = null;
        builder0.setmongoOplogFilter(basicDBObject3);
        boolean boolean5 = builder0.importAllCollections;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str7 = mongoDBRiverDefinition6.mongoDb;
        boolean boolean8 = mongoDBRiverDefinition6.isImportAllCollections();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        int int3 = builder0.getsocketTimeout();
        java.lang.String str4 = builder0.getindexName();
        builder0.setdropCollection(false);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder5.mongoAdminPassword("");
        java.lang.String[] strArray12 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        builder8.excludeFields = strSet13;
        builder2.setexcludeFields((java.util.Set<java.lang.String>) strSet13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder2.mongoUseSSL(false);
        java.lang.String str19 = builder18.getindexName();
        boolean boolean20 = builder18.getadvancedTransformation();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder18);
        java.lang.String str22 = mongoDBRiverDefinition21.indexName;
        java.lang.String str23 = mongoDBRiverDefinition21.getDEFAULT_DB_HOST();
        boolean boolean24 = mongoDBRiverDefinition21.mongoSecondaryReadPreference;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "localhost" + "'", str23, "localhost");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder5.mongoAdminPassword("");
        java.lang.String[] strArray12 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        builder8.excludeFields = strSet13;
        builder2.setexcludeFields((java.util.Set<java.lang.String>) strSet13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder2.mongoSecondaryReadPreference(false);
        boolean boolean19 = builder18.mongoUseSSL;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder18);
        java.lang.String str21 = builder18.getstatisticsIndexName();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("concurrent_bulk_requests", "store_statistics");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?store_statistics?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean2 = mongoDBRiverDefinition1.storeStatistics;
        boolean boolean3 = mongoDBRiverDefinition1.isDisableIndexRefresh();
        com.mongodb.BasicDBObject basicDBObject4 = mongoDBRiverDefinition1.getMongoOplogFilter();
        java.lang.String str5 = mongoDBRiverDefinition1.getGRIDFS_FIELD();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(basicDBObject4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "gridfs" + "'", str5, "gridfs");
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings1 = serializedObjectSupporter0.deserializeObjectRiverSettings4();
        org.elasticsearch.river.RiverSettings riverSettings2 = serializedObjectSupporter0.deserializeObjectRiverSettings9();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString16();
        org.junit.Assert.assertNull(riverSettings1);
        org.junit.Assert.assertNull(riverSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_river" + "'", str3, "_river");
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("store_statistics", "concurrent_requests", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?concurrent_requests?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings1 = serializedObjectSupporter0.deserializeObjectRiverSettings4();
        org.elasticsearch.river.RiverSettings riverSettings2 = serializedObjectSupporter0.deserializeObjectRiverSettings8();
        org.junit.Assert.assertNull(riverSettings1);
        org.junit.Assert.assertNull(riverSettings2);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings1 = serializedObjectSupporter0.deserializeObjectRiverSettings4();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString11();
        org.elasticsearch.river.RiverSettings riverSettings3 = serializedObjectSupporter0.deserializeObjectRiverSettings5();
        org.elasticsearch.river.RiverSettings riverSettings4 = serializedObjectSupporter0.deserializeObjectRiverSettings9();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString11();
        org.elasticsearch.river.RiverSettings riverSettings6 = serializedObjectSupporter0.deserializeObjectRiverSettings4();
        org.junit.Assert.assertNull(riverSettings1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mongodb-1638820218387" + "'", str2, "mongodb-1638820218387");
        org.junit.Assert.assertNull(riverSettings3);
        org.junit.Assert.assertNull(riverSettings4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "mongodb-1638820218387" + "'", str5, "mongodb-1638820218387");
        org.junit.Assert.assertNull(riverSettings6);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder5.mongoAdminPassword("");
        java.lang.String[] strArray12 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        builder8.excludeFields = strSet13;
        builder2.setexcludeFields((java.util.Set<java.lang.String>) strSet13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder2.mongoUseSSL(false);
        java.lang.String str19 = builder18.getindexName();
        boolean boolean20 = builder18.getadvancedTransformation();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder18);
        java.lang.String str22 = mongoDBRiverDefinition21.getStatisticsIndexName();
        boolean boolean23 = mongoDBRiverDefinition21.isDisableIndexRefresh();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.mongoAdminPassword("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder9.mongoAdminPassword("");
        java.lang.String[] strArray16 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        builder12.excludeFields = strSet17;
        builder6.setexcludeFields((java.util.Set<java.lang.String>) strSet17);
        builder3.parentTypes = strSet17;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions23 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder22.mongoClientOptions(mongoClientOptions23);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder24.script("disable_index_refresh");
        com.mongodb.BasicDBObject basicDBObject27 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.mongoCollectionFilter(basicDBObject27);
        builder28.statisticsIndexName = "host";
        builder28.setmongoAdminUser("skip_initial_import");
        builder28.setdropCollection(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions36 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder35.mongoClientOptions(mongoClientOptions36);
        builder37.setsocketTimeout((int) '4');
        builder37.setscript("flush_interval");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter42 = builder37.serializedObjectSupporter;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str44 = builder43.gettypeName();
        builder43.setmongoDb("concurrent_bulk_requests");
        builder43.riverName = "throttle_size";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder43.socketTimeout((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder43.mongoAdminUser("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition53 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder52);
        com.mongodb.ServerAddress[] serverAddressArray54 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList55 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList55, serverAddressArray54);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder52.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList55);
        builder37.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList55);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = builder28.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList55);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder3.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList55);
        builder3.mongoLocalUser = "_river";
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNull(serializedObjectSupporter42);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(serverAddressArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder60);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
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
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings1 = serializedObjectSupporter0.deserializeObjectRiverSettings4();
        org.elasticsearch.river.RiverSettings riverSettings2 = serializedObjectSupporter0.deserializeObjectRiverSettings1();
        org.elasticsearch.river.RiverSettings riverSettings3 = serializedObjectSupporter0.deserializeObjectRiverSettings7();
        org.elasticsearch.river.RiverSettings riverSettings4 = serializedObjectSupporter0.deserializeObjectRiverSettings2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString16();
        org.elasticsearch.river.RiverSettings riverSettings6 = serializedObjectSupporter0.deserializeObjectRiverSettings6();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(riverSettings1);
        org.junit.Assert.assertNull(riverSettings2);
        org.junit.Assert.assertNull(riverSettings3);
        org.junit.Assert.assertNull(riverSettings4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_river" + "'", str5, "_river");
        org.junit.Assert.assertNull(riverSettings6);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean2 = mongoDBRiverDefinition1.storeStatistics;
        boolean boolean3 = mongoDBRiverDefinition1.isDisableIndexRefresh();
        java.lang.String str4 = mongoDBRiverDefinition1.getMongoLocalUser();
        java.util.Set<java.lang.String> strSet5 = mongoDBRiverDefinition1.getIncludeFields();
        java.lang.String str6 = mongoDBRiverDefinition1.getINITIAL_TIMESTAMP_SCRIPT_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition1.includeCollection;
        java.lang.String str8 = mongoDBRiverDefinition1.getADVANCED_TRANSFORMATION_FIELD();
        java.util.Set<java.lang.String> strSet9 = mongoDBRiverDefinition1.excludeFields;
        java.lang.String str10 = mongoDBRiverDefinition1.indexName;
        java.lang.String str11 = mongoDBRiverDefinition1.getDISABLE_INDEX_REFRESH_FIELD();
        java.lang.String str12 = mongoDBRiverDefinition1.riverIndexName;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "script" + "'", str6, "script");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "advanced_transformation" + "'", str8, "advanced_transformation");
        org.junit.Assert.assertNull(strSet9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "disable_index_refresh" + "'", str11, "disable_index_refresh");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.script("disable_index_refresh");
        com.mongodb.BasicDBObject basicDBObject5 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoCollectionFilter(basicDBObject5);
        builder4.setstoreStatistics(false);
        builder4.riverName = "secondary_read_preference";
        builder4.throttleSize = (short) 100;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder4.mongoCollection("user");
        builder14.throttleSize = (byte) 100;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setthrottleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder5.mongoAdminPassword("");
        java.lang.String[] strArray12 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        builder8.excludeFields = strSet13;
        com.mongodb.BasicDBObject basicDBObject16 = builder8.mongoCollectionFilter;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder0.mongoOplogFilter(basicDBObject16);
        int int18 = builder0.getthrottleSize();
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(basicDBObject16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setthrottleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.importAllCollections(true);
        java.lang.String str7 = builder6.gettypeName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder6.statisticsIndexName("_river");
        builder9.mongoDb = "port";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder9.mongoAdminPassword("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder13.statisticsTypeName("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder13);
        java.lang.String str17 = mongoDBRiverDefinition16.getTHROTTLE_SIZE_FIELD();
        boolean boolean18 = mongoDBRiverDefinition16.mongoGridFS;
        java.lang.String str19 = mongoDBRiverDefinition16.statisticsTypeName;
        java.lang.String str20 = mongoDBRiverDefinition16.getGRIDFS_FIELD();
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "throttle_size" + "'", str17, "throttle_size");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "connect_timeout" + "'", str19, "connect_timeout");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "gridfs" + "'", str20, "gridfs");
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean2 = mongoDBRiverDefinition1.storeStatistics;
        boolean boolean3 = mongoDBRiverDefinition1.isSkipInitialImport();
        java.lang.String str4 = mongoDBRiverDefinition1.getMongoCollection();
        java.lang.String str5 = mongoDBRiverDefinition1.getGRIDFS_FIELD();
        java.lang.String str6 = mongoDBRiverDefinition1.riverIndexName;
        java.lang.String str7 = mongoDBRiverDefinition1.getSCRIPT_TYPE_FIELD();
        java.lang.String str8 = mongoDBRiverDefinition1.getCONNECTION_TIMEOUT();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "gridfs" + "'", str5, "gridfs");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "script_type" + "'", str7, "script_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "connect_timeout" + "'", str8, "connect_timeout");
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.typeName("mongodb-1638820218449");
        java.lang.String str4 = builder0.mongoDb;
        boolean boolean5 = builder0.skipInitialImport;
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("localhost", "mongodb-1638820218264");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?mongodb-1638820218264?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        com.mongodb.BasicDBObject basicDBObject3 = null;
        builder0.setmongoOplogFilter(basicDBObject3);
        boolean boolean5 = builder0.importAllCollections;
        builder0.setmongoGridFS(false);
        java.lang.String str8 = builder0.statisticsTypeName;
        java.util.Set<java.lang.String> strSet9 = builder0.getexcludeFields();
        java.lang.String str10 = builder0.mongoLocalUser;
        builder0.setstatisticsIndexName("throttle_size");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.script("disable_index_refresh");
        java.util.List<com.mongodb.ServerAddress> serverAddressList5 = builder2.getmongoServers();
        builder2.setthrottleSize((int) (byte) 10);
        java.util.Set<java.lang.String> strSet8 = builder2.parentTypes;
        builder2.storeStatistics = false;
        builder2.mongoSSLVerifyCertificate = true;
        boolean boolean13 = builder2.advancedTransformation;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(serverAddressList5);
        org.junit.Assert.assertNull(strSet8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean2 = mongoDBRiverDefinition1.storeStatistics;
        boolean boolean3 = mongoDBRiverDefinition1.isDisableIndexRefresh();
        java.lang.String str4 = mongoDBRiverDefinition1.getADMIN_DB_FIELD();
        java.lang.String str5 = mongoDBRiverDefinition1.getBULK_SIZE_FIELD();
        java.lang.String str6 = mongoDBRiverDefinition1.getACTIONS_FIELD();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "bulk_size" + "'", str5, "bulk_size");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "actions" + "'", str6, "actions");
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder2);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoAdminPassword("");
        java.lang.String[] strArray9 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        builder5.excludeFields = strSet10;
        java.lang.String str13 = builder5.indexName;
        docScoreSearchScript0.setNextVar("actions", (java.lang.Object) builder5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder21);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder21.mongoAdminPassword("");
        java.lang.String[] strArray28 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet29 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet29, strArray28);
        builder24.excludeFields = strSet29;
        builder18.setexcludeFields((java.util.Set<java.lang.String>) strSet29);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) strSet29);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions35 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.mongoClientOptions(mongoClientOptions35);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder36.script("disable_index_refresh");
        java.lang.String str39 = builder38.getmongoDb();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions41 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder40.mongoClientOptions(mongoClientOptions41);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder42.script("disable_index_refresh");
        com.mongodb.BasicDBObject basicDBObject45 = builder44.mongoCollectionFilter;
        builder38.mongoCollectionFilter = basicDBObject45;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition47 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder38);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str49 = builder48.gettypeName();
        builder48.setmongoDb("concurrent_bulk_requests");
        builder48.riverName = "throttle_size";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder48.socketTimeout((int) (byte) 0);
        java.util.Set<java.lang.String> strSet56 = builder55.getparentTypes();
        java.lang.String str57 = builder55.getindexName();
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory58 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition60 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder59);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition61 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder59);
        java.lang.String str62 = mongoDBRiverDefinition61.getDISABLE_INDEX_REFRESH_FIELD();
        java.lang.String str63 = mongoDBRiverDefinition61.getRiverName();
        java.util.List<com.mongodb.ServerAddress> serverAddressList64 = mongoDBRiverDefinition61.getMongoServers();
        boolean boolean65 = mongoDBRiverDefinition61.advancedTransformation;
        com.mongodb.BasicDBObject basicDBObject66 = mongoDBRiverDefinition61.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript67 = docScoreNativeScriptFactory58.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject66);
        builder55.mongoCollectionFilter = basicDBObject66;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder69 = builder38.mongoOplogFilter(basicDBObject66);
        builder38.setdisableIndexRefresh(true);
        java.lang.String str72 = builder38.indexName;
        builder38.dropCollection = true;
        java.lang.Object obj75 = docScoreSearchScript0.unwrap((java.lang.Object) builder38);
        org.apache.lucene.search.Scorer scorer76 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setScorer(scorer76);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(basicDBObject45);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNull(strSet56);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "disable_index_refresh" + "'", str62, "disable_index_refresh");
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNotNull(serverAddressList64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(basicDBObject66);
        org.junit.Assert.assertNotNull(executableScript67);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNull(str72);
        org.junit.Assert.assertNotNull(obj75);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        com.mongodb.BasicDBObject basicDBObject3 = null;
        builder0.setmongoOplogFilter(basicDBObject3);
        boolean boolean5 = builder0.importAllCollections;
        java.lang.String[] strArray19 = new java.lang.String[] { "concurrent_bulk_requests", "host", "hi!", "bulk_size", "drop_collection", "mongodb-1638820218387", "servers", "host", "disable_index_refresh", "mongodb-1638820218387", "", "bulk_size", "mongodb-1638820218387" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        builder0.parentTypes = strSet20;
        builder0.setconnectTimeout((int) '#');
        com.mongodb.BasicDBObject basicDBObject25 = builder0.getmongoOplogFilter();
        builder0.mongoSecondaryReadPreference = true;
        org.bson.types.Binary binary28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder0.initialTimestamp(binary28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(basicDBObject25);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean2 = mongoDBRiverDefinition1.storeStatistics;
        boolean boolean3 = mongoDBRiverDefinition1.isDisableIndexRefresh();
        java.lang.String str4 = mongoDBRiverDefinition1.getMongoLocalUser();
        boolean boolean5 = mongoDBRiverDefinition1.getmongoSecondaryReadPreference();
        java.lang.String str6 = mongoDBRiverDefinition1.getSCRIPT_TYPE_FIELD();
        boolean boolean7 = mongoDBRiverDefinition1.importAllCollections;
        boolean boolean8 = mongoDBRiverDefinition1.getdisableIndexRefresh();
        int int9 = mongoDBRiverDefinition1.getThrottleSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "script_type" + "'", str6, "script_type");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder2.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder2.mongoAdminUser("mongodb-1638820218408");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder2.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoUseSSL(true);
        builder12.mongoUseSSL = true;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        com.mongodb.BasicDBObject basicDBObject3 = null;
        builder0.setmongoOplogFilter(basicDBObject3);
        boolean boolean5 = builder0.importAllCollections;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        int int7 = mongoDBRiverDefinition6.throttleSize;
        java.lang.Class<?> wildcardClass8 = mongoDBRiverDefinition6.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        com.mongodb.BasicDBObject basicDBObject3 = null;
        builder0.setmongoOplogFilter(basicDBObject3);
        boolean boolean5 = builder0.importAllCollections;
        java.lang.String[] strArray19 = new java.lang.String[] { "concurrent_bulk_requests", "host", "hi!", "bulk_size", "drop_collection", "mongodb-1638820218387", "servers", "host", "disable_index_refresh", "mongodb-1638820218387", "", "bulk_size", "mongodb-1638820218387" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        builder0.parentTypes = strSet20;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder25.mongoAdminUser("disable_index_refresh");
        java.util.Set<java.lang.String> strSet28 = builder25.excludeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder25.scriptType("mongodb-1638820218387");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder30.mongoLocalPassword("_river");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder30.riverIndexName("mongodb-1638820218387");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition36 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder35);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition37 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder35);
        builder35.setthrottleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition41 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder40);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder40.mongoAdminPassword("");
        java.lang.String[] strArray47 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet48 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet48, strArray47);
        builder43.excludeFields = strSet48;
        com.mongodb.BasicDBObject basicDBObject51 = builder43.mongoCollectionFilter;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder35.mongoOplogFilter(basicDBObject51);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder34.mongoCollectionFilter(basicDBObject51);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder0.mongoOplogFilter(basicDBObject51);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder54.throttleSize((int) 'a');
        org.bson.types.BSONTimestamp bSONTimestamp57 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = builder54.initialTimestamp(bSONTimestamp57);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ts must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNull(strSet28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(basicDBObject51);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder56);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder2);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.mongoAdminPassword("");
        java.lang.String[] strArray9 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        builder5.excludeFields = strSet10;
        java.lang.String str13 = builder5.indexName;
        docScoreSearchScript0.setNextVar("actions", (java.lang.Object) builder5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder21);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder21.mongoAdminPassword("");
        java.lang.String[] strArray28 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet29 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet29, strArray28);
        builder24.excludeFields = strSet29;
        builder18.setexcludeFields((java.util.Set<java.lang.String>) strSet29);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) strSet29);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions35 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.mongoClientOptions(mongoClientOptions35);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder36.script("disable_index_refresh");
        java.lang.String str39 = builder38.getmongoDb();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions41 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder40.mongoClientOptions(mongoClientOptions41);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder42.script("disable_index_refresh");
        com.mongodb.BasicDBObject basicDBObject45 = builder44.mongoCollectionFilter;
        builder38.mongoCollectionFilter = basicDBObject45;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition47 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder38);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str49 = builder48.gettypeName();
        builder48.setmongoDb("concurrent_bulk_requests");
        builder48.riverName = "throttle_size";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder48.socketTimeout((int) (byte) 0);
        java.util.Set<java.lang.String> strSet56 = builder55.getparentTypes();
        java.lang.String str57 = builder55.getindexName();
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory58 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition60 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder59);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition61 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder59);
        java.lang.String str62 = mongoDBRiverDefinition61.getDISABLE_INDEX_REFRESH_FIELD();
        java.lang.String str63 = mongoDBRiverDefinition61.getRiverName();
        java.util.List<com.mongodb.ServerAddress> serverAddressList64 = mongoDBRiverDefinition61.getMongoServers();
        boolean boolean65 = mongoDBRiverDefinition61.advancedTransformation;
        com.mongodb.BasicDBObject basicDBObject66 = mongoDBRiverDefinition61.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript67 = docScoreNativeScriptFactory58.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject66);
        builder55.mongoCollectionFilter = basicDBObject66;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder69 = builder38.mongoOplogFilter(basicDBObject66);
        builder38.setdisableIndexRefresh(true);
        java.lang.String str72 = builder38.indexName;
        builder38.dropCollection = true;
        java.lang.Object obj75 = docScoreSearchScript0.unwrap((java.lang.Object) builder38);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder76 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition77 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder76);
        boolean boolean78 = mongoDBRiverDefinition77.storeStatistics;
        boolean boolean79 = mongoDBRiverDefinition77.isDisableIndexRefresh();
        java.lang.String str80 = mongoDBRiverDefinition77.getMongoLocalUser();
        java.util.Set<java.lang.String> strSet81 = mongoDBRiverDefinition77.getIncludeFields();
        java.lang.String str82 = mongoDBRiverDefinition77.getINITIAL_TIMESTAMP_SCRIPT_FIELD();
        java.lang.String str83 = mongoDBRiverDefinition77.includeCollection;
        java.lang.String str84 = mongoDBRiverDefinition77.getMongoAdminPassword();
        java.lang.String str85 = mongoDBRiverDefinition77.getSECONDARY_READ_PREFERENCE_FIELD();
        int int86 = mongoDBRiverDefinition77.socketTimeout;
        boolean boolean87 = mongoDBRiverDefinition77.disableIndexRefresh;
        boolean boolean88 = mongoDBRiverDefinition77.getimportAllCollections();
        boolean boolean89 = mongoDBRiverDefinition77.getmongoUseSSL();
        com.mongodb.BasicDBObject basicDBObject90 = mongoDBRiverDefinition77.mongoCollectionFilter;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject90);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(basicDBObject45);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNull(strSet56);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "disable_index_refresh" + "'", str62, "disable_index_refresh");
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNotNull(serverAddressList64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(basicDBObject66);
        org.junit.Assert.assertNotNull(executableScript67);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNull(str72);
        org.junit.Assert.assertNotNull(obj75);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertNull(strSet81);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "script" + "'", str82, "script");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "secondary_read_preference" + "'", str85, "secondary_read_preference");
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(basicDBObject90);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.typeName("mongodb-1638820218449");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.importAllCollections(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.riverName("parent_types");
        boolean boolean8 = builder0.importAllCollections;
        builder0.throttleSize = 1;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder11);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder11.mongoAdminPassword("");
        java.lang.String[] strArray18 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        builder14.excludeFields = strSet19;
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp22 = builder14.initialTimestamp;
        boolean boolean23 = builder14.advancedTransformation;
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter24 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings25 = serializedObjectSupporter24.deserializeObjectRiverSettings4();
        java.lang.String str26 = serializedObjectSupporter24.deserializeObjectString16();
        builder14.serializedObjectSupporter = serializedObjectSupporter24;
        org.elasticsearch.river.RiverSettings riverSettings28 = serializedObjectSupporter24.deserializeObjectRiverSettings4();
        builder0.serializedObjectSupporter = serializedObjectSupporter24;
        com.mongodb.MongoClientOptions mongoClientOptions30 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder0.mongoClientOptions(mongoClientOptions30);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions33 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder32.mongoClientOptions(mongoClientOptions33);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.script("disable_index_refresh");
        com.mongodb.BasicDBObject basicDBObject37 = builder36.mongoCollectionFilter;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder31.mongoOplogFilter(basicDBObject37);
        builder31.importAllCollections = false;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder31.includeCollection("concurrent_requests");
        builder31.setmongoAdminPassword("localhost");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(wildcardTimestamp22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(riverSettings25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "_river" + "'", str26, "_river");
        org.junit.Assert.assertNull(riverSettings28);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(basicDBObject37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder42);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder5.mongoAdminPassword("");
        java.lang.String[] strArray12 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        builder8.excludeFields = strSet13;
        builder2.setexcludeFields((java.util.Set<java.lang.String>) strSet13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder2.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder18);
        java.lang.String str20 = mongoDBRiverDefinition19.getADMIN_DB_FIELD();
        java.lang.String str21 = mongoDBRiverDefinition19.getDEFAULT_DB_HOST();
        java.lang.String str22 = mongoDBRiverDefinition19.getDB_FIELD();
        java.lang.String str23 = mongoDBRiverDefinition19.getSKIP_INITIAL_IMPORT_FIELD();
        java.lang.String str24 = mongoDBRiverDefinition19.getTHROTTLE_SIZE_FIELD();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "admin" + "'", str20, "admin");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "localhost" + "'", str21, "localhost");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "db" + "'", str22, "db");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "skip_initial_import" + "'", str23, "skip_initial_import");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "throttle_size" + "'", str24, "throttle_size");
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        int int3 = builder0.getsocketTimeout();
        int int4 = builder0.connectTimeout;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.riverName("credentials");
        int int7 = builder0.getthrottleSize();
        builder0.setmongoDb("mongodb-1638820218408");
        java.lang.String str10 = builder0.getscript();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean2 = mongoDBRiverDefinition1.storeStatistics;
        boolean boolean3 = mongoDBRiverDefinition1.isSkipInitialImport();
        java.lang.String str4 = mongoDBRiverDefinition1.getMongoCollection();
        boolean boolean5 = mongoDBRiverDefinition1.getadvancedTransformation();
        java.lang.String str6 = mongoDBRiverDefinition1.getMongoAdminPassword();
        java.lang.String str7 = mongoDBRiverDefinition1.getSECONDARY_READ_PREFERENCE_FIELD();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "secondary_read_preference" + "'", str7, "secondary_read_preference");
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter5 = builder2.serializedObjectSupporter;
        builder2.statisticsTypeName = "throttle_size";
        int int8 = builder2.getsocketTimeout();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNull(serializedObjectSupporter5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings1 = serializedObjectSupporter0.deserializeObjectRiverSettings4();
        org.elasticsearch.river.RiverSettings riverSettings2 = serializedObjectSupporter0.deserializeObjectRiverSettings1();
        org.elasticsearch.river.RiverSettings riverSettings3 = serializedObjectSupporter0.deserializeObjectRiverSettings7();
        org.elasticsearch.river.RiverSettings riverSettings4 = serializedObjectSupporter0.deserializeObjectRiverSettings5();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        org.elasticsearch.river.RiverSettings riverSettings6 = serializedObjectSupporter0.deserializeObjectRiverSettings5();
        org.elasticsearch.river.RiverSettings riverSettings7 = serializedObjectSupporter0.deserializeObjectRiverSettings9();
        org.elasticsearch.river.RiverSettings riverSettings8 = serializedObjectSupporter0.deserializeObjectRiverSettings3();
        org.junit.Assert.assertNull(riverSettings1);
        org.junit.Assert.assertNull(riverSettings2);
        org.junit.Assert.assertNull(riverSettings3);
        org.junit.Assert.assertNull(riverSettings4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "mongodb-1638820217755" + "'", str5, "mongodb-1638820217755");
        org.junit.Assert.assertNull(riverSettings6);
        org.junit.Assert.assertNull(riverSettings7);
        org.junit.Assert.assertNull(riverSettings8);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("size", "concurrent_bulk_requests");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?concurrent_bulk_requests?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        com.mongodb.BasicDBObject basicDBObject3 = null;
        builder0.setmongoOplogFilter(basicDBObject3);
        boolean boolean5 = builder0.importAllCollections;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder6);
        boolean boolean8 = mongoDBRiverDefinition7.storeStatistics;
        boolean boolean9 = mongoDBRiverDefinition7.isDisableIndexRefresh();
        java.lang.String str10 = mongoDBRiverDefinition7.getMongoLocalUser();
        java.util.Set<java.lang.String> strSet11 = mongoDBRiverDefinition7.getIncludeFields();
        java.lang.String str12 = mongoDBRiverDefinition7.getINITIAL_TIMESTAMP_SCRIPT_FIELD();
        java.lang.String str13 = mongoDBRiverDefinition7.includeCollection;
        java.lang.String str14 = mongoDBRiverDefinition7.getMongoAdminPassword();
        java.lang.String str15 = mongoDBRiverDefinition7.getDROP_COLLECTION_FIELD();
        java.lang.String str16 = mongoDBRiverDefinition7.mongoAdminPassword;
        java.lang.String str17 = mongoDBRiverDefinition7.getMongoCollection();
        com.mongodb.BasicDBObject basicDBObject18 = mongoDBRiverDefinition7.getMongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder0.mongoOplogFilter(basicDBObject18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str21 = mongoDBRiverDefinition20.getMongoAdminPassword();
        java.lang.String str22 = mongoDBRiverDefinition20.getDEFAULT_DB_HOST();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(strSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "script" + "'", str12, "script");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "drop_collection" + "'", str15, "drop_collection");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(basicDBObject18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "localhost" + "'", str22, "localhost");
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("localhost", "mongodb-1638820218387");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?mongodb-1638820218387?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings1 = serializedObjectSupporter0.deserializeObjectRiverSettings4();
        org.elasticsearch.river.RiverSettings riverSettings2 = serializedObjectSupporter0.deserializeObjectRiverSettings1();
        org.elasticsearch.river.RiverSettings riverSettings3 = serializedObjectSupporter0.deserializeObjectRiverSettings7();
        org.elasticsearch.river.RiverSettings riverSettings4 = serializedObjectSupporter0.deserializeObjectRiverSettings3();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString6();
        org.junit.Assert.assertNull(riverSettings1);
        org.junit.Assert.assertNull(riverSettings2);
        org.junit.Assert.assertNull(riverSettings3);
        org.junit.Assert.assertNull(riverSettings4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "mongodb-1638820218299" + "'", str5, "mongodb-1638820218299");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_river" + "'", str6, "_river");
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder5.mongoAdminPassword("");
        java.lang.String[] strArray12 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        builder8.excludeFields = strSet13;
        builder2.setexcludeFields((java.util.Set<java.lang.String>) strSet13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder2.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder18);
        builder18.mongoSecondaryReadPreference = true;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setthrottleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.importAllCollections(true);
        java.lang.String str7 = builder6.gettypeName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder6.statisticsIndexName("_river");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder9);
        java.lang.String str11 = mongoDBRiverDefinition10.getSIZE_FIELD();
        java.lang.String str12 = mongoDBRiverDefinition10.getMongoOplogNamespace();
        java.lang.String str13 = mongoDBRiverDefinition10.getINITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD();
        java.lang.String str14 = mongoDBRiverDefinition10.getINCLUDE_COLLECTION_FIELD();
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "size" + "'", str11, "size");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "null.null" + "'", str12, "null.null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "script_type" + "'", str13, "script_type");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "include_collection" + "'", str14, "include_collection");
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean2 = mongoDBRiverDefinition1.storeStatistics;
        boolean boolean3 = mongoDBRiverDefinition1.isDisableIndexRefresh();
        java.lang.String str4 = mongoDBRiverDefinition1.getADMIN_DB_FIELD();
        java.util.Set<java.lang.String> strSet5 = mongoDBRiverDefinition1.getIncludeFields();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertNull(strSet5);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean2 = mongoDBRiverDefinition1.storeStatistics;
        boolean boolean3 = mongoDBRiverDefinition1.isDisableIndexRefresh();
        java.lang.String str4 = mongoDBRiverDefinition1.getMongoLocalUser();
        java.util.Set<java.lang.String> strSet5 = mongoDBRiverDefinition1.getIncludeFields();
        java.lang.String str6 = mongoDBRiverDefinition1.getINITIAL_TIMESTAMP_SCRIPT_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition1.includeCollection;
        java.lang.String str8 = mongoDBRiverDefinition1.getMongoAdminPassword();
        java.lang.String str9 = mongoDBRiverDefinition1.getSECONDARY_READ_PREFERENCE_FIELD();
        boolean boolean10 = mongoDBRiverDefinition1.isMongoSSLVerifyCertificate();
        java.lang.String str11 = mongoDBRiverDefinition1.getTYPE_FIELD();
        boolean boolean12 = mongoDBRiverDefinition1.isAdvancedTransformation();
        java.lang.String str13 = mongoDBRiverDefinition1.includeCollection;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "script" + "'", str6, "script");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "secondary_read_preference" + "'", str9, "secondary_read_preference");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "type" + "'", str11, "type");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.elasticsearch.common.settings.Settings settings2 = null;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory3 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder4);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder4);
        java.lang.String str7 = mongoDBRiverDefinition6.getDISABLE_INDEX_REFRESH_FIELD();
        java.lang.String str8 = mongoDBRiverDefinition6.getRiverName();
        java.util.List<com.mongodb.ServerAddress> serverAddressList9 = mongoDBRiverDefinition6.getMongoServers();
        boolean boolean10 = mongoDBRiverDefinition6.advancedTransformation;
        com.mongodb.BasicDBObject basicDBObject11 = mongoDBRiverDefinition6.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript12 = docScoreNativeScriptFactory3.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject11);
        org.elasticsearch.river.RiverSettings riverSettings13 = new org.elasticsearch.river.RiverSettings(settings2, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject11);
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = riverSettings13.settings();
        org.elasticsearch.script.ScriptService scriptService15 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("secondary_read_preference", "disable_index_refresh", riverSettings13, scriptService15);
        java.lang.String str17 = mongoDBRiverDefinition16.getTHROTTLE_SIZE_FIELD();
        boolean boolean18 = mongoDBRiverDefinition16.isMongoGridFS();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "disable_index_refresh" + "'", str7, "disable_index_refresh");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(serverAddressList9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(basicDBObject11);
        org.junit.Assert.assertNotNull(executableScript12);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "throttle_size" + "'", str17, "throttle_size");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean2 = mongoDBRiverDefinition1.storeStatistics;
        boolean boolean3 = mongoDBRiverDefinition1.isDisableIndexRefresh();
        java.lang.String str4 = mongoDBRiverDefinition1.getMongoLocalUser();
        java.util.Set<java.lang.String> strSet5 = mongoDBRiverDefinition1.getIncludeFields();
        java.lang.String str6 = mongoDBRiverDefinition1.getINITIAL_TIMESTAMP_SCRIPT_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition1.includeCollection;
        java.lang.String str8 = mongoDBRiverDefinition1.getADVANCED_TRANSFORMATION_FIELD();
        java.util.Set<java.lang.String> strSet9 = mongoDBRiverDefinition1.excludeFields;
        java.lang.String str10 = mongoDBRiverDefinition1.indexName;
        java.lang.String str11 = mongoDBRiverDefinition1.getMongoDb();
        java.lang.String str12 = mongoDBRiverDefinition1.getCONNECTION_TIMEOUT();
        int int13 = mongoDBRiverDefinition1.getDEFAULT_DB_PORT();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "script" + "'", str6, "script");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "advanced_transformation" + "'", str8, "advanced_transformation");
        org.junit.Assert.assertNull(strSet9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "connect_timeout" + "'", str12, "connect_timeout");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 27017 + "'", int13 == 27017);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("initial_timestamp", "script", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?script?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.socketTimeout((int) ' ');
        builder2.importAllCollections = false;
        builder2.throttleSize = (byte) 10;
        java.lang.String str7 = builder2.getmongoDb();
        java.lang.String str8 = builder2.mongoAdminUser;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str10 = builder9.gettypeName();
        builder9.setmongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder9.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder9.importAllCollections(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder18);
        builder18.setthrottleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder18.importAllCollections(true);
        java.lang.String str25 = builder24.gettypeName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder24.statisticsIndexName("_river");
        builder27.mongoDb = "port";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder27.mongoAdminPassword("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition33 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder32);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition34 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder32);
        com.mongodb.BasicDBObject basicDBObject35 = null;
        builder32.setmongoOplogFilter(basicDBObject35);
        boolean boolean37 = builder32.importAllCollections;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition39 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder38);
        boolean boolean40 = mongoDBRiverDefinition39.storeStatistics;
        boolean boolean41 = mongoDBRiverDefinition39.isDisableIndexRefresh();
        java.lang.String str42 = mongoDBRiverDefinition39.getMongoLocalUser();
        java.util.Set<java.lang.String> strSet43 = mongoDBRiverDefinition39.getIncludeFields();
        java.lang.String str44 = mongoDBRiverDefinition39.getINITIAL_TIMESTAMP_SCRIPT_FIELD();
        java.lang.String str45 = mongoDBRiverDefinition39.includeCollection;
        java.lang.String str46 = mongoDBRiverDefinition39.getMongoAdminPassword();
        java.lang.String str47 = mongoDBRiverDefinition39.getDROP_COLLECTION_FIELD();
        java.lang.String str48 = mongoDBRiverDefinition39.mongoAdminPassword;
        java.lang.String str49 = mongoDBRiverDefinition39.getMongoCollection();
        com.mongodb.BasicDBObject basicDBObject50 = mongoDBRiverDefinition39.getMongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder32.mongoOplogFilter(basicDBObject50);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder31.mongoOplogFilter(basicDBObject50);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str54 = builder53.gettypeName();
        builder53.setmongoDb("concurrent_bulk_requests");
        builder53.riverName = "throttle_size";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder53.socketTimeout((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = builder53.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition64 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder63);
        boolean boolean65 = mongoDBRiverDefinition64.storeStatistics;
        boolean boolean66 = mongoDBRiverDefinition64.isDisableIndexRefresh();
        java.lang.String str67 = mongoDBRiverDefinition64.getMongoLocalUser();
        java.util.Set<java.lang.String> strSet68 = mongoDBRiverDefinition64.getIncludeFields();
        java.lang.String str69 = mongoDBRiverDefinition64.getINITIAL_TIMESTAMP_SCRIPT_FIELD();
        java.lang.String str70 = mongoDBRiverDefinition64.includeCollection;
        java.lang.String str71 = mongoDBRiverDefinition64.getMongoAdminPassword();
        java.lang.String str72 = mongoDBRiverDefinition64.getDROP_COLLECTION_FIELD();
        java.lang.String str73 = mongoDBRiverDefinition64.mongoAdminPassword;
        java.lang.String str74 = mongoDBRiverDefinition64.getMongoCollection();
        com.mongodb.BasicDBObject basicDBObject75 = mongoDBRiverDefinition64.getMongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder76 = builder62.mongoOplogFilter(basicDBObject75);
        builder52.mongoCollectionFilter = basicDBObject75;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder78 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition79 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder78);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder81 = builder78.mongoAdminPassword("");
        java.lang.String[] strArray85 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet86 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet86, strArray85);
        builder81.excludeFields = strSet86;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder89 = builder52.excludeFields((java.util.Set<java.lang.String>) strSet86);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder90 = builder9.excludeFields((java.util.Set<java.lang.String>) strSet86);
        builder2.setparentTypes((java.util.Set<java.lang.String>) strSet86);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNull(strSet43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "script" + "'", str44, "script");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "drop_collection" + "'", str47, "drop_collection");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(basicDBObject50);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertNull(strSet68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "script" + "'", str69, "script");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "drop_collection" + "'", str72, "drop_collection");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertNull(str74);
        org.junit.Assert.assertNotNull(basicDBObject75);
        org.junit.Assert.assertNotNull(builder76);
        org.junit.Assert.assertNotNull(builder81);
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNotNull(builder89);
        org.junit.Assert.assertNotNull(builder90);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.gettypeName();
        builder0.setmongoDb("concurrent_bulk_requests");
        builder0.riverName = "throttle_size";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.socketTimeout((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder10);
        boolean boolean12 = mongoDBRiverDefinition11.storeStatistics;
        boolean boolean13 = mongoDBRiverDefinition11.isDisableIndexRefresh();
        java.lang.String str14 = mongoDBRiverDefinition11.getMongoLocalUser();
        java.util.Set<java.lang.String> strSet15 = mongoDBRiverDefinition11.getIncludeFields();
        java.lang.String str16 = mongoDBRiverDefinition11.getINITIAL_TIMESTAMP_SCRIPT_FIELD();
        java.lang.String str17 = mongoDBRiverDefinition11.includeCollection;
        java.lang.String str18 = mongoDBRiverDefinition11.getMongoAdminPassword();
        java.lang.String str19 = mongoDBRiverDefinition11.getDROP_COLLECTION_FIELD();
        java.lang.String str20 = mongoDBRiverDefinition11.mongoAdminPassword;
        java.lang.String str21 = mongoDBRiverDefinition11.getMongoCollection();
        com.mongodb.BasicDBObject basicDBObject22 = mongoDBRiverDefinition11.getMongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder9.mongoOplogFilter(basicDBObject22);
        builder9.storeStatistics = false;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(strSet15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "script" + "'", str16, "script");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "drop_collection" + "'", str19, "drop_collection");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(basicDBObject22);
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean2 = mongoDBRiverDefinition1.storeStatistics;
        boolean boolean3 = mongoDBRiverDefinition1.isDisableIndexRefresh();
        java.lang.String str4 = mongoDBRiverDefinition1.getMongoLocalUser();
        java.util.Set<java.lang.String> strSet5 = mongoDBRiverDefinition1.getIncludeFields();
        java.lang.String str6 = mongoDBRiverDefinition1.getINITIAL_TIMESTAMP_SCRIPT_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition1.includeCollection;
        java.lang.String str8 = mongoDBRiverDefinition1.getMongoAdminPassword();
        java.lang.String str9 = mongoDBRiverDefinition1.getCREDENTIALS_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition1.getSECONDARY_READ_PREFERENCE_FIELD();
        java.lang.String str11 = mongoDBRiverDefinition1.getCONCURRENT_BULK_REQUESTS_FIELD();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "script" + "'", str6, "script");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "credentials" + "'", str9, "credentials");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "secondary_read_preference" + "'", str10, "secondary_read_preference");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "concurrent_bulk_requests" + "'", str11, "concurrent_bulk_requests");
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.script("disable_index_refresh");
        java.lang.String str5 = builder4.indexName;
        org.bson.types.Binary binary6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder4.initialTimestamp(binary6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder1.mongoAdminPassword("");
        java.lang.String[] strArray8 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet9 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        builder4.excludeFields = strSet9;
        com.mongodb.BasicDBObject basicDBObject12 = builder4.mongoCollectionFilter;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder13);
        boolean boolean15 = mongoDBRiverDefinition14.storeStatistics;
        boolean boolean16 = mongoDBRiverDefinition14.isDisableIndexRefresh();
        java.lang.String str17 = mongoDBRiverDefinition14.getMongoLocalUser();
        java.util.Set<java.lang.String> strSet18 = mongoDBRiverDefinition14.getIncludeFields();
        java.lang.String str19 = mongoDBRiverDefinition14.getINITIAL_TIMESTAMP_SCRIPT_FIELD();
        java.lang.String str20 = mongoDBRiverDefinition14.includeCollection;
        java.lang.String str21 = mongoDBRiverDefinition14.getMongoAdminPassword();
        java.lang.String str22 = mongoDBRiverDefinition14.getSECONDARY_READ_PREFERENCE_FIELD();
        int int23 = mongoDBRiverDefinition14.socketTimeout;
        boolean boolean24 = mongoDBRiverDefinition14.disableIndexRefresh;
        boolean boolean25 = mongoDBRiverDefinition14.getimportAllCollections();
        boolean boolean26 = mongoDBRiverDefinition14.getmongoUseSSL();
        com.mongodb.BasicDBObject basicDBObject27 = mongoDBRiverDefinition14.mongoCollectionFilter;
        builder4.mongoOplogFilter = basicDBObject27;
        org.elasticsearch.river.RiverSettings riverSettings29 = new org.elasticsearch.river.RiverSettings(settings0, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject27);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(basicDBObject12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(strSet18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "script" + "'", str19, "script");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "secondary_read_preference" + "'", str22, "secondary_read_preference");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(basicDBObject27);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.getDISABLE_INDEX_REFRESH_FIELD();
        java.lang.String str4 = mongoDBRiverDefinition2.getRiverName();
        java.util.List<com.mongodb.ServerAddress> serverAddressList5 = mongoDBRiverDefinition2.getMongoServers();
        boolean boolean6 = mongoDBRiverDefinition2.advancedTransformation;
        com.mongodb.BasicDBObject basicDBObject7 = mongoDBRiverDefinition2.getMongoCollectionFilter();
        java.lang.String str8 = mongoDBRiverDefinition2.getRiverIndexName();
        int int9 = mongoDBRiverDefinition2.getThrottleSize();
        java.lang.String str10 = mongoDBRiverDefinition2.getPARENT_TYPES_FIELD();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "disable_index_refresh" + "'", str3, "disable_index_refresh");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(serverAddressList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(basicDBObject7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "parent_types" + "'", str10, "parent_types");
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.typeName("port");
        builder5.mongoCollection = "index";
        int int8 = builder5.connectTimeout;
        builder5.mongoLocalPassword = "skip_initial_import";
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        int int2 = builder0.throttleSize;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        com.mongodb.MongoClientOptions mongoClientOptions4 = null;
        builder0.mongoClientOptions = mongoClientOptions4;
        boolean boolean6 = builder0.mongoGridFS;
        org.bson.types.Binary binary7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.initialTimestamp(binary7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter5 = builder2.serializedObjectSupporter;
        builder2.setmongoAdminPassword("mongodb-1638820218424");
        java.lang.String str8 = builder2.getriverName();
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter9 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings10 = serializedObjectSupporter9.deserializeObjectRiverSettings4();
        org.elasticsearch.river.RiverSettings riverSettings11 = serializedObjectSupporter9.deserializeObjectRiverSettings1();
        builder2.serializedObjectSupporter = serializedObjectSupporter9;
        builder2.script = "include_fields";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder2.indexName("localhost");
        boolean boolean17 = builder2.getstoreStatistics();
        java.lang.String str18 = builder2.getriverIndexName();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNull(serializedObjectSupporter5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(riverSettings10);
        org.junit.Assert.assertNull(riverSettings11);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        com.mongodb.BasicDBObject basicDBObject3 = null;
        builder0.setmongoOplogFilter(basicDBObject3);
        boolean boolean5 = builder0.importAllCollections;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder6);
        boolean boolean8 = mongoDBRiverDefinition7.storeStatistics;
        boolean boolean9 = mongoDBRiverDefinition7.isDisableIndexRefresh();
        java.lang.String str10 = mongoDBRiverDefinition7.getMongoLocalUser();
        java.util.Set<java.lang.String> strSet11 = mongoDBRiverDefinition7.getIncludeFields();
        java.lang.String str12 = mongoDBRiverDefinition7.getINITIAL_TIMESTAMP_SCRIPT_FIELD();
        java.lang.String str13 = mongoDBRiverDefinition7.includeCollection;
        java.lang.String str14 = mongoDBRiverDefinition7.getMongoAdminPassword();
        java.lang.String str15 = mongoDBRiverDefinition7.getDROP_COLLECTION_FIELD();
        java.lang.String str16 = mongoDBRiverDefinition7.mongoAdminPassword;
        java.lang.String str17 = mongoDBRiverDefinition7.getMongoCollection();
        com.mongodb.BasicDBObject basicDBObject18 = mongoDBRiverDefinition7.getMongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder0.mongoOplogFilter(basicDBObject18);
        builder0.mongoLocalUser = "mongodb-1638820218387";
        java.util.Set<java.lang.String> strSet22 = builder0.excludeFields;
        builder0.socketTimeout = (byte) 1;
        builder0.mongoSSLVerifyCertificate = true;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(strSet11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "script" + "'", str12, "script");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "drop_collection" + "'", str15, "drop_collection");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(basicDBObject18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNull(strSet22);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.mongoAdminPassword("");
        builder3.setsocketTimeout((int) (short) 10);
        boolean boolean6 = builder3.getmongoUseSSL();
        builder3.mongoUseSSL = true;
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter5 = builder2.serializedObjectSupporter;
        builder2.statisticsTypeName = "throttle_size";
        boolean boolean8 = builder2.getmongoSecondaryReadPreference();
        builder2.setadvancedTransformation(false);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNull(serializedObjectSupporter5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings1 = serializedObjectSupporter0.deserializeObjectRiverSettings4();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString11();
        org.elasticsearch.river.RiverSettings riverSettings3 = serializedObjectSupporter0.deserializeObjectRiverSettings5();
        org.elasticsearch.river.RiverSettings riverSettings4 = serializedObjectSupporter0.deserializeObjectRiverSettings3();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString17();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString4();
        org.elasticsearch.river.RiverSettings riverSettings7 = serializedObjectSupporter0.deserializeObjectRiverSettings8();
        java.lang.Class<?> wildcardClass8 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNull(riverSettings1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mongodb-1638820218387" + "'", str2, "mongodb-1638820218387");
        org.junit.Assert.assertNull(riverSettings3);
        org.junit.Assert.assertNull(riverSettings4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "mongodb-1638820218449" + "'", str5, "mongodb-1638820218449");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_river" + "'", str6, "_river");
        org.junit.Assert.assertNull(riverSettings7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.script("disable_index_refresh");
        com.mongodb.BasicDBObject basicDBObject5 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoCollectionFilter(basicDBObject5);
        builder4.statisticsTypeName = "secondary_read_preference";
        builder4.setmongoGridFS(true);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean2 = mongoDBRiverDefinition1.storeStatistics;
        boolean boolean3 = mongoDBRiverDefinition1.isSkipInitialImport();
        java.lang.String str4 = mongoDBRiverDefinition1.getMongoCollection();
        boolean boolean5 = mongoDBRiverDefinition1.getadvancedTransformation();
        boolean boolean6 = mongoDBRiverDefinition1.getmongoGridFS();
        int int7 = mongoDBRiverDefinition1.getConnectTimeout();
        java.lang.String str8 = mongoDBRiverDefinition1.getScript();
        java.util.List<com.mongodb.ServerAddress> serverAddressList9 = mongoDBRiverDefinition1.getMongoServers();
        org.elasticsearch.common.logging.ESLogger eSLogger10 = mongoDBRiverDefinition1.getlogger();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(serverAddressList9);
        org.junit.Assert.assertNotNull(eSLogger10);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean2 = mongoDBRiverDefinition1.storeStatistics;
        boolean boolean3 = mongoDBRiverDefinition1.isSkipInitialImport();
        java.lang.String str4 = mongoDBRiverDefinition1.getMongoCollection();
        boolean boolean5 = mongoDBRiverDefinition1.getadvancedTransformation();
        boolean boolean6 = mongoDBRiverDefinition1.mongoGridFS;
        boolean boolean7 = mongoDBRiverDefinition1.getskipInitialImport();
        java.lang.String str8 = mongoDBRiverDefinition1.getRiverName();
        java.lang.String str9 = mongoDBRiverDefinition1.getINITIAL_TIMESTAMP_FIELD();
        boolean boolean10 = mongoDBRiverDefinition1.advancedTransformation;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "initial_timestamp" + "'", str9, "initial_timestamp");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setthrottleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder5.mongoAdminPassword("");
        java.lang.String[] strArray12 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        builder8.excludeFields = strSet13;
        com.mongodb.BasicDBObject basicDBObject16 = builder8.mongoCollectionFilter;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder0.mongoOplogFilter(basicDBObject16);
        java.lang.String str18 = builder0.getstatisticsIndexName();
        org.bson.types.BSONTimestamp bSONTimestamp19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder0.initialTimestamp(bSONTimestamp19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ts must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(basicDBObject16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        com.mongodb.BasicDBObject basicDBObject3 = null;
        builder0.setmongoOplogFilter(basicDBObject3);
        builder0.setmongoCollection("name");
        java.lang.String str7 = builder0.getmongoAdminPassword();
        com.mongodb.MongoClientOptions mongoClientOptions8 = builder0.mongoClientOptions;
        java.lang.String str9 = builder0.getscript();
        builder0.setmongoCollection("size");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(mongoClientOptions8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean2 = mongoDBRiverDefinition1.storeStatistics;
        boolean boolean3 = mongoDBRiverDefinition1.isSkipInitialImport();
        java.lang.String str4 = mongoDBRiverDefinition1.getMongoCollection();
        boolean boolean5 = mongoDBRiverDefinition1.getadvancedTransformation();
        java.lang.String str6 = mongoDBRiverDefinition1.getTypeName();
        java.lang.String str7 = mongoDBRiverDefinition1.getScript();
        java.lang.String str8 = mongoDBRiverDefinition1.getMongoAdminUser();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoAdminUser("disable_index_refresh");
        boolean boolean5 = builder2.getimportAllCollections();
        builder2.settypeName("secondary_read_preference");
        builder2.setincludeCollection("name");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder10.mongoAdminPassword("");
        java.lang.String[] strArray17 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        builder13.excludeFields = strSet18;
        builder7.setexcludeFields((java.util.Set<java.lang.String>) strSet18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder7.mongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.dropCollection(true);
        docScoreSearchScript0.setNextVar("", (java.lang.Object) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder27);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder27.mongoAdminPassword("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder31.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder33.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition37 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder36);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder36.mongoAdminPassword("");
        java.lang.String[] strArray43 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet44 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet44, strArray43);
        builder39.excludeFields = strSet44;
        builder33.setexcludeFields((java.util.Set<java.lang.String>) strSet44);
        builder30.parentTypes = strSet44;
        int int49 = builder30.getconnectTimeout();
        java.lang.Object obj50 = docScoreSearchScript0.unwrap((java.lang.Object) int49);
        org.apache.lucene.search.Scorer scorer51 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setScorer(scorer51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + 0 + "'", obj50, 0);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean2 = mongoDBRiverDefinition1.storeStatistics;
        boolean boolean3 = mongoDBRiverDefinition1.isDisableIndexRefresh();
        java.lang.String str4 = mongoDBRiverDefinition1.getADMIN_DB_FIELD();
        boolean boolean5 = mongoDBRiverDefinition1.getstoreStatistics();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("password", "ssl_verify_certificate", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?ssl_verify_certificate?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        com.mongodb.BasicDBObject basicDBObject3 = null;
        builder0.setmongoOplogFilter(basicDBObject3);
        boolean boolean5 = builder0.importAllCollections;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.mongoLocalPassword("name");
        builder0.mongoLocalPassword = "concurrent_bulk_requests";
        builder0.setscriptType("flush_interval");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str13 = builder0.mongoLocalUser;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.script("disable_index_refresh");
        boolean boolean5 = builder2.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder2);
        java.lang.String str7 = mongoDBRiverDefinition6.mongoAdminUser;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        builder2.setsocketTimeout((int) '4');
        builder2.setscript("flush_interval");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter7 = builder2.serializedObjectSupporter;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str9 = builder8.gettypeName();
        builder8.setmongoDb("concurrent_bulk_requests");
        builder8.riverName = "throttle_size";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder8.socketTimeout((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder8.mongoAdminUser("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder17);
        com.mongodb.ServerAddress[] serverAddressArray19 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList20 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList20, serverAddressArray19);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder17.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList20);
        builder2.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList20);
        boolean boolean24 = builder2.mongoUseSSL;
        java.util.Set<java.lang.String> strSet25 = builder2.parentTypes;
        java.lang.String str26 = builder2.script;
        builder2.setmongoSSLVerifyCertificate(false);
        com.mongodb.BasicDBObject basicDBObject29 = builder2.mongoOplogFilter;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(serializedObjectSupporter7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(serverAddressArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(strSet25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "flush_interval" + "'", str26, "flush_interval");
        org.junit.Assert.assertNull(basicDBObject29);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean2 = mongoDBRiverDefinition1.storeStatistics;
        boolean boolean3 = mongoDBRiverDefinition1.isDisableIndexRefresh();
        java.lang.String str4 = mongoDBRiverDefinition1.getMongoLocalUser();
        java.lang.String str5 = mongoDBRiverDefinition1.getINCLUDE_FIELDS_FIELD();
        java.util.Set<java.lang.String> strSet6 = mongoDBRiverDefinition1.includeFields;
        boolean boolean7 = mongoDBRiverDefinition1.mongoSSLVerifyCertificate;
        org.elasticsearch.common.logging.ESLogger eSLogger8 = mongoDBRiverDefinition1.getlogger();
        java.lang.String str9 = mongoDBRiverDefinition1.getFLUSH_INTERVAL_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition1.mongoLocalUser;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "include_fields" + "'", str5, "include_fields");
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(eSLogger8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "flush_interval" + "'", str9, "flush_interval");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.script("disable_index_refresh");
        com.mongodb.BasicDBObject basicDBObject5 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoCollectionFilter(basicDBObject5);
        builder6.statisticsIndexName = "host";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.riverIndexName("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder10);
        java.lang.String str12 = mongoDBRiverDefinition11.getSIZE_FIELD();
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter13 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings14 = serializedObjectSupporter13.deserializeObjectRiverSettings4();
        java.lang.String str15 = serializedObjectSupporter13.deserializeObjectString11();
        java.lang.String str16 = serializedObjectSupporter13.deserializeObjectString15();
        mongoDBRiverDefinition11.serializedObjectSupporter = serializedObjectSupporter13;
        org.elasticsearch.river.RiverSettings riverSettings18 = serializedObjectSupporter13.deserializeObjectRiverSettings7();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "size" + "'", str12, "size");
        org.junit.Assert.assertNull(riverSettings14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "mongodb-1638820218387" + "'", str15, "mongodb-1638820218387");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "mongodb-1638820218424" + "'", str16, "mongodb-1638820218424");
        org.junit.Assert.assertNull(riverSettings18);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.getScriptType();
        java.lang.String str3 = mongoDBRiverDefinition1.getBULK_TIMEOUT_FIELD();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "bulk_timeout" + "'", str3, "bulk_timeout");
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean2 = mongoDBRiverDefinition1.storeStatistics;
        boolean boolean3 = mongoDBRiverDefinition1.isDisableIndexRefresh();
        java.lang.String str4 = mongoDBRiverDefinition1.getMongoLocalUser();
        java.util.Set<java.lang.String> strSet5 = mongoDBRiverDefinition1.getIncludeFields();
        java.lang.String str6 = mongoDBRiverDefinition1.getINITIAL_TIMESTAMP_SCRIPT_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition1.includeCollection;
        java.lang.String str8 = mongoDBRiverDefinition1.getMongoAdminPassword();
        boolean boolean9 = mongoDBRiverDefinition1.isMongoUseSSL();
        boolean boolean10 = mongoDBRiverDefinition1.getmongoGridFS();
        java.lang.String str11 = mongoDBRiverDefinition1.getSCRIPT_FIELD();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "script" + "'", str6, "script");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "script" + "'", str11, "script");
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.gettypeName();
        builder0.setmongoDb("concurrent_bulk_requests");
        builder0.riverName = "throttle_size";
        builder0.connectTimeout = 'a';
        builder0.setsocketTimeout(27017);
        builder0.setmongoLocalUser("socket_timeout");
        builder0.mongoAdminUser = "";
        builder0.setmongoAdminUser("servers");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoAdminUser("disable_index_refresh");
        java.util.Set<java.lang.String> strSet5 = builder2.excludeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder2.scriptType("mongodb-1638820218387");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.mongoLocalPassword("_river");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.riverIndexName("mongodb-1638820218387");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder12);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder12);
        builder12.setthrottleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder17);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder17.mongoAdminPassword("");
        java.lang.String[] strArray24 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet25 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet25, strArray24);
        builder20.excludeFields = strSet25;
        com.mongodb.BasicDBObject basicDBObject28 = builder20.mongoCollectionFilter;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder12.mongoOplogFilter(basicDBObject28);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder11.mongoCollectionFilter(basicDBObject28);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder11.mongoAdminUser("throttle_size");
        java.lang.String str33 = builder32.getriverIndexName();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(basicDBObject28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "mongodb-1638820218387" + "'", str33, "mongodb-1638820218387");
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean2 = mongoDBRiverDefinition1.storeStatistics;
        boolean boolean3 = mongoDBRiverDefinition1.isDisableIndexRefresh();
        java.lang.String str4 = mongoDBRiverDefinition1.getADMIN_DB_FIELD();
        java.lang.Class<?> wildcardClass5 = mongoDBRiverDefinition1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.gettypeName();
        builder0.setmongoDb("concurrent_bulk_requests");
        builder0.riverName = "throttle_size";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.socketTimeout((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder10);
        boolean boolean12 = mongoDBRiverDefinition11.storeStatistics;
        boolean boolean13 = mongoDBRiverDefinition11.isDisableIndexRefresh();
        java.lang.String str14 = mongoDBRiverDefinition11.getMongoLocalUser();
        java.util.Set<java.lang.String> strSet15 = mongoDBRiverDefinition11.getIncludeFields();
        java.lang.String str16 = mongoDBRiverDefinition11.getINITIAL_TIMESTAMP_SCRIPT_FIELD();
        java.lang.String str17 = mongoDBRiverDefinition11.includeCollection;
        java.lang.String str18 = mongoDBRiverDefinition11.getMongoAdminPassword();
        java.lang.String str19 = mongoDBRiverDefinition11.getDROP_COLLECTION_FIELD();
        java.lang.String str20 = mongoDBRiverDefinition11.mongoAdminPassword;
        java.lang.String str21 = mongoDBRiverDefinition11.getMongoCollection();
        com.mongodb.BasicDBObject basicDBObject22 = mongoDBRiverDefinition11.getMongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder9.mongoOplogFilter(basicDBObject22);
        boolean boolean24 = builder23.mongoSSLVerifyCertificate;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder23.storeStatistics(true);
        java.lang.String str27 = builder26.typeName;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(strSet15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "script" + "'", str16, "script");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "drop_collection" + "'", str19, "drop_collection");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(basicDBObject22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString11();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString17();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString9();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString5();
        org.elasticsearch.river.RiverSettings riverSettings5 = serializedObjectSupporter0.deserializeObjectRiverSettings7();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString13();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb-1638820218387" + "'", str1, "mongodb-1638820218387");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mongodb-1638820218449" + "'", str2, "mongodb-1638820218449");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "mongodb-1638820218363" + "'", str3, "mongodb-1638820218363");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb-1638820218299" + "'", str4, "mongodb-1638820218299");
        org.junit.Assert.assertNull(riverSettings5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "mongodb-1638820218408" + "'", str6, "mongodb-1638820218408");
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoAdminUser("disable_index_refresh");
        boolean boolean5 = builder2.getimportAllCollections();
        builder2.setmongoCollection("mongodb-1638820218387");
        builder2.mongoLocalPassword = "size";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder2);
        builder2.setthrottleSize(0);
        com.mongodb.MongoClientOptions mongoClientOptions13 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder2.mongoClientOptions(mongoClientOptions13);
        java.lang.String str15 = builder2.scriptType;
        boolean boolean16 = builder2.importAllCollections;
        builder2.importAllCollections = true;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.gettypeName();
        builder0.setmongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str5 = mongoDBRiverDefinition4.getFILTER_FIELD();
        java.lang.String str6 = mongoDBRiverDefinition4.getPORT_FIELD();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = mongoDBRiverDefinition4.getInitialTimestamp();
        java.lang.String str8 = mongoDBRiverDefinition4.getINITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD();
        boolean boolean9 = mongoDBRiverDefinition4.getdropCollection();
        java.util.List<com.mongodb.ServerAddress> serverAddressList10 = mongoDBRiverDefinition4.getMongoServers();
        int int11 = mongoDBRiverDefinition4.socketTimeout;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "filter" + "'", str5, "filter");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "port" + "'", str6, "port");
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "script_type" + "'", str8, "script_type");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(serverAddressList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.gettypeName();
        builder0.setmongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str5 = mongoDBRiverDefinition4.getFILTER_FIELD();
        java.lang.String str6 = mongoDBRiverDefinition4.getSCRIPT_FIELD();
        boolean boolean7 = mongoDBRiverDefinition4.getadvancedTransformation();
        java.lang.String str8 = mongoDBRiverDefinition4.getEXCLUDE_FIELDS_FIELD();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "filter" + "'", str5, "filter");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "script" + "'", str6, "script");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "exclude_fields" + "'", str8, "exclude_fields");
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder10.mongoAdminPassword("");
        java.lang.String[] strArray17 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        builder13.excludeFields = strSet18;
        builder7.setexcludeFields((java.util.Set<java.lang.String>) strSet18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder7.mongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.dropCollection(true);
        docScoreSearchScript0.setNextVar("", (java.lang.Object) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions29 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.mongoClientOptions(mongoClientOptions29);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder30.script("disable_index_refresh");
        com.mongodb.BasicDBObject basicDBObject33 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder32.mongoCollectionFilter(basicDBObject33);
        builder34.statisticsIndexName = "host";
        builder34.setmongoAdminUser("skip_initial_import");
        docScoreSearchScript0.setNextVar("null.null", (java.lang.Object) builder34);
        org.apache.lucene.index.AtomicReaderContext atomicReaderContext40 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextReader(atomicReaderContext40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.mongoAdminPassword("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder9.mongoAdminPassword("");
        java.lang.String[] strArray16 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        builder12.excludeFields = strSet17;
        builder6.setexcludeFields((java.util.Set<java.lang.String>) strSet17);
        builder3.parentTypes = strSet17;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder22.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder24.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder27);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder27.mongoAdminPassword("");
        java.lang.String[] strArray34 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet35 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet35, strArray34);
        builder30.excludeFields = strSet35;
        builder24.setexcludeFields((java.util.Set<java.lang.String>) strSet35);
        builder3.setparentTypes((java.util.Set<java.lang.String>) strSet35);
        java.util.List<com.mongodb.ServerAddress> serverAddressList40 = builder3.getmongoServers();
        boolean boolean41 = builder3.getmongoUseSSL();
        com.mongodb.BasicDBObject basicDBObject42 = builder3.getmongoOplogFilter();
        builder3.storeStatistics = false;
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(serverAddressList40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(basicDBObject42);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.script("disable_index_refresh");
        java.util.List<com.mongodb.ServerAddress> serverAddressList5 = builder2.getmongoServers();
        builder2.setthrottleSize((int) (byte) 10);
        java.util.Set<java.lang.String> strSet8 = builder2.parentTypes;
        java.lang.String str9 = builder2.getriverName();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(serverAddressList5);
        org.junit.Assert.assertNull(strSet8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString4();
        org.elasticsearch.river.RiverSettings riverSettings2 = serializedObjectSupporter0.deserializeObjectRiverSettings6();
        org.elasticsearch.river.RiverSettings riverSettings3 = serializedObjectSupporter0.deserializeObjectRiverSettings5();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_river" + "'", str1, "_river");
        org.junit.Assert.assertNull(riverSettings2);
        org.junit.Assert.assertNull(riverSettings3);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings1 = serializedObjectSupporter0.deserializeObjectRiverSettings4();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString11();
        org.elasticsearch.river.RiverSettings riverSettings3 = serializedObjectSupporter0.deserializeObjectRiverSettings5();
        org.elasticsearch.river.RiverSettings riverSettings4 = serializedObjectSupporter0.deserializeObjectRiverSettings9();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        org.elasticsearch.river.RiverSettings riverSettings6 = serializedObjectSupporter0.deserializeObjectRiverSettings4();
        org.elasticsearch.river.RiverSettings riverSettings7 = serializedObjectSupporter0.deserializeObjectRiverSettings6();
        org.elasticsearch.river.RiverSettings riverSettings8 = serializedObjectSupporter0.deserializeObjectRiverSettings9();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString17();
        org.junit.Assert.assertNull(riverSettings1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mongodb-1638820218387" + "'", str2, "mongodb-1638820218387");
        org.junit.Assert.assertNull(riverSettings3);
        org.junit.Assert.assertNull(riverSettings4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "mongodb-1638820217755" + "'", str5, "mongodb-1638820217755");
        org.junit.Assert.assertNull(riverSettings6);
        org.junit.Assert.assertNull(riverSettings7);
        org.junit.Assert.assertNull(riverSettings8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "mongodb-1638820218449" + "'", str9, "mongodb-1638820218449");
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter5 = builder2.serializedObjectSupporter;
        builder2.setmongoAdminPassword("mongodb-1638820218424");
        java.lang.String str8 = builder2.getriverName();
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter9 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings10 = serializedObjectSupporter9.deserializeObjectRiverSettings4();
        org.elasticsearch.river.RiverSettings riverSettings11 = serializedObjectSupporter9.deserializeObjectRiverSettings1();
        builder2.serializedObjectSupporter = serializedObjectSupporter9;
        java.lang.String str13 = serializedObjectSupporter9.deserializeObjectString8();
        org.elasticsearch.river.RiverSettings riverSettings14 = serializedObjectSupporter9.deserializeObjectRiverSettings4();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNull(serializedObjectSupporter5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(riverSettings10);
        org.junit.Assert.assertNull(riverSettings11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_river" + "'", str13, "_river");
        org.junit.Assert.assertNull(riverSettings14);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.typeName("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder2.skipInitialImport(true);
        java.util.Set<java.lang.String> strSet8 = builder2.getexcludeFields();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = builder2.build();
        java.lang.String str10 = mongoDBRiverDefinition9.getSTORE_STATISTICS_FIELD();
        boolean boolean11 = mongoDBRiverDefinition9.getmongoGridFS();
        java.util.Set<java.lang.String> strSet12 = mongoDBRiverDefinition9.getExcludeFields();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(strSet8);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "store_statistics" + "'", str10, "store_statistics");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(strSet12);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str6 = builder5.gettypeName();
        builder5.setmongoDb("concurrent_bulk_requests");
        builder5.riverName = "throttle_size";
        builder5.connectTimeout = 'a';
        builder5.setsocketTimeout(27017);
        builder5.setmongoLocalUser("socket_timeout");
        builder5.mongoAdminUser = "";
        docScoreSearchScript0.setNextVar("flush_interval", (java.lang.Object) builder5);
        builder5.mongoSSLVerifyCertificate = true;
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean2 = mongoDBRiverDefinition1.storeStatistics;
        java.lang.String str3 = mongoDBRiverDefinition1.getTypeName();
        java.lang.String str4 = mongoDBRiverDefinition1.getIndexName();
        java.lang.String str5 = mongoDBRiverDefinition1.getMongoAdminUser();
        boolean boolean6 = mongoDBRiverDefinition1.isDisableIndexRefresh();
        java.lang.String str7 = mongoDBRiverDefinition1.getINDEX_OBJECT();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue8 = mongoDBRiverDefinition1.getDEFAULT_BULK_SIZE();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "index" + "'", str7, "index");
        org.junit.Assert.assertNotNull(byteSizeValue8);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.getDISABLE_INDEX_REFRESH_FIELD();
        java.lang.String str4 = mongoDBRiverDefinition2.getRiverName();
        java.util.List<com.mongodb.ServerAddress> serverAddressList5 = mongoDBRiverDefinition2.getMongoServers();
        boolean boolean6 = mongoDBRiverDefinition2.advancedTransformation;
        com.mongodb.BasicDBObject basicDBObject7 = mongoDBRiverDefinition2.getMongoCollectionFilter();
        java.lang.String str8 = mongoDBRiverDefinition2.getCONNECTION_TIMEOUT();
        java.util.Set<java.lang.String> strSet9 = mongoDBRiverDefinition2.getExcludeFields();
        java.lang.String str10 = mongoDBRiverDefinition2.getUSER_FIELD();
        boolean boolean11 = mongoDBRiverDefinition2.getmongoSSLVerifyCertificate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "disable_index_refresh" + "'", str3, "disable_index_refresh");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(serverAddressList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(basicDBObject7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "connect_timeout" + "'", str8, "connect_timeout");
        org.junit.Assert.assertNull(strSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "user" + "'", str10, "user");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.getDISABLE_INDEX_REFRESH_FIELD();
        java.lang.String str4 = mongoDBRiverDefinition2.getRiverName();
        java.lang.String str5 = mongoDBRiverDefinition2.mongoAdminPassword;
        int int6 = mongoDBRiverDefinition2.getSocketTimeout();
        java.util.Set<java.lang.String> strSet7 = mongoDBRiverDefinition2.excludeFields;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "disable_index_refresh" + "'", str3, "disable_index_refresh");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(strSet7);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.script("disable_index_refresh");
        java.util.List<com.mongodb.ServerAddress> serverAddressList5 = builder2.getmongoServers();
        builder2.setthrottleSize((int) (byte) 10);
        java.util.Set<java.lang.String> strSet8 = builder2.parentTypes;
        com.mongodb.MongoClientOptions mongoClientOptions9 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder2.mongoClientOptions(mongoClientOptions9);
        builder10.riverIndexName = "type";
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(serverAddressList5);
        org.junit.Assert.assertNull(strSet8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder5.mongoAdminPassword("");
        java.lang.String[] strArray12 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        builder8.excludeFields = strSet13;
        builder2.setexcludeFields((java.util.Set<java.lang.String>) strSet13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder2.mongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.dropCollection(true);
        builder18.setsocketTimeout((int) (short) -1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.getDISABLE_INDEX_REFRESH_FIELD();
        boolean boolean4 = mongoDBRiverDefinition2.isDisableIndexRefresh();
        java.lang.String str5 = mongoDBRiverDefinition2.getUSER_FIELD();
        java.lang.String str6 = mongoDBRiverDefinition2.getNAME_FIELD();
        java.util.List<com.mongodb.ServerAddress> serverAddressList7 = mongoDBRiverDefinition2.mongoServers;
        java.lang.String str8 = mongoDBRiverDefinition2.getUSER_FIELD();
        boolean boolean9 = mongoDBRiverDefinition2.importAllCollections;
        java.lang.String str10 = mongoDBRiverDefinition2.getFILTER_FIELD();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "disable_index_refresh" + "'", str3, "disable_index_refresh");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "user" + "'", str5, "user");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "name" + "'", str6, "name");
        org.junit.Assert.assertNotNull(serverAddressList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "user" + "'", str8, "user");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "filter" + "'", str10, "filter");
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean2 = mongoDBRiverDefinition1.storeStatistics;
        boolean boolean3 = mongoDBRiverDefinition1.isDisableIndexRefresh();
        java.lang.String str4 = mongoDBRiverDefinition1.getADMIN_DB_FIELD();
        int int5 = mongoDBRiverDefinition1.getDEFAULT_CONCURRENT_REQUESTS();
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter6 = mongoDBRiverDefinition1.serializedObjectSupporter;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertNull(serializedObjectSupporter6);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder2.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder6);
        builder6.mongoGridFS = true;
        com.mongodb.ServerAddress[] serverAddressArray10 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList11 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList11, serverAddressArray10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder6.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList11);
        builder13.setmongoCollection("ssl");
        builder13.setmongoGridFS(true);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(serverAddressArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        int int3 = builder0.getsocketTimeout();
        java.lang.String str4 = builder0.getindexName();
        com.mongodb.BasicDBObject basicDBObject5 = builder0.mongoOplogFilter;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(basicDBObject5);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.script("disable_index_refresh");
        com.mongodb.BasicDBObject basicDBObject5 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoCollectionFilter(basicDBObject5);
        builder6.statisticsIndexName = "host";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.mongoLocalPassword("throttle_size");
        java.util.Set<java.lang.String> strSet11 = builder6.excludeFields;
        java.util.Set<java.lang.String> strSet12 = builder6.getparentTypes();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNull(strSet11);
        org.junit.Assert.assertNull(strSet12);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder2.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder2.mongoAdminUser("mongodb-1638820218408");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = builder8.initialTimestamp;
        java.util.Set<java.lang.String> strSet10 = builder8.parentTypes;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = strSet10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNull(strSet10);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder10.mongoAdminPassword("");
        java.lang.String[] strArray17 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        builder13.excludeFields = strSet18;
        builder7.setexcludeFields((java.util.Set<java.lang.String>) strSet18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder7.mongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.dropCollection(true);
        docScoreSearchScript0.setNextVar("", (java.lang.Object) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder27);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder27.mongoAdminPassword("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder31.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder33.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition37 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder36);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder36.mongoAdminPassword("");
        java.lang.String[] strArray43 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet44 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet44, strArray43);
        builder39.excludeFields = strSet44;
        builder33.setexcludeFields((java.util.Set<java.lang.String>) strSet44);
        builder30.parentTypes = strSet44;
        int int49 = builder30.getconnectTimeout();
        java.lang.Object obj50 = docScoreSearchScript0.unwrap((java.lang.Object) int49);
        org.apache.lucene.index.AtomicReaderContext atomicReaderContext51 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextReader(atomicReaderContext51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + 0 + "'", obj50, 0);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder3);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder3.mongoAdminPassword("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder12);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder12.mongoAdminPassword("");
        java.lang.String[] strArray19 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        builder15.excludeFields = strSet20;
        builder9.setexcludeFields((java.util.Set<java.lang.String>) strSet20);
        builder6.parentTypes = strSet20;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder25.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition31 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder30);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder30.mongoAdminPassword("");
        java.lang.String[] strArray37 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet38 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet38, strArray37);
        builder33.excludeFields = strSet38;
        builder27.setexcludeFields((java.util.Set<java.lang.String>) strSet38);
        builder6.setparentTypes((java.util.Set<java.lang.String>) strSet38);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder0.includeFields((java.util.Set<java.lang.String>) strSet38);
        java.lang.String str44 = builder0.getriverIndexName();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNull(str44);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("disable_index_refresh");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?disable_index_refresh?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder5.mongoAdminPassword("");
        java.lang.String[] strArray12 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        builder8.excludeFields = strSet13;
        builder2.setexcludeFields((java.util.Set<java.lang.String>) strSet13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder2.mongoUseSSL(false);
        java.lang.String str19 = builder18.getindexName();
        boolean boolean20 = builder18.disableIndexRefresh;
        com.mongodb.MongoClientOptions mongoClientOptions21 = null;
        builder18.mongoClientOptions = mongoClientOptions21;
        boolean boolean23 = builder18.mongoUseSSL;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder18.riverIndexName("initial_timestamp");
        java.lang.String str26 = builder25.getmongoAdminPassword();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoAdminUser("disable_index_refresh");
        java.util.Set<java.lang.String> strSet5 = builder2.excludeFields;
        java.util.Set<java.lang.String> strSet6 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder2.includeFields(strSet6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder2.riverName("drop_collection");
        builder9.advancedTransformation = true;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((float) (short) 100);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter9 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString4();
        java.lang.String str11 = serializedObjectSupporter9.deserializeObjectString1();
        docScoreSearchScript0.setNextVar("include_fields", (java.lang.Object) str11);
        docScoreSearchScript0.setNextScore((float) 1L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder21);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder21.mongoAdminPassword("");
        java.lang.String[] strArray28 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet29 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet29, strArray28);
        builder24.excludeFields = strSet29;
        builder18.setexcludeFields((java.util.Set<java.lang.String>) strSet29);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder18.mongoUseSSL(false);
        java.lang.String str35 = builder34.getindexName();
        boolean boolean36 = builder34.disableIndexRefresh;
        com.mongodb.MongoClientOptions mongoClientOptions37 = null;
        builder34.mongoClientOptions = mongoClientOptions37;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition39 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder34);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter40 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str41 = serializedObjectSupporter40.deserializeObjectString4();
        org.elasticsearch.river.RiverSettings riverSettings42 = serializedObjectSupporter40.deserializeObjectRiverSettings7();
        java.lang.String str43 = serializedObjectSupporter40.deserializeObjectString15();
        mongoDBRiverDefinition39.serializedObjectSupporter = serializedObjectSupporter40;
        java.lang.String str45 = mongoDBRiverDefinition39.getSCRIPT_FIELD();
        docScoreSearchScript0.setNextVar("port", (java.lang.Object) mongoDBRiverDefinition39);
        // The following exception was thrown during execution in test generation
        try {
            double double47 = docScoreSearchScript0.runAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_river" + "'", str10, "_river");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "mongodb-1638820217755" + "'", str11, "mongodb-1638820217755");
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "_river" + "'", str41, "_river");
        org.junit.Assert.assertNull(riverSettings42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "mongodb-1638820218424" + "'", str43, "mongodb-1638820218424");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "script" + "'", str45, "script");
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.getDISABLE_INDEX_REFRESH_FIELD();
        boolean boolean4 = mongoDBRiverDefinition2.isDisableIndexRefresh();
        com.mongodb.MongoClientOptions mongoClientOptions5 = mongoDBRiverDefinition2.getMongoClientOptions();
        java.lang.String str6 = mongoDBRiverDefinition2.getUSER_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition2.getINDEX_OBJECT();
        boolean boolean8 = mongoDBRiverDefinition2.isDisableIndexRefresh();
        java.lang.String str9 = mongoDBRiverDefinition2.getNAME_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition2.indexName;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "disable_index_refresh" + "'", str3, "disable_index_refresh");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(mongoClientOptions5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "user" + "'", str6, "user");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "index" + "'", str7, "index");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "name" + "'", str9, "name");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder2.advancedTransformation(false);
        boolean boolean7 = builder6.getmongoGridFS();
        org.bson.types.Binary binary8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder6.initialTimestamp(binary8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoAdminUser("disable_index_refresh");
        boolean boolean5 = builder2.getimportAllCollections();
        builder2.setmongoCollection("mongodb-1638820218387");
        builder2.mongoLocalPassword = "size";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder2);
        builder2.setthrottleSize(0);
        com.mongodb.MongoClientOptions mongoClientOptions13 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder2.mongoClientOptions(mongoClientOptions13);
        java.lang.String str15 = builder2.scriptType;
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = builder2.getinitialTimestamp();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(wildcardTimestamp16);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.getDISABLE_INDEX_REFRESH_FIELD();
        boolean boolean4 = mongoDBRiverDefinition2.getskipInitialImport();
        java.lang.String str5 = mongoDBRiverDefinition2.includeCollection;
        java.lang.String str6 = mongoDBRiverDefinition2.getMongoAdminPassword();
        boolean boolean7 = mongoDBRiverDefinition2.skipInitialImport;
        boolean boolean8 = mongoDBRiverDefinition2.isMongoSecondaryReadPreference();
        boolean boolean9 = mongoDBRiverDefinition2.isMongoSSLVerifyCertificate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "disable_index_refresh" + "'", str3, "disable_index_refresh");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.script("disable_index_refresh");
        com.mongodb.BasicDBObject basicDBObject5 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoCollectionFilter(basicDBObject5);
        builder6.statisticsIndexName = "host";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.riverIndexName("ssl");
        builder6.setadvancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions14 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder13.mongoClientOptions(mongoClientOptions14);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.script("disable_index_refresh");
        com.mongodb.BasicDBObject basicDBObject18 = builder17.mongoCollectionFilter;
        boolean boolean19 = builder17.getadvancedTransformation();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder17.includeCollection("drop_collection");
        java.util.List<com.mongodb.ServerAddress> serverAddressList22 = builder17.getmongoServers();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder6.mongoServers(serverAddressList22);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp24 = builder23.initialTimestamp;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(basicDBObject18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(serverAddressList22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNull(wildcardTimestamp24);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoAdminUser("disable_index_refresh");
        boolean boolean5 = builder2.getimportAllCollections();
        boolean boolean6 = builder2.skipInitialImport;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.getDISABLE_INDEX_REFRESH_FIELD();
        boolean boolean4 = mongoDBRiverDefinition2.getskipInitialImport();
        java.lang.String str5 = mongoDBRiverDefinition2.includeCollection;
        java.lang.String str6 = mongoDBRiverDefinition2.getMongoAdminPassword();
        boolean boolean7 = mongoDBRiverDefinition2.skipInitialImport;
        java.lang.String str8 = mongoDBRiverDefinition2.indexName;
        java.lang.String str9 = mongoDBRiverDefinition2.script;
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter10 = mongoDBRiverDefinition2.serializedObjectSupporter;
        boolean boolean11 = mongoDBRiverDefinition2.getmongoSecondaryReadPreference();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "disable_index_refresh" + "'", str3, "disable_index_refresh");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(serializedObjectSupporter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder10.mongoAdminPassword("");
        java.lang.String[] strArray17 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        builder13.excludeFields = strSet18;
        builder7.setexcludeFields((java.util.Set<java.lang.String>) strSet18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder7.mongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.dropCollection(true);
        docScoreSearchScript0.setNextVar("", (java.lang.Object) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions29 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.mongoClientOptions(mongoClientOptions29);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder30.script("disable_index_refresh");
        com.mongodb.BasicDBObject basicDBObject33 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder32.mongoCollectionFilter(basicDBObject33);
        builder34.statisticsIndexName = "host";
        builder34.setmongoAdminUser("skip_initial_import");
        docScoreSearchScript0.setNextVar("null.null", (java.lang.Object) builder34);
        // The following exception was thrown during execution in test generation
        try {
            double double40 = docScoreSearchScript0.runAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean2 = mongoDBRiverDefinition1.storeStatistics;
        boolean boolean3 = mongoDBRiverDefinition1.isDisableIndexRefresh();
        java.lang.String str4 = mongoDBRiverDefinition1.getMongoLocalUser();
        java.util.Set<java.lang.String> strSet5 = mongoDBRiverDefinition1.getIncludeFields();
        java.lang.String str6 = mongoDBRiverDefinition1.getINITIAL_TIMESTAMP_SCRIPT_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition1.includeCollection;
        java.lang.String str8 = mongoDBRiverDefinition1.getADVANCED_TRANSFORMATION_FIELD();
        java.util.Set<java.lang.String> strSet9 = mongoDBRiverDefinition1.excludeFields;
        java.lang.String str10 = mongoDBRiverDefinition1.indexName;
        java.lang.String str11 = mongoDBRiverDefinition1.getDISABLE_INDEX_REFRESH_FIELD();
        boolean boolean12 = mongoDBRiverDefinition1.mongoUseSSL;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "script" + "'", str6, "script");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "advanced_transformation" + "'", str8, "advanced_transformation");
        org.junit.Assert.assertNull(strSet9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "disable_index_refresh" + "'", str11, "disable_index_refresh");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean2 = mongoDBRiverDefinition1.storeStatistics;
        boolean boolean3 = mongoDBRiverDefinition1.isDisableIndexRefresh();
        java.lang.String str4 = mongoDBRiverDefinition1.getMongoLocalUser();
        java.util.Set<java.lang.String> strSet5 = mongoDBRiverDefinition1.getIncludeFields();
        java.lang.String str6 = mongoDBRiverDefinition1.getINITIAL_TIMESTAMP_SCRIPT_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition1.includeCollection;
        java.lang.String str8 = mongoDBRiverDefinition1.getADVANCED_TRANSFORMATION_FIELD();
        java.util.Set<java.lang.String> strSet9 = mongoDBRiverDefinition1.excludeFields;
        java.lang.String str10 = mongoDBRiverDefinition1.getACTIONS_FIELD();
        boolean boolean11 = mongoDBRiverDefinition1.isStoreStatistics();
        java.lang.String str12 = mongoDBRiverDefinition1.getSCRIPT_FIELD();
        com.mongodb.BasicDBObject basicDBObject13 = mongoDBRiverDefinition1.getMongoOplogFilter();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "script" + "'", str6, "script");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "advanced_transformation" + "'", str8, "advanced_transformation");
        org.junit.Assert.assertNull(strSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "actions" + "'", str10, "actions");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "script" + "'", str12, "script");
        org.junit.Assert.assertNull(basicDBObject13);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.getDISABLE_INDEX_REFRESH_FIELD();
        boolean boolean4 = mongoDBRiverDefinition2.isDisableIndexRefresh();
        java.lang.String str5 = mongoDBRiverDefinition2.getACTIONS_FIELD();
        java.lang.String str6 = mongoDBRiverDefinition2.getDROP_COLLECTION_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition2.scriptType;
        java.lang.String str8 = mongoDBRiverDefinition2.getSOCKET_TIMEOUT();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "disable_index_refresh" + "'", str3, "disable_index_refresh");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "actions" + "'", str5, "actions");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "drop_collection" + "'", str6, "drop_collection");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "socket_timeout" + "'", str8, "socket_timeout");
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("mongodb-1638820218299", "name");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?name? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean2 = mongoDBRiverDefinition1.storeStatistics;
        boolean boolean3 = mongoDBRiverDefinition1.isDisableIndexRefresh();
        java.lang.String str4 = mongoDBRiverDefinition1.getMongoLocalUser();
        boolean boolean5 = mongoDBRiverDefinition1.getmongoSecondaryReadPreference();
        java.lang.String str6 = mongoDBRiverDefinition1.getSCRIPT_TYPE_FIELD();
        com.mongodb.BasicDBObject basicDBObject7 = mongoDBRiverDefinition1.mongoOplogFilter;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "script_type" + "'", str6, "script_type");
        org.junit.Assert.assertNull(basicDBObject7);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setthrottleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.importAllCollections(true);
        boolean boolean7 = builder0.importAllCollections;
        boolean boolean8 = builder0.mongoGridFS;
        boolean boolean9 = builder0.mongoUseSSL;
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("admin", "db");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?db?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean2 = mongoDBRiverDefinition1.storeStatistics;
        boolean boolean3 = mongoDBRiverDefinition1.isDisableIndexRefresh();
        java.lang.String str4 = mongoDBRiverDefinition1.getMongoLocalUser();
        java.util.Set<java.lang.String> strSet5 = mongoDBRiverDefinition1.getIncludeFields();
        java.lang.String str6 = mongoDBRiverDefinition1.getINITIAL_TIMESTAMP_SCRIPT_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition1.includeCollection;
        java.lang.String str8 = mongoDBRiverDefinition1.getMongoAdminPassword();
        java.lang.String str9 = mongoDBRiverDefinition1.getDROP_COLLECTION_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition1.mongoAdminPassword;
        java.lang.String str11 = mongoDBRiverDefinition1.getMongoCollection();
        com.mongodb.BasicDBObject basicDBObject12 = mongoDBRiverDefinition1.getMongoCollectionFilter();
        java.lang.String str13 = mongoDBRiverDefinition1.getScriptType();
        int int14 = mongoDBRiverDefinition1.throttleSize;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "script" + "'", str6, "script");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "drop_collection" + "'", str9, "drop_collection");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(basicDBObject12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.typeName("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder2.skipInitialImport(true);
        java.util.Set<java.lang.String> strSet8 = builder2.getexcludeFields();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = builder2.build();
        boolean boolean10 = builder2.disableIndexRefresh;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(strSet8);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.script("disable_index_refresh");
        com.mongodb.BasicDBObject basicDBObject5 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoCollectionFilter(basicDBObject5);
        builder6.statisticsIndexName = "host";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.riverIndexName("ssl");
        java.lang.String str11 = builder6.getmongoAdminPassword();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.gettypeName();
        builder0.setriverName("hi!");
        java.lang.String str4 = builder0.getmongoLocalPassword();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoDb("mongodb-1638820218408");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.socketTimeout((int) (byte) 1);
        com.mongodb.BasicDBObject basicDBObject7 = builder6.getmongoCollectionFilter();
        builder6.setconnectTimeout((int) 'a');
        boolean boolean10 = builder6.getdisableIndexRefresh();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(basicDBObject7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.script("disable_index_refresh");
        java.lang.String str5 = builder4.getmongoDb();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions7 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoClientOptions(mongoClientOptions7);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.script("disable_index_refresh");
        com.mongodb.BasicDBObject basicDBObject11 = builder10.mongoCollectionFilter;
        builder4.mongoCollectionFilter = basicDBObject11;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder4);
        boolean boolean14 = mongoDBRiverDefinition13.getstoreStatistics();
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter15 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings16 = serializedObjectSupporter15.deserializeObjectRiverSettings4();
        java.lang.String str17 = serializedObjectSupporter15.deserializeObjectString11();
        org.elasticsearch.river.RiverSettings riverSettings18 = serializedObjectSupporter15.deserializeObjectRiverSettings5();
        org.elasticsearch.river.RiverSettings riverSettings19 = serializedObjectSupporter15.deserializeObjectRiverSettings3();
        java.lang.String str20 = serializedObjectSupporter15.deserializeObjectString18();
        mongoDBRiverDefinition13.serializedObjectSupporter = serializedObjectSupporter15;
        java.lang.String str22 = serializedObjectSupporter15.deserializeObjectString10();
        org.elasticsearch.river.RiverSettings riverSettings23 = serializedObjectSupporter15.deserializeObjectRiverSettings2();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(basicDBObject11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(riverSettings16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "mongodb-1638820218387" + "'", str17, "mongodb-1638820218387");
        org.junit.Assert.assertNull(riverSettings18);
        org.junit.Assert.assertNull(riverSettings19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "_river" + "'", str20, "_river");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "_river" + "'", str22, "_river");
        org.junit.Assert.assertNull(riverSettings23);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.gettypeName();
        builder0.setmongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str5 = mongoDBRiverDefinition4.getFILTER_FIELD();
        java.lang.String str6 = mongoDBRiverDefinition4.getSCRIPT_FIELD();
        boolean boolean7 = mongoDBRiverDefinition4.isMongoUseSSL();
        java.lang.String str8 = mongoDBRiverDefinition4.getTypeName();
        java.lang.String str9 = mongoDBRiverDefinition4.getOPTIONS_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition4.getINDEX_OBJECT();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "filter" + "'", str5, "filter");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "script" + "'", str6, "script");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "options" + "'", str9, "options");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "index" + "'", str10, "index");
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString4();
        org.elasticsearch.river.RiverSettings riverSettings2 = serializedObjectSupporter0.deserializeObjectRiverSettings6();
        org.elasticsearch.river.RiverSettings riverSettings3 = serializedObjectSupporter0.deserializeObjectRiverSettings7();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString17();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString10();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_river" + "'", str1, "_river");
        org.junit.Assert.assertNull(riverSettings2);
        org.junit.Assert.assertNull(riverSettings3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb-1638820218449" + "'", str4, "mongodb-1638820218449");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_river" + "'", str5, "_river");
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setthrottleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder5.mongoAdminPassword("");
        java.lang.String[] strArray12 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        builder8.excludeFields = strSet13;
        com.mongodb.BasicDBObject basicDBObject16 = builder8.mongoCollectionFilter;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder0.mongoOplogFilter(basicDBObject16);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder0.script("secondary_read_preference");
        builder0.setdisableIndexRefresh(false);
        int int22 = builder0.getthrottleSize();
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(basicDBObject16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("secondary_read_preference");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?secondary_read_preference?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoLocalUser = "store_statistics";
        int int4 = builder0.connectTimeout;
        java.util.Set<java.lang.String> strSet5 = builder0.excludeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.riverName("parent_types");
        builder7.scriptType = "actions";
        builder7.mongoSSLVerifyCertificate = false;
        org.bson.types.BSONTimestamp bSONTimestamp12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder7.initialTimestamp(bSONTimestamp12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ts must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.getDISABLE_INDEX_REFRESH_FIELD();
        boolean boolean4 = mongoDBRiverDefinition2.isDisableIndexRefresh();
        java.lang.String str5 = mongoDBRiverDefinition2.getUSER_FIELD();
        java.lang.String str6 = mongoDBRiverDefinition2.getNAME_FIELD();
        java.util.List<com.mongodb.ServerAddress> serverAddressList7 = mongoDBRiverDefinition2.mongoServers;
        int int8 = mongoDBRiverDefinition2.getSocketTimeout();
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter9 = mongoDBRiverDefinition2.serializedObjectSupporter;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "disable_index_refresh" + "'", str3, "disable_index_refresh");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "user" + "'", str5, "user");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "name" + "'", str6, "name");
        org.junit.Assert.assertNotNull(serverAddressList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(serializedObjectSupporter9);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.mongoAdminPassword("");
        java.lang.String[] strArray7 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        builder3.excludeFields = strSet8;
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = builder3.initialTimestamp;
        boolean boolean12 = builder3.advancedTransformation;
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter13 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings14 = serializedObjectSupporter13.deserializeObjectRiverSettings4();
        java.lang.String str15 = serializedObjectSupporter13.deserializeObjectString16();
        builder3.serializedObjectSupporter = serializedObjectSupporter13;
        builder3.setadvancedTransformation(true);
        java.lang.String str19 = builder3.riverName;
        builder3.importAllCollections = false;
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(riverSettings14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_river" + "'", str15, "_river");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.typeName("mongodb-1638820218449");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder9.mongoAdminPassword("");
        java.lang.String[] strArray16 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        builder12.excludeFields = strSet17;
        builder6.setexcludeFields((java.util.Set<java.lang.String>) strSet17);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder6.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition23 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder22);
        boolean boolean24 = builder22.dropCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder25.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder29.socketTimeout((int) (byte) 1);
        com.mongodb.BasicDBObject basicDBObject32 = builder31.getmongoCollectionFilter();
        builder22.setmongoCollectionFilter(basicDBObject32);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder3.mongoCollectionFilter(basicDBObject32);
        java.util.Set<java.lang.String> strSet35 = builder3.getparentTypes();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(basicDBObject32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNull(strSet35);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder5.mongoAdminPassword("");
        java.lang.String[] strArray12 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        builder8.excludeFields = strSet13;
        builder2.setexcludeFields((java.util.Set<java.lang.String>) strSet13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder2.mongoSecondaryReadPreference(false);
        boolean boolean19 = builder18.storeStatistics;
        java.lang.String str20 = builder18.mongoDb;
        builder18.connectTimeout = (byte) 0;
        java.lang.String str23 = builder18.getscriptType();
        org.bson.types.Binary binary24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder18.initialTimestamp(binary24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setthrottleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.importAllCollections(true);
        java.lang.String str7 = builder6.gettypeName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder6.statisticsIndexName("_river");
        builder9.mongoDb = "port";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder9.mongoAdminPassword("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder13.statisticsTypeName("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder13);
        java.lang.String str17 = mongoDBRiverDefinition16.indexName;
        java.lang.String str18 = mongoDBRiverDefinition16.getSKIP_INITIAL_IMPORT_FIELD();
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "skip_initial_import" + "'", str18, "skip_initial_import");
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings1 = serializedObjectSupporter0.deserializeObjectRiverSettings4();
        org.elasticsearch.river.RiverSettings riverSettings2 = serializedObjectSupporter0.deserializeObjectRiverSettings1();
        org.elasticsearch.river.RiverSettings riverSettings3 = serializedObjectSupporter0.deserializeObjectRiverSettings7();
        org.elasticsearch.river.RiverSettings riverSettings4 = serializedObjectSupporter0.deserializeObjectRiverSettings3();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString5();
        org.elasticsearch.river.RiverSettings riverSettings6 = serializedObjectSupporter0.deserializeObjectRiverSettings5();
        org.junit.Assert.assertNull(riverSettings1);
        org.junit.Assert.assertNull(riverSettings2);
        org.junit.Assert.assertNull(riverSettings3);
        org.junit.Assert.assertNull(riverSettings4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "mongodb-1638820218299" + "'", str5, "mongodb-1638820218299");
        org.junit.Assert.assertNull(riverSettings6);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean2 = mongoDBRiverDefinition1.storeStatistics;
        boolean boolean3 = mongoDBRiverDefinition1.isDisableIndexRefresh();
        java.lang.String str4 = mongoDBRiverDefinition1.getMongoLocalUser();
        java.util.Set<java.lang.String> strSet5 = mongoDBRiverDefinition1.getIncludeFields();
        java.lang.String str6 = mongoDBRiverDefinition1.getINITIAL_TIMESTAMP_SCRIPT_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition1.includeCollection;
        java.lang.String str8 = mongoDBRiverDefinition1.getMongoAdminPassword();
        java.lang.String str9 = mongoDBRiverDefinition1.getDROP_COLLECTION_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition1.mongoAdminPassword;
        java.lang.String str11 = mongoDBRiverDefinition1.getMongoCollection();
        com.mongodb.BasicDBObject basicDBObject12 = mongoDBRiverDefinition1.getMongoCollectionFilter();
        java.lang.String str13 = mongoDBRiverDefinition1.getDROP_COLLECTION_FIELD();
        java.lang.String str14 = mongoDBRiverDefinition1.getDB_FIELD();
        java.lang.String str15 = mongoDBRiverDefinition1.getIMPORT_ALL_COLLECTIONS_FIELD();
        java.lang.String str16 = mongoDBRiverDefinition1.getNAME_FIELD();
        boolean boolean17 = mongoDBRiverDefinition1.isMongoUseSSL();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "script" + "'", str6, "script");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "drop_collection" + "'", str9, "drop_collection");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(basicDBObject12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "drop_collection" + "'", str13, "drop_collection");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "db" + "'", str14, "db");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "import_all_collections" + "'", str15, "import_all_collections");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "name" + "'", str16, "name");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean2 = mongoDBRiverDefinition1.storeStatistics;
        boolean boolean3 = mongoDBRiverDefinition1.isDisableIndexRefresh();
        java.lang.String str4 = mongoDBRiverDefinition1.getMongoLocalUser();
        java.util.Set<java.lang.String> strSet5 = mongoDBRiverDefinition1.getIncludeFields();
        java.lang.String str6 = mongoDBRiverDefinition1.getINITIAL_TIMESTAMP_SCRIPT_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition1.includeCollection;
        java.lang.String str8 = mongoDBRiverDefinition1.getMongoAdminPassword();
        boolean boolean9 = mongoDBRiverDefinition1.getmongoUseSSL();
        boolean boolean10 = mongoDBRiverDefinition1.isStoreStatistics();
        java.util.Set<java.lang.String> strSet11 = mongoDBRiverDefinition1.excludeFields;
        java.lang.String str12 = mongoDBRiverDefinition1.getRiverIndexName();
        com.mongodb.BasicDBObject basicDBObject13 = mongoDBRiverDefinition1.getMongoCollectionFilter();
        boolean boolean14 = mongoDBRiverDefinition1.mongoSecondaryReadPreference;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "script" + "'", str6, "script");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(strSet11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(basicDBObject13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.mongoAdminPassword("");
        java.lang.String[] strArray7 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        builder3.excludeFields = strSet8;
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = builder3.initialTimestamp;
        boolean boolean12 = builder3.advancedTransformation;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder3.statisticsIndexName("script_type");
        builder14.mongoSSLVerifyCertificate = false;
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.gettypeName();
        builder0.setmongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str5 = mongoDBRiverDefinition4.getFILTER_FIELD();
        java.lang.String str6 = mongoDBRiverDefinition4.getMongoCollection();
        boolean boolean7 = mongoDBRiverDefinition4.isMongoSSLVerifyCertificate();
        int int8 = mongoDBRiverDefinition4.getDEFAULT_BULK_ACTIONS();
        java.lang.String str9 = mongoDBRiverDefinition4.getSTORE_STATISTICS_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition4.getMongoCollection();
        java.lang.String str11 = mongoDBRiverDefinition4.scriptType;
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue12 = mongoDBRiverDefinition4.getDEFAULT_BULK_SIZE();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "filter" + "'", str5, "filter");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1000 + "'", int8 == 1000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "store_statistics" + "'", str9, "store_statistics");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(byteSizeValue12);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.gettypeName();
        builder0.setmongoDb("concurrent_bulk_requests");
        builder0.riverName = "throttle_size";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.socketTimeout((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.mongoAdminUser("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder9);
        int int11 = mongoDBRiverDefinition10.getSocketTimeout();
        boolean boolean12 = mongoDBRiverDefinition10.getmongoGridFS();
        java.lang.String str13 = mongoDBRiverDefinition10.riverIndexName;
        boolean boolean14 = mongoDBRiverDefinition10.mongoUseSSL;
        boolean boolean15 = mongoDBRiverDefinition10.storeStatistics;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.script("disable_index_refresh");
        com.mongodb.BasicDBObject basicDBObject5 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoCollectionFilter(basicDBObject5);
        builder4.setstoreStatistics(false);
        builder4.riverName = "secondary_read_preference";
        builder4.mongoGridFS = true;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder4.riverIndexName("mongodb-1638820218363");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter5 = builder2.serializedObjectSupporter;
        builder2.setmongoAdminPassword("mongodb-1638820218424");
        java.lang.String str8 = builder2.getriverName();
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter9 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings10 = serializedObjectSupporter9.deserializeObjectRiverSettings4();
        org.elasticsearch.river.RiverSettings riverSettings11 = serializedObjectSupporter9.deserializeObjectRiverSettings1();
        builder2.serializedObjectSupporter = serializedObjectSupporter9;
        java.lang.String str13 = serializedObjectSupporter9.deserializeObjectString8();
        org.elasticsearch.river.RiverSettings riverSettings14 = serializedObjectSupporter9.deserializeObjectRiverSettings9();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNull(serializedObjectSupporter5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(riverSettings10);
        org.junit.Assert.assertNull(riverSettings11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_river" + "'", str13, "_river");
        org.junit.Assert.assertNull(riverSettings14);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean2 = mongoDBRiverDefinition1.storeStatistics;
        java.lang.String str3 = mongoDBRiverDefinition1.getSTORE_STATISTICS_FIELD();
        com.mongodb.MongoClientOptions mongoClientOptions4 = mongoDBRiverDefinition1.getMongoClientOptions();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "store_statistics" + "'", str3, "store_statistics");
        org.junit.Assert.assertNull(mongoClientOptions4);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.mongoAdminPassword("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder9.mongoAdminPassword("");
        java.lang.String[] strArray16 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        builder12.excludeFields = strSet17;
        builder6.setexcludeFields((java.util.Set<java.lang.String>) strSet17);
        builder3.parentTypes = strSet17;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder22.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder24.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder27);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder27.mongoAdminPassword("");
        java.lang.String[] strArray34 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet35 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet35, strArray34);
        builder30.excludeFields = strSet35;
        builder24.setexcludeFields((java.util.Set<java.lang.String>) strSet35);
        builder3.setparentTypes((java.util.Set<java.lang.String>) strSet35);
        java.util.List<com.mongodb.ServerAddress> serverAddressList40 = builder3.getmongoServers();
        boolean boolean41 = builder3.getmongoUseSSL();
        com.mongodb.BasicDBObject basicDBObject42 = builder3.getmongoOplogFilter();
        org.bson.types.Binary binary43 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder3.initialTimestamp(binary43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(serverAddressList40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(basicDBObject42);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.gettypeName();
        builder0.setmongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = builder0.initialTimestamp;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.script("disable_index_refresh");
        com.mongodb.BasicDBObject basicDBObject5 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoCollectionFilter(basicDBObject5);
        java.util.Set<java.lang.String> strSet7 = builder6.getparentTypes();
        org.bson.types.BSONTimestamp bSONTimestamp8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder6.initialTimestamp(bSONTimestamp8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ts must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(strSet7);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder5.mongoAdminPassword("");
        java.lang.String[] strArray12 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        builder8.excludeFields = strSet13;
        builder2.setexcludeFields((java.util.Set<java.lang.String>) strSet13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder2.mongoUseSSL(false);
        java.lang.String str19 = builder18.getindexName();
        boolean boolean20 = builder18.getadvancedTransformation();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder18);
        java.lang.String str22 = mongoDBRiverDefinition21.getStatisticsIndexName();
        java.lang.String str23 = mongoDBRiverDefinition21.getNAME_FIELD();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "name" + "'", str23, "name");
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.gettypeName();
        builder0.setmongoDb("concurrent_bulk_requests");
        builder0.riverName = "throttle_size";
        boolean boolean6 = builder0.getadvancedTransformation();
        java.lang.String str7 = builder0.getmongoDb();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "concurrent_bulk_requests" + "'", str7, "concurrent_bulk_requests");
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder5.mongoAdminPassword("");
        java.lang.String[] strArray12 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        builder8.excludeFields = strSet13;
        builder2.setexcludeFields((java.util.Set<java.lang.String>) strSet13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder2.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder18);
        java.lang.String str20 = mongoDBRiverDefinition19.getSERVERS_FIELD();
        int int21 = mongoDBRiverDefinition19.getDEFAULT_DB_PORT();
        int int22 = mongoDBRiverDefinition19.getThrottleSize();
        java.lang.String str23 = mongoDBRiverDefinition19.getMongoDb();
        java.lang.String str24 = mongoDBRiverDefinition19.typeName;
        boolean boolean25 = mongoDBRiverDefinition19.getmongoUseSSL();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "servers" + "'", str20, "servers");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 27017 + "'", int21 == 27017);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder5.mongoAdminPassword("");
        java.lang.String[] strArray12 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        builder8.excludeFields = strSet13;
        builder2.setexcludeFields((java.util.Set<java.lang.String>) strSet13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder2.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder18);
        java.lang.String str20 = mongoDBRiverDefinition19.getRiverIndexName();
        java.lang.String str21 = mongoDBRiverDefinition19.getBULK_FIELD();
        boolean boolean22 = mongoDBRiverDefinition19.storeStatistics;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "bulk" + "'", str21, "bulk");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.elasticsearch.common.settings.Settings settings2 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder3);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder3.typeName("mongodb-1638820218449");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder12);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder12.mongoAdminPassword("");
        java.lang.String[] strArray19 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        builder15.excludeFields = strSet20;
        builder9.setexcludeFields((java.util.Set<java.lang.String>) strSet20);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder9.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition26 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder25);
        boolean boolean27 = builder25.dropCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder30.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder32.socketTimeout((int) (byte) 1);
        com.mongodb.BasicDBObject basicDBObject35 = builder34.getmongoCollectionFilter();
        builder25.setmongoCollectionFilter(basicDBObject35);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder6.mongoCollectionFilter(basicDBObject35);
        org.elasticsearch.river.RiverSettings riverSettings38 = new org.elasticsearch.river.RiverSettings(settings2, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject35);
        org.elasticsearch.script.ScriptService scriptService39 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition40 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("filter", "mongodb-1638820218264", riverSettings38, scriptService39);
        org.elasticsearch.common.settings.Settings settings41 = riverSettings38.globalSettings();
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(basicDBObject35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition40);
        org.junit.Assert.assertNull(settings41);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.socketTimeout((int) (byte) 1);
        com.mongodb.BasicDBObject basicDBObject7 = builder6.mongoOplogFilter;
        builder6.setmongoCollection("admin");
        builder6.typeName = "socket_timeout";
        java.lang.String str12 = builder6.typeName;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(basicDBObject7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "socket_timeout" + "'", str12, "socket_timeout");
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.getDISABLE_INDEX_REFRESH_FIELD();
        boolean boolean4 = mongoDBRiverDefinition2.isDisableIndexRefresh();
        java.lang.String str5 = mongoDBRiverDefinition2.getUSER_FIELD();
        java.lang.String str6 = mongoDBRiverDefinition2.getNAME_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition2.getFLUSH_INTERVAL_FIELD();
        java.lang.String str8 = mongoDBRiverDefinition2.mongoAdminUser;
        java.util.List<com.mongodb.ServerAddress> serverAddressList9 = mongoDBRiverDefinition2.mongoServers;
        java.lang.String str10 = mongoDBRiverDefinition2.getDEFAULT_DB_HOST();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "disable_index_refresh" + "'", str3, "disable_index_refresh");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "user" + "'", str5, "user");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "name" + "'", str6, "name");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "flush_interval" + "'", str7, "flush_interval");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(serverAddressList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "localhost" + "'", str10, "localhost");
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean2 = mongoDBRiverDefinition1.storeStatistics;
        boolean boolean3 = mongoDBRiverDefinition1.isDisableIndexRefresh();
        java.lang.String str4 = mongoDBRiverDefinition1.getMongoLocalUser();
        java.lang.String str5 = mongoDBRiverDefinition1.getIncludeCollection();
        org.elasticsearch.common.unit.TimeValue timeValue6 = mongoDBRiverDefinition1.getDEFAULT_FLUSH_INTERVAL();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(timeValue6);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        com.mongodb.BasicDBObject basicDBObject3 = null;
        builder0.setmongoOplogFilter(basicDBObject3);
        builder0.setmongoCollection("name");
        java.lang.String str7 = builder0.getmongoAdminPassword();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str9 = builder8.gettypeName();
        builder8.setmongoDb("concurrent_bulk_requests");
        builder8.riverName = "throttle_size";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder8.socketTimeout((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder8.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder18);
        boolean boolean20 = mongoDBRiverDefinition19.storeStatistics;
        boolean boolean21 = mongoDBRiverDefinition19.isDisableIndexRefresh();
        java.lang.String str22 = mongoDBRiverDefinition19.getMongoLocalUser();
        java.util.Set<java.lang.String> strSet23 = mongoDBRiverDefinition19.getIncludeFields();
        java.lang.String str24 = mongoDBRiverDefinition19.getINITIAL_TIMESTAMP_SCRIPT_FIELD();
        java.lang.String str25 = mongoDBRiverDefinition19.includeCollection;
        java.lang.String str26 = mongoDBRiverDefinition19.getMongoAdminPassword();
        java.lang.String str27 = mongoDBRiverDefinition19.getDROP_COLLECTION_FIELD();
        java.lang.String str28 = mongoDBRiverDefinition19.mongoAdminPassword;
        java.lang.String str29 = mongoDBRiverDefinition19.getMongoCollection();
        com.mongodb.BasicDBObject basicDBObject30 = mongoDBRiverDefinition19.getMongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder17.mongoOplogFilter(basicDBObject30);
        builder0.setmongoOplogFilter(basicDBObject30);
        java.lang.String str33 = builder0.indexName;
        java.lang.String str34 = builder0.script;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition35 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet36 = mongoDBRiverDefinition35.getIncludeFields();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(strSet23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "script" + "'", str24, "script");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "drop_collection" + "'", str27, "drop_collection");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(basicDBObject30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(strSet36);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((float) (short) 100);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter9 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString4();
        java.lang.String str11 = serializedObjectSupporter9.deserializeObjectString1();
        docScoreSearchScript0.setNextVar("include_fields", (java.lang.Object) str11);
        docScoreSearchScript0.setNextScore((float) 1L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder21);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder21.mongoAdminPassword("");
        java.lang.String[] strArray28 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet29 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet29, strArray28);
        builder24.excludeFields = strSet29;
        builder18.setexcludeFields((java.util.Set<java.lang.String>) strSet29);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder18.mongoUseSSL(false);
        java.lang.String str35 = builder34.getindexName();
        boolean boolean36 = builder34.disableIndexRefresh;
        com.mongodb.MongoClientOptions mongoClientOptions37 = null;
        builder34.mongoClientOptions = mongoClientOptions37;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition39 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder34);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter40 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str41 = serializedObjectSupporter40.deserializeObjectString4();
        org.elasticsearch.river.RiverSettings riverSettings42 = serializedObjectSupporter40.deserializeObjectRiverSettings7();
        java.lang.String str43 = serializedObjectSupporter40.deserializeObjectString15();
        mongoDBRiverDefinition39.serializedObjectSupporter = serializedObjectSupporter40;
        java.lang.String str45 = mongoDBRiverDefinition39.getSCRIPT_FIELD();
        docScoreSearchScript0.setNextVar("port", (java.lang.Object) mongoDBRiverDefinition39);
        org.apache.lucene.search.Scorer scorer47 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setScorer(scorer47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_river" + "'", str10, "_river");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "mongodb-1638820217755" + "'", str11, "mongodb-1638820217755");
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "_river" + "'", str41, "_river");
        org.junit.Assert.assertNull(riverSettings42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "mongodb-1638820218424" + "'", str43, "mongodb-1638820218424");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "script" + "'", str45, "script");
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.script("disable_index_refresh");
        com.mongodb.BasicDBObject basicDBObject5 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoCollectionFilter(basicDBObject5);
        java.lang.String str7 = builder4.typeName;
        builder4.setdropCollection(true);
        builder4.settypeName("index");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.getDISABLE_INDEX_REFRESH_FIELD();
        java.util.List<com.mongodb.ServerAddress> serverAddressList4 = mongoDBRiverDefinition2.getMongoServers();
        boolean boolean5 = mongoDBRiverDefinition2.disableIndexRefresh;
        boolean boolean6 = mongoDBRiverDefinition2.mongoGridFS;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "disable_index_refresh" + "'", str3, "disable_index_refresh");
        org.junit.Assert.assertNotNull(serverAddressList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.script("disable_index_refresh");
        com.mongodb.BasicDBObject basicDBObject5 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoCollectionFilter(basicDBObject5);
        builder4.setstoreStatistics(false);
        builder4.riverName = "secondary_read_preference";
        builder4.mongoGridFS = true;
        java.lang.String str13 = builder4.getindexName();
        int int14 = builder4.connectTimeout;
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = builder4.getinitialTimestamp();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(wildcardTimestamp15);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter5 = builder2.serializedObjectSupporter;
        builder2.setmongoAdminPassword("mongodb-1638820218424");
        java.lang.String str8 = builder2.getriverName();
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter9 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings10 = serializedObjectSupporter9.deserializeObjectRiverSettings4();
        org.elasticsearch.river.RiverSettings riverSettings11 = serializedObjectSupporter9.deserializeObjectRiverSettings1();
        builder2.serializedObjectSupporter = serializedObjectSupporter9;
        builder2.script = "include_fields";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder2.disableIndexRefresh(true);
        builder16.throttleSize = (short) -1;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNull(serializedObjectSupporter5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(riverSettings10);
        org.junit.Assert.assertNull(riverSettings11);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.script("disable_index_refresh");
        com.mongodb.BasicDBObject basicDBObject5 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoCollectionFilter(basicDBObject5);
        builder6.statisticsIndexName = "host";
        builder6.setmongoAdminUser("skip_initial_import");
        builder6.setdropCollection(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions14 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder13.mongoClientOptions(mongoClientOptions14);
        builder15.setsocketTimeout((int) '4');
        builder15.setscript("flush_interval");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter20 = builder15.serializedObjectSupporter;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str22 = builder21.gettypeName();
        builder21.setmongoDb("concurrent_bulk_requests");
        builder21.riverName = "throttle_size";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder21.socketTimeout((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder21.mongoAdminUser("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition31 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder30);
        com.mongodb.ServerAddress[] serverAddressArray32 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList33 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList33, serverAddressArray32);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder30.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList33);
        builder15.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList33);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder6.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList33);
        java.lang.Class<?> wildcardClass38 = serverAddressList33.getClass();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNull(serializedObjectSupporter20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(serverAddressArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        com.mongodb.BasicDBObject basicDBObject3 = null;
        builder0.setmongoOplogFilter(basicDBObject3);
        boolean boolean5 = builder0.importAllCollections;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.mongoLocalPassword("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str9 = builder8.gettypeName();
        builder8.setmongoDb("concurrent_bulk_requests");
        builder8.riverName = "throttle_size";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder8.socketTimeout((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder8.mongoAdminUser("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder17);
        com.mongodb.ServerAddress[] serverAddressArray19 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList20 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList20, serverAddressArray19);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder17.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList20);
        builder0.mongoServers = serverAddressList20;
        builder0.mongoAdminPassword = "disable_index_refresh";
        builder0.setmongoSecondaryReadPreference(true);
        java.util.Set<java.lang.String> strSet28 = builder0.excludeFields;
        builder0.setsocketTimeout((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(serverAddressArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNull(strSet28);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder5.mongoAdminPassword("");
        java.lang.String[] strArray12 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        builder8.excludeFields = strSet13;
        builder2.setexcludeFields((java.util.Set<java.lang.String>) strSet13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder2.mongoUseSSL(false);
        builder2.storeStatistics = false;
        boolean boolean21 = builder2.importAllCollections;
        builder2.setthrottleSize((int) (byte) 0);
        builder2.setmongoAdminPassword("filter");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder26);
        boolean boolean28 = mongoDBRiverDefinition27.storeStatistics;
        boolean boolean29 = mongoDBRiverDefinition27.isDisableIndexRefresh();
        java.lang.String str30 = mongoDBRiverDefinition27.getMongoLocalUser();
        java.util.Set<java.lang.String> strSet31 = mongoDBRiverDefinition27.getIncludeFields();
        java.lang.String str32 = mongoDBRiverDefinition27.getINITIAL_TIMESTAMP_SCRIPT_FIELD();
        java.lang.String str33 = mongoDBRiverDefinition27.includeCollection;
        java.lang.String str34 = mongoDBRiverDefinition27.getMongoAdminPassword();
        java.lang.String str35 = mongoDBRiverDefinition27.getSECONDARY_READ_PREFERENCE_FIELD();
        int int36 = mongoDBRiverDefinition27.socketTimeout;
        boolean boolean37 = mongoDBRiverDefinition27.disableIndexRefresh;
        boolean boolean38 = mongoDBRiverDefinition27.getimportAllCollections();
        boolean boolean39 = mongoDBRiverDefinition27.getmongoUseSSL();
        com.mongodb.BasicDBObject basicDBObject40 = mongoDBRiverDefinition27.mongoCollectionFilter;
        builder2.mongoCollectionFilter = basicDBObject40;
        builder2.setdisableIndexRefresh(false);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNull(strSet31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "script" + "'", str32, "script");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "secondary_read_preference" + "'", str35, "secondary_read_preference");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(basicDBObject40);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.typeName("mongodb-1638820218449");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.importAllCollections(false);
        boolean boolean6 = builder5.getmongoSecondaryReadPreference();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder5.mongoDb("store_statistics");
        java.lang.String str9 = builder8.getscriptType();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean2 = mongoDBRiverDefinition1.storeStatistics;
        boolean boolean3 = mongoDBRiverDefinition1.isSkipInitialImport();
        java.lang.String str4 = mongoDBRiverDefinition1.getMongoCollection();
        java.lang.String str5 = mongoDBRiverDefinition1.getGRIDFS_FIELD();
        java.lang.String str6 = mongoDBRiverDefinition1.getCOLLECTION_FIELD();
        com.mongodb.BasicDBObject basicDBObject7 = mongoDBRiverDefinition1.mongoOplogFilter;
        java.lang.String str8 = mongoDBRiverDefinition1.mongoLocalUser;
        java.lang.String str9 = mongoDBRiverDefinition1.getSECONDARY_READ_PREFERENCE_FIELD();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "gridfs" + "'", str5, "gridfs");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "collection" + "'", str6, "collection");
        org.junit.Assert.assertNull(basicDBObject7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "secondary_read_preference" + "'", str9, "secondary_read_preference");
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.typeName("mongodb-1638820218449");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.importAllCollections(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.riverName("parent_types");
        boolean boolean8 = builder0.importAllCollections;
        builder0.throttleSize = 1;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder11);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder11.mongoAdminPassword("");
        java.lang.String[] strArray18 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        builder14.excludeFields = strSet19;
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp22 = builder14.initialTimestamp;
        boolean boolean23 = builder14.advancedTransformation;
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter24 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings25 = serializedObjectSupporter24.deserializeObjectRiverSettings4();
        java.lang.String str26 = serializedObjectSupporter24.deserializeObjectString16();
        builder14.serializedObjectSupporter = serializedObjectSupporter24;
        org.elasticsearch.river.RiverSettings riverSettings28 = serializedObjectSupporter24.deserializeObjectRiverSettings4();
        builder0.serializedObjectSupporter = serializedObjectSupporter24;
        com.mongodb.MongoClientOptions mongoClientOptions30 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder0.mongoClientOptions(mongoClientOptions30);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions33 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder32.mongoClientOptions(mongoClientOptions33);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.script("disable_index_refresh");
        com.mongodb.BasicDBObject basicDBObject37 = builder36.mongoCollectionFilter;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder31.mongoOplogFilter(basicDBObject37);
        builder31.importAllCollections = false;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder31.includeCollection("concurrent_requests");
        boolean boolean43 = builder31.advancedTransformation;
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNull(wildcardTimestamp22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(riverSettings25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "_river" + "'", str26, "_river");
        org.junit.Assert.assertNull(riverSettings28);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(basicDBObject37);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter5 = builder2.serializedObjectSupporter;
        builder2.setmongoAdminPassword("mongodb-1638820218424");
        java.lang.String str8 = builder2.getriverName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str10 = builder9.gettypeName();
        builder9.setmongoDb("concurrent_bulk_requests");
        builder9.riverName = "throttle_size";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder9.socketTimeout((int) (byte) 0);
        java.util.Set<java.lang.String> strSet17 = builder16.getparentTypes();
        builder16.setconnectTimeout(0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder22.mongoAdminUser("disable_index_refresh");
        java.util.Set<java.lang.String> strSet25 = builder22.excludeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder22.scriptType("mongodb-1638820218387");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.mongoLocalPassword("_river");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder27.riverIndexName("mongodb-1638820218387");
        java.util.List<com.mongodb.ServerAddress> serverAddressList32 = builder31.getmongoServers();
        builder16.setmongoServers(serverAddressList32);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder2.mongoServers(serverAddressList32);
        builder34.setsocketTimeout(32);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNull(serializedObjectSupporter5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNull(strSet17);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNull(strSet25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(serverAddressList32);
        org.junit.Assert.assertNotNull(builder34);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("mongodb-1638820218326", "filter");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?filter? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean2 = mongoDBRiverDefinition1.storeStatistics;
        boolean boolean3 = mongoDBRiverDefinition1.isDisableIndexRefresh();
        java.lang.String str4 = mongoDBRiverDefinition1.getMongoLocalUser();
        java.lang.String str5 = mongoDBRiverDefinition1.getINCLUDE_FIELDS_FIELD();
        java.util.Set<java.lang.String> strSet6 = mongoDBRiverDefinition1.includeFields;
        boolean boolean7 = mongoDBRiverDefinition1.mongoSSLVerifyCertificate;
        org.elasticsearch.common.logging.ESLogger eSLogger8 = mongoDBRiverDefinition1.getlogger();
        int int9 = mongoDBRiverDefinition1.getDEFAULT_BULK_ACTIONS();
        boolean boolean10 = mongoDBRiverDefinition1.isMongoSSLVerifyCertificate();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "include_fields" + "'", str5, "include_fields");
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(eSLogger8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1000 + "'", int9 == 1000);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("name", "index", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?index?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("collection");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?collection?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder5.mongoAdminPassword("");
        java.lang.String[] strArray12 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        builder8.excludeFields = strSet13;
        builder2.setexcludeFields((java.util.Set<java.lang.String>) strSet13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder2.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder18);
        java.lang.String str20 = mongoDBRiverDefinition19.getFILTER_FIELD();
        boolean boolean21 = mongoDBRiverDefinition19.skipInitialImport;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "filter" + "'", str20, "filter");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.mongoAdminPassword("");
        java.lang.String[] strArray7 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet8 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet8, strArray7);
        builder3.excludeFields = strSet8;
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = builder3.initialTimestamp;
        boolean boolean12 = builder3.advancedTransformation;
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter13 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings14 = serializedObjectSupporter13.deserializeObjectRiverSettings4();
        java.lang.String str15 = serializedObjectSupporter13.deserializeObjectString16();
        builder3.serializedObjectSupporter = serializedObjectSupporter13;
        builder3.mongoSecondaryReadPreference = false;
        org.bson.types.Binary binary19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder3.initialTimestamp(binary19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(riverSettings14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_river" + "'", str15, "_river");
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        com.mongodb.BasicDBObject basicDBObject3 = null;
        builder0.setmongoOplogFilter(basicDBObject3);
        boolean boolean5 = builder0.importAllCollections;
        builder0.setmongoGridFS(false);
        int int8 = builder0.throttleSize;
        java.lang.String str9 = builder0.getscript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder0.mongoSSLVerifyCertificate(false);
        builder0.setincludeCollection("ssl_verify_certificate");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder15.socketTimeout = (short) 10;
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter18 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings19 = serializedObjectSupporter18.deserializeObjectRiverSettings4();
        java.lang.String str20 = serializedObjectSupporter18.deserializeObjectString11();
        org.elasticsearch.river.RiverSettings riverSettings21 = serializedObjectSupporter18.deserializeObjectRiverSettings5();
        org.elasticsearch.river.RiverSettings riverSettings22 = serializedObjectSupporter18.deserializeObjectRiverSettings3();
        builder15.serializedObjectSupporter = serializedObjectSupporter18;
        java.lang.String str24 = serializedObjectSupporter18.deserializeObjectString13();
        mongoDBRiverDefinition14.serializedObjectSupporter = serializedObjectSupporter18;
        boolean boolean26 = mongoDBRiverDefinition14.mongoGridFS;
        java.lang.String str27 = mongoDBRiverDefinition14.getSSL_CONNECTION_FIELD();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNull(riverSettings19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "mongodb-1638820218387" + "'", str20, "mongodb-1638820218387");
        org.junit.Assert.assertNull(riverSettings21);
        org.junit.Assert.assertNull(riverSettings22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "mongodb-1638820218408" + "'", str24, "mongodb-1638820218408");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ssl" + "'", str27, "ssl");
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean2 = mongoDBRiverDefinition1.storeStatistics;
        boolean boolean3 = mongoDBRiverDefinition1.isDisableIndexRefresh();
        java.lang.String str4 = mongoDBRiverDefinition1.getADMIN_DB_FIELD();
        java.lang.String str5 = mongoDBRiverDefinition1.getMongoLocalUser();
        java.util.List<com.mongodb.ServerAddress> serverAddressList6 = mongoDBRiverDefinition1.getMongoServers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(serverAddressList6);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoLocalUser = "store_statistics";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.indexName("initial_timestamp");
        builder0.setstoreStatistics(true);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.socketTimeout((int) (byte) 1);
        com.mongodb.BasicDBObject basicDBObject7 = builder6.mongoOplogFilter;
        builder6.setindexName("script");
        builder6.mongoAdminPassword = "size";
        java.lang.String str12 = builder6.typeName;
        builder6.script = "concurrent_bulk_requests.null";
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(basicDBObject7);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString11();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString12();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        org.elasticsearch.river.RiverSettings riverSettings4 = serializedObjectSupporter0.deserializeObjectRiverSettings2();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb-1638820218387" + "'", str1, "mongodb-1638820218387");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_river" + "'", str2, "_river");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_river" + "'", str3, "_river");
        org.junit.Assert.assertNull(riverSettings4);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        com.mongodb.BasicDBObject basicDBObject3 = null;
        builder0.setmongoOplogFilter(basicDBObject3);
        boolean boolean5 = builder0.importAllCollections;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.mongoLocalPassword("name");
        builder0.mongoLocalPassword = "concurrent_bulk_requests";
        builder0.setscriptType("flush_interval");
        java.lang.String str12 = builder0.getindexName();
        builder0.disableIndexRefresh = true;
        builder0.setstoreStatistics(false);
        java.lang.String str17 = builder0.mongoDb;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean2 = mongoDBRiverDefinition1.storeStatistics;
        boolean boolean3 = mongoDBRiverDefinition1.isSkipInitialImport();
        java.lang.String str4 = mongoDBRiverDefinition1.getMongoCollection();
        boolean boolean5 = mongoDBRiverDefinition1.getadvancedTransformation();
        boolean boolean6 = mongoDBRiverDefinition1.getmongoGridFS();
        boolean boolean7 = mongoDBRiverDefinition1.isDisableIndexRefresh();
        boolean boolean8 = mongoDBRiverDefinition1.isAdvancedTransformation();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder5.mongoAdminPassword("");
        java.lang.String[] strArray12 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        builder8.excludeFields = strSet13;
        builder2.setexcludeFields((java.util.Set<java.lang.String>) strSet13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder2.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter19 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str20 = serializedObjectSupporter19.deserializeObjectString4();
        org.elasticsearch.river.RiverSettings riverSettings21 = serializedObjectSupporter19.deserializeObjectRiverSettings7();
        org.elasticsearch.river.RiverSettings riverSettings22 = serializedObjectSupporter19.deserializeObjectRiverSettings5();
        org.elasticsearch.river.RiverSettings riverSettings23 = serializedObjectSupporter19.deserializeObjectRiverSettings6();
        builder2.serializedObjectSupporter = serializedObjectSupporter19;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "_river" + "'", str20, "_river");
        org.junit.Assert.assertNull(riverSettings21);
        org.junit.Assert.assertNull(riverSettings22);
        org.junit.Assert.assertNull(riverSettings23);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.socketTimeout((int) (byte) 1);
        builder6.setimportAllCollections(false);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter9 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings10 = serializedObjectSupporter9.deserializeObjectRiverSettings4();
        org.elasticsearch.river.RiverSettings riverSettings11 = serializedObjectSupporter9.deserializeObjectRiverSettings9();
        java.lang.String str12 = serializedObjectSupporter9.deserializeObjectString2();
        builder6.serializedObjectSupporter = serializedObjectSupporter9;
        java.lang.String str14 = serializedObjectSupporter9.deserializeObjectString1();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(riverSettings10);
        org.junit.Assert.assertNull(riverSettings11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_river" + "'", str12, "_river");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "mongodb-1638820217755" + "'", str14, "mongodb-1638820217755");
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.typeName("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder2.skipInitialImport(true);
        java.lang.String str8 = builder7.getmongoDb();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder7.riverName("include_fields");
        com.mongodb.MongoClientOptions mongoClientOptions11 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoClientOptions(mongoClientOptions11);
        boolean boolean13 = builder10.mongoSSLVerifyCertificate;
        org.bson.types.BSONTimestamp bSONTimestamp14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder10.initialTimestamp(bSONTimestamp14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ts must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoAdminUser("disable_index_refresh");
        boolean boolean5 = builder2.getimportAllCollections();
        builder2.setmongoCollection("mongodb-1638820218387");
        builder2.statisticsIndexName = "drop_collection";
        java.lang.String str10 = builder2.mongoAdminPassword;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder5.mongoAdminPassword("");
        java.lang.String[] strArray12 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        builder8.excludeFields = strSet13;
        builder2.setexcludeFields((java.util.Set<java.lang.String>) strSet13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder2.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder18);
        java.lang.String str20 = mongoDBRiverDefinition19.getRiverIndexName();
        java.lang.String str21 = mongoDBRiverDefinition19.getMongoCollection();
        boolean boolean22 = mongoDBRiverDefinition19.getdisableIndexRefresh();
        java.lang.String str23 = mongoDBRiverDefinition19.getUSER_FIELD();
        java.lang.String str24 = mongoDBRiverDefinition19.getCONNECTION_TIMEOUT();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "user" + "'", str23, "user");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "connect_timeout" + "'", str24, "connect_timeout");
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = builder0.riverIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.mongoCollection("");
        builder4.setmongoSSLVerifyCertificate(false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        java.util.Set<java.lang.String> strSet3 = builder2.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.typeName("port");
        builder5.mongoCollection = "index";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder5.mongoDb("flush_interval");
        java.lang.String str10 = builder9.mongoLocalPassword;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        com.mongodb.BasicDBObject basicDBObject3 = null;
        builder0.setmongoOplogFilter(basicDBObject3);
        java.lang.String str5 = builder0.getmongoLocalPassword();
        builder0.mongoSSLVerifyCertificate = false;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        builder8.dropCollection = false;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder13);
        com.mongodb.BasicDBObject basicDBObject16 = null;
        builder13.setmongoOplogFilter(basicDBObject16);
        boolean boolean18 = builder13.importAllCollections;
        java.lang.String[] strArray32 = new java.lang.String[] { "concurrent_bulk_requests", "host", "hi!", "bulk_size", "drop_collection", "mongodb-1638820218387", "servers", "host", "disable_index_refresh", "mongodb-1638820218387", "", "bulk_size", "mongodb-1638820218387" };
        java.util.LinkedHashSet<java.lang.String> strSet33 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet33, strArray32);
        builder13.parentTypes = strSet33;
        builder8.setparentTypes((java.util.Set<java.lang.String>) strSet33);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder0.includeFields((java.util.Set<java.lang.String>) strSet33);
        boolean boolean38 = builder0.importAllCollections;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition39 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        int int40 = builder0.socketTimeout;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder2.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder2.mongoAdminUser("mongodb-1638820218408");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = builder8.initialTimestamp;
        java.util.Set<java.lang.String> strSet10 = builder8.parentTypes;
        java.lang.String str11 = builder8.statisticsTypeName;
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertNull(strSet10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder5.mongoAdminPassword("");
        java.lang.String[] strArray12 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        builder8.excludeFields = strSet13;
        builder2.setexcludeFields((java.util.Set<java.lang.String>) strSet13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder2.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder18);
        java.lang.String str20 = mongoDBRiverDefinition19.getADMIN_DB_FIELD();
        java.lang.String str21 = mongoDBRiverDefinition19.typeName;
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter22 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings23 = serializedObjectSupporter22.deserializeObjectRiverSettings4();
        java.lang.String str24 = serializedObjectSupporter22.deserializeObjectString11();
        org.elasticsearch.river.RiverSettings riverSettings25 = serializedObjectSupporter22.deserializeObjectRiverSettings5();
        org.elasticsearch.river.RiverSettings riverSettings26 = serializedObjectSupporter22.deserializeObjectRiverSettings9();
        java.lang.String str27 = serializedObjectSupporter22.deserializeObjectString1();
        mongoDBRiverDefinition19.serializedObjectSupporter = serializedObjectSupporter22;
        java.lang.String str29 = serializedObjectSupporter22.deserializeObjectString8();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "admin" + "'", str20, "admin");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(riverSettings23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "mongodb-1638820218387" + "'", str24, "mongodb-1638820218387");
        org.junit.Assert.assertNull(riverSettings25);
        org.junit.Assert.assertNull(riverSettings26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "mongodb-1638820217755" + "'", str27, "mongodb-1638820217755");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "_river" + "'", str29, "_river");
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder2.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder5.mongoAdminPassword("");
        java.lang.String[] strArray12 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        builder8.excludeFields = strSet13;
        builder2.setexcludeFields((java.util.Set<java.lang.String>) strSet13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder2.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder18);
        builder18.setmongoDb("drop_collection");
        builder18.setstatisticsIndexName("host");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        com.mongodb.MongoClientOptions mongoClientOptions1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = builder0.mongoClientOptions(mongoClientOptions1);
        int int3 = builder0.getsocketTimeout();
        boolean boolean4 = builder0.mongoSecondaryReadPreference;
        java.util.Set<java.lang.String> strSet5 = builder0.getexcludeFields();
        java.lang.String str6 = builder0.getscriptType();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((float) (short) 100);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter9 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString4();
        java.lang.String str11 = serializedObjectSupporter9.deserializeObjectString1();
        docScoreSearchScript0.setNextVar("include_fields", (java.lang.Object) str11);
        docScoreSearchScript0.setNextScore((float) 1L);
        docScoreSearchScript0.setNextScore((float) 10L);
        org.apache.lucene.index.AtomicReaderContext atomicReaderContext17 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextReader(atomicReaderContext17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_river" + "'", str10, "_river");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "mongodb-1638820217755" + "'", str11, "mongodb-1638820217755");
    }
}

