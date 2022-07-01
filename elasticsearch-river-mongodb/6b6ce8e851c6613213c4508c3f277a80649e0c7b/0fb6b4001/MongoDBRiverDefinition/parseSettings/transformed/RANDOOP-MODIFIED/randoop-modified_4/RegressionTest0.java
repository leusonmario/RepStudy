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
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.CONCURRENT_BULK_REQUESTS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "concurrent_bulk_requests" + "'", str0, "concurrent_bulk_requests");
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.BULK_SIZE_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "bulk_size" + "'", str0, "bulk_size");
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
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.GRIDFS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "gridfs" + "'", str0, "gridfs");
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DEFAULT_BULK_SIZE;
        org.junit.Assert.assertNotNull(byteSizeValue0);
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
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
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.INDEX_OBJECT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index" + "'", str0, "index");
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.OPTIONS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "options" + "'", str0, "options");
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.INITIAL_TIMESTAMP_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "initial_timestamp" + "'", str0, "initial_timestamp");
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.PORT_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "port" + "'", str0, "port");
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        int int0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DEFAULT_CONCURRENT_REQUESTS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = builder0.statisticsTypeName;
        org.bson.types.Binary binary4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.initialTimestamp(binary4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.setmongoOplogFilter(basicDBObject4);
        org.bson.types.BSONTimestamp bSONTimestamp6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.initialTimestamp(bSONTimestamp6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ts must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(mongoClientOptions3);
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.SECONDARY_READ_PREFERENCE_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "secondary_read_preference" + "'", str0, "secondary_read_preference");
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        int int0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DEFAULT_BULK_ACTIONS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1000 + "'", int0 == 1000);
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.SIZE_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "size" + "'", str0, "size");
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder2);
        java.util.Set<java.lang.String> strSet4 = builder2.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions5 = builder2.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject6 = null;
        builder2.setmongoOplogFilter(basicDBObject6);
        com.mongodb.BasicDBObject basicDBObject8 = builder2.getmongoCollectionFilter();
        builder1.mongoCollectionFilter = basicDBObject8;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertNull(mongoClientOptions5);
        org.junit.Assert.assertNotNull(basicDBObject8);
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.EXCLUDE_FIELDS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "exclude_fields" + "'", str0, "exclude_fields");
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.FLUSH_INTERVAL_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "flush_interval" + "'", str0, "flush_interval");
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        builder0.setsocketTimeout(0);
        builder0.mongoAdminUser = "collection";
        boolean boolean6 = builder0.getdisableIndexRefresh();
        org.bson.types.BSONTimestamp bSONTimestamp7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.initialTimestamp(bSONTimestamp7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ts must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.PARENT_TYPES_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "parent_types" + "'", str0, "parent_types");
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DEFAULT_DB_HOST;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "localhost" + "'", str0, "localhost");
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        java.lang.String str4 = builder0.mongoAdminUser;
        org.bson.types.Binary binary5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.initialTimestamp(binary5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        javax.net.SocketFactory socketFactory0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.getSSLSocketFactory();
        org.junit.Assert.assertNotNull(socketFactory0);
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.THROTTLE_SIZE_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "throttle_size" + "'", str0, "throttle_size");
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.mongoOplogFilter = basicDBObject4;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = builder0.build();
        builder0.setstatisticsIndexName("secondary_read_preference");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition6);
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.BULK_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "bulk" + "'", str0, "bulk");
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.CONCURRENT_REQUESTS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "concurrent_requests" + "'", str0, "concurrent_requests");
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DROP_COLLECTION_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "drop_collection" + "'", str0, "drop_collection");
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.INCLUDE_FIELDS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "include_fields" + "'", str0, "include_fields");
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("size", "size");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?size?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.SSL_CONNECTION_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ssl" + "'", str0, "ssl");
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DISABLE_INDEX_REFRESH_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "disable_index_refresh" + "'", str0, "disable_index_refresh");
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.USER_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "user" + "'", str0, "user");
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
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
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.getCONNECTION_TIMEOUT();
        java.lang.String str4 = mongoDBRiverDefinition2.getCREDENTIALS_FIELD();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue5 = mongoDBRiverDefinition2.getDEFAULT_BULK_SIZE();
        java.lang.String str6 = mongoDBRiverDefinition2.indexName;
        java.lang.String str7 = mongoDBRiverDefinition2.getCONNECTION_TIMEOUT();
        int int8 = mongoDBRiverDefinition2.getSocketTimeout();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "connect_timeout" + "'", str3, "connect_timeout");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "credentials" + "'", str4, "credentials");
        org.junit.Assert.assertNotNull(byteSizeValue5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "connect_timeout" + "'", str7, "connect_timeout");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.TYPE_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "type" + "'", str0, "type");
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.INCLUDE_COLLECTION_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "include_collection" + "'", str0, "include_collection");
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
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
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.INITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "script_type" + "'", str0, "script_type");
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.Settings settings1 = null;
        org.elasticsearch.common.settings.Settings settings2 = null;
        org.elasticsearch.common.settings.Settings settings3 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder4);
        java.util.Set<java.lang.String> strSet6 = builder4.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject8 = null;
        builder4.setmongoOplogFilter(basicDBObject8);
        com.mongodb.BasicDBObject basicDBObject10 = builder4.getmongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings11 = new org.elasticsearch.river.RiverSettings(settings3, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject10);
        org.elasticsearch.river.RiverSettings riverSettings12 = new org.elasticsearch.river.RiverSettings(settings2, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject10);
        org.elasticsearch.river.RiverSettings riverSettings13 = new org.elasticsearch.river.RiverSettings(settings1, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject10);
        org.elasticsearch.river.RiverSettings riverSettings14 = new org.elasticsearch.river.RiverSettings(settings0, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject10);
        org.elasticsearch.common.settings.Settings settings15 = riverSettings14.globalSettings();
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertNull(mongoClientOptions7);
        org.junit.Assert.assertNotNull(basicDBObject10);
        org.junit.Assert.assertNull(settings15);
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.IMPORT_ALL_COLLECTIONS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "import_all_collections" + "'", str0, "import_all_collections");
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.FILTER_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "filter" + "'", str0, "filter");
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.SCRIPT_TYPE_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "script_type" + "'", str0, "script_type");
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.SOCKET_TIMEOUT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "socket_timeout" + "'", str0, "socket_timeout");
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("concurrent_requests", "concurrent_bulk_requests");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?concurrent_bulk_requests?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("throttle_size", "gridfs");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?gridfs?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("collection", "script");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?script?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.setmongoOplogFilter(basicDBObject4);
        boolean boolean6 = builder0.dropCollection;
        com.mongodb.ServerAddress[] serverAddressArray7 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList8 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList8, serverAddressArray7);
        builder0.mongoServers = serverAddressList8;
        java.lang.String str11 = builder0.mongoAdminPassword;
        java.lang.String str12 = builder0.getscriptType();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder0.connectTimeout(27017);
        java.lang.String str15 = builder0.mongoLocalUser;
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(serverAddressArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("collection", "parent_types");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?parent_types?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.statisticsTypeName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean6 = mongoDBRiverDefinition5.isStoreStatistics();
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.SERVERS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "servers" + "'", str0, "servers");
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.SSL_VERIFY_CERT_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ssl_verify_certificate" + "'", str0, "ssl_verify_certificate");
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.mongoCollection;
        builder0.setmongoUseSSL(false);
        builder0.setconnectTimeout(0);
        boolean boolean6 = builder0.getmongoUseSSL();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.mongoAdminPassword("exclude_fields");
        builder8.settypeName("drop_collection");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.LOCAL_DB_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "local" + "'", str0, "local");
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.BULK_TIMEOUT_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "bulk_timeout" + "'", str0, "bulk_timeout");
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        builder0.setsocketTimeout(0);
        builder0.mongoAdminUser = "collection";
        builder0.mongoLocalUser = "bulk";
        org.bson.types.BSONTimestamp bSONTimestamp8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.initialTimestamp(bSONTimestamp8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ts must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        builder0.setstoreStatistics(false);
        builder0.mongoLocalPassword = "hi!";
        boolean boolean6 = builder0.getmongoSecondaryReadPreference();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("bulk_size", "parent_types");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?parent_types?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.ADMIN_DB_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "admin" + "'", str0, "admin");
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.STORE_STATISTICS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "store_statistics" + "'", str0, "store_statistics");
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoUseSSL(true);
        builder0.storeStatistics = true;
        builder0.throttleSize = 1;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        org.elasticsearch.common.unit.TimeValue timeValue0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DEFAULT_FLUSH_INTERVAL;
        org.junit.Assert.assertNotNull(timeValue0);
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.INITIAL_TIMESTAMP_SCRIPT_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "script" + "'", str0, "script");
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) (-1));
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str7 = builder6.typeName;
        com.mongodb.BasicDBObject basicDBObject8 = null;
        builder6.mongoCollectionFilter = basicDBObject8;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder6.mongoAdminPassword("db");
        docScoreSearchScript0.setNextVar("bulk_size", (java.lang.Object) builder6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj13 = docScoreSearchScript0.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1) + "'", obj4, (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.getCONNECTION_TIMEOUT();
        java.lang.String str4 = mongoDBRiverDefinition2.getCREDENTIALS_FIELD();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue5 = mongoDBRiverDefinition2.getDEFAULT_BULK_SIZE();
        java.lang.String str6 = mongoDBRiverDefinition2.indexName;
        java.lang.String str7 = mongoDBRiverDefinition2.getBULK_SIZE_FIELD();
        int int8 = mongoDBRiverDefinition2.getDEFAULT_CONCURRENT_REQUESTS();
        org.elasticsearch.common.unit.TimeValue timeValue9 = mongoDBRiverDefinition2.getDEFAULT_FLUSH_INTERVAL();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "connect_timeout" + "'", str3, "connect_timeout");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "credentials" + "'", str4, "credentials");
        org.junit.Assert.assertNotNull(byteSizeValue5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "bulk_size" + "'", str7, "bulk_size");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertNotNull(timeValue9);
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.NAME_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "name" + "'", str0, "name");
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.CONNECTION_TIMEOUT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "connect_timeout" + "'", str0, "connect_timeout");
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.SKIP_INITIAL_IMPORT_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "skip_initial_import" + "'", str0, "skip_initial_import");
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet3 = mongoDBRiverDefinition2.getIncludeFields();
        java.lang.String str4 = mongoDBRiverDefinition2.getSSL_VERIFY_CERT_FIELD();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ssl_verify_certificate" + "'", str4, "ssl_verify_certificate");
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.PASSWORD_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "password" + "'", str0, "password");
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.CREDENTIALS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "credentials" + "'", str0, "credentials");
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DB_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "db" + "'", str0, "db");
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.getCONNECTION_TIMEOUT();
        java.lang.String str4 = mongoDBRiverDefinition2.getOPTIONS_FIELD();
        boolean boolean5 = mongoDBRiverDefinition2.isMongoGridFS();
        java.lang.String str6 = mongoDBRiverDefinition2.getMongoLocalPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "connect_timeout" + "'", str3, "connect_timeout");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "options" + "'", str4, "options");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        docScoreSearchScript0.setNextScore(100.0f);
        org.elasticsearch.common.settings.Settings settings5 = null;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory6 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.common.settings.Settings settings7 = null;
        org.elasticsearch.common.settings.Settings settings8 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder10);
        java.util.Set<java.lang.String> strSet12 = builder10.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions13 = builder10.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject14 = null;
        builder10.setmongoOplogFilter(basicDBObject14);
        com.mongodb.BasicDBObject basicDBObject16 = builder10.getmongoCollectionFilter();
        builder9.mongoCollectionFilter = basicDBObject16;
        org.elasticsearch.river.RiverSettings riverSettings18 = new org.elasticsearch.river.RiverSettings(settings8, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject16);
        org.elasticsearch.river.RiverSettings riverSettings19 = new org.elasticsearch.river.RiverSettings(settings7, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject16);
        org.elasticsearch.script.ExecutableScript executableScript20 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject16);
        org.elasticsearch.river.RiverSettings riverSettings21 = new org.elasticsearch.river.RiverSettings(settings5, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject16);
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strSet12);
        org.junit.Assert.assertNull(mongoClientOptions13);
        org.junit.Assert.assertNotNull(basicDBObject16);
        org.junit.Assert.assertNotNull(executableScript20);
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("filter", "disable_index_refresh");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?disable_index_refresh?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("bulk");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?bulk?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.setmongoOplogFilter(basicDBObject4);
        boolean boolean6 = builder0.dropCollection;
        boolean boolean7 = builder0.dropCollection;
        java.lang.String str8 = builder0.getindexName();
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.getCONNECTION_TIMEOUT();
        java.lang.String str4 = mongoDBRiverDefinition2.getCREDENTIALS_FIELD();
        java.lang.String str5 = mongoDBRiverDefinition2.getCONCURRENT_BULK_REQUESTS_FIELD();
        boolean boolean6 = mongoDBRiverDefinition2.isMongoUseSSL();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "connect_timeout" + "'", str3, "connect_timeout");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "credentials" + "'", str4, "credentials");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "concurrent_bulk_requests" + "'", str5, "concurrent_bulk_requests");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("throttle_size", "port");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?port?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.getCONNECTION_TIMEOUT();
        java.lang.String str4 = mongoDBRiverDefinition2.getOPTIONS_FIELD();
        java.lang.String str5 = mongoDBRiverDefinition2.mongoLocalPassword;
        boolean boolean6 = mongoDBRiverDefinition2.skipInitialImport;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "connect_timeout" + "'", str3, "connect_timeout");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "options" + "'", str4, "options");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) (byte) 1);
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
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder4);
        java.util.Set<java.lang.String> strSet6 = builder4.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject8 = null;
        builder4.setmongoOplogFilter(basicDBObject8);
        boolean boolean10 = builder4.dropCollection;
        com.mongodb.ServerAddress[] serverAddressArray11 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList12 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList12, serverAddressArray11);
        builder4.mongoServers = serverAddressList12;
        java.lang.String str15 = builder4.mongoAdminPassword;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str17 = builder16.typeName;
        com.mongodb.BasicDBObject basicDBObject18 = null;
        builder16.mongoCollectionFilter = basicDBObject18;
        java.lang.String str20 = builder16.mongoAdminUser;
        builder16.disableIndexRefresh = false;
        java.lang.String str23 = builder16.typeName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str25 = builder24.typeName;
        com.mongodb.BasicDBObject basicDBObject26 = null;
        builder24.mongoCollectionFilter = basicDBObject26;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder24.mongoUseSSL(true);
        java.lang.String[] strArray39 = new java.lang.String[] { "connect_timeout", "hi!", "port", "connect_timeout", "port", "bulk_size", "concurrent_bulk_requests", "", "options" };
        java.util.LinkedHashSet<java.lang.String> strSet40 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet40, strArray39);
        builder29.setparentTypes((java.util.Set<java.lang.String>) strSet40);
        builder16.parentTypes = strSet40;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder4.parentTypes((java.util.Set<java.lang.String>) strSet40);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder4.includeCollection("type");
        docScoreSearchScript0.setNextVar("", (java.lang.Object) builder4);
        org.elasticsearch.common.settings.Settings settings48 = null;
        org.elasticsearch.common.settings.Settings settings49 = null;
        org.elasticsearch.common.settings.Settings settings50 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition52 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder51);
        java.util.Set<java.lang.String> strSet53 = builder51.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions54 = builder51.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject55 = null;
        builder51.setmongoOplogFilter(basicDBObject55);
        com.mongodb.BasicDBObject basicDBObject57 = builder51.getmongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings58 = new org.elasticsearch.river.RiverSettings(settings50, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject57);
        java.util.Map<java.lang.String, java.lang.Object> strMap59 = riverSettings58.settings();
        org.elasticsearch.river.RiverSettings riverSettings60 = new org.elasticsearch.river.RiverSettings(settings49, strMap59);
        org.elasticsearch.river.RiverSettings riverSettings61 = new org.elasticsearch.river.RiverSettings(settings48, strMap59);
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextSource(strMap59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(serverAddressArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNull(strSet53);
        org.junit.Assert.assertNull(mongoClientOptions54);
        org.junit.Assert.assertNotNull(basicDBObject57);
        org.junit.Assert.assertNotNull(strMap59);
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        java.lang.String str4 = builder0.mongoAdminUser;
        builder0.disableIndexRefresh = false;
        java.lang.String str7 = builder0.getincludeCollection();
        com.mongodb.MongoClientOptions mongoClientOptions8 = builder0.mongoClientOptions;
        int int9 = builder0.socketTimeout;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(mongoClientOptions8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoUseSSL(true);
        builder0.connectTimeout = (byte) -1;
        int int8 = builder0.socketTimeout;
        java.lang.String str9 = builder0.getmongoAdminUser();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder0.mongoAdminPassword("local");
        java.lang.String str12 = builder11.getmongoLocalPassword();
        java.util.Set<java.lang.String> strSet13 = builder11.includeFields;
        boolean boolean14 = builder11.getmongoUseSSL();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(strSet13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) (-1));
        org.elasticsearch.common.settings.Settings settings5 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str7 = builder6.typeName;
        com.mongodb.BasicDBObject basicDBObject8 = null;
        builder6.mongoCollectionFilter = basicDBObject8;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder6.mongoUseSSL(true);
        builder6.connectTimeout = (byte) -1;
        int int14 = builder6.socketTimeout;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder6.statisticsIndexName("initial_timestamp");
        java.lang.String str17 = builder16.mongoLocalUser;
        org.elasticsearch.common.settings.Settings settings18 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder19);
        java.util.Set<java.lang.String> strSet21 = builder19.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions22 = builder19.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject23 = null;
        builder19.setmongoOplogFilter(basicDBObject23);
        com.mongodb.BasicDBObject basicDBObject25 = builder19.getmongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings26 = new org.elasticsearch.river.RiverSettings(settings18, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject25);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder16.mongoCollectionFilter(basicDBObject25);
        org.elasticsearch.river.RiverSettings riverSettings28 = new org.elasticsearch.river.RiverSettings(settings5, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject25);
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1) + "'", obj4, (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(strSet21);
        org.junit.Assert.assertNull(mongoClientOptions22);
        org.junit.Assert.assertNotNull(basicDBObject25);
        org.junit.Assert.assertNotNull(builder27);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("user", "socket_timeout", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?socket_timeout?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) (-1));
        org.apache.lucene.index.AtomicReaderContext atomicReaderContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextReader(atomicReaderContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1) + "'", obj4, (-1));
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) (-1));
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str7 = builder6.typeName;
        com.mongodb.BasicDBObject basicDBObject8 = null;
        builder6.mongoCollectionFilter = basicDBObject8;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder6.mongoAdminPassword("db");
        docScoreSearchScript0.setNextVar("bulk_size", (java.lang.Object) builder6);
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextDocId(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1) + "'", obj4, (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.mongoOplogFilter = basicDBObject4;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = builder0.build();
        builder0.throttleSize = (short) 0;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition6);
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.mongoOplogFilter = basicDBObject4;
        builder0.disableIndexRefresh = true;
        java.util.List<com.mongodb.ServerAddress> serverAddressList8 = builder0.mongoServers;
        boolean boolean9 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean11 = mongoDBRiverDefinition10.getmongoSecondaryReadPreference();
        java.lang.String str12 = mongoDBRiverDefinition10.script;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(serverAddressList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.statisticsTypeName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str6 = mongoDBRiverDefinition5.getNAME_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition5.mongoLocalPassword;
        java.lang.String str8 = mongoDBRiverDefinition5.getSTORE_STATISTICS_FIELD();
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "name" + "'", str6, "name");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "store_statistics" + "'", str8, "store_statistics");
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("socket_timeout", "exclude_fields", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?exclude_fields?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.setmongoOplogFilter(basicDBObject4);
        boolean boolean6 = builder0.dropCollection;
        com.mongodb.ServerAddress[] serverAddressArray7 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList8 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList8, serverAddressArray7);
        builder0.mongoServers = serverAddressList8;
        java.lang.String str11 = builder0.mongoAdminPassword;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str13 = builder12.typeName;
        com.mongodb.BasicDBObject basicDBObject14 = null;
        builder12.mongoCollectionFilter = basicDBObject14;
        java.lang.String str16 = builder12.mongoAdminUser;
        builder12.disableIndexRefresh = false;
        java.lang.String str19 = builder12.typeName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str21 = builder20.typeName;
        com.mongodb.BasicDBObject basicDBObject22 = null;
        builder20.mongoCollectionFilter = basicDBObject22;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder20.mongoUseSSL(true);
        java.lang.String[] strArray35 = new java.lang.String[] { "connect_timeout", "hi!", "port", "connect_timeout", "port", "bulk_size", "concurrent_bulk_requests", "", "options" };
        java.util.LinkedHashSet<java.lang.String> strSet36 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet36, strArray35);
        builder25.setparentTypes((java.util.Set<java.lang.String>) strSet36);
        builder12.parentTypes = strSet36;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder0.parentTypes((java.util.Set<java.lang.String>) strSet36);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition41 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder40);
        java.lang.Class<?> wildcardClass42 = mongoDBRiverDefinition41.getClass();
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(serverAddressArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.mongoOplogFilter = basicDBObject4;
        builder0.disableIndexRefresh = true;
        java.util.List<com.mongodb.ServerAddress> serverAddressList8 = builder0.mongoServers;
        boolean boolean9 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str11 = builder0.mongoLocalPassword;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str13 = builder12.typeName;
        com.mongodb.BasicDBObject basicDBObject14 = null;
        builder12.mongoCollectionFilter = basicDBObject14;
        java.lang.String str16 = builder12.mongoAdminUser;
        java.lang.String str17 = builder12.getriverName();
        builder12.storeStatistics = true;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder12.mongoLocalUser("options");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder12.typeName("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder24);
        int int26 = mongoDBRiverDefinition25.getDEFAULT_CONCURRENT_REQUESTS();
        java.lang.String str27 = mongoDBRiverDefinition25.scriptType;
        boolean boolean28 = mongoDBRiverDefinition25.importAllCollections;
        java.lang.String str29 = mongoDBRiverDefinition25.getCOLLECTION_FIELD();
        java.util.List<com.mongodb.ServerAddress> serverAddressList30 = mongoDBRiverDefinition25.mongoServers;
        builder23.setmongoServers(serverAddressList30);
        builder0.mongoServers = serverAddressList30;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(serverAddressList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 8 + "'", int26 == 8);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "collection" + "'", str29, "collection");
        org.junit.Assert.assertNotNull(serverAddressList30);
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str2 = builder1.typeName;
        com.mongodb.BasicDBObject basicDBObject3 = null;
        builder1.mongoCollectionFilter = basicDBObject3;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder1.mongoAdminPassword("db");
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory7 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.common.settings.Settings settings8 = null;
        org.elasticsearch.common.settings.Settings settings9 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder10);
        java.util.Set<java.lang.String> strSet12 = builder10.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions13 = builder10.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject14 = null;
        builder10.setmongoOplogFilter(basicDBObject14);
        com.mongodb.BasicDBObject basicDBObject16 = builder10.getmongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings17 = new org.elasticsearch.river.RiverSettings(settings9, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject16);
        org.elasticsearch.river.RiverSettings riverSettings18 = new org.elasticsearch.river.RiverSettings(settings8, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject16);
        org.elasticsearch.script.ExecutableScript executableScript19 = docScoreNativeScriptFactory7.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject16);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder1.mongoOplogFilter(basicDBObject16);
        org.elasticsearch.river.RiverSettings riverSettings21 = new org.elasticsearch.river.RiverSettings(settings0, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject16);
        org.elasticsearch.common.settings.Settings settings22 = riverSettings21.globalSettings();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(strSet12);
        org.junit.Assert.assertNull(mongoClientOptions13);
        org.junit.Assert.assertNotNull(basicDBObject16);
        org.junit.Assert.assertNotNull(executableScript19);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNull(settings22);
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
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
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        java.lang.String str4 = builder0.mongoAdminUser;
        builder0.disableIndexRefresh = false;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.statisticsIndexName("port");
        builder0.setskipInitialImport(false);
        boolean boolean11 = builder0.mongoSecondaryReadPreference;
        java.lang.Class<?> wildcardClass12 = builder0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) (-1));
        java.lang.Object obj6 = docScoreSearchScript0.unwrap((java.lang.Object) "bulk");
        org.apache.lucene.search.Scorer scorer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setScorer(scorer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1) + "'", obj4, (-1));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "bulk" + "'", obj6, "bulk");
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) (-1));
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str7 = builder6.typeName;
        com.mongodb.BasicDBObject basicDBObject8 = null;
        builder6.mongoCollectionFilter = basicDBObject8;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder6.mongoAdminPassword("db");
        docScoreSearchScript0.setNextVar("bulk_size", (java.lang.Object) builder6);
        // The following exception was thrown during execution in test generation
        try {
            long long13 = docScoreSearchScript0.runAsLong();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1) + "'", obj4, (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.mongoOplogFilter = basicDBObject4;
        builder0.disableIndexRefresh = true;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.typeName("secondary_read_preference");
        boolean boolean10 = builder9.skipInitialImport;
        java.lang.String str11 = builder9.getriverName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder9.mongoLocalUser("local");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder13);
        boolean boolean15 = mongoDBRiverDefinition14.isMongoSecondaryReadPreference();
        boolean boolean16 = mongoDBRiverDefinition14.mongoSSLVerifyCertificate;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("concurrent_bulk_requests");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?concurrent_bulk_requests?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.mongoOplogFilter = basicDBObject4;
        builder0.disableIndexRefresh = true;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.typeName("secondary_read_preference");
        boolean boolean10 = builder9.skipInitialImport;
        java.lang.String str11 = builder9.getriverName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder9.mongoLocalUser("local");
        boolean boolean14 = builder9.getdropCollection();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        java.lang.String str3 = builder0.getstatisticsIndexName();
        builder0.setsocketTimeout(10);
        builder0.setstatisticsTypeName("size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.mongoGridFS(true);
        org.elasticsearch.common.settings.Settings settings10 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder12);
        java.util.Set<java.lang.String> strSet14 = builder12.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions15 = builder12.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject16 = null;
        builder12.setmongoOplogFilter(basicDBObject16);
        com.mongodb.BasicDBObject basicDBObject18 = builder12.getmongoCollectionFilter();
        builder11.mongoCollectionFilter = basicDBObject18;
        org.elasticsearch.river.RiverSettings riverSettings20 = new org.elasticsearch.river.RiverSettings(settings10, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder0.mongoCollectionFilter(basicDBObject18);
        java.lang.String str22 = builder21.mongoLocalUser;
        boolean boolean23 = builder21.importAllCollections;
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(strSet14);
        org.junit.Assert.assertNull(mongoClientOptions15);
        org.junit.Assert.assertNotNull(basicDBObject18);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean3 = mongoDBRiverDefinition2.mongoSSLVerifyCertificate;
        java.lang.String str4 = mongoDBRiverDefinition2.getGRIDFS_FIELD();
        com.mongodb.MongoClientOptions mongoClientOptions5 = mongoDBRiverDefinition2.getMongoClientOptions();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "gridfs" + "'", str4, "gridfs");
        org.junit.Assert.assertNull(mongoClientOptions5);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.setmongoOplogFilter(basicDBObject4);
        boolean boolean6 = builder0.dropCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.socketTimeout((int) ' ');
        java.util.Set<java.lang.String> strSet9 = builder8.excludeFields;
        builder8.setriverName("hi!");
        org.bson.types.BSONTimestamp bSONTimestamp12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder8.initialTimestamp(bSONTimestamp12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ts must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(strSet9);
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("socket_timeout", "script");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?script?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.setmongoOplogFilter(basicDBObject4);
        boolean boolean6 = builder0.dropCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.socketTimeout((int) ' ');
        java.util.Set<java.lang.String> strSet9 = builder8.excludeFields;
        builder8.setriverName("hi!");
        builder8.setmongoGridFS(true);
        builder8.setmongoCollection("admin");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder8.mongoAdminPassword("admin");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder8.statisticsIndexName("disable_index_refresh");
        builder19.throttleSize = ' ';
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(strSet9);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.HOST_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "host" + "'", str0, "host");
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        docScoreSearchScript0.setNextScore(100.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder6);
        java.util.Set<java.lang.String> strSet8 = builder6.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions9 = builder6.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject10 = null;
        builder6.setmongoOplogFilter(basicDBObject10);
        boolean boolean12 = builder6.dropCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder6.socketTimeout((int) ' ');
        java.util.Set<java.lang.String> strSet15 = builder14.excludeFields;
        builder14.setriverName("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder14.mongoAdminUser("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder14.mongoDb("size");
        docScoreSearchScript0.setNextVar("advanced_transformation", (java.lang.Object) builder14);
        // The following exception was thrown during execution in test generation
        try {
            double double23 = docScoreSearchScript0.runAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strSet8);
        org.junit.Assert.assertNull(mongoClientOptions9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNull(strSet15);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("bulk_timeout", "flush_interval", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?flush_interval? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoUseSSL(true);
        builder0.connectTimeout = (byte) -1;
        builder0.setsocketTimeout((int) (short) 1);
        java.lang.String str10 = builder0.getstatisticsTypeName();
        builder0.setmongoAdminUser("collection");
        int int13 = builder0.getsocketTimeout();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.getCONNECTION_TIMEOUT();
        java.lang.String str4 = mongoDBRiverDefinition2.getCREDENTIALS_FIELD();
        java.lang.String str5 = mongoDBRiverDefinition2.getIMPORT_ALL_COLLECTIONS_FIELD();
        com.mongodb.BasicDBObject basicDBObject6 = mongoDBRiverDefinition2.getMongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = mongoDBRiverDefinition2.initialTimestamp;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "connect_timeout" + "'", str3, "connect_timeout");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "credentials" + "'", str4, "credentials");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "import_all_collections" + "'", str5, "import_all_collections");
        org.junit.Assert.assertNotNull(basicDBObject6);
        org.junit.Assert.assertNull(wildcardTimestamp7);
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder4);
        java.util.Set<java.lang.String> strSet6 = builder4.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject8 = null;
        builder4.setmongoOplogFilter(basicDBObject8);
        boolean boolean10 = builder4.dropCollection;
        com.mongodb.ServerAddress[] serverAddressArray11 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList12 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList12, serverAddressArray11);
        builder4.mongoServers = serverAddressList12;
        java.lang.String str15 = builder4.mongoAdminPassword;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str17 = builder16.typeName;
        com.mongodb.BasicDBObject basicDBObject18 = null;
        builder16.mongoCollectionFilter = basicDBObject18;
        java.lang.String str20 = builder16.mongoAdminUser;
        builder16.disableIndexRefresh = false;
        java.lang.String str23 = builder16.typeName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str25 = builder24.typeName;
        com.mongodb.BasicDBObject basicDBObject26 = null;
        builder24.mongoCollectionFilter = basicDBObject26;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder24.mongoUseSSL(true);
        java.lang.String[] strArray39 = new java.lang.String[] { "connect_timeout", "hi!", "port", "connect_timeout", "port", "bulk_size", "concurrent_bulk_requests", "", "options" };
        java.util.LinkedHashSet<java.lang.String> strSet40 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet40, strArray39);
        builder29.setparentTypes((java.util.Set<java.lang.String>) strSet40);
        builder16.parentTypes = strSet40;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder4.parentTypes((java.util.Set<java.lang.String>) strSet40);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder4.includeCollection("type");
        docScoreSearchScript0.setNextVar("", (java.lang.Object) builder4);
        // The following exception was thrown during execution in test generation
        try {
            double double48 = docScoreSearchScript0.runAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(serverAddressArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.setmongoOplogFilter(basicDBObject4);
        boolean boolean6 = builder0.dropCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.socketTimeout((int) ' ');
        java.lang.String str9 = builder8.getscript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder8.mongoCollection("drop_collection");
        builder8.script = "flush_interval";
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        org.elasticsearch.common.logging.ESLogger eSLogger0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.logger;
        org.junit.Assert.assertNotNull(eSLogger0);
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.setmongoOplogFilter(basicDBObject4);
        boolean boolean6 = builder0.dropCollection;
        com.mongodb.ServerAddress[] serverAddressArray7 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList8 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList8, serverAddressArray7);
        builder0.mongoServers = serverAddressList8;
        java.lang.String str11 = builder0.mongoAdminPassword;
        java.lang.String str12 = builder0.getscriptType();
        java.lang.String str13 = builder0.gettypeName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.bson.types.Binary binary15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder0.initialTimestamp(binary15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(serverAddressArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.ADVANCED_TRANSFORMATION_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "advanced_transformation" + "'", str0, "advanced_transformation");
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoAdminPassword("db");
        java.util.Set<java.lang.String> strSet6 = builder5.getincludeFields();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder5.storeStatistics(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str10 = builder9.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str13 = builder12.typeName;
        com.mongodb.BasicDBObject basicDBObject14 = null;
        builder12.mongoCollectionFilter = basicDBObject14;
        com.mongodb.BasicDBObject basicDBObject16 = null;
        builder12.mongoOplogFilter = basicDBObject16;
        builder12.disableIndexRefresh = true;
        java.util.List<com.mongodb.ServerAddress> serverAddressList20 = builder12.mongoServers;
        java.lang.String[] strArray24 = new java.lang.String[] { "connect_timeout", "credentials", "connect_timeout" };
        java.util.LinkedHashSet<java.lang.String> strSet25 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet25, strArray24);
        builder12.setparentTypes((java.util.Set<java.lang.String>) strSet25);
        builder9.parentTypes = strSet25;
        builder8.parentTypes = strSet25;
        boolean boolean30 = builder8.getimportAllCollections();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(serverAddressList20);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        docScoreSearchScript0.setNextScore(100.0f);
        docScoreSearchScript0.setNextScore(0.0f);
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
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
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
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("exclude_fields", "collection");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?collection?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        org.elasticsearch.common.settings.Settings settings2 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        org.elasticsearch.river.RiverSettings riverSettings4 = new org.elasticsearch.river.RiverSettings(settings2, strMap3);
        org.elasticsearch.script.ScriptService scriptService5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("localhost", "flush_interval", riverSettings4, scriptService5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.setmongoOplogFilter(basicDBObject4);
        boolean boolean6 = builder0.dropCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.socketTimeout((int) ' ');
        java.util.Set<java.lang.String> strSet9 = builder8.excludeFields;
        builder8.setriverName("hi!");
        builder8.setmongoGridFS(true);
        builder8.setmongoCollection("admin");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder8.mongoAdminPassword("admin");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder8.statisticsIndexName("disable_index_refresh");
        boolean boolean20 = builder8.mongoSecondaryReadPreference;
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(strSet9);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        builder0.setsocketTimeout(0);
        boolean boolean4 = builder0.getmongoUseSSL();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str7 = builder6.typeName;
        com.mongodb.BasicDBObject basicDBObject8 = null;
        builder6.mongoCollectionFilter = basicDBObject8;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder6.mongoUseSSL(true);
        java.lang.String[] strArray21 = new java.lang.String[] { "connect_timeout", "hi!", "port", "connect_timeout", "port", "bulk_size", "concurrent_bulk_requests", "", "options" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        builder11.setparentTypes((java.util.Set<java.lang.String>) strSet22);
        builder0.setparentTypes((java.util.Set<java.lang.String>) strSet22);
        java.lang.String str26 = builder0.statisticsIndexName;
        builder0.advancedTransformation = false;
        java.lang.String str29 = builder0.mongoDb;
        org.bson.types.Binary binary30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder0.initialTimestamp(binary30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("db", "skip_initial_import");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?skip_initial_import?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.getCONNECTION_TIMEOUT();
        java.lang.String str4 = mongoDBRiverDefinition2.getCREDENTIALS_FIELD();
        java.lang.String str5 = mongoDBRiverDefinition2.getSOCKET_TIMEOUT();
        java.lang.String str6 = mongoDBRiverDefinition2.getSCRIPT_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition2.mongoDb;
        java.lang.String str8 = mongoDBRiverDefinition2.getRiverIndexName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "connect_timeout" + "'", str3, "connect_timeout");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "credentials" + "'", str4, "credentials");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "socket_timeout" + "'", str5, "socket_timeout");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "script" + "'", str6, "script");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        docScoreSearchScript0.setNextScore(100.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder6);
        java.util.Set<java.lang.String> strSet8 = builder6.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions9 = builder6.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject10 = null;
        builder6.setmongoOplogFilter(basicDBObject10);
        boolean boolean12 = builder6.dropCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder6.socketTimeout((int) ' ');
        java.util.Set<java.lang.String> strSet15 = builder14.excludeFields;
        builder14.setriverName("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder14.mongoAdminUser("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder14.mongoDb("size");
        docScoreSearchScript0.setNextVar("advanced_transformation", (java.lang.Object) builder14);
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextDocId((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strSet8);
        org.junit.Assert.assertNull(mongoClientOptions9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNull(strSet15);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        docScoreSearchScript0.setNextScore(100.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder6);
        java.util.Set<java.lang.String> strSet8 = builder6.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions9 = builder6.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject10 = null;
        builder6.setmongoOplogFilter(basicDBObject10);
        boolean boolean12 = builder6.dropCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder6.socketTimeout((int) ' ');
        java.util.Set<java.lang.String> strSet15 = builder14.excludeFields;
        builder14.setriverName("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder14.mongoAdminUser("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder14.mongoDb("size");
        docScoreSearchScript0.setNextVar("advanced_transformation", (java.lang.Object) builder14);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str24 = builder23.typeName;
        com.mongodb.BasicDBObject basicDBObject25 = null;
        builder23.mongoCollectionFilter = basicDBObject25;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder23.mongoAdminPassword("db");
        builder28.importAllCollections = false;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder28.connectTimeout(1);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory33 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.common.settings.Settings settings34 = null;
        org.elasticsearch.common.settings.Settings settings35 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition37 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder36);
        java.util.Set<java.lang.String> strSet38 = builder36.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions39 = builder36.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject40 = null;
        builder36.setmongoOplogFilter(basicDBObject40);
        com.mongodb.BasicDBObject basicDBObject42 = builder36.getmongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings43 = new org.elasticsearch.river.RiverSettings(settings35, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject42);
        org.elasticsearch.river.RiverSettings riverSettings44 = new org.elasticsearch.river.RiverSettings(settings34, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject42);
        org.elasticsearch.script.ExecutableScript executableScript45 = docScoreNativeScriptFactory33.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject42);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder28.mongoCollectionFilter(basicDBObject42);
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strSet8);
        org.junit.Assert.assertNull(mongoClientOptions9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNull(strSet15);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNull(strSet38);
        org.junit.Assert.assertNull(mongoClientOptions39);
        org.junit.Assert.assertNotNull(basicDBObject42);
        org.junit.Assert.assertNotNull(executableScript45);
        org.junit.Assert.assertNotNull(builder46);
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) (-1));
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str6 = builder5.typeName;
        com.mongodb.BasicDBObject basicDBObject7 = null;
        builder5.mongoCollectionFilter = basicDBObject7;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder5.mongoAdminPassword("db");
        builder10.importAllCollections = false;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder10.connectTimeout(1);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory15 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.common.settings.Settings settings16 = null;
        org.elasticsearch.common.settings.Settings settings17 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder18);
        java.util.Set<java.lang.String> strSet20 = builder18.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions21 = builder18.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject22 = null;
        builder18.setmongoOplogFilter(basicDBObject22);
        com.mongodb.BasicDBObject basicDBObject24 = builder18.getmongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings25 = new org.elasticsearch.river.RiverSettings(settings17, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject24);
        org.elasticsearch.river.RiverSettings riverSettings26 = new org.elasticsearch.river.RiverSettings(settings16, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject24);
        org.elasticsearch.script.ExecutableScript executableScript27 = docScoreNativeScriptFactory15.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject24);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder10.mongoCollectionFilter(basicDBObject24);
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1) + "'", obj4, (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNull(strSet20);
        org.junit.Assert.assertNull(mongoClientOptions21);
        org.junit.Assert.assertNotNull(basicDBObject24);
        org.junit.Assert.assertNotNull(executableScript27);
        org.junit.Assert.assertNotNull(builder28);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) (-1));
        java.lang.Object obj6 = docScoreSearchScript0.unwrap((java.lang.Object) "bulk");
        docScoreSearchScript0.setNextScore((float) 0L);
        org.apache.lucene.search.Scorer scorer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setScorer(scorer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1) + "'", obj4, (-1));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "bulk" + "'", obj6, "bulk");
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.getCONNECTION_TIMEOUT();
        java.lang.String str4 = mongoDBRiverDefinition2.getCREDENTIALS_FIELD();
        boolean boolean5 = mongoDBRiverDefinition2.isMongoSecondaryReadPreference();
        int int6 = mongoDBRiverDefinition2.getSocketTimeout();
        java.lang.String str7 = mongoDBRiverDefinition2.getTHROTTLE_SIZE_FIELD();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "connect_timeout" + "'", str3, "connect_timeout");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "credentials" + "'", str4, "credentials");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "throttle_size" + "'", str7, "throttle_size");
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder1);
        java.util.Set<java.lang.String> strSet3 = builder1.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder1.statisticsTypeName("bulk_size");
        builder1.includeCollection = "port";
        builder1.mongoAdminPassword = "localhost";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder10);
        java.util.Set<java.lang.String> strSet12 = builder10.includeFields;
        java.lang.String str13 = builder10.getstatisticsIndexName();
        builder10.setsocketTimeout(10);
        builder10.setstatisticsTypeName("size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder10.mongoGridFS(true);
        org.elasticsearch.common.settings.Settings settings20 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition23 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder22);
        java.util.Set<java.lang.String> strSet24 = builder22.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions25 = builder22.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject26 = null;
        builder22.setmongoOplogFilter(basicDBObject26);
        com.mongodb.BasicDBObject basicDBObject28 = builder22.getmongoCollectionFilter();
        builder21.mongoCollectionFilter = basicDBObject28;
        org.elasticsearch.river.RiverSettings riverSettings30 = new org.elasticsearch.river.RiverSettings(settings20, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject28);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder10.mongoCollectionFilter(basicDBObject28);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder1.mongoOplogFilter(basicDBObject28);
        org.elasticsearch.river.RiverSettings riverSettings33 = new org.elasticsearch.river.RiverSettings(settings0, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject28);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(strSet12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNull(strSet24);
        org.junit.Assert.assertNull(mongoClientOptions25);
        org.junit.Assert.assertNotNull(basicDBObject28);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder32);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        int int2 = mongoDBRiverDefinition1.getDEFAULT_CONCURRENT_REQUESTS();
        java.util.List<com.mongodb.ServerAddress> serverAddressList3 = mongoDBRiverDefinition1.mongoServers;
        java.lang.String str4 = mongoDBRiverDefinition1.getMongoCollection();
        java.lang.String str5 = mongoDBRiverDefinition1.getTypeName();
        java.lang.String str6 = mongoDBRiverDefinition1.getScript();
        java.lang.String str7 = mongoDBRiverDefinition1.getMongoDb();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertNotNull(serverAddressList3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.getCONNECTION_TIMEOUT();
        java.lang.String str4 = mongoDBRiverDefinition2.getOPTIONS_FIELD();
        java.lang.String str5 = mongoDBRiverDefinition2.mongoLocalPassword;
        java.lang.String str6 = mongoDBRiverDefinition2.getOPTIONS_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition2.mongoAdminUser;
        int int8 = mongoDBRiverDefinition2.throttleSize;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "connect_timeout" + "'", str3, "connect_timeout");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "options" + "'", str4, "options");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "options" + "'", str6, "options");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.mongoOplogFilter = basicDBObject4;
        builder0.disableIndexRefresh = true;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.typeName("secondary_read_preference");
        com.mongodb.BasicDBObject basicDBObject10 = builder9.mongoCollectionFilter;
        java.util.Set<java.lang.String> strSet11 = builder9.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder9.mongoUseSSL(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(basicDBObject10);
        org.junit.Assert.assertNull(strSet11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.mongoOplogFilter = basicDBObject4;
        builder0.disableIndexRefresh = true;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.typeName("secondary_read_preference");
        com.mongodb.BasicDBObject basicDBObject10 = builder9.mongoCollectionFilter;
        builder9.throttleSize = (byte) 10;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(basicDBObject10);
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.mongoOplogFilter = basicDBObject4;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = builder0.build();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.advancedTransformation(false);
        builder0.disableIndexRefresh = false;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder4);
        java.util.Set<java.lang.String> strSet6 = builder4.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject8 = null;
        builder4.setmongoOplogFilter(basicDBObject8);
        boolean boolean10 = builder4.dropCollection;
        com.mongodb.ServerAddress[] serverAddressArray11 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList12 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList12, serverAddressArray11);
        builder4.mongoServers = serverAddressList12;
        java.lang.String str15 = builder4.mongoAdminPassword;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str17 = builder16.typeName;
        com.mongodb.BasicDBObject basicDBObject18 = null;
        builder16.mongoCollectionFilter = basicDBObject18;
        java.lang.String str20 = builder16.mongoAdminUser;
        builder16.disableIndexRefresh = false;
        java.lang.String str23 = builder16.typeName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str25 = builder24.typeName;
        com.mongodb.BasicDBObject basicDBObject26 = null;
        builder24.mongoCollectionFilter = basicDBObject26;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder24.mongoUseSSL(true);
        java.lang.String[] strArray39 = new java.lang.String[] { "connect_timeout", "hi!", "port", "connect_timeout", "port", "bulk_size", "concurrent_bulk_requests", "", "options" };
        java.util.LinkedHashSet<java.lang.String> strSet40 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet40, strArray39);
        builder29.setparentTypes((java.util.Set<java.lang.String>) strSet40);
        builder16.parentTypes = strSet40;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder4.parentTypes((java.util.Set<java.lang.String>) strSet40);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder4.includeCollection("type");
        docScoreSearchScript0.setNextVar("", (java.lang.Object) builder4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj48 = docScoreSearchScript0.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(serverAddressArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.getMongoCollection();
        java.lang.String str3 = mongoDBRiverDefinition1.scriptType;
        boolean boolean4 = mongoDBRiverDefinition1.storeStatistics;
        java.lang.String str5 = mongoDBRiverDefinition1.getGRIDFS_FIELD();
        java.lang.String str6 = mongoDBRiverDefinition1.getMongoDb();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "gridfs" + "'", str5, "gridfs");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoDb("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder3);
        java.util.Set<java.lang.String> strSet5 = builder3.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions6 = builder3.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject7 = null;
        builder3.setmongoOplogFilter(basicDBObject7);
        boolean boolean9 = builder3.dropCollection;
        com.mongodb.ServerAddress[] serverAddressArray10 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList11 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList11, serverAddressArray10);
        builder3.mongoServers = serverAddressList11;
        java.lang.String str14 = builder3.mongoAdminPassword;
        java.lang.String str15 = builder3.getscriptType();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder16);
        java.util.Set<java.lang.String> strSet18 = builder16.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions19 = builder16.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject20 = null;
        builder16.setmongoOplogFilter(basicDBObject20);
        com.mongodb.BasicDBObject basicDBObject22 = builder16.getmongoCollectionFilter();
        builder3.mongoCollectionFilter = basicDBObject22;
        builder0.mongoCollectionFilter = basicDBObject22;
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertNull(mongoClientOptions6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(serverAddressArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(strSet18);
        org.junit.Assert.assertNull(mongoClientOptions19);
        org.junit.Assert.assertNotNull(basicDBObject22);
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str2 = builder1.typeName;
        com.mongodb.BasicDBObject basicDBObject3 = null;
        builder1.mongoCollectionFilter = basicDBObject3;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder1.mongoUseSSL(true);
        builder1.connectTimeout = (byte) -1;
        int int9 = builder1.socketTimeout;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder1.statisticsIndexName("initial_timestamp");
        java.lang.String str12 = builder11.mongoLocalUser;
        org.elasticsearch.common.settings.Settings settings13 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder14);
        java.util.Set<java.lang.String> strSet16 = builder14.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions17 = builder14.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject18 = null;
        builder14.setmongoOplogFilter(basicDBObject18);
        com.mongodb.BasicDBObject basicDBObject20 = builder14.getmongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings21 = new org.elasticsearch.river.RiverSettings(settings13, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject20);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder11.mongoCollectionFilter(basicDBObject20);
        org.elasticsearch.river.RiverSettings riverSettings23 = new org.elasticsearch.river.RiverSettings(settings0, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject20);
        org.elasticsearch.common.settings.Settings settings24 = riverSettings23.globalSettings();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(strSet16);
        org.junit.Assert.assertNull(mongoClientOptions17);
        org.junit.Assert.assertNotNull(basicDBObject20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNull(settings24);
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.statisticsTypeName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoDb("secondary_read_preference");
        java.lang.String str7 = builder0.getstatisticsTypeName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.mongoGridFS(true);
        builder0.mongoLocalUser = "actions";
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "bulk_size" + "'", str7, "bulk_size");
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        int int2 = mongoDBRiverDefinition1.getDEFAULT_CONCURRENT_REQUESTS();
        java.util.List<com.mongodb.ServerAddress> serverAddressList3 = mongoDBRiverDefinition1.mongoServers;
        java.lang.String str4 = mongoDBRiverDefinition1.getMongoLocalUser();
        int int5 = mongoDBRiverDefinition1.throttleSize;
        java.lang.String str6 = mongoDBRiverDefinition1.getDEFAULT_DB_HOST();
        java.lang.String str7 = mongoDBRiverDefinition1.getScript();
        boolean boolean8 = mongoDBRiverDefinition1.isSkipInitialImport();
        boolean boolean9 = mongoDBRiverDefinition1.dropCollection;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertNotNull(serverAddressList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "localhost" + "'", str6, "localhost");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean3 = mongoDBRiverDefinition2.getmongoSSLVerifyCertificate();
        java.lang.String str4 = mongoDBRiverDefinition2.getEXCLUDE_FIELDS_FIELD();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "exclude_fields" + "'", str4, "exclude_fields");
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoUseSSL(true);
        builder0.connectTimeout = (byte) -1;
        int int8 = builder0.socketTimeout;
        java.lang.String str9 = builder0.getmongoAdminUser();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder0.mongoAdminPassword("local");
        java.lang.String str12 = builder11.mongoLocalPassword;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder11.importAllCollections(true);
        boolean boolean15 = builder11.getmongoSSLVerifyCertificate();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.COLLECTION_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "collection" + "'", str0, "collection");
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.setmongoOplogFilter(basicDBObject4);
        boolean boolean6 = builder0.dropCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.socketTimeout((int) ' ');
        java.lang.String str9 = builder8.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder8.typeName("bulk_size");
        java.lang.String str12 = builder11.getmongoLocalUser();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder11.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder11.typeName("ssl");
        java.lang.String str17 = builder16.gettypeName();
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ssl" + "'", str17, "ssl");
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = builder0.getmongoCollectionFilter();
        builder0.mongoUseSSL = true;
        java.lang.String str9 = builder0.getstatisticsIndexName();
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(mongoClientOptions3);
        org.junit.Assert.assertNotNull(basicDBObject6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean3 = mongoDBRiverDefinition2.mongoSSLVerifyCertificate;
        java.lang.String str4 = mongoDBRiverDefinition2.getGRIDFS_FIELD();
        boolean boolean5 = mongoDBRiverDefinition2.importAllCollections;
        boolean boolean6 = mongoDBRiverDefinition2.isStoreStatistics();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "gridfs" + "'", str4, "gridfs");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        java.lang.String str4 = builder0.mongoAdminUser;
        builder0.disableIndexRefresh = false;
        java.lang.String str7 = builder0.getincludeCollection();
        com.mongodb.MongoClientOptions mongoClientOptions8 = builder0.mongoClientOptions;
        builder0.dropCollection = false;
        builder0.mongoAdminUser = "flush_interval";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(mongoClientOptions8);
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoUseSSL(true);
        java.lang.String[] strArray15 = new java.lang.String[] { "connect_timeout", "hi!", "port", "connect_timeout", "port", "bulk_size", "concurrent_bulk_requests", "", "options" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        builder5.setparentTypes((java.util.Set<java.lang.String>) strSet16);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder5.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str22 = builder21.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str24 = builder23.typeName;
        com.mongodb.BasicDBObject basicDBObject25 = null;
        builder23.mongoCollectionFilter = basicDBObject25;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder23.mongoUseSSL(true);
        java.lang.String[] strArray38 = new java.lang.String[] { "connect_timeout", "hi!", "port", "connect_timeout", "port", "bulk_size", "concurrent_bulk_requests", "", "options" };
        java.util.LinkedHashSet<java.lang.String> strSet39 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet39, strArray38);
        builder28.setparentTypes((java.util.Set<java.lang.String>) strSet39);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder21.parentTypes((java.util.Set<java.lang.String>) strSet39);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder20.parentTypes((java.util.Set<java.lang.String>) strSet39);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder20.importAllCollections(false);
        java.lang.Class<?> wildcardClass46 = builder45.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.setmongoOplogFilter(basicDBObject4);
        boolean boolean6 = builder0.dropCollection;
        com.mongodb.ServerAddress[] serverAddressArray7 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList8 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList8, serverAddressArray7);
        builder0.mongoServers = serverAddressList8;
        java.lang.String str11 = builder0.mongoAdminPassword;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str13 = builder12.typeName;
        com.mongodb.BasicDBObject basicDBObject14 = null;
        builder12.mongoCollectionFilter = basicDBObject14;
        java.lang.String str16 = builder12.mongoAdminUser;
        builder12.disableIndexRefresh = false;
        java.lang.String str19 = builder12.typeName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str21 = builder20.typeName;
        com.mongodb.BasicDBObject basicDBObject22 = null;
        builder20.mongoCollectionFilter = basicDBObject22;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder20.mongoUseSSL(true);
        java.lang.String[] strArray35 = new java.lang.String[] { "connect_timeout", "hi!", "port", "connect_timeout", "port", "bulk_size", "concurrent_bulk_requests", "", "options" };
        java.util.LinkedHashSet<java.lang.String> strSet36 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet36, strArray35);
        builder25.setparentTypes((java.util.Set<java.lang.String>) strSet36);
        builder12.parentTypes = strSet36;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder0.parentTypes((java.util.Set<java.lang.String>) strSet36);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder0.includeCollection("type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder0.indexName("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder44.mongoAdminUser("exclude_fields");
        builder46.importAllCollections = true;
        org.bson.types.Binary binary49 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder46.initialTimestamp(binary49);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(serverAddressArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.getCONNECTION_TIMEOUT();
        java.lang.String str4 = mongoDBRiverDefinition2.getCREDENTIALS_FIELD();
        boolean boolean5 = mongoDBRiverDefinition2.isMongoSecondaryReadPreference();
        java.lang.String str6 = mongoDBRiverDefinition2.getINITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD();
        boolean boolean7 = mongoDBRiverDefinition2.disableIndexRefresh;
        com.mongodb.BasicDBObject basicDBObject8 = mongoDBRiverDefinition2.mongoOplogFilter;
        com.mongodb.BasicDBObject basicDBObject9 = mongoDBRiverDefinition2.mongoOplogFilter;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "connect_timeout" + "'", str3, "connect_timeout");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "credentials" + "'", str4, "credentials");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "script_type" + "'", str6, "script_type");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(basicDBObject8);
        org.junit.Assert.assertNull(basicDBObject9);
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        java.lang.String str4 = builder0.mongoAdminUser;
        builder0.disableIndexRefresh = false;
        java.lang.String str7 = builder0.getincludeCollection();
        com.mongodb.MongoClientOptions mongoClientOptions8 = builder0.getmongoClientOptions();
        int int9 = builder0.connectTimeout;
        boolean boolean10 = builder0.dropCollection;
        builder0.setmongoLocalPassword("drop_collection");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(mongoClientOptions8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        int int2 = mongoDBRiverDefinition1.getDEFAULT_CONCURRENT_REQUESTS();
        java.lang.String str3 = mongoDBRiverDefinition1.scriptType;
        boolean boolean4 = mongoDBRiverDefinition1.importAllCollections;
        java.lang.String str5 = mongoDBRiverDefinition1.getCOLLECTION_FIELD();
        java.util.List<com.mongodb.ServerAddress> serverAddressList6 = mongoDBRiverDefinition1.mongoServers;
        boolean boolean7 = mongoDBRiverDefinition1.isImportAllCollections();
        java.util.Set<java.lang.String> strSet8 = mongoDBRiverDefinition1.includeFields;
        java.util.Set<java.lang.String> strSet9 = mongoDBRiverDefinition1.includeFields;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "collection" + "'", str5, "collection");
        org.junit.Assert.assertNotNull(serverAddressList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(strSet8);
        org.junit.Assert.assertNull(strSet9);
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.setmongoOplogFilter(basicDBObject4);
        boolean boolean6 = builder0.dropCollection;
        com.mongodb.ServerAddress[] serverAddressArray7 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList8 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList8, serverAddressArray7);
        builder0.mongoServers = serverAddressList8;
        java.lang.String str11 = builder0.mongoAdminPassword;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str13 = builder12.typeName;
        com.mongodb.BasicDBObject basicDBObject14 = null;
        builder12.mongoCollectionFilter = basicDBObject14;
        java.lang.String str16 = builder12.mongoAdminUser;
        builder12.disableIndexRefresh = false;
        java.lang.String str19 = builder12.typeName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str21 = builder20.typeName;
        com.mongodb.BasicDBObject basicDBObject22 = null;
        builder20.mongoCollectionFilter = basicDBObject22;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder20.mongoUseSSL(true);
        java.lang.String[] strArray35 = new java.lang.String[] { "connect_timeout", "hi!", "port", "connect_timeout", "port", "bulk_size", "concurrent_bulk_requests", "", "options" };
        java.util.LinkedHashSet<java.lang.String> strSet36 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet36, strArray35);
        builder25.setparentTypes((java.util.Set<java.lang.String>) strSet36);
        builder12.parentTypes = strSet36;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder0.parentTypes((java.util.Set<java.lang.String>) strSet36);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder0.includeCollection("type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder0.indexName("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp45 = builder44.getinitialTimestamp();
        builder44.setadvancedTransformation(true);
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(serverAddressArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNull(wildcardTimestamp45);
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.statisticsTypeName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder4);
        java.lang.String str6 = mongoDBRiverDefinition5.getStatisticsTypeName();
        java.lang.String str7 = mongoDBRiverDefinition5.getDEFAULT_DB_HOST();
        boolean boolean8 = mongoDBRiverDefinition5.isStoreStatistics();
        java.util.Set<java.lang.String> strSet9 = mongoDBRiverDefinition5.parentTypes;
        java.lang.String str10 = mongoDBRiverDefinition5.getCONCURRENT_REQUESTS_FIELD();
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "bulk_size" + "'", str6, "bulk_size");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "localhost" + "'", str7, "localhost");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(strSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "concurrent_requests" + "'", str10, "concurrent_requests");
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.statisticsTypeName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder4);
        java.lang.String str6 = mongoDBRiverDefinition5.getMongoAdminUser();
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        docScoreSearchScript0.setNextScore(100.0f);
        docScoreSearchScript0.setNextScore(0.0f);
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
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) (-1));
        java.lang.Object obj6 = docScoreSearchScript0.unwrap((java.lang.Object) "bulk");
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory8 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder10);
        java.util.Set<java.lang.String> strSet12 = builder10.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions13 = builder10.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject14 = null;
        builder10.setmongoOplogFilter(basicDBObject14);
        com.mongodb.BasicDBObject basicDBObject16 = builder10.getmongoCollectionFilter();
        builder9.mongoCollectionFilter = basicDBObject16;
        org.elasticsearch.script.ExecutableScript executableScript18 = docScoreNativeScriptFactory8.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject16);
        org.elasticsearch.common.settings.Settings settings19 = null;
        org.elasticsearch.common.settings.Settings settings20 = null;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory21 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder23);
        java.util.Set<java.lang.String> strSet25 = builder23.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions26 = builder23.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject27 = null;
        builder23.setmongoOplogFilter(basicDBObject27);
        com.mongodb.BasicDBObject basicDBObject29 = builder23.getmongoCollectionFilter();
        builder22.mongoCollectionFilter = basicDBObject29;
        org.elasticsearch.script.ExecutableScript executableScript31 = docScoreNativeScriptFactory21.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject29);
        org.elasticsearch.river.RiverSettings riverSettings32 = new org.elasticsearch.river.RiverSettings(settings20, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject29);
        org.elasticsearch.river.RiverSettings riverSettings33 = new org.elasticsearch.river.RiverSettings(settings19, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject29);
        org.elasticsearch.script.ExecutableScript executableScript34 = docScoreNativeScriptFactory8.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject29);
        docScoreSearchScript0.setNextVar("actions", (java.lang.Object) basicDBObject29);
        // The following exception was thrown during execution in test generation
        try {
            long long36 = docScoreSearchScript0.runAsLong();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1) + "'", obj4, (-1));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "bulk" + "'", obj6, "bulk");
        org.junit.Assert.assertNull(strSet12);
        org.junit.Assert.assertNull(mongoClientOptions13);
        org.junit.Assert.assertNotNull(basicDBObject16);
        org.junit.Assert.assertNotNull(executableScript18);
        org.junit.Assert.assertNull(strSet25);
        org.junit.Assert.assertNull(mongoClientOptions26);
        org.junit.Assert.assertNotNull(basicDBObject29);
        org.junit.Assert.assertNotNull(executableScript31);
        org.junit.Assert.assertNotNull(executableScript34);
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.statisticsTypeName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder4);
        boolean boolean6 = mongoDBRiverDefinition5.isDisableIndexRefresh();
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.statisticsTypeName("bulk_size");
        builder0.includeCollection = "port";
        builder0.setmongoGridFS(false);
        java.lang.String str9 = builder0.getriverIndexName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder0.connectTimeout(10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str14 = builder13.typeName;
        builder13.setsocketTimeout(0);
        boolean boolean17 = builder13.getmongoUseSSL();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str20 = builder19.typeName;
        com.mongodb.BasicDBObject basicDBObject21 = null;
        builder19.mongoCollectionFilter = basicDBObject21;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder19.mongoUseSSL(true);
        java.lang.String[] strArray34 = new java.lang.String[] { "connect_timeout", "hi!", "port", "connect_timeout", "port", "bulk_size", "concurrent_bulk_requests", "", "options" };
        java.util.LinkedHashSet<java.lang.String> strSet35 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet35, strArray34);
        builder24.setparentTypes((java.util.Set<java.lang.String>) strSet35);
        builder13.setparentTypes((java.util.Set<java.lang.String>) strSet35);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder0.includeFields((java.util.Set<java.lang.String>) strSet35);
        builder0.setstatisticsTypeName("bulk_size");
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(builder39);
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.setmongoOplogFilter(basicDBObject4);
        boolean boolean6 = builder0.dropCollection;
        boolean boolean7 = builder0.dropCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.mongoLocalPassword("");
        org.bson.types.Binary binary10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder0.initialTimestamp(binary10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        docScoreSearchScript0.setNextScore(100.0f);
        org.elasticsearch.common.settings.Settings settings5 = null;
        org.elasticsearch.common.settings.Settings settings6 = null;
        org.elasticsearch.common.settings.Settings settings7 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.util.Set<java.lang.String> strSet10 = builder8.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions11 = builder8.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject12 = null;
        builder8.setmongoOplogFilter(basicDBObject12);
        com.mongodb.BasicDBObject basicDBObject14 = builder8.getmongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings15 = new org.elasticsearch.river.RiverSettings(settings7, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject14);
        org.elasticsearch.river.RiverSettings riverSettings16 = new org.elasticsearch.river.RiverSettings(settings6, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject14);
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = riverSettings16.settings();
        org.elasticsearch.river.RiverSettings riverSettings18 = new org.elasticsearch.river.RiverSettings(settings5, strMap17);
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextSource(strMap17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strSet10);
        org.junit.Assert.assertNull(mongoClientOptions11);
        org.junit.Assert.assertNotNull(basicDBObject14);
        org.junit.Assert.assertNotNull(strMap17);
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        java.lang.String str4 = builder0.mongoAdminUser;
        builder0.disableIndexRefresh = false;
        java.lang.String str7 = builder0.getincludeCollection();
        com.mongodb.MongoClientOptions mongoClientOptions8 = builder0.getmongoClientOptions();
        int int9 = builder0.connectTimeout;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str11 = mongoDBRiverDefinition10.getPASSWORD_FIELD();
        int int12 = mongoDBRiverDefinition10.connectTimeout;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(mongoClientOptions8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "password" + "'", str11, "password");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("ssl_verify_certificate", "include_collection");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?include_collection?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoAdminPassword("db");
        builder5.importAllCollections = false;
        java.util.Set<java.lang.String> strSet8 = builder5.parentTypes;
        com.mongodb.BasicDBObject basicDBObject9 = builder5.mongoOplogFilter;
        builder5.riverName = "user";
        boolean boolean12 = builder5.getskipInitialImport();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(strSet8);
        org.junit.Assert.assertNull(basicDBObject9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder4);
        java.util.Set<java.lang.String> strSet6 = builder4.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject8 = null;
        builder4.setmongoOplogFilter(basicDBObject8);
        boolean boolean10 = builder4.dropCollection;
        com.mongodb.ServerAddress[] serverAddressArray11 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList12 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList12, serverAddressArray11);
        builder4.mongoServers = serverAddressList12;
        java.lang.String str15 = builder4.mongoAdminPassword;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str17 = builder16.typeName;
        com.mongodb.BasicDBObject basicDBObject18 = null;
        builder16.mongoCollectionFilter = basicDBObject18;
        java.lang.String str20 = builder16.mongoAdminUser;
        builder16.disableIndexRefresh = false;
        java.lang.String str23 = builder16.typeName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str25 = builder24.typeName;
        com.mongodb.BasicDBObject basicDBObject26 = null;
        builder24.mongoCollectionFilter = basicDBObject26;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder24.mongoUseSSL(true);
        java.lang.String[] strArray39 = new java.lang.String[] { "connect_timeout", "hi!", "port", "connect_timeout", "port", "bulk_size", "concurrent_bulk_requests", "", "options" };
        java.util.LinkedHashSet<java.lang.String> strSet40 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet40, strArray39);
        builder29.setparentTypes((java.util.Set<java.lang.String>) strSet40);
        builder16.parentTypes = strSet40;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder4.parentTypes((java.util.Set<java.lang.String>) strSet40);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder4.includeCollection("type");
        docScoreSearchScript0.setNextVar("", (java.lang.Object) builder4);
        // The following exception was thrown during execution in test generation
        try {
            float float48 = docScoreSearchScript0.runAsFloat();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(serverAddressArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.statisticsTypeName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder4);
        java.lang.String str6 = mongoDBRiverDefinition5.getSIZE_FIELD();
        java.util.Set<java.lang.String> strSet7 = mongoDBRiverDefinition5.getParentTypes();
        java.lang.String str8 = mongoDBRiverDefinition5.getINDEX_OBJECT();
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "size" + "'", str6, "size");
        org.junit.Assert.assertNull(strSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "index" + "'", str8, "index");
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        java.lang.String str4 = builder0.mongoAdminUser;
        builder0.disableIndexRefresh = false;
        java.lang.String str7 = builder0.getincludeCollection();
        int int8 = builder0.connectTimeout;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.connectTimeout(1000);
        builder10.setmongoAdminUser("host");
        java.lang.String str13 = builder10.getmongoAdminUser();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "host" + "'", str13, "host");
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.mongoOplogFilter = basicDBObject4;
        builder0.disableIndexRefresh = true;
        java.util.List<com.mongodb.ServerAddress> serverAddressList8 = builder0.mongoServers;
        java.lang.String[] strArray12 = new java.lang.String[] { "connect_timeout", "credentials", "connect_timeout" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        builder0.setparentTypes((java.util.Set<java.lang.String>) strSet13);
        builder0.advancedTransformation = true;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(serverAddressList8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("bulk_size");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?bulk_size?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.statisticsTypeName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder4);
        java.lang.String str6 = mongoDBRiverDefinition5.getSIZE_FIELD();
        java.util.Set<java.lang.String> strSet7 = mongoDBRiverDefinition5.getParentTypes();
        java.lang.String str8 = mongoDBRiverDefinition5.scriptType;
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "size" + "'", str6, "size");
        org.junit.Assert.assertNull(strSet7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        int int2 = mongoDBRiverDefinition1.getDEFAULT_CONCURRENT_REQUESTS();
        java.util.List<com.mongodb.ServerAddress> serverAddressList3 = mongoDBRiverDefinition1.mongoServers;
        java.lang.String str4 = mongoDBRiverDefinition1.getINITIAL_TIMESTAMP_FIELD();
        java.lang.String str5 = mongoDBRiverDefinition1.getINITIAL_TIMESTAMP_FIELD();
        java.lang.String str6 = mongoDBRiverDefinition1.getRiverIndexName();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertNotNull(serverAddressList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "initial_timestamp" + "'", str4, "initial_timestamp");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "initial_timestamp" + "'", str5, "initial_timestamp");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        int int3 = builder0.getconnectTimeout();
        builder0.mongoLocalUser = "socket_timeout";
        java.lang.String str6 = builder0.script;
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        org.bson.types.BSONTimestamp bSONTimestamp4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.initialTimestamp(bSONTimestamp4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ts must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoDb("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str4 = mongoDBRiverDefinition3.getTHROTTLE_SIZE_FIELD();
        java.lang.String str5 = mongoDBRiverDefinition3.getSKIP_INITIAL_IMPORT_FIELD();
        boolean boolean6 = mongoDBRiverDefinition3.isDropCollection();
        org.elasticsearch.common.logging.ESLogger eSLogger7 = mongoDBRiverDefinition3.getlogger();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "throttle_size" + "'", str4, "throttle_size");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "skip_initial_import" + "'", str5, "skip_initial_import");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(eSLogger7);
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoAdminPassword("db");
        builder5.importAllCollections = false;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder5.connectTimeout(1);
        builder9.mongoSSLVerifyCertificate = true;
        com.mongodb.BasicDBObject basicDBObject12 = builder9.getmongoCollectionFilter();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(basicDBObject12);
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.mongoCollection;
        builder0.setadvancedTransformation(false);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoAdminPassword("db");
        java.util.Set<java.lang.String> strSet6 = builder5.getincludeFields();
        builder5.setscriptType("connect_timeout");
        builder5.mongoAdminPassword = "exclude_fields";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(strSet6);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoUseSSL(true);
        builder0.connectTimeout = (byte) -1;
        int int8 = builder0.socketTimeout;
        java.lang.String str9 = builder0.getmongoAdminUser();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder0.mongoAdminPassword("local");
        java.lang.String str12 = builder0.mongoLocalUser;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str14 = builder0.includeCollection;
        int int15 = builder0.getthrottleSize();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.getPORT_FIELD();
        java.lang.String str4 = mongoDBRiverDefinition2.getINCLUDE_FIELDS_FIELD();
        boolean boolean5 = mongoDBRiverDefinition2.skipInitialImport;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "port" + "'", str3, "port");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "include_fields" + "'", str4, "include_fields");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.mongoOplogFilter = basicDBObject4;
        builder0.disableIndexRefresh = true;
        java.util.List<com.mongodb.ServerAddress> serverAddressList8 = builder0.mongoServers;
        boolean boolean9 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder10);
        int int12 = mongoDBRiverDefinition11.getDEFAULT_CONCURRENT_REQUESTS();
        java.lang.String str13 = mongoDBRiverDefinition11.scriptType;
        boolean boolean14 = mongoDBRiverDefinition11.importAllCollections;
        java.lang.String str15 = mongoDBRiverDefinition11.getCOLLECTION_FIELD();
        java.util.List<com.mongodb.ServerAddress> serverAddressList16 = mongoDBRiverDefinition11.mongoServers;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder0.mongoServers(serverAddressList16);
        org.bson.types.BSONTimestamp bSONTimestamp18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.initialTimestamp(bSONTimestamp18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ts must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(serverAddressList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "collection" + "'", str15, "collection");
        org.junit.Assert.assertNotNull(serverAddressList16);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.getCONNECTION_TIMEOUT();
        java.lang.String str4 = mongoDBRiverDefinition2.getCREDENTIALS_FIELD();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue5 = mongoDBRiverDefinition2.getDEFAULT_BULK_SIZE();
        java.lang.String str6 = mongoDBRiverDefinition2.indexName;
        java.lang.String str7 = mongoDBRiverDefinition2.getBULK_SIZE_FIELD();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = mongoDBRiverDefinition2.getInitialTimestamp();
        boolean boolean9 = mongoDBRiverDefinition2.storeStatistics;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "connect_timeout" + "'", str3, "connect_timeout");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "credentials" + "'", str4, "credentials");
        org.junit.Assert.assertNotNull(byteSizeValue5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "bulk_size" + "'", str7, "bulk_size");
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.setmongoOplogFilter(basicDBObject4);
        boolean boolean6 = builder0.dropCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.socketTimeout((int) ' ');
        java.util.Set<java.lang.String> strSet9 = builder8.excludeFields;
        builder8.setriverName("hi!");
        builder8.setmongoGridFS(true);
        builder8.setmongoCollection("admin");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder8.mongoAdminPassword("admin");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder8.statisticsIndexName("disable_index_refresh");
        boolean boolean20 = builder19.dropCollection;
        java.lang.String str21 = builder19.getstatisticsIndexName();
        org.bson.types.BSONTimestamp bSONTimestamp22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder19.initialTimestamp(bSONTimestamp22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ts must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(strSet9);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "disable_index_refresh" + "'", str21, "disable_index_refresh");
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.mongoCollection;
        builder0.setmongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.script("actions");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.advancedTransformation(true);
        java.lang.String str8 = builder7.getmongoLocalPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoUseSSL(true);
        builder0.connectTimeout = (byte) -1;
        int int8 = builder0.socketTimeout;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.statisticsIndexName("initial_timestamp");
        java.lang.String str11 = builder10.mongoLocalUser;
        org.elasticsearch.common.settings.Settings settings12 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder13);
        java.util.Set<java.lang.String> strSet15 = builder13.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions16 = builder13.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject17 = null;
        builder13.setmongoOplogFilter(basicDBObject17);
        com.mongodb.BasicDBObject basicDBObject19 = builder13.getmongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings20 = new org.elasticsearch.river.RiverSettings(settings12, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject19);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder10.mongoCollectionFilter(basicDBObject19);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder10.disableIndexRefresh(false);
        com.mongodb.MongoClientOptions mongoClientOptions24 = builder10.getmongoClientOptions();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(strSet15);
        org.junit.Assert.assertNull(mongoClientOptions16);
        org.junit.Assert.assertNotNull(basicDBObject19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNull(mongoClientOptions24);
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.getMongoCollection();
        java.lang.String str3 = mongoDBRiverDefinition1.scriptType;
        boolean boolean4 = mongoDBRiverDefinition1.storeStatistics;
        java.lang.String str5 = mongoDBRiverDefinition1.getGRIDFS_FIELD();
        int int6 = mongoDBRiverDefinition1.getDEFAULT_BULK_ACTIONS();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "gridfs" + "'", str5, "gridfs");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1000 + "'", int6 == 1000);
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.mongoOplogFilter = basicDBObject4;
        builder0.disableIndexRefresh = true;
        java.util.List<com.mongodb.ServerAddress> serverAddressList8 = builder0.mongoServers;
        boolean boolean9 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean11 = builder0.getmongoGridFS();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder0.statisticsTypeName("flush_interval");
        builder13.setdropCollection(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(serverAddressList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) (-1));
        java.lang.Object obj6 = docScoreSearchScript0.unwrap((java.lang.Object) "bulk");
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory8 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder10);
        java.util.Set<java.lang.String> strSet12 = builder10.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions13 = builder10.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject14 = null;
        builder10.setmongoOplogFilter(basicDBObject14);
        com.mongodb.BasicDBObject basicDBObject16 = builder10.getmongoCollectionFilter();
        builder9.mongoCollectionFilter = basicDBObject16;
        org.elasticsearch.script.ExecutableScript executableScript18 = docScoreNativeScriptFactory8.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject16);
        org.elasticsearch.common.settings.Settings settings19 = null;
        org.elasticsearch.common.settings.Settings settings20 = null;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory21 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder23);
        java.util.Set<java.lang.String> strSet25 = builder23.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions26 = builder23.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject27 = null;
        builder23.setmongoOplogFilter(basicDBObject27);
        com.mongodb.BasicDBObject basicDBObject29 = builder23.getmongoCollectionFilter();
        builder22.mongoCollectionFilter = basicDBObject29;
        org.elasticsearch.script.ExecutableScript executableScript31 = docScoreNativeScriptFactory21.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject29);
        org.elasticsearch.river.RiverSettings riverSettings32 = new org.elasticsearch.river.RiverSettings(settings20, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject29);
        org.elasticsearch.river.RiverSettings riverSettings33 = new org.elasticsearch.river.RiverSettings(settings19, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject29);
        org.elasticsearch.script.ExecutableScript executableScript34 = docScoreNativeScriptFactory8.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject29);
        docScoreSearchScript0.setNextVar("actions", (java.lang.Object) basicDBObject29);
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextDocId((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1) + "'", obj4, (-1));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "bulk" + "'", obj6, "bulk");
        org.junit.Assert.assertNull(strSet12);
        org.junit.Assert.assertNull(mongoClientOptions13);
        org.junit.Assert.assertNotNull(basicDBObject16);
        org.junit.Assert.assertNotNull(executableScript18);
        org.junit.Assert.assertNull(strSet25);
        org.junit.Assert.assertNull(mongoClientOptions26);
        org.junit.Assert.assertNotNull(basicDBObject29);
        org.junit.Assert.assertNotNull(executableScript31);
        org.junit.Assert.assertNotNull(executableScript34);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder4);
        java.util.Set<java.lang.String> strSet6 = builder4.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject8 = null;
        builder4.setmongoOplogFilter(basicDBObject8);
        boolean boolean10 = builder4.dropCollection;
        com.mongodb.ServerAddress[] serverAddressArray11 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList12 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList12, serverAddressArray11);
        builder4.mongoServers = serverAddressList12;
        java.lang.String str15 = builder4.mongoAdminPassword;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str17 = builder16.typeName;
        com.mongodb.BasicDBObject basicDBObject18 = null;
        builder16.mongoCollectionFilter = basicDBObject18;
        java.lang.String str20 = builder16.mongoAdminUser;
        builder16.disableIndexRefresh = false;
        java.lang.String str23 = builder16.typeName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str25 = builder24.typeName;
        com.mongodb.BasicDBObject basicDBObject26 = null;
        builder24.mongoCollectionFilter = basicDBObject26;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder24.mongoUseSSL(true);
        java.lang.String[] strArray39 = new java.lang.String[] { "connect_timeout", "hi!", "port", "connect_timeout", "port", "bulk_size", "concurrent_bulk_requests", "", "options" };
        java.util.LinkedHashSet<java.lang.String> strSet40 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet40, strArray39);
        builder29.setparentTypes((java.util.Set<java.lang.String>) strSet40);
        builder16.parentTypes = strSet40;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder4.parentTypes((java.util.Set<java.lang.String>) strSet40);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder4.includeCollection("type");
        docScoreSearchScript0.setNextVar("", (java.lang.Object) builder4);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition49 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder48);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition50 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder48);
        java.lang.String str51 = mongoDBRiverDefinition50.getCONNECTION_TIMEOUT();
        int int52 = mongoDBRiverDefinition50.getConnectTimeout();
        boolean boolean53 = mongoDBRiverDefinition50.getmongoSecondaryReadPreference();
        java.lang.String str54 = mongoDBRiverDefinition50.getACTIONS_FIELD();
        int int55 = mongoDBRiverDefinition50.connectTimeout;
        java.lang.Object obj56 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition50);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj57 = docScoreSearchScript0.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(serverAddressArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "connect_timeout" + "'", str51, "connect_timeout");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "actions" + "'", str54, "actions");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(obj56);
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript1 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript1.setNextScore((float) (byte) 1);
        java.lang.Object obj5 = docScoreSearchScript1.unwrap((java.lang.Object) (-1));
        java.lang.Object obj7 = docScoreSearchScript1.unwrap((java.lang.Object) "bulk");
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory9 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder11);
        java.util.Set<java.lang.String> strSet13 = builder11.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions14 = builder11.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject15 = null;
        builder11.setmongoOplogFilter(basicDBObject15);
        com.mongodb.BasicDBObject basicDBObject17 = builder11.getmongoCollectionFilter();
        builder10.mongoCollectionFilter = basicDBObject17;
        org.elasticsearch.script.ExecutableScript executableScript19 = docScoreNativeScriptFactory9.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject17);
        org.elasticsearch.common.settings.Settings settings20 = null;
        org.elasticsearch.common.settings.Settings settings21 = null;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory22 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder24);
        java.util.Set<java.lang.String> strSet26 = builder24.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions27 = builder24.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject28 = null;
        builder24.setmongoOplogFilter(basicDBObject28);
        com.mongodb.BasicDBObject basicDBObject30 = builder24.getmongoCollectionFilter();
        builder23.mongoCollectionFilter = basicDBObject30;
        org.elasticsearch.script.ExecutableScript executableScript32 = docScoreNativeScriptFactory22.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject30);
        org.elasticsearch.river.RiverSettings riverSettings33 = new org.elasticsearch.river.RiverSettings(settings21, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject30);
        org.elasticsearch.river.RiverSettings riverSettings34 = new org.elasticsearch.river.RiverSettings(settings20, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject30);
        org.elasticsearch.script.ExecutableScript executableScript35 = docScoreNativeScriptFactory9.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject30);
        docScoreSearchScript1.setNextVar("actions", (java.lang.Object) basicDBObject30);
        org.elasticsearch.river.RiverSettings riverSettings37 = new org.elasticsearch.river.RiverSettings(settings0, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject30);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + (-1) + "'", obj5, (-1));
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + "bulk" + "'", obj7, "bulk");
        org.junit.Assert.assertNull(strSet13);
        org.junit.Assert.assertNull(mongoClientOptions14);
        org.junit.Assert.assertNotNull(basicDBObject17);
        org.junit.Assert.assertNotNull(executableScript19);
        org.junit.Assert.assertNull(strSet26);
        org.junit.Assert.assertNull(mongoClientOptions27);
        org.junit.Assert.assertNotNull(basicDBObject30);
        org.junit.Assert.assertNotNull(executableScript32);
        org.junit.Assert.assertNotNull(executableScript35);
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.setmongoOplogFilter(basicDBObject4);
        boolean boolean6 = builder0.dropCollection;
        com.mongodb.ServerAddress[] serverAddressArray7 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList8 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList8, serverAddressArray7);
        builder0.mongoServers = serverAddressList8;
        java.lang.String str11 = builder0.mongoAdminPassword;
        java.lang.String str12 = builder0.getscriptType();
        java.lang.String str13 = builder0.gettypeName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder0.scriptType("throttle_size");
        java.util.Set<java.lang.String> strSet16 = builder15.includeFields;
        boolean boolean17 = builder15.storeStatistics;
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(serverAddressArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNull(strSet16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("actions", "include_fields");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?include_fields?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        java.lang.String str4 = builder0.mongoAdminUser;
        java.lang.String str5 = builder0.getriverName();
        boolean boolean6 = builder0.getstoreStatistics();
        java.lang.String str7 = builder0.getmongoLocalPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean3 = mongoDBRiverDefinition2.isMongoSecondaryReadPreference();
        org.elasticsearch.common.logging.ESLogger eSLogger4 = mongoDBRiverDefinition2.getlogger();
        java.lang.String str5 = mongoDBRiverDefinition2.getHOST_FIELD();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(eSLogger4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "host" + "'", str5, "host");
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) (byte) 1);
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
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.getCONNECTION_TIMEOUT();
        java.lang.String str4 = mongoDBRiverDefinition2.getCREDENTIALS_FIELD();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue5 = mongoDBRiverDefinition2.getDEFAULT_BULK_SIZE();
        java.lang.String str6 = mongoDBRiverDefinition2.indexName;
        java.lang.String str7 = mongoDBRiverDefinition2.getCONNECTION_TIMEOUT();
        java.lang.String str8 = mongoDBRiverDefinition2.getSSL_CONNECTION_FIELD();
        java.util.Set<java.lang.String> strSet9 = mongoDBRiverDefinition2.getParentTypes();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "connect_timeout" + "'", str3, "connect_timeout");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "credentials" + "'", str4, "credentials");
        org.junit.Assert.assertNotNull(byteSizeValue5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "connect_timeout" + "'", str7, "connect_timeout");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ssl" + "'", str8, "ssl");
        org.junit.Assert.assertNull(strSet9);
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        int int2 = mongoDBRiverDefinition1.getDEFAULT_CONCURRENT_REQUESTS();
        java.util.List<com.mongodb.ServerAddress> serverAddressList3 = mongoDBRiverDefinition1.mongoServers;
        boolean boolean4 = mongoDBRiverDefinition1.importAllCollections;
        java.util.List<com.mongodb.ServerAddress> serverAddressList5 = mongoDBRiverDefinition1.mongoServers;
        java.lang.String str6 = mongoDBRiverDefinition1.getCONCURRENT_REQUESTS_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition1.scriptType;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertNotNull(serverAddressList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(serverAddressList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "concurrent_requests" + "'", str6, "concurrent_requests");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.setmongoOplogFilter(basicDBObject4);
        boolean boolean6 = builder0.dropCollection;
        boolean boolean7 = builder0.dropCollection;
        boolean boolean8 = builder0.mongoSecondaryReadPreference;
        int int9 = builder0.throttleSize;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str11 = mongoDBRiverDefinition10.getSKIP_INITIAL_IMPORT_FIELD();
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "skip_initial_import" + "'", str11, "skip_initial_import");
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) (-1));
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str6 = builder5.typeName;
        com.mongodb.BasicDBObject basicDBObject7 = null;
        builder5.mongoCollectionFilter = basicDBObject7;
        java.lang.String str9 = builder5.mongoAdminUser;
        builder5.disableIndexRefresh = false;
        java.lang.String str12 = builder5.typeName;
        builder5.mongoAdminPassword = "";
        int int15 = builder5.getconnectTimeout();
        java.lang.Object obj16 = docScoreSearchScript0.unwrap((java.lang.Object) int15);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory17 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder19);
        java.util.Set<java.lang.String> strSet21 = builder19.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions22 = builder19.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject23 = null;
        builder19.setmongoOplogFilter(basicDBObject23);
        com.mongodb.BasicDBObject basicDBObject25 = builder19.getmongoCollectionFilter();
        builder18.mongoCollectionFilter = basicDBObject25;
        org.elasticsearch.script.ExecutableScript executableScript27 = docScoreNativeScriptFactory17.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject25);
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1) + "'", obj4, (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
        org.junit.Assert.assertNull(strSet21);
        org.junit.Assert.assertNull(mongoClientOptions22);
        org.junit.Assert.assertNotNull(basicDBObject25);
        org.junit.Assert.assertNotNull(executableScript27);
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean3 = mongoDBRiverDefinition2.mongoSSLVerifyCertificate;
        java.lang.String str4 = mongoDBRiverDefinition2.getGRIDFS_FIELD();
        boolean boolean5 = mongoDBRiverDefinition2.importAllCollections;
        java.lang.String str6 = mongoDBRiverDefinition2.mongoLocalUser;
        java.lang.String str7 = mongoDBRiverDefinition2.getIMPORT_ALL_COLLECTIONS_FIELD();
        java.lang.String str8 = mongoDBRiverDefinition2.statisticsIndexName;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "gridfs" + "'", str4, "gridfs");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "import_all_collections" + "'", str7, "import_all_collections");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.statisticsTypeName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.List<com.mongodb.ServerAddress> serverAddressList6 = mongoDBRiverDefinition5.getMongoServers();
        int int7 = mongoDBRiverDefinition5.getDEFAULT_CONCURRENT_REQUESTS();
        boolean boolean8 = mongoDBRiverDefinition5.mongoUseSSL;
        java.lang.String str9 = mongoDBRiverDefinition5.getCONNECTION_TIMEOUT();
        boolean boolean10 = mongoDBRiverDefinition5.mongoSecondaryReadPreference;
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(serverAddressList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "connect_timeout" + "'", str9, "connect_timeout");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.statisticsTypeName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str6 = mongoDBRiverDefinition5.getNAME_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition5.mongoLocalPassword;
        java.lang.String str8 = mongoDBRiverDefinition5.getCONNECTION_TIMEOUT();
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "name" + "'", str6, "name");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "connect_timeout" + "'", str8, "connect_timeout");
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        int int2 = mongoDBRiverDefinition1.getDEFAULT_BULK_ACTIONS();
        java.lang.String str3 = mongoDBRiverDefinition1.mongoAdminPassword;
        java.lang.String str4 = mongoDBRiverDefinition1.getSTORE_STATISTICS_FIELD();
        boolean boolean5 = mongoDBRiverDefinition1.getdisableIndexRefresh();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1000 + "'", int2 == 1000);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "store_statistics" + "'", str4, "store_statistics");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoUseSSL(true);
        builder0.connectTimeout = (byte) -1;
        int int8 = builder0.socketTimeout;
        java.lang.String str9 = builder0.getmongoAdminUser();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder0.mongoAdminPassword("local");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder11);
        java.lang.String str13 = mongoDBRiverDefinition12.getTHROTTLE_SIZE_FIELD();
        java.lang.String str14 = mongoDBRiverDefinition12.getRiverIndexName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "throttle_size" + "'", str13, "throttle_size");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoUseSSL(true);
        builder0.connectTimeout = (byte) -1;
        builder0.setsocketTimeout((int) (short) 1);
        java.lang.String str10 = builder0.getstatisticsTypeName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.importAllCollections(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str14 = mongoDBRiverDefinition13.riverIndexName;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.mongoAdminPassword;
        java.util.Set<java.lang.String> strSet4 = mongoDBRiverDefinition2.excludeFields;
        java.lang.String str5 = mongoDBRiverDefinition2.mongoAdminUser;
        java.lang.Class<?> wildcardClass6 = mongoDBRiverDefinition2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoDb("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.dropCollection(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str8 = builder7.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder7);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str11 = builder10.typeName;
        com.mongodb.BasicDBObject basicDBObject12 = null;
        builder10.mongoCollectionFilter = basicDBObject12;
        com.mongodb.BasicDBObject basicDBObject14 = null;
        builder10.mongoOplogFilter = basicDBObject14;
        builder10.disableIndexRefresh = true;
        java.util.List<com.mongodb.ServerAddress> serverAddressList18 = builder10.mongoServers;
        java.lang.String[] strArray22 = new java.lang.String[] { "connect_timeout", "credentials", "connect_timeout" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        builder10.setparentTypes((java.util.Set<java.lang.String>) strSet23);
        builder7.parentTypes = strSet23;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder4.excludeFields((java.util.Set<java.lang.String>) strSet23);
        java.lang.String str28 = builder27.getscript();
        org.elasticsearch.common.settings.Settings settings29 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition31 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder30);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition32 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder30);
        java.lang.String str33 = mongoDBRiverDefinition32.getCONNECTION_TIMEOUT();
        java.lang.String str34 = mongoDBRiverDefinition32.getCREDENTIALS_FIELD();
        java.lang.String str35 = mongoDBRiverDefinition32.getCONCURRENT_BULK_REQUESTS_FIELD();
        com.mongodb.BasicDBObject basicDBObject36 = mongoDBRiverDefinition32.getMongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings37 = new org.elasticsearch.river.RiverSettings(settings29, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject36);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder27.mongoCollectionFilter(basicDBObject36);
        builder38.skipInitialImport = false;
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(serverAddressList18);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "connect_timeout" + "'", str33, "connect_timeout");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "credentials" + "'", str34, "credentials");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "concurrent_bulk_requests" + "'", str35, "concurrent_bulk_requests");
        org.junit.Assert.assertNotNull(basicDBObject36);
        org.junit.Assert.assertNotNull(builder38);
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        docScoreSearchScript0.setNextScore(100.0f);
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
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.mongoAdminPassword;
        java.util.Set<java.lang.String> strSet4 = mongoDBRiverDefinition2.excludeFields;
        java.lang.String str5 = mongoDBRiverDefinition2.getFILTER_FIELD();
        java.lang.String str6 = mongoDBRiverDefinition2.getMongoLocalUser();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = mongoDBRiverDefinition2.getInitialTimestamp();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "filter" + "'", str5, "filter");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(wildcardTimestamp7);
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoUseSSL(true);
        builder0.connectTimeout = (byte) -1;
        builder0.setsocketTimeout((int) (short) 1);
        java.lang.String str10 = builder0.getstatisticsTypeName();
        boolean boolean11 = builder0.getmongoGridFS();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder0.mongoLocalUser("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder0.mongoDb("collection");
        boolean boolean17 = builder16.importAllCollections;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.Settings settings1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder2);
        java.util.Set<java.lang.String> strSet4 = builder2.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions5 = builder2.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject6 = null;
        builder2.setmongoOplogFilter(basicDBObject6);
        com.mongodb.BasicDBObject basicDBObject8 = builder2.getmongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings9 = new org.elasticsearch.river.RiverSettings(settings1, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject8);
        org.elasticsearch.river.RiverSettings riverSettings10 = new org.elasticsearch.river.RiverSettings(settings0, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject8);
        org.elasticsearch.common.settings.Settings settings11 = riverSettings10.globalSettings();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = riverSettings10.settings();
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertNull(mongoClientOptions5);
        org.junit.Assert.assertNotNull(basicDBObject8);
        org.junit.Assert.assertNull(settings11);
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean3 = mongoDBRiverDefinition2.getmongoSSLVerifyCertificate();
        int int4 = mongoDBRiverDefinition2.throttleSize;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        java.lang.String str3 = builder0.getstatisticsIndexName();
        builder0.setsocketTimeout(10);
        builder0.setstatisticsTypeName("size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.mongoGridFS(true);
        org.elasticsearch.common.settings.Settings settings10 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder12);
        java.util.Set<java.lang.String> strSet14 = builder12.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions15 = builder12.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject16 = null;
        builder12.setmongoOplogFilter(basicDBObject16);
        com.mongodb.BasicDBObject basicDBObject18 = builder12.getmongoCollectionFilter();
        builder11.mongoCollectionFilter = basicDBObject18;
        org.elasticsearch.river.RiverSettings riverSettings20 = new org.elasticsearch.river.RiverSettings(settings10, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder0.mongoCollectionFilter(basicDBObject18);
        java.lang.String str22 = builder21.mongoLocalUser;
        boolean boolean23 = builder21.mongoGridFS;
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(strSet14);
        org.junit.Assert.assertNull(mongoClientOptions15);
        org.junit.Assert.assertNotNull(basicDBObject18);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder4);
        java.util.Set<java.lang.String> strSet6 = builder4.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject8 = null;
        builder4.setmongoOplogFilter(basicDBObject8);
        boolean boolean10 = builder4.dropCollection;
        com.mongodb.ServerAddress[] serverAddressArray11 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList12 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList12, serverAddressArray11);
        builder4.mongoServers = serverAddressList12;
        java.lang.String str15 = builder4.mongoAdminPassword;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str17 = builder16.typeName;
        com.mongodb.BasicDBObject basicDBObject18 = null;
        builder16.mongoCollectionFilter = basicDBObject18;
        java.lang.String str20 = builder16.mongoAdminUser;
        builder16.disableIndexRefresh = false;
        java.lang.String str23 = builder16.typeName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str25 = builder24.typeName;
        com.mongodb.BasicDBObject basicDBObject26 = null;
        builder24.mongoCollectionFilter = basicDBObject26;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder24.mongoUseSSL(true);
        java.lang.String[] strArray39 = new java.lang.String[] { "connect_timeout", "hi!", "port", "connect_timeout", "port", "bulk_size", "concurrent_bulk_requests", "", "options" };
        java.util.LinkedHashSet<java.lang.String> strSet40 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet40, strArray39);
        builder29.setparentTypes((java.util.Set<java.lang.String>) strSet40);
        builder16.parentTypes = strSet40;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder4.parentTypes((java.util.Set<java.lang.String>) strSet40);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder4.includeCollection("type");
        docScoreSearchScript0.setNextVar("", (java.lang.Object) builder4);
        org.apache.lucene.search.Scorer scorer48 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setScorer(scorer48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(serverAddressArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.getPORT_FIELD();
        java.lang.String str4 = mongoDBRiverDefinition2.getScriptType();
        java.lang.String str5 = mongoDBRiverDefinition2.getMongoLocalUser();
        java.lang.String str6 = mongoDBRiverDefinition2.mongoDb;
        java.lang.String str7 = mongoDBRiverDefinition2.getSKIP_INITIAL_IMPORT_FIELD();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "port" + "'", str3, "port");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "skip_initial_import" + "'", str7, "skip_initial_import");
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoUseSSL(true);
        builder0.connectTimeout = (byte) -1;
        builder0.setsocketTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder0.mongoAdminUser("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str13 = builder12.typeName;
        com.mongodb.BasicDBObject basicDBObject14 = null;
        builder12.mongoCollectionFilter = basicDBObject14;
        com.mongodb.BasicDBObject basicDBObject16 = null;
        builder12.mongoOplogFilter = basicDBObject16;
        builder12.disableIndexRefresh = true;
        java.util.List<com.mongodb.ServerAddress> serverAddressList20 = builder12.mongoServers;
        boolean boolean21 = builder12.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition23 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder22);
        int int24 = mongoDBRiverDefinition23.getDEFAULT_CONCURRENT_REQUESTS();
        java.lang.String str25 = mongoDBRiverDefinition23.scriptType;
        boolean boolean26 = mongoDBRiverDefinition23.importAllCollections;
        java.lang.String str27 = mongoDBRiverDefinition23.getCOLLECTION_FIELD();
        java.util.List<com.mongodb.ServerAddress> serverAddressList28 = mongoDBRiverDefinition23.mongoServers;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder12.mongoServers(serverAddressList28);
        builder0.setmongoServers(serverAddressList28);
        builder0.mongoCollection = "null.null";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition33 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        int int34 = mongoDBRiverDefinition33.getThrottleSize();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(serverAddressList20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8 + "'", int24 == 8);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "collection" + "'", str27, "collection");
        org.junit.Assert.assertNotNull(serverAddressList28);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        java.lang.String str4 = builder0.mongoAdminUser;
        builder0.disableIndexRefresh = false;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.statisticsIndexName("port");
        builder0.setskipInitialImport(false);
        boolean boolean11 = builder0.mongoSecondaryReadPreference;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str13 = mongoDBRiverDefinition12.getADMIN_DB_FIELD();
        java.lang.String str14 = mongoDBRiverDefinition12.getDEFAULT_DB_HOST();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "admin" + "'", str13, "admin");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "localhost" + "'", str14, "localhost");
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.statisticsTypeName("bulk_size");
        builder0.includeCollection = "port";
        builder0.setmongoCollection("initial_timestamp");
        org.bson.types.Binary binary9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.initialTimestamp(binary9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.ACTIONS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "actions" + "'", str0, "actions");
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        java.lang.String str3 = builder0.getstatisticsIndexName();
        builder0.setsocketTimeout(10);
        builder0.setstatisticsTypeName("size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.mongoGridFS(true);
        java.lang.String str10 = builder9.mongoAdminPassword;
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        docScoreSearchScript0.setNextScore(100.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder6);
        java.util.Set<java.lang.String> strSet8 = builder6.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions9 = builder6.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject10 = null;
        builder6.setmongoOplogFilter(basicDBObject10);
        boolean boolean12 = builder6.dropCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder6.socketTimeout((int) ' ');
        java.util.Set<java.lang.String> strSet15 = builder14.excludeFields;
        builder14.setriverName("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder14.mongoAdminUser("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder14.mongoDb("size");
        docScoreSearchScript0.setNextVar("advanced_transformation", (java.lang.Object) builder14);
        java.lang.Object obj23 = null;
        java.lang.Object obj24 = docScoreSearchScript0.unwrap(obj23);
        // The following exception was thrown during execution in test generation
        try {
            double double25 = docScoreSearchScript0.runAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strSet8);
        org.junit.Assert.assertNull(mongoClientOptions9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNull(strSet15);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) (-1));
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str7 = builder6.typeName;
        com.mongodb.BasicDBObject basicDBObject8 = null;
        builder6.mongoCollectionFilter = basicDBObject8;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder6.mongoAdminPassword("db");
        docScoreSearchScript0.setNextVar("bulk_size", (java.lang.Object) builder6);
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextDocId((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1) + "'", obj4, (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        builder0.setsocketTimeout(0);
        boolean boolean4 = builder0.getmongoUseSSL();
        builder0.setmongoLocalUser("bulk");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoUseSSL(true);
        builder0.connectTimeout = (byte) -1;
        builder0.setsocketTimeout((int) (short) 1);
        java.lang.String str10 = builder0.getstatisticsTypeName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.importAllCollections(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str14 = mongoDBRiverDefinition13.getScriptType();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.mongoAdminPassword;
        java.util.Set<java.lang.String> strSet4 = mongoDBRiverDefinition2.excludeFields;
        java.lang.String str5 = mongoDBRiverDefinition2.getFILTER_FIELD();
        java.lang.String str6 = mongoDBRiverDefinition2.getMongoLocalUser();
        java.lang.String str7 = mongoDBRiverDefinition2.getDB_FIELD();
        java.lang.String str8 = mongoDBRiverDefinition2.getTHROTTLE_SIZE_FIELD();
        java.util.Set<java.lang.String> strSet9 = mongoDBRiverDefinition2.parentTypes;
        boolean boolean10 = mongoDBRiverDefinition2.getmongoGridFS();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "filter" + "'", str5, "filter");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "db" + "'", str7, "db");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "throttle_size" + "'", str8, "throttle_size");
        org.junit.Assert.assertNull(strSet9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.mongoCollection;
        builder0.setmongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.script("actions");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.advancedTransformation(true);
        builder5.mongoSecondaryReadPreference = false;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.getCONNECTION_TIMEOUT();
        java.lang.String str4 = mongoDBRiverDefinition2.getOPTIONS_FIELD();
        java.lang.String str5 = mongoDBRiverDefinition2.mongoLocalPassword;
        boolean boolean6 = mongoDBRiverDefinition2.isDisableIndexRefresh();
        boolean boolean7 = mongoDBRiverDefinition2.advancedTransformation;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "connect_timeout" + "'", str3, "connect_timeout");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "options" + "'", str4, "options");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) (-1));
        java.lang.Object obj6 = docScoreSearchScript0.unwrap((java.lang.Object) "bulk");
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory8 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder10);
        java.util.Set<java.lang.String> strSet12 = builder10.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions13 = builder10.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject14 = null;
        builder10.setmongoOplogFilter(basicDBObject14);
        com.mongodb.BasicDBObject basicDBObject16 = builder10.getmongoCollectionFilter();
        builder9.mongoCollectionFilter = basicDBObject16;
        org.elasticsearch.script.ExecutableScript executableScript18 = docScoreNativeScriptFactory8.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject16);
        org.elasticsearch.common.settings.Settings settings19 = null;
        org.elasticsearch.common.settings.Settings settings20 = null;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory21 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder23);
        java.util.Set<java.lang.String> strSet25 = builder23.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions26 = builder23.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject27 = null;
        builder23.setmongoOplogFilter(basicDBObject27);
        com.mongodb.BasicDBObject basicDBObject29 = builder23.getmongoCollectionFilter();
        builder22.mongoCollectionFilter = basicDBObject29;
        org.elasticsearch.script.ExecutableScript executableScript31 = docScoreNativeScriptFactory21.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject29);
        org.elasticsearch.river.RiverSettings riverSettings32 = new org.elasticsearch.river.RiverSettings(settings20, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject29);
        org.elasticsearch.river.RiverSettings riverSettings33 = new org.elasticsearch.river.RiverSettings(settings19, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject29);
        org.elasticsearch.script.ExecutableScript executableScript34 = docScoreNativeScriptFactory8.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject29);
        docScoreSearchScript0.setNextVar("actions", (java.lang.Object) basicDBObject29);
        // The following exception was thrown during execution in test generation
        try {
            float float36 = docScoreSearchScript0.runAsFloat();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1) + "'", obj4, (-1));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "bulk" + "'", obj6, "bulk");
        org.junit.Assert.assertNull(strSet12);
        org.junit.Assert.assertNull(mongoClientOptions13);
        org.junit.Assert.assertNotNull(basicDBObject16);
        org.junit.Assert.assertNotNull(executableScript18);
        org.junit.Assert.assertNull(strSet25);
        org.junit.Assert.assertNull(mongoClientOptions26);
        org.junit.Assert.assertNotNull(basicDBObject29);
        org.junit.Assert.assertNotNull(executableScript31);
        org.junit.Assert.assertNotNull(executableScript34);
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        int int2 = mongoDBRiverDefinition1.getDEFAULT_CONCURRENT_REQUESTS();
        java.lang.String str3 = mongoDBRiverDefinition1.scriptType;
        boolean boolean4 = mongoDBRiverDefinition1.importAllCollections;
        java.lang.String str5 = mongoDBRiverDefinition1.getCOLLECTION_FIELD();
        java.util.List<com.mongodb.ServerAddress> serverAddressList6 = mongoDBRiverDefinition1.mongoServers;
        java.lang.String str7 = mongoDBRiverDefinition1.getCREDENTIALS_FIELD();
        java.lang.String str8 = mongoDBRiverDefinition1.riverIndexName;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "collection" + "'", str5, "collection");
        org.junit.Assert.assertNotNull(serverAddressList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "credentials" + "'", str7, "credentials");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        docScoreSearchScript0.setNextScore(100.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder6);
        java.util.Set<java.lang.String> strSet8 = builder6.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions9 = builder6.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject10 = null;
        builder6.setmongoOplogFilter(basicDBObject10);
        boolean boolean12 = builder6.dropCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder6.socketTimeout((int) ' ');
        java.util.Set<java.lang.String> strSet15 = builder14.excludeFields;
        builder14.setriverName("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder14.mongoAdminUser("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder14.mongoDb("size");
        docScoreSearchScript0.setNextVar("advanced_transformation", (java.lang.Object) builder14);
        org.apache.lucene.search.Scorer scorer23 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setScorer(scorer23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strSet8);
        org.junit.Assert.assertNull(mongoClientOptions9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNull(strSet15);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.SCRIPT_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "script" + "'", str0, "script");
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = builder0.getmongoCollectionFilter();
        builder0.setskipInitialImport(false);
        java.lang.String str9 = builder0.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.dropCollection = true;
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(mongoClientOptions3);
        org.junit.Assert.assertNotNull(basicDBObject6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        java.lang.String str3 = builder0.getstatisticsIndexName();
        builder0.setsocketTimeout(10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet7 = mongoDBRiverDefinition6.excludeFields;
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(strSet7);
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        int int2 = mongoDBRiverDefinition1.getDEFAULT_CONCURRENT_REQUESTS();
        java.util.List<com.mongodb.ServerAddress> serverAddressList3 = mongoDBRiverDefinition1.mongoServers;
        boolean boolean4 = mongoDBRiverDefinition1.importAllCollections;
        java.lang.String str5 = mongoDBRiverDefinition1.getSTORE_STATISTICS_FIELD();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertNotNull(serverAddressList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "store_statistics" + "'", str5, "store_statistics");
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str4 = builder3.typeName;
        com.mongodb.BasicDBObject basicDBObject5 = null;
        builder3.mongoCollectionFilter = basicDBObject5;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder3.mongoAdminPassword("db");
        builder8.importAllCollections = false;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder8.connectTimeout(1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder8.importAllCollections(false);
        org.elasticsearch.common.settings.Settings settings15 = null;
        org.elasticsearch.common.settings.Settings settings16 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder17);
        java.util.Set<java.lang.String> strSet19 = builder17.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions20 = builder17.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject21 = null;
        builder17.setmongoOplogFilter(basicDBObject21);
        boolean boolean23 = builder17.dropCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder17.socketTimeout((int) ' ');
        java.util.Set<java.lang.String> strSet26 = builder25.excludeFields;
        builder25.setriverName("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder25.mongoAdminUser("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder25.mongoSSLVerifyCertificate(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str34 = builder33.typeName;
        com.mongodb.BasicDBObject basicDBObject35 = null;
        builder33.mongoCollectionFilter = basicDBObject35;
        java.lang.String str37 = builder33.mongoAdminUser;
        builder33.disableIndexRefresh = false;
        java.lang.String str40 = builder33.getincludeCollection();
        org.elasticsearch.common.settings.Settings settings41 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition43 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder42);
        java.util.Set<java.lang.String> strSet44 = builder42.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions45 = builder42.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject46 = null;
        builder42.setmongoOplogFilter(basicDBObject46);
        com.mongodb.BasicDBObject basicDBObject48 = builder42.getmongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings49 = new org.elasticsearch.river.RiverSettings(settings41, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject48);
        builder33.setmongoOplogFilter(basicDBObject48);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder25.mongoCollectionFilter(basicDBObject48);
        org.elasticsearch.river.RiverSettings riverSettings52 = new org.elasticsearch.river.RiverSettings(settings16, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject48);
        org.elasticsearch.river.RiverSettings riverSettings53 = new org.elasticsearch.river.RiverSettings(settings15, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject48);
        builder8.mongoCollectionFilter = basicDBObject48;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNull(strSet19);
        org.junit.Assert.assertNull(mongoClientOptions20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNull(strSet26);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNull(strSet44);
        org.junit.Assert.assertNull(mongoClientOptions45);
        org.junit.Assert.assertNotNull(basicDBObject48);
        org.junit.Assert.assertNotNull(builder51);
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean3 = mongoDBRiverDefinition2.mongoSSLVerifyCertificate;
        java.lang.String str4 = mongoDBRiverDefinition2.getGRIDFS_FIELD();
        boolean boolean5 = mongoDBRiverDefinition2.importAllCollections;
        java.lang.String str6 = mongoDBRiverDefinition2.mongoLocalUser;
        java.lang.String str7 = mongoDBRiverDefinition2.getIMPORT_ALL_COLLECTIONS_FIELD();
        java.lang.String str8 = mongoDBRiverDefinition2.statisticsTypeName;
        java.util.Set<java.lang.String> strSet9 = mongoDBRiverDefinition2.excludeFields;
        java.lang.String str10 = mongoDBRiverDefinition2.getMongoOplogNamespace();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "gridfs" + "'", str4, "gridfs");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "import_all_collections" + "'", str7, "import_all_collections");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null.null" + "'", str10, "null.null");
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        java.lang.String str3 = builder0.getstatisticsIndexName();
        builder0.setsocketTimeout(10);
        builder0.setstatisticsTypeName("size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.mongoGridFS(true);
        org.elasticsearch.common.settings.Settings settings10 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder12);
        java.util.Set<java.lang.String> strSet14 = builder12.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions15 = builder12.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject16 = null;
        builder12.setmongoOplogFilter(basicDBObject16);
        com.mongodb.BasicDBObject basicDBObject18 = builder12.getmongoCollectionFilter();
        builder11.mongoCollectionFilter = basicDBObject18;
        org.elasticsearch.river.RiverSettings riverSettings20 = new org.elasticsearch.river.RiverSettings(settings10, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder0.mongoCollectionFilter(basicDBObject18);
        java.lang.String str22 = builder21.mongoLocalUser;
        builder21.setdisableIndexRefresh(true);
        builder21.setmongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder21.riverName("script_type");
        java.lang.String str29 = builder21.getscript();
        org.bson.types.Binary binary30 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder21.initialTimestamp(binary30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(strSet14);
        org.junit.Assert.assertNull(mongoClientOptions15);
        org.junit.Assert.assertNotNull(basicDBObject18);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        java.lang.String str4 = builder0.mongoAdminUser;
        builder0.disableIndexRefresh = false;
        java.lang.String str7 = builder0.typeName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str9 = builder8.typeName;
        com.mongodb.BasicDBObject basicDBObject10 = null;
        builder8.mongoCollectionFilter = basicDBObject10;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder8.mongoUseSSL(true);
        java.lang.String[] strArray23 = new java.lang.String[] { "connect_timeout", "hi!", "port", "connect_timeout", "port", "bulk_size", "concurrent_bulk_requests", "", "options" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        builder13.setparentTypes((java.util.Set<java.lang.String>) strSet24);
        builder0.parentTypes = strSet24;
        boolean boolean28 = builder0.mongoGridFS;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.getCONNECTION_TIMEOUT();
        java.lang.String str4 = mongoDBRiverDefinition2.getCREDENTIALS_FIELD();
        java.lang.String str5 = mongoDBRiverDefinition2.getStatisticsIndexName();
        java.util.Set<java.lang.String> strSet6 = mongoDBRiverDefinition2.getIncludeFields();
        java.lang.String str7 = mongoDBRiverDefinition2.getRiverName();
        boolean boolean8 = mongoDBRiverDefinition2.isMongoUseSSL();
        org.elasticsearch.common.logging.ESLogger eSLogger9 = mongoDBRiverDefinition2.getlogger();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "connect_timeout" + "'", str3, "connect_timeout");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "credentials" + "'", str4, "credentials");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(eSLogger9);
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean3 = mongoDBRiverDefinition2.mongoSSLVerifyCertificate;
        java.lang.String str4 = mongoDBRiverDefinition2.getGRIDFS_FIELD();
        boolean boolean5 = mongoDBRiverDefinition2.importAllCollections;
        java.lang.String str6 = mongoDBRiverDefinition2.getINCLUDE_FIELDS_FIELD();
        com.mongodb.MongoClientOptions mongoClientOptions7 = mongoDBRiverDefinition2.mongoClientOptions;
        boolean boolean8 = mongoDBRiverDefinition2.isMongoUseSSL();
        java.lang.String str9 = mongoDBRiverDefinition2.getSERVERS_FIELD();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "gridfs" + "'", str4, "gridfs");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "include_fields" + "'", str6, "include_fields");
        org.junit.Assert.assertNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "servers" + "'", str9, "servers");
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        int int3 = mongoDBRiverDefinition2.getConnectTimeout();
        boolean boolean4 = mongoDBRiverDefinition2.disableIndexRefresh;
        java.lang.String str5 = mongoDBRiverDefinition2.statisticsTypeName;
        int int6 = mongoDBRiverDefinition2.getThrottleSize();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript4 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript4.setNextScore((float) (byte) 1);
        java.lang.Object obj8 = docScoreSearchScript4.unwrap((java.lang.Object) (-1));
        java.lang.Object obj10 = docScoreSearchScript4.unwrap((java.lang.Object) "bulk");
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory12 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder14);
        java.util.Set<java.lang.String> strSet16 = builder14.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions17 = builder14.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject18 = null;
        builder14.setmongoOplogFilter(basicDBObject18);
        com.mongodb.BasicDBObject basicDBObject20 = builder14.getmongoCollectionFilter();
        builder13.mongoCollectionFilter = basicDBObject20;
        org.elasticsearch.script.ExecutableScript executableScript22 = docScoreNativeScriptFactory12.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject20);
        org.elasticsearch.common.settings.Settings settings23 = null;
        org.elasticsearch.common.settings.Settings settings24 = null;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory25 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder27);
        java.util.Set<java.lang.String> strSet29 = builder27.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions30 = builder27.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject31 = null;
        builder27.setmongoOplogFilter(basicDBObject31);
        com.mongodb.BasicDBObject basicDBObject33 = builder27.getmongoCollectionFilter();
        builder26.mongoCollectionFilter = basicDBObject33;
        org.elasticsearch.script.ExecutableScript executableScript35 = docScoreNativeScriptFactory25.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject33);
        org.elasticsearch.river.RiverSettings riverSettings36 = new org.elasticsearch.river.RiverSettings(settings24, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject33);
        org.elasticsearch.river.RiverSettings riverSettings37 = new org.elasticsearch.river.RiverSettings(settings23, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject33);
        org.elasticsearch.script.ExecutableScript executableScript38 = docScoreNativeScriptFactory12.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject33);
        docScoreSearchScript4.setNextVar("actions", (java.lang.Object) basicDBObject33);
        docScoreSearchScript0.setNextVar("port", (java.lang.Object) docScoreSearchScript4);
        // The following exception was thrown during execution in test generation
        try {
            float float41 = docScoreSearchScript4.runAsFloat();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1) + "'", obj8, (-1));
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "bulk" + "'", obj10, "bulk");
        org.junit.Assert.assertNull(strSet16);
        org.junit.Assert.assertNull(mongoClientOptions17);
        org.junit.Assert.assertNotNull(basicDBObject20);
        org.junit.Assert.assertNotNull(executableScript22);
        org.junit.Assert.assertNull(strSet29);
        org.junit.Assert.assertNull(mongoClientOptions30);
        org.junit.Assert.assertNotNull(basicDBObject33);
        org.junit.Assert.assertNotNull(executableScript35);
        org.junit.Assert.assertNotNull(executableScript38);
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("size", "admin", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?admin?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("host", "collection");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?collection?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("include_fields", "servers");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?servers?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.statisticsTypeName("bulk_size");
        builder0.includeCollection = "port";
        builder0.mongoAdminPassword = "localhost";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder9);
        java.util.Set<java.lang.String> strSet11 = builder9.includeFields;
        java.lang.String str12 = builder9.getstatisticsIndexName();
        builder9.setsocketTimeout(10);
        builder9.setstatisticsTypeName("size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder9.mongoGridFS(true);
        org.elasticsearch.common.settings.Settings settings19 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder21);
        java.util.Set<java.lang.String> strSet23 = builder21.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions24 = builder21.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject25 = null;
        builder21.setmongoOplogFilter(basicDBObject25);
        com.mongodb.BasicDBObject basicDBObject27 = builder21.getmongoCollectionFilter();
        builder20.mongoCollectionFilter = basicDBObject27;
        org.elasticsearch.river.RiverSettings riverSettings29 = new org.elasticsearch.river.RiverSettings(settings19, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject27);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder9.mongoCollectionFilter(basicDBObject27);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder0.mongoOplogFilter(basicDBObject27);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder0.typeName("concurrent_requests");
        org.bson.types.BSONTimestamp bSONTimestamp34 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder33.initialTimestamp(bSONTimestamp34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ts must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNull(strSet11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNull(strSet23);
        org.junit.Assert.assertNull(mongoClientOptions24);
        org.junit.Assert.assertNotNull(basicDBObject27);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        java.lang.String str4 = builder0.mongoAdminUser;
        java.lang.String str5 = builder0.getriverName();
        builder0.storeStatistics = true;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.mongoLocalUser("options");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder0.typeName("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder12);
        int int14 = mongoDBRiverDefinition13.getDEFAULT_CONCURRENT_REQUESTS();
        java.lang.String str15 = mongoDBRiverDefinition13.scriptType;
        boolean boolean16 = mongoDBRiverDefinition13.importAllCollections;
        java.lang.String str17 = mongoDBRiverDefinition13.getCOLLECTION_FIELD();
        java.util.List<com.mongodb.ServerAddress> serverAddressList18 = mongoDBRiverDefinition13.mongoServers;
        builder11.setmongoServers(serverAddressList18);
        builder11.statisticsIndexName = "name";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder11.includeCollection("name");
        builder23.socketTimeout = 8;
        int int26 = builder23.socketTimeout;
        int int27 = builder23.socketTimeout;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "collection" + "'", str17, "collection");
        org.junit.Assert.assertNotNull(serverAddressList18);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 8 + "'", int26 == 8);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 8 + "'", int27 == 8);
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoUseSSL(true);
        com.mongodb.MongoClientOptions mongoClientOptions6 = null;
        builder5.mongoClientOptions = mongoClientOptions6;
        builder5.setmongoCollection("gridfs");
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory10 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder12);
        java.util.Set<java.lang.String> strSet14 = builder12.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions15 = builder12.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject16 = null;
        builder12.setmongoOplogFilter(basicDBObject16);
        com.mongodb.BasicDBObject basicDBObject18 = builder12.getmongoCollectionFilter();
        builder11.mongoCollectionFilter = basicDBObject18;
        org.elasticsearch.script.ExecutableScript executableScript20 = docScoreNativeScriptFactory10.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
        builder5.setmongoCollectionFilter(basicDBObject18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder5.indexName("ssl");
        builder5.mongoDb = "initial_timestamp";
        builder5.mongoSSLVerifyCertificate = false;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(strSet14);
        org.junit.Assert.assertNull(mongoClientOptions15);
        org.junit.Assert.assertNotNull(basicDBObject18);
        org.junit.Assert.assertNotNull(executableScript20);
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.statisticsTypeName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder4);
        java.lang.String str6 = mongoDBRiverDefinition5.getStatisticsTypeName();
        java.lang.String str7 = mongoDBRiverDefinition5.getBULK_SIZE_FIELD();
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "bulk_size" + "'", str6, "bulk_size");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "bulk_size" + "'", str7, "bulk_size");
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.statisticsTypeName("bulk_size");
        builder0.includeCollection = "port";
        builder0.setmongoGridFS(false);
        int int9 = builder0.throttleSize;
        int int10 = builder0.connectTimeout;
        builder0.riverName = "index";
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str3 = builder2.typeName;
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder2.mongoCollectionFilter = basicDBObject4;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder2.mongoUseSSL(true);
        java.lang.String[] strArray17 = new java.lang.String[] { "connect_timeout", "hi!", "port", "connect_timeout", "port", "bulk_size", "concurrent_bulk_requests", "", "options" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        builder7.setparentTypes((java.util.Set<java.lang.String>) strSet18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder0.parentTypes((java.util.Set<java.lang.String>) strSet18);
        builder0.setdisableIndexRefresh(false);
        java.lang.String str24 = builder0.getmongoAdminUser();
        builder0.setscript("gridfs");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = builder0.getmongoCollectionFilter();
        builder0.setskipInitialImport(false);
        java.lang.String str9 = builder0.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str11 = mongoDBRiverDefinition10.getSKIP_INITIAL_IMPORT_FIELD();
        java.util.List<com.mongodb.ServerAddress> serverAddressList12 = mongoDBRiverDefinition10.mongoServers;
        boolean boolean13 = mongoDBRiverDefinition10.mongoGridFS;
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(mongoClientOptions3);
        org.junit.Assert.assertNotNull(basicDBObject6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "skip_initial_import" + "'", str11, "skip_initial_import");
        org.junit.Assert.assertNotNull(serverAddressList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.setmongoOplogFilter(basicDBObject4);
        boolean boolean6 = builder0.dropCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.socketTimeout((int) ' ');
        java.lang.String str9 = builder8.getscript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder8.mongoCollection("drop_collection");
        java.lang.String str12 = builder8.getmongoCollection();
        builder8.dropCollection = false;
        builder8.mongoLocalUser = "local";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder8.disableIndexRefresh(true);
        java.lang.String str19 = builder18.getstatisticsIndexName();
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "drop_collection" + "'", str12, "drop_collection");
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.setmongoOplogFilter(basicDBObject4);
        boolean boolean6 = builder0.dropCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.socketTimeout((int) ' ');
        java.util.Set<java.lang.String> strSet9 = builder8.excludeFields;
        builder8.setriverName("hi!");
        builder8.setmongoGridFS(true);
        builder8.setmongoCollection("admin");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder8.mongoAdminPassword("admin");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder8.statisticsIndexName("disable_index_refresh");
        boolean boolean20 = builder19.dropCollection;
        org.bson.types.BSONTimestamp bSONTimestamp21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder19.initialTimestamp(bSONTimestamp21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ts must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(strSet9);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        boolean boolean3 = builder0.getimportAllCollections();
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        int int2 = mongoDBRiverDefinition1.getDEFAULT_CONCURRENT_REQUESTS();
        java.util.List<com.mongodb.ServerAddress> serverAddressList3 = mongoDBRiverDefinition1.mongoServers;
        java.lang.String str4 = mongoDBRiverDefinition1.getMongoLocalUser();
        int int5 = mongoDBRiverDefinition1.throttleSize;
        boolean boolean6 = mongoDBRiverDefinition1.mongoSSLVerifyCertificate;
        java.lang.String str7 = mongoDBRiverDefinition1.getFILTER_FIELD();
        boolean boolean8 = mongoDBRiverDefinition1.getdisableIndexRefresh();
        int int9 = mongoDBRiverDefinition1.getDEFAULT_DB_PORT();
        com.mongodb.BasicDBObject basicDBObject10 = mongoDBRiverDefinition1.getMongoOplogFilter();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertNotNull(serverAddressList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "filter" + "'", str7, "filter");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 27017 + "'", int9 == 27017);
        org.junit.Assert.assertNull(basicDBObject10);
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript4 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript4.setNextScore((float) (byte) 1);
        java.lang.Object obj8 = docScoreSearchScript4.unwrap((java.lang.Object) (-1));
        java.lang.Object obj10 = docScoreSearchScript4.unwrap((java.lang.Object) "bulk");
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory12 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder14);
        java.util.Set<java.lang.String> strSet16 = builder14.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions17 = builder14.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject18 = null;
        builder14.setmongoOplogFilter(basicDBObject18);
        com.mongodb.BasicDBObject basicDBObject20 = builder14.getmongoCollectionFilter();
        builder13.mongoCollectionFilter = basicDBObject20;
        org.elasticsearch.script.ExecutableScript executableScript22 = docScoreNativeScriptFactory12.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject20);
        org.elasticsearch.common.settings.Settings settings23 = null;
        org.elasticsearch.common.settings.Settings settings24 = null;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory25 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder27);
        java.util.Set<java.lang.String> strSet29 = builder27.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions30 = builder27.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject31 = null;
        builder27.setmongoOplogFilter(basicDBObject31);
        com.mongodb.BasicDBObject basicDBObject33 = builder27.getmongoCollectionFilter();
        builder26.mongoCollectionFilter = basicDBObject33;
        org.elasticsearch.script.ExecutableScript executableScript35 = docScoreNativeScriptFactory25.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject33);
        org.elasticsearch.river.RiverSettings riverSettings36 = new org.elasticsearch.river.RiverSettings(settings24, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject33);
        org.elasticsearch.river.RiverSettings riverSettings37 = new org.elasticsearch.river.RiverSettings(settings23, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject33);
        org.elasticsearch.script.ExecutableScript executableScript38 = docScoreNativeScriptFactory12.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject33);
        docScoreSearchScript4.setNextVar("actions", (java.lang.Object) basicDBObject33);
        docScoreSearchScript0.setNextVar("port", (java.lang.Object) docScoreSearchScript4);
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript4.setNextDocId((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1) + "'", obj8, (-1));
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "bulk" + "'", obj10, "bulk");
        org.junit.Assert.assertNull(strSet16);
        org.junit.Assert.assertNull(mongoClientOptions17);
        org.junit.Assert.assertNotNull(basicDBObject20);
        org.junit.Assert.assertNotNull(executableScript22);
        org.junit.Assert.assertNull(strSet29);
        org.junit.Assert.assertNull(mongoClientOptions30);
        org.junit.Assert.assertNotNull(basicDBObject33);
        org.junit.Assert.assertNotNull(executableScript35);
        org.junit.Assert.assertNotNull(executableScript38);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        java.lang.String str4 = builder0.mongoAdminUser;
        builder0.disableIndexRefresh = false;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.statisticsIndexName("port");
        builder0.setskipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition12 = builder0.build();
        java.lang.String str13 = mongoDBRiverDefinition12.scriptType;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoUseSSL(true);
        builder0.connectTimeout = (byte) -1;
        builder0.setsocketTimeout((int) (short) 1);
        java.lang.String str10 = builder0.getstatisticsTypeName();
        builder0.setmongoAdminUser("collection");
        int int13 = builder0.socketTimeout;
        java.lang.String str14 = builder0.statisticsIndexName;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        java.lang.String str4 = builder0.mongoAdminUser;
        builder0.disableIndexRefresh = false;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.statisticsIndexName("port");
        boolean boolean9 = builder0.mongoSSLVerifyCertificate;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder0.includeCollection("servers");
        builder0.typeName = "";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoAdminPassword("db");
        builder5.importAllCollections = false;
        java.util.Set<java.lang.String> strSet8 = builder5.parentTypes;
        com.mongodb.BasicDBObject basicDBObject9 = builder5.mongoOplogFilter;
        builder5.riverName = "user";
        boolean boolean12 = builder5.mongoSSLVerifyCertificate;
        builder5.mongoAdminUser = "actions";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(strSet8);
        org.junit.Assert.assertNull(basicDBObject9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("password", "throttle_size");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?throttle_size? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.getCONNECTION_TIMEOUT();
        java.lang.String str4 = mongoDBRiverDefinition2.getCREDENTIALS_FIELD();
        java.lang.String str5 = mongoDBRiverDefinition2.getSOCKET_TIMEOUT();
        java.lang.String str6 = mongoDBRiverDefinition2.getSCRIPT_FIELD();
        org.elasticsearch.common.logging.ESLogger eSLogger7 = mongoDBRiverDefinition2.getlogger();
        java.lang.String str8 = mongoDBRiverDefinition2.mongoDb;
        boolean boolean9 = mongoDBRiverDefinition2.skipInitialImport;
        boolean boolean10 = mongoDBRiverDefinition2.getstoreStatistics();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "connect_timeout" + "'", str3, "connect_timeout");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "credentials" + "'", str4, "credentials");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "socket_timeout" + "'", str5, "socket_timeout");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "script" + "'", str6, "script");
        org.junit.Assert.assertNotNull(eSLogger7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.mongoOplogFilter = basicDBObject4;
        builder0.disableIndexRefresh = true;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.typeName("secondary_read_preference");
        boolean boolean10 = builder9.skipInitialImport;
        java.lang.String str11 = builder9.getriverName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder9.mongoLocalUser("local");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder13);
        boolean boolean15 = builder13.getadvancedTransformation();
        boolean boolean16 = builder13.getmongoSSLVerifyCertificate();
        java.lang.String str17 = builder13.getriverName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.mongoOplogFilter = basicDBObject4;
        builder0.disableIndexRefresh = true;
        java.util.List<com.mongodb.ServerAddress> serverAddressList8 = builder0.mongoServers;
        boolean boolean9 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str11 = builder0.mongoLocalPassword;
        java.lang.String str12 = builder0.mongoLocalUser;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(serverAddressList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("collection", "ssl_verify_certificate", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?ssl_verify_certificate?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean3 = mongoDBRiverDefinition2.mongoSSLVerifyCertificate;
        java.lang.String str4 = mongoDBRiverDefinition2.getGRIDFS_FIELD();
        boolean boolean5 = mongoDBRiverDefinition2.importAllCollections;
        java.lang.String str6 = mongoDBRiverDefinition2.getINCLUDE_FIELDS_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition2.getEXCLUDE_FIELDS_FIELD();
        int int8 = mongoDBRiverDefinition2.getDEFAULT_BULK_ACTIONS();
        java.lang.String str9 = mongoDBRiverDefinition2.getINITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "gridfs" + "'", str4, "gridfs");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "include_fields" + "'", str6, "include_fields");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "exclude_fields" + "'", str7, "exclude_fields");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1000 + "'", int8 == 1000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "script_type" + "'", str9, "script_type");
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = builder0.statisticsTypeName;
        builder0.setmongoSSLVerifyCertificate(true);
        java.lang.String str6 = builder0.getstatisticsIndexName();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoAdminPassword("db");
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory6 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.common.settings.Settings settings7 = null;
        org.elasticsearch.common.settings.Settings settings8 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder9);
        java.util.Set<java.lang.String> strSet11 = builder9.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions12 = builder9.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject13 = null;
        builder9.setmongoOplogFilter(basicDBObject13);
        com.mongodb.BasicDBObject basicDBObject15 = builder9.getmongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings16 = new org.elasticsearch.river.RiverSettings(settings8, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject15);
        org.elasticsearch.river.RiverSettings riverSettings17 = new org.elasticsearch.river.RiverSettings(settings7, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject15);
        org.elasticsearch.script.ExecutableScript executableScript18 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject15);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder0.mongoOplogFilter(basicDBObject15);
        java.lang.String str20 = builder0.typeName;
        builder0.setindexName("options");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(strSet11);
        org.junit.Assert.assertNull(mongoClientOptions12);
        org.junit.Assert.assertNotNull(basicDBObject15);
        org.junit.Assert.assertNotNull(executableScript18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        java.lang.String str4 = builder0.mongoAdminUser;
        builder0.disableIndexRefresh = false;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.statisticsIndexName("port");
        boolean boolean9 = builder8.getmongoGridFS();
        java.lang.String str10 = builder8.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str12 = builder8.mongoCollection;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        boolean boolean7 = mongoDBRiverDefinition6.getmongoGridFS();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.statisticsTypeName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoDb("secondary_read_preference");
        java.lang.String str7 = builder0.getstatisticsTypeName();
        builder0.mongoSSLVerifyCertificate = true;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str11 = builder10.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str14 = builder13.typeName;
        com.mongodb.BasicDBObject basicDBObject15 = null;
        builder13.mongoCollectionFilter = basicDBObject15;
        com.mongodb.BasicDBObject basicDBObject17 = null;
        builder13.mongoOplogFilter = basicDBObject17;
        builder13.disableIndexRefresh = true;
        java.util.List<com.mongodb.ServerAddress> serverAddressList21 = builder13.mongoServers;
        java.lang.String[] strArray25 = new java.lang.String[] { "connect_timeout", "credentials", "connect_timeout" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        builder13.setparentTypes((java.util.Set<java.lang.String>) strSet26);
        builder10.parentTypes = strSet26;
        boolean boolean30 = builder10.getmongoSSLVerifyCertificate();
        builder10.setscript("skip_initial_import");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder33.setmongoDb("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder33.dropCollection(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder37.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str41 = builder40.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition42 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder40);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str44 = builder43.typeName;
        com.mongodb.BasicDBObject basicDBObject45 = null;
        builder43.mongoCollectionFilter = basicDBObject45;
        com.mongodb.BasicDBObject basicDBObject47 = null;
        builder43.mongoOplogFilter = basicDBObject47;
        builder43.disableIndexRefresh = true;
        java.util.List<com.mongodb.ServerAddress> serverAddressList51 = builder43.mongoServers;
        java.lang.String[] strArray55 = new java.lang.String[] { "connect_timeout", "credentials", "connect_timeout" };
        java.util.LinkedHashSet<java.lang.String> strSet56 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet56, strArray55);
        builder43.setparentTypes((java.util.Set<java.lang.String>) strSet56);
        builder40.parentTypes = strSet56;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder37.excludeFields((java.util.Set<java.lang.String>) strSet56);
        builder10.setexcludeFields((java.util.Set<java.lang.String>) strSet56);
        builder0.includeFields = strSet56;
        java.lang.Class<?> wildcardClass63 = builder0.getClass();
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "bulk_size" + "'", str7, "bulk_size");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(serverAddressList21);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(serverAddressList51);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) (-1));
        org.apache.lucene.search.Scorer scorer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setScorer(scorer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1) + "'", obj4, (-1));
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        java.lang.String str4 = builder0.mongoAdminUser;
        builder0.disableIndexRefresh = false;
        java.lang.String str7 = builder0.typeName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.importAllCollections(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder9);
        java.lang.Class<?> wildcardClass11 = builder9.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) (-1));
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str7 = builder6.typeName;
        com.mongodb.BasicDBObject basicDBObject8 = null;
        builder6.mongoCollectionFilter = basicDBObject8;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder6.mongoAdminPassword("db");
        docScoreSearchScript0.setNextVar("bulk_size", (java.lang.Object) builder6);
        java.lang.Object obj14 = null;
        docScoreSearchScript0.setNextVar("gridfs", obj14);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder16);
        java.util.Set<java.lang.String> strSet18 = builder16.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions19 = builder16.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject20 = null;
        builder16.setmongoOplogFilter(basicDBObject20);
        boolean boolean22 = builder16.dropCollection;
        com.mongodb.ServerAddress[] serverAddressArray23 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList24 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList24, serverAddressArray23);
        builder16.mongoServers = serverAddressList24;
        java.lang.String str27 = builder16.mongoAdminPassword;
        java.lang.String str28 = builder16.getscriptType();
        java.lang.String str29 = builder16.gettypeName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder16.connectTimeout((int) (short) 0);
        builder31.typeName = "credentials";
        java.lang.Object obj34 = docScoreSearchScript0.unwrap((java.lang.Object) builder31);
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextDocId(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1) + "'", obj4, (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNull(strSet18);
        org.junit.Assert.assertNull(mongoClientOptions19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(serverAddressArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(obj34);
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        java.lang.String str3 = builder0.getstatisticsIndexName();
        builder0.setsocketTimeout(10);
        builder0.setstatisticsTypeName("size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.mongoGridFS(true);
        com.mongodb.BasicDBObject basicDBObject10 = null;
        builder0.mongoCollectionFilter = basicDBObject10;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder0.riverName("concurrent_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str15 = builder14.typeName;
        com.mongodb.BasicDBObject basicDBObject16 = null;
        builder14.mongoCollectionFilter = basicDBObject16;
        com.mongodb.BasicDBObject basicDBObject18 = null;
        builder14.mongoOplogFilter = basicDBObject18;
        builder14.disableIndexRefresh = true;
        java.util.List<com.mongodb.ServerAddress> serverAddressList22 = builder14.mongoServers;
        java.lang.String[] strArray26 = new java.lang.String[] { "connect_timeout", "credentials", "connect_timeout" };
        java.util.LinkedHashSet<java.lang.String> strSet27 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet27, strArray26);
        builder14.setparentTypes((java.util.Set<java.lang.String>) strSet27);
        builder13.setexcludeFields((java.util.Set<java.lang.String>) strSet27);
        org.bson.types.Binary binary31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder13.initialTimestamp(binary31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(serverAddressList22);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.getmongoClientOptions();
        builder0.setstatisticsTypeName("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.skipInitialImport(true);
        java.util.Set<java.lang.String> strSet8 = builder7.excludeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder7.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.connectTimeout((int) (short) 1);
        builder12.setmongoSSLVerifyCertificate(false);
        java.lang.Class<?> wildcardClass15 = builder12.getClass();
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(mongoClientOptions3);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(strSet8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean3 = mongoDBRiverDefinition2.mongoSSLVerifyCertificate;
        java.lang.String str4 = mongoDBRiverDefinition2.getGRIDFS_FIELD();
        boolean boolean5 = mongoDBRiverDefinition2.importAllCollections;
        java.lang.String str6 = mongoDBRiverDefinition2.getINCLUDE_FIELDS_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition2.getScriptType();
        java.lang.String str8 = mongoDBRiverDefinition2.getIncludeCollection();
        java.util.Set<java.lang.String> strSet9 = mongoDBRiverDefinition2.getParentTypes();
        java.lang.String str10 = mongoDBRiverDefinition2.getStatisticsTypeName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "gridfs" + "'", str4, "gridfs");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "include_fields" + "'", str6, "include_fields");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(strSet9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = builder0.getmongoCollectionFilter();
        java.lang.String str7 = builder0.getindexName();
        com.mongodb.ServerAddress[] serverAddressArray8 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList9 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList9, serverAddressArray8);
        builder0.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList9);
        java.lang.String str12 = builder0.getstatisticsTypeName();
        com.mongodb.MongoClientOptions mongoClientOptions13 = null;
        builder0.mongoClientOptions = mongoClientOptions13;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str16 = mongoDBRiverDefinition15.getINITIAL_TIMESTAMP_SCRIPT_FIELD();
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(mongoClientOptions3);
        org.junit.Assert.assertNotNull(basicDBObject6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(serverAddressArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "script" + "'", str16, "script");
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoUseSSL(true);
        builder0.storeStatistics = true;
        java.lang.Class<?> wildcardClass8 = builder0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.setmongoOplogFilter(basicDBObject4);
        boolean boolean6 = builder0.dropCollection;
        com.mongodb.ServerAddress[] serverAddressArray7 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList8 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList8, serverAddressArray7);
        builder0.mongoServers = serverAddressList8;
        java.lang.String str11 = builder0.mongoAdminPassword;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str13 = builder12.typeName;
        com.mongodb.BasicDBObject basicDBObject14 = null;
        builder12.mongoCollectionFilter = basicDBObject14;
        java.lang.String str16 = builder12.mongoAdminUser;
        builder12.disableIndexRefresh = false;
        java.lang.String str19 = builder12.typeName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str21 = builder20.typeName;
        com.mongodb.BasicDBObject basicDBObject22 = null;
        builder20.mongoCollectionFilter = basicDBObject22;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder20.mongoUseSSL(true);
        java.lang.String[] strArray35 = new java.lang.String[] { "connect_timeout", "hi!", "port", "connect_timeout", "port", "bulk_size", "concurrent_bulk_requests", "", "options" };
        java.util.LinkedHashSet<java.lang.String> strSet36 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet36, strArray35);
        builder25.setparentTypes((java.util.Set<java.lang.String>) strSet36);
        builder12.parentTypes = strSet36;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder0.parentTypes((java.util.Set<java.lang.String>) strSet36);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder40.mongoGridFS(true);
        com.mongodb.BasicDBObject basicDBObject43 = builder40.mongoCollectionFilter;
        org.elasticsearch.common.settings.Settings settings44 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition46 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder45);
        java.util.Set<java.lang.String> strSet47 = builder45.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions48 = builder45.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject49 = null;
        builder45.setmongoOplogFilter(basicDBObject49);
        com.mongodb.BasicDBObject basicDBObject51 = builder45.getmongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings52 = new org.elasticsearch.river.RiverSettings(settings44, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject51);
        builder40.setmongoOplogFilter(basicDBObject51);
        int int54 = builder40.throttleSize;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition56 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder55);
        java.util.Set<java.lang.String> strSet57 = builder55.includeFields;
        builder55.storeStatistics = true;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition61 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder60);
        java.util.Set<java.lang.String> strSet62 = builder60.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions63 = builder60.getmongoClientOptions();
        builder60.setstatisticsTypeName("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition66 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder60);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder67 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str68 = builder67.typeName;
        com.mongodb.BasicDBObject basicDBObject69 = null;
        builder67.mongoCollectionFilter = basicDBObject69;
        java.lang.String str71 = builder67.mongoAdminUser;
        builder67.disableIndexRefresh = false;
        java.lang.String str74 = builder67.typeName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder75 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str76 = builder75.typeName;
        com.mongodb.BasicDBObject basicDBObject77 = null;
        builder75.mongoCollectionFilter = basicDBObject77;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder80 = builder75.mongoUseSSL(true);
        java.lang.String[] strArray90 = new java.lang.String[] { "connect_timeout", "hi!", "port", "connect_timeout", "port", "bulk_size", "concurrent_bulk_requests", "", "options" };
        java.util.LinkedHashSet<java.lang.String> strSet91 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet91, strArray90);
        builder80.setparentTypes((java.util.Set<java.lang.String>) strSet91);
        builder67.parentTypes = strSet91;
        builder60.excludeFields = strSet91;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder96 = builder55.includeFields((java.util.Set<java.lang.String>) strSet91);
        builder40.setexcludeFields((java.util.Set<java.lang.String>) strSet91);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder99 = builder40.mongoDb("db");
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(serverAddressArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(basicDBObject43);
        org.junit.Assert.assertNull(strSet47);
        org.junit.Assert.assertNull(mongoClientOptions48);
        org.junit.Assert.assertNotNull(basicDBObject51);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNull(strSet57);
        org.junit.Assert.assertNull(strSet62);
        org.junit.Assert.assertNull(mongoClientOptions63);
        org.junit.Assert.assertNull(str68);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNull(str74);
        org.junit.Assert.assertNull(str76);
        org.junit.Assert.assertNotNull(builder80);
        org.junit.Assert.assertNotNull(strArray90);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertNotNull(builder96);
        org.junit.Assert.assertNotNull(builder99);
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) (-1));
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str7 = builder6.typeName;
        com.mongodb.BasicDBObject basicDBObject8 = null;
        builder6.mongoCollectionFilter = basicDBObject8;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder6.mongoAdminPassword("db");
        docScoreSearchScript0.setNextVar("bulk_size", (java.lang.Object) builder6);
        java.lang.Object obj14 = null;
        docScoreSearchScript0.setNextVar("gridfs", obj14);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str18 = builder17.typeName;
        com.mongodb.BasicDBObject basicDBObject19 = null;
        builder17.mongoCollectionFilter = basicDBObject19;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder17.mongoAdminPassword("db");
        builder22.disableIndexRefresh = true;
        builder22.setconnectTimeout(1000);
        builder22.setriverIndexName("skip_initial_import");
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) builder22);
        // The following exception was thrown during execution in test generation
        try {
            double double30 = docScoreSearchScript0.runAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1) + "'", obj4, (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(builder22);
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoDb("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.dropCollection(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.skipInitialImport(false);
        com.mongodb.BasicDBObject basicDBObject7 = builder6.mongoCollectionFilter;
        builder6.mongoGridFS = true;
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(basicDBObject7);
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.setmongoOplogFilter(basicDBObject4);
        boolean boolean6 = builder0.dropCollection;
        boolean boolean7 = builder0.dropCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.mongoLocalPassword("");
        builder9.mongoCollection = "flush_interval";
        com.mongodb.BasicDBObject basicDBObject12 = builder9.mongoOplogFilter;
        builder9.mongoLocalPassword = "disable_index_refresh";
        boolean boolean15 = builder9.importAllCollections;
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(basicDBObject12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("skip_initial_import");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?skip_initial_import?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        java.lang.String str4 = builder0.mongoAdminUser;
        builder0.disableIndexRefresh = false;
        java.lang.String str7 = builder0.getincludeCollection();
        com.mongodb.MongoClientOptions mongoClientOptions8 = builder0.mongoClientOptions;
        builder0.importAllCollections = false;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder11);
        java.util.Set<java.lang.String> strSet13 = builder11.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions14 = builder11.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject15 = null;
        builder11.setmongoOplogFilter(basicDBObject15);
        boolean boolean17 = builder11.dropCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder11.socketTimeout((int) ' ');
        java.util.Set<java.lang.String> strSet20 = builder19.excludeFields;
        builder19.setriverName("hi!");
        builder19.setmongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str26 = builder25.typeName;
        com.mongodb.BasicDBObject basicDBObject27 = null;
        builder25.mongoCollectionFilter = basicDBObject27;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder25.mongoUseSSL(true);
        java.lang.String[] strArray40 = new java.lang.String[] { "connect_timeout", "hi!", "port", "connect_timeout", "port", "bulk_size", "concurrent_bulk_requests", "", "options" };
        java.util.LinkedHashSet<java.lang.String> strSet41 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet41, strArray40);
        builder30.setparentTypes((java.util.Set<java.lang.String>) strSet41);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder30.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str47 = builder46.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str49 = builder48.typeName;
        com.mongodb.BasicDBObject basicDBObject50 = null;
        builder48.mongoCollectionFilter = basicDBObject50;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder48.mongoUseSSL(true);
        java.lang.String[] strArray63 = new java.lang.String[] { "connect_timeout", "hi!", "port", "connect_timeout", "port", "bulk_size", "concurrent_bulk_requests", "", "options" };
        java.util.LinkedHashSet<java.lang.String> strSet64 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet64, strArray63);
        builder53.setparentTypes((java.util.Set<java.lang.String>) strSet64);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder67 = builder46.parentTypes((java.util.Set<java.lang.String>) strSet64);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder68 = builder45.parentTypes((java.util.Set<java.lang.String>) strSet64);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder69 = builder19.excludeFields((java.util.Set<java.lang.String>) strSet64);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder70 = builder0.excludeFields((java.util.Set<java.lang.String>) strSet64);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp71 = builder70.initialTimestamp;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(mongoClientOptions8);
        org.junit.Assert.assertNull(strSet13);
        org.junit.Assert.assertNull(mongoClientOptions14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNull(strSet20);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(builder68);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertNull(wildcardTimestamp71);
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.setmongoOplogFilter(basicDBObject4);
        boolean boolean6 = builder0.dropCollection;
        boolean boolean7 = builder0.dropCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.mongoLocalPassword("");
        builder9.mongoUseSSL = false;
        org.bson.types.Binary binary12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder9.initialTimestamp(binary12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.setmongoOplogFilter(basicDBObject4);
        boolean boolean6 = builder0.dropCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.socketTimeout((int) ' ');
        java.lang.String str9 = builder8.getscript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder8.mongoCollection("drop_collection");
        java.lang.String str12 = builder11.gettypeName();
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.getCONNECTION_TIMEOUT();
        java.lang.String str4 = mongoDBRiverDefinition2.getCREDENTIALS_FIELD();
        java.lang.String str5 = mongoDBRiverDefinition2.getStatisticsIndexName();
        java.util.Set<java.lang.String> strSet6 = mongoDBRiverDefinition2.getIncludeFields();
        java.lang.String str7 = mongoDBRiverDefinition2.getRiverName();
        boolean boolean8 = mongoDBRiverDefinition2.isMongoUseSSL();
        java.lang.String str9 = mongoDBRiverDefinition2.getBULK_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition2.getMongoAdminPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "connect_timeout" + "'", str3, "connect_timeout");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "credentials" + "'", str4, "credentials");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "bulk" + "'", str9, "bulk");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.getCONNECTION_TIMEOUT();
        java.lang.String str4 = mongoDBRiverDefinition2.getCREDENTIALS_FIELD();
        java.lang.String str5 = mongoDBRiverDefinition2.getDEFAULT_DB_HOST();
        boolean boolean6 = mongoDBRiverDefinition2.isSkipInitialImport();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "connect_timeout" + "'", str3, "connect_timeout");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "credentials" + "'", str4, "credentials");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "localhost" + "'", str5, "localhost");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.getCONNECTION_TIMEOUT();
        java.lang.String str4 = mongoDBRiverDefinition2.getCREDENTIALS_FIELD();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue5 = mongoDBRiverDefinition2.getDEFAULT_BULK_SIZE();
        java.lang.String str6 = mongoDBRiverDefinition2.indexName;
        java.lang.String str7 = mongoDBRiverDefinition2.getCONNECTION_TIMEOUT();
        boolean boolean8 = mongoDBRiverDefinition2.isDropCollection();
        java.lang.Class<?> wildcardClass9 = mongoDBRiverDefinition2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "connect_timeout" + "'", str3, "connect_timeout");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "credentials" + "'", str4, "credentials");
        org.junit.Assert.assertNotNull(byteSizeValue5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "connect_timeout" + "'", str7, "connect_timeout");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.setmongoOplogFilter(basicDBObject4);
        boolean boolean6 = builder0.dropCollection;
        com.mongodb.ServerAddress[] serverAddressArray7 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList8 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList8, serverAddressArray7);
        builder0.mongoServers = serverAddressList8;
        java.lang.String str11 = builder0.mongoAdminPassword;
        java.lang.String str12 = builder0.getscriptType();
        java.lang.String str13 = builder0.gettypeName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder0.scriptType("throttle_size");
        java.util.Set<java.lang.String> strSet16 = builder15.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder15.importAllCollections(true);
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(serverAddressArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNull(strSet16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        int int2 = mongoDBRiverDefinition1.getDEFAULT_CONCURRENT_REQUESTS();
        java.lang.String str3 = mongoDBRiverDefinition1.scriptType;
        boolean boolean4 = mongoDBRiverDefinition1.importAllCollections;
        int int5 = mongoDBRiverDefinition1.socketTimeout;
        boolean boolean6 = mongoDBRiverDefinition1.storeStatistics;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean3 = mongoDBRiverDefinition2.mongoSSLVerifyCertificate;
        java.lang.String str4 = mongoDBRiverDefinition2.getGRIDFS_FIELD();
        boolean boolean5 = mongoDBRiverDefinition2.importAllCollections;
        java.lang.String str6 = mongoDBRiverDefinition2.getINCLUDE_FIELDS_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition2.getCONCURRENT_BULK_REQUESTS_FIELD();
        boolean boolean8 = mongoDBRiverDefinition2.skipInitialImport;
        java.util.Set<java.lang.String> strSet9 = mongoDBRiverDefinition2.getIncludeFields();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "gridfs" + "'", str4, "gridfs");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "include_fields" + "'", str6, "include_fields");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "concurrent_bulk_requests" + "'", str7, "concurrent_bulk_requests");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(strSet9);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        java.lang.String str4 = builder0.mongoAdminUser;
        builder0.disableIndexRefresh = false;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.statisticsIndexName("port");
        builder0.setskipInitialImport(false);
        boolean boolean11 = builder0.mongoSecondaryReadPreference;
        java.lang.String str12 = builder0.getmongoAdminUser();
        java.lang.String str13 = builder0.typeName;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = builder0.getmongoCollectionFilter();
        java.lang.String str7 = builder0.getindexName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.mongoLocalUser("filter");
        org.bson.types.BSONTimestamp bSONTimestamp10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder0.initialTimestamp(bSONTimestamp10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ts must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(mongoClientOptions3);
        org.junit.Assert.assertNotNull(basicDBObject6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("index", "store_statistics");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?store_statistics?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.getCONNECTION_TIMEOUT();
        java.lang.String str4 = mongoDBRiverDefinition2.getCREDENTIALS_FIELD();
        java.lang.String str5 = mongoDBRiverDefinition2.getADVANCED_TRANSFORMATION_FIELD();
        boolean boolean6 = mongoDBRiverDefinition2.importAllCollections;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "connect_timeout" + "'", str3, "connect_timeout");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "credentials" + "'", str4, "credentials");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "advanced_transformation" + "'", str5, "advanced_transformation");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean3 = mongoDBRiverDefinition2.mongoSSLVerifyCertificate;
        java.lang.String str4 = mongoDBRiverDefinition2.getGRIDFS_FIELD();
        boolean boolean5 = mongoDBRiverDefinition2.importAllCollections;
        java.lang.String str6 = mongoDBRiverDefinition2.getINCLUDE_FIELDS_FIELD();
        com.mongodb.MongoClientOptions mongoClientOptions7 = mongoDBRiverDefinition2.mongoClientOptions;
        java.lang.String str8 = mongoDBRiverDefinition2.getDEFAULT_DB_HOST();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "gridfs" + "'", str4, "gridfs");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "include_fields" + "'", str6, "include_fields");
        org.junit.Assert.assertNull(mongoClientOptions7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "localhost" + "'", str8, "localhost");
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        org.elasticsearch.common.settings.Settings settings2 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        org.elasticsearch.river.RiverSettings riverSettings4 = new org.elasticsearch.river.RiverSettings(settings2, strMap3);
        org.elasticsearch.script.ScriptService scriptService5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("store_statistics", "import_all_collections", riverSettings4, scriptService5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) (-1));
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str7 = builder6.typeName;
        com.mongodb.BasicDBObject basicDBObject8 = null;
        builder6.mongoCollectionFilter = basicDBObject8;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder6.mongoAdminPassword("db");
        docScoreSearchScript0.setNextVar("bulk_size", (java.lang.Object) builder6);
        java.lang.Object obj14 = null;
        docScoreSearchScript0.setNextVar("gridfs", obj14);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str18 = builder17.typeName;
        com.mongodb.BasicDBObject basicDBObject19 = null;
        builder17.mongoCollectionFilter = basicDBObject19;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder17.mongoAdminPassword("db");
        builder22.disableIndexRefresh = true;
        builder22.setconnectTimeout(1000);
        builder22.setriverIndexName("skip_initial_import");
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) builder22);
        // The following exception was thrown during execution in test generation
        try {
            long long30 = docScoreSearchScript0.runAsLong();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1) + "'", obj4, (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(builder22);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory1 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.common.settings.Settings settings2 = null;
        org.elasticsearch.common.settings.Settings settings3 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.util.Set<java.lang.String> strSet7 = builder5.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions8 = builder5.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject9 = null;
        builder5.setmongoOplogFilter(basicDBObject9);
        com.mongodb.BasicDBObject basicDBObject11 = builder5.getmongoCollectionFilter();
        builder4.mongoCollectionFilter = basicDBObject11;
        org.elasticsearch.river.RiverSettings riverSettings13 = new org.elasticsearch.river.RiverSettings(settings3, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject11);
        org.elasticsearch.river.RiverSettings riverSettings14 = new org.elasticsearch.river.RiverSettings(settings2, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject11);
        org.elasticsearch.script.ExecutableScript executableScript15 = docScoreNativeScriptFactory1.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject11);
        org.elasticsearch.river.RiverSettings riverSettings16 = new org.elasticsearch.river.RiverSettings(settings0, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject11);
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = riverSettings16.settings();
        java.lang.Class<?> wildcardClass18 = strMap17.getClass();
        org.junit.Assert.assertNull(strSet7);
        org.junit.Assert.assertNull(mongoClientOptions8);
        org.junit.Assert.assertNotNull(basicDBObject11);
        org.junit.Assert.assertNotNull(executableScript15);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean3 = mongoDBRiverDefinition2.mongoSSLVerifyCertificate;
        java.lang.String str4 = mongoDBRiverDefinition2.getGRIDFS_FIELD();
        boolean boolean5 = mongoDBRiverDefinition2.importAllCollections;
        java.lang.String str6 = mongoDBRiverDefinition2.getINCLUDE_FIELDS_FIELD();
        com.mongodb.MongoClientOptions mongoClientOptions7 = mongoDBRiverDefinition2.mongoClientOptions;
        boolean boolean8 = mongoDBRiverDefinition2.isMongoUseSSL();
        java.util.Set<java.lang.String> strSet9 = mongoDBRiverDefinition2.getParentTypes();
        java.lang.String str10 = mongoDBRiverDefinition2.getINCLUDE_FIELDS_FIELD();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "gridfs" + "'", str4, "gridfs");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "include_fields" + "'", str6, "include_fields");
        org.junit.Assert.assertNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(strSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "include_fields" + "'", str10, "include_fields");
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        java.lang.String str3 = builder0.getstatisticsIndexName();
        builder0.setsocketTimeout(10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setriverIndexName("local");
        org.bson.types.BSONTimestamp bSONTimestamp9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.initialTimestamp(bSONTimestamp9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ts must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.setmongoOplogFilter(basicDBObject4);
        boolean boolean6 = builder0.dropCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.socketTimeout((int) ' ');
        java.util.Set<java.lang.String> strSet9 = builder8.excludeFields;
        builder8.setriverName("hi!");
        com.mongodb.MongoClientOptions mongoClientOptions12 = builder8.getmongoClientOptions();
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(strSet9);
        org.junit.Assert.assertNull(mongoClientOptions12);
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.setmongoOplogFilter(basicDBObject4);
        boolean boolean6 = builder0.dropCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.socketTimeout((int) ' ');
        java.lang.String str9 = builder8.getscript();
        java.lang.String str10 = builder8.typeName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder8.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.mongoLocalUser("bulk");
        java.lang.String str15 = builder14.getscriptType();
        java.lang.String str16 = builder14.mongoAdminPassword;
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        int int2 = mongoDBRiverDefinition1.getDEFAULT_CONCURRENT_REQUESTS();
        java.util.List<com.mongodb.ServerAddress> serverAddressList3 = mongoDBRiverDefinition1.mongoServers;
        boolean boolean4 = mongoDBRiverDefinition1.importAllCollections;
        boolean boolean5 = mongoDBRiverDefinition1.getmongoSSLVerifyCertificate();
        java.lang.String str6 = mongoDBRiverDefinition1.getSSL_VERIFY_CERT_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition1.getSIZE_FIELD();
        java.lang.String str8 = mongoDBRiverDefinition1.getSKIP_INITIAL_IMPORT_FIELD();
        java.lang.String str9 = mongoDBRiverDefinition1.getIndexName();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertNotNull(serverAddressList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ssl_verify_certificate" + "'", str6, "ssl_verify_certificate");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "size" + "'", str7, "size");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "skip_initial_import" + "'", str8, "skip_initial_import");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        java.lang.String str4 = builder0.mongoAdminUser;
        builder0.disableIndexRefresh = false;
        java.lang.String str7 = builder0.getincludeCollection();
        com.mongodb.MongoClientOptions mongoClientOptions8 = builder0.mongoClientOptions;
        builder0.importAllCollections = false;
        builder0.setmongoSecondaryReadPreference(false);
        builder0.setstatisticsTypeName("exclude_fields");
        com.mongodb.BasicDBObject basicDBObject15 = builder0.mongoOplogFilter;
        boolean boolean16 = builder0.getmongoGridFS();
        builder0.script = "flush_interval";
        builder0.setmongoUseSSL(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(mongoClientOptions8);
        org.junit.Assert.assertNull(basicDBObject15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        org.elasticsearch.common.settings.Settings settings2 = null;
        org.elasticsearch.common.settings.Settings settings3 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder4);
        java.util.Set<java.lang.String> strSet6 = builder4.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject8 = null;
        builder4.setmongoOplogFilter(basicDBObject8);
        com.mongodb.BasicDBObject basicDBObject10 = builder4.getmongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings11 = new org.elasticsearch.river.RiverSettings(settings3, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject10);
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = riverSettings11.settings();
        org.elasticsearch.river.RiverSettings riverSettings13 = new org.elasticsearch.river.RiverSettings(settings2, strMap12);
        org.elasticsearch.script.ScriptService scriptService14 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition15 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("", "initial_timestamp", riverSettings13, scriptService14);
        java.lang.String str16 = mongoDBRiverDefinition15.getDEFAULT_DB_HOST();
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertNull(mongoClientOptions7);
        org.junit.Assert.assertNotNull(basicDBObject10);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "localhost" + "'", str16, "localhost");
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoUseSSL(true);
        builder0.connectTimeout = (byte) -1;
        builder0.setsocketTimeout((int) (short) 1);
        java.lang.String str10 = builder0.getstatisticsTypeName();
        boolean boolean11 = builder0.getmongoGridFS();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder0.mongoLocalUser("name");
        builder0.setmongoSecondaryReadPreference(false);
        builder0.setmongoSecondaryReadPreference(false);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str3 = builder2.typeName;
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder2.mongoCollectionFilter = basicDBObject4;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder2.mongoUseSSL(true);
        java.lang.String[] strArray17 = new java.lang.String[] { "connect_timeout", "hi!", "port", "connect_timeout", "port", "bulk_size", "concurrent_bulk_requests", "", "options" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        builder7.setparentTypes((java.util.Set<java.lang.String>) strSet18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder0.parentTypes((java.util.Set<java.lang.String>) strSet18);
        builder0.setdisableIndexRefresh(false);
        java.lang.String str24 = builder0.getmongoAdminUser();
        builder0.setindexName("throttle_size");
        java.lang.String str27 = builder0.getmongoLocalPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        org.elasticsearch.common.settings.Settings settings2 = null;
        org.elasticsearch.common.settings.Settings settings3 = null;
        org.elasticsearch.common.settings.Settings settings4 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.util.Set<java.lang.String> strSet7 = builder5.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions8 = builder5.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject9 = null;
        builder5.setmongoOplogFilter(basicDBObject9);
        com.mongodb.BasicDBObject basicDBObject11 = builder5.getmongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings12 = new org.elasticsearch.river.RiverSettings(settings4, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject11);
        org.elasticsearch.river.RiverSettings riverSettings13 = new org.elasticsearch.river.RiverSettings(settings3, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject11);
        org.elasticsearch.river.RiverSettings riverSettings14 = new org.elasticsearch.river.RiverSettings(settings2, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject11);
        org.elasticsearch.script.ScriptService scriptService15 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("script_type", "import_all_collections", riverSettings14, scriptService15);
        boolean boolean17 = mongoDBRiverDefinition16.getmongoSSLVerifyCertificate();
        java.lang.String str18 = mongoDBRiverDefinition16.getFLUSH_INTERVAL_FIELD();
        org.junit.Assert.assertNull(strSet7);
        org.junit.Assert.assertNull(mongoClientOptions8);
        org.junit.Assert.assertNotNull(basicDBObject11);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "flush_interval" + "'", str18, "flush_interval");
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        java.lang.String str3 = builder0.getstatisticsIndexName();
        builder0.setsocketTimeout(10);
        builder0.setstatisticsTypeName("size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.mongoGridFS(true);
        com.mongodb.BasicDBObject basicDBObject10 = null;
        builder0.mongoCollectionFilter = basicDBObject10;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder0.riverName("concurrent_requests");
        int int14 = builder13.getsocketTimeout();
        builder13.typeName = "hi!";
        com.mongodb.MongoClientOptions mongoClientOptions17 = builder13.getmongoClientOptions();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder13);
        boolean boolean19 = mongoDBRiverDefinition18.getimportAllCollections();
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNull(mongoClientOptions17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.mongoOplogFilter = basicDBObject4;
        builder0.disableIndexRefresh = true;
        java.util.List<com.mongodb.ServerAddress> serverAddressList8 = builder0.mongoServers;
        boolean boolean9 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean11 = builder0.getmongoGridFS();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder0.statisticsTypeName("flush_interval");
        com.mongodb.MongoClientOptions mongoClientOptions14 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder0.mongoClientOptions(mongoClientOptions14);
        builder0.mongoLocalUser = "drop_collection";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(serverAddressList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoUseSSL(true);
        builder0.connectTimeout = (byte) -1;
        builder0.setsocketTimeout((int) (short) 1);
        java.lang.String str10 = builder0.getstatisticsTypeName();
        boolean boolean11 = builder0.getmongoGridFS();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder0.mongoLocalUser("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder0.mongoDb("collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str18 = builder17.typeName;
        com.mongodb.BasicDBObject basicDBObject19 = null;
        builder17.mongoCollectionFilter = basicDBObject19;
        com.mongodb.BasicDBObject basicDBObject21 = null;
        builder17.mongoOplogFilter = basicDBObject21;
        builder17.disableIndexRefresh = true;
        java.util.List<com.mongodb.ServerAddress> serverAddressList25 = builder17.mongoServers;
        java.lang.String[] strArray29 = new java.lang.String[] { "connect_timeout", "credentials", "connect_timeout" };
        java.util.LinkedHashSet<java.lang.String> strSet30 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet30, strArray29);
        builder17.setparentTypes((java.util.Set<java.lang.String>) strSet30);
        builder16.includeFields = strSet30;
        int int34 = builder16.throttleSize;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(serverAddressList25);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.getCONNECTION_TIMEOUT();
        java.lang.String str4 = mongoDBRiverDefinition2.getCREDENTIALS_FIELD();
        java.lang.String str5 = mongoDBRiverDefinition2.getDEFAULT_DB_HOST();
        int int6 = mongoDBRiverDefinition2.socketTimeout;
        com.mongodb.BasicDBObject basicDBObject7 = mongoDBRiverDefinition2.getMongoCollectionFilter();
        com.mongodb.BasicDBObject basicDBObject8 = mongoDBRiverDefinition2.getMongoOplogFilter();
        java.lang.String str9 = mongoDBRiverDefinition2.mongoDb;
        java.lang.String str10 = mongoDBRiverDefinition2.getSIZE_FIELD();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "connect_timeout" + "'", str3, "connect_timeout");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "credentials" + "'", str4, "credentials");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "localhost" + "'", str5, "localhost");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(basicDBObject7);
        org.junit.Assert.assertNull(basicDBObject8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "size" + "'", str10, "size");
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.setmongoOplogFilter(basicDBObject4);
        boolean boolean6 = builder0.dropCollection;
        com.mongodb.ServerAddress[] serverAddressArray7 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList8 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList8, serverAddressArray7);
        builder0.mongoServers = serverAddressList8;
        java.lang.String str11 = builder0.mongoAdminPassword;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str13 = builder12.typeName;
        com.mongodb.BasicDBObject basicDBObject14 = null;
        builder12.mongoCollectionFilter = basicDBObject14;
        java.lang.String str16 = builder12.mongoAdminUser;
        builder12.disableIndexRefresh = false;
        java.lang.String str19 = builder12.typeName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str21 = builder20.typeName;
        com.mongodb.BasicDBObject basicDBObject22 = null;
        builder20.mongoCollectionFilter = basicDBObject22;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder20.mongoUseSSL(true);
        java.lang.String[] strArray35 = new java.lang.String[] { "connect_timeout", "hi!", "port", "connect_timeout", "port", "bulk_size", "concurrent_bulk_requests", "", "options" };
        java.util.LinkedHashSet<java.lang.String> strSet36 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet36, strArray35);
        builder25.setparentTypes((java.util.Set<java.lang.String>) strSet36);
        builder12.parentTypes = strSet36;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder0.parentTypes((java.util.Set<java.lang.String>) strSet36);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder40.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder42.mongoUseSSL(false);
        builder42.storeStatistics = true;
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(serverAddressArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        java.lang.String str3 = builder0.getstatisticsIndexName();
        builder0.setsocketTimeout(10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.storeStatistics(false);
        java.lang.String str9 = builder8.getriverIndexName();
        builder8.setstoreStatistics(true);
        int int12 = builder8.getsocketTimeout();
        com.mongodb.BasicDBObject basicDBObject13 = builder8.getmongoOplogFilter();
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNull(basicDBObject13);
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoAdminPassword("db");
        builder5.importAllCollections = false;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder5.connectTimeout(1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder5.importAllCollections(false);
        java.lang.String str12 = builder5.getstatisticsIndexName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        java.lang.String str4 = builder0.mongoAdminUser;
        builder0.disableIndexRefresh = false;
        java.lang.String str7 = builder0.getincludeCollection();
        com.mongodb.MongoClientOptions mongoClientOptions8 = builder0.getmongoClientOptions();
        int int9 = builder0.connectTimeout;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder0.advancedTransformation(true);
        boolean boolean12 = builder11.getmongoUseSSL();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(mongoClientOptions8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean3 = mongoDBRiverDefinition2.isMongoSecondaryReadPreference();
        java.lang.String str4 = mongoDBRiverDefinition2.getMongoDb();
        java.lang.String str5 = mongoDBRiverDefinition2.getSCRIPT_TYPE_FIELD();
        boolean boolean6 = mongoDBRiverDefinition2.getadvancedTransformation();
        java.lang.String str7 = mongoDBRiverDefinition2.getIndexName();
        boolean boolean8 = mongoDBRiverDefinition2.getmongoSecondaryReadPreference();
        java.lang.String str9 = mongoDBRiverDefinition2.getOPTIONS_FIELD();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "script_type" + "'", str5, "script_type");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "options" + "'", str9, "options");
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = builder0.getmongoCollectionFilter();
        builder0.setthrottleSize(27017);
        java.lang.String str9 = builder0.getstatisticsIndexName();
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(mongoClientOptions3);
        org.junit.Assert.assertNotNull(basicDBObject6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("collection", "", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = mongoDBRiverDefinition1.getExcludeFields();
        java.lang.String str3 = mongoDBRiverDefinition1.statisticsIndexName;
        boolean boolean4 = mongoDBRiverDefinition1.getmongoGridFS();
        java.lang.String str5 = mongoDBRiverDefinition1.getSCRIPT_FIELD();
        java.lang.String str6 = mongoDBRiverDefinition1.getUSER_FIELD();
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "script" + "'", str5, "script");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "user" + "'", str6, "user");
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript4 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript4.setNextScore((float) (byte) 1);
        java.lang.Object obj8 = docScoreSearchScript4.unwrap((java.lang.Object) (-1));
        java.lang.Object obj10 = docScoreSearchScript4.unwrap((java.lang.Object) "bulk");
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory12 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder14);
        java.util.Set<java.lang.String> strSet16 = builder14.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions17 = builder14.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject18 = null;
        builder14.setmongoOplogFilter(basicDBObject18);
        com.mongodb.BasicDBObject basicDBObject20 = builder14.getmongoCollectionFilter();
        builder13.mongoCollectionFilter = basicDBObject20;
        org.elasticsearch.script.ExecutableScript executableScript22 = docScoreNativeScriptFactory12.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject20);
        org.elasticsearch.common.settings.Settings settings23 = null;
        org.elasticsearch.common.settings.Settings settings24 = null;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory25 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder27);
        java.util.Set<java.lang.String> strSet29 = builder27.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions30 = builder27.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject31 = null;
        builder27.setmongoOplogFilter(basicDBObject31);
        com.mongodb.BasicDBObject basicDBObject33 = builder27.getmongoCollectionFilter();
        builder26.mongoCollectionFilter = basicDBObject33;
        org.elasticsearch.script.ExecutableScript executableScript35 = docScoreNativeScriptFactory25.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject33);
        org.elasticsearch.river.RiverSettings riverSettings36 = new org.elasticsearch.river.RiverSettings(settings24, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject33);
        org.elasticsearch.river.RiverSettings riverSettings37 = new org.elasticsearch.river.RiverSettings(settings23, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject33);
        org.elasticsearch.script.ExecutableScript executableScript38 = docScoreNativeScriptFactory12.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject33);
        docScoreSearchScript4.setNextVar("actions", (java.lang.Object) basicDBObject33);
        docScoreSearchScript0.setNextVar("port", (java.lang.Object) docScoreSearchScript4);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str42 = builder41.typeName;
        com.mongodb.BasicDBObject basicDBObject43 = null;
        builder41.mongoCollectionFilter = basicDBObject43;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder41.mongoUseSSL(true);
        builder41.connectTimeout = (byte) -1;
        builder41.setsocketTimeout((int) (short) 1);
        java.lang.String str51 = builder41.getstatisticsTypeName();
        java.lang.String str52 = builder41.typeName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition53 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder41);
        java.lang.Object obj54 = docScoreSearchScript0.unwrap((java.lang.Object) builder41);
        org.apache.lucene.search.Scorer scorer55 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setScorer(scorer55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1) + "'", obj8, (-1));
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "bulk" + "'", obj10, "bulk");
        org.junit.Assert.assertNull(strSet16);
        org.junit.Assert.assertNull(mongoClientOptions17);
        org.junit.Assert.assertNotNull(basicDBObject20);
        org.junit.Assert.assertNotNull(executableScript22);
        org.junit.Assert.assertNull(strSet29);
        org.junit.Assert.assertNull(mongoClientOptions30);
        org.junit.Assert.assertNotNull(basicDBObject33);
        org.junit.Assert.assertNotNull(executableScript35);
        org.junit.Assert.assertNotNull(executableScript38);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNotNull(obj54);
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder4);
        java.util.Set<java.lang.String> strSet6 = builder4.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject8 = null;
        builder4.setmongoOplogFilter(basicDBObject8);
        boolean boolean10 = builder4.dropCollection;
        com.mongodb.ServerAddress[] serverAddressArray11 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList12 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList12, serverAddressArray11);
        builder4.mongoServers = serverAddressList12;
        java.lang.String str15 = builder4.mongoAdminPassword;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str17 = builder16.typeName;
        com.mongodb.BasicDBObject basicDBObject18 = null;
        builder16.mongoCollectionFilter = basicDBObject18;
        java.lang.String str20 = builder16.mongoAdminUser;
        builder16.disableIndexRefresh = false;
        java.lang.String str23 = builder16.typeName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str25 = builder24.typeName;
        com.mongodb.BasicDBObject basicDBObject26 = null;
        builder24.mongoCollectionFilter = basicDBObject26;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder24.mongoUseSSL(true);
        java.lang.String[] strArray39 = new java.lang.String[] { "connect_timeout", "hi!", "port", "connect_timeout", "port", "bulk_size", "concurrent_bulk_requests", "", "options" };
        java.util.LinkedHashSet<java.lang.String> strSet40 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet40, strArray39);
        builder29.setparentTypes((java.util.Set<java.lang.String>) strSet40);
        builder16.parentTypes = strSet40;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder4.parentTypes((java.util.Set<java.lang.String>) strSet40);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder4.includeCollection("type");
        docScoreSearchScript0.setNextVar("", (java.lang.Object) builder4);
        java.util.Map<java.lang.String, java.lang.Object> strMap48 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextSource(strMap48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(serverAddressArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoUseSSL(true);
        builder5.setmongoAdminUser("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        boolean boolean9 = mongoDBRiverDefinition8.isMongoSecondaryReadPreference();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.getCONNECTION_TIMEOUT();
        java.lang.String str4 = mongoDBRiverDefinition2.getCREDENTIALS_FIELD();
        java.lang.String str5 = mongoDBRiverDefinition2.getPARENT_TYPES_FIELD();
        com.mongodb.BasicDBObject basicDBObject6 = mongoDBRiverDefinition2.mongoOplogFilter;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "connect_timeout" + "'", str3, "connect_timeout");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "credentials" + "'", str4, "credentials");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "parent_types" + "'", str5, "parent_types");
        org.junit.Assert.assertNull(basicDBObject6);
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoUseSSL(true);
        com.mongodb.MongoClientOptions mongoClientOptions6 = null;
        builder5.mongoClientOptions = mongoClientOptions6;
        builder5.setmongoCollection("gridfs");
        boolean boolean10 = builder5.getstoreStatistics();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.setmongoOplogFilter(basicDBObject4);
        boolean boolean6 = builder0.dropCollection;
        com.mongodb.ServerAddress[] serverAddressArray7 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList8 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList8, serverAddressArray7);
        builder0.mongoServers = serverAddressList8;
        java.lang.String str11 = builder0.mongoAdminPassword;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder0.importAllCollections(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder0.skipInitialImport(true);
        builder15.mongoSSLVerifyCertificate = true;
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(serverAddressArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoUseSSL(true);
        builder0.connectTimeout = (byte) -1;
        int int8 = builder0.socketTimeout;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.statisticsIndexName("initial_timestamp");
        java.lang.String str11 = builder10.mongoLocalUser;
        org.elasticsearch.common.settings.Settings settings12 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder13);
        java.util.Set<java.lang.String> strSet15 = builder13.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions16 = builder13.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject17 = null;
        builder13.setmongoOplogFilter(basicDBObject17);
        com.mongodb.BasicDBObject basicDBObject19 = builder13.getmongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings20 = new org.elasticsearch.river.RiverSettings(settings12, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject19);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder10.mongoCollectionFilter(basicDBObject19);
        builder10.mongoDb = "include_collection";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(strSet15);
        org.junit.Assert.assertNull(mongoClientOptions16);
        org.junit.Assert.assertNotNull(basicDBObject19);
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        int int2 = mongoDBRiverDefinition1.getDEFAULT_CONCURRENT_REQUESTS();
        java.lang.String str3 = mongoDBRiverDefinition1.getDB_FIELD();
        java.lang.String str4 = mongoDBRiverDefinition1.getIncludeCollection();
        java.lang.String str5 = mongoDBRiverDefinition1.mongoCollection;
        java.lang.String str6 = mongoDBRiverDefinition1.getEXCLUDE_FIELDS_FIELD();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "db" + "'", str3, "db");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "exclude_fields" + "'", str6, "exclude_fields");
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.mongoOplogFilter = basicDBObject4;
        builder0.disableIndexRefresh = true;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.typeName("secondary_read_preference");
        boolean boolean10 = builder9.skipInitialImport;
        java.lang.String str11 = builder9.getriverName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder9.mongoLocalUser("local");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder13);
        int int15 = mongoDBRiverDefinition14.getThrottleSize();
        boolean boolean16 = mongoDBRiverDefinition14.mongoSSLVerifyCertificate;
        boolean boolean17 = mongoDBRiverDefinition14.mongoSSLVerifyCertificate;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.statisticsTypeName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoDb("secondary_read_preference");
        com.mongodb.MongoClientOptions mongoClientOptions7 = null;
        builder6.setmongoClientOptions(mongoClientOptions7);
        builder6.setriverName("options");
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.statisticsTypeName("bulk_size");
        builder0.includeCollection = "port";
        builder0.mongoAdminPassword = "localhost";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder9);
        java.util.Set<java.lang.String> strSet11 = builder9.includeFields;
        java.lang.String str12 = builder9.getstatisticsIndexName();
        builder9.setsocketTimeout(10);
        builder9.setstatisticsTypeName("size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder9.mongoGridFS(true);
        org.elasticsearch.common.settings.Settings settings19 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder21);
        java.util.Set<java.lang.String> strSet23 = builder21.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions24 = builder21.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject25 = null;
        builder21.setmongoOplogFilter(basicDBObject25);
        com.mongodb.BasicDBObject basicDBObject27 = builder21.getmongoCollectionFilter();
        builder20.mongoCollectionFilter = basicDBObject27;
        org.elasticsearch.river.RiverSettings riverSettings29 = new org.elasticsearch.river.RiverSettings(settings19, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject27);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder9.mongoCollectionFilter(basicDBObject27);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder0.mongoOplogFilter(basicDBObject27);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder0.typeName("concurrent_requests");
        int int34 = builder33.throttleSize;
        org.bson.types.Binary binary35 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder33.initialTimestamp(binary35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNull(strSet11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNull(strSet23);
        org.junit.Assert.assertNull(mongoClientOptions24);
        org.junit.Assert.assertNotNull(basicDBObject27);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript4 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript4.setNextScore((float) (byte) 1);
        java.lang.Object obj8 = docScoreSearchScript4.unwrap((java.lang.Object) (-1));
        java.lang.Object obj10 = docScoreSearchScript4.unwrap((java.lang.Object) "bulk");
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory12 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder14);
        java.util.Set<java.lang.String> strSet16 = builder14.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions17 = builder14.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject18 = null;
        builder14.setmongoOplogFilter(basicDBObject18);
        com.mongodb.BasicDBObject basicDBObject20 = builder14.getmongoCollectionFilter();
        builder13.mongoCollectionFilter = basicDBObject20;
        org.elasticsearch.script.ExecutableScript executableScript22 = docScoreNativeScriptFactory12.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject20);
        org.elasticsearch.common.settings.Settings settings23 = null;
        org.elasticsearch.common.settings.Settings settings24 = null;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory25 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder27);
        java.util.Set<java.lang.String> strSet29 = builder27.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions30 = builder27.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject31 = null;
        builder27.setmongoOplogFilter(basicDBObject31);
        com.mongodb.BasicDBObject basicDBObject33 = builder27.getmongoCollectionFilter();
        builder26.mongoCollectionFilter = basicDBObject33;
        org.elasticsearch.script.ExecutableScript executableScript35 = docScoreNativeScriptFactory25.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject33);
        org.elasticsearch.river.RiverSettings riverSettings36 = new org.elasticsearch.river.RiverSettings(settings24, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject33);
        org.elasticsearch.river.RiverSettings riverSettings37 = new org.elasticsearch.river.RiverSettings(settings23, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject33);
        org.elasticsearch.script.ExecutableScript executableScript38 = docScoreNativeScriptFactory12.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject33);
        docScoreSearchScript4.setNextVar("actions", (java.lang.Object) basicDBObject33);
        docScoreSearchScript0.setNextVar("port", (java.lang.Object) docScoreSearchScript4);
        org.apache.lucene.search.Scorer scorer41 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript4.setScorer(scorer41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1) + "'", obj8, (-1));
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "bulk" + "'", obj10, "bulk");
        org.junit.Assert.assertNull(strSet16);
        org.junit.Assert.assertNull(mongoClientOptions17);
        org.junit.Assert.assertNotNull(basicDBObject20);
        org.junit.Assert.assertNotNull(executableScript22);
        org.junit.Assert.assertNull(strSet29);
        org.junit.Assert.assertNull(mongoClientOptions30);
        org.junit.Assert.assertNotNull(basicDBObject33);
        org.junit.Assert.assertNotNull(executableScript35);
        org.junit.Assert.assertNotNull(executableScript38);
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean3 = mongoDBRiverDefinition2.isMongoSecondaryReadPreference();
        java.lang.String str4 = mongoDBRiverDefinition2.getMongoDb();
        java.lang.String str5 = mongoDBRiverDefinition2.getSCRIPT_TYPE_FIELD();
        boolean boolean6 = mongoDBRiverDefinition2.getadvancedTransformation();
        java.lang.String str7 = mongoDBRiverDefinition2.getIndexName();
        boolean boolean8 = mongoDBRiverDefinition2.getmongoSecondaryReadPreference();
        java.lang.String str9 = mongoDBRiverDefinition2.getINITIAL_TIMESTAMP_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition2.getLOCAL_DB_FIELD();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "script_type" + "'", str5, "script_type");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "initial_timestamp" + "'", str9, "initial_timestamp");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "local" + "'", str10, "local");
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("user");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?user?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.statisticsTypeName("bulk_size");
        com.mongodb.MongoClientOptions mongoClientOptions5 = null;
        builder0.setmongoClientOptions(mongoClientOptions5);
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.getCONNECTION_TIMEOUT();
        int int4 = mongoDBRiverDefinition2.getConnectTimeout();
        boolean boolean5 = mongoDBRiverDefinition2.advancedTransformation;
        java.lang.String str6 = mongoDBRiverDefinition2.getCOLLECTION_FIELD();
        boolean boolean7 = mongoDBRiverDefinition2.isMongoSSLVerifyCertificate();
        java.lang.String str8 = mongoDBRiverDefinition2.statisticsTypeName;
        java.lang.String str9 = mongoDBRiverDefinition2.getSCRIPT_TYPE_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition2.getMongoOplogNamespace();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "connect_timeout" + "'", str3, "connect_timeout");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "collection" + "'", str6, "collection");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "script_type" + "'", str9, "script_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null.null" + "'", str10, "null.null");
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        int int2 = mongoDBRiverDefinition1.getDEFAULT_CONCURRENT_REQUESTS();
        java.util.List<com.mongodb.ServerAddress> serverAddressList3 = mongoDBRiverDefinition1.mongoServers;
        boolean boolean4 = mongoDBRiverDefinition1.importAllCollections;
        java.lang.String str5 = mongoDBRiverDefinition1.getScriptType();
        boolean boolean6 = mongoDBRiverDefinition1.advancedTransformation;
        java.lang.String str7 = mongoDBRiverDefinition1.getINITIAL_TIMESTAMP_FIELD();
        boolean boolean8 = mongoDBRiverDefinition1.getmongoSSLVerifyCertificate();
        java.lang.String str9 = mongoDBRiverDefinition1.getINITIAL_TIMESTAMP_SCRIPT_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition1.getSSL_VERIFY_CERT_FIELD();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertNotNull(serverAddressList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "initial_timestamp" + "'", str7, "initial_timestamp");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "script" + "'", str9, "script");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ssl_verify_certificate" + "'", str10, "ssl_verify_certificate");
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.mongoCollection;
        builder0.setmongoUseSSL(false);
        builder0.setconnectTimeout(0);
        boolean boolean6 = builder0.getmongoUseSSL();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.mongoAdminPassword("exclude_fields");
        com.mongodb.MongoClientOptions mongoClientOptions9 = builder8.mongoClientOptions;
        builder8.mongoDb = "initial_timestamp";
        java.util.List<com.mongodb.ServerAddress> serverAddressList12 = builder8.mongoServers;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(mongoClientOptions9);
        org.junit.Assert.assertNotNull(serverAddressList12);
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.statisticsTypeName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str6 = mongoDBRiverDefinition5.getINITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition5.getBULK_TIMEOUT_FIELD();
        java.lang.String str8 = mongoDBRiverDefinition5.getDROP_COLLECTION_FIELD();
        boolean boolean9 = mongoDBRiverDefinition5.isMongoUseSSL();
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "script_type" + "'", str6, "script_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "bulk_timeout" + "'", str7, "bulk_timeout");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "drop_collection" + "'", str8, "drop_collection");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.setmongoOplogFilter(basicDBObject4);
        boolean boolean6 = builder0.dropCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.socketTimeout((int) ' ');
        java.util.Set<java.lang.String> strSet9 = builder8.excludeFields;
        builder8.setriverName("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder8.mongoAdminUser("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder8.mongoSSLVerifyCertificate(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str17 = builder16.typeName;
        com.mongodb.BasicDBObject basicDBObject18 = null;
        builder16.mongoCollectionFilter = basicDBObject18;
        java.lang.String str20 = builder16.mongoAdminUser;
        builder16.disableIndexRefresh = false;
        java.lang.String str23 = builder16.getincludeCollection();
        org.elasticsearch.common.settings.Settings settings24 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition26 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder25);
        java.util.Set<java.lang.String> strSet27 = builder25.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions28 = builder25.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject29 = null;
        builder25.setmongoOplogFilter(basicDBObject29);
        com.mongodb.BasicDBObject basicDBObject31 = builder25.getmongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings32 = new org.elasticsearch.river.RiverSettings(settings24, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject31);
        builder16.setmongoOplogFilter(basicDBObject31);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder8.mongoCollectionFilter(basicDBObject31);
        builder34.mongoSecondaryReadPreference = false;
        builder34.riverIndexName = "initial_timestamp";
        int int39 = builder34.getsocketTimeout();
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(strSet9);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(strSet27);
        org.junit.Assert.assertNull(mongoClientOptions28);
        org.junit.Assert.assertNotNull(basicDBObject31);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 32 + "'", int39 == 32);
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("flush_interval");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?flush_interval? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        int int2 = mongoDBRiverDefinition1.getDEFAULT_CONCURRENT_REQUESTS();
        java.lang.String str3 = mongoDBRiverDefinition1.scriptType;
        java.lang.String str4 = mongoDBRiverDefinition1.getStatisticsTypeName();
        java.lang.String str5 = mongoDBRiverDefinition1.getBULK_TIMEOUT_FIELD();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "bulk_timeout" + "'", str5, "bulk_timeout");
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) (-1));
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str7 = builder6.typeName;
        com.mongodb.BasicDBObject basicDBObject8 = null;
        builder6.mongoCollectionFilter = basicDBObject8;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder6.mongoAdminPassword("db");
        docScoreSearchScript0.setNextVar("bulk_size", (java.lang.Object) builder6);
        java.lang.Object obj14 = null;
        docScoreSearchScript0.setNextVar("gridfs", obj14);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str18 = builder17.typeName;
        com.mongodb.BasicDBObject basicDBObject19 = null;
        builder17.mongoCollectionFilter = basicDBObject19;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder17.mongoAdminPassword("db");
        builder22.disableIndexRefresh = true;
        builder22.setconnectTimeout(1000);
        builder22.setriverIndexName("skip_initial_import");
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) builder22);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str31 = builder30.typeName;
        com.mongodb.BasicDBObject basicDBObject32 = null;
        builder30.mongoCollectionFilter = basicDBObject32;
        java.lang.String str34 = builder30.mongoAdminUser;
        java.lang.String str35 = builder30.getriverName();
        builder30.storeStatistics = true;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder30.mongoLocalUser("options");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder30.typeName("import_all_collections");
        java.util.Set<java.lang.String> strSet42 = builder30.getexcludeFields();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition44 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder43);
        int int45 = mongoDBRiverDefinition44.getDEFAULT_CONCURRENT_REQUESTS();
        java.util.List<com.mongodb.ServerAddress> serverAddressList46 = mongoDBRiverDefinition44.mongoServers;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder30.mongoServers(serverAddressList46);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder30.script("script");
        org.elasticsearch.common.settings.Settings settings50 = null;
        org.elasticsearch.common.settings.Settings settings51 = null;
        org.elasticsearch.common.settings.Settings settings52 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition54 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder53);
        java.util.Set<java.lang.String> strSet55 = builder53.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions56 = builder53.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject57 = null;
        builder53.setmongoOplogFilter(basicDBObject57);
        com.mongodb.BasicDBObject basicDBObject59 = builder53.getmongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings60 = new org.elasticsearch.river.RiverSettings(settings52, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject59);
        org.elasticsearch.river.RiverSettings riverSettings61 = new org.elasticsearch.river.RiverSettings(settings51, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject59);
        org.elasticsearch.river.RiverSettings riverSettings62 = new org.elasticsearch.river.RiverSettings(settings50, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject59);
        builder49.setmongoCollectionFilter(basicDBObject59);
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1) + "'", obj4, (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNull(strSet42);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 8 + "'", int45 == 8);
        org.junit.Assert.assertNotNull(serverAddressList46);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNull(strSet55);
        org.junit.Assert.assertNull(mongoClientOptions56);
        org.junit.Assert.assertNotNull(basicDBObject59);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.mongoOplogFilter = basicDBObject4;
        builder0.disableIndexRefresh = true;
        java.util.List<com.mongodb.ServerAddress> serverAddressList8 = builder0.mongoServers;
        boolean boolean9 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean11 = mongoDBRiverDefinition10.getmongoSecondaryReadPreference();
        boolean boolean12 = mongoDBRiverDefinition10.importAllCollections;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(serverAddressList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        java.lang.String str3 = builder0.getstatisticsIndexName();
        builder0.setsocketTimeout(10);
        builder0.setstatisticsTypeName("size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.mongoGridFS(true);
        com.mongodb.BasicDBObject basicDBObject10 = null;
        builder0.mongoCollectionFilter = basicDBObject10;
        builder0.setmongoSecondaryReadPreference(true);
        builder0.setindexName("options");
        builder0.setmongoDb("size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder18);
        java.util.Set<java.lang.String> strSet20 = builder18.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions21 = builder18.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject22 = null;
        builder18.setmongoOplogFilter(basicDBObject22);
        boolean boolean24 = builder18.dropCollection;
        com.mongodb.ServerAddress[] serverAddressArray25 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList26 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList26, serverAddressArray25);
        builder18.mongoServers = serverAddressList26;
        java.lang.String str29 = builder18.mongoAdminPassword;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str31 = builder30.typeName;
        com.mongodb.BasicDBObject basicDBObject32 = null;
        builder30.mongoCollectionFilter = basicDBObject32;
        java.lang.String str34 = builder30.mongoAdminUser;
        builder30.disableIndexRefresh = false;
        java.lang.String str37 = builder30.typeName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str39 = builder38.typeName;
        com.mongodb.BasicDBObject basicDBObject40 = null;
        builder38.mongoCollectionFilter = basicDBObject40;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder38.mongoUseSSL(true);
        java.lang.String[] strArray53 = new java.lang.String[] { "connect_timeout", "hi!", "port", "connect_timeout", "port", "bulk_size", "concurrent_bulk_requests", "", "options" };
        java.util.LinkedHashSet<java.lang.String> strSet54 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet54, strArray53);
        builder43.setparentTypes((java.util.Set<java.lang.String>) strSet54);
        builder30.parentTypes = strSet54;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = builder18.parentTypes((java.util.Set<java.lang.String>) strSet54);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder58.mongoGridFS(true);
        com.mongodb.BasicDBObject basicDBObject61 = builder58.mongoCollectionFilter;
        org.elasticsearch.common.settings.Settings settings62 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition64 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder63);
        java.util.Set<java.lang.String> strSet65 = builder63.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions66 = builder63.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject67 = null;
        builder63.setmongoOplogFilter(basicDBObject67);
        com.mongodb.BasicDBObject basicDBObject69 = builder63.getmongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings70 = new org.elasticsearch.river.RiverSettings(settings62, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject69);
        builder58.setmongoOplogFilter(basicDBObject69);
        builder0.mongoOplogFilter = basicDBObject69;
        builder0.setmongoLocalPassword("actions");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder76 = builder0.script("script_type");
        boolean boolean77 = builder76.getadvancedTransformation();
        builder76.setscriptType("connect_timeout");
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(strSet20);
        org.junit.Assert.assertNull(mongoClientOptions21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(serverAddressArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(basicDBObject61);
        org.junit.Assert.assertNull(strSet65);
        org.junit.Assert.assertNull(mongoClientOptions66);
        org.junit.Assert.assertNotNull(basicDBObject69);
        org.junit.Assert.assertNotNull(builder76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.setmongoOplogFilter(basicDBObject4);
        boolean boolean6 = builder0.dropCollection;
        boolean boolean7 = builder0.dropCollection;
        boolean boolean8 = builder0.mongoSecondaryReadPreference;
        builder0.setadvancedTransformation(false);
        int int11 = builder0.getsocketTimeout();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet13 = builder0.parentTypes;
        builder0.includeCollection = "import_all_collections";
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(strSet13);
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoUseSSL(true);
        builder0.connectTimeout = (byte) -1;
        builder0.setsocketTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder0.mongoAdminUser("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str13 = builder12.typeName;
        com.mongodb.BasicDBObject basicDBObject14 = null;
        builder12.mongoCollectionFilter = basicDBObject14;
        com.mongodb.BasicDBObject basicDBObject16 = null;
        builder12.mongoOplogFilter = basicDBObject16;
        builder12.disableIndexRefresh = true;
        java.util.List<com.mongodb.ServerAddress> serverAddressList20 = builder12.mongoServers;
        boolean boolean21 = builder12.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition23 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder22);
        int int24 = mongoDBRiverDefinition23.getDEFAULT_CONCURRENT_REQUESTS();
        java.lang.String str25 = mongoDBRiverDefinition23.scriptType;
        boolean boolean26 = mongoDBRiverDefinition23.importAllCollections;
        java.lang.String str27 = mongoDBRiverDefinition23.getCOLLECTION_FIELD();
        java.util.List<com.mongodb.ServerAddress> serverAddressList28 = mongoDBRiverDefinition23.mongoServers;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder12.mongoServers(serverAddressList28);
        builder0.setmongoServers(serverAddressList28);
        builder0.mongoCollection = "null.null";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition33 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.bson.types.Binary binary34 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder0.initialTimestamp(binary34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(serverAddressList20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8 + "'", int24 == 8);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "collection" + "'", str27, "collection");
        org.junit.Assert.assertNotNull(serverAddressList28);
        org.junit.Assert.assertNotNull(builder29);
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoUseSSL(true);
        builder0.connectTimeout = (byte) -1;
        int int8 = builder0.socketTimeout;
        java.lang.String str9 = builder0.getmongoAdminUser();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder0.mongoDb("include_collection");
        java.util.Set<java.lang.String> strSet12 = builder11.getparentTypes();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNull(strSet12);
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.setmongoOplogFilter(basicDBObject4);
        boolean boolean6 = builder0.dropCollection;
        com.mongodb.ServerAddress[] serverAddressArray7 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList8 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList8, serverAddressArray7);
        builder0.mongoServers = serverAddressList8;
        java.lang.String str11 = builder0.mongoAdminPassword;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder0.importAllCollections(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder0.skipInitialImport(true);
        builder0.mongoAdminUser = "options";
        builder0.setmongoUseSSL(false);
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(serverAddressArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        java.lang.String str4 = builder0.mongoAdminUser;
        builder0.disableIndexRefresh = false;
        java.lang.String str7 = builder0.getincludeCollection();
        com.mongodb.MongoClientOptions mongoClientOptions8 = builder0.mongoClientOptions;
        builder0.importAllCollections = false;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder11);
        java.util.Set<java.lang.String> strSet13 = builder11.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions14 = builder11.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject15 = null;
        builder11.setmongoOplogFilter(basicDBObject15);
        boolean boolean17 = builder11.dropCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder11.socketTimeout((int) ' ');
        java.util.Set<java.lang.String> strSet20 = builder19.excludeFields;
        builder19.setriverName("hi!");
        builder19.setmongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str26 = builder25.typeName;
        com.mongodb.BasicDBObject basicDBObject27 = null;
        builder25.mongoCollectionFilter = basicDBObject27;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder25.mongoUseSSL(true);
        java.lang.String[] strArray40 = new java.lang.String[] { "connect_timeout", "hi!", "port", "connect_timeout", "port", "bulk_size", "concurrent_bulk_requests", "", "options" };
        java.util.LinkedHashSet<java.lang.String> strSet41 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet41, strArray40);
        builder30.setparentTypes((java.util.Set<java.lang.String>) strSet41);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder30.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str47 = builder46.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str49 = builder48.typeName;
        com.mongodb.BasicDBObject basicDBObject50 = null;
        builder48.mongoCollectionFilter = basicDBObject50;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder48.mongoUseSSL(true);
        java.lang.String[] strArray63 = new java.lang.String[] { "connect_timeout", "hi!", "port", "connect_timeout", "port", "bulk_size", "concurrent_bulk_requests", "", "options" };
        java.util.LinkedHashSet<java.lang.String> strSet64 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet64, strArray63);
        builder53.setparentTypes((java.util.Set<java.lang.String>) strSet64);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder67 = builder46.parentTypes((java.util.Set<java.lang.String>) strSet64);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder68 = builder45.parentTypes((java.util.Set<java.lang.String>) strSet64);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder69 = builder19.excludeFields((java.util.Set<java.lang.String>) strSet64);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder70 = builder0.excludeFields((java.util.Set<java.lang.String>) strSet64);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder72 = builder70.mongoCollection("advanced_transformation");
        java.lang.Class<?> wildcardClass73 = builder72.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(mongoClientOptions8);
        org.junit.Assert.assertNull(strSet13);
        org.junit.Assert.assertNull(mongoClientOptions14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNull(strSet20);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(builder68);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.setmongoOplogFilter(basicDBObject4);
        boolean boolean6 = builder0.dropCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.socketTimeout((int) ' ');
        builder8.setindexName("port");
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoDb("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.dropCollection(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoGridFS(true);
        builder4.disableIndexRefresh = false;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder4);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder4.mongoAdminPassword("");
        builder4.setmongoSecondaryReadPreference(false);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        java.lang.String str4 = builder0.mongoAdminUser;
        java.lang.String str5 = builder0.getriverName();
        builder0.storeStatistics = true;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str9 = builder8.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str12 = builder11.typeName;
        com.mongodb.BasicDBObject basicDBObject13 = null;
        builder11.mongoCollectionFilter = basicDBObject13;
        com.mongodb.BasicDBObject basicDBObject15 = null;
        builder11.mongoOplogFilter = basicDBObject15;
        builder11.disableIndexRefresh = true;
        java.util.List<com.mongodb.ServerAddress> serverAddressList19 = builder11.mongoServers;
        java.lang.String[] strArray23 = new java.lang.String[] { "connect_timeout", "credentials", "connect_timeout" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        builder11.setparentTypes((java.util.Set<java.lang.String>) strSet24);
        builder8.parentTypes = strSet24;
        builder0.excludeFields = strSet24;
        builder0.statisticsIndexName = "drop_collection";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition31 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean32 = mongoDBRiverDefinition31.isDisableIndexRefresh();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(serverAddressList19);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        int int2 = mongoDBRiverDefinition1.getDEFAULT_CONCURRENT_REQUESTS();
        boolean boolean3 = mongoDBRiverDefinition1.advancedTransformation;
        java.lang.String str4 = mongoDBRiverDefinition1.getScript();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript4 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript4.setNextScore((float) (byte) 1);
        java.lang.Object obj8 = docScoreSearchScript4.unwrap((java.lang.Object) (-1));
        java.lang.Object obj10 = docScoreSearchScript4.unwrap((java.lang.Object) "bulk");
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory12 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder14);
        java.util.Set<java.lang.String> strSet16 = builder14.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions17 = builder14.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject18 = null;
        builder14.setmongoOplogFilter(basicDBObject18);
        com.mongodb.BasicDBObject basicDBObject20 = builder14.getmongoCollectionFilter();
        builder13.mongoCollectionFilter = basicDBObject20;
        org.elasticsearch.script.ExecutableScript executableScript22 = docScoreNativeScriptFactory12.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject20);
        org.elasticsearch.common.settings.Settings settings23 = null;
        org.elasticsearch.common.settings.Settings settings24 = null;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory25 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder27);
        java.util.Set<java.lang.String> strSet29 = builder27.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions30 = builder27.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject31 = null;
        builder27.setmongoOplogFilter(basicDBObject31);
        com.mongodb.BasicDBObject basicDBObject33 = builder27.getmongoCollectionFilter();
        builder26.mongoCollectionFilter = basicDBObject33;
        org.elasticsearch.script.ExecutableScript executableScript35 = docScoreNativeScriptFactory25.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject33);
        org.elasticsearch.river.RiverSettings riverSettings36 = new org.elasticsearch.river.RiverSettings(settings24, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject33);
        org.elasticsearch.river.RiverSettings riverSettings37 = new org.elasticsearch.river.RiverSettings(settings23, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject33);
        org.elasticsearch.script.ExecutableScript executableScript38 = docScoreNativeScriptFactory12.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject33);
        docScoreSearchScript4.setNextVar("actions", (java.lang.Object) basicDBObject33);
        docScoreSearchScript0.setNextVar("port", (java.lang.Object) docScoreSearchScript4);
        // The following exception was thrown during execution in test generation
        try {
            double double41 = docScoreSearchScript0.runAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1) + "'", obj8, (-1));
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "bulk" + "'", obj10, "bulk");
        org.junit.Assert.assertNull(strSet16);
        org.junit.Assert.assertNull(mongoClientOptions17);
        org.junit.Assert.assertNotNull(basicDBObject20);
        org.junit.Assert.assertNotNull(executableScript22);
        org.junit.Assert.assertNull(strSet29);
        org.junit.Assert.assertNull(mongoClientOptions30);
        org.junit.Assert.assertNotNull(basicDBObject33);
        org.junit.Assert.assertNotNull(executableScript35);
        org.junit.Assert.assertNotNull(executableScript38);
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        int int2 = mongoDBRiverDefinition1.getDEFAULT_CONCURRENT_REQUESTS();
        java.util.List<com.mongodb.ServerAddress> serverAddressList3 = mongoDBRiverDefinition1.mongoServers;
        boolean boolean4 = mongoDBRiverDefinition1.importAllCollections;
        boolean boolean5 = mongoDBRiverDefinition1.getmongoSSLVerifyCertificate();
        boolean boolean6 = mongoDBRiverDefinition1.getstoreStatistics();
        int int7 = mongoDBRiverDefinition1.getDEFAULT_DB_PORT();
        java.lang.String str8 = mongoDBRiverDefinition1.getMongoLocalUser();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertNotNull(serverAddressList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 27017 + "'", int7 == 27017);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = builder0.getmongoCollectionFilter();
        java.lang.String str7 = builder0.getindexName();
        com.mongodb.ServerAddress[] serverAddressArray8 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList9 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList9, serverAddressArray8);
        builder0.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList9);
        java.lang.String str12 = builder0.getstatisticsTypeName();
        builder0.setthrottleSize((int) (short) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder0.riverName("socket_timeout");
        boolean boolean17 = builder0.getmongoUseSSL();
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(mongoClientOptions3);
        org.junit.Assert.assertNotNull(basicDBObject6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(serverAddressArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.getMongoCollection();
        java.lang.String str3 = mongoDBRiverDefinition1.getADMIN_DB_FIELD();
        java.lang.String str4 = mongoDBRiverDefinition1.mongoDb;
        java.lang.String str5 = mongoDBRiverDefinition1.riverName;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("include_collection", "size", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?size?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        org.elasticsearch.common.settings.Settings settings2 = null;
        org.elasticsearch.common.settings.Settings settings3 = null;
        org.elasticsearch.common.settings.Settings settings4 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.util.Set<java.lang.String> strSet7 = builder5.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions8 = builder5.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject9 = null;
        builder5.setmongoOplogFilter(basicDBObject9);
        com.mongodb.BasicDBObject basicDBObject11 = builder5.getmongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings12 = new org.elasticsearch.river.RiverSettings(settings4, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject11);
        org.elasticsearch.river.RiverSettings riverSettings13 = new org.elasticsearch.river.RiverSettings(settings3, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject11);
        org.elasticsearch.river.RiverSettings riverSettings14 = new org.elasticsearch.river.RiverSettings(settings2, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject11);
        org.elasticsearch.script.ScriptService scriptService15 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("script_type", "import_all_collections", riverSettings14, scriptService15);
        boolean boolean17 = mongoDBRiverDefinition16.getskipInitialImport();
        org.junit.Assert.assertNull(strSet7);
        org.junit.Assert.assertNull(mongoClientOptions8);
        org.junit.Assert.assertNotNull(basicDBObject11);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean3 = mongoDBRiverDefinition2.mongoSSLVerifyCertificate;
        java.lang.String str4 = mongoDBRiverDefinition2.getGRIDFS_FIELD();
        boolean boolean5 = mongoDBRiverDefinition2.importAllCollections;
        java.lang.String str6 = mongoDBRiverDefinition2.getStatisticsIndexName();
        boolean boolean7 = mongoDBRiverDefinition2.getadvancedTransformation();
        boolean boolean8 = mongoDBRiverDefinition2.getmongoSSLVerifyCertificate();
        boolean boolean9 = mongoDBRiverDefinition2.getadvancedTransformation();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "gridfs" + "'", str4, "gridfs");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        java.lang.String str4 = builder0.mongoAdminUser;
        builder0.disableIndexRefresh = false;
        java.lang.String str7 = builder0.getincludeCollection();
        org.elasticsearch.common.settings.Settings settings8 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder9);
        java.util.Set<java.lang.String> strSet11 = builder9.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions12 = builder9.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject13 = null;
        builder9.setmongoOplogFilter(basicDBObject13);
        com.mongodb.BasicDBObject basicDBObject15 = builder9.getmongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings16 = new org.elasticsearch.river.RiverSettings(settings8, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject15);
        builder0.setmongoOplogFilter(basicDBObject15);
        int int18 = builder0.getthrottleSize();
        builder0.setmongoLocalUser("connect_timeout");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(strSet11);
        org.junit.Assert.assertNull(mongoClientOptions12);
        org.junit.Assert.assertNotNull(basicDBObject15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.setmongoOplogFilter(basicDBObject4);
        boolean boolean6 = builder0.dropCollection;
        com.mongodb.ServerAddress[] serverAddressArray7 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList8 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList8, serverAddressArray7);
        builder0.mongoServers = serverAddressList8;
        java.lang.String str11 = builder0.mongoAdminPassword;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str13 = builder12.typeName;
        com.mongodb.BasicDBObject basicDBObject14 = null;
        builder12.mongoCollectionFilter = basicDBObject14;
        java.lang.String str16 = builder12.mongoAdminUser;
        builder12.disableIndexRefresh = false;
        java.lang.String str19 = builder12.typeName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str21 = builder20.typeName;
        com.mongodb.BasicDBObject basicDBObject22 = null;
        builder20.mongoCollectionFilter = basicDBObject22;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder20.mongoUseSSL(true);
        java.lang.String[] strArray35 = new java.lang.String[] { "connect_timeout", "hi!", "port", "connect_timeout", "port", "bulk_size", "concurrent_bulk_requests", "", "options" };
        java.util.LinkedHashSet<java.lang.String> strSet36 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet36, strArray35);
        builder25.setparentTypes((java.util.Set<java.lang.String>) strSet36);
        builder12.parentTypes = strSet36;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder0.parentTypes((java.util.Set<java.lang.String>) strSet36);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder0.includeCollection("type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder0.indexName("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp45 = builder44.getinitialTimestamp();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition46 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder44);
        boolean boolean47 = mongoDBRiverDefinition46.getdropCollection();
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(serverAddressArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNull(wildcardTimestamp45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        int int2 = mongoDBRiverDefinition1.getDEFAULT_CONCURRENT_REQUESTS();
        java.util.List<com.mongodb.ServerAddress> serverAddressList3 = mongoDBRiverDefinition1.mongoServers;
        boolean boolean4 = mongoDBRiverDefinition1.importAllCollections;
        boolean boolean5 = mongoDBRiverDefinition1.getmongoSSLVerifyCertificate();
        boolean boolean6 = mongoDBRiverDefinition1.getstoreStatistics();
        java.lang.String str7 = mongoDBRiverDefinition1.mongoAdminPassword;
        boolean boolean8 = mongoDBRiverDefinition1.isAdvancedTransformation();
        java.lang.String str9 = mongoDBRiverDefinition1.getINCLUDE_COLLECTION_FIELD();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertNotNull(serverAddressList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "include_collection" + "'", str9, "include_collection");
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        int int2 = mongoDBRiverDefinition1.getDEFAULT_CONCURRENT_REQUESTS();
        java.util.List<com.mongodb.ServerAddress> serverAddressList3 = mongoDBRiverDefinition1.mongoServers;
        java.lang.String str4 = mongoDBRiverDefinition1.getMongoLocalUser();
        java.lang.String str5 = mongoDBRiverDefinition1.getMongoAdminUser();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertNotNull(serverAddressList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.mongoOplogFilter = basicDBObject4;
        builder0.disableIndexRefresh = true;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.typeName("secondary_read_preference");
        builder0.mongoSSLVerifyCertificate = false;
        boolean boolean12 = builder0.getadvancedTransformation();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder0.script("flush_interval");
        java.util.List<com.mongodb.ServerAddress> serverAddressList15 = builder14.mongoServers;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(serverAddressList15);
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) (-1));
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str6 = builder5.typeName;
        com.mongodb.BasicDBObject basicDBObject7 = null;
        builder5.mongoCollectionFilter = basicDBObject7;
        java.lang.String str9 = builder5.mongoAdminUser;
        builder5.disableIndexRefresh = false;
        java.lang.String str12 = builder5.typeName;
        builder5.mongoAdminPassword = "";
        int int15 = builder5.getconnectTimeout();
        java.lang.Object obj16 = docScoreSearchScript0.unwrap((java.lang.Object) int15);
        org.apache.lucene.search.Scorer scorer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setScorer(scorer17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1) + "'", obj4, (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 0 + "'", obj16, 0);
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.mongoOplogFilter = basicDBObject4;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = builder0.build();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.advancedTransformation(false);
        builder8.setmongoAdminUser("bulk");
        boolean boolean11 = builder8.getmongoGridFS();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.mongoAdminPassword;
        int int4 = mongoDBRiverDefinition2.connectTimeout;
        java.util.Set<java.lang.String> strSet5 = mongoDBRiverDefinition2.includeFields;
        boolean boolean6 = mongoDBRiverDefinition2.mongoUseSSL;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.setmongoOplogFilter(basicDBObject4);
        boolean boolean6 = builder0.dropCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.socketTimeout((int) ' ');
        java.util.Set<java.lang.String> strSet9 = builder8.excludeFields;
        builder8.setriverName("hi!");
        builder8.setmongoGridFS(true);
        builder8.setmongoCollection("admin");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder8.mongoAdminPassword("admin");
        builder17.setincludeCollection("password");
        java.lang.String str20 = builder17.script;
        builder17.setsocketTimeout(100);
        java.lang.String str23 = builder17.riverName;
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(strSet9);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.mongoOplogFilter = basicDBObject4;
        builder0.disableIndexRefresh = true;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.typeName("secondary_read_preference");
        boolean boolean10 = builder9.skipInitialImport;
        builder9.mongoLocalPassword = "credentials";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean3 = mongoDBRiverDefinition2.mongoSSLVerifyCertificate;
        java.lang.String str4 = mongoDBRiverDefinition2.getGRIDFS_FIELD();
        boolean boolean5 = mongoDBRiverDefinition2.importAllCollections;
        java.lang.String str6 = mongoDBRiverDefinition2.getStatisticsIndexName();
        java.lang.String str7 = mongoDBRiverDefinition2.getFILTER_FIELD();
        java.lang.String str8 = mongoDBRiverDefinition2.getMongoAdminPassword();
        org.elasticsearch.common.logging.ESLogger eSLogger9 = mongoDBRiverDefinition2.getlogger();
        int int10 = mongoDBRiverDefinition2.connectTimeout;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "gridfs" + "'", str4, "gridfs");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "filter" + "'", str7, "filter");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(eSLogger9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) (-1));
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str7 = builder6.typeName;
        com.mongodb.BasicDBObject basicDBObject8 = null;
        builder6.mongoCollectionFilter = basicDBObject8;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder6.mongoAdminPassword("db");
        docScoreSearchScript0.setNextVar("bulk_size", (java.lang.Object) builder6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder14);
        java.util.Set<java.lang.String> strSet16 = builder14.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions17 = builder14.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject18 = null;
        builder14.setmongoOplogFilter(basicDBObject18);
        boolean boolean20 = builder14.dropCollection;
        com.mongodb.ServerAddress[] serverAddressArray21 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList22 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList22, serverAddressArray21);
        builder14.mongoServers = serverAddressList22;
        java.lang.String str25 = builder14.mongoAdminPassword;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder14.importAllCollections(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder14.skipInitialImport(true);
        docScoreSearchScript0.setNextVar("credentials", (java.lang.Object) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition33 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder32);
        java.util.Set<java.lang.String> strSet34 = builder32.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions35 = builder32.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject36 = null;
        builder32.setmongoOplogFilter(basicDBObject36);
        com.mongodb.BasicDBObject basicDBObject38 = builder32.getmongoCollectionFilter();
        builder32.setskipInitialImport(false);
        java.lang.String str41 = builder32.mongoLocalPassword;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder32.connectTimeout((int) ' ');
        com.mongodb.BasicDBObject basicDBObject44 = builder43.mongoCollectionFilter;
        docScoreSearchScript0.setNextVar("throttle_size", (java.lang.Object) builder43);
        // The following exception was thrown during execution in test generation
        try {
            long long46 = docScoreSearchScript0.runAsLong();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1) + "'", obj4, (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNull(strSet16);
        org.junit.Assert.assertNull(mongoClientOptions17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(serverAddressArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNull(strSet34);
        org.junit.Assert.assertNull(mongoClientOptions35);
        org.junit.Assert.assertNotNull(basicDBObject38);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(basicDBObject44);
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) (-1));
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str7 = builder6.typeName;
        com.mongodb.BasicDBObject basicDBObject8 = null;
        builder6.mongoCollectionFilter = basicDBObject8;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder6.mongoAdminPassword("db");
        docScoreSearchScript0.setNextVar("bulk_size", (java.lang.Object) builder6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder14);
        java.util.Set<java.lang.String> strSet16 = builder14.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions17 = builder14.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject18 = null;
        builder14.setmongoOplogFilter(basicDBObject18);
        boolean boolean20 = builder14.dropCollection;
        com.mongodb.ServerAddress[] serverAddressArray21 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList22 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList22, serverAddressArray21);
        builder14.mongoServers = serverAddressList22;
        java.lang.String str25 = builder14.mongoAdminPassword;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder14.importAllCollections(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder14.skipInitialImport(true);
        docScoreSearchScript0.setNextVar("credentials", (java.lang.Object) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition33 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder32);
        java.util.Set<java.lang.String> strSet34 = builder32.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions35 = builder32.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject36 = null;
        builder32.setmongoOplogFilter(basicDBObject36);
        com.mongodb.BasicDBObject basicDBObject38 = builder32.getmongoCollectionFilter();
        builder32.setskipInitialImport(false);
        java.lang.String str41 = builder32.mongoLocalPassword;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder32.connectTimeout((int) ' ');
        com.mongodb.BasicDBObject basicDBObject44 = builder43.mongoCollectionFilter;
        docScoreSearchScript0.setNextVar("throttle_size", (java.lang.Object) builder43);
        // The following exception was thrown during execution in test generation
        try {
            double double46 = docScoreSearchScript0.runAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1) + "'", obj4, (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNull(strSet16);
        org.junit.Assert.assertNull(mongoClientOptions17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(serverAddressArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNull(strSet34);
        org.junit.Assert.assertNull(mongoClientOptions35);
        org.junit.Assert.assertNotNull(basicDBObject38);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(basicDBObject44);
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        java.lang.String str4 = builder0.mongoAdminUser;
        builder0.disableIndexRefresh = false;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.statisticsIndexName("port");
        boolean boolean9 = builder0.mongoSSLVerifyCertificate;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder0.mongoCollection("include_collection");
        builder11.mongoLocalPassword = "size";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.mongoAdminPassword;
        java.util.Set<java.lang.String> strSet4 = mongoDBRiverDefinition2.excludeFields;
        java.lang.String str5 = mongoDBRiverDefinition2.getFILTER_FIELD();
        java.lang.String str6 = mongoDBRiverDefinition2.getMongoLocalUser();
        java.lang.String str7 = mongoDBRiverDefinition2.getSERVERS_FIELD();
        java.lang.String str8 = mongoDBRiverDefinition2.getIndexName();
        java.lang.String str9 = mongoDBRiverDefinition2.getDROP_COLLECTION_FIELD();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "filter" + "'", str5, "filter");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "servers" + "'", str7, "servers");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "drop_collection" + "'", str9, "drop_collection");
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoAdminPassword("db");
        builder5.importAllCollections = false;
        com.mongodb.BasicDBObject basicDBObject8 = builder5.mongoOplogFilter;
        int int9 = builder5.connectTimeout;
        com.mongodb.BasicDBObject basicDBObject10 = builder5.getmongoOplogFilter();
        boolean boolean11 = builder5.getdropCollection();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(basicDBObject8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(basicDBObject10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean3 = mongoDBRiverDefinition2.mongoSSLVerifyCertificate;
        java.lang.String str4 = mongoDBRiverDefinition2.getGRIDFS_FIELD();
        boolean boolean5 = mongoDBRiverDefinition2.importAllCollections;
        java.lang.String str6 = mongoDBRiverDefinition2.getINCLUDE_FIELDS_FIELD();
        com.mongodb.MongoClientOptions mongoClientOptions7 = mongoDBRiverDefinition2.mongoClientOptions;
        boolean boolean8 = mongoDBRiverDefinition2.isStoreStatistics();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = mongoDBRiverDefinition2.initialTimestamp;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "gridfs" + "'", str4, "gridfs");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "include_fields" + "'", str6, "include_fields");
        org.junit.Assert.assertNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(wildcardTimestamp9);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.setmongoOplogFilter(basicDBObject4);
        boolean boolean6 = builder0.dropCollection;
        com.mongodb.ServerAddress[] serverAddressArray7 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList8 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList8, serverAddressArray7);
        builder0.mongoServers = serverAddressList8;
        java.lang.String str11 = builder0.mongoAdminPassword;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder0.importAllCollections(true);
        int int14 = builder13.getconnectTimeout();
        int int15 = builder13.connectTimeout;
        java.util.Set<java.lang.String> strSet16 = builder13.includeFields;
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(serverAddressArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(strSet16);
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        int int2 = mongoDBRiverDefinition1.getDEFAULT_CONCURRENT_REQUESTS();
        java.util.List<com.mongodb.ServerAddress> serverAddressList3 = mongoDBRiverDefinition1.mongoServers;
        boolean boolean4 = mongoDBRiverDefinition1.importAllCollections;
        boolean boolean5 = mongoDBRiverDefinition1.getmongoSSLVerifyCertificate();
        boolean boolean6 = mongoDBRiverDefinition1.getstoreStatistics();
        java.lang.String str7 = mongoDBRiverDefinition1.mongoAdminPassword;
        boolean boolean8 = mongoDBRiverDefinition1.isAdvancedTransformation();
        boolean boolean9 = mongoDBRiverDefinition1.disableIndexRefresh;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertNotNull(serverAddressList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoAdminPassword("db");
        builder5.importAllCollections = false;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder5.connectTimeout(1);
        boolean boolean10 = builder9.getadvancedTransformation();
        builder9.setmongoAdminPassword("bulk_timeout");
        com.mongodb.MongoClientOptions mongoClientOptions13 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder9.mongoClientOptions(mongoClientOptions13);
        boolean boolean15 = builder14.mongoGridFS;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = builder0.getmongoCollectionFilter();
        builder0.setskipInitialImport(false);
        java.lang.String str9 = builder0.statisticsIndexName;
        java.lang.String str10 = builder0.scriptType;
        java.util.List<com.mongodb.ServerAddress> serverAddressList11 = builder0.getmongoServers();
        boolean boolean12 = builder0.getmongoGridFS();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder0.riverIndexName("script_type");
        boolean boolean15 = builder14.importAllCollections;
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(mongoClientOptions3);
        org.junit.Assert.assertNotNull(basicDBObject6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(serverAddressList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.getmongoClientOptions();
        builder0.setstatisticsTypeName("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        com.mongodb.MongoClientOptions mongoClientOptions8 = mongoDBRiverDefinition7.getMongoClientOptions();
        java.lang.String str9 = mongoDBRiverDefinition7.getACTIONS_FIELD();
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(mongoClientOptions3);
        org.junit.Assert.assertNull(mongoClientOptions8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "actions" + "'", str9, "actions");
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.Settings settings1 = null;
        org.elasticsearch.common.settings.Settings settings2 = null;
        org.elasticsearch.common.settings.Settings settings3 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder4);
        java.util.Set<java.lang.String> strSet6 = builder4.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions7 = builder4.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject8 = null;
        builder4.setmongoOplogFilter(basicDBObject8);
        boolean boolean10 = builder4.dropCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder4.socketTimeout((int) ' ');
        java.util.Set<java.lang.String> strSet13 = builder12.excludeFields;
        builder12.setriverName("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder12.mongoAdminUser("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder12.mongoSSLVerifyCertificate(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str21 = builder20.typeName;
        com.mongodb.BasicDBObject basicDBObject22 = null;
        builder20.mongoCollectionFilter = basicDBObject22;
        java.lang.String str24 = builder20.mongoAdminUser;
        builder20.disableIndexRefresh = false;
        java.lang.String str27 = builder20.getincludeCollection();
        org.elasticsearch.common.settings.Settings settings28 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition30 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder29);
        java.util.Set<java.lang.String> strSet31 = builder29.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions32 = builder29.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject33 = null;
        builder29.setmongoOplogFilter(basicDBObject33);
        com.mongodb.BasicDBObject basicDBObject35 = builder29.getmongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings36 = new org.elasticsearch.river.RiverSettings(settings28, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject35);
        builder20.setmongoOplogFilter(basicDBObject35);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder12.mongoCollectionFilter(basicDBObject35);
        org.elasticsearch.river.RiverSettings riverSettings39 = new org.elasticsearch.river.RiverSettings(settings3, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject35);
        org.elasticsearch.river.RiverSettings riverSettings40 = new org.elasticsearch.river.RiverSettings(settings2, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject35);
        org.elasticsearch.river.RiverSettings riverSettings41 = new org.elasticsearch.river.RiverSettings(settings1, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject35);
        org.elasticsearch.river.RiverSettings riverSettings42 = new org.elasticsearch.river.RiverSettings(settings0, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject35);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertNull(mongoClientOptions7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(strSet13);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNull(strSet31);
        org.junit.Assert.assertNull(mongoClientOptions32);
        org.junit.Assert.assertNotNull(basicDBObject35);
        org.junit.Assert.assertNotNull(builder38);
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) (-1));
        java.lang.Object obj6 = docScoreSearchScript0.unwrap((java.lang.Object) "bulk");
        docScoreSearchScript0.setNextScore((float) 0L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder9);
        java.util.Set<java.lang.String> strSet11 = builder9.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions12 = builder9.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject13 = null;
        builder9.setmongoOplogFilter(basicDBObject13);
        boolean boolean15 = builder9.dropCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder9.mongoGridFS(true);
        builder9.setstatisticsTypeName("servers");
        java.lang.Object obj20 = docScoreSearchScript0.unwrap((java.lang.Object) "servers");
        // The following exception was thrown during execution in test generation
        try {
            long long21 = docScoreSearchScript0.runAsLong();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1) + "'", obj4, (-1));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "bulk" + "'", obj6, "bulk");
        org.junit.Assert.assertNull(strSet11);
        org.junit.Assert.assertNull(mongoClientOptions12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + "servers" + "'", obj20, "servers");
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        int int2 = mongoDBRiverDefinition1.getDEFAULT_CONCURRENT_REQUESTS();
        java.util.List<com.mongodb.ServerAddress> serverAddressList3 = mongoDBRiverDefinition1.mongoServers;
        java.lang.String str4 = mongoDBRiverDefinition1.getNAME_FIELD();
        java.lang.String str5 = mongoDBRiverDefinition1.getScriptType();
        boolean boolean6 = mongoDBRiverDefinition1.storeStatistics;
        boolean boolean7 = mongoDBRiverDefinition1.skipInitialImport;
        java.lang.String str8 = mongoDBRiverDefinition1.getCONNECTION_TIMEOUT();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertNotNull(serverAddressList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "name" + "'", str4, "name");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "connect_timeout" + "'", str8, "connect_timeout");
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoUseSSL(true);
        builder0.connectTimeout = (byte) -1;
        int int8 = builder0.socketTimeout;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.statisticsIndexName("initial_timestamp");
        java.lang.String str11 = builder10.mongoAdminUser;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        builder0.setsocketTimeout(0);
        builder0.mongoAdminUser = "collection";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.mongoSSLVerifyCertificate(true);
        builder7.mongoAdminUser = "parent_types";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder7);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder7.mongoCollection("type");
        boolean boolean13 = builder12.getmongoUseSSL();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.getCONNECTION_TIMEOUT();
        java.lang.String str4 = mongoDBRiverDefinition2.getOPTIONS_FIELD();
        java.lang.String str5 = mongoDBRiverDefinition2.mongoLocalPassword;
        java.lang.String str6 = mongoDBRiverDefinition2.getOPTIONS_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition2.getCONNECTION_TIMEOUT();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "connect_timeout" + "'", str3, "connect_timeout");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "options" + "'", str4, "options");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "options" + "'", str6, "options");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "connect_timeout" + "'", str7, "connect_timeout");
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        java.lang.String str4 = builder0.mongoAdminUser;
        builder0.disableIndexRefresh = false;
        java.lang.String str7 = builder0.typeName;
        builder0.mongoAdminPassword = "";
        int int10 = builder0.getconnectTimeout();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder11);
        int int13 = mongoDBRiverDefinition12.getDEFAULT_CONCURRENT_REQUESTS();
        java.util.List<com.mongodb.ServerAddress> serverAddressList14 = mongoDBRiverDefinition12.mongoServers;
        boolean boolean15 = mongoDBRiverDefinition12.importAllCollections;
        java.lang.String str16 = mongoDBRiverDefinition12.getScriptType();
        java.lang.String str17 = mongoDBRiverDefinition12.getSCRIPT_FIELD();
        java.util.List<com.mongodb.ServerAddress> serverAddressList18 = mongoDBRiverDefinition12.mongoServers;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder0.mongoServers(serverAddressList18);
        java.lang.String str20 = builder0.mongoAdminPassword;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertNotNull(serverAddressList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "script" + "'", str17, "script");
        org.junit.Assert.assertNotNull(serverAddressList18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoAdminPassword("db");
        boolean boolean6 = builder0.getmongoGridFS();
        java.lang.String str7 = builder0.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.riverIndexName("index");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.mongoSecondaryReadPreference(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.getCONNECTION_TIMEOUT();
        java.lang.String str4 = mongoDBRiverDefinition2.getOPTIONS_FIELD();
        boolean boolean5 = mongoDBRiverDefinition2.isMongoGridFS();
        com.mongodb.MongoClientOptions mongoClientOptions6 = mongoDBRiverDefinition2.getMongoClientOptions();
        java.lang.String str7 = mongoDBRiverDefinition2.getPORT_FIELD();
        java.lang.String str8 = mongoDBRiverDefinition2.getACTIONS_FIELD();
        java.lang.String str9 = mongoDBRiverDefinition2.mongoDb;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "connect_timeout" + "'", str3, "connect_timeout");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "options" + "'", str4, "options");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(mongoClientOptions6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "port" + "'", str7, "port");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "actions" + "'", str8, "actions");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoAdminPassword("db");
        java.util.Set<java.lang.String> strSet6 = builder5.getincludeFields();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder5.storeStatistics(false);
        boolean boolean9 = builder8.getdropCollection();
        boolean boolean10 = builder8.advancedTransformation;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.statisticsTypeName("bulk_size");
        builder0.setdropCollection(false);
        builder0.setstatisticsTypeName("type");
        org.elasticsearch.common.settings.Settings settings9 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder10);
        java.util.Set<java.lang.String> strSet12 = builder10.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions13 = builder10.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject14 = null;
        builder10.setmongoOplogFilter(basicDBObject14);
        com.mongodb.BasicDBObject basicDBObject16 = builder10.getmongoCollectionFilter();
        builder10.setskipInitialImport(false);
        java.lang.String str19 = builder10.mongoLocalPassword;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder10.connectTimeout((int) ' ');
        com.mongodb.BasicDBObject basicDBObject22 = builder21.mongoCollectionFilter;
        org.elasticsearch.river.RiverSettings riverSettings23 = new org.elasticsearch.river.RiverSettings(settings9, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject22);
        builder0.mongoCollectionFilter = basicDBObject22;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str26 = mongoDBRiverDefinition25.getDISABLE_INDEX_REFRESH_FIELD();
        boolean boolean27 = mongoDBRiverDefinition25.mongoGridFS;
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNull(strSet12);
        org.junit.Assert.assertNull(mongoClientOptions13);
        org.junit.Assert.assertNotNull(basicDBObject16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(basicDBObject22);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "disable_index_refresh" + "'", str26, "disable_index_refresh");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.connectTimeout((int) (byte) 0);
        java.util.Set<java.lang.String> strSet4 = builder0.parentTypes;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(strSet4);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.mongoOplogFilter = basicDBObject4;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = builder0.build();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.advancedTransformation(false);
        boolean boolean9 = builder0.mongoSecondaryReadPreference;
        java.util.Set<java.lang.String> strSet10 = builder0.excludeFields;
        java.lang.String str11 = builder0.getindexName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strSet10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) (-1));
        docScoreSearchScript0.setNextScore((float) 1);
        org.apache.lucene.search.Scorer scorer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setScorer(scorer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1) + "'", obj4, (-1));
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        int int2 = mongoDBRiverDefinition1.getDEFAULT_CONCURRENT_REQUESTS();
        java.lang.String str3 = mongoDBRiverDefinition1.getDB_FIELD();
        java.lang.String str4 = mongoDBRiverDefinition1.getRiverName();
        boolean boolean5 = mongoDBRiverDefinition1.getmongoSecondaryReadPreference();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "db" + "'", str3, "db");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoUseSSL(true);
        java.lang.String[] strArray15 = new java.lang.String[] { "connect_timeout", "hi!", "port", "connect_timeout", "port", "bulk_size", "concurrent_bulk_requests", "", "options" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        builder5.setparentTypes((java.util.Set<java.lang.String>) strSet16);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder5.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str22 = builder21.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str24 = builder23.typeName;
        com.mongodb.BasicDBObject basicDBObject25 = null;
        builder23.mongoCollectionFilter = basicDBObject25;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder23.mongoUseSSL(true);
        java.lang.String[] strArray38 = new java.lang.String[] { "connect_timeout", "hi!", "port", "connect_timeout", "port", "bulk_size", "concurrent_bulk_requests", "", "options" };
        java.util.LinkedHashSet<java.lang.String> strSet39 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet39, strArray38);
        builder28.setparentTypes((java.util.Set<java.lang.String>) strSet39);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder21.parentTypes((java.util.Set<java.lang.String>) strSet39);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder20.parentTypes((java.util.Set<java.lang.String>) strSet39);
        java.lang.Class<?> wildcardClass44 = builder20.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.getCONNECTION_TIMEOUT();
        java.lang.String str4 = mongoDBRiverDefinition2.getCREDENTIALS_FIELD();
        boolean boolean5 = mongoDBRiverDefinition2.isMongoSecondaryReadPreference();
        java.lang.String str6 = mongoDBRiverDefinition2.getMongoCollection();
        boolean boolean7 = mongoDBRiverDefinition2.getstoreStatistics();
        boolean boolean8 = mongoDBRiverDefinition2.isSkipInitialImport();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "connect_timeout" + "'", str3, "connect_timeout");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "credentials" + "'", str4, "credentials");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.getPORT_FIELD();
        java.lang.String str4 = mongoDBRiverDefinition2.getScriptType();
        boolean boolean5 = mongoDBRiverDefinition2.isDisableIndexRefresh();
        java.lang.String str6 = mongoDBRiverDefinition2.getSECONDARY_READ_PREFERENCE_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition2.getSSL_CONNECTION_FIELD();
        java.lang.String str8 = mongoDBRiverDefinition2.getACTIONS_FIELD();
        boolean boolean9 = mongoDBRiverDefinition2.isDisableIndexRefresh();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "port" + "'", str3, "port");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "secondary_read_preference" + "'", str6, "secondary_read_preference");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ssl" + "'", str7, "ssl");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "actions" + "'", str8, "actions");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.getCONNECTION_TIMEOUT();
        java.lang.String str4 = mongoDBRiverDefinition2.getCREDENTIALS_FIELD();
        boolean boolean5 = mongoDBRiverDefinition2.isMongoSecondaryReadPreference();
        java.lang.String str6 = mongoDBRiverDefinition2.getMongoCollection();
        boolean boolean7 = mongoDBRiverDefinition2.getstoreStatistics();
        java.lang.String str8 = mongoDBRiverDefinition2.getMongoDb();
        boolean boolean9 = mongoDBRiverDefinition2.storeStatistics;
        java.lang.String str10 = mongoDBRiverDefinition2.getINITIAL_TIMESTAMP_FIELD();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue11 = mongoDBRiverDefinition2.getDEFAULT_BULK_SIZE();
        java.lang.String str12 = mongoDBRiverDefinition2.getSSL_CONNECTION_FIELD();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "connect_timeout" + "'", str3, "connect_timeout");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "credentials" + "'", str4, "credentials");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "initial_timestamp" + "'", str10, "initial_timestamp");
        org.junit.Assert.assertNotNull(byteSizeValue11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ssl" + "'", str12, "ssl");
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean3 = mongoDBRiverDefinition2.getmongoSSLVerifyCertificate();
        java.util.Set<java.lang.String> strSet4 = mongoDBRiverDefinition2.getIncludeFields();
        java.lang.String str5 = mongoDBRiverDefinition2.getMongoOplogNamespace();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null.null" + "'", str5, "null.null");
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        int int2 = mongoDBRiverDefinition1.getDEFAULT_CONCURRENT_REQUESTS();
        java.lang.String str3 = mongoDBRiverDefinition1.scriptType;
        boolean boolean4 = mongoDBRiverDefinition1.importAllCollections;
        java.lang.String str5 = mongoDBRiverDefinition1.getCOLLECTION_FIELD();
        java.util.List<com.mongodb.ServerAddress> serverAddressList6 = mongoDBRiverDefinition1.mongoServers;
        java.lang.String str7 = mongoDBRiverDefinition1.scriptType;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "collection" + "'", str5, "collection");
        org.junit.Assert.assertNotNull(serverAddressList6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.getCONNECTION_TIMEOUT();
        java.lang.String str4 = mongoDBRiverDefinition2.getCREDENTIALS_FIELD();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue5 = mongoDBRiverDefinition2.getDEFAULT_BULK_SIZE();
        java.lang.String str6 = mongoDBRiverDefinition2.indexName;
        java.lang.String str7 = mongoDBRiverDefinition2.getBULK_SIZE_FIELD();
        int int8 = mongoDBRiverDefinition2.getDEFAULT_CONCURRENT_REQUESTS();
        com.mongodb.BasicDBObject basicDBObject9 = mongoDBRiverDefinition2.getMongoOplogFilter();
        java.lang.String str10 = mongoDBRiverDefinition2.getSSL_VERIFY_CERT_FIELD();
        java.lang.String str11 = mongoDBRiverDefinition2.getINITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD();
        java.util.Set<java.lang.String> strSet12 = mongoDBRiverDefinition2.getParentTypes();
        boolean boolean13 = mongoDBRiverDefinition2.disableIndexRefresh;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "connect_timeout" + "'", str3, "connect_timeout");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "credentials" + "'", str4, "credentials");
        org.junit.Assert.assertNotNull(byteSizeValue5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "bulk_size" + "'", str7, "bulk_size");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertNull(basicDBObject9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ssl_verify_certificate" + "'", str10, "ssl_verify_certificate");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "script_type" + "'", str11, "script_type");
        org.junit.Assert.assertNull(strSet12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.getCONNECTION_TIMEOUT();
        java.lang.String str4 = mongoDBRiverDefinition2.getCREDENTIALS_FIELD();
        java.lang.String str5 = mongoDBRiverDefinition2.getSOCKET_TIMEOUT();
        java.lang.String str6 = mongoDBRiverDefinition2.getADMIN_DB_FIELD();
        boolean boolean7 = mongoDBRiverDefinition2.advancedTransformation;
        java.util.List<com.mongodb.ServerAddress> serverAddressList8 = mongoDBRiverDefinition2.mongoServers;
        int int9 = mongoDBRiverDefinition2.getSocketTimeout();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "connect_timeout" + "'", str3, "connect_timeout");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "credentials" + "'", str4, "credentials");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "socket_timeout" + "'", str5, "socket_timeout");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(serverAddressList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.getCONNECTION_TIMEOUT();
        java.lang.String str4 = mongoDBRiverDefinition2.getCREDENTIALS_FIELD();
        java.lang.String str5 = mongoDBRiverDefinition2.getIMPORT_ALL_COLLECTIONS_FIELD();
        java.lang.String str6 = mongoDBRiverDefinition2.getNAME_FIELD();
        boolean boolean7 = mongoDBRiverDefinition2.getadvancedTransformation();
        java.util.Set<java.lang.String> strSet8 = mongoDBRiverDefinition2.getExcludeFields();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "connect_timeout" + "'", str3, "connect_timeout");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "credentials" + "'", str4, "credentials");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "import_all_collections" + "'", str5, "import_all_collections");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "name" + "'", str6, "name");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(strSet8);
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoUseSSL(true);
        builder0.connectTimeout = (byte) -1;
        builder0.setsocketTimeout((int) (short) 1);
        java.lang.String str10 = builder0.getstatisticsTypeName();
        boolean boolean11 = builder0.getmongoGridFS();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder0.mongoLocalUser("name");
        builder14.setincludeCollection("secondary_read_preference");
        int int17 = builder14.socketTimeout;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.setmongoOplogFilter(basicDBObject4);
        boolean boolean6 = builder0.dropCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.socketTimeout((int) ' ');
        java.lang.String str9 = builder8.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder8.typeName("bulk_size");
        java.lang.String str12 = builder11.getmongoLocalUser();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder11);
        builder11.setstatisticsTypeName("script");
        boolean boolean16 = builder11.getadvancedTransformation();
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        java.lang.String str4 = builder0.mongoAdminUser;
        builder0.disableIndexRefresh = false;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.statisticsIndexName("port");
        builder0.setmongoUseSSL(false);
        builder0.setthrottleSize((int) (short) 0);
        com.mongodb.MongoClientOptions mongoClientOptions13 = builder0.getmongoClientOptions();
        builder0.scriptType = "skip_initial_import";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(mongoClientOptions13);
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.mongoOplogFilter = basicDBObject4;
        builder0.disableIndexRefresh = true;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.typeName("secondary_read_preference");
        boolean boolean10 = builder9.skipInitialImport;
        java.lang.String str11 = builder9.getriverName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder9.mongoLocalUser("local");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder13.mongoLocalPassword("collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder15);
        java.lang.String str17 = mongoDBRiverDefinition16.getTypeName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "secondary_read_preference" + "'", str17, "secondary_read_preference");
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.getSECONDARY_READ_PREFERENCE_FIELD();
        java.lang.String str4 = mongoDBRiverDefinition2.getSECONDARY_READ_PREFERENCE_FIELD();
        java.lang.String str5 = mongoDBRiverDefinition2.getFLUSH_INTERVAL_FIELD();
        com.mongodb.BasicDBObject basicDBObject6 = mongoDBRiverDefinition2.mongoOplogFilter;
        java.lang.String str7 = mongoDBRiverDefinition2.getStatisticsTypeName();
        java.lang.String str8 = mongoDBRiverDefinition2.getMongoAdminPassword();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "secondary_read_preference" + "'", str3, "secondary_read_preference");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "secondary_read_preference" + "'", str4, "secondary_read_preference");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "flush_interval" + "'", str5, "flush_interval");
        org.junit.Assert.assertNull(basicDBObject6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoUseSSL(true);
        builder0.connectTimeout = (byte) -1;
        builder0.setsocketTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder0.mongoAdminUser("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder12);
        int int14 = mongoDBRiverDefinition13.getDEFAULT_CONCURRENT_REQUESTS();
        java.lang.String str15 = mongoDBRiverDefinition13.scriptType;
        boolean boolean16 = mongoDBRiverDefinition13.importAllCollections;
        java.lang.String str17 = mongoDBRiverDefinition13.getCOLLECTION_FIELD();
        java.util.List<com.mongodb.ServerAddress> serverAddressList18 = mongoDBRiverDefinition13.mongoServers;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder0.mongoServers(serverAddressList18);
        int int20 = builder0.getsocketTimeout();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "collection" + "'", str17, "collection");
        org.junit.Assert.assertNotNull(serverAddressList18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str4 = builder3.typeName;
        com.mongodb.BasicDBObject basicDBObject5 = null;
        builder3.mongoCollectionFilter = basicDBObject5;
        java.lang.String str7 = builder3.mongoAdminUser;
        builder3.disableIndexRefresh = false;
        java.lang.String str10 = builder3.getincludeCollection();
        com.mongodb.MongoClientOptions mongoClientOptions11 = builder3.getmongoClientOptions();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder12);
        java.util.Set<java.lang.String> strSet14 = builder12.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions15 = builder12.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject16 = null;
        builder12.setmongoOplogFilter(basicDBObject16);
        boolean boolean18 = builder12.dropCollection;
        com.mongodb.ServerAddress[] serverAddressArray19 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList20 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList20, serverAddressArray19);
        builder12.mongoServers = serverAddressList20;
        java.lang.String str23 = builder12.mongoAdminPassword;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str25 = builder24.typeName;
        com.mongodb.BasicDBObject basicDBObject26 = null;
        builder24.mongoCollectionFilter = basicDBObject26;
        java.lang.String str28 = builder24.mongoAdminUser;
        builder24.disableIndexRefresh = false;
        java.lang.String str31 = builder24.typeName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str33 = builder32.typeName;
        com.mongodb.BasicDBObject basicDBObject34 = null;
        builder32.mongoCollectionFilter = basicDBObject34;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder32.mongoUseSSL(true);
        java.lang.String[] strArray47 = new java.lang.String[] { "connect_timeout", "hi!", "port", "connect_timeout", "port", "bulk_size", "concurrent_bulk_requests", "", "options" };
        java.util.LinkedHashSet<java.lang.String> strSet48 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet48, strArray47);
        builder37.setparentTypes((java.util.Set<java.lang.String>) strSet48);
        builder24.parentTypes = strSet48;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder12.parentTypes((java.util.Set<java.lang.String>) strSet48);
        builder3.setexcludeFields((java.util.Set<java.lang.String>) strSet48);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder0.includeFields((java.util.Set<java.lang.String>) strSet48);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition55 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder0.socketTimeout((int) ' ');
        boolean boolean58 = builder57.getskipInitialImport();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition59 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder57);
        java.lang.String str60 = mongoDBRiverDefinition59.getINCLUDE_FIELDS_FIELD();
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(mongoClientOptions11);
        org.junit.Assert.assertNull(strSet14);
        org.junit.Assert.assertNull(mongoClientOptions15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(serverAddressArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "include_fields" + "'", str60, "include_fields");
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        docScoreSearchScript0.setNextScore(100.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder6);
        java.util.Set<java.lang.String> strSet8 = builder6.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions9 = builder6.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject10 = null;
        builder6.setmongoOplogFilter(basicDBObject10);
        boolean boolean12 = builder6.dropCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder6.socketTimeout((int) ' ');
        java.util.Set<java.lang.String> strSet15 = builder14.excludeFields;
        builder14.setriverName("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder14.mongoAdminUser("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder14.mongoDb("size");
        docScoreSearchScript0.setNextVar("advanced_transformation", (java.lang.Object) builder14);
        org.apache.lucene.index.AtomicReaderContext atomicReaderContext23 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextReader(atomicReaderContext23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strSet8);
        org.junit.Assert.assertNull(mongoClientOptions9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNull(strSet15);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str3 = builder2.typeName;
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder2.mongoCollectionFilter = basicDBObject4;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder2.mongoUseSSL(true);
        java.lang.String[] strArray17 = new java.lang.String[] { "connect_timeout", "hi!", "port", "connect_timeout", "port", "bulk_size", "concurrent_bulk_requests", "", "options" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        builder7.setparentTypes((java.util.Set<java.lang.String>) strSet18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder7.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str24 = builder23.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str26 = builder25.typeName;
        com.mongodb.BasicDBObject basicDBObject27 = null;
        builder25.mongoCollectionFilter = basicDBObject27;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder25.mongoUseSSL(true);
        java.lang.String[] strArray40 = new java.lang.String[] { "connect_timeout", "hi!", "port", "connect_timeout", "port", "bulk_size", "concurrent_bulk_requests", "", "options" };
        java.util.LinkedHashSet<java.lang.String> strSet41 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet41, strArray40);
        builder30.setparentTypes((java.util.Set<java.lang.String>) strSet41);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder23.parentTypes((java.util.Set<java.lang.String>) strSet41);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder22.parentTypes((java.util.Set<java.lang.String>) strSet41);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder0.excludeFields((java.util.Set<java.lang.String>) strSet41);
        builder0.typeName = "host";
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder46);
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) (-1));
        java.lang.Object obj6 = docScoreSearchScript0.unwrap((java.lang.Object) "bulk");
        docScoreSearchScript0.setNextScore((float) 0L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder9);
        java.util.Set<java.lang.String> strSet11 = builder9.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions12 = builder9.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject13 = null;
        builder9.setmongoOplogFilter(basicDBObject13);
        boolean boolean15 = builder9.dropCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder9.mongoGridFS(true);
        builder9.setstatisticsTypeName("servers");
        java.lang.Object obj20 = docScoreSearchScript0.unwrap((java.lang.Object) "servers");
        // The following exception was thrown during execution in test generation
        try {
            double double21 = docScoreSearchScript0.runAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1) + "'", obj4, (-1));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "bulk" + "'", obj6, "bulk");
        org.junit.Assert.assertNull(strSet11);
        org.junit.Assert.assertNull(mongoClientOptions12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + "servers" + "'", obj20, "servers");
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.mongoCollection;
        builder0.setmongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.script("actions");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.advancedTransformation(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder7);
        int int9 = mongoDBRiverDefinition8.getDEFAULT_DB_PORT();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 27017 + "'", int9 == 27017);
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) (-1));
        java.lang.Object obj6 = docScoreSearchScript0.unwrap((java.lang.Object) "bulk");
        docScoreSearchScript0.setNextScore((float) 0L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder10);
        java.lang.String str13 = mongoDBRiverDefinition12.mongoAdminPassword;
        java.util.Set<java.lang.String> strSet14 = mongoDBRiverDefinition12.excludeFields;
        java.lang.String str15 = mongoDBRiverDefinition12.mongoAdminUser;
        docScoreSearchScript0.setNextVar("exclude_fields", (java.lang.Object) mongoDBRiverDefinition12);
        java.lang.Object obj18 = docScoreSearchScript0.unwrap((java.lang.Object) "collection");
        org.apache.lucene.index.AtomicReaderContext atomicReaderContext19 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextReader(atomicReaderContext19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1) + "'", obj4, (-1));
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + "bulk" + "'", obj6, "bulk");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(strSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + "collection" + "'", obj18, "collection");
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.setmongoOplogFilter(basicDBObject4);
        boolean boolean6 = builder0.dropCollection;
        com.mongodb.ServerAddress[] serverAddressArray7 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList8 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList8, serverAddressArray7);
        builder0.mongoServers = serverAddressList8;
        java.lang.String str11 = builder0.mongoAdminPassword;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder0.importAllCollections(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder0.script("hi!");
        builder15.mongoAdminPassword = "bulk_size";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder15.mongoLocalUser("password");
        java.util.Set<java.lang.String> strSet20 = builder15.getincludeFields();
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(serverAddressArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNull(strSet20);
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.statisticsTypeName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder4);
        java.lang.String str6 = mongoDBRiverDefinition5.getStatisticsTypeName();
        java.lang.String str7 = mongoDBRiverDefinition5.getDEFAULT_DB_HOST();
        boolean boolean8 = mongoDBRiverDefinition5.isStoreStatistics();
        java.util.Set<java.lang.String> strSet9 = mongoDBRiverDefinition5.parentTypes;
        java.lang.String str10 = mongoDBRiverDefinition5.getINITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD();
        java.lang.String str11 = mongoDBRiverDefinition5.getDROP_COLLECTION_FIELD();
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "bulk_size" + "'", str6, "bulk_size");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "localhost" + "'", str7, "localhost");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(strSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "script_type" + "'", str10, "script_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "drop_collection" + "'", str11, "drop_collection");
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.statisticsTypeName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoLocalUser("exclude_fields");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str8 = mongoDBRiverDefinition7.getScriptType();
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.Settings settings1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str3 = builder2.typeName;
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder2.mongoCollectionFilter = basicDBObject4;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder2.mongoUseSSL(true);
        builder2.connectTimeout = (byte) -1;
        builder2.setsocketTimeout((int) (short) 1);
        java.lang.String str12 = builder2.getstatisticsTypeName();
        boolean boolean13 = builder2.getmongoGridFS();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder2.dropCollection(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder16);
        java.util.Set<java.lang.String> strSet18 = builder16.includeFields;
        java.lang.String str19 = builder16.mongoAdminUser;
        java.lang.String str20 = builder16.statisticsTypeName;
        com.mongodb.BasicDBObject basicDBObject21 = builder16.mongoCollectionFilter;
        builder2.setmongoCollectionFilter(basicDBObject21);
        org.elasticsearch.river.RiverSettings riverSettings23 = new org.elasticsearch.river.RiverSettings(settings1, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject21);
        org.elasticsearch.river.RiverSettings riverSettings24 = new org.elasticsearch.river.RiverSettings(settings0, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject21);
        org.elasticsearch.common.settings.Settings settings25 = riverSettings24.globalSettings();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNull(strSet18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(basicDBObject21);
        org.junit.Assert.assertNull(settings25);
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory0 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.common.settings.Settings settings1 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder2);
        java.util.Set<java.lang.String> strSet4 = builder2.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions5 = builder2.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject6 = null;
        builder2.setmongoOplogFilter(basicDBObject6);
        boolean boolean8 = builder2.dropCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder2.socketTimeout((int) ' ');
        java.lang.String str11 = builder10.getscript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder10.mongoCollection("drop_collection");
        com.mongodb.BasicDBObject basicDBObject14 = builder10.mongoCollectionFilter;
        org.elasticsearch.river.RiverSettings riverSettings15 = new org.elasticsearch.river.RiverSettings(settings1, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject14);
        org.elasticsearch.script.ExecutableScript executableScript16 = docScoreNativeScriptFactory0.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject14);
        org.elasticsearch.common.settings.Settings settings17 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str19 = builder18.typeName;
        com.mongodb.BasicDBObject basicDBObject20 = null;
        builder18.mongoCollectionFilter = basicDBObject20;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder18.mongoUseSSL(true);
        builder18.connectTimeout = (byte) -1;
        int int26 = builder18.socketTimeout;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder18.statisticsIndexName("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.statisticsTypeName("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str32 = builder31.typeName;
        com.mongodb.BasicDBObject basicDBObject33 = null;
        builder31.mongoCollectionFilter = basicDBObject33;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder31.mongoAdminPassword("db");
        boolean boolean37 = builder31.getmongoGridFS();
        java.lang.String str38 = builder31.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder31.riverIndexName("index");
        org.elasticsearch.common.settings.Settings settings41 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition43 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder42);
        java.util.Set<java.lang.String> strSet44 = builder42.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions45 = builder42.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject46 = null;
        builder42.setmongoOplogFilter(basicDBObject46);
        com.mongodb.BasicDBObject basicDBObject48 = builder42.getmongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings49 = new org.elasticsearch.river.RiverSettings(settings41, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject48);
        builder40.setmongoOplogFilter(basicDBObject48);
        builder28.setmongoOplogFilter(basicDBObject48);
        org.elasticsearch.river.RiverSettings riverSettings52 = new org.elasticsearch.river.RiverSettings(settings17, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject48);
        org.elasticsearch.script.ExecutableScript executableScript53 = docScoreNativeScriptFactory0.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject48);
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertNull(mongoClientOptions5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(basicDBObject14);
        org.junit.Assert.assertNotNull(executableScript16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNull(strSet44);
        org.junit.Assert.assertNull(mongoClientOptions45);
        org.junit.Assert.assertNotNull(basicDBObject48);
        org.junit.Assert.assertNotNull(executableScript53);
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.mongoCollection;
        builder0.setmongoUseSSL(false);
        builder0.setconnectTimeout(0);
        boolean boolean6 = builder0.getmongoUseSSL();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        com.mongodb.MongoClientOptions mongoClientOptions8 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.mongoClientOptions(mongoClientOptions8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str11 = builder10.typeName;
        builder10.setsocketTimeout(0);
        boolean boolean14 = builder10.getmongoUseSSL();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str17 = builder16.typeName;
        com.mongodb.BasicDBObject basicDBObject18 = null;
        builder16.mongoCollectionFilter = basicDBObject18;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder16.mongoUseSSL(true);
        java.lang.String[] strArray31 = new java.lang.String[] { "connect_timeout", "hi!", "port", "connect_timeout", "port", "bulk_size", "concurrent_bulk_requests", "", "options" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        builder21.setparentTypes((java.util.Set<java.lang.String>) strSet32);
        builder10.setparentTypes((java.util.Set<java.lang.String>) strSet32);
        java.lang.String str36 = builder10.statisticsIndexName;
        builder10.advancedTransformation = false;
        java.lang.String str39 = builder10.mongoDb;
        java.util.List<com.mongodb.ServerAddress> serverAddressList40 = builder10.getmongoServers();
        java.lang.String str41 = builder10.getmongoAdminUser();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str43 = builder42.typeName;
        com.mongodb.BasicDBObject basicDBObject44 = null;
        builder42.mongoCollectionFilter = basicDBObject44;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder42.mongoUseSSL(true);
        java.lang.String[] strArray57 = new java.lang.String[] { "connect_timeout", "hi!", "port", "connect_timeout", "port", "bulk_size", "concurrent_bulk_requests", "", "options" };
        java.util.LinkedHashSet<java.lang.String> strSet58 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet58, strArray57);
        builder47.setparentTypes((java.util.Set<java.lang.String>) strSet58);
        builder10.includeFields = strSet58;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = builder9.includeFields((java.util.Set<java.lang.String>) strSet58);
        builder62.mongoSSLVerifyCertificate = false;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(serverAddressList40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(builder62);
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoUseSSL(true);
        builder0.connectTimeout = (byte) -1;
        int int8 = builder0.socketTimeout;
        java.lang.String str9 = builder0.getmongoAdminUser();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder0.mongoAdminPassword("local");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder11);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = mongoDBRiverDefinition12.getInitialTimestamp();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNull(wildcardTimestamp13);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.mongoCollection;
        builder0.setmongoUseSSL(false);
        builder0.setconnectTimeout(0);
        boolean boolean6 = builder0.getmongoUseSSL();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoDb = "drop_collection";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.dropCollection(true);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) (-1));
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str7 = builder6.typeName;
        com.mongodb.BasicDBObject basicDBObject8 = null;
        builder6.mongoCollectionFilter = basicDBObject8;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder6.mongoAdminPassword("db");
        docScoreSearchScript0.setNextVar("bulk_size", (java.lang.Object) builder6);
        java.lang.Object obj14 = null;
        docScoreSearchScript0.setNextVar("gridfs", obj14);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder17);
        java.util.Set<java.lang.String> strSet19 = builder17.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions20 = builder17.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject21 = null;
        builder17.setmongoOplogFilter(basicDBObject21);
        boolean boolean23 = builder17.dropCollection;
        com.mongodb.ServerAddress[] serverAddressArray24 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList25 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList25, serverAddressArray24);
        builder17.mongoServers = serverAddressList25;
        java.lang.String str28 = builder17.mongoAdminPassword;
        java.lang.String str29 = builder17.getscriptType();
        java.lang.String str30 = builder17.gettypeName();
        docScoreSearchScript0.setNextVar("advanced_transformation", (java.lang.Object) builder17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj32 = docScoreSearchScript0.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1) + "'", obj4, (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNull(strSet19);
        org.junit.Assert.assertNull(mongoClientOptions20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(serverAddressArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.getCONNECTION_TIMEOUT();
        java.lang.String str4 = mongoDBRiverDefinition2.getOPTIONS_FIELD();
        boolean boolean5 = mongoDBRiverDefinition2.isMongoGridFS();
        com.mongodb.MongoClientOptions mongoClientOptions6 = mongoDBRiverDefinition2.getMongoClientOptions();
        java.util.Set<java.lang.String> strSet7 = mongoDBRiverDefinition2.parentTypes;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "connect_timeout" + "'", str3, "connect_timeout");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "options" + "'", str4, "options");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(mongoClientOptions6);
        org.junit.Assert.assertNull(strSet7);
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        int int2 = mongoDBRiverDefinition1.getDEFAULT_CONCURRENT_REQUESTS();
        java.lang.String str3 = mongoDBRiverDefinition1.scriptType;
        boolean boolean4 = mongoDBRiverDefinition1.importAllCollections;
        java.lang.String str5 = mongoDBRiverDefinition1.getCOLLECTION_FIELD();
        java.util.List<com.mongodb.ServerAddress> serverAddressList6 = mongoDBRiverDefinition1.mongoServers;
        boolean boolean7 = mongoDBRiverDefinition1.isImportAllCollections();
        boolean boolean8 = mongoDBRiverDefinition1.getmongoGridFS();
        java.lang.String str9 = mongoDBRiverDefinition1.getTypeName();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "collection" + "'", str5, "collection");
        org.junit.Assert.assertNotNull(serverAddressList6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.setmongoOplogFilter(basicDBObject4);
        boolean boolean6 = builder0.dropCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.mongoGridFS(true);
        java.lang.String str9 = builder0.riverIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setconnectTimeout(100);
        java.util.Set<java.lang.String> strSet13 = builder0.getparentTypes();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder0.riverName("flush_interval");
        com.mongodb.MongoClientOptions mongoClientOptions16 = builder15.getmongoClientOptions();
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(strSet13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNull(mongoClientOptions16);
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.statisticsTypeName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder4);
        java.lang.String str6 = mongoDBRiverDefinition5.getStatisticsTypeName();
        java.lang.String str7 = mongoDBRiverDefinition5.getDEFAULT_DB_HOST();
        java.lang.String str8 = mongoDBRiverDefinition5.mongoLocalPassword;
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "bulk_size" + "'", str6, "bulk_size");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "localhost" + "'", str7, "localhost");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoAdminPassword("db");
        builder5.importAllCollections = false;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = builder5.build();
        org.elasticsearch.common.unit.TimeValue timeValue9 = mongoDBRiverDefinition8.getDEFAULT_FLUSH_INTERVAL();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition8);
        org.junit.Assert.assertNotNull(timeValue9);
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.statisticsTypeName("bulk_size");
        builder0.includeCollection = "port";
        builder0.mongoAdminPassword = "localhost";
        org.bson.types.Binary binary9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.initialTimestamp(binary9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("bulk_timeout");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?bulk_timeout?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.setmongoOplogFilter(basicDBObject4);
        boolean boolean6 = builder0.dropCollection;
        com.mongodb.ServerAddress[] serverAddressArray7 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList8 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList8, serverAddressArray7);
        builder0.mongoServers = serverAddressList8;
        java.lang.String str11 = builder0.mongoAdminPassword;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str13 = builder12.typeName;
        com.mongodb.BasicDBObject basicDBObject14 = null;
        builder12.mongoCollectionFilter = basicDBObject14;
        java.lang.String str16 = builder12.mongoAdminUser;
        builder12.disableIndexRefresh = false;
        java.lang.String str19 = builder12.typeName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str21 = builder20.typeName;
        com.mongodb.BasicDBObject basicDBObject22 = null;
        builder20.mongoCollectionFilter = basicDBObject22;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder20.mongoUseSSL(true);
        java.lang.String[] strArray35 = new java.lang.String[] { "connect_timeout", "hi!", "port", "connect_timeout", "port", "bulk_size", "concurrent_bulk_requests", "", "options" };
        java.util.LinkedHashSet<java.lang.String> strSet36 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet36, strArray35);
        builder25.setparentTypes((java.util.Set<java.lang.String>) strSet36);
        builder12.parentTypes = strSet36;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder0.parentTypes((java.util.Set<java.lang.String>) strSet36);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder0.includeCollection("type");
        builder0.disableIndexRefresh = false;
        builder0.mongoAdminUser = "throttle_size";
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(serverAddressArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoUseSSL(true);
        com.mongodb.MongoClientOptions mongoClientOptions6 = null;
        builder5.mongoClientOptions = mongoClientOptions6;
        builder5.setmongoCollection("gridfs");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder5.advancedTransformation(true);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = builder11.getinitialTimestamp();
        builder11.setriverName("null.null");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNull(wildcardTimestamp12);
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.getPORT_FIELD();
        java.lang.String str4 = mongoDBRiverDefinition2.getScriptType();
        boolean boolean5 = mongoDBRiverDefinition2.isDisableIndexRefresh();
        java.lang.String str6 = mongoDBRiverDefinition2.getSECONDARY_READ_PREFERENCE_FIELD();
        boolean boolean7 = mongoDBRiverDefinition2.isMongoSSLVerifyCertificate();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "port" + "'", str3, "port");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "secondary_read_preference" + "'", str6, "secondary_read_preference");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.getCONNECTION_TIMEOUT();
        java.lang.String str4 = mongoDBRiverDefinition2.getOPTIONS_FIELD();
        int int5 = mongoDBRiverDefinition2.getDEFAULT_CONCURRENT_REQUESTS();
        boolean boolean6 = mongoDBRiverDefinition2.importAllCollections;
        java.lang.String str7 = mongoDBRiverDefinition2.getADMIN_DB_FIELD();
        boolean boolean8 = mongoDBRiverDefinition2.isStoreStatistics();
        java.lang.String str9 = mongoDBRiverDefinition2.getNAME_FIELD();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "connect_timeout" + "'", str3, "connect_timeout");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "options" + "'", str4, "options");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "name" + "'", str9, "name");
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        org.elasticsearch.common.settings.Settings settings2 = null;
        org.elasticsearch.common.settings.Settings settings3 = null;
        org.elasticsearch.common.settings.Settings settings4 = null;
        org.elasticsearch.common.settings.Settings settings5 = null;
        org.elasticsearch.common.settings.Settings settings6 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder7);
        java.util.Set<java.lang.String> strSet9 = builder7.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions10 = builder7.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject11 = null;
        builder7.setmongoOplogFilter(basicDBObject11);
        com.mongodb.BasicDBObject basicDBObject13 = builder7.getmongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings14 = new org.elasticsearch.river.RiverSettings(settings6, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject13);
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = riverSettings14.settings();
        org.elasticsearch.river.RiverSettings riverSettings16 = new org.elasticsearch.river.RiverSettings(settings5, strMap15);
        org.elasticsearch.river.RiverSettings riverSettings17 = new org.elasticsearch.river.RiverSettings(settings4, strMap15);
        org.elasticsearch.river.RiverSettings riverSettings18 = new org.elasticsearch.river.RiverSettings(settings3, strMap15);
        org.elasticsearch.river.RiverSettings riverSettings19 = new org.elasticsearch.river.RiverSettings(settings2, strMap15);
        org.elasticsearch.script.ScriptService scriptService20 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition21 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("include_collection", "advanced_transformation", riverSettings19, scriptService20);
        java.lang.String str22 = mongoDBRiverDefinition21.getMongoOplogNamespace();
        java.lang.String str23 = mongoDBRiverDefinition21.indexName;
        org.junit.Assert.assertNull(strSet9);
        org.junit.Assert.assertNull(mongoClientOptions10);
        org.junit.Assert.assertNotNull(basicDBObject13);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "include_collection.include_collection" + "'", str22, "include_collection.include_collection");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "include_collection" + "'", str23, "include_collection");
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean3 = mongoDBRiverDefinition2.isMongoSecondaryReadPreference();
        java.lang.String str4 = mongoDBRiverDefinition2.getMongoDb();
        java.lang.String str5 = mongoDBRiverDefinition2.getSCRIPT_TYPE_FIELD();
        org.elasticsearch.common.unit.TimeValue timeValue6 = mongoDBRiverDefinition2.getDEFAULT_FLUSH_INTERVAL();
        java.lang.String str7 = mongoDBRiverDefinition2.getFILTER_FIELD();
        java.lang.String str8 = mongoDBRiverDefinition2.scriptType;
        java.lang.String str9 = mongoDBRiverDefinition2.mongoLocalPassword;
        int int10 = mongoDBRiverDefinition2.socketTimeout;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "script_type" + "'", str5, "script_type");
        org.junit.Assert.assertNotNull(timeValue6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "filter" + "'", str7, "filter");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        int int2 = mongoDBRiverDefinition1.getDEFAULT_CONCURRENT_REQUESTS();
        java.lang.String str3 = mongoDBRiverDefinition1.getDB_FIELD();
        java.lang.String str4 = mongoDBRiverDefinition1.getRiverName();
        java.lang.String str5 = mongoDBRiverDefinition1.getINITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "db" + "'", str3, "db");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "script_type" + "'", str5, "script_type");
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.setmongoOplogFilter(basicDBObject4);
        boolean boolean6 = builder0.mongoUseSSL;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.disableIndexRefresh(false);
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.getmongoClientOptions();
        builder0.setstatisticsTypeName("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.skipInitialImport(true);
        boolean boolean8 = builder7.getstoreStatistics();
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(mongoClientOptions3);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        java.lang.String str4 = builder0.mongoAdminUser;
        java.lang.String str5 = builder0.getriverName();
        builder0.storeStatistics = true;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.mongoLocalUser("options");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder0.typeName("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder12);
        int int14 = mongoDBRiverDefinition13.getDEFAULT_CONCURRENT_REQUESTS();
        java.lang.String str15 = mongoDBRiverDefinition13.scriptType;
        boolean boolean16 = mongoDBRiverDefinition13.importAllCollections;
        java.lang.String str17 = mongoDBRiverDefinition13.getCOLLECTION_FIELD();
        java.util.List<com.mongodb.ServerAddress> serverAddressList18 = mongoDBRiverDefinition13.mongoServers;
        builder11.setmongoServers(serverAddressList18);
        builder11.statisticsIndexName = "name";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder11.includeCollection("name");
        boolean boolean24 = builder11.getmongoSecondaryReadPreference();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "collection" + "'", str17, "collection");
        org.junit.Assert.assertNotNull(serverAddressList18);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        int int2 = mongoDBRiverDefinition1.getDEFAULT_CONCURRENT_REQUESTS();
        java.util.List<com.mongodb.ServerAddress> serverAddressList3 = mongoDBRiverDefinition1.mongoServers;
        java.lang.String str4 = mongoDBRiverDefinition1.getSECONDARY_READ_PREFERENCE_FIELD();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertNotNull(serverAddressList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "secondary_read_preference" + "'", str4, "secondary_read_preference");
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        int int2 = mongoDBRiverDefinition1.getDEFAULT_CONCURRENT_REQUESTS();
        java.util.List<com.mongodb.ServerAddress> serverAddressList3 = mongoDBRiverDefinition1.mongoServers;
        java.lang.String str4 = mongoDBRiverDefinition1.getMongoLocalUser();
        int int5 = mongoDBRiverDefinition1.throttleSize;
        java.lang.String str6 = mongoDBRiverDefinition1.getSSL_CONNECTION_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition1.getSECONDARY_READ_PREFERENCE_FIELD();
        boolean boolean8 = mongoDBRiverDefinition1.disableIndexRefresh;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertNotNull(serverAddressList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ssl" + "'", str6, "ssl");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "secondary_read_preference" + "'", str7, "secondary_read_preference");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.setmongoOplogFilter(basicDBObject4);
        boolean boolean6 = builder0.dropCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.socketTimeout((int) ' ');
        java.util.Set<java.lang.String> strSet9 = builder8.excludeFields;
        builder8.setriverName("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder8.mongoAdminUser("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder8.mongoSSLVerifyCertificate(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str17 = builder16.typeName;
        com.mongodb.BasicDBObject basicDBObject18 = null;
        builder16.mongoCollectionFilter = basicDBObject18;
        java.lang.String str20 = builder16.mongoAdminUser;
        builder16.disableIndexRefresh = false;
        java.lang.String str23 = builder16.getincludeCollection();
        org.elasticsearch.common.settings.Settings settings24 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition26 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder25);
        java.util.Set<java.lang.String> strSet27 = builder25.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions28 = builder25.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject29 = null;
        builder25.setmongoOplogFilter(basicDBObject29);
        com.mongodb.BasicDBObject basicDBObject31 = builder25.getmongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings32 = new org.elasticsearch.river.RiverSettings(settings24, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject31);
        builder16.setmongoOplogFilter(basicDBObject31);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder8.mongoCollectionFilter(basicDBObject31);
        builder34.mongoSecondaryReadPreference = false;
        builder34.setmongoAdminPassword("db");
        boolean boolean39 = builder34.storeStatistics;
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(strSet9);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(strSet27);
        org.junit.Assert.assertNull(mongoClientOptions28);
        org.junit.Assert.assertNotNull(basicDBObject31);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) (-1));
        docScoreSearchScript0.setNextScore((float) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str8 = builder7.typeName;
        com.mongodb.BasicDBObject basicDBObject9 = null;
        builder7.mongoCollectionFilter = basicDBObject9;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder7.mongoUseSSL(true);
        com.mongodb.MongoClientOptions mongoClientOptions13 = null;
        builder12.mongoClientOptions = mongoClientOptions13;
        builder12.setmongoCollection("gridfs");
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory17 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder19);
        java.util.Set<java.lang.String> strSet21 = builder19.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions22 = builder19.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject23 = null;
        builder19.setmongoOplogFilter(basicDBObject23);
        com.mongodb.BasicDBObject basicDBObject25 = builder19.getmongoCollectionFilter();
        builder18.mongoCollectionFilter = basicDBObject25;
        org.elasticsearch.script.ExecutableScript executableScript27 = docScoreNativeScriptFactory17.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject25);
        builder12.setmongoCollectionFilter(basicDBObject25);
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1) + "'", obj4, (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(strSet21);
        org.junit.Assert.assertNull(mongoClientOptions22);
        org.junit.Assert.assertNotNull(basicDBObject25);
        org.junit.Assert.assertNotNull(executableScript27);
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.setmongoOplogFilter(basicDBObject4);
        boolean boolean6 = builder0.dropCollection;
        com.mongodb.ServerAddress[] serverAddressArray7 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList8 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList8, serverAddressArray7);
        builder0.mongoServers = serverAddressList8;
        java.lang.String str11 = builder0.mongoAdminPassword;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder0.importAllCollections(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder0.script("hi!");
        builder15.mongoAdminPassword = "bulk_size";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder15.mongoLocalUser("password");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder15.mongoUseSSL(false);
        com.mongodb.MongoClientOptions mongoClientOptions22 = null;
        builder21.mongoClientOptions = mongoClientOptions22;
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(serverAddressArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript4 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript4.setNextScore((float) (byte) 1);
        java.lang.Object obj8 = docScoreSearchScript4.unwrap((java.lang.Object) (-1));
        java.lang.Object obj10 = docScoreSearchScript4.unwrap((java.lang.Object) "bulk");
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory12 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder14);
        java.util.Set<java.lang.String> strSet16 = builder14.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions17 = builder14.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject18 = null;
        builder14.setmongoOplogFilter(basicDBObject18);
        com.mongodb.BasicDBObject basicDBObject20 = builder14.getmongoCollectionFilter();
        builder13.mongoCollectionFilter = basicDBObject20;
        org.elasticsearch.script.ExecutableScript executableScript22 = docScoreNativeScriptFactory12.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject20);
        org.elasticsearch.common.settings.Settings settings23 = null;
        org.elasticsearch.common.settings.Settings settings24 = null;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory25 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder27);
        java.util.Set<java.lang.String> strSet29 = builder27.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions30 = builder27.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject31 = null;
        builder27.setmongoOplogFilter(basicDBObject31);
        com.mongodb.BasicDBObject basicDBObject33 = builder27.getmongoCollectionFilter();
        builder26.mongoCollectionFilter = basicDBObject33;
        org.elasticsearch.script.ExecutableScript executableScript35 = docScoreNativeScriptFactory25.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject33);
        org.elasticsearch.river.RiverSettings riverSettings36 = new org.elasticsearch.river.RiverSettings(settings24, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject33);
        org.elasticsearch.river.RiverSettings riverSettings37 = new org.elasticsearch.river.RiverSettings(settings23, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject33);
        org.elasticsearch.script.ExecutableScript executableScript38 = docScoreNativeScriptFactory12.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject33);
        docScoreSearchScript4.setNextVar("actions", (java.lang.Object) basicDBObject33);
        docScoreSearchScript0.setNextVar("port", (java.lang.Object) docScoreSearchScript4);
        org.elasticsearch.common.settings.Settings settings42 = null;
        org.elasticsearch.common.settings.Settings settings43 = null;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory44 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.common.settings.Settings settings45 = null;
        org.elasticsearch.common.settings.Settings settings46 = null;
        org.elasticsearch.common.settings.Settings settings47 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition49 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder48);
        java.util.Set<java.lang.String> strSet50 = builder48.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions51 = builder48.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject52 = null;
        builder48.setmongoOplogFilter(basicDBObject52);
        com.mongodb.BasicDBObject basicDBObject54 = builder48.getmongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings55 = new org.elasticsearch.river.RiverSettings(settings47, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject54);
        org.elasticsearch.river.RiverSettings riverSettings56 = new org.elasticsearch.river.RiverSettings(settings46, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject54);
        org.elasticsearch.river.RiverSettings riverSettings57 = new org.elasticsearch.river.RiverSettings(settings45, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject54);
        org.elasticsearch.script.ExecutableScript executableScript58 = docScoreNativeScriptFactory44.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject54);
        org.elasticsearch.river.RiverSettings riverSettings59 = new org.elasticsearch.river.RiverSettings(settings43, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject54);
        org.elasticsearch.river.RiverSettings riverSettings60 = new org.elasticsearch.river.RiverSettings(settings42, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject54);
        docScoreSearchScript0.setNextVar("exclude_fields", (java.lang.Object) basicDBObject54);
        org.apache.lucene.search.Scorer scorer62 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setScorer(scorer62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + (-1) + "'", obj8, (-1));
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + "bulk" + "'", obj10, "bulk");
        org.junit.Assert.assertNull(strSet16);
        org.junit.Assert.assertNull(mongoClientOptions17);
        org.junit.Assert.assertNotNull(basicDBObject20);
        org.junit.Assert.assertNotNull(executableScript22);
        org.junit.Assert.assertNull(strSet29);
        org.junit.Assert.assertNull(mongoClientOptions30);
        org.junit.Assert.assertNotNull(basicDBObject33);
        org.junit.Assert.assertNotNull(executableScript35);
        org.junit.Assert.assertNotNull(executableScript38);
        org.junit.Assert.assertNull(strSet50);
        org.junit.Assert.assertNull(mongoClientOptions51);
        org.junit.Assert.assertNotNull(basicDBObject54);
        org.junit.Assert.assertNotNull(executableScript58);
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.getmongoClientOptions();
        builder0.setstatisticsTypeName("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        com.mongodb.MongoClientOptions mongoClientOptions8 = mongoDBRiverDefinition7.getMongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject9 = mongoDBRiverDefinition7.getMongoOplogFilter();
        java.lang.String str10 = mongoDBRiverDefinition7.statisticsIndexName;
        java.lang.String str11 = mongoDBRiverDefinition7.getSKIP_INITIAL_IMPORT_FIELD();
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(mongoClientOptions3);
        org.junit.Assert.assertNull(mongoClientOptions8);
        org.junit.Assert.assertNull(basicDBObject9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "skip_initial_import" + "'", str11, "skip_initial_import");
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        int int2 = mongoDBRiverDefinition1.getDEFAULT_CONCURRENT_REQUESTS();
        java.util.List<com.mongodb.ServerAddress> serverAddressList3 = mongoDBRiverDefinition1.mongoServers;
        java.lang.String str4 = mongoDBRiverDefinition1.getMongoLocalUser();
        int int5 = mongoDBRiverDefinition1.throttleSize;
        java.lang.String str6 = mongoDBRiverDefinition1.getSSL_CONNECTION_FIELD();
        boolean boolean7 = mongoDBRiverDefinition1.isSkipInitialImport();
        boolean boolean8 = mongoDBRiverDefinition1.getdisableIndexRefresh();
        java.util.Set<java.lang.String> strSet9 = mongoDBRiverDefinition1.getParentTypes();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue10 = mongoDBRiverDefinition1.getDEFAULT_BULK_SIZE();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertNotNull(serverAddressList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ssl" + "'", str6, "ssl");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(strSet9);
        org.junit.Assert.assertNotNull(byteSizeValue10);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.statisticsTypeName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str6 = mongoDBRiverDefinition5.getINITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD();
        int int7 = mongoDBRiverDefinition5.getDEFAULT_DB_PORT();
        com.mongodb.MongoClientOptions mongoClientOptions8 = mongoDBRiverDefinition5.getMongoClientOptions();
        boolean boolean9 = mongoDBRiverDefinition5.isStoreStatistics();
        boolean boolean10 = mongoDBRiverDefinition5.storeStatistics;
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "script_type" + "'", str6, "script_type");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 27017 + "'", int7 == 27017);
        org.junit.Assert.assertNull(mongoClientOptions8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.getPORT_FIELD();
        java.lang.String str4 = mongoDBRiverDefinition2.getScriptType();
        boolean boolean5 = mongoDBRiverDefinition2.isDisableIndexRefresh();
        int int6 = mongoDBRiverDefinition2.getSocketTimeout();
        boolean boolean7 = mongoDBRiverDefinition2.isAdvancedTransformation();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "port" + "'", str3, "port");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = builder0.statisticsTypeName;
        boolean boolean4 = builder0.storeStatistics;
        builder0.setmongoSSLVerifyCertificate(false);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("password", "hi!");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?hi!?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoAdminPassword("db");
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory6 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.common.settings.Settings settings7 = null;
        org.elasticsearch.common.settings.Settings settings8 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder9);
        java.util.Set<java.lang.String> strSet11 = builder9.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions12 = builder9.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject13 = null;
        builder9.setmongoOplogFilter(basicDBObject13);
        com.mongodb.BasicDBObject basicDBObject15 = builder9.getmongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings16 = new org.elasticsearch.river.RiverSettings(settings8, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject15);
        org.elasticsearch.river.RiverSettings riverSettings17 = new org.elasticsearch.river.RiverSettings(settings7, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject15);
        org.elasticsearch.script.ExecutableScript executableScript18 = docScoreNativeScriptFactory6.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject15);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder0.mongoOplogFilter(basicDBObject15);
        java.lang.String str20 = builder0.typeName;
        java.lang.String str21 = builder0.mongoAdminPassword;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(strSet11);
        org.junit.Assert.assertNull(mongoClientOptions12);
        org.junit.Assert.assertNotNull(basicDBObject15);
        org.junit.Assert.assertNotNull(executableScript18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "db" + "'", str21, "db");
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        docScoreSearchScript0.setNextScore(100.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder6);
        java.util.Set<java.lang.String> strSet8 = builder6.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions9 = builder6.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject10 = null;
        builder6.setmongoOplogFilter(basicDBObject10);
        boolean boolean12 = builder6.dropCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder6.socketTimeout((int) ' ');
        java.util.Set<java.lang.String> strSet15 = builder14.excludeFields;
        builder14.setriverName("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder14.mongoAdminUser("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder14.mongoDb("size");
        docScoreSearchScript0.setNextVar("advanced_transformation", (java.lang.Object) builder14);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder23);
        java.util.Set<java.lang.String> strSet25 = builder23.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions26 = builder23.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject27 = null;
        builder23.setmongoOplogFilter(basicDBObject27);
        boolean boolean29 = builder23.dropCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder23.socketTimeout((int) ' ');
        java.lang.String str32 = builder31.mongoCollection;
        int int33 = builder31.throttleSize;
        java.lang.Object obj34 = docScoreSearchScript0.unwrap((java.lang.Object) builder31);
        // The following exception was thrown during execution in test generation
        try {
            long long35 = docScoreSearchScript0.runAsLong();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strSet8);
        org.junit.Assert.assertNull(mongoClientOptions9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNull(strSet15);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNull(strSet25);
        org.junit.Assert.assertNull(mongoClientOptions26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(obj34);
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.mongoOplogFilter = basicDBObject4;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = builder0.build();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.advancedTransformation(false);
        builder0.setstatisticsTypeName("initial_timestamp");
        boolean boolean11 = builder0.dropCollection;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.statisticsTypeName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoLocalUser("exclude_fields");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean8 = mongoDBRiverDefinition7.isMongoUseSSL();
        java.lang.String str9 = mongoDBRiverDefinition7.mongoCollection;
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str4 = builder3.typeName;
        com.mongodb.BasicDBObject basicDBObject5 = null;
        builder3.mongoCollectionFilter = basicDBObject5;
        java.lang.String str7 = builder3.mongoAdminUser;
        builder3.disableIndexRefresh = false;
        java.lang.String str10 = builder3.getincludeCollection();
        com.mongodb.MongoClientOptions mongoClientOptions11 = builder3.getmongoClientOptions();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder12);
        java.util.Set<java.lang.String> strSet14 = builder12.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions15 = builder12.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject16 = null;
        builder12.setmongoOplogFilter(basicDBObject16);
        boolean boolean18 = builder12.dropCollection;
        com.mongodb.ServerAddress[] serverAddressArray19 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList20 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList20, serverAddressArray19);
        builder12.mongoServers = serverAddressList20;
        java.lang.String str23 = builder12.mongoAdminPassword;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str25 = builder24.typeName;
        com.mongodb.BasicDBObject basicDBObject26 = null;
        builder24.mongoCollectionFilter = basicDBObject26;
        java.lang.String str28 = builder24.mongoAdminUser;
        builder24.disableIndexRefresh = false;
        java.lang.String str31 = builder24.typeName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str33 = builder32.typeName;
        com.mongodb.BasicDBObject basicDBObject34 = null;
        builder32.mongoCollectionFilter = basicDBObject34;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder32.mongoUseSSL(true);
        java.lang.String[] strArray47 = new java.lang.String[] { "connect_timeout", "hi!", "port", "connect_timeout", "port", "bulk_size", "concurrent_bulk_requests", "", "options" };
        java.util.LinkedHashSet<java.lang.String> strSet48 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet48, strArray47);
        builder37.setparentTypes((java.util.Set<java.lang.String>) strSet48);
        builder24.parentTypes = strSet48;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder12.parentTypes((java.util.Set<java.lang.String>) strSet48);
        builder3.setexcludeFields((java.util.Set<java.lang.String>) strSet48);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder0.includeFields((java.util.Set<java.lang.String>) strSet48);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition55 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setdropCollection(true);
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(mongoClientOptions11);
        org.junit.Assert.assertNull(strSet14);
        org.junit.Assert.assertNull(mongoClientOptions15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(serverAddressArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder54);
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        int int2 = mongoDBRiverDefinition1.getDEFAULT_CONCURRENT_REQUESTS();
        java.lang.String str3 = mongoDBRiverDefinition1.scriptType;
        org.elasticsearch.common.unit.TimeValue timeValue4 = mongoDBRiverDefinition1.getDEFAULT_FLUSH_INTERVAL();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(timeValue4);
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        int int2 = mongoDBRiverDefinition1.getDEFAULT_CONCURRENT_REQUESTS();
        java.lang.String str3 = mongoDBRiverDefinition1.scriptType;
        boolean boolean4 = mongoDBRiverDefinition1.importAllCollections;
        java.lang.String str5 = mongoDBRiverDefinition1.getCOLLECTION_FIELD();
        java.lang.String str6 = mongoDBRiverDefinition1.getSERVERS_FIELD();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "collection" + "'", str5, "collection");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "servers" + "'", str6, "servers");
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.getCONNECTION_TIMEOUT();
        int int4 = mongoDBRiverDefinition2.getConnectTimeout();
        boolean boolean5 = mongoDBRiverDefinition2.advancedTransformation;
        java.lang.String str6 = mongoDBRiverDefinition2.getCOLLECTION_FIELD();
        boolean boolean7 = mongoDBRiverDefinition2.isMongoSSLVerifyCertificate();
        java.lang.String str8 = mongoDBRiverDefinition2.statisticsTypeName;
        java.lang.String str9 = mongoDBRiverDefinition2.getSCRIPT_TYPE_FIELD();
        boolean boolean10 = mongoDBRiverDefinition2.getadvancedTransformation();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "connect_timeout" + "'", str3, "connect_timeout");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "collection" + "'", str6, "collection");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "script_type" + "'", str9, "script_type");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.mongoOplogFilter = basicDBObject4;
        builder0.disableIndexRefresh = true;
        java.util.List<com.mongodb.ServerAddress> serverAddressList8 = builder0.mongoServers;
        boolean boolean9 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder10);
        int int12 = mongoDBRiverDefinition11.getDEFAULT_CONCURRENT_REQUESTS();
        java.lang.String str13 = mongoDBRiverDefinition11.scriptType;
        boolean boolean14 = mongoDBRiverDefinition11.importAllCollections;
        java.lang.String str15 = mongoDBRiverDefinition11.getCOLLECTION_FIELD();
        java.util.List<com.mongodb.ServerAddress> serverAddressList16 = mongoDBRiverDefinition11.mongoServers;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder0.mongoServers(serverAddressList16);
        builder0.setskipInitialImport(true);
        com.mongodb.MongoClientOptions mongoClientOptions20 = builder0.getmongoClientOptions();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(serverAddressList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "collection" + "'", str15, "collection");
        org.junit.Assert.assertNotNull(serverAddressList16);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNull(mongoClientOptions20);
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.statisticsTypeName("bulk_size");
        org.elasticsearch.common.settings.Settings settings5 = null;
        org.elasticsearch.common.settings.Settings settings6 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.util.Set<java.lang.String> strSet10 = builder8.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions11 = builder8.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject12 = null;
        builder8.setmongoOplogFilter(basicDBObject12);
        com.mongodb.BasicDBObject basicDBObject14 = builder8.getmongoCollectionFilter();
        builder7.mongoCollectionFilter = basicDBObject14;
        org.elasticsearch.river.RiverSettings riverSettings16 = new org.elasticsearch.river.RiverSettings(settings6, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject14);
        org.elasticsearch.river.RiverSettings riverSettings17 = new org.elasticsearch.river.RiverSettings(settings5, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject14);
        builder4.mongoOplogFilter = basicDBObject14;
        java.lang.String str19 = builder4.getmongoAdminUser();
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNull(strSet10);
        org.junit.Assert.assertNull(mongoClientOptions11);
        org.junit.Assert.assertNotNull(basicDBObject14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoAdminPassword("db");
        boolean boolean6 = builder0.getmongoGridFS();
        java.lang.String str7 = builder0.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.riverIndexName("index");
        builder0.setincludeCollection("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder0.skipInitialImport(false);
        com.mongodb.MongoClientOptions mongoClientOptions14 = null;
        builder13.setmongoClientOptions(mongoClientOptions14);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        int int2 = mongoDBRiverDefinition1.getDEFAULT_CONCURRENT_REQUESTS();
        java.util.List<com.mongodb.ServerAddress> serverAddressList3 = mongoDBRiverDefinition1.mongoServers;
        java.lang.String str4 = mongoDBRiverDefinition1.getMongoLocalUser();
        int int5 = mongoDBRiverDefinition1.throttleSize;
        java.lang.String str6 = mongoDBRiverDefinition1.getRiverIndexName();
        boolean boolean7 = mongoDBRiverDefinition1.mongoSSLVerifyCertificate;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertNotNull(serverAddressList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.setmongoOplogFilter(basicDBObject4);
        boolean boolean6 = builder0.dropCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.socketTimeout((int) ' ');
        java.util.Set<java.lang.String> strSet9 = builder8.excludeFields;
        builder8.setriverName("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder8.mongoAdminUser("concurrent_bulk_requests");
        com.mongodb.BasicDBObject basicDBObject14 = builder8.mongoOplogFilter;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str16 = builder15.typeName;
        com.mongodb.BasicDBObject basicDBObject17 = null;
        builder15.mongoCollectionFilter = basicDBObject17;
        java.lang.String str19 = builder15.mongoAdminUser;
        builder15.disableIndexRefresh = false;
        java.lang.String str22 = builder15.getincludeCollection();
        com.mongodb.MongoClientOptions mongoClientOptions23 = builder15.getmongoClientOptions();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder24);
        java.util.Set<java.lang.String> strSet26 = builder24.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions27 = builder24.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject28 = null;
        builder24.setmongoOplogFilter(basicDBObject28);
        boolean boolean30 = builder24.dropCollection;
        com.mongodb.ServerAddress[] serverAddressArray31 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList32 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList32, serverAddressArray31);
        builder24.mongoServers = serverAddressList32;
        java.lang.String str35 = builder24.mongoAdminPassword;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str37 = builder36.typeName;
        com.mongodb.BasicDBObject basicDBObject38 = null;
        builder36.mongoCollectionFilter = basicDBObject38;
        java.lang.String str40 = builder36.mongoAdminUser;
        builder36.disableIndexRefresh = false;
        java.lang.String str43 = builder36.typeName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str45 = builder44.typeName;
        com.mongodb.BasicDBObject basicDBObject46 = null;
        builder44.mongoCollectionFilter = basicDBObject46;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder44.mongoUseSSL(true);
        java.lang.String[] strArray59 = new java.lang.String[] { "connect_timeout", "hi!", "port", "connect_timeout", "port", "bulk_size", "concurrent_bulk_requests", "", "options" };
        java.util.LinkedHashSet<java.lang.String> strSet60 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet60, strArray59);
        builder49.setparentTypes((java.util.Set<java.lang.String>) strSet60);
        builder36.parentTypes = strSet60;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder64 = builder24.parentTypes((java.util.Set<java.lang.String>) strSet60);
        builder15.setexcludeFields((java.util.Set<java.lang.String>) strSet60);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder66 = builder8.parentTypes((java.util.Set<java.lang.String>) strSet60);
        java.lang.String str67 = builder8.mongoLocalPassword;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder69 = builder8.includeCollection("connect_timeout");
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(mongoClientOptions3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(strSet9);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNull(basicDBObject14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(mongoClientOptions23);
        org.junit.Assert.assertNull(strSet26);
        org.junit.Assert.assertNull(mongoClientOptions27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(serverAddressArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertNotNull(builder69);
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.statisticsTypeName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.List<com.mongodb.ServerAddress> serverAddressList6 = mongoDBRiverDefinition5.getMongoServers();
        int int7 = mongoDBRiverDefinition5.getDEFAULT_CONCURRENT_REQUESTS();
        boolean boolean8 = mongoDBRiverDefinition5.mongoUseSSL;
        java.lang.String str9 = mongoDBRiverDefinition5.getCONNECTION_TIMEOUT();
        java.lang.String str10 = mongoDBRiverDefinition5.getINITIAL_TIMESTAMP_FIELD();
        java.lang.String str11 = mongoDBRiverDefinition5.getSCRIPT_TYPE_FIELD();
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(serverAddressList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "connect_timeout" + "'", str9, "connect_timeout");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "initial_timestamp" + "'", str10, "initial_timestamp");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "script_type" + "'", str11, "script_type");
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.mongoAdminPassword;
        java.lang.String str4 = mongoDBRiverDefinition2.getBULK_TIMEOUT_FIELD();
        boolean boolean5 = mongoDBRiverDefinition2.isStoreStatistics();
        java.lang.String str6 = mongoDBRiverDefinition2.getSECONDARY_READ_PREFERENCE_FIELD();
        com.mongodb.BasicDBObject basicDBObject7 = mongoDBRiverDefinition2.getMongoOplogFilter();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "bulk_timeout" + "'", str4, "bulk_timeout");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "secondary_read_preference" + "'", str6, "secondary_read_preference");
        org.junit.Assert.assertNull(basicDBObject7);
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        int int2 = mongoDBRiverDefinition1.getDEFAULT_CONCURRENT_REQUESTS();
        boolean boolean3 = mongoDBRiverDefinition1.advancedTransformation;
        java.lang.String str4 = mongoDBRiverDefinition1.getINCLUDE_FIELDS_FIELD();
        boolean boolean5 = mongoDBRiverDefinition1.isAdvancedTransformation();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "include_fields" + "'", str4, "include_fields");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.statisticsTypeName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str6 = mongoDBRiverDefinition5.getINITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD();
        int int7 = mongoDBRiverDefinition5.getDEFAULT_DB_PORT();
        com.mongodb.MongoClientOptions mongoClientOptions8 = mongoDBRiverDefinition5.getMongoClientOptions();
        java.lang.String str9 = mongoDBRiverDefinition5.getMongoCollection();
        com.mongodb.BasicDBObject basicDBObject10 = mongoDBRiverDefinition5.mongoOplogFilter;
        java.util.Set<java.lang.String> strSet11 = mongoDBRiverDefinition5.excludeFields;
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "script_type" + "'", str6, "script_type");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 27017 + "'", int7 == 27017);
        org.junit.Assert.assertNull(mongoClientOptions8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(basicDBObject10);
        org.junit.Assert.assertNull(strSet11);
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.getCONNECTION_TIMEOUT();
        java.lang.String str4 = mongoDBRiverDefinition2.getCREDENTIALS_FIELD();
        java.lang.String str5 = mongoDBRiverDefinition2.getDEFAULT_DB_HOST();
        int int6 = mongoDBRiverDefinition2.socketTimeout;
        boolean boolean7 = mongoDBRiverDefinition2.getmongoSecondaryReadPreference();
        boolean boolean8 = mongoDBRiverDefinition2.isMongoSecondaryReadPreference();
        boolean boolean9 = mongoDBRiverDefinition2.skipInitialImport;
        boolean boolean10 = mongoDBRiverDefinition2.mongoUseSSL;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "connect_timeout" + "'", str3, "connect_timeout");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "credentials" + "'", str4, "credentials");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "localhost" + "'", str5, "localhost");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        java.lang.String str4 = builder0.mongoAdminUser;
        builder0.disableIndexRefresh = false;
        java.lang.String str7 = builder0.getincludeCollection();
        int int8 = builder0.connectTimeout;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.connectTimeout(1000);
        builder10.connectTimeout = 'a';
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = builder10.build();
        java.lang.String str14 = builder10.script;
        java.util.Set<java.lang.String> strSet15 = builder10.parentTypes;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(strSet15);
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("concurrent_requests", "socket_timeout", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?socket_timeout?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.mongoAdminPassword;
        java.util.Set<java.lang.String> strSet4 = mongoDBRiverDefinition2.excludeFields;
        java.lang.String str5 = mongoDBRiverDefinition2.getFILTER_FIELD();
        java.lang.String str6 = mongoDBRiverDefinition2.getMongoLocalUser();
        java.lang.String str7 = mongoDBRiverDefinition2.getTYPE_FIELD();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "filter" + "'", str5, "filter");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "type" + "'", str7, "type");
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        java.lang.String str3 = builder0.getstatisticsIndexName();
        builder0.setsocketTimeout(10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.storeStatistics(false);
        builder8.riverIndexName = "index";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder8.mongoAdminPassword("collection");
        builder8.statisticsIndexName = "hi!";
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = builder0.getmongoCollectionFilter();
        builder0.setthrottleSize(27017);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.throttleSize((int) (short) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.scriptType("size");
        builder10.mongoAdminUser = "local";
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(mongoClientOptions3);
        org.junit.Assert.assertNotNull(basicDBObject6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoUseSSL(true);
        builder0.connectTimeout = (byte) -1;
        builder0.setsocketTimeout((int) (short) 1);
        java.lang.String str10 = builder0.getstatisticsTypeName();
        builder0.setmongoAdminUser("collection");
        java.lang.String str13 = builder0.statisticsTypeName;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = mongoDBRiverDefinition1.getExcludeFields();
        java.lang.String str3 = mongoDBRiverDefinition1.statisticsIndexName;
        java.lang.String str4 = mongoDBRiverDefinition1.getCONNECTION_TIMEOUT();
        java.util.Set<java.lang.String> strSet5 = mongoDBRiverDefinition1.getIncludeFields();
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "connect_timeout" + "'", str4, "connect_timeout");
        org.junit.Assert.assertNull(strSet5);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("include_collection.include_collection");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?include_collection.include_collection?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) (-1));
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str7 = builder6.typeName;
        com.mongodb.BasicDBObject basicDBObject8 = null;
        builder6.mongoCollectionFilter = basicDBObject8;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder6.mongoAdminPassword("db");
        docScoreSearchScript0.setNextVar("bulk_size", (java.lang.Object) builder6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str14 = builder13.typeName;
        com.mongodb.BasicDBObject basicDBObject15 = null;
        builder13.mongoCollectionFilter = basicDBObject15;
        java.lang.String str17 = builder13.mongoAdminUser;
        builder13.disableIndexRefresh = false;
        java.lang.String str20 = builder13.getincludeCollection();
        com.mongodb.MongoClientOptions mongoClientOptions21 = builder13.getmongoClientOptions();
        int int22 = builder13.connectTimeout;
        boolean boolean23 = builder13.dropCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder24);
        java.util.Set<java.lang.String> strSet26 = builder24.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions27 = builder24.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject28 = null;
        builder24.setmongoOplogFilter(basicDBObject28);
        boolean boolean30 = builder24.dropCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder24.socketTimeout((int) ' ');
        java.util.Set<java.lang.String> strSet33 = builder32.excludeFields;
        builder32.setriverName("hi!");
        builder32.setmongoGridFS(true);
        builder32.setmongoCollection("admin");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder32.mongoAdminPassword("admin");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder32.statisticsIndexName("disable_index_refresh");
        com.mongodb.BasicDBObject basicDBObject44 = builder43.getmongoCollectionFilter();
        builder13.mongoOplogFilter = basicDBObject44;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj4 + "' != '" + (-1) + "'", obj4, (-1));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(mongoClientOptions21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(strSet26);
        org.junit.Assert.assertNull(mongoClientOptions27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNull(strSet33);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(basicDBObject44);
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.statisticsTypeName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder4);
        org.bson.types.Binary binary6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder4.initialTimestamp(binary6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        java.lang.String str4 = builder0.mongoAdminUser;
        java.lang.String str5 = builder0.getriverName();
        builder0.storeStatistics = true;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.mongoLocalUser("options");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder0.typeName("import_all_collections");
        boolean boolean12 = builder11.getmongoSecondaryReadPreference();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder11);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.mongoOplogFilter = basicDBObject4;
        builder0.disableIndexRefresh = true;
        java.util.List<com.mongodb.ServerAddress> serverAddressList8 = builder0.mongoServers;
        java.lang.String[] strArray12 = new java.lang.String[] { "connect_timeout", "credentials", "connect_timeout" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        builder0.setparentTypes((java.util.Set<java.lang.String>) strSet13);
        builder0.setmongoAdminUser("socket_timeout");
        builder0.setindexName("filter");
        java.lang.String str20 = builder0.getscript();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(serverAddressList8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        docScoreSearchScript0.setNextScore(100.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder6);
        java.util.Set<java.lang.String> strSet8 = builder6.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions9 = builder6.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject10 = null;
        builder6.setmongoOplogFilter(basicDBObject10);
        boolean boolean12 = builder6.dropCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder6.socketTimeout((int) ' ');
        java.util.Set<java.lang.String> strSet15 = builder14.excludeFields;
        builder14.setriverName("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder14.mongoAdminUser("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder14.mongoDb("size");
        docScoreSearchScript0.setNextVar("advanced_transformation", (java.lang.Object) builder14);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder23);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder23);
        java.lang.String str26 = mongoDBRiverDefinition25.mongoAdminPassword;
        int int27 = mongoDBRiverDefinition25.connectTimeout;
        java.lang.String str28 = mongoDBRiverDefinition25.getScriptType();
        java.lang.Object obj29 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition25);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory30 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.common.settings.Settings settings31 = null;
        org.elasticsearch.common.settings.Settings settings32 = null;
        org.elasticsearch.common.settings.Settings settings33 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition35 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder34);
        java.util.Set<java.lang.String> strSet36 = builder34.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions37 = builder34.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject38 = null;
        builder34.setmongoOplogFilter(basicDBObject38);
        com.mongodb.BasicDBObject basicDBObject40 = builder34.getmongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings41 = new org.elasticsearch.river.RiverSettings(settings33, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject40);
        org.elasticsearch.river.RiverSettings riverSettings42 = new org.elasticsearch.river.RiverSettings(settings32, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject40);
        org.elasticsearch.river.RiverSettings riverSettings43 = new org.elasticsearch.river.RiverSettings(settings31, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject40);
        org.elasticsearch.script.ExecutableScript executableScript44 = docScoreNativeScriptFactory30.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject40);
        java.util.Map<java.lang.String, java.lang.Object> strMap45 = null;
        org.elasticsearch.script.ExecutableScript executableScript46 = docScoreNativeScriptFactory30.newScript(strMap45);
        java.lang.Object obj47 = docScoreSearchScript0.unwrap((java.lang.Object) docScoreNativeScriptFactory30);
        // The following exception was thrown during execution in test generation
        try {
            float float48 = docScoreSearchScript0.runAsFloat();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strSet8);
        org.junit.Assert.assertNull(mongoClientOptions9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNull(strSet15);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertNull(strSet36);
        org.junit.Assert.assertNull(mongoClientOptions37);
        org.junit.Assert.assertNotNull(basicDBObject40);
        org.junit.Assert.assertNotNull(executableScript44);
        org.junit.Assert.assertNotNull(executableScript46);
        org.junit.Assert.assertNotNull(obj47);
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.getCONNECTION_TIMEOUT();
        int int4 = mongoDBRiverDefinition2.getConnectTimeout();
        java.lang.String str5 = mongoDBRiverDefinition2.getSTORE_STATISTICS_FIELD();
        com.mongodb.BasicDBObject basicDBObject6 = mongoDBRiverDefinition2.mongoCollectionFilter;
        java.lang.String str7 = mongoDBRiverDefinition2.getCONNECTION_TIMEOUT();
        boolean boolean8 = mongoDBRiverDefinition2.isSkipInitialImport();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "connect_timeout" + "'", str3, "connect_timeout");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "store_statistics" + "'", str5, "store_statistics");
        org.junit.Assert.assertNotNull(basicDBObject6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "connect_timeout" + "'", str7, "connect_timeout");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoAdminPassword("db");
        java.util.Set<java.lang.String> strSet6 = builder5.getincludeFields();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder5.scriptType("");
        java.lang.String str9 = builder8.getmongoAdminUser();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str1 = builder0.typeName;
        com.mongodb.BasicDBObject basicDBObject2 = null;
        builder0.mongoCollectionFilter = basicDBObject2;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoAdminPassword("db");
        java.util.Set<java.lang.String> strSet6 = builder5.getincludeFields();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder5.storeStatistics(false);
        boolean boolean9 = builder8.getdropCollection();
        builder8.setmongoUseSSL(true);
        boolean boolean12 = builder8.mongoUseSSL;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        com.mongodb.MongoClientOptions mongoClientOptions3 = builder0.getmongoClientOptions();
        com.mongodb.BasicDBObject basicDBObject4 = null;
        builder0.setmongoOplogFilter(basicDBObject4);
        com.mongodb.BasicDBObject basicDBObject6 = builder0.getmongoCollectionFilter();
        java.util.Set<java.lang.String> strSet7 = builder0.getexcludeFields();
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(mongoClientOptions3);
        org.junit.Assert.assertNotNull(basicDBObject6);
        org.junit.Assert.assertNull(strSet7);
    }
}

