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
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("include_collection", "script.disable_dynamic");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float1 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj5 = docScoreSearchScript0.run();
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (byte) -1);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextVar("script", (java.lang.Object) 1L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long6 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float3 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) '4');
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (short) 100);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((float) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double5 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script_type", "index");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("ssl_verify_certificate", "bulk_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("ssl_verify_certificate", "hi!");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "sandbox");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj3 = docScoreSearchScript0.run();
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory3 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) docScoreNativeScriptFactory3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long5 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((float) (short) 10);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript6 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript6.setNextScore(0.0f);
        java.lang.Object obj10 = docScoreSearchScript6.unwrap((java.lang.Object) 1);
        docScoreSearchScript0.setNextVar("script_type", obj10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str13 = builder12.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder12.indexName("credentials");
        java.lang.String str16 = builder12.getscript();
        boolean boolean17 = builder12.getmongoSecondaryReadPreference();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        int int19 = builder18.getsocketTimeout();
        boolean boolean20 = builder18.mongoUseSSL;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str22 = builder21.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder21.indexName("credentials");
        com.mongodb.BasicDBObject basicDBObject25 = builder24.getmongoCollectionFilter();
        builder18.setmongoOplogFilter(basicDBObject25);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder12.mongoCollectionFilter(basicDBObject25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject25);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((float) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long5 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str4 = builder3.statisticsIndexName;
        int int5 = builder3.getthrottleSize();
        java.util.Set<java.lang.String> strSet6 = builder3.parentTypes;
        builder3.mongoLocalUser = "";
        builder3.mongoAdminPassword = "script.disable_dynamic";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder3.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str14 = builder13.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder13.indexName("credentials");
        java.lang.String str17 = builder16.mongoAdminUser;
        java.lang.String[] strArray46 = new java.lang.String[] { "throttle_size", "sandbox", "type", "skip_initial_import", "script", "bulk_size", "concurrent_bulk_requests", "script.disable_dynamic", "actions", "password", "include_collection", "script.disable_dynamic", "", "drop_collection", "type", "index", "disable_index_refresh", "skip_initial_import", "type", "store_statistics", "bulk", "include_collection", "localhost", "script_type", "credentials", "servers", "localhost", "sandbox" };
        java.util.LinkedHashSet<java.lang.String> strSet47 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet47, strArray46);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder16.parentTypes((java.util.Set<java.lang.String>) strSet47);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder49.mongoLocalPassword("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition52 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder51);
        java.lang.String str53 = mongoDBRiverDefinition52.getSIZE_FIELD();
        boolean boolean54 = mongoDBRiverDefinition52.disableIndexRefresh;
        boolean boolean55 = mongoDBRiverDefinition52.isMongoGridFS();
        com.mongodb.BasicDBObject basicDBObject56 = mongoDBRiverDefinition52.getMongoCollectionFilter();
        builder3.mongoCollectionFilter = basicDBObject56;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject56);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float5 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("sandbox", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("credentials", "bulk");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextVar("script", (java.lang.Object) 1L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double6 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("import_all_collections", "ssl");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory3 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) docScoreNativeScriptFactory3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(1000);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory3 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) docScoreNativeScriptFactory3);
        java.lang.Object obj6 = docScoreSearchScript0.unwrap((java.lang.Object) "host");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float7 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((float) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str7 = builder6.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder6.indexName("credentials");
        java.lang.String str10 = builder9.mongoAdminUser;
        java.lang.String[] strArray39 = new java.lang.String[] { "throttle_size", "sandbox", "type", "skip_initial_import", "script", "bulk_size", "concurrent_bulk_requests", "script.disable_dynamic", "actions", "password", "include_collection", "script.disable_dynamic", "", "drop_collection", "type", "index", "disable_index_refresh", "skip_initial_import", "type", "store_statistics", "bulk", "include_collection", "localhost", "script_type", "credentials", "servers", "localhost", "sandbox" };
        java.util.LinkedHashSet<java.lang.String> strSet40 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet40, strArray39);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder9.parentTypes((java.util.Set<java.lang.String>) strSet40);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder42.mongoLocalPassword("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition45 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder44);
        java.lang.String str46 = mongoDBRiverDefinition45.getSIZE_FIELD();
        java.lang.String str47 = mongoDBRiverDefinition45.getTHROTTLE_SIZE_FIELD();
        java.lang.String str48 = mongoDBRiverDefinition45.getCONCURRENT_BULK_REQUESTS_FIELD();
        int int49 = mongoDBRiverDefinition45.getDEFAULT_BULK_ACTIONS();
        java.lang.String str50 = mongoDBRiverDefinition45.getIMPORT_ALL_COLLECTIONS_FIELD();
        docScoreSearchScript0.setNextVar("", (java.lang.Object) str50);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double52 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("sandbox", "admin");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) "");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str6 = builder5.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder5.indexName("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder5.isMongos((java.lang.Boolean) true);
        java.lang.String str11 = builder5.mongoAdminPassword;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder5.mongoSSLVerifyCertificate(false);
        java.lang.String str14 = builder13.mongoAdminPassword;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str16 = builder15.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder15.indexName("credentials");
        java.lang.String str19 = builder15.getscript();
        boolean boolean20 = builder15.getmongoSecondaryReadPreference();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        int int22 = builder21.getsocketTimeout();
        boolean boolean23 = builder21.mongoUseSSL;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str25 = builder24.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder24.indexName("credentials");
        com.mongodb.BasicDBObject basicDBObject28 = builder27.getmongoCollectionFilter();
        builder21.setmongoOplogFilter(basicDBObject28);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder15.mongoCollectionFilter(basicDBObject28);
        builder13.setmongoCollectionFilter(basicDBObject28);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject28);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((float) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str7 = builder6.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder6.indexName("credentials");
        java.lang.String str10 = builder9.mongoAdminUser;
        java.lang.String[] strArray39 = new java.lang.String[] { "throttle_size", "sandbox", "type", "skip_initial_import", "script", "bulk_size", "concurrent_bulk_requests", "script.disable_dynamic", "actions", "password", "include_collection", "script.disable_dynamic", "", "drop_collection", "type", "index", "disable_index_refresh", "skip_initial_import", "type", "store_statistics", "bulk", "include_collection", "localhost", "script_type", "credentials", "servers", "localhost", "sandbox" };
        java.util.LinkedHashSet<java.lang.String> strSet40 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet40, strArray39);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder9.parentTypes((java.util.Set<java.lang.String>) strSet40);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder42.mongoLocalPassword("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition45 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder44);
        java.lang.String str46 = mongoDBRiverDefinition45.getSIZE_FIELD();
        java.lang.String str47 = mongoDBRiverDefinition45.getTHROTTLE_SIZE_FIELD();
        java.lang.String str48 = mongoDBRiverDefinition45.getCONCURRENT_BULK_REQUESTS_FIELD();
        int int49 = mongoDBRiverDefinition45.getDEFAULT_BULK_ACTIONS();
        java.lang.String str50 = mongoDBRiverDefinition45.getIMPORT_ALL_COLLECTIONS_FIELD();
        docScoreSearchScript0.setNextVar("", (java.lang.Object) str50);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long52 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("index", "db");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) 1);
        org.elasticsearch.common.ParseField parseField6 = org.elasticsearch.script.ScriptService.SCRIPT_ID;
        docScoreSearchScript0.setNextVar("index", (java.lang.Object) parseField6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        int int10 = builder9.getsocketTimeout();
        boolean boolean11 = builder9.mongoUseSSL;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str13 = builder12.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder12.indexName("credentials");
        java.lang.String str16 = builder15.mongoAdminUser;
        java.lang.String[] strArray45 = new java.lang.String[] { "throttle_size", "sandbox", "type", "skip_initial_import", "script", "bulk_size", "concurrent_bulk_requests", "script.disable_dynamic", "actions", "password", "include_collection", "script.disable_dynamic", "", "drop_collection", "type", "index", "disable_index_refresh", "skip_initial_import", "type", "store_statistics", "bulk", "include_collection", "localhost", "script_type", "credentials", "servers", "localhost", "sandbox" };
        java.util.LinkedHashSet<java.lang.String> strSet46 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet46, strArray45);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder15.parentTypes((java.util.Set<java.lang.String>) strSet46);
        builder9.excludeFields = strSet46;
        java.lang.String str50 = builder9.getmongoCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition51 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder9);
        docScoreSearchScript0.setNextVar("flush_interval", (java.lang.Object) mongoDBRiverDefinition51);
        docScoreSearchScript0.setNextScore((float) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(0);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((float) (short) 10);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript6 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript6.setNextScore(0.0f);
        java.lang.Object obj10 = docScoreSearchScript6.unwrap((java.lang.Object) 1);
        docScoreSearchScript0.setNextVar("script_type", obj10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long12 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextVar("script", (java.lang.Object) 1L);
        docScoreSearchScript0.setNextScore((float) (-1L));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long8 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((float) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str6 = builder5.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder5.indexName("credentials");
        com.mongodb.BasicDBObject basicDBObject9 = builder8.getmongoCollectionFilter();
        java.util.List<com.mongodb.ServerAddress> serverAddressList10 = builder8.getmongoServers();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder8.disableIndexRefresh(true);
        builder12.setthrottleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str16 = builder15.statisticsIndexName;
        int int17 = builder15.getthrottleSize();
        java.util.Set<java.lang.String> strSet18 = builder15.parentTypes;
        builder15.mongoLocalUser = "";
        builder15.mongoAdminPassword = "script.disable_dynamic";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder15.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str26 = builder25.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder25.indexName("credentials");
        java.lang.String str29 = builder28.mongoAdminUser;
        java.lang.String[] strArray58 = new java.lang.String[] { "throttle_size", "sandbox", "type", "skip_initial_import", "script", "bulk_size", "concurrent_bulk_requests", "script.disable_dynamic", "actions", "password", "include_collection", "script.disable_dynamic", "", "drop_collection", "type", "index", "disable_index_refresh", "skip_initial_import", "type", "store_statistics", "bulk", "include_collection", "localhost", "script_type", "credentials", "servers", "localhost", "sandbox" };
        java.util.LinkedHashSet<java.lang.String> strSet59 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet59, strArray58);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = builder28.parentTypes((java.util.Set<java.lang.String>) strSet59);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = builder61.mongoLocalPassword("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition64 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder63);
        java.lang.String str65 = mongoDBRiverDefinition64.getSIZE_FIELD();
        boolean boolean66 = mongoDBRiverDefinition64.disableIndexRefresh;
        boolean boolean67 = mongoDBRiverDefinition64.isMongoGridFS();
        com.mongodb.BasicDBObject basicDBObject68 = mongoDBRiverDefinition64.getMongoCollectionFilter();
        builder15.mongoCollectionFilter = basicDBObject68;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder70 = builder12.mongoOplogFilter(basicDBObject68);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject68);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) 1);
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj7 = docScoreSearchScript0.run();
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("size", "initial_timestamp");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj1 = docScoreSearchScript0.run();
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) 1);
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double7 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("socket_timeout", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((float) (short) 10);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript6 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript6.setNextScore(0.0f);
        java.lang.Object obj10 = docScoreSearchScript6.unwrap((java.lang.Object) 1);
        docScoreSearchScript0.setNextVar("script_type", obj10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double12 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((float) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (byte) 100);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        int int4 = builder3.getsocketTimeout();
        boolean boolean5 = builder3.mongoUseSSL;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str7 = builder6.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder6.indexName("credentials");
        com.mongodb.BasicDBObject basicDBObject10 = builder9.getmongoCollectionFilter();
        builder3.setmongoOplogFilter(basicDBObject10);
        builder3.throttleSize = 10;
        builder3.setsocketTimeout(10);
        java.lang.String[] strArray56 = new java.lang.String[] { "gridfs", "include_fields", "", "collection", "drop_collection", "db", "size", "servers", "script.disable_dynamic", "bulk_size", "local", "index", "is_mongos", "bulk_timeout", "include_collection", "servers", "password", "name", "port", "credentials", "flush_interval", "advanced_transformation", "", "user", "bulk_timeout", "index", "drop_collection", "options", "flush_interval", "script", "sandbox", "options", "actions", "script.default_lang", "disable_index_refresh", "collection", "ssl_verify_certificate", "connect_timeout", "gridfs", "bulk" };
        java.util.LinkedHashSet<java.lang.String> strSet57 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet57, strArray56);
        builder3.setparentTypes((java.util.Set<java.lang.String>) strSet57);
        java.lang.String str60 = builder3.getscript();
        com.mongodb.BasicDBObject basicDBObject61 = builder3.getmongoCollectionFilter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject61);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script_type", "advanced_transformation");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((float) (short) 10);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript6 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript6.setNextScore(0.0f);
        java.lang.Object obj10 = docScoreSearchScript6.unwrap((java.lang.Object) 1);
        docScoreSearchScript0.setNextVar("script_type", obj10);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript12 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript12.setNextScore(0.0f);
        java.lang.Object obj16 = docScoreSearchScript12.unwrap((java.lang.Object) "");
        java.lang.Object obj17 = docScoreSearchScript0.unwrap((java.lang.Object) "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float18 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) 1);
        org.elasticsearch.common.ParseField parseField6 = org.elasticsearch.script.ScriptService.SCRIPT_ID;
        docScoreSearchScript0.setNextVar("index", (java.lang.Object) parseField6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        int int10 = builder9.getsocketTimeout();
        boolean boolean11 = builder9.mongoUseSSL;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str13 = builder12.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder12.indexName("credentials");
        java.lang.String str16 = builder15.mongoAdminUser;
        java.lang.String[] strArray45 = new java.lang.String[] { "throttle_size", "sandbox", "type", "skip_initial_import", "script", "bulk_size", "concurrent_bulk_requests", "script.disable_dynamic", "actions", "password", "include_collection", "script.disable_dynamic", "", "drop_collection", "type", "index", "disable_index_refresh", "skip_initial_import", "type", "store_statistics", "bulk", "include_collection", "localhost", "script_type", "credentials", "servers", "localhost", "sandbox" };
        java.util.LinkedHashSet<java.lang.String> strSet46 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet46, strArray45);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder15.parentTypes((java.util.Set<java.lang.String>) strSet46);
        builder9.excludeFields = strSet46;
        java.lang.String str50 = builder9.getmongoCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition51 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder9);
        docScoreSearchScript0.setNextVar("flush_interval", (java.lang.Object) mongoDBRiverDefinition51);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str55 = builder54.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder54.indexName("credentials");
        com.mongodb.BasicDBObject basicDBObject58 = builder57.getmongoCollectionFilter();
        java.util.List<com.mongodb.ServerAddress> serverAddressList59 = builder57.getmongoServers();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = builder57.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = builder57.disableIndexRefresh(true);
        docScoreSearchScript0.setNextVar("is_mongos", (java.lang.Object) builder57);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long65 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((float) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str6 = builder5.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder5.indexName("credentials");
        java.lang.String str9 = builder8.mongoAdminUser;
        java.lang.String[] strArray38 = new java.lang.String[] { "throttle_size", "sandbox", "type", "skip_initial_import", "script", "bulk_size", "concurrent_bulk_requests", "script.disable_dynamic", "actions", "password", "include_collection", "script.disable_dynamic", "", "drop_collection", "type", "index", "disable_index_refresh", "skip_initial_import", "type", "store_statistics", "bulk", "include_collection", "localhost", "script_type", "credentials", "servers", "localhost", "sandbox" };
        java.util.LinkedHashSet<java.lang.String> strSet39 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet39, strArray38);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder8.parentTypes((java.util.Set<java.lang.String>) strSet39);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder41.mongoLocalPassword("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition44 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder43);
        java.lang.String str45 = mongoDBRiverDefinition44.getSIZE_FIELD();
        boolean boolean46 = mongoDBRiverDefinition44.disableIndexRefresh;
        boolean boolean47 = mongoDBRiverDefinition44.isMongoGridFS();
        com.mongodb.BasicDBObject basicDBObject48 = mongoDBRiverDefinition44.getMongoCollectionFilter();
        java.lang.String str49 = mongoDBRiverDefinition44.getBULK_TIMEOUT_FIELD();
        java.lang.String str50 = mongoDBRiverDefinition44.getScriptType();
        java.lang.Object obj51 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition44);
        docScoreSearchScript0.setNextVar("throttle_size", (java.lang.Object) "name");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj55 = docScoreSearchScript0.run();
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) 1);
        org.elasticsearch.common.ParseField parseField6 = org.elasticsearch.script.ScriptService.SCRIPT_ID;
        docScoreSearchScript0.setNextVar("index", (java.lang.Object) parseField6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        int int10 = builder9.getsocketTimeout();
        boolean boolean11 = builder9.mongoUseSSL;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str13 = builder12.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder12.indexName("credentials");
        java.lang.String str16 = builder15.mongoAdminUser;
        java.lang.String[] strArray45 = new java.lang.String[] { "throttle_size", "sandbox", "type", "skip_initial_import", "script", "bulk_size", "concurrent_bulk_requests", "script.disable_dynamic", "actions", "password", "include_collection", "script.disable_dynamic", "", "drop_collection", "type", "index", "disable_index_refresh", "skip_initial_import", "type", "store_statistics", "bulk", "include_collection", "localhost", "script_type", "credentials", "servers", "localhost", "sandbox" };
        java.util.LinkedHashSet<java.lang.String> strSet46 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet46, strArray45);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder15.parentTypes((java.util.Set<java.lang.String>) strSet46);
        builder9.excludeFields = strSet46;
        java.lang.String str50 = builder9.getmongoCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition51 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder9);
        docScoreSearchScript0.setNextVar("flush_interval", (java.lang.Object) mongoDBRiverDefinition51);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str55 = builder54.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder54.indexName("credentials");
        com.mongodb.BasicDBObject basicDBObject58 = builder57.getmongoCollectionFilter();
        java.util.List<com.mongodb.ServerAddress> serverAddressList59 = builder57.getmongoServers();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = builder57.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = builder57.disableIndexRefresh(true);
        docScoreSearchScript0.setNextVar("is_mongos", (java.lang.Object) builder57);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj65 = docScoreSearchScript0.run();
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("throttle_size", "script_type");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((float) (short) 10);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript6 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript6.setNextScore(0.0f);
        java.lang.Object obj10 = docScoreSearchScript6.unwrap((java.lang.Object) 1);
        docScoreSearchScript0.setNextVar("script_type", obj10);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript12 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript12.setNextScore(0.0f);
        java.lang.Object obj16 = docScoreSearchScript12.unwrap((java.lang.Object) "");
        java.lang.Object obj17 = docScoreSearchScript0.unwrap((java.lang.Object) "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long18 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextVar("script", (java.lang.Object) 1L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        int int8 = builder7.getsocketTimeout();
        boolean boolean9 = builder7.mongoUseSSL;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.advancedTransformation(false);
        java.lang.String str12 = builder7.riverName;
        java.lang.String str13 = builder7.getstatisticsTypeName();
        builder7.setmongoCollection("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder7.scriptType("script_type");
        docScoreSearchScript0.setNextVar("sandbox", (java.lang.Object) "script_type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        int int20 = builder19.getsocketTimeout();
        boolean boolean21 = builder19.mongoUseSSL;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str23 = builder22.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder22.indexName("credentials");
        com.mongodb.BasicDBObject basicDBObject26 = builder25.getmongoCollectionFilter();
        builder19.setmongoOplogFilter(basicDBObject26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject26);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script.disable_dynamic", "exclude_fields");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((float) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(0);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory3 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) docScoreNativeScriptFactory3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj5 = docScoreSearchScript0.run();
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextVar("script", (java.lang.Object) 1L);
        docScoreSearchScript0.setNextScore((float) (-1L));
        docScoreSearchScript0.setNextScore(0.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str11 = builder10.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder10.indexName("credentials");
        com.mongodb.BasicDBObject basicDBObject14 = builder13.getmongoCollectionFilter();
        java.util.List<com.mongodb.ServerAddress> serverAddressList15 = builder13.getmongoServers();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder13.disableIndexRefresh(true);
        builder17.setthrottleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str21 = builder20.statisticsIndexName;
        int int22 = builder20.getthrottleSize();
        java.util.Set<java.lang.String> strSet23 = builder20.parentTypes;
        builder20.mongoLocalUser = "";
        builder20.mongoAdminPassword = "script.disable_dynamic";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder20.disableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str31 = builder30.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder30.indexName("credentials");
        java.lang.String str34 = builder33.mongoAdminUser;
        java.lang.String[] strArray63 = new java.lang.String[] { "throttle_size", "sandbox", "type", "skip_initial_import", "script", "bulk_size", "concurrent_bulk_requests", "script.disable_dynamic", "actions", "password", "include_collection", "script.disable_dynamic", "", "drop_collection", "type", "index", "disable_index_refresh", "skip_initial_import", "type", "store_statistics", "bulk", "include_collection", "localhost", "script_type", "credentials", "servers", "localhost", "sandbox" };
        java.util.LinkedHashSet<java.lang.String> strSet64 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet64, strArray63);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder66 = builder33.parentTypes((java.util.Set<java.lang.String>) strSet64);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder68 = builder66.mongoLocalPassword("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition69 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder68);
        java.lang.String str70 = mongoDBRiverDefinition69.getSIZE_FIELD();
        boolean boolean71 = mongoDBRiverDefinition69.disableIndexRefresh;
        boolean boolean72 = mongoDBRiverDefinition69.isMongoGridFS();
        com.mongodb.BasicDBObject basicDBObject73 = mongoDBRiverDefinition69.getMongoCollectionFilter();
        builder20.mongoCollectionFilter = basicDBObject73;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder75 = builder17.mongoOplogFilter(basicDBObject73);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject73);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextVar("script", (java.lang.Object) 1L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float6 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory3 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) docScoreNativeScriptFactory3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double5 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((float) (short) 10);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript6 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript6.setNextScore(0.0f);
        java.lang.Object obj10 = docScoreSearchScript6.unwrap((java.lang.Object) 1);
        docScoreSearchScript0.setNextVar("script_type", obj10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float12 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((float) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str6 = builder5.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder5.indexName("credentials");
        java.lang.String str9 = builder8.mongoAdminUser;
        java.lang.String[] strArray38 = new java.lang.String[] { "throttle_size", "sandbox", "type", "skip_initial_import", "script", "bulk_size", "concurrent_bulk_requests", "script.disable_dynamic", "actions", "password", "include_collection", "script.disable_dynamic", "", "drop_collection", "type", "index", "disable_index_refresh", "skip_initial_import", "type", "store_statistics", "bulk", "include_collection", "localhost", "script_type", "credentials", "servers", "localhost", "sandbox" };
        java.util.LinkedHashSet<java.lang.String> strSet39 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet39, strArray38);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder8.parentTypes((java.util.Set<java.lang.String>) strSet39);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder41.mongoLocalPassword("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition44 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder43);
        java.lang.String str45 = mongoDBRiverDefinition44.getSIZE_FIELD();
        boolean boolean46 = mongoDBRiverDefinition44.disableIndexRefresh;
        boolean boolean47 = mongoDBRiverDefinition44.isMongoGridFS();
        com.mongodb.BasicDBObject basicDBObject48 = mongoDBRiverDefinition44.getMongoCollectionFilter();
        java.lang.String str49 = mongoDBRiverDefinition44.getBULK_TIMEOUT_FIELD();
        java.lang.String str50 = mongoDBRiverDefinition44.getScriptType();
        java.lang.Object obj51 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition44);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj52 = docScoreSearchScript0.run();
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) 1);
        org.elasticsearch.common.ParseField parseField6 = org.elasticsearch.script.ScriptService.SCRIPT_ID;
        docScoreSearchScript0.setNextVar("index", (java.lang.Object) parseField6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        int int10 = builder9.getsocketTimeout();
        boolean boolean11 = builder9.mongoUseSSL;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str13 = builder12.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder12.indexName("credentials");
        java.lang.String str16 = builder15.mongoAdminUser;
        java.lang.String[] strArray45 = new java.lang.String[] { "throttle_size", "sandbox", "type", "skip_initial_import", "script", "bulk_size", "concurrent_bulk_requests", "script.disable_dynamic", "actions", "password", "include_collection", "script.disable_dynamic", "", "drop_collection", "type", "index", "disable_index_refresh", "skip_initial_import", "type", "store_statistics", "bulk", "include_collection", "localhost", "script_type", "credentials", "servers", "localhost", "sandbox" };
        java.util.LinkedHashSet<java.lang.String> strSet46 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet46, strArray45);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder15.parentTypes((java.util.Set<java.lang.String>) strSet46);
        builder9.excludeFields = strSet46;
        java.lang.String str50 = builder9.getmongoCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition51 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder9);
        docScoreSearchScript0.setNextVar("flush_interval", (java.lang.Object) mongoDBRiverDefinition51);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(27017);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("null.null", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("connect_timeout", "socket_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((float) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str6 = builder5.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder5.indexName("credentials");
        java.lang.String str9 = builder8.mongoAdminUser;
        java.lang.String[] strArray38 = new java.lang.String[] { "throttle_size", "sandbox", "type", "skip_initial_import", "script", "bulk_size", "concurrent_bulk_requests", "script.disable_dynamic", "actions", "password", "include_collection", "script.disable_dynamic", "", "drop_collection", "type", "index", "disable_index_refresh", "skip_initial_import", "type", "store_statistics", "bulk", "include_collection", "localhost", "script_type", "credentials", "servers", "localhost", "sandbox" };
        java.util.LinkedHashSet<java.lang.String> strSet39 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet39, strArray38);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder8.parentTypes((java.util.Set<java.lang.String>) strSet39);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder41.mongoLocalPassword("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition44 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder43);
        java.lang.String str45 = mongoDBRiverDefinition44.getSIZE_FIELD();
        boolean boolean46 = mongoDBRiverDefinition44.disableIndexRefresh;
        boolean boolean47 = mongoDBRiverDefinition44.isMongoGridFS();
        com.mongodb.BasicDBObject basicDBObject48 = mongoDBRiverDefinition44.getMongoCollectionFilter();
        java.lang.String str49 = mongoDBRiverDefinition44.getBULK_TIMEOUT_FIELD();
        java.lang.String str50 = mongoDBRiverDefinition44.getScriptType();
        java.lang.Object obj51 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition44);
        docScoreSearchScript0.setNextVar("throttle_size", (java.lang.Object) "name");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double55 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextVar("script", (java.lang.Object) 1L);
        docScoreSearchScript0.setNextScore((float) (-1L));
        docScoreSearchScript0.setNextScore(0.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long10 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextVar("script", (java.lang.Object) 1L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        int int8 = builder7.getsocketTimeout();
        boolean boolean9 = builder7.mongoUseSSL;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.advancedTransformation(false);
        java.lang.String str12 = builder7.riverName;
        java.lang.String str13 = builder7.getstatisticsTypeName();
        builder7.setmongoCollection("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder7.scriptType("script_type");
        docScoreSearchScript0.setNextVar("sandbox", (java.lang.Object) "script_type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str21 = builder20.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder20.indexName("credentials");
        com.mongodb.BasicDBObject basicDBObject24 = builder23.getmongoCollectionFilter();
        java.lang.String str25 = builder23.getmongoAdminUser();
        builder23.statisticsTypeName = "is_mongos";
        docScoreSearchScript0.setNextVar("actions", (java.lang.Object) builder23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long29 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("connect_timeout", "import_all_collections");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory3 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) docScoreNativeScriptFactory3);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str6 = builder5.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder5.indexName("credentials");
        java.lang.String str9 = builder8.mongoAdminUser;
        java.lang.String[] strArray38 = new java.lang.String[] { "throttle_size", "sandbox", "type", "skip_initial_import", "script", "bulk_size", "concurrent_bulk_requests", "script.disable_dynamic", "actions", "password", "include_collection", "script.disable_dynamic", "", "drop_collection", "type", "index", "disable_index_refresh", "skip_initial_import", "type", "store_statistics", "bulk", "include_collection", "localhost", "script_type", "credentials", "servers", "localhost", "sandbox" };
        java.util.LinkedHashSet<java.lang.String> strSet39 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet39, strArray38);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder8.parentTypes((java.util.Set<java.lang.String>) strSet39);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder41.mongoLocalPassword("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition44 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder43);
        java.lang.String str45 = mongoDBRiverDefinition44.getSIZE_FIELD();
        boolean boolean46 = mongoDBRiverDefinition44.disableIndexRefresh;
        java.lang.String str47 = mongoDBRiverDefinition44.getACTIONS_FIELD();
        java.lang.String str48 = mongoDBRiverDefinition44.statisticsTypeName;
        boolean boolean49 = mongoDBRiverDefinition44.isAdvancedTransformation();
        java.lang.String str50 = mongoDBRiverDefinition44.riverIndexName;
        boolean boolean51 = mongoDBRiverDefinition44.getmongoSSLVerifyCertificate();
        java.lang.Boolean boolean52 = mongoDBRiverDefinition44.isMongos;
        boolean boolean53 = mongoDBRiverDefinition44.getmongoSecondaryReadPreference();
        com.mongodb.BasicDBObject basicDBObject54 = mongoDBRiverDefinition44.mongoCollectionFilter;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject54);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory3 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) docScoreNativeScriptFactory3);
        java.lang.Object obj6 = docScoreSearchScript0.unwrap((java.lang.Object) "host");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str9 = builder8.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder8.indexName("credentials");
        java.lang.String str12 = builder8.getscript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder8.scriptType("index");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str16 = builder15.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder15.indexName("credentials");
        java.lang.String str19 = builder15.getscript();
        boolean boolean20 = builder15.getmongoSecondaryReadPreference();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        int int22 = builder21.getsocketTimeout();
        boolean boolean23 = builder21.mongoUseSSL;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str25 = builder24.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder24.indexName("credentials");
        com.mongodb.BasicDBObject basicDBObject28 = builder27.getmongoCollectionFilter();
        builder21.setmongoOplogFilter(basicDBObject28);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder15.mongoCollectionFilter(basicDBObject28);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder14.mongoOplogFilter(basicDBObject28);
        java.lang.String str32 = builder31.mongoAdminPassword;
        int int33 = builder31.connectTimeout;
        boolean boolean34 = builder31.advancedTransformation;
        docScoreSearchScript0.setNextVar("script.default_lang", (java.lang.Object) builder31);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long36 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double5 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (byte) 100);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((float) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str6 = builder5.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder5.indexName("credentials");
        java.lang.String str9 = builder8.mongoAdminUser;
        java.lang.String[] strArray38 = new java.lang.String[] { "throttle_size", "sandbox", "type", "skip_initial_import", "script", "bulk_size", "concurrent_bulk_requests", "script.disable_dynamic", "actions", "password", "include_collection", "script.disable_dynamic", "", "drop_collection", "type", "index", "disable_index_refresh", "skip_initial_import", "type", "store_statistics", "bulk", "include_collection", "localhost", "script_type", "credentials", "servers", "localhost", "sandbox" };
        java.util.LinkedHashSet<java.lang.String> strSet39 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet39, strArray38);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder8.parentTypes((java.util.Set<java.lang.String>) strSet39);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder41.mongoLocalPassword("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition44 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder43);
        java.lang.String str45 = mongoDBRiverDefinition44.getSIZE_FIELD();
        boolean boolean46 = mongoDBRiverDefinition44.disableIndexRefresh;
        boolean boolean47 = mongoDBRiverDefinition44.isMongoGridFS();
        com.mongodb.BasicDBObject basicDBObject48 = mongoDBRiverDefinition44.getMongoCollectionFilter();
        java.lang.String str49 = mongoDBRiverDefinition44.getBULK_TIMEOUT_FIELD();
        java.lang.String str50 = mongoDBRiverDefinition44.getScriptType();
        java.lang.Object obj51 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition44);
        docScoreSearchScript0.setNextVar("throttle_size", (java.lang.Object) "name");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) 'a');
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((float) (short) 10);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript6 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript6.setNextScore(0.0f);
        java.lang.Object obj10 = docScoreSearchScript6.unwrap((java.lang.Object) 1);
        docScoreSearchScript0.setNextVar("script_type", obj10);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript12 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript12.setNextScore(0.0f);
        java.lang.Object obj16 = docScoreSearchScript12.unwrap((java.lang.Object) "");
        java.lang.Object obj17 = docScoreSearchScript0.unwrap((java.lang.Object) "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj18 = docScoreSearchScript0.run();
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((float) (short) 10);
        docScoreSearchScript0.setNextScore(0.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj7 = docScoreSearchScript0.run();
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((float) (short) 10);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript6 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript6.setNextScore(0.0f);
        java.lang.Object obj10 = docScoreSearchScript6.unwrap((java.lang.Object) 1);
        docScoreSearchScript0.setNextVar("script_type", obj10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (short) 1);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("exclude_fields", "size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) 1);
        org.elasticsearch.common.ParseField parseField6 = org.elasticsearch.script.ScriptService.SCRIPT_ID;
        docScoreSearchScript0.setNextVar("index", (java.lang.Object) parseField6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        int int10 = builder9.getsocketTimeout();
        boolean boolean11 = builder9.mongoUseSSL;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str13 = builder12.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder12.indexName("credentials");
        java.lang.String str16 = builder15.mongoAdminUser;
        java.lang.String[] strArray45 = new java.lang.String[] { "throttle_size", "sandbox", "type", "skip_initial_import", "script", "bulk_size", "concurrent_bulk_requests", "script.disable_dynamic", "actions", "password", "include_collection", "script.disable_dynamic", "", "drop_collection", "type", "index", "disable_index_refresh", "skip_initial_import", "type", "store_statistics", "bulk", "include_collection", "localhost", "script_type", "credentials", "servers", "localhost", "sandbox" };
        java.util.LinkedHashSet<java.lang.String> strSet46 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet46, strArray45);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder15.parentTypes((java.util.Set<java.lang.String>) strSet46);
        builder9.excludeFields = strSet46;
        java.lang.String str50 = builder9.getmongoCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition51 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder9);
        docScoreSearchScript0.setNextVar("flush_interval", (java.lang.Object) mongoDBRiverDefinition51);
        docScoreSearchScript0.setNextScore((float) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj55 = docScoreSearchScript0.run();
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory3 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) docScoreNativeScriptFactory3);
        java.lang.Object obj6 = docScoreSearchScript0.unwrap((java.lang.Object) "host");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str9 = builder8.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder8.indexName("credentials");
        java.lang.String str12 = builder8.getscript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder8.scriptType("index");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str16 = builder15.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder15.indexName("credentials");
        java.lang.String str19 = builder15.getscript();
        boolean boolean20 = builder15.getmongoSecondaryReadPreference();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        int int22 = builder21.getsocketTimeout();
        boolean boolean23 = builder21.mongoUseSSL;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str25 = builder24.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder24.indexName("credentials");
        com.mongodb.BasicDBObject basicDBObject28 = builder27.getmongoCollectionFilter();
        builder21.setmongoOplogFilter(basicDBObject28);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder15.mongoCollectionFilter(basicDBObject28);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder14.mongoOplogFilter(basicDBObject28);
        java.lang.String str32 = builder31.mongoAdminPassword;
        int int33 = builder31.connectTimeout;
        boolean boolean34 = builder31.advancedTransformation;
        docScoreSearchScript0.setNextVar("script.default_lang", (java.lang.Object) builder31);
        docScoreSearchScript0.setNextScore((float) 60000);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj38 = docScoreSearchScript0.run();
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) 1);
        org.elasticsearch.common.ParseField parseField6 = org.elasticsearch.script.ScriptService.SCRIPT_ID;
        docScoreSearchScript0.setNextVar("index", (java.lang.Object) parseField6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        int int10 = builder9.getsocketTimeout();
        boolean boolean11 = builder9.mongoUseSSL;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str13 = builder12.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder12.indexName("credentials");
        java.lang.String str16 = builder15.mongoAdminUser;
        java.lang.String[] strArray45 = new java.lang.String[] { "throttle_size", "sandbox", "type", "skip_initial_import", "script", "bulk_size", "concurrent_bulk_requests", "script.disable_dynamic", "actions", "password", "include_collection", "script.disable_dynamic", "", "drop_collection", "type", "index", "disable_index_refresh", "skip_initial_import", "type", "store_statistics", "bulk", "include_collection", "localhost", "script_type", "credentials", "servers", "localhost", "sandbox" };
        java.util.LinkedHashSet<java.lang.String> strSet46 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet46, strArray45);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder15.parentTypes((java.util.Set<java.lang.String>) strSet46);
        builder9.excludeFields = strSet46;
        java.lang.String str50 = builder9.getmongoCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition51 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder9);
        docScoreSearchScript0.setNextVar("flush_interval", (java.lang.Object) mongoDBRiverDefinition51);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        int int54 = builder53.getsocketTimeout();
        builder53.setskipInitialImport(false);
        builder53.mongoAdminUser = "initial_timestamp";
        builder53.script = "script.disable_dynamic";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = builder53.statisticsTypeName("secondary_read_preference");
        builder53.setscriptType("size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition65 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder53);
        com.mongodb.BasicDBObject basicDBObject66 = mongoDBRiverDefinition65.getMongoCollectionFilter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject66);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("ssl_verify_certificate", "sandbox");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("script.default_lang", "null.null");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("throttle_size", "exclude_fields");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) 1);
        org.elasticsearch.common.ParseField parseField6 = org.elasticsearch.script.ScriptService.SCRIPT_ID;
        docScoreSearchScript0.setNextVar("index", (java.lang.Object) parseField6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        int int10 = builder9.getsocketTimeout();
        boolean boolean11 = builder9.mongoUseSSL;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str13 = builder12.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder12.indexName("credentials");
        java.lang.String str16 = builder15.mongoAdminUser;
        java.lang.String[] strArray45 = new java.lang.String[] { "throttle_size", "sandbox", "type", "skip_initial_import", "script", "bulk_size", "concurrent_bulk_requests", "script.disable_dynamic", "actions", "password", "include_collection", "script.disable_dynamic", "", "drop_collection", "type", "index", "disable_index_refresh", "skip_initial_import", "type", "store_statistics", "bulk", "include_collection", "localhost", "script_type", "credentials", "servers", "localhost", "sandbox" };
        java.util.LinkedHashSet<java.lang.String> strSet46 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet46, strArray45);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder15.parentTypes((java.util.Set<java.lang.String>) strSet46);
        builder9.excludeFields = strSet46;
        java.lang.String str50 = builder9.getmongoCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition51 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder9);
        docScoreSearchScript0.setNextVar("flush_interval", (java.lang.Object) mongoDBRiverDefinition51);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str55 = builder54.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder54.indexName("credentials");
        com.mongodb.BasicDBObject basicDBObject58 = builder57.getmongoCollectionFilter();
        java.util.List<com.mongodb.ServerAddress> serverAddressList59 = builder57.getmongoServers();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = builder57.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = builder57.disableIndexRefresh(true);
        docScoreSearchScript0.setNextVar("is_mongos", (java.lang.Object) builder57);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (short) 0);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextVar("script", (java.lang.Object) 1L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        int int8 = builder7.getsocketTimeout();
        boolean boolean9 = builder7.mongoUseSSL;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.advancedTransformation(false);
        java.lang.String str12 = builder7.riverName;
        java.lang.String str13 = builder7.getstatisticsTypeName();
        builder7.setmongoCollection("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder7.scriptType("script_type");
        docScoreSearchScript0.setNextVar("sandbox", (java.lang.Object) "script_type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str21 = builder20.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder20.indexName("credentials");
        com.mongodb.BasicDBObject basicDBObject24 = builder23.getmongoCollectionFilter();
        java.lang.String str25 = builder23.getmongoAdminUser();
        builder23.statisticsTypeName = "is_mongos";
        docScoreSearchScript0.setNextVar("actions", (java.lang.Object) builder23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double29 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((float) (short) 10);
        docScoreSearchScript0.setNextScore(0.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float7 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((float) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str7 = builder6.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder6.indexName("credentials");
        java.lang.String str10 = builder9.mongoAdminUser;
        java.lang.String[] strArray39 = new java.lang.String[] { "throttle_size", "sandbox", "type", "skip_initial_import", "script", "bulk_size", "concurrent_bulk_requests", "script.disable_dynamic", "actions", "password", "include_collection", "script.disable_dynamic", "", "drop_collection", "type", "index", "disable_index_refresh", "skip_initial_import", "type", "store_statistics", "bulk", "include_collection", "localhost", "script_type", "credentials", "servers", "localhost", "sandbox" };
        java.util.LinkedHashSet<java.lang.String> strSet40 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet40, strArray39);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder9.parentTypes((java.util.Set<java.lang.String>) strSet40);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder42.mongoLocalPassword("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition45 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder44);
        java.lang.String str46 = mongoDBRiverDefinition45.getSIZE_FIELD();
        java.lang.String str47 = mongoDBRiverDefinition45.getTHROTTLE_SIZE_FIELD();
        java.lang.String str48 = mongoDBRiverDefinition45.getCONCURRENT_BULK_REQUESTS_FIELD();
        int int49 = mongoDBRiverDefinition45.getDEFAULT_BULK_ACTIONS();
        java.lang.String str50 = mongoDBRiverDefinition45.getIMPORT_ALL_COLLECTIONS_FIELD();
        docScoreSearchScript0.setNextVar("", (java.lang.Object) str50);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj52 = docScoreSearchScript0.run();
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((float) (short) 10);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript6 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript6.setNextScore(0.0f);
        java.lang.Object obj10 = docScoreSearchScript6.unwrap((java.lang.Object) 1);
        docScoreSearchScript0.setNextVar("script_type", obj10);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript12 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript12.setNextScore(0.0f);
        java.lang.Object obj16 = docScoreSearchScript12.unwrap((java.lang.Object) "");
        java.lang.Object obj17 = docScoreSearchScript0.unwrap((java.lang.Object) "");
        docScoreSearchScript0.setNextScore((float) 32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(8);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("store_statistics", "local");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) 1);
        org.elasticsearch.common.ParseField parseField6 = org.elasticsearch.script.ScriptService.SCRIPT_ID;
        docScoreSearchScript0.setNextVar("index", (java.lang.Object) parseField6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        int int10 = builder9.getsocketTimeout();
        boolean boolean11 = builder9.mongoUseSSL;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str13 = builder12.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder12.indexName("credentials");
        java.lang.String str16 = builder15.mongoAdminUser;
        java.lang.String[] strArray45 = new java.lang.String[] { "throttle_size", "sandbox", "type", "skip_initial_import", "script", "bulk_size", "concurrent_bulk_requests", "script.disable_dynamic", "actions", "password", "include_collection", "script.disable_dynamic", "", "drop_collection", "type", "index", "disable_index_refresh", "skip_initial_import", "type", "store_statistics", "bulk", "include_collection", "localhost", "script_type", "credentials", "servers", "localhost", "sandbox" };
        java.util.LinkedHashSet<java.lang.String> strSet46 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet46, strArray45);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder15.parentTypes((java.util.Set<java.lang.String>) strSet46);
        builder9.excludeFields = strSet46;
        java.lang.String str50 = builder9.getmongoCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition51 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder9);
        docScoreSearchScript0.setNextVar("flush_interval", (java.lang.Object) mongoDBRiverDefinition51);
        docScoreSearchScript0.setNextScore((float) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double55 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script_type.null", "filter");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory3 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) docScoreNativeScriptFactory3);
        docScoreSearchScript0.setNextScore((float) 1L);
        docScoreSearchScript0.setNextScore((float) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(0);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("localhost", "socket_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(0);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory3 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) docScoreNativeScriptFactory3);
        java.lang.Object obj6 = docScoreSearchScript0.unwrap((java.lang.Object) "host");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str9 = builder8.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder8.indexName("credentials");
        java.lang.String str12 = builder8.getscript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder8.scriptType("index");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str16 = builder15.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder15.indexName("credentials");
        java.lang.String str19 = builder15.getscript();
        boolean boolean20 = builder15.getmongoSecondaryReadPreference();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        int int22 = builder21.getsocketTimeout();
        boolean boolean23 = builder21.mongoUseSSL;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str25 = builder24.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder24.indexName("credentials");
        com.mongodb.BasicDBObject basicDBObject28 = builder27.getmongoCollectionFilter();
        builder21.setmongoOplogFilter(basicDBObject28);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder15.mongoCollectionFilter(basicDBObject28);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder14.mongoOplogFilter(basicDBObject28);
        java.lang.String str32 = builder31.mongoAdminPassword;
        int int33 = builder31.connectTimeout;
        boolean boolean34 = builder31.advancedTransformation;
        docScoreSearchScript0.setNextVar("script.default_lang", (java.lang.Object) builder31);
        docScoreSearchScript0.setNextScore((float) 60000);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (short) 0);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextVar("script", (java.lang.Object) 1L);
        docScoreSearchScript0.setNextScore((float) (-1L));
        docScoreSearchScript0.setNextScore(0.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float10 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("throttle_size", "ssl_verify_certificate");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory3 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) docScoreNativeScriptFactory3);
        java.lang.Object obj6 = docScoreSearchScript0.unwrap((java.lang.Object) "host");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str9 = builder8.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder8.indexName("credentials");
        java.lang.String str12 = builder8.getscript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder8.scriptType("index");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str16 = builder15.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder15.indexName("credentials");
        java.lang.String str19 = builder15.getscript();
        boolean boolean20 = builder15.getmongoSecondaryReadPreference();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        int int22 = builder21.getsocketTimeout();
        boolean boolean23 = builder21.mongoUseSSL;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str25 = builder24.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder24.indexName("credentials");
        com.mongodb.BasicDBObject basicDBObject28 = builder27.getmongoCollectionFilter();
        builder21.setmongoOplogFilter(basicDBObject28);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder15.mongoCollectionFilter(basicDBObject28);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder14.mongoOplogFilter(basicDBObject28);
        java.lang.String str32 = builder31.mongoAdminPassword;
        int int33 = builder31.connectTimeout;
        boolean boolean34 = builder31.advancedTransformation;
        docScoreSearchScript0.setNextVar("script.default_lang", (java.lang.Object) builder31);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float36 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory3 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) docScoreNativeScriptFactory3);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str7 = builder6.statisticsIndexName;
        int int8 = builder6.getthrottleSize();
        java.util.Set<java.lang.String> strSet9 = builder6.parentTypes;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder6.statisticsTypeName("");
        java.lang.String str12 = builder6.mongoCollection;
        boolean boolean13 = builder6.getdisableIndexRefresh();
        docScoreSearchScript0.setNextVar("index", (java.lang.Object) boolean13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float15 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("null.null", "size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextVar("script", (java.lang.Object) 1L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        int int8 = builder7.getsocketTimeout();
        boolean boolean9 = builder7.mongoUseSSL;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.advancedTransformation(false);
        java.lang.String str12 = builder7.riverName;
        java.lang.String str13 = builder7.getstatisticsTypeName();
        builder7.setmongoCollection("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder7.scriptType("script_type");
        docScoreSearchScript0.setNextVar("sandbox", (java.lang.Object) "script_type");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long19 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("exclude_fields", "hi!");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("store_statistics", "script.disable_dynamic");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("ssl_verify_certificate", "script_type");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextVar("script", (java.lang.Object) 1L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        int int8 = builder7.getsocketTimeout();
        boolean boolean9 = builder7.mongoUseSSL;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.advancedTransformation(false);
        java.lang.String str12 = builder7.riverName;
        java.lang.String str13 = builder7.getstatisticsTypeName();
        builder7.setmongoCollection("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder7.scriptType("script_type");
        docScoreSearchScript0.setNextVar("sandbox", (java.lang.Object) "script_type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str21 = builder20.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder20.indexName("credentials");
        com.mongodb.BasicDBObject basicDBObject24 = builder23.getmongoCollectionFilter();
        java.lang.String str25 = builder23.getmongoAdminUser();
        builder23.statisticsTypeName = "is_mongos";
        docScoreSearchScript0.setNextVar("actions", (java.lang.Object) builder23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (short) -1);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextVar("script", (java.lang.Object) 1L);
        docScoreSearchScript0.setNextScore((float) (-1L));
        docScoreSearchScript0.setNextScore(0.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str11 = builder10.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder10.indexName("credentials");
        java.lang.String str14 = builder13.mongoAdminUser;
        java.lang.String[] strArray43 = new java.lang.String[] { "throttle_size", "sandbox", "type", "skip_initial_import", "script", "bulk_size", "concurrent_bulk_requests", "script.disable_dynamic", "actions", "password", "include_collection", "script.disable_dynamic", "", "drop_collection", "type", "index", "disable_index_refresh", "skip_initial_import", "type", "store_statistics", "bulk", "include_collection", "localhost", "script_type", "credentials", "servers", "localhost", "sandbox" };
        java.util.LinkedHashSet<java.lang.String> strSet44 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet44, strArray43);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder13.parentTypes((java.util.Set<java.lang.String>) strSet44);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder46.mongoLocalPassword("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition49 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder48);
        java.lang.String str50 = mongoDBRiverDefinition49.getSIZE_FIELD();
        boolean boolean51 = mongoDBRiverDefinition49.disableIndexRefresh;
        java.lang.String str52 = mongoDBRiverDefinition49.getACTIONS_FIELD();
        java.lang.String str53 = mongoDBRiverDefinition49.getMongoOplogNamespace();
        java.lang.String str54 = mongoDBRiverDefinition49.getIMPORT_ALL_COLLECTIONS_FIELD();
        java.lang.String str55 = mongoDBRiverDefinition49.getScript();
        boolean boolean56 = mongoDBRiverDefinition49.dropCollection;
        boolean boolean57 = mongoDBRiverDefinition49.isStoreStatistics();
        java.lang.String str58 = mongoDBRiverDefinition49.mongoAdminPassword;
        java.util.Set<java.lang.String> strSet59 = mongoDBRiverDefinition49.includeFields;
        java.lang.Object obj60 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition49);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory61 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript62 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript62.setNextScore(0.0f);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory65 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        java.lang.Object obj66 = docScoreSearchScript62.unwrap((java.lang.Object) docScoreNativeScriptFactory65);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder67 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str68 = builder67.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder70 = builder67.indexName("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder72 = builder67.isMongos((java.lang.Boolean) true);
        java.lang.String str73 = builder67.mongoAdminPassword;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder75 = builder67.mongoSSLVerifyCertificate(false);
        java.lang.String str76 = builder67.riverName;
        java.lang.String str77 = builder67.scriptType;
        builder67.statisticsTypeName = "secondary_read_preference";
        builder67.setmongoSSLVerifyCertificate(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder83 = builder67.mongoCollection("filter");
        com.mongodb.BasicDBObject basicDBObject84 = builder67.getmongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript85 = docScoreNativeScriptFactory65.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject84);
        org.elasticsearch.script.ExecutableScript executableScript86 = docScoreNativeScriptFactory61.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject84);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject84);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((float) (short) 10);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript6 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript6.setNextScore(0.0f);
        java.lang.Object obj10 = docScoreSearchScript6.unwrap((java.lang.Object) 1);
        docScoreSearchScript0.setNextVar("script_type", obj10);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript12 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript12.setNextScore(0.0f);
        java.lang.Object obj16 = docScoreSearchScript12.unwrap((java.lang.Object) "");
        java.lang.Object obj17 = docScoreSearchScript0.unwrap((java.lang.Object) "");
        docScoreSearchScript0.setNextScore((float) 32);
        docScoreSearchScript0.setNextScore((float) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double22 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory3 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) docScoreNativeScriptFactory3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float5 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) 1);
        org.elasticsearch.common.ParseField parseField6 = org.elasticsearch.script.ScriptService.SCRIPT_ID;
        docScoreSearchScript0.setNextVar("index", (java.lang.Object) parseField6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        int int10 = builder9.getsocketTimeout();
        boolean boolean11 = builder9.mongoUseSSL;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str13 = builder12.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder12.indexName("credentials");
        java.lang.String str16 = builder15.mongoAdminUser;
        java.lang.String[] strArray45 = new java.lang.String[] { "throttle_size", "sandbox", "type", "skip_initial_import", "script", "bulk_size", "concurrent_bulk_requests", "script.disable_dynamic", "actions", "password", "include_collection", "script.disable_dynamic", "", "drop_collection", "type", "index", "disable_index_refresh", "skip_initial_import", "type", "store_statistics", "bulk", "include_collection", "localhost", "script_type", "credentials", "servers", "localhost", "sandbox" };
        java.util.LinkedHashSet<java.lang.String> strSet46 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet46, strArray45);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder15.parentTypes((java.util.Set<java.lang.String>) strSet46);
        builder9.excludeFields = strSet46;
        java.lang.String str50 = builder9.getmongoCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition51 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder9);
        docScoreSearchScript0.setNextVar("flush_interval", (java.lang.Object) mongoDBRiverDefinition51);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str55 = builder54.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder54.indexName("credentials");
        com.mongodb.BasicDBObject basicDBObject58 = builder57.getmongoCollectionFilter();
        java.util.List<com.mongodb.ServerAddress> serverAddressList59 = builder57.getmongoServers();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = builder57.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = builder57.disableIndexRefresh(true);
        docScoreSearchScript0.setNextVar("is_mongos", (java.lang.Object) builder57);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (byte) 100);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextVar("script", (java.lang.Object) 1L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        int int8 = builder7.getsocketTimeout();
        boolean boolean9 = builder7.mongoUseSSL;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.advancedTransformation(false);
        java.lang.String str12 = builder7.riverName;
        java.lang.String str13 = builder7.getstatisticsTypeName();
        builder7.setmongoCollection("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder7.scriptType("script_type");
        docScoreSearchScript0.setNextVar("sandbox", (java.lang.Object) "script_type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str21 = builder20.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder20.indexName("credentials");
        com.mongodb.BasicDBObject basicDBObject24 = builder23.getmongoCollectionFilter();
        java.lang.String str25 = builder23.getmongoAdminUser();
        builder23.statisticsTypeName = "is_mongos";
        docScoreSearchScript0.setNextVar("actions", (java.lang.Object) builder23);
        docScoreSearchScript0.setNextScore((float) 30000);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long31 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory3 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) docScoreNativeScriptFactory3);
        docScoreSearchScript0.setNextScore((float) 1L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long7 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("concurrent_requests", "concurrent_bulk_requests");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) 1);
        org.elasticsearch.common.ParseField parseField6 = org.elasticsearch.script.ScriptService.SCRIPT_ID;
        docScoreSearchScript0.setNextVar("index", (java.lang.Object) parseField6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        int int10 = builder9.getsocketTimeout();
        boolean boolean11 = builder9.mongoUseSSL;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str13 = builder12.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder12.indexName("credentials");
        java.lang.String str16 = builder15.mongoAdminUser;
        java.lang.String[] strArray45 = new java.lang.String[] { "throttle_size", "sandbox", "type", "skip_initial_import", "script", "bulk_size", "concurrent_bulk_requests", "script.disable_dynamic", "actions", "password", "include_collection", "script.disable_dynamic", "", "drop_collection", "type", "index", "disable_index_refresh", "skip_initial_import", "type", "store_statistics", "bulk", "include_collection", "localhost", "script_type", "credentials", "servers", "localhost", "sandbox" };
        java.util.LinkedHashSet<java.lang.String> strSet46 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet46, strArray45);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder15.parentTypes((java.util.Set<java.lang.String>) strSet46);
        builder9.excludeFields = strSet46;
        java.lang.String str50 = builder9.getmongoCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition51 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder9);
        docScoreSearchScript0.setNextVar("flush_interval", (java.lang.Object) mongoDBRiverDefinition51);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str55 = builder54.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder54.indexName("credentials");
        com.mongodb.BasicDBObject basicDBObject58 = builder57.getmongoCollectionFilter();
        java.util.List<com.mongodb.ServerAddress> serverAddressList59 = builder57.getmongoServers();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = builder57.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = builder57.disableIndexRefresh(true);
        docScoreSearchScript0.setNextVar("is_mongos", (java.lang.Object) builder57);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float65 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("connect_timeout", "filter");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory3 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) docScoreNativeScriptFactory3);
        java.lang.Object obj6 = docScoreSearchScript0.unwrap((java.lang.Object) "host");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj7 = docScoreSearchScript0.run();
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(10);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((float) (short) 10);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript6 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript6.setNextScore(0.0f);
        java.lang.Object obj10 = docScoreSearchScript6.unwrap((java.lang.Object) 1);
        docScoreSearchScript0.setNextVar("script_type", obj10);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript12 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript12.setNextScore(0.0f);
        java.lang.Object obj16 = docScoreSearchScript12.unwrap((java.lang.Object) "");
        java.lang.Object obj17 = docScoreSearchScript0.unwrap((java.lang.Object) "");
        docScoreSearchScript0.setNextScore((float) 32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float20 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("flush_interval", "store_statistics");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextVar("script", (java.lang.Object) 1L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        int int8 = builder7.getsocketTimeout();
        boolean boolean9 = builder7.mongoUseSSL;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.advancedTransformation(false);
        java.lang.String str12 = builder7.riverName;
        java.lang.String str13 = builder7.getstatisticsTypeName();
        builder7.setmongoCollection("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder7.scriptType("script_type");
        docScoreSearchScript0.setNextVar("sandbox", (java.lang.Object) "script_type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str21 = builder20.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder20.indexName("credentials");
        com.mongodb.BasicDBObject basicDBObject24 = builder23.getmongoCollectionFilter();
        java.lang.String str25 = builder23.getmongoAdminUser();
        builder23.statisticsTypeName = "is_mongos";
        docScoreSearchScript0.setNextVar("actions", (java.lang.Object) builder23);
        docScoreSearchScript0.setNextScore((float) 30000);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj31 = docScoreSearchScript0.run();
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) 1);
        org.elasticsearch.common.ParseField parseField6 = org.elasticsearch.script.ScriptService.SCRIPT_ID;
        docScoreSearchScript0.setNextVar("index", (java.lang.Object) parseField6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        int int10 = builder9.getsocketTimeout();
        boolean boolean11 = builder9.mongoUseSSL;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str13 = builder12.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder12.indexName("credentials");
        java.lang.String str16 = builder15.mongoAdminUser;
        java.lang.String[] strArray45 = new java.lang.String[] { "throttle_size", "sandbox", "type", "skip_initial_import", "script", "bulk_size", "concurrent_bulk_requests", "script.disable_dynamic", "actions", "password", "include_collection", "script.disable_dynamic", "", "drop_collection", "type", "index", "disable_index_refresh", "skip_initial_import", "type", "store_statistics", "bulk", "include_collection", "localhost", "script_type", "credentials", "servers", "localhost", "sandbox" };
        java.util.LinkedHashSet<java.lang.String> strSet46 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet46, strArray45);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder15.parentTypes((java.util.Set<java.lang.String>) strSet46);
        builder9.excludeFields = strSet46;
        java.lang.String str50 = builder9.getmongoCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition51 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder9);
        docScoreSearchScript0.setNextVar("flush_interval", (java.lang.Object) mongoDBRiverDefinition51);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str55 = builder54.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder54.indexName("credentials");
        com.mongodb.BasicDBObject basicDBObject58 = builder57.getmongoCollectionFilter();
        java.util.List<com.mongodb.ServerAddress> serverAddressList59 = builder57.getmongoServers();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = builder57.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = builder57.disableIndexRefresh(true);
        docScoreSearchScript0.setNextVar("is_mongos", (java.lang.Object) builder57);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(0);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextVar("script", (java.lang.Object) 1L);
        docScoreSearchScript0.setNextScore((float) (-1L));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(27017);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((float) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (byte) 1);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextVar("script", (java.lang.Object) 1L);
        docScoreSearchScript0.setNextScore((float) (-1L));
        docScoreSearchScript0.setNextScore(0.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj10 = docScoreSearchScript0.run();
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory3 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) docScoreNativeScriptFactory3);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str7 = builder6.statisticsIndexName;
        int int8 = builder6.getthrottleSize();
        java.util.Set<java.lang.String> strSet9 = builder6.parentTypes;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder6.statisticsTypeName("");
        java.lang.String str12 = builder6.mongoCollection;
        boolean boolean13 = builder6.getdisableIndexRefresh();
        docScoreSearchScript0.setNextVar("index", (java.lang.Object) boolean13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long15 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory3 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) docScoreNativeScriptFactory3);
        docScoreSearchScript0.setNextScore((float) 1L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double7 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_size", "advanced_transformation");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((float) (short) 10);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript6 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript6.setNextScore(0.0f);
        java.lang.Object obj10 = docScoreSearchScript6.unwrap((java.lang.Object) 1);
        docScoreSearchScript0.setNextVar("script_type", obj10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str13 = builder12.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder12.indexName("credentials");
        java.lang.String str16 = builder15.mongoAdminUser;
        java.lang.String[] strArray45 = new java.lang.String[] { "throttle_size", "sandbox", "type", "skip_initial_import", "script", "bulk_size", "concurrent_bulk_requests", "script.disable_dynamic", "actions", "password", "include_collection", "script.disable_dynamic", "", "drop_collection", "type", "index", "disable_index_refresh", "skip_initial_import", "type", "store_statistics", "bulk", "include_collection", "localhost", "script_type", "credentials", "servers", "localhost", "sandbox" };
        java.util.LinkedHashSet<java.lang.String> strSet46 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet46, strArray45);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder15.parentTypes((java.util.Set<java.lang.String>) strSet46);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder48.mongoLocalPassword("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition51 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder50);
        boolean boolean52 = mongoDBRiverDefinition51.getdropCollection();
        java.lang.String str53 = mongoDBRiverDefinition51.getGRIDFS_FIELD();
        java.lang.String str54 = mongoDBRiverDefinition51.getSSL_VERIFY_CERT_FIELD();
        java.lang.Object obj55 = docScoreSearchScript0.unwrap((java.lang.Object) str54);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double56 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory3 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) docScoreNativeScriptFactory3);
        docScoreSearchScript0.setNextScore((float) 1L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float7 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (byte) 10);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str6 = builder5.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder5.indexName("credentials");
        java.lang.String str9 = builder5.getscript();
        java.lang.String str10 = builder5.gettypeName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder5.skipInitialImport(true);
        builder5.isMongos = true;
        java.lang.String str15 = builder5.includeCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder5.socketTimeout(1000);
        builder5.settypeName("include_fields");
        java.lang.Object obj20 = docScoreSearchScript0.unwrap((java.lang.Object) "include_fields");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long21 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((float) (short) 10);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript6 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript6.setNextScore(0.0f);
        java.lang.Object obj10 = docScoreSearchScript6.unwrap((java.lang.Object) 1);
        docScoreSearchScript0.setNextVar("script_type", obj10);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript12 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript12.setNextScore(0.0f);
        java.lang.Object obj16 = docScoreSearchScript12.unwrap((java.lang.Object) "");
        java.lang.Object obj17 = docScoreSearchScript0.unwrap((java.lang.Object) "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double18 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) 1);
        org.elasticsearch.common.unit.TimeValue timeValue5 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DEFAULT_FLUSH_INTERVAL;
        java.lang.Object obj6 = docScoreSearchScript0.unwrap((java.lang.Object) timeValue5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj7 = docScoreSearchScript0.run();
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((float) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str6 = builder5.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder5.indexName("credentials");
        java.lang.String str9 = builder8.mongoAdminUser;
        java.lang.String[] strArray38 = new java.lang.String[] { "throttle_size", "sandbox", "type", "skip_initial_import", "script", "bulk_size", "concurrent_bulk_requests", "script.disable_dynamic", "actions", "password", "include_collection", "script.disable_dynamic", "", "drop_collection", "type", "index", "disable_index_refresh", "skip_initial_import", "type", "store_statistics", "bulk", "include_collection", "localhost", "script_type", "credentials", "servers", "localhost", "sandbox" };
        java.util.LinkedHashSet<java.lang.String> strSet39 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet39, strArray38);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder8.parentTypes((java.util.Set<java.lang.String>) strSet39);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder41.mongoLocalPassword("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition44 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder43);
        java.lang.String str45 = mongoDBRiverDefinition44.getSIZE_FIELD();
        boolean boolean46 = mongoDBRiverDefinition44.disableIndexRefresh;
        boolean boolean47 = mongoDBRiverDefinition44.isMongoGridFS();
        com.mongodb.BasicDBObject basicDBObject48 = mongoDBRiverDefinition44.getMongoCollectionFilter();
        java.lang.String str49 = mongoDBRiverDefinition44.getBULK_TIMEOUT_FIELD();
        java.lang.String str50 = mongoDBRiverDefinition44.getScriptType();
        java.lang.Object obj51 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition44);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float52 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("drop_collection", "advanced_transformation");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextVar("script", (java.lang.Object) 1L);
        docScoreSearchScript0.setNextScore((float) (-1L));
        docScoreSearchScript0.setNextScore((float) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj10 = docScoreSearchScript0.run();
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) 1);
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) '4');
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextVar("script", (java.lang.Object) 1L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        int int8 = builder7.getsocketTimeout();
        boolean boolean9 = builder7.mongoUseSSL;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.advancedTransformation(false);
        java.lang.String str12 = builder7.riverName;
        java.lang.String str13 = builder7.getstatisticsTypeName();
        builder7.setmongoCollection("import_all_collections");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder7.scriptType("script_type");
        docScoreSearchScript0.setNextVar("sandbox", (java.lang.Object) "script_type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str21 = builder20.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder20.indexName("credentials");
        com.mongodb.BasicDBObject basicDBObject24 = builder23.getmongoCollectionFilter();
        java.lang.String str25 = builder23.getmongoAdminUser();
        builder23.statisticsTypeName = "is_mongos";
        docScoreSearchScript0.setNextVar("actions", (java.lang.Object) builder23);
        docScoreSearchScript0.setNextScore((float) 30000);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double31 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("null.null", "local");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("password", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) 1);
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long7 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((float) (short) 10);
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((float) 32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((-1));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory3 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) docScoreNativeScriptFactory3);
        java.lang.Object obj6 = docScoreSearchScript0.unwrap((java.lang.Object) "host");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str9 = builder8.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder8.indexName("credentials");
        java.lang.String str12 = builder8.getscript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder8.scriptType("index");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str16 = builder15.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder15.indexName("credentials");
        java.lang.String str19 = builder15.getscript();
        boolean boolean20 = builder15.getmongoSecondaryReadPreference();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        int int22 = builder21.getsocketTimeout();
        boolean boolean23 = builder21.mongoUseSSL;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str25 = builder24.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder24.indexName("credentials");
        com.mongodb.BasicDBObject basicDBObject28 = builder27.getmongoCollectionFilter();
        builder21.setmongoOplogFilter(basicDBObject28);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder15.mongoCollectionFilter(basicDBObject28);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder14.mongoOplogFilter(basicDBObject28);
        java.lang.String str32 = builder31.mongoAdminPassword;
        int int33 = builder31.connectTimeout;
        boolean boolean34 = builder31.advancedTransformation;
        docScoreSearchScript0.setNextVar("script.default_lang", (java.lang.Object) builder31);
        docScoreSearchScript0.setNextScore((float) 60000);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double38 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("skip_initial_import", "null.null");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "parent_types");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) 1);
        org.elasticsearch.common.unit.TimeValue timeValue5 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DEFAULT_FLUSH_INTERVAL;
        java.lang.Object obj6 = docScoreSearchScript0.unwrap((java.lang.Object) timeValue5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double7 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) 1);
        docScoreSearchScript0.setNextScore((float) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) 'a');
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((float) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str6 = builder5.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder5.indexName("credentials");
        java.lang.String str9 = builder8.mongoAdminUser;
        java.lang.String[] strArray38 = new java.lang.String[] { "throttle_size", "sandbox", "type", "skip_initial_import", "script", "bulk_size", "concurrent_bulk_requests", "script.disable_dynamic", "actions", "password", "include_collection", "script.disable_dynamic", "", "drop_collection", "type", "index", "disable_index_refresh", "skip_initial_import", "type", "store_statistics", "bulk", "include_collection", "localhost", "script_type", "credentials", "servers", "localhost", "sandbox" };
        java.util.LinkedHashSet<java.lang.String> strSet39 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet39, strArray38);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder8.parentTypes((java.util.Set<java.lang.String>) strSet39);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder41.mongoLocalPassword("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition44 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder43);
        java.lang.String str45 = mongoDBRiverDefinition44.getSIZE_FIELD();
        boolean boolean46 = mongoDBRiverDefinition44.disableIndexRefresh;
        boolean boolean47 = mongoDBRiverDefinition44.isMongoGridFS();
        com.mongodb.BasicDBObject basicDBObject48 = mongoDBRiverDefinition44.getMongoCollectionFilter();
        java.lang.String str49 = mongoDBRiverDefinition44.getBULK_TIMEOUT_FIELD();
        java.lang.String str50 = mongoDBRiverDefinition44.getScriptType();
        java.lang.Object obj51 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition44);
        docScoreSearchScript0.setNextVar("throttle_size", (java.lang.Object) "name");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long55 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("admin", "local");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextVar("script", (java.lang.Object) 1L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) 'a');
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory3 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) docScoreNativeScriptFactory3);
        java.lang.Object obj6 = docScoreSearchScript0.unwrap((java.lang.Object) "host");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double7 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("gridfs", "localhost");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextVar("script", (java.lang.Object) 1L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str7 = builder6.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder6.indexName("credentials");
        java.lang.String str10 = builder9.mongoAdminUser;
        java.lang.String[] strArray39 = new java.lang.String[] { "throttle_size", "sandbox", "type", "skip_initial_import", "script", "bulk_size", "concurrent_bulk_requests", "script.disable_dynamic", "actions", "password", "include_collection", "script.disable_dynamic", "", "drop_collection", "type", "index", "disable_index_refresh", "skip_initial_import", "type", "store_statistics", "bulk", "include_collection", "localhost", "script_type", "credentials", "servers", "localhost", "sandbox" };
        java.util.LinkedHashSet<java.lang.String> strSet40 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet40, strArray39);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder9.parentTypes((java.util.Set<java.lang.String>) strSet40);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder42.mongoLocalPassword("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition45 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder44);
        java.lang.String str46 = mongoDBRiverDefinition45.getSIZE_FIELD();
        boolean boolean47 = mongoDBRiverDefinition45.disableIndexRefresh;
        boolean boolean48 = mongoDBRiverDefinition45.isMongoGridFS();
        com.mongodb.BasicDBObject basicDBObject49 = mongoDBRiverDefinition45.getMongoCollectionFilter();
        java.lang.String str50 = mongoDBRiverDefinition45.getBULK_TIMEOUT_FIELD();
        com.mongodb.BasicDBObject basicDBObject51 = mongoDBRiverDefinition45.getMongoCollectionFilter();
        boolean boolean52 = mongoDBRiverDefinition45.mongoSSLVerifyCertificate;
        java.lang.Object obj53 = docScoreSearchScript0.unwrap((java.lang.Object) boolean52);
        docScoreSearchScript0.setNextScore((float) 60000);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory56 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str58 = builder57.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder57.indexName("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = builder57.isMongos((java.lang.Boolean) true);
        java.lang.String str63 = builder57.mongoAdminPassword;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder65 = builder57.mongoSSLVerifyCertificate(false);
        com.mongodb.BasicDBObject basicDBObject66 = builder57.mongoCollectionFilter;
        org.elasticsearch.script.ExecutableScript executableScript67 = docScoreNativeScriptFactory56.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject66);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject66);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) 1);
        org.elasticsearch.common.ParseField parseField6 = org.elasticsearch.script.ScriptService.SCRIPT_ID;
        docScoreSearchScript0.setNextVar("index", (java.lang.Object) parseField6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str9 = builder8.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder8.indexName("credentials");
        java.lang.String str12 = builder11.mongoAdminUser;
        java.lang.String[] strArray41 = new java.lang.String[] { "throttle_size", "sandbox", "type", "skip_initial_import", "script", "bulk_size", "concurrent_bulk_requests", "script.disable_dynamic", "actions", "password", "include_collection", "script.disable_dynamic", "", "drop_collection", "type", "index", "disable_index_refresh", "skip_initial_import", "type", "store_statistics", "bulk", "include_collection", "localhost", "script_type", "credentials", "servers", "localhost", "sandbox" };
        java.util.LinkedHashSet<java.lang.String> strSet42 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet42, strArray41);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder11.parentTypes((java.util.Set<java.lang.String>) strSet42);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder44.mongoLocalPassword("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition47 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder46);
        java.lang.String str48 = mongoDBRiverDefinition47.getSIZE_FIELD();
        boolean boolean49 = mongoDBRiverDefinition47.disableIndexRefresh;
        java.lang.String str50 = mongoDBRiverDefinition47.getACTIONS_FIELD();
        java.lang.String str51 = mongoDBRiverDefinition47.statisticsTypeName;
        boolean boolean52 = mongoDBRiverDefinition47.isAdvancedTransformation();
        java.lang.String str53 = mongoDBRiverDefinition47.riverIndexName;
        java.lang.String str54 = mongoDBRiverDefinition47.getIS_MONGOS_FIELD();
        java.lang.String str55 = mongoDBRiverDefinition47.mongoAdminPassword;
        java.lang.String str56 = mongoDBRiverDefinition47.getScriptType();
        int int57 = mongoDBRiverDefinition47.getDEFAULT_CONNECT_TIMEOUT();
        java.util.Set<java.lang.String> strSet58 = mongoDBRiverDefinition47.includeFields;
        boolean boolean59 = mongoDBRiverDefinition47.dropCollection;
        boolean boolean60 = mongoDBRiverDefinition47.isStoreStatistics();
        java.lang.String str61 = mongoDBRiverDefinition47.statisticsTypeName;
        java.lang.String str62 = mongoDBRiverDefinition47.getMongoAdminUser();
        int int63 = mongoDBRiverDefinition47.getDEFAULT_SOCKET_TIMEOUT();
        java.lang.String str64 = mongoDBRiverDefinition47.mongoAdminUser;
        java.lang.Object obj65 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition47);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long66 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script.default_lang", "is_mongos");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) 1);
        org.elasticsearch.common.ParseField parseField6 = org.elasticsearch.script.ScriptService.SCRIPT_ID;
        docScoreSearchScript0.setNextVar("index", (java.lang.Object) parseField6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        int int10 = builder9.getsocketTimeout();
        boolean boolean11 = builder9.mongoUseSSL;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str13 = builder12.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder12.indexName("credentials");
        java.lang.String str16 = builder15.mongoAdminUser;
        java.lang.String[] strArray45 = new java.lang.String[] { "throttle_size", "sandbox", "type", "skip_initial_import", "script", "bulk_size", "concurrent_bulk_requests", "script.disable_dynamic", "actions", "password", "include_collection", "script.disable_dynamic", "", "drop_collection", "type", "index", "disable_index_refresh", "skip_initial_import", "type", "store_statistics", "bulk", "include_collection", "localhost", "script_type", "credentials", "servers", "localhost", "sandbox" };
        java.util.LinkedHashSet<java.lang.String> strSet46 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet46, strArray45);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder15.parentTypes((java.util.Set<java.lang.String>) strSet46);
        builder9.excludeFields = strSet46;
        java.lang.String str50 = builder9.getmongoCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition51 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder9);
        docScoreSearchScript0.setNextVar("flush_interval", (java.lang.Object) mongoDBRiverDefinition51);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float53 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("hi!", "name");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("script.disable_dynamic", "null.null");
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory3 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) docScoreNativeScriptFactory3);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str7 = builder6.statisticsIndexName;
        int int8 = builder6.getthrottleSize();
        java.util.Set<java.lang.String> strSet9 = builder6.parentTypes;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder6.statisticsTypeName("");
        java.lang.String str12 = builder6.mongoCollection;
        boolean boolean13 = builder6.getdisableIndexRefresh();
        docScoreSearchScript0.setNextVar("index", (java.lang.Object) boolean13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (short) 1);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("user", "options");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((float) (short) 10);
        docScoreSearchScript0.setNextScore((float) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float7 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((float) (short) 10);
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((float) 32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double9 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("index", "password");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextVar("script", (java.lang.Object) 1L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str7 = builder6.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder6.indexName("credentials");
        java.lang.String str10 = builder9.mongoAdminUser;
        java.lang.String[] strArray39 = new java.lang.String[] { "throttle_size", "sandbox", "type", "skip_initial_import", "script", "bulk_size", "concurrent_bulk_requests", "script.disable_dynamic", "actions", "password", "include_collection", "script.disable_dynamic", "", "drop_collection", "type", "index", "disable_index_refresh", "skip_initial_import", "type", "store_statistics", "bulk", "include_collection", "localhost", "script_type", "credentials", "servers", "localhost", "sandbox" };
        java.util.LinkedHashSet<java.lang.String> strSet40 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet40, strArray39);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder9.parentTypes((java.util.Set<java.lang.String>) strSet40);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder42.mongoLocalPassword("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition45 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder44);
        java.lang.String str46 = mongoDBRiverDefinition45.getSIZE_FIELD();
        boolean boolean47 = mongoDBRiverDefinition45.disableIndexRefresh;
        boolean boolean48 = mongoDBRiverDefinition45.isMongoGridFS();
        com.mongodb.BasicDBObject basicDBObject49 = mongoDBRiverDefinition45.getMongoCollectionFilter();
        java.lang.String str50 = mongoDBRiverDefinition45.getBULK_TIMEOUT_FIELD();
        com.mongodb.BasicDBObject basicDBObject51 = mongoDBRiverDefinition45.getMongoCollectionFilter();
        boolean boolean52 = mongoDBRiverDefinition45.mongoSSLVerifyCertificate;
        java.lang.Object obj53 = docScoreSearchScript0.unwrap((java.lang.Object) boolean52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double54 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("include_fields", "script.default_lang");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((float) (short) 10);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript6 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript6.setNextScore(0.0f);
        java.lang.Object obj10 = docScoreSearchScript6.unwrap((java.lang.Object) 1);
        docScoreSearchScript0.setNextVar("script_type", obj10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str13 = builder12.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder12.indexName("credentials");
        java.lang.String str16 = builder15.mongoAdminUser;
        java.lang.String[] strArray45 = new java.lang.String[] { "throttle_size", "sandbox", "type", "skip_initial_import", "script", "bulk_size", "concurrent_bulk_requests", "script.disable_dynamic", "actions", "password", "include_collection", "script.disable_dynamic", "", "drop_collection", "type", "index", "disable_index_refresh", "skip_initial_import", "type", "store_statistics", "bulk", "include_collection", "localhost", "script_type", "credentials", "servers", "localhost", "sandbox" };
        java.util.LinkedHashSet<java.lang.String> strSet46 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet46, strArray45);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder15.parentTypes((java.util.Set<java.lang.String>) strSet46);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder48.mongoLocalPassword("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition51 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder50);
        boolean boolean52 = mongoDBRiverDefinition51.getdropCollection();
        java.lang.String str53 = mongoDBRiverDefinition51.getGRIDFS_FIELD();
        java.lang.String str54 = mongoDBRiverDefinition51.getSSL_VERIFY_CERT_FIELD();
        java.lang.Object obj55 = docScoreSearchScript0.unwrap((java.lang.Object) str54);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long56 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "bulk");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("throttle_size", "user");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextVar("script", (java.lang.Object) 1L);
        docScoreSearchScript0.setNextScore((float) (-1L));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float8 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((float) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str7 = builder6.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder6.indexName("credentials");
        java.lang.String str10 = builder9.mongoAdminUser;
        java.lang.String[] strArray39 = new java.lang.String[] { "throttle_size", "sandbox", "type", "skip_initial_import", "script", "bulk_size", "concurrent_bulk_requests", "script.disable_dynamic", "actions", "password", "include_collection", "script.disable_dynamic", "", "drop_collection", "type", "index", "disable_index_refresh", "skip_initial_import", "type", "store_statistics", "bulk", "include_collection", "localhost", "script_type", "credentials", "servers", "localhost", "sandbox" };
        java.util.LinkedHashSet<java.lang.String> strSet40 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet40, strArray39);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder9.parentTypes((java.util.Set<java.lang.String>) strSet40);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder42.mongoLocalPassword("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition45 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder44);
        java.lang.String str46 = mongoDBRiverDefinition45.getSIZE_FIELD();
        java.lang.String str47 = mongoDBRiverDefinition45.getTHROTTLE_SIZE_FIELD();
        java.lang.String str48 = mongoDBRiverDefinition45.getCONCURRENT_BULK_REQUESTS_FIELD();
        int int49 = mongoDBRiverDefinition45.getDEFAULT_BULK_ACTIONS();
        java.lang.String str50 = mongoDBRiverDefinition45.getIMPORT_ALL_COLLECTIONS_FIELD();
        docScoreSearchScript0.setNextVar("", (java.lang.Object) str50);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str53 = builder52.mongoLocalPassword;
        builder52.setsocketTimeout((int) 'a');
        com.mongodb.BasicDBObject basicDBObject56 = builder52.mongoCollectionFilter;
        int int57 = builder52.getconnectTimeout();
        java.lang.Object obj58 = docScoreSearchScript0.unwrap((java.lang.Object) int57);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(8);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("import_all_collections", "include_fields");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextVar("script", (java.lang.Object) 1L);
        docScoreSearchScript0.setNextScore((float) (-1L));
        docScoreSearchScript0.setNextScore(0.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str11 = builder10.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder10.indexName("credentials");
        java.lang.String str14 = builder13.mongoAdminUser;
        java.lang.String[] strArray43 = new java.lang.String[] { "throttle_size", "sandbox", "type", "skip_initial_import", "script", "bulk_size", "concurrent_bulk_requests", "script.disable_dynamic", "actions", "password", "include_collection", "script.disable_dynamic", "", "drop_collection", "type", "index", "disable_index_refresh", "skip_initial_import", "type", "store_statistics", "bulk", "include_collection", "localhost", "script_type", "credentials", "servers", "localhost", "sandbox" };
        java.util.LinkedHashSet<java.lang.String> strSet44 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet44, strArray43);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder13.parentTypes((java.util.Set<java.lang.String>) strSet44);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder46.mongoLocalPassword("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition49 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder48);
        java.lang.String str50 = mongoDBRiverDefinition49.getSIZE_FIELD();
        boolean boolean51 = mongoDBRiverDefinition49.disableIndexRefresh;
        java.lang.String str52 = mongoDBRiverDefinition49.getACTIONS_FIELD();
        java.lang.String str53 = mongoDBRiverDefinition49.getMongoOplogNamespace();
        java.lang.String str54 = mongoDBRiverDefinition49.getIMPORT_ALL_COLLECTIONS_FIELD();
        java.lang.String str55 = mongoDBRiverDefinition49.getScript();
        boolean boolean56 = mongoDBRiverDefinition49.dropCollection;
        boolean boolean57 = mongoDBRiverDefinition49.isStoreStatistics();
        java.lang.String str58 = mongoDBRiverDefinition49.mongoAdminPassword;
        java.util.Set<java.lang.String> strSet59 = mongoDBRiverDefinition49.includeFields;
        java.lang.Object obj60 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition49);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double61 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextVar("script", (java.lang.Object) 1L);
        docScoreSearchScript0.setNextScore((float) (-1L));
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str9 = builder8.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder8.indexName("credentials");
        java.lang.String str12 = builder11.mongoAdminUser;
        java.lang.String[] strArray41 = new java.lang.String[] { "throttle_size", "sandbox", "type", "skip_initial_import", "script", "bulk_size", "concurrent_bulk_requests", "script.disable_dynamic", "actions", "password", "include_collection", "script.disable_dynamic", "", "drop_collection", "type", "index", "disable_index_refresh", "skip_initial_import", "type", "store_statistics", "bulk", "include_collection", "localhost", "script_type", "credentials", "servers", "localhost", "sandbox" };
        java.util.LinkedHashSet<java.lang.String> strSet42 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet42, strArray41);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder11.parentTypes((java.util.Set<java.lang.String>) strSet42);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder44.mongoLocalPassword("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition47 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder46);
        java.lang.String str48 = mongoDBRiverDefinition47.getSIZE_FIELD();
        boolean boolean49 = mongoDBRiverDefinition47.disableIndexRefresh;
        boolean boolean50 = mongoDBRiverDefinition47.isMongoGridFS();
        com.mongodb.BasicDBObject basicDBObject51 = mongoDBRiverDefinition47.getMongoCollectionFilter();
        java.lang.String str52 = mongoDBRiverDefinition47.getBULK_TIMEOUT_FIELD();
        com.mongodb.BasicDBObject basicDBObject53 = mongoDBRiverDefinition47.getMongoCollectionFilter();
        boolean boolean54 = mongoDBRiverDefinition47.advancedTransformation;
        java.lang.String str55 = mongoDBRiverDefinition47.getSSL_VERIFY_CERT_FIELD();
        java.lang.String str56 = mongoDBRiverDefinition47.getINCLUDE_FIELDS_FIELD();
        java.lang.String str57 = mongoDBRiverDefinition47.mongoLocalUser;
        java.lang.Object obj58 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition47);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (short) 100);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory3 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) docScoreNativeScriptFactory3);
        docScoreSearchScript0.setNextScore((float) 1L);
        docScoreSearchScript0.setNextScore((float) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long9 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextVar("script", (java.lang.Object) 1L);
        docScoreSearchScript0.setNextScore((float) (-1L));
        docScoreSearchScript0.setNextScore((float) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long10 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory3 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) docScoreNativeScriptFactory3);
        java.lang.Object obj6 = docScoreSearchScript0.unwrap((java.lang.Object) "host");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str9 = builder8.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder8.indexName("credentials");
        java.lang.String str12 = builder8.getscript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder8.scriptType("index");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str16 = builder15.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder15.indexName("credentials");
        java.lang.String str19 = builder15.getscript();
        boolean boolean20 = builder15.getmongoSecondaryReadPreference();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        int int22 = builder21.getsocketTimeout();
        boolean boolean23 = builder21.mongoUseSSL;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str25 = builder24.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder24.indexName("credentials");
        com.mongodb.BasicDBObject basicDBObject28 = builder27.getmongoCollectionFilter();
        builder21.setmongoOplogFilter(basicDBObject28);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder15.mongoCollectionFilter(basicDBObject28);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder14.mongoOplogFilter(basicDBObject28);
        java.lang.String str32 = builder31.mongoAdminPassword;
        int int33 = builder31.connectTimeout;
        boolean boolean34 = builder31.advancedTransformation;
        docScoreSearchScript0.setNextVar("script.default_lang", (java.lang.Object) builder31);
        docScoreSearchScript0.setNextScore((float) 60000);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long38 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("store_statistics", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("null.collection", "null.null");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((float) (short) 10);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript6 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript6.setNextScore(0.0f);
        java.lang.Object obj10 = docScoreSearchScript6.unwrap((java.lang.Object) 1);
        docScoreSearchScript0.setNextVar("script_type", obj10);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript12 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript12.setNextScore(0.0f);
        java.lang.Object obj16 = docScoreSearchScript12.unwrap((java.lang.Object) "");
        java.lang.Object obj17 = docScoreSearchScript0.unwrap((java.lang.Object) "");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str19 = builder18.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder18.indexName("credentials");
        com.mongodb.BasicDBObject basicDBObject22 = builder21.getmongoCollectionFilter();
        java.util.List<com.mongodb.ServerAddress> serverAddressList23 = builder21.getmongoServers();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder21.disableIndexRefresh(true);
        builder25.setthrottleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder25);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str30 = builder29.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder29.indexName("credentials");
        java.lang.String str33 = builder32.mongoAdminUser;
        java.lang.String[] strArray62 = new java.lang.String[] { "throttle_size", "sandbox", "type", "skip_initial_import", "script", "bulk_size", "concurrent_bulk_requests", "script.disable_dynamic", "actions", "password", "include_collection", "script.disable_dynamic", "", "drop_collection", "type", "index", "disable_index_refresh", "skip_initial_import", "type", "store_statistics", "bulk", "include_collection", "localhost", "script_type", "credentials", "servers", "localhost", "sandbox" };
        java.util.LinkedHashSet<java.lang.String> strSet63 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet63, strArray62);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder65 = builder32.parentTypes((java.util.Set<java.lang.String>) strSet63);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder67 = builder65.mongoLocalPassword("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition68 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder67);
        java.lang.String str69 = mongoDBRiverDefinition68.getSIZE_FIELD();
        int int70 = mongoDBRiverDefinition68.getDEFAULT_CONNECT_TIMEOUT();
        java.lang.String str71 = mongoDBRiverDefinition68.getStatisticsTypeName();
        boolean boolean72 = mongoDBRiverDefinition68.isMongoSSLVerifyCertificate();
        java.util.Set<java.lang.String> strSet73 = mongoDBRiverDefinition68.getIncludeFields();
        java.util.Set<java.lang.String> strSet74 = mongoDBRiverDefinition68.getParentTypes();
        builder25.setexcludeFields(strSet74);
        int int76 = builder25.socketTimeout;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder78 = builder25.mongoCollection("disable_index_refresh");
        builder78.setmongoLocalPassword("script_type");
        builder78.setmongoSecondaryReadPreference(true);
        java.lang.Object obj83 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        docScoreSearchScript0.setNextScore((float) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj86 = docScoreSearchScript0.run();
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("options", "null.collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("collection", "sandbox");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((float) (short) 10);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript6 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript6.setNextScore(0.0f);
        java.lang.Object obj10 = docScoreSearchScript6.unwrap((java.lang.Object) 1);
        docScoreSearchScript0.setNextVar("script_type", obj10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str13 = builder12.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder12.indexName("credentials");
        java.lang.String str16 = builder15.mongoAdminUser;
        java.lang.String[] strArray45 = new java.lang.String[] { "throttle_size", "sandbox", "type", "skip_initial_import", "script", "bulk_size", "concurrent_bulk_requests", "script.disable_dynamic", "actions", "password", "include_collection", "script.disable_dynamic", "", "drop_collection", "type", "index", "disable_index_refresh", "skip_initial_import", "type", "store_statistics", "bulk", "include_collection", "localhost", "script_type", "credentials", "servers", "localhost", "sandbox" };
        java.util.LinkedHashSet<java.lang.String> strSet46 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet46, strArray45);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder15.parentTypes((java.util.Set<java.lang.String>) strSet46);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder48.mongoLocalPassword("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition51 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder50);
        java.lang.String str52 = mongoDBRiverDefinition51.getStatisticsTypeName();
        boolean boolean53 = mongoDBRiverDefinition51.isMongoUseSSL();
        java.lang.String str54 = mongoDBRiverDefinition51.getIS_MONGOS_FIELD();
        java.lang.String str55 = mongoDBRiverDefinition51.getTypeName();
        java.lang.String str56 = mongoDBRiverDefinition51.getIMPORT_ALL_COLLECTIONS_FIELD();
        com.mongodb.BasicDBObject basicDBObject57 = mongoDBRiverDefinition51.mongoCollectionFilter;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject57);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("user", "null.collection");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("initial_timestamp", "null.collection");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("local", "name");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long5 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("ssl", "password.password");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((float) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str6 = builder5.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder5.indexName("credentials");
        java.lang.String str9 = builder8.mongoAdminUser;
        java.lang.String[] strArray38 = new java.lang.String[] { "throttle_size", "sandbox", "type", "skip_initial_import", "script", "bulk_size", "concurrent_bulk_requests", "script.disable_dynamic", "actions", "password", "include_collection", "script.disable_dynamic", "", "drop_collection", "type", "index", "disable_index_refresh", "skip_initial_import", "type", "store_statistics", "bulk", "include_collection", "localhost", "script_type", "credentials", "servers", "localhost", "sandbox" };
        java.util.LinkedHashSet<java.lang.String> strSet39 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet39, strArray38);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder8.parentTypes((java.util.Set<java.lang.String>) strSet39);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder41.mongoLocalPassword("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition44 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder43);
        java.lang.String str45 = mongoDBRiverDefinition44.getSIZE_FIELD();
        boolean boolean46 = mongoDBRiverDefinition44.disableIndexRefresh;
        boolean boolean47 = mongoDBRiverDefinition44.isMongoGridFS();
        com.mongodb.BasicDBObject basicDBObject48 = mongoDBRiverDefinition44.getMongoCollectionFilter();
        java.lang.String str49 = mongoDBRiverDefinition44.getBULK_TIMEOUT_FIELD();
        java.lang.String str50 = mongoDBRiverDefinition44.getScriptType();
        java.lang.Object obj51 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition44);
        docScoreSearchScript0.setNextScore((float) 60000);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double54 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("password.password", "ssl");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("password", "options");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("advanced_transformation", "null.null");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("bulk_size", "null.collection", true);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((float) (short) 10);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript6 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript6.setNextScore(0.0f);
        java.lang.Object obj10 = docScoreSearchScript6.unwrap((java.lang.Object) 1);
        docScoreSearchScript0.setNextVar("script_type", obj10);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript12 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript12.setNextScore(0.0f);
        java.lang.Object obj16 = docScoreSearchScript12.unwrap((java.lang.Object) "");
        java.lang.Object obj17 = docScoreSearchScript0.unwrap((java.lang.Object) "");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str19 = builder18.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder18.indexName("credentials");
        com.mongodb.BasicDBObject basicDBObject22 = builder21.getmongoCollectionFilter();
        java.util.List<com.mongodb.ServerAddress> serverAddressList23 = builder21.getmongoServers();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder21.disableIndexRefresh(true);
        builder25.setthrottleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder25);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str30 = builder29.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder29.indexName("credentials");
        java.lang.String str33 = builder32.mongoAdminUser;
        java.lang.String[] strArray62 = new java.lang.String[] { "throttle_size", "sandbox", "type", "skip_initial_import", "script", "bulk_size", "concurrent_bulk_requests", "script.disable_dynamic", "actions", "password", "include_collection", "script.disable_dynamic", "", "drop_collection", "type", "index", "disable_index_refresh", "skip_initial_import", "type", "store_statistics", "bulk", "include_collection", "localhost", "script_type", "credentials", "servers", "localhost", "sandbox" };
        java.util.LinkedHashSet<java.lang.String> strSet63 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet63, strArray62);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder65 = builder32.parentTypes((java.util.Set<java.lang.String>) strSet63);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder67 = builder65.mongoLocalPassword("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition68 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder67);
        java.lang.String str69 = mongoDBRiverDefinition68.getSIZE_FIELD();
        int int70 = mongoDBRiverDefinition68.getDEFAULT_CONNECT_TIMEOUT();
        java.lang.String str71 = mongoDBRiverDefinition68.getStatisticsTypeName();
        boolean boolean72 = mongoDBRiverDefinition68.isMongoSSLVerifyCertificate();
        java.util.Set<java.lang.String> strSet73 = mongoDBRiverDefinition68.getIncludeFields();
        java.util.Set<java.lang.String> strSet74 = mongoDBRiverDefinition68.getParentTypes();
        builder25.setexcludeFields(strSet74);
        int int76 = builder25.socketTimeout;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder78 = builder25.mongoCollection("disable_index_refresh");
        builder78.setmongoLocalPassword("script_type");
        builder78.setmongoSecondaryReadPreference(true);
        java.lang.Object obj83 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        docScoreSearchScript0.setNextScore((float) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (short) 0);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory3 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) docScoreNativeScriptFactory3);
        docScoreSearchScript0.setNextScore((float) 1L);
        docScoreSearchScript0.setNextScore((float) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(30000);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "null.null");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("ssl", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextVar("script", (java.lang.Object) 1L);
        docScoreSearchScript0.setNextScore((float) (-1L));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double8 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextVar("script", (java.lang.Object) 1L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str7 = builder6.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder6.indexName("credentials");
        java.lang.String str10 = builder9.mongoAdminUser;
        java.lang.String[] strArray39 = new java.lang.String[] { "throttle_size", "sandbox", "type", "skip_initial_import", "script", "bulk_size", "concurrent_bulk_requests", "script.disable_dynamic", "actions", "password", "include_collection", "script.disable_dynamic", "", "drop_collection", "type", "index", "disable_index_refresh", "skip_initial_import", "type", "store_statistics", "bulk", "include_collection", "localhost", "script_type", "credentials", "servers", "localhost", "sandbox" };
        java.util.LinkedHashSet<java.lang.String> strSet40 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet40, strArray39);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder9.parentTypes((java.util.Set<java.lang.String>) strSet40);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder42.mongoLocalPassword("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition45 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder44);
        java.lang.String str46 = mongoDBRiverDefinition45.getSIZE_FIELD();
        boolean boolean47 = mongoDBRiverDefinition45.disableIndexRefresh;
        boolean boolean48 = mongoDBRiverDefinition45.isMongoGridFS();
        com.mongodb.BasicDBObject basicDBObject49 = mongoDBRiverDefinition45.getMongoCollectionFilter();
        java.lang.String str50 = mongoDBRiverDefinition45.getBULK_TIMEOUT_FIELD();
        com.mongodb.BasicDBObject basicDBObject51 = mongoDBRiverDefinition45.getMongoCollectionFilter();
        boolean boolean52 = mongoDBRiverDefinition45.mongoSSLVerifyCertificate;
        java.lang.Object obj53 = docScoreSearchScript0.unwrap((java.lang.Object) boolean52);
        docScoreSearchScript0.setNextScore((float) 60000);
        docScoreSearchScript0.setNextScore((float) 27017);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double58 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("port", "user");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("include_collection", "gridfs");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) 1);
        org.elasticsearch.common.ParseField parseField6 = org.elasticsearch.script.ScriptService.SCRIPT_ID;
        docScoreSearchScript0.setNextVar("index", (java.lang.Object) parseField6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str9 = builder8.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder8.indexName("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder8.isMongos((java.lang.Boolean) true);
        java.lang.String str14 = builder8.mongoAdminPassword;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder8.mongoSSLVerifyCertificate(false);
        java.lang.String str17 = builder16.getmongoCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder16.mongoGridFS(true);
        java.lang.String str20 = builder19.scriptType;
        java.util.List<com.mongodb.ServerAddress> serverAddressList21 = builder19.getmongoServers();
        boolean boolean22 = builder19.getskipInitialImport();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder19.mongoCollection("disable_index_refresh");
        java.lang.Object obj25 = docScoreSearchScript0.unwrap((java.lang.Object) builder19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) 'a');
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory3 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) docScoreNativeScriptFactory3);
        java.lang.Object obj6 = docScoreSearchScript0.unwrap((java.lang.Object) "host");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str9 = builder8.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder8.indexName("credentials");
        java.lang.String str12 = builder8.getscript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder8.scriptType("index");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str16 = builder15.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder15.indexName("credentials");
        java.lang.String str19 = builder15.getscript();
        boolean boolean20 = builder15.getmongoSecondaryReadPreference();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        int int22 = builder21.getsocketTimeout();
        boolean boolean23 = builder21.mongoUseSSL;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str25 = builder24.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder24.indexName("credentials");
        com.mongodb.BasicDBObject basicDBObject28 = builder27.getmongoCollectionFilter();
        builder21.setmongoOplogFilter(basicDBObject28);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder15.mongoCollectionFilter(basicDBObject28);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder14.mongoOplogFilter(basicDBObject28);
        java.lang.String str32 = builder31.mongoAdminPassword;
        int int33 = builder31.connectTimeout;
        boolean boolean34 = builder31.advancedTransformation;
        docScoreSearchScript0.setNextVar("script.default_lang", (java.lang.Object) builder31);
        docScoreSearchScript0.setNextScore((float) 60000);
        docScoreSearchScript0.setNextScore((float) (-1L));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float40 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("gridfs", "parent_types");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((float) (short) 10);
        docScoreSearchScript0.setNextScore((float) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj7 = docScoreSearchScript0.run();
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((float) (short) 10);
        docScoreSearchScript0.setNextScore(0.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str8 = builder7.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder7.indexName("credentials");
        builder10.setmongoUseSSL(false);
        com.mongodb.BasicDBObject basicDBObject13 = builder10.mongoOplogFilter;
        boolean boolean14 = builder10.mongoSSLVerifyCertificate;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder10.script("concurrent_bulk_requests");
        int int17 = builder16.getsocketTimeout();
        builder16.setscriptType("");
        builder16.advancedTransformation = true;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str23 = builder22.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder22.indexName("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder22.isMongos((java.lang.Boolean) true);
        java.lang.String str28 = builder22.mongoAdminPassword;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder22.mongoSSLVerifyCertificate(false);
        com.mongodb.BasicDBObject basicDBObject31 = builder22.mongoCollectionFilter;
        builder16.setmongoOplogFilter(basicDBObject31);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject31);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("parent_types", "filter");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str7 = builder6.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder6.indexName("credentials");
        java.lang.String str10 = builder9.mongoAdminUser;
        java.lang.String[] strArray39 = new java.lang.String[] { "throttle_size", "sandbox", "type", "skip_initial_import", "script", "bulk_size", "concurrent_bulk_requests", "script.disable_dynamic", "actions", "password", "include_collection", "script.disable_dynamic", "", "drop_collection", "type", "index", "disable_index_refresh", "skip_initial_import", "type", "store_statistics", "bulk", "include_collection", "localhost", "script_type", "credentials", "servers", "localhost", "sandbox" };
        java.util.LinkedHashSet<java.lang.String> strSet40 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet40, strArray39);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder9.parentTypes((java.util.Set<java.lang.String>) strSet40);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder42.mongoLocalPassword("initial_timestamp");
        builder42.setmongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder42.statisticsIndexName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder42.storeStatistics(false);
        builder50.setmongoAdminPassword("bulk");
        java.lang.String str53 = builder50.riverIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder50.mongoLocalPassword("");
        docScoreSearchScript0.setNextVar("throttle_size", (java.lang.Object) "");
        docScoreSearchScript0.setNextScore((float) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float59 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextVar("script", (java.lang.Object) 1L);
        docScoreSearchScript0.setNextScore((float) 27017);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str9 = builder8.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder8.indexName("credentials");
        java.lang.String str12 = builder11.mongoAdminUser;
        java.lang.String[] strArray41 = new java.lang.String[] { "throttle_size", "sandbox", "type", "skip_initial_import", "script", "bulk_size", "concurrent_bulk_requests", "script.disable_dynamic", "actions", "password", "include_collection", "script.disable_dynamic", "", "drop_collection", "type", "index", "disable_index_refresh", "skip_initial_import", "type", "store_statistics", "bulk", "include_collection", "localhost", "script_type", "credentials", "servers", "localhost", "sandbox" };
        java.util.LinkedHashSet<java.lang.String> strSet42 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet42, strArray41);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder11.parentTypes((java.util.Set<java.lang.String>) strSet42);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder44.mongoLocalPassword("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition47 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder46);
        java.lang.String str48 = mongoDBRiverDefinition47.getSIZE_FIELD();
        int int49 = mongoDBRiverDefinition47.getDEFAULT_CONNECT_TIMEOUT();
        java.lang.String str50 = mongoDBRiverDefinition47.getStatisticsTypeName();
        boolean boolean51 = mongoDBRiverDefinition47.isMongoSSLVerifyCertificate();
        com.mongodb.MongoClientOptions mongoClientOptions52 = mongoDBRiverDefinition47.getMongoClientOptions();
        java.lang.Boolean boolean53 = mongoDBRiverDefinition47.isMongos;
        boolean boolean54 = mongoDBRiverDefinition47.isMongoGridFS();
        java.lang.String str55 = mongoDBRiverDefinition47.getSKIP_INITIAL_IMPORT_FIELD();
        java.lang.String str56 = mongoDBRiverDefinition47.getEXCLUDE_FIELDS_FIELD();
        java.lang.Object obj57 = docScoreSearchScript0.unwrap((java.lang.Object) str56);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float58 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) 1);
        org.elasticsearch.common.ParseField parseField6 = org.elasticsearch.script.ScriptService.SCRIPT_ID;
        docScoreSearchScript0.setNextVar("index", (java.lang.Object) parseField6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        int int10 = builder9.getsocketTimeout();
        boolean boolean11 = builder9.mongoUseSSL;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str13 = builder12.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder12.indexName("credentials");
        java.lang.String str16 = builder15.mongoAdminUser;
        java.lang.String[] strArray45 = new java.lang.String[] { "throttle_size", "sandbox", "type", "skip_initial_import", "script", "bulk_size", "concurrent_bulk_requests", "script.disable_dynamic", "actions", "password", "include_collection", "script.disable_dynamic", "", "drop_collection", "type", "index", "disable_index_refresh", "skip_initial_import", "type", "store_statistics", "bulk", "include_collection", "localhost", "script_type", "credentials", "servers", "localhost", "sandbox" };
        java.util.LinkedHashSet<java.lang.String> strSet46 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet46, strArray45);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder15.parentTypes((java.util.Set<java.lang.String>) strSet46);
        builder9.excludeFields = strSet46;
        java.lang.String str50 = builder9.getmongoCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition51 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder9);
        docScoreSearchScript0.setNextVar("flush_interval", (java.lang.Object) mongoDBRiverDefinition51);
        docScoreSearchScript0.setNextScore((float) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((-1));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "flush_interval");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextVar("script", (java.lang.Object) 1L);
        docScoreSearchScript0.setNextScore((float) (-1L));
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str9 = builder8.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder8.indexName("credentials");
        java.lang.String str12 = builder11.mongoAdminUser;
        java.lang.String[] strArray41 = new java.lang.String[] { "throttle_size", "sandbox", "type", "skip_initial_import", "script", "bulk_size", "concurrent_bulk_requests", "script.disable_dynamic", "actions", "password", "include_collection", "script.disable_dynamic", "", "drop_collection", "type", "index", "disable_index_refresh", "skip_initial_import", "type", "store_statistics", "bulk", "include_collection", "localhost", "script_type", "credentials", "servers", "localhost", "sandbox" };
        java.util.LinkedHashSet<java.lang.String> strSet42 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet42, strArray41);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder11.parentTypes((java.util.Set<java.lang.String>) strSet42);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder44.mongoLocalPassword("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition47 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder46);
        java.lang.String str48 = mongoDBRiverDefinition47.getSIZE_FIELD();
        boolean boolean49 = mongoDBRiverDefinition47.disableIndexRefresh;
        boolean boolean50 = mongoDBRiverDefinition47.isMongoGridFS();
        com.mongodb.BasicDBObject basicDBObject51 = mongoDBRiverDefinition47.getMongoCollectionFilter();
        java.lang.String str52 = mongoDBRiverDefinition47.getBULK_TIMEOUT_FIELD();
        com.mongodb.BasicDBObject basicDBObject53 = mongoDBRiverDefinition47.getMongoCollectionFilter();
        boolean boolean54 = mongoDBRiverDefinition47.advancedTransformation;
        java.lang.String str55 = mongoDBRiverDefinition47.getSSL_VERIFY_CERT_FIELD();
        java.lang.String str56 = mongoDBRiverDefinition47.getINCLUDE_FIELDS_FIELD();
        java.lang.String str57 = mongoDBRiverDefinition47.mongoLocalUser;
        java.lang.Object obj58 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition47);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj59 = docScoreSearchScript0.run();
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((float) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str6 = builder5.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder5.indexName("credentials");
        java.lang.String str9 = builder8.mongoAdminUser;
        java.lang.String[] strArray38 = new java.lang.String[] { "throttle_size", "sandbox", "type", "skip_initial_import", "script", "bulk_size", "concurrent_bulk_requests", "script.disable_dynamic", "actions", "password", "include_collection", "script.disable_dynamic", "", "drop_collection", "type", "index", "disable_index_refresh", "skip_initial_import", "type", "store_statistics", "bulk", "include_collection", "localhost", "script_type", "credentials", "servers", "localhost", "sandbox" };
        java.util.LinkedHashSet<java.lang.String> strSet39 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet39, strArray38);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder8.parentTypes((java.util.Set<java.lang.String>) strSet39);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder41.mongoLocalPassword("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition44 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder43);
        java.lang.String str45 = mongoDBRiverDefinition44.getSIZE_FIELD();
        boolean boolean46 = mongoDBRiverDefinition44.disableIndexRefresh;
        boolean boolean47 = mongoDBRiverDefinition44.isMongoGridFS();
        com.mongodb.BasicDBObject basicDBObject48 = mongoDBRiverDefinition44.getMongoCollectionFilter();
        java.lang.String str49 = mongoDBRiverDefinition44.getBULK_TIMEOUT_FIELD();
        java.lang.String str50 = mongoDBRiverDefinition44.getScriptType();
        java.lang.Object obj51 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition44);
        docScoreSearchScript0.setNextVar("throttle_size", (java.lang.Object) "name");
        docScoreSearchScript0.setNextScore((float) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long57 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory3 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) docScoreNativeScriptFactory3);
        java.lang.Object obj6 = docScoreSearchScript0.unwrap((java.lang.Object) "host");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str9 = builder8.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder8.indexName("credentials");
        java.lang.String str12 = builder8.getscript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder8.scriptType("index");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str16 = builder15.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder15.indexName("credentials");
        java.lang.String str19 = builder15.getscript();
        boolean boolean20 = builder15.getmongoSecondaryReadPreference();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        int int22 = builder21.getsocketTimeout();
        boolean boolean23 = builder21.mongoUseSSL;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str25 = builder24.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder24.indexName("credentials");
        com.mongodb.BasicDBObject basicDBObject28 = builder27.getmongoCollectionFilter();
        builder21.setmongoOplogFilter(basicDBObject28);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder15.mongoCollectionFilter(basicDBObject28);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder14.mongoOplogFilter(basicDBObject28);
        java.lang.String str32 = builder31.mongoAdminPassword;
        int int33 = builder31.connectTimeout;
        boolean boolean34 = builder31.advancedTransformation;
        docScoreSearchScript0.setNextVar("script.default_lang", (java.lang.Object) builder31);
        docScoreSearchScript0.setNextScore((float) 60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str39 = builder38.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder38.indexName("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder38.isMongos((java.lang.Boolean) true);
        java.lang.String str44 = builder38.mongoAdminPassword;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder38.mongoSSLVerifyCertificate(false);
        builder46.setincludeCollection("import_all_collections");
        java.util.Set<java.lang.String> strSet49 = builder46.parentTypes;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition50 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder46);
        java.lang.String str51 = mongoDBRiverDefinition50.getBULK_FIELD();
        int int52 = mongoDBRiverDefinition50.getDEFAULT_BULK_ACTIONS();
        com.mongodb.BasicDBObject basicDBObject53 = mongoDBRiverDefinition50.getMongoCollectionFilter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject53);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory3 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) docScoreNativeScriptFactory3);
        java.lang.Object obj6 = docScoreSearchScript0.unwrap((java.lang.Object) "host");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str9 = builder8.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder8.indexName("credentials");
        java.lang.String str12 = builder8.getscript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder8.scriptType("index");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str16 = builder15.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder15.indexName("credentials");
        java.lang.String str19 = builder15.getscript();
        boolean boolean20 = builder15.getmongoSecondaryReadPreference();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        int int22 = builder21.getsocketTimeout();
        boolean boolean23 = builder21.mongoUseSSL;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str25 = builder24.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder24.indexName("credentials");
        com.mongodb.BasicDBObject basicDBObject28 = builder27.getmongoCollectionFilter();
        builder21.setmongoOplogFilter(basicDBObject28);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder15.mongoCollectionFilter(basicDBObject28);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder14.mongoOplogFilter(basicDBObject28);
        java.lang.String str32 = builder31.mongoAdminPassword;
        int int33 = builder31.connectTimeout;
        boolean boolean34 = builder31.advancedTransformation;
        docScoreSearchScript0.setNextVar("script.default_lang", (java.lang.Object) builder31);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj36 = docScoreSearchScript0.run();
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) 1);
        org.elasticsearch.common.ParseField parseField6 = org.elasticsearch.script.ScriptService.SCRIPT_ID;
        docScoreSearchScript0.setNextVar("index", (java.lang.Object) parseField6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str9 = builder8.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder8.indexName("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder8.isMongos((java.lang.Boolean) true);
        java.lang.String str14 = builder8.mongoAdminPassword;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder8.mongoSSLVerifyCertificate(false);
        java.lang.String str17 = builder16.getmongoCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder16.mongoGridFS(true);
        java.lang.String str20 = builder19.scriptType;
        java.util.List<com.mongodb.ServerAddress> serverAddressList21 = builder19.getmongoServers();
        boolean boolean22 = builder19.getskipInitialImport();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder19.mongoCollection("disable_index_refresh");
        java.lang.Object obj25 = docScoreSearchScript0.unwrap((java.lang.Object) builder19);
        docScoreSearchScript0.setNextScore((float) (byte) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str29 = builder28.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder28.indexName("credentials");
        java.lang.String str32 = builder31.mongoAdminUser;
        java.lang.String[] strArray61 = new java.lang.String[] { "throttle_size", "sandbox", "type", "skip_initial_import", "script", "bulk_size", "concurrent_bulk_requests", "script.disable_dynamic", "actions", "password", "include_collection", "script.disable_dynamic", "", "drop_collection", "type", "index", "disable_index_refresh", "skip_initial_import", "type", "store_statistics", "bulk", "include_collection", "localhost", "script_type", "credentials", "servers", "localhost", "sandbox" };
        java.util.LinkedHashSet<java.lang.String> strSet62 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet62, strArray61);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder64 = builder31.parentTypes((java.util.Set<java.lang.String>) strSet62);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder66 = builder64.mongoLocalPassword("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition67 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder66);
        java.lang.String str68 = mongoDBRiverDefinition67.getSIZE_FIELD();
        java.lang.String str69 = mongoDBRiverDefinition67.getTHROTTLE_SIZE_FIELD();
        java.lang.String str70 = mongoDBRiverDefinition67.getCONCURRENT_BULK_REQUESTS_FIELD();
        java.util.Set<java.lang.String> strSet71 = mongoDBRiverDefinition67.getIncludeFields();
        int int72 = mongoDBRiverDefinition67.getThrottleSize();
        com.mongodb.BasicDBObject basicDBObject73 = mongoDBRiverDefinition67.mongoOplogFilter;
        com.mongodb.BasicDBObject basicDBObject74 = mongoDBRiverDefinition67.getMongoCollectionFilter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject74);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((float) (short) 10);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript6 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript6.setNextScore(0.0f);
        java.lang.Object obj10 = docScoreSearchScript6.unwrap((java.lang.Object) 1);
        docScoreSearchScript0.setNextVar("script_type", obj10);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript12 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript12.setNextScore(0.0f);
        java.lang.Object obj16 = docScoreSearchScript12.unwrap((java.lang.Object) "");
        java.lang.Object obj17 = docScoreSearchScript0.unwrap((java.lang.Object) "");
        docScoreSearchScript0.setNextScore((float) 32);
        docScoreSearchScript0.setNextScore((float) (byte) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str23 = builder22.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder22.indexName("credentials");
        java.lang.String str26 = builder25.mongoAdminUser;
        java.lang.String[] strArray55 = new java.lang.String[] { "throttle_size", "sandbox", "type", "skip_initial_import", "script", "bulk_size", "concurrent_bulk_requests", "script.disable_dynamic", "actions", "password", "include_collection", "script.disable_dynamic", "", "drop_collection", "type", "index", "disable_index_refresh", "skip_initial_import", "type", "store_statistics", "bulk", "include_collection", "localhost", "script_type", "credentials", "servers", "localhost", "sandbox" };
        java.util.LinkedHashSet<java.lang.String> strSet56 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet56, strArray55);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = builder25.parentTypes((java.util.Set<java.lang.String>) strSet56);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder58.mongoLocalPassword("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition61 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder60);
        java.util.Set<java.lang.String> strSet62 = builder60.getincludeFields();
        int int63 = builder60.getconnectTimeout();
        builder60.riverName = "index";
        builder60.mongoSSLVerifyCertificate = false;
        java.lang.String str68 = builder60.mongoDb;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder70 = builder60.statisticsIndexName("password");
        boolean boolean71 = builder70.getadvancedTransformation();
        builder70.socketTimeout = 30000;
        java.lang.Object obj74 = docScoreSearchScript0.unwrap((java.lang.Object) 30000);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (short) 0);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("index", "host");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) 1);
        org.elasticsearch.common.unit.TimeValue timeValue5 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DEFAULT_FLUSH_INTERVAL;
        java.lang.Object obj6 = docScoreSearchScript0.unwrap((java.lang.Object) timeValue5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str8 = builder7.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder7.indexName("credentials");
        boolean boolean11 = builder7.getadvancedTransformation();
        builder7.typeName = "script_type";
        boolean boolean14 = builder7.getmongoSecondaryReadPreference();
        com.mongodb.BasicDBObject basicDBObject15 = builder7.getmongoCollectionFilter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject15);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("ssl", "type");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) 1);
        org.elasticsearch.common.ParseField parseField6 = org.elasticsearch.script.ScriptService.SCRIPT_ID;
        docScoreSearchScript0.setNextVar("index", (java.lang.Object) parseField6);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        int int10 = builder9.getsocketTimeout();
        boolean boolean11 = builder9.mongoUseSSL;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str13 = builder12.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder12.indexName("credentials");
        java.lang.String str16 = builder15.mongoAdminUser;
        java.lang.String[] strArray45 = new java.lang.String[] { "throttle_size", "sandbox", "type", "skip_initial_import", "script", "bulk_size", "concurrent_bulk_requests", "script.disable_dynamic", "actions", "password", "include_collection", "script.disable_dynamic", "", "drop_collection", "type", "index", "disable_index_refresh", "skip_initial_import", "type", "store_statistics", "bulk", "include_collection", "localhost", "script_type", "credentials", "servers", "localhost", "sandbox" };
        java.util.LinkedHashSet<java.lang.String> strSet46 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet46, strArray45);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder15.parentTypes((java.util.Set<java.lang.String>) strSet46);
        builder9.excludeFields = strSet46;
        java.lang.String str50 = builder9.getmongoCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition51 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder9);
        docScoreSearchScript0.setNextVar("flush_interval", (java.lang.Object) mongoDBRiverDefinition51);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str55 = builder54.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder54.indexName("credentials");
        com.mongodb.BasicDBObject basicDBObject58 = builder57.getmongoCollectionFilter();
        java.util.List<com.mongodb.ServerAddress> serverAddressList59 = builder57.getmongoServers();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = builder57.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = builder57.disableIndexRefresh(true);
        docScoreSearchScript0.setNextVar("is_mongos", (java.lang.Object) builder57);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double65 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("type", "null.null");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("skip_initial_import", ".scripts");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((float) (short) 10);
        docScoreSearchScript0.setNextScore((float) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str8 = builder7.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder7.indexName("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder7.isMongos((java.lang.Boolean) true);
        java.lang.String str13 = builder7.mongoAdminPassword;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder7.mongoSSLVerifyCertificate(false);
        java.lang.String str16 = builder7.riverName;
        java.lang.String str17 = builder7.mongoCollection;
        com.mongodb.BasicDBObject basicDBObject18 = builder7.getmongoCollectionFilter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((float) (short) 10);
        docScoreSearchScript0.setNextScore(0.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(32);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float5 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((float) (short) 10);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript6 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript6.setNextScore(0.0f);
        java.lang.Object obj10 = docScoreSearchScript6.unwrap((java.lang.Object) 1);
        docScoreSearchScript0.setNextVar("script_type", obj10);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript12 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript12.setNextScore(0.0f);
        java.lang.Object obj16 = docScoreSearchScript12.unwrap((java.lang.Object) "");
        java.lang.Object obj17 = docScoreSearchScript0.unwrap((java.lang.Object) "");
        docScoreSearchScript0.setNextScore((float) 32);
        docScoreSearchScript0.setNextScore((float) (byte) 10);
        docScoreSearchScript0.setNextScore(1.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float24 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("size", "password");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextVar("script", (java.lang.Object) 1L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str7 = builder6.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder6.indexName("credentials");
        java.lang.String str10 = builder9.mongoAdminUser;
        java.lang.String[] strArray39 = new java.lang.String[] { "throttle_size", "sandbox", "type", "skip_initial_import", "script", "bulk_size", "concurrent_bulk_requests", "script.disable_dynamic", "actions", "password", "include_collection", "script.disable_dynamic", "", "drop_collection", "type", "index", "disable_index_refresh", "skip_initial_import", "type", "store_statistics", "bulk", "include_collection", "localhost", "script_type", "credentials", "servers", "localhost", "sandbox" };
        java.util.LinkedHashSet<java.lang.String> strSet40 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet40, strArray39);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder9.parentTypes((java.util.Set<java.lang.String>) strSet40);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder42.mongoLocalPassword("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition45 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder44);
        java.lang.String str46 = mongoDBRiverDefinition45.getSIZE_FIELD();
        boolean boolean47 = mongoDBRiverDefinition45.disableIndexRefresh;
        boolean boolean48 = mongoDBRiverDefinition45.isMongoGridFS();
        com.mongodb.BasicDBObject basicDBObject49 = mongoDBRiverDefinition45.getMongoCollectionFilter();
        java.lang.String str50 = mongoDBRiverDefinition45.getBULK_TIMEOUT_FIELD();
        com.mongodb.BasicDBObject basicDBObject51 = mongoDBRiverDefinition45.getMongoCollectionFilter();
        boolean boolean52 = mongoDBRiverDefinition45.mongoSSLVerifyCertificate;
        java.lang.Object obj53 = docScoreSearchScript0.unwrap((java.lang.Object) boolean52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj54 = docScoreSearchScript0.run();
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory3 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) docScoreNativeScriptFactory3);
        docScoreSearchScript0.setNextScore((float) 1L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(1);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((float) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float5 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((float) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str7 = builder6.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder6.indexName("credentials");
        java.lang.String str10 = builder9.mongoAdminUser;
        java.lang.String[] strArray39 = new java.lang.String[] { "throttle_size", "sandbox", "type", "skip_initial_import", "script", "bulk_size", "concurrent_bulk_requests", "script.disable_dynamic", "actions", "password", "include_collection", "script.disable_dynamic", "", "drop_collection", "type", "index", "disable_index_refresh", "skip_initial_import", "type", "store_statistics", "bulk", "include_collection", "localhost", "script_type", "credentials", "servers", "localhost", "sandbox" };
        java.util.LinkedHashSet<java.lang.String> strSet40 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet40, strArray39);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder9.parentTypes((java.util.Set<java.lang.String>) strSet40);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder42.mongoLocalPassword("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition45 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder44);
        java.lang.String str46 = mongoDBRiverDefinition45.getSIZE_FIELD();
        java.lang.String str47 = mongoDBRiverDefinition45.getTHROTTLE_SIZE_FIELD();
        java.lang.String str48 = mongoDBRiverDefinition45.getCONCURRENT_BULK_REQUESTS_FIELD();
        int int49 = mongoDBRiverDefinition45.getDEFAULT_BULK_ACTIONS();
        java.lang.String str50 = mongoDBRiverDefinition45.getIMPORT_ALL_COLLECTIONS_FIELD();
        docScoreSearchScript0.setNextVar("", (java.lang.Object) str50);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String str53 = builder52.statisticsIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder52.indexName("credentials");
        java.lang.String str56 = builder55.mongoAdminUser;
        java.lang.String[] strArray85 = new java.lang.String[] { "throttle_size", "sandbox", "type", "skip_initial_import", "script", "bulk_size", "concurrent_bulk_requests", "script.disable_dynamic", "actions", "password", "include_collection", "script.disable_dynamic", "", "drop_collection", "type", "index", "disable_index_refresh", "skip_initial_import", "type", "store_statistics", "bulk", "include_collection", "localhost", "script_type", "credentials", "servers", "localhost", "sandbox" };
        java.util.LinkedHashSet<java.lang.String> strSet86 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet86, strArray85);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder88 = builder55.parentTypes((java.util.Set<java.lang.String>) strSet86);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder90 = builder88.mongoLocalPassword("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition91 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder90);
        java.lang.String str92 = mongoDBRiverDefinition91.getSIZE_FIELD();
        java.lang.String str93 = mongoDBRiverDefinition91.getSKIP_INITIAL_IMPORT_FIELD();
        java.lang.String str94 = mongoDBRiverDefinition91.getINDEX_OBJECT();
        int int95 = mongoDBRiverDefinition91.getDEFAULT_SOCKET_TIMEOUT();
        java.lang.String str96 = mongoDBRiverDefinition91.getNAME_FIELD();
        java.lang.Object obj97 = docScoreSearchScript0.unwrap((java.lang.Object) str96);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(32);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("concurrent_requests", "null.collection", false);
    }
}

