import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0501");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj42 = docScoreSearchScript0.run();
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0502");
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
        docScoreSearchScript0.setNextScore((float) 10L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float23 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0503");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("password", "script");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0504");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("size", "password");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0505");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double42 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0506");
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
        docScoreSearchScript0.setNextDocId((int) (short) 10);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0507");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("index", "localhost");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0508");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("disable_index_refresh.disable_index_refresh", "bulk_size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0509");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("collection", "type");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0510");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("collection", "local");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0511");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("credentials", "connect_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0512");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("concurrent_requests", "import_all_collections.import_all_collections");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0513");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script", "admin");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0514");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("skip_initial_import", "index");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0515");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long38 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0516");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("filter", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0517");
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
        long long22 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0518");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("actions", "null.");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0519");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("actions", "skip_initial_import");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0520");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long72 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0521");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("connect_timeout", "connect_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0522");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("disable_index_refresh", "filter");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0523");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("secondary_read_preference", "parent_types");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0524");
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
        double double25 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0525");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("flush_interval", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0526");
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
        double double50 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0527");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("gridfs", "index");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0528");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("concurrent_bulk_requests", "bulk");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0529");
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
        long long54 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0530");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("actions", "admin");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0531");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("include_fields", "hi!");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0532");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("advanced_transformation", "db");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0533");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "");
        docScoreSearchScript0.setNextScore((float) (-1L));
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder5.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder13.indexName("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder15.mongoLocalPassword("local");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder22.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition25 = builder22.build();
        java.lang.String str26 = mongoDBRiverDefinition25.getRiverIndexName();
        boolean boolean27 = mongoDBRiverDefinition25.isDisableIndexRefresh();
        boolean boolean28 = mongoDBRiverDefinition25.isStoreStatistics();
        java.lang.String str29 = mongoDBRiverDefinition25.getMongoAdminUser();
        java.lang.String str30 = mongoDBRiverDefinition25.getScript();
        java.lang.String str31 = mongoDBRiverDefinition25.getScriptType();
        int int32 = mongoDBRiverDefinition25.getConnectTimeout();
        com.mongodb.BasicDBObject basicDBObject33 = mongoDBRiverDefinition25.getMongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder15.mongoOplogFilter(basicDBObject33);
        java.lang.Object obj35 = docScoreSearchScript0.unwrap((java.lang.Object) builder15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj36 = docScoreSearchScript0.run();
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0534");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("secondary_read_preference", "index");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0535");
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
        docScoreSearchScript0.setNextDocId((-1));
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0536");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = builder6.build();
        java.lang.String str10 = mongoDBRiverDefinition9.getIncludeCollection();
        boolean boolean11 = mongoDBRiverDefinition9.isMongoSSLVerifyCertificate();
        java.lang.String str12 = mongoDBRiverDefinition9.getIndexName();
        java.lang.String str13 = mongoDBRiverDefinition9.getScriptType();
        boolean boolean14 = mongoDBRiverDefinition9.isStoreStatistics();
        docScoreSearchScript0.setNextVar("skip_initial_import", (java.lang.Object) boolean14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float16 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0537");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("localhost", "drop_collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0538");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("flush_interval", "secondary_read_preference");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0539");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("port", "throttle_size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0540");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("filter", "bulk");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0541");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("store_statistics", "secondary_read_preference");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0542");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("concurrent_bulk_requests", "advanced_transformation");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0543");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_timeout.bulk_timeout", "localhost");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0544");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("index", "port");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0545");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("collection", "include_fields");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0546");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("size", "skip_initial_import");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0547");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("admin", "flush_interval");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0548");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_size", "port");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0549");
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
        java.lang.Object obj78 = docScoreSearchScript0.run();
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0550");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("socket_timeout", "hi!");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0551");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_timeout.bulk_timeout", "flush_interval");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0552");
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
        docScoreSearchScript0.setNextDocId(1);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0553");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("local", "exclude_fields");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0554");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("import_all_collections.import_all_collections", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0555");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(10);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0556");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 10.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder3.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder3.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder3.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder3.riverName("script_type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.importAllCollections(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder11.mongoAdminPassword("type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder11.mongoLocalPassword("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder11.script("include_collection");
        java.lang.Object obj20 = docScoreSearchScript0.unwrap((java.lang.Object) "include_collection");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj21 = docScoreSearchScript0.run();
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0557");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) "bulk_timeout");
        docScoreSearchScript0.setNextScore((float) (byte) -1);
        docScoreSearchScript0.setNextScore((float) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj8 = docScoreSearchScript0.run();
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0558");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("admin", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0559");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("size", "include_collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0560");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float56 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0561");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("connect_timeout", "db");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0562");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float38 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0563");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("include_collection", "connect_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0564");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("null.", "admin");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0565");
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
        double double16 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0566");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("options", "secondary_read_preference");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0567");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("servers", "name");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0568");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("name", "db");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0569");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("size", "flush_interval");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0570");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "import_all_collections.import_all_collections");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0571");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("filter", "db");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0572");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "");
        docScoreSearchScript0.setNextScore((float) (-1L));
        docScoreSearchScript0.setNextScore((float) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(10);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0573");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_timeout.bulk_timeout", "options");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0574");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("type", "disable_index_refresh.disable_index_refresh");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0575");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("gridfs", "servers");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0576");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double40 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0577");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("host", "socket_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0578");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("disable_index_refresh", "type");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0579");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("store_statistics", "advanced_transformation");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0580");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "actions");
        docScoreSearchScript0.setNextScore(0.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double5 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0581");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (byte) -1);
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0582");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("concurrent_requests", "skip_initial_import");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0583");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("size", "local");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0584");
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
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition23 = builder20.build();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder20.riverName("store_statistics");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder25.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder28.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder32.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder36.includeCollection("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder38.dropCollection(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder41.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder43.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder43.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder48.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder48.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder52.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder54.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = builder56.indexName("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder56.statisticsTypeName("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = builder61.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder65 = builder61.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder67 = builder61.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder68 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder70 = builder68.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder72 = builder70.mongoGridFS(true);
        java.lang.String[] strArray83 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet84 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet84, strArray83);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder86 = builder72.includeFields((java.util.Set<java.lang.String>) strSet84);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder87 = builder67.excludeFields((java.util.Set<java.lang.String>) strSet84);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder88 = builder60.excludeFields((java.util.Set<java.lang.String>) strSet84);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder89 = builder47.excludeFields((java.util.Set<java.lang.String>) strSet84);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder90 = builder38.excludeFields((java.util.Set<java.lang.String>) strSet84);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder91 = builder25.includeFields((java.util.Set<java.lang.String>) strSet84);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) builder91);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double93 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0585");
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
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition23 = builder20.build();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder20.riverName("store_statistics");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder25.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder28.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder32.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder36.includeCollection("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder38.dropCollection(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder41.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder43.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder43.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder48.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder48.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder52.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder54.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = builder56.indexName("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder56.statisticsTypeName("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = builder61.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder65 = builder61.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder67 = builder61.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder68 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder70 = builder68.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder72 = builder70.mongoGridFS(true);
        java.lang.String[] strArray83 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet84 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet84, strArray83);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder86 = builder72.includeFields((java.util.Set<java.lang.String>) strSet84);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder87 = builder67.excludeFields((java.util.Set<java.lang.String>) strSet84);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder88 = builder60.excludeFields((java.util.Set<java.lang.String>) strSet84);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder89 = builder47.excludeFields((java.util.Set<java.lang.String>) strSet84);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder90 = builder38.excludeFields((java.util.Set<java.lang.String>) strSet84);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder91 = builder25.includeFields((java.util.Set<java.lang.String>) strSet84);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) builder91);
        docScoreSearchScript0.setNextScore((float) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float95 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0586");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("include_fields", "admin");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0587");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("include_collection", "servers");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0588");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder3.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.statisticsIndexName("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.mongoAdminUser("gridfs");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.riverName("parent_types");
        java.lang.Object obj14 = docScoreSearchScript0.unwrap((java.lang.Object) builder11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long15 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0589");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj51 = docScoreSearchScript0.run();
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0590");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("parent_types", "advanced_transformation");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0591");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("advanced_transformation", "disable_index_refresh");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0592");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("parent_types", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0593");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("concurrent_requests", "script");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0594");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj3 = docScoreSearchScript0.run();
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0595");
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
        docScoreSearchScript0.setNextDocId((int) (byte) 0);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0596");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float19 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0597");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("include_fields", "host");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0598");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("credentials", "flush_interval");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0599");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("drop_collection", "disable_index_refresh");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0600");
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
        boolean boolean48 = mongoDBRiverDefinition47.isDisableIndexRefresh();
        boolean boolean49 = mongoDBRiverDefinition47.isDropCollection();
        java.lang.String str50 = mongoDBRiverDefinition47.getMongoAdminPassword();
        java.util.List<com.mongodb.ServerAddress> serverAddressList51 = mongoDBRiverDefinition47.getMongoServers();
        boolean boolean52 = mongoDBRiverDefinition47.isMongoSecondaryReadPreference();
        java.lang.String str53 = mongoDBRiverDefinition47.getScriptType();
        int int54 = mongoDBRiverDefinition47.getThrottleSize();
        boolean boolean55 = mongoDBRiverDefinition47.isAdvancedTransformation();
        java.lang.Object obj56 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition47);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long57 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0601");
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
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder41.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder43.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition46 = builder43.build();
        java.lang.String str47 = mongoDBRiverDefinition46.getIncludeCollection();
        boolean boolean48 = mongoDBRiverDefinition46.isMongoSSLVerifyCertificate();
        java.lang.String str49 = mongoDBRiverDefinition46.getIndexName();
        java.lang.String str50 = mongoDBRiverDefinition46.getMongoAdminUser();
        com.mongodb.MongoClientOptions mongoClientOptions51 = mongoDBRiverDefinition46.getMongoClientOptions();
        boolean boolean52 = mongoDBRiverDefinition46.isDisableIndexRefresh();
        java.lang.String str53 = mongoDBRiverDefinition46.getMongoOplogNamespace();
        boolean boolean54 = mongoDBRiverDefinition46.isAdvancedTransformation();
        docScoreSearchScript0.setNextVar("ssl", (java.lang.Object) mongoDBRiverDefinition46);
        docScoreSearchScript0.setNextScore((float) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double58 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0602");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("ssl", "localhost");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0603");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("user", "ssl");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0604");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("hi!", "name");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0605");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long51 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0606");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("disable_index_refresh.disable_index_refresh", "include_collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0607");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("null.", "hi!");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0608");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("actions", "include_collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0609");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long3 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0610");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script_type", "socket_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0611");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) "bulk_timeout");
        docScoreSearchScript0.setNextScore((float) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float6 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0612");
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
        double double42 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0613");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("ssl_verify_certificate", "bulk_timeout.bulk_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0614");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script_type", "include_fields");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0615");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("parent_types", "throttle_size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0616");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("socket_timeout", "type");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0617");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("throttle_size", "parent_types");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0618");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("concurrent_bulk_requests", "localhost");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0619");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("servers", "index");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0620");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("hi!", "skip_initial_import");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0621");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double52 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0622");
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
        java.lang.String str29 = mongoDBRiverDefinition23.getMongoCollection();
        java.lang.String str30 = mongoDBRiverDefinition23.getMongoLocalPassword();
        java.lang.String str31 = mongoDBRiverDefinition23.getMongoLocalUser();
        boolean boolean32 = mongoDBRiverDefinition23.isSkipInitialImport();
        java.lang.String str33 = mongoDBRiverDefinition23.getScript();
        docScoreSearchScript0.setNextVar("socket_timeout", (java.lang.Object) mongoDBRiverDefinition23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float35 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0623");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("admin", "bulk_size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0624");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("connect_timeout", "admin");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0625");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("null.", "disable_index_refresh");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0626");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_timeout", "script");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0627");
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
        double double32 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0628");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("import_all_collections", "type");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0629");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("localhost", "script");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0630");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("local", "name");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0631");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float31 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0632");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("store_statistics", "host");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0633");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("user", "import_all_collections.import_all_collections");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0634");
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
        docScoreSearchScript0.setNextDocId((int) ' ');
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0635");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("servers", "filter");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0636");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("port", "bulk_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0637");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_size", "hi!");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0638");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("servers", "parent_types");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0639");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("disable_index_refresh.disable_index_refresh", "concurrent_bulk_requests");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0640");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0641");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_size", "ssl");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0642");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("password", "filter");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0643");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double23 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0644");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("null.", "local");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0645");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("size", "localhost");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0646");
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
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder41.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder43.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition46 = builder43.build();
        java.lang.String str47 = mongoDBRiverDefinition46.getIncludeCollection();
        boolean boolean48 = mongoDBRiverDefinition46.isMongoSSLVerifyCertificate();
        java.lang.String str49 = mongoDBRiverDefinition46.getIndexName();
        java.lang.String str50 = mongoDBRiverDefinition46.getMongoAdminUser();
        com.mongodb.MongoClientOptions mongoClientOptions51 = mongoDBRiverDefinition46.getMongoClientOptions();
        boolean boolean52 = mongoDBRiverDefinition46.isDisableIndexRefresh();
        java.lang.String str53 = mongoDBRiverDefinition46.getMongoOplogNamespace();
        boolean boolean54 = mongoDBRiverDefinition46.isAdvancedTransformation();
        docScoreSearchScript0.setNextVar("ssl", (java.lang.Object) mongoDBRiverDefinition46);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double56 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0647");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("options", "script_type");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0648");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script", "port");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0649");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) "bulk_timeout");
        docScoreSearchScript0.setNextScore((float) 10L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float6 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0650");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("null.", "actions");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0651");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("servers", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0652");
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
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder25.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition30 = builder27.build();
        java.lang.String str31 = mongoDBRiverDefinition30.getRiverIndexName();
        boolean boolean32 = mongoDBRiverDefinition30.isDisableIndexRefresh();
        boolean boolean33 = mongoDBRiverDefinition30.isStoreStatistics();
        java.lang.String str34 = mongoDBRiverDefinition30.getMongoLocalPassword();
        java.lang.String str35 = mongoDBRiverDefinition30.getScriptType();
        java.util.List<com.mongodb.ServerAddress> serverAddressList36 = mongoDBRiverDefinition30.getMongoServers();
        java.lang.Object obj37 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (short) 1);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0653");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_size", "include_collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0654");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("include_fields", "bulk");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0655");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("include_collection", "include_fields");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0656");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_size", "secondary_read_preference");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0657");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("localhost", "admin");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0658");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("servers", "gridfs");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0659");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("host", "name");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0660");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) (short) 1);
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        docScoreSearchScript0.setNextScore((float) 1L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (short) 10);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0661");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script_type", "host");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0662");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script_type", "null.");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0663");
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
        float float27 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0664");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("concurrent_bulk_requests", "host");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0665");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("secondary_read_preference", "options");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0666");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("credentials", "socket_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0667");
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
        float float25 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0668");
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
        docScoreSearchScript0.setNextDocId((int) '#');
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0669");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("include_collection", "actions");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0670");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("disable_index_refresh", "include_fields");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0671");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("include_fields", "import_all_collections.import_all_collections");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0672");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("null.", "servers");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0673");
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
        java.lang.Object obj26 = docScoreSearchScript0.run();
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0674");
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
        java.lang.Object obj18 = docScoreSearchScript0.run();
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0675");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("ssl_verify_certificate", "servers");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0676");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("parent_types", "servers");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0677");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("ssl", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0678");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("null.", "drop_collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0679");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_timeout", "type");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0680");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("admin", "actions");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0681");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("flush_interval", "options");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0682");
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
        java.lang.String str45 = mongoDBRiverDefinition44.getRiverIndexName();
        boolean boolean46 = mongoDBRiverDefinition44.isDisableIndexRefresh();
        java.lang.String str47 = mongoDBRiverDefinition44.getMongoAdminUser();
        boolean boolean48 = mongoDBRiverDefinition44.isStoreStatistics();
        docScoreSearchScript0.setNextVar("", (java.lang.Object) boolean48);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (byte) -1);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0683");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double81 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0684");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("user", "advanced_transformation");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0685");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("concurrent_requests", "servers");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0686");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("secondary_read_preference", "filter");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0687");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk", "skip_initial_import");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0688");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj67 = docScoreSearchScript0.run();
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0689");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("secondary_read_preference", "bulk");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0690");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("port", "advanced_transformation");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0691");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("ssl", "index");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0692");
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
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder41.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder43.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition46 = builder43.build();
        java.lang.String str47 = mongoDBRiverDefinition46.getIncludeCollection();
        boolean boolean48 = mongoDBRiverDefinition46.isMongoSSLVerifyCertificate();
        java.lang.String str49 = mongoDBRiverDefinition46.getIndexName();
        java.lang.String str50 = mongoDBRiverDefinition46.getMongoAdminUser();
        com.mongodb.MongoClientOptions mongoClientOptions51 = mongoDBRiverDefinition46.getMongoClientOptions();
        boolean boolean52 = mongoDBRiverDefinition46.isDisableIndexRefresh();
        java.lang.String str53 = mongoDBRiverDefinition46.getMongoOplogNamespace();
        boolean boolean54 = mongoDBRiverDefinition46.isAdvancedTransformation();
        docScoreSearchScript0.setNextVar("ssl", (java.lang.Object) mongoDBRiverDefinition46);
        docScoreSearchScript0.setNextScore((float) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(8);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0693");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("port", "port");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0694");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script_type", "connect_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0695");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("disable_index_refresh", "concurrent_bulk_requests");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0696");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double67 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0697");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("hi!", "script_type");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0698");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("index", "concurrent_bulk_requests");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0699");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 10.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder3.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder3.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder3.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder3.riverName("script_type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.importAllCollections(false);
        java.lang.Object obj14 = docScoreSearchScript0.unwrap((java.lang.Object) builder13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(100);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0700");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("hi!", "collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0701");
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
        long long93 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0702");
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
        java.lang.Object obj98 = docScoreSearchScript0.run();
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0703");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_timeout", "null.");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0704");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script", "filter");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0705");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("user", "include_fields");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0706");
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
        double double98 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0707");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("size", "parent_types");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0708");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("user", "ssl_verify_certificate");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0709");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "secondary_read_preference");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0710");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("advanced_transformation", "host");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0711");
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
        double double18 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0712");
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
        java.lang.String str45 = mongoDBRiverDefinition44.getRiverIndexName();
        boolean boolean46 = mongoDBRiverDefinition44.isDisableIndexRefresh();
        java.lang.String str47 = mongoDBRiverDefinition44.getMongoAdminUser();
        boolean boolean48 = mongoDBRiverDefinition44.isStoreStatistics();
        docScoreSearchScript0.setNextVar("", (java.lang.Object) boolean48);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder50.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder50.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder54.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = builder56.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder58.includeCollection("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = builder58.mongoLocalPassword("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder64 = builder58.statisticsIndexName("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder66 = builder58.statisticsIndexName("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder68 = builder66.includeCollection("localhost");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder70 = builder66.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder72 = builder66.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder74 = builder72.riverIndexName("bulk_timeout");
        java.lang.Object obj75 = docScoreSearchScript0.unwrap((java.lang.Object) "bulk_timeout");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double76 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0713");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long81 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0714");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("localhost", "collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0715");
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
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder69 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder71 = builder69.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder73 = builder71.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition74 = builder71.build();
        java.lang.String str75 = mongoDBRiverDefinition74.getIncludeCollection();
        java.lang.String str76 = mongoDBRiverDefinition74.getMongoAdminPassword();
        boolean boolean77 = mongoDBRiverDefinition74.isMongoSSLVerifyCertificate();
        java.lang.String str78 = mongoDBRiverDefinition74.getScript();
        java.lang.String str79 = mongoDBRiverDefinition74.getScript();
        boolean boolean80 = mongoDBRiverDefinition74.isSkipInitialImport();
        com.mongodb.BasicDBObject basicDBObject81 = mongoDBRiverDefinition74.getMongoCollectionFilter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject81);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0716");
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
        docScoreSearchScript0.setNextScore((float) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double16 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0717");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("import_all_collections", "script");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0718");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("password", "credentials");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0719");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) '4');
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0720");
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
        float float31 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0721");
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
        boolean boolean48 = mongoDBRiverDefinition47.isDisableIndexRefresh();
        boolean boolean49 = mongoDBRiverDefinition47.isDropCollection();
        java.lang.String str50 = mongoDBRiverDefinition47.getMongoAdminPassword();
        java.util.List<com.mongodb.ServerAddress> serverAddressList51 = mongoDBRiverDefinition47.getMongoServers();
        boolean boolean52 = mongoDBRiverDefinition47.isMongoSecondaryReadPreference();
        java.lang.String str53 = mongoDBRiverDefinition47.getScriptType();
        int int54 = mongoDBRiverDefinition47.getThrottleSize();
        boolean boolean55 = mongoDBRiverDefinition47.isAdvancedTransformation();
        java.lang.Object obj56 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition47);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) ' ');
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0722");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "");
        docScoreSearchScript0.setNextScore((float) (-1));
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition10 = builder7.build();
        java.lang.String str11 = mongoDBRiverDefinition10.getIncludeCollection();
        boolean boolean12 = mongoDBRiverDefinition10.isMongoSSLVerifyCertificate();
        java.lang.String str13 = mongoDBRiverDefinition10.getIndexName();
        com.mongodb.MongoClientOptions mongoClientOptions14 = mongoDBRiverDefinition10.getMongoClientOptions();
        boolean boolean15 = mongoDBRiverDefinition10.isStoreStatistics();
        java.util.List<com.mongodb.ServerAddress> serverAddressList16 = mongoDBRiverDefinition10.getMongoServers();
        java.lang.Object obj17 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double18 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0723");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("localhost", "null.");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0724");
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
        java.lang.String str29 = mongoDBRiverDefinition23.getMongoCollection();
        java.lang.String str30 = mongoDBRiverDefinition23.getMongoLocalPassword();
        java.lang.String str31 = mongoDBRiverDefinition23.getMongoLocalUser();
        boolean boolean32 = mongoDBRiverDefinition23.isSkipInitialImport();
        java.lang.String str33 = mongoDBRiverDefinition23.getScript();
        docScoreSearchScript0.setNextVar("socket_timeout", (java.lang.Object) mongoDBRiverDefinition23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long35 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0725");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "servers");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0726");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("localhost", "import_all_collections");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0727");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("host", "admin");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0728");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("password", "include_fields");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0729");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_timeout.bulk_timeout", "bulk_size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0730");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("user", "disable_index_refresh");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0731");
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
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder31.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder33.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition36 = builder33.build();
        boolean boolean37 = mongoDBRiverDefinition36.isDisableIndexRefresh();
        boolean boolean38 = mongoDBRiverDefinition36.isDisableIndexRefresh();
        boolean boolean39 = mongoDBRiverDefinition36.isAdvancedTransformation();
        boolean boolean40 = mongoDBRiverDefinition36.isDisableIndexRefresh();
        com.mongodb.BasicDBObject basicDBObject41 = mongoDBRiverDefinition36.getMongoCollectionFilter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject41);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0732");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "disable_index_refresh.disable_index_refresh");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0733");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "concurrent_bulk_requests");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0734");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("flush_interval", "script");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0735");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double28 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0736");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script_type", "throttle_size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0737");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_size", "throttle_size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0738");
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
        docScoreSearchScript0.setNextDocId(0);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0739");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("options", "type");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0740");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("filter", "options");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0741");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("name", "servers");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0742");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("filter", "ssl");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0743");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("admin", "index");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0744");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_timeout.bulk_timeout", "disable_index_refresh");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0745");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("advanced_transformation", "ssl");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0746");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("skip_initial_import", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0747");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (short) 1);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0748");
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
        float float72 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0749");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("drop_collection", "bulk_timeout.bulk_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0750");
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
        docScoreSearchScript0.setNextScore(0.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float43 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0751");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("drop_collection", "bulk_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0752");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("skip_initial_import", "initial_timestamp");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0753");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("import_all_collections", "port");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0754");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script", "options");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0755");
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
        float float98 = docScoreSearchScript25.runAsFloat();
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0756");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("store_statistics", "servers");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0757");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("index", "bulk_size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0758");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("ssl", "secondary_read_preference");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0759");
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
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition24 = builder21.build();
        boolean boolean25 = mongoDBRiverDefinition24.isDisableIndexRefresh();
        boolean boolean26 = mongoDBRiverDefinition24.isDisableIndexRefresh();
        int int27 = mongoDBRiverDefinition24.getThrottleSize();
        java.lang.String str28 = mongoDBRiverDefinition24.getMongoAdminPassword();
        boolean boolean29 = mongoDBRiverDefinition24.isMongoSecondaryReadPreference();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) mongoDBRiverDefinition24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (short) 10);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0760");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("include_collection", "bulk");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0761");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) "bulk_timeout");
        docScoreSearchScript0.setNextScore((float) (byte) -1);
        docScoreSearchScript0.setNextScore((float) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double8 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0762");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("collection", "ssl");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0763");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("store_statistics", "concurrent_requests");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0764");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) "bulk_timeout");
        docScoreSearchScript0.setNextScore((float) 10L);
        docScoreSearchScript0.setNextScore((float) 1000);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float8 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0765");
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
        docScoreSearchScript0.setNextDocId((int) (byte) 1);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0766");
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
        java.lang.Object obj25 = docScoreSearchScript0.run();
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0767");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("db", "gridfs");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0768");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_size", "db");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0769");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("admin", "bulk_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0770");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("servers", "localhost");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0771");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float52 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0772");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("skip_initial_import", "filter");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0773");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("advanced_transformation", "type");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0774");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("servers", "import_all_collections");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0775");
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
        java.lang.Object obj55 = docScoreSearchScript0.run();
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0776");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("advanced_transformation", "socket_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0777");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk", "include_collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0778");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("ssl", "local");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0779");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("local", "throttle_size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0780");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_size", "bulk_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0781");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("user", "servers");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0782");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long67 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0783");
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
        long long18 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0784");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("store_statistics", "ssl");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0785");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("ssl", "bulk_timeout.bulk_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0786");
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
        docScoreSearchScript0.setNextScore((float) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj33 = docScoreSearchScript0.run();
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0787");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("user", "parent_types");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0788");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder4.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = builder6.build();
        java.lang.String str10 = mongoDBRiverDefinition9.getIncludeCollection();
        boolean boolean11 = mongoDBRiverDefinition9.isMongoSSLVerifyCertificate();
        java.lang.String str12 = mongoDBRiverDefinition9.getIndexName();
        java.lang.String str13 = mongoDBRiverDefinition9.getScriptType();
        boolean boolean14 = mongoDBRiverDefinition9.isStoreStatistics();
        docScoreSearchScript0.setNextVar("skip_initial_import", (java.lang.Object) boolean14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj16 = docScoreSearchScript0.run();
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0789");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double38 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0790");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script_type", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0791");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_timeout.bulk_timeout", "credentials");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0792");
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
        docScoreSearchScript0.setNextScore((float) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder17.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder17.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder24.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.mongoGridFS(true);
        java.lang.String[] strArray39 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet40 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet40, strArray39);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder28.includeFields((java.util.Set<java.lang.String>) strSet40);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder23.excludeFields((java.util.Set<java.lang.String>) strSet40);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder23.storeStatistics(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder45.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder47.riverName("include_fields");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder49.indexName("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder49.includeCollection("collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder49.includeCollection("actions");
        docScoreSearchScript0.setNextVar("filter", (java.lang.Object) builder55);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long57 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0793");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long81 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0794");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script", "host");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0795");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("ssl_verify_certificate", "options");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0796");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj81 = docScoreSearchScript0.run();
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0797");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("connect_timeout", "servers");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0798");
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
        docScoreSearchScript0.setNextScore((float) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double24 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0799");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("host", "concurrent_requests");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0800");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("host", "bulk_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0801");
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
        java.lang.String[] strArray23 = new java.lang.String[] { "bulk", "bulk", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder17.includeFields((java.util.Set<java.lang.String>) strSet24);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.throttleSize(1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder29.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder31.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition34 = builder31.build();
        boolean boolean35 = mongoDBRiverDefinition34.isDisableIndexRefresh();
        boolean boolean36 = mongoDBRiverDefinition34.isDropCollection();
        java.lang.String str37 = mongoDBRiverDefinition34.getMongoAdminPassword();
        com.mongodb.BasicDBObject basicDBObject38 = mongoDBRiverDefinition34.getMongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder26.mongoCollectionFilter(basicDBObject38);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) basicDBObject38);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder42.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder44.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder46.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder46.mongoLocalUser("parent_types");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder50.throttleSize((-1));
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder52.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder52.mongoAdminPassword("script");
        docScoreSearchScript0.setNextVar("credentials", (java.lang.Object) builder56);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(8);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0802");
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
        java.lang.String str45 = mongoDBRiverDefinition44.getRiverIndexName();
        boolean boolean46 = mongoDBRiverDefinition44.isDisableIndexRefresh();
        java.lang.String str47 = mongoDBRiverDefinition44.getMongoAdminUser();
        boolean boolean48 = mongoDBRiverDefinition44.isStoreStatistics();
        docScoreSearchScript0.setNextVar("", (java.lang.Object) boolean48);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj50 = docScoreSearchScript0.run();
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0803");
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
        docScoreSearchScript0.setNextScore((float) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj24 = docScoreSearchScript0.run();
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0804");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("exclude_fields", "parent_types");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0805");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("include_fields", "parent_types");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0806");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "user");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0807");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(100);
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0808");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("initial_timestamp", "db");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0809");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("servers", "host.filter");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0810");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("exclude_fields", "connect_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0811");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("type", "concurrent_bulk_requests");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0812");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("size", "host.filter");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0813");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double56 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0814");
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
        float float49 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0815");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("exclude_fields", "import_all_collections.import_all_collections");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0816");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(8);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0817");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("ssl_verify_certificate", "port");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0818");
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
        double double72 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0819");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("concurrent_requests", "concurrent_bulk_requests");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0820");
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
        java.lang.Object obj59 = docScoreSearchScript0.run();
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0821");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (byte) 100);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0822");
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
        java.lang.String str45 = mongoDBRiverDefinition44.getRiverIndexName();
        boolean boolean46 = mongoDBRiverDefinition44.isDisableIndexRefresh();
        java.lang.String str47 = mongoDBRiverDefinition44.getMongoAdminUser();
        boolean boolean48 = mongoDBRiverDefinition44.isStoreStatistics();
        docScoreSearchScript0.setNextVar("", (java.lang.Object) boolean48);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder50.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder50.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder54.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = builder56.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder58.includeCollection("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = builder58.mongoLocalPassword("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder64 = builder58.statisticsIndexName("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder66 = builder58.statisticsIndexName("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder68 = builder66.includeCollection("localhost");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder70 = builder66.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder72 = builder66.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder74 = builder72.riverIndexName("bulk_timeout");
        java.lang.Object obj75 = docScoreSearchScript0.unwrap((java.lang.Object) "bulk_timeout");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj76 = docScoreSearchScript0.run();
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0823");
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
        double double55 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0824");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("name", "ssl");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0825");
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
        docScoreSearchScript0.setNextDocId(27017);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0826");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("port", "type");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0827");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("throttle_size", "size.size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0828");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("options", "name");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0829");
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
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder72 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder74 = builder72.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder76 = builder74.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition77 = builder74.build();
        boolean boolean78 = mongoDBRiverDefinition77.isDisableIndexRefresh();
        java.lang.String str79 = mongoDBRiverDefinition77.getIncludeCollection();
        java.lang.String str80 = mongoDBRiverDefinition77.getMongoLocalPassword();
        int int81 = mongoDBRiverDefinition77.getSocketTimeout();
        java.lang.String str82 = mongoDBRiverDefinition77.getRiverName();
        com.mongodb.BasicDBObject basicDBObject83 = mongoDBRiverDefinition77.getMongoCollectionFilter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject83);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0830");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj81 = docScoreSearchScript0.run();
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0831");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("concurrent_requests", "null.");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0832");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("advanced_transformation.advanced_transformation", "user");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0833");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("advanced_transformation", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0834");
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
        long long21 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0835");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "");
        docScoreSearchScript0.setNextScore((float) (-1L));
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder5.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder13.indexName("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.connectTimeout((int) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder15.mongoLocalPassword("local");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder22.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition25 = builder22.build();
        java.lang.String str26 = mongoDBRiverDefinition25.getRiverIndexName();
        boolean boolean27 = mongoDBRiverDefinition25.isDisableIndexRefresh();
        boolean boolean28 = mongoDBRiverDefinition25.isStoreStatistics();
        java.lang.String str29 = mongoDBRiverDefinition25.getMongoAdminUser();
        java.lang.String str30 = mongoDBRiverDefinition25.getScript();
        java.lang.String str31 = mongoDBRiverDefinition25.getScriptType();
        int int32 = mongoDBRiverDefinition25.getConnectTimeout();
        com.mongodb.BasicDBObject basicDBObject33 = mongoDBRiverDefinition25.getMongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder15.mongoOplogFilter(basicDBObject33);
        java.lang.Object obj35 = docScoreSearchScript0.unwrap((java.lang.Object) builder15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long36 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0836");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder3.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.statisticsIndexName("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.mongoAdminUser("gridfs");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.riverName("parent_types");
        java.lang.Object obj14 = docScoreSearchScript0.unwrap((java.lang.Object) builder11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (byte) 1);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0837");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_size", "index");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0838");
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
        double double68 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0839");
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
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder41.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder43.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition46 = builder43.build();
        java.lang.String str47 = mongoDBRiverDefinition46.getIncludeCollection();
        boolean boolean48 = mongoDBRiverDefinition46.isMongoSSLVerifyCertificate();
        java.lang.String str49 = mongoDBRiverDefinition46.getIndexName();
        java.lang.String str50 = mongoDBRiverDefinition46.getMongoAdminUser();
        com.mongodb.MongoClientOptions mongoClientOptions51 = mongoDBRiverDefinition46.getMongoClientOptions();
        boolean boolean52 = mongoDBRiverDefinition46.isDisableIndexRefresh();
        java.lang.String str53 = mongoDBRiverDefinition46.getMongoOplogNamespace();
        boolean boolean54 = mongoDBRiverDefinition46.isAdvancedTransformation();
        docScoreSearchScript0.setNextVar("ssl", (java.lang.Object) mongoDBRiverDefinition46);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = builder57.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = builder59.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition62 = builder59.build();
        java.lang.String str63 = mongoDBRiverDefinition62.getIncludeCollection();
        boolean boolean64 = mongoDBRiverDefinition62.isMongoSSLVerifyCertificate();
        java.lang.String str65 = mongoDBRiverDefinition62.getIndexName();
        java.lang.String str66 = mongoDBRiverDefinition62.getMongoDb();
        com.mongodb.BasicDBObject basicDBObject67 = mongoDBRiverDefinition62.getMongoOplogFilter();
        com.mongodb.MongoClientOptions mongoClientOptions68 = mongoDBRiverDefinition62.getMongoClientOptions();
        boolean boolean69 = mongoDBRiverDefinition62.isSkipInitialImport();
        java.lang.String str70 = mongoDBRiverDefinition62.getIncludeCollection();
        java.lang.String str71 = mongoDBRiverDefinition62.getStatisticsTypeName();
        java.lang.String str72 = mongoDBRiverDefinition62.getMongoAdminPassword();
        docScoreSearchScript0.setNextVar("disable_index_refresh.disable_index_refresh", (java.lang.Object) str72);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float74 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0840");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("socket_timeout", "gridfs");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0841");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("include_fields", "connect_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0842");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("ssl_verify_certificate", "filter");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0843");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("host", "local");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0844");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long28 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0845");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("import_all_collections.import_all_collections", "local");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0846");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("ssl_verify_certificate", "type");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0847");
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
        docScoreSearchScript0.setNextDocId((int) '#');
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0848");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) 10.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder3.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder3.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder3.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder3.riverName("script_type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.importAllCollections(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder11.mongoAdminPassword("type");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder11.mongoLocalPassword("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder11.script("include_collection");
        java.lang.Object obj20 = docScoreSearchScript0.unwrap((java.lang.Object) "include_collection");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double21 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0849");
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
        double double65 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0850");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (short) 1);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0851");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("hi!", "options");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0852");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("admin", "advanced_transformation.advanced_transformation");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0853");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("actions", "credentials");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0854");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_timeout", "advanced_transformation");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0855");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("advanced_transformation.advanced_transformation", "bulk_size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0856");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script", "name");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0857");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("socket_timeout", "host.filter");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0858");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("skip_initial_import", "type");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0859");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("import_all_collections", "admin");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0860");
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
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder25.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder25.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder25.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder32.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.mongoGridFS(true);
        java.lang.String[] strArray47 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet48 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet48, strArray47);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder36.includeFields((java.util.Set<java.lang.String>) strSet48);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder31.excludeFields((java.util.Set<java.lang.String>) strSet48);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = builder31.storeStatistics(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder31.riverIndexName("actions");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder31.script("bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = builder57.mongoUseSSL(true);
        java.lang.Object obj60 = docScoreSearchScript0.unwrap((java.lang.Object) builder59);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double61 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0861");
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
        long long70 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0862");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script", "store_statistics");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0863");
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
        java.lang.Object obj27 = docScoreSearchScript0.run();
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0864");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) '#');
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0865");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("filter", "filter");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0866");
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
        docScoreSearchScript0.setNextDocId(0);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0867");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("disable_index_refresh.disable_index_refresh", "advanced_transformation");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0868");
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
        double double26 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0869");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj79 = docScoreSearchScript0.run();
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0870");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("localhost", "credentials");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0871");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "");
        docScoreSearchScript0.setNextScore((float) (-1L));
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder6.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder6.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder13.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.mongoGridFS(true);
        java.lang.String[] strArray28 = new java.lang.String[] { "credentials", "disable_index_refresh", "type", "bulk_size", "hi!", "servers", "bulk_size", "disable_index_refresh", "drop_collection", "credentials" };
        java.util.LinkedHashSet<java.lang.String> strSet29 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet29, strArray28);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder17.includeFields((java.util.Set<java.lang.String>) strSet29);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder12.excludeFields((java.util.Set<java.lang.String>) strSet29);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder12.storeStatistics(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder12.throttleSize(0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder36.advancedTransformation(true);
        docScoreSearchScript0.setNextVar("connect_timeout", (java.lang.Object) builder36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double40 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0872");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("concurrent_requests", "initial_timestamp");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0873");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("skip_initial_import.skip_initial_import", "import_all_collections");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0874");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("user", "skip_initial_import.skip_initial_import");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0875");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (byte) 0);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0876");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("hi!", "filter");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0877");
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
        boolean boolean48 = mongoDBRiverDefinition47.isDisableIndexRefresh();
        boolean boolean49 = mongoDBRiverDefinition47.isDropCollection();
        java.lang.String str50 = mongoDBRiverDefinition47.getMongoAdminPassword();
        java.util.List<com.mongodb.ServerAddress> serverAddressList51 = mongoDBRiverDefinition47.getMongoServers();
        boolean boolean52 = mongoDBRiverDefinition47.isMongoSecondaryReadPreference();
        java.lang.String str53 = mongoDBRiverDefinition47.getScriptType();
        int int54 = mongoDBRiverDefinition47.getThrottleSize();
        boolean boolean55 = mongoDBRiverDefinition47.isAdvancedTransformation();
        java.lang.Object obj56 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition47);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj57 = docScoreSearchScript0.run();
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0878");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("servers", "size.size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0879");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "hi!");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0880");
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
        boolean boolean48 = mongoDBRiverDefinition47.isDisableIndexRefresh();
        boolean boolean49 = mongoDBRiverDefinition47.isDropCollection();
        java.lang.String str50 = mongoDBRiverDefinition47.getMongoAdminPassword();
        java.util.List<com.mongodb.ServerAddress> serverAddressList51 = mongoDBRiverDefinition47.getMongoServers();
        boolean boolean52 = mongoDBRiverDefinition47.isMongoSecondaryReadPreference();
        java.lang.String str53 = mongoDBRiverDefinition47.getScriptType();
        int int54 = mongoDBRiverDefinition47.getThrottleSize();
        boolean boolean55 = mongoDBRiverDefinition47.isAdvancedTransformation();
        java.lang.Object obj56 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition47);
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float59 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0881");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("exclude_fields", "script_type");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0882");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) "bulk_timeout");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj4 = docScoreSearchScript0.run();
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0883");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script_type", "index");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0884");
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
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder41.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder43.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition46 = builder43.build();
        java.lang.String str47 = mongoDBRiverDefinition46.getIncludeCollection();
        boolean boolean48 = mongoDBRiverDefinition46.isMongoSSLVerifyCertificate();
        java.lang.String str49 = mongoDBRiverDefinition46.getIndexName();
        java.lang.String str50 = mongoDBRiverDefinition46.getMongoAdminUser();
        com.mongodb.MongoClientOptions mongoClientOptions51 = mongoDBRiverDefinition46.getMongoClientOptions();
        boolean boolean52 = mongoDBRiverDefinition46.isDisableIndexRefresh();
        java.lang.String str53 = mongoDBRiverDefinition46.getMongoOplogNamespace();
        boolean boolean54 = mongoDBRiverDefinition46.isAdvancedTransformation();
        docScoreSearchScript0.setNextVar("ssl", (java.lang.Object) mongoDBRiverDefinition46);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = builder57.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = builder59.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition62 = builder59.build();
        java.lang.String str63 = mongoDBRiverDefinition62.getIncludeCollection();
        boolean boolean64 = mongoDBRiverDefinition62.isMongoSSLVerifyCertificate();
        java.lang.String str65 = mongoDBRiverDefinition62.getIndexName();
        java.lang.String str66 = mongoDBRiverDefinition62.getMongoDb();
        com.mongodb.BasicDBObject basicDBObject67 = mongoDBRiverDefinition62.getMongoOplogFilter();
        com.mongodb.MongoClientOptions mongoClientOptions68 = mongoDBRiverDefinition62.getMongoClientOptions();
        boolean boolean69 = mongoDBRiverDefinition62.isSkipInitialImport();
        java.lang.String str70 = mongoDBRiverDefinition62.getIncludeCollection();
        java.lang.String str71 = mongoDBRiverDefinition62.getStatisticsTypeName();
        java.lang.String str72 = mongoDBRiverDefinition62.getMongoAdminPassword();
        docScoreSearchScript0.setNextVar("disable_index_refresh.disable_index_refresh", (java.lang.Object) str72);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((-1));
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0885");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("concurrent_requests", "bulk");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0886");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("index", "include_fields");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0887");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("import_all_collections", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0888");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) "bulk_timeout");
        docScoreSearchScript0.setNextScore((float) 27017);
        docScoreSearchScript0.setNextScore((float) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj8 = docScoreSearchScript0.run();
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0889");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("type", "bulk_timeout.bulk_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0890");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("throttle_size", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0891");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("disable_index_refresh", "bulk_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0892");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("collection", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0893");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("import_all_collections.import_all_collections", "credentials");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0894");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("servers", "hi!");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0895");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder1.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder3.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition6 = builder3.build();
        boolean boolean7 = mongoDBRiverDefinition6.isDisableIndexRefresh();
        boolean boolean8 = mongoDBRiverDefinition6.isDropCollection();
        java.lang.String str9 = mongoDBRiverDefinition6.getMongoAdminPassword();
        boolean boolean10 = mongoDBRiverDefinition6.isMongoSSLVerifyCertificate();
        java.lang.String str11 = mongoDBRiverDefinition6.getScript();
        java.lang.String str12 = mongoDBRiverDefinition6.getScript();
        java.util.List<com.mongodb.ServerAddress> serverAddressList13 = mongoDBRiverDefinition6.getMongoServers();
        java.util.List<com.mongodb.ServerAddress> serverAddressList14 = mongoDBRiverDefinition6.getMongoServers();
        java.util.Set<java.lang.String> strSet15 = mongoDBRiverDefinition6.getExcludeFields();
        com.mongodb.BasicDBObject basicDBObject16 = mongoDBRiverDefinition6.getMongoCollectionFilter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject16);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0896");
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
        long long72 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0897");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_timeout.bulk_timeout", "user");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0898");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("port", "advanced_transformation.advanced_transformation");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0899");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("size.size", "skip_initial_import.skip_initial_import");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0900");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float69 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0901");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("local", "type");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0902");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("connect_timeout", "name");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0903");
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
        java.lang.Object obj42 = docScoreSearchScript0.run();
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0904");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("port", "disable_index_refresh");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0905");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("admin", "exclude_fields");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0906");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("socket_timeout", "skip_initial_import");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0907");
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
        docScoreSearchScript0.setNextDocId((int) (byte) 1);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0908");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "actions");
        docScoreSearchScript0.setNextScore(0.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float5 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0909");
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
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.mongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder28.typeName("secondary_read_preference");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder32.importAllCollections(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder32.indexName("throttle_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder36.mongoAdminUser("db");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder36.socketTimeout((int) 'a');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder36.statisticsIndexName("skip_initial_import");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder42.statisticsTypeName("ssl_verify_certificate");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder42.scriptType("user");
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
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder75 = builder53.storeStatistics(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder77 = builder53.riverIndexName("actions");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder79 = builder53.script("bulk_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder80 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder82 = builder80.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder84 = builder82.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition85 = builder82.build();
        java.lang.String str86 = mongoDBRiverDefinition85.getIncludeCollection();
        com.mongodb.MongoClientOptions mongoClientOptions87 = mongoDBRiverDefinition85.getMongoClientOptions();
        boolean boolean88 = mongoDBRiverDefinition85.isDropCollection();
        java.lang.String str89 = mongoDBRiverDefinition85.getStatisticsIndexName();
        int int90 = mongoDBRiverDefinition85.getThrottleSize();
        java.util.List<com.mongodb.ServerAddress> serverAddressList91 = mongoDBRiverDefinition85.getMongoServers();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder92 = builder79.mongoServers(serverAddressList91);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder93 = builder46.mongoServers(serverAddressList91);
        docScoreSearchScript0.setNextVar("disable_index_refresh", (java.lang.Object) builder46);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long95 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0910");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("import_all_collections.import_all_collections", "hi!");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0911");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("db", "type");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0912");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script_type", "disable_index_refresh");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0913");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("drop_collection", "db");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0914");
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
        docScoreSearchScript0.setNextDocId((int) (short) 10);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0915");
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
        docScoreSearchScript0.setNextScore((float) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) '4');
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0916");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("db", "bulk");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0917");
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
        java.lang.Object obj32 = docScoreSearchScript0.run();
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0918");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("host.filter", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0919");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("size.size", "disable_index_refresh.disable_index_refresh");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0920");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("disable_index_refresh", "import_all_collections");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0921");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("db", "collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0922");
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
        long long83 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0923");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("parent_types", "host");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0924");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("host", "gridfs");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0925");
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
        docScoreSearchScript0.setNextScore((float) 1L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition21 = builder18.build();
        java.lang.String str22 = mongoDBRiverDefinition21.getIncludeCollection();
        java.lang.String str23 = mongoDBRiverDefinition21.getScriptType();
        com.mongodb.BasicDBObject basicDBObject24 = mongoDBRiverDefinition21.getMongoCollectionFilter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject24);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0926");
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
        docScoreSearchScript0.setNextScore((float) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (byte) 0);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0927");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("null.", "include_collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0928");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("disable_index_refresh.disable_index_refresh", "gridfs");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0929");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("actions", "name");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0930");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("servers", "bulk_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0931");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("concurrent_requests", "skip_initial_import.skip_initial_import");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0932");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) "bulk_timeout");
        docScoreSearchScript0.setNextScore((float) (byte) -1);
        docScoreSearchScript0.setNextScore((float) (short) 1);
        docScoreSearchScript0.setNextScore((float) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long10 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0933");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk", "size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0934");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("skip_initial_import.skip_initial_import", "include_fields");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0935");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float64 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0936");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("exclude_fields", "null.");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0937");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("size.size", "ssl");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0938");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("filter", "servers");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0939");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("collection", "script");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0940");
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
        long long68 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0941");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("host.filter", "host");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0942");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("ssl", "actions");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0943");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) "bulk_timeout");
        docScoreSearchScript0.setNextScore((float) 27017);
        docScoreSearchScript0.setNextScore((float) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) '4');
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0944");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("size.size", "import_all_collections");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0945");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("advanced_transformation.advanced_transformation", "collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0946");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) "bulk_timeout");
        docScoreSearchScript0.setNextScore((float) 10L);
        docScoreSearchScript0.setNextScore((float) 1000);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((-1));
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0947");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("ssl_verify_certificate", "exclude_fields");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0948");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("skip_initial_import.skip_initial_import", "bulk_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0949");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("disable_index_refresh.disable_index_refresh", "credentials");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0950");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("hi!", "exclude_fields");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0951");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("name", "script_type");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0952");
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
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition24 = builder21.build();
        boolean boolean25 = mongoDBRiverDefinition24.isDisableIndexRefresh();
        boolean boolean26 = mongoDBRiverDefinition24.isDisableIndexRefresh();
        int int27 = mongoDBRiverDefinition24.getThrottleSize();
        java.lang.String str28 = mongoDBRiverDefinition24.getMongoAdminPassword();
        boolean boolean29 = mongoDBRiverDefinition24.isMongoSecondaryReadPreference();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) mongoDBRiverDefinition24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj31 = docScoreSearchScript0.run();
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0953");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("password", "ssl");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0954");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("gridfs", "hi!");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0955");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("secondary_read_preference", "throttle_size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0956");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("db", (java.lang.Object) "bulk_timeout");
        docScoreSearchScript0.setNextScore((float) 10L);
        docScoreSearchScript0.setNextScore((float) 1000);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long8 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0957");
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
        long long93 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0958");
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
        docScoreSearchScript0.setNextDocId((int) '4');
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0959");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script", "throttle_size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0960");
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
        docScoreSearchScript0.setNextDocId((int) (byte) -1);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0961");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("hi!", "type");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0962");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("advanced_transformation", "parent_types");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0963");
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
        docScoreSearchScript0.setNextDocId((int) (short) 100);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0964");
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
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder68 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder70 = builder68.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder72 = builder68.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder74 = builder72.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder76 = builder74.mongoLocalPassword("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder78 = builder76.includeCollection("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder80 = builder76.mongoLocalPassword("connect_timeout");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder82 = builder76.statisticsIndexName("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder84 = builder76.statisticsIndexName("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder86 = builder84.includeCollection("localhost");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder88 = builder84.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder90 = builder84.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder92 = builder84.mongoGridFS(false);
        docScoreSearchScript0.setNextVar("options", (java.lang.Object) builder92);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(1);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0965");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("admin", "disable_index_refresh");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0966");
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
        double double66 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0967");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("initial_timestamp", "size.size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0968");
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
        docScoreSearchScript0.setNextScore((float) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double33 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0969");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("credentials", "size.size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0970");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("throttle_size", "password");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0971");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("concurrent_requests", "localhost");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0972");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_timeout", "secondary_read_preference");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0973");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) (short) 1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder3.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.statisticsIndexName("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.mongoAdminUser("gridfs");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.riverName("parent_types");
        java.lang.Object obj14 = docScoreSearchScript0.unwrap((java.lang.Object) builder11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (short) 0);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0974");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(1);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0975");
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
        java.lang.String[] strArray23 = new java.lang.String[] { "bulk", "bulk", "disable_index_refresh" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder17.includeFields((java.util.Set<java.lang.String>) strSet24);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.throttleSize(1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder29.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder31.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition34 = builder31.build();
        boolean boolean35 = mongoDBRiverDefinition34.isDisableIndexRefresh();
        boolean boolean36 = mongoDBRiverDefinition34.isDropCollection();
        java.lang.String str37 = mongoDBRiverDefinition34.getMongoAdminPassword();
        com.mongodb.BasicDBObject basicDBObject38 = mongoDBRiverDefinition34.getMongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder26.mongoCollectionFilter(basicDBObject38);
        docScoreSearchScript0.setNextVar("type", (java.lang.Object) basicDBObject38);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder42.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder44.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder46.mongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder46.mongoLocalUser("parent_types");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder50.throttleSize((-1));
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder52.mongoGridFS(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder52.mongoAdminPassword("script");
        docScoreSearchScript0.setNextVar("credentials", (java.lang.Object) builder56);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj58 = docScoreSearchScript0.run();
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0976");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("type", "host");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0977");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("localhost", "disable_index_refresh.disable_index_refresh");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0978");
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
        docScoreSearchScript0.setNextScore((float) (-1L));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double33 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0979");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float55 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0980");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "size.size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0981");
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
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder41.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder43.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition46 = builder43.build();
        java.lang.String str47 = mongoDBRiverDefinition46.getIncludeCollection();
        boolean boolean48 = mongoDBRiverDefinition46.isMongoSSLVerifyCertificate();
        java.lang.String str49 = mongoDBRiverDefinition46.getIndexName();
        java.lang.String str50 = mongoDBRiverDefinition46.getMongoAdminUser();
        com.mongodb.MongoClientOptions mongoClientOptions51 = mongoDBRiverDefinition46.getMongoClientOptions();
        boolean boolean52 = mongoDBRiverDefinition46.isDisableIndexRefresh();
        java.lang.String str53 = mongoDBRiverDefinition46.getMongoOplogNamespace();
        boolean boolean54 = mongoDBRiverDefinition46.isAdvancedTransformation();
        docScoreSearchScript0.setNextVar("ssl", (java.lang.Object) mongoDBRiverDefinition46);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = builder57.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = builder59.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition62 = builder59.build();
        java.lang.String str63 = mongoDBRiverDefinition62.getIncludeCollection();
        boolean boolean64 = mongoDBRiverDefinition62.isMongoSSLVerifyCertificate();
        java.lang.String str65 = mongoDBRiverDefinition62.getIndexName();
        java.lang.String str66 = mongoDBRiverDefinition62.getMongoDb();
        com.mongodb.BasicDBObject basicDBObject67 = mongoDBRiverDefinition62.getMongoOplogFilter();
        com.mongodb.MongoClientOptions mongoClientOptions68 = mongoDBRiverDefinition62.getMongoClientOptions();
        boolean boolean69 = mongoDBRiverDefinition62.isSkipInitialImport();
        java.lang.String str70 = mongoDBRiverDefinition62.getIncludeCollection();
        java.lang.String str71 = mongoDBRiverDefinition62.getStatisticsTypeName();
        java.lang.String str72 = mongoDBRiverDefinition62.getMongoAdminPassword();
        docScoreSearchScript0.setNextVar("disable_index_refresh.disable_index_refresh", (java.lang.Object) str72);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long74 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0982");
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
        docScoreSearchScript0.setNextDocId(100);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0983");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("user", "credentials");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0984");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("socket_timeout.socket_timeout", "user");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0985");
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
        double double31 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0986");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "drop_collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0987");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("hi!", "import_all_collections");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0988");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (byte) 10);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0989");
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
        java.lang.Object obj85 = docScoreSearchScript0.run();
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0990");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script_type", "admin");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0991");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("flush_interval", "bulk");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0992");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("drop_collection", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0993");
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
        java.lang.Object obj58 = docScoreSearchScript0.run();
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0994");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "");
        docScoreSearchScript0.setNextScore((float) (-1));
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.mongoCollection("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.mongoUseSSL(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition10 = builder7.build();
        java.lang.String str11 = mongoDBRiverDefinition10.getIncludeCollection();
        boolean boolean12 = mongoDBRiverDefinition10.isMongoSSLVerifyCertificate();
        java.lang.String str13 = mongoDBRiverDefinition10.getIndexName();
        com.mongodb.MongoClientOptions mongoClientOptions14 = mongoDBRiverDefinition10.getMongoClientOptions();
        boolean boolean15 = mongoDBRiverDefinition10.isStoreStatistics();
        java.util.List<com.mongodb.ServerAddress> serverAddressList16 = mongoDBRiverDefinition10.getMongoServers();
        java.lang.Object obj17 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long18 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0995");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("local", "socket_timeout.socket_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0996");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("disable_index_refresh", "collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0997");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("credentials", "skip_initial_import");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0998");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("index", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test0999");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("filter", "include_fields");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test1000");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("initial_timestamp", "flush_interval");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }
}

