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
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("_river", "hi!");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("exclude_fields", "concurrent_bulk_requests");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float1 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj4 = docScoreSearchScript0.run();
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("servers", "servers");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("hi!", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj1 = docScoreSearchScript0.run();
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double1 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("ssl", "script_type");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("disable_index_refresh", "host");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("name", "local");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("connect_timeout", "concurrent_bulk_requests");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("throttle_size", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("exclude_fields", "actions");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) '4');
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("ssl_verify_certificate", "ssl_verify_certificate");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script_type", "credentials");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("localhost", "store_statistics");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("drop_collection", "options");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218387", "servers");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("disable_index_refresh", "skip_initial_import");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("credentials", "concurrent_bulk_requests");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("concurrent_bulk_requests", "local");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double15 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("ssl", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("credentials", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("include_collection", "options");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("skip_initial_import", "flush_interval");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("_river", "actions");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("_river", "index");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("disable_index_refresh", "gridfs");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("concurrent_requests", "actions");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(27017);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
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
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory34 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition36 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder35);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition37 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder35);
        java.lang.String str38 = mongoDBRiverDefinition37.getDISABLE_INDEX_REFRESH_FIELD();
        java.lang.String str39 = mongoDBRiverDefinition37.getRiverName();
        java.util.List<com.mongodb.ServerAddress> serverAddressList40 = mongoDBRiverDefinition37.getMongoServers();
        boolean boolean41 = mongoDBRiverDefinition37.advancedTransformation;
        com.mongodb.BasicDBObject basicDBObject42 = mongoDBRiverDefinition37.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript43 = docScoreNativeScriptFactory34.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject42);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject42);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder4);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder4);
        java.lang.String str7 = mongoDBRiverDefinition6.getDISABLE_INDEX_REFRESH_FIELD();
        boolean boolean8 = mongoDBRiverDefinition6.isDisableIndexRefresh();
        java.lang.String str9 = mongoDBRiverDefinition6.getEXCLUDE_FIELDS_FIELD();
        java.lang.Object obj10 = docScoreSearchScript0.unwrap((java.lang.Object) str9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj11 = docScoreSearchScript0.run();
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "null.null");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk", "bulk_size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218387", "name");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("servers", "password");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("hi!", "include_fields");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("flush_interval", "local");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("include_collection", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218387", "options");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        docScoreSearchScript0.setNextScore(0.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) '4');
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("concurrent_bulk_requests", "hi!");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("drop_collection", "bulk");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("admin", "size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
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
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder34.mongoAdminPassword("");
        java.lang.String[] strArray41 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet42 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet42, strArray41);
        builder37.excludeFields = strSet42;
        com.mongodb.BasicDBObject basicDBObject45 = builder37.mongoCollectionFilter;
        com.mongodb.BasicDBObject basicDBObject46 = builder37.mongoCollectionFilter;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject46);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float15 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218387", "user");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("import_all_collections", "include_fields");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double53 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("collection", "password");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder4);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder4);
        java.lang.String str7 = mongoDBRiverDefinition6.getDISABLE_INDEX_REFRESH_FIELD();
        boolean boolean8 = mongoDBRiverDefinition6.isDisableIndexRefresh();
        java.lang.String str9 = mongoDBRiverDefinition6.getACTIONS_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition6.getMongoOplogNamespace();
        java.lang.String str11 = mongoDBRiverDefinition6.getMongoLocalPassword();
        java.lang.String str12 = mongoDBRiverDefinition6.getSCRIPT_FIELD();
        com.mongodb.BasicDBObject basicDBObject13 = mongoDBRiverDefinition6.mongoCollectionFilter;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject13);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("parent_types", "exclude_fields");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("ssl", "mongodb-1638820218424");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj53 = docScoreSearchScript0.run();
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("concurrent_bulk_requests", "secondary_read_preference");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("include_collection", "mongodb-1638820218363");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        docScoreSearchScript0.setNextScore(0.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder6);
        builder6.setthrottleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder11);
        boolean boolean13 = mongoDBRiverDefinition12.storeStatistics;
        boolean boolean14 = mongoDBRiverDefinition12.isDisableIndexRefresh();
        java.lang.String str15 = mongoDBRiverDefinition12.getMongoLocalUser();
        java.util.Set<java.lang.String> strSet16 = mongoDBRiverDefinition12.getIncludeFields();
        java.lang.String str17 = mongoDBRiverDefinition12.getINITIAL_TIMESTAMP_SCRIPT_FIELD();
        java.lang.String str18 = mongoDBRiverDefinition12.includeCollection;
        java.lang.String str19 = mongoDBRiverDefinition12.getMongoAdminPassword();
        java.lang.String str20 = mongoDBRiverDefinition12.getDROP_COLLECTION_FIELD();
        java.lang.String str21 = mongoDBRiverDefinition12.mongoAdminPassword;
        java.lang.String str22 = mongoDBRiverDefinition12.getMongoCollection();
        com.mongodb.BasicDBObject basicDBObject23 = mongoDBRiverDefinition12.getMongoCollectionFilter();
        builder6.mongoCollectionFilter = basicDBObject23;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject23);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) '#');
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "mongodb-1638820218387");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (byte) -1);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("parent_types", "connect_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("host", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long34 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long53 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218424", "parent_types");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "servers");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("actions", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("options", "hi!");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("exclude_fields", "mongodb-1638820218408");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((float) (short) 100);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter9 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString4();
        java.lang.String str11 = serializedObjectSupporter9.deserializeObjectString1();
        docScoreSearchScript0.setNextVar("include_fields", (java.lang.Object) str11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(0);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("servers", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("local", "null.null");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long4 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_size", "mongodb-1638820218264");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("password", "include_collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder4);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder4);
        java.lang.String str7 = mongoDBRiverDefinition6.getDISABLE_INDEX_REFRESH_FIELD();
        boolean boolean8 = mongoDBRiverDefinition6.isDisableIndexRefresh();
        java.lang.String str9 = mongoDBRiverDefinition6.getEXCLUDE_FIELDS_FIELD();
        java.lang.Object obj10 = docScoreSearchScript0.unwrap((java.lang.Object) str9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder11);
        boolean boolean13 = mongoDBRiverDefinition12.storeStatistics;
        java.lang.String str14 = mongoDBRiverDefinition12.getTypeName();
        java.lang.String str15 = mongoDBRiverDefinition12.getIndexName();
        java.lang.String str16 = mongoDBRiverDefinition12.getMongoAdminUser();
        java.lang.String str17 = mongoDBRiverDefinition12.getMongoOplogNamespace();
        com.mongodb.BasicDBObject basicDBObject18 = mongoDBRiverDefinition12.mongoCollectionFilter;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("ssl", "null.null");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "actions");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "throttle_size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (short) -1);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("gridfs", "socket_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "mongodb-1638820218363");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218299", "flush_interval");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218264", "secondary_read_preference");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((float) (short) 100);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter9 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString4();
        java.lang.String str11 = serializedObjectSupporter9.deserializeObjectString1();
        docScoreSearchScript0.setNextVar("include_fields", (java.lang.Object) str11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(10);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float34 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("admin", "ssl_verify_certificate");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("filter", "script");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("secondary_read_preference", "local");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("socket_timeout", "include_fields");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script_type", "local");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("connect_timeout", "gridfs");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str2 = builder1.gettypeName();
        builder1.setmongoDb("concurrent_bulk_requests");
        builder1.riverName = "throttle_size";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder1.socketTimeout((int) (byte) 0);
        java.util.Set<java.lang.String> strSet9 = builder8.getparentTypes();
        java.lang.String str10 = builder8.getindexName();
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory11 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder12);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder12);
        java.lang.String str15 = mongoDBRiverDefinition14.getDISABLE_INDEX_REFRESH_FIELD();
        java.lang.String str16 = mongoDBRiverDefinition14.getRiverName();
        java.util.List<com.mongodb.ServerAddress> serverAddressList17 = mongoDBRiverDefinition14.getMongoServers();
        boolean boolean18 = mongoDBRiverDefinition14.advancedTransformation;
        com.mongodb.BasicDBObject basicDBObject19 = mongoDBRiverDefinition14.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript20 = docScoreNativeScriptFactory11.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject19);
        builder8.mongoCollectionFilter = basicDBObject19;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject19);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("include_fields", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("_river", "concurrent_requests");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("_river", "collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("socket_timeout", "ssl_verify_certificate");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("ssl_verify_certificate", "script_type");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (byte) 10);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((float) (short) 100);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter9 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString4();
        java.lang.String str11 = serializedObjectSupporter9.deserializeObjectString1();
        docScoreSearchScript0.setNextVar("include_fields", (java.lang.Object) str11);
        docScoreSearchScript0.setNextScore((float) 1L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj15 = docScoreSearchScript0.run();
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "name");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "localhost");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("null.null", "store_statistics");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("options", "size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((float) (short) 100);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter9 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString4();
        java.lang.String str11 = serializedObjectSupporter9.deserializeObjectString1();
        docScoreSearchScript0.setNextVar("include_fields", (java.lang.Object) str11);
        docScoreSearchScript0.setNextScore((float) 1L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double15 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218326", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_timeout", "include_fields");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("options", "db");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float27 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long1 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script", "mongodb-1638820218326");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long15 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("type", "options");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("host", "size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("concurrent_requests", "mongodb-1638820218424");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218449", "local");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("store_statistics", "bulk");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218264", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820217755", "bulk_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("import_all_collections", "local");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("disable_index_refresh", "store_statistics");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("concurrent_bulk_requests", "_river");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("admin", "localhost");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218424", "include_collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218408", "host");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("flush_interval", "hi!");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("import_all_collections", "bulk");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script_type", "initial_timestamp");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder4);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder4);
        java.lang.String str7 = mongoDBRiverDefinition6.getDISABLE_INDEX_REFRESH_FIELD();
        boolean boolean8 = mongoDBRiverDefinition6.isDisableIndexRefresh();
        java.lang.String str9 = mongoDBRiverDefinition6.getEXCLUDE_FIELDS_FIELD();
        java.lang.Object obj10 = docScoreSearchScript0.unwrap((java.lang.Object) str9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long11 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
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
        docScoreSearchScript0.setNextScore(100.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long19 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float53 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_timeout", "concurrent_bulk_requests");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "bulk_size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218424", "drop_collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long19 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double20 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218363", "store_statistics");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("local", "mongodb-1638820218387");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) '#');
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "include_fields");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218424", "user");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) ' ');
        docScoreSearchScript0.setNextScore(10.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float5 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((float) (short) 100);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter9 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString4();
        java.lang.String str11 = serializedObjectSupporter9.deserializeObjectString1();
        docScoreSearchScript0.setNextVar("include_fields", (java.lang.Object) str11);
        docScoreSearchScript0.setNextScore((float) 1L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long15 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("ssl", "include_collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("include_fields", "bulk_size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("port", "advanced_transformation");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long20 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("host", "disable_index_refresh");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("import_all_collections", "secondary_read_preference");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("collection", "store_statistics");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("collection", "concurrent_bulk_requests");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("ssl", "flush_interval");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        docScoreSearchScript0.setNextScore(0.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float6 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("local", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("db", "socket_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long3 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float20 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((float) (short) 100);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter9 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString4();
        java.lang.String str11 = serializedObjectSupporter9.deserializeObjectString1();
        docScoreSearchScript0.setNextVar("include_fields", (java.lang.Object) str11);
        docScoreSearchScript0.setNextScore((float) 1L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) ' ');
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("servers", "gridfs");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218424", "secondary_read_preference");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("initial_timestamp", "import_all_collections");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("local", "ssl");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("index", "disable_index_refresh");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218363", "exclude_fields");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218424", "concurrent_bulk_requests.null");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (byte) 1);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218449", "port");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("admin", "parent_types");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        docScoreSearchScript0.setNextScore(0.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder6);
        java.lang.String str9 = mongoDBRiverDefinition8.getDISABLE_INDEX_REFRESH_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getRiverName();
        java.util.List<com.mongodb.ServerAddress> serverAddressList11 = mongoDBRiverDefinition8.getMongoServers();
        boolean boolean12 = mongoDBRiverDefinition8.advancedTransformation;
        com.mongodb.BasicDBObject basicDBObject13 = mongoDBRiverDefinition8.getMongoCollectionFilter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject13);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (byte) -1);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("local", "advanced_transformation");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("host", "db");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("user", "ssl_verify_certificate");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("secondary_read_preference", "name");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((float) (short) 100);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter9 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString4();
        java.lang.String str11 = serializedObjectSupporter9.deserializeObjectString1();
        docScoreSearchScript0.setNextVar("include_fields", (java.lang.Object) str11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double13 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("ssl", "mongodb-1638820218363");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("host", "servers");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("host", "name");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("connect_timeout", "bulk_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((float) (short) 100);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter9 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString4();
        java.lang.String str11 = serializedObjectSupporter9.deserializeObjectString1();
        docScoreSearchScript0.setNextVar("include_fields", (java.lang.Object) str11);
        docScoreSearchScript0.setNextScore((float) 1L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((-1));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((float) (short) 100);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter9 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString4();
        java.lang.String str11 = serializedObjectSupporter9.deserializeObjectString1();
        docScoreSearchScript0.setNextVar("include_fields", (java.lang.Object) str11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj13 = docScoreSearchScript0.run();
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("filter", "socket_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("password", "drop_collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("name", "bulk");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("import_all_collections", "mongodb-1638820217755");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("secondary_read_preference", "concurrent_requests");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218326", "parent_types");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
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
        docScoreSearchScript0.setNextScore(100.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj19 = docScoreSearchScript0.run();
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) ' ');
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long5 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("concurrent_bulk_requests", "connect_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("name", "mongodb-1638820218387");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("include_collection", "collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str5 = builder4.gettypeName();
        builder4.setmongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder4);
        java.lang.String str9 = builder4.statisticsTypeName;
        java.lang.Object obj10 = docScoreSearchScript0.unwrap((java.lang.Object) builder4);
        docScoreSearchScript0.setNextScore(0.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double13 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("credentials", "password");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("store_statistics", "index");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("null.null", "filter");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "mongodb-1638820218326");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("collection", "user");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218424", "_river");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str5 = builder4.gettypeName();
        builder4.setmongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder4);
        java.lang.String str9 = builder4.statisticsTypeName;
        java.lang.Object obj10 = docScoreSearchScript0.unwrap((java.lang.Object) builder4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double11 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("localhost", "mongodb-1638820218424");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("parent_types", "servers");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long17 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_size", "type");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("host", "admin");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218326", "filter");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("secondary_read_preference", "initial_timestamp");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj19 = docScoreSearchScript0.run();
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("localhost", "credentials");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script_type", "mongodb-1638820218363");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("store_statistics", "hi!");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218326", "bulk_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218449", "credentials");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("local", "script");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("index", "include_collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("host", "port");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("options", "admin");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218299", "concurrent_requests");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("servers", "ssl");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk", "bulk");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("import_all_collections", "localhost");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("secondary_read_preference", "import_all_collections");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("localhost", "throttle_size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("localhost", "mongodb-1638820218264");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("credentials", "size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_timeout", "mongodb-1638820218326");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("db", "_river");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("localhost", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("flush_interval", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("initial_timestamp", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) ' ');
        docScoreSearchScript0.setNextScore(10.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(1);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((float) (short) 100);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter9 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString4();
        java.lang.String str11 = serializedObjectSupporter9.deserializeObjectString1();
        docScoreSearchScript0.setNextVar("include_fields", (java.lang.Object) str11);
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj17 = docScoreSearchScript0.run();
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((float) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj8 = docScoreSearchScript0.run();
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
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
        docScoreSearchScript0.setNextScore((float) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double17 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("flush_interval", "mongodb-1638820218363");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double17 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("ssl", "drop_collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_size", "servers");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "mongodb-1638820217755");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218387", "size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("db", "script");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218326", "exclude_fields");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj51 = docScoreSearchScript0.run();
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("parent_types", "concurrent_bulk_requests");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("flush_interval", "options");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk", "include_collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("name", "store_statistics");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj15 = docScoreSearchScript0.run();
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("drop_collection", "mongodb-1638820218424");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("_river", "bulk_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("hi!", "secondary_read_preference");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218408", "parent_types");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "port");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("socket_timeout", "store_statistics");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("disable_index_refresh", "connect_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("ssl", "include_fields");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("size", "collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("db", "mongodb-1638820218424");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218408", "credentials");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "script_type");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("null.null", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218299", "localhost");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218408", "admin");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "mongodb-1638820218264");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("drop_collection", "hi!");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("gridfs", "hi!");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("flush_interval", "admin");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("include_fields", "gridfs");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("port", "user");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_size", "filter");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("name", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("connect_timeout", "disable_index_refresh");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("concurrent_bulk_requests.null", "admin");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218299", "mongodb-1638820218363");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "options");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test283");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (byte) 0);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        docScoreSearchScript0.setNextScore(0.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj6 = docScoreSearchScript0.run();
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218449", "user");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test286");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("credentials", "user");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("servers", "connect_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test288");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820217755", "index");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((float) (short) 100);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter9 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString4();
        java.lang.String str11 = serializedObjectSupporter9.deserializeObjectString1();
        docScoreSearchScript0.setNextVar("include_fields", (java.lang.Object) str11);
        docScoreSearchScript0.setNextScore((float) 0L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float15 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test290");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218299", "local");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test291");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218299", "mongodb-1638820218299");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test292");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("ssl_verify_certificate", "skip_initial_import");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test293");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("exclude_fields", "db");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test294");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("advanced_transformation", "hi!");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test295");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("db", "concurrent_bulk_requests.null");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test296");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820217755", "ssl");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test297");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("password", "type");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test298");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("local", "collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test299");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((float) (short) 100);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter9 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString4();
        java.lang.String str11 = serializedObjectSupporter9.deserializeObjectString1();
        docScoreSearchScript0.setNextVar("include_fields", (java.lang.Object) str11);
        docScoreSearchScript0.setNextScore((float) 1L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder15);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder15);
        builder15.setthrottleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder15.importAllCollections(true);
        builder15.setindexName("drop_collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder24.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.mongoAdminUser("disable_index_refresh");
        java.lang.String[] strArray47 = new java.lang.String[] { "mongodb-1638820218387", "mongodb-1638820218387", "localhost", "", "localhost", "host", "user", "hi!", "actions", "exclude_fields", "throttle_size", "ssl_verify_certificate", "local", "disable_index_refresh", "user", "port", "actions", "host" };
        java.util.LinkedHashSet<java.lang.String> strSet48 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet48, strArray47);
        builder26.excludeFields = strSet48;
        builder15.includeFields = strSet48;
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter52 = builder15.serializedObjectSupporter;
        builder15.mongoLocalPassword = "exclude_fields";
        java.lang.Object obj55 = docScoreSearchScript0.unwrap((java.lang.Object) "exclude_fields");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = builder56.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder58.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition62 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder61);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder64 = builder61.mongoAdminPassword("");
        java.lang.String[] strArray68 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet69 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet69, strArray68);
        builder64.excludeFields = strSet69;
        builder58.setexcludeFields((java.util.Set<java.lang.String>) strSet69);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder74 = builder58.mongoUseSSL(false);
        java.lang.String str75 = builder74.getindexName();
        boolean boolean76 = builder74.getadvancedTransformation();
        builder74.setmongoLocalUser("mongodb-1638820217755");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder80 = builder74.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder82 = builder80.mongoLocalUser("bulk_size");
        com.mongodb.BasicDBObject basicDBObject83 = builder82.getmongoCollectionFilter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject83);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test300");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("actions", "local");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test301");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("db", "mongodb-1638820217755");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test302");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("password", "null.null");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test303");
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
        docScoreSearchScript0.setNextScore((float) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj21 = docScoreSearchScript0.run();
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test304");
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
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long22 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test305");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((float) (short) 100);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter9 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString4();
        java.lang.String str11 = serializedObjectSupporter9.deserializeObjectString1();
        docScoreSearchScript0.setNextVar("include_fields", (java.lang.Object) str11);
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(1000);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test306");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("throttle_size", "mongodb-1638820218299");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test307");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("socket_timeout", "advanced_transformation");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test308");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218326", "actions");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test309");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_size", "mongodb-1638820217755");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test310");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk", "throttle_size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test311");
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
        docScoreSearchScript0.setNextScore(100.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double19 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test312");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("hi!", "localhost");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test313");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "drop_collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test314");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("connect_timeout", "user");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test315");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((float) (short) 100);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter9 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString4();
        java.lang.String str11 = serializedObjectSupporter9.deserializeObjectString1();
        docScoreSearchScript0.setNextVar("include_fields", (java.lang.Object) str11);
        docScoreSearchScript0.setNextScore((float) 1L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder15);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder15);
        builder15.setthrottleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder15.importAllCollections(true);
        builder15.setindexName("drop_collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder24.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.mongoAdminUser("disable_index_refresh");
        java.lang.String[] strArray47 = new java.lang.String[] { "mongodb-1638820218387", "mongodb-1638820218387", "localhost", "", "localhost", "host", "user", "hi!", "actions", "exclude_fields", "throttle_size", "ssl_verify_certificate", "local", "disable_index_refresh", "user", "port", "actions", "host" };
        java.util.LinkedHashSet<java.lang.String> strSet48 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet48, strArray47);
        builder26.excludeFields = strSet48;
        builder15.includeFields = strSet48;
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter52 = builder15.serializedObjectSupporter;
        builder15.mongoLocalPassword = "exclude_fields";
        java.lang.Object obj55 = docScoreSearchScript0.unwrap((java.lang.Object) "exclude_fields");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float56 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test316");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("drop_collection", "concurrent_bulk_requests.null");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test317");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("options", "mongodb-1638820218408");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test318");
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
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(10);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test319");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_timeout", "script_type");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test320");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("collection", "_river");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test321");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("ssl_verify_certificate", "import_all_collections");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test322");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double19 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test323");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("throttle_size", "throttle_size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test324");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("gridfs", "filter");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test325");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("flush_interval", "import_all_collections");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test326");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("skip_initial_import", "bulk");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test327");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218264", "disable_index_refresh");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test328");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("actions", "include_fields");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test329");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("disable_index_refresh", "actions");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test330");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("gridfs", "name");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test331");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("localhost", "_river");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test332");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) ' ');
        docScoreSearchScript0.setNextScore(10.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double5 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test333");
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
        docScoreSearchScript0.setNextScore((float) (byte) 10);
        docScoreSearchScript0.setNextScore((float) 1000);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float19 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test334");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("db", "mongodb-1638820218449");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test335");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("concurrent_bulk_requests.null", "secondary_read_preference");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test336");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("options", "include_fields");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test337");
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
        docScoreSearchScript0.setNextScore(0.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float17 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test338");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("name", "advanced_transformation");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test339");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("disable_index_refresh", "flush_interval");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test340");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("disable_index_refresh", "servers");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test341");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("credentials", "index");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test342");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("include_fields", "credentials");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test343");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) ' ');
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        docScoreSearchScript0.setNextScore(100.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.mongoAdminUser("disable_index_refresh");
        java.util.Set<java.lang.String> strSet12 = builder9.excludeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder9.scriptType("mongodb-1638820218387");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.mongoLocalPassword("_river");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder14.riverIndexName("mongodb-1638820218387");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder19);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder19);
        builder19.setthrottleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder24);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder24.mongoAdminPassword("");
        java.lang.String[] strArray31 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        builder27.excludeFields = strSet32;
        com.mongodb.BasicDBObject basicDBObject35 = builder27.mongoCollectionFilter;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder19.mongoOplogFilter(basicDBObject35);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder18.mongoCollectionFilter(basicDBObject35);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder18.mongoAdminUser("throttle_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition41 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder40);
        boolean boolean42 = mongoDBRiverDefinition41.storeStatistics;
        boolean boolean43 = mongoDBRiverDefinition41.isDisableIndexRefresh();
        java.lang.String str44 = mongoDBRiverDefinition41.getMongoLocalUser();
        java.util.Set<java.lang.String> strSet45 = mongoDBRiverDefinition41.getIncludeFields();
        java.lang.String str46 = mongoDBRiverDefinition41.getINITIAL_TIMESTAMP_SCRIPT_FIELD();
        java.lang.String str47 = mongoDBRiverDefinition41.includeCollection;
        java.lang.String str48 = mongoDBRiverDefinition41.getMongoAdminPassword();
        boolean boolean49 = mongoDBRiverDefinition41.getmongoUseSSL();
        boolean boolean50 = mongoDBRiverDefinition41.isStoreStatistics();
        java.util.Set<java.lang.String> strSet51 = mongoDBRiverDefinition41.excludeFields;
        java.lang.String str52 = mongoDBRiverDefinition41.getRiverIndexName();
        com.mongodb.BasicDBObject basicDBObject53 = mongoDBRiverDefinition41.getMongoCollectionFilter();
        builder18.mongoOplogFilter = basicDBObject53;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject53);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test344");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("ssl_verify_certificate", "mongodb-1638820218408");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test345");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("_river", "local");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test346");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script", "_river");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test347");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("include_collection", "db");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test348");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218363", "bulk_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test349");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("concurrent_requests", "host");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test350");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("password", "mongodb-1638820218449");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test351");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) ' ');
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test352");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) ' ');
        docScoreSearchScript0.setNextScore(10.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj5 = docScoreSearchScript0.run();
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test353");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218449", "concurrent_requests");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test354");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("connect_timeout", "password");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test355");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        docScoreSearchScript0.setNextScore(0.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long6 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test356");
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
        docScoreSearchScript0.setNextScore((float) (byte) 10);
        docScoreSearchScript0.setNextScore((float) 1000);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (short) 1);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test357");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218387", "exclude_fields");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test358");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("localhost", "type");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test359");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) ' ');
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder6);
        java.lang.String str9 = mongoDBRiverDefinition8.getDISABLE_INDEX_REFRESH_FIELD();
        boolean boolean10 = mongoDBRiverDefinition8.isDisableIndexRefresh();
        com.mongodb.MongoClientOptions mongoClientOptions11 = mongoDBRiverDefinition8.getMongoClientOptions();
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter12 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings13 = serializedObjectSupporter12.deserializeObjectRiverSettings4();
        org.elasticsearch.river.RiverSettings riverSettings14 = serializedObjectSupporter12.deserializeObjectRiverSettings1();
        org.elasticsearch.river.RiverSettings riverSettings15 = serializedObjectSupporter12.deserializeObjectRiverSettings7();
        org.elasticsearch.river.RiverSettings riverSettings16 = serializedObjectSupporter12.deserializeObjectRiverSettings5();
        java.lang.String str17 = serializedObjectSupporter12.deserializeObjectString1();
        org.elasticsearch.river.RiverSettings riverSettings18 = serializedObjectSupporter12.deserializeObjectRiverSettings5();
        org.elasticsearch.river.RiverSettings riverSettings19 = serializedObjectSupporter12.deserializeObjectRiverSettings9();
        mongoDBRiverDefinition8.serializedObjectSupporter = serializedObjectSupporter12;
        java.lang.String str21 = serializedObjectSupporter12.deserializeObjectString14();
        java.lang.String str22 = serializedObjectSupporter12.deserializeObjectString18();
        docScoreSearchScript0.setNextVar("mongodb-1638820218449", (java.lang.Object) str22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float24 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test360");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("local", "type");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test361");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218299", "bulk_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test362");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "type");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test363");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script", "localhost");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test364");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("parent_types", "flush_interval");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test365");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("name", "concurrent_bulk_requests");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test366");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "skip_initial_import");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test367");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("throttle_size", "admin");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test368");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("db", "null.null");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test369");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("exclude_fields", "secondary_read_preference");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test370");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_timeout", "skip_initial_import");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test371");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((float) (short) 100);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter9 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString4();
        java.lang.String str11 = serializedObjectSupporter9.deserializeObjectString1();
        docScoreSearchScript0.setNextVar("include_fields", (java.lang.Object) str11);
        docScoreSearchScript0.setNextScore((float) 1L);
        docScoreSearchScript0.setNextScore((float) 100L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) '4');
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test372");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("concurrent_bulk_requests.null", "drop_collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test373");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("connect_timeout", "concurrent_bulk_requests.null");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test374");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double3 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test375");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        docScoreSearchScript0.setNextScore(0.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder11);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder11.mongoAdminPassword("");
        java.lang.String[] strArray18 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        builder14.excludeFields = strSet19;
        builder8.setexcludeFields((java.util.Set<java.lang.String>) strSet19);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder8.mongoUseSSL(false);
        java.lang.String str25 = builder24.getindexName();
        boolean boolean26 = builder24.getadvancedTransformation();
        builder24.setmongoLocalUser("mongodb-1638820217755");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder24.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder30.mongoLocalUser("bulk_size");
        java.util.Set<java.lang.String> strSet33 = builder30.excludeFields;
        java.lang.Object obj34 = docScoreSearchScript0.unwrap((java.lang.Object) builder30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long35 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test376");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("user", "_river");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test377");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("exclude_fields", "bulk_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test378");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("concurrent_requests", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test379");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("store_statistics", "include_collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test380");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("ssl_verify_certificate", "local");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test381");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_size", "host");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test382");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("type", "localhost");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test383");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820217755", "host");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test384");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218264", "exclude_fields");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test385");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script_type", "name");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test386");
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
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript35 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript35.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str40 = builder39.gettypeName();
        builder39.setmongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition43 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder39);
        java.lang.String str44 = builder39.statisticsTypeName;
        java.lang.Object obj45 = docScoreSearchScript35.unwrap((java.lang.Object) builder39);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition46 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder39);
        docScoreSearchScript0.setNextVar("bulk_size", (java.lang.Object) builder39);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float48 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test387");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218264", "concurrent_requests");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test388");
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
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition53 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder52);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition54 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder52);
        java.lang.String str55 = mongoDBRiverDefinition54.getDISABLE_INDEX_REFRESH_FIELD();
        boolean boolean56 = mongoDBRiverDefinition54.isDisableIndexRefresh();
        java.lang.String str57 = mongoDBRiverDefinition54.getUSER_FIELD();
        java.lang.String str58 = mongoDBRiverDefinition54.getNAME_FIELD();
        java.lang.String str59 = mongoDBRiverDefinition54.getFLUSH_INTERVAL_FIELD();
        java.lang.String str60 = mongoDBRiverDefinition54.getStatisticsTypeName();
        java.lang.String str61 = mongoDBRiverDefinition54.getPASSWORD_FIELD();
        docScoreSearchScript0.setNextVar("connect_timeout", (java.lang.Object) mongoDBRiverDefinition54);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (short) 100);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test389");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("throttle_size", "_river");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test390");
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
        docScoreSearchScript0.setNextScore(100.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder19);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder19);
        java.lang.String str22 = mongoDBRiverDefinition21.getDISABLE_INDEX_REFRESH_FIELD();
        java.util.List<com.mongodb.ServerAddress> serverAddressList23 = mongoDBRiverDefinition21.getMongoServers();
        java.lang.String str24 = mongoDBRiverDefinition21.getSTORE_STATISTICS_FIELD();
        com.mongodb.BasicDBObject basicDBObject25 = mongoDBRiverDefinition21.getMongoCollectionFilter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject25);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test391");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("null.null", "collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test392");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_size", "admin");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test393");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("store_statistics", "credentials");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test394");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218387", "bulk_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test395");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((float) (short) 100);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter9 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString4();
        java.lang.String str11 = serializedObjectSupporter9.deserializeObjectString1();
        docScoreSearchScript0.setNextVar("include_fields", (java.lang.Object) str11);
        docScoreSearchScript0.setNextScore((float) 1L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder15);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder15);
        builder15.setthrottleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder15.importAllCollections(true);
        builder15.setindexName("drop_collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder24.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.mongoAdminUser("disable_index_refresh");
        java.lang.String[] strArray47 = new java.lang.String[] { "mongodb-1638820218387", "mongodb-1638820218387", "localhost", "", "localhost", "host", "user", "hi!", "actions", "exclude_fields", "throttle_size", "ssl_verify_certificate", "local", "disable_index_refresh", "user", "port", "actions", "host" };
        java.util.LinkedHashSet<java.lang.String> strSet48 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet48, strArray47);
        builder26.excludeFields = strSet48;
        builder15.includeFields = strSet48;
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter52 = builder15.serializedObjectSupporter;
        builder15.mongoLocalPassword = "exclude_fields";
        java.lang.Object obj55 = docScoreSearchScript0.unwrap((java.lang.Object) "exclude_fields");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj56 = docScoreSearchScript0.run();
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test396");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("admin", "advanced_transformation");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test397");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("password", "local");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test398");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_timeout", "drop_collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test399");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218326", "concurrent_requests");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test400");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("store_statistics", "user");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test401");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("password", "localhost");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test402");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("name", "mongodb-1638820218326");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test403");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("hi!", "type");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test404");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("initial_timestamp", "concurrent_bulk_requests");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test405");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("store_statistics", "filter");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test406");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("null.null", "credentials");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test407");
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
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript35 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript35.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str40 = builder39.gettypeName();
        builder39.setmongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition43 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder39);
        java.lang.String str44 = builder39.statisticsTypeName;
        java.lang.Object obj45 = docScoreSearchScript35.unwrap((java.lang.Object) builder39);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition46 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder39);
        docScoreSearchScript0.setNextVar("bulk_size", (java.lang.Object) builder39);
        docScoreSearchScript0.setNextScore((float) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(1000);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test408");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("throttle_size", "credentials");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test409");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("user", "user");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test410");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218264", "type");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test411");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("collection", "skip_initial_import");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test412");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) ' ');
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        docScoreSearchScript0.setNextScore(100.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long7 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test413");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("ssl", "connect_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test414");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("options", "port");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test415");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script", "mongodb-1638820217755");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test416");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script", "socket_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test417");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("admin", "user");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test418");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("socket_timeout", "localhost");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test419");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) ' ');
        docScoreSearchScript0.setNextScore(10.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str6 = builder5.gettypeName();
        builder5.setriverName("hi!");
        java.lang.String str9 = builder5.getmongoLocalPassword();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder5.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder12);
        boolean boolean14 = mongoDBRiverDefinition13.storeStatistics;
        boolean boolean15 = mongoDBRiverDefinition13.isDisableIndexRefresh();
        java.lang.String str16 = mongoDBRiverDefinition13.getMongoLocalUser();
        java.util.Set<java.lang.String> strSet17 = mongoDBRiverDefinition13.getIncludeFields();
        java.lang.String str18 = mongoDBRiverDefinition13.getINITIAL_TIMESTAMP_SCRIPT_FIELD();
        java.lang.String str19 = mongoDBRiverDefinition13.includeCollection;
        java.lang.String str20 = mongoDBRiverDefinition13.getMongoAdminPassword();
        java.lang.String str21 = mongoDBRiverDefinition13.getDROP_COLLECTION_FIELD();
        java.lang.String str22 = mongoDBRiverDefinition13.mongoAdminPassword;
        java.lang.String str23 = mongoDBRiverDefinition13.getMongoCollection();
        com.mongodb.BasicDBObject basicDBObject24 = mongoDBRiverDefinition13.getMongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder11.mongoCollectionFilter(basicDBObject24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject24);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test420");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_timeout", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test421");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("options", "parent_types");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test422");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("skip_initial_import", "password");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test423");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj3 = docScoreSearchScript0.run();
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test424");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218299", "disable_index_refresh");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test425");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("null.null", "admin");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test426");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((float) (short) 100);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter9 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString4();
        java.lang.String str11 = serializedObjectSupporter9.deserializeObjectString1();
        docScoreSearchScript0.setNextVar("include_fields", (java.lang.Object) str11);
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder17);
        boolean boolean19 = mongoDBRiverDefinition18.storeStatistics;
        boolean boolean20 = mongoDBRiverDefinition18.isDisableIndexRefresh();
        boolean boolean21 = mongoDBRiverDefinition18.getmongoSecondaryReadPreference();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp22 = mongoDBRiverDefinition18.initialTimestamp;
        java.lang.Object obj23 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float24 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test427");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("ssl", "bulk_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test428");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("port", "exclude_fields");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test429");
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
        docScoreSearchScript0.setNextScore((float) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float21 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test430");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) ' ');
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder6);
        java.lang.String str9 = mongoDBRiverDefinition8.getDISABLE_INDEX_REFRESH_FIELD();
        boolean boolean10 = mongoDBRiverDefinition8.isDisableIndexRefresh();
        com.mongodb.MongoClientOptions mongoClientOptions11 = mongoDBRiverDefinition8.getMongoClientOptions();
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter12 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings13 = serializedObjectSupporter12.deserializeObjectRiverSettings4();
        org.elasticsearch.river.RiverSettings riverSettings14 = serializedObjectSupporter12.deserializeObjectRiverSettings1();
        org.elasticsearch.river.RiverSettings riverSettings15 = serializedObjectSupporter12.deserializeObjectRiverSettings7();
        org.elasticsearch.river.RiverSettings riverSettings16 = serializedObjectSupporter12.deserializeObjectRiverSettings5();
        java.lang.String str17 = serializedObjectSupporter12.deserializeObjectString1();
        org.elasticsearch.river.RiverSettings riverSettings18 = serializedObjectSupporter12.deserializeObjectRiverSettings5();
        org.elasticsearch.river.RiverSettings riverSettings19 = serializedObjectSupporter12.deserializeObjectRiverSettings9();
        mongoDBRiverDefinition8.serializedObjectSupporter = serializedObjectSupporter12;
        java.lang.String str21 = serializedObjectSupporter12.deserializeObjectString14();
        java.lang.String str22 = serializedObjectSupporter12.deserializeObjectString18();
        docScoreSearchScript0.setNextVar("mongodb-1638820218449", (java.lang.Object) str22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long24 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test431");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820217755", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test432");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218408", "password");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test433");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218264", "script_type");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test434");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218264", "_river");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test435");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("size", "options");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test436");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218299", "script_type");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test437");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("concurrent_bulk_requests.null", "local");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test438");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script_type", "mongodb-1638820218299");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test439");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("drop_collection", "mongodb-1638820218408");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test440");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("parent_types", "db");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test441");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("skip_initial_import", "socket_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test442");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("user", "credentials");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test443");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("local", "host");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test444");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "ssl_verify_certificate");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test445");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) ' ');
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test446");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820217755", "mongodb-1638820218363");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test447");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("concurrent_requests", "index");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test448");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("password", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test449");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_size", "hi!");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test450");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("ssl", "disable_index_refresh");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test451");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_timeout", "socket_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test452");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("advanced_transformation", "mongodb-1638820218326");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test453");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("ssl", "host");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test454");
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
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript35 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript35.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str40 = builder39.gettypeName();
        builder39.setmongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition43 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder39);
        java.lang.String str44 = builder39.statisticsTypeName;
        java.lang.Object obj45 = docScoreSearchScript35.unwrap((java.lang.Object) builder39);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition46 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder39);
        docScoreSearchScript0.setNextVar("bulk_size", (java.lang.Object) builder39);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj48 = docScoreSearchScript0.run();
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test455");
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
        docScoreSearchScript0.setNextScore((float) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(8);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test456");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("index", "localhost");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test457");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) ' ');
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        docScoreSearchScript0.setNextScore(100.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(0);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test458");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_size", "ssl");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test459");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "include_collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test460");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("initial_timestamp", "mongodb-1638820218299");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test461");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script", "admin");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test462");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("options", "mongodb-1638820217755");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test463");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("disable_index_refresh", "script");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test464");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str5 = builder4.gettypeName();
        builder4.setmongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder4);
        java.lang.String str9 = builder4.statisticsTypeName;
        java.lang.Object obj10 = docScoreSearchScript0.unwrap((java.lang.Object) builder4);
        docScoreSearchScript0.setNextScore(0.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder13);
        boolean boolean16 = mongoDBRiverDefinition15.isImportAllCollections();
        java.lang.String str17 = mongoDBRiverDefinition15.getIndexName();
        java.lang.String str18 = mongoDBRiverDefinition15.getADVANCED_TRANSFORMATION_FIELD();
        com.mongodb.BasicDBObject basicDBObject19 = mongoDBRiverDefinition15.mongoCollectionFilter;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject19);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test465");
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
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder19);
        boolean boolean21 = mongoDBRiverDefinition20.storeStatistics;
        boolean boolean22 = mongoDBRiverDefinition20.isDisableIndexRefresh();
        java.lang.String str23 = mongoDBRiverDefinition20.getMongoLocalUser();
        java.util.Set<java.lang.String> strSet24 = mongoDBRiverDefinition20.getIncludeFields();
        java.lang.String str25 = mongoDBRiverDefinition20.getINITIAL_TIMESTAMP_SCRIPT_FIELD();
        java.lang.String str26 = mongoDBRiverDefinition20.includeCollection;
        java.lang.String str27 = mongoDBRiverDefinition20.getMongoAdminPassword();
        java.lang.String str28 = mongoDBRiverDefinition20.getSECONDARY_READ_PREFERENCE_FIELD();
        int int29 = mongoDBRiverDefinition20.socketTimeout;
        boolean boolean30 = mongoDBRiverDefinition20.disableIndexRefresh;
        java.lang.String str31 = mongoDBRiverDefinition20.mongoAdminUser;
        java.lang.Object obj32 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float33 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test466");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "concurrent_bulk_requests.null");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test467");
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
        docScoreSearchScript0.setNextScore(100.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str20 = builder19.gettypeName();
        builder19.setmongoDb("concurrent_bulk_requests");
        builder19.riverName = "throttle_size";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder19.socketTimeout((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder19.mongoAdminUser("servers");
        java.lang.String str29 = builder19.riverName;
        java.lang.String str30 = builder19.getmongoCollection();
        builder19.mongoDb = "db";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition33 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder19);
        java.lang.Object obj34 = docScoreSearchScript0.unwrap((java.lang.Object) builder19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(8);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test468");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("user", "name");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test469");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("hi!", "name");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test470");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((float) (short) 100);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter9 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString4();
        java.lang.String str11 = serializedObjectSupporter9.deserializeObjectString1();
        docScoreSearchScript0.setNextVar("include_fields", (java.lang.Object) str11);
        docScoreSearchScript0.setNextScore((float) 1L);
        docScoreSearchScript0.setNextScore(0.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double17 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test471");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_size", "skip_initial_import");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test472");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((float) (short) 100);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter9 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString4();
        java.lang.String str11 = serializedObjectSupporter9.deserializeObjectString1();
        docScoreSearchScript0.setNextVar("include_fields", (java.lang.Object) str11);
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        docScoreSearchScript0.setNextScore((float) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(32);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test473");
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
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.socketTimeout((int) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.mongoAdminUser("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition23 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder22);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder22.mongoAdminPassword("");
        java.lang.String[] strArray29 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet30 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet30, strArray29);
        builder25.excludeFields = strSet30;
        builder19.setexcludeFields((java.util.Set<java.lang.String>) strSet30);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder19.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition36 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder35);
        java.lang.String str37 = mongoDBRiverDefinition36.getADMIN_DB_FIELD();
        java.lang.String str38 = mongoDBRiverDefinition36.typeName;
        java.lang.String str39 = mongoDBRiverDefinition36.getBULK_FIELD();
        java.lang.Object obj40 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long41 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test474");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("local", "script_type");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test475");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("throttle_size", "host");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test476");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218387", "host");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test477");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("initial_timestamp", "servers");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test478");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("throttle_size", "store_statistics");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test479");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script_type", "throttle_size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test480");
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
        docScoreSearchScript0.setNextScore(100.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float19 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test481");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("ssl_verify_certificate", "concurrent_bulk_requests");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test482");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("concurrent_requests", "store_statistics");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test483");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("gridfs", "mongodb-1638820218424");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test484");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("db", "include_collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test485");
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
        docScoreSearchScript0.setNextScore((float) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long21 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test486");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("concurrent_bulk_requests.null", "bulk_size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test487");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("index", "user");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test488");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("name", "credentials");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test489");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218363", "credentials");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test490");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("type", "include_collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test491");
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
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition53 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder52);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition54 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder52);
        java.lang.String str55 = mongoDBRiverDefinition54.getDISABLE_INDEX_REFRESH_FIELD();
        boolean boolean56 = mongoDBRiverDefinition54.isDisableIndexRefresh();
        java.lang.String str57 = mongoDBRiverDefinition54.getUSER_FIELD();
        java.lang.String str58 = mongoDBRiverDefinition54.getNAME_FIELD();
        java.lang.String str59 = mongoDBRiverDefinition54.getFLUSH_INTERVAL_FIELD();
        java.lang.String str60 = mongoDBRiverDefinition54.getStatisticsTypeName();
        java.lang.String str61 = mongoDBRiverDefinition54.getPASSWORD_FIELD();
        docScoreSearchScript0.setNextVar("connect_timeout", (java.lang.Object) mongoDBRiverDefinition54);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition64 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder63);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder66 = builder63.mongoAdminPassword("");
        java.lang.String[] strArray70 = new java.lang.String[] { "disable_index_refresh", "disable_index_refresh", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet71 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet71, strArray70);
        builder66.excludeFields = strSet71;
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp74 = builder66.initialTimestamp;
        boolean boolean75 = builder66.advancedTransformation;
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter76 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings77 = serializedObjectSupporter76.deserializeObjectRiverSettings4();
        java.lang.String str78 = serializedObjectSupporter76.deserializeObjectString16();
        builder66.serializedObjectSupporter = serializedObjectSupporter76;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder81 = builder66.mongoSSLVerifyCertificate(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder83 = builder66.mongoSecondaryReadPreference(false);
        builder66.setindexName("exclude_fields");
        java.lang.Object obj86 = docScoreSearchScript0.unwrap((java.lang.Object) builder66);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj87 = docScoreSearchScript0.run();
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test492");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("name", "initial_timestamp");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test493");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("actions", "user");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test494");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) 'a');
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((float) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float8 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test495");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("host", "exclude_fields");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test496");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script", "parent_types");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test497");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("local", "concurrent_bulk_requests.null");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test498");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script", "mongodb-1638820218363");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test499");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("servers", "mongodb-1638820218408");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test500");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("name", "hi!");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }
}

