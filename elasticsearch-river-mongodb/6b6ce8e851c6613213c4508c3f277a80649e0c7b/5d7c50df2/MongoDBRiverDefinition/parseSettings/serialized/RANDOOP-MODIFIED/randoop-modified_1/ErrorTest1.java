import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test501");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_size", "include_fields");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test502");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218363", "db");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test503");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mydatabase", "include_collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test504");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script_type", "index");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test505");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_size", "mongodb-1638820218424");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test506");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "local");
        docScoreSearchScript0.setNextScore(1.0f);
        docScoreSearchScript0.setNextScore((float) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        builder8.mongoAdminPassword = "";
        builder8.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder8.importAllCollections(true);
        builder16.setincludeCollection("mongodb-1638820218299");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder16.throttleSize((int) ' ');
        int int21 = builder20.throttleSize;
        docScoreSearchScript0.setNextVar("concurrent_bulk_requests.null", (java.lang.Object) builder20);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder24);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition26 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder24);
        builder24.mongoAdminPassword = "";
        builder24.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder24.importAllCollections(true);
        java.lang.String str33 = builder32.gettypeName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder32.scriptType("mongodb-1638820218408");
        docScoreSearchScript0.setNextVar("mydatabase", (java.lang.Object) "mongodb-1638820218408");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long37 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test507");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("drop_collection", "mydatabase");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test508");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mydatabase.mycollection", "servers");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test509");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("hi!", "script");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test510");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("flush_interval", "size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test511");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "advanced_transformation");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test512");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("secret", "mongodb-1638820218326");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test513");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk", "script.disable_dynamic");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test514");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "local");
        docScoreSearchScript0.setNextScore(1.0f);
        docScoreSearchScript0.setNextScore((float) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder7);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder7);
        builder7.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder7.mongoSecondaryReadPreference(true);
        builder7.includeCollection = "socket_timeout";
        builder7.setmongoAdminUser("collection");
        java.lang.String str18 = builder7.statisticsIndexName;
        java.lang.String str19 = builder7.getstatisticsIndexName();
        java.lang.Object obj20 = docScoreSearchScript0.unwrap((java.lang.Object) builder7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double21 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test515");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218326", "port");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test516");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("name", "initial_timestamp");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test517");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218299", "store_statistics");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test518");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("advanced_transformation", "flush_interval");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test519");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("parent_types", "secret");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test520");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("secondary_read_preference", "initial_timestamp");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test521");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "local");
        docScoreSearchScript0.setNextScore(1.0f);
        docScoreSearchScript0.setNextScore((float) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        builder8.mongoAdminPassword = "";
        builder8.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder8.importAllCollections(true);
        builder16.setincludeCollection("mongodb-1638820218299");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder16.throttleSize((int) ' ');
        int int21 = builder20.throttleSize;
        docScoreSearchScript0.setNextVar("concurrent_bulk_requests.null", (java.lang.Object) builder20);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder24);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition26 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder24);
        builder24.mongoAdminPassword = "";
        builder24.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder24.importAllCollections(true);
        java.lang.String str33 = builder32.gettypeName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder32.scriptType("mongodb-1638820218408");
        docScoreSearchScript0.setNextVar("mydatabase", (java.lang.Object) "mongodb-1638820218408");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition39 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder38);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition40 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder38);
        builder38.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder38.mongoSecondaryReadPreference(true);
        builder38.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder38.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp49 = builder48.initialTimestamp;
        docScoreSearchScript0.setNextVar(".scripts", (java.lang.Object) builder48);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float51 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test522");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("type", "socket_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test523");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk", "admin");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test524");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("ssl_verify_certificate", "bulk_size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test525");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("type", "concurrent_bulk_requests.null");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test526");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mydatabase.mycollection", "script.default_lang");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test527");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("type", "parent_types");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test528");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("credentials", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test529");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("secret", "mongodb-1638820218363");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test530");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "local");
        docScoreSearchScript0.setNextScore(1.0f);
        docScoreSearchScript0.setNextScore((float) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        builder8.mongoAdminPassword = "";
        builder8.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder8.importAllCollections(true);
        builder16.setincludeCollection("mongodb-1638820218299");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder16.throttleSize((int) ' ');
        int int21 = builder20.throttleSize;
        docScoreSearchScript0.setNextVar("concurrent_bulk_requests.null", (java.lang.Object) builder20);
        docScoreSearchScript0.setNextScore((float) 60000);
        docScoreSearchScript0.setNextVar("flush_interval", (java.lang.Object) "store_statistics");
        docScoreSearchScript0.setNextScore((float) 100L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition31 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder30);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition32 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder30);
        builder30.mongoAdminPassword = "";
        builder30.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder30.importAllCollections(true);
        builder38.setincludeCollection("mongodb-1638820218299");
        java.lang.String str41 = builder38.riverName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder38.skipInitialImport(false);
        boolean boolean44 = builder38.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition46 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder45);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition47 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder45);
        builder45.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder45.mongoSecondaryReadPreference(true);
        builder45.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder45.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder55.includeCollection("mongodb-1638820218299");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = builder55.mongoAdminPassword("host");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition61 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder60);
        java.lang.String str62 = mongoDBRiverDefinition61.mongoDb;
        java.lang.String str63 = mongoDBRiverDefinition61.getCONCURRENT_BULK_REQUESTS_FIELD();
        int int64 = mongoDBRiverDefinition61.throttleSize;
        boolean boolean65 = mongoDBRiverDefinition61.getskipInitialImport();
        boolean boolean66 = mongoDBRiverDefinition61.disableIndexRefresh;
        java.lang.String str67 = mongoDBRiverDefinition61.mongoLocalPassword;
        com.mongodb.BasicDBObject basicDBObject68 = mongoDBRiverDefinition61.mongoCollectionFilter;
        builder55.mongoCollectionFilter = basicDBObject68;
        builder38.setmongoOplogFilter(basicDBObject68);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject68);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test531");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script_type", "bulk_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test532");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "local");
        docScoreSearchScript0.setNextScore(1.0f);
        docScoreSearchScript0.setNextScore((float) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        builder8.mongoAdminPassword = "";
        builder8.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder8.importAllCollections(true);
        builder16.setincludeCollection("mongodb-1638820218299");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder16.throttleSize((int) ' ');
        int int21 = builder20.throttleSize;
        docScoreSearchScript0.setNextVar("concurrent_bulk_requests.null", (java.lang.Object) builder20);
        java.lang.Object obj24 = docScoreSearchScript0.unwrap((java.lang.Object) "advanced_transformation");
        docScoreSearchScript0.setNextScore((float) (short) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder27);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition29 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder27);
        builder27.mongoAdminPassword = "";
        builder27.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder27.importAllCollections(true);
        java.lang.String str36 = builder35.getmongoAdminPassword();
        java.lang.String str37 = builder35.statisticsTypeName;
        boolean boolean38 = builder35.getdisableIndexRefresh();
        java.lang.String str39 = builder35.riverName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder35.dropCollection(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition43 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder42);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition44 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder42);
        builder42.mongoAdminPassword = "";
        builder42.socketTimeout = (short) 0;
        boolean boolean49 = builder42.storeStatistics;
        builder42.scriptType = "mongodb-1638820218299";
        java.lang.String[] strArray53 = new java.lang.String[] { "mongodb-1638820218299" };
        java.util.LinkedHashSet<java.lang.String> strSet54 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet54, strArray53);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder42.excludeFields((java.util.Set<java.lang.String>) strSet54);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition58 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder57);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition59 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder57);
        builder57.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = builder57.mongoSecondaryReadPreference(true);
        builder57.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder67 = builder57.mongoDb("concurrent_bulk_requests");
        java.lang.String str68 = builder67.statisticsIndexName;
        com.mongodb.BasicDBObject basicDBObject69 = builder67.getmongoOplogFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder70 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition71 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder70);
        java.lang.String str72 = mongoDBRiverDefinition71.mongoDb;
        java.lang.String str73 = mongoDBRiverDefinition71.getCONCURRENT_BULK_REQUESTS_FIELD();
        int int74 = mongoDBRiverDefinition71.throttleSize;
        boolean boolean75 = mongoDBRiverDefinition71.getskipInitialImport();
        java.lang.String str76 = mongoDBRiverDefinition71.getScriptType();
        com.mongodb.BasicDBObject basicDBObject77 = mongoDBRiverDefinition71.mongoCollectionFilter;
        builder67.mongoCollectionFilter = basicDBObject77;
        builder56.mongoCollectionFilter = basicDBObject77;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder80 = builder41.mongoCollectionFilter(basicDBObject77);
        builder80.includeCollection = "host";
        boolean boolean83 = builder80.getimportAllCollections();
        java.lang.Object obj84 = docScoreSearchScript0.unwrap((java.lang.Object) builder80);
        docScoreSearchScript0.setNextScore((-1.0f));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float87 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test533");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "local");
        docScoreSearchScript0.setNextScore(1.0f);
        docScoreSearchScript0.setNextScore((float) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        builder8.mongoAdminPassword = "";
        builder8.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder8.importAllCollections(true);
        builder16.setincludeCollection("mongodb-1638820218299");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder16.throttleSize((int) ' ');
        int int21 = builder20.throttleSize;
        docScoreSearchScript0.setNextVar("concurrent_bulk_requests.null", (java.lang.Object) builder20);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder24);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition26 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder24);
        builder24.mongoAdminPassword = "";
        builder24.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder24.importAllCollections(true);
        java.lang.String str33 = builder32.gettypeName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder32.scriptType("mongodb-1638820218408");
        docScoreSearchScript0.setNextVar("mydatabase", (java.lang.Object) "mongodb-1638820218408");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition39 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder38);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition40 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder38);
        builder38.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder38.mongoSecondaryReadPreference(true);
        builder38.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder38.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp49 = builder48.initialTimestamp;
        docScoreSearchScript0.setNextVar(".scripts", (java.lang.Object) builder48);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition52 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder51);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition53 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder51);
        builder51.mongoAdminPassword = "";
        builder51.riverName = "localhost";
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory58 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition60 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder59);
        java.lang.String str61 = mongoDBRiverDefinition60.mongoDb;
        java.lang.String str62 = mongoDBRiverDefinition60.getCONCURRENT_BULK_REQUESTS_FIELD();
        int int63 = mongoDBRiverDefinition60.throttleSize;
        boolean boolean64 = mongoDBRiverDefinition60.getskipInitialImport();
        java.lang.String str65 = mongoDBRiverDefinition60.getScriptType();
        java.lang.String str66 = mongoDBRiverDefinition60.getSIZE_FIELD();
        java.lang.String str67 = mongoDBRiverDefinition60.statisticsIndexName;
        java.lang.String str68 = mongoDBRiverDefinition60.getMongoLocalUser();
        com.mongodb.BasicDBObject basicDBObject69 = mongoDBRiverDefinition60.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript70 = docScoreNativeScriptFactory58.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject69);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder71 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition72 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder71);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition73 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder71);
        builder71.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder77 = builder71.mongoSecondaryReadPreference(true);
        builder71.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder81 = builder71.mongoDb("concurrent_bulk_requests");
        java.lang.String str82 = builder81.statisticsIndexName;
        com.mongodb.BasicDBObject basicDBObject83 = builder81.getmongoOplogFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder84 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition85 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder84);
        java.lang.String str86 = mongoDBRiverDefinition85.mongoDb;
        java.lang.String str87 = mongoDBRiverDefinition85.getCONCURRENT_BULK_REQUESTS_FIELD();
        int int88 = mongoDBRiverDefinition85.throttleSize;
        boolean boolean89 = mongoDBRiverDefinition85.getskipInitialImport();
        java.lang.String str90 = mongoDBRiverDefinition85.getScriptType();
        com.mongodb.BasicDBObject basicDBObject91 = mongoDBRiverDefinition85.mongoCollectionFilter;
        builder81.mongoCollectionFilter = basicDBObject91;
        org.elasticsearch.script.ExecutableScript executableScript93 = docScoreNativeScriptFactory58.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject91);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder94 = builder51.mongoCollectionFilter(basicDBObject91);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject91);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test534");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "local");
        docScoreSearchScript0.setNextScore((float) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder6);
        builder6.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder6.mongoSecondaryReadPreference(true);
        builder6.includeCollection = "socket_timeout";
        builder6.setmongoAdminUser("collection");
        java.lang.String str17 = builder6.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition18 = builder6.build();
        int int19 = mongoDBRiverDefinition18.getThrottleSize();
        java.lang.String str20 = mongoDBRiverDefinition18.getUSER_FIELD();
        docScoreSearchScript0.setNextVar("include_fields", (java.lang.Object) str20);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter23 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings24 = serializedObjectSupporter23.deserializeObjectRiverSettings3();
        java.lang.String str25 = serializedObjectSupporter23.deserializeObjectString5();
        java.lang.String str26 = serializedObjectSupporter23.deserializeObjectString4();
        java.lang.String str27 = serializedObjectSupporter23.deserializeObjectString3();
        java.lang.String str28 = serializedObjectSupporter23.deserializeObjectString2();
        org.elasticsearch.river.RiverSettings riverSettings29 = serializedObjectSupporter23.deserializeObjectRiverSettings4();
        org.elasticsearch.common.settings.Settings settings30 = riverSettings29.globalSettings();
        docScoreSearchScript0.setNextVar("import_all_collections", (java.lang.Object) riverSettings29);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long32 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test535");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("name", "size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test536");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("parent_types", "size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test537");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("exclude_fields", "credentials");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test538");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("concurrent_requests", "collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test539");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "local");
        docScoreSearchScript0.setNextScore(1.0f);
        docScoreSearchScript0.setNextScore((float) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        builder8.mongoAdminPassword = "";
        builder8.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder8.importAllCollections(true);
        builder16.setincludeCollection("mongodb-1638820218299");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder16.throttleSize((int) ' ');
        int int21 = builder20.throttleSize;
        docScoreSearchScript0.setNextVar("concurrent_bulk_requests.null", (java.lang.Object) builder20);
        docScoreSearchScript0.setNextScore((float) 30000);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter25 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings26 = serializedObjectSupporter25.deserializeObjectRiverSettings3();
        org.elasticsearch.river.RiverSettings riverSettings27 = serializedObjectSupporter25.deserializeObjectRiverSettings2();
        org.elasticsearch.river.RiverSettings riverSettings28 = serializedObjectSupporter25.deserializeObjectRiverSettings4();
        java.lang.String str29 = serializedObjectSupporter25.deserializeObjectString14();
        java.lang.String str30 = serializedObjectSupporter25.deserializeObjectString5();
        org.elasticsearch.river.RiverSettings riverSettings31 = serializedObjectSupporter25.deserializeObjectRiverSettings7();
        java.lang.String str32 = serializedObjectSupporter25.deserializeObjectString16();
        java.lang.Object obj33 = docScoreSearchScript0.unwrap((java.lang.Object) serializedObjectSupporter25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double34 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test540");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("null.null", "collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test541");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("concurrent_bulk_requests", "sandbox");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test542");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("credentials", "filter");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test543");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("index", "size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test544");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("_river", "db");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test545");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("admin", "drop_collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test546");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218449", "credentials");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test547");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("admin", "secret");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test548");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("null.null", "mongodb-1638820218264");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test549");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "local");
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        docScoreSearchScript0.setNextScore((float) (short) -1);
        docScoreSearchScript0.setNextScore((float) 10L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj9 = docScoreSearchScript0.run();
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test550");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218424", "gridfs");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test551");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("password", "sandbox");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test552");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("credentials", "options");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test553");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "mydatabase");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test554");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("null.null", "mongodb-1638820218424");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test555");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("port", "script_type");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test556");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("host", "port");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test557");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "local");
        docScoreSearchScript0.setNextScore((float) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder6);
        builder6.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder6.mongoSecondaryReadPreference(true);
        builder6.includeCollection = "socket_timeout";
        builder6.setmongoAdminUser("collection");
        java.lang.String str17 = builder6.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition18 = builder6.build();
        int int19 = mongoDBRiverDefinition18.getThrottleSize();
        java.lang.String str20 = mongoDBRiverDefinition18.getUSER_FIELD();
        docScoreSearchScript0.setNextVar("include_fields", (java.lang.Object) str20);
        docScoreSearchScript0.setNextScore((float) 2000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder24);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition26 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder24);
        builder24.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder24.mongoSecondaryReadPreference(true);
        builder24.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder24.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.includeCollection("mongodb-1638820218299");
        builder34.setmongoDb("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder34.mongoUseSSL(false);
        com.mongodb.BasicDBObject basicDBObject41 = builder34.mongoCollectionFilter;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition42 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder34);
        java.lang.String str43 = mongoDBRiverDefinition42.getUSER_FIELD();
        java.lang.String str44 = mongoDBRiverDefinition42.getSCRIPT_FIELD();
        java.lang.String str45 = mongoDBRiverDefinition42.getSCRIPT_TYPE_FIELD();
        java.lang.Object obj46 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition42);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(97);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test558");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("admin", "advanced_transformation");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test559");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("filter", "script.default_lang");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test560");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("ssl", "store_statistics");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test561");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820217755", "mongodb-1638820218299");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test562");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("exclude_fields", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test563");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("import_all_collections", "concurrent_bulk_requests.null");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test564");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "connect_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test565");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder3);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder3);
        builder3.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder3.mongoSecondaryReadPreference(true);
        builder3.includeCollection = "socket_timeout";
        com.mongodb.ServerAddress[] serverAddressArray12 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList13 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList13, serverAddressArray12);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder3.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.isMongos((java.lang.Boolean) true);
        boolean boolean18 = builder15.getadvancedTransformation();
        builder15.setmongoSSLVerifyCertificate(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder15.mongoLocalPassword("bulk_timeout");
        builder22.disableIndexRefresh = true;
        java.lang.Object obj25 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter27 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings28 = serializedObjectSupporter27.deserializeObjectRiverSettings3();
        org.elasticsearch.river.RiverSettings riverSettings29 = serializedObjectSupporter27.deserializeObjectRiverSettings2();
        java.lang.String str30 = serializedObjectSupporter27.deserializeObjectString6();
        java.lang.String str31 = serializedObjectSupporter27.deserializeObjectString11();
        java.lang.String str32 = serializedObjectSupporter27.deserializeObjectString5();
        org.elasticsearch.river.RiverSettings riverSettings33 = serializedObjectSupporter27.deserializeObjectRiverSettings7();
        docScoreSearchScript0.setNextVar("mongodb-1638820218299", (java.lang.Object) serializedObjectSupporter27);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition37 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder36);
        java.lang.String str38 = mongoDBRiverDefinition37.mongoDb;
        java.lang.String str39 = mongoDBRiverDefinition37.getCONCURRENT_BULK_REQUESTS_FIELD();
        java.lang.String str40 = mongoDBRiverDefinition37.getMongoLocalUser();
        boolean boolean41 = mongoDBRiverDefinition37.isAdvancedTransformation();
        int int42 = mongoDBRiverDefinition37.connectTimeout;
        java.lang.String str43 = mongoDBRiverDefinition37.getStatisticsTypeName();
        java.lang.String str44 = mongoDBRiverDefinition37.getDEFAULT_DB_HOST();
        int int45 = mongoDBRiverDefinition37.throttleSize;
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) int45);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double47 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test566");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mydatabase", "disable_index_refresh");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test567");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mycollection", "mycollection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test568");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 60000);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter3 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings4 = serializedObjectSupporter3.deserializeObjectRiverSettings3();
        java.lang.String str5 = serializedObjectSupporter3.deserializeObjectString5();
        org.elasticsearch.river.RiverSettings riverSettings6 = serializedObjectSupporter3.deserializeObjectRiverSettings2();
        java.lang.String str7 = serializedObjectSupporter3.deserializeObjectString4();
        org.elasticsearch.river.RiverSettings riverSettings8 = serializedObjectSupporter3.deserializeObjectRiverSettings7();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = riverSettings8.settings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource(strMap9);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test569");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("disable_index_refresh", "name");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test570");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("actions", "user");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test571");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("size", "throttle_size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test572");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("options", "password");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test573");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("local", "mongodb-1638820218387");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test574");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "local");
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter3 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings4 = serializedObjectSupporter3.deserializeObjectRiverSettings3();
        org.elasticsearch.river.RiverSettings riverSettings5 = serializedObjectSupporter3.deserializeObjectRiverSettings8();
        org.elasticsearch.river.RiverSettings riverSettings6 = serializedObjectSupporter3.deserializeObjectRiverSettings7();
        org.elasticsearch.river.RiverSettings riverSettings7 = serializedObjectSupporter3.deserializeObjectRiverSettings2();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = riverSettings7.settings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource(strMap8);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test575");
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
        docScoreSearchScript0.setNextScore((float) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long27 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test576");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_size", "mongodb-1638820218408");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test577");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("include_collection", "bulk");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test578");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218424", "options");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test579");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "bulk_size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test580");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("throttle_size", "mongodb-1638820218299");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test581");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("concurrent_bulk_requests", "ssl");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test582");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey(".scripts", "socket_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test583");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("concurrent_bulk_requests.null", "ssl");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test584");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218408", "mongodb-1638820218387");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test585");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "_river");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test586");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder3);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder3);
        builder3.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder3.mongoSecondaryReadPreference(true);
        builder3.includeCollection = "socket_timeout";
        com.mongodb.ServerAddress[] serverAddressArray12 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList13 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList13, serverAddressArray12);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder3.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.isMongos((java.lang.Boolean) true);
        boolean boolean18 = builder15.getadvancedTransformation();
        builder15.setmongoSSLVerifyCertificate(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder15.mongoLocalPassword("bulk_timeout");
        builder22.disableIndexRefresh = true;
        java.lang.Object obj25 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter27 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings28 = serializedObjectSupporter27.deserializeObjectRiverSettings3();
        org.elasticsearch.river.RiverSettings riverSettings29 = serializedObjectSupporter27.deserializeObjectRiverSettings2();
        java.lang.String str30 = serializedObjectSupporter27.deserializeObjectString6();
        java.lang.String str31 = serializedObjectSupporter27.deserializeObjectString11();
        java.lang.String str32 = serializedObjectSupporter27.deserializeObjectString5();
        org.elasticsearch.river.RiverSettings riverSettings33 = serializedObjectSupporter27.deserializeObjectRiverSettings7();
        docScoreSearchScript0.setNextVar("mongodb-1638820218299", (java.lang.Object) serializedObjectSupporter27);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition37 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder36);
        java.lang.String str38 = mongoDBRiverDefinition37.mongoDb;
        java.lang.String str39 = mongoDBRiverDefinition37.getCONCURRENT_BULK_REQUESTS_FIELD();
        java.lang.String str40 = mongoDBRiverDefinition37.getMongoLocalUser();
        boolean boolean41 = mongoDBRiverDefinition37.isAdvancedTransformation();
        int int42 = mongoDBRiverDefinition37.connectTimeout;
        java.lang.String str43 = mongoDBRiverDefinition37.getStatisticsTypeName();
        java.lang.String str44 = mongoDBRiverDefinition37.getDEFAULT_DB_HOST();
        int int45 = mongoDBRiverDefinition37.throttleSize;
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) int45);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory47 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition49 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder48);
        java.lang.String str50 = mongoDBRiverDefinition49.mongoDb;
        java.lang.String str51 = mongoDBRiverDefinition49.getCONCURRENT_BULK_REQUESTS_FIELD();
        int int52 = mongoDBRiverDefinition49.throttleSize;
        boolean boolean53 = mongoDBRiverDefinition49.getskipInitialImport();
        java.lang.String str54 = mongoDBRiverDefinition49.getScriptType();
        java.lang.String str55 = mongoDBRiverDefinition49.getSIZE_FIELD();
        java.lang.String str56 = mongoDBRiverDefinition49.statisticsIndexName;
        java.lang.String str57 = mongoDBRiverDefinition49.getMongoLocalUser();
        com.mongodb.BasicDBObject basicDBObject58 = mongoDBRiverDefinition49.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript59 = docScoreNativeScriptFactory47.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject58);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition61 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder60);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition62 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder60);
        builder60.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder66 = builder60.mongoSecondaryReadPreference(true);
        builder60.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder70 = builder60.mongoDb("concurrent_bulk_requests");
        java.lang.String str71 = builder70.statisticsIndexName;
        com.mongodb.BasicDBObject basicDBObject72 = builder70.getmongoOplogFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder73 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition74 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder73);
        java.lang.String str75 = mongoDBRiverDefinition74.mongoDb;
        java.lang.String str76 = mongoDBRiverDefinition74.getCONCURRENT_BULK_REQUESTS_FIELD();
        int int77 = mongoDBRiverDefinition74.throttleSize;
        boolean boolean78 = mongoDBRiverDefinition74.getskipInitialImport();
        java.lang.String str79 = mongoDBRiverDefinition74.getScriptType();
        com.mongodb.BasicDBObject basicDBObject80 = mongoDBRiverDefinition74.mongoCollectionFilter;
        builder70.mongoCollectionFilter = basicDBObject80;
        org.elasticsearch.script.ExecutableScript executableScript82 = docScoreNativeScriptFactory47.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject80);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject80);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test587");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "disable_index_refresh");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test588");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("include_fields", "drop_collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test589");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mycollection", "concurrent_bulk_requests.null");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test590");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "is_mongos");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test591");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("import_all_collections", "include_collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test592");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("is_mongos", "bulk_size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test593");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("exclude_fields", "gridfs");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test594");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("flush_interval", "mongodb-1638820218387");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test595");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "local");
        docScoreSearchScript0.setNextScore((float) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder6);
        builder6.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder6.mongoSecondaryReadPreference(true);
        builder6.includeCollection = "socket_timeout";
        builder6.setmongoAdminUser("collection");
        java.lang.String str17 = builder6.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition18 = builder6.build();
        int int19 = mongoDBRiverDefinition18.getThrottleSize();
        java.lang.String str20 = mongoDBRiverDefinition18.getUSER_FIELD();
        docScoreSearchScript0.setNextVar("include_fields", (java.lang.Object) str20);
        docScoreSearchScript0.setNextScore((float) 2000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder24);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition26 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder24);
        builder24.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder24.mongoSecondaryReadPreference(true);
        builder24.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder24.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.includeCollection("mongodb-1638820218299");
        builder34.setmongoDb("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder34.mongoUseSSL(false);
        com.mongodb.BasicDBObject basicDBObject41 = builder34.mongoCollectionFilter;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition42 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder34);
        java.lang.String str43 = mongoDBRiverDefinition42.getUSER_FIELD();
        java.lang.String str44 = mongoDBRiverDefinition42.getSCRIPT_FIELD();
        java.lang.String str45 = mongoDBRiverDefinition42.getSCRIPT_TYPE_FIELD();
        java.lang.Object obj46 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition42);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition49 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder48);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition50 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder48);
        builder48.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder48.mongoSecondaryReadPreference(true);
        builder48.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = builder48.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder58.includeCollection("mongodb-1638820218299");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition61 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder60);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = builder60.statisticsTypeName("socket_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition64 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder63);
        java.lang.String str65 = mongoDBRiverDefinition64.getADMIN_DB_FIELD();
        java.lang.String str66 = mongoDBRiverDefinition64.getSOCKET_TIMEOUT();
        boolean boolean67 = mongoDBRiverDefinition64.advancedTransformation;
        java.lang.String str68 = mongoDBRiverDefinition64.getFILTER_FIELD();
        docScoreSearchScript0.setNextVar("concurrent_requests", (java.lang.Object) mongoDBRiverDefinition64);
        docScoreSearchScript0.setNextScore((float) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj72 = docScoreSearchScript0.run();
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test596");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("myindex", "script_type");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test597");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218424", "index");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test598");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mydatabase", "flush_interval");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test599");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "local");
        docScoreSearchScript0.setNextScore((float) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder6);
        builder6.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder6.mongoSecondaryReadPreference(true);
        builder6.includeCollection = "socket_timeout";
        builder6.setmongoAdminUser("collection");
        java.lang.String str17 = builder6.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition18 = builder6.build();
        int int19 = mongoDBRiverDefinition18.getThrottleSize();
        java.lang.String str20 = mongoDBRiverDefinition18.getUSER_FIELD();
        docScoreSearchScript0.setNextVar("include_fields", (java.lang.Object) str20);
        docScoreSearchScript0.setNextScore((float) 2000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder24);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition26 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder24);
        builder24.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder24.mongoSecondaryReadPreference(true);
        builder24.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder24.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.includeCollection("mongodb-1638820218299");
        builder34.setmongoDb("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder34.mongoUseSSL(false);
        com.mongodb.BasicDBObject basicDBObject41 = builder34.mongoCollectionFilter;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition42 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder34);
        java.lang.String str43 = mongoDBRiverDefinition42.getUSER_FIELD();
        java.lang.String str44 = mongoDBRiverDefinition42.getSCRIPT_FIELD();
        java.lang.String str45 = mongoDBRiverDefinition42.getSCRIPT_TYPE_FIELD();
        java.lang.Object obj46 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition42);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition49 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder48);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition50 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder48);
        builder48.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder48.mongoSecondaryReadPreference(true);
        builder48.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = builder48.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder58.includeCollection("mongodb-1638820218299");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition61 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder60);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = builder60.statisticsTypeName("socket_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition64 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder63);
        java.lang.String str65 = mongoDBRiverDefinition64.getADMIN_DB_FIELD();
        java.lang.String str66 = mongoDBRiverDefinition64.getSOCKET_TIMEOUT();
        boolean boolean67 = mongoDBRiverDefinition64.advancedTransformation;
        java.lang.String str68 = mongoDBRiverDefinition64.getFILTER_FIELD();
        docScoreSearchScript0.setNextVar("concurrent_requests", (java.lang.Object) mongoDBRiverDefinition64);
        docScoreSearchScript0.setNextScore((float) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float72 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test600");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("collection", "socket_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test601");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_size", "ssl_verify_certificate");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test602");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("exclude_fields", "user");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test603");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("local", "hi!");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test604");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("actions", "concurrent_bulk_requests");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test605");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "local");
        docScoreSearchScript0.setNextScore(1.0f);
        docScoreSearchScript0.setNextScore((float) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        builder8.mongoAdminPassword = "";
        builder8.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder8.importAllCollections(true);
        builder16.setincludeCollection("mongodb-1638820218299");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder16.throttleSize((int) ' ');
        int int21 = builder20.throttleSize;
        docScoreSearchScript0.setNextVar("concurrent_bulk_requests.null", (java.lang.Object) builder20);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder23);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder23);
        builder23.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder23.mongoSecondaryReadPreference(true);
        builder23.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder23.mongoDb("concurrent_bulk_requests");
        boolean boolean34 = builder33.getmongoSSLVerifyCertificate();
        java.lang.String str35 = builder33.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder33.connectTimeout(27017);
        com.mongodb.BasicDBObject basicDBObject38 = builder37.mongoOplogFilter;
        builder37.mongoLocalPassword = "throttle_size";
        java.lang.Object obj41 = docScoreSearchScript0.unwrap((java.lang.Object) builder37);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition44 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder43);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition45 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder43);
        builder43.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder43.mongoSecondaryReadPreference(true);
        builder43.includeCollection = "socket_timeout";
        com.mongodb.ServerAddress[] serverAddressArray52 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList53 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList53, serverAddressArray52);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder43.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList53);
        int int56 = builder43.getconnectTimeout();
        java.lang.String str57 = builder43.getincludeCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = builder43.mongoLocalUser("mongodb-1638820218424");
        docScoreSearchScript0.setNextVar("mycollection", (java.lang.Object) builder59);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition62 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder61);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder64 = builder61.script("filter");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder66 = builder61.mongoGridFS(false);
        java.lang.String str67 = builder66.scriptType;
        java.util.Set<java.lang.String> strSet68 = builder66.getexcludeFields();
        builder66.setadvancedTransformation(true);
        java.lang.Object obj71 = docScoreSearchScript0.unwrap((java.lang.Object) builder66);
        docScoreSearchScript0.setNextScore((float) (-1L));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float74 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test606");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder4);
        java.lang.String str6 = mongoDBRiverDefinition5.mongoDb;
        java.lang.String str7 = mongoDBRiverDefinition5.mongoAdminPassword;
        int int8 = mongoDBRiverDefinition5.getThrottleSize();
        java.lang.String str9 = mongoDBRiverDefinition5.mongoLocalUser;
        boolean boolean10 = mongoDBRiverDefinition5.getmongoUseSSL();
        boolean boolean11 = mongoDBRiverDefinition5.isMongoSecondaryReadPreference();
        docScoreSearchScript0.setNextVar("parent_types", (java.lang.Object) boolean11);
        docScoreSearchScript0.setNextScore((float) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double15 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test607");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("store_statistics", "db");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test608");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("myindex", "mongodb-1638820218326");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test609");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("drop_collection", "mongodb-1638820218408");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test610");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("port", "socket_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test611");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("include_collection", "initial_timestamp");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test612");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script.default_lang", "drop_collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test613");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder4);
        java.lang.String str6 = mongoDBRiverDefinition5.mongoDb;
        java.lang.String str7 = mongoDBRiverDefinition5.mongoAdminPassword;
        int int8 = mongoDBRiverDefinition5.getThrottleSize();
        java.lang.String str9 = mongoDBRiverDefinition5.mongoLocalUser;
        boolean boolean10 = mongoDBRiverDefinition5.getmongoUseSSL();
        boolean boolean11 = mongoDBRiverDefinition5.isMongoSecondaryReadPreference();
        docScoreSearchScript0.setNextVar("parent_types", (java.lang.Object) boolean11);
        docScoreSearchScript0.setNextScore((float) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj15 = docScoreSearchScript0.run();
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test614");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("socket_timeout", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test615");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218449", "initial_timestamp");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test616");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script.default_lang", "db");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test617");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("archive-stats", "mycollection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test618");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "local");
        docScoreSearchScript0.setNextScore(1.0f);
        docScoreSearchScript0.setNextScore((float) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        builder8.mongoAdminPassword = "";
        builder8.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder8.importAllCollections(true);
        builder16.setincludeCollection("mongodb-1638820218299");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder16.throttleSize((int) ' ');
        int int21 = builder20.throttleSize;
        docScoreSearchScript0.setNextVar("concurrent_bulk_requests.null", (java.lang.Object) builder20);
        docScoreSearchScript0.setNextScore((float) 60000);
        docScoreSearchScript0.setNextVar("flush_interval", (java.lang.Object) "store_statistics");
        docScoreSearchScript0.setNextScore((float) 100L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float30 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test619");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("sandbox", "filter");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test620");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("exclude_fields", "import_all_collections");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test621");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("include_fields", "local");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test622");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218408", "_river");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test623");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("actions", "mongodb-1638820218326");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test624");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("filter", "archive-stats");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test625");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218326", "servers");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }
}

