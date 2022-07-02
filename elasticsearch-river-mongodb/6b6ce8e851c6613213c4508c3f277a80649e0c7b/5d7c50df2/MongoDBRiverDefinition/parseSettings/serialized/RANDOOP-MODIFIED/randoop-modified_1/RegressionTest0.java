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
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.SOCKET_TIMEOUT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "socket_timeout" + "'", str0, "socket_timeout");
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.HOST_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "host" + "'", str0, "host");
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.LOCAL_DB_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "local" + "'", str0, "local");
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.COLLECTION_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "collection" + "'", str0, "collection");
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.INCLUDE_COLLECTION_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "include_collection" + "'", str0, "include_collection");
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.elasticsearch.common.ParseField parseField0 = org.elasticsearch.script.ScriptService.KEY_SCRIPT_INLINE;
        org.junit.Assert.assertNotNull(parseField0);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        builder0.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.importAllCollections(true);
        java.lang.String str9 = builder8.getmongoAdminPassword();
        builder8.setriverName("include_collection");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
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
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DISABLE_INDEX_REFRESH_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "disable_index_refresh" + "'", str0, "disable_index_refresh");
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
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
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.elasticsearch.common.ParseField parseField0 = org.elasticsearch.script.ScriptService.KEY_SCRIPT_FILE;
        org.junit.Assert.assertNotNull(parseField0);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.elasticsearch.common.ParseField parseField0 = org.elasticsearch.script.ScriptService.VALUE_SCRIPT_ID;
        org.junit.Assert.assertNotNull(parseField0);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        javax.net.SocketFactory socketFactory0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.getSSLSocketFactory();
        org.junit.Assert.assertNotNull(socketFactory0);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
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
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.elasticsearch.common.ParseField parseField0 = org.elasticsearch.script.ScriptService.SCRIPT_ID;
        org.junit.Assert.assertNotNull(parseField0);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("local", "socket_timeout", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?socket_timeout?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.elasticsearch.common.ParseField parseField0 = org.elasticsearch.script.ScriptService.VALUE_SCRIPT_INLINE;
        org.junit.Assert.assertNotNull(parseField0);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings1 = serializedObjectSupporter0.deserializeObjectRiverSettings3();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(riverSettings1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mongodb-1638820218299" + "'", str2, "mongodb-1638820218299");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_river" + "'", str3, "_river");
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.PASSWORD_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "password" + "'", str0, "password");
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        int int0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DEFAULT_SOCKET_TIMEOUT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 60000 + "'", int0 == 60000);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.SKIP_INITIAL_IMPORT_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "skip_initial_import" + "'", str0, "skip_initial_import");
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        java.lang.String str0 = org.elasticsearch.script.ScriptService.DEFAULT_SCRIPTING_LANGUAGE_SETTING;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "script.default_lang" + "'", str0, "script.default_lang");
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings1 = serializedObjectSupporter0.deserializeObjectRiverSettings3();
        org.elasticsearch.river.RiverSettings riverSettings2 = serializedObjectSupporter0.deserializeObjectRiverSettings2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(riverSettings1);
        org.junit.Assert.assertNotNull(riverSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_river" + "'", str3, "_river");
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.elasticsearch.common.ParseField parseField0 = org.elasticsearch.script.ScriptService.KEY_SCRIPT_ID;
        org.junit.Assert.assertNotNull(parseField0);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.CONCURRENT_BULK_REQUESTS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "concurrent_bulk_requests" + "'", str0, "concurrent_bulk_requests");
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "local");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextSource(strMap3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "local" + "'", obj2, "local");
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.EXCLUDE_FIELDS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "exclude_fields" + "'", str0, "exclude_fields");
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.SECONDARY_READ_PREFERENCE_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "secondary_read_preference" + "'", str0, "secondary_read_preference");
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.elasticsearch.common.settings.Settings settings0 = null;
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = null;
        org.elasticsearch.river.RiverSettings riverSettings2 = new org.elasticsearch.river.RiverSettings(settings0, strMap1);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.mongoDb;
        int int3 = mongoDBRiverDefinition1.throttleSize;
        int int4 = mongoDBRiverDefinition1.getDEFAULT_BULK_ACTIONS();
        boolean boolean5 = mongoDBRiverDefinition1.mongoUseSSL;
        java.lang.String str6 = mongoDBRiverDefinition1.getSIZE_FIELD();
        boolean boolean7 = mongoDBRiverDefinition1.mongoSSLVerifyCertificate;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1000 + "'", int4 == 1000);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "size" + "'", str6, "size");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.elasticsearch.common.ParseField parseField0 = org.elasticsearch.script.ScriptService.SCRIPT_LANG;
        org.junit.Assert.assertNotNull(parseField0);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.elasticsearch.common.logging.ESLogger eSLogger0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.logger;
        org.junit.Assert.assertNotNull(eSLogger0);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.elasticsearch.common.ParseField parseField0 = org.elasticsearch.script.ScriptService.SCRIPT_FILE;
        org.junit.Assert.assertNotNull(parseField0);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        com.mongodb.ServerAddress[] serverAddressArray9 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList10 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList10, serverAddressArray9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList10);
        int int13 = builder0.getconnectTimeout();
        java.util.Set<java.lang.String> strSet14 = builder0.getexcludeFields();
        org.bson.types.Binary binary15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder0.initialTimestamp(binary15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(serverAddressArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(strSet14);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.NAME_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "name" + "'", str0, "name");
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.SCRIPT_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "script" + "'", str0, "script");
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
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
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.elasticsearch.common.unit.TimeValue timeValue0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DEFAULT_FLUSH_INTERVAL;
        org.junit.Assert.assertNotNull(timeValue0);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.CONCURRENT_REQUESTS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "concurrent_requests" + "'", str0, "concurrent_requests");
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DB_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "db" + "'", str0, "db");
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings1 = serializedObjectSupporter0.deserializeObjectRiverSettings3();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        org.elasticsearch.river.RiverSettings riverSettings3 = serializedObjectSupporter0.deserializeObjectRiverSettings2();
        org.elasticsearch.river.RiverSettings riverSettings4 = serializedObjectSupporter0.deserializeObjectRiverSettings4();
        org.elasticsearch.common.settings.Settings settings5 = riverSettings4.globalSettings();
        org.elasticsearch.env.Environment environment6 = null;
        org.elasticsearch.script.ScriptEngineService[] scriptEngineServiceArray7 = new org.elasticsearch.script.ScriptEngineService[] {};
        java.util.LinkedHashSet<org.elasticsearch.script.ScriptEngineService> scriptEngineServiceSet8 = new java.util.LinkedHashSet<org.elasticsearch.script.ScriptEngineService>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.elasticsearch.script.ScriptEngineService>) scriptEngineServiceSet8, scriptEngineServiceArray7);
        org.elasticsearch.watcher.ResourceWatcherService resourceWatcherService10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.script.ScriptService scriptService11 = new org.elasticsearch.script.ScriptService(settings5, environment6, (java.util.Set<org.elasticsearch.script.ScriptEngineService>) scriptEngineServiceSet8, resourceWatcherService10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(riverSettings1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mongodb-1638820218299" + "'", str2, "mongodb-1638820218299");
        org.junit.Assert.assertNotNull(riverSettings3);
        org.junit.Assert.assertNotNull(riverSettings4);
        org.junit.Assert.assertNotNull(settings5);
        org.junit.Assert.assertNotNull(scriptEngineServiceArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        java.lang.String str0 = org.elasticsearch.script.ScriptService.DISABLE_DYNAMIC_SCRIPTING_SETTING;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "script.disable_dynamic" + "'", str0, "script.disable_dynamic");
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.INITIAL_TIMESTAMP_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "initial_timestamp" + "'", str0, "initial_timestamp");
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        com.mongodb.ServerAddress[] serverAddressArray9 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList10 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList10, serverAddressArray9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList10);
        int int13 = builder0.getconnectTimeout();
        java.lang.String str14 = builder0.getincludeCollection();
        java.lang.Class<?> wildcardClass15 = builder0.getClass();
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(serverAddressArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "socket_timeout" + "'", str14, "socket_timeout");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("concurrent_bulk_requests", "mongodb-1638820218299", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?mongodb-1638820218299?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.SIZE_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "size" + "'", str0, "size");
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.elasticsearch.common.ParseField parseField0 = org.elasticsearch.script.ScriptService.SCRIPT_INLINE;
        org.junit.Assert.assertNotNull(parseField0);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.OPTIONS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "options" + "'", str0, "options");
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = builder10.initialTimestamp;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder10.riverIndexName("skip_initial_import");
        boolean boolean14 = builder10.getskipInitialImport();
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        int int0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DEFAULT_CONCURRENT_REQUESTS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.THROTTLE_SIZE_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "throttle_size" + "'", str0, "throttle_size");
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.includeCollection("mongodb-1638820218299");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder12);
        java.lang.String str14 = mongoDBRiverDefinition13.script;
        java.lang.String str15 = mongoDBRiverDefinition13.getINCLUDE_FIELDS_FIELD();
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "include_fields" + "'", str15, "include_fields");
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.PORT_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "port" + "'", str0, "port");
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DROP_COLLECTION_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "drop_collection" + "'", str0, "drop_collection");
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.USER_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "user" + "'", str0, "user");
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        java.lang.String str0 = org.elasticsearch.script.ScriptService.SCRIPT_INDEX;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + ".scripts" + "'", str0, ".scripts");
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        builder0.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.importAllCollections(true);
        java.lang.String str9 = builder8.getmongoAdminPassword();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder8.mongoLocalPassword("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.mongoLocalPassword("import_all_collections");
        builder13.mongoAdminPassword = "parent_types";
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
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
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.BULK_TIMEOUT_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "bulk_timeout" + "'", str0, "bulk_timeout");
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("_river", "mongodb-1638820218424");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?mongodb-1638820218424?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.ADVANCED_TRANSFORMATION_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "advanced_transformation" + "'", str0, "advanced_transformation");
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("filter");
        java.lang.String str4 = builder0.indexName;
        boolean boolean5 = builder0.getadvancedTransformation();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("concurrent_bulk_requests");
        java.lang.String str11 = builder10.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder12);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder12);
        builder12.mongoAdminPassword = "";
        builder12.socketTimeout = (short) 0;
        boolean boolean19 = builder12.storeStatistics;
        builder12.scriptType = "mongodb-1638820218299";
        java.lang.String[] strArray23 = new java.lang.String[] { "mongodb-1638820218299" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder12.excludeFields((java.util.Set<java.lang.String>) strSet24);
        builder10.setparentTypes((java.util.Set<java.lang.String>) strSet24);
        builder10.setskipInitialImport(true);
        builder10.setmongoDb("skip_initial_import");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(builder26);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.GRIDFS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "gridfs" + "'", str0, "gridfs");
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.BULK_SIZE_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "bulk_size" + "'", str0, "bulk_size");
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.SSL_VERIFY_CERT_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ssl_verify_certificate" + "'", str0, "ssl_verify_certificate");
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings1 = serializedObjectSupporter0.deserializeObjectRiverSettings3();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        org.elasticsearch.river.RiverSettings riverSettings3 = serializedObjectSupporter0.deserializeObjectRiverSettings2();
        org.elasticsearch.river.RiverSettings riverSettings4 = serializedObjectSupporter0.deserializeObjectRiverSettings4();
        org.elasticsearch.common.settings.Settings settings5 = riverSettings4.globalSettings();
        org.elasticsearch.env.Environment environment6 = null;
        java.util.Set<org.elasticsearch.script.ScriptEngineService> scriptEngineServiceSet7 = null;
        org.elasticsearch.watcher.ResourceWatcherService resourceWatcherService8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.script.ScriptService scriptService9 = new org.elasticsearch.script.ScriptService(settings5, environment6, scriptEngineServiceSet7, resourceWatcherService8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(riverSettings1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mongodb-1638820218299" + "'", str2, "mongodb-1638820218299");
        org.junit.Assert.assertNotNull(riverSettings3);
        org.junit.Assert.assertNotNull(riverSettings4);
        org.junit.Assert.assertNotNull(settings5);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        com.mongodb.ServerAddress[] serverAddressArray9 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList10 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList10, serverAddressArray9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.isMongos((java.lang.Boolean) true);
        boolean boolean15 = builder12.getadvancedTransformation();
        builder12.setmongoSSLVerifyCertificate(true);
        builder12.setmongoUseSSL(false);
        builder12.mongoSSLVerifyCertificate = true;
        org.bson.types.BSONTimestamp bSONTimestamp22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder12.initialTimestamp(bSONTimestamp22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ts must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(serverAddressArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
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
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.mongoDb;
        java.lang.String str3 = mongoDBRiverDefinition1.getCONCURRENT_BULK_REQUESTS_FIELD();
        int int4 = mongoDBRiverDefinition1.throttleSize;
        boolean boolean5 = mongoDBRiverDefinition1.isDropCollection();
        boolean boolean6 = mongoDBRiverDefinition1.getadvancedTransformation();
        java.lang.Class<?> wildcardClass7 = mongoDBRiverDefinition1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "concurrent_bulk_requests" + "'", str3, "concurrent_bulk_requests");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        builder0.socketTimeout = (short) 0;
        boolean boolean7 = builder0.storeStatistics;
        builder0.scriptType = "mongodb-1638820218299";
        java.lang.String[] strArray11 = new java.lang.String[] { "mongodb-1638820218299" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder0.excludeFields((java.util.Set<java.lang.String>) strSet12);
        builder14.setsocketTimeout(0);
        org.bson.types.Binary binary17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder14.initialTimestamp(binary17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.mongoDb;
        java.lang.String str3 = mongoDBRiverDefinition1.getCONCURRENT_BULK_REQUESTS_FIELD();
        java.lang.String str4 = mongoDBRiverDefinition1.getMongoLocalUser();
        java.lang.String str5 = mongoDBRiverDefinition1.getPARENT_TYPES_FIELD();
        java.lang.String str6 = mongoDBRiverDefinition1.getCONNECT_TIMEOUT();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "concurrent_bulk_requests" + "'", str3, "concurrent_bulk_requests");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "parent_types" + "'", str5, "parent_types");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "connect_timeout" + "'", str6, "connect_timeout");
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.IMPORT_ALL_COLLECTIONS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "import_all_collections" + "'", str0, "import_all_collections");
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("include_collection", "", false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "local");
        org.apache.lucene.search.Scorer scorer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setScorer(scorer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "local" + "'", obj2, "local");
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = builder10.initialTimestamp;
        com.mongodb.MongoClientOptions mongoClientOptions12 = null;
        builder10.mongoClientOptions = mongoClientOptions12;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder14);
        java.util.Set<java.lang.String> strSet16 = builder14.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder17);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder17);
        builder17.mongoAdminPassword = "";
        builder17.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder17.importAllCollections(true);
        java.lang.String str26 = builder25.getmongoAdminPassword();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder25.mongoLocalPassword("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition30 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder29);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition31 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder29);
        builder29.mongoAdminPassword = "";
        builder29.socketTimeout = (short) 0;
        boolean boolean36 = builder29.storeStatistics;
        builder29.scriptType = "mongodb-1638820218299";
        java.lang.String[] strArray40 = new java.lang.String[] { "mongodb-1638820218299" };
        java.util.LinkedHashSet<java.lang.String> strSet41 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet41, strArray40);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder29.excludeFields((java.util.Set<java.lang.String>) strSet41);
        builder25.setexcludeFields((java.util.Set<java.lang.String>) strSet41);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder14.parentTypes((java.util.Set<java.lang.String>) strSet41);
        builder10.setincludeFields((java.util.Set<java.lang.String>) strSet41);
        java.lang.String str47 = builder10.gettypeName();
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNull(strSet16);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNull(str47);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("name", "mongodb-1638820218264");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?mongodb-1638820218264?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DEFAULT_DB_HOST;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "localhost" + "'", str0, "localhost");
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter2 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings3 = serializedObjectSupporter2.deserializeObjectRiverSettings4();
        org.elasticsearch.script.ScriptService scriptService4 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("script", "advanced_transformation", riverSettings3, scriptService4);
        org.elasticsearch.common.settings.Settings settings6 = riverSettings3.globalSettings();
        org.elasticsearch.env.Environment environment7 = null;
        org.elasticsearch.script.ScriptEngineService[] scriptEngineServiceArray8 = new org.elasticsearch.script.ScriptEngineService[] {};
        java.util.LinkedHashSet<org.elasticsearch.script.ScriptEngineService> scriptEngineServiceSet9 = new java.util.LinkedHashSet<org.elasticsearch.script.ScriptEngineService>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.elasticsearch.script.ScriptEngineService>) scriptEngineServiceSet9, scriptEngineServiceArray8);
        org.elasticsearch.watcher.ResourceWatcherService resourceWatcherService11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.script.ScriptService scriptService12 = new org.elasticsearch.script.ScriptService(settings6, environment7, (java.util.Set<org.elasticsearch.script.ScriptEngineService>) scriptEngineServiceSet9, resourceWatcherService11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(riverSettings3);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(scriptEngineServiceArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("concurrent_bulk_requests");
        java.lang.String str11 = builder10.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder12);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder12);
        builder12.mongoAdminPassword = "";
        builder12.socketTimeout = (short) 0;
        boolean boolean19 = builder12.storeStatistics;
        builder12.scriptType = "mongodb-1638820218299";
        java.lang.String[] strArray23 = new java.lang.String[] { "mongodb-1638820218299" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder12.excludeFields((java.util.Set<java.lang.String>) strSet24);
        builder10.setparentTypes((java.util.Set<java.lang.String>) strSet24);
        builder10.riverIndexName = "db";
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(builder26);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.ACTIONS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "actions" + "'", str0, "actions");
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.BULK_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "bulk" + "'", str0, "bulk");
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.INITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "script_type" + "'", str0, "script_type");
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        builder0.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.importAllCollections(true);
        java.lang.String str9 = builder8.getmongoAdminPassword();
        java.lang.String str10 = builder8.statisticsTypeName;
        boolean boolean11 = builder8.getdisableIndexRefresh();
        java.lang.String str12 = builder8.riverName;
        org.bson.types.Binary binary13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder8.initialTimestamp(binary13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.SSL_CONNECTION_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "ssl" + "'", str0, "ssl");
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        builder0.setmongoAdminUser("collection");
        builder0.indexName = "filter";
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.INDEX_OBJECT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "index" + "'", str0, "index");
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.mongoDb;
        java.lang.String str3 = mongoDBRiverDefinition1.getCONCURRENT_BULK_REQUESTS_FIELD();
        int int4 = mongoDBRiverDefinition1.throttleSize;
        boolean boolean5 = mongoDBRiverDefinition1.getskipInitialImport();
        java.lang.String str6 = mongoDBRiverDefinition1.getScriptType();
        java.lang.String str7 = mongoDBRiverDefinition1.getSIZE_FIELD();
        java.lang.String str8 = mongoDBRiverDefinition1.statisticsIndexName;
        boolean boolean9 = mongoDBRiverDefinition1.mongoSSLVerifyCertificate;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "concurrent_bulk_requests" + "'", str3, "concurrent_bulk_requests");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "size" + "'", str7, "size");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.mongoDb;
        int int3 = mongoDBRiverDefinition1.throttleSize;
        java.lang.String str4 = mongoDBRiverDefinition1.getTHROTTLE_SIZE_FIELD();
        java.util.Set<java.lang.String> strSet5 = mongoDBRiverDefinition1.excludeFields;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "throttle_size" + "'", str4, "throttle_size");
        org.junit.Assert.assertNull(strSet5);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.TYPE_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "type" + "'", str0, "type");
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.STORE_STATISTICS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "store_statistics" + "'", str0, "store_statistics");
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
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.PARENT_TYPES_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "parent_types" + "'", str0, "parent_types");
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("concurrent_bulk_requests");
        java.lang.String str11 = builder10.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder10);
        java.lang.String str13 = mongoDBRiverDefinition12.mongoLocalPassword;
        boolean boolean14 = mongoDBRiverDefinition12.advancedTransformation;
        boolean boolean15 = mongoDBRiverDefinition12.isImportAllCollections();
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings1 = serializedObjectSupporter0.deserializeObjectRiverSettings3();
        org.elasticsearch.river.RiverSettings riverSettings2 = serializedObjectSupporter0.deserializeObjectRiverSettings2();
        org.elasticsearch.river.RiverSettings riverSettings3 = serializedObjectSupporter0.deserializeObjectRiverSettings4();
        org.elasticsearch.river.RiverSettings riverSettings4 = serializedObjectSupporter0.deserializeObjectRiverSettings3();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString7();
        org.junit.Assert.assertNotNull(riverSettings1);
        org.junit.Assert.assertNotNull(riverSettings2);
        org.junit.Assert.assertNotNull(riverSettings3);
        org.junit.Assert.assertNotNull(riverSettings4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "mongodb-1638820218326" + "'", str5, "mongodb-1638820218326");
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings1 = serializedObjectSupporter0.deserializeObjectRiverSettings3();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString8();
        org.elasticsearch.river.RiverSettings riverSettings3 = serializedObjectSupporter0.deserializeObjectRiverSettings6();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(riverSettings1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_river" + "'", str2, "_river");
        org.junit.Assert.assertNotNull(riverSettings3);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("concurrent_bulk_requests");
        com.mongodb.BasicDBObject basicDBObject11 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoCollectionFilter(basicDBObject11);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter13 = builder12.serializedObjectSupporter;
        boolean boolean14 = builder12.mongoSecondaryReadPreference;
        builder12.importAllCollections = false;
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        int int0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DEFAULT_DB_PORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 27017 + "'", int0 == 27017);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        builder0.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.importAllCollections(true);
        java.lang.String str9 = builder8.getmongoAdminPassword();
        builder8.mongoLocalPassword = "mongodb-1638820218449";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder8.mongoSecondaryReadPreference(true);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.includeCollection("mongodb-1638820218299");
        builder10.setmongoDb("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder10.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.isMongos((java.lang.Boolean) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder16.disableIndexRefresh(false);
        java.lang.String str21 = builder20.statisticsIndexName;
        builder20.setmongoAdminUser("user");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 60000);
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
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.mongoDb;
        java.lang.String str3 = mongoDBRiverDefinition1.getSERVERS_FIELD();
        java.lang.String str4 = mongoDBRiverDefinition1.statisticsIndexName;
        boolean boolean5 = mongoDBRiverDefinition1.isAdvancedTransformation();
        java.util.Set<java.lang.String> strSet6 = mongoDBRiverDefinition1.getParentTypes();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "servers" + "'", str3, "servers");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(strSet6);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("concurrent_bulk_requests");
        boolean boolean11 = builder10.getmongoSSLVerifyCertificate();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder10);
        builder10.setthrottleSize(0);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.mongoDb;
        java.lang.String str3 = mongoDBRiverDefinition1.getADMIN_DB_FIELD();
        boolean boolean4 = mongoDBRiverDefinition1.skipInitialImport;
        boolean boolean5 = mongoDBRiverDefinition1.isSkipInitialImport();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        builder0.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.importAllCollections(true);
        java.lang.String str9 = builder0.mongoLocalUser;
        com.mongodb.MongoClientOptions mongoClientOptions10 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder0.mongoClientOptions(mongoClientOptions10);
        boolean boolean12 = builder11.getadvancedTransformation();
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        builder0.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.importAllCollections(true);
        java.lang.String str9 = builder8.getmongoAdminPassword();
        java.lang.String str10 = builder8.statisticsTypeName;
        boolean boolean11 = builder8.getdisableIndexRefresh();
        builder8.mongoAdminPassword = "name";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.util.Set<java.lang.String> strSet15 = builder8.includeFields;
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(strSet15);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings1 = serializedObjectSupporter0.deserializeObjectRiverSettings3();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        org.elasticsearch.river.RiverSettings riverSettings3 = serializedObjectSupporter0.deserializeObjectRiverSettings2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString15();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNotNull(riverSettings1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mongodb-1638820218299" + "'", str2, "mongodb-1638820218299");
        org.junit.Assert.assertNotNull(riverSettings3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb-1638820218424" + "'", str4, "mongodb-1638820218424");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_river" + "'", str5, "_river");
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        builder0.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.importAllCollections(true);
        java.lang.String str9 = builder8.getmongoAdminPassword();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder8.mongoLocalPassword("");
        boolean boolean12 = builder8.dropCollection;
        builder8.setstatisticsTypeName("bulk");
        int int15 = builder8.connectTimeout;
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        com.mongodb.ServerAddress[] serverAddressArray9 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList10 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList10, serverAddressArray9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.isMongos((java.lang.Boolean) true);
        boolean boolean15 = builder12.getadvancedTransformation();
        builder12.setmongoSSLVerifyCertificate(true);
        builder12.setmongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder20);
        java.lang.String str22 = mongoDBRiverDefinition21.mongoDb;
        java.lang.String str23 = mongoDBRiverDefinition21.getADMIN_DB_FIELD();
        boolean boolean24 = mongoDBRiverDefinition21.skipInitialImport;
        java.util.List<com.mongodb.ServerAddress> serverAddressList25 = mongoDBRiverDefinition21.mongoServers;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder12.mongoServers(serverAddressList25);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.dropCollection(false);
        java.lang.String str29 = builder26.mongoLocalPassword;
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(serverAddressArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "admin" + "'", str23, "admin");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(serverAddressList25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.FILTER_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "filter" + "'", str0, "filter");
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("actions", "throttle_size");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?throttle_size? ^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.setdisableIndexRefresh(false);
        boolean boolean5 = builder0.getimportAllCollections();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings1 = serializedObjectSupporter0.deserializeObjectRiverSettings3();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        org.elasticsearch.river.RiverSettings riverSettings3 = serializedObjectSupporter0.deserializeObjectRiverSettings2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString4();
        org.elasticsearch.river.RiverSettings riverSettings5 = serializedObjectSupporter0.deserializeObjectRiverSettings7();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = riverSettings5.settings();
        org.junit.Assert.assertNotNull(riverSettings1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mongodb-1638820218299" + "'", str2, "mongodb-1638820218299");
        org.junit.Assert.assertNotNull(riverSettings3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_river" + "'", str4, "_river");
        org.junit.Assert.assertNotNull(riverSettings5);
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.FLUSH_INTERVAL_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "flush_interval" + "'", str0, "flush_interval");
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.mongoDb;
        java.lang.String str3 = mongoDBRiverDefinition1.getCONCURRENT_BULK_REQUESTS_FIELD();
        int int4 = mongoDBRiverDefinition1.throttleSize;
        boolean boolean5 = mongoDBRiverDefinition1.getskipInitialImport();
        com.mongodb.BasicDBObject basicDBObject6 = mongoDBRiverDefinition1.getMongoCollectionFilter();
        java.lang.String str7 = mongoDBRiverDefinition1.getScriptType();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "concurrent_bulk_requests" + "'", str3, "concurrent_bulk_requests");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(basicDBObject6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.mongoDb;
        java.lang.String str3 = mongoDBRiverDefinition1.getCONCURRENT_BULK_REQUESTS_FIELD();
        int int4 = mongoDBRiverDefinition1.throttleSize;
        boolean boolean5 = mongoDBRiverDefinition1.getskipInitialImport();
        java.lang.String str6 = mongoDBRiverDefinition1.getScriptType();
        java.lang.String str7 = mongoDBRiverDefinition1.getDROP_COLLECTION_FIELD();
        java.lang.String str8 = mongoDBRiverDefinition1.getMongoAdminPassword();
        boolean boolean9 = mongoDBRiverDefinition1.isAdvancedTransformation();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = mongoDBRiverDefinition1.getInitialTimestamp();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "concurrent_bulk_requests" + "'", str3, "concurrent_bulk_requests");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "drop_collection" + "'", str7, "drop_collection");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(wildcardTimestamp10);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.mongoDb;
        int int3 = mongoDBRiverDefinition1.throttleSize;
        java.lang.String str4 = mongoDBRiverDefinition1.getTHROTTLE_SIZE_FIELD();
        boolean boolean5 = mongoDBRiverDefinition1.isSkipInitialImport();
        boolean boolean6 = mongoDBRiverDefinition1.mongoUseSSL;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "throttle_size" + "'", str4, "throttle_size");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter2 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings3 = serializedObjectSupporter2.deserializeObjectRiverSettings3();
        java.lang.String str4 = serializedObjectSupporter2.deserializeObjectString8();
        org.elasticsearch.river.RiverSettings riverSettings5 = serializedObjectSupporter2.deserializeObjectRiverSettings6();
        org.elasticsearch.script.ScriptService scriptService6 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("size", "credentials", riverSettings5, scriptService6);
        int int8 = mongoDBRiverDefinition7.getDEFAULT_BULK_ACTIONS();
        org.elasticsearch.common.unit.TimeValue timeValue9 = mongoDBRiverDefinition7.getDEFAULT_FLUSH_INTERVAL();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = mongoDBRiverDefinition7.initialTimestamp;
        org.junit.Assert.assertNotNull(riverSettings3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_river" + "'", str4, "_river");
        org.junit.Assert.assertNotNull(riverSettings5);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1000 + "'", int8 == 1000);
        org.junit.Assert.assertNotNull(timeValue9);
        org.junit.Assert.assertNull(wildcardTimestamp10);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings1 = serializedObjectSupporter0.deserializeObjectRiverSettings3();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        org.elasticsearch.river.RiverSettings riverSettings3 = serializedObjectSupporter0.deserializeObjectRiverSettings2();
        org.elasticsearch.river.RiverSettings riverSettings4 = serializedObjectSupporter0.deserializeObjectRiverSettings4();
        org.elasticsearch.common.settings.Settings settings5 = riverSettings4.globalSettings();
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter8 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings9 = serializedObjectSupporter8.deserializeObjectRiverSettings3();
        java.lang.String str10 = serializedObjectSupporter8.deserializeObjectString8();
        org.elasticsearch.river.RiverSettings riverSettings11 = serializedObjectSupporter8.deserializeObjectRiverSettings6();
        org.elasticsearch.script.ScriptService scriptService12 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("size", "credentials", riverSettings11, scriptService12);
        int int14 = mongoDBRiverDefinition13.getDEFAULT_BULK_ACTIONS();
        java.lang.String str15 = mongoDBRiverDefinition13.getBULK_SIZE_FIELD();
        com.mongodb.BasicDBObject basicDBObject16 = mongoDBRiverDefinition13.mongoCollectionFilter;
        org.elasticsearch.river.RiverSettings riverSettings17 = new org.elasticsearch.river.RiverSettings(settings5, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject16);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder18);
        builder18.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder18.mongoSecondaryReadPreference(true);
        builder18.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder18.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.includeCollection("mongodb-1638820218299");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder28.mongoAdminPassword("host");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition34 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder33);
        java.lang.String str35 = mongoDBRiverDefinition34.mongoDb;
        java.lang.String str36 = mongoDBRiverDefinition34.getCONCURRENT_BULK_REQUESTS_FIELD();
        int int37 = mongoDBRiverDefinition34.throttleSize;
        boolean boolean38 = mongoDBRiverDefinition34.getskipInitialImport();
        boolean boolean39 = mongoDBRiverDefinition34.disableIndexRefresh;
        java.lang.String str40 = mongoDBRiverDefinition34.mongoLocalPassword;
        com.mongodb.BasicDBObject basicDBObject41 = mongoDBRiverDefinition34.mongoCollectionFilter;
        builder28.mongoCollectionFilter = basicDBObject41;
        org.elasticsearch.river.RiverSettings riverSettings43 = new org.elasticsearch.river.RiverSettings(settings5, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject41);
        org.elasticsearch.env.Environment environment44 = null;
        org.elasticsearch.script.ScriptEngineService[] scriptEngineServiceArray45 = new org.elasticsearch.script.ScriptEngineService[] {};
        java.util.LinkedHashSet<org.elasticsearch.script.ScriptEngineService> scriptEngineServiceSet46 = new java.util.LinkedHashSet<org.elasticsearch.script.ScriptEngineService>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<org.elasticsearch.script.ScriptEngineService>) scriptEngineServiceSet46, scriptEngineServiceArray45);
        org.elasticsearch.watcher.ResourceWatcherService resourceWatcherService48 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.script.ScriptService scriptService49 = new org.elasticsearch.script.ScriptService(settings5, environment44, (java.util.Set<org.elasticsearch.script.ScriptEngineService>) scriptEngineServiceSet46, resourceWatcherService48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(riverSettings1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mongodb-1638820218299" + "'", str2, "mongodb-1638820218299");
        org.junit.Assert.assertNotNull(riverSettings3);
        org.junit.Assert.assertNotNull(riverSettings4);
        org.junit.Assert.assertNotNull(settings5);
        org.junit.Assert.assertNotNull(riverSettings9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_river" + "'", str10, "_river");
        org.junit.Assert.assertNotNull(riverSettings11);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1000 + "'", int14 == 1000);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "bulk_size" + "'", str15, "bulk_size");
        org.junit.Assert.assertNotNull(basicDBObject16);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "concurrent_bulk_requests" + "'", str36, "concurrent_bulk_requests");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(basicDBObject41);
        org.junit.Assert.assertNotNull(scriptEngineServiceArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.mongoDb;
        int int3 = mongoDBRiverDefinition1.throttleSize;
        int int4 = mongoDBRiverDefinition1.getDEFAULT_BULK_ACTIONS();
        boolean boolean5 = mongoDBRiverDefinition1.mongoUseSSL;
        java.lang.String str6 = mongoDBRiverDefinition1.getPASSWORD_FIELD();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1000 + "'", int4 == 1000);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "password" + "'", str6, "password");
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        builder0.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.importAllCollections(true);
        java.lang.String str9 = builder8.getmongoAdminPassword();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder8.mongoLocalPassword("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.mongoLocalPassword("import_all_collections");
        java.lang.String str14 = builder13.scriptType;
        builder13.mongoCollection = "mongodb-1638820218363";
        org.bson.types.Binary binary17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder13.initialTimestamp(binary17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.includeCollection("mongodb-1638820218299");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder12);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder12.statisticsTypeName("socket_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder15);
        java.lang.String str17 = mongoDBRiverDefinition16.getEXCLUDE_FIELDS_FIELD();
        java.lang.String str18 = mongoDBRiverDefinition16.getOPTIONS_FIELD();
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "exclude_fields" + "'", str17, "exclude_fields");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "options" + "'", str18, "options");
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.mongoDb;
        java.lang.String str3 = mongoDBRiverDefinition1.getCONCURRENT_BULK_REQUESTS_FIELD();
        java.lang.String str4 = mongoDBRiverDefinition1.getMongoLocalUser();
        int int5 = mongoDBRiverDefinition1.getDEFAULT_DB_PORT();
        java.lang.String str6 = mongoDBRiverDefinition1.riverName;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "concurrent_bulk_requests" + "'", str3, "concurrent_bulk_requests");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27017 + "'", int5 == 27017);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.SCRIPT_TYPE_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "script_type" + "'", str0, "script_type");
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean3 = mongoDBRiverDefinition2.isDisableIndexRefresh();
        int int4 = mongoDBRiverDefinition2.getThrottleSize();
        int int5 = mongoDBRiverDefinition2.socketTimeout;
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("store_statistics", "mongodb-1638820217755");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?mongodb-1638820217755?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("mongodb-1638820218424");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?mongodb-1638820218424?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        builder0.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.importAllCollections(true);
        builder8.setincludeCollection("mongodb-1638820218299");
        java.lang.String str11 = builder8.riverName;
        builder8.typeName = "";
        builder8.mongoCollection = "localhost";
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "local");
        java.lang.Object obj4 = null;
        docScoreSearchScript0.setNextVar("mongodb-1638820218299", obj4);
        // The following exception was thrown during execution in test generation
        try {
            float float6 = docScoreSearchScript0.runAsFloat();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "local" + "'", obj2, "local");
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings1 = serializedObjectSupporter0.deserializeObjectRiverSettings3();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        org.elasticsearch.river.RiverSettings riverSettings3 = serializedObjectSupporter0.deserializeObjectRiverSettings2();
        org.elasticsearch.river.RiverSettings riverSettings4 = serializedObjectSupporter0.deserializeObjectRiverSettings4();
        org.elasticsearch.common.settings.Settings settings5 = riverSettings4.globalSettings();
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter8 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings9 = serializedObjectSupporter8.deserializeObjectRiverSettings3();
        java.lang.String str10 = serializedObjectSupporter8.deserializeObjectString8();
        org.elasticsearch.river.RiverSettings riverSettings11 = serializedObjectSupporter8.deserializeObjectRiverSettings6();
        org.elasticsearch.script.ScriptService scriptService12 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("size", "credentials", riverSettings11, scriptService12);
        int int14 = mongoDBRiverDefinition13.getDEFAULT_BULK_ACTIONS();
        java.lang.String str15 = mongoDBRiverDefinition13.getBULK_SIZE_FIELD();
        com.mongodb.BasicDBObject basicDBObject16 = mongoDBRiverDefinition13.mongoCollectionFilter;
        org.elasticsearch.river.RiverSettings riverSettings17 = new org.elasticsearch.river.RiverSettings(settings5, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject16);
        org.elasticsearch.env.Environment environment18 = null;
        java.util.Set<org.elasticsearch.script.ScriptEngineService> scriptEngineServiceSet19 = null;
        org.elasticsearch.watcher.ResourceWatcherService resourceWatcherService20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.script.ScriptService scriptService21 = new org.elasticsearch.script.ScriptService(settings5, environment18, scriptEngineServiceSet19, resourceWatcherService20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(riverSettings1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mongodb-1638820218299" + "'", str2, "mongodb-1638820218299");
        org.junit.Assert.assertNotNull(riverSettings3);
        org.junit.Assert.assertNotNull(riverSettings4);
        org.junit.Assert.assertNotNull(settings5);
        org.junit.Assert.assertNotNull(riverSettings9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_river" + "'", str10, "_river");
        org.junit.Assert.assertNotNull(riverSettings11);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1000 + "'", int14 == 1000);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "bulk_size" + "'", str15, "bulk_size");
        org.junit.Assert.assertNotNull(basicDBObject16);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.includeCollection("mongodb-1638820218299");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder12);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder12.statisticsTypeName("socket_timeout");
        java.util.Set<java.lang.String> strSet16 = builder12.getincludeFields();
        org.bson.types.BSONTimestamp bSONTimestamp17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder12.initialTimestamp(bSONTimestamp17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ts must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNull(strSet16);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("filter");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = builder0.build();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue5 = mongoDBRiverDefinition4.getDEFAULT_BULK_SIZE();
        boolean boolean6 = mongoDBRiverDefinition4.getmongoSSLVerifyCertificate();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition4);
        org.junit.Assert.assertNotNull(byteSizeValue5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.mongoDb;
        java.lang.String str3 = mongoDBRiverDefinition1.getSERVERS_FIELD();
        boolean boolean4 = mongoDBRiverDefinition1.mongoSecondaryReadPreference;
        java.lang.String str5 = mongoDBRiverDefinition1.getTHROTTLE_SIZE_FIELD();
        boolean boolean6 = mongoDBRiverDefinition1.getimportAllCollections();
        java.lang.String str7 = mongoDBRiverDefinition1.getPORT_FIELD();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "servers" + "'", str3, "servers");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "throttle_size" + "'", str5, "throttle_size");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "port" + "'", str7, "port");
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.includeCollection("mongodb-1638820218299");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder12);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder12.statisticsTypeName("socket_timeout");
        java.util.Set<java.lang.String> strSet16 = builder12.getincludeFields();
        builder12.setriverIndexName("is_mongos");
        boolean boolean19 = builder12.getdisableIndexRefresh();
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNull(strSet16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.IS_MONGOS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "is_mongos" + "'", str0, "is_mongos");
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("filter");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = builder0.build();
        boolean boolean5 = mongoDBRiverDefinition4.disableIndexRefresh;
        boolean boolean6 = mongoDBRiverDefinition4.getimportAllCollections();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder3);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder3);
        builder3.mongoAdminPassword = "";
        builder3.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder3.importAllCollections(true);
        java.lang.String str12 = builder11.getmongoAdminPassword();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder11.mongoLocalPassword("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder15);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder15);
        builder15.mongoAdminPassword = "";
        builder15.socketTimeout = (short) 0;
        boolean boolean22 = builder15.storeStatistics;
        builder15.scriptType = "mongodb-1638820218299";
        java.lang.String[] strArray26 = new java.lang.String[] { "mongodb-1638820218299" };
        java.util.LinkedHashSet<java.lang.String> strSet27 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet27, strArray26);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder15.excludeFields((java.util.Set<java.lang.String>) strSet27);
        builder11.setexcludeFields((java.util.Set<java.lang.String>) strSet27);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder0.parentTypes((java.util.Set<java.lang.String>) strSet27);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition33 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder32);
        java.lang.String str34 = mongoDBRiverDefinition33.mongoDb;
        int int35 = mongoDBRiverDefinition33.throttleSize;
        int int36 = mongoDBRiverDefinition33.getDEFAULT_BULK_ACTIONS();
        java.lang.String str37 = mongoDBRiverDefinition33.getMongoLocalPassword();
        com.mongodb.BasicDBObject basicDBObject38 = mongoDBRiverDefinition33.mongoCollectionFilter;
        builder31.setmongoOplogFilter(basicDBObject38);
        org.bson.types.BSONTimestamp bSONTimestamp40 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder31.initialTimestamp(bSONTimestamp40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ts must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1000 + "'", int36 == 1000);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(basicDBObject38);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "local");
        java.lang.Object obj4 = null;
        docScoreSearchScript0.setNextVar("mongodb-1638820218299", obj4);
        // The following exception was thrown during execution in test generation
        try {
            long long6 = docScoreSearchScript0.runAsLong();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "local" + "'", obj2, "local");
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.mongoDb;
        int int3 = mongoDBRiverDefinition1.throttleSize;
        java.lang.Boolean boolean4 = mongoDBRiverDefinition1.isMongos;
        int int5 = mongoDBRiverDefinition1.getConnectTimeout();
        java.lang.String str6 = mongoDBRiverDefinition1.script;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(boolean4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        int int0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DEFAULT_CONNECT_TIMEOUT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 30000 + "'", int0 == 30000);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.CREDENTIALS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "credentials" + "'", str0, "credentials");
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("concurrent_bulk_requests");
        boolean boolean11 = builder10.getmongoSSLVerifyCertificate();
        java.lang.String str12 = builder10.mongoCollection;
        java.lang.String str13 = builder10.riverName;
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.mongoDb;
        java.lang.String str3 = mongoDBRiverDefinition1.getCONCURRENT_BULK_REQUESTS_FIELD();
        java.lang.String str4 = mongoDBRiverDefinition1.getMongoLocalUser();
        java.lang.String str5 = mongoDBRiverDefinition1.mongoAdminPassword;
        java.lang.String str6 = mongoDBRiverDefinition1.getIS_MONGOS_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition1.mongoDb;
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue8 = mongoDBRiverDefinition1.getDEFAULT_BULK_SIZE();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "concurrent_bulk_requests" + "'", str3, "concurrent_bulk_requests");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "is_mongos" + "'", str6, "is_mongos");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(byteSizeValue8);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        builder0.socketTimeout = (short) 0;
        boolean boolean7 = builder0.storeStatistics;
        builder0.scriptType = "mongodb-1638820218299";
        java.lang.String[] strArray11 = new java.lang.String[] { "mongodb-1638820218299" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder0.excludeFields((java.util.Set<java.lang.String>) strSet12);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.mongoAdminUser("host");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder14.mongoGridFS(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder14);
        boolean boolean20 = builder14.getdropCollection();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("concurrent_bulk_requests");
        java.lang.String str11 = builder10.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder10);
        java.lang.String str13 = mongoDBRiverDefinition12.getNAME_FIELD();
        java.lang.String str14 = mongoDBRiverDefinition12.getINCLUDE_COLLECTION_FIELD();
        java.lang.String str15 = mongoDBRiverDefinition12.getMongoLocalUser();
        java.lang.String str16 = mongoDBRiverDefinition12.getIndexName();
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "name" + "'", str13, "name");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "include_collection" + "'", str14, "include_collection");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        builder0.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.importAllCollections(true);
        java.lang.String str9 = builder0.mongoLocalUser;
        boolean boolean10 = builder0.getadvancedTransformation();
        builder0.mongoSecondaryReadPreference = false;
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.setmongoUseSSL(false);
        java.lang.String str9 = builder0.includeCollection;
        java.lang.String[] strArray44 = new java.lang.String[] { "credentials", "bulk_timeout", "mongodb-1638820218326", "localhost", "host", "bulk", "hi!", "bulk_size", "is_mongos", "script_type", "import_all_collections", "host", "ssl", "exclude_fields", "concurrent_bulk_requests", "advanced_transformation", "mongodb-1638820218326", "null.null", "filter", "host", "gridfs", "mongodb-1638820218326", "include_fields", "mongodb-1638820218387", ".scripts", "null.null", "", "ssl_verify_certificate", "name", "null.null", "bulk_timeout", "advanced_transformation", "throttle_size", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet45 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet45, strArray44);
        builder0.excludeFields = strSet45;
        builder0.indexName = "actions";
        boolean boolean50 = builder0.getmongoSecondaryReadPreference();
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings1 = serializedObjectSupporter0.deserializeObjectRiverSettings4();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString8();
        org.elasticsearch.river.RiverSettings riverSettings3 = serializedObjectSupporter0.deserializeObjectRiverSettings3();
        org.elasticsearch.common.settings.Settings settings4 = riverSettings3.globalSettings();
        org.elasticsearch.env.Environment environment5 = null;
        org.elasticsearch.script.ScriptEngineService[] scriptEngineServiceArray6 = new org.elasticsearch.script.ScriptEngineService[] {};
        java.util.LinkedHashSet<org.elasticsearch.script.ScriptEngineService> scriptEngineServiceSet7 = new java.util.LinkedHashSet<org.elasticsearch.script.ScriptEngineService>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.elasticsearch.script.ScriptEngineService>) scriptEngineServiceSet7, scriptEngineServiceArray6);
        org.elasticsearch.watcher.ResourceWatcherService resourceWatcherService9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.script.ScriptService scriptService10 = new org.elasticsearch.script.ScriptService(settings4, environment5, (java.util.Set<org.elasticsearch.script.ScriptEngineService>) scriptEngineServiceSet7, resourceWatcherService9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(riverSettings1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_river" + "'", str2, "_river");
        org.junit.Assert.assertNotNull(riverSettings3);
        org.junit.Assert.assertNotNull(settings4);
        org.junit.Assert.assertNotNull(scriptEngineServiceArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        builder0.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.importAllCollections(true);
        java.lang.String str9 = builder0.mongoLocalUser;
        java.lang.Boolean boolean10 = builder0.getisMongos();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str12 = mongoDBRiverDefinition11.getSCRIPT_FIELD();
        boolean boolean13 = mongoDBRiverDefinition11.isStoreStatistics();
        java.lang.String str14 = mongoDBRiverDefinition11.getMongoAdminPassword();
        java.lang.String str15 = mongoDBRiverDefinition11.getTypeName();
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "script" + "'", str12, "script");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder7);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder7);
        builder7.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder7.mongoSecondaryReadPreference(true);
        builder7.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder7.mongoDb("concurrent_bulk_requests");
        java.lang.String str18 = builder17.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder19);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder19);
        builder19.mongoAdminPassword = "";
        builder19.socketTimeout = (short) 0;
        boolean boolean26 = builder19.storeStatistics;
        builder19.scriptType = "mongodb-1638820218299";
        java.lang.String[] strArray30 = new java.lang.String[] { "mongodb-1638820218299" };
        java.util.LinkedHashSet<java.lang.String> strSet31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder19.excludeFields((java.util.Set<java.lang.String>) strSet31);
        builder17.setparentTypes((java.util.Set<java.lang.String>) strSet31);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder0.excludeFields((java.util.Set<java.lang.String>) strSet31);
        builder35.setriverIndexName("options");
        builder35.setmongoSSLVerifyCertificate(true);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        builder0.socketTimeout = (short) 0;
        boolean boolean7 = builder0.storeStatistics;
        builder0.scriptType = "mongodb-1638820218299";
        java.lang.String[] strArray11 = new java.lang.String[] { "mongodb-1638820218299" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder0.excludeFields((java.util.Set<java.lang.String>) strSet12);
        com.mongodb.MongoClientOptions mongoClientOptions15 = null;
        builder0.mongoClientOptions = mongoClientOptions15;
        builder0.mongoDb = "skip_initial_import";
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter2 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings3 = serializedObjectSupporter2.deserializeObjectRiverSettings3();
        java.lang.String str4 = serializedObjectSupporter2.deserializeObjectString5();
        org.elasticsearch.river.RiverSettings riverSettings5 = serializedObjectSupporter2.deserializeObjectRiverSettings2();
        java.lang.String str6 = serializedObjectSupporter2.deserializeObjectString4();
        org.elasticsearch.river.RiverSettings riverSettings7 = serializedObjectSupporter2.deserializeObjectRiverSettings7();
        org.elasticsearch.script.ScriptService scriptService8 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("concurrent_requests", "mongodb-1638820218326", riverSettings7, scriptService8);
        java.lang.String str10 = mongoDBRiverDefinition9.getMongoLocalPassword();
        java.lang.String str11 = mongoDBRiverDefinition9.getTypeName();
        org.junit.Assert.assertNotNull(riverSettings3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb-1638820218299" + "'", str4, "mongodb-1638820218299");
        org.junit.Assert.assertNotNull(riverSettings5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_river" + "'", str6, "_river");
        org.junit.Assert.assertNotNull(riverSettings7);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "mydatabase" + "'", str11, "mydatabase");
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.mongoDb;
        java.lang.String str3 = mongoDBRiverDefinition1.getCONCURRENT_BULK_REQUESTS_FIELD();
        java.lang.String str4 = mongoDBRiverDefinition1.getMongoLocalUser();
        int int5 = mongoDBRiverDefinition1.getDEFAULT_DB_PORT();
        java.lang.String str6 = mongoDBRiverDefinition1.script;
        boolean boolean7 = mongoDBRiverDefinition1.getmongoGridFS();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "concurrent_bulk_requests" + "'", str3, "concurrent_bulk_requests");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27017 + "'", int5 == 27017);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings1 = serializedObjectSupporter0.deserializeObjectRiverSettings3();
        org.elasticsearch.river.RiverSettings riverSettings2 = serializedObjectSupporter0.deserializeObjectRiverSettings2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString11();
        org.elasticsearch.river.RiverSettings riverSettings5 = serializedObjectSupporter0.deserializeObjectRiverSettings6();
        org.elasticsearch.common.settings.Settings settings6 = riverSettings5.globalSettings();
        org.elasticsearch.env.Environment environment7 = null;
        org.elasticsearch.script.ScriptEngineService[] scriptEngineServiceArray8 = new org.elasticsearch.script.ScriptEngineService[] {};
        java.util.LinkedHashSet<org.elasticsearch.script.ScriptEngineService> scriptEngineServiceSet9 = new java.util.LinkedHashSet<org.elasticsearch.script.ScriptEngineService>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.elasticsearch.script.ScriptEngineService>) scriptEngineServiceSet9, scriptEngineServiceArray8);
        org.elasticsearch.watcher.ResourceWatcherService resourceWatcherService11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.script.ScriptService scriptService12 = new org.elasticsearch.script.ScriptService(settings6, environment7, (java.util.Set<org.elasticsearch.script.ScriptEngineService>) scriptEngineServiceSet9, resourceWatcherService11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(riverSettings1);
        org.junit.Assert.assertNotNull(riverSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_river" + "'", str3, "_river");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb-1638820218387" + "'", str4, "mongodb-1638820218387");
        org.junit.Assert.assertNotNull(riverSettings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(scriptEngineServiceArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings1 = serializedObjectSupporter0.deserializeObjectRiverSettings3();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        org.elasticsearch.river.RiverSettings riverSettings4 = serializedObjectSupporter0.deserializeObjectRiverSettings5();
        org.elasticsearch.river.RiverSettings riverSettings5 = serializedObjectSupporter0.deserializeObjectRiverSettings7();
        org.junit.Assert.assertNotNull(riverSettings1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mongodb-1638820218299" + "'", str2, "mongodb-1638820218299");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_river" + "'", str3, "_river");
        org.junit.Assert.assertNotNull(riverSettings4);
        org.junit.Assert.assertNotNull(riverSettings5);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter2 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings3 = serializedObjectSupporter2.deserializeObjectRiverSettings3();
        java.lang.String str4 = serializedObjectSupporter2.deserializeObjectString5();
        org.elasticsearch.river.RiverSettings riverSettings5 = serializedObjectSupporter2.deserializeObjectRiverSettings2();
        org.elasticsearch.script.ScriptService scriptService6 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("size", "admin", riverSettings5, scriptService6);
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = riverSettings5.settings();
        org.junit.Assert.assertNotNull(riverSettings3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb-1638820218299" + "'", str4, "mongodb-1638820218299");
        org.junit.Assert.assertNotNull(riverSettings5);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition7);
        org.junit.Assert.assertNotNull(strMap8);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings1 = serializedObjectSupporter0.deserializeObjectRiverSettings6();
        org.elasticsearch.river.RiverSettings riverSettings2 = serializedObjectSupporter0.deserializeObjectRiverSettings5();
        org.elasticsearch.river.RiverSettings riverSettings3 = serializedObjectSupporter0.deserializeObjectRiverSettings7();
        org.elasticsearch.river.RiverSettings riverSettings4 = serializedObjectSupporter0.deserializeObjectRiverSettings3();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString8();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString11();
        org.junit.Assert.assertNotNull(riverSettings1);
        org.junit.Assert.assertNotNull(riverSettings2);
        org.junit.Assert.assertNotNull(riverSettings3);
        org.junit.Assert.assertNotNull(riverSettings4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_river" + "'", str5, "_river");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "mongodb-1638820218387" + "'", str6, "mongodb-1638820218387");
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.SERVERS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "servers" + "'", str0, "servers");
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        builder0.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.importAllCollections(true);
        java.lang.String str9 = builder8.getmongoAdminPassword();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder8.mongoLocalPassword("");
        boolean boolean12 = builder11.dropCollection;
        builder11.mongoSSLVerifyCertificate = true;
        com.mongodb.MongoClientOptions mongoClientOptions15 = null;
        builder11.mongoClientOptions = mongoClientOptions15;
        java.lang.String str17 = builder11.getmongoAdminUser();
        java.lang.Boolean boolean18 = builder11.isMongos;
        java.lang.String str19 = builder11.getmongoAdminUser();
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(boolean18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.mongoDb;
        java.lang.String str3 = mongoDBRiverDefinition1.getCONCURRENT_BULK_REQUESTS_FIELD();
        int int4 = mongoDBRiverDefinition1.throttleSize;
        boolean boolean5 = mongoDBRiverDefinition1.getskipInitialImport();
        java.lang.String str6 = mongoDBRiverDefinition1.getScriptType();
        java.lang.String str7 = mongoDBRiverDefinition1.getSIZE_FIELD();
        java.lang.String str8 = mongoDBRiverDefinition1.statisticsIndexName;
        java.lang.String str9 = mongoDBRiverDefinition1.getMongoLocalUser();
        com.mongodb.BasicDBObject basicDBObject10 = mongoDBRiverDefinition1.getMongoCollectionFilter();
        org.elasticsearch.common.logging.ESLogger eSLogger11 = mongoDBRiverDefinition1.getlogger();
        java.lang.String str12 = mongoDBRiverDefinition1.getHOST_FIELD();
        java.lang.String str13 = mongoDBRiverDefinition1.script;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "concurrent_bulk_requests" + "'", str3, "concurrent_bulk_requests");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "size" + "'", str7, "size");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(basicDBObject10);
        org.junit.Assert.assertNotNull(eSLogger11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "host" + "'", str12, "host");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings1 = serializedObjectSupporter0.deserializeObjectRiverSettings4();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString8();
        org.elasticsearch.river.RiverSettings riverSettings3 = serializedObjectSupporter0.deserializeObjectRiverSettings3();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString7();
        org.elasticsearch.river.RiverSettings riverSettings5 = serializedObjectSupporter0.deserializeObjectRiverSettings2();
        org.junit.Assert.assertNotNull(riverSettings1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_river" + "'", str2, "_river");
        org.junit.Assert.assertNotNull(riverSettings3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb-1638820218326" + "'", str4, "mongodb-1638820218326");
        org.junit.Assert.assertNotNull(riverSettings5);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        com.mongodb.ServerAddress[] serverAddressArray9 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList10 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList10, serverAddressArray9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.isMongos((java.lang.Boolean) true);
        boolean boolean15 = builder12.getadvancedTransformation();
        boolean boolean16 = builder12.getmongoUseSSL();
        boolean boolean17 = builder12.getmongoUseSSL();
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(serverAddressArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.mongoDb;
        int int3 = mongoDBRiverDefinition1.throttleSize;
        int int4 = mongoDBRiverDefinition1.getDEFAULT_BULK_ACTIONS();
        boolean boolean5 = mongoDBRiverDefinition1.mongoUseSSL;
        java.lang.String str6 = mongoDBRiverDefinition1.getCREDENTIALS_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition1.getADVANCED_TRANSFORMATION_FIELD();
        java.lang.String str8 = mongoDBRiverDefinition1.mongoDb;
        boolean boolean9 = mongoDBRiverDefinition1.getmongoSecondaryReadPreference();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1000 + "'", int4 == 1000);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "credentials" + "'", str6, "credentials");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "advanced_transformation" + "'", str7, "advanced_transformation");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings1 = serializedObjectSupporter0.deserializeObjectRiverSettings3();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        org.elasticsearch.river.RiverSettings riverSettings3 = serializedObjectSupporter0.deserializeObjectRiverSettings7();
        org.elasticsearch.river.RiverSettings riverSettings4 = serializedObjectSupporter0.deserializeObjectRiverSettings2();
        org.elasticsearch.common.settings.Settings settings5 = riverSettings4.globalSettings();
        org.elasticsearch.env.Environment environment6 = null;
        org.elasticsearch.script.ScriptEngineService[] scriptEngineServiceArray7 = new org.elasticsearch.script.ScriptEngineService[] {};
        java.util.LinkedHashSet<org.elasticsearch.script.ScriptEngineService> scriptEngineServiceSet8 = new java.util.LinkedHashSet<org.elasticsearch.script.ScriptEngineService>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.elasticsearch.script.ScriptEngineService>) scriptEngineServiceSet8, scriptEngineServiceArray7);
        org.elasticsearch.watcher.ResourceWatcherService resourceWatcherService10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.script.ScriptService scriptService11 = new org.elasticsearch.script.ScriptService(settings5, environment6, (java.util.Set<org.elasticsearch.script.ScriptEngineService>) scriptEngineServiceSet8, resourceWatcherService10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(riverSettings1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mongodb-1638820218299" + "'", str2, "mongodb-1638820218299");
        org.junit.Assert.assertNotNull(riverSettings3);
        org.junit.Assert.assertNotNull(riverSettings4);
        org.junit.Assert.assertNotNull(settings5);
        org.junit.Assert.assertNotNull(scriptEngineServiceArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings1 = serializedObjectSupporter0.deserializeObjectRiverSettings3();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        org.elasticsearch.river.RiverSettings riverSettings3 = serializedObjectSupporter0.deserializeObjectRiverSettings2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString15();
        org.elasticsearch.river.RiverSettings riverSettings5 = serializedObjectSupporter0.deserializeObjectRiverSettings3();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(riverSettings1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mongodb-1638820218299" + "'", str2, "mongodb-1638820218299");
        org.junit.Assert.assertNotNull(riverSettings3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb-1638820218424" + "'", str4, "mongodb-1638820218424");
        org.junit.Assert.assertNotNull(riverSettings5);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.INCLUDE_FIELDS_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "include_fields" + "'", str0, "include_fields");
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 60000);
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
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter2 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings3 = serializedObjectSupporter2.deserializeObjectRiverSettings3();
        java.lang.String str4 = serializedObjectSupporter2.deserializeObjectString8();
        org.elasticsearch.river.RiverSettings riverSettings5 = serializedObjectSupporter2.deserializeObjectRiverSettings6();
        org.elasticsearch.script.ScriptService scriptService6 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("size", "credentials", riverSettings5, scriptService6);
        int int8 = mongoDBRiverDefinition7.getDEFAULT_BULK_ACTIONS();
        org.elasticsearch.common.unit.TimeValue timeValue9 = mongoDBRiverDefinition7.getDEFAULT_FLUSH_INTERVAL();
        java.lang.String str10 = mongoDBRiverDefinition7.getSCRIPT_TYPE_FIELD();
        java.lang.String str11 = mongoDBRiverDefinition7.getIS_MONGOS_FIELD();
        java.lang.String str12 = mongoDBRiverDefinition7.mongoAdminPassword;
        org.junit.Assert.assertNotNull(riverSettings3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_river" + "'", str4, "_river");
        org.junit.Assert.assertNotNull(riverSettings5);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1000 + "'", int8 == 1000);
        org.junit.Assert.assertNotNull(timeValue9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "script_type" + "'", str10, "script_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "is_mongos" + "'", str11, "is_mongos");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "secret" + "'", str12, "secret");
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        com.mongodb.ServerAddress[] serverAddressArray9 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList10 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList10, serverAddressArray9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.isMongos((java.lang.Boolean) true);
        boolean boolean15 = builder12.getadvancedTransformation();
        builder12.setmongoSSLVerifyCertificate(true);
        boolean boolean18 = builder12.getmongoSecondaryReadPreference();
        builder12.mongoAdminPassword = "mongodb-1638820218363";
        builder12.riverIndexName = "initial_timestamp";
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(serverAddressArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        builder0.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.importAllCollections(true);
        java.lang.String str9 = builder8.getmongoAdminPassword();
        java.lang.String str10 = builder8.statisticsTypeName;
        boolean boolean11 = builder8.getdisableIndexRefresh();
        builder8.mongoAdminPassword = "name";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str15 = mongoDBRiverDefinition14.script;
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.mongoDb;
        java.lang.String str3 = mongoDBRiverDefinition1.getCONCURRENT_BULK_REQUESTS_FIELD();
        int int4 = mongoDBRiverDefinition1.throttleSize;
        boolean boolean5 = mongoDBRiverDefinition1.getskipInitialImport();
        boolean boolean6 = mongoDBRiverDefinition1.getdisableIndexRefresh();
        java.lang.String str7 = mongoDBRiverDefinition1.typeName;
        java.lang.String str8 = mongoDBRiverDefinition1.getADVANCED_TRANSFORMATION_FIELD();
        java.lang.String str9 = mongoDBRiverDefinition1.getPARENT_TYPES_FIELD();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "concurrent_bulk_requests" + "'", str3, "concurrent_bulk_requests");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "advanced_transformation" + "'", str8, "advanced_transformation");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "parent_types" + "'", str9, "parent_types");
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString18();
        org.elasticsearch.river.RiverSettings riverSettings2 = serializedObjectSupporter0.deserializeObjectRiverSettings7();
        org.elasticsearch.river.RiverSettings riverSettings3 = serializedObjectSupporter0.deserializeObjectRiverSettings2();
        org.elasticsearch.river.RiverSettings riverSettings4 = serializedObjectSupporter0.deserializeObjectRiverSettings8();
        org.elasticsearch.river.RiverSettings riverSettings5 = serializedObjectSupporter0.deserializeObjectRiverSettings5();
        org.elasticsearch.river.RiverSettings riverSettings6 = serializedObjectSupporter0.deserializeObjectRiverSettings6();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_river" + "'", str1, "_river");
        org.junit.Assert.assertNotNull(riverSettings2);
        org.junit.Assert.assertNotNull(riverSettings3);
        org.junit.Assert.assertNotNull(riverSettings4);
        org.junit.Assert.assertNotNull(riverSettings5);
        org.junit.Assert.assertNotNull(riverSettings6);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter2 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings3 = serializedObjectSupporter2.deserializeObjectRiverSettings4();
        org.elasticsearch.script.ScriptService scriptService4 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("script", "advanced_transformation", riverSettings3, scriptService4);
        org.elasticsearch.common.settings.Settings settings6 = riverSettings3.globalSettings();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder7);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder7);
        builder7.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder7.mongoSecondaryReadPreference(true);
        builder7.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder7.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.includeCollection("mongodb-1638820218299");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder19);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder19.statisticsTypeName("socket_timeout");
        builder19.setmongoLocalUser("host");
        com.mongodb.BasicDBObject basicDBObject25 = builder19.mongoCollectionFilter;
        org.elasticsearch.river.RiverSettings riverSettings26 = new org.elasticsearch.river.RiverSettings(settings6, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject25);
        org.elasticsearch.env.Environment environment27 = null;
        org.elasticsearch.script.ScriptEngineService[] scriptEngineServiceArray28 = new org.elasticsearch.script.ScriptEngineService[] {};
        java.util.LinkedHashSet<org.elasticsearch.script.ScriptEngineService> scriptEngineServiceSet29 = new java.util.LinkedHashSet<org.elasticsearch.script.ScriptEngineService>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<org.elasticsearch.script.ScriptEngineService>) scriptEngineServiceSet29, scriptEngineServiceArray28);
        org.elasticsearch.watcher.ResourceWatcherService resourceWatcherService31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.script.ScriptService scriptService32 = new org.elasticsearch.script.ScriptService(settings6, environment27, (java.util.Set<org.elasticsearch.script.ScriptEngineService>) scriptEngineServiceSet29, resourceWatcherService31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(riverSettings3);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(basicDBObject25);
        org.junit.Assert.assertNotNull(scriptEngineServiceArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        builder0.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.importAllCollections(true);
        java.lang.String str9 = builder8.getmongoAdminPassword();
        java.lang.String str10 = builder8.statisticsTypeName;
        boolean boolean11 = builder8.getdisableIndexRefresh();
        java.lang.String str12 = builder8.riverName;
        boolean boolean13 = builder8.getskipInitialImport();
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.mongoDb;
        java.lang.String str3 = mongoDBRiverDefinition1.getCONCURRENT_BULK_REQUESTS_FIELD();
        int int4 = mongoDBRiverDefinition1.throttleSize;
        boolean boolean5 = mongoDBRiverDefinition1.getskipInitialImport();
        java.lang.String str6 = mongoDBRiverDefinition1.getScriptType();
        java.lang.String str7 = mongoDBRiverDefinition1.getSIZE_FIELD();
        java.lang.String str8 = mongoDBRiverDefinition1.statisticsIndexName;
        java.lang.String str9 = mongoDBRiverDefinition1.getMongoLocalUser();
        java.lang.String str10 = mongoDBRiverDefinition1.statisticsIndexName;
        boolean boolean11 = mongoDBRiverDefinition1.isMongoSecondaryReadPreference();
        boolean boolean12 = mongoDBRiverDefinition1.getadvancedTransformation();
        java.lang.String str13 = mongoDBRiverDefinition1.includeCollection;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "concurrent_bulk_requests" + "'", str3, "concurrent_bulk_requests");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "size" + "'", str7, "size");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("index", "index");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?index?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(true);
        builder0.mongoDb = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean6 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp7 = builder0.initialTimestamp;
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(wildcardTimestamp7);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = builder10.initialTimestamp;
        com.mongodb.MongoClientOptions mongoClientOptions12 = null;
        builder10.setmongoClientOptions(mongoClientOptions12);
        java.lang.String[] strArray24 = new java.lang.String[] { "filter", "socket_timeout", "local", "admin", "include_collection", "hi!", "password", "socket_timeout", "hi!", "options" };
        java.util.LinkedHashSet<java.lang.String> strSet25 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet25, strArray24);
        builder10.excludeFields = strSet25;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder10.riverIndexName("null.null");
        boolean boolean30 = builder10.dropCollection;
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("concurrent_bulk_requests");
        com.mongodb.BasicDBObject basicDBObject11 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoCollectionFilter(basicDBObject11);
        org.bson.types.Binary binary13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder10.initialTimestamp(binary13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.includeCollection("mongodb-1638820218299");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder10.mongoAdminPassword("host");
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory15 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder16);
        java.lang.String str18 = mongoDBRiverDefinition17.mongoDb;
        java.lang.String str19 = mongoDBRiverDefinition17.getCONCURRENT_BULK_REQUESTS_FIELD();
        int int20 = mongoDBRiverDefinition17.throttleSize;
        boolean boolean21 = mongoDBRiverDefinition17.getskipInitialImport();
        java.lang.String str22 = mongoDBRiverDefinition17.getScriptType();
        java.lang.String str23 = mongoDBRiverDefinition17.getSIZE_FIELD();
        java.lang.String str24 = mongoDBRiverDefinition17.statisticsIndexName;
        java.lang.String str25 = mongoDBRiverDefinition17.getMongoLocalUser();
        com.mongodb.BasicDBObject basicDBObject26 = mongoDBRiverDefinition17.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript27 = docScoreNativeScriptFactory15.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject26);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition29 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder28);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition30 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder28);
        builder28.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder28.mongoSecondaryReadPreference(true);
        builder28.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder28.mongoDb("concurrent_bulk_requests");
        java.lang.String str39 = builder38.statisticsIndexName;
        com.mongodb.BasicDBObject basicDBObject40 = builder38.getmongoOplogFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition42 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder41);
        java.lang.String str43 = mongoDBRiverDefinition42.mongoDb;
        java.lang.String str44 = mongoDBRiverDefinition42.getCONCURRENT_BULK_REQUESTS_FIELD();
        int int45 = mongoDBRiverDefinition42.throttleSize;
        boolean boolean46 = mongoDBRiverDefinition42.getskipInitialImport();
        java.lang.String str47 = mongoDBRiverDefinition42.getScriptType();
        com.mongodb.BasicDBObject basicDBObject48 = mongoDBRiverDefinition42.mongoCollectionFilter;
        builder38.mongoCollectionFilter = basicDBObject48;
        org.elasticsearch.script.ExecutableScript executableScript50 = docScoreNativeScriptFactory15.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject48);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder14.mongoOplogFilter(basicDBObject48);
        builder14.setdisableIndexRefresh(true);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "concurrent_bulk_requests" + "'", str19, "concurrent_bulk_requests");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "size" + "'", str23, "size");
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(basicDBObject26);
        org.junit.Assert.assertNotNull(executableScript27);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNull(basicDBObject40);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "concurrent_bulk_requests" + "'", str44, "concurrent_bulk_requests");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(basicDBObject48);
        org.junit.Assert.assertNotNull(executableScript50);
        org.junit.Assert.assertNotNull(builder51);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        java.lang.String str0 = org.elasticsearch.script.ScriptService.DISABLE_DYNAMIC_SCRIPTING_DEFAULT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "sandbox" + "'", str0, "sandbox");
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        com.mongodb.ServerAddress[] serverAddressArray9 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList10 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList10, serverAddressArray9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList10);
        java.lang.String str13 = builder12.includeCollection;
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(serverAddressArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "socket_timeout" + "'", str13, "socket_timeout");
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "local");
        docScoreSearchScript0.setNextScore(1.0f);
        org.apache.lucene.search.Scorer scorer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setScorer(scorer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "local" + "'", obj2, "local");
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.mongoDb;
        java.lang.String str3 = mongoDBRiverDefinition1.getCONCURRENT_BULK_REQUESTS_FIELD();
        java.lang.String str4 = mongoDBRiverDefinition1.getMongoLocalUser();
        boolean boolean5 = mongoDBRiverDefinition1.isAdvancedTransformation();
        int int6 = mongoDBRiverDefinition1.connectTimeout;
        java.lang.String str7 = mongoDBRiverDefinition1.getTHROTTLE_SIZE_FIELD();
        boolean boolean8 = mongoDBRiverDefinition1.getadvancedTransformation();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "concurrent_bulk_requests" + "'", str3, "concurrent_bulk_requests");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "throttle_size" + "'", str7, "throttle_size");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString3();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "mongodb-1638820218264" + "'", str1, "mongodb-1638820218264");
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        com.mongodb.ServerAddress[] serverAddressArray9 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList10 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList10, serverAddressArray9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet14 = mongoDBRiverDefinition13.getExcludeFields();
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(serverAddressArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(strSet14);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.includeCollection("mongodb-1638820218299");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder10.mongoAdminPassword("host");
        boolean boolean15 = builder14.storeStatistics;
        builder14.setmongoAdminUser("advanced_transformation");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings1 = serializedObjectSupporter0.deserializeObjectRiverSettings3();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        org.elasticsearch.river.RiverSettings riverSettings3 = serializedObjectSupporter0.deserializeObjectRiverSettings2();
        org.elasticsearch.river.RiverSettings riverSettings4 = serializedObjectSupporter0.deserializeObjectRiverSettings4();
        org.elasticsearch.common.settings.Settings settings5 = riverSettings4.globalSettings();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder6.setmongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.advancedTransformation(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder10);
        builder10.importAllCollections = false;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder14);
        java.lang.String str16 = mongoDBRiverDefinition15.mongoDb;
        java.lang.String str17 = mongoDBRiverDefinition15.getCONCURRENT_BULK_REQUESTS_FIELD();
        int int18 = mongoDBRiverDefinition15.throttleSize;
        boolean boolean19 = mongoDBRiverDefinition15.getskipInitialImport();
        boolean boolean20 = mongoDBRiverDefinition15.disableIndexRefresh;
        java.lang.String str21 = mongoDBRiverDefinition15.mongoLocalPassword;
        com.mongodb.BasicDBObject basicDBObject22 = mongoDBRiverDefinition15.mongoCollectionFilter;
        builder10.setmongoOplogFilter(basicDBObject22);
        org.elasticsearch.river.RiverSettings riverSettings24 = new org.elasticsearch.river.RiverSettings(settings5, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject22);
        org.elasticsearch.env.Environment environment25 = null;
        java.util.Set<org.elasticsearch.script.ScriptEngineService> scriptEngineServiceSet26 = null;
        org.elasticsearch.watcher.ResourceWatcherService resourceWatcherService27 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.script.ScriptService scriptService28 = new org.elasticsearch.script.ScriptService(settings5, environment25, scriptEngineServiceSet26, resourceWatcherService27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(riverSettings1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mongodb-1638820218299" + "'", str2, "mongodb-1638820218299");
        org.junit.Assert.assertNotNull(riverSettings3);
        org.junit.Assert.assertNotNull(riverSettings4);
        org.junit.Assert.assertNotNull(settings5);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "concurrent_bulk_requests" + "'", str17, "concurrent_bulk_requests");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(basicDBObject22);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        builder0.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.importAllCollections(true);
        java.lang.String str9 = builder0.mongoLocalUser;
        java.lang.Boolean boolean10 = builder0.getisMongos();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str12 = mongoDBRiverDefinition11.getSCRIPT_FIELD();
        boolean boolean13 = mongoDBRiverDefinition11.isStoreStatistics();
        java.lang.String str14 = mongoDBRiverDefinition11.getMongoAdminPassword();
        boolean boolean15 = mongoDBRiverDefinition11.getskipInitialImport();
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "script" + "'", str12, "script");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "local");
        docScoreSearchScript0.setNextScore(1.0f);
        docScoreSearchScript0.setNextScore((float) 1);
        org.apache.lucene.search.Scorer scorer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setScorer(scorer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "local" + "'", obj2, "local");
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.mongoDb;
        java.lang.String str3 = mongoDBRiverDefinition1.getSERVERS_FIELD();
        boolean boolean4 = mongoDBRiverDefinition1.mongoSecondaryReadPreference;
        int int5 = mongoDBRiverDefinition1.getThrottleSize();
        java.lang.String str6 = mongoDBRiverDefinition1.getTypeName();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "servers" + "'", str3, "servers");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings1 = serializedObjectSupporter0.deserializeObjectRiverSettings3();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString5();
        org.elasticsearch.river.RiverSettings riverSettings4 = serializedObjectSupporter0.deserializeObjectRiverSettings8();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(riverSettings1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mongodb-1638820218299" + "'", str2, "mongodb-1638820218299");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "mongodb-1638820218299" + "'", str3, "mongodb-1638820218299");
        org.junit.Assert.assertNotNull(riverSettings4);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        com.mongodb.ServerAddress[] serverAddressArray9 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList10 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList10, serverAddressArray9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        boolean boolean14 = mongoDBRiverDefinition13.storeStatistics;
        java.lang.String str15 = mongoDBRiverDefinition13.getDROP_COLLECTION_FIELD();
        org.elasticsearch.common.unit.TimeValue timeValue16 = mongoDBRiverDefinition13.getDEFAULT_FLUSH_INTERVAL();
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(serverAddressArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "drop_collection" + "'", str15, "drop_collection");
        org.junit.Assert.assertNotNull(timeValue16);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        com.mongodb.ServerAddress[] serverAddressArray9 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList10 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList10, serverAddressArray9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList10);
        boolean boolean13 = builder12.getskipInitialImport();
        int int14 = builder12.connectTimeout;
        builder12.setsocketTimeout((int) (short) 10);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(serverAddressArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings1 = serializedObjectSupporter0.deserializeObjectRiverSettings3();
        org.elasticsearch.river.RiverSettings riverSettings2 = serializedObjectSupporter0.deserializeObjectRiverSettings8();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = riverSettings2.settings();
        org.junit.Assert.assertNotNull(riverSettings1);
        org.junit.Assert.assertNotNull(riverSettings2);
        org.junit.Assert.assertNotNull(strMap3);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.includeCollection("mongodb-1638820218299");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder12);
        boolean boolean14 = mongoDBRiverDefinition13.mongoGridFS;
        java.lang.String str15 = mongoDBRiverDefinition13.getFILTER_FIELD();
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "filter" + "'", str15, "filter");
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.mongoDb;
        int int3 = mongoDBRiverDefinition1.throttleSize;
        int int4 = mongoDBRiverDefinition1.getDEFAULT_BULK_ACTIONS();
        boolean boolean5 = mongoDBRiverDefinition1.mongoUseSSL;
        java.lang.String str6 = mongoDBRiverDefinition1.getSERVERS_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition1.getTHROTTLE_SIZE_FIELD();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1000 + "'", int4 == 1000);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "servers" + "'", str6, "servers");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "throttle_size" + "'", str7, "throttle_size");
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.ADMIN_DB_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "admin" + "'", str0, "admin");
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        builder0.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.importAllCollections(true);
        java.lang.String str9 = builder0.mongoLocalUser;
        builder0.setriverName("sandbox");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        com.mongodb.ServerAddress[] serverAddressArray9 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList10 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList10, serverAddressArray9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList10);
        boolean boolean13 = builder12.getskipInitialImport();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder14);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder14);
        builder14.mongoAdminPassword = "";
        builder14.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder14.importAllCollections(true);
        java.lang.String str23 = builder22.getmongoAdminPassword();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder22.mongoLocalPassword("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition26 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder22);
        boolean boolean27 = mongoDBRiverDefinition26.getskipInitialImport();
        com.mongodb.BasicDBObject basicDBObject28 = mongoDBRiverDefinition26.getMongoCollectionFilter();
        builder12.setmongoCollectionFilter(basicDBObject28);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(serverAddressArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(basicDBObject28);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.mongoDb;
        java.lang.String str3 = mongoDBRiverDefinition1.getCONCURRENT_BULK_REQUESTS_FIELD();
        int int4 = mongoDBRiverDefinition1.throttleSize;
        boolean boolean5 = mongoDBRiverDefinition1.getskipInitialImport();
        java.lang.String str6 = mongoDBRiverDefinition1.getScriptType();
        java.lang.String str7 = mongoDBRiverDefinition1.getSIZE_FIELD();
        java.lang.String str8 = mongoDBRiverDefinition1.statisticsIndexName;
        java.lang.String str9 = mongoDBRiverDefinition1.getMongoLocalUser();
        com.mongodb.BasicDBObject basicDBObject10 = mongoDBRiverDefinition1.getMongoCollectionFilter();
        java.lang.String str11 = mongoDBRiverDefinition1.getEXCLUDE_FIELDS_FIELD();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "concurrent_bulk_requests" + "'", str3, "concurrent_bulk_requests");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "size" + "'", str7, "size");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(basicDBObject10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "exclude_fields" + "'", str11, "exclude_fields");
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.getScriptType();
        java.lang.String str3 = mongoDBRiverDefinition1.getStatisticsIndexName();
        java.lang.String str4 = mongoDBRiverDefinition1.getBULK_FIELD();
        java.util.Set<java.lang.String> strSet5 = mongoDBRiverDefinition1.getIncludeFields();
        java.lang.String str6 = mongoDBRiverDefinition1.getFLUSH_INTERVAL_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition1.getNAME_FIELD();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "bulk" + "'", str4, "bulk");
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "flush_interval" + "'", str6, "flush_interval");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "name" + "'", str7, "name");
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("concurrent_bulk_requests");
        java.lang.String str11 = builder10.statisticsIndexName;
        com.mongodb.BasicDBObject basicDBObject12 = builder10.getmongoOplogFilter();
        builder10.mongoUseSSL = true;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder10);
        builder10.setstoreStatistics(true);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(basicDBObject12);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = builder10.initialTimestamp;
        com.mongodb.MongoClientOptions mongoClientOptions12 = null;
        builder10.setmongoClientOptions(mongoClientOptions12);
        builder10.setmongoAdminPassword("bulk_timeout");
        boolean boolean16 = builder10.mongoGridFS;
        org.bson.types.BSONTimestamp bSONTimestamp17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder10.initialTimestamp(bSONTimestamp17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ts must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        builder0.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.importAllCollections(true);
        java.lang.String str9 = builder8.getmongoAdminPassword();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder8.mongoLocalPassword("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.mongoLocalPassword("import_all_collections");
        java.lang.String str14 = builder13.scriptType;
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp15 = builder13.initialTimestamp;
        boolean boolean16 = builder13.getmongoGridFS();
        boolean boolean17 = builder13.getmongoSSLVerifyCertificate();
        builder13.setdropCollection(true);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(wildcardTimestamp15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.mongoDb;
        java.lang.String str3 = mongoDBRiverDefinition1.getCONCURRENT_BULK_REQUESTS_FIELD();
        java.lang.String str4 = mongoDBRiverDefinition1.getMongoLocalUser();
        java.lang.String str5 = mongoDBRiverDefinition1.mongoAdminPassword;
        boolean boolean6 = mongoDBRiverDefinition1.getmongoUseSSL();
        java.lang.String str7 = mongoDBRiverDefinition1.getINITIAL_TIMESTAMP_FIELD();
        java.lang.String str8 = mongoDBRiverDefinition1.getMongoAdminUser();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "concurrent_bulk_requests" + "'", str3, "concurrent_bulk_requests");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "initial_timestamp" + "'", str7, "initial_timestamp");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.mongoDb;
        java.lang.String str3 = mongoDBRiverDefinition1.getSERVERS_FIELD();
        boolean boolean4 = mongoDBRiverDefinition1.mongoSecondaryReadPreference;
        java.lang.String str5 = mongoDBRiverDefinition1.getTHROTTLE_SIZE_FIELD();
        java.lang.String str6 = mongoDBRiverDefinition1.getSOCKET_TIMEOUT();
        int int7 = mongoDBRiverDefinition1.throttleSize;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "servers" + "'", str3, "servers");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "throttle_size" + "'", str5, "throttle_size");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "socket_timeout" + "'", str6, "socket_timeout");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings1 = serializedObjectSupporter0.deserializeObjectRiverSettings6();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString9();
        org.elasticsearch.river.RiverSettings riverSettings3 = serializedObjectSupporter0.deserializeObjectRiverSettings8();
        org.elasticsearch.river.RiverSettings riverSettings4 = serializedObjectSupporter0.deserializeObjectRiverSettings3();
        org.elasticsearch.river.RiverSettings riverSettings5 = serializedObjectSupporter0.deserializeObjectRiverSettings9();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString12();
        org.junit.Assert.assertNotNull(riverSettings1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mongodb-1638820218363" + "'", str2, "mongodb-1638820218363");
        org.junit.Assert.assertNotNull(riverSettings3);
        org.junit.Assert.assertNotNull(riverSettings4);
        org.junit.Assert.assertNotNull(riverSettings5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_river" + "'", str6, "_river");
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("concurrent_bulk_requests");
        java.lang.String str11 = builder10.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder10);
        java.lang.String str13 = mongoDBRiverDefinition12.getMongoLocalUser();
        java.lang.String str14 = mongoDBRiverDefinition12.getFILTER_FIELD();
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "filter" + "'", str14, "filter");
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString18();
        org.elasticsearch.river.RiverSettings riverSettings2 = serializedObjectSupporter0.deserializeObjectRiverSettings3();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        org.elasticsearch.river.RiverSettings riverSettings4 = serializedObjectSupporter0.deserializeObjectRiverSettings8();
        java.lang.Class<?> wildcardClass5 = riverSettings4.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_river" + "'", str1, "_river");
        org.junit.Assert.assertNotNull(riverSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_river" + "'", str3, "_river");
        org.junit.Assert.assertNotNull(riverSettings4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        builder0.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.importAllCollections(true);
        java.lang.String str9 = builder8.getmongoAdminPassword();
        java.lang.String str10 = builder8.statisticsTypeName;
        boolean boolean11 = builder8.getdisableIndexRefresh();
        builder8.mongoAdminPassword = "name";
        java.util.Set<java.lang.String> strSet14 = builder8.parentTypes;
        builder8.mongoUseSSL = true;
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(strSet14);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter2 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings3 = serializedObjectSupporter2.deserializeObjectRiverSettings4();
        org.elasticsearch.script.ScriptService scriptService4 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("script", "advanced_transformation", riverSettings3, scriptService4);
        boolean boolean6 = mongoDBRiverDefinition5.getstoreStatistics();
        org.junit.Assert.assertNotNull(riverSettings3);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        com.mongodb.ServerAddress[] serverAddressArray9 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList10 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList10, serverAddressArray9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.isMongos((java.lang.Boolean) true);
        boolean boolean15 = builder12.getadvancedTransformation();
        builder12.setmongoSSLVerifyCertificate(true);
        boolean boolean18 = builder12.getmongoSecondaryReadPreference();
        builder12.mongoAdminPassword = "mongodb-1638820218363";
        java.lang.String str21 = builder12.getmongoAdminPassword();
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(serverAddressArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "mongodb-1638820218363" + "'", str21, "mongodb-1638820218363");
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("null.null");
        org.junit.Assert.assertNull(basicDBObject1);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        builder0.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.importAllCollections(true);
        java.lang.String str9 = builder8.getmongoAdminPassword();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder8.mongoLocalPassword("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.mongoLocalPassword("import_all_collections");
        java.lang.String str14 = builder11.mongoDb;
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("concurrent_bulk_requests");
        com.mongodb.BasicDBObject basicDBObject11 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoCollectionFilter(basicDBObject11);
        builder12.mongoAdminPassword = "mongodb-1638820218299";
        boolean boolean15 = builder12.getmongoUseSSL();
        boolean boolean16 = builder12.getadvancedTransformation();
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString18();
        org.elasticsearch.river.RiverSettings riverSettings2 = serializedObjectSupporter0.deserializeObjectRiverSettings7();
        org.elasticsearch.river.RiverSettings riverSettings3 = serializedObjectSupporter0.deserializeObjectRiverSettings2();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString7();
        org.elasticsearch.river.RiverSettings riverSettings5 = serializedObjectSupporter0.deserializeObjectRiverSettings5();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_river" + "'", str1, "_river");
        org.junit.Assert.assertNotNull(riverSettings2);
        org.junit.Assert.assertNotNull(riverSettings3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb-1638820218326" + "'", str4, "mongodb-1638820218326");
        org.junit.Assert.assertNotNull(riverSettings5);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "local");
        java.lang.Object obj4 = null;
        docScoreSearchScript0.setNextVar("mongodb-1638820218299", obj4);
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextSource(strMap6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "local" + "'", obj2, "local");
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings1 = serializedObjectSupporter0.deserializeObjectRiverSettings3();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString14();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString8();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(riverSettings1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mongodb-1638820218299" + "'", str2, "mongodb-1638820218299");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_river" + "'", str3, "_river");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_river" + "'", str4, "_river");
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString18();
        org.elasticsearch.river.RiverSettings riverSettings2 = serializedObjectSupporter0.deserializeObjectRiverSettings7();
        org.elasticsearch.river.RiverSettings riverSettings3 = serializedObjectSupporter0.deserializeObjectRiverSettings2();
        org.elasticsearch.river.RiverSettings riverSettings4 = serializedObjectSupporter0.deserializeObjectRiverSettings4();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = riverSettings4.settings();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_river" + "'", str1, "_river");
        org.junit.Assert.assertNotNull(riverSettings2);
        org.junit.Assert.assertNotNull(riverSettings3);
        org.junit.Assert.assertNotNull(riverSettings4);
        org.junit.Assert.assertNotNull(strMap5);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "local");
        java.lang.Object obj4 = null;
        docScoreSearchScript0.setNextVar("mongodb-1638820218299", obj4);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder6.script("filter");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder6.mongoGridFS(false);
        java.lang.String str12 = builder11.scriptType;
        builder11.scriptType = "ssl_verify_certificate";
        java.lang.Object obj15 = docScoreSearchScript0.unwrap((java.lang.Object) "ssl_verify_certificate");
        org.apache.lucene.index.AtomicReaderContext atomicReaderContext16 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextReader(atomicReaderContext16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "local" + "'", obj2, "local");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "ssl_verify_certificate" + "'", obj15, "ssl_verify_certificate");
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings1 = serializedObjectSupporter0.deserializeObjectRiverSettings6();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString9();
        org.elasticsearch.river.RiverSettings riverSettings3 = serializedObjectSupporter0.deserializeObjectRiverSettings8();
        org.elasticsearch.river.RiverSettings riverSettings4 = serializedObjectSupporter0.deserializeObjectRiverSettings4();
        org.junit.Assert.assertNotNull(riverSettings1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mongodb-1638820218363" + "'", str2, "mongodb-1638820218363");
        org.junit.Assert.assertNotNull(riverSettings3);
        org.junit.Assert.assertNotNull(riverSettings4);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("filter");
        java.lang.String str4 = builder0.indexName;
        builder0.mongoAdminUser = "servers";
        boolean boolean7 = builder0.getdropCollection();
        com.mongodb.MongoClientOptions mongoClientOptions8 = null;
        builder0.mongoClientOptions = mongoClientOptions8;
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.mongoDb;
        java.lang.String str3 = mongoDBRiverDefinition1.mongoAdminPassword;
        int int4 = mongoDBRiverDefinition1.getDEFAULT_BULK_ACTIONS();
        java.lang.String str5 = mongoDBRiverDefinition1.getADMIN_DB_FIELD();
        com.mongodb.MongoClientOptions mongoClientOptions6 = mongoDBRiverDefinition1.getMongoClientOptions();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1000 + "'", int4 == 1000);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "admin" + "'", str5, "admin");
        org.junit.Assert.assertNull(mongoClientOptions6);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        builder0.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.importAllCollections(true);
        java.lang.String str9 = builder8.getmongoAdminPassword();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder8.mongoLocalPassword("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        boolean boolean13 = mongoDBRiverDefinition12.getskipInitialImport();
        java.lang.String str14 = mongoDBRiverDefinition12.getADMIN_DB_FIELD();
        int int15 = mongoDBRiverDefinition12.getDEFAULT_SOCKET_TIMEOUT();
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "admin" + "'", str14, "admin");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 60000 + "'", int15 == 60000);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        java.lang.String str0 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.INITIAL_TIMESTAMP_SCRIPT_FIELD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "script" + "'", str0, "script");
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.mongoDb;
        java.lang.String str3 = mongoDBRiverDefinition1.mongoAdminPassword;
        java.lang.String str4 = mongoDBRiverDefinition1.scriptType;
        java.util.List<com.mongodb.ServerAddress> serverAddressList5 = mongoDBRiverDefinition1.getMongoServers();
        java.lang.String str6 = mongoDBRiverDefinition1.getMongoCollection();
        java.lang.String str7 = mongoDBRiverDefinition1.statisticsTypeName;
        java.lang.String str8 = mongoDBRiverDefinition1.mongoLocalUser;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(serverAddressList5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.mongoDb;
        java.lang.String str3 = mongoDBRiverDefinition1.getCONCURRENT_BULK_REQUESTS_FIELD();
        java.lang.String str4 = mongoDBRiverDefinition1.getMongoLocalUser();
        java.lang.String str5 = mongoDBRiverDefinition1.getPARENT_TYPES_FIELD();
        java.lang.String str6 = mongoDBRiverDefinition1.getBULK_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition1.getGRIDFS_FIELD();
        java.lang.String str8 = mongoDBRiverDefinition1.getIndexName();
        java.lang.String str9 = mongoDBRiverDefinition1.getCONCURRENT_REQUESTS_FIELD();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "concurrent_bulk_requests" + "'", str3, "concurrent_bulk_requests");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "parent_types" + "'", str5, "parent_types");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "bulk" + "'", str6, "bulk");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "gridfs" + "'", str7, "gridfs");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "concurrent_requests" + "'", str9, "concurrent_requests");
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings1 = serializedObjectSupporter0.deserializeObjectRiverSettings4();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString8();
        org.elasticsearch.river.RiverSettings riverSettings3 = serializedObjectSupporter0.deserializeObjectRiverSettings3();
        org.elasticsearch.common.settings.Settings settings4 = riverSettings3.globalSettings();
        org.elasticsearch.env.Environment environment5 = null;
        java.util.Set<org.elasticsearch.script.ScriptEngineService> scriptEngineServiceSet6 = null;
        org.elasticsearch.watcher.ResourceWatcherService resourceWatcherService7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.script.ScriptService scriptService8 = new org.elasticsearch.script.ScriptService(settings4, environment5, scriptEngineServiceSet6, resourceWatcherService7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(riverSettings1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_river" + "'", str2, "_river");
        org.junit.Assert.assertNotNull(riverSettings3);
        org.junit.Assert.assertNotNull(settings4);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
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
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "local");
        java.lang.Object obj4 = null;
        docScoreSearchScript0.setNextVar("mongodb-1638820218299", obj4);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder6);
        builder6.mongoAdminPassword = "";
        builder6.socketTimeout = (short) 0;
        boolean boolean13 = builder6.storeStatistics;
        builder6.scriptType = "mongodb-1638820218299";
        java.lang.String[] strArray17 = new java.lang.String[] { "mongodb-1638820218299" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder6.excludeFields((java.util.Set<java.lang.String>) strSet18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder21);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition23 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder21);
        builder21.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder21.mongoSecondaryReadPreference(true);
        builder21.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder21.mongoDb("concurrent_bulk_requests");
        java.lang.String str32 = builder31.statisticsIndexName;
        com.mongodb.BasicDBObject basicDBObject33 = builder31.getmongoOplogFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition35 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder34);
        java.lang.String str36 = mongoDBRiverDefinition35.mongoDb;
        java.lang.String str37 = mongoDBRiverDefinition35.getCONCURRENT_BULK_REQUESTS_FIELD();
        int int38 = mongoDBRiverDefinition35.throttleSize;
        boolean boolean39 = mongoDBRiverDefinition35.getskipInitialImport();
        java.lang.String str40 = mongoDBRiverDefinition35.getScriptType();
        com.mongodb.BasicDBObject basicDBObject41 = mongoDBRiverDefinition35.mongoCollectionFilter;
        builder31.mongoCollectionFilter = basicDBObject41;
        builder20.mongoCollectionFilter = basicDBObject41;
        com.mongodb.MongoClientOptions mongoClientOptions44 = null;
        builder20.mongoClientOptions = mongoClientOptions44;
        java.lang.String str46 = builder20.includeCollection;
        builder20.setmongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition50 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder49);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition51 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder49);
        builder49.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder49.mongoSecondaryReadPreference(true);
        builder49.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = builder49.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = builder59.includeCollection("mongodb-1638820218299");
        builder59.setmongoDb("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder65 = builder59.mongoUseSSL(false);
        com.mongodb.BasicDBObject basicDBObject66 = builder59.mongoCollectionFilter;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder67 = builder20.mongoOplogFilter(basicDBObject66);
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject66);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "local" + "'", obj2, "local");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(basicDBObject33);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "concurrent_bulk_requests" + "'", str37, "concurrent_bulk_requests");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(basicDBObject41);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(basicDBObject66);
        org.junit.Assert.assertNotNull(builder67);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.mongoDb;
        int int3 = mongoDBRiverDefinition1.getDEFAULT_BULK_ACTIONS();
        java.lang.String str4 = mongoDBRiverDefinition1.getPASSWORD_FIELD();
        boolean boolean5 = mongoDBRiverDefinition1.mongoSSLVerifyCertificate;
        int int6 = mongoDBRiverDefinition1.getSocketTimeout();
        boolean boolean7 = mongoDBRiverDefinition1.getmongoSecondaryReadPreference();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1000 + "'", int3 == 1000);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "password" + "'", str4, "password");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("concurrent_bulk_requests");
        java.lang.String str11 = builder10.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder10);
        int int13 = mongoDBRiverDefinition12.getDEFAULT_SOCKET_TIMEOUT();
        boolean boolean14 = mongoDBRiverDefinition12.getdropCollection();
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 60000 + "'", int13 == 60000);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.mongoDb;
        java.lang.String str3 = mongoDBRiverDefinition1.getCONCURRENT_BULK_REQUESTS_FIELD();
        int int4 = mongoDBRiverDefinition1.throttleSize;
        boolean boolean5 = mongoDBRiverDefinition1.getskipInitialImport();
        boolean boolean6 = mongoDBRiverDefinition1.disableIndexRefresh;
        java.lang.String str7 = mongoDBRiverDefinition1.getINITIAL_TIMESTAMP_FIELD();
        java.lang.String str8 = mongoDBRiverDefinition1.typeName;
        java.lang.String str9 = mongoDBRiverDefinition1.getRiverIndexName();
        java.lang.String str10 = mongoDBRiverDefinition1.getMongoAdminUser();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "concurrent_bulk_requests" + "'", str3, "concurrent_bulk_requests");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "initial_timestamp" + "'", str7, "initial_timestamp");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.mongoDb;
        int int3 = mongoDBRiverDefinition1.throttleSize;
        java.util.Set<java.lang.String> strSet4 = mongoDBRiverDefinition1.getExcludeFields();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(strSet4);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = builder10.initialTimestamp;
        com.mongodb.MongoClientOptions mongoClientOptions12 = null;
        builder10.setmongoClientOptions(mongoClientOptions12);
        java.lang.String[] strArray24 = new java.lang.String[] { "filter", "socket_timeout", "local", "admin", "include_collection", "hi!", "password", "socket_timeout", "hi!", "options" };
        java.util.LinkedHashSet<java.lang.String> strSet25 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet25, strArray24);
        builder10.excludeFields = strSet25;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder10.riverIndexName("null.null");
        java.lang.Boolean boolean30 = builder10.isMongos;
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNull(boolean30);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.includeCollection("mongodb-1638820218299");
        builder10.setmongoDb("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder10.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.isMongos((java.lang.Boolean) false);
        com.mongodb.MongoClientOptions mongoClientOptions19 = null;
        builder18.setmongoClientOptions(mongoClientOptions19);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder18);
        java.lang.String str22 = mongoDBRiverDefinition21.getBULK_SIZE_FIELD();
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "bulk_size" + "'", str22, "bulk_size");
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.mongoDb;
        int int3 = mongoDBRiverDefinition1.getDEFAULT_BULK_ACTIONS();
        java.lang.String str4 = mongoDBRiverDefinition1.getPASSWORD_FIELD();
        boolean boolean5 = mongoDBRiverDefinition1.mongoSSLVerifyCertificate;
        boolean boolean6 = mongoDBRiverDefinition1.getadvancedTransformation();
        java.util.List<com.mongodb.ServerAddress> serverAddressList7 = mongoDBRiverDefinition1.mongoServers;
        java.lang.String str8 = mongoDBRiverDefinition1.mongoDb;
        java.lang.String str9 = mongoDBRiverDefinition1.getTHROTTLE_SIZE_FIELD();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1000 + "'", int3 == 1000);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "password" + "'", str4, "password");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(serverAddressList7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "throttle_size" + "'", str9, "throttle_size");
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = builder10.initialTimestamp;
        com.mongodb.MongoClientOptions mongoClientOptions12 = null;
        builder10.setmongoClientOptions(mongoClientOptions12);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder10);
        boolean boolean15 = mongoDBRiverDefinition14.getmongoGridFS();
        java.util.Set<java.lang.String> strSet16 = mongoDBRiverDefinition14.getIncludeFields();
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(strSet16);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        com.mongodb.ServerAddress[] serverAddressArray9 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList10 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList10, serverAddressArray9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder0.riverIndexName("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.mongoAdminUser("type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.importAllCollections(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder18);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(serverAddressArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.mongoDb;
        java.lang.String str3 = mongoDBRiverDefinition1.getCONCURRENT_BULK_REQUESTS_FIELD();
        int int4 = mongoDBRiverDefinition1.throttleSize;
        boolean boolean5 = mongoDBRiverDefinition1.getskipInitialImport();
        boolean boolean6 = mongoDBRiverDefinition1.disableIndexRefresh;
        java.lang.String str7 = mongoDBRiverDefinition1.getINITIAL_TIMESTAMP_FIELD();
        java.lang.String str8 = mongoDBRiverDefinition1.typeName;
        java.lang.String str9 = mongoDBRiverDefinition1.getRiverIndexName();
        boolean boolean10 = mongoDBRiverDefinition1.isMongoSSLVerifyCertificate();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "concurrent_bulk_requests" + "'", str3, "concurrent_bulk_requests");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "initial_timestamp" + "'", str7, "initial_timestamp");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "local");
        docScoreSearchScript0.setNextScore(1.0f);
        docScoreSearchScript0.setNextScore((float) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        builder8.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder8.mongoSecondaryReadPreference(true);
        builder8.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder8.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.includeCollection("mongodb-1638820218299");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder18.mongoAdminPassword("host");
        boolean boolean23 = builder22.mongoUseSSL;
        docScoreSearchScript0.setNextVar("socket_timeout", (java.lang.Object) boolean23);
        org.apache.lucene.search.Scorer scorer25 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setScorer(scorer25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "local" + "'", obj2, "local");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        builder0.socketTimeout = (short) 0;
        boolean boolean7 = builder0.storeStatistics;
        builder0.scriptType = "mongodb-1638820218299";
        builder0.setmongoLocalPassword("script_type");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        com.mongodb.ServerAddress[] serverAddressArray9 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList10 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList10, serverAddressArray9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.isMongos((java.lang.Boolean) true);
        boolean boolean15 = builder12.getadvancedTransformation();
        builder12.setmongoSSLVerifyCertificate(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder12.mongoLocalPassword("bulk_timeout");
        builder19.mongoLocalUser = "mongodb-1638820218408";
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(serverAddressArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("parent_types", "sandbox", true);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?sandbox?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        builder0.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.importAllCollections(true);
        java.lang.String str9 = builder8.getmongoAdminPassword();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder8.mongoLocalPassword("");
        boolean boolean12 = builder11.dropCollection;
        builder11.mongoSSLVerifyCertificate = true;
        com.mongodb.MongoClientOptions mongoClientOptions15 = null;
        builder11.mongoClientOptions = mongoClientOptions15;
        java.lang.String str17 = builder11.getmongoAdminUser();
        builder11.advancedTransformation = false;
        builder11.mongoLocalUser = "disable_index_refresh";
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        builder0.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.importAllCollections(true);
        builder8.setincludeCollection("mongodb-1638820218299");
        java.lang.String str11 = builder8.mongoDb;
        builder8.setmongoSSLVerifyCertificate(false);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter2 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings3 = serializedObjectSupporter2.deserializeObjectRiverSettings3();
        java.lang.String str4 = serializedObjectSupporter2.deserializeObjectString5();
        org.elasticsearch.river.RiverSettings riverSettings5 = serializedObjectSupporter2.deserializeObjectRiverSettings2();
        java.lang.String str6 = serializedObjectSupporter2.deserializeObjectString4();
        org.elasticsearch.river.RiverSettings riverSettings7 = serializedObjectSupporter2.deserializeObjectRiverSettings7();
        org.elasticsearch.script.ScriptService scriptService8 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("concurrent_requests", "mongodb-1638820218326", riverSettings7, scriptService8);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter10 = mongoDBRiverDefinition9.serializedObjectSupporter;
        java.lang.String str11 = mongoDBRiverDefinition9.getSERVERS_FIELD();
        org.junit.Assert.assertNotNull(riverSettings3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb-1638820218299" + "'", str4, "mongodb-1638820218299");
        org.junit.Assert.assertNotNull(riverSettings5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_river" + "'", str6, "_river");
        org.junit.Assert.assertNotNull(riverSettings7);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition9);
        org.junit.Assert.assertNull(serializedObjectSupporter10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "servers" + "'", str11, "servers");
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "local");
        docScoreSearchScript0.setNextScore(1.0f);
        docScoreSearchScript0.setNextScore((float) 1);
        org.apache.lucene.index.AtomicReaderContext atomicReaderContext7 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextReader(atomicReaderContext7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "local" + "'", obj2, "local");
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("mongodb-1638820217755", "import_all_collections", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?import_all_collections?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.includeCollection("mongodb-1638820218299");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder10.mongoAdminPassword("host");
        builder14.script = "bulk_size";
        boolean boolean17 = builder14.getdisableIndexRefresh();
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.mongoDb;
        java.lang.String str3 = mongoDBRiverDefinition1.getSERVERS_FIELD();
        boolean boolean4 = mongoDBRiverDefinition1.storeStatistics;
        int int5 = mongoDBRiverDefinition1.getThrottleSize();
        java.lang.String str6 = mongoDBRiverDefinition1.getADVANCED_TRANSFORMATION_FIELD();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "servers" + "'", str3, "servers");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "advanced_transformation" + "'", str6, "advanced_transformation");
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter2 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings3 = serializedObjectSupporter2.deserializeObjectRiverSettings3();
        java.lang.String str4 = serializedObjectSupporter2.deserializeObjectString5();
        org.elasticsearch.river.RiverSettings riverSettings5 = serializedObjectSupporter2.deserializeObjectRiverSettings2();
        java.lang.String str6 = serializedObjectSupporter2.deserializeObjectString4();
        org.elasticsearch.river.RiverSettings riverSettings7 = serializedObjectSupporter2.deserializeObjectRiverSettings7();
        org.elasticsearch.script.ScriptService scriptService8 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("concurrent_requests", "mongodb-1638820218326", riverSettings7, scriptService8);
        java.lang.String str10 = mongoDBRiverDefinition9.scriptType;
        int int11 = mongoDBRiverDefinition9.connectTimeout;
        org.junit.Assert.assertNotNull(riverSettings3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb-1638820218299" + "'", str4, "mongodb-1638820218299");
        org.junit.Assert.assertNotNull(riverSettings5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_river" + "'", str6, "_river");
        org.junit.Assert.assertNotNull(riverSettings7);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 30000 + "'", int11 == 30000);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        com.mongodb.ServerAddress[] serverAddressArray9 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList10 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList10, serverAddressArray9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.isMongos((java.lang.Boolean) true);
        boolean boolean15 = builder12.getadvancedTransformation();
        builder12.setmongoSSLVerifyCertificate(true);
        builder12.setmongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder20);
        java.lang.String str22 = mongoDBRiverDefinition21.mongoDb;
        java.lang.String str23 = mongoDBRiverDefinition21.getADMIN_DB_FIELD();
        boolean boolean24 = mongoDBRiverDefinition21.skipInitialImport;
        java.util.List<com.mongodb.ServerAddress> serverAddressList25 = mongoDBRiverDefinition21.mongoServers;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder12.mongoServers(serverAddressList25);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.dropCollection(false);
        java.lang.String str29 = builder28.mongoDb;
        int int30 = builder28.getconnectTimeout();
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(serverAddressArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "admin" + "'", str23, "admin");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(serverAddressList25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.mongoDb;
        java.lang.String str3 = mongoDBRiverDefinition1.mongoAdminPassword;
        java.lang.String str4 = mongoDBRiverDefinition1.scriptType;
        java.util.List<com.mongodb.ServerAddress> serverAddressList5 = mongoDBRiverDefinition1.getMongoServers();
        boolean boolean6 = mongoDBRiverDefinition1.skipInitialImport;
        com.mongodb.MongoClientOptions mongoClientOptions7 = mongoDBRiverDefinition1.getMongoClientOptions();
        java.lang.String str8 = mongoDBRiverDefinition1.includeCollection;
        java.util.Set<java.lang.String> strSet9 = mongoDBRiverDefinition1.getExcludeFields();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(serverAddressList5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(mongoClientOptions7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(strSet9);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.includeCollection("mongodb-1638820218299");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder10.mongoAdminPassword("host");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder15);
        java.lang.String str17 = mongoDBRiverDefinition16.mongoDb;
        java.lang.String str18 = mongoDBRiverDefinition16.getCONCURRENT_BULK_REQUESTS_FIELD();
        int int19 = mongoDBRiverDefinition16.throttleSize;
        boolean boolean20 = mongoDBRiverDefinition16.getskipInitialImport();
        boolean boolean21 = mongoDBRiverDefinition16.disableIndexRefresh;
        java.lang.String str22 = mongoDBRiverDefinition16.mongoLocalPassword;
        com.mongodb.BasicDBObject basicDBObject23 = mongoDBRiverDefinition16.mongoCollectionFilter;
        builder10.mongoCollectionFilter = basicDBObject23;
        org.bson.types.BSONTimestamp bSONTimestamp25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder10.initialTimestamp(bSONTimestamp25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ts must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "concurrent_bulk_requests" + "'", str18, "concurrent_bulk_requests");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(basicDBObject23);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("filter");
        boolean boolean4 = builder0.getskipInitialImport();
        builder0.setstoreStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder7);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder7);
        builder7.mongoAdminPassword = "";
        builder7.socketTimeout = (short) 0;
        boolean boolean14 = builder7.storeStatistics;
        builder7.scriptType = "mongodb-1638820218299";
        java.lang.String[] strArray18 = new java.lang.String[] { "mongodb-1638820218299" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder7.excludeFields((java.util.Set<java.lang.String>) strSet19);
        builder0.setparentTypes((java.util.Set<java.lang.String>) strSet19);
        java.lang.String str23 = builder0.getstatisticsTypeName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder0.mongoSecondaryReadPreference(false);
        boolean boolean26 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder0.mongoLocalUser("filter");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.isMongos((java.lang.Boolean) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder30.riverIndexName("secret");
        java.util.Set<java.lang.String> strSet33 = builder32.getexcludeFields();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNull(strSet33);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings1 = serializedObjectSupporter0.deserializeObjectRiverSettings3();
        org.elasticsearch.river.RiverSettings riverSettings2 = serializedObjectSupporter0.deserializeObjectRiverSettings2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString11();
        org.elasticsearch.river.RiverSettings riverSettings5 = serializedObjectSupporter0.deserializeObjectRiverSettings6();
        org.elasticsearch.common.settings.Settings settings6 = riverSettings5.globalSettings();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder7);
        java.util.Set<java.lang.String> strSet9 = builder7.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder10);
        builder10.mongoAdminPassword = "";
        builder10.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder10.importAllCollections(true);
        java.lang.String str19 = builder18.getmongoAdminPassword();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder18.mongoLocalPassword("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition23 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder22);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder22);
        builder22.mongoAdminPassword = "";
        builder22.socketTimeout = (short) 0;
        boolean boolean29 = builder22.storeStatistics;
        builder22.scriptType = "mongodb-1638820218299";
        java.lang.String[] strArray33 = new java.lang.String[] { "mongodb-1638820218299" };
        java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder22.excludeFields((java.util.Set<java.lang.String>) strSet34);
        builder18.setexcludeFields((java.util.Set<java.lang.String>) strSet34);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder7.parentTypes((java.util.Set<java.lang.String>) strSet34);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition40 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder39);
        java.lang.String str41 = mongoDBRiverDefinition40.mongoDb;
        int int42 = mongoDBRiverDefinition40.throttleSize;
        int int43 = mongoDBRiverDefinition40.getDEFAULT_BULK_ACTIONS();
        java.lang.String str44 = mongoDBRiverDefinition40.getMongoLocalPassword();
        com.mongodb.BasicDBObject basicDBObject45 = mongoDBRiverDefinition40.mongoCollectionFilter;
        builder38.setmongoOplogFilter(basicDBObject45);
        org.elasticsearch.river.RiverSettings riverSettings47 = new org.elasticsearch.river.RiverSettings(settings6, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject45);
        org.elasticsearch.env.Environment environment48 = null;
        java.util.Set<org.elasticsearch.script.ScriptEngineService> scriptEngineServiceSet49 = null;
        org.elasticsearch.watcher.ResourceWatcherService resourceWatcherService50 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.script.ScriptService scriptService51 = new org.elasticsearch.script.ScriptService(settings6, environment48, scriptEngineServiceSet49, resourceWatcherService50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(riverSettings1);
        org.junit.Assert.assertNotNull(riverSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_river" + "'", str3, "_river");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb-1638820218387" + "'", str4, "mongodb-1638820218387");
        org.junit.Assert.assertNotNull(riverSettings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNull(strSet9);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1000 + "'", int43 == 1000);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(basicDBObject45);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings1 = serializedObjectSupporter0.deserializeObjectRiverSettings3();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        org.elasticsearch.river.RiverSettings riverSettings3 = serializedObjectSupporter0.deserializeObjectRiverSettings1();
        org.elasticsearch.river.RiverSettings riverSettings4 = serializedObjectSupporter0.deserializeObjectRiverSettings2();
        org.junit.Assert.assertNotNull(riverSettings1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mongodb-1638820218299" + "'", str2, "mongodb-1638820218299");
        org.junit.Assert.assertNotNull(riverSettings3);
        org.junit.Assert.assertNotNull(riverSettings4);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.mongoDb;
        java.lang.String str3 = mongoDBRiverDefinition1.getCONCURRENT_BULK_REQUESTS_FIELD();
        java.lang.String str4 = mongoDBRiverDefinition1.getMongoLocalUser();
        boolean boolean5 = mongoDBRiverDefinition1.isAdvancedTransformation();
        int int6 = mongoDBRiverDefinition1.connectTimeout;
        int int7 = mongoDBRiverDefinition1.getDEFAULT_CONCURRENT_REQUESTS();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "concurrent_bulk_requests" + "'", str3, "concurrent_bulk_requests");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.includeCollection("mongodb-1638820218299");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder10.mongoAdminPassword("host");
        boolean boolean15 = builder14.storeStatistics;
        java.lang.Boolean boolean16 = builder14.getisMongos();
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(boolean16);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.mongoDb;
        java.lang.String str3 = mongoDBRiverDefinition1.mongoAdminPassword;
        int int4 = mongoDBRiverDefinition1.getThrottleSize();
        java.lang.String str5 = mongoDBRiverDefinition1.getACTIONS_FIELD();
        boolean boolean6 = mongoDBRiverDefinition1.getmongoGridFS();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "actions" + "'", str5, "actions");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("concurrent_bulk_requests");
        java.lang.String str11 = builder10.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder10);
        java.lang.String str13 = mongoDBRiverDefinition12.getSCRIPT_TYPE_FIELD();
        java.lang.String str14 = mongoDBRiverDefinition12.statisticsIndexName;
        boolean boolean15 = mongoDBRiverDefinition12.mongoGridFS;
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "script_type" + "'", str13, "script_type");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        builder0.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.importAllCollections(true);
        java.lang.String str9 = builder8.getmongoAdminPassword();
        builder8.mongoLocalPassword = "mongodb-1638820218449";
        java.util.Set<java.lang.String> strSet12 = builder8.parentTypes;
        builder8.setstatisticsTypeName("password");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(strSet12);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        com.mongodb.ServerAddress[] serverAddressArray9 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList10 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList10, serverAddressArray9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.isMongos((java.lang.Boolean) true);
        boolean boolean15 = builder12.getadvancedTransformation();
        boolean boolean16 = builder12.getmongoUseSSL();
        java.lang.String str17 = builder12.statisticsTypeName;
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(serverAddressArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.includeCollection("mongodb-1638820218299");
        int int13 = builder10.connectTimeout;
        java.lang.String str14 = builder10.getriverIndexName();
        builder10.script = "mongodb-1638820218387";
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "local");
        java.lang.Object obj4 = null;
        docScoreSearchScript0.setNextVar("mongodb-1638820218299", obj4);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter8 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings9 = serializedObjectSupporter8.deserializeObjectRiverSettings4();
        org.elasticsearch.script.ScriptService scriptService10 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("script", "advanced_transformation", riverSettings9, scriptService10);
        org.elasticsearch.common.settings.Settings settings12 = riverSettings9.globalSettings();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder13);
        builder13.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder13.mongoSecondaryReadPreference(true);
        builder13.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder13.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.includeCollection("mongodb-1638820218299");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition26 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder25);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder25.statisticsTypeName("socket_timeout");
        builder25.setmongoLocalUser("host");
        com.mongodb.BasicDBObject basicDBObject31 = builder25.mongoCollectionFilter;
        org.elasticsearch.river.RiverSettings riverSettings32 = new org.elasticsearch.river.RiverSettings(settings12, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject31);
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "local" + "'", obj2, "local");
        org.junit.Assert.assertNotNull(riverSettings9);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition11);
        org.junit.Assert.assertNotNull(settings12);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(basicDBObject31);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        builder0.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.importAllCollections(true);
        java.lang.String str9 = builder8.getmongoAdminPassword();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder8.mongoLocalPassword("");
        boolean boolean12 = builder11.dropCollection;
        builder11.mongoSSLVerifyCertificate = true;
        com.mongodb.MongoClientOptions mongoClientOptions15 = null;
        builder11.mongoClientOptions = mongoClientOptions15;
        java.lang.String str17 = builder11.getmongoAdminUser();
        java.lang.Boolean boolean18 = builder11.isMongos;
        builder11.setscript("disable_index_refresh");
        builder11.setriverIndexName("script.default_lang");
        builder11.storeStatistics = true;
        int int25 = builder11.getconnectTimeout();
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(boolean18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("filter");
        java.lang.String str4 = builder0.indexName;
        builder0.mongoAdminUser = "servers";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.mongoGridFS(true);
        builder0.advancedTransformation = false;
        java.lang.String str12 = builder0.gettypeName();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        builder0.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.importAllCollections(true);
        java.lang.String str9 = builder8.getmongoAdminPassword();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder8.mongoLocalPassword("");
        boolean boolean12 = builder11.dropCollection;
        java.lang.String str13 = builder11.getstatisticsIndexName();
        boolean boolean14 = builder11.getmongoSSLVerifyCertificate();
        builder11.skipInitialImport = false;
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.mongoDb;
        java.lang.String str3 = mongoDBRiverDefinition1.getCONCURRENT_BULK_REQUESTS_FIELD();
        java.lang.String str4 = mongoDBRiverDefinition1.getMongoLocalUser();
        boolean boolean5 = mongoDBRiverDefinition1.isAdvancedTransformation();
        java.lang.String str6 = mongoDBRiverDefinition1.riverName;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "concurrent_bulk_requests" + "'", str3, "concurrent_bulk_requests");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("concurrent_bulk_requests");
        com.mongodb.BasicDBObject basicDBObject11 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoCollectionFilter(basicDBObject11);
        builder12.mongoAdminPassword = "mongodb-1638820218299";
        builder12.setmongoAdminPassword("localhost");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.mongoDb;
        java.lang.String str3 = mongoDBRiverDefinition1.getCONCURRENT_BULK_REQUESTS_FIELD();
        int int4 = mongoDBRiverDefinition1.throttleSize;
        boolean boolean5 = mongoDBRiverDefinition1.isDropCollection();
        int int6 = mongoDBRiverDefinition1.getDEFAULT_DB_PORT();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "concurrent_bulk_requests" + "'", str3, "concurrent_bulk_requests");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 27017 + "'", int6 == 27017);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "local");
        java.lang.Object obj4 = null;
        docScoreSearchScript0.setNextVar("mongodb-1638820218299", obj4);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder6.script("filter");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder6.mongoGridFS(false);
        java.lang.String str12 = builder11.scriptType;
        builder11.scriptType = "ssl_verify_certificate";
        java.lang.Object obj15 = docScoreSearchScript0.unwrap((java.lang.Object) "ssl_verify_certificate");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj16 = docScoreSearchScript0.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "local" + "'", obj2, "local");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "ssl_verify_certificate" + "'", obj15, "ssl_verify_certificate");
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        com.mongodb.ServerAddress[] serverAddressArray9 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList10 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList10, serverAddressArray9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.isMongos((java.lang.Boolean) true);
        boolean boolean15 = builder12.getadvancedTransformation();
        com.mongodb.MongoClientOptions mongoClientOptions16 = builder12.mongoClientOptions;
        builder12.mongoLocalUser = "bulk_timeout";
        java.util.Set<java.lang.String> strSet19 = builder12.getincludeFields();
        java.lang.String str20 = builder12.getscript();
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(serverAddressArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(mongoClientOptions16);
        org.junit.Assert.assertNull(strSet19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.mongoDb;
        int int3 = mongoDBRiverDefinition1.throttleSize;
        int int4 = mongoDBRiverDefinition1.getDEFAULT_BULK_ACTIONS();
        boolean boolean5 = mongoDBRiverDefinition1.mongoUseSSL;
        java.lang.String str6 = mongoDBRiverDefinition1.getCREDENTIALS_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition1.getADMIN_DB_FIELD();
        java.lang.String str8 = mongoDBRiverDefinition1.getRiverName();
        boolean boolean9 = mongoDBRiverDefinition1.importAllCollections;
        java.lang.String str10 = mongoDBRiverDefinition1.getADVANCED_TRANSFORMATION_FIELD();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1000 + "'", int4 == 1000);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "credentials" + "'", str6, "credentials");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "advanced_transformation" + "'", str10, "advanced_transformation");
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        builder0.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.importAllCollections(true);
        builder8.setincludeCollection("mongodb-1638820218299");
        java.lang.String str11 = builder8.riverName;
        builder8.riverIndexName = "mongodb-1638820218387";
        builder8.setscriptType("db");
        builder8.mongoCollection = "";
        boolean boolean18 = builder8.mongoUseSSL;
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        com.mongodb.ServerAddress[] serverAddressArray9 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList10 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList10, serverAddressArray9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder0.riverIndexName("skip_initial_import");
        java.util.Set<java.lang.String> strSet16 = builder15.getparentTypes();
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(serverAddressArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNull(strSet16);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        builder0.socketTimeout = (short) 0;
        boolean boolean7 = builder0.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.storeStatistics(true);
        builder9.connectTimeout = (short) -1;
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings1 = serializedObjectSupporter0.deserializeObjectRiverSettings6();
        org.elasticsearch.river.RiverSettings riverSettings2 = serializedObjectSupporter0.deserializeObjectRiverSettings5();
        org.elasticsearch.river.RiverSettings riverSettings3 = serializedObjectSupporter0.deserializeObjectRiverSettings7();
        org.elasticsearch.river.RiverSettings riverSettings4 = serializedObjectSupporter0.deserializeObjectRiverSettings9();
        org.junit.Assert.assertNotNull(riverSettings1);
        org.junit.Assert.assertNotNull(riverSettings2);
        org.junit.Assert.assertNotNull(riverSettings3);
        org.junit.Assert.assertNotNull(riverSettings4);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings1 = serializedObjectSupporter0.deserializeObjectRiverSettings3();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        org.elasticsearch.river.RiverSettings riverSettings3 = serializedObjectSupporter0.deserializeObjectRiverSettings2();
        org.elasticsearch.river.RiverSettings riverSettings4 = serializedObjectSupporter0.deserializeObjectRiverSettings4();
        org.elasticsearch.common.settings.Settings settings5 = riverSettings4.globalSettings();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder6.setmongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.advancedTransformation(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder10);
        builder10.importAllCollections = false;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder14);
        java.lang.String str16 = mongoDBRiverDefinition15.mongoDb;
        java.lang.String str17 = mongoDBRiverDefinition15.getCONCURRENT_BULK_REQUESTS_FIELD();
        int int18 = mongoDBRiverDefinition15.throttleSize;
        boolean boolean19 = mongoDBRiverDefinition15.getskipInitialImport();
        boolean boolean20 = mongoDBRiverDefinition15.disableIndexRefresh;
        java.lang.String str21 = mongoDBRiverDefinition15.mongoLocalPassword;
        com.mongodb.BasicDBObject basicDBObject22 = mongoDBRiverDefinition15.mongoCollectionFilter;
        builder10.setmongoOplogFilter(basicDBObject22);
        org.elasticsearch.river.RiverSettings riverSettings24 = new org.elasticsearch.river.RiverSettings(settings5, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject22);
        org.elasticsearch.env.Environment environment25 = null;
        org.elasticsearch.script.ScriptEngineService[] scriptEngineServiceArray26 = new org.elasticsearch.script.ScriptEngineService[] {};
        java.util.LinkedHashSet<org.elasticsearch.script.ScriptEngineService> scriptEngineServiceSet27 = new java.util.LinkedHashSet<org.elasticsearch.script.ScriptEngineService>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<org.elasticsearch.script.ScriptEngineService>) scriptEngineServiceSet27, scriptEngineServiceArray26);
        org.elasticsearch.watcher.ResourceWatcherService resourceWatcherService29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.script.ScriptService scriptService30 = new org.elasticsearch.script.ScriptService(settings5, environment25, (java.util.Set<org.elasticsearch.script.ScriptEngineService>) scriptEngineServiceSet27, resourceWatcherService29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(riverSettings1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mongodb-1638820218299" + "'", str2, "mongodb-1638820218299");
        org.junit.Assert.assertNotNull(riverSettings3);
        org.junit.Assert.assertNotNull(riverSettings4);
        org.junit.Assert.assertNotNull(settings5);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "concurrent_bulk_requests" + "'", str17, "concurrent_bulk_requests");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(basicDBObject22);
        org.junit.Assert.assertNotNull(scriptEngineServiceArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings1 = serializedObjectSupporter0.deserializeObjectRiverSettings3();
        org.elasticsearch.river.RiverSettings riverSettings2 = serializedObjectSupporter0.deserializeObjectRiverSettings2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString11();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString5();
        org.elasticsearch.river.RiverSettings riverSettings6 = serializedObjectSupporter0.deserializeObjectRiverSettings6();
        org.elasticsearch.river.RiverSettings riverSettings7 = serializedObjectSupporter0.deserializeObjectRiverSettings6();
        org.elasticsearch.river.RiverSettings riverSettings8 = serializedObjectSupporter0.deserializeObjectRiverSettings9();
        org.junit.Assert.assertNotNull(riverSettings1);
        org.junit.Assert.assertNotNull(riverSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_river" + "'", str3, "_river");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb-1638820218387" + "'", str4, "mongodb-1638820218387");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "mongodb-1638820218299" + "'", str5, "mongodb-1638820218299");
        org.junit.Assert.assertNotNull(riverSettings6);
        org.junit.Assert.assertNotNull(riverSettings7);
        org.junit.Assert.assertNotNull(riverSettings8);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.includeCollection("mongodb-1638820218299");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder12);
        java.lang.String str14 = mongoDBRiverDefinition13.getSSL_VERIFY_CERT_FIELD();
        com.mongodb.BasicDBObject basicDBObject15 = mongoDBRiverDefinition13.mongoCollectionFilter;
        org.elasticsearch.common.logging.ESLogger eSLogger16 = mongoDBRiverDefinition13.getlogger();
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ssl_verify_certificate" + "'", str14, "ssl_verify_certificate");
        org.junit.Assert.assertNotNull(basicDBObject15);
        org.junit.Assert.assertNotNull(eSLogger16);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.includeCollection("mongodb-1638820218299");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder12);
        java.lang.String str14 = mongoDBRiverDefinition13.getGRIDFS_FIELD();
        boolean boolean15 = mongoDBRiverDefinition13.getmongoSSLVerifyCertificate();
        org.elasticsearch.common.unit.TimeValue timeValue16 = mongoDBRiverDefinition13.getDEFAULT_FLUSH_INTERVAL();
        java.lang.String str17 = mongoDBRiverDefinition13.getScript();
        boolean boolean18 = mongoDBRiverDefinition13.getadvancedTransformation();
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "gridfs" + "'", str14, "gridfs");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(timeValue16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        builder0.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.importAllCollections(true);
        java.lang.String str9 = builder8.getmongoAdminPassword();
        builder8.setconnectTimeout((int) (short) 100);
        builder8.setmongoGridFS(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder8.typeName("gridfs");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder16);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder16);
        builder16.mongoAdminPassword = "";
        builder16.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder16.importAllCollections(true);
        java.lang.String str25 = builder24.getmongoAdminPassword();
        builder24.mongoLocalPassword = "mongodb-1638820218449";
        java.util.Set<java.lang.String> strSet28 = builder24.parentTypes;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition30 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder29);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder29.script("filter");
        boolean boolean33 = builder29.getskipInitialImport();
        builder29.setstoreStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition37 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder36);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition38 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder36);
        builder36.mongoAdminPassword = "";
        builder36.socketTimeout = (short) 0;
        boolean boolean43 = builder36.storeStatistics;
        builder36.scriptType = "mongodb-1638820218299";
        java.lang.String[] strArray47 = new java.lang.String[] { "mongodb-1638820218299" };
        java.util.LinkedHashSet<java.lang.String> strSet48 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet48, strArray47);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder36.excludeFields((java.util.Set<java.lang.String>) strSet48);
        builder29.setparentTypes((java.util.Set<java.lang.String>) strSet48);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder29.mongoCollection("localhost");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition55 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder54);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition56 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder54);
        builder54.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder54.mongoSecondaryReadPreference(true);
        builder54.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder64 = builder54.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp65 = builder64.initialTimestamp;
        com.mongodb.MongoClientOptions mongoClientOptions66 = null;
        builder64.setmongoClientOptions(mongoClientOptions66);
        java.lang.String[] strArray78 = new java.lang.String[] { "filter", "socket_timeout", "local", "admin", "include_collection", "hi!", "password", "socket_timeout", "hi!", "options" };
        java.util.LinkedHashSet<java.lang.String> strSet79 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet79, strArray78);
        builder64.excludeFields = strSet79;
        builder53.excludeFields = strSet79;
        builder24.excludeFields = strSet79;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder84 = builder15.parentTypes((java.util.Set<java.lang.String>) strSet79);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(strSet28);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNull(wildcardTimestamp65);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(builder84);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString18();
        org.elasticsearch.river.RiverSettings riverSettings2 = serializedObjectSupporter0.deserializeObjectRiverSettings7();
        org.elasticsearch.river.RiverSettings riverSettings3 = serializedObjectSupporter0.deserializeObjectRiverSettings2();
        org.elasticsearch.river.RiverSettings riverSettings4 = serializedObjectSupporter0.deserializeObjectRiverSettings8();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString5();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_river" + "'", str1, "_river");
        org.junit.Assert.assertNotNull(riverSettings2);
        org.junit.Assert.assertNotNull(riverSettings3);
        org.junit.Assert.assertNotNull(riverSettings4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "mongodb-1638820218299" + "'", str5, "mongodb-1638820218299");
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.mongoDb;
        int int3 = mongoDBRiverDefinition1.throttleSize;
        int int4 = mongoDBRiverDefinition1.getDEFAULT_BULK_ACTIONS();
        java.lang.String str5 = mongoDBRiverDefinition1.getDISABLE_INDEX_REFRESH_FIELD();
        java.lang.String str6 = mongoDBRiverDefinition1.getCONCURRENT_REQUESTS_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition1.getADMIN_DB_FIELD();
        java.lang.String str8 = mongoDBRiverDefinition1.getIS_MONGOS_FIELD();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1000 + "'", int4 == 1000);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "disable_index_refresh" + "'", str5, "disable_index_refresh");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "concurrent_requests" + "'", str6, "concurrent_requests");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "admin" + "'", str7, "admin");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "is_mongos" + "'", str8, "is_mongos");
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("concurrent_bulk_requests");
        builder10.setmongoLocalUser("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder13);
        builder13.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder13.mongoSecondaryReadPreference(true);
        builder13.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder13.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.includeCollection("mongodb-1638820218299");
        int int26 = builder23.connectTimeout;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder27);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition29 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder27);
        builder27.mongoAdminPassword = "";
        builder27.socketTimeout = (short) 0;
        boolean boolean34 = builder27.storeStatistics;
        builder27.scriptType = "mongodb-1638820218299";
        java.lang.String[] strArray38 = new java.lang.String[] { "mongodb-1638820218299" };
        java.util.LinkedHashSet<java.lang.String> strSet39 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet39, strArray38);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder27.excludeFields((java.util.Set<java.lang.String>) strSet39);
        builder23.setincludeFields((java.util.Set<java.lang.String>) strSet39);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition44 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder43);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder43.script("filter");
        boolean boolean47 = builder43.getskipInitialImport();
        builder43.setstoreStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition51 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder50);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition52 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder50);
        builder50.mongoAdminPassword = "";
        builder50.socketTimeout = (short) 0;
        boolean boolean57 = builder50.storeStatistics;
        builder50.scriptType = "mongodb-1638820218299";
        java.lang.String[] strArray61 = new java.lang.String[] { "mongodb-1638820218299" };
        java.util.LinkedHashSet<java.lang.String> strSet62 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet62, strArray61);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder64 = builder50.excludeFields((java.util.Set<java.lang.String>) strSet62);
        builder43.setparentTypes((java.util.Set<java.lang.String>) strSet62);
        builder23.setincludeFields((java.util.Set<java.lang.String>) strSet62);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder67 = builder10.excludeFields((java.util.Set<java.lang.String>) strSet62);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder69 = builder67.mongoAdminPassword("mongodb-1638820218408");
        java.lang.String str70 = builder69.getmongoLocalPassword();
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(builder64);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.riverName("concurrent_requests");
        builder0.setdropCollection(true);
        boolean boolean15 = builder0.mongoGridFS;
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        com.mongodb.ServerAddress[] serverAddressArray9 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList10 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList10, serverAddressArray9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = builder0.getinitialTimestamp();
        builder0.storeStatistics = true;
        java.util.Set<java.lang.String> strSet17 = builder0.getparentTypes();
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter18 = builder0.serializedObjectSupporter;
        java.lang.String str19 = builder0.getmongoCollection();
        com.mongodb.MongoClientOptions mongoClientOptions20 = builder0.getmongoClientOptions();
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(serverAddressArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(wildcardTimestamp14);
        org.junit.Assert.assertNull(strSet17);
        org.junit.Assert.assertNull(serializedObjectSupporter18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(mongoClientOptions20);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("filter");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoGridFS(false);
        java.lang.String str6 = builder5.scriptType;
        java.util.Set<java.lang.String> strSet7 = builder5.getexcludeFields();
        builder5.setadvancedTransformation(true);
        boolean boolean10 = builder5.importAllCollections;
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(strSet7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder3);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder3);
        builder3.mongoAdminPassword = "";
        builder3.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder3.importAllCollections(true);
        java.lang.String str12 = builder11.getmongoAdminPassword();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder11.mongoLocalPassword("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder15);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder15);
        builder15.mongoAdminPassword = "";
        builder15.socketTimeout = (short) 0;
        boolean boolean22 = builder15.storeStatistics;
        builder15.scriptType = "mongodb-1638820218299";
        java.lang.String[] strArray26 = new java.lang.String[] { "mongodb-1638820218299" };
        java.util.LinkedHashSet<java.lang.String> strSet27 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet27, strArray26);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder15.excludeFields((java.util.Set<java.lang.String>) strSet27);
        builder11.setexcludeFields((java.util.Set<java.lang.String>) strSet27);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder0.parentTypes((java.util.Set<java.lang.String>) strSet27);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition33 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder32);
        java.lang.String str34 = mongoDBRiverDefinition33.mongoDb;
        int int35 = mongoDBRiverDefinition33.throttleSize;
        int int36 = mongoDBRiverDefinition33.getDEFAULT_BULK_ACTIONS();
        java.lang.String str37 = mongoDBRiverDefinition33.getMongoLocalPassword();
        com.mongodb.BasicDBObject basicDBObject38 = mongoDBRiverDefinition33.mongoCollectionFilter;
        builder31.setmongoOplogFilter(basicDBObject38);
        boolean boolean40 = builder31.getmongoUseSSL();
        builder31.setmongoGridFS(true);
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1000 + "'", int36 == 1000);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(basicDBObject38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString18();
        org.elasticsearch.river.RiverSettings riverSettings2 = serializedObjectSupporter0.deserializeObjectRiverSettings3();
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
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings1 = serializedObjectSupporter0.deserializeObjectRiverSettings3();
        org.elasticsearch.river.RiverSettings riverSettings2 = serializedObjectSupporter0.deserializeObjectRiverSettings2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        org.elasticsearch.river.RiverSettings riverSettings4 = serializedObjectSupporter0.deserializeObjectRiverSettings8();
        org.elasticsearch.river.RiverSettings riverSettings5 = serializedObjectSupporter0.deserializeObjectRiverSettings3();
        org.junit.Assert.assertNotNull(riverSettings1);
        org.junit.Assert.assertNotNull(riverSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "mongodb-1638820217755" + "'", str3, "mongodb-1638820217755");
        org.junit.Assert.assertNotNull(riverSettings4);
        org.junit.Assert.assertNotNull(riverSettings5);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings1 = serializedObjectSupporter0.deserializeObjectRiverSettings3();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        org.elasticsearch.river.RiverSettings riverSettings3 = serializedObjectSupporter0.deserializeObjectRiverSettings2();
        org.elasticsearch.river.RiverSettings riverSettings4 = serializedObjectSupporter0.deserializeObjectRiverSettings4();
        org.elasticsearch.common.settings.Settings settings5 = riverSettings4.globalSettings();
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter8 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings9 = serializedObjectSupporter8.deserializeObjectRiverSettings3();
        java.lang.String str10 = serializedObjectSupporter8.deserializeObjectString8();
        org.elasticsearch.river.RiverSettings riverSettings11 = serializedObjectSupporter8.deserializeObjectRiverSettings6();
        org.elasticsearch.script.ScriptService scriptService12 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("size", "credentials", riverSettings11, scriptService12);
        int int14 = mongoDBRiverDefinition13.getDEFAULT_BULK_ACTIONS();
        java.lang.String str15 = mongoDBRiverDefinition13.getBULK_SIZE_FIELD();
        com.mongodb.BasicDBObject basicDBObject16 = mongoDBRiverDefinition13.mongoCollectionFilter;
        org.elasticsearch.river.RiverSettings riverSettings17 = new org.elasticsearch.river.RiverSettings(settings5, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject16);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder18);
        builder18.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder18.mongoSecondaryReadPreference(true);
        builder18.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder18.mongoDb("concurrent_bulk_requests");
        java.lang.String str29 = builder28.statisticsIndexName;
        com.mongodb.BasicDBObject basicDBObject30 = builder28.getmongoOplogFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition32 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder31);
        java.lang.String str33 = mongoDBRiverDefinition32.mongoDb;
        java.lang.String str34 = mongoDBRiverDefinition32.getCONCURRENT_BULK_REQUESTS_FIELD();
        int int35 = mongoDBRiverDefinition32.throttleSize;
        boolean boolean36 = mongoDBRiverDefinition32.getskipInitialImport();
        java.lang.String str37 = mongoDBRiverDefinition32.getScriptType();
        com.mongodb.BasicDBObject basicDBObject38 = mongoDBRiverDefinition32.mongoCollectionFilter;
        builder28.mongoCollectionFilter = basicDBObject38;
        org.elasticsearch.river.RiverSettings riverSettings40 = new org.elasticsearch.river.RiverSettings(settings5, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject38);
        org.elasticsearch.env.Environment environment41 = null;
        org.elasticsearch.script.ScriptEngineService[] scriptEngineServiceArray42 = new org.elasticsearch.script.ScriptEngineService[] {};
        java.util.LinkedHashSet<org.elasticsearch.script.ScriptEngineService> scriptEngineServiceSet43 = new java.util.LinkedHashSet<org.elasticsearch.script.ScriptEngineService>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<org.elasticsearch.script.ScriptEngineService>) scriptEngineServiceSet43, scriptEngineServiceArray42);
        org.elasticsearch.watcher.ResourceWatcherService resourceWatcherService45 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.script.ScriptService scriptService46 = new org.elasticsearch.script.ScriptService(settings5, environment41, (java.util.Set<org.elasticsearch.script.ScriptEngineService>) scriptEngineServiceSet43, resourceWatcherService45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(riverSettings1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mongodb-1638820218299" + "'", str2, "mongodb-1638820218299");
        org.junit.Assert.assertNotNull(riverSettings3);
        org.junit.Assert.assertNotNull(riverSettings4);
        org.junit.Assert.assertNotNull(settings5);
        org.junit.Assert.assertNotNull(riverSettings9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_river" + "'", str10, "_river");
        org.junit.Assert.assertNotNull(riverSettings11);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1000 + "'", int14 == 1000);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "bulk_size" + "'", str15, "bulk_size");
        org.junit.Assert.assertNotNull(basicDBObject16);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(basicDBObject30);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "concurrent_bulk_requests" + "'", str34, "concurrent_bulk_requests");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(basicDBObject38);
        org.junit.Assert.assertNotNull(scriptEngineServiceArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        builder0.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.importAllCollections(true);
        java.lang.String str9 = builder8.getmongoAdminPassword();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder8.mongoLocalPassword("");
        builder8.mongoAdminUser = "";
        java.lang.String str14 = builder8.scriptType;
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("concurrent_bulk_requests");
        com.mongodb.BasicDBObject basicDBObject11 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoCollectionFilter(basicDBObject11);
        builder12.mongoAdminPassword = "mongodb-1638820218299";
        com.mongodb.MongoClientOptions mongoClientOptions15 = null;
        builder12.setmongoClientOptions(mongoClientOptions15);
        builder12.setscript("secondary_read_preference");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        builder0.socketTimeout = (short) 0;
        boolean boolean7 = builder0.storeStatistics;
        builder0.scriptType = "mongodb-1638820218299";
        java.lang.String[] strArray11 = new java.lang.String[] { "mongodb-1638820218299" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder0.excludeFields((java.util.Set<java.lang.String>) strSet12);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.mongoAdminUser("host");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder17);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder17);
        builder17.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder17.mongoSecondaryReadPreference(true);
        builder17.includeCollection = "socket_timeout";
        com.mongodb.ServerAddress[] serverAddressArray26 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList27 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList27, serverAddressArray26);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder17.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList27);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder29.isMongos((java.lang.Boolean) true);
        boolean boolean32 = builder29.getadvancedTransformation();
        builder29.setmongoSSLVerifyCertificate(true);
        builder29.setmongoUseSSL(false);
        builder29.mongoSSLVerifyCertificate = true;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition40 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder39);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition41 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder39);
        builder39.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder39.mongoSecondaryReadPreference(true);
        builder39.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder39.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder49.includeCollection("mongodb-1638820218299");
        builder49.setmongoDb("");
        builder49.mongoAdminPassword = "is_mongos";
        com.mongodb.BasicDBObject basicDBObject56 = builder49.mongoCollectionFilter;
        builder29.mongoCollectionFilter = basicDBObject56;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = builder16.mongoOplogFilter(basicDBObject56);
        builder16.socketTimeout = 0;
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(serverAddressArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(basicDBObject56);
        org.junit.Assert.assertNotNull(builder58);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("filter");
        boolean boolean4 = builder0.getskipInitialImport();
        builder0.setstoreStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder7);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder7);
        builder7.mongoAdminPassword = "";
        builder7.socketTimeout = (short) 0;
        boolean boolean14 = builder7.storeStatistics;
        builder7.scriptType = "mongodb-1638820218299";
        java.lang.String[] strArray18 = new java.lang.String[] { "mongodb-1638820218299" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder7.excludeFields((java.util.Set<java.lang.String>) strSet19);
        builder0.setparentTypes((java.util.Set<java.lang.String>) strSet19);
        java.lang.String str23 = builder0.getstatisticsTypeName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder0.mongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder26);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder26);
        builder26.mongoAdminPassword = "";
        builder26.riverName = "localhost";
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter35 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings36 = serializedObjectSupporter35.deserializeObjectRiverSettings3();
        java.lang.String str37 = serializedObjectSupporter35.deserializeObjectString8();
        org.elasticsearch.river.RiverSettings riverSettings38 = serializedObjectSupporter35.deserializeObjectRiverSettings6();
        org.elasticsearch.script.ScriptService scriptService39 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition40 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("size", "credentials", riverSettings38, scriptService39);
        int int41 = mongoDBRiverDefinition40.getDEFAULT_BULK_ACTIONS();
        java.lang.String str42 = mongoDBRiverDefinition40.getBULK_SIZE_FIELD();
        com.mongodb.BasicDBObject basicDBObject43 = mongoDBRiverDefinition40.mongoCollectionFilter;
        builder26.setmongoCollectionFilter(basicDBObject43);
        builder25.setmongoCollectionFilter(basicDBObject43);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder25.mongoLocalPassword("size");
        org.bson.types.BSONTimestamp bSONTimestamp48 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder47.initialTimestamp(bSONTimestamp48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ts must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(riverSettings36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "_river" + "'", str37, "_river");
        org.junit.Assert.assertNotNull(riverSettings38);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1000 + "'", int41 == 1000);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "bulk_size" + "'", str42, "bulk_size");
        org.junit.Assert.assertNotNull(basicDBObject43);
        org.junit.Assert.assertNotNull(builder47);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        builder0.socketTimeout = (short) 0;
        boolean boolean7 = builder0.storeStatistics;
        builder0.scriptType = "mongodb-1638820218299";
        com.mongodb.BasicDBObject basicDBObject10 = builder0.getmongoOplogFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.statisticsIndexName("mongodb-1638820218299");
        java.lang.String str13 = builder0.mongoLocalPassword;
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(basicDBObject10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("filter");
        java.lang.String str4 = builder0.indexName;
        builder0.mongoAdminUser = "servers";
        java.lang.Boolean boolean7 = builder0.getisMongos();
        builder0.setstatisticsTypeName("mongodb-1638820218449");
        java.lang.String str10 = builder0.getmongoAdminUser();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "servers" + "'", str10, "servers");
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = builder10.initialTimestamp;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder10.riverIndexName("skip_initial_import");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder13.mongoUseSSL(true);
        java.lang.String str16 = builder15.mongoAdminUser;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder15.mongoLocalPassword("advanced_transformation");
        builder15.includeCollection = "mongodb-1638820218363";
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.advancedTransformation(true);
        boolean boolean5 = builder4.mongoSecondaryReadPreference;
        builder4.setdropCollection(false);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        builder0.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.importAllCollections(true);
        java.lang.String str9 = builder8.getmongoAdminPassword();
        java.lang.String str10 = builder8.statisticsTypeName;
        boolean boolean11 = builder8.getdisableIndexRefresh();
        builder8.mongoAdminPassword = "name";
        java.lang.String str14 = builder8.statisticsIndexName;
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.mongoDb;
        int int3 = mongoDBRiverDefinition1.throttleSize;
        int int4 = mongoDBRiverDefinition1.getDEFAULT_BULK_ACTIONS();
        java.lang.String str5 = mongoDBRiverDefinition1.getMongoLocalPassword();
        com.mongodb.BasicDBObject basicDBObject6 = mongoDBRiverDefinition1.mongoCollectionFilter;
        java.lang.String str7 = mongoDBRiverDefinition1.getBULK_TIMEOUT_FIELD();
        java.lang.String str8 = mongoDBRiverDefinition1.getMongoAdminPassword();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1000 + "'", int4 == 1000);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(basicDBObject6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "bulk_timeout" + "'", str7, "bulk_timeout");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder7);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder7);
        builder7.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder7.mongoSecondaryReadPreference(true);
        builder7.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder7.mongoDb("concurrent_bulk_requests");
        java.lang.String str18 = builder17.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder19);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder19);
        builder19.mongoAdminPassword = "";
        builder19.socketTimeout = (short) 0;
        boolean boolean26 = builder19.storeStatistics;
        builder19.scriptType = "mongodb-1638820218299";
        java.lang.String[] strArray30 = new java.lang.String[] { "mongodb-1638820218299" };
        java.util.LinkedHashSet<java.lang.String> strSet31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder19.excludeFields((java.util.Set<java.lang.String>) strSet31);
        builder17.setparentTypes((java.util.Set<java.lang.String>) strSet31);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder0.excludeFields((java.util.Set<java.lang.String>) strSet31);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder0.advancedTransformation(true);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.mongoDb;
        java.lang.String str3 = mongoDBRiverDefinition1.getCONCURRENT_BULK_REQUESTS_FIELD();
        java.lang.String str4 = mongoDBRiverDefinition1.getMongoLocalUser();
        java.lang.String str5 = mongoDBRiverDefinition1.getPARENT_TYPES_FIELD();
        java.lang.String str6 = mongoDBRiverDefinition1.getBULK_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition1.getGRIDFS_FIELD();
        boolean boolean8 = mongoDBRiverDefinition1.dropCollection;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "concurrent_bulk_requests" + "'", str3, "concurrent_bulk_requests");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "parent_types" + "'", str5, "parent_types");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "bulk" + "'", str6, "bulk");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "gridfs" + "'", str7, "gridfs");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings1 = serializedObjectSupporter0.deserializeObjectRiverSettings3();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        org.elasticsearch.river.RiverSettings riverSettings3 = serializedObjectSupporter0.deserializeObjectRiverSettings7();
        org.elasticsearch.river.RiverSettings riverSettings4 = serializedObjectSupporter0.deserializeObjectRiverSettings2();
        org.elasticsearch.common.settings.Settings settings5 = riverSettings4.globalSettings();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder6);
        builder6.mongoAdminPassword = "";
        builder6.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder6.importAllCollections(true);
        builder14.setincludeCollection("mongodb-1638820218299");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder14.throttleSize((int) ' ');
        int int19 = builder18.throttleSize;
        builder18.storeStatistics = false;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition23 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder22);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder22);
        builder22.mongoAdminPassword = "";
        builder22.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder22.importAllCollections(true);
        builder30.setincludeCollection("mongodb-1638820218299");
        java.lang.String str33 = builder30.riverName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder30.skipInitialImport(false);
        boolean boolean36 = builder30.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition38 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder37);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition39 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder37);
        builder37.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder37.mongoSecondaryReadPreference(true);
        builder37.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder37.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder47.includeCollection("mongodb-1638820218299");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder47.mongoAdminPassword("host");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition53 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder52);
        java.lang.String str54 = mongoDBRiverDefinition53.mongoDb;
        java.lang.String str55 = mongoDBRiverDefinition53.getCONCURRENT_BULK_REQUESTS_FIELD();
        int int56 = mongoDBRiverDefinition53.throttleSize;
        boolean boolean57 = mongoDBRiverDefinition53.getskipInitialImport();
        boolean boolean58 = mongoDBRiverDefinition53.disableIndexRefresh;
        java.lang.String str59 = mongoDBRiverDefinition53.mongoLocalPassword;
        com.mongodb.BasicDBObject basicDBObject60 = mongoDBRiverDefinition53.mongoCollectionFilter;
        builder47.mongoCollectionFilter = basicDBObject60;
        builder30.setmongoOplogFilter(basicDBObject60);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = builder18.mongoOplogFilter(basicDBObject60);
        org.elasticsearch.river.RiverSettings riverSettings64 = new org.elasticsearch.river.RiverSettings(settings5, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject60);
        org.elasticsearch.env.Environment environment65 = null;
        org.elasticsearch.script.ScriptEngineService[] scriptEngineServiceArray66 = new org.elasticsearch.script.ScriptEngineService[] {};
        java.util.LinkedHashSet<org.elasticsearch.script.ScriptEngineService> scriptEngineServiceSet67 = new java.util.LinkedHashSet<org.elasticsearch.script.ScriptEngineService>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<org.elasticsearch.script.ScriptEngineService>) scriptEngineServiceSet67, scriptEngineServiceArray66);
        org.elasticsearch.watcher.ResourceWatcherService resourceWatcherService69 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.script.ScriptService scriptService70 = new org.elasticsearch.script.ScriptService(settings5, environment65, (java.util.Set<org.elasticsearch.script.ScriptEngineService>) scriptEngineServiceSet67, resourceWatcherService69);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(riverSettings1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mongodb-1638820218299" + "'", str2, "mongodb-1638820218299");
        org.junit.Assert.assertNotNull(riverSettings3);
        org.junit.Assert.assertNotNull(riverSettings4);
        org.junit.Assert.assertNotNull(settings5);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "concurrent_bulk_requests" + "'", str55, "concurrent_bulk_requests");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(basicDBObject60);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(scriptEngineServiceArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings1 = serializedObjectSupporter0.deserializeObjectRiverSettings3();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        org.elasticsearch.river.RiverSettings riverSettings3 = serializedObjectSupporter0.deserializeObjectRiverSettings7();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString8();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        org.elasticsearch.river.RiverSettings riverSettings6 = serializedObjectSupporter0.deserializeObjectRiverSettings1();
        org.junit.Assert.assertNotNull(riverSettings1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mongodb-1638820218299" + "'", str2, "mongodb-1638820218299");
        org.junit.Assert.assertNotNull(riverSettings3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_river" + "'", str4, "_river");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_river" + "'", str5, "_river");
        org.junit.Assert.assertNotNull(riverSettings6);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.advancedTransformation(true);
        boolean boolean5 = builder4.mongoSecondaryReadPreference;
        builder4.setmongoGridFS(true);
        java.util.Set<java.lang.String> strSet8 = builder4.parentTypes;
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(strSet8);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.includeCollection("mongodb-1638820218299");
        builder10.mongoGridFS = true;
        java.util.Set<java.lang.String> strSet15 = builder10.includeFields;
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(strSet15);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        com.mongodb.ServerAddress[] serverAddressArray9 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList10 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList10, serverAddressArray9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder0.riverIndexName("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.mongoAdminUser("type");
        builder16.setmongoDb("mongodb-1638820218424");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(serverAddressArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.mongoDb;
        int int3 = mongoDBRiverDefinition1.throttleSize;
        int int4 = mongoDBRiverDefinition1.getDEFAULT_BULK_ACTIONS();
        java.lang.String str5 = mongoDBRiverDefinition1.getMongoLocalPassword();
        java.lang.String str6 = mongoDBRiverDefinition1.getIS_MONGOS_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition1.getSIZE_FIELD();
        com.mongodb.BasicDBObject basicDBObject8 = mongoDBRiverDefinition1.mongoOplogFilter;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1000 + "'", int4 == 1000);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "is_mongos" + "'", str6, "is_mongos");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "size" + "'", str7, "size");
        org.junit.Assert.assertNull(basicDBObject8);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix(".scripts", "mongodb-1638820218299");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?mongodb-1638820218299?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        java.util.Set<java.lang.String> strSet3 = builder0.getincludeFields();
        java.util.Set<java.lang.String> strSet4 = builder0.getparentTypes();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.statisticsIndexName("password");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder7);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder7);
        builder7.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder7.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder14);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder14);
        builder14.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder14.mongoSecondaryReadPreference(true);
        builder14.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder14.mongoDb("concurrent_bulk_requests");
        java.lang.String str25 = builder24.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder26);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder26);
        builder26.mongoAdminPassword = "";
        builder26.socketTimeout = (short) 0;
        boolean boolean33 = builder26.storeStatistics;
        builder26.scriptType = "mongodb-1638820218299";
        java.lang.String[] strArray37 = new java.lang.String[] { "mongodb-1638820218299" };
        java.util.LinkedHashSet<java.lang.String> strSet38 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet38, strArray37);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder26.excludeFields((java.util.Set<java.lang.String>) strSet38);
        builder24.setparentTypes((java.util.Set<java.lang.String>) strSet38);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder7.excludeFields((java.util.Set<java.lang.String>) strSet38);
        builder0.setexcludeFields((java.util.Set<java.lang.String>) strSet38);
        boolean boolean44 = builder0.advancedTransformation;
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNull(strSet4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("localhost", "mongodb-1638820218264");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?mongodb-1638820218264?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("concurrent_bulk_requests");
        java.lang.String str11 = builder10.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder10);
        java.lang.String str13 = mongoDBRiverDefinition12.getNAME_FIELD();
        java.lang.String str14 = mongoDBRiverDefinition12.getINCLUDE_COLLECTION_FIELD();
        boolean boolean15 = mongoDBRiverDefinition12.getimportAllCollections();
        boolean boolean16 = mongoDBRiverDefinition12.disableIndexRefresh;
        boolean boolean17 = mongoDBRiverDefinition12.isSkipInitialImport();
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "name" + "'", str13, "name");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "include_collection" + "'", str14, "include_collection");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings1 = serializedObjectSupporter0.deserializeObjectRiverSettings6();
        org.elasticsearch.river.RiverSettings riverSettings2 = serializedObjectSupporter0.deserializeObjectRiverSettings5();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = riverSettings2.settings();
        org.junit.Assert.assertNotNull(riverSettings1);
        org.junit.Assert.assertNotNull(riverSettings2);
        org.junit.Assert.assertNotNull(strMap3);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = builder10.initialTimestamp;
        com.mongodb.MongoClientOptions mongoClientOptions12 = null;
        builder10.mongoClientOptions = mongoClientOptions12;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder10.mongoCollection("");
        boolean boolean16 = builder15.mongoSSLVerifyCertificate;
        java.lang.String str17 = builder15.getscript();
        builder15.setriverIndexName("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder15.statisticsTypeName("mongodb-1638820218408");
        builder15.setscriptType("");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        com.mongodb.ServerAddress[] serverAddressArray9 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList10 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList10, serverAddressArray9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.isMongos((java.lang.Boolean) true);
        boolean boolean15 = builder12.getadvancedTransformation();
        builder12.setmongoSSLVerifyCertificate(true);
        builder12.setmongoUseSSL(false);
        com.mongodb.BasicDBObject basicDBObject20 = builder12.getmongoOplogFilter();
        boolean boolean21 = builder12.advancedTransformation;
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(serverAddressArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(basicDBObject20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        builder0.socketTimeout = (short) 0;
        boolean boolean7 = builder0.storeStatistics;
        builder0.scriptType = "mongodb-1638820218299";
        com.mongodb.BasicDBObject basicDBObject10 = builder0.getmongoOplogFilter();
        java.lang.String str11 = builder0.gettypeName();
        builder0.setmongoCollection("include_collection");
        java.util.Set<java.lang.String> strSet14 = builder0.parentTypes;
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(basicDBObject10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(strSet14);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder3);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder3);
        builder3.mongoAdminPassword = "";
        builder3.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder3.importAllCollections(true);
        java.lang.String str12 = builder11.getmongoAdminPassword();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder11.mongoLocalPassword("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder15);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder15);
        builder15.mongoAdminPassword = "";
        builder15.socketTimeout = (short) 0;
        boolean boolean22 = builder15.storeStatistics;
        builder15.scriptType = "mongodb-1638820218299";
        java.lang.String[] strArray26 = new java.lang.String[] { "mongodb-1638820218299" };
        java.util.LinkedHashSet<java.lang.String> strSet27 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet27, strArray26);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder15.excludeFields((java.util.Set<java.lang.String>) strSet27);
        builder11.setexcludeFields((java.util.Set<java.lang.String>) strSet27);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder0.parentTypes((java.util.Set<java.lang.String>) strSet27);
        builder31.setsocketTimeout((int) (short) 100);
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        // The following exception was thrown during execution in test generation
        try {
            com.mongodb.BasicDBObject basicDBObject1 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("mongodb-1638820217755");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?mongodb-1638820217755?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("concurrent_bulk_requests");
        java.lang.String str11 = builder10.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder10);
        java.lang.String str13 = mongoDBRiverDefinition12.getNAME_FIELD();
        java.lang.String str14 = mongoDBRiverDefinition12.getINCLUDE_COLLECTION_FIELD();
        java.lang.String str15 = mongoDBRiverDefinition12.getMongoLocalUser();
        boolean boolean16 = mongoDBRiverDefinition12.isMongoUseSSL();
        java.lang.String str17 = mongoDBRiverDefinition12.includeCollection;
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "name" + "'", str13, "name");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "include_collection" + "'", str14, "include_collection");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "socket_timeout" + "'", str17, "socket_timeout");
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings1 = serializedObjectSupporter0.deserializeObjectRiverSettings3();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        org.elasticsearch.river.RiverSettings riverSettings3 = serializedObjectSupporter0.deserializeObjectRiverSettings1();
        org.elasticsearch.river.RiverSettings riverSettings4 = serializedObjectSupporter0.deserializeObjectRiverSettings1();
        org.elasticsearch.common.settings.Settings settings5 = riverSettings4.globalSettings();
        org.elasticsearch.env.Environment environment6 = null;
        org.elasticsearch.script.ScriptEngineService[] scriptEngineServiceArray7 = new org.elasticsearch.script.ScriptEngineService[] {};
        java.util.LinkedHashSet<org.elasticsearch.script.ScriptEngineService> scriptEngineServiceSet8 = new java.util.LinkedHashSet<org.elasticsearch.script.ScriptEngineService>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.elasticsearch.script.ScriptEngineService>) scriptEngineServiceSet8, scriptEngineServiceArray7);
        org.elasticsearch.watcher.ResourceWatcherService resourceWatcherService10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.script.ScriptService scriptService11 = new org.elasticsearch.script.ScriptService(settings5, environment6, (java.util.Set<org.elasticsearch.script.ScriptEngineService>) scriptEngineServiceSet8, resourceWatcherService10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(riverSettings1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mongodb-1638820218299" + "'", str2, "mongodb-1638820218299");
        org.junit.Assert.assertNotNull(riverSettings3);
        org.junit.Assert.assertNotNull(riverSettings4);
        org.junit.Assert.assertNotNull(settings5);
        org.junit.Assert.assertNotNull(scriptEngineServiceArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        com.mongodb.ServerAddress[] serverAddressArray9 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList10 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList10, serverAddressArray9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.isMongos((java.lang.Boolean) true);
        boolean boolean15 = builder12.getadvancedTransformation();
        builder12.setmongoSSLVerifyCertificate(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder12.mongoLocalPassword("bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.mongoGridFS(false);
        java.lang.String str22 = builder19.indexName;
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(serverAddressArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("filter");
        java.lang.String str4 = builder0.indexName;
        builder0.mongoAdminUser = "servers";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder0.mongoGridFS(true);
        builder0.advancedTransformation = false;
        builder0.setriverName("local");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.includeCollection("mongodb-1638820218299");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder12);
        boolean boolean14 = mongoDBRiverDefinition13.mongoGridFS;
        java.lang.String str15 = mongoDBRiverDefinition13.getCONCURRENT_REQUESTS_FIELD();
        int int16 = mongoDBRiverDefinition13.throttleSize;
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "concurrent_requests" + "'", str15, "concurrent_requests");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        builder0.socketTimeout = (short) 0;
        boolean boolean7 = builder0.storeStatistics;
        builder0.scriptType = "mongodb-1638820218299";
        java.lang.String[] strArray11 = new java.lang.String[] { "mongodb-1638820218299" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder0.excludeFields((java.util.Set<java.lang.String>) strSet12);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.socketTimeout(1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.getScriptType();
        java.lang.String str3 = mongoDBRiverDefinition1.getStatisticsIndexName();
        java.lang.String str4 = mongoDBRiverDefinition1.getBULK_FIELD();
        java.util.Set<java.lang.String> strSet5 = mongoDBRiverDefinition1.getIncludeFields();
        java.lang.String str6 = mongoDBRiverDefinition1.getINDEX_OBJECT();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "bulk" + "'", str4, "bulk");
        org.junit.Assert.assertNull(strSet5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "index" + "'", str6, "index");
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = builder10.initialTimestamp;
        com.mongodb.MongoClientOptions mongoClientOptions12 = null;
        builder10.mongoClientOptions = mongoClientOptions12;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder10);
        int int15 = mongoDBRiverDefinition14.getDEFAULT_BULK_ACTIONS();
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1000 + "'", int15 == 1000);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "local");
        docScoreSearchScript0.setNextScore(1.0f);
        org.apache.lucene.index.AtomicReaderContext atomicReaderContext5 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextReader(atomicReaderContext5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "local" + "'", obj2, "local");
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.includeCollection("mongodb-1638820218299");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder12);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder12.script("");
        int int16 = builder12.getthrottleSize();
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("concurrent_bulk_requests");
        java.lang.String str11 = builder10.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder10);
        java.lang.String str13 = mongoDBRiverDefinition12.getNAME_FIELD();
        java.lang.String str14 = mongoDBRiverDefinition12.getINCLUDE_COLLECTION_FIELD();
        java.lang.String str15 = mongoDBRiverDefinition12.getMongoLocalUser();
        boolean boolean16 = mongoDBRiverDefinition12.isMongoUseSSL();
        boolean boolean17 = mongoDBRiverDefinition12.isMongoSSLVerifyCertificate();
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "name" + "'", str13, "name");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "include_collection" + "'", str14, "include_collection");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.mongoDb;
        int int3 = mongoDBRiverDefinition1.throttleSize;
        int int4 = mongoDBRiverDefinition1.getDEFAULT_BULK_ACTIONS();
        boolean boolean5 = mongoDBRiverDefinition1.mongoUseSSL;
        java.lang.String str6 = mongoDBRiverDefinition1.getBULK_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition1.getSCRIPT_TYPE_FIELD();
        java.lang.String str8 = mongoDBRiverDefinition1.mongoCollection;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1000 + "'", int4 == 1000);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "bulk" + "'", str6, "bulk");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "script_type" + "'", str7, "script_type");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        builder0.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.importAllCollections(true);
        java.lang.String str9 = builder8.getmongoAdminPassword();
        java.lang.String str10 = builder8.statisticsTypeName;
        boolean boolean11 = builder8.getdisableIndexRefresh();
        builder8.mongoAdminPassword = "name";
        boolean boolean14 = builder8.mongoGridFS;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder8.socketTimeout((int) '#');
        java.lang.String str17 = builder16.riverIndexName;
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings1 = serializedObjectSupporter0.deserializeObjectRiverSettings3();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString7();
        org.elasticsearch.river.RiverSettings riverSettings5 = serializedObjectSupporter0.deserializeObjectRiverSettings9();
        org.elasticsearch.river.RiverSettings riverSettings6 = serializedObjectSupporter0.deserializeObjectRiverSettings5();
        org.junit.Assert.assertNotNull(riverSettings1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mongodb-1638820218299" + "'", str2, "mongodb-1638820218299");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "mongodb-1638820218299" + "'", str3, "mongodb-1638820218299");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb-1638820218326" + "'", str4, "mongodb-1638820218326");
        org.junit.Assert.assertNotNull(riverSettings5);
        org.junit.Assert.assertNotNull(riverSettings6);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("concurrent_bulk_requests");
        java.lang.String str11 = builder10.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder10);
        java.lang.String str13 = mongoDBRiverDefinition12.getMongoLocalUser();
        java.lang.String str14 = mongoDBRiverDefinition12.getSSL_VERIFY_CERT_FIELD();
        java.lang.String str15 = mongoDBRiverDefinition12.getLOCAL_DB_FIELD();
        boolean boolean16 = mongoDBRiverDefinition12.isMongoSecondaryReadPreference();
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ssl_verify_certificate" + "'", str14, "ssl_verify_certificate");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "local" + "'", str15, "local");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.mongoDb;
        java.lang.String str3 = mongoDBRiverDefinition1.getADMIN_DB_FIELD();
        boolean boolean4 = mongoDBRiverDefinition1.skipInitialImport;
        java.util.List<com.mongodb.ServerAddress> serverAddressList5 = mongoDBRiverDefinition1.mongoServers;
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter6 = mongoDBRiverDefinition1.serializedObjectSupporter;
        boolean boolean7 = mongoDBRiverDefinition1.getmongoGridFS();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(serverAddressList5);
        org.junit.Assert.assertNull(serializedObjectSupporter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        builder0.socketTimeout = (short) 0;
        boolean boolean7 = builder0.storeStatistics;
        builder0.scriptType = "mongodb-1638820218299";
        builder0.setindexName("index");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str13 = mongoDBRiverDefinition12.getIncludeCollection();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.mongoDb;
        java.lang.String str3 = mongoDBRiverDefinition1.getCONCURRENT_BULK_REQUESTS_FIELD();
        java.lang.String str4 = mongoDBRiverDefinition1.getMongoLocalUser();
        boolean boolean5 = mongoDBRiverDefinition1.isAdvancedTransformation();
        int int6 = mongoDBRiverDefinition1.connectTimeout;
        java.lang.String str7 = mongoDBRiverDefinition1.getStatisticsTypeName();
        boolean boolean8 = mongoDBRiverDefinition1.isMongoUseSSL();
        java.lang.String str9 = mongoDBRiverDefinition1.includeCollection;
        org.elasticsearch.common.logging.ESLogger eSLogger10 = mongoDBRiverDefinition1.getlogger();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "concurrent_bulk_requests" + "'", str3, "concurrent_bulk_requests");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(eSLogger10);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.advancedTransformation(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.connectTimeout(10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.statisticsTypeName("size");
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder3);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder3);
        builder3.mongoAdminPassword = "";
        builder3.socketTimeout = (short) 0;
        boolean boolean10 = builder3.storeStatistics;
        builder3.scriptType = "mongodb-1638820218299";
        java.lang.String[] strArray14 = new java.lang.String[] { "mongodb-1638820218299" };
        java.util.LinkedHashSet<java.lang.String> strSet15 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet15, strArray14);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder3.excludeFields((java.util.Set<java.lang.String>) strSet15);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder18);
        builder18.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder18.mongoSecondaryReadPreference(true);
        builder18.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder18.mongoDb("concurrent_bulk_requests");
        java.lang.String str29 = builder28.statisticsIndexName;
        com.mongodb.BasicDBObject basicDBObject30 = builder28.getmongoOplogFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition32 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder31);
        java.lang.String str33 = mongoDBRiverDefinition32.mongoDb;
        java.lang.String str34 = mongoDBRiverDefinition32.getCONCURRENT_BULK_REQUESTS_FIELD();
        int int35 = mongoDBRiverDefinition32.throttleSize;
        boolean boolean36 = mongoDBRiverDefinition32.getskipInitialImport();
        java.lang.String str37 = mongoDBRiverDefinition32.getScriptType();
        com.mongodb.BasicDBObject basicDBObject38 = mongoDBRiverDefinition32.mongoCollectionFilter;
        builder28.mongoCollectionFilter = basicDBObject38;
        builder17.mongoCollectionFilter = basicDBObject38;
        com.mongodb.MongoClientOptions mongoClientOptions41 = null;
        builder17.mongoClientOptions = mongoClientOptions41;
        java.lang.String str43 = builder17.includeCollection;
        builder17.setmongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition47 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder46);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition48 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder46);
        builder46.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder46.mongoSecondaryReadPreference(true);
        builder46.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder46.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = builder56.includeCollection("mongodb-1638820218299");
        builder56.setmongoDb("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = builder56.mongoUseSSL(false);
        com.mongodb.BasicDBObject basicDBObject63 = builder56.mongoCollectionFilter;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder64 = builder17.mongoOplogFilter(basicDBObject63);
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject63);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(basicDBObject30);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "concurrent_bulk_requests" + "'", str34, "concurrent_bulk_requests");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(basicDBObject38);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(builder52);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder62);
        org.junit.Assert.assertNotNull(basicDBObject63);
        org.junit.Assert.assertNotNull(builder64);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("concurrent_bulk_requests");
        com.mongodb.BasicDBObject basicDBObject11 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoCollectionFilter(basicDBObject11);
        boolean boolean13 = builder12.getmongoSecondaryReadPreference();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder12.advancedTransformation(false);
        boolean boolean16 = builder15.mongoSSLVerifyCertificate;
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.includeCollection("mongodb-1638820218299");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder12);
        boolean boolean14 = mongoDBRiverDefinition13.mongoGridFS;
        boolean boolean15 = mongoDBRiverDefinition13.storeStatistics;
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.includeCollection("mongodb-1638820218299");
        builder10.setmongoDb("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder10.mongoUseSSL(false);
        com.mongodb.BasicDBObject basicDBObject17 = builder10.mongoCollectionFilter;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder10);
        java.lang.String str19 = mongoDBRiverDefinition18.getUSER_FIELD();
        boolean boolean20 = mongoDBRiverDefinition18.importAllCollections;
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(basicDBObject17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "user" + "'", str19, "user");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("options", "secret", false);
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?secret?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.mongoDb;
        java.lang.String str3 = mongoDBRiverDefinition1.getADMIN_DB_FIELD();
        java.lang.String str4 = mongoDBRiverDefinition1.getOPTIONS_FIELD();
        java.lang.String str5 = mongoDBRiverDefinition1.getINCLUDE_COLLECTION_FIELD();
        com.mongodb.MongoClientOptions mongoClientOptions6 = mongoDBRiverDefinition1.mongoClientOptions;
        java.lang.String str7 = mongoDBRiverDefinition1.getFLUSH_INTERVAL_FIELD();
        int int8 = mongoDBRiverDefinition1.getConnectTimeout();
        java.lang.String str9 = mongoDBRiverDefinition1.getMongoDb();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "options" + "'", str4, "options");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "include_collection" + "'", str5, "include_collection");
        org.junit.Assert.assertNull(mongoClientOptions6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "flush_interval" + "'", str7, "flush_interval");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        builder0.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.importAllCollections(true);
        java.lang.String str9 = builder8.getmongoAdminPassword();
        java.lang.String str10 = builder8.statisticsTypeName;
        boolean boolean11 = builder8.getdisableIndexRefresh();
        builder8.mongoAdminPassword = "name";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str15 = mongoDBRiverDefinition14.getDEFAULT_DB_HOST();
        int int16 = mongoDBRiverDefinition14.getDEFAULT_CONNECT_TIMEOUT();
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "localhost" + "'", str15, "localhost");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 30000 + "'", int16 == 30000);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        builder0.socketTimeout = (short) 0;
        boolean boolean7 = builder0.storeStatistics;
        builder0.scriptType = "mongodb-1638820218299";
        java.lang.String[] strArray11 = new java.lang.String[] { "mongodb-1638820218299" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder0.excludeFields((java.util.Set<java.lang.String>) strSet12);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder0.mongoLocalUser("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder0.socketTimeout((int) '4');
        builder18.setmongoCollection("_river");
        java.lang.Boolean boolean21 = builder18.getisMongos();
        java.util.Set<java.lang.String> strSet22 = builder18.getincludeFields();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNull(boolean21);
        org.junit.Assert.assertNull(strSet22);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings1 = serializedObjectSupporter0.deserializeObjectRiverSettings3();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        org.elasticsearch.river.RiverSettings riverSettings3 = serializedObjectSupporter0.deserializeObjectRiverSettings2();
        org.elasticsearch.river.RiverSettings riverSettings4 = serializedObjectSupporter0.deserializeObjectRiverSettings4();
        org.elasticsearch.common.settings.Settings settings5 = riverSettings4.globalSettings();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder6);
        builder6.mongoAdminPassword = "";
        builder6.socketTimeout = (short) 0;
        boolean boolean13 = builder6.storeStatistics;
        builder6.scriptType = "mongodb-1638820218299";
        java.lang.String[] strArray17 = new java.lang.String[] { "mongodb-1638820218299" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder6.excludeFields((java.util.Set<java.lang.String>) strSet18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.mongoAdminUser("host");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder20.disableIndexRefresh(false);
        java.lang.String str25 = builder24.getstatisticsIndexName();
        com.mongodb.BasicDBObject basicDBObject26 = builder24.mongoCollectionFilter;
        org.elasticsearch.river.RiverSettings riverSettings27 = new org.elasticsearch.river.RiverSettings(settings5, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject26);
        org.elasticsearch.env.Environment environment28 = null;
        org.elasticsearch.script.ScriptEngineService[] scriptEngineServiceArray29 = new org.elasticsearch.script.ScriptEngineService[] {};
        java.util.LinkedHashSet<org.elasticsearch.script.ScriptEngineService> scriptEngineServiceSet30 = new java.util.LinkedHashSet<org.elasticsearch.script.ScriptEngineService>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<org.elasticsearch.script.ScriptEngineService>) scriptEngineServiceSet30, scriptEngineServiceArray29);
        org.elasticsearch.watcher.ResourceWatcherService resourceWatcherService32 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.script.ScriptService scriptService33 = new org.elasticsearch.script.ScriptService(settings5, environment28, (java.util.Set<org.elasticsearch.script.ScriptEngineService>) scriptEngineServiceSet30, resourceWatcherService32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(riverSettings1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mongodb-1638820218299" + "'", str2, "mongodb-1638820218299");
        org.junit.Assert.assertNotNull(riverSettings3);
        org.junit.Assert.assertNotNull(riverSettings4);
        org.junit.Assert.assertNotNull(settings5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(basicDBObject26);
        org.junit.Assert.assertNotNull(scriptEngineServiceArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        builder0.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.importAllCollections(true);
        java.lang.String str9 = builder0.mongoLocalUser;
        boolean boolean10 = builder0.getadvancedTransformation();
        builder0.socketTimeout = '4';
        com.mongodb.BasicDBObject basicDBObject13 = builder0.getmongoCollectionFilter();
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(basicDBObject13);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.mongoDb;
        java.lang.String str3 = mongoDBRiverDefinition1.getCONCURRENT_BULK_REQUESTS_FIELD();
        int int4 = mongoDBRiverDefinition1.throttleSize;
        boolean boolean5 = mongoDBRiverDefinition1.getskipInitialImport();
        java.lang.String str6 = mongoDBRiverDefinition1.getScriptType();
        java.lang.String str7 = mongoDBRiverDefinition1.getSIZE_FIELD();
        java.lang.String str8 = mongoDBRiverDefinition1.statisticsIndexName;
        java.lang.String str9 = mongoDBRiverDefinition1.getMongoCollection();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "concurrent_bulk_requests" + "'", str3, "concurrent_bulk_requests");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "size" + "'", str7, "size");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.riverName("concurrent_requests");
        builder12.typeName = "mongodb-1638820218363";
        boolean boolean15 = builder12.getdisableIndexRefresh();
        java.lang.String str16 = builder12.typeName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder12.typeName("script.disable_dynamic");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "mongodb-1638820218363" + "'", str16, "mongodb-1638820218363");
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        com.mongodb.ServerAddress[] serverAddressArray9 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList10 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList10, serverAddressArray9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.isMongos((java.lang.Boolean) true);
        boolean boolean15 = builder12.getadvancedTransformation();
        builder12.setmongoSSLVerifyCertificate(true);
        builder12.setmongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder20);
        java.lang.String str22 = mongoDBRiverDefinition21.mongoDb;
        java.lang.String str23 = mongoDBRiverDefinition21.getADMIN_DB_FIELD();
        boolean boolean24 = mongoDBRiverDefinition21.skipInitialImport;
        java.util.List<com.mongodb.ServerAddress> serverAddressList25 = mongoDBRiverDefinition21.mongoServers;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder12.mongoServers(serverAddressList25);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.dropCollection(false);
        java.lang.String str29 = builder28.mongoDb;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition31 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder30);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition32 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder30);
        builder30.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder30.mongoSecondaryReadPreference(true);
        builder30.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder30.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder40.includeCollection("mongodb-1638820218299");
        builder40.setmongoDb("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder40.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder46.isMongos((java.lang.Boolean) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder46.advancedTransformation(false);
        boolean boolean51 = builder50.mongoUseSSL;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory52 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition54 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder53);
        java.lang.String str55 = mongoDBRiverDefinition54.mongoDb;
        java.lang.String str56 = mongoDBRiverDefinition54.getCONCURRENT_BULK_REQUESTS_FIELD();
        int int57 = mongoDBRiverDefinition54.throttleSize;
        boolean boolean58 = mongoDBRiverDefinition54.getskipInitialImport();
        java.lang.String str59 = mongoDBRiverDefinition54.getScriptType();
        java.lang.String str60 = mongoDBRiverDefinition54.getSIZE_FIELD();
        java.lang.String str61 = mongoDBRiverDefinition54.statisticsIndexName;
        java.lang.String str62 = mongoDBRiverDefinition54.getMongoLocalUser();
        com.mongodb.BasicDBObject basicDBObject63 = mongoDBRiverDefinition54.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript64 = docScoreNativeScriptFactory52.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject63);
        builder50.mongoCollectionFilter = basicDBObject63;
        builder28.mongoCollectionFilter = basicDBObject63;
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(serverAddressArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "admin" + "'", str23, "admin");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(serverAddressList25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(builder50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "concurrent_bulk_requests" + "'", str56, "concurrent_bulk_requests");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "size" + "'", str60, "size");
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(basicDBObject63);
        org.junit.Assert.assertNotNull(executableScript64);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        builder0.socketTimeout = (short) 0;
        boolean boolean7 = builder0.storeStatistics;
        builder0.scriptType = "mongodb-1638820218299";
        java.lang.String[] strArray11 = new java.lang.String[] { "mongodb-1638820218299" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder0.excludeFields((java.util.Set<java.lang.String>) strSet12);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder0.mongoLocalUser("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder0.socketTimeout((int) '4');
        java.lang.String str19 = builder18.getriverName();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.riverName = "include_collection";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.connectTimeout((int) (short) 10);
        com.mongodb.MongoClientOptions mongoClientOptions6 = builder0.mongoClientOptions;
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(mongoClientOptions6);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.includeCollection("mongodb-1638820218299");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder12);
        java.lang.String str14 = mongoDBRiverDefinition13.getGRIDFS_FIELD();
        boolean boolean15 = mongoDBRiverDefinition13.getmongoSSLVerifyCertificate();
        java.lang.String str16 = mongoDBRiverDefinition13.getMongoDb();
        boolean boolean17 = mongoDBRiverDefinition13.mongoUseSSL;
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "gridfs" + "'", str14, "gridfs");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "concurrent_bulk_requests" + "'", str16, "concurrent_bulk_requests");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.mongoDb;
        boolean boolean3 = mongoDBRiverDefinition1.skipInitialImport;
        java.lang.String str4 = mongoDBRiverDefinition1.mongoCollection;
        com.mongodb.BasicDBObject basicDBObject5 = mongoDBRiverDefinition1.mongoOplogFilter;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(basicDBObject5);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        com.mongodb.ServerAddress[] serverAddressArray9 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList10 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList10, serverAddressArray9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList10);
        com.mongodb.MongoClientOptions mongoClientOptions13 = builder0.mongoClientOptions;
        java.lang.String str14 = builder0.getstatisticsIndexName();
        builder0.includeCollection = "mydatabase";
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(serverAddressArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(mongoClientOptions13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("concurrent_bulk_requests");
        java.lang.String str11 = builder10.statisticsIndexName;
        com.mongodb.BasicDBObject basicDBObject12 = builder10.getmongoOplogFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder13);
        java.lang.String str15 = mongoDBRiverDefinition14.mongoDb;
        java.lang.String str16 = mongoDBRiverDefinition14.getCONCURRENT_BULK_REQUESTS_FIELD();
        int int17 = mongoDBRiverDefinition14.throttleSize;
        boolean boolean18 = mongoDBRiverDefinition14.getskipInitialImport();
        java.lang.String str19 = mongoDBRiverDefinition14.getScriptType();
        com.mongodb.BasicDBObject basicDBObject20 = mongoDBRiverDefinition14.mongoCollectionFilter;
        builder10.mongoCollectionFilter = basicDBObject20;
        boolean boolean22 = builder10.mongoGridFS;
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(basicDBObject12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "concurrent_bulk_requests" + "'", str16, "concurrent_bulk_requests");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(basicDBObject20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        builder0.socketTimeout = (short) 0;
        boolean boolean7 = builder0.storeStatistics;
        builder0.scriptType = "mongodb-1638820218299";
        java.util.Set<java.lang.String> strSet10 = builder0.getparentTypes();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.riverIndexName("exclude_fields");
        java.lang.String str13 = builder0.getmongoDb();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(strSet10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings1 = serializedObjectSupporter0.deserializeObjectRiverSettings3();
        org.elasticsearch.river.RiverSettings riverSettings2 = serializedObjectSupporter0.deserializeObjectRiverSettings2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString11();
        org.elasticsearch.river.RiverSettings riverSettings5 = serializedObjectSupporter0.deserializeObjectRiverSettings6();
        org.elasticsearch.common.settings.Settings settings6 = riverSettings5.globalSettings();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder7);
        java.util.Set<java.lang.String> strSet9 = builder7.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder10);
        builder10.mongoAdminPassword = "";
        builder10.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder10.importAllCollections(true);
        java.lang.String str19 = builder18.getmongoAdminPassword();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder18.mongoLocalPassword("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition23 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder22);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder22);
        builder22.mongoAdminPassword = "";
        builder22.socketTimeout = (short) 0;
        boolean boolean29 = builder22.storeStatistics;
        builder22.scriptType = "mongodb-1638820218299";
        java.lang.String[] strArray33 = new java.lang.String[] { "mongodb-1638820218299" };
        java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder22.excludeFields((java.util.Set<java.lang.String>) strSet34);
        builder18.setexcludeFields((java.util.Set<java.lang.String>) strSet34);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder7.parentTypes((java.util.Set<java.lang.String>) strSet34);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition40 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder39);
        java.lang.String str41 = mongoDBRiverDefinition40.mongoDb;
        int int42 = mongoDBRiverDefinition40.throttleSize;
        int int43 = mongoDBRiverDefinition40.getDEFAULT_BULK_ACTIONS();
        java.lang.String str44 = mongoDBRiverDefinition40.getMongoLocalPassword();
        com.mongodb.BasicDBObject basicDBObject45 = mongoDBRiverDefinition40.mongoCollectionFilter;
        builder38.setmongoOplogFilter(basicDBObject45);
        org.elasticsearch.river.RiverSettings riverSettings47 = new org.elasticsearch.river.RiverSettings(settings6, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject45);
        org.elasticsearch.env.Environment environment48 = null;
        org.elasticsearch.script.ScriptEngineService[] scriptEngineServiceArray49 = new org.elasticsearch.script.ScriptEngineService[] {};
        java.util.LinkedHashSet<org.elasticsearch.script.ScriptEngineService> scriptEngineServiceSet50 = new java.util.LinkedHashSet<org.elasticsearch.script.ScriptEngineService>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<org.elasticsearch.script.ScriptEngineService>) scriptEngineServiceSet50, scriptEngineServiceArray49);
        org.elasticsearch.watcher.ResourceWatcherService resourceWatcherService52 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.script.ScriptService scriptService53 = new org.elasticsearch.script.ScriptService(settings6, environment48, (java.util.Set<org.elasticsearch.script.ScriptEngineService>) scriptEngineServiceSet50, resourceWatcherService52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(riverSettings1);
        org.junit.Assert.assertNotNull(riverSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_river" + "'", str3, "_river");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb-1638820218387" + "'", str4, "mongodb-1638820218387");
        org.junit.Assert.assertNotNull(riverSettings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNull(strSet9);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1000 + "'", int43 == 1000);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(basicDBObject45);
        org.junit.Assert.assertNotNull(scriptEngineServiceArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter2 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings3 = serializedObjectSupporter2.deserializeObjectRiverSettings3();
        java.lang.String str4 = serializedObjectSupporter2.deserializeObjectString8();
        org.elasticsearch.river.RiverSettings riverSettings5 = serializedObjectSupporter2.deserializeObjectRiverSettings6();
        org.elasticsearch.script.ScriptService scriptService6 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("size", "credentials", riverSettings5, scriptService6);
        java.lang.String str8 = mongoDBRiverDefinition7.scriptType;
        org.junit.Assert.assertNotNull(riverSettings3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_river" + "'", str4, "_river");
        org.junit.Assert.assertNotNull(riverSettings5);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.util.Set<java.lang.String> strSet2 = builder0.includeFields;
        java.util.Set<java.lang.String> strSet3 = builder0.getincludeFields();
        java.lang.String str4 = builder0.gettypeName();
        org.junit.Assert.assertNull(strSet2);
        org.junit.Assert.assertNull(strSet3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.includeCollection("mongodb-1638820218299");
        builder10.setmongoDb("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder10.mongoUseSSL(false);
        java.lang.String str17 = builder10.getindexName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder10.mongoAdminUser("localhost");
        builder19.settypeName("");
        java.lang.String str22 = builder19.script;
        java.lang.String str23 = builder19.getscriptType();
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        builder0.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.importAllCollections(true);
        java.lang.String str9 = builder8.getmongoAdminPassword();
        java.lang.String str10 = builder8.statisticsTypeName;
        boolean boolean11 = builder8.getdisableIndexRefresh();
        builder8.mongoAdminPassword = "name";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str15 = mongoDBRiverDefinition14.getHOST_FIELD();
        org.elasticsearch.common.unit.TimeValue timeValue16 = mongoDBRiverDefinition14.getDEFAULT_FLUSH_INTERVAL();
        java.lang.String str17 = mongoDBRiverDefinition14.getACTIONS_FIELD();
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "host" + "'", str15, "host");
        org.junit.Assert.assertNotNull(timeValue16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "actions" + "'", str17, "actions");
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("concurrent_bulk_requests");
        java.lang.String str11 = builder10.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder12);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder12);
        builder12.mongoAdminPassword = "";
        builder12.socketTimeout = (short) 0;
        boolean boolean19 = builder12.storeStatistics;
        builder12.scriptType = "mongodb-1638820218299";
        java.lang.String[] strArray23 = new java.lang.String[] { "mongodb-1638820218299" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder12.excludeFields((java.util.Set<java.lang.String>) strSet24);
        builder10.setparentTypes((java.util.Set<java.lang.String>) strSet24);
        builder10.setskipInitialImport(true);
        builder10.mongoAdminPassword = "skip_initial_import";
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(builder26);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.mongoDb;
        java.lang.String str3 = mongoDBRiverDefinition1.getCONCURRENT_BULK_REQUESTS_FIELD();
        int int4 = mongoDBRiverDefinition1.throttleSize;
        boolean boolean5 = mongoDBRiverDefinition1.isDropCollection();
        boolean boolean6 = mongoDBRiverDefinition1.getstoreStatistics();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "concurrent_bulk_requests" + "'", str3, "concurrent_bulk_requests");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.includeCollection("mongodb-1638820218299");
        builder10.setmongoDb("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder10.mongoUseSSL(false);
        boolean boolean17 = builder16.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder16.socketTimeout(60000);
        java.lang.Boolean boolean20 = builder16.isMongos;
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNull(boolean20);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.includeCollection("mongodb-1638820218299");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder12);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder12.statisticsTypeName("socket_timeout");
        java.util.Set<java.lang.String> strSet16 = builder12.getincludeFields();
        builder12.setriverIndexName("is_mongos");
        java.lang.String str19 = builder12.typeName;
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNull(strSet16);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        builder0.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.importAllCollections(true);
        java.lang.String str9 = builder8.getmongoAdminPassword();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder8.mongoLocalPassword("");
        boolean boolean12 = builder11.dropCollection;
        builder11.mongoSSLVerifyCertificate = true;
        com.mongodb.BasicDBObject basicDBObject15 = builder11.getmongoOplogFilter();
        builder11.statisticsTypeName = "bulk_timeout";
        java.lang.String str18 = builder11.mongoLocalUser;
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(basicDBObject15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.includeCollection("mongodb-1638820218299");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder12);
        java.lang.String str14 = mongoDBRiverDefinition13.getGRIDFS_FIELD();
        boolean boolean15 = mongoDBRiverDefinition13.getmongoSSLVerifyCertificate();
        boolean boolean16 = mongoDBRiverDefinition13.mongoGridFS;
        com.mongodb.MongoClientOptions mongoClientOptions17 = mongoDBRiverDefinition13.getMongoClientOptions();
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "gridfs" + "'", str14, "gridfs");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(mongoClientOptions17);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.includeCollection("mongodb-1638820218299");
        builder10.setmongoDb("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder10.mongoUseSSL(false);
        com.mongodb.BasicDBObject basicDBObject17 = builder10.mongoCollectionFilter;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder10.mongoLocalPassword("");
        builder19.mongoDb = "mongodb-1638820218326";
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(basicDBObject17);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.mongoDb;
        java.lang.String str3 = mongoDBRiverDefinition1.getADMIN_DB_FIELD();
        boolean boolean4 = mongoDBRiverDefinition1.skipInitialImport;
        java.lang.String str5 = mongoDBRiverDefinition1.getSCRIPT_FIELD();
        int int6 = mongoDBRiverDefinition1.getConnectTimeout();
        java.lang.String str7 = mongoDBRiverDefinition1.getMongoLocalPassword();
        java.lang.String str8 = mongoDBRiverDefinition1.typeName;
        java.util.Set<java.lang.String> strSet9 = mongoDBRiverDefinition1.parentTypes;
        java.lang.String str10 = mongoDBRiverDefinition1.getSSL_CONNECTION_FIELD();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "script" + "'", str5, "script");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(strSet9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ssl" + "'", str10, "ssl");
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        builder0.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.importAllCollections(true);
        java.lang.String str9 = builder8.getmongoAdminPassword();
        java.lang.String str10 = builder8.statisticsTypeName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder8.mongoGridFS(true);
        java.lang.String str13 = builder12.getmongoCollection();
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = builder10.initialTimestamp;
        com.mongodb.MongoClientOptions mongoClientOptions12 = null;
        builder10.mongoClientOptions = mongoClientOptions12;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder10.mongoCollection("");
        boolean boolean16 = builder15.mongoSSLVerifyCertificate;
        java.lang.String str17 = builder15.mongoDb;
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "concurrent_bulk_requests" + "'", str17, "concurrent_bulk_requests");
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        builder0.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.importAllCollections(true);
        java.lang.String str9 = builder0.mongoLocalUser;
        java.lang.Boolean boolean10 = builder0.getisMongos();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.Boolean boolean12 = mongoDBRiverDefinition11.isMongos();
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertNull(boolean12);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings1 = serializedObjectSupporter0.deserializeObjectRiverSettings3();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        org.elasticsearch.river.RiverSettings riverSettings3 = serializedObjectSupporter0.deserializeObjectRiverSettings2();
        org.elasticsearch.river.RiverSettings riverSettings4 = serializedObjectSupporter0.deserializeObjectRiverSettings4();
        org.elasticsearch.common.settings.Settings settings5 = riverSettings4.globalSettings();
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter8 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings9 = serializedObjectSupporter8.deserializeObjectRiverSettings3();
        java.lang.String str10 = serializedObjectSupporter8.deserializeObjectString8();
        org.elasticsearch.river.RiverSettings riverSettings11 = serializedObjectSupporter8.deserializeObjectRiverSettings6();
        org.elasticsearch.script.ScriptService scriptService12 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("size", "credentials", riverSettings11, scriptService12);
        int int14 = mongoDBRiverDefinition13.getDEFAULT_BULK_ACTIONS();
        java.lang.String str15 = mongoDBRiverDefinition13.getBULK_SIZE_FIELD();
        com.mongodb.BasicDBObject basicDBObject16 = mongoDBRiverDefinition13.mongoCollectionFilter;
        org.elasticsearch.river.RiverSettings riverSettings17 = new org.elasticsearch.river.RiverSettings(settings5, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject16);
        org.elasticsearch.env.Environment environment18 = null;
        org.elasticsearch.script.ScriptEngineService[] scriptEngineServiceArray19 = new org.elasticsearch.script.ScriptEngineService[] {};
        java.util.LinkedHashSet<org.elasticsearch.script.ScriptEngineService> scriptEngineServiceSet20 = new java.util.LinkedHashSet<org.elasticsearch.script.ScriptEngineService>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<org.elasticsearch.script.ScriptEngineService>) scriptEngineServiceSet20, scriptEngineServiceArray19);
        org.elasticsearch.watcher.ResourceWatcherService resourceWatcherService22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.script.ScriptService scriptService23 = new org.elasticsearch.script.ScriptService(settings5, environment18, (java.util.Set<org.elasticsearch.script.ScriptEngineService>) scriptEngineServiceSet20, resourceWatcherService22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(riverSettings1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mongodb-1638820218299" + "'", str2, "mongodb-1638820218299");
        org.junit.Assert.assertNotNull(riverSettings3);
        org.junit.Assert.assertNotNull(riverSettings4);
        org.junit.Assert.assertNotNull(settings5);
        org.junit.Assert.assertNotNull(riverSettings9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_river" + "'", str10, "_river");
        org.junit.Assert.assertNotNull(riverSettings11);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1000 + "'", int14 == 1000);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "bulk_size" + "'", str15, "bulk_size");
        org.junit.Assert.assertNotNull(basicDBObject16);
        org.junit.Assert.assertNotNull(scriptEngineServiceArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.riverName("concurrent_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.disableIndexRefresh(false);
        java.lang.String str15 = builder14.statisticsTypeName;
        builder14.setmongoLocalPassword("credentials");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings1 = serializedObjectSupporter0.deserializeObjectRiverSettings3();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        org.elasticsearch.river.RiverSettings riverSettings3 = serializedObjectSupporter0.deserializeObjectRiverSettings2();
        org.elasticsearch.river.RiverSettings riverSettings4 = serializedObjectSupporter0.deserializeObjectRiverSettings4();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString3();
        org.elasticsearch.river.RiverSettings riverSettings6 = serializedObjectSupporter0.deserializeObjectRiverSettings7();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(riverSettings1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mongodb-1638820218299" + "'", str2, "mongodb-1638820218299");
        org.junit.Assert.assertNotNull(riverSettings3);
        org.junit.Assert.assertNotNull(riverSettings4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "mongodb-1638820218264" + "'", str5, "mongodb-1638820218264");
        org.junit.Assert.assertNotNull(riverSettings6);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = builder10.initialTimestamp;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder10.riverIndexName("skip_initial_import");
        builder10.setmongoLocalUser("local");
        java.lang.String str16 = builder10.gettypeName();
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.includeCollection("mongodb-1638820218299");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder12);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder12.statisticsTypeName("socket_timeout");
        java.util.Set<java.lang.String> strSet16 = builder12.getincludeFields();
        builder12.setriverIndexName("is_mongos");
        boolean boolean19 = builder12.getmongoSecondaryReadPreference();
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNull(strSet16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.mongoDb;
        java.lang.String str3 = mongoDBRiverDefinition1.getADMIN_DB_FIELD();
        java.lang.String str4 = mongoDBRiverDefinition1.getOPTIONS_FIELD();
        java.lang.String str5 = mongoDBRiverDefinition1.getINCLUDE_COLLECTION_FIELD();
        int int6 = mongoDBRiverDefinition1.getDEFAULT_CONCURRENT_REQUESTS();
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter7 = mongoDBRiverDefinition1.serializedObjectSupporter;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "options" + "'", str4, "options");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "include_collection" + "'", str5, "include_collection");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertNull(serializedObjectSupporter7);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        boolean boolean9 = builder0.getadvancedTransformation();
        builder0.indexName = "mongodb-1638820218326";
        builder0.setconnectTimeout(27017);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder0.mongoLocalPassword("throttle_size");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.mongoDb;
        java.lang.String str3 = mongoDBRiverDefinition1.getSERVERS_FIELD();
        java.lang.String str4 = mongoDBRiverDefinition1.statisticsIndexName;
        boolean boolean5 = mongoDBRiverDefinition1.isDropCollection();
        int int6 = mongoDBRiverDefinition1.socketTimeout;
        java.lang.String str7 = mongoDBRiverDefinition1.getMongoDb();
        java.lang.String str8 = mongoDBRiverDefinition1.getSERVERS_FIELD();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "servers" + "'", str3, "servers");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "servers" + "'", str8, "servers");
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("filter");
        boolean boolean4 = builder0.getskipInitialImport();
        builder0.setstoreStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder7);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder7);
        builder7.mongoAdminPassword = "";
        builder7.socketTimeout = (short) 0;
        boolean boolean14 = builder7.storeStatistics;
        builder7.scriptType = "mongodb-1638820218299";
        java.lang.String[] strArray18 = new java.lang.String[] { "mongodb-1638820218299" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder7.excludeFields((java.util.Set<java.lang.String>) strSet19);
        builder0.setparentTypes((java.util.Set<java.lang.String>) strSet19);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder0.mongoLocalPassword("hi!");
        builder0.setmongoAdminPassword("servers");
        boolean boolean27 = builder0.getmongoUseSSL();
        builder0.setmongoLocalUser("secret");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.advancedTransformation(true);
        boolean boolean5 = builder4.mongoSecondaryReadPreference;
        java.lang.String str6 = builder4.getstatisticsTypeName();
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter9 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings10 = serializedObjectSupporter9.deserializeObjectRiverSettings3();
        java.lang.String str11 = serializedObjectSupporter9.deserializeObjectString8();
        org.elasticsearch.river.RiverSettings riverSettings12 = serializedObjectSupporter9.deserializeObjectRiverSettings6();
        org.elasticsearch.script.ScriptService scriptService13 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition14 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("size", "credentials", riverSettings12, scriptService13);
        int int15 = mongoDBRiverDefinition14.getDEFAULT_BULK_ACTIONS();
        java.lang.String str16 = mongoDBRiverDefinition14.getBULK_SIZE_FIELD();
        com.mongodb.BasicDBObject basicDBObject17 = mongoDBRiverDefinition14.mongoCollectionFilter;
        builder4.mongoCollectionFilter = basicDBObject17;
        builder4.throttleSize = 32;
        java.lang.String str21 = builder4.getstatisticsTypeName();
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(riverSettings10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_river" + "'", str11, "_river");
        org.junit.Assert.assertNotNull(riverSettings12);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1000 + "'", int15 == 1000);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "bulk_size" + "'", str16, "bulk_size");
        org.junit.Assert.assertNotNull(basicDBObject17);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter2 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings3 = serializedObjectSupporter2.deserializeObjectRiverSettings4();
        org.elasticsearch.script.ScriptService scriptService4 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("script", "advanced_transformation", riverSettings3, scriptService4);
        com.mongodb.BasicDBObject basicDBObject6 = mongoDBRiverDefinition5.getMongoOplogFilter();
        java.lang.String str7 = mongoDBRiverDefinition5.mongoDb;
        org.junit.Assert.assertNotNull(riverSettings3);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition5);
        org.junit.Assert.assertNull(basicDBObject6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "mydatabase" + "'", str7, "mydatabase");
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.mongoDb;
        int int3 = mongoDBRiverDefinition1.throttleSize;
        int int4 = mongoDBRiverDefinition1.getDEFAULT_BULK_ACTIONS();
        boolean boolean5 = mongoDBRiverDefinition1.mongoUseSSL;
        java.lang.String str6 = mongoDBRiverDefinition1.getSERVERS_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition1.getIMPORT_ALL_COLLECTIONS_FIELD();
        java.lang.String str8 = mongoDBRiverDefinition1.getBULK_SIZE_FIELD();
        java.lang.String str9 = mongoDBRiverDefinition1.mongoCollection;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1000 + "'", int4 == 1000);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "servers" + "'", str6, "servers");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "import_all_collections" + "'", str7, "import_all_collections");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "bulk_size" + "'", str8, "bulk_size");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.riverName = "include_collection";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.connectTimeout((int) (short) 10);
        com.mongodb.MongoClientOptions mongoClientOptions6 = null;
        builder5.setmongoClientOptions(mongoClientOptions6);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter2 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings3 = serializedObjectSupporter2.deserializeObjectRiverSettings3();
        java.lang.String str4 = serializedObjectSupporter2.deserializeObjectString5();
        org.elasticsearch.river.RiverSettings riverSettings5 = serializedObjectSupporter2.deserializeObjectRiverSettings2();
        java.lang.String str6 = serializedObjectSupporter2.deserializeObjectString4();
        org.elasticsearch.river.RiverSettings riverSettings7 = serializedObjectSupporter2.deserializeObjectRiverSettings7();
        org.elasticsearch.script.ScriptService scriptService8 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("concurrent_requests", "mongodb-1638820218326", riverSettings7, scriptService8);
        java.lang.String str10 = mongoDBRiverDefinition9.scriptType;
        boolean boolean11 = mongoDBRiverDefinition9.getmongoGridFS();
        java.lang.String str12 = mongoDBRiverDefinition9.getINDEX_OBJECT();
        org.junit.Assert.assertNotNull(riverSettings3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb-1638820218299" + "'", str4, "mongodb-1638820218299");
        org.junit.Assert.assertNotNull(riverSettings5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_river" + "'", str6, "_river");
        org.junit.Assert.assertNotNull(riverSettings7);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "index" + "'", str12, "index");
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings1 = serializedObjectSupporter0.deserializeObjectRiverSettings3();
        org.elasticsearch.river.RiverSettings riverSettings2 = serializedObjectSupporter0.deserializeObjectRiverSettings2();
        org.elasticsearch.river.RiverSettings riverSettings3 = serializedObjectSupporter0.deserializeObjectRiverSettings4();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString14();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString17();
        org.junit.Assert.assertNotNull(riverSettings1);
        org.junit.Assert.assertNotNull(riverSettings2);
        org.junit.Assert.assertNotNull(riverSettings3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_river" + "'", str4, "_river");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "mongodb-1638820218449" + "'", str5, "mongodb-1638820218449");
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings1 = serializedObjectSupporter0.deserializeObjectRiverSettings3();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        org.elasticsearch.river.RiverSettings riverSettings3 = serializedObjectSupporter0.deserializeObjectRiverSettings1();
        org.elasticsearch.river.RiverSettings riverSettings4 = serializedObjectSupporter0.deserializeObjectRiverSettings1();
        org.elasticsearch.common.settings.Settings settings5 = riverSettings4.globalSettings();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder6);
        builder6.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder6.mongoSecondaryReadPreference(true);
        builder6.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder6.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.includeCollection("mongodb-1638820218299");
        builder16.setmongoDb("");
        builder16.mongoAdminPassword = "is_mongos";
        com.mongodb.BasicDBObject basicDBObject23 = builder16.mongoCollectionFilter;
        org.elasticsearch.river.RiverSettings riverSettings24 = new org.elasticsearch.river.RiverSettings(settings5, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject23);
        org.elasticsearch.env.Environment environment25 = null;
        org.elasticsearch.script.ScriptEngineService[] scriptEngineServiceArray26 = new org.elasticsearch.script.ScriptEngineService[] {};
        java.util.LinkedHashSet<org.elasticsearch.script.ScriptEngineService> scriptEngineServiceSet27 = new java.util.LinkedHashSet<org.elasticsearch.script.ScriptEngineService>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<org.elasticsearch.script.ScriptEngineService>) scriptEngineServiceSet27, scriptEngineServiceArray26);
        org.elasticsearch.watcher.ResourceWatcherService resourceWatcherService29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.script.ScriptService scriptService30 = new org.elasticsearch.script.ScriptService(settings5, environment25, (java.util.Set<org.elasticsearch.script.ScriptEngineService>) scriptEngineServiceSet27, resourceWatcherService29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(riverSettings1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mongodb-1638820218299" + "'", str2, "mongodb-1638820218299");
        org.junit.Assert.assertNotNull(riverSettings3);
        org.junit.Assert.assertNotNull(riverSettings4);
        org.junit.Assert.assertNotNull(settings5);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(basicDBObject23);
        org.junit.Assert.assertNotNull(scriptEngineServiceArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("concurrent_bulk_requests");
        com.mongodb.BasicDBObject basicDBObject11 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoCollectionFilter(basicDBObject11);
        builder12.mongoAdminPassword = "mongodb-1638820218299";
        java.lang.String str15 = builder12.getmongoLocalPassword();
        boolean boolean16 = builder12.getskipInitialImport();
        builder12.setmongoUseSSL(true);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.mongoDb;
        java.lang.String str3 = mongoDBRiverDefinition1.mongoAdminPassword;
        java.lang.String str4 = mongoDBRiverDefinition1.scriptType;
        boolean boolean5 = mongoDBRiverDefinition1.dropCollection;
        java.lang.String str6 = mongoDBRiverDefinition1.getDB_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition1.getDEFAULT_DB_HOST();
        java.lang.String str8 = mongoDBRiverDefinition1.statisticsIndexName;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "db" + "'", str6, "db");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "localhost" + "'", str7, "localhost");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("concurrent_bulk_requests");
        java.lang.String str11 = builder10.statisticsIndexName;
        com.mongodb.BasicDBObject basicDBObject12 = builder10.getmongoOplogFilter();
        builder10.mongoUseSSL = true;
        builder10.riverName = "disable_index_refresh";
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(basicDBObject12);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("filter");
        java.lang.String str4 = builder0.indexName;
        builder0.mongoAdminUser = "servers";
        java.lang.Boolean boolean7 = builder0.getisMongos();
        boolean boolean8 = builder0.mongoSecondaryReadPreference;
        builder0.mongoSecondaryReadPreference = true;
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.mongoDb;
        java.lang.String str3 = mongoDBRiverDefinition1.mongoAdminPassword;
        int int4 = mongoDBRiverDefinition1.getThrottleSize();
        int int5 = mongoDBRiverDefinition1.getDEFAULT_CONNECT_TIMEOUT();
        java.lang.String str6 = mongoDBRiverDefinition1.getACTIONS_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition1.getDEFAULT_DB_HOST();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 30000 + "'", int5 == 30000);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "actions" + "'", str6, "actions");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "localhost" + "'", str7, "localhost");
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("filter");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.mongoGridFS(false);
        java.lang.String str6 = builder5.scriptType;
        builder5.setscript("filter");
        java.lang.String str9 = builder5.getmongoAdminUser();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.riverName = "include_collection";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.connectTimeout((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.mongoUseSSL(true);
        builder0.setmongoAdminUser("credentials");
        builder0.storeStatistics = false;
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        builder0.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.importAllCollections(true);
        java.lang.String str9 = builder8.getmongoAdminPassword();
        java.lang.String str10 = builder8.statisticsTypeName;
        boolean boolean11 = builder8.getdisableIndexRefresh();
        builder8.mongoAdminPassword = "name";
        java.util.Set<java.lang.String> strSet14 = builder8.parentTypes;
        com.mongodb.BasicDBObject basicDBObject15 = builder8.mongoOplogFilter;
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(strSet14);
        org.junit.Assert.assertNull(basicDBObject15);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 60000);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter4 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings5 = serializedObjectSupporter4.deserializeObjectRiverSettings3();
        java.lang.String str6 = serializedObjectSupporter4.deserializeObjectString5();
        java.lang.String str7 = serializedObjectSupporter4.deserializeObjectString14();
        java.lang.String str8 = serializedObjectSupporter4.deserializeObjectString8();
        docScoreSearchScript0.setNextVar("mongodb-1638820218424", (java.lang.Object) str8);
        org.apache.lucene.index.AtomicReaderContext atomicReaderContext10 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextReader(atomicReaderContext10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(riverSettings5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "mongodb-1638820218299" + "'", str6, "mongodb-1638820218299");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_river" + "'", str7, "_river");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_river" + "'", str8, "_river");
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.mongoDb;
        java.lang.String str3 = mongoDBRiverDefinition1.getADMIN_DB_FIELD();
        boolean boolean4 = mongoDBRiverDefinition1.skipInitialImport;
        java.lang.String str5 = mongoDBRiverDefinition1.getSCRIPT_FIELD();
        boolean boolean6 = mongoDBRiverDefinition1.getdropCollection();
        java.lang.String str7 = mongoDBRiverDefinition1.getDB_FIELD();
        boolean boolean8 = mongoDBRiverDefinition1.dropCollection;
        boolean boolean9 = mongoDBRiverDefinition1.mongoSSLVerifyCertificate;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "script" + "'", str5, "script");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "db" + "'", str7, "db");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings1 = serializedObjectSupporter0.deserializeObjectRiverSettings3();
        org.elasticsearch.river.RiverSettings riverSettings2 = serializedObjectSupporter0.deserializeObjectRiverSettings2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString6();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString11();
        org.elasticsearch.river.RiverSettings riverSettings5 = serializedObjectSupporter0.deserializeObjectRiverSettings6();
        org.elasticsearch.common.settings.Settings settings6 = riverSettings5.globalSettings();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder7);
        java.util.Set<java.lang.String> strSet9 = builder7.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder10);
        builder10.mongoAdminPassword = "";
        builder10.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder10.importAllCollections(true);
        java.lang.String str19 = builder18.getmongoAdminPassword();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder18.mongoLocalPassword("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition23 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder22);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder22);
        builder22.mongoAdminPassword = "";
        builder22.socketTimeout = (short) 0;
        boolean boolean29 = builder22.storeStatistics;
        builder22.scriptType = "mongodb-1638820218299";
        java.lang.String[] strArray33 = new java.lang.String[] { "mongodb-1638820218299" };
        java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder22.excludeFields((java.util.Set<java.lang.String>) strSet34);
        builder18.setexcludeFields((java.util.Set<java.lang.String>) strSet34);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder7.parentTypes((java.util.Set<java.lang.String>) strSet34);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition40 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder39);
        java.lang.String str41 = mongoDBRiverDefinition40.mongoDb;
        int int42 = mongoDBRiverDefinition40.throttleSize;
        int int43 = mongoDBRiverDefinition40.getDEFAULT_BULK_ACTIONS();
        java.lang.String str44 = mongoDBRiverDefinition40.getMongoLocalPassword();
        com.mongodb.BasicDBObject basicDBObject45 = mongoDBRiverDefinition40.mongoCollectionFilter;
        builder38.setmongoOplogFilter(basicDBObject45);
        org.elasticsearch.river.RiverSettings riverSettings47 = new org.elasticsearch.river.RiverSettings(settings6, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject45);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter48 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings49 = serializedObjectSupporter48.deserializeObjectRiverSettings3();
        java.lang.String str50 = serializedObjectSupporter48.deserializeObjectString5();
        org.elasticsearch.river.RiverSettings riverSettings51 = serializedObjectSupporter48.deserializeObjectRiverSettings2();
        org.elasticsearch.river.RiverSettings riverSettings52 = serializedObjectSupporter48.deserializeObjectRiverSettings4();
        org.elasticsearch.common.settings.Settings settings53 = riverSettings52.globalSettings();
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter56 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings57 = serializedObjectSupporter56.deserializeObjectRiverSettings3();
        java.lang.String str58 = serializedObjectSupporter56.deserializeObjectString8();
        org.elasticsearch.river.RiverSettings riverSettings59 = serializedObjectSupporter56.deserializeObjectRiverSettings6();
        org.elasticsearch.script.ScriptService scriptService60 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition61 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("size", "credentials", riverSettings59, scriptService60);
        int int62 = mongoDBRiverDefinition61.getDEFAULT_BULK_ACTIONS();
        java.lang.String str63 = mongoDBRiverDefinition61.getBULK_SIZE_FIELD();
        com.mongodb.BasicDBObject basicDBObject64 = mongoDBRiverDefinition61.mongoCollectionFilter;
        org.elasticsearch.river.RiverSettings riverSettings65 = new org.elasticsearch.river.RiverSettings(settings53, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject64);
        org.elasticsearch.river.RiverSettings riverSettings66 = new org.elasticsearch.river.RiverSettings(settings6, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject64);
        org.elasticsearch.env.Environment environment67 = null;
        org.elasticsearch.script.ScriptEngineService[] scriptEngineServiceArray68 = new org.elasticsearch.script.ScriptEngineService[] {};
        java.util.LinkedHashSet<org.elasticsearch.script.ScriptEngineService> scriptEngineServiceSet69 = new java.util.LinkedHashSet<org.elasticsearch.script.ScriptEngineService>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<org.elasticsearch.script.ScriptEngineService>) scriptEngineServiceSet69, scriptEngineServiceArray68);
        org.elasticsearch.watcher.ResourceWatcherService resourceWatcherService71 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.script.ScriptService scriptService72 = new org.elasticsearch.script.ScriptService(settings6, environment67, (java.util.Set<org.elasticsearch.script.ScriptEngineService>) scriptEngineServiceSet69, resourceWatcherService71);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(riverSettings1);
        org.junit.Assert.assertNotNull(riverSettings2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_river" + "'", str3, "_river");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb-1638820218387" + "'", str4, "mongodb-1638820218387");
        org.junit.Assert.assertNotNull(riverSettings5);
        org.junit.Assert.assertNotNull(settings6);
        org.junit.Assert.assertNull(strSet9);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1000 + "'", int43 == 1000);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(basicDBObject45);
        org.junit.Assert.assertNotNull(riverSettings49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "mongodb-1638820218299" + "'", str50, "mongodb-1638820218299");
        org.junit.Assert.assertNotNull(riverSettings51);
        org.junit.Assert.assertNotNull(riverSettings52);
        org.junit.Assert.assertNotNull(settings53);
        org.junit.Assert.assertNotNull(riverSettings57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "_river" + "'", str58, "_river");
        org.junit.Assert.assertNotNull(riverSettings59);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1000 + "'", int62 == 1000);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "bulk_size" + "'", str63, "bulk_size");
        org.junit.Assert.assertNotNull(basicDBObject64);
        org.junit.Assert.assertNotNull(scriptEngineServiceArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.includeCollection("mongodb-1638820218299");
        builder10.dropCollection = false;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder10.statisticsIndexName("exclude_fields");
        builder16.setmongoUseSSL(true);
        java.lang.String str19 = builder16.mongoLocalPassword;
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("concurrent_bulk_requests");
        java.lang.String str11 = builder10.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder10);
        java.lang.String str13 = mongoDBRiverDefinition12.getNAME_FIELD();
        com.mongodb.BasicDBObject basicDBObject14 = mongoDBRiverDefinition12.getMongoOplogFilter();
        java.lang.String str15 = mongoDBRiverDefinition12.scriptType;
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "name" + "'", str13, "name");
        org.junit.Assert.assertNull(basicDBObject14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString18();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString14();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString3();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_river" + "'", str1, "_river");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_river" + "'", str2, "_river");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "mongodb-1638820218264" + "'", str3, "mongodb-1638820218264");
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.mongoDb;
        java.lang.String str3 = mongoDBRiverDefinition1.getADMIN_DB_FIELD();
        int int4 = mongoDBRiverDefinition1.throttleSize;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        com.mongodb.ServerAddress[] serverAddressArray9 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList10 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList10, serverAddressArray9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.isMongos((java.lang.Boolean) true);
        boolean boolean15 = builder12.getadvancedTransformation();
        builder12.setmongoSSLVerifyCertificate(true);
        boolean boolean18 = builder12.getmongoSecondaryReadPreference();
        builder12.mongoAdminPassword = "mongodb-1638820218363";
        builder12.setimportAllCollections(true);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(serverAddressArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.mongoDb;
        java.lang.String str3 = mongoDBRiverDefinition1.getCONCURRENT_BULK_REQUESTS_FIELD();
        int int4 = mongoDBRiverDefinition1.throttleSize;
        boolean boolean5 = mongoDBRiverDefinition1.getskipInitialImport();
        java.lang.String str6 = mongoDBRiverDefinition1.getScriptType();
        java.lang.String str7 = mongoDBRiverDefinition1.getSIZE_FIELD();
        java.lang.String str8 = mongoDBRiverDefinition1.statisticsIndexName;
        java.lang.String str9 = mongoDBRiverDefinition1.getMongoLocalUser();
        java.lang.String str10 = mongoDBRiverDefinition1.statisticsIndexName;
        int int11 = mongoDBRiverDefinition1.socketTimeout;
        java.lang.Class<?> wildcardClass12 = mongoDBRiverDefinition1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "concurrent_bulk_requests" + "'", str3, "concurrent_bulk_requests");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "size" + "'", str7, "size");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.mongoDb;
        java.lang.String str3 = mongoDBRiverDefinition1.getCONCURRENT_BULK_REQUESTS_FIELD();
        int int4 = mongoDBRiverDefinition1.throttleSize;
        boolean boolean5 = mongoDBRiverDefinition1.getskipInitialImport();
        com.mongodb.BasicDBObject basicDBObject6 = mongoDBRiverDefinition1.getMongoCollectionFilter();
        java.lang.String str7 = mongoDBRiverDefinition1.script;
        java.lang.String str8 = mongoDBRiverDefinition1.getSIZE_FIELD();
        java.lang.Boolean boolean9 = mongoDBRiverDefinition1.isMongos();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "concurrent_bulk_requests" + "'", str3, "concurrent_bulk_requests");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(basicDBObject6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "size" + "'", str8, "size");
        org.junit.Assert.assertNull(boolean9);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.mongoDb;
        int int3 = mongoDBRiverDefinition1.throttleSize;
        int int4 = mongoDBRiverDefinition1.getDEFAULT_BULK_ACTIONS();
        boolean boolean5 = mongoDBRiverDefinition1.mongoUseSSL;
        java.lang.String str6 = mongoDBRiverDefinition1.getBULK_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition1.statisticsIndexName;
        boolean boolean8 = mongoDBRiverDefinition1.getmongoUseSSL();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1000 + "'", int4 == 1000);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "bulk" + "'", str6, "bulk");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.includeCollection("mongodb-1638820218299");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder12);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder12.statisticsTypeName("socket_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder15);
        java.lang.String str17 = mongoDBRiverDefinition16.getEXCLUDE_FIELDS_FIELD();
        java.lang.String str18 = mongoDBRiverDefinition16.getACTIONS_FIELD();
        java.lang.String str19 = mongoDBRiverDefinition16.getLOCAL_DB_FIELD();
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "exclude_fields" + "'", str17, "exclude_fields");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "actions" + "'", str18, "actions");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "local" + "'", str19, "local");
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        builder0.socketTimeout = (short) 0;
        boolean boolean7 = builder0.storeStatistics;
        builder0.scriptType = "mongodb-1638820218299";
        java.lang.String[] strArray11 = new java.lang.String[] { "mongodb-1638820218299" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder0.excludeFields((java.util.Set<java.lang.String>) strSet12);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.mongoAdminUser("host");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.mongoDb("localhost");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter21 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings22 = serializedObjectSupporter21.deserializeObjectRiverSettings3();
        java.lang.String str23 = serializedObjectSupporter21.deserializeObjectString8();
        org.elasticsearch.river.RiverSettings riverSettings24 = serializedObjectSupporter21.deserializeObjectRiverSettings6();
        org.elasticsearch.script.ScriptService scriptService25 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition26 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("size", "credentials", riverSettings24, scriptService25);
        int int27 = mongoDBRiverDefinition26.getDEFAULT_BULK_ACTIONS();
        java.lang.String str28 = mongoDBRiverDefinition26.getBULK_SIZE_FIELD();
        com.mongodb.BasicDBObject basicDBObject29 = mongoDBRiverDefinition26.mongoCollectionFilter;
        builder18.mongoOplogFilter = basicDBObject29;
        boolean boolean31 = builder18.skipInitialImport;
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(riverSettings22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "_river" + "'", str23, "_river");
        org.junit.Assert.assertNotNull(riverSettings24);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1000 + "'", int27 == 1000);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "bulk_size" + "'", str28, "bulk_size");
        org.junit.Assert.assertNotNull(basicDBObject29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.mongoDb;
        int int3 = mongoDBRiverDefinition1.getDEFAULT_BULK_ACTIONS();
        java.lang.String str4 = mongoDBRiverDefinition1.getPASSWORD_FIELD();
        boolean boolean5 = mongoDBRiverDefinition1.dropCollection;
        java.lang.String str6 = mongoDBRiverDefinition1.getINITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition1.getADVANCED_TRANSFORMATION_FIELD();
        boolean boolean8 = mongoDBRiverDefinition1.isMongoGridFS();
        java.lang.String str9 = mongoDBRiverDefinition1.getOPTIONS_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition1.indexName;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1000 + "'", int3 == 1000);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "password" + "'", str4, "password");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "script_type" + "'", str6, "script_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "advanced_transformation" + "'", str7, "advanced_transformation");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "options" + "'", str9, "options");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        builder0.socketTimeout = (short) 0;
        boolean boolean7 = builder0.storeStatistics;
        builder0.scriptType = "mongodb-1638820218299";
        java.lang.String[] strArray11 = new java.lang.String[] { "mongodb-1638820218299" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder0.excludeFields((java.util.Set<java.lang.String>) strSet12);
        boolean boolean15 = builder14.getstoreStatistics();
        builder14.setconnectTimeout((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.includeCollection("mongodb-1638820218299");
        builder10.setmongoDb("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder10.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.isMongos((java.lang.Boolean) false);
        builder16.mongoSSLVerifyCertificate = false;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder21);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition23 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder21);
        builder21.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder21.mongoSecondaryReadPreference(true);
        builder21.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder21.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder31.includeCollection("mongodb-1638820218299");
        int int34 = builder31.connectTimeout;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition36 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder35);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition37 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder35);
        builder35.mongoAdminPassword = "";
        builder35.socketTimeout = (short) 0;
        boolean boolean42 = builder35.storeStatistics;
        builder35.scriptType = "mongodb-1638820218299";
        java.lang.String[] strArray46 = new java.lang.String[] { "mongodb-1638820218299" };
        java.util.LinkedHashSet<java.lang.String> strSet47 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet47, strArray46);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder35.excludeFields((java.util.Set<java.lang.String>) strSet47);
        builder31.setincludeFields((java.util.Set<java.lang.String>) strSet47);
        builder16.includeFields = strSet47;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder16.mongoLocalUser("disable_index_refresh");
        com.mongodb.MongoClientOptions mongoClientOptions54 = null;
        builder16.setmongoClientOptions(mongoClientOptions54);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder16.disableIndexRefresh(false);
        java.lang.String str58 = builder16.indexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition60 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder59);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition61 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder59);
        builder59.mongoAdminPassword = "";
        builder59.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder67 = builder59.importAllCollections(true);
        builder59.statisticsTypeName = "collection";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder70 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition71 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder70);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition72 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder70);
        builder70.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder76 = builder70.mongoSecondaryReadPreference(true);
        builder70.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder80 = builder70.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder82 = builder80.includeCollection("mongodb-1638820218299");
        builder80.setmongoDb("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder86 = builder80.mongoUseSSL(false);
        com.mongodb.BasicDBObject basicDBObject87 = builder80.mongoCollectionFilter;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition88 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder80);
        java.util.List<com.mongodb.ServerAddress> serverAddressList89 = mongoDBRiverDefinition88.getMongoServers();
        builder59.mongoServers = serverAddressList89;
        builder16.mongoServers = serverAddressList89;
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(builder76);
        org.junit.Assert.assertNotNull(builder80);
        org.junit.Assert.assertNotNull(builder82);
        org.junit.Assert.assertNotNull(builder86);
        org.junit.Assert.assertNotNull(basicDBObject87);
        org.junit.Assert.assertNotNull(serverAddressList89);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings1 = serializedObjectSupporter0.deserializeObjectRiverSettings3();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        org.elasticsearch.river.RiverSettings riverSettings3 = serializedObjectSupporter0.deserializeObjectRiverSettings1();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString5();
        org.junit.Assert.assertNotNull(riverSettings1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mongodb-1638820218299" + "'", str2, "mongodb-1638820218299");
        org.junit.Assert.assertNotNull(riverSettings3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb-1638820218299" + "'", str4, "mongodb-1638820218299");
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        builder0.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.importAllCollections(true);
        java.lang.String str9 = builder8.getmongoAdminPassword();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder8.mongoLocalPassword("");
        boolean boolean12 = builder8.dropCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        builder8.connectTimeout = (byte) 10;
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.mongoDb;
        int int3 = mongoDBRiverDefinition1.throttleSize;
        int int4 = mongoDBRiverDefinition1.getDEFAULT_BULK_ACTIONS();
        boolean boolean5 = mongoDBRiverDefinition1.mongoUseSSL;
        java.lang.String str6 = mongoDBRiverDefinition1.getBULK_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition1.getSCRIPT_TYPE_FIELD();
        boolean boolean8 = mongoDBRiverDefinition1.mongoUseSSL;
        boolean boolean9 = mongoDBRiverDefinition1.isImportAllCollections();
        boolean boolean10 = mongoDBRiverDefinition1.getmongoUseSSL();
        boolean boolean11 = mongoDBRiverDefinition1.getmongoSSLVerifyCertificate();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1000 + "'", int4 == 1000);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "bulk" + "'", str6, "bulk");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "script_type" + "'", str7, "script_type");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        builder0.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.importAllCollections(true);
        builder8.setincludeCollection("mongodb-1638820218299");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder8.throttleSize((int) ' ');
        int int13 = builder12.throttleSize;
        builder12.storeStatistics = false;
        java.lang.String str16 = builder12.getmongoLocalPassword();
        boolean boolean17 = builder12.getmongoUseSSL();
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        builder0.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.importAllCollections(true);
        java.lang.String str9 = builder8.getmongoAdminPassword();
        java.lang.String str10 = builder8.statisticsTypeName;
        boolean boolean11 = builder8.getdisableIndexRefresh();
        builder8.mongoAdminPassword = "name";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str15 = mongoDBRiverDefinition14.getDEFAULT_DB_HOST();
        java.util.Set<java.lang.String> strSet16 = mongoDBRiverDefinition14.getExcludeFields();
        java.lang.String str17 = mongoDBRiverDefinition14.statisticsTypeName;
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "localhost" + "'", str15, "localhost");
        org.junit.Assert.assertNull(strSet16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        builder0.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.importAllCollections(true);
        java.lang.String str9 = builder8.getmongoAdminPassword();
        java.lang.String str10 = builder8.statisticsTypeName;
        builder8.socketTimeout = (short) 1;
        org.bson.types.BSONTimestamp bSONTimestamp13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder8.initialTimestamp(bSONTimestamp13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ts must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = builder10.initialTimestamp;
        com.mongodb.MongoClientOptions mongoClientOptions12 = null;
        builder10.mongoClientOptions = mongoClientOptions12;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder10.mongoCollection("");
        boolean boolean16 = builder15.mongoSSLVerifyCertificate;
        boolean boolean17 = builder15.mongoUseSSL;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder15.advancedTransformation(true);
        builder15.indexName = "import_all_collections";
        java.lang.Boolean boolean22 = builder15.getisMongos();
        builder15.setmongoDb("mongodb-1638820218408");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNull(boolean22);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.riverName = "include_collection";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder0.connectTimeout((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder0.mongoUseSSL(true);
        java.lang.String str8 = builder7.getindexName();
        boolean boolean9 = builder7.getmongoSSLVerifyCertificate();
        builder7.importAllCollections = true;
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.includeCollection("mongodb-1638820218299");
        builder10.dropCollection = false;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder10.statisticsIndexName("exclude_fields");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter19 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings20 = serializedObjectSupporter19.deserializeObjectRiverSettings3();
        java.lang.String str21 = serializedObjectSupporter19.deserializeObjectString8();
        org.elasticsearch.river.RiverSettings riverSettings22 = serializedObjectSupporter19.deserializeObjectRiverSettings6();
        org.elasticsearch.script.ScriptService scriptService23 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition24 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("size", "credentials", riverSettings22, scriptService23);
        int int25 = mongoDBRiverDefinition24.getDEFAULT_BULK_ACTIONS();
        java.lang.String str26 = mongoDBRiverDefinition24.getBULK_SIZE_FIELD();
        com.mongodb.BasicDBObject basicDBObject27 = mongoDBRiverDefinition24.mongoCollectionFilter;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder10.mongoCollectionFilter(basicDBObject27);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition29 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder10);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(riverSettings20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "_river" + "'", str21, "_river");
        org.junit.Assert.assertNotNull(riverSettings22);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1000 + "'", int25 == 1000);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "bulk_size" + "'", str26, "bulk_size");
        org.junit.Assert.assertNotNull(basicDBObject27);
        org.junit.Assert.assertNotNull(builder28);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.includeCollection("mongodb-1638820218299");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder12);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder12.statisticsTypeName("socket_timeout");
        java.util.Set<java.lang.String> strSet16 = builder12.getincludeFields();
        builder12.setriverIndexName("is_mongos");
        int int19 = builder12.socketTimeout;
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNull(strSet16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 60000);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter4 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings5 = serializedObjectSupporter4.deserializeObjectRiverSettings3();
        java.lang.String str6 = serializedObjectSupporter4.deserializeObjectString5();
        java.lang.String str7 = serializedObjectSupporter4.deserializeObjectString14();
        java.lang.String str8 = serializedObjectSupporter4.deserializeObjectString8();
        docScoreSearchScript0.setNextVar("mongodb-1638820218424", (java.lang.Object) str8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder10);
        builder10.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder10.mongoSecondaryReadPreference(true);
        builder10.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder10.mongoDb("concurrent_bulk_requests");
        com.mongodb.BasicDBObject basicDBObject21 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.mongoCollectionFilter(basicDBObject21);
        builder22.mongoAdminPassword = "mongodb-1638820218299";
        java.lang.String str25 = builder22.getmongoLocalPassword();
        boolean boolean26 = builder22.getskipInitialImport();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder27);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition29 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder27);
        builder27.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder27.mongoSecondaryReadPreference(true);
        builder27.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder27.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder37.includeCollection("mongodb-1638820218299");
        builder37.setmongoDb("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder37.mongoUseSSL(false);
        java.lang.String str44 = builder37.getindexName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder37.mongoAdminUser("localhost");
        builder46.settypeName("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition50 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder49);
        java.util.Set<java.lang.String> strSet51 = builder49.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition53 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder52);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition54 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder52);
        builder52.mongoAdminPassword = "";
        builder52.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder52.importAllCollections(true);
        java.lang.String str61 = builder60.getmongoAdminPassword();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = builder60.mongoLocalPassword("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder64 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition65 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder64);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition66 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder64);
        builder64.mongoAdminPassword = "";
        builder64.socketTimeout = (short) 0;
        boolean boolean71 = builder64.storeStatistics;
        builder64.scriptType = "mongodb-1638820218299";
        java.lang.String[] strArray75 = new java.lang.String[] { "mongodb-1638820218299" };
        java.util.LinkedHashSet<java.lang.String> strSet76 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet76, strArray75);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder78 = builder64.excludeFields((java.util.Set<java.lang.String>) strSet76);
        builder60.setexcludeFields((java.util.Set<java.lang.String>) strSet76);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder80 = builder49.parentTypes((java.util.Set<java.lang.String>) strSet76);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder81 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition82 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder81);
        java.lang.String str83 = mongoDBRiverDefinition82.mongoDb;
        int int84 = mongoDBRiverDefinition82.throttleSize;
        int int85 = mongoDBRiverDefinition82.getDEFAULT_BULK_ACTIONS();
        java.lang.String str86 = mongoDBRiverDefinition82.getMongoLocalPassword();
        com.mongodb.BasicDBObject basicDBObject87 = mongoDBRiverDefinition82.mongoCollectionFilter;
        builder80.setmongoOplogFilter(basicDBObject87);
        builder46.setmongoOplogFilter(basicDBObject87);
        builder22.mongoOplogFilter = basicDBObject87;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject87);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(riverSettings5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "mongodb-1638820218299" + "'", str6, "mongodb-1638820218299");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_river" + "'", str7, "_river");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_river" + "'", str8, "_river");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNull(strSet51);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(builder78);
        org.junit.Assert.assertNotNull(builder80);
        org.junit.Assert.assertNull(str83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 1000 + "'", int85 == 1000);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertNotNull(basicDBObject87);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        builder0.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.importAllCollections(true);
        java.lang.String str9 = builder8.getmongoAdminPassword();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder8.mongoLocalPassword("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder8.scriptType("script_type");
        builder13.isMongos = true;
        java.lang.String str16 = builder13.riverName;
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.mongoDb;
        int int3 = mongoDBRiverDefinition1.getDEFAULT_BULK_ACTIONS();
        java.lang.String str4 = mongoDBRiverDefinition1.getPASSWORD_FIELD();
        boolean boolean5 = mongoDBRiverDefinition1.mongoSSLVerifyCertificate;
        java.lang.String str6 = mongoDBRiverDefinition1.getLOCAL_DB_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition1.mongoAdminUser;
        boolean boolean8 = mongoDBRiverDefinition1.skipInitialImport;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1000 + "'", int3 == 1000);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "password" + "'", str4, "password");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "local" + "'", str6, "local");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.mongoDb;
        int int3 = mongoDBRiverDefinition1.throttleSize;
        int int4 = mongoDBRiverDefinition1.getDEFAULT_BULK_ACTIONS();
        boolean boolean5 = mongoDBRiverDefinition1.mongoUseSSL;
        java.lang.String str6 = mongoDBRiverDefinition1.getCREDENTIALS_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition1.getADVANCED_TRANSFORMATION_FIELD();
        boolean boolean8 = mongoDBRiverDefinition1.skipInitialImport;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1000 + "'", int4 == 1000);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "credentials" + "'", str6, "credentials");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "advanced_transformation" + "'", str7, "advanced_transformation");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        builder0.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.importAllCollections(true);
        java.lang.String str9 = builder8.getmongoAdminPassword();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder8.mongoLocalPassword("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.mongoLocalPassword("import_all_collections");
        builder11.mongoSSLVerifyCertificate = false;
        builder11.mongoSSLVerifyCertificate = true;
        int int18 = builder11.throttleSize;
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        builder0.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.importAllCollections(true);
        java.lang.String str9 = builder8.getmongoAdminPassword();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder8.mongoLocalPassword("");
        java.lang.String str12 = builder8.getstatisticsTypeName();
        builder8.scriptType = "mongodb-1638820218387";
        builder8.storeStatistics = true;
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.mongoDb;
        java.lang.String str3 = mongoDBRiverDefinition1.getSERVERS_FIELD();
        boolean boolean4 = mongoDBRiverDefinition1.mongoSecondaryReadPreference;
        java.lang.String str5 = mongoDBRiverDefinition1.getTHROTTLE_SIZE_FIELD();
        boolean boolean6 = mongoDBRiverDefinition1.getimportAllCollections();
        java.lang.String str7 = mongoDBRiverDefinition1.getBULK_SIZE_FIELD();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "servers" + "'", str3, "servers");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "throttle_size" + "'", str5, "throttle_size");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "bulk_size" + "'", str7, "bulk_size");
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.setmongoUseSSL(false);
        java.lang.String str9 = builder0.includeCollection;
        java.lang.String[] strArray44 = new java.lang.String[] { "credentials", "bulk_timeout", "mongodb-1638820218326", "localhost", "host", "bulk", "hi!", "bulk_size", "is_mongos", "script_type", "import_all_collections", "host", "ssl", "exclude_fields", "concurrent_bulk_requests", "advanced_transformation", "mongodb-1638820218326", "null.null", "filter", "host", "gridfs", "mongodb-1638820218326", "include_fields", "mongodb-1638820218387", ".scripts", "null.null", "", "ssl_verify_certificate", "name", "null.null", "bulk_timeout", "advanced_transformation", "throttle_size", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet45 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet45, strArray44);
        builder0.excludeFields = strSet45;
        builder0.indexName = "actions";
        builder0.statisticsTypeName = "mongodb-1638820218363";
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
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
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.mongoDb;
        int int3 = mongoDBRiverDefinition1.getDEFAULT_BULK_ACTIONS();
        java.lang.String str4 = mongoDBRiverDefinition1.getPASSWORD_FIELD();
        boolean boolean5 = mongoDBRiverDefinition1.dropCollection;
        java.lang.String str6 = mongoDBRiverDefinition1.getINITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition1.getINITIAL_TIMESTAMP_SCRIPT_FIELD();
        int int8 = mongoDBRiverDefinition1.socketTimeout;
        boolean boolean9 = mongoDBRiverDefinition1.mongoSecondaryReadPreference;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1000 + "'", int3 == 1000);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "password" + "'", str4, "password");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "script_type" + "'", str6, "script_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "script" + "'", str7, "script");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        builder0.socketTimeout = (short) 0;
        boolean boolean7 = builder0.storeStatistics;
        builder0.scriptType = "mongodb-1638820218299";
        java.lang.String[] strArray11 = new java.lang.String[] { "mongodb-1638820218299" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder0.excludeFields((java.util.Set<java.lang.String>) strSet12);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.mongoAdminUser("host");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder14.mongoGridFS(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder14);
        builder14.mongoGridFS = true;
        boolean boolean22 = builder14.getadvancedTransformation();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        builder0.setmongoAdminUser("collection");
        java.util.Set<java.lang.String> strSet11 = builder0.getincludeFields();
        builder0.setincludeCollection("actions");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str15 = builder0.mongoAdminPassword;
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(strSet11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.includeCollection("mongodb-1638820218299");
        java.lang.String str13 = builder10.getstatisticsIndexName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder10.advancedTransformation(true);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.includeCollection("mongodb-1638820218299");
        builder10.setmongoDb("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder10.mongoUseSSL(false);
        java.lang.String str17 = builder10.getindexName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder10.mongoAdminUser("localhost");
        builder19.settypeName("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition23 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder22);
        java.util.Set<java.lang.String> strSet24 = builder22.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition26 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder25);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder25);
        builder25.mongoAdminPassword = "";
        builder25.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder25.importAllCollections(true);
        java.lang.String str34 = builder33.getmongoAdminPassword();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder33.mongoLocalPassword("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition38 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder37);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition39 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder37);
        builder37.mongoAdminPassword = "";
        builder37.socketTimeout = (short) 0;
        boolean boolean44 = builder37.storeStatistics;
        builder37.scriptType = "mongodb-1638820218299";
        java.lang.String[] strArray48 = new java.lang.String[] { "mongodb-1638820218299" };
        java.util.LinkedHashSet<java.lang.String> strSet49 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet49, strArray48);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder37.excludeFields((java.util.Set<java.lang.String>) strSet49);
        builder33.setexcludeFields((java.util.Set<java.lang.String>) strSet49);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder22.parentTypes((java.util.Set<java.lang.String>) strSet49);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition55 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder54);
        java.lang.String str56 = mongoDBRiverDefinition55.mongoDb;
        int int57 = mongoDBRiverDefinition55.throttleSize;
        int int58 = mongoDBRiverDefinition55.getDEFAULT_BULK_ACTIONS();
        java.lang.String str59 = mongoDBRiverDefinition55.getMongoLocalPassword();
        com.mongodb.BasicDBObject basicDBObject60 = mongoDBRiverDefinition55.mongoCollectionFilter;
        builder53.setmongoOplogFilter(basicDBObject60);
        builder19.setmongoOplogFilter(basicDBObject60);
        java.lang.String str63 = builder19.getscript();
        builder19.riverIndexName = "host";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder67 = builder19.storeStatistics(false);
        java.util.Set<java.lang.String> strSet68 = builder19.getexcludeFields();
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNull(strSet24);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1000 + "'", int58 == 1000);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(basicDBObject60);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNull(strSet68);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        builder0.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.importAllCollections(true);
        java.lang.String str9 = builder8.getmongoAdminPassword();
        java.lang.String str10 = builder8.statisticsTypeName;
        boolean boolean11 = builder8.getdisableIndexRefresh();
        builder8.mongoAdminPassword = "name";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str15 = mongoDBRiverDefinition14.getDEFAULT_DB_HOST();
        java.util.Set<java.lang.String> strSet16 = mongoDBRiverDefinition14.getExcludeFields();
        boolean boolean17 = mongoDBRiverDefinition14.isAdvancedTransformation();
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "localhost" + "'", str15, "localhost");
        org.junit.Assert.assertNull(strSet16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder0.setmongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder0.advancedTransformation(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder4);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter6 = mongoDBRiverDefinition5.serializedObjectSupporter;
        java.util.List<com.mongodb.ServerAddress> serverAddressList7 = mongoDBRiverDefinition5.getMongoServers();
        java.lang.String str8 = mongoDBRiverDefinition5.getINITIAL_TIMESTAMP_SCRIPT_FIELD();
        java.util.Set<java.lang.String> strSet9 = mongoDBRiverDefinition5.excludeFields;
        java.util.List<com.mongodb.ServerAddress> serverAddressList10 = mongoDBRiverDefinition5.mongoServers;
        boolean boolean11 = mongoDBRiverDefinition5.getstoreStatistics();
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNull(serializedObjectSupporter6);
        org.junit.Assert.assertNotNull(serverAddressList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "script" + "'", str8, "script");
        org.junit.Assert.assertNull(strSet9);
        org.junit.Assert.assertNotNull(serverAddressList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.mongoDb;
        java.lang.String str3 = mongoDBRiverDefinition1.mongoAdminPassword;
        int int4 = mongoDBRiverDefinition1.getThrottleSize();
        java.lang.String str5 = mongoDBRiverDefinition1.mongoLocalUser;
        boolean boolean6 = mongoDBRiverDefinition1.getmongoUseSSL();
        boolean boolean7 = mongoDBRiverDefinition1.isMongoSecondaryReadPreference();
        java.util.Set<java.lang.String> strSet8 = mongoDBRiverDefinition1.includeFields;
        boolean boolean9 = mongoDBRiverDefinition1.getimportAllCollections();
        java.util.Set<java.lang.String> strSet10 = mongoDBRiverDefinition1.parentTypes;
        boolean boolean11 = mongoDBRiverDefinition1.getstoreStatistics();
        java.lang.String str12 = mongoDBRiverDefinition1.getMongoLocalPassword();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(strSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.mongoDb;
        java.lang.String str3 = mongoDBRiverDefinition1.getCONCURRENT_BULK_REQUESTS_FIELD();
        java.lang.String str4 = mongoDBRiverDefinition1.getMongoLocalUser();
        int int5 = mongoDBRiverDefinition1.getDEFAULT_DB_PORT();
        java.lang.String str6 = mongoDBRiverDefinition1.getADVANCED_TRANSFORMATION_FIELD();
        com.mongodb.BasicDBObject basicDBObject7 = mongoDBRiverDefinition1.mongoOplogFilter;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "concurrent_bulk_requests" + "'", str3, "concurrent_bulk_requests");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27017 + "'", int5 == 27017);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "advanced_transformation" + "'", str6, "advanced_transformation");
        org.junit.Assert.assertNull(basicDBObject7);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "local");
        java.lang.Object obj4 = null;
        docScoreSearchScript0.setNextVar("mongodb-1638820218299", obj4);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder6.script("filter");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder6.mongoGridFS(false);
        java.lang.String str12 = builder11.scriptType;
        builder11.scriptType = "ssl_verify_certificate";
        java.lang.Object obj15 = docScoreSearchScript0.unwrap((java.lang.Object) "ssl_verify_certificate");
        org.elasticsearch.common.ParseField parseField17 = org.elasticsearch.script.ScriptService.VALUE_SCRIPT_FILE;
        docScoreSearchScript0.setNextVar("", (java.lang.Object) parseField17);
        org.apache.lucene.search.Scorer scorer19 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setScorer(scorer19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "local" + "'", obj2, "local");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "ssl_verify_certificate" + "'", obj15, "ssl_verify_certificate");
        org.junit.Assert.assertNotNull(parseField17);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.includeCollection("mongodb-1638820218299");
        builder10.setmongoDb("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder10.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.isMongos((java.lang.Boolean) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder19);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder19);
        builder19.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder19.mongoSecondaryReadPreference(true);
        builder19.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder19.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp30 = builder29.initialTimestamp;
        com.mongodb.MongoClientOptions mongoClientOptions31 = null;
        builder29.setmongoClientOptions(mongoClientOptions31);
        java.lang.String[] strArray43 = new java.lang.String[] { "filter", "socket_timeout", "local", "admin", "include_collection", "hi!", "password", "socket_timeout", "hi!", "options" };
        java.util.LinkedHashSet<java.lang.String> strSet44 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet44, strArray43);
        builder29.excludeFields = strSet44;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder18.excludeFields((java.util.Set<java.lang.String>) strSet44);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder18.importAllCollections(true);
        java.lang.String str50 = builder49.getriverName();
        builder49.mongoCollection = "filter";
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNull(wildcardTimestamp30);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNull(str50);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        builder0.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.importAllCollections(true);
        java.lang.String str9 = builder8.getmongoAdminPassword();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder8.mongoLocalPassword("");
        boolean boolean12 = builder8.dropCollection;
        builder8.setstatisticsTypeName("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str16 = mongoDBRiverDefinition15.getIncludeCollection();
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        builder0.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.importAllCollections(true);
        java.lang.String str9 = builder8.getmongoAdminPassword();
        java.lang.String str10 = builder8.statisticsTypeName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder8.mongoGridFS(true);
        builder8.typeName = "mongodb-1638820218449";
        builder8.mongoAdminPassword = "drop_collection";
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.includeCollection("mongodb-1638820218299");
        builder10.setmongoDb("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder10.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.isMongos((java.lang.Boolean) false);
        builder16.mongoSSLVerifyCertificate = false;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder21);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition23 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder21);
        builder21.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder21.mongoSecondaryReadPreference(true);
        builder21.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder21.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder31.includeCollection("mongodb-1638820218299");
        int int34 = builder31.connectTimeout;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition36 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder35);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition37 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder35);
        builder35.mongoAdminPassword = "";
        builder35.socketTimeout = (short) 0;
        boolean boolean42 = builder35.storeStatistics;
        builder35.scriptType = "mongodb-1638820218299";
        java.lang.String[] strArray46 = new java.lang.String[] { "mongodb-1638820218299" };
        java.util.LinkedHashSet<java.lang.String> strSet47 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet47, strArray46);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder35.excludeFields((java.util.Set<java.lang.String>) strSet47);
        builder31.setincludeFields((java.util.Set<java.lang.String>) strSet47);
        builder16.includeFields = strSet47;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder16.mongoLocalUser("disable_index_refresh");
        com.mongodb.MongoClientOptions mongoClientOptions54 = null;
        builder16.setmongoClientOptions(mongoClientOptions54);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder16.disableIndexRefresh(false);
        int int58 = builder57.throttleSize;
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.mongoDb;
        java.lang.String str3 = mongoDBRiverDefinition1.getCONCURRENT_BULK_REQUESTS_FIELD();
        int int4 = mongoDBRiverDefinition1.throttleSize;
        boolean boolean5 = mongoDBRiverDefinition1.getskipInitialImport();
        java.lang.String str6 = mongoDBRiverDefinition1.getScriptType();
        java.lang.String str7 = mongoDBRiverDefinition1.getSIZE_FIELD();
        java.lang.String str8 = mongoDBRiverDefinition1.statisticsIndexName;
        java.lang.String str9 = mongoDBRiverDefinition1.getMongoLocalUser();
        java.lang.String str10 = mongoDBRiverDefinition1.statisticsIndexName;
        int int11 = mongoDBRiverDefinition1.socketTimeout;
        java.lang.String str12 = mongoDBRiverDefinition1.getINDEX_OBJECT();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "concurrent_bulk_requests" + "'", str3, "concurrent_bulk_requests");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "size" + "'", str7, "size");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "index" + "'", str12, "index");
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        com.mongodb.ServerAddress[] serverAddressArray9 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList10 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList10, serverAddressArray9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList10);
        builder0.setsocketTimeout(0);
        builder0.setdropCollection(true);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(serverAddressArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        builder0.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.importAllCollections(true);
        java.lang.String str9 = builder8.gettypeName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder8.scriptType("mongodb-1638820218408");
        builder8.setriverName("mongodb-1638820218264");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        builder0.socketTimeout = (short) 0;
        boolean boolean7 = builder0.storeStatistics;
        builder0.scriptType = "mongodb-1638820218299";
        java.lang.String[] strArray11 = new java.lang.String[] { "mongodb-1638820218299" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder0.excludeFields((java.util.Set<java.lang.String>) strSet12);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder15);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder15);
        builder15.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder15.mongoSecondaryReadPreference(true);
        builder15.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder15.mongoDb("concurrent_bulk_requests");
        java.lang.String str26 = builder25.statisticsIndexName;
        com.mongodb.BasicDBObject basicDBObject27 = builder25.getmongoOplogFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition29 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder28);
        java.lang.String str30 = mongoDBRiverDefinition29.mongoDb;
        java.lang.String str31 = mongoDBRiverDefinition29.getCONCURRENT_BULK_REQUESTS_FIELD();
        int int32 = mongoDBRiverDefinition29.throttleSize;
        boolean boolean33 = mongoDBRiverDefinition29.getskipInitialImport();
        java.lang.String str34 = mongoDBRiverDefinition29.getScriptType();
        com.mongodb.BasicDBObject basicDBObject35 = mongoDBRiverDefinition29.mongoCollectionFilter;
        builder25.mongoCollectionFilter = basicDBObject35;
        builder14.mongoCollectionFilter = basicDBObject35;
        com.mongodb.MongoClientOptions mongoClientOptions38 = null;
        builder14.mongoClientOptions = mongoClientOptions38;
        java.lang.String str40 = builder14.includeCollection;
        builder14.setmongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition44 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder43);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition45 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder43);
        builder43.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder43.mongoSecondaryReadPreference(true);
        builder43.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder43.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder53.includeCollection("mongodb-1638820218299");
        builder53.setmongoDb("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = builder53.mongoUseSSL(false);
        com.mongodb.BasicDBObject basicDBObject60 = builder53.mongoCollectionFilter;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = builder14.mongoOplogFilter(basicDBObject60);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory62 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition64 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder63);
        java.lang.String str65 = mongoDBRiverDefinition64.mongoDb;
        java.lang.String str66 = mongoDBRiverDefinition64.getCONCURRENT_BULK_REQUESTS_FIELD();
        int int67 = mongoDBRiverDefinition64.throttleSize;
        boolean boolean68 = mongoDBRiverDefinition64.getskipInitialImport();
        java.lang.String str69 = mongoDBRiverDefinition64.getScriptType();
        java.lang.String str70 = mongoDBRiverDefinition64.getSIZE_FIELD();
        java.lang.String str71 = mongoDBRiverDefinition64.statisticsIndexName;
        java.lang.String str72 = mongoDBRiverDefinition64.getMongoLocalUser();
        com.mongodb.BasicDBObject basicDBObject73 = mongoDBRiverDefinition64.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript74 = docScoreNativeScriptFactory62.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject73);
        builder61.mongoCollectionFilter = basicDBObject73;
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(basicDBObject27);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "concurrent_bulk_requests" + "'", str31, "concurrent_bulk_requests");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(basicDBObject35);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(basicDBObject60);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "concurrent_bulk_requests" + "'", str66, "concurrent_bulk_requests");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "size" + "'", str70, "size");
        org.junit.Assert.assertNull(str71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNotNull(basicDBObject73);
        org.junit.Assert.assertNotNull(executableScript74);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        com.mongodb.ServerAddress[] serverAddressArray9 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList10 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList10, serverAddressArray9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.isMongos((java.lang.Boolean) true);
        boolean boolean15 = builder12.getadvancedTransformation();
        builder12.setmongoSSLVerifyCertificate(true);
        boolean boolean18 = builder12.getmongoSecondaryReadPreference();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder12);
        java.lang.String str20 = builder12.getscriptType();
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(serverAddressArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        com.mongodb.ServerAddress[] serverAddressArray9 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList10 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList10, serverAddressArray9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.isMongos((java.lang.Boolean) true);
        boolean boolean15 = builder12.getadvancedTransformation();
        builder12.setmongoSSLVerifyCertificate(true);
        builder12.setmongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder20);
        java.lang.String str22 = mongoDBRiverDefinition21.mongoDb;
        java.lang.String str23 = mongoDBRiverDefinition21.getADMIN_DB_FIELD();
        boolean boolean24 = mongoDBRiverDefinition21.skipInitialImport;
        java.util.List<com.mongodb.ServerAddress> serverAddressList25 = mongoDBRiverDefinition21.mongoServers;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder12.mongoServers(serverAddressList25);
        java.lang.String str27 = builder12.getmongoDb();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder12.mongoAdminUser("skip_initial_import");
        java.lang.String str30 = builder12.getriverName();
        java.lang.String str31 = builder12.getstatisticsIndexName();
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(serverAddressArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "admin" + "'", str23, "admin");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(serverAddressList25);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        builder0.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.importAllCollections(true);
        java.lang.String str9 = builder0.mongoLocalUser;
        boolean boolean10 = builder0.getadvancedTransformation();
        builder0.socketTimeout = '4';
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder0.statisticsIndexName("host");
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("filter");
        boolean boolean4 = builder0.getskipInitialImport();
        builder0.setstoreStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder7);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder7);
        builder7.mongoAdminPassword = "";
        builder7.socketTimeout = (short) 0;
        boolean boolean14 = builder7.storeStatistics;
        builder7.scriptType = "mongodb-1638820218299";
        java.lang.String[] strArray18 = new java.lang.String[] { "mongodb-1638820218299" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder7.excludeFields((java.util.Set<java.lang.String>) strSet19);
        builder0.setparentTypes((java.util.Set<java.lang.String>) strSet19);
        java.lang.String str23 = builder0.getstatisticsTypeName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder0.mongoSecondaryReadPreference(false);
        boolean boolean26 = builder0.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder0.mongoLocalUser("filter");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.isMongos((java.lang.Boolean) true);
        java.lang.Class<?> wildcardClass31 = builder28.getClass();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        builder0.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.importAllCollections(true);
        java.lang.String str9 = builder0.mongoLocalUser;
        java.lang.Boolean boolean10 = builder0.getisMongos();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str12 = mongoDBRiverDefinition11.getSCRIPT_FIELD();
        java.lang.String str13 = mongoDBRiverDefinition11.getINITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD();
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "script" + "'", str12, "script");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "script_type" + "'", str13, "script_type");
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        builder0.socketTimeout = (short) 0;
        boolean boolean7 = builder0.storeStatistics;
        builder0.scriptType = "mongodb-1638820218299";
        java.lang.String[] strArray11 = new java.lang.String[] { "mongodb-1638820218299" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder0.excludeFields((java.util.Set<java.lang.String>) strSet12);
        java.lang.String str15 = builder0.scriptType;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter17 = mongoDBRiverDefinition16.serializedObjectSupporter;
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "mongodb-1638820218299" + "'", str15, "mongodb-1638820218299");
        org.junit.Assert.assertNull(serializedObjectSupporter17);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.riverName("concurrent_requests");
        builder0.setdropCollection(true);
        builder0.scriptType = "port";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder0.riverIndexName("mongodb-1638820218264");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter19 = builder18.serializedObjectSupporter;
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNull(serializedObjectSupporter19);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("filter");
        boolean boolean4 = builder0.getskipInitialImport();
        builder0.setstoreStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder7);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder7);
        builder7.mongoAdminPassword = "";
        builder7.socketTimeout = (short) 0;
        boolean boolean14 = builder7.storeStatistics;
        builder7.scriptType = "mongodb-1638820218299";
        java.lang.String[] strArray18 = new java.lang.String[] { "mongodb-1638820218299" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder7.excludeFields((java.util.Set<java.lang.String>) strSet19);
        builder0.setparentTypes((java.util.Set<java.lang.String>) strSet19);
        java.lang.String str23 = builder0.getstatisticsTypeName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder0.mongoSecondaryReadPreference(false);
        boolean boolean26 = builder0.mongoSSLVerifyCertificate;
        boolean boolean27 = builder0.disableIndexRefresh;
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("filter");
        boolean boolean4 = builder0.getskipInitialImport();
        builder0.setstoreStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder7);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder7);
        builder7.mongoAdminPassword = "";
        builder7.socketTimeout = (short) 0;
        boolean boolean14 = builder7.storeStatistics;
        builder7.scriptType = "mongodb-1638820218299";
        java.lang.String[] strArray18 = new java.lang.String[] { "mongodb-1638820218299" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder7.excludeFields((java.util.Set<java.lang.String>) strSet19);
        builder0.setparentTypes((java.util.Set<java.lang.String>) strSet19);
        java.lang.String str23 = builder0.statisticsTypeName;
        builder0.settypeName("localhost");
        org.bson.types.BSONTimestamp bSONTimestamp26 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder0.initialTimestamp(bSONTimestamp26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ts must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNull(str23);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.mongoDb;
        int int3 = mongoDBRiverDefinition1.getDEFAULT_BULK_ACTIONS();
        java.lang.String str4 = mongoDBRiverDefinition1.getPASSWORD_FIELD();
        boolean boolean5 = mongoDBRiverDefinition1.mongoSSLVerifyCertificate;
        java.lang.String str6 = mongoDBRiverDefinition1.getCONCURRENT_BULK_REQUESTS_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition1.getEXCLUDE_FIELDS_FIELD();
        java.lang.String str8 = mongoDBRiverDefinition1.getCOLLECTION_FIELD();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1000 + "'", int3 == 1000);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "password" + "'", str4, "password");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "concurrent_bulk_requests" + "'", str6, "concurrent_bulk_requests");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "exclude_fields" + "'", str7, "exclude_fields");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "collection" + "'", str8, "collection");
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.mongoDb;
        int int3 = mongoDBRiverDefinition1.getDEFAULT_BULK_ACTIONS();
        java.lang.String str4 = mongoDBRiverDefinition1.getPASSWORD_FIELD();
        boolean boolean5 = mongoDBRiverDefinition1.mongoSSLVerifyCertificate;
        java.lang.String str6 = mongoDBRiverDefinition1.getLOCAL_DB_FIELD();
        java.lang.String str7 = mongoDBRiverDefinition1.mongoAdminUser;
        boolean boolean8 = mongoDBRiverDefinition1.isMongoGridFS();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1000 + "'", int3 == 1000);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "password" + "'", str4, "password");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "local" + "'", str6, "local");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.riverName = "include_collection";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str5 = mongoDBRiverDefinition4.getINITIAL_TIMESTAMP_FIELD();
        java.lang.String str6 = mongoDBRiverDefinition4.typeName;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "initial_timestamp" + "'", str5, "initial_timestamp");
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.includeCollection("mongodb-1638820218299");
        int int13 = builder10.connectTimeout;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder10.statisticsIndexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.indexName("ssl_verify_certificate");
        builder17.indexName = "mongodb-1638820218264";
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp20 = builder17.initialTimestamp;
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNull(wildcardTimestamp20);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str1 = serializedObjectSupporter0.deserializeObjectString18();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString14();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString15();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString8();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString15();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_river" + "'", str1, "_river");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_river" + "'", str2, "_river");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "mongodb-1638820218424" + "'", str3, "mongodb-1638820218424");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_river" + "'", str4, "_river");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "mongodb-1638820218424" + "'", str5, "mongodb-1638820218424");
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.mongoDb;
        java.lang.String str3 = mongoDBRiverDefinition1.getCONCURRENT_BULK_REQUESTS_FIELD();
        int int4 = mongoDBRiverDefinition1.throttleSize;
        boolean boolean5 = mongoDBRiverDefinition1.getskipInitialImport();
        java.lang.String str6 = mongoDBRiverDefinition1.getScriptType();
        java.lang.String str7 = mongoDBRiverDefinition1.getSIZE_FIELD();
        boolean boolean8 = mongoDBRiverDefinition1.advancedTransformation;
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp9 = mongoDBRiverDefinition1.getInitialTimestamp();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "concurrent_bulk_requests" + "'", str3, "concurrent_bulk_requests");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "size" + "'", str7, "size");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(wildcardTimestamp9);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        builder0.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.importAllCollections(true);
        java.lang.String str9 = builder8.getmongoAdminPassword();
        builder8.setconnectTimeout((int) (short) 100);
        builder8.setmongoGridFS(false);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter14 = builder8.serializedObjectSupporter;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str16 = mongoDBRiverDefinition15.getBULK_FIELD();
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(serializedObjectSupporter14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "bulk" + "'", str16, "bulk");
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        com.mongodb.ServerAddress[] serverAddressArray9 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList10 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList10, serverAddressArray9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList10);
        int int13 = builder0.getconnectTimeout();
        java.lang.String str14 = builder0.getincludeCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder0.mongoLocalUser("mongodb-1638820218424");
        java.lang.String str17 = builder0.statisticsIndexName;
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(serverAddressArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "socket_timeout" + "'", str14, "socket_timeout");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.includeCollection("mongodb-1638820218299");
        builder10.mongoGridFS = true;
        boolean boolean15 = builder10.skipInitialImport;
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.includeCollection("mongodb-1638820218299");
        builder10.setmongoDb("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder10.mongoUseSSL(false);
        boolean boolean17 = builder16.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder16);
        java.lang.String str19 = mongoDBRiverDefinition18.getLOCAL_DB_FIELD();
        java.lang.Boolean boolean20 = mongoDBRiverDefinition18.isMongos();
        java.lang.String str21 = mongoDBRiverDefinition18.getPARENT_TYPES_FIELD();
        int int22 = mongoDBRiverDefinition18.getDEFAULT_CONNECT_TIMEOUT();
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "local" + "'", str19, "local");
        org.junit.Assert.assertNull(boolean20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "parent_types" + "'", str21, "parent_types");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 30000 + "'", int22 == 30000);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.mongoDb;
        java.lang.String str3 = mongoDBRiverDefinition1.getADMIN_DB_FIELD();
        boolean boolean4 = mongoDBRiverDefinition1.skipInitialImport;
        java.util.List<com.mongodb.ServerAddress> serverAddressList5 = mongoDBRiverDefinition1.mongoServers;
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter6 = mongoDBRiverDefinition1.serializedObjectSupporter;
        java.lang.String str7 = mongoDBRiverDefinition1.getBULK_FIELD();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "admin" + "'", str3, "admin");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(serverAddressList5);
        org.junit.Assert.assertNull(serializedObjectSupporter6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "bulk" + "'", str7, "bulk");
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        builder0.socketTimeout = (short) 0;
        boolean boolean7 = builder0.storeStatistics;
        builder0.scriptType = "mongodb-1638820218299";
        java.lang.String[] strArray11 = new java.lang.String[] { "mongodb-1638820218299" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder0.excludeFields((java.util.Set<java.lang.String>) strSet12);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder15);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder15);
        builder15.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder15.mongoSecondaryReadPreference(true);
        builder15.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder15.mongoDb("concurrent_bulk_requests");
        java.lang.String str26 = builder25.statisticsIndexName;
        com.mongodb.BasicDBObject basicDBObject27 = builder25.getmongoOplogFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition29 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder28);
        java.lang.String str30 = mongoDBRiverDefinition29.mongoDb;
        java.lang.String str31 = mongoDBRiverDefinition29.getCONCURRENT_BULK_REQUESTS_FIELD();
        int int32 = mongoDBRiverDefinition29.throttleSize;
        boolean boolean33 = mongoDBRiverDefinition29.getskipInitialImport();
        java.lang.String str34 = mongoDBRiverDefinition29.getScriptType();
        com.mongodb.BasicDBObject basicDBObject35 = mongoDBRiverDefinition29.mongoCollectionFilter;
        builder25.mongoCollectionFilter = basicDBObject35;
        builder14.mongoCollectionFilter = basicDBObject35;
        com.mongodb.MongoClientOptions mongoClientOptions38 = null;
        builder14.mongoClientOptions = mongoClientOptions38;
        java.lang.String str40 = builder14.includeCollection;
        builder14.setmongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition44 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder43);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition45 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder43);
        builder43.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder43.mongoSecondaryReadPreference(true);
        builder43.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder43.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder53.includeCollection("mongodb-1638820218299");
        builder53.setmongoDb("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = builder53.mongoUseSSL(false);
        com.mongodb.BasicDBObject basicDBObject60 = builder53.mongoCollectionFilter;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = builder14.mongoOplogFilter(basicDBObject60);
        builder61.setscriptType("mongodb-1638820218326");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(basicDBObject27);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "concurrent_bulk_requests" + "'", str31, "concurrent_bulk_requests");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(basicDBObject35);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(basicDBObject60);
        org.junit.Assert.assertNotNull(builder61);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings1 = serializedObjectSupporter0.deserializeObjectRiverSettings3();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString4();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        org.elasticsearch.river.RiverSettings riverSettings5 = serializedObjectSupporter0.deserializeObjectRiverSettings8();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = serializedObjectSupporter0.deserializeObjectComparator1();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String$CaseInsensitiveComparator cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(riverSettings1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mongodb-1638820218299" + "'", str2, "mongodb-1638820218299");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_river" + "'", str3, "_river");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "mongodb-1638820217755" + "'", str4, "mongodb-1638820217755");
        org.junit.Assert.assertNotNull(riverSettings5);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        builder0.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.importAllCollections(true);
        java.lang.String str9 = builder8.getmongoAdminPassword();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder8.mongoLocalPassword("");
        boolean boolean12 = builder11.dropCollection;
        builder11.mongoSSLVerifyCertificate = true;
        com.mongodb.MongoClientOptions mongoClientOptions15 = null;
        builder11.mongoClientOptions = mongoClientOptions15;
        java.lang.String str17 = builder11.getmongoAdminUser();
        java.lang.Boolean boolean18 = builder11.isMongos;
        builder11.setscript("disable_index_refresh");
        builder11.setriverIndexName("script.default_lang");
        builder11.storeStatistics = true;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder11.dropCollection(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder27);
        java.lang.String str29 = mongoDBRiverDefinition28.mongoDb;
        java.lang.String str30 = mongoDBRiverDefinition28.mongoAdminPassword;
        java.lang.String str31 = mongoDBRiverDefinition28.scriptType;
        java.util.List<com.mongodb.ServerAddress> serverAddressList32 = mongoDBRiverDefinition28.getMongoServers();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder26.mongoServers(serverAddressList32);
        com.mongodb.BasicDBObject basicDBObject34 = builder26.mongoOplogFilter;
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(boolean18);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(serverAddressList32);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNull(basicDBObject34);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        java.lang.String str2 = mongoDBRiverDefinition1.getScriptType();
        java.lang.String str3 = mongoDBRiverDefinition1.getStatisticsIndexName();
        boolean boolean4 = mongoDBRiverDefinition1.isSkipInitialImport();
        java.lang.String str5 = mongoDBRiverDefinition1.getSCRIPT_TYPE_FIELD();
        boolean boolean6 = mongoDBRiverDefinition1.isImportAllCollections();
        org.elasticsearch.common.unit.TimeValue timeValue7 = mongoDBRiverDefinition1.getDEFAULT_FLUSH_INTERVAL();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "script_type" + "'", str5, "script_type");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(timeValue7);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("", "store_statistics");
            org.junit.Assert.fail("Expected exception of type com.mongodb.util.JSONParseException; message: ?store_statistics?^");
        } catch (com.mongodb.util.JSONParseException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("initial_timestamp", "", true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = builder10.initialTimestamp;
        com.mongodb.MongoClientOptions mongoClientOptions12 = null;
        builder10.mongoClientOptions = mongoClientOptions12;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder10.mongoCollection("");
        boolean boolean16 = builder15.mongoSSLVerifyCertificate;
        boolean boolean17 = builder15.mongoUseSSL;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder15.advancedTransformation(true);
        builder15.indexName = "import_all_collections";
        java.lang.Boolean boolean22 = builder15.getisMongos();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition23 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder15);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder15.mongoAdminUser("initial_timestamp");
        builder25.storeStatistics = false;
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNull(boolean22);
        org.junit.Assert.assertNotNull(builder25);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = builder10.initialTimestamp;
        com.mongodb.MongoClientOptions mongoClientOptions12 = null;
        builder10.setmongoClientOptions(mongoClientOptions12);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder10);
        boolean boolean15 = builder10.disableIndexRefresh;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder10.connectTimeout((int) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder10);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNull(wildcardTimestamp11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        builder0.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder0.importAllCollections(true);
        java.lang.String str9 = builder8.getmongoAdminPassword();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder8.mongoLocalPassword("");
        builder8.setincludeCollection("is_mongos");
        builder8.isMongos = true;
        boolean boolean16 = builder8.dropCollection;
        java.util.Set<java.lang.String> strSet17 = builder8.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        int int19 = mongoDBRiverDefinition18.getDEFAULT_CONNECT_TIMEOUT();
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(strSet17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 30000 + "'", int19 == 30000);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.includeCollection("mongodb-1638820218299");
        int int13 = builder10.connectTimeout;
        java.lang.String str14 = builder10.getriverIndexName();
        boolean boolean15 = builder10.getdisableIndexRefresh();
        builder10.socketTimeout = ' ';
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("concurrent_bulk_requests");
        com.mongodb.BasicDBObject basicDBObject11 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoCollectionFilter(basicDBObject11);
        java.lang.Boolean boolean13 = builder10.isMongos;
        builder10.setdisableIndexRefresh(false);
        java.lang.String str16 = builder10.getriverIndexName();
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNull(boolean13);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder0.script("filter");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder3);
        boolean boolean5 = mongoDBRiverDefinition4.isSkipInitialImport();
        boolean boolean6 = mongoDBRiverDefinition4.dropCollection;
        java.lang.String str7 = mongoDBRiverDefinition4.getINDEX_OBJECT();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "index" + "'", str7, "index");
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("concurrent_bulk_requests");
        java.lang.String str11 = builder10.statisticsIndexName;
        com.mongodb.BasicDBObject basicDBObject12 = builder10.getmongoOplogFilter();
        builder10.mongoUseSSL = true;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder10);
        boolean boolean16 = builder10.dropCollection;
        java.lang.String str17 = builder10.scriptType;
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(basicDBObject12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.includeCollection("mongodb-1638820218299");
        builder10.setmongoDb("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder10.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.isMongos((java.lang.Boolean) false);
        builder16.mongoSSLVerifyCertificate = false;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder21);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition23 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder21);
        builder21.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder21.mongoSecondaryReadPreference(true);
        builder21.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder21.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder31.includeCollection("mongodb-1638820218299");
        int int34 = builder31.connectTimeout;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition36 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder35);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition37 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder35);
        builder35.mongoAdminPassword = "";
        builder35.socketTimeout = (short) 0;
        boolean boolean42 = builder35.storeStatistics;
        builder35.scriptType = "mongodb-1638820218299";
        java.lang.String[] strArray46 = new java.lang.String[] { "mongodb-1638820218299" };
        java.util.LinkedHashSet<java.lang.String> strSet47 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet47, strArray46);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder35.excludeFields((java.util.Set<java.lang.String>) strSet47);
        builder31.setincludeFields((java.util.Set<java.lang.String>) strSet47);
        builder16.includeFields = strSet47;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder16.mongoLocalUser("disable_index_refresh");
        org.bson.types.Binary binary54 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder16.initialTimestamp(binary54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder53);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "local");
        docScoreSearchScript0.setNextScore(1.0f);
        docScoreSearchScript0.setNextScore((float) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        builder8.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder8.mongoSecondaryReadPreference(true);
        builder8.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder8.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.includeCollection("mongodb-1638820218299");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder18.mongoAdminPassword("host");
        boolean boolean23 = builder22.mongoUseSSL;
        docScoreSearchScript0.setNextVar("socket_timeout", (java.lang.Object) boolean23);
        org.apache.lucene.index.AtomicReaderContext atomicReaderContext25 = null;
        // The following exception was thrown during execution in test generation
        try {
            docScoreSearchScript0.setNextReader(atomicReaderContext25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + obj2 + "' != '" + "local" + "'", obj2, "local");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.includeCollection("mongodb-1638820218299");
        builder10.setmongoDb("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder15);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder15);
        builder15.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder15.mongoSecondaryReadPreference(true);
        builder15.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder15.mongoDb("concurrent_bulk_requests");
        java.lang.String str26 = builder25.statisticsIndexName;
        com.mongodb.BasicDBObject basicDBObject27 = builder25.getmongoOplogFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition29 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder28);
        java.lang.String str30 = mongoDBRiverDefinition29.mongoDb;
        java.lang.String str31 = mongoDBRiverDefinition29.getCONCURRENT_BULK_REQUESTS_FIELD();
        int int32 = mongoDBRiverDefinition29.throttleSize;
        boolean boolean33 = mongoDBRiverDefinition29.getskipInitialImport();
        java.lang.String str34 = mongoDBRiverDefinition29.getScriptType();
        com.mongodb.BasicDBObject basicDBObject35 = mongoDBRiverDefinition29.mongoCollectionFilter;
        builder25.mongoCollectionFilter = basicDBObject35;
        builder10.mongoCollectionFilter = basicDBObject35;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder10.riverIndexName("mongodb-1638820218299");
        builder39.disableIndexRefresh = true;
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(basicDBObject27);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "concurrent_bulk_requests" + "'", str31, "concurrent_bulk_requests");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(basicDBObject35);
        org.junit.Assert.assertNotNull(builder39);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.includeCollection("mongodb-1638820218299");
        builder10.setmongoDb("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder10.mongoUseSSL(false);
        java.lang.String str17 = builder10.getindexName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder10.mongoAdminUser("localhost");
        builder19.settypeName("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition23 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder22);
        java.util.Set<java.lang.String> strSet24 = builder22.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition26 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder25);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder25);
        builder25.mongoAdminPassword = "";
        builder25.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder25.importAllCollections(true);
        java.lang.String str34 = builder33.getmongoAdminPassword();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder33.mongoLocalPassword("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition38 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder37);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition39 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder37);
        builder37.mongoAdminPassword = "";
        builder37.socketTimeout = (short) 0;
        boolean boolean44 = builder37.storeStatistics;
        builder37.scriptType = "mongodb-1638820218299";
        java.lang.String[] strArray48 = new java.lang.String[] { "mongodb-1638820218299" };
        java.util.LinkedHashSet<java.lang.String> strSet49 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet49, strArray48);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder37.excludeFields((java.util.Set<java.lang.String>) strSet49);
        builder33.setexcludeFields((java.util.Set<java.lang.String>) strSet49);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder22.parentTypes((java.util.Set<java.lang.String>) strSet49);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition55 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder54);
        java.lang.String str56 = mongoDBRiverDefinition55.mongoDb;
        int int57 = mongoDBRiverDefinition55.throttleSize;
        int int58 = mongoDBRiverDefinition55.getDEFAULT_BULK_ACTIONS();
        java.lang.String str59 = mongoDBRiverDefinition55.getMongoLocalPassword();
        com.mongodb.BasicDBObject basicDBObject60 = mongoDBRiverDefinition55.mongoCollectionFilter;
        builder53.setmongoOplogFilter(basicDBObject60);
        builder19.setmongoOplogFilter(basicDBObject60);
        java.lang.String str63 = builder19.getscript();
        builder19.riverIndexName = "host";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder67 = builder19.script("filter");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNull(strSet24);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1000 + "'", int58 == 1000);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(basicDBObject60);
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertNotNull(builder67);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        com.mongodb.ServerAddress[] serverAddressArray9 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList10 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList10, serverAddressArray9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder0.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList10);
        builder0.setriverIndexName("is_mongos");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(serverAddressArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder0.mongoDb("concurrent_bulk_requests");
        java.lang.String str11 = builder10.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder12);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder12);
        builder12.mongoAdminPassword = "";
        builder12.socketTimeout = (short) 0;
        boolean boolean19 = builder12.storeStatistics;
        builder12.scriptType = "mongodb-1638820218299";
        java.lang.String[] strArray23 = new java.lang.String[] { "mongodb-1638820218299" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder12.excludeFields((java.util.Set<java.lang.String>) strSet24);
        builder10.setparentTypes((java.util.Set<java.lang.String>) strSet24);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition28 = builder10.build();
        java.lang.String str29 = mongoDBRiverDefinition28.getGRIDFS_FIELD();
        java.lang.String str30 = mongoDBRiverDefinition28.getINCLUDE_FIELDS_FIELD();
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "gridfs" + "'", str29, "gridfs");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "include_fields" + "'", str30, "include_fields");
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder0 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder0);
        builder0.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder0.mongoSecondaryReadPreference(true);
        builder0.setmongoUseSSL(false);
        builder0.skipInitialImport = false;
        builder0.setisMongos((java.lang.Boolean) false);
        com.mongodb.BasicDBObject basicDBObject13 = builder0.getmongoOplogFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder0.typeName("type");
        builder0.statisticsTypeName = "";
        java.lang.String str18 = builder0.mongoAdminPassword;
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNull(basicDBObject13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.elasticsearch.common.settings.Settings settings0 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder1);
        builder1.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder1.mongoSecondaryReadPreference(true);
        builder1.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder1.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.includeCollection("mongodb-1638820218299");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder13);
        java.lang.String str15 = mongoDBRiverDefinition14.getSSL_VERIFY_CERT_FIELD();
        com.mongodb.BasicDBObject basicDBObject16 = mongoDBRiverDefinition14.mongoCollectionFilter;
        org.elasticsearch.river.RiverSettings riverSettings17 = new org.elasticsearch.river.RiverSettings(settings0, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject16);
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = riverSettings17.settings();
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ssl_verify_certificate" + "'", str15, "ssl_verify_certificate");
        org.junit.Assert.assertNotNull(basicDBObject16);
        org.junit.Assert.assertNotNull(strMap18);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter0 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings1 = serializedObjectSupporter0.deserializeObjectRiverSettings3();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString5();
        org.elasticsearch.river.RiverSettings riverSettings3 = serializedObjectSupporter0.deserializeObjectRiverSettings2();
        org.elasticsearch.river.RiverSettings riverSettings4 = serializedObjectSupporter0.deserializeObjectRiverSettings4();
        org.elasticsearch.common.settings.Settings settings5 = riverSettings4.globalSettings();
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter8 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings9 = serializedObjectSupporter8.deserializeObjectRiverSettings3();
        java.lang.String str10 = serializedObjectSupporter8.deserializeObjectString8();
        org.elasticsearch.river.RiverSettings riverSettings11 = serializedObjectSupporter8.deserializeObjectRiverSettings6();
        org.elasticsearch.script.ScriptService scriptService12 = null;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.parseSettings("size", "credentials", riverSettings11, scriptService12);
        int int14 = mongoDBRiverDefinition13.getDEFAULT_BULK_ACTIONS();
        java.lang.String str15 = mongoDBRiverDefinition13.getBULK_SIZE_FIELD();
        com.mongodb.BasicDBObject basicDBObject16 = mongoDBRiverDefinition13.mongoCollectionFilter;
        org.elasticsearch.river.RiverSettings riverSettings17 = new org.elasticsearch.river.RiverSettings(settings5, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject16);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder18);
        builder18.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder18.mongoSecondaryReadPreference(true);
        builder18.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder18.mongoDb("concurrent_bulk_requests");
        java.lang.String str29 = builder28.statisticsIndexName;
        com.mongodb.BasicDBObject basicDBObject30 = builder28.getmongoOplogFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition32 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder31);
        java.lang.String str33 = mongoDBRiverDefinition32.mongoDb;
        java.lang.String str34 = mongoDBRiverDefinition32.getCONCURRENT_BULK_REQUESTS_FIELD();
        int int35 = mongoDBRiverDefinition32.throttleSize;
        boolean boolean36 = mongoDBRiverDefinition32.getskipInitialImport();
        java.lang.String str37 = mongoDBRiverDefinition32.getScriptType();
        com.mongodb.BasicDBObject basicDBObject38 = mongoDBRiverDefinition32.mongoCollectionFilter;
        builder28.mongoCollectionFilter = basicDBObject38;
        org.elasticsearch.river.RiverSettings riverSettings40 = new org.elasticsearch.river.RiverSettings(settings5, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject38);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory41 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter42 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings43 = serializedObjectSupporter42.deserializeObjectRiverSettings3();
        org.elasticsearch.river.RiverSettings riverSettings44 = serializedObjectSupporter42.deserializeObjectRiverSettings2();
        java.lang.String str45 = serializedObjectSupporter42.deserializeObjectString6();
        java.lang.String str46 = serializedObjectSupporter42.deserializeObjectString11();
        org.elasticsearch.river.RiverSettings riverSettings47 = serializedObjectSupporter42.deserializeObjectRiverSettings6();
        org.elasticsearch.common.settings.Settings settings48 = riverSettings47.globalSettings();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition50 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder49);
        java.util.Set<java.lang.String> strSet51 = builder49.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition53 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder52);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition54 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder52);
        builder52.mongoAdminPassword = "";
        builder52.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder52.importAllCollections(true);
        java.lang.String str61 = builder60.getmongoAdminPassword();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = builder60.mongoLocalPassword("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder64 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition65 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder64);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition66 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder64);
        builder64.mongoAdminPassword = "";
        builder64.socketTimeout = (short) 0;
        boolean boolean71 = builder64.storeStatistics;
        builder64.scriptType = "mongodb-1638820218299";
        java.lang.String[] strArray75 = new java.lang.String[] { "mongodb-1638820218299" };
        java.util.LinkedHashSet<java.lang.String> strSet76 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet76, strArray75);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder78 = builder64.excludeFields((java.util.Set<java.lang.String>) strSet76);
        builder60.setexcludeFields((java.util.Set<java.lang.String>) strSet76);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder80 = builder49.parentTypes((java.util.Set<java.lang.String>) strSet76);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder81 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition82 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder81);
        java.lang.String str83 = mongoDBRiverDefinition82.mongoDb;
        int int84 = mongoDBRiverDefinition82.throttleSize;
        int int85 = mongoDBRiverDefinition82.getDEFAULT_BULK_ACTIONS();
        java.lang.String str86 = mongoDBRiverDefinition82.getMongoLocalPassword();
        com.mongodb.BasicDBObject basicDBObject87 = mongoDBRiverDefinition82.mongoCollectionFilter;
        builder80.setmongoOplogFilter(basicDBObject87);
        org.elasticsearch.river.RiverSettings riverSettings89 = new org.elasticsearch.river.RiverSettings(settings48, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject87);
        org.elasticsearch.script.ExecutableScript executableScript90 = docScoreNativeScriptFactory41.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject87);
        org.elasticsearch.river.RiverSettings riverSettings91 = new org.elasticsearch.river.RiverSettings(settings5, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject87);
        org.elasticsearch.env.Environment environment92 = null;
        org.elasticsearch.script.ScriptEngineService[] scriptEngineServiceArray93 = new org.elasticsearch.script.ScriptEngineService[] {};
        java.util.LinkedHashSet<org.elasticsearch.script.ScriptEngineService> scriptEngineServiceSet94 = new java.util.LinkedHashSet<org.elasticsearch.script.ScriptEngineService>();
        boolean boolean95 = java.util.Collections.addAll((java.util.Collection<org.elasticsearch.script.ScriptEngineService>) scriptEngineServiceSet94, scriptEngineServiceArray93);
        org.elasticsearch.watcher.ResourceWatcherService resourceWatcherService96 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.script.ScriptService scriptService97 = new org.elasticsearch.script.ScriptService(settings5, environment92, (java.util.Set<org.elasticsearch.script.ScriptEngineService>) scriptEngineServiceSet94, resourceWatcherService96);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(riverSettings1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mongodb-1638820218299" + "'", str2, "mongodb-1638820218299");
        org.junit.Assert.assertNotNull(riverSettings3);
        org.junit.Assert.assertNotNull(riverSettings4);
        org.junit.Assert.assertNotNull(settings5);
        org.junit.Assert.assertNotNull(riverSettings9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_river" + "'", str10, "_river");
        org.junit.Assert.assertNotNull(riverSettings11);
        org.junit.Assert.assertNotNull(mongoDBRiverDefinition13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1000 + "'", int14 == 1000);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "bulk_size" + "'", str15, "bulk_size");
        org.junit.Assert.assertNotNull(basicDBObject16);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(basicDBObject30);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "concurrent_bulk_requests" + "'", str34, "concurrent_bulk_requests");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(basicDBObject38);
        org.junit.Assert.assertNotNull(riverSettings43);
        org.junit.Assert.assertNotNull(riverSettings44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "_river" + "'", str45, "_river");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "mongodb-1638820218387" + "'", str46, "mongodb-1638820218387");
        org.junit.Assert.assertNotNull(riverSettings47);
        org.junit.Assert.assertNotNull(settings48);
        org.junit.Assert.assertNull(strSet51);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(builder78);
        org.junit.Assert.assertNotNull(builder80);
        org.junit.Assert.assertNull(str83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 1000 + "'", int85 == 1000);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertNotNull(basicDBObject87);
        org.junit.Assert.assertNotNull(executableScript90);
        org.junit.Assert.assertNotNull(scriptEngineServiceArray93);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }
}

