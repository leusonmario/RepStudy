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
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("hi!", "hi!");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("size", "admin");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("filter", "local");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("concurrent_bulk_requests", "include_collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("collection", "script.default_lang");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("password", "drop_collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(27017);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("_river", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218299", "filter");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("filter", "options");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "socket_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("password", "skip_initial_import");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("disable_index_refresh", "hi!");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("is_mongos", "local");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("user", "parent_types");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "local");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder3);
        java.lang.String str5 = mongoDBRiverDefinition4.mongoDb;
        java.lang.String str6 = mongoDBRiverDefinition4.getCONCURRENT_BULK_REQUESTS_FIELD();
        int int7 = mongoDBRiverDefinition4.throttleSize;
        boolean boolean8 = mongoDBRiverDefinition4.getskipInitialImport();
        java.lang.String str9 = mongoDBRiverDefinition4.getScriptType();
        com.mongodb.BasicDBObject basicDBObject10 = mongoDBRiverDefinition4.mongoCollectionFilter;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject10);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj1 = docScoreSearchScript0.run();
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("local", "servers");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("concurrent_requests", "bulk_size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "local");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long3 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 60000);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double3 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 60000);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj3 = docScoreSearchScript0.run();
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("_river", "servers");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("gridfs", "servers");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "local");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject38);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("password", "localhost");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script.disable_dynamic", "admin");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey(".scripts", "disable_index_refresh");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "local");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) '#');
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script.default_lang", "local");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_timeout", "drop_collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218363", "credentials");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder1);
        builder1.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder1.mongoSecondaryReadPreference(true);
        builder1.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder1.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.includeCollection("mongodb-1638820218299");
        builder11.setmongoDb("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder11.mongoUseSSL(false);
        com.mongodb.BasicDBObject basicDBObject18 = builder11.mongoCollectionFilter;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("admin", "bulk_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("include_collection", "mongodb-1638820218363");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("admin", "local");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("localhost", "script");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "script_type");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "bulk_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218264", "initial_timestamp");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("filter", "secondary_read_preference");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 60000);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long3 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 60000);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (byte) 10);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "local");
        docScoreSearchScript0.setNextScore(1.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        builder5.mongoAdminPassword = "";
        builder5.socketTimeout = (short) 0;
        boolean boolean12 = builder5.storeStatistics;
        builder5.scriptType = "mongodb-1638820218299";
        java.lang.String[] strArray16 = new java.lang.String[] { "mongodb-1638820218299" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder5.excludeFields((java.util.Set<java.lang.String>) strSet17);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder20);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder20);
        builder20.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder20.mongoSecondaryReadPreference(true);
        builder20.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder20.mongoDb("concurrent_bulk_requests");
        java.lang.String str31 = builder30.statisticsIndexName;
        com.mongodb.BasicDBObject basicDBObject32 = builder30.getmongoOplogFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition34 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder33);
        java.lang.String str35 = mongoDBRiverDefinition34.mongoDb;
        java.lang.String str36 = mongoDBRiverDefinition34.getCONCURRENT_BULK_REQUESTS_FIELD();
        int int37 = mongoDBRiverDefinition34.throttleSize;
        boolean boolean38 = mongoDBRiverDefinition34.getskipInitialImport();
        java.lang.String str39 = mongoDBRiverDefinition34.getScriptType();
        com.mongodb.BasicDBObject basicDBObject40 = mongoDBRiverDefinition34.mongoCollectionFilter;
        builder30.mongoCollectionFilter = basicDBObject40;
        builder19.mongoCollectionFilter = basicDBObject40;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject40);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("servers", "bulk");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("ssl", "mongodb-1638820217755");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("credentials", "import_all_collections");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("password", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "local");
        docScoreSearchScript0.setNextScore(1.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float5 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("host", "exclude_fields");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("port", "localhost");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey(".scripts", "script.disable_dynamic");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("include_fields", "is_mongos");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "local");
        docScoreSearchScript0.setNextScore(1.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj5 = docScoreSearchScript0.run();
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double1 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218363", "drop_collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("filter", "mongodb-1638820218387");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 60000);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) 'a');
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "ssl_verify_certificate");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218408", "connect_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float1 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 60000);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float3 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820217755", "mongodb-1638820218264");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk", "skip_initial_import");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 60000);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter3 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str4 = serializedObjectSupporter3.deserializeObjectString18();
        org.elasticsearch.river.RiverSettings riverSettings5 = serializedObjectSupporter3.deserializeObjectRiverSettings7();
        org.elasticsearch.river.RiverSettings riverSettings6 = serializedObjectSupporter3.deserializeObjectRiverSettings2();
        org.elasticsearch.river.RiverSettings riverSettings7 = serializedObjectSupporter3.deserializeObjectRiverSettings8();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = riverSettings7.settings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource(strMap8);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("include_fields", "script_type");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_size", "_river");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("password", "include_collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey(".scripts", "mongodb-1638820218387");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey(".scripts", "admin");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("ssl", "filter");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "local");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double3 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("connect_timeout", "mongodb-1638820218424");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk", "script");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "secret");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "local");
        docScoreSearchScript0.setNextScore(1.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double5 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("host", "ssl_verify_certificate");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "index");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "local");
        docScoreSearchScript0.setNextScore(1.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.util.Set<java.lang.String> strSet7 = builder5.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        builder8.mongoAdminPassword = "";
        builder8.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder8.importAllCollections(true);
        java.lang.String str17 = builder16.getmongoAdminPassword();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder16.mongoLocalPassword("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder20);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder20);
        builder20.mongoAdminPassword = "";
        builder20.socketTimeout = (short) 0;
        boolean boolean27 = builder20.storeStatistics;
        builder20.scriptType = "mongodb-1638820218299";
        java.lang.String[] strArray31 = new java.lang.String[] { "mongodb-1638820218299" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder20.excludeFields((java.util.Set<java.lang.String>) strSet32);
        builder16.setexcludeFields((java.util.Set<java.lang.String>) strSet32);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder5.parentTypes((java.util.Set<java.lang.String>) strSet32);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition38 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder37);
        java.lang.String str39 = mongoDBRiverDefinition38.mongoDb;
        int int40 = mongoDBRiverDefinition38.throttleSize;
        int int41 = mongoDBRiverDefinition38.getDEFAULT_BULK_ACTIONS();
        java.lang.String str42 = mongoDBRiverDefinition38.getMongoLocalPassword();
        com.mongodb.BasicDBObject basicDBObject43 = mongoDBRiverDefinition38.mongoCollectionFilter;
        builder36.setmongoOplogFilter(basicDBObject43);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject43);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("gridfs", "script_type");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_timeout", "port");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("host", "secret");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_size", "null.null");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long1 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218387", "servers");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("throttle_size", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("disable_index_refresh", "advanced_transformation");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("host", "index");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("servers", "mongodb-1638820218363");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script.disable_dynamic", "port");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script_type", "name");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218299", "bulk");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("index", "credentials");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mydatabase.mycollection", "index");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218264", "sandbox");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_size", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double25 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("port", "host");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script.default_lang", "disable_index_refresh");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218449", ".scripts");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder4);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder4);
        builder4.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder4.mongoSecondaryReadPreference(true);
        builder4.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder4.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.includeCollection("mongodb-1638820218299");
        builder14.setmongoDb("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder14.mongoUseSSL(false);
        java.lang.String str21 = builder14.getindexName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder14.mongoAdminUser("localhost");
        builder23.settypeName("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder26);
        java.util.Set<java.lang.String> strSet28 = builder26.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition30 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder29);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition31 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder29);
        builder29.mongoAdminPassword = "";
        builder29.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder29.importAllCollections(true);
        java.lang.String str38 = builder37.getmongoAdminPassword();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder37.mongoLocalPassword("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition42 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder41);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition43 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder41);
        builder41.mongoAdminPassword = "";
        builder41.socketTimeout = (short) 0;
        boolean boolean48 = builder41.storeStatistics;
        builder41.scriptType = "mongodb-1638820218299";
        java.lang.String[] strArray52 = new java.lang.String[] { "mongodb-1638820218299" };
        java.util.LinkedHashSet<java.lang.String> strSet53 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet53, strArray52);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder41.excludeFields((java.util.Set<java.lang.String>) strSet53);
        builder37.setexcludeFields((java.util.Set<java.lang.String>) strSet53);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder26.parentTypes((java.util.Set<java.lang.String>) strSet53);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition59 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder58);
        java.lang.String str60 = mongoDBRiverDefinition59.mongoDb;
        int int61 = mongoDBRiverDefinition59.throttleSize;
        int int62 = mongoDBRiverDefinition59.getDEFAULT_BULK_ACTIONS();
        java.lang.String str63 = mongoDBRiverDefinition59.getMongoLocalPassword();
        com.mongodb.BasicDBObject basicDBObject64 = mongoDBRiverDefinition59.mongoCollectionFilter;
        builder57.setmongoOplogFilter(basicDBObject64);
        builder23.setmongoOplogFilter(basicDBObject64);
        docScoreSearchScript0.setNextVar("bulk_size", (java.lang.Object) builder23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double68 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("options", "socket_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "credentials");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 60000);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter4 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings5 = serializedObjectSupporter4.deserializeObjectRiverSettings3();
        java.lang.String str6 = serializedObjectSupporter4.deserializeObjectString5();
        java.lang.String str7 = serializedObjectSupporter4.deserializeObjectString14();
        java.lang.String str8 = serializedObjectSupporter4.deserializeObjectString8();
        docScoreSearchScript0.setNextVar("mongodb-1638820218424", (java.lang.Object) str8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder11);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder11);
        builder11.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder11.mongoSecondaryReadPreference(true);
        builder11.includeCollection = "socket_timeout";
        com.mongodb.ServerAddress[] serverAddressArray20 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList21 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList21, serverAddressArray20);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder11.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList21);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder11);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder11.riverIndexName("skip_initial_import");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder27);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition29 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder27);
        builder27.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder27.mongoSecondaryReadPreference(true);
        builder27.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder27.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder37.includeCollection("mongodb-1638820218299");
        int int40 = builder37.connectTimeout;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition42 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder41);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition43 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder41);
        builder41.mongoAdminPassword = "";
        builder41.socketTimeout = (short) 0;
        boolean boolean48 = builder41.storeStatistics;
        builder41.scriptType = "mongodb-1638820218299";
        java.lang.String[] strArray52 = new java.lang.String[] { "mongodb-1638820218299" };
        java.util.LinkedHashSet<java.lang.String> strSet53 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet53, strArray52);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder41.excludeFields((java.util.Set<java.lang.String>) strSet53);
        builder37.setincludeFields((java.util.Set<java.lang.String>) strSet53);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder26.parentTypes((java.util.Set<java.lang.String>) strSet53);
        int int58 = builder57.connectTimeout;
        docScoreSearchScript0.setNextVar("user", (java.lang.Object) builder57);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj60 = docScoreSearchScript0.run();
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("connect_timeout", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("initial_timestamp", "hi!");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("ssl", "secret");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder4);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder4);
        builder4.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder4.mongoSecondaryReadPreference(true);
        builder4.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder4.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.includeCollection("mongodb-1638820218299");
        builder14.setmongoDb("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder14.mongoUseSSL(false);
        java.lang.String str21 = builder14.getindexName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder14.mongoAdminUser("localhost");
        builder23.settypeName("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder26);
        java.util.Set<java.lang.String> strSet28 = builder26.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition30 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder29);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition31 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder29);
        builder29.mongoAdminPassword = "";
        builder29.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder29.importAllCollections(true);
        java.lang.String str38 = builder37.getmongoAdminPassword();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder37.mongoLocalPassword("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition42 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder41);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition43 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder41);
        builder41.mongoAdminPassword = "";
        builder41.socketTimeout = (short) 0;
        boolean boolean48 = builder41.storeStatistics;
        builder41.scriptType = "mongodb-1638820218299";
        java.lang.String[] strArray52 = new java.lang.String[] { "mongodb-1638820218299" };
        java.util.LinkedHashSet<java.lang.String> strSet53 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet53, strArray52);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder41.excludeFields((java.util.Set<java.lang.String>) strSet53);
        builder37.setexcludeFields((java.util.Set<java.lang.String>) strSet53);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder26.parentTypes((java.util.Set<java.lang.String>) strSet53);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition59 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder58);
        java.lang.String str60 = mongoDBRiverDefinition59.mongoDb;
        int int61 = mongoDBRiverDefinition59.throttleSize;
        int int62 = mongoDBRiverDefinition59.getDEFAULT_BULK_ACTIONS();
        java.lang.String str63 = mongoDBRiverDefinition59.getMongoLocalPassword();
        com.mongodb.BasicDBObject basicDBObject64 = mongoDBRiverDefinition59.mongoCollectionFilter;
        builder57.setmongoOplogFilter(basicDBObject64);
        builder23.setmongoOplogFilter(basicDBObject64);
        docScoreSearchScript0.setNextVar("bulk_size", (java.lang.Object) builder23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(27017);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mydatabase", "script.default_lang");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("ssl", "bulk_size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 60000);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter4 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings5 = serializedObjectSupporter4.deserializeObjectRiverSettings3();
        java.lang.String str6 = serializedObjectSupporter4.deserializeObjectString5();
        java.lang.String str7 = serializedObjectSupporter4.deserializeObjectString14();
        java.lang.String str8 = serializedObjectSupporter4.deserializeObjectString8();
        docScoreSearchScript0.setNextVar("mongodb-1638820218424", (java.lang.Object) str8);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter10 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings11 = serializedObjectSupporter10.deserializeObjectRiverSettings3();
        org.elasticsearch.river.RiverSettings riverSettings12 = serializedObjectSupporter10.deserializeObjectRiverSettings2();
        java.lang.String str13 = serializedObjectSupporter10.deserializeObjectString6();
        java.lang.String str14 = serializedObjectSupporter10.deserializeObjectString11();
        org.elasticsearch.river.RiverSettings riverSettings15 = serializedObjectSupporter10.deserializeObjectRiverSettings6();
        org.elasticsearch.common.settings.Settings settings16 = riverSettings15.globalSettings();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder17);
        java.util.Set<java.lang.String> strSet19 = builder17.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder20);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder20);
        builder20.mongoAdminPassword = "";
        builder20.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder20.importAllCollections(true);
        java.lang.String str29 = builder28.getmongoAdminPassword();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder28.mongoLocalPassword("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition33 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder32);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition34 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder32);
        builder32.mongoAdminPassword = "";
        builder32.socketTimeout = (short) 0;
        boolean boolean39 = builder32.storeStatistics;
        builder32.scriptType = "mongodb-1638820218299";
        java.lang.String[] strArray43 = new java.lang.String[] { "mongodb-1638820218299" };
        java.util.LinkedHashSet<java.lang.String> strSet44 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet44, strArray43);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder32.excludeFields((java.util.Set<java.lang.String>) strSet44);
        builder28.setexcludeFields((java.util.Set<java.lang.String>) strSet44);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder17.parentTypes((java.util.Set<java.lang.String>) strSet44);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition50 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder49);
        java.lang.String str51 = mongoDBRiverDefinition50.mongoDb;
        int int52 = mongoDBRiverDefinition50.throttleSize;
        int int53 = mongoDBRiverDefinition50.getDEFAULT_BULK_ACTIONS();
        java.lang.String str54 = mongoDBRiverDefinition50.getMongoLocalPassword();
        com.mongodb.BasicDBObject basicDBObject55 = mongoDBRiverDefinition50.mongoCollectionFilter;
        builder48.setmongoOplogFilter(basicDBObject55);
        org.elasticsearch.river.RiverSettings riverSettings57 = new org.elasticsearch.river.RiverSettings(settings16, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject55);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject55);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double25 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("store_statistics", "mongodb-1638820218299");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script.default_lang", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("drop_collection", "secret");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "local");
        docScoreSearchScript0.setNextScore(1.0f);
        docScoreSearchScript0.setNextScore((float) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float7 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("gridfs", "type");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("size", "script.disable_dynamic");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mydatabase.mycollection", "parent_types");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("socket_timeout", "host");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("collection", "actions");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("connect_timeout", "mongodb-1638820218449");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script.disable_dynamic", "exclude_fields");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 60000);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter4 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings5 = serializedObjectSupporter4.deserializeObjectRiverSettings3();
        java.lang.String str6 = serializedObjectSupporter4.deserializeObjectString5();
        java.lang.String str7 = serializedObjectSupporter4.deserializeObjectString14();
        java.lang.String str8 = serializedObjectSupporter4.deserializeObjectString8();
        docScoreSearchScript0.setNextVar("mongodb-1638820218424", (java.lang.Object) str8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder11);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder11);
        builder11.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder11.mongoSecondaryReadPreference(true);
        builder11.includeCollection = "socket_timeout";
        com.mongodb.ServerAddress[] serverAddressArray20 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList21 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList21, serverAddressArray20);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder11.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList21);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder11);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder11.riverIndexName("skip_initial_import");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder27);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition29 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder27);
        builder27.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder27.mongoSecondaryReadPreference(true);
        builder27.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder27.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder37.includeCollection("mongodb-1638820218299");
        int int40 = builder37.connectTimeout;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition42 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder41);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition43 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder41);
        builder41.mongoAdminPassword = "";
        builder41.socketTimeout = (short) 0;
        boolean boolean48 = builder41.storeStatistics;
        builder41.scriptType = "mongodb-1638820218299";
        java.lang.String[] strArray52 = new java.lang.String[] { "mongodb-1638820218299" };
        java.util.LinkedHashSet<java.lang.String> strSet53 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet53, strArray52);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder41.excludeFields((java.util.Set<java.lang.String>) strSet53);
        builder37.setincludeFields((java.util.Set<java.lang.String>) strSet53);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder26.parentTypes((java.util.Set<java.lang.String>) strSet53);
        int int58 = builder57.connectTimeout;
        docScoreSearchScript0.setNextVar("user", (java.lang.Object) builder57);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition61 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder60);
        java.lang.String str62 = mongoDBRiverDefinition61.mongoDb;
        java.lang.String str63 = mongoDBRiverDefinition61.getCONCURRENT_BULK_REQUESTS_FIELD();
        int int64 = mongoDBRiverDefinition61.throttleSize;
        boolean boolean65 = mongoDBRiverDefinition61.getskipInitialImport();
        boolean boolean66 = mongoDBRiverDefinition61.disableIndexRefresh;
        java.lang.String str67 = mongoDBRiverDefinition61.mongoLocalPassword;
        com.mongodb.BasicDBObject basicDBObject68 = mongoDBRiverDefinition61.mongoCollectionFilter;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject68);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("hi!", "parent_types");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("concurrent_bulk_requests.null", "port");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((-1));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("myindex", "localhost");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("disable_index_refresh", "sandbox");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script_type", "mongodb-1638820217755");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("skip_initial_import", "concurrent_bulk_requests");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey(".scripts", "mongodb-1638820218326");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "script.disable_dynamic");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("hi!", "mongodb-1638820218264");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("sandbox", "bulk");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "parent_types");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script.default_lang", "admin");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("is_mongos", "null.null");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("disable_index_refresh", "skip_initial_import");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("_river", "hi!");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("exclude_fields", "advanced_transformation");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("host", "_river");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script.disable_dynamic", "throttle_size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "local");
        docScoreSearchScript0.setNextScore((float) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long5 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "script");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("credentials", "gridfs");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("actions", "host");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_timeout", "options");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 60000);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter4 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings5 = serializedObjectSupporter4.deserializeObjectRiverSettings3();
        java.lang.String str6 = serializedObjectSupporter4.deserializeObjectString5();
        java.lang.String str7 = serializedObjectSupporter4.deserializeObjectString14();
        java.lang.String str8 = serializedObjectSupporter4.deserializeObjectString8();
        docScoreSearchScript0.setNextVar("mongodb-1638820218424", (java.lang.Object) str8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder11);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder11);
        builder11.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder11.mongoSecondaryReadPreference(true);
        builder11.includeCollection = "socket_timeout";
        com.mongodb.ServerAddress[] serverAddressArray20 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList21 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList21, serverAddressArray20);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder11.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList21);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder11);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder11.riverIndexName("skip_initial_import");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder27);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition29 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder27);
        builder27.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder27.mongoSecondaryReadPreference(true);
        builder27.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder27.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder37.includeCollection("mongodb-1638820218299");
        int int40 = builder37.connectTimeout;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition42 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder41);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition43 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder41);
        builder41.mongoAdminPassword = "";
        builder41.socketTimeout = (short) 0;
        boolean boolean48 = builder41.storeStatistics;
        builder41.scriptType = "mongodb-1638820218299";
        java.lang.String[] strArray52 = new java.lang.String[] { "mongodb-1638820218299" };
        java.util.LinkedHashSet<java.lang.String> strSet53 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet53, strArray52);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder41.excludeFields((java.util.Set<java.lang.String>) strSet53);
        builder37.setincludeFields((java.util.Set<java.lang.String>) strSet53);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder26.parentTypes((java.util.Set<java.lang.String>) strSet53);
        int int58 = builder57.connectTimeout;
        docScoreSearchScript0.setNextVar("user", (java.lang.Object) builder57);
        docScoreSearchScript0.setNextScore((float) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double62 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "local");
        docScoreSearchScript0.setNextScore((float) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double5 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("socket_timeout", "credentials");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("secret", "local");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "import_all_collections");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "mongodb-1638820218408");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_timeout", "index");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("advanced_transformation", "ssl");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj27 = docScoreSearchScript0.run();
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 60000);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter4 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings5 = serializedObjectSupporter4.deserializeObjectRiverSettings3();
        java.lang.String str6 = serializedObjectSupporter4.deserializeObjectString5();
        java.lang.String str7 = serializedObjectSupporter4.deserializeObjectString14();
        java.lang.String str8 = serializedObjectSupporter4.deserializeObjectString8();
        docScoreSearchScript0.setNextVar("mongodb-1638820218424", (java.lang.Object) str8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder11);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder11);
        builder11.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder11.mongoSecondaryReadPreference(true);
        builder11.includeCollection = "socket_timeout";
        com.mongodb.ServerAddress[] serverAddressArray20 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList21 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList21, serverAddressArray20);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder11.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList21);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder11);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder11.riverIndexName("skip_initial_import");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder27);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition29 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder27);
        builder27.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder27.mongoSecondaryReadPreference(true);
        builder27.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder27.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder37.includeCollection("mongodb-1638820218299");
        int int40 = builder37.connectTimeout;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition42 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder41);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition43 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder41);
        builder41.mongoAdminPassword = "";
        builder41.socketTimeout = (short) 0;
        boolean boolean48 = builder41.storeStatistics;
        builder41.scriptType = "mongodb-1638820218299";
        java.lang.String[] strArray52 = new java.lang.String[] { "mongodb-1638820218299" };
        java.util.LinkedHashSet<java.lang.String> strSet53 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet53, strArray52);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder41.excludeFields((java.util.Set<java.lang.String>) strSet53);
        builder37.setincludeFields((java.util.Set<java.lang.String>) strSet53);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder26.parentTypes((java.util.Set<java.lang.String>) strSet53);
        int int58 = builder57.connectTimeout;
        docScoreSearchScript0.setNextVar("user", (java.lang.Object) builder57);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter60 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings61 = serializedObjectSupporter60.deserializeObjectRiverSettings6();
        org.elasticsearch.river.RiverSettings riverSettings62 = serializedObjectSupporter60.deserializeObjectRiverSettings5();
        java.util.Map<java.lang.String, java.lang.Object> strMap63 = riverSettings62.settings();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource(strMap63);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
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
        java.lang.Object obj37 = docScoreSearchScript0.run();
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mydatabase.mycollection", "filter");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("localhost", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "throttle_size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("is_mongos", "drop_collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "myindex");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 60000);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter4 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings5 = serializedObjectSupporter4.deserializeObjectRiverSettings3();
        java.lang.String str6 = serializedObjectSupporter4.deserializeObjectString5();
        java.lang.String str7 = serializedObjectSupporter4.deserializeObjectString14();
        java.lang.String str8 = serializedObjectSupporter4.deserializeObjectString8();
        docScoreSearchScript0.setNextVar("mongodb-1638820218424", (java.lang.Object) str8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long10 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("throttle_size", "db");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_size", "import_all_collections");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("db", "filter");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script_type", "secret");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("servers", "name");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("type", "admin");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("sandbox", "flush_interval");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk", "flush_interval");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "filter");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218449", "mongodb-1638820218264");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("localhost", "admin");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("ssl_verify_certificate", "local");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("filter", "script");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218326", "connect_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_timeout", "password");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("concurrent_bulk_requests", "advanced_transformation");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218299", "actions");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("secondary_read_preference", "ssl_verify_certificate");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("password", "host");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("socket_timeout", "hi!");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("actions", "size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_timeout", "ssl_verify_certificate");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("skip_initial_import", "name");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("concurrent_bulk_requests.null", "skip_initial_import");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("local", "bulk_size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("port", "admin");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("socket_timeout", "script_type");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "local");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(60000);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script.disable_dynamic", "mongodb-1638820218299");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("throttle_size", "mongodb-1638820218264");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("filter", "import_all_collections");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("name", "store_statistics");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float25 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mydatabase.mycollection", "connect_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_size", "local");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("name", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("db", "mongodb-1638820218299");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218449", "skip_initial_import");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("connect_timeout", "ssl_verify_certificate");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("include_fields", "include_fields");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "local");
        docScoreSearchScript0.setNextScore(1.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) 'a');
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("index", "concurrent_bulk_requests.null");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("hi!", "ssl_verify_certificate");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("disable_index_refresh", "exclude_fields");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("collection", "secondary_read_preference");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("skip_initial_import", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("actions", ".scripts");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("host", "sandbox");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("include_fields", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk", "hi!");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("initial_timestamp", "name");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("host", "parent_types");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("hi!", "connect_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("password", "mongodb-1638820218299");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218408", "is_mongos");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("drop_collection", "mydatabase.mycollection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("drop_collection", "mongodb-1638820218449");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("socket_timeout", "_river");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long13 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("include_fields", "host");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("options", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218363", "concurrent_bulk_requests");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218264", "store_statistics");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218424", "script");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("filter", "connect_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("disable_index_refresh", "port");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double23 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("type", "credentials");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("socket_timeout", "skip_initial_import");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
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
        docScoreSearchScript0.setNextScore(0.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float53 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("filter", "secret");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("store_statistics", "bulk_size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk", "mongodb-1638820218264");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("skip_initial_import", "script.default_lang");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("flush_interval", "filter");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218264", "gridfs");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218424", "is_mongos");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("hi!", "null.null");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (short) -1);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float22 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "local");
        docScoreSearchScript0.setNextScore(1.0f);
        docScoreSearchScript0.setNextScore((float) 1);
        docScoreSearchScript0.setNextScore((float) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long9 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("secret", "exclude_fields");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("local", "index");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("advanced_transformation", "mydatabase");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218299", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "local");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float3 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("credentials", "hi!");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("gridfs", "mongodb-1638820218299");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("collection", "mongodb-1638820218299");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218363", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script.default_lang", "flush_interval");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("actions", "store_statistics");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("options", "mydatabase");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("secondary_read_preference", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float27 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
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
        docScoreSearchScript0.setNextScore((float) (byte) 10);
        docScoreSearchScript0.setNextScore((float) (-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float29 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "local");
        docScoreSearchScript0.setNextScore((float) (short) 1);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory5 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter6 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings7 = serializedObjectSupporter6.deserializeObjectRiverSettings3();
        org.elasticsearch.river.RiverSettings riverSettings8 = serializedObjectSupporter6.deserializeObjectRiverSettings2();
        java.lang.String str9 = serializedObjectSupporter6.deserializeObjectString6();
        java.lang.String str10 = serializedObjectSupporter6.deserializeObjectString11();
        org.elasticsearch.river.RiverSettings riverSettings11 = serializedObjectSupporter6.deserializeObjectRiverSettings6();
        org.elasticsearch.common.settings.Settings settings12 = riverSettings11.globalSettings();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder13);
        java.util.Set<java.lang.String> strSet15 = builder13.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder16);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder16);
        builder16.mongoAdminPassword = "";
        builder16.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder16.importAllCollections(true);
        java.lang.String str25 = builder24.getmongoAdminPassword();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder24.mongoLocalPassword("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition29 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder28);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition30 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder28);
        builder28.mongoAdminPassword = "";
        builder28.socketTimeout = (short) 0;
        boolean boolean35 = builder28.storeStatistics;
        builder28.scriptType = "mongodb-1638820218299";
        java.lang.String[] strArray39 = new java.lang.String[] { "mongodb-1638820218299" };
        java.util.LinkedHashSet<java.lang.String> strSet40 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet40, strArray39);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder28.excludeFields((java.util.Set<java.lang.String>) strSet40);
        builder24.setexcludeFields((java.util.Set<java.lang.String>) strSet40);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder13.parentTypes((java.util.Set<java.lang.String>) strSet40);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition46 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder45);
        java.lang.String str47 = mongoDBRiverDefinition46.mongoDb;
        int int48 = mongoDBRiverDefinition46.throttleSize;
        int int49 = mongoDBRiverDefinition46.getDEFAULT_BULK_ACTIONS();
        java.lang.String str50 = mongoDBRiverDefinition46.getMongoLocalPassword();
        com.mongodb.BasicDBObject basicDBObject51 = mongoDBRiverDefinition46.mongoCollectionFilter;
        builder44.setmongoOplogFilter(basicDBObject51);
        org.elasticsearch.river.RiverSettings riverSettings53 = new org.elasticsearch.river.RiverSettings(settings12, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject51);
        org.elasticsearch.script.ExecutableScript executableScript54 = docScoreNativeScriptFactory5.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject51);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition56 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder55);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition57 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder55);
        builder55.mongoAdminPassword = "";
        builder55.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = builder55.importAllCollections(true);
        java.lang.String str64 = builder63.getmongoAdminPassword();
        java.lang.String str65 = builder63.statisticsTypeName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder66 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition67 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder66);
        java.lang.String str68 = mongoDBRiverDefinition67.mongoDb;
        java.lang.String str69 = mongoDBRiverDefinition67.getCONCURRENT_BULK_REQUESTS_FIELD();
        int int70 = mongoDBRiverDefinition67.throttleSize;
        boolean boolean71 = mongoDBRiverDefinition67.getskipInitialImport();
        boolean boolean72 = mongoDBRiverDefinition67.disableIndexRefresh;
        java.lang.String str73 = mongoDBRiverDefinition67.mongoLocalPassword;
        com.mongodb.BasicDBObject basicDBObject74 = mongoDBRiverDefinition67.mongoCollectionFilter;
        builder63.mongoCollectionFilter = basicDBObject74;
        org.elasticsearch.script.ExecutableScript executableScript76 = docScoreNativeScriptFactory5.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject74);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject74);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("actions", "myindex");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("gridfs", "mongodb-1638820218264");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
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
        double double37 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("sandbox", "drop_collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("connect_timeout", "bulk_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218408", "actions");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("servers", "initial_timestamp");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double27 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("initial_timestamp", "host");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "local");
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter5 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str6 = serializedObjectSupporter5.deserializeObjectString18();
        org.elasticsearch.river.RiverSettings riverSettings7 = serializedObjectSupporter5.deserializeObjectRiverSettings3();
        org.elasticsearch.common.settings.Settings settings8 = riverSettings7.globalSettings();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder9);
        builder9.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder9.mongoSecondaryReadPreference(true);
        builder9.includeCollection = "socket_timeout";
        com.mongodb.ServerAddress[] serverAddressArray18 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList19 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList19, serverAddressArray18);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder9.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList19);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder9.riverIndexName("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.mongoAdminUser("type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder26);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder26);
        builder26.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder26.mongoSecondaryReadPreference(true);
        builder26.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder26.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder36.includeCollection("mongodb-1638820218299");
        builder36.setmongoDb("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder36.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder42.isMongos((java.lang.Boolean) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder42.advancedTransformation(false);
        boolean boolean47 = builder46.mongoUseSSL;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory48 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition50 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder49);
        java.lang.String str51 = mongoDBRiverDefinition50.mongoDb;
        java.lang.String str52 = mongoDBRiverDefinition50.getCONCURRENT_BULK_REQUESTS_FIELD();
        int int53 = mongoDBRiverDefinition50.throttleSize;
        boolean boolean54 = mongoDBRiverDefinition50.getskipInitialImport();
        java.lang.String str55 = mongoDBRiverDefinition50.getScriptType();
        java.lang.String str56 = mongoDBRiverDefinition50.getSIZE_FIELD();
        java.lang.String str57 = mongoDBRiverDefinition50.statisticsIndexName;
        java.lang.String str58 = mongoDBRiverDefinition50.getMongoLocalUser();
        com.mongodb.BasicDBObject basicDBObject59 = mongoDBRiverDefinition50.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript60 = docScoreNativeScriptFactory48.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject59);
        builder46.mongoCollectionFilter = basicDBObject59;
        builder23.mongoOplogFilter = basicDBObject59;
        org.elasticsearch.river.RiverSettings riverSettings63 = new org.elasticsearch.river.RiverSettings(settings8, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject59);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject59);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("advanced_transformation", "collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("flush_interval", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder4);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder4);
        builder4.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder4.mongoSecondaryReadPreference(true);
        builder4.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder4.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.includeCollection("mongodb-1638820218299");
        builder14.setmongoDb("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder14.mongoUseSSL(false);
        java.lang.String str21 = builder14.getindexName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder14.mongoAdminUser("localhost");
        builder23.settypeName("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder26);
        java.util.Set<java.lang.String> strSet28 = builder26.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition30 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder29);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition31 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder29);
        builder29.mongoAdminPassword = "";
        builder29.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder29.importAllCollections(true);
        java.lang.String str38 = builder37.getmongoAdminPassword();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder37.mongoLocalPassword("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition42 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder41);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition43 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder41);
        builder41.mongoAdminPassword = "";
        builder41.socketTimeout = (short) 0;
        boolean boolean48 = builder41.storeStatistics;
        builder41.scriptType = "mongodb-1638820218299";
        java.lang.String[] strArray52 = new java.lang.String[] { "mongodb-1638820218299" };
        java.util.LinkedHashSet<java.lang.String> strSet53 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet53, strArray52);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder41.excludeFields((java.util.Set<java.lang.String>) strSet53);
        builder37.setexcludeFields((java.util.Set<java.lang.String>) strSet53);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder26.parentTypes((java.util.Set<java.lang.String>) strSet53);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition59 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder58);
        java.lang.String str60 = mongoDBRiverDefinition59.mongoDb;
        int int61 = mongoDBRiverDefinition59.throttleSize;
        int int62 = mongoDBRiverDefinition59.getDEFAULT_BULK_ACTIONS();
        java.lang.String str63 = mongoDBRiverDefinition59.getMongoLocalPassword();
        com.mongodb.BasicDBObject basicDBObject64 = mongoDBRiverDefinition59.mongoCollectionFilter;
        builder57.setmongoOplogFilter(basicDBObject64);
        builder23.setmongoOplogFilter(basicDBObject64);
        docScoreSearchScript0.setNextVar("bulk_size", (java.lang.Object) builder23);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder69 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition70 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder69);
        java.lang.String str71 = mongoDBRiverDefinition70.getScriptType();
        java.lang.String str72 = mongoDBRiverDefinition70.getStatisticsIndexName();
        java.lang.String str73 = mongoDBRiverDefinition70.getBULK_FIELD();
        boolean boolean74 = mongoDBRiverDefinition70.getmongoSecondaryReadPreference();
        java.lang.String str75 = mongoDBRiverDefinition70.getADMIN_DB_FIELD();
        docScoreSearchScript0.setNextVar("port", (java.lang.Object) mongoDBRiverDefinition70);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj77 = docScoreSearchScript0.run();
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("store_statistics", "user");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float85 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("concurrent_bulk_requests.null", "ssl_verify_certificate");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("disable_index_refresh", "connect_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder4);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder4);
        builder4.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder4.mongoSecondaryReadPreference(true);
        builder4.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder4.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.includeCollection("mongodb-1638820218299");
        builder14.setmongoDb("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder14.mongoUseSSL(false);
        java.lang.String str21 = builder14.getindexName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder14.mongoAdminUser("localhost");
        builder23.settypeName("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder26);
        java.util.Set<java.lang.String> strSet28 = builder26.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition30 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder29);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition31 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder29);
        builder29.mongoAdminPassword = "";
        builder29.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder29.importAllCollections(true);
        java.lang.String str38 = builder37.getmongoAdminPassword();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder37.mongoLocalPassword("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition42 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder41);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition43 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder41);
        builder41.mongoAdminPassword = "";
        builder41.socketTimeout = (short) 0;
        boolean boolean48 = builder41.storeStatistics;
        builder41.scriptType = "mongodb-1638820218299";
        java.lang.String[] strArray52 = new java.lang.String[] { "mongodb-1638820218299" };
        java.util.LinkedHashSet<java.lang.String> strSet53 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet53, strArray52);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder41.excludeFields((java.util.Set<java.lang.String>) strSet53);
        builder37.setexcludeFields((java.util.Set<java.lang.String>) strSet53);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder26.parentTypes((java.util.Set<java.lang.String>) strSet53);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition59 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder58);
        java.lang.String str60 = mongoDBRiverDefinition59.mongoDb;
        int int61 = mongoDBRiverDefinition59.throttleSize;
        int int62 = mongoDBRiverDefinition59.getDEFAULT_BULK_ACTIONS();
        java.lang.String str63 = mongoDBRiverDefinition59.getMongoLocalPassword();
        com.mongodb.BasicDBObject basicDBObject64 = mongoDBRiverDefinition59.mongoCollectionFilter;
        builder57.setmongoOplogFilter(basicDBObject64);
        builder23.setmongoOplogFilter(basicDBObject64);
        docScoreSearchScript0.setNextVar("bulk_size", (java.lang.Object) builder23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj68 = docScoreSearchScript0.run();
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test283");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218408", "concurrent_bulk_requests");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script", "concurrent_bulk_requests.null");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_size", "mongodb-1638820218299");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test286");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("advanced_transformation", "credentials");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("_river", "bulk");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test288");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mydatabase", "bulk");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("disable_index_refresh", ".scripts");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test290");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("import_all_collections", "ssl");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test291");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("localhost", "mongodb-1638820218264");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test292");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("disable_index_refresh", "gridfs");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test293");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("gridfs", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test294");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("admin", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test295");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("secondary_read_preference", "store_statistics");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test296");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218408", "bulk");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test297");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "local");
        docScoreSearchScript0.setNextScore(1.0f);
        docScoreSearchScript0.setNextScore((float) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(0);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test298");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("filter", "flush_interval");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test299");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("include_collection", "mongodb-1638820218449");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test300");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("filter", "sandbox");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test301");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("collection", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test302");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("admin", "include_collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test303");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218408", "name");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test304");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "mongodb-1638820218299");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test305");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218363", "sandbox");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test306");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_timeout", "script.disable_dynamic");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test307");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("import_all_collections", "null.null");
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test308");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("options", "script.disable_dynamic");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test309");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script", "_river");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test310");
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
        docScoreSearchScript0.setNextDocId(30000);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test311");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("store_statistics", "index");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test312");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("parent_types", "script.default_lang");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test313");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820217755", "admin");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test314");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("admin", "socket_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test315");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "concurrent_bulk_requests");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test316");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_size", "mydatabase");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test317");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("disable_index_refresh", "include_collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test318");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218424", "localhost");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test319");
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
        docScoreSearchScript0.setNextScore((float) (byte) 10);
        docScoreSearchScript0.setNextScore((float) (-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long29 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test320");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("name", "mongodb-1638820218363");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test321");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("is_mongos", "include_fields");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test322");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float25 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test323");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("ssl", "ssl");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test324");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("ssl", "mongodb-1638820218449");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test325");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("index", "gridfs");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test326");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script.disable_dynamic", "is_mongos");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test327");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("include_fields", "connect_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test328");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("connect_timeout", "sandbox");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test329");
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
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder26);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder26.script("filter");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition30 = builder26.build();
        java.lang.String str31 = mongoDBRiverDefinition30.getDEFAULT_DB_HOST();
        java.lang.String str32 = mongoDBRiverDefinition30.getACTIONS_FIELD();
        docScoreSearchScript0.setNextVar("local", (java.lang.Object) str32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (short) 10);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test330");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("sandbox", "port");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test331");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(35);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test332");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("secret", "collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test333");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("filter", "host");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test334");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_timeout", "local");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test335");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("servers", "is_mongos");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test336");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("concurrent_bulk_requests.null", "host");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test337");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("_river", "is_mongos");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test338");
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
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder26);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder26.script("filter");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition30 = builder26.build();
        java.lang.String str31 = mongoDBRiverDefinition30.getDEFAULT_DB_HOST();
        java.lang.String str32 = mongoDBRiverDefinition30.getACTIONS_FIELD();
        docScoreSearchScript0.setNextVar("local", (java.lang.Object) str32);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition36 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder35);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition37 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder35);
        builder35.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder35.mongoSecondaryReadPreference(true);
        builder35.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder35.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder45.includeCollection("mongodb-1638820218299");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder45.mongoAdminPassword("host");
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory50 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition52 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder51);
        java.lang.String str53 = mongoDBRiverDefinition52.mongoDb;
        java.lang.String str54 = mongoDBRiverDefinition52.getCONCURRENT_BULK_REQUESTS_FIELD();
        int int55 = mongoDBRiverDefinition52.throttleSize;
        boolean boolean56 = mongoDBRiverDefinition52.getskipInitialImport();
        java.lang.String str57 = mongoDBRiverDefinition52.getScriptType();
        java.lang.String str58 = mongoDBRiverDefinition52.getSIZE_FIELD();
        java.lang.String str59 = mongoDBRiverDefinition52.statisticsIndexName;
        java.lang.String str60 = mongoDBRiverDefinition52.getMongoLocalUser();
        com.mongodb.BasicDBObject basicDBObject61 = mongoDBRiverDefinition52.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript62 = docScoreNativeScriptFactory50.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject61);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition64 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder63);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition65 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder63);
        builder63.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder69 = builder63.mongoSecondaryReadPreference(true);
        builder63.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder73 = builder63.mongoDb("concurrent_bulk_requests");
        java.lang.String str74 = builder73.statisticsIndexName;
        com.mongodb.BasicDBObject basicDBObject75 = builder73.getmongoOplogFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder76 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition77 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder76);
        java.lang.String str78 = mongoDBRiverDefinition77.mongoDb;
        java.lang.String str79 = mongoDBRiverDefinition77.getCONCURRENT_BULK_REQUESTS_FIELD();
        int int80 = mongoDBRiverDefinition77.throttleSize;
        boolean boolean81 = mongoDBRiverDefinition77.getskipInitialImport();
        java.lang.String str82 = mongoDBRiverDefinition77.getScriptType();
        com.mongodb.BasicDBObject basicDBObject83 = mongoDBRiverDefinition77.mongoCollectionFilter;
        builder73.mongoCollectionFilter = basicDBObject83;
        org.elasticsearch.script.ExecutableScript executableScript85 = docScoreNativeScriptFactory50.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject83);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder86 = builder49.mongoOplogFilter(basicDBObject83);
        docScoreSearchScript0.setNextVar("mongodb-1638820218408", (java.lang.Object) builder86);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float88 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test339");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("socket_timeout", "localhost");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test340");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218424", "port");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test341");
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
        docScoreSearchScript0.setNextDocId((int) (byte) -1);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test342");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("filter", "mydatabase.mycollection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test343");
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
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition48 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder47);
        java.util.Set<java.lang.String> strSet49 = builder47.includeFields;
        java.util.Set<java.lang.String> strSet50 = builder47.getincludeFields();
        java.util.Set<java.lang.String> strSet51 = builder47.getparentTypes();
        com.mongodb.BasicDBObject basicDBObject52 = builder47.mongoCollectionFilter;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject52);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test344");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "local");
        docScoreSearchScript0.setNextScore((float) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str7 = mongoDBRiverDefinition6.mongoDb;
        java.lang.String str8 = mongoDBRiverDefinition6.getCONCURRENT_BULK_REQUESTS_FIELD();
        int int9 = mongoDBRiverDefinition6.throttleSize;
        boolean boolean10 = mongoDBRiverDefinition6.getskipInitialImport();
        java.lang.String str11 = mongoDBRiverDefinition6.getScriptType();
        java.lang.String str12 = mongoDBRiverDefinition6.getSIZE_FIELD();
        java.lang.String str13 = mongoDBRiverDefinition6.statisticsIndexName;
        boolean boolean14 = mongoDBRiverDefinition6.getskipInitialImport();
        int int15 = mongoDBRiverDefinition6.connectTimeout;
        java.lang.String str16 = mongoDBRiverDefinition6.getINITIAL_TIMESTAMP_FIELD();
        java.lang.String str17 = mongoDBRiverDefinition6.getINITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD();
        java.lang.String str18 = mongoDBRiverDefinition6.getTHROTTLE_SIZE_FIELD();
        java.lang.Object obj19 = docScoreSearchScript0.unwrap((java.lang.Object) str18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) 'a');
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test345");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("initial_timestamp", "myindex");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test346");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("socket_timeout", "include_collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test347");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 60000);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter4 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings5 = serializedObjectSupporter4.deserializeObjectRiverSettings3();
        java.lang.String str6 = serializedObjectSupporter4.deserializeObjectString5();
        java.lang.String str7 = serializedObjectSupporter4.deserializeObjectString14();
        java.lang.String str8 = serializedObjectSupporter4.deserializeObjectString8();
        docScoreSearchScript0.setNextVar("mongodb-1638820218424", (java.lang.Object) str8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder11);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder11);
        builder11.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder11.mongoSecondaryReadPreference(true);
        builder11.includeCollection = "socket_timeout";
        com.mongodb.ServerAddress[] serverAddressArray20 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList21 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList21, serverAddressArray20);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder11.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList21);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder11);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder11.riverIndexName("skip_initial_import");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder27);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition29 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder27);
        builder27.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder27.mongoSecondaryReadPreference(true);
        builder27.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder27.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder37.includeCollection("mongodb-1638820218299");
        int int40 = builder37.connectTimeout;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition42 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder41);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition43 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder41);
        builder41.mongoAdminPassword = "";
        builder41.socketTimeout = (short) 0;
        boolean boolean48 = builder41.storeStatistics;
        builder41.scriptType = "mongodb-1638820218299";
        java.lang.String[] strArray52 = new java.lang.String[] { "mongodb-1638820218299" };
        java.util.LinkedHashSet<java.lang.String> strSet53 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet53, strArray52);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder41.excludeFields((java.util.Set<java.lang.String>) strSet53);
        builder37.setincludeFields((java.util.Set<java.lang.String>) strSet53);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder26.parentTypes((java.util.Set<java.lang.String>) strSet53);
        int int58 = builder57.connectTimeout;
        docScoreSearchScript0.setNextVar("user", (java.lang.Object) builder57);
        docScoreSearchScript0.setNextScore(1.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double62 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test348");
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
        docScoreSearchScript0.setNextScore((float) (byte) 10);
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
        java.lang.String str42 = builder41.mongoAdminPassword;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition44 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder43);
        java.lang.String str45 = mongoDBRiverDefinition44.mongoDb;
        java.lang.String str46 = mongoDBRiverDefinition44.getCONCURRENT_BULK_REQUESTS_FIELD();
        int int47 = mongoDBRiverDefinition44.throttleSize;
        boolean boolean48 = mongoDBRiverDefinition44.getskipInitialImport();
        java.lang.String str49 = mongoDBRiverDefinition44.getScriptType();
        java.lang.String str50 = mongoDBRiverDefinition44.getSIZE_FIELD();
        java.lang.String str51 = mongoDBRiverDefinition44.statisticsIndexName;
        java.lang.String str52 = mongoDBRiverDefinition44.getMongoLocalUser();
        com.mongodb.BasicDBObject basicDBObject53 = mongoDBRiverDefinition44.getMongoCollectionFilter();
        builder41.setmongoCollectionFilter(basicDBObject53);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject53);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test349");
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
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition26 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder25);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder25);
        builder25.mongoAdminPassword = "";
        builder25.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder25.importAllCollections(true);
        java.lang.String str34 = builder25.mongoLocalUser;
        boolean boolean35 = builder25.getadvancedTransformation();
        builder25.socketTimeout = '4';
        com.mongodb.BasicDBObject basicDBObject38 = builder25.getmongoCollectionFilter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject38);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test350");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("local", "type");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test351");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("user", "local");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test352");
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
        builder23.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder23.importAllCollections(true);
        java.lang.String str32 = builder31.getmongoAdminPassword();
        java.lang.String str33 = builder31.statisticsTypeName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition35 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder34);
        java.lang.String str36 = mongoDBRiverDefinition35.mongoDb;
        java.lang.String str37 = mongoDBRiverDefinition35.getCONCURRENT_BULK_REQUESTS_FIELD();
        int int38 = mongoDBRiverDefinition35.throttleSize;
        boolean boolean39 = mongoDBRiverDefinition35.getskipInitialImport();
        boolean boolean40 = mongoDBRiverDefinition35.disableIndexRefresh;
        java.lang.String str41 = mongoDBRiverDefinition35.mongoLocalPassword;
        com.mongodb.BasicDBObject basicDBObject42 = mongoDBRiverDefinition35.mongoCollectionFilter;
        builder31.mongoCollectionFilter = basicDBObject42;
        java.lang.Object obj44 = docScoreSearchScript0.unwrap((java.lang.Object) builder31);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float45 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test353");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820217755", "store_statistics");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test354");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("host", "skip_initial_import");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test355");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double22 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test356");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("size", "mongodb-1638820218363");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test357");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("gridfs", "script.default_lang");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test358");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("gridfs", "ssl");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test359");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("sandbox", "bulk_size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test360");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("db", "script.default_lang");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test361");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("advanced_transformation", "mydatabase.mycollection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test362");
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
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter47 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings48 = serializedObjectSupporter47.deserializeObjectRiverSettings3();
        java.lang.String str49 = serializedObjectSupporter47.deserializeObjectString5();
        java.lang.String str50 = serializedObjectSupporter47.deserializeObjectString14();
        java.lang.String str51 = serializedObjectSupporter47.deserializeObjectString15();
        org.elasticsearch.river.RiverSettings riverSettings52 = serializedObjectSupporter47.deserializeObjectRiverSettings4();
        java.lang.String str53 = serializedObjectSupporter47.deserializeObjectString4();
        org.elasticsearch.river.RiverSettings riverSettings54 = serializedObjectSupporter47.deserializeObjectRiverSettings9();
        org.elasticsearch.river.RiverSettings riverSettings55 = serializedObjectSupporter47.deserializeObjectRiverSettings8();
        java.lang.Object obj56 = docScoreSearchScript0.unwrap((java.lang.Object) riverSettings55);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long57 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test363");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218449", "_river");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test364");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("port", "mongodb-1638820218363");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test365");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("secondary_read_preference", "concurrent_bulk_requests.null");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test366");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("myindex", "include_fields");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test367");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218408", "ssl");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test368");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("concurrent_bulk_requests.null", "local");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test369");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("hi!", "disable_index_refresh");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test370");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218424", "concurrent_bulk_requests.null");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test371");
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
        docScoreSearchScript0.setNextScore((float) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long27 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test372");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("ssl", "null.null");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test373");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("include_collection", "connect_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test374");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("skip_initial_import", "mongodb-1638820218449");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test375");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("host", "initial_timestamp");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test376");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "null.null");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test377");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("parent_types", "credentials");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test378");
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
        docScoreSearchScript0.setNextDocId(35);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test379");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("servers", "mongodb-1638820218264");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test380");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("servers", "mongodb-1638820218408");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test381");
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
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder26);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder26.script("filter");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition30 = builder26.build();
        java.lang.String str31 = mongoDBRiverDefinition30.getDEFAULT_DB_HOST();
        java.lang.String str32 = mongoDBRiverDefinition30.getACTIONS_FIELD();
        docScoreSearchScript0.setNextVar("local", (java.lang.Object) str32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double34 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test382");
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
        java.lang.Object obj87 = docScoreSearchScript0.run();
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test383");
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
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter37 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings38 = serializedObjectSupporter37.deserializeObjectRiverSettings3();
        org.elasticsearch.river.RiverSettings riverSettings39 = serializedObjectSupporter37.deserializeObjectRiverSettings2();
        java.lang.String str40 = serializedObjectSupporter37.deserializeObjectString6();
        java.lang.String str41 = serializedObjectSupporter37.deserializeObjectString11();
        org.elasticsearch.river.RiverSettings riverSettings42 = serializedObjectSupporter37.deserializeObjectRiverSettings6();
        org.elasticsearch.common.settings.Settings settings43 = riverSettings42.globalSettings();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition45 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder44);
        java.util.Set<java.lang.String> strSet46 = builder44.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition48 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder47);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition49 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder47);
        builder47.mongoAdminPassword = "";
        builder47.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder47.importAllCollections(true);
        java.lang.String str56 = builder55.getmongoAdminPassword();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = builder55.mongoLocalPassword("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition60 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder59);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition61 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder59);
        builder59.mongoAdminPassword = "";
        builder59.socketTimeout = (short) 0;
        boolean boolean66 = builder59.storeStatistics;
        builder59.scriptType = "mongodb-1638820218299";
        java.lang.String[] strArray70 = new java.lang.String[] { "mongodb-1638820218299" };
        java.util.LinkedHashSet<java.lang.String> strSet71 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet71, strArray70);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder73 = builder59.excludeFields((java.util.Set<java.lang.String>) strSet71);
        builder55.setexcludeFields((java.util.Set<java.lang.String>) strSet71);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder75 = builder44.parentTypes((java.util.Set<java.lang.String>) strSet71);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder76 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition77 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder76);
        java.lang.String str78 = mongoDBRiverDefinition77.mongoDb;
        int int79 = mongoDBRiverDefinition77.throttleSize;
        int int80 = mongoDBRiverDefinition77.getDEFAULT_BULK_ACTIONS();
        java.lang.String str81 = mongoDBRiverDefinition77.getMongoLocalPassword();
        com.mongodb.BasicDBObject basicDBObject82 = mongoDBRiverDefinition77.mongoCollectionFilter;
        builder75.setmongoOplogFilter(basicDBObject82);
        org.elasticsearch.river.RiverSettings riverSettings84 = new org.elasticsearch.river.RiverSettings(settings43, (java.util.Map<java.lang.String, java.lang.Object>) basicDBObject82);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject82);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test384");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("is_mongos", "sandbox");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test385");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mydatabase.mycollection", "throttle_size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test386");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mydatabase", "mongodb-1638820218449");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test387");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218326", "localhost");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test388");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("hi!", "credentials");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test389");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("parent_types", "is_mongos");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test390");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("secondary_read_preference", "type");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test391");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("flush_interval", "script.disable_dynamic");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test392");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("collection", "mongodb-1638820217755");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test393");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float25 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test394");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("drop_collection", "credentials");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test395");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820217755", "myindex");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test396");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("is_mongos", "type");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test397");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "local");
        docScoreSearchScript0.setNextScore(1.0f);
        docScoreSearchScript0.setNextScore((float) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double7 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test398");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("myindex", "connect_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test399");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218424", "mydatabase.mycollection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test400");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("is_mongos", "concurrent_requests");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test401");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("gridfs", "parent_types");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test402");
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
        docScoreSearchScript0.setNextDocId(60000);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test403");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("servers", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test404");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test405");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "local");
        docScoreSearchScript0.setNextScore((float) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str7 = mongoDBRiverDefinition6.mongoDb;
        java.lang.String str8 = mongoDBRiverDefinition6.getCONCURRENT_BULK_REQUESTS_FIELD();
        int int9 = mongoDBRiverDefinition6.throttleSize;
        boolean boolean10 = mongoDBRiverDefinition6.getskipInitialImport();
        java.lang.String str11 = mongoDBRiverDefinition6.getScriptType();
        java.lang.String str12 = mongoDBRiverDefinition6.getSIZE_FIELD();
        java.lang.String str13 = mongoDBRiverDefinition6.statisticsIndexName;
        boolean boolean14 = mongoDBRiverDefinition6.getskipInitialImport();
        int int15 = mongoDBRiverDefinition6.connectTimeout;
        java.lang.String str16 = mongoDBRiverDefinition6.getINITIAL_TIMESTAMP_FIELD();
        java.lang.String str17 = mongoDBRiverDefinition6.getINITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD();
        java.lang.String str18 = mongoDBRiverDefinition6.getTHROTTLE_SIZE_FIELD();
        java.lang.Object obj19 = docScoreSearchScript0.unwrap((java.lang.Object) str18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double20 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test406");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218387", "user");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test407");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("password", "script.disable_dynamic");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test408");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("secondary_read_preference", "mongodb-1638820218326");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test409");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("myindex", "secondary_read_preference");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test410");
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
        builder51.setmongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder51.advancedTransformation(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition56 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder55);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter57 = mongoDBRiverDefinition56.serializedObjectSupporter;
        java.util.List<com.mongodb.ServerAddress> serverAddressList58 = mongoDBRiverDefinition56.getMongoServers();
        java.lang.String str59 = mongoDBRiverDefinition56.getINITIAL_TIMESTAMP_SCRIPT_FIELD();
        boolean boolean60 = mongoDBRiverDefinition56.isMongoSecondaryReadPreference();
        com.mongodb.BasicDBObject basicDBObject61 = mongoDBRiverDefinition56.getMongoCollectionFilter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject61);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test411");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("index", "initial_timestamp");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test412");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("gridfs", "socket_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test413");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script_type", "include_fields");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test414");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("secondary_read_preference", "mongodb-1638820218387");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test415");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218408", "collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test416");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("secondary_read_preference", "localhost");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test417");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long28 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test418");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("null.null", "script.default_lang");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test419");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("skip_initial_import", "credentials");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test420");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "local");
        docScoreSearchScript0.setNextScore(1.0f);
        docScoreSearchScript0.setNextScore((float) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long7 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test421");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 60000);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter4 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings5 = serializedObjectSupporter4.deserializeObjectRiverSettings3();
        java.lang.String str6 = serializedObjectSupporter4.deserializeObjectString5();
        java.lang.String str7 = serializedObjectSupporter4.deserializeObjectString14();
        java.lang.String str8 = serializedObjectSupporter4.deserializeObjectString8();
        docScoreSearchScript0.setNextVar("mongodb-1638820218424", (java.lang.Object) str8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder11);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder11);
        builder11.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder11.mongoSecondaryReadPreference(true);
        builder11.includeCollection = "socket_timeout";
        com.mongodb.ServerAddress[] serverAddressArray20 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList21 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList21, serverAddressArray20);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder11.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList21);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder11);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder11.riverIndexName("skip_initial_import");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder27);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition29 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder27);
        builder27.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder27.mongoSecondaryReadPreference(true);
        builder27.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder27.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder37.includeCollection("mongodb-1638820218299");
        int int40 = builder37.connectTimeout;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition42 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder41);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition43 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder41);
        builder41.mongoAdminPassword = "";
        builder41.socketTimeout = (short) 0;
        boolean boolean48 = builder41.storeStatistics;
        builder41.scriptType = "mongodb-1638820218299";
        java.lang.String[] strArray52 = new java.lang.String[] { "mongodb-1638820218299" };
        java.util.LinkedHashSet<java.lang.String> strSet53 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet53, strArray52);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder41.excludeFields((java.util.Set<java.lang.String>) strSet53);
        builder37.setincludeFields((java.util.Set<java.lang.String>) strSet53);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder26.parentTypes((java.util.Set<java.lang.String>) strSet53);
        int int58 = builder57.connectTimeout;
        docScoreSearchScript0.setNextVar("user", (java.lang.Object) builder57);
        docScoreSearchScript0.setNextScore(1.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float62 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test422");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "local");
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float5 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test423");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218264", "db");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test424");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("host", "mongodb-1638820218449");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test425");
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
        float float47 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test426");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("throttle_size", "concurrent_requests");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test427");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float26 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test428");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("index", ".scripts");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test429");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("store_statistics", "admin");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test430");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("include_fields", "ssl_verify_certificate");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test431");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218264", "collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test432");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("archive-stats", "secret");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test433");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("exclude_fields", "mongodb-1638820218299");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test434");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820217755", "is_mongos");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test435");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("concurrent_bulk_requests.null", "mydatabase.mycollection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test436");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 60000);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter4 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings5 = serializedObjectSupporter4.deserializeObjectRiverSettings3();
        java.lang.String str6 = serializedObjectSupporter4.deserializeObjectString5();
        java.lang.String str7 = serializedObjectSupporter4.deserializeObjectString14();
        java.lang.String str8 = serializedObjectSupporter4.deserializeObjectString8();
        docScoreSearchScript0.setNextVar("mongodb-1638820218424", (java.lang.Object) str8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float10 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test437");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("concurrent_requests", "myindex");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test438");
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
        long long87 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test439");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218363", "bulk_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test440");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("flush_interval", "connect_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test441");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) 'a');
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test442");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("db", "options");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test443");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("archive-stats", "concurrent_requests");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test444");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("hi!", "script_type");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test445");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("secret", "bulk");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test446");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("credentials", "include_collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test447");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script", "user");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test448");
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
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder20);
        java.lang.String str22 = mongoDBRiverDefinition21.getTYPE_FIELD();
        java.lang.String str23 = mongoDBRiverDefinition21.getEXCLUDE_FIELDS_FIELD();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp24 = mongoDBRiverDefinition21.getInitialTimestamp();
        docScoreSearchScript0.setNextVar("concurrent_bulk_requests.null", (java.lang.Object) mongoDBRiverDefinition21);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder26);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder26);
        builder26.mongoAdminPassword = "";
        builder26.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder26.importAllCollections(true);
        java.lang.String str35 = builder34.getmongoAdminPassword();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder34.mongoLocalPassword("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder37.mongoLocalPassword("import_all_collections");
        builder37.mongoSSLVerifyCertificate = false;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition43 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder42);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder42.script("filter");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder42.mongoGridFS(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder42.advancedTransformation(true);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory50 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition52 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder51);
        java.lang.String str53 = mongoDBRiverDefinition52.mongoDb;
        java.lang.String str54 = mongoDBRiverDefinition52.getCONCURRENT_BULK_REQUESTS_FIELD();
        int int55 = mongoDBRiverDefinition52.throttleSize;
        boolean boolean56 = mongoDBRiverDefinition52.getskipInitialImport();
        java.lang.String str57 = mongoDBRiverDefinition52.getScriptType();
        java.lang.String str58 = mongoDBRiverDefinition52.getSIZE_FIELD();
        java.lang.String str59 = mongoDBRiverDefinition52.statisticsIndexName;
        java.lang.String str60 = mongoDBRiverDefinition52.getMongoLocalUser();
        com.mongodb.BasicDBObject basicDBObject61 = mongoDBRiverDefinition52.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript62 = docScoreNativeScriptFactory50.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject61);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = builder49.mongoCollectionFilter(basicDBObject61);
        builder37.setmongoOplogFilter(basicDBObject61);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject61);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test449");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218299", "localhost");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test450");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("ssl_verify_certificate", "size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test451");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("user", "mycollection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test452");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("size", "mongodb-1638820218408");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test453");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("options", "db");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test454");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("password", "advanced_transformation");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test455");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mycollection", "include_collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test456");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("index", "include_fields");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test457");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("exclude_fields", "myindex");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test458");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218449", "port");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test459");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("import_all_collections", "disable_index_refresh");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test460");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("user", "sandbox");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test461");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script_type", "user");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test462");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long85 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test463");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("local", "mydatabase");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test464");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script_type", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test465");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey(".scripts", "advanced_transformation");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test466");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float35 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test467");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("concurrent_bulk_requests", "parent_types");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test468");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820217755", "flush_interval");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test469");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double61 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test470");
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
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder20);
        java.lang.String str22 = mongoDBRiverDefinition21.getTYPE_FIELD();
        java.lang.String str23 = mongoDBRiverDefinition21.getEXCLUDE_FIELDS_FIELD();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp24 = mongoDBRiverDefinition21.getInitialTimestamp();
        docScoreSearchScript0.setNextVar("concurrent_bulk_requests.null", (java.lang.Object) mongoDBRiverDefinition21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float26 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test471");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script.disable_dynamic", "name");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test472");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("localhost", "mongodb-1638820218326");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test473");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 60000);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter4 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings5 = serializedObjectSupporter4.deserializeObjectRiverSettings3();
        java.lang.String str6 = serializedObjectSupporter4.deserializeObjectString5();
        java.lang.String str7 = serializedObjectSupporter4.deserializeObjectString14();
        java.lang.String str8 = serializedObjectSupporter4.deserializeObjectString8();
        docScoreSearchScript0.setNextVar("mongodb-1638820218424", (java.lang.Object) str8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder11);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder11);
        builder11.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder11.mongoSecondaryReadPreference(true);
        builder11.includeCollection = "socket_timeout";
        com.mongodb.ServerAddress[] serverAddressArray20 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList21 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList21, serverAddressArray20);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder11.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList21);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder11);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder11.riverIndexName("skip_initial_import");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder27);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition29 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder27);
        builder27.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder27.mongoSecondaryReadPreference(true);
        builder27.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder27.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder37.includeCollection("mongodb-1638820218299");
        int int40 = builder37.connectTimeout;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition42 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder41);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition43 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder41);
        builder41.mongoAdminPassword = "";
        builder41.socketTimeout = (short) 0;
        boolean boolean48 = builder41.storeStatistics;
        builder41.scriptType = "mongodb-1638820218299";
        java.lang.String[] strArray52 = new java.lang.String[] { "mongodb-1638820218299" };
        java.util.LinkedHashSet<java.lang.String> strSet53 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet53, strArray52);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder41.excludeFields((java.util.Set<java.lang.String>) strSet53);
        builder37.setincludeFields((java.util.Set<java.lang.String>) strSet53);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder26.parentTypes((java.util.Set<java.lang.String>) strSet53);
        int int58 = builder57.connectTimeout;
        docScoreSearchScript0.setNextVar("user", (java.lang.Object) builder57);
        docScoreSearchScript0.setNextScore((float) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (byte) -1);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test474");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("size", "mongodb-1638820218264");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test475");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("db", "hi!");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test476");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("concurrent_bulk_requests.null", "myindex");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test477");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("myindex", "ssl");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test478");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("flush_interval", "actions");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test479");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("hi!", "sandbox");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test480");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script.disable_dynamic", "gridfs");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test481");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("concurrent_bulk_requests", "options");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test482");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("initial_timestamp", "script.default_lang");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test483");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("concurrent_bulk_requests.null", "exclude_fields");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test484");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218363", "mongodb-1638820218326");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test485");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder4);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder4);
        builder4.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder4.mongoSecondaryReadPreference(true);
        builder4.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder4.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.includeCollection("mongodb-1638820218299");
        builder14.setmongoDb("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder14.mongoUseSSL(false);
        java.lang.String str21 = builder14.getindexName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder14.mongoAdminUser("localhost");
        builder23.settypeName("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder26);
        java.util.Set<java.lang.String> strSet28 = builder26.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition30 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder29);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition31 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder29);
        builder29.mongoAdminPassword = "";
        builder29.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder29.importAllCollections(true);
        java.lang.String str38 = builder37.getmongoAdminPassword();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder37.mongoLocalPassword("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition42 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder41);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition43 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder41);
        builder41.mongoAdminPassword = "";
        builder41.socketTimeout = (short) 0;
        boolean boolean48 = builder41.storeStatistics;
        builder41.scriptType = "mongodb-1638820218299";
        java.lang.String[] strArray52 = new java.lang.String[] { "mongodb-1638820218299" };
        java.util.LinkedHashSet<java.lang.String> strSet53 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet53, strArray52);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder41.excludeFields((java.util.Set<java.lang.String>) strSet53);
        builder37.setexcludeFields((java.util.Set<java.lang.String>) strSet53);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder26.parentTypes((java.util.Set<java.lang.String>) strSet53);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition59 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder58);
        java.lang.String str60 = mongoDBRiverDefinition59.mongoDb;
        int int61 = mongoDBRiverDefinition59.throttleSize;
        int int62 = mongoDBRiverDefinition59.getDEFAULT_BULK_ACTIONS();
        java.lang.String str63 = mongoDBRiverDefinition59.getMongoLocalPassword();
        com.mongodb.BasicDBObject basicDBObject64 = mongoDBRiverDefinition59.mongoCollectionFilter;
        builder57.setmongoOplogFilter(basicDBObject64);
        builder23.setmongoOplogFilter(basicDBObject64);
        docScoreSearchScript0.setNextVar("bulk_size", (java.lang.Object) builder23);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder69 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition70 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder69);
        java.lang.String str71 = mongoDBRiverDefinition70.getScriptType();
        java.lang.String str72 = mongoDBRiverDefinition70.getStatisticsIndexName();
        java.lang.String str73 = mongoDBRiverDefinition70.getBULK_FIELD();
        boolean boolean74 = mongoDBRiverDefinition70.getmongoSecondaryReadPreference();
        java.lang.String str75 = mongoDBRiverDefinition70.getADMIN_DB_FIELD();
        docScoreSearchScript0.setNextVar("port", (java.lang.Object) mongoDBRiverDefinition70);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder77 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition78 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder77);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition79 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder77);
        builder77.mongoAdminPassword = "";
        builder77.socketTimeout = (short) 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder85 = builder77.importAllCollections(true);
        java.lang.String str86 = builder85.getmongoAdminPassword();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder88 = builder85.mongoLocalPassword("");
        builder85.setincludeCollection("is_mongos");
        builder85.isMongos = true;
        java.lang.String str93 = builder85.getmongoAdminPassword();
        builder85.dropCollection = false;
        java.lang.Object obj96 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float97 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test486");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("port", "script.default_lang");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test487");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "local");
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        docScoreSearchScript0.setNextScore((float) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long7 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test488");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218299", "admin");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test489");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820217755", "throttle_size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test490");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("skip_initial_import", "archive-stats");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test491");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk", "include_collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test492");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj35 = docScoreSearchScript0.run();
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test493");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("filter", "actions");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test494");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218299", "type");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test495");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820217755", "filter");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test496");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mycollection", "mydatabase.mycollection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test497");
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
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder26);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder26.script("filter");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition30 = builder26.build();
        java.lang.String str31 = mongoDBRiverDefinition30.getDEFAULT_DB_HOST();
        java.lang.String str32 = mongoDBRiverDefinition30.getACTIONS_FIELD();
        docScoreSearchScript0.setNextVar("local", (java.lang.Object) str32);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition36 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder35);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition37 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder35);
        builder35.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder35.mongoSecondaryReadPreference(true);
        builder35.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder35.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder45.includeCollection("mongodb-1638820218299");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder45.mongoAdminPassword("host");
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory50 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition52 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder51);
        java.lang.String str53 = mongoDBRiverDefinition52.mongoDb;
        java.lang.String str54 = mongoDBRiverDefinition52.getCONCURRENT_BULK_REQUESTS_FIELD();
        int int55 = mongoDBRiverDefinition52.throttleSize;
        boolean boolean56 = mongoDBRiverDefinition52.getskipInitialImport();
        java.lang.String str57 = mongoDBRiverDefinition52.getScriptType();
        java.lang.String str58 = mongoDBRiverDefinition52.getSIZE_FIELD();
        java.lang.String str59 = mongoDBRiverDefinition52.statisticsIndexName;
        java.lang.String str60 = mongoDBRiverDefinition52.getMongoLocalUser();
        com.mongodb.BasicDBObject basicDBObject61 = mongoDBRiverDefinition52.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript62 = docScoreNativeScriptFactory50.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject61);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition64 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder63);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition65 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder63);
        builder63.mongoAdminPassword = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder69 = builder63.mongoSecondaryReadPreference(true);
        builder63.includeCollection = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder73 = builder63.mongoDb("concurrent_bulk_requests");
        java.lang.String str74 = builder73.statisticsIndexName;
        com.mongodb.BasicDBObject basicDBObject75 = builder73.getmongoOplogFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder76 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition77 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder76);
        java.lang.String str78 = mongoDBRiverDefinition77.mongoDb;
        java.lang.String str79 = mongoDBRiverDefinition77.getCONCURRENT_BULK_REQUESTS_FIELD();
        int int80 = mongoDBRiverDefinition77.throttleSize;
        boolean boolean81 = mongoDBRiverDefinition77.getskipInitialImport();
        java.lang.String str82 = mongoDBRiverDefinition77.getScriptType();
        com.mongodb.BasicDBObject basicDBObject83 = mongoDBRiverDefinition77.mongoCollectionFilter;
        builder73.mongoCollectionFilter = basicDBObject83;
        org.elasticsearch.script.ExecutableScript executableScript85 = docScoreNativeScriptFactory50.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject83);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder86 = builder49.mongoOplogFilter(basicDBObject83);
        docScoreSearchScript0.setNextVar("mongodb-1638820218408", (java.lang.Object) builder86);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj88 = docScoreSearchScript0.run();
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test498");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("db", "is_mongos");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test499");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("store_statistics", "options");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test500");
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
        float float47 = docScoreSearchScript0.runAsFloat();
    }
}

