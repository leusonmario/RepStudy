import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1001");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("null.", "filter");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1002");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("disable_index_refresh.disable_index_refresh", "script");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1003");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float3 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1004");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("store_statistics", "gridfs");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1005");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script_type", "script_type");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1006");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder1.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder3.mongoGridFS(true);
        java.lang.String[] strArray16 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder5.includeFields((java.util.Set<java.lang.String>) strSet17);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder20.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder24.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.indexName("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder28.statisticsTypeName("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder33.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder33.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder33.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder40.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder42.mongoGridFS(true);
        java.lang.String[] strArray55 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet56 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet56, strArray55);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = builder44.includeFields((java.util.Set<java.lang.String>) strSet56);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = builder39.excludeFields((java.util.Set<java.lang.String>) strSet56);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder32.excludeFields((java.util.Set<java.lang.String>) strSet56);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = builder5.parentTypes((java.util.Set<java.lang.String>) strSet56);
        java.lang.Object obj62 = docScoreSearchScript0.unwrap((java.lang.Object) builder5);
        docScoreSearchScript0.setNextScore((float) 100L);
        docScoreSearchScript0.setNextScore((float) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (short) 0);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1007");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) "bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = builder6.build();
        java.lang.String str10 = mongoDBRiverDefinition9.getIncludeCollection();
        boolean boolean11 = mongoDBRiverDefinition9.isMongoSSLVerifyCertificate();
        java.lang.String str12 = mongoDBRiverDefinition9.getIndexName();
        java.lang.Object obj13 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition9);
        docScoreSearchScript0.setNextScore((float) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.mongoGridFS(true);
        java.lang.String[] strArray31 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder20.includeFields((java.util.Set<java.lang.String>) strSet32);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.socketTimeout((int) (byte) 10);
        java.lang.Object obj37 = docScoreSearchScript0.unwrap((java.lang.Object) (byte) 10);
        docScoreSearchScript0.setNextScore((float) 100);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory41 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder42.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder44.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition47 = builder44.build();
        java.lang.String str48 = mongoDBRiverDefinition47.getRiverIndexName();
        boolean boolean49 = mongoDBRiverDefinition47.isDisableIndexRefresh();
        java.util.Set<java.lang.String> strSet50 = mongoDBRiverDefinition47.getIncludeFields();
        java.lang.String str51 = mongoDBRiverDefinition47.getMongoLocalPassword();
        com.mongodb.BasicDBObject basicDBObject52 = mongoDBRiverDefinition47.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript53 = docScoreNativeScriptFactory41.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject52);
        docScoreSearchScript0.setNextVar("", (java.lang.Object) docScoreNativeScriptFactory41);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long55 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1008");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("credentials", "collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1009");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_size", "admin");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1010");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("disable_index_refresh.disable_index_refresh", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1011");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("host", "password");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1012");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("gridfs", "concurrent_bulk_requests");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1013");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script", "null.");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1014");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) "bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = builder6.build();
        java.lang.String str10 = mongoDBRiverDefinition9.getIncludeCollection();
        boolean boolean11 = mongoDBRiverDefinition9.isMongoSSLVerifyCertificate();
        java.lang.String str12 = mongoDBRiverDefinition9.getIndexName();
        java.lang.Object obj13 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition9);
        docScoreSearchScript0.setNextScore((float) (byte) -1);
        docScoreSearchScript0.setNextScore((float) 8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float18 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1015");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("host", "port");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1016");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("exclude_fields", "servers");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1017");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("import_all_collections.import_all_collections", "index");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1018");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("db", "script");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1019");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) "bulk_timeout");
        docScoreSearchScript0.setNextScore((float) 10L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.indexName("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder14.statisticsTypeName("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder19.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder19.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.mongoGridFS(true);
        java.lang.String[] strArray41 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet42 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet42, strArray41);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder30.includeFields((java.util.Set<java.lang.String>) strSet42);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder25.excludeFields((java.util.Set<java.lang.String>) strSet42);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder18.excludeFields((java.util.Set<java.lang.String>) strSet42);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition47 = builder18.build();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder18.connectTimeout((int) 'a');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder50.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder52.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition55 = builder52.build();
        boolean boolean56 = mongoDBRiverDefinition55.isDisableIndexRefresh();
        boolean boolean57 = mongoDBRiverDefinition55.isDisableIndexRefresh();
        int int58 = mongoDBRiverDefinition55.getThrottleSize();
        int int59 = mongoDBRiverDefinition55.getSocketTimeout();
        boolean boolean60 = mongoDBRiverDefinition55.isDisableIndexRefresh();
        java.util.List<com.mongodb.ServerAddress> serverAddressList61 = mongoDBRiverDefinition55.getMongoServers();
        java.lang.String str62 = mongoDBRiverDefinition55.getMongoOplogNamespace();
        java.util.Set<java.lang.String> strSet63 = mongoDBRiverDefinition55.getParentTypes();
        java.lang.String str64 = mongoDBRiverDefinition55.getScriptType();
        java.lang.String str65 = mongoDBRiverDefinition55.getMongoDb();
        boolean boolean66 = mongoDBRiverDefinition55.isMongoSSLVerifyCertificate();
        java.util.List<com.mongodb.ServerAddress> serverAddressList67 = mongoDBRiverDefinition55.getMongoServers();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder68 = builder18.mongoServers(serverAddressList67);
        java.lang.Object obj69 = docScoreSearchScript0.unwrap((java.lang.Object) builder18);
        docScoreSearchScript0.setNextScore((float) 0L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder73 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder75 = builder73.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder77 = builder75.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition78 = builder75.build();
        java.lang.String str79 = mongoDBRiverDefinition78.getIncludeCollection();
        boolean boolean80 = mongoDBRiverDefinition78.isMongoSSLVerifyCertificate();
        java.lang.String str81 = mongoDBRiverDefinition78.getIndexName();
        java.lang.String str82 = mongoDBRiverDefinition78.getMongoDb();
        boolean boolean83 = mongoDBRiverDefinition78.isDisableIndexRefresh();
        java.lang.String str84 = mongoDBRiverDefinition78.getIndexName();
        java.lang.String str85 = mongoDBRiverDefinition78.getMongoAdminPassword();
        boolean boolean86 = mongoDBRiverDefinition78.isStoreStatistics();
        java.lang.String str87 = mongoDBRiverDefinition78.getMongoOplogNamespace();
        boolean boolean88 = mongoDBRiverDefinition78.isMongoGridFS();
        boolean boolean89 = mongoDBRiverDefinition78.isDropCollection();
        docScoreSearchScript0.setNextVar("include_collection", (java.lang.Object) mongoDBRiverDefinition78);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double91 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1020");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) "bulk_timeout");
        docScoreSearchScript0.setNextScore((float) 10L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.indexName("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder14.statisticsTypeName("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder19.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder19.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.mongoGridFS(true);
        java.lang.String[] strArray41 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet42 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet42, strArray41);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder30.includeFields((java.util.Set<java.lang.String>) strSet42);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder25.excludeFields((java.util.Set<java.lang.String>) strSet42);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder18.excludeFields((java.util.Set<java.lang.String>) strSet42);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition47 = builder18.build();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder18.connectTimeout((int) 'a');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder50.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder52.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition55 = builder52.build();
        boolean boolean56 = mongoDBRiverDefinition55.isDisableIndexRefresh();
        boolean boolean57 = mongoDBRiverDefinition55.isDisableIndexRefresh();
        int int58 = mongoDBRiverDefinition55.getThrottleSize();
        int int59 = mongoDBRiverDefinition55.getSocketTimeout();
        boolean boolean60 = mongoDBRiverDefinition55.isDisableIndexRefresh();
        java.util.List<com.mongodb.ServerAddress> serverAddressList61 = mongoDBRiverDefinition55.getMongoServers();
        java.lang.String str62 = mongoDBRiverDefinition55.getMongoOplogNamespace();
        java.util.Set<java.lang.String> strSet63 = mongoDBRiverDefinition55.getParentTypes();
        java.lang.String str64 = mongoDBRiverDefinition55.getScriptType();
        java.lang.String str65 = mongoDBRiverDefinition55.getMongoDb();
        boolean boolean66 = mongoDBRiverDefinition55.isMongoSSLVerifyCertificate();
        java.util.List<com.mongodb.ServerAddress> serverAddressList67 = mongoDBRiverDefinition55.getMongoServers();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder68 = builder18.mongoServers(serverAddressList67);
        java.lang.Object obj69 = docScoreSearchScript0.unwrap((java.lang.Object) builder18);
        docScoreSearchScript0.setNextScore((float) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float72 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1021");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("db", "user");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1022");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) "bulk_timeout");
        docScoreSearchScript0.setNextScore((float) 10L);
        docScoreSearchScript0.setNextScore((float) 1000);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj8 = docScoreSearchScript0.run();
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1023");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 10.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (short) 100);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1024");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("skip_initial_import.skip_initial_import", "disable_index_refresh.disable_index_refresh");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1025");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("collection", "host.filter");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1026");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("socket_timeout", "localhost");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1027");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("include_collection", "name");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1028");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk", "parent_types");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1029");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("skip_initial_import.skip_initial_import", "host");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1030");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("import_all_collections.import_all_collections", "flush_interval");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1031");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("options", "disable_index_refresh.disable_index_refresh");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1032");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) "bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = builder6.build();
        java.lang.String str10 = mongoDBRiverDefinition9.getIncludeCollection();
        boolean boolean11 = mongoDBRiverDefinition9.isMongoSSLVerifyCertificate();
        java.lang.String str12 = mongoDBRiverDefinition9.getIndexName();
        java.lang.Object obj13 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder14.includeCollection("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.mongoDb("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.statisticsIndexName("password");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder22.includeCollection("null.");
        java.lang.Object obj25 = docScoreSearchScript0.unwrap((java.lang.Object) "null.");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder27.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder27.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder36.mongoGridFS(true);
        java.lang.String[] strArray49 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet50 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet50, strArray49);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder38.includeFields((java.util.Set<java.lang.String>) strSet50);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder33.excludeFields((java.util.Set<java.lang.String>) strSet50);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder33.storeStatistics(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder33.riverIndexName("actions");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = builder33.script("bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = builder33.mongoAdminPassword("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = builder61.riverIndexName("credentials");
        docScoreSearchScript0.setNextVar("collection", (java.lang.Object) "credentials");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long65 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1033");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) "bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = builder6.build();
        java.lang.String str10 = mongoDBRiverDefinition9.getIncludeCollection();
        boolean boolean11 = mongoDBRiverDefinition9.isMongoSSLVerifyCertificate();
        java.lang.String str12 = mongoDBRiverDefinition9.getIndexName();
        java.lang.Object obj13 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition9);
        docScoreSearchScript0.setNextScore((float) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.mongoGridFS(true);
        java.lang.String[] strArray31 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder20.includeFields((java.util.Set<java.lang.String>) strSet32);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.socketTimeout((int) (byte) 10);
        java.lang.Object obj37 = docScoreSearchScript0.unwrap((java.lang.Object) (byte) 10);
        docScoreSearchScript0.setNextScore((float) 100);
        docScoreSearchScript0.setNextScore(1.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder42.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder44.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition47 = builder44.build();
        java.lang.String str48 = mongoDBRiverDefinition47.getRiverIndexName();
        boolean boolean49 = mongoDBRiverDefinition47.isDisableIndexRefresh();
        boolean boolean50 = mongoDBRiverDefinition47.isStoreStatistics();
        java.lang.String str51 = mongoDBRiverDefinition47.getMongoLocalPassword();
        java.lang.String str52 = mongoDBRiverDefinition47.getScriptType();
        java.util.List<com.mongodb.ServerAddress> serverAddressList53 = mongoDBRiverDefinition47.getMongoServers();
        java.lang.Object obj54 = docScoreSearchScript0.unwrap((java.lang.Object) serverAddressList53);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj55 = docScoreSearchScript0.run();
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1034");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("admin", "include_fields");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1035");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 10.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = builder6.build();
        java.lang.String str10 = mongoDBRiverDefinition9.getIncludeCollection();
        boolean boolean11 = mongoDBRiverDefinition9.isMongoSSLVerifyCertificate();
        java.lang.String str12 = mongoDBRiverDefinition9.getIndexName();
        java.lang.String str13 = mongoDBRiverDefinition9.getMongoAdminUser();
        int int14 = mongoDBRiverDefinition9.getThrottleSize();
        docScoreSearchScript0.setNextVar("parent_types", (java.lang.Object) int14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) '4');
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1036");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("flush_interval", "bulk_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1037");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) "bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = builder6.build();
        java.lang.String str10 = mongoDBRiverDefinition9.getIncludeCollection();
        boolean boolean11 = mongoDBRiverDefinition9.isMongoSSLVerifyCertificate();
        java.lang.String str12 = mongoDBRiverDefinition9.getIndexName();
        java.lang.Object obj13 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition9);
        docScoreSearchScript0.setNextScore((float) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.mongoGridFS(true);
        java.lang.String[] strArray31 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder20.includeFields((java.util.Set<java.lang.String>) strSet32);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.socketTimeout((int) (byte) 10);
        java.lang.Object obj37 = docScoreSearchScript0.unwrap((java.lang.Object) (byte) 10);
        docScoreSearchScript0.setNextScore((float) 100);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory41 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder42.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder44.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition47 = builder44.build();
        java.lang.String str48 = mongoDBRiverDefinition47.getRiverIndexName();
        boolean boolean49 = mongoDBRiverDefinition47.isDisableIndexRefresh();
        java.util.Set<java.lang.String> strSet50 = mongoDBRiverDefinition47.getIncludeFields();
        java.lang.String str51 = mongoDBRiverDefinition47.getMongoLocalPassword();
        com.mongodb.BasicDBObject basicDBObject52 = mongoDBRiverDefinition47.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript53 = docScoreNativeScriptFactory41.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject52);
        docScoreSearchScript0.setNextVar("", (java.lang.Object) docScoreNativeScriptFactory41);
        docScoreSearchScript0.setNextScore((-1.0f));
        docScoreSearchScript0.setNextScore((float) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double59 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1038");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) "bulk_timeout");
        docScoreSearchScript0.setNextScore((float) 10L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.indexName("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder14.statisticsTypeName("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder19.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder19.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.mongoGridFS(true);
        java.lang.String[] strArray41 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet42 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet42, strArray41);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder30.includeFields((java.util.Set<java.lang.String>) strSet42);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder25.excludeFields((java.util.Set<java.lang.String>) strSet42);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder18.excludeFields((java.util.Set<java.lang.String>) strSet42);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition47 = builder18.build();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder18.connectTimeout((int) 'a');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder50.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder52.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition55 = builder52.build();
        boolean boolean56 = mongoDBRiverDefinition55.isDisableIndexRefresh();
        boolean boolean57 = mongoDBRiverDefinition55.isDisableIndexRefresh();
        int int58 = mongoDBRiverDefinition55.getThrottleSize();
        int int59 = mongoDBRiverDefinition55.getSocketTimeout();
        boolean boolean60 = mongoDBRiverDefinition55.isDisableIndexRefresh();
        java.util.List<com.mongodb.ServerAddress> serverAddressList61 = mongoDBRiverDefinition55.getMongoServers();
        java.lang.String str62 = mongoDBRiverDefinition55.getMongoOplogNamespace();
        java.util.Set<java.lang.String> strSet63 = mongoDBRiverDefinition55.getParentTypes();
        java.lang.String str64 = mongoDBRiverDefinition55.getScriptType();
        java.lang.String str65 = mongoDBRiverDefinition55.getMongoDb();
        boolean boolean66 = mongoDBRiverDefinition55.isMongoSSLVerifyCertificate();
        java.util.List<com.mongodb.ServerAddress> serverAddressList67 = mongoDBRiverDefinition55.getMongoServers();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder68 = builder18.mongoServers(serverAddressList67);
        java.lang.Object obj69 = docScoreSearchScript0.unwrap((java.lang.Object) builder18);
        docScoreSearchScript0.setNextScore((float) 0L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder73 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder75 = builder73.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder77 = builder75.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition78 = builder75.build();
        java.lang.String str79 = mongoDBRiverDefinition78.getIncludeCollection();
        boolean boolean80 = mongoDBRiverDefinition78.isMongoSSLVerifyCertificate();
        java.lang.String str81 = mongoDBRiverDefinition78.getIndexName();
        java.lang.String str82 = mongoDBRiverDefinition78.getMongoDb();
        boolean boolean83 = mongoDBRiverDefinition78.isDisableIndexRefresh();
        java.lang.String str84 = mongoDBRiverDefinition78.getIndexName();
        java.lang.String str85 = mongoDBRiverDefinition78.getMongoAdminPassword();
        boolean boolean86 = mongoDBRiverDefinition78.isStoreStatistics();
        java.lang.String str87 = mongoDBRiverDefinition78.getMongoOplogNamespace();
        boolean boolean88 = mongoDBRiverDefinition78.isMongoGridFS();
        boolean boolean89 = mongoDBRiverDefinition78.isDropCollection();
        docScoreSearchScript0.setNextVar("include_collection", (java.lang.Object) mongoDBRiverDefinition78);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj91 = docScoreSearchScript0.run();
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1039");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 10.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder3.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder3.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder3.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder3.riverName("script_type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.importAllCollections(false);
        java.lang.Object obj14 = docScoreSearchScript0.unwrap((java.lang.Object) builder13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder15.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.indexName("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder23.statisticsTypeName("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder23.indexName("size");
        java.lang.Object obj30 = docScoreSearchScript0.unwrap((java.lang.Object) "size");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (byte) 0);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1040");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("initial_timestamp", "host.filter");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1041");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) "bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder5.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder13.includeCollection("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder13.mongoLocalPassword("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder13.statisticsIndexName("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder13.statisticsIndexName("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.statisticsIndexName("user");
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) builder23);
        docScoreSearchScript0.setNextScore((float) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj27 = docScoreSearchScript0.run();
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1042");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("skip_initial_import", "db");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1043");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("port", "gridfs");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1044");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1045");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "host");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1046");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) "bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder5.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder13.includeCollection("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder13.mongoLocalPassword("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder13.statisticsIndexName("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder13.statisticsIndexName("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.statisticsIndexName("user");
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) builder23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(100);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1047");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "");
        docScoreSearchScript0.setNextScore((float) 8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = builder8.build();
        java.lang.String str12 = mongoDBRiverDefinition11.getIncludeCollection();
        java.lang.String str13 = mongoDBRiverDefinition11.getMongoAdminPassword();
        java.lang.String str14 = mongoDBRiverDefinition11.getMongoDb();
        int int15 = mongoDBRiverDefinition11.getSocketTimeout();
        boolean boolean16 = mongoDBRiverDefinition11.isMongoSecondaryReadPreference();
        java.lang.String str17 = mongoDBRiverDefinition11.getScript();
        java.lang.String str18 = mongoDBRiverDefinition11.getMongoAdminPassword();
        com.mongodb.BasicDBObject basicDBObject19 = mongoDBRiverDefinition11.getMongoOplogFilter();
        docScoreSearchScript0.setNextVar("drop_collection", (java.lang.Object) mongoDBRiverDefinition11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj21 = docScoreSearchScript0.run();
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1048");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_size", "host");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1049");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("import_all_collections.import_all_collections", "type");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1050");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder3.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.statisticsIndexName("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.mongoAdminUser("gridfs");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.riverName("parent_types");
        java.lang.Object obj14 = docScoreSearchScript0.unwrap((java.lang.Object) builder11);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition21 = builder18.build();
        java.lang.String str22 = mongoDBRiverDefinition21.getIncludeCollection();
        boolean boolean23 = mongoDBRiverDefinition21.isMongoSSLVerifyCertificate();
        java.lang.String str24 = mongoDBRiverDefinition21.getIndexName();
        java.lang.String str25 = mongoDBRiverDefinition21.getMongoAdminUser();
        java.util.Set<java.lang.String> strSet26 = mongoDBRiverDefinition21.getParentTypes();
        boolean boolean27 = mongoDBRiverDefinition21.isMongoGridFS();
        docScoreSearchScript0.setNextVar("advanced_transformation", (java.lang.Object) boolean27);
        docScoreSearchScript0.setNextScore((float) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (byte) 1);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1051");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("initial_timestamp", "password");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1052");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_timeout", "concurrent_requests");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1053");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "");
        docScoreSearchScript0.setNextScore((float) (-1L));
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition10 = builder7.build();
        boolean boolean11 = mongoDBRiverDefinition10.isDisableIndexRefresh();
        boolean boolean12 = mongoDBRiverDefinition10.isDropCollection();
        java.lang.String str13 = mongoDBRiverDefinition10.getMongoAdminPassword();
        boolean boolean14 = mongoDBRiverDefinition10.isMongoSSLVerifyCertificate();
        java.lang.String str15 = mongoDBRiverDefinition10.getScript();
        java.lang.String str16 = mongoDBRiverDefinition10.getScript();
        java.util.List<com.mongodb.ServerAddress> serverAddressList17 = mongoDBRiverDefinition10.getMongoServers();
        java.util.List<com.mongodb.ServerAddress> serverAddressList18 = mongoDBRiverDefinition10.getMongoServers();
        java.util.Set<java.lang.String> strSet19 = mongoDBRiverDefinition10.getExcludeFields();
        com.mongodb.BasicDBObject basicDBObject20 = mongoDBRiverDefinition10.getMongoCollectionFilter();
        boolean boolean21 = mongoDBRiverDefinition10.isMongoSSLVerifyCertificate();
        java.lang.Object obj22 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long23 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1054");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("skip_initial_import", "local");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1055");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("parent_types", "ssl_verify_certificate.ssl_verify_certificate");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1056");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("index", "collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1057");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("ssl_verify_certificate.ssl_verify_certificate", "throttle_size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1058");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "");
        docScoreSearchScript0.setNextScore((float) (-1L));
        java.lang.Object obj6 = docScoreSearchScript0.unwrap((java.lang.Object) (-1.0d));
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = builder10.build();
        java.lang.String str14 = mongoDBRiverDefinition13.getIncludeCollection();
        boolean boolean15 = mongoDBRiverDefinition13.isMongoSSLVerifyCertificate();
        java.lang.String str16 = mongoDBRiverDefinition13.getIndexName();
        java.lang.String str17 = mongoDBRiverDefinition13.getMongoDb();
        boolean boolean18 = mongoDBRiverDefinition13.isDisableIndexRefresh();
        java.lang.String str19 = mongoDBRiverDefinition13.getIndexName();
        java.lang.String str20 = mongoDBRiverDefinition13.getIncludeCollection();
        boolean boolean21 = mongoDBRiverDefinition13.isDropCollection();
        java.lang.String str22 = mongoDBRiverDefinition13.getTypeName();
        java.lang.String str23 = mongoDBRiverDefinition13.getMongoOplogNamespace();
        boolean boolean24 = mongoDBRiverDefinition13.isDropCollection();
        docScoreSearchScript0.setNextVar("parent_types", (java.lang.Object) boolean24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj26 = docScoreSearchScript0.run();
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1059");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("localhost", "size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1060");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("socket_timeout.socket_timeout", "include_collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1061");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("ssl_verify_certificate.ssl_verify_certificate", "bulk_size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1062");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder1.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder3.mongoGridFS(true);
        java.lang.String[] strArray16 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder5.includeFields((java.util.Set<java.lang.String>) strSet17);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder20.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder24.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.indexName("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder28.statisticsTypeName("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder33.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder33.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder33.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder40.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder42.mongoGridFS(true);
        java.lang.String[] strArray55 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet56 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet56, strArray55);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = builder44.includeFields((java.util.Set<java.lang.String>) strSet56);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = builder39.excludeFields((java.util.Set<java.lang.String>) strSet56);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder32.excludeFields((java.util.Set<java.lang.String>) strSet56);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = builder5.parentTypes((java.util.Set<java.lang.String>) strSet56);
        java.lang.Object obj62 = docScoreSearchScript0.unwrap((java.lang.Object) builder5);
        docScoreSearchScript0.setNextScore((float) 100L);
        docScoreSearchScript0.setNextScore((float) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder67 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder69 = builder67.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder71 = builder69.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition72 = builder69.build();
        java.lang.String str73 = mongoDBRiverDefinition72.getIncludeCollection();
        boolean boolean74 = mongoDBRiverDefinition72.isMongoSSLVerifyCertificate();
        java.lang.String str75 = mongoDBRiverDefinition72.getIndexName();
        java.lang.String str76 = mongoDBRiverDefinition72.getMongoDb();
        java.lang.String str77 = mongoDBRiverDefinition72.getMongoAdminPassword();
        boolean boolean78 = mongoDBRiverDefinition72.isSkipInitialImport();
        java.util.List<com.mongodb.ServerAddress> serverAddressList79 = mongoDBRiverDefinition72.getMongoServers();
        boolean boolean80 = mongoDBRiverDefinition72.isMongoUseSSL();
        boolean boolean81 = mongoDBRiverDefinition72.isMongoUseSSL();
        java.lang.Object obj82 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition72);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(0);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1063");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) "bulk_timeout");
        docScoreSearchScript0.setNextScore((float) (byte) -1);
        docScoreSearchScript0.setNextScore((float) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.mongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.mongoSSLVerifyCertificate(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder14.importAllCollections(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder14.mongoLocalPassword("exclude_fields");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder14.scriptType("secondary_read_preference");
        java.lang.Object obj23 = docScoreSearchScript0.unwrap((java.lang.Object) builder14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (byte) 100);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1064");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("socket_timeout.socket_timeout", "parent_types");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1065");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("collection", "concurrent_bulk_requests");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1066");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("exclude_fields", "local");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1067");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) "bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = builder6.build();
        java.lang.String str10 = mongoDBRiverDefinition9.getIncludeCollection();
        boolean boolean11 = mongoDBRiverDefinition9.isMongoSSLVerifyCertificate();
        java.lang.String str12 = mongoDBRiverDefinition9.getIndexName();
        java.lang.Object obj13 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition9);
        docScoreSearchScript0.setNextScore((float) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.mongoGridFS(true);
        java.lang.String[] strArray31 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder20.includeFields((java.util.Set<java.lang.String>) strSet32);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.socketTimeout((int) (byte) 10);
        java.lang.Object obj37 = docScoreSearchScript0.unwrap((java.lang.Object) (byte) 10);
        docScoreSearchScript0.setNextScore((float) 100);
        docScoreSearchScript0.setNextScore(1.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder42.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder44.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition47 = builder44.build();
        java.lang.String str48 = mongoDBRiverDefinition47.getRiverIndexName();
        boolean boolean49 = mongoDBRiverDefinition47.isDisableIndexRefresh();
        boolean boolean50 = mongoDBRiverDefinition47.isStoreStatistics();
        java.lang.String str51 = mongoDBRiverDefinition47.getMongoLocalPassword();
        java.lang.String str52 = mongoDBRiverDefinition47.getScriptType();
        java.util.List<com.mongodb.ServerAddress> serverAddressList53 = mongoDBRiverDefinition47.getMongoServers();
        java.lang.Object obj54 = docScoreSearchScript0.unwrap((java.lang.Object) serverAddressList53);
        docScoreSearchScript0.setNextScore((float) 1000);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj57 = docScoreSearchScript0.run();
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1068");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("servers", "size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1069");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) "bulk_timeout");
        docScoreSearchScript0.setNextScore((float) (byte) -1);
        docScoreSearchScript0.setNextScore((float) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = builder10.build();
        java.lang.String str14 = mongoDBRiverDefinition13.getRiverIndexName();
        boolean boolean15 = mongoDBRiverDefinition13.isDisableIndexRefresh();
        boolean boolean16 = mongoDBRiverDefinition13.isDropCollection();
        boolean boolean17 = mongoDBRiverDefinition13.isDropCollection();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp18 = mongoDBRiverDefinition13.getInitialTimestamp();
        boolean boolean19 = mongoDBRiverDefinition13.isAdvancedTransformation();
        boolean boolean20 = mongoDBRiverDefinition13.isDropCollection();
        java.lang.Object obj21 = docScoreSearchScript0.unwrap((java.lang.Object) boolean20);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder22.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder24.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.mongoLocalUser("bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder28.statisticsIndexName("port");
        java.lang.Object obj33 = docScoreSearchScript0.unwrap((java.lang.Object) "port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder34.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder38.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder40.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder42.includeCollection("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder42.mongoLocalPassword("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder46.script("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder46.mongoSecondaryReadPreference(true);
        java.lang.Object obj51 = docScoreSearchScript0.unwrap((java.lang.Object) builder50);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder53.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder55.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition58 = builder55.build();
        java.lang.String str59 = mongoDBRiverDefinition58.getRiverIndexName();
        boolean boolean60 = mongoDBRiverDefinition58.isDisableIndexRefresh();
        boolean boolean61 = mongoDBRiverDefinition58.isStoreStatistics();
        java.lang.String str62 = mongoDBRiverDefinition58.getMongoLocalPassword();
        java.lang.String str63 = mongoDBRiverDefinition58.getScriptType();
        boolean boolean64 = mongoDBRiverDefinition58.isMongoGridFS();
        docScoreSearchScript0.setNextVar("servers", (java.lang.Object) mongoDBRiverDefinition58);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long66 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1070");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 10.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = builder6.build();
        java.lang.String str10 = mongoDBRiverDefinition9.getIncludeCollection();
        boolean boolean11 = mongoDBRiverDefinition9.isMongoSSLVerifyCertificate();
        java.lang.String str12 = mongoDBRiverDefinition9.getIndexName();
        java.lang.String str13 = mongoDBRiverDefinition9.getMongoAdminUser();
        int int14 = mongoDBRiverDefinition9.getThrottleSize();
        docScoreSearchScript0.setNextVar("parent_types", (java.lang.Object) int14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (byte) 1);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1071");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk", "options");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1072");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("disable_index_refresh", "user");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1073");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("ssl_verify_certificate", "script_type");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1074");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("type", "drop_collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1075");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("null.", "bulk_size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1076");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) "bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = builder6.build();
        java.lang.String str10 = mongoDBRiverDefinition9.getIncludeCollection();
        boolean boolean11 = mongoDBRiverDefinition9.isMongoSSLVerifyCertificate();
        java.lang.String str12 = mongoDBRiverDefinition9.getIndexName();
        java.lang.Object obj13 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition9);
        docScoreSearchScript0.setNextScore((float) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition22 = builder19.build();
        java.lang.String str23 = mongoDBRiverDefinition22.getIncludeCollection();
        boolean boolean24 = mongoDBRiverDefinition22.isMongoSSLVerifyCertificate();
        java.lang.String str25 = mongoDBRiverDefinition22.getIndexName();
        java.lang.String str26 = mongoDBRiverDefinition22.getMongoDb();
        boolean boolean27 = mongoDBRiverDefinition22.isDisableIndexRefresh();
        java.lang.String str28 = mongoDBRiverDefinition22.getIndexName();
        java.lang.String str29 = mongoDBRiverDefinition22.getMongoLocalUser();
        java.lang.String str30 = mongoDBRiverDefinition22.getRiverIndexName();
        com.mongodb.BasicDBObject basicDBObject31 = mongoDBRiverDefinition22.getMongoOplogFilter();
        java.lang.String str32 = mongoDBRiverDefinition22.getMongoLocalUser();
        docScoreSearchScript0.setNextVar("concurrent_requests", (java.lang.Object) mongoDBRiverDefinition22);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder36.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition39 = builder36.build();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder36.riverName("store_statistics");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder36.riverIndexName("throttle_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder43.mongoLocalUser("advanced_transformation");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder45.mongoCollection("password");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder47.dropCollection(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder47.riverIndexName("port");
        java.lang.Object obj52 = docScoreSearchScript0.unwrap((java.lang.Object) builder51);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (short) 100);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1077");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder3.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.indexName("bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.mongoCollection("actions");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder11.throttleSize((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.mongoCollection("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.mongoGridFS(true);
        java.lang.Object obj22 = docScoreSearchScript0.unwrap((java.lang.Object) builder21);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder24.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition29 = builder26.build();
        java.lang.String str30 = mongoDBRiverDefinition29.getIncludeCollection();
        boolean boolean31 = mongoDBRiverDefinition29.isMongoSSLVerifyCertificate();
        java.lang.String str32 = mongoDBRiverDefinition29.getIndexName();
        java.lang.String str33 = mongoDBRiverDefinition29.getMongoDb();
        com.mongodb.BasicDBObject basicDBObject34 = mongoDBRiverDefinition29.getMongoOplogFilter();
        java.lang.String str35 = mongoDBRiverDefinition29.getMongoCollection();
        int int36 = mongoDBRiverDefinition29.getConnectTimeout();
        java.util.Set<java.lang.String> strSet37 = mongoDBRiverDefinition29.getExcludeFields();
        boolean boolean38 = mongoDBRiverDefinition29.isMongoGridFS();
        boolean boolean39 = mongoDBRiverDefinition29.isAdvancedTransformation();
        docScoreSearchScript0.setNextVar("bulk_timeout.bulk_timeout", (java.lang.Object) boolean39);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder41.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder41.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder45.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder47.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder49.indexName("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder51.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder51.mongoLocalPassword("local");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = builder56.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder58.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition61 = builder58.build();
        java.lang.String str62 = mongoDBRiverDefinition61.getRiverIndexName();
        boolean boolean63 = mongoDBRiverDefinition61.isDisableIndexRefresh();
        boolean boolean64 = mongoDBRiverDefinition61.isStoreStatistics();
        java.lang.String str65 = mongoDBRiverDefinition61.getMongoAdminUser();
        java.lang.String str66 = mongoDBRiverDefinition61.getScript();
        java.lang.String str67 = mongoDBRiverDefinition61.getScriptType();
        int int68 = mongoDBRiverDefinition61.getConnectTimeout();
        com.mongodb.BasicDBObject basicDBObject69 = mongoDBRiverDefinition61.getMongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder70 = builder51.mongoOplogFilter(basicDBObject69);
        java.lang.Object obj71 = docScoreSearchScript0.unwrap((java.lang.Object) builder51);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder73 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder75 = builder73.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder77 = builder75.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition78 = builder75.build();
        java.lang.String str79 = mongoDBRiverDefinition78.getIncludeCollection();
        java.lang.String str80 = mongoDBRiverDefinition78.getMongoAdminPassword();
        java.lang.String str81 = mongoDBRiverDefinition78.getMongoDb();
        int int82 = mongoDBRiverDefinition78.getSocketTimeout();
        boolean boolean83 = mongoDBRiverDefinition78.isMongoSecondaryReadPreference();
        java.lang.String str84 = mongoDBRiverDefinition78.getScript();
        java.lang.String str85 = mongoDBRiverDefinition78.getMongoCollection();
        java.lang.String str86 = mongoDBRiverDefinition78.getRiverName();
        java.lang.String str87 = mongoDBRiverDefinition78.getStatisticsIndexName();
        java.lang.String str88 = mongoDBRiverDefinition78.getMongoOplogNamespace();
        boolean boolean89 = mongoDBRiverDefinition78.isStoreStatistics();
        java.lang.String str90 = mongoDBRiverDefinition78.getScript();
        boolean boolean91 = mongoDBRiverDefinition78.isDisableIndexRefresh();
        docScoreSearchScript0.setNextVar("exclude_fields", (java.lang.Object) boolean91);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double93 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1078");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("socket_timeout.socket_timeout", "disable_index_refresh.disable_index_refresh");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1079");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) "bulk_timeout");
        docScoreSearchScript0.setNextScore((float) (byte) -1);
        docScoreSearchScript0.setNextScore((float) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = builder10.build();
        java.lang.String str14 = mongoDBRiverDefinition13.getRiverIndexName();
        boolean boolean15 = mongoDBRiverDefinition13.isDisableIndexRefresh();
        boolean boolean16 = mongoDBRiverDefinition13.isDropCollection();
        boolean boolean17 = mongoDBRiverDefinition13.isDropCollection();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp18 = mongoDBRiverDefinition13.getInitialTimestamp();
        boolean boolean19 = mongoDBRiverDefinition13.isAdvancedTransformation();
        boolean boolean20 = mongoDBRiverDefinition13.isDropCollection();
        java.lang.Object obj21 = docScoreSearchScript0.unwrap((java.lang.Object) boolean20);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder22.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder24.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.mongoLocalUser("bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder28.statisticsIndexName("port");
        java.lang.Object obj33 = docScoreSearchScript0.unwrap((java.lang.Object) "port");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double34 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1080");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_timeout.bulk_timeout", "socket_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1081");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) "bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = builder6.build();
        java.lang.String str10 = mongoDBRiverDefinition9.getIncludeCollection();
        boolean boolean11 = mongoDBRiverDefinition9.isMongoSSLVerifyCertificate();
        java.lang.String str12 = mongoDBRiverDefinition9.getIndexName();
        java.lang.Object obj13 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder14.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder22.indexName("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder22.statisticsTypeName("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder27.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder27.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder36.mongoGridFS(true);
        java.lang.String[] strArray49 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet50 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet50, strArray49);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder38.includeFields((java.util.Set<java.lang.String>) strSet50);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder33.excludeFields((java.util.Set<java.lang.String>) strSet50);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder26.excludeFields((java.util.Set<java.lang.String>) strSet50);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder54.connectTimeout(8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = builder56.socketTimeout((int) (short) 0);
        java.lang.Object obj59 = docScoreSearchScript0.unwrap((java.lang.Object) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) '4');
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1082");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "exclude_fields");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1083");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) "bulk_timeout");
        docScoreSearchScript0.setNextScore((float) 27017);
        docScoreSearchScript0.setNextScore((float) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(10);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1084");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder1.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder3.mongoGridFS(true);
        java.lang.String[] strArray16 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder5.includeFields((java.util.Set<java.lang.String>) strSet17);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder20.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder24.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.indexName("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder28.statisticsTypeName("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder33.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder33.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder33.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder40.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder42.mongoGridFS(true);
        java.lang.String[] strArray55 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet56 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet56, strArray55);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = builder44.includeFields((java.util.Set<java.lang.String>) strSet56);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = builder39.excludeFields((java.util.Set<java.lang.String>) strSet56);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder32.excludeFields((java.util.Set<java.lang.String>) strSet56);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = builder5.parentTypes((java.util.Set<java.lang.String>) strSet56);
        java.lang.Object obj62 = docScoreSearchScript0.unwrap((java.lang.Object) builder5);
        docScoreSearchScript0.setNextScore((float) 100L);
        docScoreSearchScript0.setNextScore((float) 10);
        docScoreSearchScript0.setNextScore((float) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder70 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder72 = builder70.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder74 = builder70.includeCollection("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder76 = builder74.mongoDb("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder78 = builder76.socketTimeout((int) (byte) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder80 = builder76.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder82 = builder76.scriptType("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder84 = builder76.mongoGridFS(false);
        docScoreSearchScript0.setNextVar("filter", (java.lang.Object) builder76);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) 'a');
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1085");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("skip_initial_import", "include_fields");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1086");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("store_statistics", "import_all_collections");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1087");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "");
        docScoreSearchScript0.setNextScore((float) (-1L));
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder5.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder13.includeCollection("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder13.mongoLocalPassword("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder13.mongoAdminUser("db");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder13.mongoDb("db");
        java.lang.Object obj22 = docScoreSearchScript0.unwrap((java.lang.Object) builder13);
        docScoreSearchScript0.setNextScore((float) (byte) 100);
        docScoreSearchScript0.setNextScore((float) 10L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder29.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder29.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder34.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder38.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder40.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder42.indexName("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder42.statisticsTypeName("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder47.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder47.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder47.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder54.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = builder56.mongoGridFS(true);
        java.lang.String[] strArray69 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet70 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet70, strArray69);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder72 = builder58.includeFields((java.util.Set<java.lang.String>) strSet70);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder73 = builder53.excludeFields((java.util.Set<java.lang.String>) strSet70);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder74 = builder46.excludeFields((java.util.Set<java.lang.String>) strSet70);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder75 = builder33.excludeFields((java.util.Set<java.lang.String>) strSet70);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder77 = builder33.connectTimeout((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder79 = builder77.mongoAdminPassword("script_type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder81 = builder79.indexName("options");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder83 = builder79.mongoSecondaryReadPreference(false);
        java.lang.Object obj84 = docScoreSearchScript0.unwrap((java.lang.Object) builder79);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float85 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1088");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder3.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.indexName("bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.mongoCollection("actions");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder11.throttleSize((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.mongoCollection("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.mongoGridFS(true);
        java.lang.Object obj22 = docScoreSearchScript0.unwrap((java.lang.Object) builder21);
        docScoreSearchScript0.setNextScore((float) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (short) -1);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1089");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("store_statistics", "drop_collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1090");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "");
        docScoreSearchScript0.setNextScore((float) (-1));
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript5 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript5.setNextVar("db", (java.lang.Object) "bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition14 = builder11.build();
        java.lang.String str15 = mongoDBRiverDefinition14.getIncludeCollection();
        boolean boolean16 = mongoDBRiverDefinition14.isMongoSSLVerifyCertificate();
        java.lang.String str17 = mongoDBRiverDefinition14.getIndexName();
        java.lang.Object obj18 = docScoreSearchScript5.unwrap((java.lang.Object) mongoDBRiverDefinition14);
        docScoreSearchScript5.setNextScore((float) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder22.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder24.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition27 = builder24.build();
        java.lang.String str28 = mongoDBRiverDefinition27.getIncludeCollection();
        boolean boolean29 = mongoDBRiverDefinition27.isMongoSSLVerifyCertificate();
        java.lang.String str30 = mongoDBRiverDefinition27.getIndexName();
        java.lang.String str31 = mongoDBRiverDefinition27.getMongoDb();
        boolean boolean32 = mongoDBRiverDefinition27.isDisableIndexRefresh();
        java.lang.String str33 = mongoDBRiverDefinition27.getIndexName();
        java.lang.String str34 = mongoDBRiverDefinition27.getMongoLocalUser();
        java.lang.String str35 = mongoDBRiverDefinition27.getRiverIndexName();
        com.mongodb.BasicDBObject basicDBObject36 = mongoDBRiverDefinition27.getMongoOplogFilter();
        java.lang.String str37 = mongoDBRiverDefinition27.getMongoLocalUser();
        docScoreSearchScript5.setNextVar("concurrent_requests", (java.lang.Object) mongoDBRiverDefinition27);
        boolean boolean39 = mongoDBRiverDefinition27.isAdvancedTransformation();
        boolean boolean40 = mongoDBRiverDefinition27.isAdvancedTransformation();
        java.lang.String str41 = mongoDBRiverDefinition27.getMongoAdminPassword();
        java.lang.Object obj42 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float43 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1091");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "");
        docScoreSearchScript0.setNextScore((float) (-1L));
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder5.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder13.includeCollection("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder13.mongoLocalPassword("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder13.mongoAdminUser("db");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder13.mongoDb("db");
        java.lang.Object obj22 = docScoreSearchScript0.unwrap((java.lang.Object) builder13);
        docScoreSearchScript0.setNextScore((float) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition31 = builder28.build();
        java.lang.String str32 = mongoDBRiverDefinition31.getIncludeCollection();
        boolean boolean33 = mongoDBRiverDefinition31.isMongoSSLVerifyCertificate();
        java.lang.String str34 = mongoDBRiverDefinition31.getIndexName();
        java.lang.String str35 = mongoDBRiverDefinition31.getMongoDb();
        boolean boolean36 = mongoDBRiverDefinition31.isDisableIndexRefresh();
        java.lang.String str37 = mongoDBRiverDefinition31.getIndexName();
        java.lang.String str38 = mongoDBRiverDefinition31.getIncludeCollection();
        boolean boolean39 = mongoDBRiverDefinition31.isDropCollection();
        java.lang.String str40 = mongoDBRiverDefinition31.getTypeName();
        java.lang.String str41 = mongoDBRiverDefinition31.getMongoOplogNamespace();
        java.util.List<com.mongodb.ServerAddress> serverAddressList42 = mongoDBRiverDefinition31.getMongoServers();
        boolean boolean43 = mongoDBRiverDefinition31.isMongoGridFS();
        boolean boolean44 = mongoDBRiverDefinition31.isMongoSSLVerifyCertificate();
        java.lang.String str45 = mongoDBRiverDefinition31.getMongoAdminPassword();
        docScoreSearchScript0.setNextVar("hi!", (java.lang.Object) str45);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) ' ');
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1092");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_size", "socket_timeout.socket_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1093");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script_type", "password");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1094");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder3.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.indexName("bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.mongoCollection("actions");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder11.throttleSize((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.mongoCollection("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.mongoGridFS(true);
        java.lang.Object obj22 = docScoreSearchScript0.unwrap((java.lang.Object) builder21);
        docScoreSearchScript0.setNextScore((float) (byte) -1);
        docScoreSearchScript0.setNextScore((float) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double27 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1095");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("name", "include_collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1096");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) "bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = builder6.build();
        java.lang.String str10 = mongoDBRiverDefinition9.getIncludeCollection();
        boolean boolean11 = mongoDBRiverDefinition9.isMongoSSLVerifyCertificate();
        java.lang.String str12 = mongoDBRiverDefinition9.getIndexName();
        java.lang.Object obj13 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder14.includeCollection("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.mongoDb("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.statisticsIndexName("password");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder22.includeCollection("null.");
        java.lang.Object obj25 = docScoreSearchScript0.unwrap((java.lang.Object) "null.");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder29.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition32 = builder29.build();
        java.lang.String str33 = mongoDBRiverDefinition32.getIncludeCollection();
        boolean boolean34 = mongoDBRiverDefinition32.isMongoSSLVerifyCertificate();
        java.lang.String str35 = mongoDBRiverDefinition32.getIndexName();
        java.lang.String str36 = mongoDBRiverDefinition32.getMongoDb();
        com.mongodb.BasicDBObject basicDBObject37 = mongoDBRiverDefinition32.getMongoOplogFilter();
        java.util.List<com.mongodb.ServerAddress> serverAddressList38 = mongoDBRiverDefinition32.getMongoServers();
        java.lang.String str39 = mongoDBRiverDefinition32.getMongoDb();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp40 = mongoDBRiverDefinition32.getInitialTimestamp();
        boolean boolean41 = mongoDBRiverDefinition32.isMongoSecondaryReadPreference();
        docScoreSearchScript0.setNextVar("concurrent_requests", (java.lang.Object) mongoDBRiverDefinition32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float43 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1097");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("port", "socket_timeout.socket_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1098");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("options", "options");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1099");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("skip_initial_import.skip_initial_import", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1100");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("parent_types", "hi!");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1101");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) "bulk_timeout");
        docScoreSearchScript0.setNextScore((float) (byte) -1);
        docScoreSearchScript0.setNextScore((float) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder8.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder8.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.mongoGridFS(true);
        java.lang.String[] strArray30 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder19.includeFields((java.util.Set<java.lang.String>) strSet31);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder14.excludeFields((java.util.Set<java.lang.String>) strSet31);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder14.storeStatistics(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder14.throttleSize(0);
        com.mongodb.ServerAddress[] serverAddressArray39 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList40 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList40, serverAddressArray39);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder38.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList40);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder43.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder45.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder45.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder50.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder50.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder54.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = builder56.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder58.indexName("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = builder58.statisticsTypeName("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder65 = builder63.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder67 = builder63.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder69 = builder63.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder70 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder72 = builder70.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder74 = builder72.mongoGridFS(true);
        java.lang.String[] strArray85 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet86 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet86, strArray85);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder88 = builder74.includeFields((java.util.Set<java.lang.String>) strSet86);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder89 = builder69.excludeFields((java.util.Set<java.lang.String>) strSet86);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder90 = builder62.excludeFields((java.util.Set<java.lang.String>) strSet86);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder91 = builder49.excludeFields((java.util.Set<java.lang.String>) strSet86);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder92 = builder38.parentTypes((java.util.Set<java.lang.String>) strSet86);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder94 = builder92.importAllCollections(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder96 = builder94.mongoSSLVerifyCertificate(false);
        java.lang.Object obj97 = docScoreSearchScript0.unwrap((java.lang.Object) builder94);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double98 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1102");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("db", "include_collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1103");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "null.");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1104");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("name", "localhost");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1105");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("ssl", "ssl_verify_certificate.ssl_verify_certificate");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1106");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("size", "credentials");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1107");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("flush_interval", "filter");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1108");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "disable_index_refresh");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1109");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) "bulk_timeout");
        docScoreSearchScript0.setNextScore((float) (byte) -1);
        docScoreSearchScript0.setNextScore((float) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = builder10.build();
        boolean boolean14 = mongoDBRiverDefinition13.isDisableIndexRefresh();
        boolean boolean15 = mongoDBRiverDefinition13.isDisableIndexRefresh();
        boolean boolean16 = mongoDBRiverDefinition13.isMongoGridFS();
        java.lang.String str17 = mongoDBRiverDefinition13.getStatisticsIndexName();
        java.lang.String str18 = mongoDBRiverDefinition13.getIndexName();
        boolean boolean19 = mongoDBRiverDefinition13.isMongoSecondaryReadPreference();
        java.lang.Object obj20 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float21 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1110");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("flush_interval", "socket_timeout.socket_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1111");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("type", "name");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1112");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("host.filter", "disable_index_refresh");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1113");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 10.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder3.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder3.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder3.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder3.riverName("script_type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.importAllCollections(false);
        java.lang.Object obj14 = docScoreSearchScript0.unwrap((java.lang.Object) builder13);
        docScoreSearchScript0.setNextScore((float) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double17 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1114");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("advanced_transformation.advanced_transformation", "connect_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1115");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script_type", "host.filter");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1116");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("gridfs", "parent_types");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1117");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) "bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = builder6.build();
        java.lang.String str10 = mongoDBRiverDefinition9.getIncludeCollection();
        boolean boolean11 = mongoDBRiverDefinition9.isMongoSSLVerifyCertificate();
        java.lang.String str12 = mongoDBRiverDefinition9.getIndexName();
        java.lang.Object obj13 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition9);
        docScoreSearchScript0.setNextScore((float) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.mongoGridFS(true);
        java.lang.String[] strArray31 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder20.includeFields((java.util.Set<java.lang.String>) strSet32);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.socketTimeout((int) (byte) 10);
        java.lang.Object obj37 = docScoreSearchScript0.unwrap((java.lang.Object) (byte) 10);
        docScoreSearchScript0.setNextScore((float) 100);
        docScoreSearchScript0.setNextScore((float) '4');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder42.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder44.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition47 = builder44.build();
        java.lang.String str48 = mongoDBRiverDefinition47.getIncludeCollection();
        com.mongodb.MongoClientOptions mongoClientOptions49 = mongoDBRiverDefinition47.getMongoClientOptions();
        java.lang.String str50 = mongoDBRiverDefinition47.getStatisticsIndexName();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp51 = mongoDBRiverDefinition47.getInitialTimestamp();
        java.util.Set<java.lang.String> strSet52 = mongoDBRiverDefinition47.getIncludeFields();
        java.util.List<com.mongodb.ServerAddress> serverAddressList53 = mongoDBRiverDefinition47.getMongoServers();
        java.lang.Object obj54 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition47);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj55 = docScoreSearchScript0.run();
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1118");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "");
        docScoreSearchScript0.setNextScore((float) (-1L));
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder5.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder13.includeCollection("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder13.mongoLocalPassword("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder13.mongoAdminUser("db");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder13.mongoDb("db");
        java.lang.Object obj22 = docScoreSearchScript0.unwrap((java.lang.Object) builder13);
        docScoreSearchScript0.setNextScore((float) (byte) 100);
        docScoreSearchScript0.setNextScore((float) 10L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder28.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder28.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder35.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder37.mongoGridFS(true);
        java.lang.String[] strArray50 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet51 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet51, strArray50);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder39.includeFields((java.util.Set<java.lang.String>) strSet51);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder34.excludeFields((java.util.Set<java.lang.String>) strSet51);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder34.storeStatistics(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = builder56.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder58.riverName("include_fields");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = builder60.indexName("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder64 = builder60.includeCollection("collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder66 = builder60.includeCollection("actions");
        docScoreSearchScript0.setNextVar("connect_timeout", (java.lang.Object) "actions");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj68 = docScoreSearchScript0.run();
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1119");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("advanced_transformation.advanced_transformation", "size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1120");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("password", "gridfs");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1121");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("actions", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1122");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("gridfs", "actions");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1123");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) "bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = builder6.build();
        java.lang.String str10 = mongoDBRiverDefinition9.getIncludeCollection();
        boolean boolean11 = mongoDBRiverDefinition9.isMongoSSLVerifyCertificate();
        java.lang.String str12 = mongoDBRiverDefinition9.getIndexName();
        java.lang.Object obj13 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition9);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript14 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.mongoGridFS(true);
        java.lang.String[] strArray30 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder19.includeFields((java.util.Set<java.lang.String>) strSet31);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder34.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder38.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder40.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder42.indexName("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder42.statisticsTypeName("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder47.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder47.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder47.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder54.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = builder56.mongoGridFS(true);
        java.lang.String[] strArray69 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet70 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet70, strArray69);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder72 = builder58.includeFields((java.util.Set<java.lang.String>) strSet70);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder73 = builder53.excludeFields((java.util.Set<java.lang.String>) strSet70);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder74 = builder46.excludeFields((java.util.Set<java.lang.String>) strSet70);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder75 = builder19.parentTypes((java.util.Set<java.lang.String>) strSet70);
        java.lang.Object obj76 = docScoreSearchScript14.unwrap((java.lang.Object) builder19);
        java.lang.Object obj77 = docScoreSearchScript0.unwrap(obj76);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(0);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1124");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_size", "skip_initial_import");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1125");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("localhost", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1126");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("local", "include_collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1127");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("host.filter", "bulk_size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1128");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("db", "size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1129");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("options", "import_all_collections");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1130");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("socket_timeout.socket_timeout", "import_all_collections.import_all_collections");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1131");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_size", "advanced_transformation.advanced_transformation");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1132");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) "bulk_timeout");
        docScoreSearchScript0.setNextScore((float) (byte) -1);
        docScoreSearchScript0.setNextScore((float) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = builder10.build();
        java.lang.String str14 = mongoDBRiverDefinition13.getRiverIndexName();
        boolean boolean15 = mongoDBRiverDefinition13.isDisableIndexRefresh();
        boolean boolean16 = mongoDBRiverDefinition13.isDropCollection();
        boolean boolean17 = mongoDBRiverDefinition13.isDropCollection();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp18 = mongoDBRiverDefinition13.getInitialTimestamp();
        boolean boolean19 = mongoDBRiverDefinition13.isAdvancedTransformation();
        boolean boolean20 = mongoDBRiverDefinition13.isDropCollection();
        java.lang.Object obj21 = docScoreSearchScript0.unwrap((java.lang.Object) boolean20);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder22.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder24.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.mongoLocalUser("bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder28.statisticsIndexName("port");
        java.lang.Object obj33 = docScoreSearchScript0.unwrap((java.lang.Object) "port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder34.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder38.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder40.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder42.includeCollection("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder42.mongoLocalPassword("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder46.script("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder46.mongoSecondaryReadPreference(true);
        java.lang.Object obj51 = docScoreSearchScript0.unwrap((java.lang.Object) builder50);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder53.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder55.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition58 = builder55.build();
        java.lang.String str59 = mongoDBRiverDefinition58.getRiverIndexName();
        boolean boolean60 = mongoDBRiverDefinition58.isDisableIndexRefresh();
        boolean boolean61 = mongoDBRiverDefinition58.isStoreStatistics();
        java.lang.String str62 = mongoDBRiverDefinition58.getMongoLocalPassword();
        java.lang.String str63 = mongoDBRiverDefinition58.getScriptType();
        boolean boolean64 = mongoDBRiverDefinition58.isMongoGridFS();
        docScoreSearchScript0.setNextVar("servers", (java.lang.Object) mongoDBRiverDefinition58);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (short) 100);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1133");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("actions", "size.size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1134");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("ssl_verify_certificate", "localhost");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1135");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("user", "size.size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1136");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) "bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = builder6.build();
        java.lang.String str10 = mongoDBRiverDefinition9.getIncludeCollection();
        boolean boolean11 = mongoDBRiverDefinition9.isMongoSSLVerifyCertificate();
        java.lang.String str12 = mongoDBRiverDefinition9.getIndexName();
        java.lang.Object obj13 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder14.includeCollection("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.mongoDb("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.statisticsIndexName("password");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder22.includeCollection("null.");
        java.lang.Object obj25 = docScoreSearchScript0.unwrap((java.lang.Object) "null.");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder27.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder27.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder36.mongoGridFS(true);
        java.lang.String[] strArray49 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet50 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet50, strArray49);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder38.includeFields((java.util.Set<java.lang.String>) strSet50);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder33.excludeFields((java.util.Set<java.lang.String>) strSet50);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder33.storeStatistics(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder33.riverIndexName("actions");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = builder33.script("bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = builder33.mongoAdminPassword("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = builder61.riverIndexName("credentials");
        docScoreSearchScript0.setNextVar("collection", (java.lang.Object) "credentials");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj65 = docScoreSearchScript0.run();
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1137");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("store_statistics", "user");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1138");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_size", "connect_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1139");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder3.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.indexName("bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.mongoCollection("actions");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder11.throttleSize((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.mongoCollection("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.mongoGridFS(true);
        java.lang.Object obj22 = docScoreSearchScript0.unwrap((java.lang.Object) builder21);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder24.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition29 = builder26.build();
        java.lang.String str30 = mongoDBRiverDefinition29.getIncludeCollection();
        boolean boolean31 = mongoDBRiverDefinition29.isMongoSSLVerifyCertificate();
        java.lang.String str32 = mongoDBRiverDefinition29.getIndexName();
        java.lang.String str33 = mongoDBRiverDefinition29.getMongoDb();
        com.mongodb.BasicDBObject basicDBObject34 = mongoDBRiverDefinition29.getMongoOplogFilter();
        java.lang.String str35 = mongoDBRiverDefinition29.getMongoCollection();
        int int36 = mongoDBRiverDefinition29.getConnectTimeout();
        java.util.Set<java.lang.String> strSet37 = mongoDBRiverDefinition29.getExcludeFields();
        boolean boolean38 = mongoDBRiverDefinition29.isMongoGridFS();
        boolean boolean39 = mongoDBRiverDefinition29.isAdvancedTransformation();
        docScoreSearchScript0.setNextVar("bulk_timeout.bulk_timeout", (java.lang.Object) boolean39);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(8);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1140");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "");
        docScoreSearchScript0.setNextScore((float) (-1L));
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition10 = builder7.build();
        boolean boolean11 = mongoDBRiverDefinition10.isDisableIndexRefresh();
        boolean boolean12 = mongoDBRiverDefinition10.isDropCollection();
        java.lang.String str13 = mongoDBRiverDefinition10.getMongoAdminPassword();
        boolean boolean14 = mongoDBRiverDefinition10.isMongoSSLVerifyCertificate();
        java.lang.String str15 = mongoDBRiverDefinition10.getScript();
        java.lang.String str16 = mongoDBRiverDefinition10.getScript();
        java.util.List<com.mongodb.ServerAddress> serverAddressList17 = mongoDBRiverDefinition10.getMongoServers();
        java.util.List<com.mongodb.ServerAddress> serverAddressList18 = mongoDBRiverDefinition10.getMongoServers();
        java.util.Set<java.lang.String> strSet19 = mongoDBRiverDefinition10.getExcludeFields();
        com.mongodb.BasicDBObject basicDBObject20 = mongoDBRiverDefinition10.getMongoCollectionFilter();
        boolean boolean21 = mongoDBRiverDefinition10.isMongoSSLVerifyCertificate();
        java.lang.Object obj22 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj23 = docScoreSearchScript0.run();
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1141");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder3.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.statisticsIndexName("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.mongoAdminUser("gridfs");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.riverName("parent_types");
        java.lang.Object obj14 = docScoreSearchScript0.unwrap((java.lang.Object) builder11);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition21 = builder18.build();
        java.lang.String str22 = mongoDBRiverDefinition21.getIncludeCollection();
        boolean boolean23 = mongoDBRiverDefinition21.isMongoSSLVerifyCertificate();
        java.lang.String str24 = mongoDBRiverDefinition21.getIndexName();
        java.lang.String str25 = mongoDBRiverDefinition21.getMongoAdminUser();
        java.util.Set<java.lang.String> strSet26 = mongoDBRiverDefinition21.getParentTypes();
        boolean boolean27 = mongoDBRiverDefinition21.isMongoGridFS();
        docScoreSearchScript0.setNextVar("advanced_transformation", (java.lang.Object) boolean27);
        docScoreSearchScript0.setNextScore((float) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder31.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder33.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition36 = builder33.build();
        java.lang.String str37 = mongoDBRiverDefinition36.getIncludeCollection();
        java.lang.String str38 = mongoDBRiverDefinition36.getMongoAdminPassword();
        boolean boolean39 = mongoDBRiverDefinition36.isMongoSSLVerifyCertificate();
        java.lang.String str40 = mongoDBRiverDefinition36.getIncludeCollection();
        java.lang.Object obj41 = docScoreSearchScript0.unwrap((java.lang.Object) str40);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float42 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1142");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("size.size", "db");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1143");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("host", "db");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1144");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder3.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.statisticsIndexName("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.mongoAdminUser("gridfs");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.riverName("parent_types");
        java.lang.Object obj14 = docScoreSearchScript0.unwrap((java.lang.Object) builder11);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript15 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript15.setNextVar("db", (java.lang.Object) "bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition24 = builder21.build();
        java.lang.String str25 = mongoDBRiverDefinition24.getIncludeCollection();
        boolean boolean26 = mongoDBRiverDefinition24.isMongoSSLVerifyCertificate();
        java.lang.String str27 = mongoDBRiverDefinition24.getIndexName();
        java.lang.Object obj28 = docScoreSearchScript15.unwrap((java.lang.Object) mongoDBRiverDefinition24);
        boolean boolean29 = mongoDBRiverDefinition24.isStoreStatistics();
        boolean boolean30 = mongoDBRiverDefinition24.isDisableIndexRefresh();
        java.lang.Object obj31 = docScoreSearchScript0.unwrap((java.lang.Object) boolean30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (short) -1);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1145");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder3.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.indexName("bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.mongoCollection("actions");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder11.throttleSize((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.mongoCollection("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.mongoGridFS(true);
        java.lang.Object obj22 = docScoreSearchScript0.unwrap((java.lang.Object) builder21);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder24.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition29 = builder26.build();
        java.lang.String str30 = mongoDBRiverDefinition29.getIncludeCollection();
        boolean boolean31 = mongoDBRiverDefinition29.isMongoSSLVerifyCertificate();
        java.lang.String str32 = mongoDBRiverDefinition29.getIndexName();
        java.lang.String str33 = mongoDBRiverDefinition29.getMongoDb();
        com.mongodb.BasicDBObject basicDBObject34 = mongoDBRiverDefinition29.getMongoOplogFilter();
        java.lang.String str35 = mongoDBRiverDefinition29.getMongoCollection();
        int int36 = mongoDBRiverDefinition29.getConnectTimeout();
        java.util.Set<java.lang.String> strSet37 = mongoDBRiverDefinition29.getExcludeFields();
        boolean boolean38 = mongoDBRiverDefinition29.isMongoGridFS();
        boolean boolean39 = mongoDBRiverDefinition29.isAdvancedTransformation();
        docScoreSearchScript0.setNextVar("bulk_timeout.bulk_timeout", (java.lang.Object) boolean39);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj41 = docScoreSearchScript0.run();
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1146");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) "bulk_timeout");
        docScoreSearchScript0.setNextScore((float) (byte) -1);
        docScoreSearchScript0.setNextScore((float) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = builder10.build();
        java.lang.String str14 = mongoDBRiverDefinition13.getRiverIndexName();
        boolean boolean15 = mongoDBRiverDefinition13.isDisableIndexRefresh();
        boolean boolean16 = mongoDBRiverDefinition13.isDropCollection();
        boolean boolean17 = mongoDBRiverDefinition13.isDropCollection();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp18 = mongoDBRiverDefinition13.getInitialTimestamp();
        boolean boolean19 = mongoDBRiverDefinition13.isAdvancedTransformation();
        boolean boolean20 = mongoDBRiverDefinition13.isDropCollection();
        java.lang.Object obj21 = docScoreSearchScript0.unwrap((java.lang.Object) boolean20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) '4');
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1147");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("disable_index_refresh", "disable_index_refresh.disable_index_refresh");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1148");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("ssl_verify_certificate", "parent_types");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1149");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("size.size", "gridfs");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1150");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("disable_index_refresh.disable_index_refresh", "bulk");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1151");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("local", "options");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1152");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("user", "options");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1153");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("advanced_transformation.advanced_transformation", "import_all_collections.import_all_collections");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1154");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("import_all_collections.import_all_collections", "ssl");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1155");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("import_all_collections.import_all_collections", "bulk_timeout.bulk_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1156");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk", "import_all_collections");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1157");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("credentials", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1158");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) "bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = builder6.build();
        java.lang.String str10 = mongoDBRiverDefinition9.getIncludeCollection();
        boolean boolean11 = mongoDBRiverDefinition9.isMongoSSLVerifyCertificate();
        java.lang.String str12 = mongoDBRiverDefinition9.getIndexName();
        java.lang.Object obj13 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition9);
        docScoreSearchScript0.setNextScore((float) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float16 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1159");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("options", "collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1160");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("concurrent_requests", "size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1161");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("store_statistics", "initial_timestamp");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1162");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder3.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.indexName("bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.mongoCollection("actions");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder11.throttleSize((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.mongoCollection("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.mongoGridFS(true);
        java.lang.Object obj22 = docScoreSearchScript0.unwrap((java.lang.Object) builder21);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder24.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition29 = builder26.build();
        java.lang.String str30 = mongoDBRiverDefinition29.getIncludeCollection();
        boolean boolean31 = mongoDBRiverDefinition29.isMongoSSLVerifyCertificate();
        java.lang.String str32 = mongoDBRiverDefinition29.getIndexName();
        java.lang.String str33 = mongoDBRiverDefinition29.getMongoDb();
        com.mongodb.BasicDBObject basicDBObject34 = mongoDBRiverDefinition29.getMongoOplogFilter();
        java.lang.String str35 = mongoDBRiverDefinition29.getMongoCollection();
        int int36 = mongoDBRiverDefinition29.getConnectTimeout();
        java.util.Set<java.lang.String> strSet37 = mongoDBRiverDefinition29.getExcludeFields();
        boolean boolean38 = mongoDBRiverDefinition29.isMongoGridFS();
        boolean boolean39 = mongoDBRiverDefinition29.isAdvancedTransformation();
        docScoreSearchScript0.setNextVar("bulk_timeout.bulk_timeout", (java.lang.Object) boolean39);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder42.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder44.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition47 = builder44.build();
        java.lang.String str48 = mongoDBRiverDefinition47.getIncludeCollection();
        com.mongodb.MongoClientOptions mongoClientOptions49 = mongoDBRiverDefinition47.getMongoClientOptions();
        boolean boolean50 = mongoDBRiverDefinition47.isDropCollection();
        java.lang.String str51 = mongoDBRiverDefinition47.getStatisticsIndexName();
        java.util.Set<java.lang.String> strSet52 = mongoDBRiverDefinition47.getExcludeFields();
        boolean boolean53 = mongoDBRiverDefinition47.isMongoSecondaryReadPreference();
        java.lang.String str54 = mongoDBRiverDefinition47.getMongoAdminPassword();
        docScoreSearchScript0.setNextVar("include_collection", (java.lang.Object) str54);
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long58 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1163");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("ssl", "import_all_collections");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1164");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("ssl_verify_certificate", "socket_timeout.socket_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1165");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder1.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder3.mongoGridFS(true);
        java.lang.String[] strArray16 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder5.includeFields((java.util.Set<java.lang.String>) strSet17);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder20.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder24.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.indexName("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder28.statisticsTypeName("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder33.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder33.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder33.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder40.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder42.mongoGridFS(true);
        java.lang.String[] strArray55 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet56 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet56, strArray55);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = builder44.includeFields((java.util.Set<java.lang.String>) strSet56);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = builder39.excludeFields((java.util.Set<java.lang.String>) strSet56);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder32.excludeFields((java.util.Set<java.lang.String>) strSet56);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = builder5.parentTypes((java.util.Set<java.lang.String>) strSet56);
        java.lang.Object obj62 = docScoreSearchScript0.unwrap((java.lang.Object) builder5);
        docScoreSearchScript0.setNextScore((float) 100L);
        docScoreSearchScript0.setNextScore((float) (byte) -1);
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(1000);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1166");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder3.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.indexName("bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.mongoCollection("actions");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder11.throttleSize((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.mongoCollection("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.mongoGridFS(true);
        java.lang.Object obj22 = docScoreSearchScript0.unwrap((java.lang.Object) builder21);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder24.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition29 = builder26.build();
        java.lang.String str30 = mongoDBRiverDefinition29.getIncludeCollection();
        boolean boolean31 = mongoDBRiverDefinition29.isMongoSSLVerifyCertificate();
        java.lang.String str32 = mongoDBRiverDefinition29.getIndexName();
        java.lang.String str33 = mongoDBRiverDefinition29.getMongoDb();
        com.mongodb.BasicDBObject basicDBObject34 = mongoDBRiverDefinition29.getMongoOplogFilter();
        java.lang.String str35 = mongoDBRiverDefinition29.getMongoCollection();
        int int36 = mongoDBRiverDefinition29.getConnectTimeout();
        java.util.Set<java.lang.String> strSet37 = mongoDBRiverDefinition29.getExcludeFields();
        boolean boolean38 = mongoDBRiverDefinition29.isMongoGridFS();
        boolean boolean39 = mongoDBRiverDefinition29.isAdvancedTransformation();
        docScoreSearchScript0.setNextVar("bulk_timeout.bulk_timeout", (java.lang.Object) boolean39);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder41.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder41.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder45.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder47.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder49.indexName("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder51.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder51.mongoLocalPassword("local");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = builder56.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder58.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition61 = builder58.build();
        java.lang.String str62 = mongoDBRiverDefinition61.getRiverIndexName();
        boolean boolean63 = mongoDBRiverDefinition61.isDisableIndexRefresh();
        boolean boolean64 = mongoDBRiverDefinition61.isStoreStatistics();
        java.lang.String str65 = mongoDBRiverDefinition61.getMongoAdminUser();
        java.lang.String str66 = mongoDBRiverDefinition61.getScript();
        java.lang.String str67 = mongoDBRiverDefinition61.getScriptType();
        int int68 = mongoDBRiverDefinition61.getConnectTimeout();
        com.mongodb.BasicDBObject basicDBObject69 = mongoDBRiverDefinition61.getMongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder70 = builder51.mongoOplogFilter(basicDBObject69);
        java.lang.Object obj71 = docScoreSearchScript0.unwrap((java.lang.Object) builder51);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj72 = docScoreSearchScript0.run();
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1167");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) "bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = builder6.build();
        java.lang.String str10 = mongoDBRiverDefinition9.getIncludeCollection();
        boolean boolean11 = mongoDBRiverDefinition9.isMongoSSLVerifyCertificate();
        java.lang.String str12 = mongoDBRiverDefinition9.getIndexName();
        java.lang.Object obj13 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition9);
        docScoreSearchScript0.setNextScore((float) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.mongoGridFS(true);
        java.lang.String[] strArray31 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder20.includeFields((java.util.Set<java.lang.String>) strSet32);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.socketTimeout((int) (byte) 10);
        java.lang.Object obj37 = docScoreSearchScript0.unwrap((java.lang.Object) (byte) 10);
        docScoreSearchScript0.setNextScore((float) 100);
        docScoreSearchScript0.setNextScore(1.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(100);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1168");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) "bulk_timeout");
        docScoreSearchScript0.setNextScore((float) 27017);
        docScoreSearchScript0.setNextScore((float) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double8 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1169");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("user", "gridfs");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1170");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 10.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder3.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder3.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder3.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder3.riverName("script_type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.importAllCollections(false);
        java.lang.Object obj14 = docScoreSearchScript0.unwrap((java.lang.Object) builder13);
        docScoreSearchScript0.setNextScore((float) (short) 100);
        docScoreSearchScript0.setNextScore((float) 1L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.mongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder23.mongoSSLVerifyCertificate(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition28 = builder27.build();
        boolean boolean29 = mongoDBRiverDefinition28.isDropCollection();
        java.lang.String str30 = mongoDBRiverDefinition28.getMongoLocalUser();
        java.lang.Object obj31 = docScoreSearchScript0.unwrap((java.lang.Object) str30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float32 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1171");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("port", "bulk_timeout.bulk_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1172");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("import_all_collections", "hi!");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1173");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("collection", "exclude_fields");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1174");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) "bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = builder6.build();
        java.lang.String str10 = mongoDBRiverDefinition9.getIncludeCollection();
        boolean boolean11 = mongoDBRiverDefinition9.isMongoSSLVerifyCertificate();
        java.lang.String str12 = mongoDBRiverDefinition9.getIndexName();
        java.lang.Object obj13 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder14.includeCollection("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.mongoDb("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.statisticsIndexName("password");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder22.includeCollection("null.");
        java.lang.Object obj25 = docScoreSearchScript0.unwrap((java.lang.Object) "null.");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder27.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder27.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder36.mongoGridFS(true);
        java.lang.String[] strArray49 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet50 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet50, strArray49);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder38.includeFields((java.util.Set<java.lang.String>) strSet50);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder33.excludeFields((java.util.Set<java.lang.String>) strSet50);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder33.storeStatistics(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder33.riverIndexName("actions");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = builder33.script("bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = builder33.mongoAdminPassword("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = builder61.riverIndexName("credentials");
        docScoreSearchScript0.setNextVar("collection", (java.lang.Object) "credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder65 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder67 = builder65.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder69 = builder65.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder71 = builder65.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder73 = builder65.riverName("script_type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder75 = builder73.importAllCollections(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder77 = builder73.mongoAdminPassword("type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder79 = builder73.storeStatistics(true);
        java.lang.Object obj80 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder81 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder83 = builder81.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder85 = builder83.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition86 = builder83.build();
        java.lang.String str87 = mongoDBRiverDefinition86.getIncludeCollection();
        java.lang.String str88 = mongoDBRiverDefinition86.getMongoAdminPassword();
        java.lang.String str89 = mongoDBRiverDefinition86.getMongoDb();
        int int90 = mongoDBRiverDefinition86.getSocketTimeout();
        boolean boolean91 = mongoDBRiverDefinition86.isMongoSecondaryReadPreference();
        boolean boolean92 = mongoDBRiverDefinition86.isStoreStatistics();
        java.lang.String str93 = mongoDBRiverDefinition86.getStatisticsTypeName();
        boolean boolean94 = mongoDBRiverDefinition86.isDisableIndexRefresh();
        java.lang.Object obj95 = docScoreSearchScript0.unwrap((java.lang.Object) boolean94);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float96 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1175");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder1.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder3.mongoGridFS(true);
        java.lang.String[] strArray16 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder5.includeFields((java.util.Set<java.lang.String>) strSet17);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder20.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder24.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.indexName("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder28.statisticsTypeName("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder33.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder33.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder33.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder40.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder42.mongoGridFS(true);
        java.lang.String[] strArray55 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet56 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet56, strArray55);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = builder44.includeFields((java.util.Set<java.lang.String>) strSet56);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = builder39.excludeFields((java.util.Set<java.lang.String>) strSet56);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder32.excludeFields((java.util.Set<java.lang.String>) strSet56);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = builder5.parentTypes((java.util.Set<java.lang.String>) strSet56);
        java.lang.Object obj62 = docScoreSearchScript0.unwrap((java.lang.Object) builder5);
        docScoreSearchScript0.setNextScore((float) 100L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long65 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1176");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) (short) 1);
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        docScoreSearchScript0.setNextScore((float) 1L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition12 = builder9.build();
        java.lang.String str13 = mongoDBRiverDefinition12.getIncludeCollection();
        boolean boolean14 = mongoDBRiverDefinition12.isMongoSSLVerifyCertificate();
        java.lang.String str15 = mongoDBRiverDefinition12.getIndexName();
        java.lang.String str16 = mongoDBRiverDefinition12.getMongoDb();
        com.mongodb.BasicDBObject basicDBObject17 = mongoDBRiverDefinition12.getMongoOplogFilter();
        java.lang.String str18 = mongoDBRiverDefinition12.getMongoDb();
        boolean boolean19 = mongoDBRiverDefinition12.isStoreStatistics();
        boolean boolean20 = mongoDBRiverDefinition12.isImportAllCollections();
        java.util.Set<java.lang.String> strSet21 = mongoDBRiverDefinition12.getParentTypes();
        java.lang.String str22 = mongoDBRiverDefinition12.getMongoAdminPassword();
        java.util.Set<java.lang.String> strSet23 = mongoDBRiverDefinition12.getParentTypes();
        java.util.Set<java.lang.String> strSet24 = mongoDBRiverDefinition12.getExcludeFields();
        java.lang.Object obj25 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long26 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1177");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("index", "null.");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1178");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("socket_timeout.socket_timeout", "credentials");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1179");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("ssl", "exclude_fields");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1180");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "skip_initial_import.skip_initial_import");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1181");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("exclude_fields", "hi!");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1182");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder3.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = builder5.build();
        boolean boolean9 = mongoDBRiverDefinition8.isMongoUseSSL();
        boolean boolean10 = mongoDBRiverDefinition8.isAdvancedTransformation();
        java.lang.String str11 = mongoDBRiverDefinition8.getMongoAdminUser();
        java.lang.String str12 = mongoDBRiverDefinition8.getMongoAdminUser();
        java.lang.String str13 = mongoDBRiverDefinition8.getScript();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = mongoDBRiverDefinition8.getInitialTimestamp();
        java.lang.String str15 = mongoDBRiverDefinition8.getMongoOplogNamespace();
        java.lang.Object obj16 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float17 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1183");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("type", "initial_timestamp");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1184");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("host", "size.size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1185");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "");
        docScoreSearchScript0.setNextScore((float) (-1L));
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder5.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder13.includeCollection("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder13.mongoLocalPassword("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder13.mongoAdminUser("db");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder13.mongoDb("db");
        java.lang.Object obj22 = docScoreSearchScript0.unwrap((java.lang.Object) builder13);
        docScoreSearchScript0.setNextScore((float) 10);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript25 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj27 = docScoreSearchScript25.unwrap((java.lang.Object) "");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder30.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder32.indexName("bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder32.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder36.mongoCollection("actions");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder36.throttleSize((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder40.mongoCollection("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder42.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder44.mongoGridFS(true);
        java.lang.Object obj47 = docScoreSearchScript25.unwrap((java.lang.Object) builder46);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder49.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder51.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition54 = builder51.build();
        java.lang.String str55 = mongoDBRiverDefinition54.getIncludeCollection();
        boolean boolean56 = mongoDBRiverDefinition54.isMongoSSLVerifyCertificate();
        java.lang.String str57 = mongoDBRiverDefinition54.getIndexName();
        java.lang.String str58 = mongoDBRiverDefinition54.getMongoDb();
        com.mongodb.BasicDBObject basicDBObject59 = mongoDBRiverDefinition54.getMongoOplogFilter();
        java.lang.String str60 = mongoDBRiverDefinition54.getMongoCollection();
        int int61 = mongoDBRiverDefinition54.getConnectTimeout();
        java.util.Set<java.lang.String> strSet62 = mongoDBRiverDefinition54.getExcludeFields();
        boolean boolean63 = mongoDBRiverDefinition54.isMongoGridFS();
        boolean boolean64 = mongoDBRiverDefinition54.isAdvancedTransformation();
        docScoreSearchScript25.setNextVar("bulk_timeout.bulk_timeout", (java.lang.Object) boolean64);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder66 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder68 = builder66.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder70 = builder66.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder72 = builder70.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder74 = builder72.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder76 = builder74.indexName("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder78 = builder76.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder80 = builder76.mongoLocalPassword("local");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder81 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder83 = builder81.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder85 = builder83.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition86 = builder83.build();
        java.lang.String str87 = mongoDBRiverDefinition86.getRiverIndexName();
        boolean boolean88 = mongoDBRiverDefinition86.isDisableIndexRefresh();
        boolean boolean89 = mongoDBRiverDefinition86.isStoreStatistics();
        java.lang.String str90 = mongoDBRiverDefinition86.getMongoAdminUser();
        java.lang.String str91 = mongoDBRiverDefinition86.getScript();
        java.lang.String str92 = mongoDBRiverDefinition86.getScriptType();
        int int93 = mongoDBRiverDefinition86.getConnectTimeout();
        com.mongodb.BasicDBObject basicDBObject94 = mongoDBRiverDefinition86.getMongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder95 = builder76.mongoOplogFilter(basicDBObject94);
        java.lang.Object obj96 = docScoreSearchScript25.unwrap((java.lang.Object) builder76);
        java.lang.Object obj97 = docScoreSearchScript0.unwrap((java.lang.Object) docScoreSearchScript25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (byte) 100);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1186");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("include_collection", "gridfs");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1187");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) "bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder5.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder13.includeCollection("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder13.mongoLocalPassword("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder13.mongoAdminUser("db");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder13.mongoAdminPassword("skip_initial_import");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder22.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder22.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder30.indexName("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder30.statisticsTypeName("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder35.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder35.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder35.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder42.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder44.mongoGridFS(true);
        java.lang.String[] strArray57 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet58 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet58, strArray57);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder46.includeFields((java.util.Set<java.lang.String>) strSet58);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = builder41.excludeFields((java.util.Set<java.lang.String>) strSet58);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = builder34.excludeFields((java.util.Set<java.lang.String>) strSet58);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = builder13.excludeFields((java.util.Set<java.lang.String>) strSet58);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder65 = builder63.dropCollection(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder67 = builder63.storeStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder69 = builder63.mongoCollection("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder71 = builder69.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder72 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder74 = builder72.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder76 = builder74.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition77 = builder74.build();
        java.lang.String str78 = mongoDBRiverDefinition77.getIncludeCollection();
        boolean boolean79 = mongoDBRiverDefinition77.isMongoSSLVerifyCertificate();
        java.lang.String str80 = mongoDBRiverDefinition77.getMongoAdminPassword();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp81 = mongoDBRiverDefinition77.getInitialTimestamp();
        java.util.List<com.mongodb.ServerAddress> serverAddressList82 = mongoDBRiverDefinition77.getMongoServers();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder83 = builder69.mongoServers(serverAddressList82);
        docScoreSearchScript0.setNextVar("script", (java.lang.Object) serverAddressList82);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj85 = docScoreSearchScript0.run();
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1188");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) "bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = builder6.build();
        java.lang.String str10 = mongoDBRiverDefinition9.getIncludeCollection();
        boolean boolean11 = mongoDBRiverDefinition9.isMongoSSLVerifyCertificate();
        java.lang.String str12 = mongoDBRiverDefinition9.getIndexName();
        java.lang.Object obj13 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition9);
        docScoreSearchScript0.setNextScore((float) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.mongoGridFS(true);
        java.lang.String[] strArray31 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder20.includeFields((java.util.Set<java.lang.String>) strSet32);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.socketTimeout((int) (byte) 10);
        java.lang.Object obj37 = docScoreSearchScript0.unwrap((java.lang.Object) (byte) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder39.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder41.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition44 = builder41.build();
        java.lang.String str45 = mongoDBRiverDefinition44.getIncludeCollection();
        boolean boolean46 = mongoDBRiverDefinition44.isMongoSSLVerifyCertificate();
        java.lang.String str47 = mongoDBRiverDefinition44.getMongoCollection();
        boolean boolean48 = mongoDBRiverDefinition44.isMongoGridFS();
        java.lang.String str49 = mongoDBRiverDefinition44.getIncludeCollection();
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) mongoDBRiverDefinition44);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder52.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder54.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = builder56.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder58.mongoLocalUser("bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = builder58.includeCollection("drop_collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder64 = builder62.storeStatistics(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder66 = builder62.socketTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder67 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder69 = builder67.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder71 = builder69.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition72 = builder69.build();
        java.lang.String str73 = mongoDBRiverDefinition72.getIncludeCollection();
        com.mongodb.MongoClientOptions mongoClientOptions74 = mongoDBRiverDefinition72.getMongoClientOptions();
        boolean boolean75 = mongoDBRiverDefinition72.isDropCollection();
        com.mongodb.BasicDBObject basicDBObject76 = mongoDBRiverDefinition72.getMongoCollectionFilter();
        java.lang.String str77 = mongoDBRiverDefinition72.getIncludeCollection();
        java.util.List<com.mongodb.ServerAddress> serverAddressList78 = mongoDBRiverDefinition72.getMongoServers();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder79 = builder66.mongoServers(serverAddressList78);
        docScoreSearchScript0.setNextVar("bulk_timeout.bulk_timeout", (java.lang.Object) builder79);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float81 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1189");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 10.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder3.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder3.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder3.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder3.riverName("script_type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.importAllCollections(false);
        java.lang.Object obj14 = docScoreSearchScript0.unwrap((java.lang.Object) builder13);
        docScoreSearchScript0.setNextScore((float) '4');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition23 = builder20.build();
        java.lang.String str24 = mongoDBRiverDefinition23.getIncludeCollection();
        boolean boolean25 = mongoDBRiverDefinition23.isMongoSSLVerifyCertificate();
        java.lang.String str26 = mongoDBRiverDefinition23.getIndexName();
        java.lang.String str27 = mongoDBRiverDefinition23.getMongoDb();
        com.mongodb.BasicDBObject basicDBObject28 = mongoDBRiverDefinition23.getMongoOplogFilter();
        java.util.List<com.mongodb.ServerAddress> serverAddressList29 = mongoDBRiverDefinition23.getMongoServers();
        java.util.Set<java.lang.String> strSet30 = mongoDBRiverDefinition23.getExcludeFields();
        docScoreSearchScript0.setNextVar("gridfs", (java.lang.Object) mongoDBRiverDefinition23);
        docScoreSearchScript0.setNextScore((float) 1L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder36.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition39 = builder36.build();
        java.lang.String str40 = mongoDBRiverDefinition39.getIncludeCollection();
        boolean boolean41 = mongoDBRiverDefinition39.isMongoSSLVerifyCertificate();
        java.lang.String str42 = mongoDBRiverDefinition39.getMongoAdminPassword();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp43 = mongoDBRiverDefinition39.getInitialTimestamp();
        java.lang.String str44 = mongoDBRiverDefinition39.getMongoAdminUser();
        java.lang.String str45 = mongoDBRiverDefinition39.getTypeName();
        java.util.Set<java.lang.String> strSet46 = mongoDBRiverDefinition39.getExcludeFields();
        boolean boolean47 = mongoDBRiverDefinition39.isMongoGridFS();
        java.lang.Object obj48 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition39);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long49 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1190");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("flush_interval", "size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1191");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("host.filter", "store_statistics");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1192");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("actions", "include_fields");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1193");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("user", "disable_index_refresh.disable_index_refresh");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1194");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder1.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder3.mongoGridFS(true);
        java.lang.String[] strArray16 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder5.includeFields((java.util.Set<java.lang.String>) strSet17);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder20.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder24.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.indexName("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder28.statisticsTypeName("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder33.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder33.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder33.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder40.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder42.mongoGridFS(true);
        java.lang.String[] strArray55 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet56 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet56, strArray55);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = builder44.includeFields((java.util.Set<java.lang.String>) strSet56);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = builder39.excludeFields((java.util.Set<java.lang.String>) strSet56);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder32.excludeFields((java.util.Set<java.lang.String>) strSet56);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = builder5.parentTypes((java.util.Set<java.lang.String>) strSet56);
        java.lang.Object obj62 = docScoreSearchScript0.unwrap((java.lang.Object) builder5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder64 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder66 = builder64.mongoCollection("");
        java.lang.String[] strArray70 = new java.lang.String[] { "bulk", "bulk", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet71 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet71, strArray70);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder73 = builder64.includeFields((java.util.Set<java.lang.String>) strSet71);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder75 = builder64.statisticsTypeName("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder77 = builder64.mongoLocalPassword("concurrent_bulk_requests");
        docScoreSearchScript0.setNextVar("include_fields", (java.lang.Object) "concurrent_bulk_requests");
        docScoreSearchScript0.setNextScore((float) (short) 100);
        docScoreSearchScript0.setNextScore((float) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long83 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1195");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 10.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder3.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder3.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder3.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder3.riverName("script_type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.importAllCollections(false);
        java.lang.Object obj14 = docScoreSearchScript0.unwrap((java.lang.Object) builder13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder15.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.indexName("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder23.statisticsTypeName("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder23.indexName("size");
        java.lang.Object obj30 = docScoreSearchScript0.unwrap((java.lang.Object) "size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder31.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder33.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder35.indexName("bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder35.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder35.statisticsTypeName("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder35.scriptType("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder35.connectTimeout((int) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder35.mongoCollection("ssl");
        java.lang.Object obj48 = docScoreSearchScript0.unwrap((java.lang.Object) "ssl");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj49 = docScoreSearchScript0.run();
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1196");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "bulk_size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1197");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 10.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder3.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = builder5.build();
        boolean boolean9 = mongoDBRiverDefinition8.isDisableIndexRefresh();
        boolean boolean10 = mongoDBRiverDefinition8.isDropCollection();
        java.lang.String str11 = mongoDBRiverDefinition8.getMongoAdminPassword();
        java.util.List<com.mongodb.ServerAddress> serverAddressList12 = mongoDBRiverDefinition8.getMongoServers();
        boolean boolean13 = mongoDBRiverDefinition8.isMongoSecondaryReadPreference();
        java.lang.String str14 = mongoDBRiverDefinition8.getScriptType();
        java.lang.String str15 = mongoDBRiverDefinition8.getIncludeCollection();
        java.lang.String str16 = mongoDBRiverDefinition8.getScriptType();
        boolean boolean17 = mongoDBRiverDefinition8.isSkipInitialImport();
        java.util.Set<java.lang.String> strSet18 = mongoDBRiverDefinition8.getParentTypes();
        java.lang.String str19 = mongoDBRiverDefinition8.getStatisticsIndexName();
        java.lang.String str20 = mongoDBRiverDefinition8.getStatisticsIndexName();
        java.lang.String str21 = mongoDBRiverDefinition8.getMongoLocalUser();
        java.lang.Object obj22 = docScoreSearchScript0.unwrap((java.lang.Object) str21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(0);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1198");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk", "credentials");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1199");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder1.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder3.mongoGridFS(true);
        java.lang.String[] strArray16 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder5.includeFields((java.util.Set<java.lang.String>) strSet17);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder20.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder24.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.indexName("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder28.statisticsTypeName("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder33.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder33.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder33.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder40.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder42.mongoGridFS(true);
        java.lang.String[] strArray55 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet56 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet56, strArray55);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = builder44.includeFields((java.util.Set<java.lang.String>) strSet56);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = builder39.excludeFields((java.util.Set<java.lang.String>) strSet56);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder32.excludeFields((java.util.Set<java.lang.String>) strSet56);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = builder5.parentTypes((java.util.Set<java.lang.String>) strSet56);
        java.lang.Object obj62 = docScoreSearchScript0.unwrap((java.lang.Object) builder5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder64 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder66 = builder64.mongoCollection("");
        java.lang.String[] strArray70 = new java.lang.String[] { "bulk", "bulk", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet71 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet71, strArray70);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder73 = builder64.includeFields((java.util.Set<java.lang.String>) strSet71);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder75 = builder64.statisticsTypeName("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder77 = builder64.mongoLocalPassword("concurrent_bulk_requests");
        docScoreSearchScript0.setNextVar("include_fields", (java.lang.Object) "concurrent_bulk_requests");
        docScoreSearchScript0.setNextScore((float) (short) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder81 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder83 = builder81.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder85 = builder83.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder87 = builder85.indexName("bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder89 = builder85.mongoSecondaryReadPreference(true);
        java.lang.Object obj90 = docScoreSearchScript0.unwrap((java.lang.Object) builder85);
        docScoreSearchScript0.setNextScore((float) 8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj93 = docScoreSearchScript0.run();
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1200");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("collection", "skip_initial_import");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1201");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("port", "ssl_verify_certificate.ssl_verify_certificate");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1202");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_timeout.bulk_timeout", "index");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1203");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("credentials", "index");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1204");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("ssl", "initial_timestamp");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1205");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) "bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = builder6.build();
        java.lang.String str10 = mongoDBRiverDefinition9.getIncludeCollection();
        boolean boolean11 = mongoDBRiverDefinition9.isMongoSSLVerifyCertificate();
        java.lang.String str12 = mongoDBRiverDefinition9.getIndexName();
        java.lang.Object obj13 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition9);
        docScoreSearchScript0.setNextScore((float) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.mongoGridFS(true);
        java.lang.String[] strArray31 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder20.includeFields((java.util.Set<java.lang.String>) strSet32);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.socketTimeout((int) (byte) 10);
        java.lang.Object obj37 = docScoreSearchScript0.unwrap((java.lang.Object) (byte) 10);
        docScoreSearchScript0.setNextScore((float) 100);
        docScoreSearchScript0.setNextScore((float) '4');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder42.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder44.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition47 = builder44.build();
        java.lang.String str48 = mongoDBRiverDefinition47.getIncludeCollection();
        com.mongodb.MongoClientOptions mongoClientOptions49 = mongoDBRiverDefinition47.getMongoClientOptions();
        java.lang.String str50 = mongoDBRiverDefinition47.getStatisticsIndexName();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp51 = mongoDBRiverDefinition47.getInitialTimestamp();
        java.util.Set<java.lang.String> strSet52 = mongoDBRiverDefinition47.getIncludeFields();
        java.util.List<com.mongodb.ServerAddress> serverAddressList53 = mongoDBRiverDefinition47.getMongoServers();
        java.lang.Object obj54 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition47);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float55 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1206");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) "bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.includeCollection("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder12.mongoLocalPassword("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder12.statisticsIndexName("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder12.statisticsIndexName("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.riverName("secondary_read_preference");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder22.statisticsTypeName("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder22.advancedTransformation(false);
        java.lang.Object obj27 = docScoreSearchScript0.unwrap((java.lang.Object) builder26);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder29.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder31.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder33.mongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder36.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder38.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition41 = builder38.build();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder38.riverName("store_statistics");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder38.riverIndexName("throttle_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder38.typeName("include_collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder47.throttleSize(8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder47.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder52.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder54.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition57 = builder54.build();
        java.lang.String str58 = mongoDBRiverDefinition57.getRiverIndexName();
        boolean boolean59 = mongoDBRiverDefinition57.isDisableIndexRefresh();
        boolean boolean60 = mongoDBRiverDefinition57.isStoreStatistics();
        java.lang.String str61 = mongoDBRiverDefinition57.getMongoAdminUser();
        java.lang.String str62 = mongoDBRiverDefinition57.getScript();
        java.lang.String str63 = mongoDBRiverDefinition57.getScriptType();
        int int64 = mongoDBRiverDefinition57.getConnectTimeout();
        com.mongodb.BasicDBObject basicDBObject65 = mongoDBRiverDefinition57.getMongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder66 = builder47.mongoCollectionFilter(basicDBObject65);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder67 = builder35.mongoCollectionFilter(basicDBObject65);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder68 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder70 = builder68.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder72 = builder70.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition73 = builder70.build();
        boolean boolean74 = mongoDBRiverDefinition73.isDisableIndexRefresh();
        boolean boolean75 = mongoDBRiverDefinition73.isDropCollection();
        java.lang.String str76 = mongoDBRiverDefinition73.getMongoAdminPassword();
        boolean boolean77 = mongoDBRiverDefinition73.isMongoSSLVerifyCertificate();
        java.lang.String str78 = mongoDBRiverDefinition73.getScript();
        java.lang.String str79 = mongoDBRiverDefinition73.getScript();
        java.util.List<com.mongodb.ServerAddress> serverAddressList80 = mongoDBRiverDefinition73.getMongoServers();
        java.util.List<com.mongodb.ServerAddress> serverAddressList81 = mongoDBRiverDefinition73.getMongoServers();
        java.util.Set<java.lang.String> strSet82 = mongoDBRiverDefinition73.getExcludeFields();
        com.mongodb.BasicDBObject basicDBObject83 = mongoDBRiverDefinition73.getMongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder84 = builder35.mongoCollectionFilter(basicDBObject83);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder86 = builder84.mongoAdminPassword("concurrent_bulk_requests");
        docScoreSearchScript0.setNextVar("skip_initial_import", (java.lang.Object) builder84);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double88 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1207");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("skip_initial_import", "concurrent_requests");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1208");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 10.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder3.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder3.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder3.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder3.riverName("script_type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.importAllCollections(false);
        java.lang.Object obj14 = docScoreSearchScript0.unwrap((java.lang.Object) builder13);
        docScoreSearchScript0.setNextScore((float) '4');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition23 = builder20.build();
        java.lang.String str24 = mongoDBRiverDefinition23.getIncludeCollection();
        boolean boolean25 = mongoDBRiverDefinition23.isMongoSSLVerifyCertificate();
        java.lang.String str26 = mongoDBRiverDefinition23.getIndexName();
        java.lang.String str27 = mongoDBRiverDefinition23.getMongoDb();
        com.mongodb.BasicDBObject basicDBObject28 = mongoDBRiverDefinition23.getMongoOplogFilter();
        java.util.List<com.mongodb.ServerAddress> serverAddressList29 = mongoDBRiverDefinition23.getMongoServers();
        java.util.Set<java.lang.String> strSet30 = mongoDBRiverDefinition23.getExcludeFields();
        docScoreSearchScript0.setNextVar("gridfs", (java.lang.Object) mongoDBRiverDefinition23);
        docScoreSearchScript0.setNextScore((float) 1L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder36.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition39 = builder36.build();
        java.lang.String str40 = mongoDBRiverDefinition39.getIncludeCollection();
        boolean boolean41 = mongoDBRiverDefinition39.isMongoSSLVerifyCertificate();
        java.lang.String str42 = mongoDBRiverDefinition39.getMongoAdminPassword();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp43 = mongoDBRiverDefinition39.getInitialTimestamp();
        java.lang.String str44 = mongoDBRiverDefinition39.getMongoAdminUser();
        java.lang.String str45 = mongoDBRiverDefinition39.getTypeName();
        java.util.Set<java.lang.String> strSet46 = mongoDBRiverDefinition39.getExcludeFields();
        boolean boolean47 = mongoDBRiverDefinition39.isMongoGridFS();
        java.lang.Object obj48 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition39);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float49 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1209");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("size", "disable_index_refresh");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1210");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("actions", "drop_collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1211");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("hi!", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1212");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("user", "concurrent_bulk_requests");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1213");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("index", "drop_collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1214");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "");
        docScoreSearchScript0.setNextScore((float) (-1L));
        java.lang.Object obj6 = docScoreSearchScript0.unwrap((java.lang.Object) (-1.0d));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float7 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1215");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("null.", "advanced_transformation");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1216");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_size", "store_statistics");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1217");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("local", "bulk_timeout.bulk_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1218");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) "bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = builder6.build();
        java.lang.String str10 = mongoDBRiverDefinition9.getIncludeCollection();
        boolean boolean11 = mongoDBRiverDefinition9.isMongoSSLVerifyCertificate();
        java.lang.String str12 = mongoDBRiverDefinition9.getIndexName();
        java.lang.Object obj13 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition9);
        docScoreSearchScript0.setNextScore((float) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.mongoGridFS(true);
        java.lang.String[] strArray31 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder20.includeFields((java.util.Set<java.lang.String>) strSet32);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.socketTimeout((int) (byte) 10);
        java.lang.Object obj37 = docScoreSearchScript0.unwrap((java.lang.Object) (byte) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder39.mongoCollection("");
        java.lang.String[] strArray45 = new java.lang.String[] { "bulk", "bulk", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet46 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet46, strArray45);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder39.includeFields((java.util.Set<java.lang.String>) strSet46);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder48.throttleSize(1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder48.throttleSize(1000);
        docScoreSearchScript0.setNextVar("drop_collection", (java.lang.Object) builder48);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float54 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1219");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("actions", "initial_timestamp");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1220");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("gridfs", "include_fields");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1221");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("ssl_verify_certificate", "ssl_verify_certificate.ssl_verify_certificate");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1222");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("include_fields", "bulk_size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1223");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) "bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.includeCollection("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder12.mongoLocalPassword("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder12.statisticsIndexName("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder12.statisticsIndexName("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.riverName("secondary_read_preference");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder22.statisticsTypeName("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder22.advancedTransformation(false);
        java.lang.Object obj27 = docScoreSearchScript0.unwrap((java.lang.Object) builder26);
        docScoreSearchScript0.setNextScore((float) (-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float30 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1224");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("null.", "options");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1225");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder8.mongoLocalUser("parent_types");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder8.mongoSSLVerifyCertificate(false);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) builder14);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.statisticsIndexName("store_statistics");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder23.throttleSize((int) (short) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder23.advancedTransformation(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder23.indexName("password");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder23.scriptType("user");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder33.skipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder33.includeCollection("include_fields");
        docScoreSearchScript0.setNextVar("ssl", (java.lang.Object) "include_fields");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder39.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder41.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition44 = builder41.build();
        java.lang.String str45 = mongoDBRiverDefinition44.getIncludeCollection();
        java.lang.String str46 = mongoDBRiverDefinition44.getMongoAdminPassword();
        java.lang.String str47 = mongoDBRiverDefinition44.getMongoDb();
        java.util.Set<java.lang.String> strSet48 = mongoDBRiverDefinition44.getParentTypes();
        com.mongodb.BasicDBObject basicDBObject49 = mongoDBRiverDefinition44.getMongoCollectionFilter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject49);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1226");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("collection", "index");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1227");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 10.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder3.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder3.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder3.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder3.riverName("script_type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.importAllCollections(false);
        java.lang.Object obj14 = docScoreSearchScript0.unwrap((java.lang.Object) builder13);
        docScoreSearchScript0.setNextScore((float) '4');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition23 = builder20.build();
        java.lang.String str24 = mongoDBRiverDefinition23.getIncludeCollection();
        boolean boolean25 = mongoDBRiverDefinition23.isMongoSSLVerifyCertificate();
        java.lang.String str26 = mongoDBRiverDefinition23.getIndexName();
        java.lang.String str27 = mongoDBRiverDefinition23.getMongoDb();
        com.mongodb.BasicDBObject basicDBObject28 = mongoDBRiverDefinition23.getMongoOplogFilter();
        java.util.List<com.mongodb.ServerAddress> serverAddressList29 = mongoDBRiverDefinition23.getMongoServers();
        java.util.Set<java.lang.String> strSet30 = mongoDBRiverDefinition23.getExcludeFields();
        docScoreSearchScript0.setNextVar("gridfs", (java.lang.Object) mongoDBRiverDefinition23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double32 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1228");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder3.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.statisticsIndexName("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.mongoAdminUser("gridfs");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.riverName("parent_types");
        java.lang.Object obj14 = docScoreSearchScript0.unwrap((java.lang.Object) builder11);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript15 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript15.setNextVar("db", (java.lang.Object) "bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition24 = builder21.build();
        java.lang.String str25 = mongoDBRiverDefinition24.getIncludeCollection();
        boolean boolean26 = mongoDBRiverDefinition24.isMongoSSLVerifyCertificate();
        java.lang.String str27 = mongoDBRiverDefinition24.getIndexName();
        java.lang.Object obj28 = docScoreSearchScript15.unwrap((java.lang.Object) mongoDBRiverDefinition24);
        boolean boolean29 = mongoDBRiverDefinition24.isStoreStatistics();
        boolean boolean30 = mongoDBRiverDefinition24.isDisableIndexRefresh();
        java.lang.Object obj31 = docScoreSearchScript0.unwrap((java.lang.Object) boolean30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (byte) 10);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1229");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("null.", "host");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1230");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("concurrent_bulk_requests", "db");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1231");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) "bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = builder6.build();
        java.lang.String str10 = mongoDBRiverDefinition9.getIncludeCollection();
        boolean boolean11 = mongoDBRiverDefinition9.isMongoSSLVerifyCertificate();
        java.lang.String str12 = mongoDBRiverDefinition9.getIndexName();
        java.lang.Object obj13 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder14.includeCollection("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.mongoDb("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.statisticsIndexName("password");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder22.includeCollection("null.");
        java.lang.Object obj25 = docScoreSearchScript0.unwrap((java.lang.Object) "null.");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder29.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition32 = builder29.build();
        java.lang.String str33 = mongoDBRiverDefinition32.getIncludeCollection();
        boolean boolean34 = mongoDBRiverDefinition32.isMongoSSLVerifyCertificate();
        java.lang.String str35 = mongoDBRiverDefinition32.getIndexName();
        java.lang.String str36 = mongoDBRiverDefinition32.getMongoDb();
        com.mongodb.BasicDBObject basicDBObject37 = mongoDBRiverDefinition32.getMongoOplogFilter();
        java.util.List<com.mongodb.ServerAddress> serverAddressList38 = mongoDBRiverDefinition32.getMongoServers();
        java.lang.String str39 = mongoDBRiverDefinition32.getMongoDb();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp40 = mongoDBRiverDefinition32.getInitialTimestamp();
        boolean boolean41 = mongoDBRiverDefinition32.isMongoSecondaryReadPreference();
        docScoreSearchScript0.setNextVar("concurrent_requests", (java.lang.Object) mongoDBRiverDefinition32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj43 = docScoreSearchScript0.run();
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1232");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder8.mongoLocalUser("parent_types");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder8.mongoSSLVerifyCertificate(false);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) builder14);
        docScoreSearchScript0.setNextScore((float) 1L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (byte) 0);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1233");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("credentials", "bulk_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1234");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_timeout.bulk_timeout", "size.size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1235");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("drop_collection", "include_fields");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1236");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "");
        docScoreSearchScript0.setNextScore((float) (-1L));
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder5.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder13.includeCollection("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder13.mongoLocalPassword("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder13.mongoAdminUser("db");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder13.mongoDb("db");
        java.lang.Object obj22 = docScoreSearchScript0.unwrap((java.lang.Object) builder13);
        docScoreSearchScript0.setNextScore((float) (byte) 100);
        docScoreSearchScript0.setNextScore((float) 10L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder28.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder28.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder35.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder37.mongoGridFS(true);
        java.lang.String[] strArray50 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet51 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet51, strArray50);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder39.includeFields((java.util.Set<java.lang.String>) strSet51);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder34.excludeFields((java.util.Set<java.lang.String>) strSet51);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder34.storeStatistics(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = builder56.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder58.riverName("include_fields");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = builder60.indexName("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder64 = builder60.includeCollection("collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder66 = builder60.includeCollection("actions");
        docScoreSearchScript0.setNextVar("connect_timeout", (java.lang.Object) "actions");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long68 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1237");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "initial_timestamp");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1238");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_timeout.bulk_timeout", "size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1239");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) "bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = builder6.build();
        java.lang.String str10 = mongoDBRiverDefinition9.getIncludeCollection();
        boolean boolean11 = mongoDBRiverDefinition9.isMongoSSLVerifyCertificate();
        java.lang.String str12 = mongoDBRiverDefinition9.getIndexName();
        java.lang.Object obj13 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition9);
        docScoreSearchScript0.setNextScore((float) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.mongoGridFS(true);
        java.lang.String[] strArray31 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder20.includeFields((java.util.Set<java.lang.String>) strSet32);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.socketTimeout((int) (byte) 10);
        java.lang.Object obj37 = docScoreSearchScript0.unwrap((java.lang.Object) (byte) 10);
        docScoreSearchScript0.setNextScore((float) 100);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory41 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder42.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder44.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition47 = builder44.build();
        java.lang.String str48 = mongoDBRiverDefinition47.getRiverIndexName();
        boolean boolean49 = mongoDBRiverDefinition47.isDisableIndexRefresh();
        java.util.Set<java.lang.String> strSet50 = mongoDBRiverDefinition47.getIncludeFields();
        java.lang.String str51 = mongoDBRiverDefinition47.getMongoLocalPassword();
        com.mongodb.BasicDBObject basicDBObject52 = mongoDBRiverDefinition47.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript53 = docScoreNativeScriptFactory41.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject52);
        docScoreSearchScript0.setNextVar("", (java.lang.Object) docScoreNativeScriptFactory41);
        docScoreSearchScript0.setNextScore((-1.0f));
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder58.typeName("collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = builder58.mongoLocalPassword("exclude_fields");
        docScoreSearchScript0.setNextVar("null.", (java.lang.Object) builder58);
        docScoreSearchScript0.setNextScore((-1.0f));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long66 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1240");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("disable_index_refresh", "ssl");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1241");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("concurrent_requests", "name");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1242");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder1.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder3.mongoGridFS(true);
        java.lang.String[] strArray16 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder5.includeFields((java.util.Set<java.lang.String>) strSet17);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder20.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder24.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.indexName("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder28.statisticsTypeName("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder33.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder33.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder33.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder40.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder42.mongoGridFS(true);
        java.lang.String[] strArray55 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet56 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet56, strArray55);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = builder44.includeFields((java.util.Set<java.lang.String>) strSet56);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = builder39.excludeFields((java.util.Set<java.lang.String>) strSet56);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder32.excludeFields((java.util.Set<java.lang.String>) strSet56);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = builder5.parentTypes((java.util.Set<java.lang.String>) strSet56);
        java.lang.Object obj62 = docScoreSearchScript0.unwrap((java.lang.Object) builder5);
        docScoreSearchScript0.setNextScore((float) 100L);
        docScoreSearchScript0.setNextScore((float) 10);
        docScoreSearchScript0.setNextScore((float) 0);
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long71 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1243");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) "bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = builder6.build();
        java.lang.String str10 = mongoDBRiverDefinition9.getIncludeCollection();
        boolean boolean11 = mongoDBRiverDefinition9.isMongoSSLVerifyCertificate();
        java.lang.String str12 = mongoDBRiverDefinition9.getIndexName();
        java.lang.Object obj13 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition9);
        docScoreSearchScript0.setNextScore((float) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition22 = builder19.build();
        java.lang.String str23 = mongoDBRiverDefinition22.getIncludeCollection();
        boolean boolean24 = mongoDBRiverDefinition22.isMongoSSLVerifyCertificate();
        java.lang.String str25 = mongoDBRiverDefinition22.getIndexName();
        java.lang.String str26 = mongoDBRiverDefinition22.getMongoDb();
        boolean boolean27 = mongoDBRiverDefinition22.isDisableIndexRefresh();
        java.lang.String str28 = mongoDBRiverDefinition22.getIndexName();
        java.lang.String str29 = mongoDBRiverDefinition22.getMongoLocalUser();
        java.lang.String str30 = mongoDBRiverDefinition22.getRiverIndexName();
        com.mongodb.BasicDBObject basicDBObject31 = mongoDBRiverDefinition22.getMongoOplogFilter();
        java.lang.String str32 = mongoDBRiverDefinition22.getMongoLocalUser();
        docScoreSearchScript0.setNextVar("concurrent_requests", (java.lang.Object) mongoDBRiverDefinition22);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder36.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition39 = builder36.build();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder36.riverName("store_statistics");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder36.riverIndexName("throttle_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder43.mongoLocalUser("advanced_transformation");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder45.mongoCollection("password");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder47.dropCollection(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder47.riverIndexName("port");
        java.lang.Object obj52 = docScoreSearchScript0.unwrap((java.lang.Object) builder51);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj53 = docScoreSearchScript0.run();
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1244");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("local", "store_statistics");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1245");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("secondary_read_preference", "disable_index_refresh.disable_index_refresh");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1246");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) "bulk_timeout");
        docScoreSearchScript0.setNextScore((float) 10L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.indexName("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder14.statisticsTypeName("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder19.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder19.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.mongoGridFS(true);
        java.lang.String[] strArray41 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet42 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet42, strArray41);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder30.includeFields((java.util.Set<java.lang.String>) strSet42);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder25.excludeFields((java.util.Set<java.lang.String>) strSet42);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder18.excludeFields((java.util.Set<java.lang.String>) strSet42);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition47 = builder18.build();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder18.connectTimeout((int) 'a');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder50.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder52.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition55 = builder52.build();
        boolean boolean56 = mongoDBRiverDefinition55.isDisableIndexRefresh();
        boolean boolean57 = mongoDBRiverDefinition55.isDisableIndexRefresh();
        int int58 = mongoDBRiverDefinition55.getThrottleSize();
        int int59 = mongoDBRiverDefinition55.getSocketTimeout();
        boolean boolean60 = mongoDBRiverDefinition55.isDisableIndexRefresh();
        java.util.List<com.mongodb.ServerAddress> serverAddressList61 = mongoDBRiverDefinition55.getMongoServers();
        java.lang.String str62 = mongoDBRiverDefinition55.getMongoOplogNamespace();
        java.util.Set<java.lang.String> strSet63 = mongoDBRiverDefinition55.getParentTypes();
        java.lang.String str64 = mongoDBRiverDefinition55.getScriptType();
        java.lang.String str65 = mongoDBRiverDefinition55.getMongoDb();
        boolean boolean66 = mongoDBRiverDefinition55.isMongoSSLVerifyCertificate();
        java.util.List<com.mongodb.ServerAddress> serverAddressList67 = mongoDBRiverDefinition55.getMongoServers();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder68 = builder18.mongoServers(serverAddressList67);
        java.lang.Object obj69 = docScoreSearchScript0.unwrap((java.lang.Object) builder18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(100);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1247");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "");
        docScoreSearchScript0.setNextScore((float) (-1L));
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder5.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder13.includeCollection("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder13.mongoLocalPassword("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder13.mongoAdminUser("db");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder13.mongoDb("db");
        java.lang.Object obj22 = docScoreSearchScript0.unwrap((java.lang.Object) builder13);
        docScoreSearchScript0.setNextScore((float) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double25 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1248");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder3.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.statisticsIndexName("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.mongoAdminUser("gridfs");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.riverName("parent_types");
        java.lang.Object obj14 = docScoreSearchScript0.unwrap((java.lang.Object) builder11);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript15 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript15.setNextVar("db", (java.lang.Object) "bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition24 = builder21.build();
        java.lang.String str25 = mongoDBRiverDefinition24.getIncludeCollection();
        boolean boolean26 = mongoDBRiverDefinition24.isMongoSSLVerifyCertificate();
        java.lang.String str27 = mongoDBRiverDefinition24.getIndexName();
        java.lang.Object obj28 = docScoreSearchScript15.unwrap((java.lang.Object) mongoDBRiverDefinition24);
        boolean boolean29 = mongoDBRiverDefinition24.isStoreStatistics();
        boolean boolean30 = mongoDBRiverDefinition24.isDisableIndexRefresh();
        java.lang.Object obj31 = docScoreSearchScript0.unwrap((java.lang.Object) boolean30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float32 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1249");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("socket_timeout", "import_all_collections");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1250");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_size", "name");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1251");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder1.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder3.mongoGridFS(true);
        java.lang.String[] strArray16 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder5.includeFields((java.util.Set<java.lang.String>) strSet17);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder20.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder24.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.indexName("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder28.statisticsTypeName("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder33.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder33.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder33.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder40.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder42.mongoGridFS(true);
        java.lang.String[] strArray55 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet56 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet56, strArray55);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = builder44.includeFields((java.util.Set<java.lang.String>) strSet56);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = builder39.excludeFields((java.util.Set<java.lang.String>) strSet56);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder32.excludeFields((java.util.Set<java.lang.String>) strSet56);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = builder5.parentTypes((java.util.Set<java.lang.String>) strSet56);
        java.lang.Object obj62 = docScoreSearchScript0.unwrap((java.lang.Object) builder5);
        docScoreSearchScript0.setNextScore((float) 100L);
        docScoreSearchScript0.setNextScore((float) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long67 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1252");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("type", "index");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1253");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("import_all_collections", "store_statistics");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1254");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) "bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = builder6.build();
        java.lang.String str10 = mongoDBRiverDefinition9.getIncludeCollection();
        boolean boolean11 = mongoDBRiverDefinition9.isMongoSSLVerifyCertificate();
        java.lang.String str12 = mongoDBRiverDefinition9.getIndexName();
        java.lang.Object obj13 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj14 = docScoreSearchScript0.run();
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1255");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("concurrent_requests", "socket_timeout.socket_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1256");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) "bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = builder6.build();
        java.lang.String str10 = mongoDBRiverDefinition9.getIncludeCollection();
        boolean boolean11 = mongoDBRiverDefinition9.isMongoSSLVerifyCertificate();
        java.lang.String str12 = mongoDBRiverDefinition9.getIndexName();
        java.lang.Object obj13 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition9);
        docScoreSearchScript0.setNextScore((float) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.riverName("password");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder26.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder26.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder33.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder35.mongoGridFS(true);
        java.lang.String[] strArray48 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet49 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet49, strArray48);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder37.includeFields((java.util.Set<java.lang.String>) strSet49);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder32.excludeFields((java.util.Set<java.lang.String>) strSet49);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder23.excludeFields((java.util.Set<java.lang.String>) strSet49);
        docScoreSearchScript0.setNextVar("ssl", (java.lang.Object) builder23);
        docScoreSearchScript0.setNextScore((float) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double57 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1257");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("skip_initial_import", "socket_timeout.socket_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1258");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) "bulk_timeout");
        docScoreSearchScript0.setNextScore((float) (byte) -1);
        docScoreSearchScript0.setNextScore((float) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = builder10.build();
        boolean boolean14 = mongoDBRiverDefinition13.isDisableIndexRefresh();
        boolean boolean15 = mongoDBRiverDefinition13.isDisableIndexRefresh();
        boolean boolean16 = mongoDBRiverDefinition13.isMongoGridFS();
        java.lang.String str17 = mongoDBRiverDefinition13.getStatisticsIndexName();
        java.lang.String str18 = mongoDBRiverDefinition13.getIndexName();
        boolean boolean19 = mongoDBRiverDefinition13.isMongoSecondaryReadPreference();
        java.lang.Object obj20 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder22.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder22.includeCollection("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.mongoDb("");
        docScoreSearchScript0.setNextVar("host", (java.lang.Object) builder28);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (short) 1);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1259");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) "bulk_timeout");
        docScoreSearchScript0.setNextScore((float) (byte) -1);
        docScoreSearchScript0.setNextScore((float) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder8.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder8.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.mongoGridFS(true);
        java.lang.String[] strArray30 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet31 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet31, strArray30);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder19.includeFields((java.util.Set<java.lang.String>) strSet31);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder14.excludeFields((java.util.Set<java.lang.String>) strSet31);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder14.storeStatistics(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder14.throttleSize(0);
        com.mongodb.ServerAddress[] serverAddressArray39 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList40 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList40, serverAddressArray39);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder38.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList40);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder43.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder45.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder45.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder50.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder50.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder54.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = builder56.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder58.indexName("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = builder58.statisticsTypeName("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder65 = builder63.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder67 = builder63.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder69 = builder63.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder70 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder72 = builder70.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder74 = builder72.mongoGridFS(true);
        java.lang.String[] strArray85 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet86 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet86, strArray85);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder88 = builder74.includeFields((java.util.Set<java.lang.String>) strSet86);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder89 = builder69.excludeFields((java.util.Set<java.lang.String>) strSet86);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder90 = builder62.excludeFields((java.util.Set<java.lang.String>) strSet86);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder91 = builder49.excludeFields((java.util.Set<java.lang.String>) strSet86);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder92 = builder38.parentTypes((java.util.Set<java.lang.String>) strSet86);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder94 = builder92.importAllCollections(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder96 = builder94.mongoSSLVerifyCertificate(false);
        java.lang.Object obj97 = docScoreSearchScript0.unwrap((java.lang.Object) builder94);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long98 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1260");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "");
        docScoreSearchScript0.setNextScore((float) (-1));
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript5 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript5.setNextVar("db", (java.lang.Object) "bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition14 = builder11.build();
        java.lang.String str15 = mongoDBRiverDefinition14.getIncludeCollection();
        boolean boolean16 = mongoDBRiverDefinition14.isMongoSSLVerifyCertificate();
        java.lang.String str17 = mongoDBRiverDefinition14.getIndexName();
        java.lang.Object obj18 = docScoreSearchScript5.unwrap((java.lang.Object) mongoDBRiverDefinition14);
        docScoreSearchScript5.setNextScore((float) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder22.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder24.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition27 = builder24.build();
        java.lang.String str28 = mongoDBRiverDefinition27.getIncludeCollection();
        boolean boolean29 = mongoDBRiverDefinition27.isMongoSSLVerifyCertificate();
        java.lang.String str30 = mongoDBRiverDefinition27.getIndexName();
        java.lang.String str31 = mongoDBRiverDefinition27.getMongoDb();
        boolean boolean32 = mongoDBRiverDefinition27.isDisableIndexRefresh();
        java.lang.String str33 = mongoDBRiverDefinition27.getIndexName();
        java.lang.String str34 = mongoDBRiverDefinition27.getMongoLocalUser();
        java.lang.String str35 = mongoDBRiverDefinition27.getRiverIndexName();
        com.mongodb.BasicDBObject basicDBObject36 = mongoDBRiverDefinition27.getMongoOplogFilter();
        java.lang.String str37 = mongoDBRiverDefinition27.getMongoLocalUser();
        docScoreSearchScript5.setNextVar("concurrent_requests", (java.lang.Object) mongoDBRiverDefinition27);
        boolean boolean39 = mongoDBRiverDefinition27.isAdvancedTransformation();
        boolean boolean40 = mongoDBRiverDefinition27.isAdvancedTransformation();
        java.lang.String str41 = mongoDBRiverDefinition27.getMongoAdminPassword();
        java.lang.Object obj42 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long43 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1261");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("type", "include_fields");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1262");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("credentials", "host.host");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1263");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("size.size", "size.size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1264");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "name");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1265");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) "bulk_timeout");
        docScoreSearchScript0.setNextScore((float) (byte) -1);
        docScoreSearchScript0.setNextScore((float) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = builder10.build();
        java.lang.String str14 = mongoDBRiverDefinition13.getRiverIndexName();
        boolean boolean15 = mongoDBRiverDefinition13.isDisableIndexRefresh();
        boolean boolean16 = mongoDBRiverDefinition13.isDropCollection();
        boolean boolean17 = mongoDBRiverDefinition13.isDropCollection();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp18 = mongoDBRiverDefinition13.getInitialTimestamp();
        boolean boolean19 = mongoDBRiverDefinition13.isAdvancedTransformation();
        boolean boolean20 = mongoDBRiverDefinition13.isDropCollection();
        java.lang.Object obj21 = docScoreSearchScript0.unwrap((java.lang.Object) boolean20);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder22.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder24.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.mongoLocalUser("bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder28.statisticsIndexName("port");
        java.lang.Object obj33 = docScoreSearchScript0.unwrap((java.lang.Object) "port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder34.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder38.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder40.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder42.includeCollection("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder42.mongoLocalPassword("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder46.script("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder46.mongoSecondaryReadPreference(true);
        java.lang.Object obj51 = docScoreSearchScript0.unwrap((java.lang.Object) builder50);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder53.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder55.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition58 = builder55.build();
        java.lang.String str59 = mongoDBRiverDefinition58.getRiverIndexName();
        boolean boolean60 = mongoDBRiverDefinition58.isDisableIndexRefresh();
        boolean boolean61 = mongoDBRiverDefinition58.isStoreStatistics();
        java.lang.String str62 = mongoDBRiverDefinition58.getMongoLocalPassword();
        java.lang.String str63 = mongoDBRiverDefinition58.getScriptType();
        boolean boolean64 = mongoDBRiverDefinition58.isMongoGridFS();
        docScoreSearchScript0.setNextVar("servers", (java.lang.Object) mongoDBRiverDefinition58);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(100);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1266");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_timeout", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1267");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("filter", "advanced_transformation.advanced_transformation");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1268");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("exclude_fields", "collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1269");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("exclude_fields", "bulk_timeout.bulk_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1270");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "");
        docScoreSearchScript0.setNextScore((float) (-1L));
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder5.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder13.includeCollection("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder13.mongoLocalPassword("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder13.mongoAdminUser("db");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder13.mongoDb("db");
        java.lang.Object obj22 = docScoreSearchScript0.unwrap((java.lang.Object) builder13);
        docScoreSearchScript0.setNextScore((float) 10);
        docScoreSearchScript0.setNextScore((float) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double27 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1271");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("socket_timeout", "script.script");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1272");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("password", "include_collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1273");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("host", "concurrent_bulk_requests");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1274");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("gridfs", "host.host");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1275");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) "bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = builder6.build();
        java.lang.String str10 = mongoDBRiverDefinition9.getIncludeCollection();
        boolean boolean11 = mongoDBRiverDefinition9.isMongoSSLVerifyCertificate();
        java.lang.String str12 = mongoDBRiverDefinition9.getIndexName();
        java.lang.Object obj13 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition9);
        docScoreSearchScript0.setNextScore((float) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.mongoGridFS(true);
        java.lang.String[] strArray31 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder20.includeFields((java.util.Set<java.lang.String>) strSet32);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.socketTimeout((int) (byte) 10);
        java.lang.Object obj37 = docScoreSearchScript0.unwrap((java.lang.Object) (byte) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder39.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder41.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition44 = builder41.build();
        boolean boolean45 = mongoDBRiverDefinition44.isDisableIndexRefresh();
        boolean boolean46 = mongoDBRiverDefinition44.isDisableIndexRefresh();
        boolean boolean47 = mongoDBRiverDefinition44.isAdvancedTransformation();
        boolean boolean48 = mongoDBRiverDefinition44.isDisableIndexRefresh();
        docScoreSearchScript0.setNextVar("credentials", (java.lang.Object) boolean48);
        docScoreSearchScript0.setNextScore((float) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float52 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1276");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("ssl_verify_certificate", "host");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1277");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("flush_interval", "host.host");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1278");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("actions", "socket_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1279");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder8.mongoLocalUser("parent_types");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder8.mongoSSLVerifyCertificate(false);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) builder14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj16 = docScoreSearchScript0.run();
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1280");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("socket_timeout.socket_timeout", "local");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1281");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("advanced_transformation", "bulk");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1282");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 10.0f);
        docScoreSearchScript0.setNextScore((float) (-1L));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj5 = docScoreSearchScript0.run();
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1283");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder8.mongoLocalUser("parent_types");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder8.mongoSSLVerifyCertificate(false);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) builder14);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.statisticsIndexName("store_statistics");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder23.throttleSize((int) (short) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder23.advancedTransformation(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder23.indexName("password");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder23.scriptType("user");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder33.skipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder33.includeCollection("include_fields");
        docScoreSearchScript0.setNextVar("ssl", (java.lang.Object) "include_fields");
        docScoreSearchScript0.setNextScore((float) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(1);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1284");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("host", "script");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1285");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("store_statistics", "collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1286");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("type", "actions");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1287");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("drop_collection", "flush_interval");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1288");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script_type", "skip_initial_import.skip_initial_import");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1289");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("secondary_read_preference", "ssl_verify_certificate");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1290");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) "bulk_timeout");
        docScoreSearchScript0.setNextScore((float) 10L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.indexName("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder14.statisticsTypeName("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder19.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder19.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.mongoGridFS(true);
        java.lang.String[] strArray41 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet42 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet42, strArray41);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder30.includeFields((java.util.Set<java.lang.String>) strSet42);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder25.excludeFields((java.util.Set<java.lang.String>) strSet42);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder18.excludeFields((java.util.Set<java.lang.String>) strSet42);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition47 = builder18.build();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder18.connectTimeout((int) 'a');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder50.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder52.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition55 = builder52.build();
        boolean boolean56 = mongoDBRiverDefinition55.isDisableIndexRefresh();
        boolean boolean57 = mongoDBRiverDefinition55.isDisableIndexRefresh();
        int int58 = mongoDBRiverDefinition55.getThrottleSize();
        int int59 = mongoDBRiverDefinition55.getSocketTimeout();
        boolean boolean60 = mongoDBRiverDefinition55.isDisableIndexRefresh();
        java.util.List<com.mongodb.ServerAddress> serverAddressList61 = mongoDBRiverDefinition55.getMongoServers();
        java.lang.String str62 = mongoDBRiverDefinition55.getMongoOplogNamespace();
        java.util.Set<java.lang.String> strSet63 = mongoDBRiverDefinition55.getParentTypes();
        java.lang.String str64 = mongoDBRiverDefinition55.getScriptType();
        java.lang.String str65 = mongoDBRiverDefinition55.getMongoDb();
        boolean boolean66 = mongoDBRiverDefinition55.isMongoSSLVerifyCertificate();
        java.util.List<com.mongodb.ServerAddress> serverAddressList67 = mongoDBRiverDefinition55.getMongoServers();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder68 = builder18.mongoServers(serverAddressList67);
        java.lang.Object obj69 = docScoreSearchScript0.unwrap((java.lang.Object) builder18);
        docScoreSearchScript0.setNextScore((float) 0L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder72 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder74 = builder72.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder76 = builder74.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition77 = builder74.build();
        java.lang.String str78 = mongoDBRiverDefinition77.getIncludeCollection();
        com.mongodb.MongoClientOptions mongoClientOptions79 = mongoDBRiverDefinition77.getMongoClientOptions();
        java.lang.String str80 = mongoDBRiverDefinition77.getTypeName();
        java.lang.String str81 = mongoDBRiverDefinition77.getMongoLocalPassword();
        java.lang.String str82 = mongoDBRiverDefinition77.getStatisticsIndexName();
        java.lang.String str83 = mongoDBRiverDefinition77.getMongoCollection();
        java.lang.Object obj84 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition77);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double85 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1291");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("local", "bulk_size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1292");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 10.0f);
        docScoreSearchScript0.setNextScore((float) (-1L));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float5 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1293");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("advanced_transformation.advanced_transformation", "socket_timeout.socket_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1294");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("skip_initial_import.skip_initial_import", "exclude_fields");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1295");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("include_fields", "actions");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1296");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) "bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder5.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder13.includeCollection("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder13.mongoLocalPassword("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder13.mongoAdminUser("db");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder13.mongoAdminPassword("skip_initial_import");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder22.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder22.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder30.indexName("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder30.statisticsTypeName("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder35.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder35.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder35.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder42.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder44.mongoGridFS(true);
        java.lang.String[] strArray57 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet58 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet58, strArray57);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder46.includeFields((java.util.Set<java.lang.String>) strSet58);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = builder41.excludeFields((java.util.Set<java.lang.String>) strSet58);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = builder34.excludeFields((java.util.Set<java.lang.String>) strSet58);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = builder13.excludeFields((java.util.Set<java.lang.String>) strSet58);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder65 = builder63.dropCollection(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder67 = builder63.storeStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder69 = builder63.mongoCollection("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder71 = builder69.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder72 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder74 = builder72.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder76 = builder74.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition77 = builder74.build();
        java.lang.String str78 = mongoDBRiverDefinition77.getIncludeCollection();
        boolean boolean79 = mongoDBRiverDefinition77.isMongoSSLVerifyCertificate();
        java.lang.String str80 = mongoDBRiverDefinition77.getMongoAdminPassword();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp81 = mongoDBRiverDefinition77.getInitialTimestamp();
        java.util.List<com.mongodb.ServerAddress> serverAddressList82 = mongoDBRiverDefinition77.getMongoServers();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder83 = builder69.mongoServers(serverAddressList82);
        docScoreSearchScript0.setNextVar("script", (java.lang.Object) serverAddressList82);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float85 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1297");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("actions", "hi!");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1298");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("db", "concurrent_bulk_requests");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1299");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) "bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = builder6.build();
        java.lang.String str10 = mongoDBRiverDefinition9.getIncludeCollection();
        boolean boolean11 = mongoDBRiverDefinition9.isMongoSSLVerifyCertificate();
        java.lang.String str12 = mongoDBRiverDefinition9.getIndexName();
        java.lang.Object obj13 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder14.includeCollection("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.mongoDb("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.statisticsIndexName("password");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder22.includeCollection("null.");
        java.lang.Object obj25 = docScoreSearchScript0.unwrap((java.lang.Object) "null.");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder27.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder27.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder36.mongoGridFS(true);
        java.lang.String[] strArray49 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet50 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet50, strArray49);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder38.includeFields((java.util.Set<java.lang.String>) strSet50);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder33.excludeFields((java.util.Set<java.lang.String>) strSet50);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder33.storeStatistics(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder33.riverIndexName("actions");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = builder33.script("bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = builder33.mongoAdminPassword("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = builder61.riverIndexName("credentials");
        docScoreSearchScript0.setNextVar("collection", (java.lang.Object) "credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder65 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder67 = builder65.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder69 = builder65.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder71 = builder65.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder73 = builder65.riverName("script_type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder75 = builder73.importAllCollections(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder77 = builder73.mongoAdminPassword("type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder79 = builder73.storeStatistics(true);
        java.lang.Object obj80 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder81 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder83 = builder81.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder85 = builder83.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition86 = builder83.build();
        java.lang.String str87 = mongoDBRiverDefinition86.getIncludeCollection();
        java.lang.String str88 = mongoDBRiverDefinition86.getMongoAdminPassword();
        java.lang.String str89 = mongoDBRiverDefinition86.getMongoDb();
        int int90 = mongoDBRiverDefinition86.getSocketTimeout();
        boolean boolean91 = mongoDBRiverDefinition86.isMongoSecondaryReadPreference();
        boolean boolean92 = mongoDBRiverDefinition86.isStoreStatistics();
        java.lang.String str93 = mongoDBRiverDefinition86.getStatisticsTypeName();
        boolean boolean94 = mongoDBRiverDefinition86.isDisableIndexRefresh();
        java.lang.Object obj95 = docScoreSearchScript0.unwrap((java.lang.Object) boolean94);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(1);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1300");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("skip_initial_import.skip_initial_import", "initial_timestamp");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1301");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("name", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1302");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 10.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder3.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = builder5.build();
        boolean boolean9 = mongoDBRiverDefinition8.isDisableIndexRefresh();
        boolean boolean10 = mongoDBRiverDefinition8.isDropCollection();
        java.lang.String str11 = mongoDBRiverDefinition8.getMongoAdminPassword();
        java.util.List<com.mongodb.ServerAddress> serverAddressList12 = mongoDBRiverDefinition8.getMongoServers();
        boolean boolean13 = mongoDBRiverDefinition8.isMongoSecondaryReadPreference();
        java.lang.String str14 = mongoDBRiverDefinition8.getScriptType();
        java.lang.String str15 = mongoDBRiverDefinition8.getIncludeCollection();
        java.lang.String str16 = mongoDBRiverDefinition8.getScriptType();
        boolean boolean17 = mongoDBRiverDefinition8.isSkipInitialImport();
        java.util.Set<java.lang.String> strSet18 = mongoDBRiverDefinition8.getParentTypes();
        java.lang.String str19 = mongoDBRiverDefinition8.getStatisticsIndexName();
        java.lang.String str20 = mongoDBRiverDefinition8.getStatisticsIndexName();
        java.lang.String str21 = mongoDBRiverDefinition8.getMongoLocalUser();
        java.lang.Object obj22 = docScoreSearchScript0.unwrap((java.lang.Object) str21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj23 = docScoreSearchScript0.run();
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1303");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("include_fields", "exclude_fields");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1304");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) "bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.includeCollection("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder12.mongoLocalPassword("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder12.statisticsIndexName("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder12.statisticsIndexName("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.riverName("secondary_read_preference");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder22.statisticsTypeName("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder22.advancedTransformation(false);
        java.lang.Object obj27 = docScoreSearchScript0.unwrap((java.lang.Object) builder26);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder29.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder31.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder33.mongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder36.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder38.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition41 = builder38.build();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder38.riverName("store_statistics");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder38.riverIndexName("throttle_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder38.typeName("include_collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder47.throttleSize(8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder47.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder52.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder54.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition57 = builder54.build();
        java.lang.String str58 = mongoDBRiverDefinition57.getRiverIndexName();
        boolean boolean59 = mongoDBRiverDefinition57.isDisableIndexRefresh();
        boolean boolean60 = mongoDBRiverDefinition57.isStoreStatistics();
        java.lang.String str61 = mongoDBRiverDefinition57.getMongoAdminUser();
        java.lang.String str62 = mongoDBRiverDefinition57.getScript();
        java.lang.String str63 = mongoDBRiverDefinition57.getScriptType();
        int int64 = mongoDBRiverDefinition57.getConnectTimeout();
        com.mongodb.BasicDBObject basicDBObject65 = mongoDBRiverDefinition57.getMongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder66 = builder47.mongoCollectionFilter(basicDBObject65);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder67 = builder35.mongoCollectionFilter(basicDBObject65);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder68 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder70 = builder68.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder72 = builder70.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition73 = builder70.build();
        boolean boolean74 = mongoDBRiverDefinition73.isDisableIndexRefresh();
        boolean boolean75 = mongoDBRiverDefinition73.isDropCollection();
        java.lang.String str76 = mongoDBRiverDefinition73.getMongoAdminPassword();
        boolean boolean77 = mongoDBRiverDefinition73.isMongoSSLVerifyCertificate();
        java.lang.String str78 = mongoDBRiverDefinition73.getScript();
        java.lang.String str79 = mongoDBRiverDefinition73.getScript();
        java.util.List<com.mongodb.ServerAddress> serverAddressList80 = mongoDBRiverDefinition73.getMongoServers();
        java.util.List<com.mongodb.ServerAddress> serverAddressList81 = mongoDBRiverDefinition73.getMongoServers();
        java.util.Set<java.lang.String> strSet82 = mongoDBRiverDefinition73.getExcludeFields();
        com.mongodb.BasicDBObject basicDBObject83 = mongoDBRiverDefinition73.getMongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder84 = builder35.mongoCollectionFilter(basicDBObject83);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder86 = builder84.mongoAdminPassword("concurrent_bulk_requests");
        docScoreSearchScript0.setNextVar("skip_initial_import", (java.lang.Object) builder84);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) '#');
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1305");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "");
        docScoreSearchScript0.setNextScore((float) (-1L));
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder5.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder13.includeCollection("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder13.mongoLocalPassword("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder13.mongoAdminUser("db");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder13.mongoDb("db");
        java.lang.Object obj22 = docScoreSearchScript0.unwrap((java.lang.Object) builder13);
        docScoreSearchScript0.setNextScore((float) 10);
        docScoreSearchScript0.setNextScore((float) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long27 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1306");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey(".", "include_fields");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1307");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("initial_timestamp", "include_collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1308");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder8.mongoLocalUser("parent_types");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder8.mongoSSLVerifyCertificate(false);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) builder14);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.statisticsIndexName("store_statistics");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder23.throttleSize((int) (short) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder23.advancedTransformation(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder23.indexName("password");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder23.scriptType("user");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder33.skipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder33.includeCollection("include_fields");
        docScoreSearchScript0.setNextVar("ssl", (java.lang.Object) "include_fields");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder40.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder40.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder44.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder46.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder48.includeCollection("hi!");
        com.mongodb.ServerAddress[] serverAddressArray51 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList52 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList52, serverAddressArray51);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder48.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList52);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder48.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = builder48.typeName("actions");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder48.statisticsTypeName("disable_index_refresh.disable_index_refresh");
        docScoreSearchScript0.setNextVar("parent_types", (java.lang.Object) builder48);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long62 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1309");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder3.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.indexName("bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.mongoCollection("actions");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder11.throttleSize((int) (short) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.mongoCollection("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.mongoGridFS(true);
        java.lang.Object obj22 = docScoreSearchScript0.unwrap((java.lang.Object) builder21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(8);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1310");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("include_collection", "db");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1311");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("credentials", "credentials");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1312");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("drop_collection", "credentials");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1313");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("admin", "admin");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1314");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("port", "import_all_collections.import_all_collections");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1315");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("disable_index_refresh.disable_index_refresh", "user");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1316");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) "bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = builder6.build();
        java.lang.String str10 = mongoDBRiverDefinition9.getIncludeCollection();
        boolean boolean11 = mongoDBRiverDefinition9.isMongoSSLVerifyCertificate();
        java.lang.String str12 = mongoDBRiverDefinition9.getIndexName();
        java.lang.Object obj13 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition9);
        docScoreSearchScript0.setNextScore((float) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.mongoGridFS(true);
        java.lang.String[] strArray31 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder20.includeFields((java.util.Set<java.lang.String>) strSet32);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.socketTimeout((int) (byte) 10);
        java.lang.Object obj37 = docScoreSearchScript0.unwrap((java.lang.Object) (byte) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder39.mongoCollection("");
        java.lang.String[] strArray45 = new java.lang.String[] { "bulk", "bulk", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet46 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet46, strArray45);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder39.includeFields((java.util.Set<java.lang.String>) strSet46);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder48.throttleSize(1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder48.throttleSize(1000);
        docScoreSearchScript0.setNextVar("drop_collection", (java.lang.Object) builder48);
        docScoreSearchScript0.setNextScore((float) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float56 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1317");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("ssl_verify_certificate.ssl_verify_certificate", "user");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1318");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 10.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder3.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder3.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder3.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder3.riverName("script_type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.importAllCollections(false);
        java.lang.Object obj14 = docScoreSearchScript0.unwrap((java.lang.Object) builder13);
        docScoreSearchScript0.setNextScore((float) '4');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition23 = builder20.build();
        java.lang.String str24 = mongoDBRiverDefinition23.getIncludeCollection();
        boolean boolean25 = mongoDBRiverDefinition23.isMongoSSLVerifyCertificate();
        java.lang.String str26 = mongoDBRiverDefinition23.getIndexName();
        java.lang.String str27 = mongoDBRiverDefinition23.getMongoDb();
        com.mongodb.BasicDBObject basicDBObject28 = mongoDBRiverDefinition23.getMongoOplogFilter();
        java.util.List<com.mongodb.ServerAddress> serverAddressList29 = mongoDBRiverDefinition23.getMongoServers();
        java.util.Set<java.lang.String> strSet30 = mongoDBRiverDefinition23.getExcludeFields();
        docScoreSearchScript0.setNextVar("gridfs", (java.lang.Object) mongoDBRiverDefinition23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long32 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1319");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk", ".");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1320");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("host.host", "advanced_transformation");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1321");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) "bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder5.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder13.includeCollection("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder13.mongoLocalPassword("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder13.statisticsIndexName("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder13.statisticsIndexName("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.statisticsIndexName("user");
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) builder23);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder25.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition30 = builder27.build();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder27.riverName("store_statistics");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition33 = builder32.build();
        int int34 = mongoDBRiverDefinition33.getSocketTimeout();
        java.lang.String str35 = mongoDBRiverDefinition33.getMongoLocalPassword();
        boolean boolean36 = mongoDBRiverDefinition33.isAdvancedTransformation();
        java.lang.Object obj37 = docScoreSearchScript0.unwrap((java.lang.Object) boolean36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) 'a');
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1322");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 10.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoGridFS(true);
        java.lang.String[] strArray19 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet20, strArray19);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder8.includeFields((java.util.Set<java.lang.String>) strSet20);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder23.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder29.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder31.indexName("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder31.statisticsTypeName("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder36.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder36.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder36.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder43.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder45.mongoGridFS(true);
        java.lang.String[] strArray58 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet59 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet59, strArray58);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = builder47.includeFields((java.util.Set<java.lang.String>) strSet59);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = builder42.excludeFields((java.util.Set<java.lang.String>) strSet59);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = builder35.excludeFields((java.util.Set<java.lang.String>) strSet59);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder64 = builder8.parentTypes((java.util.Set<java.lang.String>) strSet59);
        docScoreSearchScript0.setNextVar("skip_initial_import", (java.lang.Object) builder64);
        docScoreSearchScript0.setNextScore((float) 100L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj68 = docScoreSearchScript0.run();
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1323");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("skip_initial_import.skip_initial_import", "script_type");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1324");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("options", "user");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1325");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("exclude_fields", "import_all_collections");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1326");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) "bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.includeCollection("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder12.mongoLocalPassword("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder12.statisticsIndexName("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder12.statisticsIndexName("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.riverName("secondary_read_preference");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder22.statisticsTypeName("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder22.advancedTransformation(false);
        java.lang.Object obj27 = docScoreSearchScript0.unwrap((java.lang.Object) builder26);
        docScoreSearchScript0.setNextScore((float) (-1));
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder31.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder33.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition36 = builder33.build();
        boolean boolean37 = mongoDBRiverDefinition36.isDisableIndexRefresh();
        boolean boolean38 = mongoDBRiverDefinition36.isDisableIndexRefresh();
        java.lang.String str39 = mongoDBRiverDefinition36.getMongoLocalUser();
        java.lang.String str40 = mongoDBRiverDefinition36.getMongoAdminPassword();
        java.lang.String str41 = mongoDBRiverDefinition36.getMongoLocalUser();
        com.mongodb.BasicDBObject basicDBObject42 = mongoDBRiverDefinition36.getMongoCollectionFilter();
        boolean boolean43 = mongoDBRiverDefinition36.isMongoUseSSL();
        boolean boolean44 = mongoDBRiverDefinition36.isMongoSecondaryReadPreference();
        docScoreSearchScript0.setNextVar("concurrent_requests", (java.lang.Object) boolean44);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj46 = docScoreSearchScript0.run();
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1327");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("name", "store_statistics");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1328");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 10.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder3.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder3.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder3.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder3.riverName("script_type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.importAllCollections(false);
        java.lang.Object obj14 = docScoreSearchScript0.unwrap((java.lang.Object) builder13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder15.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.indexName("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder23.statisticsTypeName("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder23.indexName("size");
        java.lang.Object obj30 = docScoreSearchScript0.unwrap((java.lang.Object) "size");
        docScoreSearchScript0.setNextScore(0.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj33 = docScoreSearchScript0.run();
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1329");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) "bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = builder6.build();
        java.lang.String str10 = mongoDBRiverDefinition9.getIncludeCollection();
        boolean boolean11 = mongoDBRiverDefinition9.isMongoSSLVerifyCertificate();
        java.lang.String str12 = mongoDBRiverDefinition9.getIndexName();
        java.lang.Object obj13 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition9);
        docScoreSearchScript0.setNextScore((float) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.mongoGridFS(true);
        java.lang.String[] strArray31 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder20.includeFields((java.util.Set<java.lang.String>) strSet32);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.socketTimeout((int) (byte) 10);
        java.lang.Object obj37 = docScoreSearchScript0.unwrap((java.lang.Object) (byte) 10);
        docScoreSearchScript0.setNextScore((float) 100);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory41 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder42.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder44.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition47 = builder44.build();
        java.lang.String str48 = mongoDBRiverDefinition47.getRiverIndexName();
        boolean boolean49 = mongoDBRiverDefinition47.isDisableIndexRefresh();
        java.util.Set<java.lang.String> strSet50 = mongoDBRiverDefinition47.getIncludeFields();
        java.lang.String str51 = mongoDBRiverDefinition47.getMongoLocalPassword();
        com.mongodb.BasicDBObject basicDBObject52 = mongoDBRiverDefinition47.getMongoCollectionFilter();
        org.elasticsearch.script.ExecutableScript executableScript53 = docScoreNativeScriptFactory41.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject52);
        docScoreSearchScript0.setNextVar("", (java.lang.Object) docScoreNativeScriptFactory41);
        docScoreSearchScript0.setNextScore((-1.0f));
        docScoreSearchScript0.setNextScore((float) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long59 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1330");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("actions", "gridfs");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1331");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("socket_timeout", "bulk_timeout.bulk_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1332");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("user", "hi!");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1333");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("password", "collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1334");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) "bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = builder6.build();
        java.lang.String str10 = mongoDBRiverDefinition9.getIncludeCollection();
        boolean boolean11 = mongoDBRiverDefinition9.isMongoSSLVerifyCertificate();
        java.lang.String str12 = mongoDBRiverDefinition9.getIndexName();
        java.lang.Object obj13 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition9);
        docScoreSearchScript0.setNextScore((float) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.mongoGridFS(true);
        java.lang.String[] strArray31 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder20.includeFields((java.util.Set<java.lang.String>) strSet32);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.socketTimeout((int) (byte) 10);
        java.lang.Object obj37 = docScoreSearchScript0.unwrap((java.lang.Object) (byte) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder39.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder41.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition44 = builder41.build();
        boolean boolean45 = mongoDBRiverDefinition44.isDisableIndexRefresh();
        boolean boolean46 = mongoDBRiverDefinition44.isDisableIndexRefresh();
        boolean boolean47 = mongoDBRiverDefinition44.isAdvancedTransformation();
        boolean boolean48 = mongoDBRiverDefinition44.isDisableIndexRefresh();
        docScoreSearchScript0.setNextVar("credentials", (java.lang.Object) boolean48);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long50 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1335");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("name", "concurrent_bulk_requests");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1336");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("hi!", "user");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1337");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) "bulk_timeout");
        docScoreSearchScript0.setNextScore((float) (byte) -1);
        docScoreSearchScript0.setNextScore((float) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float8 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1338");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) "bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder4.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder12.includeCollection("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder12.mongoLocalPassword("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder12.statisticsIndexName("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder12.statisticsIndexName("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.riverName("secondary_read_preference");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder22.statisticsTypeName("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder22.advancedTransformation(false);
        java.lang.Object obj27 = docScoreSearchScript0.unwrap((java.lang.Object) builder26);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder29.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder31.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder33.mongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder36.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder38.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition41 = builder38.build();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder38.riverName("store_statistics");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder38.riverIndexName("throttle_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder38.typeName("include_collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder47.throttleSize(8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder47.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder52.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder54.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition57 = builder54.build();
        java.lang.String str58 = mongoDBRiverDefinition57.getRiverIndexName();
        boolean boolean59 = mongoDBRiverDefinition57.isDisableIndexRefresh();
        boolean boolean60 = mongoDBRiverDefinition57.isStoreStatistics();
        java.lang.String str61 = mongoDBRiverDefinition57.getMongoAdminUser();
        java.lang.String str62 = mongoDBRiverDefinition57.getScript();
        java.lang.String str63 = mongoDBRiverDefinition57.getScriptType();
        int int64 = mongoDBRiverDefinition57.getConnectTimeout();
        com.mongodb.BasicDBObject basicDBObject65 = mongoDBRiverDefinition57.getMongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder66 = builder47.mongoCollectionFilter(basicDBObject65);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder67 = builder35.mongoCollectionFilter(basicDBObject65);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder68 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder70 = builder68.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder72 = builder70.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition73 = builder70.build();
        boolean boolean74 = mongoDBRiverDefinition73.isDisableIndexRefresh();
        boolean boolean75 = mongoDBRiverDefinition73.isDropCollection();
        java.lang.String str76 = mongoDBRiverDefinition73.getMongoAdminPassword();
        boolean boolean77 = mongoDBRiverDefinition73.isMongoSSLVerifyCertificate();
        java.lang.String str78 = mongoDBRiverDefinition73.getScript();
        java.lang.String str79 = mongoDBRiverDefinition73.getScript();
        java.util.List<com.mongodb.ServerAddress> serverAddressList80 = mongoDBRiverDefinition73.getMongoServers();
        java.util.List<com.mongodb.ServerAddress> serverAddressList81 = mongoDBRiverDefinition73.getMongoServers();
        java.util.Set<java.lang.String> strSet82 = mongoDBRiverDefinition73.getExcludeFields();
        com.mongodb.BasicDBObject basicDBObject83 = mongoDBRiverDefinition73.getMongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder84 = builder35.mongoCollectionFilter(basicDBObject83);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder86 = builder84.mongoAdminPassword("concurrent_bulk_requests");
        docScoreSearchScript0.setNextVar("skip_initial_import", (java.lang.Object) builder84);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj88 = docScoreSearchScript0.run();
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1339");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("hi!", "host");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest2.test1340");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder1.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder3.mongoGridFS(true);
        java.lang.String[] strArray16 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder5.includeFields((java.util.Set<java.lang.String>) strSet17);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder20.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder24.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.indexName("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder28.statisticsTypeName("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder33.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder33.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder33.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder40.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder42.mongoGridFS(true);
        java.lang.String[] strArray55 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet56 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet56, strArray55);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = builder44.includeFields((java.util.Set<java.lang.String>) strSet56);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = builder39.excludeFields((java.util.Set<java.lang.String>) strSet56);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder32.excludeFields((java.util.Set<java.lang.String>) strSet56);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = builder5.parentTypes((java.util.Set<java.lang.String>) strSet56);
        java.lang.Object obj62 = docScoreSearchScript0.unwrap((java.lang.Object) builder5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (short) -1);
    }
}

