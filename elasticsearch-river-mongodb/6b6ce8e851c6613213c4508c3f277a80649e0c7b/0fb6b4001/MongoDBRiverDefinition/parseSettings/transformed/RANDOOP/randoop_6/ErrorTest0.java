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
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("secondary_read_preference", "admin");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("hi!", "credentials");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double1 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float1 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double3 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (short) 1);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long3 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float3 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double3 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("servers", "user");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        docScoreSearchScript0.setNextVar("connect_timeout", (java.lang.Object) "type");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float6 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        docScoreSearchScript0.setNextVar("connect_timeout", (java.lang.Object) "type");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double6 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("db", "concurrent_requests");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        docScoreSearchScript0.setNextVar("connect_timeout", (java.lang.Object) "type");
        java.lang.Object obj7 = docScoreSearchScript0.unwrap((java.lang.Object) "ssl");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(0);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj3 = docScoreSearchScript0.run();
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        docScoreSearchScript0.setNextScore(100.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((-1));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextVar("disable_index_refresh", (java.lang.Object) "index");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double6 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (short) -1);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        docScoreSearchScript0.setNextVar("connect_timeout", (java.lang.Object) "type");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long6 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        docScoreSearchScript0.setNextVar("connect_timeout", (java.lang.Object) "type");
        java.lang.Object obj7 = docScoreSearchScript0.unwrap((java.lang.Object) "ssl");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (short) 0);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj3 = docScoreSearchScript0.run();
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        docScoreSearchScript0.setNextScore((float) 10L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float5 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextScore((float) ' ');
        docScoreSearchScript0.setNextScore((float) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float7 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        docScoreSearchScript0.setNextVar("connect_timeout", (java.lang.Object) "type");
        java.lang.Object obj7 = docScoreSearchScript0.unwrap((java.lang.Object) "ssl");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double8 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextVar("disable_index_refresh", (java.lang.Object) "index");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (byte) -1);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        docScoreSearchScript0.setNextScore((float) 10L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double5 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("collection", "admin");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextVar("disable_index_refresh", (java.lang.Object) "index");
        java.lang.Object obj7 = new java.lang.Object();
        docScoreSearchScript0.setNextVar("concurrent_bulk_requests", obj7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj9 = docScoreSearchScript0.run();
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        docScoreSearchScript0.setNextVar("connect_timeout", (java.lang.Object) "type");
        java.lang.Object obj7 = docScoreSearchScript0.unwrap((java.lang.Object) "ssl");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long8 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 0L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float3 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextScore((float) ' ');
        docScoreSearchScript0.setNextScore((float) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double7 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextScore((float) ' ');
        docScoreSearchScript0.setNextScore((float) (short) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder8.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet11 = builder8.excludeFields;
        com.mongodb.BasicDBObject basicDBObject12 = builder8.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = builder8.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray14 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList15 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList15, serverAddressArray14);
        builder8.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList15);
        java.lang.String str18 = builder8.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder8.dropCollection(true);
        boolean boolean21 = builder20.mongoSSLVerifyCertificate;
        java.lang.String[] strArray39 = new java.lang.String[] { "connect_timeout", "script_type", "collection", "secondary_read_preference", "throttle_size", "host", "actions", "drop_collection", "name", "initial_timestamp", "size", "script_type", "throttle_size", "hi!", "advanced_transformation", "name", "concurrent_requests" };
        java.util.LinkedHashSet<java.lang.String> strSet40 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet40, strArray39);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder20.includeFields((java.util.Set<java.lang.String>) strSet40);
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) strSet40);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float44 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("socket_timeout", "concurrent_bulk_requests");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "secondary_read_preference");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextScore((float) ' ');
        java.lang.Object obj6 = docScoreSearchScript0.unwrap((java.lang.Object) "name");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double7 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextScore((float) ' ');
        docScoreSearchScript0.setNextScore((float) (short) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder8.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet11 = builder8.excludeFields;
        com.mongodb.BasicDBObject basicDBObject12 = builder8.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = builder8.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray14 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList15 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList15, serverAddressArray14);
        builder8.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList15);
        java.lang.String str18 = builder8.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder8.dropCollection(true);
        boolean boolean21 = builder20.mongoSSLVerifyCertificate;
        java.lang.String[] strArray39 = new java.lang.String[] { "connect_timeout", "script_type", "collection", "secondary_read_preference", "throttle_size", "host", "actions", "drop_collection", "name", "initial_timestamp", "size", "script_type", "throttle_size", "hi!", "advanced_transformation", "name", "concurrent_requests" };
        java.util.LinkedHashSet<java.lang.String> strSet40 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet40, strArray39);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder20.includeFields((java.util.Set<java.lang.String>) strSet40);
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) strSet40);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double44 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(27017);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextVar("disable_index_refresh", (java.lang.Object) "index");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float6 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        docScoreSearchScript0.setNextScore((float) 10L);
        docScoreSearchScript0.setNextScore(0.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float7 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("drop_collection", "size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 'a');
        docScoreSearchScript0.setNextScore((float) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj5 = docScoreSearchScript0.run();
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextScore((float) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj5 = docScoreSearchScript0.run();
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        docScoreSearchScript0.setNextScore(100.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double5 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextVar("disable_index_refresh", (java.lang.Object) "index");
        java.lang.Object obj7 = new java.lang.Object();
        docScoreSearchScript0.setNextVar("concurrent_bulk_requests", obj7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float9 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextScore((float) ' ');
        docScoreSearchScript0.setNextScore((float) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj7 = docScoreSearchScript0.run();
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        docScoreSearchScript0.setNextScore((float) 10L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj5 = docScoreSearchScript0.run();
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        docScoreSearchScript0.setNextScore((float) 10L);
        docScoreSearchScript0.setNextScore(0.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double7 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 0L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double3 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        org.elasticsearch.common.logging.ESLogger eSLogger3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.logger;
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) eSLogger3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj5 = docScoreSearchScript0.run();
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextScore((float) ' ');
        docScoreSearchScript0.setNextScore((float) (short) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder8.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet11 = builder8.excludeFields;
        com.mongodb.BasicDBObject basicDBObject12 = builder8.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = builder8.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray14 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList15 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList15, serverAddressArray14);
        builder8.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList15);
        java.lang.String str18 = builder8.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder8.dropCollection(true);
        boolean boolean21 = builder20.mongoSSLVerifyCertificate;
        java.lang.String[] strArray39 = new java.lang.String[] { "connect_timeout", "script_type", "collection", "secondary_read_preference", "throttle_size", "host", "actions", "drop_collection", "name", "initial_timestamp", "size", "script_type", "throttle_size", "hi!", "advanced_transformation", "name", "concurrent_requests" };
        java.util.LinkedHashSet<java.lang.String> strSet40 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet40, strArray39);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder20.includeFields((java.util.Set<java.lang.String>) strSet40);
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) strSet40);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder45.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet48 = builder45.excludeFields;
        builder45.setmongoCollection("hi!");
        boolean boolean51 = builder45.importAllCollections;
        java.lang.String str52 = builder45.mongoAdminPassword;
        builder45.typeName = "concurrent_bulk_requests";
        builder45.setskipInitialImport(false);
        boolean boolean57 = builder45.getadvancedTransformation();
        docScoreSearchScript0.setNextVar("null.initial_timestamp", (java.lang.Object) builder45);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (short) 10);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("drop_collection", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextScore((float) ' ');
        docScoreSearchScript0.setNextScore((float) (short) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder8.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet11 = builder8.excludeFields;
        com.mongodb.BasicDBObject basicDBObject12 = builder8.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = builder8.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray14 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList15 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList15, serverAddressArray14);
        builder8.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList15);
        java.lang.String str18 = builder8.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder8.dropCollection(true);
        boolean boolean21 = builder20.mongoSSLVerifyCertificate;
        java.lang.String[] strArray39 = new java.lang.String[] { "connect_timeout", "script_type", "collection", "secondary_read_preference", "throttle_size", "host", "actions", "drop_collection", "name", "initial_timestamp", "size", "script_type", "throttle_size", "hi!", "advanced_transformation", "name", "concurrent_requests" };
        java.util.LinkedHashSet<java.lang.String> strSet40 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet40, strArray39);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder20.includeFields((java.util.Set<java.lang.String>) strSet40);
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) strSet40);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder45.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet48 = builder45.excludeFields;
        builder45.setmongoCollection("hi!");
        boolean boolean51 = builder45.importAllCollections;
        java.lang.String str52 = builder45.mongoAdminPassword;
        builder45.typeName = "concurrent_bulk_requests";
        builder45.setskipInitialImport(false);
        boolean boolean57 = builder45.getadvancedTransformation();
        docScoreSearchScript0.setNextVar("null.initial_timestamp", (java.lang.Object) builder45);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (byte) -1);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextScore((float) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder5.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet8 = builder5.excludeFields;
        builder5.setmongoCollection("initial_timestamp");
        boolean boolean11 = builder5.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder5.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder13);
        java.lang.String str15 = mongoDBRiverDefinition14.includeCollection;
        java.lang.String str16 = mongoDBRiverDefinition14.getHOST_FIELD();
        org.elasticsearch.common.logging.ESLogger eSLogger17 = mongoDBRiverDefinition14.getlogger();
        java.lang.Object obj18 = docScoreSearchScript0.unwrap((java.lang.Object) eSLogger17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float19 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextVar("disable_index_refresh", (java.lang.Object) "index");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj6 = docScoreSearchScript0.run();
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("concurrent_requests", "servers");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        docScoreSearchScript0.setNextScore(100.0f);
        docScoreSearchScript0.setNextScore((float) (-1L));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long7 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextVar("disable_index_refresh", (java.lang.Object) "index");
        docScoreSearchScript0.setNextScore((float) 10L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder8.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet11 = builder8.excludeFields;
        builder8.setmongoCollection("initial_timestamp");
        boolean boolean14 = builder8.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder8.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder16);
        java.lang.String str18 = mongoDBRiverDefinition17.includeCollection;
        boolean boolean19 = mongoDBRiverDefinition17.mongoGridFS;
        java.lang.String str20 = mongoDBRiverDefinition17.getINITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD();
        java.util.Set<java.lang.String> strSet21 = mongoDBRiverDefinition17.getExcludeFields();
        java.lang.String str22 = mongoDBRiverDefinition17.mongoLocalUser;
        java.lang.Object obj23 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double24 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        docScoreSearchScript0.setNextScore((float) 10L);
        docScoreSearchScript0.setNextScore(0.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (short) 0);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        docScoreSearchScript0.setNextScore(100.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder5.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet8 = builder5.excludeFields;
        builder5.setmongoCollection("initial_timestamp");
        boolean boolean11 = builder5.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder5.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder13);
        java.lang.String str15 = mongoDBRiverDefinition14.includeCollection;
        java.lang.String str16 = mongoDBRiverDefinition14.getIndexName();
        java.lang.String str17 = mongoDBRiverDefinition14.riverName;
        com.mongodb.BasicDBObject basicDBObject18 = mongoDBRiverDefinition14.mongoCollectionFilter;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject18);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("include_fields", "ssl");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        docScoreSearchScript0.setNextScore((float) 10L);
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float7 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        docScoreSearchScript0.setNextVar("connect_timeout", (java.lang.Object) "type");
        java.lang.Object obj7 = docScoreSearchScript0.unwrap((java.lang.Object) "ssl");
        docScoreSearchScript0.setNextScore((float) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long10 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("include_collection", "bulk_size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        org.elasticsearch.common.logging.ESLogger eSLogger3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.logger;
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) eSLogger3);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder6.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet9 = builder6.excludeFields;
        com.mongodb.BasicDBObject basicDBObject10 = builder6.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = builder6.initialTimestamp;
        builder6.setstatisticsTypeName("ssl_verify_certificate");
        boolean boolean14 = builder6.getmongoUseSSL();
        java.lang.String str15 = builder6.indexName;
        java.util.Set<java.lang.String> strSet16 = builder6.getexcludeFields();
        docScoreSearchScript0.setNextVar("hi!", (java.lang.Object) builder6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double18 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        org.elasticsearch.common.logging.ESLogger eSLogger3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.logger;
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) eSLogger3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float5 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 0L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long3 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        org.elasticsearch.common.logging.ESLogger eSLogger3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.logger;
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) eSLogger3);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder6.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet9 = builder6.excludeFields;
        com.mongodb.BasicDBObject basicDBObject10 = builder6.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = builder6.initialTimestamp;
        builder6.setstatisticsTypeName("ssl_verify_certificate");
        boolean boolean14 = builder6.getmongoUseSSL();
        java.lang.String str15 = builder6.indexName;
        java.util.Set<java.lang.String> strSet16 = builder6.getexcludeFields();
        docScoreSearchScript0.setNextVar("hi!", (java.lang.Object) builder6);
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder20.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet23 = builder20.excludeFields;
        com.mongodb.BasicDBObject basicDBObject24 = builder20.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp25 = builder20.initialTimestamp;
        builder20.mongoCollection = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder20.typeName("exclude_fields");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder30.setmongoSecondaryReadPreference(false);
        boolean boolean33 = builder30.getmongoSSLVerifyCertificate();
        java.lang.String str34 = builder30.getriverIndexName();
        builder30.setimportAllCollections(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder30.mongoUseSSL(true);
        builder30.setdisableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder30.script("bulk");
        com.mongodb.BasicDBObject basicDBObject43 = builder30.mongoCollectionFilter;
        builder20.mongoCollectionFilter = basicDBObject43;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject43);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("host", "null.null", false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextScore((float) ' ');
        docScoreSearchScript0.setNextScore((float) (short) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder8.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet11 = builder8.excludeFields;
        com.mongodb.BasicDBObject basicDBObject12 = builder8.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = builder8.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray14 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList15 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList15, serverAddressArray14);
        builder8.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList15);
        java.lang.String str18 = builder8.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder8.dropCollection(true);
        boolean boolean21 = builder20.mongoSSLVerifyCertificate;
        java.lang.String[] strArray39 = new java.lang.String[] { "connect_timeout", "script_type", "collection", "secondary_read_preference", "throttle_size", "host", "actions", "drop_collection", "name", "initial_timestamp", "size", "script_type", "throttle_size", "hi!", "advanced_transformation", "name", "concurrent_requests" };
        java.util.LinkedHashSet<java.lang.String> strSet40 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet40, strArray39);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder20.includeFields((java.util.Set<java.lang.String>) strSet40);
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) strSet40);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder45.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet48 = builder45.excludeFields;
        builder45.setmongoCollection("hi!");
        boolean boolean51 = builder45.importAllCollections;
        java.lang.String str52 = builder45.mongoAdminPassword;
        builder45.typeName = "concurrent_bulk_requests";
        builder45.setskipInitialImport(false);
        boolean boolean57 = builder45.getadvancedTransformation();
        docScoreSearchScript0.setNextVar("null.initial_timestamp", (java.lang.Object) builder45);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder60.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet63 = builder60.excludeFields;
        java.lang.String str64 = builder60.getmongoLocalPassword();
        java.lang.String str65 = builder60.getmongoAdminUser();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder67 = builder60.mongoLocalPassword("options");
        docScoreSearchScript0.setNextVar("", (java.lang.Object) builder67);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float69 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("servers", "credentials");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 0L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(0);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        docScoreSearchScript0.setNextScore((float) 10L);
        docScoreSearchScript0.setNextScore(0.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder7.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet10 = builder7.excludeFields;
        com.mongodb.BasicDBObject basicDBObject11 = builder7.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp12 = builder7.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray13 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList14 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList14, serverAddressArray13);
        builder7.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList14);
        builder7.setdisableIndexRefresh(true);
        java.lang.String str19 = builder7.getmongoCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder7.dropCollection(false);
        java.lang.String str22 = builder21.getscript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder23.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet26 = builder23.excludeFields;
        com.mongodb.BasicDBObject basicDBObject27 = builder23.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp28 = builder23.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray29 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList30 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList30, serverAddressArray29);
        builder23.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList30);
        java.lang.String str33 = builder23.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder23.dropCollection(true);
        boolean boolean36 = builder35.mongoSSLVerifyCertificate;
        java.lang.String str37 = builder35.typeName;
        builder35.typeName = "include_fields";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder40.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet43 = builder40.excludeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder40.mongoSSLVerifyCertificate(true);
        java.util.Set<java.lang.String> strSet46 = builder45.excludeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder47.setmongoSecondaryReadPreference(false);
        boolean boolean50 = builder47.getmongoSSLVerifyCertificate();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder51.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet54 = builder51.excludeFields;
        com.mongodb.BasicDBObject basicDBObject55 = builder51.getmongoCollectionFilter();
        java.lang.String str56 = builder51.mongoLocalUser;
        com.mongodb.ServerAddress[] serverAddressArray57 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList58 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList58, serverAddressArray57);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder51.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList58);
        com.mongodb.MongoClientOptions mongoClientOptions61 = builder51.getmongoClientOptions();
        builder51.riverName = "script_type";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder64 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder64.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet67 = builder64.excludeFields;
        com.mongodb.BasicDBObject basicDBObject68 = builder64.getmongoCollectionFilter();
        builder51.setmongoOplogFilter(basicDBObject68);
        com.mongodb.BasicDBObject basicDBObject70 = builder51.mongoOplogFilter;
        builder47.setmongoOplogFilter(basicDBObject70);
        builder45.setmongoCollectionFilter(basicDBObject70);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder73 = builder35.mongoCollectionFilter(basicDBObject70);
        com.mongodb.BasicDBObject basicDBObject74 = builder35.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder75 = builder21.mongoCollectionFilter(basicDBObject74);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject74);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextVar("disable_index_refresh", (java.lang.Object) "index");
        docScoreSearchScript0.setNextScore((float) 27017);
        docScoreSearchScript0.setNextVar("gridfs", (java.lang.Object) (-1.0d));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long11 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        docScoreSearchScript0.setNextScore((float) 10L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder6.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet9 = builder6.excludeFields;
        builder6.setmongoCollection("initial_timestamp");
        boolean boolean12 = builder6.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder6.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder14);
        java.lang.String str16 = mongoDBRiverDefinition15.includeCollection;
        boolean boolean17 = mongoDBRiverDefinition15.mongoGridFS;
        boolean boolean18 = mongoDBRiverDefinition15.advancedTransformation;
        java.lang.String str19 = mongoDBRiverDefinition15.getADMIN_DB_FIELD();
        boolean boolean20 = mongoDBRiverDefinition15.getdisableIndexRefresh();
        boolean boolean21 = mongoDBRiverDefinition15.isMongoSecondaryReadPreference();
        java.lang.String str22 = mongoDBRiverDefinition15.mongoCollection;
        java.util.Set<java.lang.String> strSet23 = mongoDBRiverDefinition15.includeFields;
        int int24 = mongoDBRiverDefinition15.throttleSize;
        boolean boolean25 = mongoDBRiverDefinition15.disableIndexRefresh;
        docScoreSearchScript0.setNextVar("exclude_fields", (java.lang.Object) boolean25);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder28.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet31 = builder28.excludeFields;
        builder28.setmongoCollection("initial_timestamp");
        boolean boolean34 = builder28.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder28.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition37 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder36);
        java.lang.String str38 = mongoDBRiverDefinition37.includeCollection;
        java.lang.String str39 = mongoDBRiverDefinition37.getCOLLECTION_FIELD();
        java.util.Set<java.lang.String> strSet40 = mongoDBRiverDefinition37.excludeFields;
        java.lang.String str41 = mongoDBRiverDefinition37.getOPTIONS_FIELD();
        java.lang.String str42 = mongoDBRiverDefinition37.getIndexName();
        docScoreSearchScript0.setNextVar("bulk_size", (java.lang.Object) mongoDBRiverDefinition37);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj44 = docScoreSearchScript0.run();
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        docScoreSearchScript0.setNextScore(100.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long5 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder4.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet7 = builder4.excludeFields;
        builder4.setmongoCollection("initial_timestamp");
        boolean boolean10 = builder4.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder4.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder12);
        java.lang.String str14 = mongoDBRiverDefinition13.includeCollection;
        java.lang.String str15 = mongoDBRiverDefinition13.getCOLLECTION_FIELD();
        boolean boolean16 = mongoDBRiverDefinition13.isImportAllCollections();
        boolean boolean17 = mongoDBRiverDefinition13.mongoGridFS;
        docScoreSearchScript0.setNextVar("collection", (java.lang.Object) mongoDBRiverDefinition13);
        docScoreSearchScript0.setNextScore((float) (-1L));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double21 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder3.script("script");
        com.mongodb.BasicDBObject basicDBObject6 = builder5.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder5.typeName("connect_timeout");
        com.mongodb.BasicDBObject basicDBObject9 = builder5.getmongoOplogFilter();
        builder5.mongoUseSSL = false;
        builder5.setmongoUseSSL(false);
        java.lang.String str14 = builder5.getstatisticsTypeName();
        java.lang.Object obj15 = docScoreSearchScript0.unwrap((java.lang.Object) builder5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) '4');
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (short) 10);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "servers");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        docScoreSearchScript0.setNextScore((float) 10L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder6.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet9 = builder6.excludeFields;
        builder6.setmongoCollection("initial_timestamp");
        boolean boolean12 = builder6.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder6.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder14);
        java.lang.String str16 = mongoDBRiverDefinition15.includeCollection;
        boolean boolean17 = mongoDBRiverDefinition15.mongoGridFS;
        boolean boolean18 = mongoDBRiverDefinition15.advancedTransformation;
        java.lang.String str19 = mongoDBRiverDefinition15.getADMIN_DB_FIELD();
        boolean boolean20 = mongoDBRiverDefinition15.getdisableIndexRefresh();
        boolean boolean21 = mongoDBRiverDefinition15.isMongoSecondaryReadPreference();
        java.lang.String str22 = mongoDBRiverDefinition15.mongoCollection;
        java.util.Set<java.lang.String> strSet23 = mongoDBRiverDefinition15.includeFields;
        int int24 = mongoDBRiverDefinition15.throttleSize;
        boolean boolean25 = mongoDBRiverDefinition15.disableIndexRefresh;
        docScoreSearchScript0.setNextVar("exclude_fields", (java.lang.Object) boolean25);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder28.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet31 = builder28.excludeFields;
        builder28.setmongoCollection("initial_timestamp");
        boolean boolean34 = builder28.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder28.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition37 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder36);
        java.lang.String str38 = mongoDBRiverDefinition37.includeCollection;
        java.lang.String str39 = mongoDBRiverDefinition37.getCOLLECTION_FIELD();
        java.util.Set<java.lang.String> strSet40 = mongoDBRiverDefinition37.excludeFields;
        java.lang.String str41 = mongoDBRiverDefinition37.getOPTIONS_FIELD();
        java.lang.String str42 = mongoDBRiverDefinition37.getIndexName();
        docScoreSearchScript0.setNextVar("bulk_size", (java.lang.Object) mongoDBRiverDefinition37);
        docScoreSearchScript0.setNextScore((float) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) 'a');
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder4.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet7 = builder4.excludeFields;
        builder4.setmongoCollection("initial_timestamp");
        boolean boolean10 = builder4.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder4.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder12);
        java.lang.String str14 = mongoDBRiverDefinition13.includeCollection;
        java.lang.String str15 = mongoDBRiverDefinition13.getCOLLECTION_FIELD();
        boolean boolean16 = mongoDBRiverDefinition13.isImportAllCollections();
        boolean boolean17 = mongoDBRiverDefinition13.mongoGridFS;
        docScoreSearchScript0.setNextVar("collection", (java.lang.Object) mongoDBRiverDefinition13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (byte) 100);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextScore((float) ' ');
        docScoreSearchScript0.setNextScore((float) (short) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder8.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet11 = builder8.excludeFields;
        com.mongodb.BasicDBObject basicDBObject12 = builder8.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = builder8.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray14 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList15 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList15, serverAddressArray14);
        builder8.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList15);
        java.lang.String str18 = builder8.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder8.dropCollection(true);
        boolean boolean21 = builder20.mongoSSLVerifyCertificate;
        java.lang.String[] strArray39 = new java.lang.String[] { "connect_timeout", "script_type", "collection", "secondary_read_preference", "throttle_size", "host", "actions", "drop_collection", "name", "initial_timestamp", "size", "script_type", "throttle_size", "hi!", "advanced_transformation", "name", "concurrent_requests" };
        java.util.LinkedHashSet<java.lang.String> strSet40 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet40, strArray39);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder20.includeFields((java.util.Set<java.lang.String>) strSet40);
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) strSet40);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long44 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float3 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextVar("disable_index_refresh", (java.lang.Object) "index");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder6.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet9 = builder6.excludeFields;
        java.lang.String str10 = builder6.getmongoLocalPassword();
        com.mongodb.BasicDBObject basicDBObject11 = builder6.getmongoCollectionFilter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject11);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextVar("disable_index_refresh", (java.lang.Object) "index");
        docScoreSearchScript0.setNextScore((float) 10L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long8 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("advanced_transformation", "exclude_fields");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        org.elasticsearch.common.logging.ESLogger eSLogger3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.logger;
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) eSLogger3);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder6.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet9 = builder6.excludeFields;
        com.mongodb.BasicDBObject basicDBObject10 = builder6.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = builder6.initialTimestamp;
        builder6.setstatisticsTypeName("ssl_verify_certificate");
        boolean boolean14 = builder6.getmongoUseSSL();
        java.lang.String str15 = builder6.indexName;
        java.util.Set<java.lang.String> strSet16 = builder6.getexcludeFields();
        docScoreSearchScript0.setNextVar("hi!", (java.lang.Object) builder6);
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder20.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet23 = builder20.excludeFields;
        builder20.setmongoCollection("initial_timestamp");
        boolean boolean26 = builder20.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder20.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition29 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder28);
        java.lang.String str30 = mongoDBRiverDefinition29.includeCollection;
        java.lang.String str31 = mongoDBRiverDefinition29.getHOST_FIELD();
        java.lang.String str32 = mongoDBRiverDefinition29.getCONCURRENT_BULK_REQUESTS_FIELD();
        java.lang.String str33 = mongoDBRiverDefinition29.getStatisticsTypeName();
        java.util.Set<java.lang.String> strSet34 = mongoDBRiverDefinition29.getExcludeFields();
        java.lang.String str35 = mongoDBRiverDefinition29.getUSER_FIELD();
        java.lang.Object obj36 = docScoreSearchScript0.unwrap((java.lang.Object) str35);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder37.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet40 = builder37.excludeFields;
        builder37.setmongoCollection("initial_timestamp");
        boolean boolean43 = builder37.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder37.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition46 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder45);
        java.lang.String str47 = mongoDBRiverDefinition46.includeCollection;
        java.lang.String str48 = mongoDBRiverDefinition46.getIndexName();
        java.lang.String str49 = mongoDBRiverDefinition46.getSECONDARY_READ_PREFERENCE_FIELD();
        java.lang.String str50 = mongoDBRiverDefinition46.getStatisticsTypeName();
        java.lang.String str51 = mongoDBRiverDefinition46.getHOST_FIELD();
        int int52 = mongoDBRiverDefinition46.connectTimeout;
        java.lang.String str53 = mongoDBRiverDefinition46.getSECONDARY_READ_PREFERENCE_FIELD();
        java.lang.Object obj54 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition46);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float55 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextScore((float) ' ');
        docScoreSearchScript0.setNextScore((float) (short) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder8.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet11 = builder8.excludeFields;
        com.mongodb.BasicDBObject basicDBObject12 = builder8.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = builder8.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray14 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList15 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList15, serverAddressArray14);
        builder8.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList15);
        java.lang.String str18 = builder8.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder8.dropCollection(true);
        boolean boolean21 = builder20.mongoSSLVerifyCertificate;
        java.lang.String[] strArray39 = new java.lang.String[] { "connect_timeout", "script_type", "collection", "secondary_read_preference", "throttle_size", "host", "actions", "drop_collection", "name", "initial_timestamp", "size", "script_type", "throttle_size", "hi!", "advanced_transformation", "name", "concurrent_requests" };
        java.util.LinkedHashSet<java.lang.String> strSet40 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet40, strArray39);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder20.includeFields((java.util.Set<java.lang.String>) strSet40);
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) strSet40);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder45.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet48 = builder45.excludeFields;
        builder45.setmongoCollection("hi!");
        boolean boolean51 = builder45.importAllCollections;
        java.lang.String str52 = builder45.mongoAdminPassword;
        builder45.typeName = "concurrent_bulk_requests";
        builder45.setskipInitialImport(false);
        boolean boolean57 = builder45.getadvancedTransformation();
        docScoreSearchScript0.setNextVar("null.initial_timestamp", (java.lang.Object) builder45);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj59 = docScoreSearchScript0.run();
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder4.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet7 = builder4.excludeFields;
        builder4.setmongoCollection("initial_timestamp");
        boolean boolean10 = builder4.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder4.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder12);
        java.lang.String str14 = mongoDBRiverDefinition13.includeCollection;
        java.lang.String str15 = mongoDBRiverDefinition13.getCOLLECTION_FIELD();
        boolean boolean16 = mongoDBRiverDefinition13.isImportAllCollections();
        boolean boolean17 = mongoDBRiverDefinition13.mongoGridFS;
        docScoreSearchScript0.setNextVar("collection", (java.lang.Object) mongoDBRiverDefinition13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder20.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet23 = builder20.excludeFields;
        com.mongodb.BasicDBObject basicDBObject24 = builder20.getmongoCollectionFilter();
        java.lang.String str25 = builder20.mongoLocalUser;
        com.mongodb.ServerAddress[] serverAddressArray26 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList27 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList27, serverAddressArray26);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder20.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList27);
        com.mongodb.MongoClientOptions mongoClientOptions30 = builder20.getmongoClientOptions();
        builder20.riverName = "script_type";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder33.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet36 = builder33.excludeFields;
        com.mongodb.BasicDBObject basicDBObject37 = builder33.getmongoCollectionFilter();
        builder20.setmongoOplogFilter(basicDBObject37);
        boolean boolean39 = builder20.mongoGridFS;
        boolean boolean40 = builder20.getadvancedTransformation();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder41.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet44 = builder41.excludeFields;
        com.mongodb.BasicDBObject basicDBObject45 = builder41.getmongoCollectionFilter();
        java.lang.String str46 = builder41.mongoLocalUser;
        com.mongodb.ServerAddress[] serverAddressArray47 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList48 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList48, serverAddressArray47);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder41.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList48);
        boolean boolean51 = builder50.dropCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder52.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet55 = builder52.excludeFields;
        com.mongodb.BasicDBObject basicDBObject56 = builder52.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp57 = builder52.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray58 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList59 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList59, serverAddressArray58);
        builder52.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList59);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = builder50.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList59);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder63.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet66 = builder63.excludeFields;
        com.mongodb.BasicDBObject basicDBObject67 = builder63.getmongoCollectionFilter();
        java.lang.String str68 = builder63.mongoLocalUser;
        com.mongodb.ServerAddress[] serverAddressArray69 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList70 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList70, serverAddressArray69);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder72 = builder63.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList70);
        java.lang.String str73 = builder63.mongoAdminPassword;
        java.lang.String[] strArray78 = new java.lang.String[] { "admin", "script_type", "credentials", "password" };
        java.util.LinkedHashSet<java.lang.String> strSet79 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet79, strArray78);
        builder63.setincludeFields((java.util.Set<java.lang.String>) strSet79);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder82 = builder50.excludeFields((java.util.Set<java.lang.String>) strSet79);
        builder20.includeFields = strSet79;
        java.lang.String str84 = builder20.mongoAdminUser;
        docScoreSearchScript0.setNextVar("script_type", (java.lang.Object) builder20);
        docScoreSearchScript0.setNextScore((float) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double88 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextScore((float) ' ');
        docScoreSearchScript0.setNextScore((float) (short) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder8.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet11 = builder8.excludeFields;
        com.mongodb.BasicDBObject basicDBObject12 = builder8.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = builder8.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray14 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList15 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList15, serverAddressArray14);
        builder8.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList15);
        java.lang.String str18 = builder8.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder8.dropCollection(true);
        boolean boolean21 = builder20.mongoSSLVerifyCertificate;
        java.lang.String[] strArray39 = new java.lang.String[] { "connect_timeout", "script_type", "collection", "secondary_read_preference", "throttle_size", "host", "actions", "drop_collection", "name", "initial_timestamp", "size", "script_type", "throttle_size", "hi!", "advanced_transformation", "name", "concurrent_requests" };
        java.util.LinkedHashSet<java.lang.String> strSet40 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet40, strArray39);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder20.includeFields((java.util.Set<java.lang.String>) strSet40);
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) strSet40);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder45.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet48 = builder45.excludeFields;
        builder45.setmongoCollection("hi!");
        boolean boolean51 = builder45.importAllCollections;
        java.lang.String str52 = builder45.mongoAdminPassword;
        builder45.typeName = "concurrent_bulk_requests";
        builder45.setskipInitialImport(false);
        boolean boolean57 = builder45.getadvancedTransformation();
        docScoreSearchScript0.setNextVar("null.initial_timestamp", (java.lang.Object) builder45);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double59 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextVar("disable_index_refresh", (java.lang.Object) "index");
        docScoreSearchScript0.setNextScore((float) 27017);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj8 = docScoreSearchScript0.run();
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextVar("disable_index_refresh", (java.lang.Object) "index");
        docScoreSearchScript0.setNextScore((float) 10L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder8.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet11 = builder8.excludeFields;
        builder8.setmongoCollection("initial_timestamp");
        boolean boolean14 = builder8.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder8.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder16);
        java.lang.String str18 = mongoDBRiverDefinition17.includeCollection;
        boolean boolean19 = mongoDBRiverDefinition17.mongoGridFS;
        java.lang.String str20 = mongoDBRiverDefinition17.getINITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD();
        java.util.Set<java.lang.String> strSet21 = mongoDBRiverDefinition17.getExcludeFields();
        java.lang.String str22 = mongoDBRiverDefinition17.mongoLocalUser;
        java.lang.Object obj23 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj24 = docScoreSearchScript0.run();
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        org.elasticsearch.common.logging.ESLogger eSLogger3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.logger;
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) eSLogger3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long5 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder4.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet7 = builder4.excludeFields;
        builder4.setmongoCollection("initial_timestamp");
        boolean boolean10 = builder4.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder4.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder12);
        java.lang.String str14 = mongoDBRiverDefinition13.includeCollection;
        java.lang.String str15 = mongoDBRiverDefinition13.getCOLLECTION_FIELD();
        boolean boolean16 = mongoDBRiverDefinition13.isImportAllCollections();
        boolean boolean17 = mongoDBRiverDefinition13.mongoGridFS;
        docScoreSearchScript0.setNextVar("collection", (java.lang.Object) mongoDBRiverDefinition13);
        docScoreSearchScript0.setNextScore((float) 100L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double21 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long3 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        docScoreSearchScript0.setNextScore(100.0f);
        docScoreSearchScript0.setNextScore((float) (-1L));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float7 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("include_fields", "script_type");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double3 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("include_collection", "host");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("flush_interval", "initial_timestamp");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        docScoreSearchScript0.setNextScore(100.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj5 = docScoreSearchScript0.run();
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("connect_timeout", "local");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextVar("disable_index_refresh", (java.lang.Object) "index");
        docScoreSearchScript0.setNextScore((float) 27017);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (byte) 10);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        docScoreSearchScript0.setNextVar("connect_timeout", (java.lang.Object) "type");
        java.lang.Object obj7 = docScoreSearchScript0.unwrap((java.lang.Object) "ssl");
        docScoreSearchScript0.setNextScore((float) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder10.setmongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder10.includeCollection("exclude_fields");
        java.lang.String str15 = builder14.getmongoLocalUser();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder16.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet19 = builder16.excludeFields;
        builder16.setmongoCollection("initial_timestamp");
        boolean boolean22 = builder16.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder16.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder24);
        java.lang.String str26 = mongoDBRiverDefinition25.includeCollection;
        java.lang.String str27 = mongoDBRiverDefinition25.getCOLLECTION_FIELD();
        java.util.Set<java.lang.String> strSet28 = mongoDBRiverDefinition25.excludeFields;
        boolean boolean29 = mongoDBRiverDefinition25.getstoreStatistics();
        boolean boolean30 = mongoDBRiverDefinition25.getmongoGridFS();
        java.lang.String str31 = mongoDBRiverDefinition25.getINITIAL_TIMESTAMP_SCRIPT_FIELD();
        java.lang.String str32 = mongoDBRiverDefinition25.getMongoDb();
        boolean boolean33 = mongoDBRiverDefinition25.isAdvancedTransformation();
        boolean boolean34 = mongoDBRiverDefinition25.importAllCollections;
        com.mongodb.BasicDBObject basicDBObject35 = mongoDBRiverDefinition25.getMongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder14.mongoCollectionFilter(basicDBObject35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject35);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        org.elasticsearch.common.logging.ESLogger eSLogger3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.logger;
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) eSLogger3);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder6.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet9 = builder6.excludeFields;
        com.mongodb.BasicDBObject basicDBObject10 = builder6.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = builder6.initialTimestamp;
        builder6.setstatisticsTypeName("ssl_verify_certificate");
        boolean boolean14 = builder6.getmongoUseSSL();
        java.lang.String str15 = builder6.indexName;
        java.util.Set<java.lang.String> strSet16 = builder6.getexcludeFields();
        docScoreSearchScript0.setNextVar("hi!", (java.lang.Object) builder6);
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long20 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        docScoreSearchScript0.setNextScore((float) 10L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder6.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet9 = builder6.excludeFields;
        builder6.setmongoCollection("initial_timestamp");
        boolean boolean12 = builder6.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder6.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder14);
        java.lang.String str16 = mongoDBRiverDefinition15.includeCollection;
        boolean boolean17 = mongoDBRiverDefinition15.mongoGridFS;
        boolean boolean18 = mongoDBRiverDefinition15.advancedTransformation;
        java.lang.String str19 = mongoDBRiverDefinition15.getADMIN_DB_FIELD();
        boolean boolean20 = mongoDBRiverDefinition15.getdisableIndexRefresh();
        boolean boolean21 = mongoDBRiverDefinition15.isMongoSecondaryReadPreference();
        java.lang.String str22 = mongoDBRiverDefinition15.mongoCollection;
        java.util.Set<java.lang.String> strSet23 = mongoDBRiverDefinition15.includeFields;
        int int24 = mongoDBRiverDefinition15.throttleSize;
        boolean boolean25 = mongoDBRiverDefinition15.disableIndexRefresh;
        docScoreSearchScript0.setNextVar("exclude_fields", (java.lang.Object) boolean25);
        docScoreSearchScript0.setNextScore((float) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double29 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextVar("disable_index_refresh", (java.lang.Object) "index");
        docScoreSearchScript0.setNextScore((float) 10L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder8.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet11 = builder8.excludeFields;
        builder8.setmongoCollection("initial_timestamp");
        boolean boolean14 = builder8.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder8.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder16);
        java.lang.String str18 = mongoDBRiverDefinition17.includeCollection;
        boolean boolean19 = mongoDBRiverDefinition17.mongoGridFS;
        java.lang.String str20 = mongoDBRiverDefinition17.getINITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD();
        java.util.Set<java.lang.String> strSet21 = mongoDBRiverDefinition17.getExcludeFields();
        java.lang.String str22 = mongoDBRiverDefinition17.mongoLocalUser;
        java.lang.Object obj23 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float24 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextVar("disable_index_refresh", (java.lang.Object) "index");
        docScoreSearchScript0.setNextScore((float) 10L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder8.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet11 = builder8.excludeFields;
        builder8.setmongoCollection("initial_timestamp");
        boolean boolean14 = builder8.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder8.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder16);
        java.lang.String str18 = mongoDBRiverDefinition17.includeCollection;
        boolean boolean19 = mongoDBRiverDefinition17.mongoGridFS;
        java.lang.String str20 = mongoDBRiverDefinition17.getINITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD();
        java.util.Set<java.lang.String> strSet21 = mongoDBRiverDefinition17.getExcludeFields();
        java.lang.String str22 = mongoDBRiverDefinition17.mongoLocalUser;
        java.lang.Object obj23 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition17);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder24.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet27 = builder24.excludeFields;
        builder24.setmongoCollection("initial_timestamp");
        boolean boolean30 = builder24.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder24.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition33 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder32);
        java.lang.String str34 = mongoDBRiverDefinition33.includeCollection;
        java.lang.String str35 = mongoDBRiverDefinition33.getTypeName();
        com.mongodb.BasicDBObject basicDBObject36 = mongoDBRiverDefinition33.getMongoCollectionFilter();
        java.lang.String str37 = mongoDBRiverDefinition33.mongoLocalPassword;
        java.lang.Object obj38 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition33);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder40.script("script");
        com.mongodb.BasicDBObject basicDBObject43 = builder42.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder42.typeName("connect_timeout");
        boolean boolean46 = builder42.mongoGridFS;
        boolean boolean47 = builder42.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition48 = builder42.build();
        java.lang.String str49 = mongoDBRiverDefinition48.getADMIN_DB_FIELD();
        java.lang.String str50 = mongoDBRiverDefinition48.getIncludeCollection();
        boolean boolean51 = mongoDBRiverDefinition48.getdropCollection();
        java.lang.String str52 = mongoDBRiverDefinition48.getINCLUDE_FIELDS_FIELD();
        docScoreSearchScript0.setNextVar("skip_initial_import", (java.lang.Object) str52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float54 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        docScoreSearchScript0.setNextVar("connect_timeout", (java.lang.Object) "type");
        java.lang.Object obj7 = docScoreSearchScript0.unwrap((java.lang.Object) "ssl");
        docScoreSearchScript0.setNextScore((float) 35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double10 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        docScoreSearchScript0.setNextScore((float) 10L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder6.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet9 = builder6.excludeFields;
        builder6.setmongoCollection("initial_timestamp");
        boolean boolean12 = builder6.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder6.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder14);
        java.lang.String str16 = mongoDBRiverDefinition15.includeCollection;
        boolean boolean17 = mongoDBRiverDefinition15.mongoGridFS;
        boolean boolean18 = mongoDBRiverDefinition15.advancedTransformation;
        java.lang.String str19 = mongoDBRiverDefinition15.getADMIN_DB_FIELD();
        boolean boolean20 = mongoDBRiverDefinition15.getdisableIndexRefresh();
        boolean boolean21 = mongoDBRiverDefinition15.isMongoSecondaryReadPreference();
        java.lang.String str22 = mongoDBRiverDefinition15.mongoCollection;
        java.util.Set<java.lang.String> strSet23 = mongoDBRiverDefinition15.includeFields;
        int int24 = mongoDBRiverDefinition15.throttleSize;
        boolean boolean25 = mongoDBRiverDefinition15.disableIndexRefresh;
        docScoreSearchScript0.setNextVar("exclude_fields", (java.lang.Object) boolean25);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder28.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet31 = builder28.excludeFields;
        builder28.setmongoCollection("initial_timestamp");
        boolean boolean34 = builder28.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder28.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition37 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder36);
        java.lang.String str38 = mongoDBRiverDefinition37.includeCollection;
        java.lang.String str39 = mongoDBRiverDefinition37.getCOLLECTION_FIELD();
        java.util.Set<java.lang.String> strSet40 = mongoDBRiverDefinition37.excludeFields;
        java.lang.String str41 = mongoDBRiverDefinition37.getOPTIONS_FIELD();
        java.lang.String str42 = mongoDBRiverDefinition37.getIndexName();
        docScoreSearchScript0.setNextVar("bulk_size", (java.lang.Object) mongoDBRiverDefinition37);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder44.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet47 = builder44.excludeFields;
        builder44.setmongoCollection("initial_timestamp");
        boolean boolean50 = builder44.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder44.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition53 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder52);
        java.lang.String str54 = mongoDBRiverDefinition53.includeCollection;
        java.lang.String str55 = mongoDBRiverDefinition53.getHOST_FIELD();
        java.lang.String str56 = mongoDBRiverDefinition53.getMongoLocalPassword();
        java.lang.String str57 = mongoDBRiverDefinition53.script;
        boolean boolean58 = mongoDBRiverDefinition53.mongoSSLVerifyCertificate;
        java.lang.String str59 = mongoDBRiverDefinition53.getSCRIPT_FIELD();
        java.lang.String str60 = mongoDBRiverDefinition53.getFILTER_FIELD();
        com.mongodb.MongoClientOptions mongoClientOptions61 = mongoDBRiverDefinition53.mongoClientOptions;
        java.lang.Object obj62 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition53);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (short) 1);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder4.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet7 = builder4.excludeFields;
        builder4.setmongoCollection("initial_timestamp");
        boolean boolean10 = builder4.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder4.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder12);
        java.lang.String str14 = mongoDBRiverDefinition13.includeCollection;
        java.lang.String str15 = mongoDBRiverDefinition13.getCOLLECTION_FIELD();
        boolean boolean16 = mongoDBRiverDefinition13.isImportAllCollections();
        boolean boolean17 = mongoDBRiverDefinition13.mongoGridFS;
        docScoreSearchScript0.setNextVar("collection", (java.lang.Object) mongoDBRiverDefinition13);
        docScoreSearchScript0.setNextScore((float) (-1L));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) ' ');
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextVar("disable_index_refresh", (java.lang.Object) "index");
        docScoreSearchScript0.setNextScore((float) 27017);
        docScoreSearchScript0.setNextVar("gridfs", (java.lang.Object) (-1.0d));
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder11.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet14 = builder11.excludeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder11.mongoSSLVerifyCertificate(true);
        boolean boolean17 = builder11.mongoSSLVerifyCertificate;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder18.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet21 = builder18.excludeFields;
        com.mongodb.BasicDBObject basicDBObject22 = builder18.getmongoCollectionFilter();
        java.lang.String str23 = builder18.mongoLocalUser;
        com.mongodb.ServerAddress[] serverAddressArray24 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList25 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList25, serverAddressArray24);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder18.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList25);
        java.lang.String str28 = builder18.mongoAdminPassword;
        java.lang.String[] strArray33 = new java.lang.String[] { "admin", "script_type", "credentials", "password" };
        java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        builder18.setincludeFields((java.util.Set<java.lang.String>) strSet34);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder11.parentTypes((java.util.Set<java.lang.String>) strSet34);
        int int38 = builder37.connectTimeout;
        com.mongodb.BasicDBObject basicDBObject39 = builder37.getmongoOplogFilter();
        builder37.setdisableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder42.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet45 = builder42.excludeFields;
        com.mongodb.BasicDBObject basicDBObject46 = builder42.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp47 = builder42.initialTimestamp;
        builder42.mongoCollection = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder42.typeName("exclude_fields");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder52.setmongoSecondaryReadPreference(false);
        boolean boolean55 = builder52.getmongoSSLVerifyCertificate();
        java.lang.String str56 = builder52.getriverIndexName();
        builder52.setimportAllCollections(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder52.mongoUseSSL(true);
        builder52.setdisableIndexRefresh(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder64 = builder52.script("bulk");
        com.mongodb.BasicDBObject basicDBObject65 = builder52.mongoCollectionFilter;
        builder42.mongoCollectionFilter = basicDBObject65;
        builder37.setmongoCollectionFilter(basicDBObject65);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject65);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextVar("disable_index_refresh", (java.lang.Object) "index");
        docScoreSearchScript0.setNextScore((float) 10L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder8.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet11 = builder8.excludeFields;
        builder8.setmongoCollection("initial_timestamp");
        boolean boolean14 = builder8.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder8.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder16);
        java.lang.String str18 = mongoDBRiverDefinition17.includeCollection;
        boolean boolean19 = mongoDBRiverDefinition17.mongoGridFS;
        java.lang.String str20 = mongoDBRiverDefinition17.getINITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD();
        java.util.Set<java.lang.String> strSet21 = mongoDBRiverDefinition17.getExcludeFields();
        java.lang.String str22 = mongoDBRiverDefinition17.mongoLocalUser;
        java.lang.Object obj23 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition17);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder24.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet27 = builder24.excludeFields;
        builder24.setmongoCollection("initial_timestamp");
        boolean boolean30 = builder24.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder24.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition33 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder32);
        java.lang.String str34 = mongoDBRiverDefinition33.includeCollection;
        java.lang.String str35 = mongoDBRiverDefinition33.getTypeName();
        com.mongodb.BasicDBObject basicDBObject36 = mongoDBRiverDefinition33.getMongoCollectionFilter();
        java.lang.String str37 = mongoDBRiverDefinition33.mongoLocalPassword;
        java.lang.Object obj38 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition33);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder40.script("script");
        com.mongodb.BasicDBObject basicDBObject43 = builder42.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder42.typeName("connect_timeout");
        boolean boolean46 = builder42.mongoGridFS;
        boolean boolean47 = builder42.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition48 = builder42.build();
        java.lang.String str49 = mongoDBRiverDefinition48.getADMIN_DB_FIELD();
        java.lang.String str50 = mongoDBRiverDefinition48.getIncludeCollection();
        boolean boolean51 = mongoDBRiverDefinition48.getdropCollection();
        java.lang.String str52 = mongoDBRiverDefinition48.getINCLUDE_FIELDS_FIELD();
        docScoreSearchScript0.setNextVar("skip_initial_import", (java.lang.Object) str52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long54 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("size", "db");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        docScoreSearchScript0.setNextScore((float) 10L);
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder8.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet11 = builder8.excludeFields;
        builder8.setmongoCollection("initial_timestamp");
        boolean boolean14 = builder8.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder8.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.script("script");
        com.mongodb.BasicDBObject basicDBObject20 = builder19.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder8.mongoCollectionFilter(basicDBObject20);
        docScoreSearchScript0.setNextVar("null.initial_timestamp", (java.lang.Object) builder21);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder24.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet27 = builder24.excludeFields;
        builder24.setmongoCollection("initial_timestamp");
        boolean boolean30 = builder24.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder24.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition33 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder32);
        java.lang.String str34 = mongoDBRiverDefinition33.includeCollection;
        java.lang.String str35 = mongoDBRiverDefinition33.getIndexName();
        java.lang.String str36 = mongoDBRiverDefinition33.getSECONDARY_READ_PREFERENCE_FIELD();
        java.lang.String str37 = mongoDBRiverDefinition33.script;
        java.lang.String str38 = mongoDBRiverDefinition33.getGRIDFS_FIELD();
        int int39 = mongoDBRiverDefinition33.getDEFAULT_CONCURRENT_REQUESTS();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp40 = mongoDBRiverDefinition33.getInitialTimestamp();
        com.mongodb.BasicDBObject basicDBObject41 = mongoDBRiverDefinition33.mongoCollectionFilter;
        java.util.List<com.mongodb.ServerAddress> serverAddressList42 = mongoDBRiverDefinition33.getMongoServers();
        docScoreSearchScript0.setNextVar("drop_collection", (java.lang.Object) mongoDBRiverDefinition33);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double44 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("initial_timestamp", "host");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder1.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet4 = builder1.excludeFields;
        builder1.setmongoCollection("initial_timestamp");
        boolean boolean7 = builder1.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder1.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder9);
        java.lang.String str11 = mongoDBRiverDefinition10.includeCollection;
        java.lang.String str12 = mongoDBRiverDefinition10.getCOLLECTION_FIELD();
        int int13 = mongoDBRiverDefinition10.throttleSize;
        java.lang.String str14 = mongoDBRiverDefinition10.getRiverName();
        java.lang.String str15 = mongoDBRiverDefinition10.getPARENT_TYPES_FIELD();
        java.lang.String str16 = mongoDBRiverDefinition10.getSERVERS_FIELD();
        java.lang.String str17 = mongoDBRiverDefinition10.mongoLocalUser;
        java.lang.Object obj18 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float19 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        docScoreSearchScript0.setNextVar("connect_timeout", (java.lang.Object) "type");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj6 = docScoreSearchScript0.run();
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder4.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet7 = builder4.excludeFields;
        builder4.setmongoCollection("initial_timestamp");
        boolean boolean10 = builder4.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder4.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder12);
        java.lang.String str14 = mongoDBRiverDefinition13.includeCollection;
        java.lang.String str15 = mongoDBRiverDefinition13.getCOLLECTION_FIELD();
        boolean boolean16 = mongoDBRiverDefinition13.isImportAllCollections();
        boolean boolean17 = mongoDBRiverDefinition13.mongoGridFS;
        docScoreSearchScript0.setNextVar("collection", (java.lang.Object) mongoDBRiverDefinition13);
        docScoreSearchScript0.setNextScore((float) 100L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder21.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet24 = builder21.excludeFields;
        builder21.setmongoCollection("initial_timestamp");
        boolean boolean27 = builder21.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder21.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition30 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder29);
        java.lang.String str31 = mongoDBRiverDefinition30.includeCollection;
        java.lang.String str32 = mongoDBRiverDefinition30.getCOLLECTION_FIELD();
        java.util.Set<java.lang.String> strSet33 = mongoDBRiverDefinition30.excludeFields;
        boolean boolean34 = mongoDBRiverDefinition30.getstoreStatistics();
        boolean boolean35 = mongoDBRiverDefinition30.getmongoGridFS();
        java.lang.String str36 = mongoDBRiverDefinition30.getSECONDARY_READ_PREFERENCE_FIELD();
        int int37 = mongoDBRiverDefinition30.socketTimeout;
        com.mongodb.BasicDBObject basicDBObject38 = mongoDBRiverDefinition30.mongoCollectionFilter;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject38);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        docScoreSearchScript0.setNextScore(100.0f);
        docScoreSearchScript0.setNextScore((float) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder7.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet10 = builder7.excludeFields;
        com.mongodb.BasicDBObject basicDBObject11 = builder7.getmongoCollectionFilter();
        java.lang.String str12 = builder7.mongoLocalUser;
        builder7.setscript("drop_collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder15.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet18 = builder15.excludeFields;
        com.mongodb.BasicDBObject basicDBObject19 = builder15.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder7.mongoCollectionFilter(basicDBObject19);
        java.lang.String str21 = builder7.getstatisticsIndexName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder7.mongoUseSSL(false);
        builder23.setriverIndexName("");
        builder23.importAllCollections = false;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder28.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet31 = builder28.excludeFields;
        java.lang.String str32 = builder28.getmongoLocalPassword();
        builder28.disableIndexRefresh = true;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder28.mongoAdminUser("");
        builder36.mongoCollection = "hi!";
        builder36.setmongoAdminPassword("options");
        builder36.includeCollection = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder43.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet46 = builder43.excludeFields;
        com.mongodb.BasicDBObject basicDBObject47 = builder43.getmongoCollectionFilter();
        java.lang.String str48 = builder43.mongoLocalUser;
        com.mongodb.ServerAddress[] serverAddressArray49 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList50 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList50, serverAddressArray49);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder43.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList50);
        com.mongodb.MongoClientOptions mongoClientOptions53 = builder43.getmongoClientOptions();
        builder43.riverName = "script_type";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder56.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet59 = builder56.excludeFields;
        com.mongodb.BasicDBObject basicDBObject60 = builder56.getmongoCollectionFilter();
        builder43.setmongoOplogFilter(basicDBObject60);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = builder36.mongoOplogFilter(basicDBObject60);
        builder23.mongoOplogFilter = basicDBObject60;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject60);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder1.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet4 = builder1.excludeFields;
        builder1.setmongoCollection("initial_timestamp");
        boolean boolean7 = builder1.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder1.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder9);
        java.lang.String str11 = mongoDBRiverDefinition10.includeCollection;
        java.lang.String str12 = mongoDBRiverDefinition10.getCOLLECTION_FIELD();
        int int13 = mongoDBRiverDefinition10.throttleSize;
        java.lang.String str14 = mongoDBRiverDefinition10.getRiverName();
        java.lang.String str15 = mongoDBRiverDefinition10.getPARENT_TYPES_FIELD();
        java.lang.String str16 = mongoDBRiverDefinition10.getSERVERS_FIELD();
        java.lang.String str17 = mongoDBRiverDefinition10.mongoLocalUser;
        java.lang.Object obj18 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (short) 0);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_timeout", "localhost");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        docScoreSearchScript0.setNextVar("connect_timeout", (java.lang.Object) "type");
        java.lang.Object obj7 = docScoreSearchScript0.unwrap((java.lang.Object) "ssl");
        docScoreSearchScript0.setNextScore((float) 35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj10 = docScoreSearchScript0.run();
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("index", "null.initial_timestamp");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        org.elasticsearch.common.logging.ESLogger eSLogger3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.logger;
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) eSLogger3);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder5.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet8 = builder5.excludeFields;
        builder5.setmongoCollection("initial_timestamp");
        boolean boolean11 = builder5.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder5.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder13);
        java.lang.String str15 = mongoDBRiverDefinition14.includeCollection;
        boolean boolean16 = mongoDBRiverDefinition14.mongoGridFS;
        boolean boolean17 = mongoDBRiverDefinition14.advancedTransformation;
        java.lang.String str18 = mongoDBRiverDefinition14.getADMIN_DB_FIELD();
        boolean boolean19 = mongoDBRiverDefinition14.getdisableIndexRefresh();
        boolean boolean20 = mongoDBRiverDefinition14.isMongoSecondaryReadPreference();
        java.lang.String str21 = mongoDBRiverDefinition14.mongoCollection;
        java.util.Set<java.lang.String> strSet22 = mongoDBRiverDefinition14.includeFields;
        int int23 = mongoDBRiverDefinition14.throttleSize;
        com.mongodb.BasicDBObject basicDBObject24 = mongoDBRiverDefinition14.mongoCollectionFilter;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject24);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        docScoreSearchScript0.setNextScore((float) 10L);
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(27017);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextVar("disable_index_refresh", (java.lang.Object) "index");
        java.lang.Object obj7 = new java.lang.Object();
        docScoreSearchScript0.setNextVar("concurrent_bulk_requests", obj7);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder9.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet12 = builder9.excludeFields;
        com.mongodb.BasicDBObject basicDBObject13 = builder9.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = builder9.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray15 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList16 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList16, serverAddressArray15);
        builder9.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList16);
        java.lang.String str19 = builder9.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder9.dropCollection(true);
        boolean boolean22 = builder21.mongoSSLVerifyCertificate;
        java.lang.String str23 = builder21.typeName;
        builder21.typeName = "include_fields";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder26.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet29 = builder26.excludeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder26.mongoSSLVerifyCertificate(true);
        java.util.Set<java.lang.String> strSet32 = builder31.excludeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder33.setmongoSecondaryReadPreference(false);
        boolean boolean36 = builder33.getmongoSSLVerifyCertificate();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder37.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet40 = builder37.excludeFields;
        com.mongodb.BasicDBObject basicDBObject41 = builder37.getmongoCollectionFilter();
        java.lang.String str42 = builder37.mongoLocalUser;
        com.mongodb.ServerAddress[] serverAddressArray43 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList44 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList44, serverAddressArray43);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder37.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList44);
        com.mongodb.MongoClientOptions mongoClientOptions47 = builder37.getmongoClientOptions();
        builder37.riverName = "script_type";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder50.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet53 = builder50.excludeFields;
        com.mongodb.BasicDBObject basicDBObject54 = builder50.getmongoCollectionFilter();
        builder37.setmongoOplogFilter(basicDBObject54);
        com.mongodb.BasicDBObject basicDBObject56 = builder37.mongoOplogFilter;
        builder33.setmongoOplogFilter(basicDBObject56);
        builder31.setmongoCollectionFilter(basicDBObject56);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = builder21.mongoCollectionFilter(basicDBObject56);
        java.lang.Object obj60 = docScoreSearchScript0.unwrap((java.lang.Object) basicDBObject56);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long61 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("exclude_fields", "socket_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextScore((float) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder5.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet8 = builder5.excludeFields;
        builder5.setmongoCollection("initial_timestamp");
        boolean boolean11 = builder5.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder5.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder13);
        java.lang.String str15 = mongoDBRiverDefinition14.includeCollection;
        java.lang.String str16 = mongoDBRiverDefinition14.getHOST_FIELD();
        org.elasticsearch.common.logging.ESLogger eSLogger17 = mongoDBRiverDefinition14.getlogger();
        java.lang.Object obj18 = docScoreSearchScript0.unwrap((java.lang.Object) eSLogger17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj19 = docScoreSearchScript0.run();
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        docScoreSearchScript0.setNextScore(100.0f);
        docScoreSearchScript0.setNextScore((float) (-1L));
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder7.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet10 = builder7.excludeFields;
        builder7.setmongoCollection("initial_timestamp");
        boolean boolean13 = builder7.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder7.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder15);
        java.lang.String str17 = mongoDBRiverDefinition16.includeCollection;
        boolean boolean18 = mongoDBRiverDefinition16.mongoGridFS;
        boolean boolean19 = mongoDBRiverDefinition16.advancedTransformation;
        org.elasticsearch.common.unit.TimeValue timeValue20 = mongoDBRiverDefinition16.getDEFAULT_FLUSH_INTERVAL();
        boolean boolean21 = mongoDBRiverDefinition16.getmongoGridFS();
        boolean boolean22 = mongoDBRiverDefinition16.getmongoUseSSL();
        java.util.List<com.mongodb.ServerAddress> serverAddressList23 = mongoDBRiverDefinition16.mongoServers;
        com.mongodb.BasicDBObject basicDBObject24 = mongoDBRiverDefinition16.mongoCollectionFilter;
        java.lang.Object obj25 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj26 = docScoreSearchScript0.run();
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextVar("disable_index_refresh", (java.lang.Object) "index");
        docScoreSearchScript0.setNextScore((float) 27017);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) '4');
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder4.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet7 = builder4.excludeFields;
        builder4.setmongoCollection("initial_timestamp");
        boolean boolean10 = builder4.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder4.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder12);
        java.lang.String str14 = mongoDBRiverDefinition13.includeCollection;
        java.lang.String str15 = mongoDBRiverDefinition13.getCOLLECTION_FIELD();
        boolean boolean16 = mongoDBRiverDefinition13.isImportAllCollections();
        boolean boolean17 = mongoDBRiverDefinition13.mongoGridFS;
        docScoreSearchScript0.setNextVar("collection", (java.lang.Object) mongoDBRiverDefinition13);
        docScoreSearchScript0.setNextScore((float) (-1L));
        docScoreSearchScript0.setNextScore((float) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double23 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("options", "gridfs");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder1.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet4 = builder1.excludeFields;
        builder1.setmongoCollection("initial_timestamp");
        boolean boolean7 = builder1.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder1.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder9);
        java.lang.String str11 = mongoDBRiverDefinition10.includeCollection;
        java.lang.String str12 = mongoDBRiverDefinition10.getCOLLECTION_FIELD();
        int int13 = mongoDBRiverDefinition10.throttleSize;
        java.lang.String str14 = mongoDBRiverDefinition10.getRiverName();
        java.lang.String str15 = mongoDBRiverDefinition10.getPARENT_TYPES_FIELD();
        java.lang.String str16 = mongoDBRiverDefinition10.getSERVERS_FIELD();
        java.lang.String str17 = mongoDBRiverDefinition10.mongoLocalUser;
        java.lang.Object obj18 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(97);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        docScoreSearchScript0.setNextScore(100.0f);
        docScoreSearchScript0.setNextScore((float) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long7 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk", "secondary_read_preference");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextVar("disable_index_refresh", (java.lang.Object) "index");
        docScoreSearchScript0.setNextScore((float) 10L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder8.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet11 = builder8.excludeFields;
        builder8.setmongoCollection("hi!");
        boolean boolean14 = builder8.importAllCollections;
        java.lang.String str15 = builder8.mongoAdminPassword;
        java.lang.Object obj16 = docScoreSearchScript0.unwrap((java.lang.Object) builder8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder18.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet21 = builder18.excludeFields;
        com.mongodb.BasicDBObject basicDBObject22 = builder18.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp23 = builder18.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray24 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList25 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList25, serverAddressArray24);
        builder18.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList25);
        builder17.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList25);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder29.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet32 = builder29.excludeFields;
        com.mongodb.BasicDBObject basicDBObject33 = builder29.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp34 = builder29.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray35 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList36 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList36, serverAddressArray35);
        builder29.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList36);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder17.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList36);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder17.indexName("");
        builder41.setskipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder44.script("script");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder47.script("script");
        java.lang.String[] strArray81 = new java.lang.String[] { "include_collection", "host", "hi!", "drop_collection", "size", "filter", "bulk_timeout", "drop_collection", "concurrent_bulk_requests", "servers", "localhost", "store_statistics", "script", "secondary_read_preference", "throttle_size", "parent_types", "db", "type", "admin", "filter", "servers", "user", "secondary_read_preference", "connect_timeout", "local", "host", "drop_collection", "user", "password", "ssl_verify_certificate", "password" };
        java.util.LinkedHashSet<java.lang.String> strSet82 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet82, strArray81);
        builder49.setparentTypes((java.util.Set<java.lang.String>) strSet82);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder85 = builder44.excludeFields((java.util.Set<java.lang.String>) strSet82);
        builder41.setparentTypes((java.util.Set<java.lang.String>) strSet82);
        int int87 = builder41.getsocketTimeout();
        java.lang.String str88 = builder41.getriverName();
        builder41.mongoSSLVerifyCertificate = false;
        com.mongodb.BasicDBObject basicDBObject91 = builder41.mongoCollectionFilter;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject91);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder4.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet7 = builder4.excludeFields;
        builder4.setmongoCollection("initial_timestamp");
        boolean boolean10 = builder4.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder4.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder12);
        java.lang.String str14 = mongoDBRiverDefinition13.includeCollection;
        java.lang.String str15 = mongoDBRiverDefinition13.getCOLLECTION_FIELD();
        boolean boolean16 = mongoDBRiverDefinition13.isImportAllCollections();
        boolean boolean17 = mongoDBRiverDefinition13.mongoGridFS;
        docScoreSearchScript0.setNextVar("collection", (java.lang.Object) mongoDBRiverDefinition13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder20.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet23 = builder20.excludeFields;
        com.mongodb.BasicDBObject basicDBObject24 = builder20.getmongoCollectionFilter();
        java.lang.String str25 = builder20.mongoLocalUser;
        com.mongodb.ServerAddress[] serverAddressArray26 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList27 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList27, serverAddressArray26);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder20.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList27);
        com.mongodb.MongoClientOptions mongoClientOptions30 = builder20.getmongoClientOptions();
        builder20.riverName = "script_type";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder33.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet36 = builder33.excludeFields;
        com.mongodb.BasicDBObject basicDBObject37 = builder33.getmongoCollectionFilter();
        builder20.setmongoOplogFilter(basicDBObject37);
        boolean boolean39 = builder20.mongoGridFS;
        boolean boolean40 = builder20.getadvancedTransformation();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder41.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet44 = builder41.excludeFields;
        com.mongodb.BasicDBObject basicDBObject45 = builder41.getmongoCollectionFilter();
        java.lang.String str46 = builder41.mongoLocalUser;
        com.mongodb.ServerAddress[] serverAddressArray47 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList48 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList48, serverAddressArray47);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder41.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList48);
        boolean boolean51 = builder50.dropCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder52.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet55 = builder52.excludeFields;
        com.mongodb.BasicDBObject basicDBObject56 = builder52.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp57 = builder52.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray58 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList59 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList59, serverAddressArray58);
        builder52.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList59);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = builder50.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList59);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder63.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet66 = builder63.excludeFields;
        com.mongodb.BasicDBObject basicDBObject67 = builder63.getmongoCollectionFilter();
        java.lang.String str68 = builder63.mongoLocalUser;
        com.mongodb.ServerAddress[] serverAddressArray69 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList70 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList70, serverAddressArray69);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder72 = builder63.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList70);
        java.lang.String str73 = builder63.mongoAdminPassword;
        java.lang.String[] strArray78 = new java.lang.String[] { "admin", "script_type", "credentials", "password" };
        java.util.LinkedHashSet<java.lang.String> strSet79 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet79, strArray78);
        builder63.setincludeFields((java.util.Set<java.lang.String>) strSet79);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder82 = builder50.excludeFields((java.util.Set<java.lang.String>) strSet79);
        builder20.includeFields = strSet79;
        java.lang.String str84 = builder20.mongoAdminUser;
        docScoreSearchScript0.setNextVar("script_type", (java.lang.Object) builder20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(97);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("parent_types", "size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("ssl", "initial_timestamp");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        docScoreSearchScript0.setNextScore(100.0f);
        docScoreSearchScript0.setNextScore((float) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder7.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet10 = builder7.excludeFields;
        builder7.setmongoCollection("initial_timestamp");
        boolean boolean13 = builder7.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder7.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder15);
        java.lang.String str17 = mongoDBRiverDefinition16.includeCollection;
        boolean boolean18 = mongoDBRiverDefinition16.mongoGridFS;
        boolean boolean19 = mongoDBRiverDefinition16.mongoGridFS;
        boolean boolean20 = mongoDBRiverDefinition16.getmongoSecondaryReadPreference();
        java.lang.String str21 = mongoDBRiverDefinition16.getINCLUDE_COLLECTION_FIELD();
        java.lang.String str22 = mongoDBRiverDefinition16.script;
        com.mongodb.BasicDBObject basicDBObject23 = mongoDBRiverDefinition16.getMongoCollectionFilter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject23);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("initial_timestamp", "index");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextScore((float) ' ');
        docScoreSearchScript0.setNextScore((float) (short) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder8.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet11 = builder8.excludeFields;
        com.mongodb.BasicDBObject basicDBObject12 = builder8.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = builder8.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray14 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList15 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList15, serverAddressArray14);
        builder8.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList15);
        java.lang.String str18 = builder8.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder8.dropCollection(true);
        boolean boolean21 = builder20.mongoSSLVerifyCertificate;
        java.lang.String[] strArray39 = new java.lang.String[] { "connect_timeout", "script_type", "collection", "secondary_read_preference", "throttle_size", "host", "actions", "drop_collection", "name", "initial_timestamp", "size", "script_type", "throttle_size", "hi!", "advanced_transformation", "name", "concurrent_requests" };
        java.util.LinkedHashSet<java.lang.String> strSet40 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet40, strArray39);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder20.includeFields((java.util.Set<java.lang.String>) strSet40);
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) strSet40);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder45.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet48 = builder45.excludeFields;
        builder45.setmongoCollection("hi!");
        boolean boolean51 = builder45.importAllCollections;
        java.lang.String str52 = builder45.mongoAdminPassword;
        builder45.typeName = "concurrent_bulk_requests";
        builder45.setskipInitialImport(false);
        boolean boolean57 = builder45.getadvancedTransformation();
        docScoreSearchScript0.setNextVar("null.initial_timestamp", (java.lang.Object) builder45);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder60.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet63 = builder60.excludeFields;
        java.lang.String str64 = builder60.getmongoLocalPassword();
        java.lang.String str65 = builder60.getmongoAdminUser();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder67 = builder60.mongoLocalPassword("options");
        docScoreSearchScript0.setNextVar("", (java.lang.Object) builder67);
        docScoreSearchScript0.setNextScore((float) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj71 = docScoreSearchScript0.run();
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("user", "skip_initial_import");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder4.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet7 = builder4.excludeFields;
        builder4.setmongoCollection("initial_timestamp");
        boolean boolean10 = builder4.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder4.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder12);
        java.lang.String str14 = mongoDBRiverDefinition13.includeCollection;
        java.lang.String str15 = mongoDBRiverDefinition13.getCOLLECTION_FIELD();
        boolean boolean16 = mongoDBRiverDefinition13.isImportAllCollections();
        boolean boolean17 = mongoDBRiverDefinition13.mongoGridFS;
        docScoreSearchScript0.setNextVar("collection", (java.lang.Object) mongoDBRiverDefinition13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder20.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet23 = builder20.excludeFields;
        com.mongodb.BasicDBObject basicDBObject24 = builder20.getmongoCollectionFilter();
        java.lang.String str25 = builder20.mongoLocalUser;
        com.mongodb.ServerAddress[] serverAddressArray26 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList27 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList27, serverAddressArray26);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder20.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList27);
        com.mongodb.MongoClientOptions mongoClientOptions30 = builder20.getmongoClientOptions();
        builder20.riverName = "script_type";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder33.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet36 = builder33.excludeFields;
        com.mongodb.BasicDBObject basicDBObject37 = builder33.getmongoCollectionFilter();
        builder20.setmongoOplogFilter(basicDBObject37);
        boolean boolean39 = builder20.mongoGridFS;
        boolean boolean40 = builder20.getadvancedTransformation();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder41.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet44 = builder41.excludeFields;
        com.mongodb.BasicDBObject basicDBObject45 = builder41.getmongoCollectionFilter();
        java.lang.String str46 = builder41.mongoLocalUser;
        com.mongodb.ServerAddress[] serverAddressArray47 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList48 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList48, serverAddressArray47);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder41.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList48);
        boolean boolean51 = builder50.dropCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder52.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet55 = builder52.excludeFields;
        com.mongodb.BasicDBObject basicDBObject56 = builder52.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp57 = builder52.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray58 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList59 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList59, serverAddressArray58);
        builder52.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList59);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = builder50.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList59);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder63.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet66 = builder63.excludeFields;
        com.mongodb.BasicDBObject basicDBObject67 = builder63.getmongoCollectionFilter();
        java.lang.String str68 = builder63.mongoLocalUser;
        com.mongodb.ServerAddress[] serverAddressArray69 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList70 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList70, serverAddressArray69);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder72 = builder63.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList70);
        java.lang.String str73 = builder63.mongoAdminPassword;
        java.lang.String[] strArray78 = new java.lang.String[] { "admin", "script_type", "credentials", "password" };
        java.util.LinkedHashSet<java.lang.String> strSet79 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet79, strArray78);
        builder63.setincludeFields((java.util.Set<java.lang.String>) strSet79);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder82 = builder50.excludeFields((java.util.Set<java.lang.String>) strSet79);
        builder20.includeFields = strSet79;
        java.lang.String str84 = builder20.mongoAdminUser;
        docScoreSearchScript0.setNextVar("script_type", (java.lang.Object) builder20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long86 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextScore((float) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(0);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("drop_collection", "socket_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        docScoreSearchScript0.setNextScore((float) 10L);
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        docScoreSearchScript0.setNextScore(10.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj9 = docScoreSearchScript0.run();
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("collection", "concurrent_requests");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("null.initial_timestamp", "drop_collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 'a');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder3.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet6 = builder3.excludeFields;
        com.mongodb.BasicDBObject basicDBObject7 = builder3.getmongoCollectionFilter();
        java.lang.String str8 = builder3.mongoLocalUser;
        builder3.setscript("drop_collection");
        com.mongodb.BasicDBObject basicDBObject11 = builder3.mongoCollectionFilter;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject11);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        docScoreSearchScript0.setNextScore((float) 10L);
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder8.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet11 = builder8.excludeFields;
        builder8.setmongoCollection("initial_timestamp");
        boolean boolean14 = builder8.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder8.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.script("script");
        com.mongodb.BasicDBObject basicDBObject20 = builder19.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder8.mongoCollectionFilter(basicDBObject20);
        docScoreSearchScript0.setNextVar("null.initial_timestamp", (java.lang.Object) builder21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long23 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        docScoreSearchScript0.setNextScore((float) 10L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder6.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet9 = builder6.excludeFields;
        builder6.setmongoCollection("initial_timestamp");
        boolean boolean12 = builder6.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder6.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder14);
        java.lang.String str16 = mongoDBRiverDefinition15.includeCollection;
        boolean boolean17 = mongoDBRiverDefinition15.mongoGridFS;
        boolean boolean18 = mongoDBRiverDefinition15.advancedTransformation;
        java.lang.String str19 = mongoDBRiverDefinition15.getADMIN_DB_FIELD();
        boolean boolean20 = mongoDBRiverDefinition15.getdisableIndexRefresh();
        boolean boolean21 = mongoDBRiverDefinition15.isMongoSecondaryReadPreference();
        java.lang.String str22 = mongoDBRiverDefinition15.mongoCollection;
        java.util.Set<java.lang.String> strSet23 = mongoDBRiverDefinition15.includeFields;
        int int24 = mongoDBRiverDefinition15.throttleSize;
        boolean boolean25 = mongoDBRiverDefinition15.disableIndexRefresh;
        docScoreSearchScript0.setNextVar("exclude_fields", (java.lang.Object) boolean25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float27 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder4.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet7 = builder4.excludeFields;
        builder4.setmongoCollection("initial_timestamp");
        boolean boolean10 = builder4.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder4.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder12);
        java.lang.String str14 = mongoDBRiverDefinition13.includeCollection;
        java.lang.String str15 = mongoDBRiverDefinition13.getCOLLECTION_FIELD();
        boolean boolean16 = mongoDBRiverDefinition13.isImportAllCollections();
        boolean boolean17 = mongoDBRiverDefinition13.mongoGridFS;
        docScoreSearchScript0.setNextVar("collection", (java.lang.Object) mongoDBRiverDefinition13);
        docScoreSearchScript0.setNextScore((float) (-1L));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj21 = docScoreSearchScript0.run();
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextVar("disable_index_refresh", (java.lang.Object) "index");
        docScoreSearchScript0.setNextScore((float) 10L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder8.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet11 = builder8.excludeFields;
        builder8.setmongoCollection("initial_timestamp");
        boolean boolean14 = builder8.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder8.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder16);
        java.lang.String str18 = mongoDBRiverDefinition17.includeCollection;
        boolean boolean19 = mongoDBRiverDefinition17.mongoGridFS;
        java.lang.String str20 = mongoDBRiverDefinition17.getINITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD();
        java.util.Set<java.lang.String> strSet21 = mongoDBRiverDefinition17.getExcludeFields();
        java.lang.String str22 = mongoDBRiverDefinition17.mongoLocalUser;
        java.lang.Object obj23 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition17);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder24.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet27 = builder24.excludeFields;
        builder24.setmongoCollection("initial_timestamp");
        boolean boolean30 = builder24.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder24.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition33 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder32);
        java.lang.String str34 = mongoDBRiverDefinition33.includeCollection;
        java.lang.String str35 = mongoDBRiverDefinition33.getTypeName();
        com.mongodb.BasicDBObject basicDBObject36 = mongoDBRiverDefinition33.getMongoCollectionFilter();
        java.lang.String str37 = mongoDBRiverDefinition33.mongoLocalPassword;
        java.lang.Object obj38 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition33);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder40.script("script");
        com.mongodb.BasicDBObject basicDBObject43 = builder42.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder42.typeName("connect_timeout");
        boolean boolean46 = builder42.mongoGridFS;
        boolean boolean47 = builder42.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition48 = builder42.build();
        java.lang.String str49 = mongoDBRiverDefinition48.getADMIN_DB_FIELD();
        java.lang.String str50 = mongoDBRiverDefinition48.getIncludeCollection();
        boolean boolean51 = mongoDBRiverDefinition48.getdropCollection();
        java.lang.String str52 = mongoDBRiverDefinition48.getINCLUDE_FIELDS_FIELD();
        docScoreSearchScript0.setNextVar("skip_initial_import", (java.lang.Object) str52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double54 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("ssl", "size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        docScoreSearchScript0.setNextScore((float) 10L);
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        docScoreSearchScript0.setNextScore(10.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder9.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet12 = builder9.excludeFields;
        builder9.setmongoCollection("initial_timestamp");
        boolean boolean15 = builder9.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder9.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder17);
        java.lang.String str19 = mongoDBRiverDefinition18.includeCollection;
        java.lang.String str20 = mongoDBRiverDefinition18.getHOST_FIELD();
        boolean boolean21 = mongoDBRiverDefinition18.getmongoSecondaryReadPreference();
        java.lang.String str22 = mongoDBRiverDefinition18.getSCRIPT_FIELD();
        boolean boolean23 = mongoDBRiverDefinition18.importAllCollections;
        java.lang.String str24 = mongoDBRiverDefinition18.scriptType;
        java.lang.String str25 = mongoDBRiverDefinition18.getMongoAdminUser();
        java.util.Set<java.lang.String> strSet26 = mongoDBRiverDefinition18.excludeFields;
        com.mongodb.BasicDBObject basicDBObject27 = mongoDBRiverDefinition18.mongoCollectionFilter;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject27);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 0L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj3 = docScoreSearchScript0.run();
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        org.elasticsearch.common.logging.ESLogger eSLogger3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.logger;
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) eSLogger3);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder5.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet8 = builder5.excludeFields;
        com.mongodb.BasicDBObject basicDBObject9 = builder5.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = builder5.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray11 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList12 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList12, serverAddressArray11);
        builder5.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList12);
        java.lang.String str15 = builder5.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder5.dropCollection(true);
        builder17.setriverIndexName("flush_interval");
        int int20 = builder17.socketTimeout;
        builder17.settypeName("user");
        java.lang.Object obj23 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (byte) 1);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("drop_collection", "gridfs");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("localhost", "null.initial_timestamp");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        docScoreSearchScript0.setNextScore((float) 10L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder6.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet9 = builder6.excludeFields;
        builder6.setmongoCollection("initial_timestamp");
        boolean boolean12 = builder6.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder6.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder14);
        java.lang.String str16 = mongoDBRiverDefinition15.includeCollection;
        boolean boolean17 = mongoDBRiverDefinition15.mongoGridFS;
        boolean boolean18 = mongoDBRiverDefinition15.advancedTransformation;
        java.lang.String str19 = mongoDBRiverDefinition15.getADMIN_DB_FIELD();
        boolean boolean20 = mongoDBRiverDefinition15.getdisableIndexRefresh();
        boolean boolean21 = mongoDBRiverDefinition15.isMongoSecondaryReadPreference();
        java.lang.String str22 = mongoDBRiverDefinition15.mongoCollection;
        java.util.Set<java.lang.String> strSet23 = mongoDBRiverDefinition15.includeFields;
        int int24 = mongoDBRiverDefinition15.throttleSize;
        boolean boolean25 = mongoDBRiverDefinition15.disableIndexRefresh;
        docScoreSearchScript0.setNextVar("exclude_fields", (java.lang.Object) boolean25);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder28.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet31 = builder28.excludeFields;
        builder28.setmongoCollection("initial_timestamp");
        boolean boolean34 = builder28.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder28.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition37 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder36);
        java.lang.String str38 = mongoDBRiverDefinition37.includeCollection;
        java.lang.String str39 = mongoDBRiverDefinition37.getCOLLECTION_FIELD();
        java.util.Set<java.lang.String> strSet40 = mongoDBRiverDefinition37.excludeFields;
        java.lang.String str41 = mongoDBRiverDefinition37.getOPTIONS_FIELD();
        java.lang.String str42 = mongoDBRiverDefinition37.getIndexName();
        docScoreSearchScript0.setNextVar("bulk_size", (java.lang.Object) mongoDBRiverDefinition37);
        docScoreSearchScript0.setNextScore((float) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder47.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet50 = builder47.excludeFields;
        builder47.setmongoCollection("initial_timestamp");
        boolean boolean53 = builder47.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder47.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition56 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder55);
        java.lang.String str57 = mongoDBRiverDefinition56.includeCollection;
        java.lang.String str58 = mongoDBRiverDefinition56.getHOST_FIELD();
        java.lang.String str59 = mongoDBRiverDefinition56.getCONCURRENT_BULK_REQUESTS_FIELD();
        java.lang.String str60 = mongoDBRiverDefinition56.getSECONDARY_READ_PREFERENCE_FIELD();
        boolean boolean61 = mongoDBRiverDefinition56.getdisableIndexRefresh();
        docScoreSearchScript0.setNextVar("ssl", (java.lang.Object) mongoDBRiverDefinition56);
        docScoreSearchScript0.setNextScore((float) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float65 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        org.elasticsearch.common.logging.ESLogger eSLogger3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.logger;
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) eSLogger3);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder6.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet9 = builder6.excludeFields;
        com.mongodb.BasicDBObject basicDBObject10 = builder6.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = builder6.initialTimestamp;
        builder6.setstatisticsTypeName("ssl_verify_certificate");
        boolean boolean14 = builder6.getmongoUseSSL();
        java.lang.String str15 = builder6.indexName;
        java.util.Set<java.lang.String> strSet16 = builder6.getexcludeFields();
        docScoreSearchScript0.setNextVar("hi!", (java.lang.Object) builder6);
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double20 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("hi!", "null.initial_timestamp");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        docScoreSearchScript0.setNextScore(100.0f);
        docScoreSearchScript0.setNextScore((float) (-1L));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj7 = docScoreSearchScript0.run();
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        docScoreSearchScript0.setNextScore((float) 10L);
        docScoreSearchScript0.setNextScore(0.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder8.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet11 = builder8.excludeFields;
        com.mongodb.BasicDBObject basicDBObject12 = builder8.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = builder8.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray14 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList15 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList15, serverAddressArray14);
        builder8.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList15);
        builder7.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList15);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder19.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet22 = builder19.excludeFields;
        com.mongodb.BasicDBObject basicDBObject23 = builder19.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp24 = builder19.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray25 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList26 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList26, serverAddressArray25);
        builder19.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList26);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder7.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList26);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder7.indexName("");
        int int32 = builder31.getthrottleSize();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp33 = builder31.getinitialTimestamp();
        builder31.socketTimeout = (byte) 1;
        java.lang.String str36 = builder31.scriptType;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder31.scriptType("host");
        java.lang.Object obj39 = docScoreSearchScript0.unwrap((java.lang.Object) "host");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long40 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("localhost", "credentials");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        docScoreSearchScript0.setNextScore((float) 10L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder6.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet9 = builder6.excludeFields;
        builder6.setmongoCollection("initial_timestamp");
        boolean boolean12 = builder6.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder6.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder14);
        java.lang.String str16 = mongoDBRiverDefinition15.includeCollection;
        boolean boolean17 = mongoDBRiverDefinition15.mongoGridFS;
        boolean boolean18 = mongoDBRiverDefinition15.advancedTransformation;
        java.lang.String str19 = mongoDBRiverDefinition15.getADMIN_DB_FIELD();
        boolean boolean20 = mongoDBRiverDefinition15.getdisableIndexRefresh();
        boolean boolean21 = mongoDBRiverDefinition15.isMongoSecondaryReadPreference();
        java.lang.String str22 = mongoDBRiverDefinition15.mongoCollection;
        java.util.Set<java.lang.String> strSet23 = mongoDBRiverDefinition15.includeFields;
        int int24 = mongoDBRiverDefinition15.throttleSize;
        boolean boolean25 = mongoDBRiverDefinition15.disableIndexRefresh;
        docScoreSearchScript0.setNextVar("exclude_fields", (java.lang.Object) boolean25);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder28.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet31 = builder28.excludeFields;
        builder28.setmongoCollection("initial_timestamp");
        boolean boolean34 = builder28.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder28.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition37 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder36);
        java.lang.String str38 = mongoDBRiverDefinition37.includeCollection;
        java.lang.String str39 = mongoDBRiverDefinition37.getCOLLECTION_FIELD();
        java.util.Set<java.lang.String> strSet40 = mongoDBRiverDefinition37.excludeFields;
        java.lang.String str41 = mongoDBRiverDefinition37.getOPTIONS_FIELD();
        java.lang.String str42 = mongoDBRiverDefinition37.getIndexName();
        docScoreSearchScript0.setNextVar("bulk_size", (java.lang.Object) mongoDBRiverDefinition37);
        docScoreSearchScript0.setNextScore((float) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder47.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet50 = builder47.excludeFields;
        builder47.setmongoCollection("initial_timestamp");
        boolean boolean53 = builder47.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder47.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition56 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder55);
        java.lang.String str57 = mongoDBRiverDefinition56.includeCollection;
        java.lang.String str58 = mongoDBRiverDefinition56.getHOST_FIELD();
        java.lang.String str59 = mongoDBRiverDefinition56.getCONCURRENT_BULK_REQUESTS_FIELD();
        java.lang.String str60 = mongoDBRiverDefinition56.getSECONDARY_READ_PREFERENCE_FIELD();
        boolean boolean61 = mongoDBRiverDefinition56.getdisableIndexRefresh();
        docScoreSearchScript0.setNextVar("ssl", (java.lang.Object) mongoDBRiverDefinition56);
        docScoreSearchScript0.setNextScore((float) (byte) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder65 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder65.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet68 = builder65.excludeFields;
        com.mongodb.BasicDBObject basicDBObject69 = builder65.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp70 = builder65.initialTimestamp;
        builder65.mongoCollection = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder74 = builder65.typeName("exclude_fields");
        boolean boolean75 = builder65.getmongoUseSSL();
        int int76 = builder65.getconnectTimeout();
        builder65.mongoGridFS = false;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder79 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder79.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet82 = builder79.excludeFields;
        builder79.setmongoCollection("initial_timestamp");
        boolean boolean85 = builder79.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder87 = builder79.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition88 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder87);
        java.lang.String str89 = mongoDBRiverDefinition88.includeCollection;
        java.lang.String str90 = mongoDBRiverDefinition88.getCOLLECTION_FIELD();
        java.util.Set<java.lang.String> strSet91 = mongoDBRiverDefinition88.excludeFields;
        boolean boolean92 = mongoDBRiverDefinition88.getstoreStatistics();
        boolean boolean93 = mongoDBRiverDefinition88.getmongoGridFS();
        java.lang.String str94 = mongoDBRiverDefinition88.getSECONDARY_READ_PREFERENCE_FIELD();
        int int95 = mongoDBRiverDefinition88.socketTimeout;
        com.mongodb.BasicDBObject basicDBObject96 = mongoDBRiverDefinition88.mongoCollectionFilter;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder97 = builder65.mongoOplogFilter(basicDBObject96);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject96);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("host", "admin");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("initial_timestamp", "password");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("socket_timeout", "null.initial_timestamp");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("flush_interval", "include_fields");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        docScoreSearchScript0.setNextScore((float) 10L);
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        docScoreSearchScript0.setNextScore(10.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long9 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextVar("disable_index_refresh", (java.lang.Object) "index");
        docScoreSearchScript0.setNextScore((float) 10L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder8.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet11 = builder8.excludeFields;
        builder8.setmongoCollection("hi!");
        boolean boolean14 = builder8.importAllCollections;
        java.lang.String str15 = builder8.mongoAdminPassword;
        java.lang.Object obj16 = docScoreSearchScript0.unwrap((java.lang.Object) builder8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long17 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("socket_timeout", "initial_timestamp");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextVar("disable_index_refresh", (java.lang.Object) "index");
        docScoreSearchScript0.setNextScore((float) 10L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder8.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet11 = builder8.excludeFields;
        builder8.setmongoCollection("initial_timestamp");
        boolean boolean14 = builder8.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder8.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder16);
        java.lang.String str18 = mongoDBRiverDefinition17.includeCollection;
        boolean boolean19 = mongoDBRiverDefinition17.mongoGridFS;
        java.lang.String str20 = mongoDBRiverDefinition17.getINITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD();
        java.util.Set<java.lang.String> strSet21 = mongoDBRiverDefinition17.getExcludeFields();
        java.lang.String str22 = mongoDBRiverDefinition17.mongoLocalUser;
        java.lang.Object obj23 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition17);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder24.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet27 = builder24.excludeFields;
        builder24.setmongoCollection("initial_timestamp");
        boolean boolean30 = builder24.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder24.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition33 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder32);
        java.lang.String str34 = mongoDBRiverDefinition33.includeCollection;
        java.lang.String str35 = mongoDBRiverDefinition33.getTypeName();
        com.mongodb.BasicDBObject basicDBObject36 = mongoDBRiverDefinition33.getMongoCollectionFilter();
        java.lang.String str37 = mongoDBRiverDefinition33.mongoLocalPassword;
        java.lang.Object obj38 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition33);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (byte) -1);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder4.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet7 = builder4.excludeFields;
        builder4.setmongoCollection("initial_timestamp");
        boolean boolean10 = builder4.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder4.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder12);
        java.lang.String str14 = mongoDBRiverDefinition13.includeCollection;
        java.lang.String str15 = mongoDBRiverDefinition13.getCOLLECTION_FIELD();
        boolean boolean16 = mongoDBRiverDefinition13.isImportAllCollections();
        boolean boolean17 = mongoDBRiverDefinition13.mongoGridFS;
        docScoreSearchScript0.setNextVar("collection", (java.lang.Object) mongoDBRiverDefinition13);
        docScoreSearchScript0.setNextScore((float) (-1L));
        docScoreSearchScript0.setNextScore((float) (short) 1);
        docScoreSearchScript0.setNextScore((float) '4');
        docScoreSearchScript0.setNextScore((float) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (byte) 1);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextVar("disable_index_refresh", (java.lang.Object) "index");
        docScoreSearchScript0.setNextScore((float) 10L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder8.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet11 = builder8.excludeFields;
        builder8.setmongoCollection("initial_timestamp");
        boolean boolean14 = builder8.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder8.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder16);
        java.lang.String str18 = mongoDBRiverDefinition17.includeCollection;
        boolean boolean19 = mongoDBRiverDefinition17.mongoGridFS;
        java.lang.String str20 = mongoDBRiverDefinition17.getINITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD();
        java.util.Set<java.lang.String> strSet21 = mongoDBRiverDefinition17.getExcludeFields();
        java.lang.String str22 = mongoDBRiverDefinition17.mongoLocalUser;
        java.lang.Object obj23 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition17);
        docScoreSearchScript0.setNextScore((float) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float26 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_timeout", "include_fields");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("null.initial_timestamp", "connect_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        docScoreSearchScript0.setNextScore((float) 10L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder6.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet9 = builder6.excludeFields;
        builder6.setmongoCollection("initial_timestamp");
        boolean boolean12 = builder6.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder6.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder14);
        java.lang.String str16 = mongoDBRiverDefinition15.includeCollection;
        boolean boolean17 = mongoDBRiverDefinition15.mongoGridFS;
        boolean boolean18 = mongoDBRiverDefinition15.advancedTransformation;
        java.lang.String str19 = mongoDBRiverDefinition15.getADMIN_DB_FIELD();
        boolean boolean20 = mongoDBRiverDefinition15.getdisableIndexRefresh();
        boolean boolean21 = mongoDBRiverDefinition15.isMongoSecondaryReadPreference();
        java.lang.String str22 = mongoDBRiverDefinition15.mongoCollection;
        java.util.Set<java.lang.String> strSet23 = mongoDBRiverDefinition15.includeFields;
        int int24 = mongoDBRiverDefinition15.throttleSize;
        boolean boolean25 = mongoDBRiverDefinition15.disableIndexRefresh;
        docScoreSearchScript0.setNextVar("exclude_fields", (java.lang.Object) boolean25);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder28.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet31 = builder28.excludeFields;
        builder28.setmongoCollection("initial_timestamp");
        boolean boolean34 = builder28.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder28.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition37 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder36);
        java.lang.String str38 = mongoDBRiverDefinition37.includeCollection;
        java.lang.String str39 = mongoDBRiverDefinition37.getCOLLECTION_FIELD();
        java.util.Set<java.lang.String> strSet40 = mongoDBRiverDefinition37.excludeFields;
        java.lang.String str41 = mongoDBRiverDefinition37.getOPTIONS_FIELD();
        java.lang.String str42 = mongoDBRiverDefinition37.getIndexName();
        docScoreSearchScript0.setNextVar("bulk_size", (java.lang.Object) mongoDBRiverDefinition37);
        docScoreSearchScript0.setNextScore((float) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float46 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextVar("disable_index_refresh", (java.lang.Object) "index");
        docScoreSearchScript0.setNextScore((float) 10L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder8.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet11 = builder8.excludeFields;
        builder8.setmongoCollection("initial_timestamp");
        boolean boolean14 = builder8.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder8.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder16);
        java.lang.String str18 = mongoDBRiverDefinition17.includeCollection;
        boolean boolean19 = mongoDBRiverDefinition17.mongoGridFS;
        java.lang.String str20 = mongoDBRiverDefinition17.getINITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD();
        java.util.Set<java.lang.String> strSet21 = mongoDBRiverDefinition17.getExcludeFields();
        java.lang.String str22 = mongoDBRiverDefinition17.mongoLocalUser;
        java.lang.Object obj23 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition17);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder24.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet27 = builder24.excludeFields;
        builder24.setmongoCollection("initial_timestamp");
        boolean boolean30 = builder24.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder24.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition33 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder32);
        java.lang.String str34 = mongoDBRiverDefinition33.includeCollection;
        java.lang.String str35 = mongoDBRiverDefinition33.getTypeName();
        com.mongodb.BasicDBObject basicDBObject36 = mongoDBRiverDefinition33.getMongoCollectionFilter();
        java.lang.String str37 = mongoDBRiverDefinition33.mongoLocalPassword;
        java.lang.Object obj38 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition33);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj39 = docScoreSearchScript0.run();
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder4.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet7 = builder4.excludeFields;
        builder4.setmongoCollection("initial_timestamp");
        boolean boolean10 = builder4.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder4.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder12);
        java.lang.String str14 = mongoDBRiverDefinition13.includeCollection;
        java.lang.String str15 = mongoDBRiverDefinition13.getCOLLECTION_FIELD();
        boolean boolean16 = mongoDBRiverDefinition13.isImportAllCollections();
        boolean boolean17 = mongoDBRiverDefinition13.mongoGridFS;
        docScoreSearchScript0.setNextVar("collection", (java.lang.Object) mongoDBRiverDefinition13);
        docScoreSearchScript0.setNextScore((float) (-1L));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long21 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("db", "drop_collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextVar("disable_index_refresh", (java.lang.Object) "index");
        docScoreSearchScript0.setNextScore((float) 10L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder8.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet11 = builder8.excludeFields;
        builder8.setmongoCollection("initial_timestamp");
        boolean boolean14 = builder8.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder8.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder16);
        java.lang.String str18 = mongoDBRiverDefinition17.includeCollection;
        boolean boolean19 = mongoDBRiverDefinition17.mongoGridFS;
        java.lang.String str20 = mongoDBRiverDefinition17.getINITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD();
        java.util.Set<java.lang.String> strSet21 = mongoDBRiverDefinition17.getExcludeFields();
        java.lang.String str22 = mongoDBRiverDefinition17.mongoLocalUser;
        java.lang.Object obj23 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition17);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder25.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet28 = builder25.excludeFields;
        com.mongodb.BasicDBObject basicDBObject29 = builder25.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp30 = builder25.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray31 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList32 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList32, serverAddressArray31);
        builder25.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList32);
        builder24.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList32);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder36.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet39 = builder36.excludeFields;
        com.mongodb.BasicDBObject basicDBObject40 = builder36.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp41 = builder36.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray42 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList43 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList43, serverAddressArray42);
        builder36.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList43);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder24.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList43);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder24.indexName("");
        builder48.typeName = "";
        java.lang.Object obj51 = docScoreSearchScript0.unwrap((java.lang.Object) builder48);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj52 = docScoreSearchScript0.run();
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        docScoreSearchScript0.setNextScore((float) 10L);
        docScoreSearchScript0.setNextScore(0.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long7 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "drop_collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextVar("disable_index_refresh", (java.lang.Object) "index");
        docScoreSearchScript0.setNextScore((float) 10L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(35);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextScore((float) ' ');
        docScoreSearchScript0.setNextScore((float) (short) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder8.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet11 = builder8.excludeFields;
        com.mongodb.BasicDBObject basicDBObject12 = builder8.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = builder8.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray14 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList15 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList15, serverAddressArray14);
        builder8.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList15);
        java.lang.String str18 = builder8.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder8.dropCollection(true);
        boolean boolean21 = builder20.mongoSSLVerifyCertificate;
        java.lang.String[] strArray39 = new java.lang.String[] { "connect_timeout", "script_type", "collection", "secondary_read_preference", "throttle_size", "host", "actions", "drop_collection", "name", "initial_timestamp", "size", "script_type", "throttle_size", "hi!", "advanced_transformation", "name", "concurrent_requests" };
        java.util.LinkedHashSet<java.lang.String> strSet40 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet40, strArray39);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder20.includeFields((java.util.Set<java.lang.String>) strSet40);
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) strSet40);
        docScoreSearchScript0.setNextScore((float) (-1L));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double46 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder4.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet7 = builder4.excludeFields;
        builder4.setmongoCollection("initial_timestamp");
        boolean boolean10 = builder4.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder4.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder12);
        java.lang.String str14 = mongoDBRiverDefinition13.includeCollection;
        java.lang.String str15 = mongoDBRiverDefinition13.getCOLLECTION_FIELD();
        boolean boolean16 = mongoDBRiverDefinition13.isImportAllCollections();
        boolean boolean17 = mongoDBRiverDefinition13.mongoGridFS;
        docScoreSearchScript0.setNextVar("collection", (java.lang.Object) mongoDBRiverDefinition13);
        docScoreSearchScript0.setNextScore((float) (-1L));
        docScoreSearchScript0.setNextScore((float) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float23 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder4.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet7 = builder4.excludeFields;
        builder4.setmongoCollection("initial_timestamp");
        boolean boolean10 = builder4.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder4.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder12);
        java.lang.String str14 = mongoDBRiverDefinition13.includeCollection;
        java.lang.String str15 = mongoDBRiverDefinition13.getCOLLECTION_FIELD();
        boolean boolean16 = mongoDBRiverDefinition13.isImportAllCollections();
        boolean boolean17 = mongoDBRiverDefinition13.mongoGridFS;
        docScoreSearchScript0.setNextVar("collection", (java.lang.Object) mongoDBRiverDefinition13);
        docScoreSearchScript0.setNextScore((float) (-1L));
        docScoreSearchScript0.setNextScore((float) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long23 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        docScoreSearchScript0.setNextScore((float) 10L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder6.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet9 = builder6.excludeFields;
        builder6.setmongoCollection("initial_timestamp");
        boolean boolean12 = builder6.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder6.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder14);
        java.lang.String str16 = mongoDBRiverDefinition15.includeCollection;
        boolean boolean17 = mongoDBRiverDefinition15.mongoGridFS;
        boolean boolean18 = mongoDBRiverDefinition15.advancedTransformation;
        java.lang.String str19 = mongoDBRiverDefinition15.getADMIN_DB_FIELD();
        boolean boolean20 = mongoDBRiverDefinition15.getdisableIndexRefresh();
        boolean boolean21 = mongoDBRiverDefinition15.isMongoSecondaryReadPreference();
        java.lang.String str22 = mongoDBRiverDefinition15.mongoCollection;
        java.util.Set<java.lang.String> strSet23 = mongoDBRiverDefinition15.includeFields;
        int int24 = mongoDBRiverDefinition15.throttleSize;
        boolean boolean25 = mongoDBRiverDefinition15.disableIndexRefresh;
        docScoreSearchScript0.setNextVar("exclude_fields", (java.lang.Object) boolean25);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder28.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet31 = builder28.excludeFields;
        builder28.setmongoCollection("initial_timestamp");
        boolean boolean34 = builder28.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder28.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition37 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder36);
        java.lang.String str38 = mongoDBRiverDefinition37.includeCollection;
        java.lang.String str39 = mongoDBRiverDefinition37.getCOLLECTION_FIELD();
        java.util.Set<java.lang.String> strSet40 = mongoDBRiverDefinition37.excludeFields;
        java.lang.String str41 = mongoDBRiverDefinition37.getOPTIONS_FIELD();
        java.lang.String str42 = mongoDBRiverDefinition37.getIndexName();
        docScoreSearchScript0.setNextVar("bulk_size", (java.lang.Object) mongoDBRiverDefinition37);
        docScoreSearchScript0.setNextScore((float) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder47.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet50 = builder47.excludeFields;
        builder47.setmongoCollection("initial_timestamp");
        boolean boolean53 = builder47.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder47.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition56 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder55);
        java.lang.String str57 = mongoDBRiverDefinition56.includeCollection;
        java.lang.String str58 = mongoDBRiverDefinition56.getHOST_FIELD();
        java.lang.String str59 = mongoDBRiverDefinition56.getCONCURRENT_BULK_REQUESTS_FIELD();
        java.lang.String str60 = mongoDBRiverDefinition56.getSECONDARY_READ_PREFERENCE_FIELD();
        boolean boolean61 = mongoDBRiverDefinition56.getdisableIndexRefresh();
        docScoreSearchScript0.setNextVar("ssl", (java.lang.Object) mongoDBRiverDefinition56);
        docScoreSearchScript0.setNextScore((float) (byte) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder65 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder65.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet68 = builder65.excludeFields;
        builder65.setmongoCollection("initial_timestamp");
        boolean boolean71 = builder65.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder73 = builder65.skipInitialImport(false);
        java.lang.String str74 = builder73.typeName;
        builder73.setmongoAdminUser("script_type");
        boolean boolean77 = builder73.getmongoSecondaryReadPreference();
        java.lang.Object obj78 = docScoreSearchScript0.unwrap((java.lang.Object) builder73);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder79 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder81 = builder79.script("script");
        com.mongodb.BasicDBObject basicDBObject82 = builder81.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder84 = builder81.typeName("connect_timeout");
        boolean boolean85 = builder81.mongoGridFS;
        boolean boolean86 = builder81.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition87 = builder81.build();
        java.lang.String str88 = mongoDBRiverDefinition87.getADMIN_DB_FIELD();
        java.lang.String str89 = mongoDBRiverDefinition87.mongoLocalPassword;
        java.lang.String str90 = mongoDBRiverDefinition87.getBULK_FIELD();
        boolean boolean91 = mongoDBRiverDefinition87.isAdvancedTransformation();
        java.lang.String str92 = mongoDBRiverDefinition87.getRiverIndexName();
        boolean boolean93 = mongoDBRiverDefinition87.isDisableIndexRefresh();
        java.lang.Object obj94 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition87);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(100);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("index", "size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextScore((float) ' ');
        docScoreSearchScript0.setNextScore((float) (short) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder8.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet11 = builder8.excludeFields;
        com.mongodb.BasicDBObject basicDBObject12 = builder8.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = builder8.initialTimestamp;
        builder8.mongoCollection = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder8.typeName("exclude_fields");
        docScoreSearchScript0.setNextVar("connect_timeout", (java.lang.Object) "exclude_fields");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(8);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("filter", "drop_collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextVar("disable_index_refresh", (java.lang.Object) "index");
        java.lang.Object obj7 = new java.lang.Object();
        docScoreSearchScript0.setNextVar("concurrent_bulk_requests", obj7);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder9.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet12 = builder9.excludeFields;
        com.mongodb.BasicDBObject basicDBObject13 = builder9.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = builder9.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray15 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList16 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList16, serverAddressArray15);
        builder9.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList16);
        java.lang.String str19 = builder9.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder9.dropCollection(true);
        boolean boolean22 = builder21.mongoSSLVerifyCertificate;
        java.lang.String str23 = builder21.typeName;
        builder21.typeName = "include_fields";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder26.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet29 = builder26.excludeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder26.mongoSSLVerifyCertificate(true);
        java.util.Set<java.lang.String> strSet32 = builder31.excludeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder33.setmongoSecondaryReadPreference(false);
        boolean boolean36 = builder33.getmongoSSLVerifyCertificate();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder37.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet40 = builder37.excludeFields;
        com.mongodb.BasicDBObject basicDBObject41 = builder37.getmongoCollectionFilter();
        java.lang.String str42 = builder37.mongoLocalUser;
        com.mongodb.ServerAddress[] serverAddressArray43 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList44 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList44, serverAddressArray43);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder37.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList44);
        com.mongodb.MongoClientOptions mongoClientOptions47 = builder37.getmongoClientOptions();
        builder37.riverName = "script_type";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder50.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet53 = builder50.excludeFields;
        com.mongodb.BasicDBObject basicDBObject54 = builder50.getmongoCollectionFilter();
        builder37.setmongoOplogFilter(basicDBObject54);
        com.mongodb.BasicDBObject basicDBObject56 = builder37.mongoOplogFilter;
        builder33.setmongoOplogFilter(basicDBObject56);
        builder31.setmongoCollectionFilter(basicDBObject56);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder59 = builder21.mongoCollectionFilter(basicDBObject56);
        java.lang.Object obj60 = docScoreSearchScript0.unwrap((java.lang.Object) basicDBObject56);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double61 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("connect_timeout", "concurrent_requests");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("ssl", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        docScoreSearchScript0.setNextScore((float) 10L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder6.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet9 = builder6.excludeFields;
        builder6.setmongoCollection("initial_timestamp");
        boolean boolean12 = builder6.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder6.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder14);
        java.lang.String str16 = mongoDBRiverDefinition15.includeCollection;
        boolean boolean17 = mongoDBRiverDefinition15.mongoGridFS;
        boolean boolean18 = mongoDBRiverDefinition15.advancedTransformation;
        java.lang.String str19 = mongoDBRiverDefinition15.getADMIN_DB_FIELD();
        boolean boolean20 = mongoDBRiverDefinition15.getdisableIndexRefresh();
        boolean boolean21 = mongoDBRiverDefinition15.isMongoSecondaryReadPreference();
        java.lang.String str22 = mongoDBRiverDefinition15.mongoCollection;
        java.util.Set<java.lang.String> strSet23 = mongoDBRiverDefinition15.includeFields;
        int int24 = mongoDBRiverDefinition15.throttleSize;
        boolean boolean25 = mongoDBRiverDefinition15.disableIndexRefresh;
        docScoreSearchScript0.setNextVar("exclude_fields", (java.lang.Object) boolean25);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder27.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet30 = builder27.excludeFields;
        com.mongodb.BasicDBObject basicDBObject31 = builder27.getmongoCollectionFilter();
        java.lang.String str32 = builder27.mongoLocalUser;
        com.mongodb.ServerAddress[] serverAddressArray33 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList34 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList34, serverAddressArray33);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder27.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList34);
        com.mongodb.MongoClientOptions mongoClientOptions37 = builder27.getmongoClientOptions();
        builder27.riverName = "script_type";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder40.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet43 = builder40.excludeFields;
        com.mongodb.BasicDBObject basicDBObject44 = builder40.getmongoCollectionFilter();
        builder27.setmongoOplogFilter(basicDBObject44);
        boolean boolean46 = builder27.mongoGridFS;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder27.mongoAdminPassword("user");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder27.importAllCollections(false);
        builder27.setmongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder27.mongoLocalUser("user");
        boolean boolean55 = builder54.getstoreStatistics();
        builder54.mongoLocalUser = "localhost";
        java.lang.Object obj58 = docScoreSearchScript0.unwrap((java.lang.Object) builder54);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (byte) 1);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextVar("disable_index_refresh", (java.lang.Object) "index");
        docScoreSearchScript0.setNextScore((float) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long8 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(100);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        docScoreSearchScript0.setNextScore((float) 10L);
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        docScoreSearchScript0.setNextScore(10.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float9 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        org.elasticsearch.common.logging.ESLogger eSLogger3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.logger;
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) eSLogger3);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder6.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet9 = builder6.excludeFields;
        com.mongodb.BasicDBObject basicDBObject10 = builder6.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = builder6.initialTimestamp;
        builder6.setstatisticsTypeName("ssl_verify_certificate");
        boolean boolean14 = builder6.getmongoUseSSL();
        java.lang.String str15 = builder6.indexName;
        java.util.Set<java.lang.String> strSet16 = builder6.getexcludeFields();
        docScoreSearchScript0.setNextVar("hi!", (java.lang.Object) builder6);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript18 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj20 = docScoreSearchScript18.unwrap((java.lang.Object) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder22.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet25 = builder22.excludeFields;
        builder22.setmongoCollection("initial_timestamp");
        boolean boolean28 = builder22.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder22.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition31 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder30);
        java.lang.String str32 = mongoDBRiverDefinition31.includeCollection;
        java.lang.String str33 = mongoDBRiverDefinition31.getCOLLECTION_FIELD();
        boolean boolean34 = mongoDBRiverDefinition31.isImportAllCollections();
        boolean boolean35 = mongoDBRiverDefinition31.mongoGridFS;
        docScoreSearchScript18.setNextVar("collection", (java.lang.Object) mongoDBRiverDefinition31);
        docScoreSearchScript18.setNextScore((float) (-1L));
        java.lang.Object obj39 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double40 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("null.initial_timestamp", "size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        org.elasticsearch.common.logging.ESLogger eSLogger3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.logger;
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) eSLogger3);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder6.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet9 = builder6.excludeFields;
        com.mongodb.BasicDBObject basicDBObject10 = builder6.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = builder6.initialTimestamp;
        builder6.setstatisticsTypeName("ssl_verify_certificate");
        boolean boolean14 = builder6.getmongoUseSSL();
        java.lang.String str15 = builder6.indexName;
        java.util.Set<java.lang.String> strSet16 = builder6.getexcludeFields();
        docScoreSearchScript0.setNextVar("hi!", (java.lang.Object) builder6);
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        docScoreSearchScript0.setNextScore((float) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj22 = docScoreSearchScript0.run();
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextScore((float) ' ');
        docScoreSearchScript0.setNextScore((float) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(35);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("connect_timeout", "size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder3.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet6 = builder3.excludeFields;
        builder3.setmongoCollection("initial_timestamp");
        boolean boolean9 = builder3.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder3.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder11);
        java.lang.String str13 = mongoDBRiverDefinition12.includeCollection;
        java.lang.String str14 = mongoDBRiverDefinition12.getIndexName();
        java.lang.String str15 = mongoDBRiverDefinition12.getSECONDARY_READ_PREFERENCE_FIELD();
        boolean boolean16 = mongoDBRiverDefinition12.isImportAllCollections();
        java.lang.String str17 = mongoDBRiverDefinition12.getPARENT_TYPES_FIELD();
        int int18 = mongoDBRiverDefinition12.getConnectTimeout();
        boolean boolean19 = mongoDBRiverDefinition12.importAllCollections;
        com.mongodb.MongoClientOptions mongoClientOptions20 = mongoDBRiverDefinition12.getMongoClientOptions();
        java.lang.String str21 = mongoDBRiverDefinition12.mongoCollection;
        boolean boolean22 = mongoDBRiverDefinition12.getmongoUseSSL();
        java.lang.Object obj23 = docScoreSearchScript0.unwrap((java.lang.Object) boolean22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(97);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        docScoreSearchScript0.setNextVar("connect_timeout", (java.lang.Object) "type");
        java.lang.Object obj7 = docScoreSearchScript0.unwrap((java.lang.Object) "ssl");
        docScoreSearchScript0.setNextScore((float) 35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float10 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        org.elasticsearch.common.logging.ESLogger eSLogger3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.logger;
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) eSLogger3);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder6.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet9 = builder6.excludeFields;
        com.mongodb.BasicDBObject basicDBObject10 = builder6.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = builder6.initialTimestamp;
        builder6.setstatisticsTypeName("ssl_verify_certificate");
        boolean boolean14 = builder6.getmongoUseSSL();
        java.lang.String str15 = builder6.indexName;
        java.util.Set<java.lang.String> strSet16 = builder6.getexcludeFields();
        docScoreSearchScript0.setNextVar("hi!", (java.lang.Object) builder6);
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder20.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet23 = builder20.excludeFields;
        builder20.setmongoCollection("initial_timestamp");
        boolean boolean26 = builder20.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder20.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition29 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder28);
        java.lang.String str30 = mongoDBRiverDefinition29.includeCollection;
        java.lang.String str31 = mongoDBRiverDefinition29.getHOST_FIELD();
        java.lang.String str32 = mongoDBRiverDefinition29.getCONCURRENT_BULK_REQUESTS_FIELD();
        java.lang.String str33 = mongoDBRiverDefinition29.getStatisticsTypeName();
        java.util.Set<java.lang.String> strSet34 = mongoDBRiverDefinition29.getExcludeFields();
        java.lang.String str35 = mongoDBRiverDefinition29.getUSER_FIELD();
        java.lang.Object obj36 = docScoreSearchScript0.unwrap((java.lang.Object) str35);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder37.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet40 = builder37.excludeFields;
        builder37.setmongoCollection("initial_timestamp");
        boolean boolean43 = builder37.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder37.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition46 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder45);
        java.lang.String str47 = mongoDBRiverDefinition46.includeCollection;
        java.lang.String str48 = mongoDBRiverDefinition46.getIndexName();
        java.lang.String str49 = mongoDBRiverDefinition46.getSECONDARY_READ_PREFERENCE_FIELD();
        java.lang.String str50 = mongoDBRiverDefinition46.getStatisticsTypeName();
        java.lang.String str51 = mongoDBRiverDefinition46.getHOST_FIELD();
        int int52 = mongoDBRiverDefinition46.connectTimeout;
        java.lang.String str53 = mongoDBRiverDefinition46.getSECONDARY_READ_PREFERENCE_FIELD();
        java.lang.Object obj54 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition46);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder55.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet58 = builder55.excludeFields;
        builder55.setmongoCollection("initial_timestamp");
        boolean boolean61 = builder55.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = builder55.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition64 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder63);
        java.lang.String str65 = mongoDBRiverDefinition64.includeCollection;
        boolean boolean66 = mongoDBRiverDefinition64.mongoGridFS;
        boolean boolean67 = mongoDBRiverDefinition64.advancedTransformation;
        org.elasticsearch.common.unit.TimeValue timeValue68 = mongoDBRiverDefinition64.getDEFAULT_FLUSH_INTERVAL();
        boolean boolean69 = mongoDBRiverDefinition64.getmongoGridFS();
        boolean boolean70 = mongoDBRiverDefinition64.getmongoUseSSL();
        java.util.List<com.mongodb.ServerAddress> serverAddressList71 = mongoDBRiverDefinition64.mongoServers;
        com.mongodb.BasicDBObject basicDBObject72 = mongoDBRiverDefinition64.mongoCollectionFilter;
        boolean boolean73 = mongoDBRiverDefinition64.isMongoSecondaryReadPreference();
        com.mongodb.BasicDBObject basicDBObject74 = mongoDBRiverDefinition64.getMongoCollectionFilter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject74);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("gridfs", "null.null");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        org.elasticsearch.common.logging.ESLogger eSLogger3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.logger;
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) eSLogger3);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder6.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet9 = builder6.excludeFields;
        com.mongodb.BasicDBObject basicDBObject10 = builder6.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = builder6.initialTimestamp;
        builder6.setstatisticsTypeName("ssl_verify_certificate");
        boolean boolean14 = builder6.getmongoUseSSL();
        java.lang.String str15 = builder6.indexName;
        java.util.Set<java.lang.String> strSet16 = builder6.getexcludeFields();
        docScoreSearchScript0.setNextVar("hi!", (java.lang.Object) builder6);
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        docScoreSearchScript0.setNextScore((float) (byte) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder23.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet26 = builder23.excludeFields;
        builder23.setmongoCollection("initial_timestamp");
        boolean boolean29 = builder23.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder23.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition32 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder31);
        java.lang.String str33 = mongoDBRiverDefinition32.includeCollection;
        java.lang.String str34 = mongoDBRiverDefinition32.getCOLLECTION_FIELD();
        java.util.Set<java.lang.String> strSet35 = mongoDBRiverDefinition32.excludeFields;
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp36 = mongoDBRiverDefinition32.getInitialTimestamp();
        java.util.Set<java.lang.String> strSet37 = mongoDBRiverDefinition32.excludeFields;
        boolean boolean38 = mongoDBRiverDefinition32.isMongoUseSSL();
        java.lang.String str39 = mongoDBRiverDefinition32.getCONNECTION_TIMEOUT();
        java.lang.String str40 = mongoDBRiverDefinition32.mongoLocalPassword;
        java.lang.String str41 = mongoDBRiverDefinition32.getDROP_COLLECTION_FIELD();
        java.lang.String str42 = mongoDBRiverDefinition32.getINITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) str42);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long44 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        org.elasticsearch.common.logging.ESLogger eSLogger3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.logger;
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) eSLogger3);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder6.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet9 = builder6.excludeFields;
        builder6.setmongoCollection("initial_timestamp");
        boolean boolean12 = builder6.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder6.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder14);
        java.lang.String str16 = mongoDBRiverDefinition15.includeCollection;
        java.lang.String str17 = mongoDBRiverDefinition15.getIndexName();
        java.lang.String str18 = mongoDBRiverDefinition15.getSECONDARY_READ_PREFERENCE_FIELD();
        java.lang.String str19 = mongoDBRiverDefinition15.script;
        java.lang.String str20 = mongoDBRiverDefinition15.getGRIDFS_FIELD();
        java.lang.String str21 = mongoDBRiverDefinition15.getCONCURRENT_REQUESTS_FIELD();
        com.mongodb.BasicDBObject basicDBObject22 = mongoDBRiverDefinition15.getMongoOplogFilter();
        java.lang.String str23 = mongoDBRiverDefinition15.getINCLUDE_FIELDS_FIELD();
        java.lang.String str24 = mongoDBRiverDefinition15.getMongoLocalPassword();
        int int25 = mongoDBRiverDefinition15.socketTimeout;
        docScoreSearchScript0.setNextVar("servers", (java.lang.Object) mongoDBRiverDefinition15);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder28.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet31 = builder28.excludeFields;
        builder28.setmongoCollection("initial_timestamp");
        boolean boolean34 = builder28.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder28.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition37 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder36);
        java.lang.String str38 = mongoDBRiverDefinition37.includeCollection;
        java.lang.String str39 = mongoDBRiverDefinition37.getHOST_FIELD();
        java.lang.String str40 = mongoDBRiverDefinition37.getMongoLocalPassword();
        java.lang.String str41 = mongoDBRiverDefinition37.script;
        java.lang.String str42 = mongoDBRiverDefinition37.mongoAdminUser;
        int int43 = mongoDBRiverDefinition37.getDEFAULT_BULK_ACTIONS();
        boolean boolean44 = mongoDBRiverDefinition37.getmongoSSLVerifyCertificate();
        java.lang.String str45 = mongoDBRiverDefinition37.mongoCollection;
        docScoreSearchScript0.setNextVar("local", (java.lang.Object) str45);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder47.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet50 = builder47.excludeFields;
        builder47.setmongoCollection("initial_timestamp");
        boolean boolean53 = builder47.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder47.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = builder56.script("script");
        com.mongodb.BasicDBObject basicDBObject59 = builder58.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder47.mongoCollectionFilter(basicDBObject59);
        java.lang.String str61 = builder60.includeCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = builder60.statisticsIndexName("socket_timeout");
        com.mongodb.BasicDBObject basicDBObject64 = builder63.getmongoCollectionFilter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject64);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        docScoreSearchScript0.setNextScore((float) 10L);
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder8.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet11 = builder8.excludeFields;
        builder8.setmongoCollection("initial_timestamp");
        boolean boolean14 = builder8.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder8.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.script("script");
        com.mongodb.BasicDBObject basicDBObject20 = builder19.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder8.mongoCollectionFilter(basicDBObject20);
        docScoreSearchScript0.setNextVar("null.initial_timestamp", (java.lang.Object) builder21);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder23.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet26 = builder23.excludeFields;
        com.mongodb.BasicDBObject basicDBObject27 = builder23.getmongoCollectionFilter();
        java.lang.String str28 = builder23.mongoLocalUser;
        com.mongodb.ServerAddress[] serverAddressArray29 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList30 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList30, serverAddressArray29);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder23.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList30);
        com.mongodb.MongoClientOptions mongoClientOptions33 = builder23.getmongoClientOptions();
        builder23.riverName = "script_type";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder36.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet39 = builder36.excludeFields;
        com.mongodb.BasicDBObject basicDBObject40 = builder36.getmongoCollectionFilter();
        builder23.setmongoOplogFilter(basicDBObject40);
        boolean boolean42 = builder23.mongoGridFS;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder23.mongoAdminPassword("user");
        java.util.Set<java.lang.String> strSet45 = builder23.excludeFields;
        com.mongodb.MongoClientOptions mongoClientOptions46 = builder23.mongoClientOptions;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder23.riverName("ssl");
        com.mongodb.BasicDBObject basicDBObject49 = builder23.getmongoOplogFilter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject49);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextVar("disable_index_refresh", (java.lang.Object) "index");
        docScoreSearchScript0.setNextScore((float) 10L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder8.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet11 = builder8.excludeFields;
        builder8.setmongoCollection("initial_timestamp");
        boolean boolean14 = builder8.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder8.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder16);
        java.lang.String str18 = mongoDBRiverDefinition17.includeCollection;
        boolean boolean19 = mongoDBRiverDefinition17.mongoGridFS;
        java.lang.String str20 = mongoDBRiverDefinition17.getINITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD();
        java.util.Set<java.lang.String> strSet21 = mongoDBRiverDefinition17.getExcludeFields();
        java.lang.String str22 = mongoDBRiverDefinition17.mongoLocalUser;
        java.lang.Object obj23 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition17);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder24.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet27 = builder24.excludeFields;
        builder24.setmongoCollection("initial_timestamp");
        boolean boolean30 = builder24.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder24.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition33 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder32);
        java.lang.String str34 = mongoDBRiverDefinition33.includeCollection;
        java.lang.String str35 = mongoDBRiverDefinition33.getTypeName();
        com.mongodb.BasicDBObject basicDBObject36 = mongoDBRiverDefinition33.getMongoCollectionFilter();
        java.lang.String str37 = mongoDBRiverDefinition33.mongoLocalPassword;
        java.lang.Object obj38 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition33);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder40.script("script");
        com.mongodb.BasicDBObject basicDBObject43 = builder42.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder42.typeName("connect_timeout");
        boolean boolean46 = builder42.mongoGridFS;
        boolean boolean47 = builder42.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition48 = builder42.build();
        java.lang.String str49 = mongoDBRiverDefinition48.getADMIN_DB_FIELD();
        java.lang.String str50 = mongoDBRiverDefinition48.getIncludeCollection();
        boolean boolean51 = mongoDBRiverDefinition48.getdropCollection();
        java.lang.String str52 = mongoDBRiverDefinition48.getINCLUDE_FIELDS_FIELD();
        docScoreSearchScript0.setNextVar("skip_initial_import", (java.lang.Object) str52);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder54.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet57 = builder54.excludeFields;
        java.lang.String str58 = builder54.getmongoLocalPassword();
        builder54.disableIndexRefresh = true;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = builder54.mongoAdminUser("");
        builder62.mongoCollection = "hi!";
        java.lang.String str65 = builder62.getmongoLocalPassword();
        builder62.setriverIndexName("ssl");
        builder62.setconnectTimeout((int) (short) 1);
        com.mongodb.MongoClientOptions mongoClientOptions70 = builder62.getmongoClientOptions();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder72 = builder62.script("null.initial_timestamp");
        java.lang.Object obj73 = docScoreSearchScript0.unwrap((java.lang.Object) "null.initial_timestamp");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float74 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 0L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (byte) -1);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("name", "connect_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder4.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet7 = builder4.excludeFields;
        builder4.setmongoCollection("initial_timestamp");
        boolean boolean10 = builder4.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder4.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder12);
        java.lang.String str14 = mongoDBRiverDefinition13.includeCollection;
        java.lang.String str15 = mongoDBRiverDefinition13.getCOLLECTION_FIELD();
        boolean boolean16 = mongoDBRiverDefinition13.isImportAllCollections();
        boolean boolean17 = mongoDBRiverDefinition13.mongoGridFS;
        docScoreSearchScript0.setNextVar("collection", (java.lang.Object) mongoDBRiverDefinition13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder20.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet23 = builder20.excludeFields;
        com.mongodb.BasicDBObject basicDBObject24 = builder20.getmongoCollectionFilter();
        java.lang.String str25 = builder20.mongoLocalUser;
        com.mongodb.ServerAddress[] serverAddressArray26 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList27 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList27, serverAddressArray26);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder20.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList27);
        com.mongodb.MongoClientOptions mongoClientOptions30 = builder20.getmongoClientOptions();
        builder20.riverName = "script_type";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder33.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet36 = builder33.excludeFields;
        com.mongodb.BasicDBObject basicDBObject37 = builder33.getmongoCollectionFilter();
        builder20.setmongoOplogFilter(basicDBObject37);
        boolean boolean39 = builder20.mongoGridFS;
        boolean boolean40 = builder20.getadvancedTransformation();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder41.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet44 = builder41.excludeFields;
        com.mongodb.BasicDBObject basicDBObject45 = builder41.getmongoCollectionFilter();
        java.lang.String str46 = builder41.mongoLocalUser;
        com.mongodb.ServerAddress[] serverAddressArray47 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList48 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList48, serverAddressArray47);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder41.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList48);
        boolean boolean51 = builder50.dropCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder52.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet55 = builder52.excludeFields;
        com.mongodb.BasicDBObject basicDBObject56 = builder52.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp57 = builder52.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray58 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList59 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList59, serverAddressArray58);
        builder52.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList59);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = builder50.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList59);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder63.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet66 = builder63.excludeFields;
        com.mongodb.BasicDBObject basicDBObject67 = builder63.getmongoCollectionFilter();
        java.lang.String str68 = builder63.mongoLocalUser;
        com.mongodb.ServerAddress[] serverAddressArray69 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList70 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList70, serverAddressArray69);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder72 = builder63.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList70);
        java.lang.String str73 = builder63.mongoAdminPassword;
        java.lang.String[] strArray78 = new java.lang.String[] { "admin", "script_type", "credentials", "password" };
        java.util.LinkedHashSet<java.lang.String> strSet79 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet79, strArray78);
        builder63.setincludeFields((java.util.Set<java.lang.String>) strSet79);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder82 = builder50.excludeFields((java.util.Set<java.lang.String>) strSet79);
        builder20.includeFields = strSet79;
        java.lang.String str84 = builder20.mongoAdminUser;
        docScoreSearchScript0.setNextVar("script_type", (java.lang.Object) builder20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float86 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextScore((float) ' ');
        docScoreSearchScript0.setNextScore((float) (short) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder8.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet11 = builder8.excludeFields;
        com.mongodb.BasicDBObject basicDBObject12 = builder8.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = builder8.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray14 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList15 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList15, serverAddressArray14);
        builder8.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList15);
        java.lang.String str18 = builder8.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder8.dropCollection(true);
        boolean boolean21 = builder20.mongoSSLVerifyCertificate;
        java.lang.String[] strArray39 = new java.lang.String[] { "connect_timeout", "script_type", "collection", "secondary_read_preference", "throttle_size", "host", "actions", "drop_collection", "name", "initial_timestamp", "size", "script_type", "throttle_size", "hi!", "advanced_transformation", "name", "concurrent_requests" };
        java.util.LinkedHashSet<java.lang.String> strSet40 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet40, strArray39);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder20.includeFields((java.util.Set<java.lang.String>) strSet40);
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) strSet40);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder45.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet48 = builder45.excludeFields;
        builder45.setmongoCollection("hi!");
        boolean boolean51 = builder45.importAllCollections;
        java.lang.String str52 = builder45.mongoAdminPassword;
        builder45.typeName = "concurrent_bulk_requests";
        builder45.setskipInitialImport(false);
        boolean boolean57 = builder45.getadvancedTransformation();
        docScoreSearchScript0.setNextVar("null.initial_timestamp", (java.lang.Object) builder45);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder60.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet63 = builder60.excludeFields;
        java.lang.String str64 = builder60.getmongoLocalPassword();
        java.lang.String str65 = builder60.getmongoAdminUser();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder67 = builder60.mongoLocalPassword("options");
        docScoreSearchScript0.setNextVar("", (java.lang.Object) builder67);
        docScoreSearchScript0.setNextScore((float) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long71 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("concurrent_bulk_requests", "parent_types");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("size", "filter");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 'a');
        docScoreSearchScript0.setNextScore((float) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder6.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet9 = builder6.excludeFields;
        builder6.setmongoCollection("initial_timestamp");
        boolean boolean12 = builder6.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder6.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder14);
        java.lang.String str16 = mongoDBRiverDefinition15.includeCollection;
        boolean boolean17 = mongoDBRiverDefinition15.mongoGridFS;
        boolean boolean18 = mongoDBRiverDefinition15.advancedTransformation;
        org.elasticsearch.common.unit.TimeValue timeValue19 = mongoDBRiverDefinition15.getDEFAULT_FLUSH_INTERVAL();
        java.lang.String str20 = mongoDBRiverDefinition15.getSIZE_FIELD();
        java.lang.String str21 = mongoDBRiverDefinition15.getACTIONS_FIELD();
        java.lang.String str22 = mongoDBRiverDefinition15.mongoDb;
        docScoreSearchScript0.setNextVar("initial_timestamp", (java.lang.Object) mongoDBRiverDefinition15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(0);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("initial_timestamp", "user");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        docScoreSearchScript0.setNextScore((float) 10L);
        docScoreSearchScript0.setNextScore(0.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder8.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet11 = builder8.excludeFields;
        com.mongodb.BasicDBObject basicDBObject12 = builder8.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = builder8.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray14 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList15 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList15, serverAddressArray14);
        builder8.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList15);
        builder7.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList15);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder19.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet22 = builder19.excludeFields;
        com.mongodb.BasicDBObject basicDBObject23 = builder19.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp24 = builder19.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray25 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList26 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList26, serverAddressArray25);
        builder19.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList26);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder7.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList26);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder7.indexName("");
        int int32 = builder31.getthrottleSize();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp33 = builder31.getinitialTimestamp();
        builder31.socketTimeout = (byte) 1;
        java.lang.String str36 = builder31.scriptType;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder31.scriptType("host");
        java.lang.Object obj39 = docScoreSearchScript0.unwrap((java.lang.Object) "host");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float40 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder4.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet7 = builder4.excludeFields;
        builder4.setmongoCollection("initial_timestamp");
        boolean boolean10 = builder4.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder4.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder12);
        java.lang.String str14 = mongoDBRiverDefinition13.includeCollection;
        java.lang.String str15 = mongoDBRiverDefinition13.getCOLLECTION_FIELD();
        boolean boolean16 = mongoDBRiverDefinition13.isImportAllCollections();
        boolean boolean17 = mongoDBRiverDefinition13.mongoGridFS;
        docScoreSearchScript0.setNextVar("collection", (java.lang.Object) mongoDBRiverDefinition13);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder20.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet23 = builder20.excludeFields;
        com.mongodb.BasicDBObject basicDBObject24 = builder20.getmongoCollectionFilter();
        java.lang.String str25 = builder20.mongoLocalUser;
        com.mongodb.ServerAddress[] serverAddressArray26 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList27 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList27, serverAddressArray26);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder20.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList27);
        com.mongodb.MongoClientOptions mongoClientOptions30 = builder20.getmongoClientOptions();
        builder20.riverName = "script_type";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder33.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet36 = builder33.excludeFields;
        com.mongodb.BasicDBObject basicDBObject37 = builder33.getmongoCollectionFilter();
        builder20.setmongoOplogFilter(basicDBObject37);
        boolean boolean39 = builder20.mongoGridFS;
        boolean boolean40 = builder20.getadvancedTransformation();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder41.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet44 = builder41.excludeFields;
        com.mongodb.BasicDBObject basicDBObject45 = builder41.getmongoCollectionFilter();
        java.lang.String str46 = builder41.mongoLocalUser;
        com.mongodb.ServerAddress[] serverAddressArray47 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList48 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList48, serverAddressArray47);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder41.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList48);
        boolean boolean51 = builder50.dropCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder52.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet55 = builder52.excludeFields;
        com.mongodb.BasicDBObject basicDBObject56 = builder52.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp57 = builder52.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray58 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList59 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList59, serverAddressArray58);
        builder52.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList59);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = builder50.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList59);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder63.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet66 = builder63.excludeFields;
        com.mongodb.BasicDBObject basicDBObject67 = builder63.getmongoCollectionFilter();
        java.lang.String str68 = builder63.mongoLocalUser;
        com.mongodb.ServerAddress[] serverAddressArray69 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList70 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList70, serverAddressArray69);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder72 = builder63.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList70);
        java.lang.String str73 = builder63.mongoAdminPassword;
        java.lang.String[] strArray78 = new java.lang.String[] { "admin", "script_type", "credentials", "password" };
        java.util.LinkedHashSet<java.lang.String> strSet79 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet79, strArray78);
        builder63.setincludeFields((java.util.Set<java.lang.String>) strSet79);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder82 = builder50.excludeFields((java.util.Set<java.lang.String>) strSet79);
        builder20.includeFields = strSet79;
        java.lang.String str84 = builder20.mongoAdminUser;
        docScoreSearchScript0.setNextVar("script_type", (java.lang.Object) builder20);
        docScoreSearchScript0.setNextScore((float) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float88 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextVar("disable_index_refresh", (java.lang.Object) "index");
        docScoreSearchScript0.setNextScore((float) 10L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder8.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet11 = builder8.excludeFields;
        builder8.setmongoCollection("initial_timestamp");
        boolean boolean14 = builder8.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder8.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder16);
        java.lang.String str18 = mongoDBRiverDefinition17.includeCollection;
        boolean boolean19 = mongoDBRiverDefinition17.mongoGridFS;
        java.lang.String str20 = mongoDBRiverDefinition17.getINITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD();
        java.util.Set<java.lang.String> strSet21 = mongoDBRiverDefinition17.getExcludeFields();
        java.lang.String str22 = mongoDBRiverDefinition17.mongoLocalUser;
        java.lang.Object obj23 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition17);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder24.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet27 = builder24.excludeFields;
        builder24.setmongoCollection("initial_timestamp");
        boolean boolean30 = builder24.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder24.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition33 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder32);
        java.lang.String str34 = mongoDBRiverDefinition33.includeCollection;
        java.lang.String str35 = mongoDBRiverDefinition33.getTypeName();
        com.mongodb.BasicDBObject basicDBObject36 = mongoDBRiverDefinition33.getMongoCollectionFilter();
        java.lang.String str37 = mongoDBRiverDefinition33.mongoLocalPassword;
        java.lang.Object obj38 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition33);
        docScoreSearchScript0.setNextScore((float) 35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double41 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        docScoreSearchScript0.setNextScore((float) 10L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder6.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet9 = builder6.excludeFields;
        builder6.setmongoCollection("initial_timestamp");
        boolean boolean12 = builder6.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder6.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder14);
        java.lang.String str16 = mongoDBRiverDefinition15.includeCollection;
        boolean boolean17 = mongoDBRiverDefinition15.mongoGridFS;
        boolean boolean18 = mongoDBRiverDefinition15.advancedTransformation;
        java.lang.String str19 = mongoDBRiverDefinition15.getADMIN_DB_FIELD();
        boolean boolean20 = mongoDBRiverDefinition15.getdisableIndexRefresh();
        boolean boolean21 = mongoDBRiverDefinition15.isMongoSecondaryReadPreference();
        java.lang.String str22 = mongoDBRiverDefinition15.mongoCollection;
        java.util.Set<java.lang.String> strSet23 = mongoDBRiverDefinition15.includeFields;
        int int24 = mongoDBRiverDefinition15.throttleSize;
        boolean boolean25 = mongoDBRiverDefinition15.disableIndexRefresh;
        docScoreSearchScript0.setNextVar("exclude_fields", (java.lang.Object) boolean25);
        docScoreSearchScript0.setNextScore((float) 10L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double29 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 'a');
        docScoreSearchScript0.setNextScore((float) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double5 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("disable_index_refresh", "null.null");
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("password", "host");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk", "null.initial_timestamp");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        org.elasticsearch.common.logging.ESLogger eSLogger3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.logger;
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) eSLogger3);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder6.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet9 = builder6.excludeFields;
        com.mongodb.BasicDBObject basicDBObject10 = builder6.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = builder6.initialTimestamp;
        builder6.setstatisticsTypeName("ssl_verify_certificate");
        boolean boolean14 = builder6.getmongoUseSSL();
        java.lang.String str15 = builder6.indexName;
        java.util.Set<java.lang.String> strSet16 = builder6.getexcludeFields();
        docScoreSearchScript0.setNextVar("hi!", (java.lang.Object) builder6);
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        docScoreSearchScript0.setNextScore((float) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (byte) 100);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("hi!", "name");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float3 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("store_statistics", "options");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextScore((float) ' ');
        docScoreSearchScript0.setNextScore((float) (short) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder8.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet11 = builder8.excludeFields;
        com.mongodb.BasicDBObject basicDBObject12 = builder8.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = builder8.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray14 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList15 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList15, serverAddressArray14);
        builder8.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList15);
        java.lang.String str18 = builder8.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder8.dropCollection(true);
        boolean boolean21 = builder20.mongoSSLVerifyCertificate;
        java.lang.String[] strArray39 = new java.lang.String[] { "connect_timeout", "script_type", "collection", "secondary_read_preference", "throttle_size", "host", "actions", "drop_collection", "name", "initial_timestamp", "size", "script_type", "throttle_size", "hi!", "advanced_transformation", "name", "concurrent_requests" };
        java.util.LinkedHashSet<java.lang.String> strSet40 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet40, strArray39);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder20.includeFields((java.util.Set<java.lang.String>) strSet40);
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) strSet40);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder44.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet47 = builder44.excludeFields;
        com.mongodb.BasicDBObject basicDBObject48 = builder44.getmongoCollectionFilter();
        java.lang.String str49 = builder44.mongoLocalUser;
        builder44.setscript("drop_collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder52.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet55 = builder52.excludeFields;
        com.mongodb.BasicDBObject basicDBObject56 = builder52.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder44.mongoCollectionFilter(basicDBObject56);
        java.lang.String str58 = builder44.getstatisticsIndexName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder44.mongoUseSSL(false);
        builder60.setriverIndexName("");
        builder60.dropCollection = true;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder66 = builder60.includeCollection("size");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp67 = builder60.initialTimestamp;
        com.mongodb.BasicDBObject basicDBObject68 = builder60.mongoCollectionFilter;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject68);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        docScoreSearchScript0.setNextScore((float) 10L);
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        docScoreSearchScript0.setNextScore(10.0f);
        docScoreSearchScript0.setNextScore((float) (short) 100);
        docScoreSearchScript0.setNextScore((float) 0L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long13 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script", "drop_collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("options", "initial_timestamp");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        org.elasticsearch.common.logging.ESLogger eSLogger3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.logger;
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) eSLogger3);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder6.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet9 = builder6.excludeFields;
        com.mongodb.BasicDBObject basicDBObject10 = builder6.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = builder6.initialTimestamp;
        builder6.setstatisticsTypeName("ssl_verify_certificate");
        boolean boolean14 = builder6.getmongoUseSSL();
        java.lang.String str15 = builder6.indexName;
        java.util.Set<java.lang.String> strSet16 = builder6.getexcludeFields();
        docScoreSearchScript0.setNextVar("hi!", (java.lang.Object) builder6);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript18 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj20 = docScoreSearchScript18.unwrap((java.lang.Object) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder22.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet25 = builder22.excludeFields;
        builder22.setmongoCollection("initial_timestamp");
        boolean boolean28 = builder22.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder22.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition31 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder30);
        java.lang.String str32 = mongoDBRiverDefinition31.includeCollection;
        java.lang.String str33 = mongoDBRiverDefinition31.getCOLLECTION_FIELD();
        boolean boolean34 = mongoDBRiverDefinition31.isImportAllCollections();
        boolean boolean35 = mongoDBRiverDefinition31.mongoGridFS;
        docScoreSearchScript18.setNextVar("collection", (java.lang.Object) mongoDBRiverDefinition31);
        docScoreSearchScript18.setNextScore((float) (-1L));
        java.lang.Object obj39 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float40 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        org.elasticsearch.common.logging.ESLogger eSLogger3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.logger;
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) eSLogger3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (byte) 1);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder4.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet7 = builder4.excludeFields;
        builder4.setmongoCollection("initial_timestamp");
        boolean boolean10 = builder4.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder4.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder12);
        java.lang.String str14 = mongoDBRiverDefinition13.includeCollection;
        java.lang.String str15 = mongoDBRiverDefinition13.getCOLLECTION_FIELD();
        boolean boolean16 = mongoDBRiverDefinition13.isImportAllCollections();
        boolean boolean17 = mongoDBRiverDefinition13.mongoGridFS;
        docScoreSearchScript0.setNextVar("collection", (java.lang.Object) mongoDBRiverDefinition13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double19 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        org.elasticsearch.common.logging.ESLogger eSLogger3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.logger;
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) eSLogger3);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder5.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet8 = builder5.excludeFields;
        com.mongodb.BasicDBObject basicDBObject9 = builder5.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp10 = builder5.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray11 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList12 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList12, serverAddressArray11);
        builder5.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList12);
        java.lang.String str15 = builder5.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder5.dropCollection(true);
        builder17.setriverIndexName("flush_interval");
        int int20 = builder17.socketTimeout;
        builder17.settypeName("user");
        java.lang.Object obj23 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        docScoreSearchScript0.setNextScore((float) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj26 = docScoreSearchScript0.run();
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        docScoreSearchScript0.setNextScore(100.0f);
        docScoreSearchScript0.setNextScore((float) (-1L));
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder7.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet10 = builder7.excludeFields;
        builder7.setmongoCollection("initial_timestamp");
        boolean boolean13 = builder7.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder7.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder15);
        java.lang.String str17 = mongoDBRiverDefinition16.includeCollection;
        boolean boolean18 = mongoDBRiverDefinition16.mongoGridFS;
        boolean boolean19 = mongoDBRiverDefinition16.advancedTransformation;
        org.elasticsearch.common.unit.TimeValue timeValue20 = mongoDBRiverDefinition16.getDEFAULT_FLUSH_INTERVAL();
        boolean boolean21 = mongoDBRiverDefinition16.getmongoGridFS();
        boolean boolean22 = mongoDBRiverDefinition16.getmongoUseSSL();
        java.util.List<com.mongodb.ServerAddress> serverAddressList23 = mongoDBRiverDefinition16.mongoServers;
        com.mongodb.BasicDBObject basicDBObject24 = mongoDBRiverDefinition16.mongoCollectionFilter;
        java.lang.Object obj25 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double26 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextVar("disable_index_refresh", (java.lang.Object) "index");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (byte) 0);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("host", "gridfs");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        org.elasticsearch.common.logging.ESLogger eSLogger3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.logger;
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) eSLogger3);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder6.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet9 = builder6.excludeFields;
        builder6.setmongoCollection("initial_timestamp");
        boolean boolean12 = builder6.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder6.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder14);
        java.lang.String str16 = mongoDBRiverDefinition15.includeCollection;
        java.lang.String str17 = mongoDBRiverDefinition15.getIndexName();
        java.lang.String str18 = mongoDBRiverDefinition15.getSECONDARY_READ_PREFERENCE_FIELD();
        java.lang.String str19 = mongoDBRiverDefinition15.script;
        java.lang.String str20 = mongoDBRiverDefinition15.getGRIDFS_FIELD();
        java.lang.String str21 = mongoDBRiverDefinition15.getCONCURRENT_REQUESTS_FIELD();
        com.mongodb.BasicDBObject basicDBObject22 = mongoDBRiverDefinition15.getMongoOplogFilter();
        java.lang.String str23 = mongoDBRiverDefinition15.getINCLUDE_FIELDS_FIELD();
        java.lang.String str24 = mongoDBRiverDefinition15.getMongoLocalPassword();
        int int25 = mongoDBRiverDefinition15.socketTimeout;
        docScoreSearchScript0.setNextVar("servers", (java.lang.Object) mongoDBRiverDefinition15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj27 = docScoreSearchScript0.run();
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextVar("disable_index_refresh", (java.lang.Object) "index");
        docScoreSearchScript0.setNextScore((float) 10L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder8.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet11 = builder8.excludeFields;
        builder8.setmongoCollection("initial_timestamp");
        boolean boolean14 = builder8.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder8.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder16);
        java.lang.String str18 = mongoDBRiverDefinition17.includeCollection;
        boolean boolean19 = mongoDBRiverDefinition17.mongoGridFS;
        java.lang.String str20 = mongoDBRiverDefinition17.getINITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD();
        java.util.Set<java.lang.String> strSet21 = mongoDBRiverDefinition17.getExcludeFields();
        java.lang.String str22 = mongoDBRiverDefinition17.mongoLocalUser;
        java.lang.Object obj23 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition17);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder24.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet27 = builder24.excludeFields;
        builder24.setmongoCollection("initial_timestamp");
        boolean boolean30 = builder24.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder24.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition33 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder32);
        java.lang.String str34 = mongoDBRiverDefinition33.includeCollection;
        java.lang.String str35 = mongoDBRiverDefinition33.getTypeName();
        com.mongodb.BasicDBObject basicDBObject36 = mongoDBRiverDefinition33.getMongoCollectionFilter();
        java.lang.String str37 = mongoDBRiverDefinition33.mongoLocalPassword;
        java.lang.Object obj38 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition33);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder40.script("script");
        com.mongodb.BasicDBObject basicDBObject43 = builder42.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder42.typeName("connect_timeout");
        boolean boolean46 = builder42.mongoGridFS;
        boolean boolean47 = builder42.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition48 = builder42.build();
        java.lang.String str49 = mongoDBRiverDefinition48.getADMIN_DB_FIELD();
        java.lang.String str50 = mongoDBRiverDefinition48.getIncludeCollection();
        boolean boolean51 = mongoDBRiverDefinition48.getdropCollection();
        java.lang.String str52 = mongoDBRiverDefinition48.getINCLUDE_FIELDS_FIELD();
        docScoreSearchScript0.setNextVar("skip_initial_import", (java.lang.Object) str52);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder54.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet57 = builder54.excludeFields;
        java.lang.String str58 = builder54.getmongoLocalPassword();
        builder54.disableIndexRefresh = true;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = builder54.mongoAdminUser("");
        builder62.mongoCollection = "hi!";
        java.lang.String str65 = builder62.getmongoLocalPassword();
        builder62.setriverIndexName("ssl");
        builder62.setconnectTimeout((int) (short) 1);
        com.mongodb.MongoClientOptions mongoClientOptions70 = builder62.getmongoClientOptions();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder72 = builder62.script("null.initial_timestamp");
        java.lang.Object obj73 = docScoreSearchScript0.unwrap((java.lang.Object) "null.initial_timestamp");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double74 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextVar("disable_index_refresh", (java.lang.Object) "index");
        docScoreSearchScript0.setNextScore((float) 10L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder9.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet12 = builder9.excludeFields;
        java.lang.String str13 = builder9.getmongoLocalPassword();
        builder9.disableIndexRefresh = true;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder9.mongoAdminUser("");
        builder17.mongoCollection = "hi!";
        builder17.setmongoAdminPassword("options");
        builder17.includeCollection = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder24.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet27 = builder24.excludeFields;
        com.mongodb.BasicDBObject basicDBObject28 = builder24.getmongoCollectionFilter();
        java.lang.String str29 = builder24.mongoLocalUser;
        com.mongodb.ServerAddress[] serverAddressArray30 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList31 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList31, serverAddressArray30);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder24.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList31);
        com.mongodb.MongoClientOptions mongoClientOptions34 = builder24.getmongoClientOptions();
        builder24.riverName = "script_type";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder37.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet40 = builder37.excludeFields;
        com.mongodb.BasicDBObject basicDBObject41 = builder37.getmongoCollectionFilter();
        builder24.setmongoOplogFilter(basicDBObject41);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder17.mongoOplogFilter(basicDBObject41);
        builder17.disableIndexRefresh = false;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder47.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet50 = builder47.excludeFields;
        com.mongodb.BasicDBObject basicDBObject51 = builder47.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp52 = builder47.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray53 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList54 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList54, serverAddressArray53);
        builder47.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList54);
        builder46.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList54);
        builder46.mongoLocalUser = "credentials";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = builder46.advancedTransformation(false);
        builder46.mongoAdminUser = "options";
        boolean boolean64 = builder46.getstoreStatistics();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder66 = builder46.mongoDb("advanced_transformation");
        java.lang.String str67 = builder46.mongoLocalUser;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder69 = builder46.mongoDb("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder70 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder70.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet73 = builder70.excludeFields;
        com.mongodb.BasicDBObject basicDBObject74 = builder70.getmongoCollectionFilter();
        java.lang.String str75 = builder70.mongoLocalUser;
        com.mongodb.ServerAddress[] serverAddressArray76 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList77 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList77, serverAddressArray76);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder79 = builder70.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList77);
        java.lang.String str80 = builder70.mongoAdminPassword;
        java.lang.String[] strArray85 = new java.lang.String[] { "admin", "script_type", "credentials", "password" };
        java.util.LinkedHashSet<java.lang.String> strSet86 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet86, strArray85);
        builder70.setincludeFields((java.util.Set<java.lang.String>) strSet86);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder89 = builder46.excludeFields((java.util.Set<java.lang.String>) strSet86);
        builder17.setincludeFields((java.util.Set<java.lang.String>) strSet86);
        docScoreSearchScript0.setNextVar("", (java.lang.Object) strSet86);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long92 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextScore((float) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double5 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextVar("disable_index_refresh", (java.lang.Object) "index");
        docScoreSearchScript0.setNextScore((float) 10L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder8.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet11 = builder8.excludeFields;
        builder8.setmongoCollection("initial_timestamp");
        boolean boolean14 = builder8.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder8.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder16);
        java.lang.String str18 = mongoDBRiverDefinition17.includeCollection;
        boolean boolean19 = mongoDBRiverDefinition17.mongoGridFS;
        java.lang.String str20 = mongoDBRiverDefinition17.getINITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD();
        java.util.Set<java.lang.String> strSet21 = mongoDBRiverDefinition17.getExcludeFields();
        java.lang.String str22 = mongoDBRiverDefinition17.mongoLocalUser;
        java.lang.Object obj23 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition17);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder24.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet27 = builder24.excludeFields;
        builder24.setmongoCollection("initial_timestamp");
        boolean boolean30 = builder24.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder24.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition33 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder32);
        java.lang.String str34 = mongoDBRiverDefinition33.includeCollection;
        java.lang.String str35 = mongoDBRiverDefinition33.getTypeName();
        com.mongodb.BasicDBObject basicDBObject36 = mongoDBRiverDefinition33.getMongoCollectionFilter();
        java.lang.String str37 = mongoDBRiverDefinition33.mongoLocalPassword;
        java.lang.Object obj38 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition33);
        docScoreSearchScript0.setNextScore((float) 35);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder42.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet45 = builder42.excludeFields;
        com.mongodb.BasicDBObject basicDBObject46 = builder42.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp47 = builder42.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray48 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList49 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList49, serverAddressArray48);
        builder42.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList49);
        builder41.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList49);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder53.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet56 = builder53.excludeFields;
        com.mongodb.BasicDBObject basicDBObject57 = builder53.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp58 = builder53.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray59 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList60 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList60, serverAddressArray59);
        builder53.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList60);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = builder41.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList60);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder65 = builder41.indexName("");
        int int66 = builder65.getthrottleSize();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp67 = builder65.getinitialTimestamp();
        builder65.socketTimeout = (byte) 1;
        java.lang.String str70 = builder65.scriptType;
        java.util.List<com.mongodb.ServerAddress> serverAddressList71 = builder65.mongoServers;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder73 = builder65.statisticsTypeName("throttle_size");
        builder65.setskipInitialImport(true);
        java.lang.String str76 = builder65.mongoDb;
        com.mongodb.BasicDBObject basicDBObject77 = builder65.mongoCollectionFilter;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject77);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextVar("disable_index_refresh", (java.lang.Object) "index");
        docScoreSearchScript0.setNextScore((float) 27017);
        docScoreSearchScript0.setNextVar("gridfs", (java.lang.Object) (-1.0d));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float11 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("gridfs", "local");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("servers", "null.null", false);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        docScoreSearchScript0.setNextScore((float) 10L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder6.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet9 = builder6.excludeFields;
        builder6.setmongoCollection("initial_timestamp");
        boolean boolean12 = builder6.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder6.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder14);
        java.lang.String str16 = mongoDBRiverDefinition15.includeCollection;
        boolean boolean17 = mongoDBRiverDefinition15.mongoGridFS;
        boolean boolean18 = mongoDBRiverDefinition15.advancedTransformation;
        java.lang.String str19 = mongoDBRiverDefinition15.getADMIN_DB_FIELD();
        boolean boolean20 = mongoDBRiverDefinition15.getdisableIndexRefresh();
        boolean boolean21 = mongoDBRiverDefinition15.isMongoSecondaryReadPreference();
        java.lang.String str22 = mongoDBRiverDefinition15.mongoCollection;
        java.util.Set<java.lang.String> strSet23 = mongoDBRiverDefinition15.includeFields;
        int int24 = mongoDBRiverDefinition15.throttleSize;
        boolean boolean25 = mongoDBRiverDefinition15.disableIndexRefresh;
        docScoreSearchScript0.setNextVar("exclude_fields", (java.lang.Object) boolean25);
        docScoreSearchScript0.setNextScore((float) 10L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder29.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet32 = builder29.excludeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder29.mongoSSLVerifyCertificate(true);
        boolean boolean35 = builder29.mongoSSLVerifyCertificate;
        java.lang.String str36 = builder29.scriptType;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder29.mongoUseSSL(false);
        builder29.setstatisticsIndexName("options");
        java.util.Set<java.lang.String> strSet41 = builder29.includeFields;
        builder29.mongoDb = "script";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder44.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet47 = builder44.excludeFields;
        builder44.setmongoCollection("initial_timestamp");
        boolean boolean50 = builder44.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder44.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition53 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder52);
        java.lang.String str54 = mongoDBRiverDefinition53.includeCollection;
        java.lang.String str55 = mongoDBRiverDefinition53.getIndexName();
        java.lang.String str56 = mongoDBRiverDefinition53.getSECONDARY_READ_PREFERENCE_FIELD();
        java.lang.String str57 = mongoDBRiverDefinition53.riverName;
        java.lang.String str58 = mongoDBRiverDefinition53.getIncludeCollection();
        java.lang.String str59 = mongoDBRiverDefinition53.getCONCURRENT_REQUESTS_FIELD();
        com.mongodb.BasicDBObject basicDBObject60 = mongoDBRiverDefinition53.getMongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = builder29.mongoCollectionFilter(basicDBObject60);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject60);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        org.elasticsearch.common.logging.ESLogger eSLogger3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.logger;
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) eSLogger3);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder6.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet9 = builder6.excludeFields;
        builder6.setmongoCollection("initial_timestamp");
        boolean boolean12 = builder6.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder6.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder14);
        java.lang.String str16 = mongoDBRiverDefinition15.includeCollection;
        java.lang.String str17 = mongoDBRiverDefinition15.getIndexName();
        java.lang.String str18 = mongoDBRiverDefinition15.getSECONDARY_READ_PREFERENCE_FIELD();
        java.lang.String str19 = mongoDBRiverDefinition15.script;
        java.lang.String str20 = mongoDBRiverDefinition15.getGRIDFS_FIELD();
        java.lang.String str21 = mongoDBRiverDefinition15.getCONCURRENT_REQUESTS_FIELD();
        com.mongodb.BasicDBObject basicDBObject22 = mongoDBRiverDefinition15.getMongoOplogFilter();
        java.lang.String str23 = mongoDBRiverDefinition15.getINCLUDE_FIELDS_FIELD();
        java.lang.String str24 = mongoDBRiverDefinition15.getMongoLocalPassword();
        int int25 = mongoDBRiverDefinition15.socketTimeout;
        docScoreSearchScript0.setNextVar("servers", (java.lang.Object) mongoDBRiverDefinition15);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder28.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet31 = builder28.excludeFields;
        builder28.setmongoCollection("initial_timestamp");
        boolean boolean34 = builder28.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder28.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition37 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder36);
        java.lang.String str38 = mongoDBRiverDefinition37.includeCollection;
        java.lang.String str39 = mongoDBRiverDefinition37.getHOST_FIELD();
        java.lang.String str40 = mongoDBRiverDefinition37.getMongoLocalPassword();
        java.lang.String str41 = mongoDBRiverDefinition37.script;
        java.lang.String str42 = mongoDBRiverDefinition37.mongoAdminUser;
        int int43 = mongoDBRiverDefinition37.getDEFAULT_BULK_ACTIONS();
        boolean boolean44 = mongoDBRiverDefinition37.getmongoSSLVerifyCertificate();
        java.lang.String str45 = mongoDBRiverDefinition37.mongoCollection;
        docScoreSearchScript0.setNextVar("local", (java.lang.Object) str45);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj47 = docScoreSearchScript0.run();
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("actions", "credentials");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("host", "disable_index_refresh");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        docScoreSearchScript0.setNextScore((float) 10L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder6.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet9 = builder6.excludeFields;
        builder6.setmongoCollection("initial_timestamp");
        boolean boolean12 = builder6.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder6.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder14);
        java.lang.String str16 = mongoDBRiverDefinition15.includeCollection;
        boolean boolean17 = mongoDBRiverDefinition15.mongoGridFS;
        boolean boolean18 = mongoDBRiverDefinition15.advancedTransformation;
        java.lang.String str19 = mongoDBRiverDefinition15.getADMIN_DB_FIELD();
        boolean boolean20 = mongoDBRiverDefinition15.getdisableIndexRefresh();
        boolean boolean21 = mongoDBRiverDefinition15.isMongoSecondaryReadPreference();
        java.lang.String str22 = mongoDBRiverDefinition15.mongoCollection;
        java.util.Set<java.lang.String> strSet23 = mongoDBRiverDefinition15.includeFields;
        int int24 = mongoDBRiverDefinition15.throttleSize;
        boolean boolean25 = mongoDBRiverDefinition15.disableIndexRefresh;
        docScoreSearchScript0.setNextVar("exclude_fields", (java.lang.Object) boolean25);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder28.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet31 = builder28.excludeFields;
        builder28.setmongoCollection("initial_timestamp");
        boolean boolean34 = builder28.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder28.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition37 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder36);
        java.lang.String str38 = mongoDBRiverDefinition37.includeCollection;
        java.lang.String str39 = mongoDBRiverDefinition37.getCOLLECTION_FIELD();
        java.util.Set<java.lang.String> strSet40 = mongoDBRiverDefinition37.excludeFields;
        java.lang.String str41 = mongoDBRiverDefinition37.getOPTIONS_FIELD();
        java.lang.String str42 = mongoDBRiverDefinition37.getIndexName();
        docScoreSearchScript0.setNextVar("bulk_size", (java.lang.Object) mongoDBRiverDefinition37);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double44 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder1.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet4 = builder1.excludeFields;
        builder1.setmongoCollection("initial_timestamp");
        boolean boolean7 = builder1.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder1.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder9);
        java.lang.String str11 = mongoDBRiverDefinition10.includeCollection;
        java.lang.String str12 = mongoDBRiverDefinition10.getCOLLECTION_FIELD();
        int int13 = mongoDBRiverDefinition10.throttleSize;
        java.lang.String str14 = mongoDBRiverDefinition10.getRiverName();
        java.lang.String str15 = mongoDBRiverDefinition10.getPARENT_TYPES_FIELD();
        java.lang.String str16 = mongoDBRiverDefinition10.getSERVERS_FIELD();
        java.lang.String str17 = mongoDBRiverDefinition10.mongoLocalUser;
        java.lang.Object obj18 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long19 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextScore((float) ' ');
        docScoreSearchScript0.setNextScore((float) (short) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder8.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet11 = builder8.excludeFields;
        com.mongodb.BasicDBObject basicDBObject12 = builder8.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = builder8.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray14 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList15 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList15, serverAddressArray14);
        builder8.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList15);
        java.lang.String str18 = builder8.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder8.dropCollection(true);
        boolean boolean21 = builder20.mongoSSLVerifyCertificate;
        java.lang.String[] strArray39 = new java.lang.String[] { "connect_timeout", "script_type", "collection", "secondary_read_preference", "throttle_size", "host", "actions", "drop_collection", "name", "initial_timestamp", "size", "script_type", "throttle_size", "hi!", "advanced_transformation", "name", "concurrent_requests" };
        java.util.LinkedHashSet<java.lang.String> strSet40 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet40, strArray39);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder20.includeFields((java.util.Set<java.lang.String>) strSet40);
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) strSet40);
        docScoreSearchScript0.setNextScore((float) (-1L));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj46 = docScoreSearchScript0.run();
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("name", "gridfs");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("concurrent_requests", "collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        docScoreSearchScript0.setNextScore((float) 10L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder6.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet9 = builder6.excludeFields;
        builder6.setmongoCollection("initial_timestamp");
        boolean boolean12 = builder6.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder6.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder14);
        java.lang.String str16 = mongoDBRiverDefinition15.includeCollection;
        boolean boolean17 = mongoDBRiverDefinition15.mongoGridFS;
        boolean boolean18 = mongoDBRiverDefinition15.advancedTransformation;
        java.lang.String str19 = mongoDBRiverDefinition15.getADMIN_DB_FIELD();
        boolean boolean20 = mongoDBRiverDefinition15.getdisableIndexRefresh();
        boolean boolean21 = mongoDBRiverDefinition15.isMongoSecondaryReadPreference();
        java.lang.String str22 = mongoDBRiverDefinition15.mongoCollection;
        java.util.Set<java.lang.String> strSet23 = mongoDBRiverDefinition15.includeFields;
        int int24 = mongoDBRiverDefinition15.throttleSize;
        boolean boolean25 = mongoDBRiverDefinition15.disableIndexRefresh;
        docScoreSearchScript0.setNextVar("exclude_fields", (java.lang.Object) boolean25);
        docScoreSearchScript0.setNextScore((float) 10L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long29 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextVar("disable_index_refresh", (java.lang.Object) "index");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(8);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder4.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet7 = builder4.excludeFields;
        builder4.setmongoCollection("initial_timestamp");
        boolean boolean10 = builder4.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder4.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder12);
        java.lang.String str14 = mongoDBRiverDefinition13.includeCollection;
        java.lang.String str15 = mongoDBRiverDefinition13.getCOLLECTION_FIELD();
        boolean boolean16 = mongoDBRiverDefinition13.isImportAllCollections();
        boolean boolean17 = mongoDBRiverDefinition13.mongoGridFS;
        docScoreSearchScript0.setNextVar("collection", (java.lang.Object) mongoDBRiverDefinition13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj19 = docScoreSearchScript0.run();
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextScore((float) ' ');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder5.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet8 = builder5.excludeFields;
        builder5.setmongoCollection("initial_timestamp");
        boolean boolean11 = builder5.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder5.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder13);
        java.lang.String str15 = mongoDBRiverDefinition14.includeCollection;
        java.lang.String str16 = mongoDBRiverDefinition14.getHOST_FIELD();
        org.elasticsearch.common.logging.ESLogger eSLogger17 = mongoDBRiverDefinition14.getlogger();
        java.lang.Object obj18 = docScoreSearchScript0.unwrap((java.lang.Object) eSLogger17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (byte) 0);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        docScoreSearchScript0.setNextScore((float) 10L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder6.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet9 = builder6.excludeFields;
        builder6.setmongoCollection("initial_timestamp");
        boolean boolean12 = builder6.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder6.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder14);
        java.lang.String str16 = mongoDBRiverDefinition15.includeCollection;
        boolean boolean17 = mongoDBRiverDefinition15.mongoGridFS;
        boolean boolean18 = mongoDBRiverDefinition15.advancedTransformation;
        java.lang.String str19 = mongoDBRiverDefinition15.getADMIN_DB_FIELD();
        boolean boolean20 = mongoDBRiverDefinition15.getdisableIndexRefresh();
        boolean boolean21 = mongoDBRiverDefinition15.isMongoSecondaryReadPreference();
        java.lang.String str22 = mongoDBRiverDefinition15.mongoCollection;
        java.util.Set<java.lang.String> strSet23 = mongoDBRiverDefinition15.includeFields;
        int int24 = mongoDBRiverDefinition15.throttleSize;
        boolean boolean25 = mongoDBRiverDefinition15.disableIndexRefresh;
        docScoreSearchScript0.setNextVar("exclude_fields", (java.lang.Object) boolean25);
        docScoreSearchScript0.setNextScore((float) 10L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float29 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        docScoreSearchScript0.setNextScore((float) 10L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder6.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet9 = builder6.excludeFields;
        builder6.setmongoCollection("initial_timestamp");
        boolean boolean12 = builder6.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder6.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder14);
        java.lang.String str16 = mongoDBRiverDefinition15.includeCollection;
        boolean boolean17 = mongoDBRiverDefinition15.mongoGridFS;
        boolean boolean18 = mongoDBRiverDefinition15.advancedTransformation;
        java.lang.String str19 = mongoDBRiverDefinition15.getADMIN_DB_FIELD();
        boolean boolean20 = mongoDBRiverDefinition15.getdisableIndexRefresh();
        boolean boolean21 = mongoDBRiverDefinition15.isMongoSecondaryReadPreference();
        java.lang.String str22 = mongoDBRiverDefinition15.mongoCollection;
        java.util.Set<java.lang.String> strSet23 = mongoDBRiverDefinition15.includeFields;
        int int24 = mongoDBRiverDefinition15.throttleSize;
        boolean boolean25 = mongoDBRiverDefinition15.disableIndexRefresh;
        docScoreSearchScript0.setNextVar("exclude_fields", (java.lang.Object) boolean25);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder28.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet31 = builder28.excludeFields;
        builder28.setmongoCollection("initial_timestamp");
        boolean boolean34 = builder28.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder28.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition37 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder36);
        java.lang.String str38 = mongoDBRiverDefinition37.includeCollection;
        java.lang.String str39 = mongoDBRiverDefinition37.getCOLLECTION_FIELD();
        java.util.Set<java.lang.String> strSet40 = mongoDBRiverDefinition37.excludeFields;
        java.lang.String str41 = mongoDBRiverDefinition37.getOPTIONS_FIELD();
        java.lang.String str42 = mongoDBRiverDefinition37.getIndexName();
        docScoreSearchScript0.setNextVar("bulk_size", (java.lang.Object) mongoDBRiverDefinition37);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder44.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet47 = builder44.excludeFields;
        builder44.setmongoCollection("initial_timestamp");
        boolean boolean50 = builder44.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder44.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition53 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder52);
        java.lang.String str54 = mongoDBRiverDefinition53.includeCollection;
        java.lang.String str55 = mongoDBRiverDefinition53.getHOST_FIELD();
        java.lang.String str56 = mongoDBRiverDefinition53.getMongoLocalPassword();
        java.lang.String str57 = mongoDBRiverDefinition53.script;
        boolean boolean58 = mongoDBRiverDefinition53.mongoSSLVerifyCertificate;
        java.lang.String str59 = mongoDBRiverDefinition53.getSCRIPT_FIELD();
        java.lang.String str60 = mongoDBRiverDefinition53.getFILTER_FIELD();
        com.mongodb.MongoClientOptions mongoClientOptions61 = mongoDBRiverDefinition53.mongoClientOptions;
        java.lang.Object obj62 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition53);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long63 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextScore((float) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (short) 0);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextVar("disable_index_refresh", (java.lang.Object) "index");
        docScoreSearchScript0.setNextScore((float) 27017);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder8.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet11 = builder8.excludeFields;
        builder8.setmongoCollection("initial_timestamp");
        boolean boolean14 = builder8.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder8.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder16);
        java.lang.String str18 = mongoDBRiverDefinition17.includeCollection;
        java.lang.String str19 = mongoDBRiverDefinition17.getHOST_FIELD();
        java.lang.String str20 = mongoDBRiverDefinition17.getMongoLocalPassword();
        java.lang.String str21 = mongoDBRiverDefinition17.scriptType;
        org.elasticsearch.common.logging.ESLogger eSLogger22 = mongoDBRiverDefinition17.getlogger();
        java.lang.String str23 = mongoDBRiverDefinition17.script;
        java.util.List<com.mongodb.ServerAddress> serverAddressList24 = mongoDBRiverDefinition17.getMongoServers();
        java.lang.String str25 = mongoDBRiverDefinition17.getEXCLUDE_FIELDS_FIELD();
        java.lang.String str26 = mongoDBRiverDefinition17.scriptType;
        org.elasticsearch.common.unit.TimeValue timeValue27 = mongoDBRiverDefinition17.getDEFAULT_FLUSH_INTERVAL();
        java.util.List<com.mongodb.ServerAddress> serverAddressList28 = mongoDBRiverDefinition17.mongoServers;
        java.lang.Object obj29 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long30 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        docScoreSearchScript0.setNextScore((float) 10L);
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(97);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextVar("disable_index_refresh", (java.lang.Object) "index");
        docScoreSearchScript0.setNextScore((float) 27017);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder8.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet11 = builder8.excludeFields;
        builder8.setmongoCollection("initial_timestamp");
        boolean boolean14 = builder8.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder8.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder16);
        java.lang.String str18 = mongoDBRiverDefinition17.includeCollection;
        java.lang.String str19 = mongoDBRiverDefinition17.getHOST_FIELD();
        java.lang.String str20 = mongoDBRiverDefinition17.getMongoLocalPassword();
        java.lang.String str21 = mongoDBRiverDefinition17.scriptType;
        org.elasticsearch.common.logging.ESLogger eSLogger22 = mongoDBRiverDefinition17.getlogger();
        java.lang.String str23 = mongoDBRiverDefinition17.script;
        java.util.List<com.mongodb.ServerAddress> serverAddressList24 = mongoDBRiverDefinition17.getMongoServers();
        java.lang.String str25 = mongoDBRiverDefinition17.getEXCLUDE_FIELDS_FIELD();
        java.lang.String str26 = mongoDBRiverDefinition17.scriptType;
        org.elasticsearch.common.unit.TimeValue timeValue27 = mongoDBRiverDefinition17.getDEFAULT_FLUSH_INTERVAL();
        java.util.List<com.mongodb.ServerAddress> serverAddressList28 = mongoDBRiverDefinition17.mongoServers;
        java.lang.Object obj29 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double30 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("include_fields", "gridfs");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextVar("disable_index_refresh", (java.lang.Object) "index");
        docScoreSearchScript0.setNextScore((float) 10L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder8.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet11 = builder8.excludeFields;
        builder8.setmongoCollection("initial_timestamp");
        boolean boolean14 = builder8.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder8.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder16);
        java.lang.String str18 = mongoDBRiverDefinition17.includeCollection;
        boolean boolean19 = mongoDBRiverDefinition17.mongoGridFS;
        java.lang.String str20 = mongoDBRiverDefinition17.getINITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD();
        java.util.Set<java.lang.String> strSet21 = mongoDBRiverDefinition17.getExcludeFields();
        java.lang.String str22 = mongoDBRiverDefinition17.mongoLocalUser;
        java.lang.Object obj23 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition17);
        docScoreSearchScript0.setNextScore((float) (short) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder26.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet29 = builder26.excludeFields;
        com.mongodb.BasicDBObject basicDBObject30 = builder26.getmongoCollectionFilter();
        java.lang.String str31 = builder26.mongoLocalUser;
        com.mongodb.ServerAddress[] serverAddressArray32 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList33 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList33, serverAddressArray32);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = builder26.mongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList33);
        java.lang.String str36 = builder26.getmongoLocalPassword();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder38.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet41 = builder38.excludeFields;
        com.mongodb.BasicDBObject basicDBObject42 = builder38.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp43 = builder38.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray44 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList45 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList45, serverAddressArray44);
        builder38.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList45);
        builder37.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList45);
        builder37.mongoLocalUser = "credentials";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder37.advancedTransformation(false);
        builder37.mongoAdminUser = "options";
        com.mongodb.BasicDBObject basicDBObject55 = builder37.getmongoCollectionFilter();
        builder26.setmongoCollectionFilter(basicDBObject55);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject55);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("servers", "null.null");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = builder3.script("script");
        com.mongodb.BasicDBObject basicDBObject6 = builder5.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder5.typeName("connect_timeout");
        com.mongodb.BasicDBObject basicDBObject9 = builder5.getmongoOplogFilter();
        builder5.mongoUseSSL = false;
        builder5.setmongoUseSSL(false);
        java.lang.String str14 = builder5.getstatisticsTypeName();
        java.lang.Object obj15 = docScoreSearchScript0.unwrap((java.lang.Object) builder5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder16.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet19 = builder16.excludeFields;
        builder16.setmongoCollection("initial_timestamp");
        boolean boolean22 = builder16.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder16.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder24);
        java.lang.String str26 = mongoDBRiverDefinition25.includeCollection;
        java.lang.String str27 = mongoDBRiverDefinition25.getIndexName();
        java.lang.String str28 = mongoDBRiverDefinition25.riverName;
        com.mongodb.BasicDBObject basicDBObject29 = mongoDBRiverDefinition25.mongoCollectionFilter;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject29);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        org.elasticsearch.common.logging.ESLogger eSLogger3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.logger;
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) eSLogger3);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder6.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet9 = builder6.excludeFields;
        builder6.setmongoCollection("initial_timestamp");
        boolean boolean12 = builder6.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder6.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder14);
        java.lang.String str16 = mongoDBRiverDefinition15.includeCollection;
        java.lang.String str17 = mongoDBRiverDefinition15.getIndexName();
        java.lang.String str18 = mongoDBRiverDefinition15.getSECONDARY_READ_PREFERENCE_FIELD();
        java.lang.String str19 = mongoDBRiverDefinition15.script;
        java.lang.String str20 = mongoDBRiverDefinition15.getGRIDFS_FIELD();
        java.lang.String str21 = mongoDBRiverDefinition15.getCONCURRENT_REQUESTS_FIELD();
        com.mongodb.BasicDBObject basicDBObject22 = mongoDBRiverDefinition15.getMongoOplogFilter();
        java.lang.String str23 = mongoDBRiverDefinition15.getINCLUDE_FIELDS_FIELD();
        java.lang.String str24 = mongoDBRiverDefinition15.getMongoLocalPassword();
        int int25 = mongoDBRiverDefinition15.socketTimeout;
        docScoreSearchScript0.setNextVar("servers", (java.lang.Object) mongoDBRiverDefinition15);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder28.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet31 = builder28.excludeFields;
        builder28.setmongoCollection("initial_timestamp");
        boolean boolean34 = builder28.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder28.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition37 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder36);
        java.lang.String str38 = mongoDBRiverDefinition37.includeCollection;
        java.lang.String str39 = mongoDBRiverDefinition37.getHOST_FIELD();
        java.lang.String str40 = mongoDBRiverDefinition37.getMongoLocalPassword();
        java.lang.String str41 = mongoDBRiverDefinition37.script;
        java.lang.String str42 = mongoDBRiverDefinition37.mongoAdminUser;
        int int43 = mongoDBRiverDefinition37.getDEFAULT_BULK_ACTIONS();
        boolean boolean44 = mongoDBRiverDefinition37.getmongoSSLVerifyCertificate();
        java.lang.String str45 = mongoDBRiverDefinition37.mongoCollection;
        docScoreSearchScript0.setNextVar("local", (java.lang.Object) str45);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double47 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextScore((float) ' ');
        docScoreSearchScript0.setNextScore((float) (short) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder8.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet11 = builder8.excludeFields;
        com.mongodb.BasicDBObject basicDBObject12 = builder8.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp13 = builder8.initialTimestamp;
        com.mongodb.ServerAddress[] serverAddressArray14 = new com.mongodb.ServerAddress[] {};
        java.util.ArrayList<com.mongodb.ServerAddress> serverAddressList15 = new java.util.ArrayList<com.mongodb.ServerAddress>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.mongodb.ServerAddress>) serverAddressList15, serverAddressArray14);
        builder8.setmongoServers((java.util.List<com.mongodb.ServerAddress>) serverAddressList15);
        java.lang.String str18 = builder8.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder8.dropCollection(true);
        boolean boolean21 = builder20.mongoSSLVerifyCertificate;
        java.lang.String[] strArray39 = new java.lang.String[] { "connect_timeout", "script_type", "collection", "secondary_read_preference", "throttle_size", "host", "actions", "drop_collection", "name", "initial_timestamp", "size", "script_type", "throttle_size", "hi!", "advanced_transformation", "name", "concurrent_requests" };
        java.util.LinkedHashSet<java.lang.String> strSet40 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet40, strArray39);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder20.includeFields((java.util.Set<java.lang.String>) strSet40);
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) strSet40);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder45.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet48 = builder45.excludeFields;
        builder45.setmongoCollection("hi!");
        boolean boolean51 = builder45.importAllCollections;
        java.lang.String str52 = builder45.mongoAdminPassword;
        builder45.typeName = "concurrent_bulk_requests";
        builder45.setskipInitialImport(false);
        boolean boolean57 = builder45.getadvancedTransformation();
        docScoreSearchScript0.setNextVar("null.initial_timestamp", (java.lang.Object) builder45);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder60.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet63 = builder60.excludeFields;
        java.lang.String str64 = builder60.getmongoLocalPassword();
        java.lang.String str65 = builder60.getmongoAdminUser();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder67 = builder60.mongoLocalPassword("options");
        docScoreSearchScript0.setNextVar("", (java.lang.Object) builder67);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder70 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder72 = builder70.script("script");
        com.mongodb.BasicDBObject basicDBObject73 = builder72.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder75 = builder72.typeName("connect_timeout");
        boolean boolean76 = builder72.mongoGridFS;
        boolean boolean77 = builder72.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition78 = builder72.build();
        java.lang.String str79 = mongoDBRiverDefinition78.mongoDb;
        java.lang.String str80 = mongoDBRiverDefinition78.getMongoLocalPassword();
        boolean boolean81 = mongoDBRiverDefinition78.getmongoGridFS();
        java.lang.String str82 = mongoDBRiverDefinition78.mongoAdminPassword;
        java.lang.String str83 = mongoDBRiverDefinition78.getPARENT_TYPES_FIELD();
        java.lang.String str84 = mongoDBRiverDefinition78.getOPTIONS_FIELD();
        docScoreSearchScript0.setNextVar("parent_types", (java.lang.Object) str84);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj86 = docScoreSearchScript0.run();
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("parent_types", "name");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        org.elasticsearch.common.logging.ESLogger eSLogger3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.logger;
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) eSLogger3);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder6.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet9 = builder6.excludeFields;
        com.mongodb.BasicDBObject basicDBObject10 = builder6.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp11 = builder6.initialTimestamp;
        builder6.setstatisticsTypeName("ssl_verify_certificate");
        boolean boolean14 = builder6.getmongoUseSSL();
        java.lang.String str15 = builder6.indexName;
        java.util.Set<java.lang.String> strSet16 = builder6.getexcludeFields();
        docScoreSearchScript0.setNextVar("hi!", (java.lang.Object) builder6);
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        docScoreSearchScript0.setNextScore((float) (byte) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder23.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet26 = builder23.excludeFields;
        builder23.setmongoCollection("initial_timestamp");
        boolean boolean29 = builder23.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder23.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition32 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder31);
        java.lang.String str33 = mongoDBRiverDefinition32.includeCollection;
        java.lang.String str34 = mongoDBRiverDefinition32.getCOLLECTION_FIELD();
        java.util.Set<java.lang.String> strSet35 = mongoDBRiverDefinition32.excludeFields;
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp36 = mongoDBRiverDefinition32.getInitialTimestamp();
        java.util.Set<java.lang.String> strSet37 = mongoDBRiverDefinition32.excludeFields;
        boolean boolean38 = mongoDBRiverDefinition32.isMongoUseSSL();
        java.lang.String str39 = mongoDBRiverDefinition32.getCONNECTION_TIMEOUT();
        java.lang.String str40 = mongoDBRiverDefinition32.mongoLocalPassword;
        java.lang.String str41 = mongoDBRiverDefinition32.getDROP_COLLECTION_FIELD();
        java.lang.String str42 = mongoDBRiverDefinition32.getINITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD();
        docScoreSearchScript0.setNextVar("ssl_verify_certificate", (java.lang.Object) str42);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (short) 0);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder4.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet7 = builder4.excludeFields;
        builder4.setmongoCollection("initial_timestamp");
        boolean boolean10 = builder4.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder4.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder12);
        java.lang.String str14 = mongoDBRiverDefinition13.includeCollection;
        java.lang.String str15 = mongoDBRiverDefinition13.getCOLLECTION_FIELD();
        boolean boolean16 = mongoDBRiverDefinition13.isImportAllCollections();
        boolean boolean17 = mongoDBRiverDefinition13.mongoGridFS;
        docScoreSearchScript0.setNextVar("collection", (java.lang.Object) mongoDBRiverDefinition13);
        docScoreSearchScript0.setNextScore((float) (-1L));
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder21.setmongoSecondaryReadPreference(false);
        java.util.Set<java.lang.String> strSet24 = builder21.excludeFields;
        builder21.setmongoCollection("initial_timestamp");
        boolean boolean27 = builder21.storeStatistics;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder21.skipInitialImport(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition30 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder29);
        java.lang.String str31 = mongoDBRiverDefinition30.includeCollection;
        java.lang.String str32 = mongoDBRiverDefinition30.getHOST_FIELD();
        java.lang.String str33 = mongoDBRiverDefinition30.getMongoLocalPassword();
        java.lang.String str34 = mongoDBRiverDefinition30.scriptType;
        java.lang.Object obj35 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj36 = docScoreSearchScript0.run();
    }
}

