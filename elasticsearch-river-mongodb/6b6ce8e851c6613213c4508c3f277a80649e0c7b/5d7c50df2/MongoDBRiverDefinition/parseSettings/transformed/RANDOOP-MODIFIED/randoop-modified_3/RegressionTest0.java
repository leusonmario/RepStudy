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
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.INCLUDE_COLLECTION_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "include_collection" + "'", str0, "include_collection");
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.SKIP_INITIAL_IMPORT_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "skip_initial_import" + "'", str0, "skip_initial_import");
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        int int0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DEFAULT_BULK_ACTIONS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1000 + "'", int0 == 1000);
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.PASSWORD_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "password" + "'", str0, "password");
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        org.elasticsearch.common.ParseField parseField0 = org.elasticsearch.script.ScriptService.SCRIPT_LANG;
        org.junit.Assert.assertNotNull(parseField0);
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.bson.types.Binary binary3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.initialTimestamp(binary3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("gridfs", "include_collection", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?include_collection?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        org.elasticsearch.common.ParseField parseField0 = org.elasticsearch.script.ScriptService.KEY_SCRIPT_FILE;
        org.junit.Assert.assertNotNull(parseField0);
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        java.lang.String str0 = org.elasticsearch.script.ScriptService.DEFAULT_SCRIPTING_LANGUAGE_SETTING;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "script.default_lang" + "'", str0, "script.default_lang");
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.SOCKET_TIMEOUT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "socket_timeout" + "'", str0, "socket_timeout");
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.PORT_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "port" + "'", str0, "port");
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        org.elasticsearch.common.ParseField parseField0 = org.elasticsearch.script.ScriptService.SCRIPT_INLINE;
        org.junit.Assert.assertNotNull(parseField0);
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        int int0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DEFAULT_CONNECT_TIMEOUT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 30000 + "'", int0 == 30000);
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        org.elasticsearch.common.ParseField parseField0 = org.elasticsearch.script.ScriptService.VALUE_SCRIPT_FILE;
        org.junit.Assert.assertNotNull(parseField0);
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.SCRIPT_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "script" + "'", str0, "script");
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.INCLUDE_FIELDS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "include_fields" + "'", str0, "include_fields");
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.BULK_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "bulk" + "'", str0, "bulk");
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.THROTTLE_SIZE_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "throttle_size" + "'", str0, "throttle_size");
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.EXCLUDE_FIELDS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "exclude_fields" + "'", str0, "exclude_fields");
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("include_fields", "bulk_size");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?bulk_size?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
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
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        org.elasticsearch.common.settings.Settings settings0 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = null;
        org.elasticsearch.river.RiverSettings riverSettings2 = new org.elasticsearch.river.RiverSettings(settings0, strMap1);
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = riverSettings2.settings();
        org.junit.Assert.assertNull(strMap3);
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
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
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        org.elasticsearch.common.ParseField parseField0 = org.elasticsearch.script.ScriptService.VALUE_SCRIPT_ID;
        org.junit.Assert.assertNotNull(parseField0);
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.getSSL_CONNECTION_FIELD();
        int int3 = mongoDBRiverDefinition1.getDEFAULT_CONNECT_TIMEOUT();
        java.util.Set<java.lang.String> strSet4 = mongoDBRiverDefinition1.getIncludeFields();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ssl" + "'", str2, "ssl");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 30000 + "'", int3 == 30000);
        org.junit.Assert.assertNull(strSet4);
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DEFAULT_DB_HOST;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "localhost" + "'", str0, "localhost");
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.CONCURRENT_BULK_REQUESTS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "concurrent_bulk_requests" + "'", str0, "concurrent_bulk_requests");
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 1000);
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
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
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
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.FLUSH_INTERVAL_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "flush_interval" + "'", str0, "flush_interval");
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        int int0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DEFAULT_DB_PORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 27017 + "'", int0 == 27017);
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.COLLECTION_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "collection" + "'", str0, "collection");
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getimportAllCollections();
        java.lang.String str2 = builder0.getmongoAdminUser();
        java.lang.String str3 = builder0.typeName;
        boolean boolean4 = builder0.getstoreStatistics();
        java.lang.Class<?> wildcardClass5 = builder0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.INDEX_OBJECT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index" + "'", str0, "index");
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.SIZE_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "size" + "'", str0, "size");
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.USER_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "user" + "'", str0, "user");
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.ADVANCED_TRANSFORMATION_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "advanced_transformation" + "'", str0, "advanced_transformation");
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        javax.net.SocketFactory socketFactory0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.getSSLSocketFactory();
        org.junit.Assert.assertNotNull(socketFactory0);
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.SCRIPT_TYPE_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "script_type" + "'", str0, "script_type");
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        org.elasticsearch.common.ParseField parseField0 = org.elasticsearch.script.ScriptService.VALUE_SCRIPT_INLINE;
        org.junit.Assert.assertNotNull(parseField0);
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.getSSL_CONNECTION_FIELD();
        boolean boolean3 = mongoDBRiverDefinition1.isStoreStatistics();
        boolean boolean4 = mongoDBRiverDefinition1.mongoGridFS;
        java.lang.String str5 = mongoDBRiverDefinition1.getFILTER_FIELD();
        java.lang.String str6 = mongoDBRiverDefinition1.getLOCAL_DB_FIELD();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ssl" + "'", str2, "ssl");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "filter" + "'", str5, "filter");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "local" + "'", str6, "local");
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DISABLE_INDEX_REFRESH_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "disable_index_refresh" + "'", str0, "disable_index_refresh");
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        org.elasticsearch.common.unit.TimeValue timeValue0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DEFAULT_FLUSH_INTERVAL;
        org.junit.Assert.assertNotNull(timeValue0);
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("hi!", "ssl");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?ssl?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.CREDENTIALS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "credentials" + "'", str0, "credentials");
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.TYPE_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "type" + "'", str0, "type");
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 1000);
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
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.GRIDFS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "gridfs" + "'", str0, "gridfs");
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        java.lang.String str0 = org.elasticsearch.script.ScriptService.DISABLE_DYNAMIC_SCRIPTING_SETTING;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "script.disable_dynamic" + "'", str0, "script.disable_dynamic");
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.LOCAL_DB_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "local" + "'", str0, "local");
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("concurrent_requests", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.INITIAL_TIMESTAMP_SCRIPT_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "script" + "'", str0, "script");
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
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
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("actions", "script");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?script?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.ADMIN_DB_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "admin" + "'", str0, "admin");
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.IMPORT_ALL_COLLECTIONS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "import_all_collections" + "'", str0, "import_all_collections");
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DB_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "db" + "'", str0, "db");
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.FILTER_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "filter" + "'", str0, "filter");
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DEFAULT_BULK_SIZE;
        org.junit.Assert.assertNotNull(byteSizeValue0);
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
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
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        builder0.parentTypes = strSet14;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder0.throttleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder18.indexName("initial_timestamp");
        builder22.setmongoAdminPassword("include_fields");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.getSERVERS_FIELD();
        java.lang.Class<?> wildcardClass3 = mongoDBRiverDefinition1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "servers" + "'", str2, "servers");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.SERVERS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "servers" + "'", str0, "servers");
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        java.lang.String str0 = org.elasticsearch.script.ScriptService.DISABLE_DYNAMIC_SCRIPTING_DEFAULT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "sandbox" + "'", str0, "sandbox");
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.mongoLocalPassword;
        java.lang.String str4 = mongoDBRiverDefinition2.getINITIAL_TIMESTAMP_SCRIPT_FIELD();
        boolean boolean5 = mongoDBRiverDefinition2.getmongoSSLVerifyCertificate();
        java.lang.String str6 = mongoDBRiverDefinition2.getIS_MONGOS_FIELD();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "script" + "'", str4, "script");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "is_mongos" + "'", str6, "is_mongos");
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        org.elasticsearch.common.ParseField parseField0 = org.elasticsearch.script.ScriptService.SCRIPT_ID;
        org.junit.Assert.assertNotNull(parseField0);
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.SSL_CONNECTION_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ssl" + "'", str0, "ssl");
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("socket_timeout", "index");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?index?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.ACTIONS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "actions" + "'", str0, "actions");
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.CONNECT_TIMEOUT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "connect_timeout" + "'", str0, "connect_timeout");
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        int int0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DEFAULT_CONCURRENT_REQUESTS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.OPTIONS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "options" + "'", str0, "options");
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
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
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.INITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "script_type" + "'", str0, "script_type");
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoDb("hi!");
        builder5.isMongos = true;
        java.lang.String str8 = builder5.typeName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder5.mongoSSLVerifyCertificate(false);
        java.lang.String str11 = builder10.gettypeName();
        builder10.disableIndexRefresh = true;
        builder10.advancedTransformation = false;
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoDb("hi!");
        builder5.indexName = "skip_initial_import";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder5.mongoDb("password");
        builder5.throttleSize = (byte) 1;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder5.mongoLocalPassword("servers");
        org.bson.types.BSONTimestamp bSONTimestamp14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder5.initialTimestamp(bSONTimestamp14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ts must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("name", "is_mongos");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?is_mongos?^");
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
        builder0.setskipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoDb("hi!");
        builder0.settypeName("socket_timeout");
        java.lang.Class<?> wildcardClass8 = builder0.getClass();
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.IS_MONGOS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "is_mongos" + "'", str0, "is_mongos");
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoDb("hi!");
        boolean boolean6 = builder0.mongoSecondaryReadPreference;
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        int int0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DEFAULT_SOCKET_TIMEOUT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 60000 + "'", int0 == 60000);
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.SECONDARY_READ_PREFERENCE_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "secondary_read_preference" + "'", str0, "secondary_read_preference");
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("flush_interval", "admin");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?admin?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript2 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript2.setNextScore((float) 1000);
        docScoreSearchScript2.setNextScore((float) 1000);
        docScoreSearchScript0.setNextVar("include_fields", (java.lang.Object) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        builder9.parentTypes = strSet23;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder9.throttleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.typeName("disable_index_refresh");
        docScoreSearchScript0.setNextVar("parent_types", (java.lang.Object) builder29);
        org.apache.lucene.index.AtomicReaderContext atomicReaderContext31 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextReader(atomicReaderContext31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        builder0.parentTypes = strSet14;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder0.script("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.indexName("password");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder18);
        boolean boolean22 = builder18.mongoSecondaryReadPreference;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder18.mongoLocalUser("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder18.mongoGridFS(true);
        builder26.setmongoLocalUser("concurrent_requests");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        org.elasticsearch.common.ParseField parseField0 = org.elasticsearch.script.ScriptService.SCRIPT_FILE;
        org.junit.Assert.assertNotNull(parseField0);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.scriptType;
        java.lang.String str3 = mongoDBRiverDefinition1.getSSL_CONNECTION_FIELD();
        boolean boolean4 = mongoDBRiverDefinition1.isImportAllCollections();
        boolean boolean5 = mongoDBRiverDefinition1.isMongoSSLVerifyCertificate();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ssl" + "'", str3, "ssl");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet15 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet15, strArray14);
        builder1.parentTypes = strSet15;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder1.script("port");
        builder19.setriverName("disable_index_refresh");
        org.elasticsearch.common.settings.Settings settings22 = null;
        org.elasticsearch.common.settings.Settings settings23 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder24);
        builder24.setskipInitialImport(true);
        builder24.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder24.skipInitialImport(false);
        com.mongodb.BasicDBObject basicDBObject32 = builder24.getmongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings33 = new org.elasticsearch.river.RiverSettings(settings23, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject32);
        org.elasticsearch.river.RiverSettings riverSettings34 = new org.elasticsearch.river.RiverSettings(settings22, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject32);
        builder19.setmongoCollectionFilter(basicDBObject32);
        org.elasticsearch.river.RiverSettings riverSettings36 = new org.elasticsearch.river.RiverSettings(settings0, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject32);
        java.util.Map<java.lang.String, java.lang.Object> strMap37 = riverSettings36.settings();
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(basicDBObject32);
        org.junit.Assert.assertNotNull(strMap37);
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.getSSL_CONNECTION_FIELD();
        int int3 = mongoDBRiverDefinition1.getDEFAULT_CONNECT_TIMEOUT();
        boolean boolean4 = mongoDBRiverDefinition1.dropCollection;
        java.lang.String str5 = mongoDBRiverDefinition1.getDEFAULT_DB_HOST();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ssl" + "'", str2, "ssl");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 30000 + "'", int3 == 30000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "localhost" + "'", str5, "localhost");
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        builder0.parentTypes = strSet14;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder0.throttleSize((int) (byte) 0);
        int int19 = builder0.getconnectTimeout();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder20);
        builder20.setskipInitialImport(true);
        builder20.scriptType = "admin";
        java.lang.String[] strArray28 = new java.lang.String[] { "", "password" };
        java.util.LinkedHashSet<java.lang.String> strSet29 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet29, strArray28);
        builder20.setincludeFields((java.util.Set<java.lang.String>) strSet29);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder0.excludeFields((java.util.Set<java.lang.String>) strSet29);
        builder0.mongoLocalUser = "";
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(builder32);
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getimportAllCollections();
        java.lang.String str2 = builder0.getmongoAdminUser();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.skipInitialImport(false);
        java.lang.String str7 = builder6.getscript();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.BULK_TIMEOUT_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "bulk_timeout" + "'", str0, "bulk_timeout");
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
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
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder2.setriverIndexName("admin");
        builder2.storeStatistics = false;
        docScoreSearchScript0.setNextVar("import_all_collections", (java.lang.Object) false);
        org.apache.lucene.search.Scorer scorer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setScorer(scorer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.BULK_SIZE_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "bulk_size" + "'", str0, "bulk_size");
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoDb("hi!");
        builder5.isMongos = true;
        java.lang.String str8 = builder5.typeName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder5.mongoSSLVerifyCertificate(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet25 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet25, strArray24);
        builder11.parentTypes = strSet25;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder11.script("port");
        builder29.setriverName("disable_index_refresh");
        org.elasticsearch.common.settings.Settings settings32 = null;
        org.elasticsearch.common.settings.Settings settings33 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition35 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder34);
        builder34.setskipInitialImport(true);
        builder34.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder34.skipInitialImport(false);
        com.mongodb.BasicDBObject basicDBObject42 = builder34.getmongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings43 = new org.elasticsearch.river.RiverSettings(settings33, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject42);
        org.elasticsearch.river.RiverSettings riverSettings44 = new org.elasticsearch.river.RiverSettings(settings32, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject42);
        builder29.setmongoCollectionFilter(basicDBObject42);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder5.mongoCollectionFilter(basicDBObject42);
        int int47 = builder5.getsocketTimeout();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition48 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str49 = mongoDBRiverDefinition48.mongoCollection;
        boolean boolean50 = mongoDBRiverDefinition48.mongoSSLVerifyCertificate;
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(basicDBObject42);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.getFLUSH_INTERVAL_FIELD();
        boolean boolean4 = mongoDBRiverDefinition2.getmongoUseSSL();
        boolean boolean5 = mongoDBRiverDefinition2.getimportAllCollections();
        boolean boolean6 = mongoDBRiverDefinition2.isImportAllCollections();
        java.lang.String str7 = mongoDBRiverDefinition2.getEXCLUDE_FIELDS_FIELD();
        java.lang.String str8 = mongoDBRiverDefinition2.getSECONDARY_READ_PREFERENCE_FIELD();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "flush_interval" + "'", str3, "flush_interval");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "exclude_fields" + "'", str7, "exclude_fields");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "secondary_read_preference" + "'", str8, "secondary_read_preference");
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("admin", "password");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?password?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.SSL_VERIFY_CERT_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ssl_verify_certificate" + "'", str0, "ssl_verify_certificate");
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.INITIAL_TIMESTAMP_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "initial_timestamp" + "'", str0, "initial_timestamp");
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("connect_timeout", "local");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?local?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 1000);
        docScoreSearchScript0.setNextScore((float) (byte) 10);
        org.elasticsearch.common.settings.Settings settings5 = null;
        org.elasticsearch.common.settings.Settings settings6 = null;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory7 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.common.settings.Settings settings8 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder9);
        builder9.setskipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder9.mongoDb("hi!");
        builder14.isMongos = true;
        java.lang.String str17 = builder14.typeName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder14.mongoSSLVerifyCertificate(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray33 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        builder20.parentTypes = strSet34;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder20.script("port");
        builder38.setriverName("disable_index_refresh");
        org.elasticsearch.common.settings.Settings settings41 = null;
        org.elasticsearch.common.settings.Settings settings42 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition44 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder43);
        builder43.setskipInitialImport(true);
        builder43.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder43.skipInitialImport(false);
        com.mongodb.BasicDBObject basicDBObject51 = builder43.getmongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings52 = new org.elasticsearch.river.RiverSettings(settings42, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject51);
        org.elasticsearch.river.RiverSettings riverSettings53 = new org.elasticsearch.river.RiverSettings(settings41, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject51);
        builder38.setmongoCollectionFilter(basicDBObject51);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder14.mongoCollectionFilter(basicDBObject51);
        org.elasticsearch.river.RiverSettings riverSettings56 = new org.elasticsearch.river.RiverSettings(settings8, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject51);
        org.elasticsearch.script.ExecutableScript executableScript57 = docScoreNativeScriptFactory7.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject51);
        org.elasticsearch.river.RiverSettings riverSettings58 = new org.elasticsearch.river.RiverSettings(settings6, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject51);
        org.elasticsearch.river.RiverSettings riverSettings59 = new org.elasticsearch.river.RiverSettings(settings5, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject51);
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject51);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(basicDBObject51);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(executableScript57);
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.getSERVERS_FIELD();
        java.lang.String str3 = mongoDBRiverDefinition1.getGRIDFS_FIELD();
        java.lang.String str4 = mongoDBRiverDefinition1.getACTIONS_FIELD();
        java.lang.String str5 = mongoDBRiverDefinition1.getSCRIPT_TYPE_FIELD();
        java.lang.String str6 = mongoDBRiverDefinition1.getLOCAL_DB_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition1.getNAME_FIELD();
        java.lang.String str8 = mongoDBRiverDefinition1.getOPTIONS_FIELD();
        boolean boolean9 = mongoDBRiverDefinition1.isStoreStatistics();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "servers" + "'", str2, "servers");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "gridfs" + "'", str3, "gridfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "actions" + "'", str4, "actions");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "script_type" + "'", str5, "script_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "local" + "'", str6, "local");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "name" + "'", str7, "name");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "options" + "'", str8, "options");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.scriptType;
        java.lang.String str3 = mongoDBRiverDefinition1.getSSL_CONNECTION_FIELD();
        boolean boolean4 = mongoDBRiverDefinition1.isImportAllCollections();
        boolean boolean5 = mongoDBRiverDefinition1.isMongoGridFS();
        java.lang.String str6 = mongoDBRiverDefinition1.getINITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD();
        java.util.Set<java.lang.String> strSet7 = mongoDBRiverDefinition1.includeFields;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ssl" + "'", str3, "ssl");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "script_type" + "'", str6, "script_type");
        org.junit.Assert.assertNull(strSet7);
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        org.elasticsearch.common.ParseField parseField0 = org.elasticsearch.script.ScriptService.KEY_SCRIPT_INLINE;
        org.junit.Assert.assertNotNull(parseField0);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.CONCURRENT_REQUESTS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "concurrent_requests" + "'", str0, "concurrent_requests");
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DROP_COLLECTION_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "drop_collection" + "'", str0, "drop_collection");
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("name", "hi!", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?hi!?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        org.elasticsearch.common.ParseField parseField0 = org.elasticsearch.script.ScriptService.KEY_SCRIPT_ID;
        org.junit.Assert.assertNotNull(parseField0);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getimportAllCollections();
        java.lang.String str2 = builder0.getmongoAdminUser();
        java.lang.String str3 = builder0.typeName;
        boolean boolean4 = builder0.getstoreStatistics();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str6 = mongoDBRiverDefinition5.mongoLocalPassword;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        builder0.parentTypes = strSet14;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder0.throttleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.indexName("index");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean24 = builder23.getimportAllCollections();
        java.lang.String str25 = builder23.getmongoAdminUser();
        java.util.List<com.mongodb.ServerAddress> serverAddressList26 = builder23.getmongoServers();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder22.mongoServers(serverAddressList26);
        java.lang.Class<?> wildcardClass28 = serverAddressList26.getClass();
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(serverAddressList26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.getSSL_CONNECTION_FIELD();
        int int3 = mongoDBRiverDefinition1.getDEFAULT_CONNECT_TIMEOUT();
        boolean boolean4 = mongoDBRiverDefinition1.dropCollection;
        java.lang.String str5 = mongoDBRiverDefinition1.getMongoAdminPassword();
        boolean boolean6 = mongoDBRiverDefinition1.isMongoSSLVerifyCertificate();
        java.lang.String str7 = mongoDBRiverDefinition1.mongoCollection;
        java.lang.String str8 = mongoDBRiverDefinition1.indexName;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ssl" + "'", str2, "ssl");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 30000 + "'", int3 == 30000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        int int2 = builder0.getsocketTimeout();
        java.lang.String str3 = builder0.getincludeCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        builder4.parentTypes = strSet18;
        builder0.excludeFields = strSet18;
        java.lang.String str22 = builder0.getscript();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.getSSL_CONNECTION_FIELD();
        int int3 = mongoDBRiverDefinition1.getDEFAULT_CONNECT_TIMEOUT();
        boolean boolean4 = mongoDBRiverDefinition1.dropCollection;
        java.lang.String str5 = mongoDBRiverDefinition1.getPARENT_TYPES_FIELD();
        com.mongodb.BasicDBObject basicDBObject6 = mongoDBRiverDefinition1.mongoOplogFilter;
        boolean boolean7 = mongoDBRiverDefinition1.getstoreStatistics();
        java.util.Set<java.lang.String> strSet8 = mongoDBRiverDefinition1.getParentTypes();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ssl" + "'", str2, "ssl");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 30000 + "'", int3 == 30000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "parent_types" + "'", str5, "parent_types");
        org.junit.Assert.assertNull(basicDBObject6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(strSet8);
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        java.lang.String str0 = org.elasticsearch.script.ScriptService.SCRIPT_INDEX;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + ".scripts" + "'", str0, ".scripts");
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.STORE_STATISTICS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "store_statistics" + "'", str0, "store_statistics");
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getimportAllCollections();
        java.lang.String str2 = builder0.getmongoAdminUser();
        java.util.List<com.mongodb.ServerAddress> serverAddressList3 = builder0.getmongoServers();
        boolean boolean4 = builder0.mongoSecondaryReadPreference;
        builder0.mongoLocalPassword = "hi!";
        builder0.mongoSecondaryReadPreference = true;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(serverAddressList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("script_type", "filter", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?filter? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.HOST_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "host" + "'", str0, "host");
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoDb("hi!");
        builder5.isMongos = true;
        java.lang.String str8 = builder5.typeName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder5.mongoSSLVerifyCertificate(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder5.statisticsIndexName("store_statistics");
        builder12.setmongoCollection("");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("concurrent_requests", "drop_collection");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?drop_collection?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue2 = mongoDBRiverDefinition1.getDEFAULT_BULK_SIZE();
        java.lang.String str3 = mongoDBRiverDefinition1.getINITIAL_TIMESTAMP_FIELD();
        java.lang.String str4 = mongoDBRiverDefinition1.getDROP_COLLECTION_FIELD();
        org.junit.Assert.assertNotNull(byteSizeValue2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "initial_timestamp" + "'", str3, "initial_timestamp");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "drop_collection" + "'", str4, "drop_collection");
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.PARENT_TYPES_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "parent_types" + "'", str0, "parent_types");
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 1000);
        docScoreSearchScript0.setNextScore((float) 1000);
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
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder2.setriverIndexName("admin");
        builder2.storeStatistics = false;
        docScoreSearchScript0.setNextVar("import_all_collections", (java.lang.Object) false);
        org.elasticsearch.common.settings.Settings settings8 = null;
        org.elasticsearch.common.settings.Settings settings9 = null;
        org.elasticsearch.common.settings.Settings settings10 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet25 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet25, strArray24);
        builder11.parentTypes = strSet25;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder11.script("port");
        builder29.setriverName("disable_index_refresh");
        org.elasticsearch.common.settings.Settings settings32 = null;
        org.elasticsearch.common.settings.Settings settings33 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition35 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder34);
        builder34.setskipInitialImport(true);
        builder34.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder34.skipInitialImport(false);
        com.mongodb.BasicDBObject basicDBObject42 = builder34.getmongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings43 = new org.elasticsearch.river.RiverSettings(settings33, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject42);
        org.elasticsearch.river.RiverSettings riverSettings44 = new org.elasticsearch.river.RiverSettings(settings32, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject42);
        builder29.setmongoCollectionFilter(basicDBObject42);
        org.elasticsearch.river.RiverSettings riverSettings46 = new org.elasticsearch.river.RiverSettings(settings10, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject42);
        org.elasticsearch.river.RiverSettings riverSettings47 = new org.elasticsearch.river.RiverSettings(settings9, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject42);
        org.elasticsearch.river.RiverSettings riverSettings48 = new org.elasticsearch.river.RiverSettings(settings8, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject42);
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(basicDBObject42);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        builder0.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.skipInitialImport(false);
        java.lang.String str8 = builder7.getstatisticsTypeName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder7.importAllCollections(true);
        boolean boolean11 = builder10.disableIndexRefresh;
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = builder10.initialTimestamp;
        builder10.mongoDb = "user";
        builder10.setindexName("secondary_read_preference");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder17);
        builder17.setskipInitialImport(true);
        builder17.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder17.skipInitialImport(false);
        java.lang.String str25 = builder24.getstatisticsTypeName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder24.importAllCollections(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder24.mongoSSLVerifyCertificate(false);
        java.util.Set<java.lang.String> strSet30 = builder29.getparentTypes();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray44 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet45 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet45, strArray44);
        builder31.parentTypes = strSet45;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder31.script("port");
        builder49.setindexName("flush_interval");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition53 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder52);
        java.lang.String str54 = builder52.getindexName();
        boolean boolean55 = builder52.getmongoSSLVerifyCertificate();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder52.socketTimeout(10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray71 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet72 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet72, strArray71);
        builder58.parentTypes = strSet72;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder76 = builder58.script("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder77 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray90 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet91 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet91, strArray90);
        builder77.parentTypes = strSet91;
        builder76.setexcludeFields((java.util.Set<java.lang.String>) strSet91);
        builder57.includeFields = strSet91;
        builder49.excludeFields = strSet91;
        builder29.setexcludeFields((java.util.Set<java.lang.String>) strSet91);
        builder10.includeFields = strSet91;
        boolean boolean99 = builder10.importAllCollections;
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(wildcardTimestamp12);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNull(strSet30);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(builder76);
        org.junit.Assert.assertNotNull(strArray90);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + true + "'", boolean99 == true);
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
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
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        builder0.parentTypes = strSet14;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder0.script("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.indexName("password");
        builder20.setimportAllCollections(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition23 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder20);
        java.util.Set<java.lang.String> strSet24 = builder20.getincludeFields();
        builder20.setdisableIndexRefresh(true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNull(strSet24);
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.getSSL_CONNECTION_FIELD();
        boolean boolean3 = mongoDBRiverDefinition1.isStoreStatistics();
        boolean boolean4 = mongoDBRiverDefinition1.mongoGridFS;
        java.lang.String str5 = mongoDBRiverDefinition1.getFILTER_FIELD();
        boolean boolean6 = mongoDBRiverDefinition1.mongoSSLVerifyCertificate;
        java.lang.String str7 = mongoDBRiverDefinition1.indexName;
        java.lang.String str8 = mongoDBRiverDefinition1.getADVANCED_TRANSFORMATION_FIELD();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ssl" + "'", str2, "ssl");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "filter" + "'", str5, "filter");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "advanced_transformation" + "'", str8, "advanced_transformation");
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.mongoLocalPassword;
        java.lang.String str4 = mongoDBRiverDefinition2.getINITIAL_TIMESTAMP_SCRIPT_FIELD();
        java.lang.String str5 = mongoDBRiverDefinition2.getIncludeCollection();
        java.lang.String str6 = mongoDBRiverDefinition2.getADVANCED_TRANSFORMATION_FIELD();
        java.util.Set<java.lang.String> strSet7 = mongoDBRiverDefinition2.parentTypes;
        int int8 = mongoDBRiverDefinition2.getDEFAULT_SOCKET_TIMEOUT();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "script" + "'", str4, "script");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "advanced_transformation" + "'", str6, "advanced_transformation");
        org.junit.Assert.assertNull(strSet7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60000 + "'", int8 == 60000);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        builder0.parentTypes = strSet14;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder0.throttleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder0.mongoLocalPassword("script");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition22 = builder21.build();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp23 = mongoDBRiverDefinition22.getInitialTimestamp();
        java.lang.String str24 = mongoDBRiverDefinition22.getCREDENTIALS_FIELD();
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition22);
        org.junit.Assert.assertNull(wildcardTimestamp23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "credentials" + "'", str24, "credentials");
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        builder0.scriptType = "admin";
        builder0.setstoreStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.isMongos((java.lang.Boolean) false);
        java.lang.String str10 = builder9.getstatisticsTypeName();
        builder9.scriptType = "admin";
        int int13 = builder9.connectTimeout;
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        builder0.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.skipInitialImport(false);
        java.lang.String str8 = builder7.getstatisticsTypeName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder7.importAllCollections(true);
        boolean boolean11 = builder10.disableIndexRefresh;
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = builder10.initialTimestamp;
        builder10.mongoLocalUser = "bulk_size";
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(wildcardTimestamp12);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.getEXCLUDE_FIELDS_FIELD();
        java.lang.String str3 = mongoDBRiverDefinition1.getDB_FIELD();
        java.lang.String str4 = mongoDBRiverDefinition1.getRiverName();
        int int5 = mongoDBRiverDefinition1.socketTimeout;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "exclude_fields" + "'", str2, "exclude_fields");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "db" + "'", str3, "db");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        builder0.parentTypes = strSet14;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder0.script("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.indexName("password");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder18);
        boolean boolean22 = builder18.mongoSecondaryReadPreference;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder18.mongoLocalUser("");
        builder18.mongoLocalUser = "local";
        com.mongodb.MongoClientOptions mongoClientOptions27 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder18.mongoClientOptions(mongoClientOptions27);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder18.isMongos((java.lang.Boolean) false);
        java.lang.String str31 = builder18.getriverName();
        java.util.Set<java.lang.String> strSet32 = builder18.getexcludeFields();
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(strSet32);
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getimportAllCollections();
        java.lang.String str2 = builder0.getmongoAdminUser();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.skipInitialImport(false);
        builder0.scriptType = "";
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("ssl");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?ssl?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        builder0.parentTypes = strSet14;
        boolean boolean17 = builder0.getdropCollection();
        org.bson.types.Binary binary18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder0.initialTimestamp(binary18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.getSERVERS_FIELD();
        java.lang.String str3 = mongoDBRiverDefinition1.getGRIDFS_FIELD();
        java.lang.String str4 = mongoDBRiverDefinition1.getACTIONS_FIELD();
        boolean boolean5 = mongoDBRiverDefinition1.getmongoSSLVerifyCertificate();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "servers" + "'", str2, "servers");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "gridfs" + "'", str3, "gridfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "actions" + "'", str4, "actions");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoDb("hi!");
        builder5.isMongos = true;
        java.lang.String str8 = builder5.typeName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder5.mongoSSLVerifyCertificate(false);
        java.lang.String str11 = builder10.gettypeName();
        builder10.setmongoAdminUser("throttle_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder10.throttleSize(100);
        java.lang.String str16 = builder10.getstatisticsTypeName();
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        builder0.parentTypes = strSet14;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder0.throttleSize((int) (byte) 0);
        org.elasticsearch.common.settings.Settings settings19 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder20);
        builder20.setskipInitialImport(true);
        builder20.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder20.skipInitialImport(false);
        com.mongodb.BasicDBObject basicDBObject28 = builder20.getmongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings29 = new org.elasticsearch.river.RiverSettings(settings19, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject28);
        builder18.setmongoOplogFilter(basicDBObject28);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition31 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder18);
        org.bson.types.Binary binary32 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder18.initialTimestamp(binary32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(basicDBObject28);
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.scriptType;
        java.lang.String str3 = mongoDBRiverDefinition1.getSSL_CONNECTION_FIELD();
        boolean boolean4 = mongoDBRiverDefinition1.isImportAllCollections();
        boolean boolean5 = mongoDBRiverDefinition1.isMongoGridFS();
        java.lang.String str6 = mongoDBRiverDefinition1.getINITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition1.getINITIAL_TIMESTAMP_SCRIPT_FIELD();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ssl" + "'", str3, "ssl");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "script_type" + "'", str6, "script_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "script" + "'", str7, "script");
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 1000);
        java.lang.Object obj4 = null;
        docScoreSearchScript0.setNextVar("concurrent_requests", obj4);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder6);
        java.lang.Object obj8 = docScoreSearchScript0.unwrap((java.lang.Object) builder6);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = docScoreSearchScript0.runAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        builder0.parentTypes = strSet14;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder0.script("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.indexName("password");
        builder20.setimportAllCollections(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition23 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder20);
        java.lang.Boolean boolean24 = mongoDBRiverDefinition23.getisMongos();
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNull(boolean24);
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        builder0.scriptType = "admin";
        builder0.setstoreStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.isMongos((java.lang.Boolean) false);
        java.util.Set<java.lang.String> strSet10 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.parentTypes(strSet10);
        com.mongodb.MongoClientOptions mongoClientOptions12 = builder9.mongoClientOptions;
        boolean boolean13 = builder9.getmongoGridFS();
        boolean boolean14 = builder9.mongoSecondaryReadPreference;
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNull(mongoClientOptions12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getimportAllCollections();
        java.lang.String str2 = builder0.mongoAdminUser;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.storeStatistics(true);
        boolean boolean5 = builder0.disableIndexRefresh;
        boolean boolean6 = builder0.getmongoUseSSL();
        java.lang.String str7 = builder0.mongoCollection;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        builder0.parentTypes = strSet14;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder0.throttleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder20);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder20.dropCollection(true);
        java.util.List<com.mongodb.ServerAddress> serverAddressList24 = builder20.mongoServers;
        boolean boolean25 = builder20.getmongoSecondaryReadPreference();
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(serverAddressList24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getimportAllCollections();
        java.lang.String str2 = builder0.getmongoAdminUser();
        java.util.List<com.mongodb.ServerAddress> serverAddressList3 = builder0.getmongoServers();
        boolean boolean4 = builder0.getmongoGridFS();
        builder0.setdropCollection(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.mongoSecondaryReadPreference(true);
        java.lang.String str9 = builder0.script;
        builder0.setdisableIndexRefresh(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(serverAddressList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoDb("hi!");
        builder5.isMongos = true;
        java.lang.String str8 = builder5.typeName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder5.mongoSSLVerifyCertificate(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet25 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet25, strArray24);
        builder11.parentTypes = strSet25;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder11.script("port");
        builder29.setriverName("disable_index_refresh");
        org.elasticsearch.common.settings.Settings settings32 = null;
        org.elasticsearch.common.settings.Settings settings33 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition35 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder34);
        builder34.setskipInitialImport(true);
        builder34.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder34.skipInitialImport(false);
        com.mongodb.BasicDBObject basicDBObject42 = builder34.getmongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings43 = new org.elasticsearch.river.RiverSettings(settings33, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject42);
        org.elasticsearch.river.RiverSettings riverSettings44 = new org.elasticsearch.river.RiverSettings(settings32, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject42);
        builder29.setmongoCollectionFilter(basicDBObject42);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder5.mongoCollectionFilter(basicDBObject42);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder46.script("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder48.disableIndexRefresh(true);
        builder48.setstoreStatistics(false);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(basicDBObject42);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoDb("hi!");
        builder5.isMongos = true;
        java.lang.String str8 = builder5.typeName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder5.mongoSSLVerifyCertificate(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet25 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet25, strArray24);
        builder11.parentTypes = strSet25;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder11.script("port");
        builder29.setriverName("disable_index_refresh");
        org.elasticsearch.common.settings.Settings settings32 = null;
        org.elasticsearch.common.settings.Settings settings33 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition35 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder34);
        builder34.setskipInitialImport(true);
        builder34.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder34.skipInitialImport(false);
        com.mongodb.BasicDBObject basicDBObject42 = builder34.getmongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings43 = new org.elasticsearch.river.RiverSettings(settings33, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject42);
        org.elasticsearch.river.RiverSettings riverSettings44 = new org.elasticsearch.river.RiverSettings(settings32, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject42);
        builder29.setmongoCollectionFilter(basicDBObject42);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder5.mongoCollectionFilter(basicDBObject42);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder46.script("disable_index_refresh");
        builder48.setskipInitialImport(true);
        builder48.setmongoUseSSL(false);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(basicDBObject42);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.getSSL_CONNECTION_FIELD();
        int int3 = mongoDBRiverDefinition1.getDEFAULT_CONNECT_TIMEOUT();
        java.lang.String str4 = mongoDBRiverDefinition1.getADMIN_DB_FIELD();
        int int5 = mongoDBRiverDefinition1.connectTimeout;
        java.lang.String str6 = mongoDBRiverDefinition1.getCONCURRENT_REQUESTS_FIELD();
        int int7 = mongoDBRiverDefinition1.socketTimeout;
        java.lang.String str8 = mongoDBRiverDefinition1.getCONNECT_TIMEOUT();
        int int9 = mongoDBRiverDefinition1.connectTimeout;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ssl" + "'", str2, "ssl");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 30000 + "'", int3 == 30000);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "concurrent_requests" + "'", str6, "concurrent_requests");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "connect_timeout" + "'", str8, "connect_timeout");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.scriptType;
        java.lang.String str3 = mongoDBRiverDefinition1.getSSL_CONNECTION_FIELD();
        boolean boolean4 = mongoDBRiverDefinition1.isImportAllCollections();
        java.lang.String str5 = mongoDBRiverDefinition1.getUSER_FIELD();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ssl" + "'", str3, "ssl");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "user" + "'", str5, "user");
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        builder0.parentTypes = strSet14;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder0.throttleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.mongoDb("local");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder20.skipInitialImport(false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = builder0.getindexName();
        boolean boolean3 = builder0.getmongoSSLVerifyCertificate();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.socketTimeout(10);
        java.lang.String str6 = builder0.indexName;
        builder0.dropCollection = false;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.riverIndexName("concurrent_bulk_requests");
        builder10.setmongoLocalPassword("index");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("advanced_transformation");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?advanced_transformation?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setriverIndexName("admin");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean4 = mongoDBRiverDefinition3.advancedTransformation;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str4 = builder0.getindexName();
        builder0.setstatisticsIndexName("local");
        int int7 = builder0.socketTimeout;
        builder0.setmongoGridFS(false);
        builder0.setmongoLocalUser("initial_timestamp");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        builder0.parentTypes = strSet14;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder0.throttleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setmongoSecondaryReadPreference(true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        builder0.parentTypes = strSet14;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder0.throttleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str20 = builder0.getindexName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder0.mongoLocalPassword("gridfs");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder22.dropCollection(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder22);
        boolean boolean26 = mongoDBRiverDefinition25.isImportAllCollections();
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue2 = mongoDBRiverDefinition1.getDEFAULT_BULK_SIZE();
        java.lang.String str3 = mongoDBRiverDefinition1.getINITIAL_TIMESTAMP_FIELD();
        int int4 = mongoDBRiverDefinition1.getSocketTimeout();
        java.lang.String str5 = mongoDBRiverDefinition1.getTHROTTLE_SIZE_FIELD();
        java.lang.String str6 = mongoDBRiverDefinition1.getINCLUDE_FIELDS_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition1.getINITIAL_TIMESTAMP_FIELD();
        boolean boolean8 = mongoDBRiverDefinition1.disableIndexRefresh;
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = mongoDBRiverDefinition1.getInitialTimestamp();
        org.junit.Assert.assertNotNull(byteSizeValue2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "initial_timestamp" + "'", str3, "initial_timestamp");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "throttle_size" + "'", str5, "throttle_size");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "include_fields" + "'", str6, "include_fields");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "initial_timestamp" + "'", str7, "initial_timestamp");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(wildcardTimestamp9);
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.getSERVERS_FIELD();
        java.lang.String str3 = mongoDBRiverDefinition1.getGRIDFS_FIELD();
        java.lang.String str4 = mongoDBRiverDefinition1.getACTIONS_FIELD();
        java.lang.String str5 = mongoDBRiverDefinition1.getSCRIPT_TYPE_FIELD();
        java.lang.String str6 = mongoDBRiverDefinition1.getLOCAL_DB_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition1.getNAME_FIELD();
        java.lang.String str8 = mongoDBRiverDefinition1.getADVANCED_TRANSFORMATION_FIELD();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "servers" + "'", str2, "servers");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "gridfs" + "'", str3, "gridfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "actions" + "'", str4, "actions");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "script_type" + "'", str5, "script_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "local" + "'", str6, "local");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "name" + "'", str7, "name");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "advanced_transformation" + "'", str8, "advanced_transformation");
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        builder0.parentTypes = strSet14;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder0.throttleSize((int) (byte) 0);
        int int19 = builder0.getconnectTimeout();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder20);
        builder20.setskipInitialImport(true);
        builder20.scriptType = "admin";
        java.lang.String[] strArray28 = new java.lang.String[] { "", "password" };
        java.util.LinkedHashSet<java.lang.String> strSet29 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet29, strArray28);
        builder20.setincludeFields((java.util.Set<java.lang.String>) strSet29);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder0.excludeFields((java.util.Set<java.lang.String>) strSet29);
        org.bson.types.Binary binary33 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder0.initialTimestamp(binary33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(builder32);
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        builder0.parentTypes = strSet14;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder0.script("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.indexName("password");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder18);
        boolean boolean22 = builder18.mongoSecondaryReadPreference;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder18.mongoLocalUser("");
        builder18.mongoLocalUser = "local";
        builder18.setriverIndexName("sandbox");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(builder24);
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.mongoLocalPassword;
        java.lang.String str4 = mongoDBRiverDefinition2.getINITIAL_TIMESTAMP_SCRIPT_FIELD();
        java.lang.String str5 = mongoDBRiverDefinition2.getIncludeCollection();
        java.lang.String str6 = mongoDBRiverDefinition2.getTypeName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "script" + "'", str4, "script");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        builder0.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.skipInitialImport(false);
        java.lang.String str8 = builder7.getstatisticsTypeName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder7.importAllCollections(true);
        boolean boolean11 = builder10.disableIndexRefresh;
        builder10.setmongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder10.storeStatistics(true);
        org.bson.types.Binary binary17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.initialTimestamp(binary17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("is_mongos");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?is_mongos?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 1000);
        java.lang.Object obj4 = null;
        docScoreSearchScript0.setNextVar("concurrent_requests", obj4);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder6);
        java.lang.Object obj8 = docScoreSearchScript0.unwrap((java.lang.Object) builder6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder9);
        builder9.setskipInitialImport(true);
        builder9.scriptType = "admin";
        builder9.setstoreStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder9.isMongos((java.lang.Boolean) false);
        com.mongodb.BasicDBObject basicDBObject19 = builder9.getmongoCollectionFilter();
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(basicDBObject19);
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = builder0.getmongoLocalUser();
        boolean boolean4 = builder0.getstoreStatistics();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp5 = builder0.initialTimestamp;
        builder0.mongoCollection = "store_statistics";
        builder0.script = "name";
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardTimestamp5);
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoDb("hi!");
        builder5.isMongos = true;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = builder8.getindexName();
        boolean boolean11 = builder8.getmongoSSLVerifyCertificate();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder8.socketTimeout(10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet28, strArray27);
        builder14.parentTypes = strSet28;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder14.script("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray46 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet47 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet47, strArray46);
        builder33.parentTypes = strSet47;
        builder32.setexcludeFields((java.util.Set<java.lang.String>) strSet47);
        builder13.includeFields = strSet47;
        builder5.setparentTypes((java.util.Set<java.lang.String>) strSet47);
        builder5.typeName = "socket_timeout";
        builder5.mongoSSLVerifyCertificate = true;
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        builder0.parentTypes = strSet14;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder0.script("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.indexName("password");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder18);
        com.mongodb.MongoClientOptions mongoClientOptions22 = mongoDBRiverDefinition21.mongoClientOptions;
        java.lang.String str23 = mongoDBRiverDefinition21.getMongoLocalUser();
        java.lang.String str24 = mongoDBRiverDefinition21.getDEFAULT_DB_HOST();
        java.lang.String str25 = mongoDBRiverDefinition21.getStatisticsIndexName();
        java.lang.String str26 = mongoDBRiverDefinition21.riverIndexName;
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNull(mongoClientOptions22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "localhost" + "'", str24, "localhost");
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 1000);
        java.lang.Object obj4 = null;
        docScoreSearchScript0.setNextVar("concurrent_requests", obj4);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder6);
        java.lang.Object obj8 = docScoreSearchScript0.unwrap((java.lang.Object) builder6);
        org.apache.lucene.index.AtomicReaderContext atomicReaderContext9 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextReader(atomicReaderContext9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue2 = mongoDBRiverDefinition1.getDEFAULT_BULK_SIZE();
        java.lang.String str3 = mongoDBRiverDefinition1.getINITIAL_TIMESTAMP_FIELD();
        int int4 = mongoDBRiverDefinition1.getSocketTimeout();
        java.lang.String str5 = mongoDBRiverDefinition1.getTHROTTLE_SIZE_FIELD();
        java.lang.String str6 = mongoDBRiverDefinition1.getINCLUDE_FIELDS_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition1.typeName;
        java.lang.String str8 = mongoDBRiverDefinition1.getSECONDARY_READ_PREFERENCE_FIELD();
        com.mongodb.BasicDBObject basicDBObject9 = mongoDBRiverDefinition1.mongoOplogFilter;
        org.junit.Assert.assertNotNull(byteSizeValue2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "initial_timestamp" + "'", str3, "initial_timestamp");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "throttle_size" + "'", str5, "throttle_size");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "include_fields" + "'", str6, "include_fields");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "secondary_read_preference" + "'", str8, "secondary_read_preference");
        org.junit.Assert.assertNull(basicDBObject9);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 1000);
        java.lang.Object obj4 = null;
        docScoreSearchScript0.setNextVar("concurrent_requests", obj4);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = docScoreSearchScript0.runAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 1000);
        java.lang.Object obj4 = null;
        docScoreSearchScript0.setNextVar("concurrent_requests", obj4);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder6);
        java.lang.Object obj8 = docScoreSearchScript0.unwrap((java.lang.Object) builder6);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = docScoreSearchScript0.runAsLong();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        builder0.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        builder8.parentTypes = strSet22;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder7.parentTypes((java.util.Set<java.lang.String>) strSet22);
        builder25.scriptType = "initial_timestamp";
        java.lang.String str28 = builder25.getmongoAdminUser();
        builder25.setsocketTimeout(10);
        java.lang.String str31 = builder25.gettypeName();
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("user", "script_type");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?script_type?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        int int2 = builder0.getsocketTimeout();
        java.lang.String str3 = builder0.getincludeCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        builder4.parentTypes = strSet18;
        builder0.excludeFields = strSet18;
        java.lang.String str22 = builder0.getmongoLocalPassword();
        builder0.mongoUseSSL = true;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        builder0.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.skipInitialImport(false);
        java.lang.String str8 = builder7.getstatisticsTypeName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder7.importAllCollections(true);
        boolean boolean11 = builder10.disableIndexRefresh;
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = builder10.initialTimestamp;
        boolean boolean13 = builder10.getmongoUseSSL();
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(wildcardTimestamp12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript2 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript2.setNextScore((float) 1000);
        docScoreSearchScript2.setNextScore((float) 1000);
        docScoreSearchScript0.setNextVar("include_fields", (java.lang.Object) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        builder9.parentTypes = strSet23;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder9.throttleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.typeName("disable_index_refresh");
        docScoreSearchScript0.setNextVar("parent_types", (java.lang.Object) builder29);
        org.elasticsearch.common.settings.Settings settings31 = null;
        org.elasticsearch.common.settings.Settings settings32 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition34 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder33);
        builder33.setskipInitialImport(true);
        builder33.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder33.skipInitialImport(false);
        com.mongodb.BasicDBObject basicDBObject41 = builder33.getmongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings42 = new org.elasticsearch.river.RiverSettings(settings32, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject41);
        org.elasticsearch.river.RiverSettings riverSettings43 = new org.elasticsearch.river.RiverSettings(settings31, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject41);
        builder29.mongoCollectionFilter = basicDBObject41;
        java.lang.String str45 = builder29.getmongoLocalUser();
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(basicDBObject41);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet15 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet15, strArray14);
        builder1.parentTypes = strSet15;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder1.script("port");
        builder19.setriverName("disable_index_refresh");
        org.elasticsearch.common.settings.Settings settings22 = null;
        org.elasticsearch.common.settings.Settings settings23 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder24);
        builder24.setskipInitialImport(true);
        builder24.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder24.skipInitialImport(false);
        com.mongodb.BasicDBObject basicDBObject32 = builder24.getmongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings33 = new org.elasticsearch.river.RiverSettings(settings23, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject32);
        org.elasticsearch.river.RiverSettings riverSettings34 = new org.elasticsearch.river.RiverSettings(settings22, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject32);
        builder19.setmongoCollectionFilter(basicDBObject32);
        org.elasticsearch.river.RiverSettings riverSettings36 = new org.elasticsearch.river.RiverSettings(settings0, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject32);
        org.elasticsearch.common.settings.Settings settings37 = riverSettings36.globalSettings();
        org.elasticsearch.common.settings.Settings settings38 = riverSettings36.globalSettings();
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(basicDBObject32);
        org.junit.Assert.assertNull(settings37);
        org.junit.Assert.assertNull(settings38);
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript1 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript3 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript3.setNextScore((float) 1000);
        docScoreSearchScript3.setNextScore((float) 1000);
        docScoreSearchScript1.setNextVar("include_fields", (java.lang.Object) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        builder10.parentTypes = strSet24;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder10.throttleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.typeName("disable_index_refresh");
        docScoreSearchScript1.setNextVar("parent_types", (java.lang.Object) builder30);
        org.elasticsearch.common.settings.Settings settings32 = null;
        org.elasticsearch.common.settings.Settings settings33 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition35 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder34);
        builder34.setskipInitialImport(true);
        builder34.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder34.skipInitialImport(false);
        com.mongodb.BasicDBObject basicDBObject42 = builder34.getmongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings43 = new org.elasticsearch.river.RiverSettings(settings33, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject42);
        org.elasticsearch.river.RiverSettings riverSettings44 = new org.elasticsearch.river.RiverSettings(settings32, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject42);
        builder30.mongoCollectionFilter = basicDBObject42;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(basicDBObject42);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("initial_timestamp", "import_all_collections", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?import_all_collections?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.getEXCLUDE_FIELDS_FIELD();
        java.lang.String str3 = mongoDBRiverDefinition1.getIndexName();
        java.lang.String str4 = mongoDBRiverDefinition1.mongoLocalPassword;
        java.util.Set<java.lang.String> strSet5 = mongoDBRiverDefinition1.parentTypes;
        java.lang.String str6 = mongoDBRiverDefinition1.getCONCURRENT_REQUESTS_FIELD();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "exclude_fields" + "'", str2, "exclude_fields");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "concurrent_requests" + "'", str6, "concurrent_requests");
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        builder0.scriptType = "admin";
        builder0.setstoreStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.isMongos((java.lang.Boolean) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder0.statisticsTypeName("store_statistics");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.mongoSSLVerifyCertificate(true);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        builder0.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        builder8.parentTypes = strSet22;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder7.parentTypes((java.util.Set<java.lang.String>) strSet22);
        builder25.scriptType = "initial_timestamp";
        java.lang.String str28 = builder25.getmongoAdminUser();
        builder25.setsocketTimeout(10);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp31 = builder25.initialTimestamp;
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript32 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript34 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript34.setNextScore((float) 1000);
        docScoreSearchScript34.setNextScore((float) 1000);
        docScoreSearchScript32.setNextVar("include_fields", (java.lang.Object) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray54 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet55 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet55, strArray54);
        builder41.parentTypes = strSet55;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = builder41.throttleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = builder59.typeName("disable_index_refresh");
        docScoreSearchScript32.setNextVar("parent_types", (java.lang.Object) builder61);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp63 = builder61.getinitialTimestamp();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder64 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean65 = builder64.getimportAllCollections();
        java.lang.String str66 = builder64.getmongoAdminUser();
        java.util.List<com.mongodb.ServerAddress> serverAddressList67 = builder64.getmongoServers();
        java.util.List<com.mongodb.ServerAddress> serverAddressList68 = builder64.getmongoServers();
        builder61.mongoServers = serverAddressList68;
        builder25.mongoServers = serverAddressList68;
        org.bson.types.BSONTimestamp bSONTimestamp71 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder72 = builder25.initialTimestamp(bSONTimestamp71);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ts must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(wildcardTimestamp31);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNull(wildcardTimestamp63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNotNull(serverAddressList67);
        org.junit.Assert.assertNotNull(serverAddressList68);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        builder0.parentTypes = strSet14;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder0.script("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.indexName("password");
        builder20.setimportAllCollections(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition23 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder20);
        java.util.Set<java.lang.String> strSet24 = builder20.getincludeFields();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder20.importAllCollections(true);
        java.lang.String str27 = builder20.getmongoAdminUser();
        org.bson.types.BSONTimestamp bSONTimestamp28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder20.initialTimestamp(bSONTimestamp28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ts must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNull(strSet24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.NAME_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "name" + "'", str0, "name");
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("options");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?options?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript2 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript2.setNextScore((float) 1000);
        docScoreSearchScript2.setNextScore((float) 1000);
        docScoreSearchScript0.setNextVar("include_fields", (java.lang.Object) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        builder9.parentTypes = strSet23;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder9.throttleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.typeName("disable_index_refresh");
        docScoreSearchScript0.setNextVar("parent_types", (java.lang.Object) builder29);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition33 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder32);
        builder32.setskipInitialImport(true);
        builder32.scriptType = "admin";
        builder32.setstoreStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder32.isMongos((java.lang.Boolean) false);
        java.lang.String str42 = builder32.mongoAdminUser;
        docScoreSearchScript0.setNextVar("drop_collection", (java.lang.Object) str42);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition45 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder44);
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue46 = mongoDBRiverDefinition45.getDEFAULT_BULK_SIZE();
        int int47 = mongoDBRiverDefinition45.getDEFAULT_SOCKET_TIMEOUT();
        java.lang.String str48 = mongoDBRiverDefinition45.getINDEX_OBJECT();
        boolean boolean49 = mongoDBRiverDefinition45.getadvancedTransformation();
        com.mongodb.MongoClientOptions mongoClientOptions50 = mongoDBRiverDefinition45.getMongoClientOptions();
        java.lang.Object obj51 = docScoreSearchScript0.unwrap((java.lang.Object) mongoClientOptions50);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder52.setriverIndexName("admin");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition55 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder52);
        int int56 = builder52.throttleSize;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition57 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder52);
        com.mongodb.BasicDBObject basicDBObject58 = builder52.getmongoCollectionFilter();
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(byteSizeValue46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 60000 + "'", int47 == 60000);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "index" + "'", str48, "index");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(mongoClientOptions50);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(basicDBObject58);
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        builder0.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.skipInitialImport(false);
        java.lang.String str8 = builder7.getstatisticsTypeName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder7.importAllCollections(true);
        com.mongodb.MongoClientOptions mongoClientOptions11 = null;
        builder7.mongoClientOptions = mongoClientOptions11;
        java.util.Set<java.lang.String> strSet13 = builder7.getincludeFields();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder7.mongoDb("user");
        java.lang.Class<?> wildcardClass16 = builder7.getClass();
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNull(strSet13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        builder0.parentTypes = strSet14;
        boolean boolean17 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str19 = mongoDBRiverDefinition18.getCONCURRENT_REQUESTS_FIELD();
        java.lang.String str20 = mongoDBRiverDefinition18.getSECONDARY_READ_PREFERENCE_FIELD();
        java.util.Set<java.lang.String> strSet21 = mongoDBRiverDefinition18.getExcludeFields();
        java.lang.String str22 = mongoDBRiverDefinition18.getOPTIONS_FIELD();
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "concurrent_requests" + "'", str19, "concurrent_requests");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "secondary_read_preference" + "'", str20, "secondary_read_preference");
        org.junit.Assert.assertNull(strSet21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "options" + "'", str22, "options");
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.getFLUSH_INTERVAL_FIELD();
        boolean boolean4 = mongoDBRiverDefinition2.getmongoUseSSL();
        java.lang.String str5 = mongoDBRiverDefinition2.getSCRIPT_FIELD();
        java.lang.String str6 = mongoDBRiverDefinition2.getDROP_COLLECTION_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition2.getCREDENTIALS_FIELD();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = mongoDBRiverDefinition2.getInitialTimestamp();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "flush_interval" + "'", str3, "flush_interval");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "script" + "'", str5, "script");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "drop_collection" + "'", str6, "drop_collection");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "credentials" + "'", str7, "credentials");
        org.junit.Assert.assertNull(wildcardTimestamp8);
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoDb("hi!");
        builder5.isMongos = true;
        builder5.indexName = "password";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder10);
        builder10.setskipInitialImport(true);
        builder10.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder10.skipInitialImport(false);
        com.mongodb.BasicDBObject basicDBObject18 = builder10.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder5.mongoOplogFilter(basicDBObject18);
        java.lang.String str20 = builder5.getmongoLocalPassword();
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(basicDBObject18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue2 = mongoDBRiverDefinition1.getDEFAULT_BULK_SIZE();
        int int3 = mongoDBRiverDefinition1.getDEFAULT_SOCKET_TIMEOUT();
        java.lang.String str4 = mongoDBRiverDefinition1.getINDEX_OBJECT();
        boolean boolean5 = mongoDBRiverDefinition1.getmongoSSLVerifyCertificate();
        java.lang.String str6 = mongoDBRiverDefinition1.getADMIN_DB_FIELD();
        boolean boolean7 = mongoDBRiverDefinition1.mongoGridFS;
        boolean boolean8 = mongoDBRiverDefinition1.importAllCollections;
        org.junit.Assert.assertNotNull(byteSizeValue2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "index" + "'", str4, "index");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean4 = mongoDBRiverDefinition3.isDropCollection();
        boolean boolean5 = mongoDBRiverDefinition3.isDisableIndexRefresh();
        java.lang.String str6 = mongoDBRiverDefinition3.getBULK_SIZE_FIELD();
        boolean boolean7 = mongoDBRiverDefinition3.isSkipInitialImport();
        java.lang.String str8 = mongoDBRiverDefinition3.getSTORE_STATISTICS_FIELD();
        boolean boolean9 = mongoDBRiverDefinition3.getskipInitialImport();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "bulk_size" + "'", str6, "bulk_size");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "store_statistics" + "'", str8, "store_statistics");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoDb("hi!");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = builder0.initialTimestamp;
        builder0.isMongos = false;
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        int int2 = builder0.getsocketTimeout();
        java.lang.String str3 = builder0.getincludeCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean5 = builder4.getimportAllCollections();
        java.lang.String str6 = builder4.getmongoAdminUser();
        java.util.List<com.mongodb.ServerAddress> serverAddressList7 = builder4.getmongoServers();
        java.util.List<com.mongodb.ServerAddress> serverAddressList8 = builder4.getmongoServers();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.mongoServers(serverAddressList8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        builder10.parentTypes = strSet24;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder10.throttleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition30 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder29);
        int int31 = builder29.getsocketTimeout();
        java.lang.String str32 = builder29.getincludeCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray46 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet47 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet47, strArray46);
        builder33.parentTypes = strSet47;
        builder29.excludeFields = strSet47;
        builder10.parentTypes = strSet47;
        builder9.parentTypes = strSet47;
        int int53 = builder9.getconnectTimeout();
        builder9.mongoDb = "";
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(serverAddressList7);
        org.junit.Assert.assertNotNull(serverAddressList8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.mongoLocalPassword;
        java.lang.String str4 = mongoDBRiverDefinition2.getINITIAL_TIMESTAMP_SCRIPT_FIELD();
        java.lang.String str5 = mongoDBRiverDefinition2.getIncludeCollection();
        java.lang.String str6 = mongoDBRiverDefinition2.getADVANCED_TRANSFORMATION_FIELD();
        java.util.Set<java.lang.String> strSet7 = mongoDBRiverDefinition2.parentTypes;
        java.lang.String str8 = mongoDBRiverDefinition2.getPORT_FIELD();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "script" + "'", str4, "script");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "advanced_transformation" + "'", str6, "advanced_transformation");
        org.junit.Assert.assertNull(strSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "port" + "'", str8, "port");
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = builder0.getindexName();
        boolean boolean3 = builder0.getmongoSSLVerifyCertificate();
        java.lang.String str4 = builder0.typeName;
        builder0.socketTimeout = 0;
        java.lang.Class<?> wildcardClass7 = builder0.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        builder0.parentTypes = strSet14;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder0.throttleSize((int) (byte) 0);
        int int19 = builder0.getconnectTimeout();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder20);
        builder20.setskipInitialImport(true);
        builder20.scriptType = "admin";
        java.lang.String[] strArray28 = new java.lang.String[] { "", "password" };
        java.util.LinkedHashSet<java.lang.String> strSet29 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet29, strArray28);
        builder20.setincludeFields((java.util.Set<java.lang.String>) strSet29);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder0.excludeFields((java.util.Set<java.lang.String>) strSet29);
        builder32.statisticsTypeName = "throttle_size";
        builder32.script = "initial_timestamp";
        boolean boolean37 = builder32.getmongoSSLVerifyCertificate();
        java.lang.String str38 = builder32.includeCollection;
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getimportAllCollections();
        java.lang.String str2 = builder0.getmongoAdminUser();
        java.util.List<com.mongodb.ServerAddress> serverAddressList3 = builder0.getmongoServers();
        boolean boolean4 = builder0.getmongoGridFS();
        builder0.setdropCollection(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.script("local");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoCollection("skip_initial_import");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = builder10.initialTimestamp;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(serverAddressList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 1000);
        java.lang.Object obj4 = null;
        docScoreSearchScript0.setNextVar("concurrent_requests", obj4);
        // The following exception was thrown during execution in test generation
        try {
            long long6 = docScoreSearchScript0.runAsLong();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        builder0.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.skipInitialImport(false);
        builder0.setisMongos((java.lang.Boolean) false);
        org.elasticsearch.common.settings.Settings settings10 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder11);
        builder11.setskipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder11.mongoDb("hi!");
        builder16.isMongos = true;
        java.lang.String str19 = builder16.typeName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder16.mongoSSLVerifyCertificate(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet36 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet36, strArray35);
        builder22.parentTypes = strSet36;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder22.script("port");
        builder40.setriverName("disable_index_refresh");
        org.elasticsearch.common.settings.Settings settings43 = null;
        org.elasticsearch.common.settings.Settings settings44 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition46 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder45);
        builder45.setskipInitialImport(true);
        builder45.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder45.skipInitialImport(false);
        com.mongodb.BasicDBObject basicDBObject53 = builder45.getmongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings54 = new org.elasticsearch.river.RiverSettings(settings44, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject53);
        org.elasticsearch.river.RiverSettings riverSettings55 = new org.elasticsearch.river.RiverSettings(settings43, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject53);
        builder40.setmongoCollectionFilter(basicDBObject53);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder16.mongoCollectionFilter(basicDBObject53);
        org.elasticsearch.river.RiverSettings riverSettings58 = new org.elasticsearch.river.RiverSettings(settings10, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject53);
        builder0.mongoOplogFilter = basicDBObject53;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition60 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition61 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str62 = mongoDBRiverDefinition61.getACTIONS_FIELD();
        java.lang.String str63 = mongoDBRiverDefinition61.getINITIAL_TIMESTAMP_SCRIPT_FIELD();
        java.lang.String str64 = mongoDBRiverDefinition61.getBULK_FIELD();
        java.lang.String str65 = mongoDBRiverDefinition61.getINITIAL_TIMESTAMP_FIELD();
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(basicDBObject53);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "actions" + "'", str62, "actions");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "script" + "'", str63, "script");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "bulk" + "'", str64, "bulk");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "initial_timestamp" + "'", str65, "initial_timestamp");
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getimportAllCollections();
        java.lang.String str2 = builder0.getmongoAdminUser();
        java.util.List<com.mongodb.ServerAddress> serverAddressList3 = builder0.getmongoServers();
        boolean boolean4 = builder0.getmongoGridFS();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean6 = builder5.getimportAllCollections();
        java.lang.String str7 = builder5.getmongoAdminUser();
        java.util.List<com.mongodb.ServerAddress> serverAddressList8 = builder5.getmongoServers();
        java.util.List<com.mongodb.ServerAddress> serverAddressList9 = builder5.getmongoServers();
        builder0.setmongoServers(serverAddressList9);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(serverAddressList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(serverAddressList8);
        org.junit.Assert.assertNotNull(serverAddressList9);
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("script");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?script?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        builder0.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.skipInitialImport(false);
        com.mongodb.BasicDBObject basicDBObject8 = builder0.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.disableIndexRefresh(false);
        java.lang.String str13 = builder10.getmongoLocalUser();
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(basicDBObject8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.getSSL_CONNECTION_FIELD();
        int int3 = mongoDBRiverDefinition1.getDEFAULT_CONNECT_TIMEOUT();
        boolean boolean4 = mongoDBRiverDefinition1.dropCollection;
        java.lang.String str5 = mongoDBRiverDefinition1.getPARENT_TYPES_FIELD();
        java.lang.String str6 = mongoDBRiverDefinition1.getCREDENTIALS_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition1.getINITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ssl" + "'", str2, "ssl");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 30000 + "'", int3 == 30000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "parent_types" + "'", str5, "parent_types");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "credentials" + "'", str6, "credentials");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "script_type" + "'", str7, "script_type");
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        builder0.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        builder8.parentTypes = strSet22;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder7.parentTypes((java.util.Set<java.lang.String>) strSet22);
        builder25.scriptType = "initial_timestamp";
        java.lang.String str28 = builder25.getmongoAdminUser();
        builder25.setsocketTimeout(10);
        builder25.riverName = "connect_timeout";
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        builder0.parentTypes = strSet14;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder0.script("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.indexName("password");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder18);
        boolean boolean22 = builder18.mongoSecondaryReadPreference;
        builder18.riverName = "import_all_collections";
        boolean boolean25 = builder18.getdisableIndexRefresh();
        com.mongodb.MongoClientOptions mongoClientOptions26 = null;
        builder18.mongoClientOptions = mongoClientOptions26;
        int int28 = builder18.getconnectTimeout();
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("user", "filter");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?filter? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.getSSL_CONNECTION_FIELD();
        boolean boolean3 = mongoDBRiverDefinition1.isStoreStatistics();
        java.lang.String str4 = mongoDBRiverDefinition1.getStatisticsIndexName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ssl" + "'", str2, "ssl");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("null.null");
        org.junit.Assert.assertNull(basicDBObject1);
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.Settings settings1 = null;
        org.elasticsearch.common.settings.Settings settings2 = null;
        org.elasticsearch.common.settings.Settings settings3 = null;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory4 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.common.settings.Settings settings5 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder6);
        builder6.setskipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder6.mongoDb("hi!");
        builder11.isMongos = true;
        java.lang.String str14 = builder11.typeName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder11.mongoSSLVerifyCertificate(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
        builder17.parentTypes = strSet31;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder17.script("port");
        builder35.setriverName("disable_index_refresh");
        org.elasticsearch.common.settings.Settings settings38 = null;
        org.elasticsearch.common.settings.Settings settings39 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition41 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder40);
        builder40.setskipInitialImport(true);
        builder40.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder40.skipInitialImport(false);
        com.mongodb.BasicDBObject basicDBObject48 = builder40.getmongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings49 = new org.elasticsearch.river.RiverSettings(settings39, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject48);
        org.elasticsearch.river.RiverSettings riverSettings50 = new org.elasticsearch.river.RiverSettings(settings38, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject48);
        builder35.setmongoCollectionFilter(basicDBObject48);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder11.mongoCollectionFilter(basicDBObject48);
        org.elasticsearch.river.RiverSettings riverSettings53 = new org.elasticsearch.river.RiverSettings(settings5, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject48);
        org.elasticsearch.script.ExecutableScript executableScript54 = docScoreNativeScriptFactory4.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject48);
        org.elasticsearch.river.RiverSettings riverSettings55 = new org.elasticsearch.river.RiverSettings(settings3, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject48);
        org.elasticsearch.river.RiverSettings riverSettings56 = new org.elasticsearch.river.RiverSettings(settings2, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject48);
        org.elasticsearch.river.RiverSettings riverSettings57 = new org.elasticsearch.river.RiverSettings(settings1, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject48);
        org.elasticsearch.river.RiverSettings riverSettings58 = new org.elasticsearch.river.RiverSettings(settings0, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject48);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(basicDBObject48);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(executableScript54);
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        builder0.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.skipInitialImport(false);
        java.lang.String str8 = builder7.getstatisticsTypeName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder7.importAllCollections(true);
        boolean boolean11 = builder10.disableIndexRefresh;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        builder12.parentTypes = strSet26;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder10.parentTypes((java.util.Set<java.lang.String>) strSet26);
        builder29.mongoLocalUser = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder29.importAllCollections(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition34 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder33);
        boolean boolean35 = builder33.dropCollection;
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getimportAllCollections();
        java.lang.String str2 = builder0.getmongoAdminUser();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.socketTimeout(1000);
        org.bson.types.BSONTimestamp bSONTimestamp9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.initialTimestamp(bSONTimestamp9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ts must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        builder0.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.skipInitialImport(false);
        com.mongodb.BasicDBObject basicDBObject8 = builder0.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.storeStatistics(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.mongoDb("");
        builder14.mongoGridFS = true;
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(basicDBObject8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = builder0.getindexName();
        boolean boolean3 = builder0.getmongoSSLVerifyCertificate();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.socketTimeout(10);
        builder0.storeStatistics = false;
        builder0.setskipInitialImport(true);
        java.util.Set<java.lang.String> strSet10 = builder0.excludeFields;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(strSet10);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript2 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript2.setNextScore((float) 1000);
        docScoreSearchScript2.setNextScore((float) 1000);
        docScoreSearchScript0.setNextVar("include_fields", (java.lang.Object) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        builder9.parentTypes = strSet23;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder9.throttleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.typeName("disable_index_refresh");
        docScoreSearchScript0.setNextVar("parent_types", (java.lang.Object) builder29);
        org.apache.lucene.search.Scorer scorer31 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setScorer(scorer31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str4 = builder0.getindexName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.indexName("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str8 = mongoDBRiverDefinition7.getRiverIndexName();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        builder0.parentTypes = strSet14;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder0.throttleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.typeName("disable_index_refresh");
        java.lang.String str21 = builder18.getstatisticsIndexName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder18.mongoLocalPassword("admin");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder24);
        builder24.setskipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder24.mongoDb("hi!");
        builder29.isMongos = true;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition33 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder32);
        java.lang.String str34 = builder32.getindexName();
        boolean boolean35 = builder32.getmongoSSLVerifyCertificate();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder32.socketTimeout(10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray51 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet52 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet52, strArray51);
        builder38.parentTypes = strSet52;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder38.script("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray70 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet71 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet71, strArray70);
        builder57.parentTypes = strSet71;
        builder56.setexcludeFields((java.util.Set<java.lang.String>) strSet71);
        builder37.includeFields = strSet71;
        builder29.setparentTypes((java.util.Set<java.lang.String>) strSet71);
        builder18.includeFields = strSet71;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder79 = builder18.scriptType("type");
        builder79.setskipInitialImport(true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(builder79);
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 1000);
        java.lang.Object obj4 = null;
        docScoreSearchScript0.setNextVar("concurrent_requests", obj4);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder6);
        java.lang.Object obj8 = docScoreSearchScript0.unwrap((java.lang.Object) builder6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj9 = docScoreSearchScript0.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.scriptType;
        java.lang.String str3 = mongoDBRiverDefinition1.getSSL_CONNECTION_FIELD();
        boolean boolean4 = mongoDBRiverDefinition1.isImportAllCollections();
        boolean boolean5 = mongoDBRiverDefinition1.isMongoGridFS();
        java.lang.String str6 = mongoDBRiverDefinition1.getMongoAdminPassword();
        com.mongodb.BasicDBObject basicDBObject7 = mongoDBRiverDefinition1.mongoOplogFilter;
        boolean boolean8 = mongoDBRiverDefinition1.isMongoSSLVerifyCertificate();
        java.lang.String str9 = mongoDBRiverDefinition1.getRiverIndexName();
        java.lang.String str10 = mongoDBRiverDefinition1.script;
        java.util.Set<java.lang.String> strSet11 = mongoDBRiverDefinition1.getParentTypes();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ssl" + "'", str3, "ssl");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(basicDBObject7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(strSet11);
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        builder0.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.skipInitialImport(false);
        builder0.setisMongos((java.lang.Boolean) false);
        org.elasticsearch.common.settings.Settings settings10 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder11);
        builder11.setskipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder11.mongoDb("hi!");
        builder16.isMongos = true;
        java.lang.String str19 = builder16.typeName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder16.mongoSSLVerifyCertificate(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet36 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet36, strArray35);
        builder22.parentTypes = strSet36;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder22.script("port");
        builder40.setriverName("disable_index_refresh");
        org.elasticsearch.common.settings.Settings settings43 = null;
        org.elasticsearch.common.settings.Settings settings44 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition46 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder45);
        builder45.setskipInitialImport(true);
        builder45.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder45.skipInitialImport(false);
        com.mongodb.BasicDBObject basicDBObject53 = builder45.getmongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings54 = new org.elasticsearch.river.RiverSettings(settings44, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject53);
        org.elasticsearch.river.RiverSettings riverSettings55 = new org.elasticsearch.river.RiverSettings(settings43, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject53);
        builder40.setmongoCollectionFilter(basicDBObject53);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder16.mongoCollectionFilter(basicDBObject53);
        org.elasticsearch.river.RiverSettings riverSettings58 = new org.elasticsearch.river.RiverSettings(settings10, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject53);
        builder0.mongoOplogFilter = basicDBObject53;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition60 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition61 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str62 = mongoDBRiverDefinition61.mongoCollection;
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(basicDBObject53);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNull(str62);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoDb("hi!");
        builder5.isMongos = true;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = builder8.getindexName();
        boolean boolean11 = builder8.getmongoSSLVerifyCertificate();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder8.socketTimeout(10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet28, strArray27);
        builder14.parentTypes = strSet28;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder14.script("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray46 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet47 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet47, strArray46);
        builder33.parentTypes = strSet47;
        builder32.setexcludeFields((java.util.Set<java.lang.String>) strSet47);
        builder13.includeFields = strSet47;
        builder5.setparentTypes((java.util.Set<java.lang.String>) strSet47);
        builder5.typeName = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition55 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        com.mongodb.MongoClientOptions mongoClientOptions56 = mongoDBRiverDefinition55.mongoClientOptions;
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNull(mongoClientOptions56);
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.getSSL_CONNECTION_FIELD();
        int int3 = mongoDBRiverDefinition1.getDEFAULT_CONNECT_TIMEOUT();
        java.lang.String str4 = mongoDBRiverDefinition1.getADMIN_DB_FIELD();
        int int5 = mongoDBRiverDefinition1.connectTimeout;
        java.lang.String str6 = mongoDBRiverDefinition1.getCONCURRENT_REQUESTS_FIELD();
        int int7 = mongoDBRiverDefinition1.socketTimeout;
        java.lang.String str8 = mongoDBRiverDefinition1.getCONNECT_TIMEOUT();
        java.lang.String str9 = mongoDBRiverDefinition1.getINDEX_OBJECT();
        boolean boolean10 = mongoDBRiverDefinition1.getadvancedTransformation();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ssl" + "'", str2, "ssl");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 30000 + "'", int3 == 30000);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "concurrent_requests" + "'", str6, "concurrent_requests");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "connect_timeout" + "'", str8, "connect_timeout");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "index" + "'", str9, "index");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("disable_index_refresh");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?disable_index_refresh?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        builder0.parentTypes = strSet14;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder0.throttleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder20);
        java.lang.String str22 = mongoDBRiverDefinition21.getBULK_FIELD();
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "bulk" + "'", str22, "bulk");
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        builder0.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.skipInitialImport(false);
        builder0.setisMongos((java.lang.Boolean) false);
        org.elasticsearch.common.settings.Settings settings10 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder11);
        builder11.setskipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder11.mongoDb("hi!");
        builder16.isMongos = true;
        java.lang.String str19 = builder16.typeName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder16.mongoSSLVerifyCertificate(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet36 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet36, strArray35);
        builder22.parentTypes = strSet36;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder22.script("port");
        builder40.setriverName("disable_index_refresh");
        org.elasticsearch.common.settings.Settings settings43 = null;
        org.elasticsearch.common.settings.Settings settings44 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition46 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder45);
        builder45.setskipInitialImport(true);
        builder45.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder45.skipInitialImport(false);
        com.mongodb.BasicDBObject basicDBObject53 = builder45.getmongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings54 = new org.elasticsearch.river.RiverSettings(settings44, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject53);
        org.elasticsearch.river.RiverSettings riverSettings55 = new org.elasticsearch.river.RiverSettings(settings43, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject53);
        builder40.setmongoCollectionFilter(basicDBObject53);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder16.mongoCollectionFilter(basicDBObject53);
        org.elasticsearch.river.RiverSettings riverSettings58 = new org.elasticsearch.river.RiverSettings(settings10, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject53);
        builder0.mongoOplogFilter = basicDBObject53;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition60 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition61 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.List<com.mongodb.ServerAddress> serverAddressList62 = builder0.getmongoServers();
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(basicDBObject53);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(serverAddressList62);
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoDb("hi!");
        builder5.isMongos = true;
        builder5.indexName = "password";
        builder5.disableIndexRefresh = true;
        builder5.connectTimeout = (short) -1;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition14 = builder5.build();
        builder5.setmongoLocalUser("concurrent_bulk_requests");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition14);
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getimportAllCollections();
        java.lang.String str2 = builder0.getmongoAdminUser();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.throttleSize((int) (byte) 10);
        boolean boolean6 = builder5.skipInitialImport;
        builder5.setmongoSSLVerifyCertificate(true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        builder0.parentTypes = strSet14;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder0.throttleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str20 = builder0.getindexName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder0.mongoLocalPassword("gridfs");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder22.dropCollection(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder24);
        int int26 = mongoDBRiverDefinition25.connectTimeout;
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        builder0.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.skipInitialImport(false);
        builder0.setisMongos((java.lang.Boolean) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder0.indexName("size");
        java.lang.String str12 = builder11.getstatisticsIndexName();
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.riverName("bulk_size");
        builder0.statisticsIndexName = "parent_types";
        builder0.mongoLocalPassword = "socket_timeout";
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        builder0.parentTypes = strSet14;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder0.script("port");
        java.util.Set<java.lang.String> strSet19 = builder18.getexcludeFields();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray33 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        builder20.parentTypes = strSet34;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder20.script("port");
        builder38.setindexName("flush_interval");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition42 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder41);
        java.lang.String str43 = builder41.getindexName();
        boolean boolean44 = builder41.getmongoSSLVerifyCertificate();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder41.socketTimeout(10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray60 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet61 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet61, strArray60);
        builder47.parentTypes = strSet61;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder65 = builder47.script("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder66 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray79 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet80 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet80, strArray79);
        builder66.parentTypes = strSet80;
        builder65.setexcludeFields((java.util.Set<java.lang.String>) strSet80);
        builder46.includeFields = strSet80;
        builder38.excludeFields = strSet80;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder86 = builder18.excludeFields((java.util.Set<java.lang.String>) strSet80);
        builder18.setmongoLocalPassword("password");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNull(strSet19);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(builder86);
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        builder0.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.skipInitialImport(false);
        java.lang.String str8 = builder7.getstatisticsTypeName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder7.importAllCollections(true);
        builder7.setdropCollection(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder13);
        builder13.setskipInitialImport(true);
        builder13.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder13.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet35 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet35, strArray34);
        builder21.parentTypes = strSet35;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder20.parentTypes((java.util.Set<java.lang.String>) strSet35);
        builder38.scriptType = "initial_timestamp";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition42 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder41);
        builder41.setskipInitialImport(true);
        builder41.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder41.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray62 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet63 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet63, strArray62);
        builder49.parentTypes = strSet63;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder66 = builder48.parentTypes((java.util.Set<java.lang.String>) strSet63);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder67 = builder38.excludeFields((java.util.Set<java.lang.String>) strSet63);
        java.util.Set<java.lang.String> strSet68 = builder38.excludeFields;
        builder7.excludeFields = strSet68;
        boolean boolean70 = builder7.disableIndexRefresh;
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(strSet68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.getSSL_CONNECTION_FIELD();
        boolean boolean3 = mongoDBRiverDefinition1.isStoreStatistics();
        boolean boolean4 = mongoDBRiverDefinition1.mongoGridFS;
        boolean boolean5 = mongoDBRiverDefinition1.isMongoUseSSL();
        java.lang.String str6 = mongoDBRiverDefinition1.getMongoLocalPassword();
        boolean boolean7 = mongoDBRiverDefinition1.getmongoGridFS();
        java.lang.String str8 = mongoDBRiverDefinition1.includeCollection;
        java.lang.String str9 = mongoDBRiverDefinition1.getINDEX_OBJECT();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ssl" + "'", str2, "ssl");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "index" + "'", str9, "index");
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 1000);
        java.lang.Object obj4 = null;
        docScoreSearchScript0.setNextVar("concurrent_requests", obj4);
        // The following exception was thrown during execution in test generation
        try {
            float float6 = docScoreSearchScript0.runAsFloat();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        builder0.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.skipInitialImport(false);
        java.lang.String str8 = builder7.getstatisticsTypeName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder7.importAllCollections(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder7.mongoAdminPassword("socket_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean14 = builder13.getimportAllCollections();
        java.lang.String str15 = builder13.getmongoAdminUser();
        java.util.List<com.mongodb.ServerAddress> serverAddressList16 = builder13.getmongoServers();
        boolean boolean17 = builder13.getmongoGridFS();
        builder13.setdropCollection(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder13.script("local");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.mongoCollection("skip_initial_import");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder24);
        java.lang.String str26 = builder24.getindexName();
        boolean boolean27 = builder24.getmongoSSLVerifyCertificate();
        java.lang.String str28 = builder24.typeName;
        builder24.riverName = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition32 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder31);
        builder31.setskipInitialImport(true);
        builder31.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder31.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray52 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet53 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet53, strArray52);
        builder39.parentTypes = strSet53;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder38.parentTypes((java.util.Set<java.lang.String>) strSet53);
        builder56.scriptType = "initial_timestamp";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition60 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder59);
        builder59.setskipInitialImport(true);
        builder59.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder66 = builder59.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder67 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray80 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet81 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet81, strArray80);
        builder67.parentTypes = strSet81;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder84 = builder66.parentTypes((java.util.Set<java.lang.String>) strSet81);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder85 = builder56.excludeFields((java.util.Set<java.lang.String>) strSet81);
        builder24.includeFields = strSet81;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder87 = builder21.includeFields((java.util.Set<java.lang.String>) strSet81);
        builder7.excludeFields = strSet81;
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(serverAddressList16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder66);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(builder84);
        org.junit.Assert.assertNotNull(builder85);
        org.junit.Assert.assertNotNull(builder87);
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean3 = builder0.getmongoUseSSL();
        builder0.setstatisticsTypeName("user");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        int int9 = mongoDBRiverDefinition8.getDEFAULT_SOCKET_TIMEOUT();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 60000 + "'", int9 == 60000);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoDb("hi!");
        builder5.isMongos = true;
        java.lang.String str8 = builder5.typeName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder5.mongoSSLVerifyCertificate(false);
        java.lang.String str11 = builder10.gettypeName();
        builder10.disableIndexRefresh = true;
        builder10.advancedTransformation = false;
        java.lang.String str16 = builder10.mongoLocalUser;
        java.util.Set<java.lang.String> strSet17 = null;
        builder10.includeFields = strSet17;
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue2 = mongoDBRiverDefinition1.getDEFAULT_BULK_SIZE();
        java.lang.String str3 = mongoDBRiverDefinition1.getINITIAL_TIMESTAMP_FIELD();
        int int4 = mongoDBRiverDefinition1.getSocketTimeout();
        boolean boolean5 = mongoDBRiverDefinition1.mongoSecondaryReadPreference;
        java.lang.String str6 = mongoDBRiverDefinition1.getINCLUDE_FIELDS_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition1.typeName;
        org.junit.Assert.assertNotNull(byteSizeValue2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "initial_timestamp" + "'", str3, "initial_timestamp");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "include_fields" + "'", str6, "include_fields");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        builder0.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.skipInitialImport(false);
        java.lang.String str8 = builder7.getstatisticsTypeName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder7.importAllCollections(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder7.connectTimeout(0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder7.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet15 = builder7.getparentTypes();
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNull(strSet15);
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        builder0.parentTypes = strSet14;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder0.script("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.indexName("password");
        builder20.setimportAllCollections(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder20.mongoSSLVerifyCertificate(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder20.dropCollection(true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getimportAllCollections();
        java.lang.String str2 = builder0.getmongoAdminUser();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoGridFS(false);
        builder0.mongoGridFS = true;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.socketTimeout(30000);
        boolean boolean10 = builder9.mongoUseSSL;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.getSSL_CONNECTION_FIELD();
        boolean boolean3 = mongoDBRiverDefinition1.isStoreStatistics();
        boolean boolean4 = mongoDBRiverDefinition1.mongoGridFS;
        java.lang.String str5 = mongoDBRiverDefinition1.getFILTER_FIELD();
        java.lang.String str6 = mongoDBRiverDefinition1.getOPTIONS_FIELD();
        java.lang.Boolean boolean7 = mongoDBRiverDefinition1.getisMongos();
        java.lang.String str8 = mongoDBRiverDefinition1.getOPTIONS_FIELD();
        boolean boolean9 = mongoDBRiverDefinition1.getadvancedTransformation();
        java.lang.String str10 = mongoDBRiverDefinition1.getSOCKET_TIMEOUT();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ssl" + "'", str2, "ssl");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "filter" + "'", str5, "filter");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "options" + "'", str6, "options");
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "options" + "'", str8, "options");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "socket_timeout" + "'", str10, "socket_timeout");
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.getDISABLE_INDEX_REFRESH_FIELD();
        java.lang.Boolean boolean4 = mongoDBRiverDefinition2.isMongos();
        int int5 = mongoDBRiverDefinition2.getDEFAULT_CONCURRENT_REQUESTS();
        boolean boolean6 = mongoDBRiverDefinition2.isAdvancedTransformation();
        boolean boolean7 = mongoDBRiverDefinition2.getimportAllCollections();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "disable_index_refresh" + "'", str3, "disable_index_refresh");
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        builder0.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.skipInitialImport(false);
        com.mongodb.BasicDBObject basicDBObject8 = builder0.getmongoCollectionFilter();
        builder0.setmongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str12 = mongoDBRiverDefinition11.getUSER_FIELD();
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(basicDBObject8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "user" + "'", str12, "user");
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript2 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript2.setNextScore((float) 1000);
        docScoreSearchScript2.setNextScore((float) 1000);
        docScoreSearchScript0.setNextVar("include_fields", (java.lang.Object) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        builder9.parentTypes = strSet23;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder9.throttleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.typeName("disable_index_refresh");
        docScoreSearchScript0.setNextVar("parent_types", (java.lang.Object) builder29);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition33 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder32);
        builder32.setskipInitialImport(true);
        builder32.scriptType = "admin";
        builder32.setstoreStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder32.isMongos((java.lang.Boolean) false);
        java.lang.String str42 = builder32.mongoAdminUser;
        docScoreSearchScript0.setNextVar("drop_collection", (java.lang.Object) str42);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition45 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder44);
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue46 = mongoDBRiverDefinition45.getDEFAULT_BULK_SIZE();
        int int47 = mongoDBRiverDefinition45.getDEFAULT_SOCKET_TIMEOUT();
        java.lang.String str48 = mongoDBRiverDefinition45.getINDEX_OBJECT();
        boolean boolean49 = mongoDBRiverDefinition45.getadvancedTransformation();
        com.mongodb.MongoClientOptions mongoClientOptions50 = mongoDBRiverDefinition45.getMongoClientOptions();
        java.lang.Object obj51 = docScoreSearchScript0.unwrap((java.lang.Object) mongoClientOptions50);
        // The following exception was thrown during execution in test generation
        try {
            double double52 = docScoreSearchScript0.runAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(byteSizeValue46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 60000 + "'", int47 == 60000);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "index" + "'", str48, "index");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(mongoClientOptions50);
        org.junit.Assert.assertNull(obj51);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        builder0.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.skipInitialImport(false);
        com.mongodb.BasicDBObject basicDBObject8 = builder0.getmongoCollectionFilter();
        builder0.setscriptType("collection");
        com.mongodb.BasicDBObject basicDBObject11 = builder0.mongoOplogFilter;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder0.includeCollection("");
        java.lang.String str14 = builder0.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean16 = mongoDBRiverDefinition15.isImportAllCollections();
        java.lang.String str17 = mongoDBRiverDefinition15.mongoAdminUser;
        java.lang.String str18 = mongoDBRiverDefinition15.getINITIAL_TIMESTAMP_SCRIPT_FIELD();
        boolean boolean19 = mongoDBRiverDefinition15.dropCollection;
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(basicDBObject8);
        org.junit.Assert.assertNull(basicDBObject11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "script" + "'", str18, "script");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("drop_collection", "script.disable_dynamic");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?script.disable_dynamic?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.getSSL_CONNECTION_FIELD();
        java.lang.String str3 = mongoDBRiverDefinition1.getBULK_SIZE_FIELD();
        java.util.Set<java.lang.String> strSet4 = mongoDBRiverDefinition1.parentTypes;
        java.lang.String str5 = mongoDBRiverDefinition1.getNAME_FIELD();
        org.elasticsearch.common.unit.TimeValue timeValue6 = mongoDBRiverDefinition1.getDEFAULT_FLUSH_INTERVAL();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ssl" + "'", str2, "ssl");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "bulk_size" + "'", str3, "bulk_size");
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "name" + "'", str5, "name");
        org.junit.Assert.assertNotNull(timeValue6);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = builder0.getindexName();
        java.lang.String str3 = builder0.getincludeCollection();
        builder0.disableIndexRefresh = true;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getimportAllCollections();
        java.lang.String str2 = builder0.getmongoAdminUser();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.skipInitialImport(false);
        java.lang.String str5 = builder4.getmongoLocalPassword();
        builder4.setconnectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder4.statisticsTypeName("throttle_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.statisticsIndexName("null.null");
        builder11.connectTimeout = 60000;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue2 = mongoDBRiverDefinition1.getDEFAULT_BULK_SIZE();
        java.lang.String str3 = mongoDBRiverDefinition1.getINITIAL_TIMESTAMP_FIELD();
        int int4 = mongoDBRiverDefinition1.getSocketTimeout();
        boolean boolean5 = mongoDBRiverDefinition1.isMongoUseSSL();
        boolean boolean6 = mongoDBRiverDefinition1.getmongoSSLVerifyCertificate();
        org.junit.Assert.assertNotNull(byteSizeValue2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "initial_timestamp" + "'", str3, "initial_timestamp");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.mongoLocalPassword;
        java.lang.String str4 = mongoDBRiverDefinition2.getINITIAL_TIMESTAMP_SCRIPT_FIELD();
        boolean boolean5 = mongoDBRiverDefinition2.getmongoSSLVerifyCertificate();
        com.mongodb.MongoClientOptions mongoClientOptions6 = mongoDBRiverDefinition2.mongoClientOptions;
        java.lang.Boolean boolean7 = mongoDBRiverDefinition2.isMongos;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "script" + "'", str4, "script");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(mongoClientOptions6);
        org.junit.Assert.assertNull(boolean7);
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.getSERVERS_FIELD();
        java.lang.String str3 = mongoDBRiverDefinition1.getGRIDFS_FIELD();
        java.lang.String str4 = mongoDBRiverDefinition1.getACTIONS_FIELD();
        java.lang.String str5 = mongoDBRiverDefinition1.getSCRIPT_TYPE_FIELD();
        java.lang.String str6 = mongoDBRiverDefinition1.getIMPORT_ALL_COLLECTIONS_FIELD();
        boolean boolean7 = mongoDBRiverDefinition1.getimportAllCollections();
        boolean boolean8 = mongoDBRiverDefinition1.mongoSecondaryReadPreference;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "servers" + "'", str2, "servers");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "gridfs" + "'", str3, "gridfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "actions" + "'", str4, "actions");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "script_type" + "'", str5, "script_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "import_all_collections" + "'", str6, "import_all_collections");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getimportAllCollections();
        java.lang.String str2 = builder0.getmongoAdminUser();
        java.lang.String str3 = builder0.typeName;
        boolean boolean4 = builder0.getstoreStatistics();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.socketTimeout(8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str11 = builder8.getmongoLocalUser();
        builder8.riverName = "store_statistics";
        java.util.List<com.mongodb.ServerAddress> serverAddressList14 = builder8.mongoServers;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder0.mongoServers(serverAddressList14);
        java.lang.String str16 = builder15.getstatisticsIndexName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(serverAddressList14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        builder0.scriptType = "admin";
        builder0.setstoreStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.isMongos((java.lang.Boolean) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean11 = mongoDBRiverDefinition10.isStoreStatistics();
        java.lang.String str12 = mongoDBRiverDefinition10.getScriptType();
        java.lang.String str13 = mongoDBRiverDefinition10.getPORT_FIELD();
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "port" + "'", str13, "port");
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("exclude_fields", "concurrent_requests");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?concurrent_requests?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("concurrent_requests");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?concurrent_requests?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        builder0.parentTypes = strSet14;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder0.script("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.indexName("password");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder18);
        boolean boolean22 = builder18.mongoSecondaryReadPreference;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder18.mongoLocalUser("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder18.mongoGridFS(true);
        boolean boolean27 = builder26.getdisableIndexRefresh();
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        builder0.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.skipInitialImport(false);
        com.mongodb.MongoClientOptions mongoClientOptions8 = null;
        builder0.setmongoClientOptions(mongoClientOptions8);
        builder0.statisticsIndexName = "ssl_verify_certificate";
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getimportAllCollections();
        java.lang.String str2 = builder0.getmongoAdminUser();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder4);
        builder4.setskipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder4.mongoDb("hi!");
        builder9.isMongos = true;
        builder9.indexName = "password";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder14);
        builder14.setskipInitialImport(true);
        builder14.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder14.skipInitialImport(false);
        com.mongodb.BasicDBObject basicDBObject22 = builder14.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder9.mongoOplogFilter(basicDBObject22);
        builder0.setmongoOplogFilter(basicDBObject22);
        boolean boolean25 = builder0.getmongoSSLVerifyCertificate();
        builder0.setmongoDb("throttle_size");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(basicDBObject22);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        builder0.parentTypes = strSet14;
        java.util.Set<java.lang.String> strSet17 = builder0.getexcludeFields();
        builder0.setstoreStatistics(false);
        java.lang.Boolean boolean20 = builder0.getisMongos();
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(strSet17);
        org.junit.Assert.assertNull(boolean20);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        builder0.parentTypes = strSet14;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder0.script("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.indexName("password");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder18);
        java.util.List<com.mongodb.ServerAddress> serverAddressList22 = mongoDBRiverDefinition21.getMongoServers();
        java.lang.String str23 = mongoDBRiverDefinition21.getSIZE_FIELD();
        java.lang.String str24 = mongoDBRiverDefinition21.getINCLUDE_FIELDS_FIELD();
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(serverAddressList22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "size" + "'", str23, "size");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "include_fields" + "'", str24, "include_fields");
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.mongoLocalPassword;
        java.lang.String str4 = mongoDBRiverDefinition2.riverName;
        java.lang.String str5 = mongoDBRiverDefinition2.getIncludeCollection();
        java.lang.String str6 = mongoDBRiverDefinition2.getRiverIndexName();
        java.lang.String str7 = mongoDBRiverDefinition2.getSECONDARY_READ_PREFERENCE_FIELD();
        java.lang.String str8 = mongoDBRiverDefinition2.mongoLocalPassword;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "secondary_read_preference" + "'", str7, "secondary_read_preference");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        builder0.parentTypes = strSet14;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder0.throttleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder0.mongoLocalPassword("script");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition22 = builder21.build();
        builder21.setmongoCollection("credentials");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition22);
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getimportAllCollections();
        java.lang.String str2 = builder0.getmongoAdminUser();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.throttleSize((int) (byte) 10);
        boolean boolean6 = builder5.skipInitialImport;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str8 = mongoDBRiverDefinition7.getGRIDFS_FIELD();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "gridfs" + "'", str8, "gridfs");
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getimportAllCollections();
        java.lang.String str2 = builder0.getmongoAdminUser();
        java.util.List<com.mongodb.ServerAddress> serverAddressList3 = builder0.getmongoServers();
        builder0.storeStatistics = true;
        builder0.setmongoSecondaryReadPreference(false);
        boolean boolean8 = builder0.storeStatistics;
        com.mongodb.BasicDBObject basicDBObject9 = builder0.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder0.riverIndexName("flush_interval");
        java.lang.String str12 = builder11.gettypeName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(serverAddressList3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(basicDBObject9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        builder0.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.skipInitialImport(false);
        java.lang.String str8 = builder7.getstatisticsTypeName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder7.importAllCollections(true);
        boolean boolean11 = builder10.disableIndexRefresh;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder10.includeCollection("hi!");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = builder10.initialTimestamp;
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNull(wildcardTimestamp14);
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        builder0.parentTypes = strSet14;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder0.script("port");
        builder18.setindexName("flush_interval");
        builder18.mongoLocalUser = "socket_timeout";
        boolean boolean23 = builder18.disableIndexRefresh;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder18.mongoSecondaryReadPreference(true);
        java.lang.String str26 = builder18.riverName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder27);
        builder27.setskipInitialImport(true);
        builder27.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder27.skipInitialImport(false);
        java.lang.String str35 = builder34.getstatisticsTypeName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder34.importAllCollections(true);
        builder34.setdropCollection(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition41 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder40);
        builder40.setskipInitialImport(true);
        builder40.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder40.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray61 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet62 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet62, strArray61);
        builder48.parentTypes = strSet62;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder65 = builder47.parentTypes((java.util.Set<java.lang.String>) strSet62);
        builder65.scriptType = "initial_timestamp";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder68 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition69 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder68);
        builder68.setskipInitialImport(true);
        builder68.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder75 = builder68.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder76 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray89 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet90 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet90, strArray89);
        builder76.parentTypes = strSet90;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder93 = builder75.parentTypes((java.util.Set<java.lang.String>) strSet90);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder94 = builder65.excludeFields((java.util.Set<java.lang.String>) strSet90);
        java.util.Set<java.lang.String> strSet95 = builder65.excludeFields;
        builder34.excludeFields = strSet95;
        builder18.setincludeFields(strSet95);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(builder75);
        org.junit.Assert.assertNotNull(strArray89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertNotNull(builder93);
        org.junit.Assert.assertNotNull(builder94);
        org.junit.Assert.assertNotNull(strSet95);
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setriverIndexName("admin");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.importAllCollections(false);
        boolean boolean7 = builder0.getmongoSSLVerifyCertificate();
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        builder0.parentTypes = strSet14;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder0.script("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.indexName("password");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder18);
        com.mongodb.MongoClientOptions mongoClientOptions22 = mongoDBRiverDefinition21.mongoClientOptions;
        java.lang.String str23 = mongoDBRiverDefinition21.getMongoLocalUser();
        java.lang.String str24 = mongoDBRiverDefinition21.getCREDENTIALS_FIELD();
        java.lang.Class<?> wildcardClass25 = mongoDBRiverDefinition21.getClass();
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNull(mongoClientOptions22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "credentials" + "'", str24, "credentials");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getimportAllCollections();
        java.lang.String str2 = builder0.getmongoAdminUser();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean4 = mongoDBRiverDefinition3.storeStatistics;
        java.lang.String str5 = mongoDBRiverDefinition3.getMongoCollection();
        int int6 = mongoDBRiverDefinition3.getDEFAULT_CONNECT_TIMEOUT();
        java.lang.String str7 = mongoDBRiverDefinition3.scriptType;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 30000 + "'", int6 == 30000);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        builder0.parentTypes = strSet14;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder0.script("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.indexName("password");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder18);
        boolean boolean22 = builder18.mongoSecondaryReadPreference;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder18.mongoLocalUser("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder18.mongoGridFS(true);
        boolean boolean27 = builder26.getdisableIndexRefresh();
        java.lang.String str28 = builder26.riverIndexName;
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoDb("hi!");
        builder5.isMongos = true;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = builder8.getindexName();
        boolean boolean11 = builder8.getmongoSSLVerifyCertificate();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder8.socketTimeout(10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet28, strArray27);
        builder14.parentTypes = strSet28;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder14.script("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray46 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet47 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet47, strArray46);
        builder33.parentTypes = strSet47;
        builder32.setexcludeFields((java.util.Set<java.lang.String>) strSet47);
        builder13.includeFields = strSet47;
        builder5.setparentTypes((java.util.Set<java.lang.String>) strSet47);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder5.dropCollection(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder5.statisticsTypeName("type");
        org.bson.types.BSONTimestamp bSONTimestamp57 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = builder5.initialTimestamp(bSONTimestamp57);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ts must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder56);
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.getSERVERS_FIELD();
        java.lang.String str3 = mongoDBRiverDefinition1.getGRIDFS_FIELD();
        java.lang.String str4 = mongoDBRiverDefinition1.getACTIONS_FIELD();
        java.lang.String str5 = mongoDBRiverDefinition1.getSCRIPT_TYPE_FIELD();
        java.lang.String str6 = mongoDBRiverDefinition1.getLOCAL_DB_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition1.getFLUSH_INTERVAL_FIELD();
        java.lang.String str8 = mongoDBRiverDefinition1.mongoAdminPassword;
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue9 = mongoDBRiverDefinition1.getDEFAULT_BULK_SIZE();
        java.lang.String str10 = mongoDBRiverDefinition1.getADVANCED_TRANSFORMATION_FIELD();
        boolean boolean11 = mongoDBRiverDefinition1.getdropCollection();
        boolean boolean12 = mongoDBRiverDefinition1.isAdvancedTransformation();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "servers" + "'", str2, "servers");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "gridfs" + "'", str3, "gridfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "actions" + "'", str4, "actions");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "script_type" + "'", str5, "script_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "local" + "'", str6, "local");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "flush_interval" + "'", str7, "flush_interval");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(byteSizeValue9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "advanced_transformation" + "'", str10, "advanced_transformation");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        builder0.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.skipInitialImport(false);
        java.lang.String str8 = builder7.getstatisticsTypeName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder7.importAllCollections(true);
        boolean boolean11 = builder10.disableIndexRefresh;
        builder10.setmongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder10.storeStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.statisticsIndexName("concurrent_requests");
        java.lang.String str19 = builder18.mongoAdminUser;
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("", "admin");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?admin?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getimportAllCollections();
        java.lang.String str2 = builder0.getmongoAdminUser();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean4 = mongoDBRiverDefinition3.storeStatistics;
        java.lang.String str5 = mongoDBRiverDefinition3.getMongoCollection();
        java.lang.String str6 = mongoDBRiverDefinition3.getADVANCED_TRANSFORMATION_FIELD();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = mongoDBRiverDefinition3.getInitialTimestamp();
        java.lang.String str8 = mongoDBRiverDefinition3.getScript();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "advanced_transformation" + "'", str6, "advanced_transformation");
        org.junit.Assert.assertNull(wildcardTimestamp7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        builder0.parentTypes = strSet14;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder0.script("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.indexName("password");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder18);
        com.mongodb.MongoClientOptions mongoClientOptions22 = mongoDBRiverDefinition21.mongoClientOptions;
        java.lang.String str23 = mongoDBRiverDefinition21.getMongoLocalUser();
        java.lang.String str24 = mongoDBRiverDefinition21.getDEFAULT_DB_HOST();
        int int25 = mongoDBRiverDefinition21.getDEFAULT_CONCURRENT_REQUESTS();
        boolean boolean26 = mongoDBRiverDefinition21.isStoreStatistics();
        org.elasticsearch.common.unit.TimeValue timeValue27 = mongoDBRiverDefinition21.getDEFAULT_FLUSH_INTERVAL();
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNull(mongoClientOptions22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "localhost" + "'", str24, "localhost");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 8 + "'", int25 == 8);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(timeValue27);
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getimportAllCollections();
        java.lang.String str2 = builder0.getmongoAdminUser();
        java.util.List<com.mongodb.ServerAddress> serverAddressList3 = builder0.getmongoServers();
        java.util.List<com.mongodb.ServerAddress> serverAddressList4 = builder0.getmongoServers();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.connectTimeout(0);
        int int7 = builder0.throttleSize;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(serverAddressList3);
        org.junit.Assert.assertNotNull(serverAddressList4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        builder0.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.skipInitialImport(false);
        builder0.setisMongos((java.lang.Boolean) false);
        org.elasticsearch.common.settings.Settings settings10 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder11);
        builder11.setskipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder11.mongoDb("hi!");
        builder16.isMongos = true;
        java.lang.String str19 = builder16.typeName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder16.mongoSSLVerifyCertificate(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet36 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet36, strArray35);
        builder22.parentTypes = strSet36;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder22.script("port");
        builder40.setriverName("disable_index_refresh");
        org.elasticsearch.common.settings.Settings settings43 = null;
        org.elasticsearch.common.settings.Settings settings44 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition46 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder45);
        builder45.setskipInitialImport(true);
        builder45.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder45.skipInitialImport(false);
        com.mongodb.BasicDBObject basicDBObject53 = builder45.getmongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings54 = new org.elasticsearch.river.RiverSettings(settings44, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject53);
        org.elasticsearch.river.RiverSettings riverSettings55 = new org.elasticsearch.river.RiverSettings(settings43, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject53);
        builder40.setmongoCollectionFilter(basicDBObject53);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder16.mongoCollectionFilter(basicDBObject53);
        org.elasticsearch.river.RiverSettings riverSettings58 = new org.elasticsearch.river.RiverSettings(settings10, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject53);
        builder0.mongoOplogFilter = basicDBObject53;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition60 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = builder0.script("actions");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder64 = builder62.mongoLocalPassword("type");
        builder64.setincludeCollection("flush_interval");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(basicDBObject53);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(builder64);
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.scriptType;
        java.lang.String str3 = mongoDBRiverDefinition1.getSSL_CONNECTION_FIELD();
        boolean boolean4 = mongoDBRiverDefinition1.isImportAllCollections();
        boolean boolean5 = mongoDBRiverDefinition1.isMongoGridFS();
        boolean boolean6 = mongoDBRiverDefinition1.getmongoSecondaryReadPreference();
        boolean boolean7 = mongoDBRiverDefinition1.mongoSecondaryReadPreference;
        java.lang.String str8 = mongoDBRiverDefinition1.getSECONDARY_READ_PREFERENCE_FIELD();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ssl" + "'", str3, "ssl");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "secondary_read_preference" + "'", str8, "secondary_read_preference");
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.getSERVERS_FIELD();
        java.lang.String str3 = mongoDBRiverDefinition1.getGRIDFS_FIELD();
        java.lang.String str4 = mongoDBRiverDefinition1.getACTIONS_FIELD();
        java.lang.String str5 = mongoDBRiverDefinition1.getSCRIPT_TYPE_FIELD();
        java.lang.String str6 = mongoDBRiverDefinition1.getLOCAL_DB_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition1.getNAME_FIELD();
        java.lang.String str8 = mongoDBRiverDefinition1.getOPTIONS_FIELD();
        boolean boolean9 = mongoDBRiverDefinition1.getstoreStatistics();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "servers" + "'", str2, "servers");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "gridfs" + "'", str3, "gridfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "actions" + "'", str4, "actions");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "script_type" + "'", str5, "script_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "local" + "'", str6, "local");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "name" + "'", str7, "name");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "options" + "'", str8, "options");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.getSSL_CONNECTION_FIELD();
        boolean boolean3 = mongoDBRiverDefinition1.isStoreStatistics();
        java.lang.String str4 = mongoDBRiverDefinition1.mongoDb;
        boolean boolean5 = mongoDBRiverDefinition1.disableIndexRefresh;
        boolean boolean6 = mongoDBRiverDefinition1.getimportAllCollections();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ssl" + "'", str2, "ssl");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 1000);
        java.lang.Object obj4 = null;
        docScoreSearchScript0.setNextVar("concurrent_requests", obj4);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder6);
        java.lang.Object obj8 = docScoreSearchScript0.unwrap((java.lang.Object) builder6);
        org.elasticsearch.common.logging.ESLogger eSLogger10 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.logger;
        docScoreSearchScript0.setNextVar("collection", (java.lang.Object) eSLogger10);
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextDocId(30000);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(eSLogger10);
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        builder0.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.skipInitialImport(false);
        java.lang.String str8 = builder7.getstatisticsTypeName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder7.importAllCollections(true);
        boolean boolean11 = builder10.disableIndexRefresh;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder10.mongoLocalUser("script.default_lang");
        builder10.setstatisticsTypeName("bulk_size");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.getSSL_CONNECTION_FIELD();
        boolean boolean3 = mongoDBRiverDefinition1.isStoreStatistics();
        java.lang.String str4 = mongoDBRiverDefinition1.getLOCAL_DB_FIELD();
        java.lang.String str5 = mongoDBRiverDefinition1.getStatisticsIndexName();
        java.lang.Boolean boolean6 = mongoDBRiverDefinition1.isMongos();
        java.lang.String str7 = mongoDBRiverDefinition1.getACTIONS_FIELD();
        java.lang.String str8 = mongoDBRiverDefinition1.getSIZE_FIELD();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ssl" + "'", str2, "ssl");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "local" + "'", str4, "local");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(boolean6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "actions" + "'", str7, "actions");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "size" + "'", str8, "size");
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        builder0.parentTypes = strSet14;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder0.throttleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder20);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder20.dropCollection(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.dropCollection(false);
        java.lang.String str26 = builder25.getstatisticsTypeName();
        builder25.connectTimeout = 1000;
        java.lang.String str29 = builder25.scriptType;
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("drop_collection");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?drop_collection?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getimportAllCollections();
        java.lang.String str2 = builder0.getmongoAdminUser();
        java.lang.String str3 = builder0.typeName;
        boolean boolean4 = builder0.getstoreStatistics();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str6 = mongoDBRiverDefinition5.getINITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition5.getCONNECT_TIMEOUT();
        java.lang.String str8 = mongoDBRiverDefinition5.mongoCollection;
        java.lang.String str9 = mongoDBRiverDefinition5.getStatisticsTypeName();
        java.lang.String str10 = mongoDBRiverDefinition5.getFLUSH_INTERVAL_FIELD();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "script_type" + "'", str6, "script_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "connect_timeout" + "'", str7, "connect_timeout");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "flush_interval" + "'", str10, "flush_interval");
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        builder0.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.skipInitialImport(false);
        com.mongodb.BasicDBObject basicDBObject8 = builder0.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.storeStatistics(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.mongoDb("");
        builder12.typeName = "drop_collection";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder12.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder12.importAllCollections(false);
        java.lang.String str21 = builder12.mongoDb;
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(basicDBObject8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("name");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?name? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        builder0.parentTypes = strSet14;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder0.throttleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.typeName("disable_index_refresh");
        java.lang.String str21 = builder18.getstatisticsIndexName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder18.mongoLocalPassword("admin");
        com.mongodb.MongoClientOptions mongoClientOptions24 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder18.mongoClientOptions(mongoClientOptions24);
        java.lang.String str26 = builder25.getindexName();
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        builder0.parentTypes = strSet14;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder0.script("port");
        builder18.setriverName("disable_index_refresh");
        org.elasticsearch.common.settings.Settings settings21 = null;
        org.elasticsearch.common.settings.Settings settings22 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder23);
        builder23.setskipInitialImport(true);
        builder23.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder23.skipInitialImport(false);
        com.mongodb.BasicDBObject basicDBObject31 = builder23.getmongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings32 = new org.elasticsearch.river.RiverSettings(settings22, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject31);
        org.elasticsearch.river.RiverSettings riverSettings33 = new org.elasticsearch.river.RiverSettings(settings21, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject31);
        builder18.setmongoCollectionFilter(basicDBObject31);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder18.mongoUseSSL(true);
        builder36.riverName = "servers";
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(basicDBObject31);
        org.junit.Assert.assertNotNull(builder36);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.getDISABLE_INDEX_REFRESH_FIELD();
        java.lang.Boolean boolean4 = mongoDBRiverDefinition2.isMongos();
        int int5 = mongoDBRiverDefinition2.getDEFAULT_CONCURRENT_REQUESTS();
        boolean boolean6 = mongoDBRiverDefinition2.isAdvancedTransformation();
        java.lang.String str7 = mongoDBRiverDefinition2.getSSL_CONNECTION_FIELD();
        java.lang.Boolean boolean8 = mongoDBRiverDefinition2.isMongos();
        java.lang.Boolean boolean9 = mongoDBRiverDefinition2.getisMongos();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "disable_index_refresh" + "'", str3, "disable_index_refresh");
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ssl" + "'", str7, "ssl");
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertNull(boolean9);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        builder0.parentTypes = strSet14;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder0.throttleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.indexName("index");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean24 = builder23.getimportAllCollections();
        java.lang.String str25 = builder23.getmongoAdminUser();
        java.util.List<com.mongodb.ServerAddress> serverAddressList26 = builder23.getmongoServers();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder22.mongoServers(serverAddressList26);
        builder27.setdisableIndexRefresh(false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(serverAddressList26);
        org.junit.Assert.assertNotNull(builder27);
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoDb("hi!");
        builder5.isMongos = true;
        java.lang.String str8 = builder5.typeName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder5.mongoSSLVerifyCertificate(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet25 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet25, strArray24);
        builder11.parentTypes = strSet25;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder11.script("port");
        builder29.setriverName("disable_index_refresh");
        org.elasticsearch.common.settings.Settings settings32 = null;
        org.elasticsearch.common.settings.Settings settings33 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition35 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder34);
        builder34.setskipInitialImport(true);
        builder34.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder34.skipInitialImport(false);
        com.mongodb.BasicDBObject basicDBObject42 = builder34.getmongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings43 = new org.elasticsearch.river.RiverSettings(settings33, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject42);
        org.elasticsearch.river.RiverSettings riverSettings44 = new org.elasticsearch.river.RiverSettings(settings32, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject42);
        builder29.setmongoCollectionFilter(basicDBObject42);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder5.mongoCollectionFilter(basicDBObject42);
        int int47 = builder5.getsocketTimeout();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition48 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str49 = builder5.typeName;
        java.lang.String str50 = builder5.getmongoAdminPassword();
        builder5.setmongoDb("initial_timestamp");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(basicDBObject42);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        builder0.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.skipInitialImport(false);
        com.mongodb.BasicDBObject basicDBObject8 = builder0.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        int int12 = mongoDBRiverDefinition11.throttleSize;
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(basicDBObject8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        builder0.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.skipInitialImport(false);
        com.mongodb.BasicDBObject basicDBObject8 = builder0.getmongoCollectionFilter();
        builder0.setscriptType("collection");
        com.mongodb.BasicDBObject basicDBObject11 = builder0.mongoOplogFilter;
        boolean boolean12 = builder0.mongoSSLVerifyCertificate;
        builder0.setdisableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder0.mongoAdminUser("");
        java.lang.String str17 = builder0.getscript();
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(basicDBObject8);
        org.junit.Assert.assertNull(basicDBObject11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.getDISABLE_INDEX_REFRESH_FIELD();
        java.util.Set<java.lang.String> strSet4 = mongoDBRiverDefinition2.getParentTypes();
        java.lang.String str5 = mongoDBRiverDefinition2.getMongoLocalUser();
        boolean boolean6 = mongoDBRiverDefinition2.dropCollection;
        java.lang.String str7 = mongoDBRiverDefinition2.getINCLUDE_COLLECTION_FIELD();
        java.lang.String str8 = mongoDBRiverDefinition2.statisticsIndexName;
        boolean boolean9 = mongoDBRiverDefinition2.mongoGridFS;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "disable_index_refresh" + "'", str3, "disable_index_refresh");
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "include_collection" + "'", str7, "include_collection");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder2.setriverIndexName("admin");
        builder2.storeStatistics = false;
        docScoreSearchScript0.setNextVar("import_all_collections", (java.lang.Object) false);
        docScoreSearchScript0.setNextScore((float) '4');
        org.apache.lucene.index.AtomicReaderContext atomicReaderContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextReader(atomicReaderContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.scriptType;
        java.lang.String str3 = mongoDBRiverDefinition1.getSSL_CONNECTION_FIELD();
        boolean boolean4 = mongoDBRiverDefinition1.isImportAllCollections();
        boolean boolean5 = mongoDBRiverDefinition1.isMongoGridFS();
        java.lang.String str6 = mongoDBRiverDefinition1.getGRIDFS_FIELD();
        java.util.Set<java.lang.String> strSet7 = mongoDBRiverDefinition1.parentTypes;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ssl" + "'", str3, "ssl");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "gridfs" + "'", str6, "gridfs");
        org.junit.Assert.assertNull(strSet7);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        builder0.scriptType = "admin";
        builder0.setstoreStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.isMongos((java.lang.Boolean) false);
        java.util.Set<java.lang.String> strSet10 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.parentTypes(strSet10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.statisticsTypeName("initial_timestamp");
        java.lang.String str14 = builder11.mongoLocalPassword;
        java.lang.Boolean boolean15 = builder11.getisMongos();
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + boolean15 + "' != '" + false + "'", boolean15, false);
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getimportAllCollections();
        java.lang.String str2 = builder0.getmongoAdminUser();
        java.lang.String str3 = builder0.typeName;
        boolean boolean4 = builder0.getstoreStatistics();
        builder0.mongoAdminPassword = "script_type";
        boolean boolean7 = builder0.getstoreStatistics();
        com.mongodb.MongoClientOptions mongoClientOptions8 = null;
        builder0.setmongoClientOptions(mongoClientOptions8);
        java.lang.String str10 = builder0.getstatisticsIndexName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        builder0.parentTypes = strSet14;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder0.script("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.indexName("password");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder18);
        com.mongodb.MongoClientOptions mongoClientOptions22 = mongoDBRiverDefinition21.mongoClientOptions;
        java.lang.String str23 = mongoDBRiverDefinition21.getMongoLocalUser();
        java.lang.String str24 = mongoDBRiverDefinition21.getDEFAULT_DB_HOST();
        int int25 = mongoDBRiverDefinition21.getDEFAULT_CONCURRENT_REQUESTS();
        boolean boolean26 = mongoDBRiverDefinition21.isSkipInitialImport();
        java.lang.String str27 = mongoDBRiverDefinition21.getCREDENTIALS_FIELD();
        java.lang.String str28 = mongoDBRiverDefinition21.getLOCAL_DB_FIELD();
        java.lang.String str29 = mongoDBRiverDefinition21.getHOST_FIELD();
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNull(mongoClientOptions22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "localhost" + "'", str24, "localhost");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 8 + "'", int25 == 8);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "credentials" + "'", str27, "credentials");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "local" + "'", str28, "local");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "host" + "'", str29, "host");
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str4 = builder0.getindexName();
        java.lang.Boolean boolean5 = builder0.isMongos;
        builder0.storeStatistics = false;
        java.lang.String str8 = builder0.statisticsTypeName;
        boolean boolean9 = builder0.storeStatistics;
        builder0.setindexName("credentials");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = builder0.getindexName();
        boolean boolean3 = builder0.getmongoSSLVerifyCertificate();
        java.lang.String str4 = builder0.typeName;
        builder0.riverName = "";
        builder0.setsocketTimeout(1000);
        builder0.skipInitialImport = false;
        com.mongodb.MongoClientOptions mongoClientOptions11 = builder0.mongoClientOptions;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(mongoClientOptions11);
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.getDISABLE_INDEX_REFRESH_FIELD();
        java.lang.Boolean boolean4 = mongoDBRiverDefinition2.isMongos();
        com.mongodb.MongoClientOptions mongoClientOptions5 = mongoDBRiverDefinition2.mongoClientOptions;
        java.util.Set<java.lang.String> strSet6 = mongoDBRiverDefinition2.getExcludeFields();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "disable_index_refresh" + "'", str3, "disable_index_refresh");
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertNull(mongoClientOptions5);
        org.junit.Assert.assertNull(strSet6);
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        builder0.parentTypes = strSet14;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder0.script("port");
        java.lang.Boolean boolean19 = builder0.isMongos;
        java.util.Set<java.lang.String> strSet20 = builder0.getincludeFields();
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNull(boolean19);
        org.junit.Assert.assertNull(strSet20);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.getSERVERS_FIELD();
        java.lang.String str3 = mongoDBRiverDefinition1.getGRIDFS_FIELD();
        java.lang.String str4 = mongoDBRiverDefinition1.getACTIONS_FIELD();
        java.lang.String str5 = mongoDBRiverDefinition1.getSCRIPT_TYPE_FIELD();
        java.lang.String str6 = mongoDBRiverDefinition1.getLOCAL_DB_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition1.getRiverIndexName();
        boolean boolean8 = mongoDBRiverDefinition1.mongoGridFS;
        boolean boolean9 = mongoDBRiverDefinition1.isAdvancedTransformation();
        boolean boolean10 = mongoDBRiverDefinition1.isSkipInitialImport();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "servers" + "'", str2, "servers");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "gridfs" + "'", str3, "gridfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "actions" + "'", str4, "actions");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "script_type" + "'", str5, "script_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "local" + "'", str6, "local");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getimportAllCollections();
        java.lang.String str2 = builder0.getmongoAdminUser();
        java.lang.String str3 = builder0.typeName;
        boolean boolean4 = builder0.getstoreStatistics();
        boolean boolean5 = builder0.getdisableIndexRefresh();
        builder0.setriverIndexName("drop_collection");
        java.lang.String str8 = builder0.statisticsIndexName;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.scriptType;
        java.lang.String str3 = mongoDBRiverDefinition1.getSSL_CONNECTION_FIELD();
        java.lang.String str4 = mongoDBRiverDefinition1.getDB_FIELD();
        java.util.List<com.mongodb.ServerAddress> serverAddressList5 = mongoDBRiverDefinition1.mongoServers;
        boolean boolean6 = mongoDBRiverDefinition1.mongoSecondaryReadPreference;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ssl" + "'", str3, "ssl");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "db" + "'", str4, "db");
        org.junit.Assert.assertNotNull(serverAddressList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = builder0.getindexName();
        boolean boolean3 = builder0.getmongoSSLVerifyCertificate();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.socketTimeout(10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        builder6.parentTypes = strSet20;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder6.script("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet39 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet39, strArray38);
        builder25.parentTypes = strSet39;
        builder24.setexcludeFields((java.util.Set<java.lang.String>) strSet39);
        builder5.includeFields = strSet39;
        java.lang.String str44 = builder5.riverName;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNull(str44);
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.getFLUSH_INTERVAL_FIELD();
        boolean boolean4 = mongoDBRiverDefinition2.advancedTransformation;
        boolean boolean5 = mongoDBRiverDefinition2.isMongoUseSSL();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "flush_interval" + "'", str3, "flush_interval");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.getSERVERS_FIELD();
        java.lang.String str4 = mongoDBRiverDefinition2.mongoLocalPassword;
        boolean boolean5 = mongoDBRiverDefinition2.getmongoSecondaryReadPreference();
        boolean boolean6 = mongoDBRiverDefinition2.importAllCollections;
        java.lang.String str7 = mongoDBRiverDefinition2.getSCRIPT_FIELD();
        boolean boolean8 = mongoDBRiverDefinition2.storeStatistics;
        java.lang.String str9 = mongoDBRiverDefinition2.getDEFAULT_DB_HOST();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "servers" + "'", str3, "servers");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "script" + "'", str7, "script");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "localhost" + "'", str9, "localhost");
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        builder0.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.skipInitialImport(false);
        java.lang.String str8 = builder7.getstatisticsTypeName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder7.importAllCollections(true);
        boolean boolean11 = builder10.disableIndexRefresh;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        builder12.parentTypes = strSet26;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder10.parentTypes((java.util.Set<java.lang.String>) strSet26);
        builder29.mongoLocalUser = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder29.importAllCollections(true);
        boolean boolean34 = builder33.disableIndexRefresh;
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("filter", "size");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?size?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.getSSL_CONNECTION_FIELD();
        boolean boolean3 = mongoDBRiverDefinition1.isStoreStatistics();
        java.lang.String str4 = mongoDBRiverDefinition1.getLOCAL_DB_FIELD();
        java.lang.String str5 = mongoDBRiverDefinition1.getStatisticsIndexName();
        java.lang.Boolean boolean6 = mongoDBRiverDefinition1.isMongos();
        java.lang.String str7 = mongoDBRiverDefinition1.getACTIONS_FIELD();
        int int8 = mongoDBRiverDefinition1.getDEFAULT_CONCURRENT_REQUESTS();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = mongoDBRiverDefinition1.getInitialTimestamp();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ssl" + "'", str2, "ssl");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "local" + "'", str4, "local");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(boolean6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "actions" + "'", str7, "actions");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        builder0.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.skipInitialImport(false);
        java.lang.String str8 = builder7.getstatisticsTypeName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder7.importAllCollections(true);
        boolean boolean11 = builder10.disableIndexRefresh;
        builder10.setmongoUseSSL(false);
        builder10.setmongoDb("options");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        builder0.scriptType = "admin";
        builder0.setstoreStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.isMongos((java.lang.Boolean) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        builder10.parentTypes = strSet24;
        org.elasticsearch.common.settings.Settings settings27 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition29 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder28);
        builder28.setskipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder28.mongoDb("hi!");
        builder33.isMongos = true;
        java.lang.String str36 = builder33.typeName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder33.mongoSSLVerifyCertificate(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray52 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet53 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet53, strArray52);
        builder39.parentTypes = strSet53;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder39.script("port");
        builder57.setriverName("disable_index_refresh");
        org.elasticsearch.common.settings.Settings settings60 = null;
        org.elasticsearch.common.settings.Settings settings61 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition63 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder62);
        builder62.setskipInitialImport(true);
        builder62.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder69 = builder62.skipInitialImport(false);
        com.mongodb.BasicDBObject basicDBObject70 = builder62.getmongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings71 = new org.elasticsearch.river.RiverSettings(settings61, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject70);
        org.elasticsearch.river.RiverSettings riverSettings72 = new org.elasticsearch.river.RiverSettings(settings60, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject70);
        builder57.setmongoCollectionFilter(basicDBObject70);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder74 = builder33.mongoCollectionFilter(basicDBObject70);
        org.elasticsearch.river.RiverSettings riverSettings75 = new org.elasticsearch.river.RiverSettings(settings27, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject70);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder76 = builder10.mongoOplogFilter(basicDBObject70);
        builder9.mongoOplogFilter = basicDBObject70;
        boolean boolean78 = builder9.skipInitialImport;
        builder9.importAllCollections = false;
        builder9.skipInitialImport = true;
        org.bson.types.BSONTimestamp bSONTimestamp83 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder84 = builder9.initialTimestamp(bSONTimestamp83);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ts must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(basicDBObject70);
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertNotNull(builder76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setriverIndexName("admin");
        org.elasticsearch.common.settings.Settings settings3 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        builder4.parentTypes = strSet18;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder4.script("port");
        builder22.setriverName("disable_index_refresh");
        org.elasticsearch.common.settings.Settings settings25 = null;
        org.elasticsearch.common.settings.Settings settings26 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder27);
        builder27.setskipInitialImport(true);
        builder27.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder27.skipInitialImport(false);
        com.mongodb.BasicDBObject basicDBObject35 = builder27.getmongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings36 = new org.elasticsearch.river.RiverSettings(settings26, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject35);
        org.elasticsearch.river.RiverSettings riverSettings37 = new org.elasticsearch.river.RiverSettings(settings25, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject35);
        builder22.setmongoCollectionFilter(basicDBObject35);
        org.elasticsearch.river.RiverSettings riverSettings39 = new org.elasticsearch.river.RiverSettings(settings3, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject35);
        builder0.mongoCollectionFilter = basicDBObject35;
        com.mongodb.MongoClientOptions mongoClientOptions41 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder0.mongoClientOptions(mongoClientOptions41);
        com.mongodb.MongoClientOptions mongoClientOptions43 = null;
        builder42.mongoClientOptions = mongoClientOptions43;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition45 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder42);
        boolean boolean46 = mongoDBRiverDefinition45.isDropCollection();
        com.mongodb.BasicDBObject basicDBObject47 = mongoDBRiverDefinition45.mongoCollectionFilter;
        com.mongodb.BasicDBObject basicDBObject48 = mongoDBRiverDefinition45.mongoOplogFilter;
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(basicDBObject35);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(basicDBObject47);
        org.junit.Assert.assertNull(basicDBObject48);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getimportAllCollections();
        java.lang.String str2 = builder0.getmongoAdminUser();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean4 = mongoDBRiverDefinition3.dropCollection;
        java.lang.String str5 = mongoDBRiverDefinition3.mongoLocalPassword;
        java.lang.String str6 = mongoDBRiverDefinition3.mongoAdminPassword;
        java.lang.String str7 = mongoDBRiverDefinition3.getNAME_FIELD();
        java.lang.String str8 = mongoDBRiverDefinition3.getHOST_FIELD();
        java.lang.String str9 = mongoDBRiverDefinition3.getFILTER_FIELD();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "name" + "'", str7, "name");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "host" + "'", str8, "host");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "filter" + "'", str9, "filter");
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.riverName("bulk_size");
        java.lang.String str6 = builder5.getscript();
        builder5.setisMongos((java.lang.Boolean) true);
        java.lang.String str9 = builder5.getscriptType();
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("options", "import_all_collections");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?import_all_collections?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        builder0.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.skipInitialImport(false);
        java.lang.String str8 = builder7.getstatisticsTypeName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder7.importAllCollections(true);
        builder7.setdropCollection(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder7);
        boolean boolean14 = mongoDBRiverDefinition13.mongoSSLVerifyCertificate;
        java.lang.String str15 = mongoDBRiverDefinition13.getSTORE_STATISTICS_FIELD();
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "store_statistics" + "'", str15, "store_statistics");
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        builder0.parentTypes = strSet14;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder0.script("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.indexName("password");
        builder20.setimportAllCollections(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition23 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder20);
        java.util.Set<java.lang.String> strSet24 = builder20.getincludeFields();
        boolean boolean25 = builder20.mongoSSLVerifyCertificate;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition26 = builder20.build();
        java.lang.Class<?> wildcardClass27 = builder20.getClass();
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNull(strSet24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.mongoLocalPassword;
        java.lang.String str4 = mongoDBRiverDefinition2.getINITIAL_TIMESTAMP_SCRIPT_FIELD();
        java.lang.String str5 = mongoDBRiverDefinition2.getIncludeCollection();
        java.util.Set<java.lang.String> strSet6 = mongoDBRiverDefinition2.getIncludeFields();
        java.lang.String str7 = mongoDBRiverDefinition2.riverName;
        java.lang.Boolean boolean8 = mongoDBRiverDefinition2.isMongos;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "script" + "'", str4, "script");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(boolean8);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 1000);
        java.lang.Object obj4 = null;
        docScoreSearchScript0.setNextVar("concurrent_requests", obj4);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder6);
        java.lang.Object obj8 = docScoreSearchScript0.unwrap((java.lang.Object) builder6);
        org.elasticsearch.common.logging.ESLogger eSLogger10 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.logger;
        docScoreSearchScript0.setNextVar("collection", (java.lang.Object) eSLogger10);
        org.apache.lucene.search.Scorer scorer12 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setScorer(scorer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(eSLogger10);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.getSSL_CONNECTION_FIELD();
        java.lang.String str3 = mongoDBRiverDefinition1.getBULK_SIZE_FIELD();
        java.lang.String str4 = mongoDBRiverDefinition1.getBULK_FIELD();
        int int5 = mongoDBRiverDefinition1.getDEFAULT_CONNECT_TIMEOUT();
        java.lang.String str6 = mongoDBRiverDefinition1.getTypeName();
        java.lang.String str7 = mongoDBRiverDefinition1.getCONNECT_TIMEOUT();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ssl" + "'", str2, "ssl");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "bulk_size" + "'", str3, "bulk_size");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "bulk" + "'", str4, "bulk");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 30000 + "'", int5 == 30000);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "connect_timeout" + "'", str7, "connect_timeout");
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("size", "ssl");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?ssl?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        builder0.scriptType = "admin";
        builder0.setstoreStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.isMongos((java.lang.Boolean) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean11 = mongoDBRiverDefinition10.isStoreStatistics();
        java.lang.String str12 = mongoDBRiverDefinition10.getScriptType();
        java.lang.String str13 = mongoDBRiverDefinition10.getSIZE_FIELD();
        boolean boolean14 = mongoDBRiverDefinition10.importAllCollections;
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "admin" + "'", str12, "admin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "size" + "'", str13, "size");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getimportAllCollections();
        java.lang.String str2 = builder0.getmongoAdminUser();
        java.lang.Boolean boolean3 = builder0.isMongos;
        builder0.setscript("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.bson.types.BSONTimestamp bSONTimestamp7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.initialTimestamp(bSONTimestamp7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ts must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(boolean3);
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        builder0.parentTypes = strSet14;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder0.throttleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str20 = mongoDBRiverDefinition19.mongoLocalPassword;
        java.lang.String str21 = mongoDBRiverDefinition19.getCREDENTIALS_FIELD();
        java.lang.String str22 = mongoDBRiverDefinition19.getCONNECT_TIMEOUT();
        int int23 = mongoDBRiverDefinition19.getDEFAULT_CONCURRENT_REQUESTS();
        boolean boolean24 = mongoDBRiverDefinition19.getmongoSecondaryReadPreference();
        java.lang.String str25 = mongoDBRiverDefinition19.getINCLUDE_FIELDS_FIELD();
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "credentials" + "'", str21, "credentials");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "connect_timeout" + "'", str22, "connect_timeout");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 8 + "'", int23 == 8);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "include_fields" + "'", str25, "include_fields");
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        builder0.scriptType = "admin";
        builder0.setstoreStatistics(true);
        boolean boolean8 = builder0.importAllCollections;
        int int9 = builder0.throttleSize;
        java.lang.String str10 = builder0.mongoDb;
        java.lang.String str11 = builder0.mongoAdminPassword;
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoDb("hi!");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = builder0.initialTimestamp;
        builder0.throttleSize = (short) 100;
        java.lang.String str9 = builder0.typeName;
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("name", "host");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?host?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        builder0.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.skipInitialImport(false);
        com.mongodb.BasicDBObject basicDBObject8 = builder0.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.skipInitialImport(false);
        builder10.setdropCollection(true);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(basicDBObject8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        builder0.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.skipInitialImport(false);
        java.lang.String str8 = builder7.getstatisticsTypeName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder7.importAllCollections(true);
        boolean boolean11 = builder10.disableIndexRefresh;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        builder12.parentTypes = strSet26;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder10.parentTypes((java.util.Set<java.lang.String>) strSet26);
        builder29.mongoLocalUser = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder29.importAllCollections(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder29.mongoUseSSL(true);
        builder35.setmongoCollection("concurrent_requests");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = builder0.getindexName();
        boolean boolean3 = builder0.getmongoSSLVerifyCertificate();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.socketTimeout(10);
        java.lang.String str6 = builder0.indexName;
        builder0.dropCollection = false;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.mongoLocalUser("");
        int int13 = builder0.throttleSize;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getimportAllCollections();
        java.lang.String str2 = builder0.getmongoAdminUser();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.skipInitialImport(false);
        java.lang.String str5 = builder4.getmongoLocalPassword();
        builder4.setconnectTimeout((int) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder4.statisticsTypeName("throttle_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder4.mongoDb("script.disable_dynamic");
        builder11.riverIndexName = "import_all_collections";
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getimportAllCollections();
        java.lang.String str2 = builder0.getmongoAdminUser();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.skipInitialImport(false);
        java.lang.String str7 = builder6.getincludeCollection();
        java.lang.String str8 = builder6.riverName;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoDb("hi!");
        builder5.isMongos = true;
        java.lang.String str8 = builder5.typeName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder5.mongoSSLVerifyCertificate(false);
        java.lang.String str11 = builder10.gettypeName();
        java.lang.String str12 = builder10.includeCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder10);
        java.util.Set<java.lang.String> strSet14 = mongoDBRiverDefinition13.includeFields;
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(strSet14);
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.common.settings.Settings settings1 = null;
        org.elasticsearch.common.settings.Settings settings2 = null;
        org.elasticsearch.common.settings.Settings settings3 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        builder4.parentTypes = strSet18;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder4.script("port");
        builder22.setriverName("disable_index_refresh");
        org.elasticsearch.common.settings.Settings settings25 = null;
        org.elasticsearch.common.settings.Settings settings26 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder27);
        builder27.setskipInitialImport(true);
        builder27.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder27.skipInitialImport(false);
        com.mongodb.BasicDBObject basicDBObject35 = builder27.getmongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings36 = new org.elasticsearch.river.RiverSettings(settings26, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject35);
        org.elasticsearch.river.RiverSettings riverSettings37 = new org.elasticsearch.river.RiverSettings(settings25, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject35);
        builder22.setmongoCollectionFilter(basicDBObject35);
        org.elasticsearch.river.RiverSettings riverSettings39 = new org.elasticsearch.river.RiverSettings(settings3, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject35);
        org.elasticsearch.river.RiverSettings riverSettings40 = new org.elasticsearch.river.RiverSettings(settings2, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject35);
        org.elasticsearch.river.RiverSettings riverSettings41 = new org.elasticsearch.river.RiverSettings(settings1, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject35);
        org.elasticsearch.river.RiverSettings riverSettings42 = new org.elasticsearch.river.RiverSettings(settings0, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject35);
        org.elasticsearch.common.settings.Settings settings43 = riverSettings42.globalSettings();
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(basicDBObject35);
        org.junit.Assert.assertNull(settings43);
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        builder0.parentTypes = strSet14;
        boolean boolean17 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str19 = mongoDBRiverDefinition18.getCONCURRENT_REQUESTS_FIELD();
        boolean boolean20 = mongoDBRiverDefinition18.mongoGridFS;
        java.lang.String str21 = mongoDBRiverDefinition18.mongoCollection;
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "concurrent_requests" + "'", str19, "concurrent_requests");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        builder0.parentTypes = strSet14;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder0.script("port");
        builder18.setindexName("flush_interval");
        builder18.mongoLocalUser = "socket_timeout";
        boolean boolean23 = builder18.disableIndexRefresh;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder18.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition26 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder25);
        int int27 = mongoDBRiverDefinition26.connectTimeout;
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        builder0.parentTypes = strSet14;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder0.throttleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str20 = builder0.getindexName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder0.mongoLocalPassword("gridfs");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder22.dropCollection(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder22);
        builder22.mongoDb = "";
        boolean boolean28 = builder22.storeStatistics;
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        builder0.scriptType = "admin";
        builder0.setstoreStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.isMongos((java.lang.Boolean) false);
        java.lang.String str10 = builder9.getstatisticsTypeName();
        builder9.scriptType = "admin";
        org.bson.types.BSONTimestamp bSONTimestamp13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder9.initialTimestamp(bSONTimestamp13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ts must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean3 = builder0.getmongoUseSSL();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.connectTimeout((int) (byte) 1);
        builder0.setmongoSecondaryReadPreference(false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        builder0.parentTypes = strSet14;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder0.throttleSize((int) (byte) 0);
        int int19 = builder0.getconnectTimeout();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder20);
        builder20.setskipInitialImport(true);
        builder20.scriptType = "admin";
        java.lang.String[] strArray28 = new java.lang.String[] { "", "password" };
        java.util.LinkedHashSet<java.lang.String> strSet29 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet29, strArray28);
        builder20.setincludeFields((java.util.Set<java.lang.String>) strSet29);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder0.excludeFields((java.util.Set<java.lang.String>) strSet29);
        java.util.Set<java.lang.String> strSet33 = builder0.parentTypes;
        java.lang.String str34 = builder0.getstatisticsTypeName();
        org.bson.types.Binary binary35 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder0.initialTimestamp(binary35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        int int2 = builder0.getsocketTimeout();
        boolean boolean3 = builder0.advancedTransformation;
        builder0.setriverName("include_fields");
        builder0.setmongoAdminPassword("name");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("ssl_verify_certificate", "include_collection", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?include_collection?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getimportAllCollections();
        java.lang.String str2 = builder0.getmongoAdminUser();
        java.lang.String str3 = builder0.typeName;
        builder0.setmongoCollection("gridfs");
        builder0.setconnectTimeout((int) (short) -1);
        builder0.disableIndexRefresh = false;
        java.lang.String str10 = builder0.getstatisticsTypeName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("concurrent_requests", "port", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?port?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        builder0.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.skipInitialImport(false);
        java.lang.String str8 = builder7.getstatisticsTypeName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder7.importAllCollections(true);
        boolean boolean11 = builder10.disableIndexRefresh;
        builder10.setmongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder10.storeStatistics(true);
        builder10.statisticsIndexName = "";
        builder10.includeCollection = "initial_timestamp";
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = builder0.getindexName();
        boolean boolean3 = builder0.getmongoSSLVerifyCertificate();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.socketTimeout(10);
        int int6 = builder5.connectTimeout;
        java.util.Set<java.lang.String> strSet7 = builder5.getexcludeFields();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(strSet7);
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        builder0.scriptType = "admin";
        builder0.setstoreStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.isMongos((java.lang.Boolean) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean11 = mongoDBRiverDefinition10.isStoreStatistics();
        int int12 = mongoDBRiverDefinition10.getDEFAULT_SOCKET_TIMEOUT();
        boolean boolean13 = mongoDBRiverDefinition10.importAllCollections;
        java.util.Set<java.lang.String> strSet14 = mongoDBRiverDefinition10.includeFields;
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60000 + "'", int12 == 60000);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(strSet14);
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setriverIndexName("admin");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str5 = mongoDBRiverDefinition4.getHOST_FIELD();
        int int6 = mongoDBRiverDefinition4.getDEFAULT_DB_PORT();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "host" + "'", str5, "host");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 27017 + "'", int6 == 27017);
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.getSERVERS_FIELD();
        java.lang.String str3 = mongoDBRiverDefinition1.getGRIDFS_FIELD();
        java.lang.String str4 = mongoDBRiverDefinition1.getACTIONS_FIELD();
        java.lang.String str5 = mongoDBRiverDefinition1.getSCRIPT_TYPE_FIELD();
        java.lang.String str6 = mongoDBRiverDefinition1.getIMPORT_ALL_COLLECTIONS_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition1.getDISABLE_INDEX_REFRESH_FIELD();
        boolean boolean8 = mongoDBRiverDefinition1.skipInitialImport;
        boolean boolean9 = mongoDBRiverDefinition1.mongoSSLVerifyCertificate;
        java.lang.String str10 = mongoDBRiverDefinition1.getTHROTTLE_SIZE_FIELD();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "servers" + "'", str2, "servers");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "gridfs" + "'", str3, "gridfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "actions" + "'", str4, "actions");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "script_type" + "'", str5, "script_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "import_all_collections" + "'", str6, "import_all_collections");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "disable_index_refresh" + "'", str7, "disable_index_refresh");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "throttle_size" + "'", str10, "throttle_size");
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 1000);
        java.lang.Object obj4 = null;
        docScoreSearchScript0.setNextVar("concurrent_requests", obj4);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder6);
        java.lang.Object obj8 = docScoreSearchScript0.unwrap((java.lang.Object) builder6);
        org.elasticsearch.common.logging.ESLogger eSLogger10 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.logger;
        docScoreSearchScript0.setNextVar("collection", (java.lang.Object) eSLogger10);
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextDocId(60000);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(eSLogger10);
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.riverName("bulk_size");
        builder0.statisticsTypeName = "script.disable_dynamic";
        int int8 = builder0.getsocketTimeout();
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        builder0.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        builder8.parentTypes = strSet22;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder7.parentTypes((java.util.Set<java.lang.String>) strSet22);
        builder25.scriptType = "initial_timestamp";
        java.lang.String str28 = builder25.getmongoAdminUser();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition29 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder25);
        java.lang.String str30 = mongoDBRiverDefinition29.getBULK_FIELD();
        java.lang.Boolean boolean31 = mongoDBRiverDefinition29.getisMongos();
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "bulk" + "'", str30, "bulk");
        org.junit.Assert.assertNull(boolean31);
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoDb("hi!");
        builder5.isMongos = true;
        java.lang.String str8 = builder5.typeName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder5.mongoSSLVerifyCertificate(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet25 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet25, strArray24);
        builder11.parentTypes = strSet25;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder11.script("port");
        builder29.setriverName("disable_index_refresh");
        org.elasticsearch.common.settings.Settings settings32 = null;
        org.elasticsearch.common.settings.Settings settings33 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition35 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder34);
        builder34.setskipInitialImport(true);
        builder34.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder34.skipInitialImport(false);
        com.mongodb.BasicDBObject basicDBObject42 = builder34.getmongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings43 = new org.elasticsearch.river.RiverSettings(settings33, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject42);
        org.elasticsearch.river.RiverSettings riverSettings44 = new org.elasticsearch.river.RiverSettings(settings32, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject42);
        builder29.setmongoCollectionFilter(basicDBObject42);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder5.mongoCollectionFilter(basicDBObject42);
        int int47 = builder5.getsocketTimeout();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition48 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str49 = builder5.typeName;
        java.lang.String str50 = builder5.getmongoAdminPassword();
        boolean boolean51 = builder5.getimportAllCollections();
        java.lang.Boolean boolean52 = builder5.getisMongos();
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(basicDBObject42);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + boolean52 + "' != '" + true + "'", boolean52, true);
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.getSERVERS_FIELD();
        java.lang.String str3 = mongoDBRiverDefinition1.getGRIDFS_FIELD();
        java.lang.String str4 = mongoDBRiverDefinition1.getACTIONS_FIELD();
        java.lang.String str5 = mongoDBRiverDefinition1.getSCRIPT_TYPE_FIELD();
        java.lang.String str6 = mongoDBRiverDefinition1.getLOCAL_DB_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition1.getFLUSH_INTERVAL_FIELD();
        int int8 = mongoDBRiverDefinition1.getDEFAULT_SOCKET_TIMEOUT();
        java.lang.String str9 = mongoDBRiverDefinition1.getSCRIPT_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition1.getINDEX_OBJECT();
        org.elasticsearch.common.unit.TimeValue timeValue11 = mongoDBRiverDefinition1.getDEFAULT_FLUSH_INTERVAL();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "servers" + "'", str2, "servers");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "gridfs" + "'", str3, "gridfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "actions" + "'", str4, "actions");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "script_type" + "'", str5, "script_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "local" + "'", str6, "local");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "flush_interval" + "'", str7, "flush_interval");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 60000 + "'", int8 == 60000);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "script" + "'", str9, "script");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "index" + "'", str10, "index");
        org.junit.Assert.assertNotNull(timeValue11);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.riverIndexName;
        java.lang.String str4 = mongoDBRiverDefinition2.getNAME_FIELD();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue5 = mongoDBRiverDefinition2.getDEFAULT_BULK_SIZE();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "name" + "'", str4, "name");
        org.junit.Assert.assertNotNull(byteSizeValue5);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 1000);
        java.lang.Object obj4 = null;
        docScoreSearchScript0.setNextVar("concurrent_requests", obj4);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder6);
        java.lang.Object obj8 = docScoreSearchScript0.unwrap((java.lang.Object) builder6);
        // The following exception was thrown during execution in test generation
        try {
            float float9 = docScoreSearchScript0.runAsFloat();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getimportAllCollections();
        java.lang.String str2 = builder0.getmongoAdminUser();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoGridFS(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean7 = mongoDBRiverDefinition6.getmongoGridFS();
        boolean boolean8 = mongoDBRiverDefinition6.isDisableIndexRefresh();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getimportAllCollections();
        java.lang.String str2 = builder0.getmongoAdminUser();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.throttleSize((int) (byte) 10);
        builder0.setmongoAdminPassword("name");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 1000);
        docScoreSearchScript0.setNextScore((-1.0f));
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
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue2 = mongoDBRiverDefinition1.getDEFAULT_BULK_SIZE();
        int int3 = mongoDBRiverDefinition1.getDEFAULT_SOCKET_TIMEOUT();
        java.lang.String str4 = mongoDBRiverDefinition1.getINDEX_OBJECT();
        int int5 = mongoDBRiverDefinition1.getThrottleSize();
        java.lang.String str6 = mongoDBRiverDefinition1.mongoDb;
        org.elasticsearch.common.unit.TimeValue timeValue7 = mongoDBRiverDefinition1.getDEFAULT_FLUSH_INTERVAL();
        org.junit.Assert.assertNotNull(byteSizeValue2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "index" + "'", str4, "index");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(timeValue7);
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 1000);
        java.lang.Object obj4 = null;
        docScoreSearchScript0.setNextVar("concurrent_requests", obj4);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder6);
        java.lang.Object obj8 = docScoreSearchScript0.unwrap((java.lang.Object) builder6);
        docScoreSearchScript0.setNextVar("drop_collection", (java.lang.Object) "ssl");
        org.apache.lucene.index.AtomicReaderContext atomicReaderContext12 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextReader(atomicReaderContext12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoDb("hi!");
        builder5.indexName = "skip_initial_import";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder5.mongoDb("password");
        builder5.throttleSize = (byte) 1;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder5.disableIndexRefresh(false);
        boolean boolean14 = builder5.disableIndexRefresh;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder5.mongoSSLVerifyCertificate(false);
        java.lang.String str17 = builder5.getstatisticsTypeName();
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript2 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript2.setNextScore((float) 1000);
        docScoreSearchScript2.setNextScore((float) 1000);
        docScoreSearchScript0.setNextVar("include_fields", (java.lang.Object) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder9);
        java.lang.String str12 = mongoDBRiverDefinition11.mongoLocalPassword;
        java.lang.String str13 = mongoDBRiverDefinition11.riverName;
        java.lang.String str14 = mongoDBRiverDefinition11.getIncludeCollection();
        java.lang.String str15 = mongoDBRiverDefinition11.getRiverIndexName();
        docScoreSearchScript0.setNextVar("script.default_lang", (java.lang.Object) str15);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = docScoreSearchScript0.runAsDouble();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoDb("hi!");
        builder5.indexName = "skip_initial_import";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder5.mongoDb("password");
        builder5.throttleSize = (byte) 1;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder5.disableIndexRefresh(false);
        boolean boolean14 = builder5.disableIndexRefresh;
        java.lang.String str15 = builder5.mongoCollection;
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
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
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder1);
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue3 = mongoDBRiverDefinition2.getDEFAULT_BULK_SIZE();
        java.lang.String str4 = mongoDBRiverDefinition2.getINITIAL_TIMESTAMP_FIELD();
        com.mongodb.BasicDBObject basicDBObject5 = mongoDBRiverDefinition2.mongoCollectionFilter;
        org.elasticsearch.river.RiverSettings riverSettings6 = new org.elasticsearch.river.RiverSettings(settings0, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject5);
        org.junit.Assert.assertNotNull(byteSizeValue3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "initial_timestamp" + "'", str4, "initial_timestamp");
        org.junit.Assert.assertNotNull(basicDBObject5);
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        builder0.parentTypes = strSet14;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder0.script("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.indexName("password");
        builder20.setimportAllCollections(true);
        com.mongodb.BasicDBObject basicDBObject23 = builder20.mongoCollectionFilter;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean25 = builder24.getimportAllCollections();
        java.lang.String str26 = builder24.getmongoAdminUser();
        java.util.List<com.mongodb.ServerAddress> serverAddressList27 = builder24.getmongoServers();
        boolean boolean28 = builder24.getmongoGridFS();
        builder24.setdropCollection(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder24.script("local");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder32.mongoCollection("skip_initial_import");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition36 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder35);
        java.lang.String str37 = builder35.getindexName();
        boolean boolean38 = builder35.getmongoSSLVerifyCertificate();
        java.lang.String str39 = builder35.typeName;
        builder35.riverName = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition43 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder42);
        builder42.setskipInitialImport(true);
        builder42.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder42.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray63 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet64 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet64, strArray63);
        builder50.parentTypes = strSet64;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder67 = builder49.parentTypes((java.util.Set<java.lang.String>) strSet64);
        builder67.scriptType = "initial_timestamp";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder70 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition71 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder70);
        builder70.setskipInitialImport(true);
        builder70.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder77 = builder70.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder78 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray91 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet92 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet92, strArray91);
        builder78.parentTypes = strSet92;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder95 = builder77.parentTypes((java.util.Set<java.lang.String>) strSet92);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder96 = builder67.excludeFields((java.util.Set<java.lang.String>) strSet92);
        builder35.includeFields = strSet92;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder98 = builder32.includeFields((java.util.Set<java.lang.String>) strSet92);
        builder20.setincludeFields((java.util.Set<java.lang.String>) strSet92);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(basicDBObject23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(serverAddressList27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(builder77);
        org.junit.Assert.assertNotNull(strArray91);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertNotNull(builder95);
        org.junit.Assert.assertNotNull(builder96);
        org.junit.Assert.assertNotNull(builder98);
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getimportAllCollections();
        java.lang.String str2 = builder0.getmongoAdminUser();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.skipInitialImport(false);
        java.lang.String str5 = builder4.getmongoLocalPassword();
        builder4.setscript("initial_timestamp");
        builder4.setmongoSSLVerifyCertificate(false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        builder0.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.skipInitialImport(false);
        java.lang.String str8 = builder7.getstatisticsTypeName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder7.importAllCollections(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder7.mongoAdminPassword("socket_timeout");
        boolean boolean13 = builder7.getmongoUseSSL();
        java.lang.String str14 = builder7.statisticsTypeName;
        builder7.setmongoLocalPassword("credentials");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 1000);
        java.lang.Object obj4 = null;
        docScoreSearchScript0.setNextVar("concurrent_requests", obj4);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder6);
        java.lang.Object obj8 = docScoreSearchScript0.unwrap((java.lang.Object) builder6);
        org.apache.lucene.search.Scorer scorer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setScorer(scorer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.getSSL_CONNECTION_FIELD();
        java.lang.String str3 = mongoDBRiverDefinition1.getBULK_SIZE_FIELD();
        java.lang.String str4 = mongoDBRiverDefinition1.getBULK_FIELD();
        java.lang.String str5 = mongoDBRiverDefinition1.getSOCKET_TIMEOUT();
        java.lang.String str6 = mongoDBRiverDefinition1.getIndexName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ssl" + "'", str2, "ssl");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "bulk_size" + "'", str3, "bulk_size");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "bulk" + "'", str4, "bulk");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "socket_timeout" + "'", str5, "socket_timeout");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getimportAllCollections();
        java.lang.String str2 = builder0.getmongoAdminUser();
        java.util.List<com.mongodb.ServerAddress> serverAddressList3 = builder0.getmongoServers();
        boolean boolean4 = builder0.getmongoGridFS();
        builder0.setdropCollection(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.mongoSecondaryReadPreference(true);
        builder0.setmongoDb("ssl_verify_certificate");
        java.lang.String str11 = builder0.getstatisticsIndexName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(serverAddressList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder1);
        builder1.setskipInitialImport(true);
        builder1.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder1.skipInitialImport(false);
        com.mongodb.BasicDBObject basicDBObject9 = builder1.getmongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings10 = new org.elasticsearch.river.RiverSettings(settings0, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject9);
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = riverSettings10.settings();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = riverSettings10.settings();
        java.lang.Class<?> wildcardClass13 = riverSettings10.getClass();
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(basicDBObject9);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.getSSL_CONNECTION_FIELD();
        boolean boolean3 = mongoDBRiverDefinition1.isStoreStatistics();
        java.lang.String str4 = mongoDBRiverDefinition1.statisticsIndexName;
        java.util.Set<java.lang.String> strSet5 = mongoDBRiverDefinition1.excludeFields;
        boolean boolean6 = mongoDBRiverDefinition1.isSkipInitialImport();
        java.lang.String str7 = mongoDBRiverDefinition1.getMongoLocalPassword();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ssl" + "'", str2, "ssl");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 1000);
        docScoreSearchScript0.setNextScore((float) (byte) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder5.setriverIndexName("admin");
        org.elasticsearch.common.settings.Settings settings8 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        builder9.parentTypes = strSet23;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder9.script("port");
        builder27.setriverName("disable_index_refresh");
        org.elasticsearch.common.settings.Settings settings30 = null;
        org.elasticsearch.common.settings.Settings settings31 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition33 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder32);
        builder32.setskipInitialImport(true);
        builder32.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder32.skipInitialImport(false);
        com.mongodb.BasicDBObject basicDBObject40 = builder32.getmongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings41 = new org.elasticsearch.river.RiverSettings(settings31, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject40);
        org.elasticsearch.river.RiverSettings riverSettings42 = new org.elasticsearch.river.RiverSettings(settings30, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject40);
        builder27.setmongoCollectionFilter(basicDBObject40);
        org.elasticsearch.river.RiverSettings riverSettings44 = new org.elasticsearch.river.RiverSettings(settings8, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject40);
        builder5.mongoCollectionFilter = basicDBObject40;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(basicDBObject40);
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("exclude_fields", "password");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?password?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.getSSL_CONNECTION_FIELD();
        int int3 = mongoDBRiverDefinition1.getDEFAULT_CONNECT_TIMEOUT();
        java.lang.String str4 = mongoDBRiverDefinition1.getADMIN_DB_FIELD();
        int int5 = mongoDBRiverDefinition1.connectTimeout;
        java.lang.String str6 = mongoDBRiverDefinition1.getCONCURRENT_REQUESTS_FIELD();
        int int7 = mongoDBRiverDefinition1.socketTimeout;
        java.lang.String str8 = mongoDBRiverDefinition1.getCONNECT_TIMEOUT();
        java.lang.String str9 = mongoDBRiverDefinition1.getINDEX_OBJECT();
        boolean boolean10 = mongoDBRiverDefinition1.isMongoGridFS();
        java.lang.String str11 = mongoDBRiverDefinition1.indexName;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ssl" + "'", str2, "ssl");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 30000 + "'", int3 == 30000);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "concurrent_requests" + "'", str6, "concurrent_requests");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "connect_timeout" + "'", str8, "connect_timeout");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "index" + "'", str9, "index");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 1000);
        java.lang.Object obj4 = null;
        docScoreSearchScript0.setNextVar("concurrent_requests", obj4);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder6);
        java.lang.Object obj8 = docScoreSearchScript0.unwrap((java.lang.Object) builder6);
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextDocId(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue2 = mongoDBRiverDefinition1.getDEFAULT_BULK_SIZE();
        java.lang.String str3 = mongoDBRiverDefinition1.getINITIAL_TIMESTAMP_FIELD();
        int int4 = mongoDBRiverDefinition1.getSocketTimeout();
        boolean boolean5 = mongoDBRiverDefinition1.mongoSecondaryReadPreference;
        boolean boolean6 = mongoDBRiverDefinition1.getdropCollection();
        org.junit.Assert.assertNotNull(byteSizeValue2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "initial_timestamp" + "'", str3, "initial_timestamp");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        builder0.scriptType = "admin";
        builder0.setstoreStatistics(true);
        boolean boolean8 = builder0.importAllCollections;
        int int9 = builder0.throttleSize;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean11 = builder10.getimportAllCollections();
        java.lang.String str12 = builder10.getmongoAdminUser();
        java.lang.String str13 = builder10.typeName;
        java.util.List<com.mongodb.ServerAddress> serverAddressList14 = builder10.mongoServers;
        builder0.setmongoServers(serverAddressList14);
        java.lang.String str16 = builder0.getmongoCollection();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(serverAddressList14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoDb("hi!");
        builder5.isMongos = true;
        java.lang.String str8 = builder5.typeName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder5.mongoSSLVerifyCertificate(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet25 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet25, strArray24);
        builder11.parentTypes = strSet25;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder11.script("port");
        builder29.setriverName("disable_index_refresh");
        org.elasticsearch.common.settings.Settings settings32 = null;
        org.elasticsearch.common.settings.Settings settings33 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition35 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder34);
        builder34.setskipInitialImport(true);
        builder34.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder34.skipInitialImport(false);
        com.mongodb.BasicDBObject basicDBObject42 = builder34.getmongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings43 = new org.elasticsearch.river.RiverSettings(settings33, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject42);
        org.elasticsearch.river.RiverSettings riverSettings44 = new org.elasticsearch.river.RiverSettings(settings32, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject42);
        builder29.setmongoCollectionFilter(basicDBObject42);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder5.mongoCollectionFilter(basicDBObject42);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder46.script("disable_index_refresh");
        builder48.setriverIndexName("");
        com.mongodb.BasicDBObject basicDBObject51 = builder48.mongoOplogFilter;
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(basicDBObject42);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNull(basicDBObject51);
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        builder0.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.skipInitialImport(false);
        java.lang.String str8 = builder7.getstatisticsTypeName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder7.importAllCollections(true);
        builder7.setdropCollection(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder7);
        com.mongodb.MongoClientOptions mongoClientOptions14 = builder7.getmongoClientOptions();
        int int15 = builder7.getconnectTimeout();
        boolean boolean16 = builder7.getstoreStatistics();
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNull(mongoClientOptions14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        builder0.parentTypes = strSet14;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder0.throttleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.mongoDb("local");
        builder20.setisMongos((java.lang.Boolean) false);
        boolean boolean25 = builder20.getskipInitialImport();
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.scriptType;
        java.lang.String str3 = mongoDBRiverDefinition1.getSSL_CONNECTION_FIELD();
        java.lang.String str4 = mongoDBRiverDefinition1.mongoLocalUser;
        int int5 = mongoDBRiverDefinition1.getDEFAULT_BULK_ACTIONS();
        java.lang.String str6 = mongoDBRiverDefinition1.getPARENT_TYPES_FIELD();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ssl" + "'", str3, "ssl");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1000 + "'", int5 == 1000);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "parent_types" + "'", str6, "parent_types");
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.getFLUSH_INTERVAL_FIELD();
        boolean boolean4 = mongoDBRiverDefinition2.getmongoUseSSL();
        java.lang.String str5 = mongoDBRiverDefinition2.getSCRIPT_FIELD();
        boolean boolean6 = mongoDBRiverDefinition2.getskipInitialImport();
        java.lang.String str7 = mongoDBRiverDefinition2.getBULK_TIMEOUT_FIELD();
        com.mongodb.BasicDBObject basicDBObject8 = mongoDBRiverDefinition2.getMongoOplogFilter();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "flush_interval" + "'", str3, "flush_interval");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "script" + "'", str5, "script");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "bulk_timeout" + "'", str7, "bulk_timeout");
        org.junit.Assert.assertNull(basicDBObject8);
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoDb("hi!");
        builder5.indexName = "skip_initial_import";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder5.mongoDb("password");
        builder5.throttleSize = (byte) 1;
        builder5.throttleSize = (byte) 10;
        com.mongodb.MongoClientOptions mongoClientOptions14 = builder5.getmongoClientOptions();
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(mongoClientOptions14);
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoDb("hi!");
        builder5.isMongos = true;
        java.lang.String str8 = builder5.typeName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder5.mongoSSLVerifyCertificate(false);
        java.lang.String str11 = builder10.gettypeName();
        java.lang.String str12 = builder10.includeCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder10);
        boolean boolean14 = mongoDBRiverDefinition13.mongoSecondaryReadPreference;
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoDb("hi!");
        builder5.isMongos = true;
        java.lang.String str8 = builder5.typeName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder5.mongoSSLVerifyCertificate(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet25 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet25, strArray24);
        builder11.parentTypes = strSet25;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder11.script("port");
        builder29.setriverName("disable_index_refresh");
        org.elasticsearch.common.settings.Settings settings32 = null;
        org.elasticsearch.common.settings.Settings settings33 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition35 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder34);
        builder34.setskipInitialImport(true);
        builder34.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder34.skipInitialImport(false);
        com.mongodb.BasicDBObject basicDBObject42 = builder34.getmongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings43 = new org.elasticsearch.river.RiverSettings(settings33, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject42);
        org.elasticsearch.river.RiverSettings riverSettings44 = new org.elasticsearch.river.RiverSettings(settings32, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject42);
        builder29.setmongoCollectionFilter(basicDBObject42);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder5.mongoCollectionFilter(basicDBObject42);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder46.disableIndexRefresh(true);
        builder46.setscriptType("sandbox");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(basicDBObject42);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript2 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript2.setNextScore((float) 1000);
        docScoreSearchScript2.setNextScore((float) 1000);
        docScoreSearchScript0.setNextVar("include_fields", (java.lang.Object) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        builder9.parentTypes = strSet23;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder9.throttleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.typeName("disable_index_refresh");
        docScoreSearchScript0.setNextVar("parent_types", (java.lang.Object) builder29);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition33 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder32);
        builder32.setskipInitialImport(true);
        builder32.scriptType = "admin";
        builder32.setstoreStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder32.isMongos((java.lang.Boolean) false);
        java.lang.String str42 = builder32.mongoAdminUser;
        docScoreSearchScript0.setNextVar("drop_collection", (java.lang.Object) str42);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition45 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder44);
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue46 = mongoDBRiverDefinition45.getDEFAULT_BULK_SIZE();
        int int47 = mongoDBRiverDefinition45.getDEFAULT_SOCKET_TIMEOUT();
        java.lang.String str48 = mongoDBRiverDefinition45.getINDEX_OBJECT();
        boolean boolean49 = mongoDBRiverDefinition45.getadvancedTransformation();
        com.mongodb.MongoClientOptions mongoClientOptions50 = mongoDBRiverDefinition45.getMongoClientOptions();
        java.lang.Object obj51 = docScoreSearchScript0.unwrap((java.lang.Object) mongoClientOptions50);
        org.apache.lucene.search.Scorer scorer52 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setScorer(scorer52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(byteSizeValue46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 60000 + "'", int47 == 60000);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "index" + "'", str48, "index");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(mongoClientOptions50);
        org.junit.Assert.assertNull(obj51);
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.getSSL_CONNECTION_FIELD();
        int int3 = mongoDBRiverDefinition1.getDEFAULT_CONNECT_TIMEOUT();
        boolean boolean4 = mongoDBRiverDefinition1.dropCollection;
        java.lang.String str5 = mongoDBRiverDefinition1.getPARENT_TYPES_FIELD();
        boolean boolean6 = mongoDBRiverDefinition1.mongoSecondaryReadPreference;
        int int7 = mongoDBRiverDefinition1.getDEFAULT_DB_PORT();
        int int8 = mongoDBRiverDefinition1.throttleSize;
        java.lang.String str9 = mongoDBRiverDefinition1.getINITIAL_TIMESTAMP_FIELD();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ssl" + "'", str2, "ssl");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 30000 + "'", int3 == 30000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "parent_types" + "'", str5, "parent_types");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 27017 + "'", int7 == 27017);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "initial_timestamp" + "'", str9, "initial_timestamp");
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoDb("hi!");
        builder5.isMongos = true;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        int int9 = builder5.getconnectTimeout();
        java.lang.String str10 = builder5.getstatisticsIndexName();
        boolean boolean11 = builder5.dropCollection;
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        builder0.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.skipInitialImport(false);
        com.mongodb.BasicDBObject basicDBObject8 = builder0.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.storeStatistics(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.mongoDb("");
        builder12.typeName = "drop_collection";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder12.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet33 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet33, strArray32);
        builder19.parentTypes = strSet33;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder19.throttleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder37.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder37.indexName("initial_timestamp");
        builder41.setstatisticsIndexName("socket_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder41.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder46.setriverIndexName("admin");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition49 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder46);
        int int50 = builder46.throttleSize;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition51 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder46);
        com.mongodb.BasicDBObject basicDBObject52 = builder46.getmongoCollectionFilter();
        builder41.setmongoOplogFilter(basicDBObject52);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder18.mongoOplogFilter(basicDBObject52);
        builder18.setdropCollection(true);
        builder18.setmongoLocalPassword("null.null");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(basicDBObject8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(basicDBObject52);
        org.junit.Assert.assertNotNull(builder54);
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str4 = builder0.getindexName();
        java.lang.Boolean boolean5 = builder0.isMongos;
        builder0.storeStatistics = false;
        com.mongodb.BasicDBObject basicDBObject8 = builder0.mongoOplogFilter;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = basicDBObject8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNull(basicDBObject8);
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str4 = builder0.getindexName();
        builder0.setstatisticsIndexName("local");
        int int7 = builder0.socketTimeout;
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp8 = builder0.getinitialTimestamp();
        java.lang.String str9 = builder0.gettypeName();
        builder0.socketTimeout = (short) 10;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(wildcardTimestamp8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        builder0.parentTypes = strSet14;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder0.throttleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder20);
        builder20.setisMongos((java.lang.Boolean) true);
        builder20.setmongoDb("actions");
        builder20.setmongoLocalPassword("drop_collection");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.getSSL_CONNECTION_FIELD();
        int int3 = mongoDBRiverDefinition1.getDEFAULT_CONNECT_TIMEOUT();
        boolean boolean4 = mongoDBRiverDefinition1.dropCollection;
        java.lang.String str5 = mongoDBRiverDefinition1.getCONCURRENT_REQUESTS_FIELD();
        java.lang.String str6 = mongoDBRiverDefinition1.getSCRIPT_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition1.riverIndexName;
        java.lang.String str8 = mongoDBRiverDefinition1.getSKIP_INITIAL_IMPORT_FIELD();
        java.util.Set<java.lang.String> strSet9 = mongoDBRiverDefinition1.parentTypes;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ssl" + "'", str2, "ssl");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 30000 + "'", int3 == 30000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "concurrent_requests" + "'", str5, "concurrent_requests");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "script" + "'", str6, "script");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "skip_initial_import" + "'", str8, "skip_initial_import");
        org.junit.Assert.assertNull(strSet9);
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoDb("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.throttleSize((int) (byte) 100);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = builder0.getindexName();
        boolean boolean3 = builder0.getmongoSSLVerifyCertificate();
        java.lang.String str4 = builder0.typeName;
        builder0.socketTimeout = 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.typeName("bulk");
        java.lang.String str9 = builder8.mongoAdminUser;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder10);
        java.lang.String str12 = builder10.getindexName();
        boolean boolean13 = builder10.getmongoSSLVerifyCertificate();
        java.lang.String str14 = builder10.typeName;
        builder10.riverName = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder17);
        builder17.setskipInitialImport(true);
        builder17.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder17.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet39 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet39, strArray38);
        builder25.parentTypes = strSet39;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder24.parentTypes((java.util.Set<java.lang.String>) strSet39);
        builder42.scriptType = "initial_timestamp";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition46 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder45);
        builder45.setskipInitialImport(true);
        builder45.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder45.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray66 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet67 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet67, strArray66);
        builder53.parentTypes = strSet67;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder70 = builder52.parentTypes((java.util.Set<java.lang.String>) strSet67);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder71 = builder42.excludeFields((java.util.Set<java.lang.String>) strSet67);
        builder10.includeFields = strSet67;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder73 = builder8.parentTypes((java.util.Set<java.lang.String>) strSet67);
        boolean boolean74 = builder73.mongoSecondaryReadPreference;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(builder70);
        org.junit.Assert.assertNotNull(builder71);
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.getSSL_CONNECTION_FIELD();
        boolean boolean3 = mongoDBRiverDefinition1.isStoreStatistics();
        boolean boolean4 = mongoDBRiverDefinition1.mongoGridFS;
        boolean boolean5 = mongoDBRiverDefinition1.isMongoUseSSL();
        java.lang.String str6 = mongoDBRiverDefinition1.getMongoLocalPassword();
        org.elasticsearch.common.unit.TimeValue timeValue7 = mongoDBRiverDefinition1.getDEFAULT_FLUSH_INTERVAL();
        java.lang.String str8 = mongoDBRiverDefinition1.mongoCollection;
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = mongoDBRiverDefinition1.initialTimestamp;
        int int10 = mongoDBRiverDefinition1.getSocketTimeout();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ssl" + "'", str2, "ssl");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(timeValue7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(wildcardTimestamp9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        builder2.parentTypes = strSet16;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder2.throttleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder21);
        int int23 = builder21.getsocketTimeout();
        java.lang.String str24 = builder21.getincludeCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet39 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet39, strArray38);
        builder25.parentTypes = strSet39;
        builder21.excludeFields = strSet39;
        builder2.parentTypes = strSet39;
        docScoreSearchScript0.setNextVar("host", (java.lang.Object) strSet39);
        docScoreSearchScript0.setNextScore((float) (short) 100);
        org.apache.lucene.index.AtomicReaderContext atomicReaderContext47 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextReader(atomicReaderContext47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.getSSL_CONNECTION_FIELD();
        int int3 = mongoDBRiverDefinition1.getDEFAULT_CONNECT_TIMEOUT();
        boolean boolean4 = mongoDBRiverDefinition1.dropCollection;
        java.lang.String str5 = mongoDBRiverDefinition1.getCONCURRENT_REQUESTS_FIELD();
        boolean boolean6 = mongoDBRiverDefinition1.advancedTransformation;
        java.lang.String str7 = mongoDBRiverDefinition1.getRiverIndexName();
        java.lang.String str8 = mongoDBRiverDefinition1.getSCRIPT_FIELD();
        int int9 = mongoDBRiverDefinition1.getDEFAULT_DB_PORT();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ssl" + "'", str2, "ssl");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 30000 + "'", int3 == 30000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "concurrent_requests" + "'", str5, "concurrent_requests");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "script" + "'", str8, "script");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 27017 + "'", int9 == 27017);
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("", "drop_collection", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?drop_collection?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        builder0.parentTypes = strSet14;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder0.throttleSize((int) (byte) 0);
        int int19 = builder0.getconnectTimeout();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder20);
        builder20.setskipInitialImport(true);
        builder20.scriptType = "admin";
        java.lang.String[] strArray28 = new java.lang.String[] { "", "password" };
        java.util.LinkedHashSet<java.lang.String> strSet29 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet29, strArray28);
        builder20.setincludeFields((java.util.Set<java.lang.String>) strSet29);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder0.excludeFields((java.util.Set<java.lang.String>) strSet29);
        java.util.Set<java.lang.String> strSet33 = builder0.parentTypes;
        java.lang.String str34 = builder0.getstatisticsTypeName();
        boolean boolean35 = builder0.mongoGridFS;
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue2 = mongoDBRiverDefinition1.getDEFAULT_BULK_SIZE();
        int int3 = mongoDBRiverDefinition1.getDEFAULT_SOCKET_TIMEOUT();
        java.lang.String str4 = mongoDBRiverDefinition1.getINDEX_OBJECT();
        boolean boolean5 = mongoDBRiverDefinition1.getmongoSSLVerifyCertificate();
        int int6 = mongoDBRiverDefinition1.getThrottleSize();
        java.lang.String str7 = mongoDBRiverDefinition1.getSSL_CONNECTION_FIELD();
        java.lang.String str8 = mongoDBRiverDefinition1.getRiverName();
        int int9 = mongoDBRiverDefinition1.socketTimeout;
        int int10 = mongoDBRiverDefinition1.getThrottleSize();
        org.junit.Assert.assertNotNull(byteSizeValue2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "index" + "'", str4, "index");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ssl" + "'", str7, "ssl");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.getMongoOplogNamespace();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null.null" + "'", str2, "null.null");
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        builder0.parentTypes = strSet14;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder0.throttleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder18.indexName("initial_timestamp");
        boolean boolean23 = builder18.getimportAllCollections();
        boolean boolean24 = builder18.getdropCollection();
        com.mongodb.MongoClientOptions mongoClientOptions25 = builder18.mongoClientOptions;
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(mongoClientOptions25);
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.getSERVERS_FIELD();
        java.lang.String str3 = mongoDBRiverDefinition1.getGRIDFS_FIELD();
        java.lang.String str4 = mongoDBRiverDefinition1.getACTIONS_FIELD();
        java.lang.String str5 = mongoDBRiverDefinition1.getSCRIPT_TYPE_FIELD();
        java.lang.String str6 = mongoDBRiverDefinition1.getLOCAL_DB_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition1.getGRIDFS_FIELD();
        int int8 = mongoDBRiverDefinition1.connectTimeout;
        java.lang.String str9 = mongoDBRiverDefinition1.getINITIAL_TIMESTAMP_SCRIPT_FIELD();
        boolean boolean10 = mongoDBRiverDefinition1.getdropCollection();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "servers" + "'", str2, "servers");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "gridfs" + "'", str3, "gridfs");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "actions" + "'", str4, "actions");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "script_type" + "'", str5, "script_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "local" + "'", str6, "local");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "gridfs" + "'", str7, "gridfs");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "script" + "'", str9, "script");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        builder0.scriptType = "admin";
        builder0.setstoreStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.isMongos((java.lang.Boolean) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean11 = mongoDBRiverDefinition10.isStoreStatistics();
        int int12 = mongoDBRiverDefinition10.getDEFAULT_SOCKET_TIMEOUT();
        int int13 = mongoDBRiverDefinition10.getDEFAULT_SOCKET_TIMEOUT();
        java.lang.String str14 = mongoDBRiverDefinition10.scriptType;
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 60000 + "'", int12 == 60000);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60000 + "'", int13 == 60000);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        builder0.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        builder8.parentTypes = strSet22;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder7.parentTypes((java.util.Set<java.lang.String>) strSet22);
        builder25.scriptType = "initial_timestamp";
        java.lang.String str28 = builder25.getmongoAdminUser();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition29 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder25);
        java.lang.String str30 = mongoDBRiverDefinition29.getBULK_FIELD();
        java.util.List<com.mongodb.ServerAddress> serverAddressList31 = mongoDBRiverDefinition29.mongoServers;
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "bulk" + "'", str30, "bulk");
        org.junit.Assert.assertNotNull(serverAddressList31);
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoDb("hi!");
        builder5.isMongos = true;
        java.lang.String str8 = builder5.typeName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder5.mongoSSLVerifyCertificate(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet25 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet25, strArray24);
        builder11.parentTypes = strSet25;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder11.script("port");
        builder29.setriverName("disable_index_refresh");
        org.elasticsearch.common.settings.Settings settings32 = null;
        org.elasticsearch.common.settings.Settings settings33 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition35 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder34);
        builder34.setskipInitialImport(true);
        builder34.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder34.skipInitialImport(false);
        com.mongodb.BasicDBObject basicDBObject42 = builder34.getmongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings43 = new org.elasticsearch.river.RiverSettings(settings33, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject42);
        org.elasticsearch.river.RiverSettings riverSettings44 = new org.elasticsearch.river.RiverSettings(settings32, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject42);
        builder29.setmongoCollectionFilter(basicDBObject42);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder5.mongoCollectionFilter(basicDBObject42);
        int int47 = builder5.getsocketTimeout();
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory48 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray62 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet63 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet63, strArray62);
        builder49.parentTypes = strSet63;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder67 = builder49.script("port");
        builder67.setriverName("disable_index_refresh");
        org.elasticsearch.common.settings.Settings settings70 = null;
        org.elasticsearch.common.settings.Settings settings71 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder72 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition73 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder72);
        builder72.setskipInitialImport(true);
        builder72.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder79 = builder72.skipInitialImport(false);
        com.mongodb.BasicDBObject basicDBObject80 = builder72.getmongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings81 = new org.elasticsearch.river.RiverSettings(settings71, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject80);
        org.elasticsearch.river.RiverSettings riverSettings82 = new org.elasticsearch.river.RiverSettings(settings70, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject80);
        builder67.setmongoCollectionFilter(basicDBObject80);
        org.elasticsearch.script.ExecutableScript executableScript84 = docScoreNativeScriptFactory48.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject80);
        builder5.setmongoCollectionFilter(basicDBObject80);
        java.lang.String str86 = builder5.getriverIndexName();
        int int87 = builder5.getsocketTimeout();
        org.bson.types.BSONTimestamp bSONTimestamp88 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder89 = builder5.initialTimestamp(bSONTimestamp88);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ts must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(basicDBObject42);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(builder79);
        org.junit.Assert.assertNotNull(basicDBObject80);
        org.junit.Assert.assertNotNull(executableScript84);
        org.junit.Assert.assertNull(str86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        boolean boolean4 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoLocalUser("include_fields");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet21 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet21, strArray20);
        builder7.parentTypes = strSet21;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder7.throttleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder26);
        int int28 = builder26.getsocketTimeout();
        java.lang.String str29 = builder26.getincludeCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray43 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet44 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet44, strArray43);
        builder30.parentTypes = strSet44;
        builder26.excludeFields = strSet44;
        builder7.parentTypes = strSet44;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder0.parentTypes((java.util.Set<java.lang.String>) strSet44);
        boolean boolean50 = builder49.skipInitialImport;
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str4 = builder0.getindexName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.indexName("");
        builder6.setisMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.dropCollection(false);
        java.lang.String str11 = builder6.mongoLocalPassword;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.getSSL_CONNECTION_FIELD();
        boolean boolean3 = mongoDBRiverDefinition1.isStoreStatistics();
        java.lang.String str4 = mongoDBRiverDefinition1.getLOCAL_DB_FIELD();
        java.lang.String str5 = mongoDBRiverDefinition1.getStatisticsIndexName();
        java.lang.String str6 = mongoDBRiverDefinition1.scriptType;
        java.lang.String str7 = mongoDBRiverDefinition1.getStatisticsTypeName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ssl" + "'", str2, "ssl");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "local" + "'", str4, "local");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.getSSL_CONNECTION_FIELD();
        int int3 = mongoDBRiverDefinition1.getDEFAULT_CONNECT_TIMEOUT();
        boolean boolean4 = mongoDBRiverDefinition1.dropCollection;
        java.lang.String str5 = mongoDBRiverDefinition1.getCONCURRENT_REQUESTS_FIELD();
        java.util.Set<java.lang.String> strSet6 = mongoDBRiverDefinition1.getParentTypes();
        java.lang.String str7 = mongoDBRiverDefinition1.script;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ssl" + "'", str2, "ssl");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 30000 + "'", int3 == 30000);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "concurrent_requests" + "'", str5, "concurrent_requests");
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.scriptType;
        boolean boolean3 = mongoDBRiverDefinition1.isSkipInitialImport();
        java.lang.String str4 = mongoDBRiverDefinition1.getMongoLocalPassword();
        java.lang.String str5 = mongoDBRiverDefinition1.getDISABLE_INDEX_REFRESH_FIELD();
        java.lang.String str6 = mongoDBRiverDefinition1.getIMPORT_ALL_COLLECTIONS_FIELD();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "disable_index_refresh" + "'", str5, "disable_index_refresh");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "import_all_collections" + "'", str6, "import_all_collections");
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        builder0.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.skipInitialImport(false);
        java.lang.String str8 = builder7.getstatisticsTypeName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder7.importAllCollections(true);
        boolean boolean11 = builder10.disableIndexRefresh;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        builder12.parentTypes = strSet26;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder10.parentTypes((java.util.Set<java.lang.String>) strSet26);
        builder29.mongoLocalUser = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder29.importAllCollections(true);
        java.lang.String str34 = builder33.getmongoCollection();
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = builder0.getindexName();
        boolean boolean3 = builder0.getmongoSSLVerifyCertificate();
        java.lang.String str4 = builder0.typeName;
        builder0.socketTimeout = 0;
        boolean boolean7 = builder0.getmongoSSLVerifyCertificate();
        java.lang.String str8 = builder0.riverName;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = builder0.getindexName();
        boolean boolean3 = builder0.getmongoSSLVerifyCertificate();
        java.lang.String str4 = builder0.includeCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoAdminPassword("bulk_timeout");
        java.lang.String str7 = builder6.getscript();
        builder6.skipInitialImport = true;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        builder0.parentTypes = strSet14;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder0.throttleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder18.indexName("initial_timestamp");
        builder22.setstatisticsIndexName("socket_timeout");
        boolean boolean25 = builder22.storeStatistics;
        builder22.disableIndexRefresh = false;
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        builder0.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.skipInitialImport(false);
        com.mongodb.BasicDBObject basicDBObject8 = builder0.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.skipInitialImport(false);
        java.lang.String str11 = builder0.riverIndexName;
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(basicDBObject8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        builder0.parentTypes = strSet14;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder0.script("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.indexName("password");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder18);
        com.mongodb.MongoClientOptions mongoClientOptions22 = mongoDBRiverDefinition21.mongoClientOptions;
        java.lang.String str23 = mongoDBRiverDefinition21.getMongoLocalUser();
        java.lang.String str24 = mongoDBRiverDefinition21.getDEFAULT_DB_HOST();
        int int25 = mongoDBRiverDefinition21.getDEFAULT_CONCURRENT_REQUESTS();
        boolean boolean26 = mongoDBRiverDefinition21.isSkipInitialImport();
        java.lang.String str27 = mongoDBRiverDefinition21.getCREDENTIALS_FIELD();
        java.lang.String str28 = mongoDBRiverDefinition21.getLOCAL_DB_FIELD();
        java.lang.String str29 = mongoDBRiverDefinition21.getIndexName();
        java.lang.String str30 = mongoDBRiverDefinition21.getINITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD();
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNull(mongoClientOptions22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "localhost" + "'", str24, "localhost");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 8 + "'", int25 == 8);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "credentials" + "'", str27, "credentials");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "local" + "'", str28, "local");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "password" + "'", str29, "password");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "script_type" + "'", str30, "script_type");
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = builder0.getindexName();
        boolean boolean3 = builder0.getmongoSSLVerifyCertificate();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.socketTimeout(10);
        java.lang.String str6 = builder0.indexName;
        builder0.dropCollection = false;
        builder0.setmongoAdminUser("initial_timestamp");
        boolean boolean11 = builder0.getdropCollection();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript2 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript2.setNextScore((float) 1000);
        docScoreSearchScript2.setNextScore((float) 1000);
        docScoreSearchScript0.setNextVar("include_fields", (java.lang.Object) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder9);
        java.lang.String str12 = mongoDBRiverDefinition11.mongoLocalPassword;
        java.lang.String str13 = mongoDBRiverDefinition11.riverName;
        java.lang.String str14 = mongoDBRiverDefinition11.getIncludeCollection();
        java.lang.String str15 = mongoDBRiverDefinition11.getRiverIndexName();
        docScoreSearchScript0.setNextVar("script.default_lang", (java.lang.Object) str15);
        org.apache.lucene.search.Scorer scorer17 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setScorer(scorer17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoDb("hi!");
        builder5.isMongos = true;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = builder8.getindexName();
        boolean boolean11 = builder8.getmongoSSLVerifyCertificate();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder8.socketTimeout(10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet28 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet28, strArray27);
        builder14.parentTypes = strSet28;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder14.script("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray46 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet47 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet47, strArray46);
        builder33.parentTypes = strSet47;
        builder32.setexcludeFields((java.util.Set<java.lang.String>) strSet47);
        builder13.includeFields = strSet47;
        builder5.setparentTypes((java.util.Set<java.lang.String>) strSet47);
        builder5.typeName = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition55 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder5.throttleSize((int) (short) 100);
        java.lang.String str58 = builder57.getindexName();
        builder57.mongoUseSSL = false;
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNull(str58);
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getimportAllCollections();
        java.lang.String str2 = builder0.getmongoAdminUser();
        java.lang.String str3 = builder0.typeName;
        builder0.setmongoCollection("gridfs");
        com.mongodb.BasicDBObject basicDBObject6 = builder0.getmongoCollectionFilter();
        java.lang.String str7 = builder0.mongoLocalUser;
        com.mongodb.BasicDBObject basicDBObject8 = builder0.mongoCollectionFilter;
        builder0.throttleSize = 100;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(basicDBObject6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(basicDBObject8);
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        builder0.scriptType = "admin";
        builder0.setstoreStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.isMongos((java.lang.Boolean) false);
        java.util.Set<java.lang.String> strSet10 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.parentTypes(strSet10);
        com.mongodb.MongoClientOptions mongoClientOptions12 = builder9.getmongoClientOptions();
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNull(mongoClientOptions12);
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoDb("hi!");
        builder5.indexName = "skip_initial_import";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder5.mongoDb("password");
        boolean boolean10 = builder9.getimportAllCollections();
        java.lang.String str11 = builder9.mongoLocalUser;
        java.lang.String str12 = builder9.getstatisticsIndexName();
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        builder0.parentTypes = strSet14;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder0.script("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.indexName("password");
        builder20.setimportAllCollections(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition23 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder20);
        java.util.Set<java.lang.String> strSet24 = builder20.getincludeFields();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder20.importAllCollections(true);
        java.lang.String str27 = builder20.getmongoAdminUser();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder20);
        org.bson.types.Binary binary29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder20.initialTimestamp(binary29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNull(strSet24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getimportAllCollections();
        java.lang.String str2 = builder0.getmongoAdminUser();
        java.lang.String str3 = builder0.typeName;
        boolean boolean4 = builder0.getstoreStatistics();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str6 = mongoDBRiverDefinition5.getINITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition5.getCONNECT_TIMEOUT();
        java.lang.String str8 = mongoDBRiverDefinition5.mongoCollection;
        java.lang.String str9 = mongoDBRiverDefinition5.getSCRIPT_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition5.getPORT_FIELD();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "script_type" + "'", str6, "script_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "connect_timeout" + "'", str7, "connect_timeout");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "script" + "'", str9, "script");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "port" + "'", str10, "port");
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        int int2 = builder0.getsocketTimeout();
        boolean boolean3 = builder0.advancedTransformation;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean5 = builder4.getimportAllCollections();
        java.lang.String str6 = builder4.getmongoAdminUser();
        java.util.List<com.mongodb.ServerAddress> serverAddressList7 = builder4.getmongoServers();
        builder0.mongoServers = serverAddressList7;
        java.lang.String str9 = builder0.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder10.riverName("bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet30 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet30, strArray29);
        builder16.parentTypes = strSet30;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder16.throttleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition36 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder35);
        int int37 = builder35.getsocketTimeout();
        java.lang.String str38 = builder35.getincludeCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray52 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet53 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet53, strArray52);
        builder39.parentTypes = strSet53;
        builder35.excludeFields = strSet53;
        builder16.parentTypes = strSet53;
        builder15.excludeFields = strSet53;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = builder0.excludeFields((java.util.Set<java.lang.String>) strSet53);
        builder0.mongoAdminPassword = "null.null";
        java.util.List<com.mongodb.ServerAddress> serverAddressList62 = builder0.mongoServers;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(serverAddressList7);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(serverAddressList62);
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue2 = mongoDBRiverDefinition1.getDEFAULT_BULK_SIZE();
        java.lang.String str3 = mongoDBRiverDefinition1.getINITIAL_TIMESTAMP_FIELD();
        int int4 = mongoDBRiverDefinition1.getSocketTimeout();
        java.lang.String str5 = mongoDBRiverDefinition1.getTHROTTLE_SIZE_FIELD();
        java.lang.String str6 = mongoDBRiverDefinition1.getINCLUDE_FIELDS_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition1.typeName;
        int int8 = mongoDBRiverDefinition1.connectTimeout;
        java.lang.String str9 = mongoDBRiverDefinition1.getDB_FIELD();
        org.junit.Assert.assertNotNull(byteSizeValue2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "initial_timestamp" + "'", str3, "initial_timestamp");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "throttle_size" + "'", str5, "throttle_size");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "include_fields" + "'", str6, "include_fields");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "db" + "'", str9, "db");
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet15 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet15, strArray14);
        builder1.parentTypes = strSet15;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder1.throttleSize((int) (byte) 0);
        org.elasticsearch.common.settings.Settings settings20 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder21);
        builder21.setskipInitialImport(true);
        builder21.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder21.skipInitialImport(false);
        com.mongodb.BasicDBObject basicDBObject29 = builder21.getmongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings30 = new org.elasticsearch.river.RiverSettings(settings20, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject29);
        builder19.setmongoOplogFilter(basicDBObject29);
        org.elasticsearch.river.RiverSettings riverSettings32 = new org.elasticsearch.river.RiverSettings(settings0, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject29);
        org.elasticsearch.common.settings.Settings settings33 = riverSettings32.globalSettings();
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(basicDBObject29);
        org.junit.Assert.assertNull(settings33);
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript2 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript2.setNextScore((float) 1000);
        docScoreSearchScript2.setNextScore((float) 1000);
        docScoreSearchScript0.setNextVar("include_fields", (java.lang.Object) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        builder9.parentTypes = strSet23;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder9.throttleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.typeName("disable_index_refresh");
        docScoreSearchScript0.setNextVar("parent_types", (java.lang.Object) builder29);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition33 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder32);
        builder32.setskipInitialImport(true);
        builder32.scriptType = "admin";
        builder32.setstoreStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder32.isMongos((java.lang.Boolean) false);
        java.lang.String str42 = builder32.mongoAdminUser;
        docScoreSearchScript0.setNextVar("drop_collection", (java.lang.Object) str42);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition45 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder44);
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue46 = mongoDBRiverDefinition45.getDEFAULT_BULK_SIZE();
        int int47 = mongoDBRiverDefinition45.getDEFAULT_SOCKET_TIMEOUT();
        java.lang.String str48 = mongoDBRiverDefinition45.getINDEX_OBJECT();
        boolean boolean49 = mongoDBRiverDefinition45.getadvancedTransformation();
        com.mongodb.MongoClientOptions mongoClientOptions50 = mongoDBRiverDefinition45.getMongoClientOptions();
        java.lang.Object obj51 = docScoreSearchScript0.unwrap((java.lang.Object) mongoClientOptions50);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj52 = docScoreSearchScript0.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(byteSizeValue46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 60000 + "'", int47 == 60000);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "index" + "'", str48, "index");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(mongoClientOptions50);
        org.junit.Assert.assertNull(obj51);
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        builder0.scriptType = "admin";
        builder0.setstoreStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.isMongos((java.lang.Boolean) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder0.statisticsTypeName("store_statistics");
        builder0.setscriptType("collection");
        java.lang.String str14 = builder0.riverIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder0.dropCollection(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder17);
        builder17.setskipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder17.mongoDb("hi!");
        builder22.isMongos = true;
        java.lang.String str25 = builder22.typeName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder22.mongoSSLVerifyCertificate(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray41 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet42 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet42, strArray41);
        builder28.parentTypes = strSet42;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder28.script("port");
        builder46.setriverName("disable_index_refresh");
        org.elasticsearch.common.settings.Settings settings49 = null;
        org.elasticsearch.common.settings.Settings settings50 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition52 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder51);
        builder51.setskipInitialImport(true);
        builder51.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = builder51.skipInitialImport(false);
        com.mongodb.BasicDBObject basicDBObject59 = builder51.getmongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings60 = new org.elasticsearch.river.RiverSettings(settings50, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject59);
        org.elasticsearch.river.RiverSettings riverSettings61 = new org.elasticsearch.river.RiverSettings(settings49, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject59);
        builder46.setmongoCollectionFilter(basicDBObject59);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = builder22.mongoCollectionFilter(basicDBObject59);
        int int64 = builder22.getsocketTimeout();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition65 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder22);
        java.lang.String str66 = builder22.typeName;
        java.lang.String[] strArray77 = new java.lang.String[] { "advanced_transformation", "include_collection", "bulk_timeout", "index", "ssl", "", "disable_index_refresh", "index", "user", "bulk_size" };
        java.util.LinkedHashSet<java.lang.String> strSet78 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet78, strArray77);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder80 = builder22.parentTypes((java.util.Set<java.lang.String>) strSet78);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder81 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray94 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet95 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean96 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet95, strArray94);
        builder81.parentTypes = strSet95;
        builder22.excludeFields = strSet95;
        builder16.setexcludeFields((java.util.Set<java.lang.String>) strSet95);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(basicDBObject59);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(builder80);
        org.junit.Assert.assertNotNull(strArray94);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = builder0.getindexName();
        boolean boolean3 = builder0.getmongoSSLVerifyCertificate();
        java.lang.String str4 = builder0.typeName;
        builder0.setadvancedTransformation(false);
        int int7 = builder0.connectTimeout;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        builder8.setskipInitialImport(true);
        builder8.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder8.skipInitialImport(false);
        java.lang.String str16 = builder15.getstatisticsTypeName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder15.importAllCollections(true);
        boolean boolean19 = builder18.disableIndexRefresh;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray33 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        builder20.parentTypes = strSet34;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder18.parentTypes((java.util.Set<java.lang.String>) strSet34);
        builder0.setexcludeFields((java.util.Set<java.lang.String>) strSet34);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder0.disableIndexRefresh(true);
        java.lang.Boolean boolean41 = builder40.getisMongos();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNull(boolean41);
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        builder0.parentTypes = strSet14;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder0.script("port");
        java.util.Set<java.lang.String> strSet19 = builder18.getexcludeFields();
        int int20 = builder18.getconnectTimeout();
        org.elasticsearch.common.settings.Settings settings21 = null;
        org.elasticsearch.common.settings.Settings settings22 = null;
        org.elasticsearch.common.settings.Settings settings23 = null;
        org.elasticsearch.common.settings.Settings settings24 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet39 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet39, strArray38);
        builder25.parentTypes = strSet39;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder25.script("port");
        builder43.setriverName("disable_index_refresh");
        org.elasticsearch.common.settings.Settings settings46 = null;
        org.elasticsearch.common.settings.Settings settings47 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition49 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder48);
        builder48.setskipInitialImport(true);
        builder48.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder48.skipInitialImport(false);
        com.mongodb.BasicDBObject basicDBObject56 = builder48.getmongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings57 = new org.elasticsearch.river.RiverSettings(settings47, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject56);
        org.elasticsearch.river.RiverSettings riverSettings58 = new org.elasticsearch.river.RiverSettings(settings46, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject56);
        builder43.setmongoCollectionFilter(basicDBObject56);
        org.elasticsearch.river.RiverSettings riverSettings60 = new org.elasticsearch.river.RiverSettings(settings24, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject56);
        org.elasticsearch.river.RiverSettings riverSettings61 = new org.elasticsearch.river.RiverSettings(settings23, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject56);
        org.elasticsearch.river.RiverSettings riverSettings62 = new org.elasticsearch.river.RiverSettings(settings22, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject56);
        org.elasticsearch.river.RiverSettings riverSettings63 = new org.elasticsearch.river.RiverSettings(settings21, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject56);
        builder18.mongoOplogFilter = basicDBObject56;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition65 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder18);
        boolean boolean66 = mongoDBRiverDefinition65.storeStatistics;
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNull(strSet19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(basicDBObject56);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 1000);
        java.lang.Object obj4 = null;
        docScoreSearchScript0.setNextVar("concurrent_requests", obj4);
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextDocId((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        builder0.parentTypes = strSet14;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder0.skipInitialImport(true);
        builder0.statisticsTypeName = "gridfs";
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        builder0.parentTypes = strSet14;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder0.script("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.indexName("password");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder18.script("import_all_collections");
        java.lang.Boolean boolean23 = builder18.getisMongos();
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNull(boolean23);
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoDb("hi!");
        builder5.isMongos = true;
        java.lang.String str8 = builder5.typeName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder5.mongoSSLVerifyCertificate(false);
        java.lang.String str11 = builder10.gettypeName();
        builder10.setmongoAdminUser("throttle_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder10.throttleSize(100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder10);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.getDISABLE_INDEX_REFRESH_FIELD();
        java.lang.Boolean boolean4 = mongoDBRiverDefinition2.isMongos();
        boolean boolean5 = mongoDBRiverDefinition2.dropCollection;
        java.lang.String str6 = mongoDBRiverDefinition2.getRiverName();
        java.lang.String str7 = mongoDBRiverDefinition2.getNAME_FIELD();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "disable_index_refresh" + "'", str3, "disable_index_refresh");
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "name" + "'", str7, "name");
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        builder0.parentTypes = strSet14;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder0.throttleSize((int) (byte) 0);
        int int19 = builder0.getconnectTimeout();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder20);
        builder20.setskipInitialImport(true);
        builder20.scriptType = "admin";
        java.lang.String[] strArray28 = new java.lang.String[] { "", "password" };
        java.util.LinkedHashSet<java.lang.String> strSet29 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet29, strArray28);
        builder20.setincludeFields((java.util.Set<java.lang.String>) strSet29);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder0.excludeFields((java.util.Set<java.lang.String>) strSet29);
        builder32.statisticsTypeName = "throttle_size";
        builder32.script = "initial_timestamp";
        java.lang.String str37 = builder32.getmongoLocalUser();
        boolean boolean38 = builder32.mongoSecondaryReadPreference;
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        builder0.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.skipInitialImport(false);
        java.lang.String str8 = builder7.getstatisticsTypeName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder7.importAllCollections(true);
        boolean boolean11 = builder10.disableIndexRefresh;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet26 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet26, strArray25);
        builder12.parentTypes = strSet26;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder10.parentTypes((java.util.Set<java.lang.String>) strSet26);
        java.util.Set<java.lang.String> strSet30 = builder29.getexcludeFields();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder29.statisticsIndexName("bulk_timeout");
        builder32.setskipInitialImport(false);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNull(strSet30);
        org.junit.Assert.assertNotNull(builder32);
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoDb("hi!");
        builder5.isMongos = true;
        builder5.indexName = "password";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder10);
        builder10.setskipInitialImport(true);
        builder10.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder10.skipInitialImport(false);
        com.mongodb.BasicDBObject basicDBObject18 = builder10.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder5.mongoOplogFilter(basicDBObject18);
        boolean boolean20 = builder19.mongoGridFS;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder21);
        int int23 = builder21.getsocketTimeout();
        boolean boolean24 = builder21.advancedTransformation;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean26 = builder25.getimportAllCollections();
        java.lang.String str27 = builder25.getmongoAdminUser();
        java.util.List<com.mongodb.ServerAddress> serverAddressList28 = builder25.getmongoServers();
        builder21.mongoServers = serverAddressList28;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition31 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder30);
        builder30.setskipInitialImport(true);
        builder30.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder30.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray51 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet52 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet52, strArray51);
        builder38.parentTypes = strSet52;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder37.parentTypes((java.util.Set<java.lang.String>) strSet52);
        builder55.scriptType = "initial_timestamp";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition59 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder58);
        builder58.setskipInitialImport(true);
        builder58.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder65 = builder58.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder66 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray79 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet80 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet80, strArray79);
        builder66.parentTypes = strSet80;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder83 = builder65.parentTypes((java.util.Set<java.lang.String>) strSet80);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder84 = builder55.excludeFields((java.util.Set<java.lang.String>) strSet80);
        builder21.includeFields = strSet80;
        builder19.excludeFields = strSet80;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition87 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder19);
        java.lang.String str88 = builder19.getscript();
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(basicDBObject18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(serverAddressList28);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(builder83);
        org.junit.Assert.assertNotNull(builder84);
        org.junit.Assert.assertNull(str88);
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue2 = mongoDBRiverDefinition1.getDEFAULT_BULK_SIZE();
        int int3 = mongoDBRiverDefinition1.getDEFAULT_SOCKET_TIMEOUT();
        java.lang.String str4 = mongoDBRiverDefinition1.getINDEX_OBJECT();
        boolean boolean5 = mongoDBRiverDefinition1.getmongoSSLVerifyCertificate();
        java.lang.String str6 = mongoDBRiverDefinition1.getADMIN_DB_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition1.getOPTIONS_FIELD();
        java.lang.String str8 = mongoDBRiverDefinition1.getSCRIPT_FIELD();
        boolean boolean9 = mongoDBRiverDefinition1.getskipInitialImport();
        java.lang.String str10 = mongoDBRiverDefinition1.riverName;
        org.junit.Assert.assertNotNull(byteSizeValue2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "index" + "'", str4, "index");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "admin" + "'", str6, "admin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "options" + "'", str7, "options");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "script" + "'", str8, "script");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        builder0.parentTypes = strSet14;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder0.script("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.indexName("password");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder18);
        com.mongodb.MongoClientOptions mongoClientOptions22 = mongoDBRiverDefinition21.mongoClientOptions;
        java.lang.String str23 = mongoDBRiverDefinition21.getMongoLocalUser();
        java.lang.String str24 = mongoDBRiverDefinition21.getADVANCED_TRANSFORMATION_FIELD();
        java.lang.String str25 = mongoDBRiverDefinition21.getCONCURRENT_REQUESTS_FIELD();
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNull(mongoClientOptions22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "advanced_transformation" + "'", str24, "advanced_transformation");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "concurrent_requests" + "'", str25, "concurrent_requests");
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 1000);
        java.lang.Object obj4 = null;
        docScoreSearchScript0.setNextVar("concurrent_requests", obj4);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder6);
        java.lang.Object obj8 = docScoreSearchScript0.unwrap((java.lang.Object) builder6);
        docScoreSearchScript0.setNextVar("drop_collection", (java.lang.Object) "ssl");
        // The following exception was thrown during execution in test generation
        try {
            float float12 = docScoreSearchScript0.runAsFloat();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getimportAllCollections();
        java.lang.String str2 = builder0.getmongoAdminUser();
        java.util.List<com.mongodb.ServerAddress> serverAddressList3 = builder0.getmongoServers();
        boolean boolean4 = builder0.getmongoGridFS();
        builder0.setdropCollection(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.script("local");
        boolean boolean9 = builder0.dropCollection;
        builder0.setscript("bulk_timeout");
        java.lang.Class<?> wildcardClass12 = builder0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(serverAddressList3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str4 = builder0.getindexName();
        builder0.setstatisticsIndexName("local");
        int int7 = builder0.socketTimeout;
        builder0.setmongoGridFS(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean11 = builder0.getmongoSecondaryReadPreference();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoDb("hi!");
        builder5.isMongos = true;
        java.lang.String str8 = builder5.typeName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder5.mongoSSLVerifyCertificate(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet25 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet25, strArray24);
        builder11.parentTypes = strSet25;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder11.script("port");
        builder29.setriverName("disable_index_refresh");
        org.elasticsearch.common.settings.Settings settings32 = null;
        org.elasticsearch.common.settings.Settings settings33 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition35 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder34);
        builder34.setskipInitialImport(true);
        builder34.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder34.skipInitialImport(false);
        com.mongodb.BasicDBObject basicDBObject42 = builder34.getmongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings43 = new org.elasticsearch.river.RiverSettings(settings33, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject42);
        org.elasticsearch.river.RiverSettings riverSettings44 = new org.elasticsearch.river.RiverSettings(settings32, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject42);
        builder29.setmongoCollectionFilter(basicDBObject42);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder5.mongoCollectionFilter(basicDBObject42);
        int int47 = builder5.getsocketTimeout();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition48 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        boolean boolean49 = mongoDBRiverDefinition48.getdisableIndexRefresh();
        java.lang.String str50 = mongoDBRiverDefinition48.getHOST_FIELD();
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(basicDBObject42);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "host" + "'", str50, "host");
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        builder0.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.skipInitialImport(false);
        com.mongodb.BasicDBObject basicDBObject8 = builder0.getmongoCollectionFilter();
        builder0.setmongoGridFS(true);
        java.lang.String str11 = builder0.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder0.includeCollection("gridfs");
        int int14 = builder13.throttleSize;
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(basicDBObject8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoDb("hi!");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp6 = builder0.initialTimestamp;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.mongoGridFS(true);
        builder0.mongoSSLVerifyCertificate = false;
        boolean boolean11 = builder0.getadvancedTransformation();
        java.lang.String str12 = builder0.getstatisticsTypeName();
        builder0.setmongoAdminUser("socket_timeout");
        builder0.setskipInitialImport(true);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(wildcardTimestamp6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.common.settings.Settings settings1 = null;
        org.elasticsearch.common.settings.Settings settings2 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder3);
        builder3.setskipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder3.mongoDb("hi!");
        builder8.isMongos = true;
        builder8.indexName = "password";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder13);
        builder13.setskipInitialImport(true);
        builder13.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder13.skipInitialImport(false);
        com.mongodb.BasicDBObject basicDBObject21 = builder13.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder8.mongoOplogFilter(basicDBObject21);
        org.elasticsearch.river.RiverSettings riverSettings23 = new org.elasticsearch.river.RiverSettings(settings2, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject21);
        org.elasticsearch.river.RiverSettings riverSettings24 = new org.elasticsearch.river.RiverSettings(settings1, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject21);
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(basicDBObject21);
        org.junit.Assert.assertNotNull(builder22);
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setmongoLocalPassword("hi!");
        builder0.mongoLocalPassword = "is_mongos";
        builder0.importAllCollections = false;
        com.mongodb.BasicDBObject basicDBObject8 = builder0.getmongoOplogFilter();
        org.junit.Assert.assertNull(basicDBObject8);
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getimportAllCollections();
        java.lang.String str2 = builder0.mongoAdminUser;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.storeStatistics(true);
        boolean boolean5 = builder0.disableIndexRefresh;
        boolean boolean6 = builder0.getmongoUseSSL();
        builder0.setstoreStatistics(true);
        boolean boolean9 = builder0.disableIndexRefresh;
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        builder0.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.skipInitialImport(false);
        java.lang.String str8 = builder7.getstatisticsTypeName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder7);
        java.lang.String str10 = mongoDBRiverDefinition9.getFILTER_FIELD();
        boolean boolean11 = mongoDBRiverDefinition9.getadvancedTransformation();
        java.lang.String str12 = mongoDBRiverDefinition9.getBULK_FIELD();
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "filter" + "'", str10, "filter");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "bulk" + "'", str12, "bulk");
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setriverIndexName("admin");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean5 = mongoDBRiverDefinition4.advancedTransformation;
        java.lang.String str6 = mongoDBRiverDefinition4.getRiverName();
        boolean boolean7 = mongoDBRiverDefinition4.skipInitialImport;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        builder0.parentTypes = strSet14;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder0.throttleSize((int) (byte) 0);
        int int19 = builder0.getconnectTimeout();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder20);
        builder20.setskipInitialImport(true);
        builder20.scriptType = "admin";
        java.lang.String[] strArray28 = new java.lang.String[] { "", "password" };
        java.util.LinkedHashSet<java.lang.String> strSet29 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet29, strArray28);
        builder20.setincludeFields((java.util.Set<java.lang.String>) strSet29);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder0.excludeFields((java.util.Set<java.lang.String>) strSet29);
        builder32.statisticsTypeName = "throttle_size";
        builder32.script = "initial_timestamp";
        com.mongodb.BasicDBObject basicDBObject37 = builder32.getmongoCollectionFilter();
        java.lang.String str38 = builder32.getriverIndexName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition39 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder32);
        java.lang.String str40 = mongoDBRiverDefinition39.getDROP_COLLECTION_FIELD();
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(basicDBObject37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "drop_collection" + "'", str40, "drop_collection");
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean4 = mongoDBRiverDefinition3.isDropCollection();
        boolean boolean5 = mongoDBRiverDefinition3.isDisableIndexRefresh();
        java.lang.String str6 = mongoDBRiverDefinition3.getBULK_SIZE_FIELD();
        boolean boolean7 = mongoDBRiverDefinition3.isSkipInitialImport();
        java.lang.String str8 = mongoDBRiverDefinition3.getSTORE_STATISTICS_FIELD();
        java.lang.String str9 = mongoDBRiverDefinition3.getDEFAULT_DB_HOST();
        org.elasticsearch.common.unit.TimeValue timeValue10 = mongoDBRiverDefinition3.getDEFAULT_FLUSH_INTERVAL();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "bulk_size" + "'", str6, "bulk_size");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "store_statistics" + "'", str8, "store_statistics");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "localhost" + "'", str9, "localhost");
        org.junit.Assert.assertNotNull(timeValue10);
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.getSSL_CONNECTION_FIELD();
        boolean boolean3 = mongoDBRiverDefinition1.isStoreStatistics();
        java.lang.String str4 = mongoDBRiverDefinition1.getLOCAL_DB_FIELD();
        java.lang.String str5 = mongoDBRiverDefinition1.getStatisticsIndexName();
        java.lang.Boolean boolean6 = mongoDBRiverDefinition1.isMongos();
        java.lang.String str7 = mongoDBRiverDefinition1.getACTIONS_FIELD();
        int int8 = mongoDBRiverDefinition1.getDEFAULT_CONCURRENT_REQUESTS();
        boolean boolean9 = mongoDBRiverDefinition1.isMongoGridFS();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ssl" + "'", str2, "ssl");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "local" + "'", str4, "local");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(boolean6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "actions" + "'", str7, "actions");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.getEXCLUDE_FIELDS_FIELD();
        java.lang.String str3 = mongoDBRiverDefinition1.getRiverName();
        java.lang.String str4 = mongoDBRiverDefinition1.getGRIDFS_FIELD();
        java.lang.String str5 = mongoDBRiverDefinition1.getMongoAdminPassword();
        java.util.Set<java.lang.String> strSet6 = mongoDBRiverDefinition1.getIncludeFields();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "exclude_fields" + "'", str2, "exclude_fields");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "gridfs" + "'", str4, "gridfs");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(strSet6);
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.getFLUSH_INTERVAL_FIELD();
        boolean boolean4 = mongoDBRiverDefinition2.getmongoUseSSL();
        java.lang.String str5 = mongoDBRiverDefinition2.getSCRIPT_FIELD();
        java.lang.String str6 = mongoDBRiverDefinition2.getDROP_COLLECTION_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition2.getPORT_FIELD();
        java.lang.String str8 = mongoDBRiverDefinition2.indexName;
        java.lang.String str9 = mongoDBRiverDefinition2.getINCLUDE_COLLECTION_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition2.includeCollection;
        java.lang.String str11 = mongoDBRiverDefinition2.statisticsIndexName;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "flush_interval" + "'", str3, "flush_interval");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "script" + "'", str5, "script");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "drop_collection" + "'", str6, "drop_collection");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "port" + "'", str7, "port");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "include_collection" + "'", str9, "include_collection");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setriverIndexName("admin");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean5 = mongoDBRiverDefinition4.advancedTransformation;
        boolean boolean6 = mongoDBRiverDefinition4.mongoGridFS;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoDb("hi!");
        builder5.indexName = "skip_initial_import";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder5.mongoDb("password");
        builder5.throttleSize = (byte) 1;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder5.mongoLocalPassword("servers");
        builder13.setstoreStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder13);
        boolean boolean17 = builder13.getmongoSSLVerifyCertificate();
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        builder0.parentTypes = strSet14;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder0.throttleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.typeName("disable_index_refresh");
        java.lang.String str21 = builder18.getstatisticsIndexName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder18.mongoLocalPassword("admin");
        java.lang.String str24 = builder18.getmongoDb();
        builder18.dropCollection = false;
        java.lang.String str27 = builder18.getriverIndexName();
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.getSSL_CONNECTION_FIELD();
        boolean boolean3 = mongoDBRiverDefinition1.isStoreStatistics();
        boolean boolean4 = mongoDBRiverDefinition1.mongoGridFS;
        java.lang.String str5 = mongoDBRiverDefinition1.getFILTER_FIELD();
        java.lang.String str6 = mongoDBRiverDefinition1.getOPTIONS_FIELD();
        boolean boolean7 = mongoDBRiverDefinition1.isImportAllCollections();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ssl" + "'", str2, "ssl");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "filter" + "'", str5, "filter");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "options" + "'", str6, "options");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.mongoAdminUser("credentials");
        builder4.setadvancedTransformation(false);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoDb("hi!");
        builder5.isMongos = true;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder5.mongoDb("password");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue2 = mongoDBRiverDefinition1.getDEFAULT_BULK_SIZE();
        int int3 = mongoDBRiverDefinition1.getDEFAULT_SOCKET_TIMEOUT();
        java.lang.String str4 = mongoDBRiverDefinition1.getINDEX_OBJECT();
        boolean boolean5 = mongoDBRiverDefinition1.getmongoSSLVerifyCertificate();
        java.util.Set<java.lang.String> strSet6 = mongoDBRiverDefinition1.getParentTypes();
        java.lang.String str7 = mongoDBRiverDefinition1.getSSL_VERIFY_CERT_FIELD();
        org.junit.Assert.assertNotNull(byteSizeValue2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60000 + "'", int3 == 60000);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "index" + "'", str4, "index");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ssl_verify_certificate" + "'", str7, "ssl_verify_certificate");
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.getSSL_CONNECTION_FIELD();
        int int3 = mongoDBRiverDefinition1.getDEFAULT_CONNECT_TIMEOUT();
        java.lang.String str4 = mongoDBRiverDefinition1.getADMIN_DB_FIELD();
        int int5 = mongoDBRiverDefinition1.connectTimeout;
        java.util.Set<java.lang.String> strSet6 = mongoDBRiverDefinition1.getExcludeFields();
        java.lang.String str7 = mongoDBRiverDefinition1.indexName;
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ssl" + "'", str2, "ssl");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 30000 + "'", int3 == 30000);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "admin" + "'", str4, "admin");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(strSet6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        builder0.parentTypes = strSet14;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder0.script("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.indexName("password");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder18);
        boolean boolean22 = builder18.mongoSecondaryReadPreference;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder18.mongoLocalUser("");
        boolean boolean25 = builder18.importAllCollections;
        builder18.setmongoLocalUser("user");
        java.lang.String str28 = builder18.mongoLocalPassword;
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript2 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript2.setNextScore((float) 1000);
        docScoreSearchScript2.setNextScore((float) 1000);
        docScoreSearchScript0.setNextVar("include_fields", (java.lang.Object) 1000);
        java.lang.Object obj9 = null;
        docScoreSearchScript0.setNextVar("drop_collection", obj9);
        org.apache.lucene.index.AtomicReaderContext atomicReaderContext11 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextReader(atomicReaderContext11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        builder0.parentTypes = strSet14;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder0.throttleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str20 = builder0.getindexName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder0.mongoLocalPassword("gridfs");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder22.dropCollection(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder22);
        java.lang.String str26 = mongoDBRiverDefinition25.getSSL_VERIFY_CERT_FIELD();
        java.lang.String str27 = mongoDBRiverDefinition25.getRiverIndexName();
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "ssl_verify_certificate" + "'", str26, "ssl_verify_certificate");
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        builder0.parentTypes = strSet14;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder0.throttleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.indexName("index");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean24 = builder23.getimportAllCollections();
        java.lang.String str25 = builder23.getmongoAdminUser();
        java.util.List<com.mongodb.ServerAddress> serverAddressList26 = builder23.getmongoServers();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder22.mongoServers(serverAddressList26);
        builder27.setriverIndexName("import_all_collections");
        com.mongodb.BasicDBObject basicDBObject30 = builder27.getmongoCollectionFilter();
        java.lang.String str31 = builder27.typeName;
        builder27.setscriptType("null.null");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(serverAddressList26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(basicDBObject30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "disable_index_refresh" + "'", str31, "disable_index_refresh");
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.getSERVERS_FIELD();
        java.lang.String str4 = mongoDBRiverDefinition2.mongoLocalPassword;
        int int5 = mongoDBRiverDefinition2.getDEFAULT_DB_PORT();
        com.mongodb.MongoClientOptions mongoClientOptions6 = mongoDBRiverDefinition2.getMongoClientOptions();
        java.util.Set<java.lang.String> strSet7 = mongoDBRiverDefinition2.getIncludeFields();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "servers" + "'", str3, "servers");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27017 + "'", int5 == 27017);
        org.junit.Assert.assertNull(mongoClientOptions6);
        org.junit.Assert.assertNull(strSet7);
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("import_all_collections");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?import_all_collections?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        builder0.parentTypes = strSet14;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder0.throttleSize((int) (byte) 0);
        builder0.setstatisticsIndexName("index");
        builder0.setincludeCollection("options");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        builder0.parentTypes = strSet14;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder0.script("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.indexName("password");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder18);
        com.mongodb.MongoClientOptions mongoClientOptions22 = mongoDBRiverDefinition21.mongoClientOptions;
        java.lang.String str23 = mongoDBRiverDefinition21.getMongoLocalUser();
        java.lang.String str24 = mongoDBRiverDefinition21.getADVANCED_TRANSFORMATION_FIELD();
        boolean boolean25 = mongoDBRiverDefinition21.isImportAllCollections();
        boolean boolean26 = mongoDBRiverDefinition21.getmongoUseSSL();
        java.lang.String str27 = mongoDBRiverDefinition21.getINITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD();
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNull(mongoClientOptions22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "advanced_transformation" + "'", str24, "advanced_transformation");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "script_type" + "'", str27, "script_type");
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = builder0.getindexName();
        boolean boolean3 = builder0.getmongoSSLVerifyCertificate();
        java.lang.String str4 = builder0.includeCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoAdminPassword("bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean8 = builder0.advancedTransformation;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str3 = mongoDBRiverDefinition2.getDISABLE_INDEX_REFRESH_FIELD();
        java.util.Set<java.lang.String> strSet4 = mongoDBRiverDefinition2.getParentTypes();
        java.lang.String str5 = mongoDBRiverDefinition2.getMongoLocalUser();
        int int6 = mongoDBRiverDefinition2.throttleSize;
        java.lang.String str7 = mongoDBRiverDefinition2.statisticsTypeName;
        java.util.List<com.mongodb.ServerAddress> serverAddressList8 = mongoDBRiverDefinition2.mongoServers;
        java.util.Set<java.lang.String> strSet9 = mongoDBRiverDefinition2.getParentTypes();
        java.lang.String str10 = mongoDBRiverDefinition2.getScriptType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "disable_index_refresh" + "'", str3, "disable_index_refresh");
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(serverAddressList8);
        org.junit.Assert.assertNull(strSet9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str4 = builder0.getindexName();
        java.lang.Boolean boolean5 = builder0.isMongos;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.storeStatistics(false);
        boolean boolean8 = builder0.dropCollection;
        int int9 = builder0.connectTimeout;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(boolean5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        builder0.parentTypes = strSet14;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder0.script("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.indexName("password");
        builder20.setimportAllCollections(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder20.mongoSSLVerifyCertificate(false);
        java.lang.String str25 = builder24.getmongoAdminPassword();
        java.lang.String str26 = builder24.getriverName();
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = builder0.getindexName();
        boolean boolean3 = builder0.getmongoSSLVerifyCertificate();
        java.lang.String str4 = builder0.typeName;
        builder0.setmongoLocalPassword("ssl_verify_certificate");
        builder0.statisticsTypeName = "script_type";
        builder0.setscriptType("script");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setskipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoDb("hi!");
        builder5.isMongos = true;
        java.lang.String str8 = builder5.typeName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder5.mongoSSLVerifyCertificate(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet25 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet25, strArray24);
        builder11.parentTypes = strSet25;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder11.script("port");
        builder29.setriverName("disable_index_refresh");
        org.elasticsearch.common.settings.Settings settings32 = null;
        org.elasticsearch.common.settings.Settings settings33 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition35 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder34);
        builder34.setskipInitialImport(true);
        builder34.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder34.skipInitialImport(false);
        com.mongodb.BasicDBObject basicDBObject42 = builder34.getmongoCollectionFilter();
        org.elasticsearch.river.RiverSettings riverSettings43 = new org.elasticsearch.river.RiverSettings(settings33, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject42);
        org.elasticsearch.river.RiverSettings riverSettings44 = new org.elasticsearch.river.RiverSettings(settings32, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject42);
        builder29.setmongoCollectionFilter(basicDBObject42);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder5.mongoCollectionFilter(basicDBObject42);
        int int47 = builder5.getsocketTimeout();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition48 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str49 = builder5.statisticsTypeName;
        builder5.script = "servers";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder5.mongoSSLVerifyCertificate(true);
        builder53.setmongoUseSSL(false);
        builder53.setscriptType(".scripts");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(basicDBObject42);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(builder53);
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        builder0.parentTypes = strSet14;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder0.script("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.indexName("password");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.script("concurrent_bulk_requests");
        builder20.script = "store_statistics";
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        builder0.parentTypes = strSet14;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder0.throttleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder0.mongoLocalPassword("script");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition22 = builder21.build();
        java.lang.String str23 = mongoDBRiverDefinition22.getMongoOplogNamespace();
        java.lang.String str24 = mongoDBRiverDefinition22.getIS_MONGOS_FIELD();
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "null.null" + "'", str23, "null.null");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "is_mongos" + "'", str24, "is_mongos");
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.getSSL_CONNECTION_FIELD();
        boolean boolean3 = mongoDBRiverDefinition1.isStoreStatistics();
        boolean boolean4 = mongoDBRiverDefinition1.mongoGridFS;
        java.lang.String str5 = mongoDBRiverDefinition1.getFILTER_FIELD();
        boolean boolean6 = mongoDBRiverDefinition1.mongoSSLVerifyCertificate;
        java.lang.String str7 = mongoDBRiverDefinition1.getLOCAL_DB_FIELD();
        boolean boolean8 = mongoDBRiverDefinition1.isMongoUseSSL();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ssl" + "'", str2, "ssl");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "filter" + "'", str5, "filter");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "local" + "'", str7, "local");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean1 = builder0.getimportAllCollections();
        java.lang.String str2 = builder0.getmongoAdminUser();
        java.lang.String str3 = builder0.typeName;
        boolean boolean4 = builder0.getstoreStatistics();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.socketTimeout(8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str11 = builder8.getmongoLocalUser();
        builder8.riverName = "store_statistics";
        java.util.List<com.mongodb.ServerAddress> serverAddressList14 = builder8.mongoServers;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder0.mongoServers(serverAddressList14);
        java.lang.String str16 = builder15.includeCollection;
        java.lang.String str17 = builder15.getindexName();
        java.lang.String str18 = builder15.getscript();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(serverAddressList14);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
    }
}

