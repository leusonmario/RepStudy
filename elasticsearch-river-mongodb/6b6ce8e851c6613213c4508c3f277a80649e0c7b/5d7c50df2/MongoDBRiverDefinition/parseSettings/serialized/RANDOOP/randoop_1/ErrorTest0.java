import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("concurrent_requests", (java.lang.Object) (-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float4 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("concurrent_requests", (java.lang.Object) (-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double4 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj1 = docScoreSearchScript0.run();
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(10);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("concurrent_requests", (java.lang.Object) (-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj4 = docScoreSearchScript0.run();
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean2 = builder1.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder1.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder1.disableIndexRefresh(false);
        java.lang.Object obj7 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean9 = builder8.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder8.script("bulk");
        com.mongodb.BasicDBObject basicDBObject12 = builder11.getmongoCollectionFilter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject12);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("filter", (java.lang.Object) "gridfs");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj4 = docScoreSearchScript0.run();
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float1 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj18 = docScoreSearchScript0.run();
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float18 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean2 = builder1.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder1.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder1.disableIndexRefresh(false);
        java.lang.Object obj7 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double8 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(100);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = builder1.build();
        java.lang.String str3 = mongoDBRiverDefinition2.getINDEX_OBJECT();
        java.util.Set<java.lang.String> strSet4 = mongoDBRiverDefinition2.parentTypes;
        boolean boolean5 = mongoDBRiverDefinition2.isStoreStatistics();
        boolean boolean6 = mongoDBRiverDefinition2.importAllCollections;
        java.lang.String str7 = mongoDBRiverDefinition2.mongoAdminPassword;
        com.mongodb.BasicDBObject basicDBObject8 = mongoDBRiverDefinition2.getMongoCollectionFilter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject8);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("concurrent_requests", (java.lang.Object) (-1));
        docScoreSearchScript0.setNextVar("skip_initial_import", (java.lang.Object) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj7 = docScoreSearchScript0.run();
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("concurrent_requests", (java.lang.Object) (-1));
        docScoreSearchScript0.setNextVar("skip_initial_import", (java.lang.Object) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean9 = builder8.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder8.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder8.disableIndexRefresh(false);
        java.lang.String str14 = builder13.getstatisticsTypeName();
        builder13.setmongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder13.mongoLocalPassword("index");
        docScoreSearchScript0.setNextVar("local", (java.lang.Object) builder13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj20 = docScoreSearchScript0.run();
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("store_statistics", "mongodb-1638820218299");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) 'a');
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long1 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long20 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("concurrent_requests", (java.lang.Object) (-1));
        docScoreSearchScript0.setNextVar("skip_initial_import", (java.lang.Object) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean9 = builder8.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder8.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder8.disableIndexRefresh(false);
        java.lang.String str14 = builder13.getstatisticsTypeName();
        builder13.setmongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder13.mongoLocalPassword("index");
        docScoreSearchScript0.setNextVar("local", (java.lang.Object) builder13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double20 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean2 = builder1.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder1.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder1.disableIndexRefresh(false);
        java.lang.Object obj7 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(1000);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("disable_index_refresh", "gridfs");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double1 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("initial_timestamp", "size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean3 = builder2.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.script("bulk");
        builder2.riverName = "concurrent_bulk_requests";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder2.connectTimeout((int) (byte) 10);
        docScoreSearchScript0.setNextVar("port", (java.lang.Object) builder9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj11 = docScoreSearchScript0.run();
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("filter", (java.lang.Object) "gridfs");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = builder4.build();
        com.mongodb.BasicDBObject basicDBObject6 = builder4.getmongoCollectionFilter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject6);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float20 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218449", "flush_interval");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean2 = builder1.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder1.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder1.disableIndexRefresh(false);
        java.lang.Object obj7 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter8 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str9 = serializedObjectSupporter8.deserializeObjectString7();
        org.elasticsearch.river.RiverSettings riverSettings10 = serializedObjectSupporter8.deserializeObjectRiverSettings6();
        org.elasticsearch.common.settings.Settings settings11 = riverSettings10.globalSettings();
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory12 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter13 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str14 = serializedObjectSupporter13.deserializeObjectString4();
        org.elasticsearch.river.RiverSettings riverSettings15 = serializedObjectSupporter13.deserializeObjectRiverSettings3();
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = riverSettings15.settings();
        org.elasticsearch.script.ExecutableScript executableScript17 = docScoreNativeScriptFactory12.newScript(strMap16);
        org.elasticsearch.river.RiverSettings riverSettings18 = new org.elasticsearch.river.RiverSettings(settings11, strMap16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource(strMap16);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj22 = docScoreSearchScript0.run();
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean2 = builder1.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder1.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder1.disableIndexRefresh(false);
        java.lang.Object obj7 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (short) -1);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("concurrent_requests", (java.lang.Object) (-1));
        docScoreSearchScript0.setNextVar("skip_initial_import", (java.lang.Object) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float7 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long22 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("drop_collection", "ssl");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double17 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("concurrent_requests", (java.lang.Object) (-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (byte) -1);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("store_statistics", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean3 = builder2.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.script("bulk");
        builder2.riverName = "concurrent_bulk_requests";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder2.connectTimeout((int) (byte) 10);
        docScoreSearchScript0.setNextVar("port", (java.lang.Object) builder9);
        docScoreSearchScript0.setNextScore((float) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float13 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean2 = builder1.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder1.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder1.disableIndexRefresh(false);
        java.lang.Object obj7 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float8 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean3 = builder2.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.script("bulk");
        builder2.riverName = "concurrent_bulk_requests";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder2.connectTimeout((int) (byte) 10);
        docScoreSearchScript0.setNextVar("port", (java.lang.Object) builder9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (short) 0);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("advanced_transformation", "mongodb-1638820217755");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double22 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean3 = builder2.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.script("bulk");
        builder2.riverName = "concurrent_bulk_requests";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder2.connectTimeout((int) (byte) 10);
        docScoreSearchScript0.setNextVar("port", (java.lang.Object) builder9);
        docScoreSearchScript0.setNextScore((float) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj13 = docScoreSearchScript0.run();
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("socket_timeout", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218264", "collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("is_mongos", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long33 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (short) -1);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("throttle_size", "secondary_read_preference");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
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
        docScoreSearchScript0.setNextScore((float) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long19 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
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
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition23 = builder22.build();
        java.lang.String str24 = builder22.mongoLocalPassword;
        boolean boolean25 = builder22.getmongoSSLVerifyCertificate();
        java.lang.Object obj26 = docScoreSearchScript0.unwrap((java.lang.Object) boolean25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float27 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("filter", (java.lang.Object) "gridfs");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (short) -1);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double33 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (short) -1);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
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
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double35 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
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
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition23 = builder22.build();
        java.lang.String str24 = builder22.mongoLocalPassword;
        boolean boolean25 = builder22.getmongoSSLVerifyCertificate();
        java.lang.Object obj26 = docScoreSearchScript0.unwrap((java.lang.Object) boolean25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj27 = docScoreSearchScript0.run();
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("concurrent_requests", (java.lang.Object) (-1));
        docScoreSearchScript0.setNextVar("skip_initial_import", (java.lang.Object) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean9 = builder8.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder8.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder8.disableIndexRefresh(false);
        java.lang.String str14 = builder13.getstatisticsTypeName();
        builder13.setmongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder13.mongoLocalPassword("index");
        docScoreSearchScript0.setNextVar("local", (java.lang.Object) builder13);
        docScoreSearchScript0.setNextScore((float) 10L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long22 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (byte) -1);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((-1));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218449", "initial_timestamp");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("db", "script_type");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("parent_types", "socket_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
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
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter43 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str44 = serializedObjectSupporter43.deserializeObjectString4();
        org.elasticsearch.river.RiverSettings riverSettings45 = serializedObjectSupporter43.deserializeObjectRiverSettings3();
        java.lang.String str46 = serializedObjectSupporter43.deserializeObjectString10();
        java.lang.String str47 = serializedObjectSupporter43.deserializeObjectString16();
        java.lang.Object obj48 = docScoreSearchScript0.unwrap((java.lang.Object) str47);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(0);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("localhost", "advanced_transformation");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("connect_timeout", "mongodb-1638820218299");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean3 = builder2.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.script("bulk");
        builder2.riverName = "concurrent_bulk_requests";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder2.connectTimeout((int) (byte) 10);
        docScoreSearchScript0.setNextVar("port", (java.lang.Object) builder9);
        docScoreSearchScript0.setNextScore((float) 1);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter13 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.Object obj14 = docScoreSearchScript0.unwrap((java.lang.Object) serializedObjectSupporter13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double15 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("is_mongos", "bulk");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
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
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter43 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str44 = serializedObjectSupporter43.deserializeObjectString4();
        org.elasticsearch.river.RiverSettings riverSettings45 = serializedObjectSupporter43.deserializeObjectRiverSettings3();
        java.lang.String str46 = serializedObjectSupporter43.deserializeObjectString10();
        java.lang.String str47 = serializedObjectSupporter43.deserializeObjectString16();
        java.lang.Object obj48 = docScoreSearchScript0.unwrap((java.lang.Object) str47);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter50 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str51 = serializedObjectSupporter50.deserializeObjectString4();
        org.elasticsearch.river.RiverSettings riverSettings52 = serializedObjectSupporter50.deserializeObjectRiverSettings3();
        org.elasticsearch.river.RiverSettings riverSettings53 = serializedObjectSupporter50.deserializeObjectRiverSettings1();
        org.elasticsearch.river.RiverSettings riverSettings54 = serializedObjectSupporter50.deserializeObjectRiverSettings2();
        org.elasticsearch.river.RiverSettings riverSettings55 = serializedObjectSupporter50.deserializeObjectRiverSettings3();
        docScoreSearchScript0.setNextVar("size", (java.lang.Object) riverSettings55);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long57 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
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
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter43 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str44 = serializedObjectSupporter43.deserializeObjectString4();
        org.elasticsearch.river.RiverSettings riverSettings45 = serializedObjectSupporter43.deserializeObjectRiverSettings3();
        java.lang.String str46 = serializedObjectSupporter43.deserializeObjectString10();
        java.lang.String str47 = serializedObjectSupporter43.deserializeObjectString16();
        java.lang.Object obj48 = docScoreSearchScript0.unwrap((java.lang.Object) str47);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long49 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(0);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("concurrent_requests", (java.lang.Object) (-1));
        docScoreSearchScript0.setNextVar("skip_initial_import", (java.lang.Object) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean9 = builder8.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder8.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder8.disableIndexRefresh(false);
        java.lang.String str14 = builder13.getstatisticsTypeName();
        builder13.setmongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder13.mongoLocalPassword("index");
        docScoreSearchScript0.setNextVar("local", (java.lang.Object) builder13);
        docScoreSearchScript0.setNextScore((float) 10L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double22 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean3 = builder2.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.script("bulk");
        builder2.riverName = "concurrent_bulk_requests";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder2.connectTimeout((int) (byte) 10);
        docScoreSearchScript0.setNextVar("port", (java.lang.Object) builder9);
        docScoreSearchScript0.setNextScore((float) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float13 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
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
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory22 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean24 = builder23.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder23.script("bulk");
        com.mongodb.BasicDBObject basicDBObject27 = builder26.getmongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript28 = docScoreNativeScriptFactory22.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject27);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("null.null", "null.null");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
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
        docScoreSearchScript0.setNextScore((float) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj19 = docScoreSearchScript0.run();
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("concurrent_requests", (java.lang.Object) (-1));
        docScoreSearchScript0.setNextVar("skip_initial_import", (java.lang.Object) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean9 = builder8.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder8.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder8.disableIndexRefresh(false);
        java.lang.String str14 = builder13.getstatisticsTypeName();
        builder13.setmongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder13.mongoLocalPassword("index");
        docScoreSearchScript0.setNextVar("local", (java.lang.Object) builder13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long20 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("concurrent_requests", (java.lang.Object) (-1));
        docScoreSearchScript0.setNextVar("skip_initial_import", (java.lang.Object) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean9 = builder8.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder8.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder8.disableIndexRefresh(false);
        java.lang.String str14 = builder13.getstatisticsTypeName();
        builder13.setmongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder13.mongoLocalPassword("index");
        docScoreSearchScript0.setNextVar("local", (java.lang.Object) builder13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition22 = builder21.build();
        java.lang.String str23 = mongoDBRiverDefinition22.getINDEX_OBJECT();
        java.util.Set<java.lang.String> strSet24 = mongoDBRiverDefinition22.parentTypes;
        java.lang.String str25 = mongoDBRiverDefinition22.riverName;
        boolean boolean26 = mongoDBRiverDefinition22.disableIndexRefresh;
        java.lang.String str27 = mongoDBRiverDefinition22.riverIndexName;
        boolean boolean28 = mongoDBRiverDefinition22.getadvancedTransformation();
        java.lang.String str29 = mongoDBRiverDefinition22.getSSL_CONNECTION_FIELD();
        java.lang.String str30 = mongoDBRiverDefinition22.mongoLocalUser;
        docScoreSearchScript0.setNextVar("drop_collection", (java.lang.Object) mongoDBRiverDefinition22);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean33 = builder32.getdropCollection();
        java.lang.String str34 = builder32.getscript();
        boolean boolean35 = builder32.dropCollection;
        builder32.indexName = "";
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory38 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean40 = builder39.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder39.script("bulk");
        com.mongodb.BasicDBObject basicDBObject43 = builder42.getmongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript44 = docScoreNativeScriptFactory38.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject43);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder32.mongoOplogFilter(basicDBObject43);
        builder32.storeStatistics = true;
        com.mongodb.BasicDBObject basicDBObject48 = builder32.getmongoCollectionFilter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject48);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("concurrent_requests", (java.lang.Object) (-1));
        docScoreSearchScript0.setNextVar("skip_initial_import", (java.lang.Object) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean9 = builder8.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder8.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder8.disableIndexRefresh(false);
        java.lang.String str14 = builder13.getstatisticsTypeName();
        builder13.setmongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder13.mongoLocalPassword("index");
        docScoreSearchScript0.setNextVar("local", (java.lang.Object) builder13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition22 = builder21.build();
        java.lang.String str23 = mongoDBRiverDefinition22.getINDEX_OBJECT();
        java.util.Set<java.lang.String> strSet24 = mongoDBRiverDefinition22.parentTypes;
        java.lang.String str25 = mongoDBRiverDefinition22.riverName;
        boolean boolean26 = mongoDBRiverDefinition22.disableIndexRefresh;
        java.lang.String str27 = mongoDBRiverDefinition22.riverIndexName;
        boolean boolean28 = mongoDBRiverDefinition22.getadvancedTransformation();
        java.lang.String str29 = mongoDBRiverDefinition22.getSSL_CONNECTION_FIELD();
        java.lang.String str30 = mongoDBRiverDefinition22.mongoLocalUser;
        docScoreSearchScript0.setNextVar("drop_collection", (java.lang.Object) mongoDBRiverDefinition22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long32 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean2 = builder1.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder1.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder1.disableIndexRefresh(false);
        java.lang.Object obj7 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj8 = docScoreSearchScript0.run();
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
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
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (short) 1);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
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
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (short) 100);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("password", "store_statistics");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk", "script_type");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("concurrent_requests", (java.lang.Object) (-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long4 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
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
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        docScoreSearchScript0.setNextScore((float) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float37 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("filter", (java.lang.Object) "gridfs");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean5 = builder4.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder4.script("bulk");
        builder7.skipInitialImport = false;
        builder7.setscriptType("script");
        java.lang.String[] strArray29 = new java.lang.String[] { "exclude_fields", "servers", "secondary_read_preference", "name", "exclude_fields", "bulk_timeout", "skip_initial_import", "bulk", "script", "disable_index_refresh", "script.default_lang", "skip_initial_import", "gridfs", "user", "port", "parent_types", "size" };
        java.util.LinkedHashSet<java.lang.String> strSet30 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet30, strArray29);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder7.excludeFields((java.util.Set<java.lang.String>) strSet30);
        java.lang.String str33 = builder32.getriverIndexName();
        java.lang.String str34 = builder32.getmongoLocalUser();
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter35 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str36 = serializedObjectSupporter35.deserializeObjectString7();
        org.elasticsearch.river.RiverSettings riverSettings37 = serializedObjectSupporter35.deserializeObjectRiverSettings4();
        org.elasticsearch.river.RiverSettings riverSettings38 = serializedObjectSupporter35.deserializeObjectRiverSettings8();
        builder32.serializedObjectSupporter = serializedObjectSupporter35;
        org.elasticsearch.river.RiverSettings riverSettings40 = serializedObjectSupporter35.deserializeObjectRiverSettings4();
        java.lang.String str41 = serializedObjectSupporter35.deserializeObjectString16();
        org.elasticsearch.river.RiverSettings riverSettings42 = serializedObjectSupporter35.deserializeObjectRiverSettings2();
        org.elasticsearch.common.settings.Settings settings43 = riverSettings42.globalSettings();
        java.lang.Object obj44 = docScoreSearchScript0.unwrap((java.lang.Object) riverSettings42);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition46 = builder45.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList47 = mongoDBRiverDefinition46.mongoServers;
        org.elasticsearch.common.unit.TimeValue timeValue48 = mongoDBRiverDefinition46.getDEFAULT_FLUSH_INTERVAL();
        boolean boolean49 = mongoDBRiverDefinition46.dropCollection;
        boolean boolean50 = mongoDBRiverDefinition46.getmongoSecondaryReadPreference();
        boolean boolean51 = mongoDBRiverDefinition46.isMongoSecondaryReadPreference();
        int int52 = mongoDBRiverDefinition46.getDEFAULT_DB_PORT();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp53 = mongoDBRiverDefinition46.getInitialTimestamp();
        java.lang.String str54 = mongoDBRiverDefinition46.getCREDENTIALS_FIELD();
        com.mongodb.BasicDBObject basicDBObject55 = mongoDBRiverDefinition46.getMongoCollectionFilter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject55);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("skip_initial_import", ".scripts");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
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
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean36 = builder35.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder35.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder38.mongoAdminUser("socket_timeout");
        java.lang.String str41 = builder40.riverName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder40.connectTimeout((int) (short) 1);
        com.mongodb.BasicDBObject basicDBObject44 = builder40.getmongoCollectionFilter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject44);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("drop_collection", "mongodb-1638820218363");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("skip_initial_import", "disable_index_refresh");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("user", "script_type");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
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
        docScoreSearchScript0.setNextScore((float) (byte) -1);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition22 = builder21.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList23 = mongoDBRiverDefinition22.mongoServers;
        org.elasticsearch.common.unit.TimeValue timeValue24 = mongoDBRiverDefinition22.getDEFAULT_FLUSH_INTERVAL();
        boolean boolean25 = mongoDBRiverDefinition22.dropCollection;
        boolean boolean26 = mongoDBRiverDefinition22.getmongoSecondaryReadPreference();
        boolean boolean27 = mongoDBRiverDefinition22.isMongoSecondaryReadPreference();
        int int28 = mongoDBRiverDefinition22.getDEFAULT_DB_PORT();
        java.lang.String str29 = mongoDBRiverDefinition22.getBULK_TIMEOUT_FIELD();
        int int30 = mongoDBRiverDefinition22.getDEFAULT_CONCURRENT_REQUESTS();
        java.lang.String str31 = mongoDBRiverDefinition22.getNAME_FIELD();
        java.lang.String str32 = mongoDBRiverDefinition22.mongoAdminPassword;
        com.mongodb.BasicDBObject basicDBObject33 = mongoDBRiverDefinition22.getMongoCollectionFilter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject33);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
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
        docScoreSearchScript0.setNextScore((float) 8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float45 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("password", "type");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("port", "disable_index_refresh");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
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
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj35 = docScoreSearchScript0.run();
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("drop_collection", "script_type");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean2 = builder1.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = builder1.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder1.disableIndexRefresh(false);
        java.lang.Object obj7 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long8 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean3 = builder2.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.script("bulk");
        builder2.riverName = "concurrent_bulk_requests";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder2.connectTimeout((int) (byte) 10);
        docScoreSearchScript0.setNextVar("port", (java.lang.Object) builder9);
        docScoreSearchScript0.setNextScore((float) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long13 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("include_fields", "type");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("dummy-stats", "is_mongos");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("store_statistics", "gridfs");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (byte) -1);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float43 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
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
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition23 = builder22.build();
        java.lang.String str24 = builder22.mongoLocalPassword;
        boolean boolean25 = builder22.getmongoSSLVerifyCertificate();
        java.lang.Object obj26 = docScoreSearchScript0.unwrap((java.lang.Object) boolean25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long27 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820217755", "bulk_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("concurrent_requests", (java.lang.Object) (-1));
        docScoreSearchScript0.setNextVar("skip_initial_import", (java.lang.Object) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean9 = builder8.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder8.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder8.disableIndexRefresh(false);
        java.lang.String str14 = builder13.getstatisticsTypeName();
        builder13.setmongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder13.mongoLocalPassword("index");
        docScoreSearchScript0.setNextVar("local", (java.lang.Object) builder13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition22 = builder21.build();
        java.lang.String str23 = mongoDBRiverDefinition22.getINDEX_OBJECT();
        java.util.Set<java.lang.String> strSet24 = mongoDBRiverDefinition22.parentTypes;
        java.lang.String str25 = mongoDBRiverDefinition22.riverName;
        boolean boolean26 = mongoDBRiverDefinition22.disableIndexRefresh;
        java.lang.String str27 = mongoDBRiverDefinition22.riverIndexName;
        boolean boolean28 = mongoDBRiverDefinition22.getadvancedTransformation();
        java.lang.String str29 = mongoDBRiverDefinition22.getSSL_CONNECTION_FIELD();
        java.lang.String str30 = mongoDBRiverDefinition22.mongoLocalUser;
        docScoreSearchScript0.setNextVar("drop_collection", (java.lang.Object) mongoDBRiverDefinition22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj32 = docScoreSearchScript0.run();
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("skip_initial_import", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("actions", "mongodb-1638820218299");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
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
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.mongoAdminUser("socket_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.throttleSize(27017);
        boolean boolean19 = builder16.mongoSSLVerifyCertificate;
        java.lang.Object obj20 = docScoreSearchScript0.unwrap((java.lang.Object) boolean19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long21 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter1 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings2 = serializedObjectSupporter1.deserializeObjectRiverSettings4();
        java.lang.String str3 = serializedObjectSupporter1.deserializeObjectString17();
        org.elasticsearch.river.RiverSettings riverSettings4 = serializedObjectSupporter1.deserializeObjectRiverSettings4();
        java.lang.String str5 = serializedObjectSupporter1.deserializeObjectString13();
        java.lang.String str6 = serializedObjectSupporter1.deserializeObjectString18();
        java.lang.String str7 = serializedObjectSupporter1.deserializeObjectString9();
        org.elasticsearch.river.RiverSettings riverSettings8 = serializedObjectSupporter1.deserializeObjectRiverSettings5();
        org.elasticsearch.river.RiverSettings riverSettings9 = serializedObjectSupporter1.deserializeObjectRiverSettings7();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = riverSettings9.settings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource(strMap10);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("filter", (java.lang.Object) "gridfs");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean5 = builder4.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder4.script("bulk");
        builder7.skipInitialImport = false;
        builder7.setscriptType("script");
        java.lang.String[] strArray29 = new java.lang.String[] { "exclude_fields", "servers", "secondary_read_preference", "name", "exclude_fields", "bulk_timeout", "skip_initial_import", "bulk", "script", "disable_index_refresh", "script.default_lang", "skip_initial_import", "gridfs", "user", "port", "parent_types", "size" };
        java.util.LinkedHashSet<java.lang.String> strSet30 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet30, strArray29);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder7.excludeFields((java.util.Set<java.lang.String>) strSet30);
        java.lang.String str33 = builder32.getriverIndexName();
        java.lang.String str34 = builder32.getmongoLocalUser();
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter35 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str36 = serializedObjectSupporter35.deserializeObjectString7();
        org.elasticsearch.river.RiverSettings riverSettings37 = serializedObjectSupporter35.deserializeObjectRiverSettings4();
        org.elasticsearch.river.RiverSettings riverSettings38 = serializedObjectSupporter35.deserializeObjectRiverSettings8();
        builder32.serializedObjectSupporter = serializedObjectSupporter35;
        org.elasticsearch.river.RiverSettings riverSettings40 = serializedObjectSupporter35.deserializeObjectRiverSettings4();
        java.lang.String str41 = serializedObjectSupporter35.deserializeObjectString16();
        org.elasticsearch.river.RiverSettings riverSettings42 = serializedObjectSupporter35.deserializeObjectRiverSettings2();
        org.elasticsearch.common.settings.Settings settings43 = riverSettings42.globalSettings();
        java.lang.Object obj44 = docScoreSearchScript0.unwrap((java.lang.Object) riverSettings42);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float45 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
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
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter43 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str44 = serializedObjectSupporter43.deserializeObjectString4();
        org.elasticsearch.river.RiverSettings riverSettings45 = serializedObjectSupporter43.deserializeObjectRiverSettings3();
        java.lang.String str46 = serializedObjectSupporter43.deserializeObjectString10();
        java.lang.String str47 = serializedObjectSupporter43.deserializeObjectString16();
        java.lang.Object obj48 = docScoreSearchScript0.unwrap((java.lang.Object) str47);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter50 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str51 = serializedObjectSupporter50.deserializeObjectString4();
        org.elasticsearch.river.RiverSettings riverSettings52 = serializedObjectSupporter50.deserializeObjectRiverSettings3();
        org.elasticsearch.river.RiverSettings riverSettings53 = serializedObjectSupporter50.deserializeObjectRiverSettings1();
        org.elasticsearch.river.RiverSettings riverSettings54 = serializedObjectSupporter50.deserializeObjectRiverSettings2();
        org.elasticsearch.river.RiverSettings riverSettings55 = serializedObjectSupporter50.deserializeObjectRiverSettings3();
        docScoreSearchScript0.setNextVar("size", (java.lang.Object) riverSettings55);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition59 = builder58.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList60 = mongoDBRiverDefinition59.mongoServers;
        boolean boolean61 = mongoDBRiverDefinition59.isDropCollection();
        com.mongodb.MongoClientOptions mongoClientOptions62 = mongoDBRiverDefinition59.getMongoClientOptions();
        boolean boolean63 = mongoDBRiverDefinition59.isMongoSecondaryReadPreference();
        int int64 = mongoDBRiverDefinition59.socketTimeout;
        docScoreSearchScript0.setNextVar("", (java.lang.Object) mongoDBRiverDefinition59);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder66 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean67 = builder66.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder69 = builder66.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder71 = builder66.disableIndexRefresh(false);
        java.lang.String str72 = builder71.getstatisticsTypeName();
        builder71.scriptType = "user";
        builder71.includeCollection = "include_fields";
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory77 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder78 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean79 = builder78.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder81 = builder78.script("bulk");
        com.mongodb.BasicDBObject basicDBObject82 = builder81.getmongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript83 = docScoreNativeScriptFactory77.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject82);
        builder71.setmongoCollectionFilter(basicDBObject82);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject82);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
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
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter19 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str20 = serializedObjectSupporter19.deserializeObjectString4();
        org.elasticsearch.river.RiverSettings riverSettings21 = serializedObjectSupporter19.deserializeObjectRiverSettings4();
        java.lang.String str22 = serializedObjectSupporter19.deserializeObjectString16();
        java.lang.String str23 = serializedObjectSupporter19.deserializeObjectString7();
        java.lang.String str24 = serializedObjectSupporter19.deserializeObjectString7();
        org.elasticsearch.river.RiverSettings riverSettings25 = serializedObjectSupporter19.deserializeObjectRiverSettings2();
        docScoreSearchScript0.setNextVar("host", (java.lang.Object) riverSettings25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj27 = docScoreSearchScript0.run();
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
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
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        docScoreSearchScript0.setNextScore((float) 10);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter37 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str38 = serializedObjectSupporter37.deserializeObjectString4();
        org.elasticsearch.river.RiverSettings riverSettings39 = serializedObjectSupporter37.deserializeObjectRiverSettings3();
        java.lang.String str40 = serializedObjectSupporter37.deserializeObjectString2();
        java.lang.Object obj41 = docScoreSearchScript0.unwrap((java.lang.Object) serializedObjectSupporter37);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float42 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
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
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long35 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("host", "script.disable_dynamic");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean3 = builder2.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.script("bulk");
        builder2.riverName = "concurrent_bulk_requests";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder2.connectTimeout((int) (byte) 10);
        docScoreSearchScript0.setNextVar("port", (java.lang.Object) builder9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition12 = builder11.build();
        java.lang.String str13 = mongoDBRiverDefinition12.getINDEX_OBJECT();
        java.util.Set<java.lang.String> strSet14 = mongoDBRiverDefinition12.parentTypes;
        org.elasticsearch.common.logging.ESLogger eSLogger15 = mongoDBRiverDefinition12.getlogger();
        java.lang.String str16 = mongoDBRiverDefinition12.getSOCKET_TIMEOUT();
        java.lang.String str17 = mongoDBRiverDefinition12.getHOST_FIELD();
        com.mongodb.BasicDBObject basicDBObject18 = mongoDBRiverDefinition12.mongoCollectionFilter;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
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
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter19 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str20 = serializedObjectSupporter19.deserializeObjectString4();
        org.elasticsearch.river.RiverSettings riverSettings21 = serializedObjectSupporter19.deserializeObjectRiverSettings4();
        java.lang.String str22 = serializedObjectSupporter19.deserializeObjectString16();
        java.lang.String str23 = serializedObjectSupporter19.deserializeObjectString7();
        java.lang.String str24 = serializedObjectSupporter19.deserializeObjectString7();
        org.elasticsearch.river.RiverSettings riverSettings25 = serializedObjectSupporter19.deserializeObjectRiverSettings2();
        docScoreSearchScript0.setNextVar("host", (java.lang.Object) riverSettings25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((-1));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("host", "ssl_verify_certificate");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("password", "flush_interval");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script_type", "stats");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
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
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float35 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "advanced_transformation");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("flush_interval", "credentials");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
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
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj35 = docScoreSearchScript0.run();
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean3 = builder2.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.script("bulk");
        builder2.riverName = "concurrent_bulk_requests";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder2.connectTimeout((int) (byte) 10);
        docScoreSearchScript0.setNextVar("port", (java.lang.Object) builder9);
        docScoreSearchScript0.setNextScore((float) 1);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter13 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.Object obj14 = docScoreSearchScript0.unwrap((java.lang.Object) serializedObjectSupporter13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder15.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList17 = mongoDBRiverDefinition16.mongoServers;
        java.lang.String str18 = mongoDBRiverDefinition16.getBULK_TIMEOUT_FIELD();
        java.util.Set<java.lang.String> strSet19 = mongoDBRiverDefinition16.getParentTypes();
        java.lang.String str20 = mongoDBRiverDefinition16.statisticsIndexName;
        java.util.Set<java.lang.String> strSet21 = mongoDBRiverDefinition16.excludeFields;
        org.elasticsearch.common.logging.ESLogger eSLogger22 = mongoDBRiverDefinition16.getlogger();
        java.lang.Object obj23 = docScoreSearchScript0.unwrap((java.lang.Object) eSLogger22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double24 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double18 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("ssl_verify_certificate", "mongodb-1638820217755");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj20 = docScoreSearchScript0.run();
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("options", "flush_interval");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("concurrent_requests", (java.lang.Object) (-1));
        docScoreSearchScript0.setNextVar("skip_initial_import", (java.lang.Object) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean9 = builder8.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder8.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder8.disableIndexRefresh(false);
        java.lang.String str14 = builder13.getstatisticsTypeName();
        builder13.setmongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder13.mongoLocalPassword("index");
        docScoreSearchScript0.setNextVar("local", (java.lang.Object) builder13);
        docScoreSearchScript0.setNextScore((float) 10L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj22 = docScoreSearchScript0.run();
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("stats", "include_fields");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
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
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        docScoreSearchScript0.setNextScore((float) 10);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter37 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str38 = serializedObjectSupporter37.deserializeObjectString4();
        org.elasticsearch.river.RiverSettings riverSettings39 = serializedObjectSupporter37.deserializeObjectRiverSettings3();
        java.lang.String str40 = serializedObjectSupporter37.deserializeObjectString2();
        java.lang.Object obj41 = docScoreSearchScript0.unwrap((java.lang.Object) serializedObjectSupporter37);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long42 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk", "script.default_lang");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
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
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float35 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("advanced_transformation", "mongodb-1638820218326");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("filter", (java.lang.Object) "gridfs");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(32);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("admin", "user");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("concurrent_requests", (java.lang.Object) (-1));
        docScoreSearchScript0.setNextVar("skip_initial_import", (java.lang.Object) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean9 = builder8.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder8.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder8.disableIndexRefresh(false);
        java.lang.String str14 = builder13.getstatisticsTypeName();
        builder13.setmongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder13.mongoLocalPassword("index");
        docScoreSearchScript0.setNextVar("local", (java.lang.Object) builder13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition22 = builder21.build();
        java.lang.String str23 = mongoDBRiverDefinition22.getINDEX_OBJECT();
        java.util.Set<java.lang.String> strSet24 = mongoDBRiverDefinition22.parentTypes;
        java.lang.String str25 = mongoDBRiverDefinition22.riverName;
        boolean boolean26 = mongoDBRiverDefinition22.disableIndexRefresh;
        java.lang.String str27 = mongoDBRiverDefinition22.riverIndexName;
        boolean boolean28 = mongoDBRiverDefinition22.getadvancedTransformation();
        java.lang.String str29 = mongoDBRiverDefinition22.getSSL_CONNECTION_FIELD();
        java.lang.String str30 = mongoDBRiverDefinition22.mongoLocalUser;
        docScoreSearchScript0.setNextVar("drop_collection", (java.lang.Object) mongoDBRiverDefinition22);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean34 = builder33.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder33.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder33.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder33.mongoSSLVerifyCertificate(true);
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float42 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
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
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter43 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str44 = serializedObjectSupporter43.deserializeObjectString4();
        org.elasticsearch.river.RiverSettings riverSettings45 = serializedObjectSupporter43.deserializeObjectRiverSettings3();
        java.lang.String str46 = serializedObjectSupporter43.deserializeObjectString10();
        java.lang.String str47 = serializedObjectSupporter43.deserializeObjectString16();
        java.lang.Object obj48 = docScoreSearchScript0.unwrap((java.lang.Object) str47);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter50 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str51 = serializedObjectSupporter50.deserializeObjectString4();
        org.elasticsearch.river.RiverSettings riverSettings52 = serializedObjectSupporter50.deserializeObjectRiverSettings3();
        org.elasticsearch.river.RiverSettings riverSettings53 = serializedObjectSupporter50.deserializeObjectRiverSettings1();
        org.elasticsearch.river.RiverSettings riverSettings54 = serializedObjectSupporter50.deserializeObjectRiverSettings2();
        org.elasticsearch.river.RiverSettings riverSettings55 = serializedObjectSupporter50.deserializeObjectRiverSettings3();
        docScoreSearchScript0.setNextVar("size", (java.lang.Object) riverSettings55);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float57 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
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
        docScoreSearchScript0.setNextScore((float) (byte) -1);
        docScoreSearchScript0.setNextScore((float) 1000);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long21 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("null.null", "bulk");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long18 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("skip_initial_import", "concurrent_requests");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_timeout", "mongodb-1638820218424");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "mongodb-1638820218326");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
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
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition23 = builder22.build();
        java.lang.String str24 = builder22.mongoLocalPassword;
        boolean boolean25 = builder22.getmongoSSLVerifyCertificate();
        java.lang.Object obj26 = docScoreSearchScript0.unwrap((java.lang.Object) boolean25);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter27 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str28 = serializedObjectSupporter27.deserializeObjectString4();
        java.lang.String str29 = serializedObjectSupporter27.deserializeObjectString9();
        java.lang.String str30 = serializedObjectSupporter27.deserializeObjectString11();
        org.elasticsearch.river.RiverSettings riverSettings31 = serializedObjectSupporter27.deserializeObjectRiverSettings9();
        java.lang.String str32 = serializedObjectSupporter27.deserializeObjectString3();
        org.elasticsearch.river.RiverSettings riverSettings33 = serializedObjectSupporter27.deserializeObjectRiverSettings9();
        java.util.Map<java.lang.String, java.lang.Object> strMap34 = riverSettings33.settings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource(strMap34);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("initial_timestamp", "throttle_size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218264", "is_mongos");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean3 = builder2.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.script("bulk");
        builder2.riverName = "concurrent_bulk_requests";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder2.connectTimeout((int) (byte) 10);
        docScoreSearchScript0.setNextVar("port", (java.lang.Object) builder9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float11 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("concurrent_requests", (java.lang.Object) (-1));
        docScoreSearchScript0.setNextVar("skip_initial_import", (java.lang.Object) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double7 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
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
        java.lang.Object obj34 = docScoreSearchScript0.unwrap((java.lang.Object) "local");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float35 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("password", "throttle_size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean3 = builder2.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.script("bulk");
        builder2.riverName = "concurrent_bulk_requests";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder2.connectTimeout((int) (byte) 10);
        docScoreSearchScript0.setNextVar("port", (java.lang.Object) builder9);
        docScoreSearchScript0.setNextScore((float) 1);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter13 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.Object obj14 = docScoreSearchScript0.unwrap((java.lang.Object) serializedObjectSupporter13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder15.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList17 = mongoDBRiverDefinition16.mongoServers;
        java.lang.String str18 = mongoDBRiverDefinition16.getBULK_TIMEOUT_FIELD();
        java.util.Set<java.lang.String> strSet19 = mongoDBRiverDefinition16.getParentTypes();
        java.lang.String str20 = mongoDBRiverDefinition16.statisticsIndexName;
        java.util.Set<java.lang.String> strSet21 = mongoDBRiverDefinition16.excludeFields;
        org.elasticsearch.common.logging.ESLogger eSLogger22 = mongoDBRiverDefinition16.getlogger();
        java.lang.Object obj23 = docScoreSearchScript0.unwrap((java.lang.Object) eSLogger22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long24 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "bulk_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
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
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition21 = builder20.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList22 = mongoDBRiverDefinition21.mongoServers;
        java.lang.String str23 = mongoDBRiverDefinition21.getINITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD();
        boolean boolean24 = mongoDBRiverDefinition21.getdropCollection();
        java.util.Set<java.lang.String> strSet25 = mongoDBRiverDefinition21.getParentTypes();
        java.lang.String str26 = mongoDBRiverDefinition21.getMongoAdminUser();
        com.mongodb.BasicDBObject basicDBObject27 = mongoDBRiverDefinition21.getMongoCollectionFilter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject27);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "import_all_collections");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218387", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
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
        docScoreSearchScript0.setNextScore((float) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean20 = builder19.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder19.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder22.mongoAdminUser("socket_timeout");
        java.lang.String str25 = builder24.riverName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder24.connectTimeout((int) (short) 1);
        boolean boolean28 = builder24.skipInitialImport;
        java.lang.String str29 = builder24.mongoLocalUser;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean31 = builder30.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder30.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder33.mongoAdminUser("socket_timeout");
        java.lang.String str36 = builder35.riverName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder35.connectTimeout((int) (short) 1);
        com.mongodb.BasicDBObject basicDBObject39 = builder35.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder24.mongoOplogFilter(basicDBObject39);
        java.lang.Object obj41 = docScoreSearchScript0.unwrap((java.lang.Object) builder24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(0);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
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
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        docScoreSearchScript0.setNextScore((float) 97);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition39 = builder38.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList40 = mongoDBRiverDefinition39.mongoServers;
        java.lang.String str41 = mongoDBRiverDefinition39.getBULK_TIMEOUT_FIELD();
        java.util.Set<java.lang.String> strSet42 = mongoDBRiverDefinition39.getParentTypes();
        int int43 = mongoDBRiverDefinition39.throttleSize;
        java.lang.Boolean boolean44 = mongoDBRiverDefinition39.getisMongos();
        java.lang.String str45 = mongoDBRiverDefinition39.getPORT_FIELD();
        boolean boolean46 = mongoDBRiverDefinition39.advancedTransformation;
        docScoreSearchScript0.setNextVar("mongodb-1638820218449", (java.lang.Object) mongoDBRiverDefinition39);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float48 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("size", "store_statistics");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
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
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean19 = builder18.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder18.script("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.mongoAdminUser("socket_timeout");
        java.lang.String str24 = builder23.riverName;
        com.mongodb.BasicDBObject basicDBObject25 = builder23.mongoCollectionFilter;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder23.includeCollection("disable_index_refresh");
        java.lang.String str28 = builder27.mongoAdminPassword;
        docScoreSearchScript0.setNextVar("password", (java.lang.Object) builder27);
        docScoreSearchScript0.setNextScore(100.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj32 = docScoreSearchScript0.run();
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
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
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter19 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str20 = serializedObjectSupporter19.deserializeObjectString4();
        org.elasticsearch.river.RiverSettings riverSettings21 = serializedObjectSupporter19.deserializeObjectRiverSettings4();
        java.lang.String str22 = serializedObjectSupporter19.deserializeObjectString16();
        java.lang.String str23 = serializedObjectSupporter19.deserializeObjectString7();
        java.lang.String str24 = serializedObjectSupporter19.deserializeObjectString7();
        org.elasticsearch.river.RiverSettings riverSettings25 = serializedObjectSupporter19.deserializeObjectRiverSettings2();
        docScoreSearchScript0.setNextVar("host", (java.lang.Object) riverSettings25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double27 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_size", "index");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("initial_timestamp", "include_collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean3 = builder2.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder2.script("bulk");
        builder2.riverName = "concurrent_bulk_requests";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder2.connectTimeout((int) (byte) 10);
        docScoreSearchScript0.setNextVar("port", (java.lang.Object) builder9);
        docScoreSearchScript0.setNextScore((float) (short) 1);
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (byte) -1);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(32);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
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
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        docScoreSearchScript0.setNextScore((float) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition39 = builder38.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList40 = mongoDBRiverDefinition39.mongoServers;
        org.elasticsearch.common.unit.TimeValue timeValue41 = mongoDBRiverDefinition39.getDEFAULT_FLUSH_INTERVAL();
        boolean boolean42 = mongoDBRiverDefinition39.dropCollection;
        boolean boolean43 = mongoDBRiverDefinition39.isMongoSecondaryReadPreference();
        java.lang.String str44 = mongoDBRiverDefinition39.getStatisticsTypeName();
        org.elasticsearch.common.unit.TimeValue timeValue45 = mongoDBRiverDefinition39.getDEFAULT_FLUSH_INTERVAL();
        java.lang.String str46 = mongoDBRiverDefinition39.getPARENT_TYPES_FIELD();
        java.lang.String str47 = mongoDBRiverDefinition39.getSSL_VERIFY_CERT_FIELD();
        java.lang.String str48 = mongoDBRiverDefinition39.getINCLUDE_COLLECTION_FIELD();
        java.util.Set<java.lang.String> strSet49 = mongoDBRiverDefinition39.includeFields;
        docScoreSearchScript0.setNextVar("bulk_size", (java.lang.Object) mongoDBRiverDefinition39);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(27017);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
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
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter43 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str44 = serializedObjectSupporter43.deserializeObjectString4();
        org.elasticsearch.river.RiverSettings riverSettings45 = serializedObjectSupporter43.deserializeObjectRiverSettings3();
        java.lang.String str46 = serializedObjectSupporter43.deserializeObjectString10();
        java.lang.String str47 = serializedObjectSupporter43.deserializeObjectString16();
        java.lang.Object obj48 = docScoreSearchScript0.unwrap((java.lang.Object) str47);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter50 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str51 = serializedObjectSupporter50.deserializeObjectString4();
        org.elasticsearch.river.RiverSettings riverSettings52 = serializedObjectSupporter50.deserializeObjectRiverSettings3();
        org.elasticsearch.river.RiverSettings riverSettings53 = serializedObjectSupporter50.deserializeObjectRiverSettings1();
        org.elasticsearch.river.RiverSettings riverSettings54 = serializedObjectSupporter50.deserializeObjectRiverSettings2();
        org.elasticsearch.river.RiverSettings riverSettings55 = serializedObjectSupporter50.deserializeObjectRiverSettings3();
        docScoreSearchScript0.setNextVar("size", (java.lang.Object) riverSettings55);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition59 = builder58.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList60 = mongoDBRiverDefinition59.mongoServers;
        boolean boolean61 = mongoDBRiverDefinition59.isDropCollection();
        com.mongodb.MongoClientOptions mongoClientOptions62 = mongoDBRiverDefinition59.getMongoClientOptions();
        boolean boolean63 = mongoDBRiverDefinition59.isMongoSecondaryReadPreference();
        int int64 = mongoDBRiverDefinition59.socketTimeout;
        docScoreSearchScript0.setNextVar("", (java.lang.Object) mongoDBRiverDefinition59);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float66 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("concurrent_requests", (java.lang.Object) (-1));
        docScoreSearchScript0.setNextVar("skip_initial_import", (java.lang.Object) 100);
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long9 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("include_collection", "stats");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
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
        java.lang.Object obj34 = docScoreSearchScript0.unwrap((java.lang.Object) "local");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(1000);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("null.null", "mongodb-1638820217755");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("admin", "null.null");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "flush_interval");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
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
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long35 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("is_mongos", "mongodb-1638820218326");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
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
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter43 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str44 = serializedObjectSupporter43.deserializeObjectString4();
        org.elasticsearch.river.RiverSettings riverSettings45 = serializedObjectSupporter43.deserializeObjectRiverSettings3();
        java.lang.String str46 = serializedObjectSupporter43.deserializeObjectString10();
        java.lang.String str47 = serializedObjectSupporter43.deserializeObjectString16();
        java.lang.Object obj48 = docScoreSearchScript0.unwrap((java.lang.Object) str47);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(97);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("concurrent_requests", (java.lang.Object) (-1));
        docScoreSearchScript0.setNextVar("skip_initial_import", (java.lang.Object) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = builder8.build();
        java.util.List<com.mongodb.ServerAddress> serverAddressList10 = mongoDBRiverDefinition9.mongoServers;
        org.elasticsearch.common.unit.TimeValue timeValue11 = mongoDBRiverDefinition9.getDEFAULT_FLUSH_INTERVAL();
        boolean boolean12 = mongoDBRiverDefinition9.dropCollection;
        boolean boolean13 = mongoDBRiverDefinition9.getmongoSecondaryReadPreference();
        boolean boolean14 = mongoDBRiverDefinition9.isMongoSecondaryReadPreference();
        int int15 = mongoDBRiverDefinition9.getDEFAULT_DB_PORT();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = mongoDBRiverDefinition9.getInitialTimestamp();
        boolean boolean17 = mongoDBRiverDefinition9.isImportAllCollections();
        com.mongodb.BasicDBObject basicDBObject18 = mongoDBRiverDefinition9.mongoOplogFilter;
        java.lang.String str19 = mongoDBRiverDefinition9.riverName;
        docScoreSearchScript0.setNextVar("", (java.lang.Object) mongoDBRiverDefinition9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float21 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("options", "mydatabase");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
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
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean45 = builder44.getdropCollection();
        java.lang.String str46 = builder44.getscript();
        boolean boolean47 = builder44.dropCollection;
        builder44.indexName = "";
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory50 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean52 = builder51.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder51.script("bulk");
        com.mongodb.BasicDBObject basicDBObject55 = builder54.getmongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript56 = docScoreNativeScriptFactory50.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject55);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder44.mongoOplogFilter(basicDBObject55);
        builder44.storeStatistics = true;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = builder44.mongoSSLVerifyCertificate(false);
        com.mongodb.BasicDBObject basicDBObject62 = builder61.mongoOplogFilter;
        builder61.mongoLocalUser = "password";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder66 = builder61.mongoSecondaryReadPreference(false);
        com.mongodb.BasicDBObject basicDBObject67 = builder61.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder68 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition69 = builder68.build();
        java.lang.String str70 = mongoDBRiverDefinition69.getINDEX_OBJECT();
        java.util.Set<java.lang.String> strSet71 = mongoDBRiverDefinition69.parentTypes;
        boolean boolean72 = mongoDBRiverDefinition69.isStoreStatistics();
        boolean boolean73 = mongoDBRiverDefinition69.dropCollection;
        java.lang.String str74 = mongoDBRiverDefinition69.scriptType;
        java.lang.String str75 = mongoDBRiverDefinition69.getCREDENTIALS_FIELD();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp76 = mongoDBRiverDefinition69.getInitialTimestamp();
        java.lang.String str77 = mongoDBRiverDefinition69.getSSL_CONNECTION_FIELD();
        com.mongodb.BasicDBObject basicDBObject78 = mongoDBRiverDefinition69.mongoCollectionFilter;
        builder61.mongoCollectionFilter = basicDBObject78;
        builder61.mongoSecondaryReadPreference = true;
        docScoreSearchScript0.setNextVar("mongodb-1638820218264", (java.lang.Object) builder61);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder83 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition84 = builder83.build();
        java.lang.String str85 = mongoDBRiverDefinition84.getINDEX_OBJECT();
        java.util.Set<java.lang.String> strSet86 = mongoDBRiverDefinition84.parentTypes;
        java.lang.String str87 = mongoDBRiverDefinition84.riverName;
        boolean boolean88 = mongoDBRiverDefinition84.disableIndexRefresh;
        java.lang.String str89 = mongoDBRiverDefinition84.riverIndexName;
        java.lang.String str90 = mongoDBRiverDefinition84.getRiverName();
        java.lang.String str91 = mongoDBRiverDefinition84.getUSER_FIELD();
        java.lang.String str92 = mongoDBRiverDefinition84.getSCRIPT_FIELD();
        java.lang.String str93 = mongoDBRiverDefinition84.getCONCURRENT_REQUESTS_FIELD();
        java.lang.String str94 = mongoDBRiverDefinition84.getINITIAL_TIMESTAMP_FIELD();
        java.lang.String str95 = mongoDBRiverDefinition84.getIMPORT_ALL_COLLECTIONS_FIELD();
        boolean boolean96 = mongoDBRiverDefinition84.isStoreStatistics();
        java.lang.String str97 = mongoDBRiverDefinition84.getCONCURRENT_BULK_REQUESTS_FIELD();
        com.mongodb.BasicDBObject basicDBObject98 = mongoDBRiverDefinition84.getMongoCollectionFilter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject98);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("collection", "store_statistics");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }
}

