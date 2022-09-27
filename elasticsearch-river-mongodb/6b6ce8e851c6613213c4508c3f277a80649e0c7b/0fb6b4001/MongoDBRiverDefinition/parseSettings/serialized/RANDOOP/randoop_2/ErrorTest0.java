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
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "script");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("port", "disable_index_refresh");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long1 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double1 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        com.mongodb.BasicDBObject basicDBObject4 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject4);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj1 = docScoreSearchScript0.run();
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double3 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (short) -1);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float5 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (short) 100);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        java.lang.Object obj7 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (byte) 100);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        java.lang.Object obj7 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (byte) 0);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        docScoreSearchScript0.setNextScore((float) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj8 = docScoreSearchScript0.run();
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        docScoreSearchScript0.setNextScore((float) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.advancedTransformation(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory8 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject10 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript11 = docScoreNativeScriptFactory8.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject10);
        builder5.setmongoCollectionFilter(basicDBObject10);
        java.lang.String str13 = builder5.getriverIndexName();
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory14 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject16 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript17 = docScoreNativeScriptFactory14.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject16);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder5.mongoOplogFilter(basicDBObject16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject16);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        docScoreSearchScript0.setNextVar("advanced_transformation", (java.lang.Object) "filter");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double6 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (byte) -1);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("secondary_read_preference", "_river");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        docScoreSearchScript0.setNextScore((float) 'a');
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory8 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject10 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript11 = docScoreNativeScriptFactory8.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject10);
        com.mongodb.BasicDBObject basicDBObject13 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript14 = docScoreNativeScriptFactory8.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject13);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (byte) 1);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder1.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet4 = builder3.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder3.mongoCollection("size");
        builder6.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder6);
        java.lang.String str10 = mongoDBRiverDefinition9.getTHROTTLE_SIZE_FIELD();
        boolean boolean11 = mongoDBRiverDefinition9.getmongoGridFS();
        com.mongodb.BasicDBObject basicDBObject12 = mongoDBRiverDefinition9.mongoOplogFilter;
        java.util.Set<java.lang.String> strSet13 = mongoDBRiverDefinition9.getIncludeFields();
        com.mongodb.BasicDBObject basicDBObject14 = mongoDBRiverDefinition9.mongoCollectionFilter;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject14);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        docScoreSearchScript0.setNextScore((float) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double5 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_size", "mongodb-1638820218299");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double3 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        docScoreSearchScript0.setNextScore((float) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float5 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218424", "script_type");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("flush_interval", "disable_index_refresh");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        docScoreSearchScript0.setNextScore((float) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (byte) -1);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("local", "store_statistics");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet9 = builder8.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder8.mongoCollection("size");
        builder11.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder11);
        java.lang.String str15 = mongoDBRiverDefinition14.getTHROTTLE_SIZE_FIELD();
        java.lang.String str16 = mongoDBRiverDefinition14.getGRIDFS_FIELD();
        java.lang.String str17 = mongoDBRiverDefinition14.getINITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD();
        java.lang.String str18 = mongoDBRiverDefinition14.getPORT_FIELD();
        int int19 = mongoDBRiverDefinition14.throttleSize;
        com.mongodb.BasicDBObject basicDBObject20 = mongoDBRiverDefinition14.mongoCollectionFilter;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject20);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        docScoreSearchScript0.setNextVar("advanced_transformation", (java.lang.Object) "filter");
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet11 = builder10.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder10.mongoCollection("size");
        builder13.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder13);
        java.lang.String str17 = mongoDBRiverDefinition16.getTHROTTLE_SIZE_FIELD();
        java.lang.String str18 = mongoDBRiverDefinition16.getGRIDFS_FIELD();
        java.lang.String str19 = mongoDBRiverDefinition16.getINITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD();
        java.lang.String str20 = mongoDBRiverDefinition16.getPORT_FIELD();
        int int21 = mongoDBRiverDefinition16.throttleSize;
        com.mongodb.BasicDBObject basicDBObject22 = mongoDBRiverDefinition16.mongoCollectionFilter;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject22);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        java.lang.Object obj7 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        docScoreSearchScript0.setNextScore((float) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj10 = docScoreSearchScript0.run();
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218326", "actions");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet9 = builder8.parentTypes;
        builder8.indexName = "disable_index_refresh";
        builder8.setriverName("ssl_verify_certificate");
        builder8.setmongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = builder8.initialTimestamp;
        builder8.riverIndexName = "db";
        builder8.setscript("db");
        docScoreSearchScript0.setNextVar("user", (java.lang.Object) "db");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(0);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820217755", "mongodb-1638820218408");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        docScoreSearchScript0.setNextVar("advanced_transformation", (java.lang.Object) "filter");
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double8 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long5 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        docScoreSearchScript0.setNextVar("advanced_transformation", (java.lang.Object) "filter");
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet11 = builder10.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder10.mongoCollection("size");
        builder13.setmongoAdminUser("disable_index_refresh");
        java.lang.String str16 = builder13.indexName;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory17 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject19 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript20 = docScoreNativeScriptFactory17.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject19);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory21 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject23 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript24 = docScoreNativeScriptFactory21.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject23);
        com.mongodb.BasicDBObject basicDBObject26 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript27 = docScoreNativeScriptFactory21.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject26);
        org.elasticsearch.script.ExecutableScript executableScript28 = docScoreNativeScriptFactory17.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject26);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder13.mongoCollectionFilter(basicDBObject26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject26);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet9 = builder8.parentTypes;
        builder8.indexName = "disable_index_refresh";
        builder8.setriverName("ssl_verify_certificate");
        builder8.setmongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = builder8.initialTimestamp;
        builder8.riverIndexName = "db";
        docScoreSearchScript0.setNextVar("null.size", (java.lang.Object) builder8);
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        docScoreSearchScript0.setNextScore((-1.0f));
        docScoreSearchScript0.setNextScore((float) 0L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(1);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        docScoreSearchScript0.setNextVar("advanced_transformation", (java.lang.Object) "filter");
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.advancedTransformation(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory11 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject13 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript14 = docScoreNativeScriptFactory11.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject13);
        builder8.setmongoCollectionFilter(basicDBObject13);
        java.lang.String str16 = builder8.getriverIndexName();
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory17 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject19 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript20 = docScoreNativeScriptFactory17.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject19);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder8.mongoOplogFilter(basicDBObject19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject19);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet9 = builder8.parentTypes;
        builder8.indexName = "disable_index_refresh";
        builder8.setriverName("ssl_verify_certificate");
        builder8.setmongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = builder8.initialTimestamp;
        builder8.riverIndexName = "db";
        docScoreSearchScript0.setNextVar("null.size", (java.lang.Object) builder8);
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        docScoreSearchScript0.setNextScore((-1.0f));
        docScoreSearchScript0.setNextScore((float) 0L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj26 = docScoreSearchScript0.run();
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        java.lang.Object obj7 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        docScoreSearchScript0.setNextScore((float) (byte) 100);
        java.lang.Object obj11 = docScoreSearchScript0.unwrap((java.lang.Object) (-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float12 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet9 = builder8.parentTypes;
        builder8.indexName = "disable_index_refresh";
        builder8.setriverName("ssl_verify_certificate");
        builder8.setmongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = builder8.initialTimestamp;
        builder8.riverIndexName = "db";
        builder8.setscript("db");
        docScoreSearchScript0.setNextVar("user", (java.lang.Object) "db");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long22 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        docScoreSearchScript0.setNextScore((float) '4');
        docScoreSearchScript0.setNextScore((float) '4');
        docScoreSearchScript0.setNextScore((float) 1000);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float12 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "flush_interval");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("_river", "host");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("name", "size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        docScoreSearchScript0.setNextScore((float) '4');
        docScoreSearchScript0.setNextScore((float) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float10 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        docScoreSearchScript0.setNextScore((float) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long8 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        docScoreSearchScript0.setNextScore((float) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long8 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("name", "secondary_read_preference");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("drop_collection", "admin");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet9 = builder8.parentTypes;
        builder8.indexName = "disable_index_refresh";
        builder8.setriverName("ssl_verify_certificate");
        builder8.setmongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = builder8.initialTimestamp;
        builder8.riverIndexName = "db";
        docScoreSearchScript0.setNextVar("null.size", (java.lang.Object) builder8);
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        docScoreSearchScript0.setNextScore((-1.0f));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double24 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet9 = builder8.parentTypes;
        builder8.indexName = "disable_index_refresh";
        builder8.setriverName("ssl_verify_certificate");
        builder8.setmongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = builder8.initialTimestamp;
        builder8.riverIndexName = "db";
        docScoreSearchScript0.setNextVar("null.size", (java.lang.Object) builder8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double20 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet9 = builder8.parentTypes;
        builder8.indexName = "disable_index_refresh";
        builder8.setriverName("ssl_verify_certificate");
        builder8.setmongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = builder8.initialTimestamp;
        builder8.riverIndexName = "db";
        docScoreSearchScript0.setNextVar("null.size", (java.lang.Object) builder8);
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        docScoreSearchScript0.setNextScore(1.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj24 = docScoreSearchScript0.run();
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("null.size", "gridfs");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        java.lang.Object obj7 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        docScoreSearchScript0.setNextScore((float) (byte) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet13 = builder12.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder12.mongoCollection("size");
        builder15.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder15);
        java.lang.String str19 = mongoDBRiverDefinition18.getACTIONS_FIELD();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp20 = mongoDBRiverDefinition18.initialTimestamp;
        int int21 = mongoDBRiverDefinition18.connectTimeout;
        boolean boolean22 = mongoDBRiverDefinition18.isDisableIndexRefresh();
        java.lang.String str23 = mongoDBRiverDefinition18.getMongoLocalUser();
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter24 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str25 = serializedObjectSupporter24.deserializeObjectString11();
        java.lang.String str26 = serializedObjectSupporter24.deserializeObjectString17();
        org.elasticsearch.river.RiverSettings riverSettings27 = serializedObjectSupporter24.deserializeObjectRiverSettings3();
        java.lang.String str28 = serializedObjectSupporter24.deserializeObjectString16();
        org.elasticsearch.river.RiverSettings riverSettings29 = serializedObjectSupporter24.deserializeObjectRiverSettings3();
        mongoDBRiverDefinition18.serializedObjectSupporter = serializedObjectSupporter24;
        java.lang.Object obj31 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj32 = docScoreSearchScript0.run();
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("store_statistics", "local");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("store_statistics", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("socket_timeout", "include_fields");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        java.lang.Object obj7 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float8 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("filter", "host");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("name", "null.size", false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet9 = builder8.parentTypes;
        builder8.indexName = "disable_index_refresh";
        builder8.setriverName("ssl_verify_certificate");
        builder8.setmongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = builder8.initialTimestamp;
        builder8.riverIndexName = "db";
        docScoreSearchScript0.setNextVar("null.size", (java.lang.Object) builder8);
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        docScoreSearchScript0.setNextScore((-1.0f));
        docScoreSearchScript0.setNextScore((float) 0L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long26 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218449", "size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        java.lang.Object obj7 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        docScoreSearchScript0.setNextScore((float) (byte) 100);
        java.lang.Object obj11 = docScoreSearchScript0.unwrap((java.lang.Object) (-1));
        docScoreSearchScript0.setNextScore((float) 27017);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double14 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        docScoreSearchScript0.setNextVar("advanced_transformation", (java.lang.Object) "filter");
        docScoreSearchScript0.setNextScore((float) 0L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long8 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet9 = builder8.parentTypes;
        builder8.indexName = "disable_index_refresh";
        builder8.setriverName("ssl_verify_certificate");
        builder8.setmongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = builder8.initialTimestamp;
        builder8.riverIndexName = "db";
        docScoreSearchScript0.setNextVar("null.size", (java.lang.Object) builder8);
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        docScoreSearchScript0.setNextScore(1.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long24 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet9 = builder8.parentTypes;
        builder8.indexName = "disable_index_refresh";
        builder8.setriverName("ssl_verify_certificate");
        builder8.setmongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = builder8.initialTimestamp;
        builder8.riverIndexName = "db";
        docScoreSearchScript0.setNextVar("null.size", (java.lang.Object) builder8);
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        docScoreSearchScript0.setNextScore((-1.0f));
        docScoreSearchScript0.setNextScore((float) 0L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float26 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        docScoreSearchScript0.setNextScore((float) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(27017);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet9 = builder8.parentTypes;
        builder8.indexName = "disable_index_refresh";
        builder8.setriverName("ssl_verify_certificate");
        builder8.setmongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = builder8.initialTimestamp;
        builder8.riverIndexName = "db";
        docScoreSearchScript0.setNextVar("null.size", (java.lang.Object) builder8);
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        docScoreSearchScript0.setNextScore((-1.0f));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float24 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        docScoreSearchScript0.setNextScore((float) '4');
        docScoreSearchScript0.setNextScore((float) '4');
        docScoreSearchScript0.setNextScore((float) 1000);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long12 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        docScoreSearchScript0.setNextScore((float) '4');
        docScoreSearchScript0.setNextScore((float) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double10 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet9 = builder8.parentTypes;
        builder8.indexName = "disable_index_refresh";
        builder8.setriverName("ssl_verify_certificate");
        builder8.setmongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = builder8.initialTimestamp;
        builder8.riverIndexName = "db";
        docScoreSearchScript0.setNextVar("null.size", (java.lang.Object) builder8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj20 = docScoreSearchScript0.run();
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("collection", "actions");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        docScoreSearchScript0.setNextVar("advanced_transformation", (java.lang.Object) "filter");
        docScoreSearchScript0.setNextScore((float) 0L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.advancedTransformation(false);
        builder8.mongoAdminPassword = "name";
        builder8.setmongoAdminPassword("mongodb-1638820218326");
        builder8.includeCollection = "mongodb-1638820218363";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder8.mongoAdminPassword("include_fields");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = builder19.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet22 = builder21.parentTypes;
        builder21.indexName = "disable_index_refresh";
        builder21.setriverName("ssl_verify_certificate");
        builder21.setmongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp29 = builder21.initialTimestamp;
        builder21.riverIndexName = "db";
        com.mongodb.BasicDBObject basicDBObject32 = builder21.mongoCollectionFilter;
        builder18.setmongoCollectionFilter(basicDBObject32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject32);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet9 = builder8.parentTypes;
        builder8.indexName = "disable_index_refresh";
        builder8.setriverName("ssl_verify_certificate");
        builder8.setmongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = builder8.initialTimestamp;
        builder8.riverIndexName = "db";
        builder8.setscript("db");
        docScoreSearchScript0.setNextVar("user", (java.lang.Object) "db");
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue23 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DEFAULT_BULK_SIZE;
        docScoreSearchScript0.setNextVar("script_type", (java.lang.Object) byteSizeValue23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (short) 100);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        docScoreSearchScript0.setNextScore((float) (byte) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.advancedTransformation(false);
        builder9.mongoAdminPassword = "name";
        boolean boolean14 = builder9.mongoSecondaryReadPreference;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory15 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject17 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript18 = docScoreNativeScriptFactory15.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject17);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory19 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject21 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript22 = docScoreNativeScriptFactory19.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject21);
        com.mongodb.BasicDBObject basicDBObject24 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript25 = docScoreNativeScriptFactory19.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject24);
        org.elasticsearch.script.ExecutableScript executableScript26 = docScoreNativeScriptFactory15.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject24);
        builder9.setmongoCollectionFilter(basicDBObject24);
        builder9.mongoLocalPassword = "initial_timestamp";
        java.util.List<com.mongodb.ServerAddress> serverAddressList30 = builder9.mongoServers;
        java.lang.String str31 = builder9.statisticsIndexName;
        boolean boolean32 = builder9.getadvancedTransformation();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder9.riverIndexName("gridfs");
        docScoreSearchScript0.setNextVar("credentials", (java.lang.Object) builder34);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double36 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        docScoreSearchScript0.setNextVar("advanced_transformation", (java.lang.Object) "filter");
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long8 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        java.lang.Object obj7 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        docScoreSearchScript0.setNextScore((float) (byte) 100);
        java.lang.Object obj11 = docScoreSearchScript0.unwrap((java.lang.Object) (-1));
        docScoreSearchScript0.setNextScore((-1.0f));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj14 = docScoreSearchScript0.run();
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        docScoreSearchScript0.setNextVar("advanced_transformation", (java.lang.Object) "filter");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet9 = builder8.parentTypes;
        builder8.indexName = "disable_index_refresh";
        builder8.setriverName("ssl_verify_certificate");
        builder8.setmongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = builder8.initialTimestamp;
        builder8.riverIndexName = "db";
        com.mongodb.BasicDBObject basicDBObject19 = builder8.mongoCollectionFilter;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject19);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        docScoreSearchScript0.setNextVar("advanced_transformation", (java.lang.Object) "filter");
        docScoreSearchScript0.setNextScore((float) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double8 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        java.lang.Object obj7 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        docScoreSearchScript0.setNextScore((float) (byte) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.advancedTransformation(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory14 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject16 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript17 = docScoreNativeScriptFactory14.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject16);
        builder11.setmongoCollectionFilter(basicDBObject16);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder11.mongoDb("mongodb-1638820218387");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.advancedTransformation(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory24 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject26 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript27 = docScoreNativeScriptFactory24.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject26);
        builder21.setmongoCollectionFilter(basicDBObject26);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder21.mongoDb("mongodb-1638820218387");
        java.lang.String[] strArray36 = new java.lang.String[] { "throttle_size", "", "db", "db", "local" };
        java.util.LinkedHashSet<java.lang.String> strSet37 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet37, strArray36);
        builder21.setparentTypes((java.util.Set<java.lang.String>) strSet37);
        builder20.parentTypes = strSet37;
        com.mongodb.BasicDBObject basicDBObject41 = builder20.mongoCollectionFilter;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder20.importAllCollections(true);
        builder43.setmongoGridFS(false);
        boolean boolean46 = builder43.getadvancedTransformation();
        docScoreSearchScript0.setNextVar("mongodb-1638820218449", (java.lang.Object) builder43);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder49.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet52 = builder51.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder51.mongoCollection("size");
        builder54.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition57 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder54);
        java.lang.String str58 = mongoDBRiverDefinition57.getTHROTTLE_SIZE_FIELD();
        java.lang.String str59 = mongoDBRiverDefinition57.getADMIN_DB_FIELD();
        boolean boolean60 = mongoDBRiverDefinition57.mongoSecondaryReadPreference;
        java.lang.String str61 = mongoDBRiverDefinition57.getDROP_COLLECTION_FIELD();
        java.util.Set<java.lang.String> strSet62 = mongoDBRiverDefinition57.excludeFields;
        java.lang.String str63 = mongoDBRiverDefinition57.getPARENT_TYPES_FIELD();
        java.lang.String str64 = mongoDBRiverDefinition57.getACTIONS_FIELD();
        boolean boolean65 = mongoDBRiverDefinition57.getmongoSecondaryReadPreference();
        docScoreSearchScript0.setNextVar("connect_timeout", (java.lang.Object) boolean65);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj67 = docScoreSearchScript0.run();
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("null.size", "filter");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("connect_timeout", "concurrent_requests");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        docScoreSearchScript0.setNextScore((float) '4');
        docScoreSearchScript0.setNextScore((float) (-1L));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double10 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        java.lang.Object obj7 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        docScoreSearchScript0.setNextScore((float) (byte) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet13 = builder10.includeFields;
        boolean boolean14 = builder10.getmongoGridFS();
        java.util.Set<java.lang.String> strSet15 = builder10.parentTypes;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder10.advancedTransformation(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.advancedTransformation(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory21 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject23 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript24 = docScoreNativeScriptFactory21.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject23);
        builder18.setmongoCollectionFilter(basicDBObject23);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder18.mongoDb("mongodb-1638820218387");
        java.lang.String[] strArray33 = new java.lang.String[] { "throttle_size", "", "db", "db", "local" };
        java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        builder18.setparentTypes((java.util.Set<java.lang.String>) strSet34);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder10.parentTypes((java.util.Set<java.lang.String>) strSet34);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder38.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet41 = builder40.parentTypes;
        java.util.List<com.mongodb.ServerAddress> serverAddressList42 = builder40.mongoServers;
        builder37.mongoServers = serverAddressList42;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder37.skipInitialImport(true);
        java.lang.Object obj46 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(1000);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218326", "size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        docScoreSearchScript0.setNextScore((float) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (short) 100);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet10 = builder9.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder9.mongoCollection("size");
        builder9.setscript("index");
        docScoreSearchScript0.setNextVar("mongodb-1638820217755", (java.lang.Object) "index");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float16 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet9 = builder8.parentTypes;
        builder8.indexName = "disable_index_refresh";
        builder8.setriverName("ssl_verify_certificate");
        builder8.setmongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = builder8.initialTimestamp;
        builder8.riverIndexName = "db";
        docScoreSearchScript0.setNextVar("null.size", (java.lang.Object) builder8);
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        docScoreSearchScript0.setNextScore(1.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double24 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        java.lang.Object obj7 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet11 = builder10.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder10.mongoCollection("size");
        builder13.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder13);
        java.lang.String str17 = mongoDBRiverDefinition16.getTHROTTLE_SIZE_FIELD();
        java.lang.String str18 = mongoDBRiverDefinition16.getGRIDFS_FIELD();
        java.lang.String str19 = mongoDBRiverDefinition16.getINITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD();
        java.lang.String str20 = mongoDBRiverDefinition16.getPORT_FIELD();
        int int21 = mongoDBRiverDefinition16.throttleSize;
        com.mongodb.BasicDBObject basicDBObject22 = mongoDBRiverDefinition16.mongoCollectionFilter;
        java.lang.Object obj23 = docScoreSearchScript0.unwrap((java.lang.Object) basicDBObject22);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder24.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet27 = builder24.includeFields;
        boolean boolean28 = builder24.getmongoGridFS();
        builder24.setdropCollection(false);
        java.lang.Object obj31 = docScoreSearchScript0.unwrap((java.lang.Object) builder24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float32 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        docScoreSearchScript0.setNextVar("advanced_transformation", (java.lang.Object) "filter");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(10);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        docScoreSearchScript0.setNextVar("advanced_transformation", (java.lang.Object) "filter");
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        docScoreSearchScript0.setNextScore((float) 'a');
        docScoreSearchScript0.setNextScore(0.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj12 = docScoreSearchScript0.run();
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        docScoreSearchScript0.setNextScore((float) (byte) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.advancedTransformation(false);
        builder9.mongoAdminPassword = "name";
        boolean boolean14 = builder9.mongoSecondaryReadPreference;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory15 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject17 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript18 = docScoreNativeScriptFactory15.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject17);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory19 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject21 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript22 = docScoreNativeScriptFactory19.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject21);
        com.mongodb.BasicDBObject basicDBObject24 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript25 = docScoreNativeScriptFactory19.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject24);
        org.elasticsearch.script.ExecutableScript executableScript26 = docScoreNativeScriptFactory15.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject24);
        builder9.setmongoCollectionFilter(basicDBObject24);
        builder9.mongoLocalPassword = "initial_timestamp";
        java.util.List<com.mongodb.ServerAddress> serverAddressList30 = builder9.mongoServers;
        java.lang.String str31 = builder9.statisticsIndexName;
        boolean boolean32 = builder9.getadvancedTransformation();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder9.riverIndexName("gridfs");
        docScoreSearchScript0.setNextVar("credentials", (java.lang.Object) builder34);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(0);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(100);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        docScoreSearchScript0.setNextScore((float) (byte) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.advancedTransformation(false);
        builder9.mongoAdminPassword = "name";
        boolean boolean14 = builder9.mongoSecondaryReadPreference;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory15 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject17 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript18 = docScoreNativeScriptFactory15.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject17);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory19 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject21 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript22 = docScoreNativeScriptFactory19.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject21);
        com.mongodb.BasicDBObject basicDBObject24 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript25 = docScoreNativeScriptFactory19.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject24);
        org.elasticsearch.script.ExecutableScript executableScript26 = docScoreNativeScriptFactory15.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject24);
        builder9.setmongoCollectionFilter(basicDBObject24);
        builder9.mongoLocalPassword = "initial_timestamp";
        java.util.List<com.mongodb.ServerAddress> serverAddressList30 = builder9.mongoServers;
        java.lang.String str31 = builder9.statisticsIndexName;
        boolean boolean32 = builder9.getadvancedTransformation();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder9.riverIndexName("gridfs");
        docScoreSearchScript0.setNextVar("credentials", (java.lang.Object) builder34);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj36 = docScoreSearchScript0.run();
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        docScoreSearchScript0.setNextVar("advanced_transformation", (java.lang.Object) "filter");
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        docScoreSearchScript0.setNextScore((float) 'a');
        docScoreSearchScript0.setNextScore((float) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj12 = docScoreSearchScript0.run();
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218264", "flush_interval");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("name", "bulk_size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("", "null.size");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        java.lang.Object obj7 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        docScoreSearchScript0.setNextScore((float) (byte) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet13 = builder12.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder12.mongoCollection("size");
        builder15.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder15);
        java.lang.String str19 = mongoDBRiverDefinition18.getACTIONS_FIELD();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp20 = mongoDBRiverDefinition18.initialTimestamp;
        int int21 = mongoDBRiverDefinition18.connectTimeout;
        boolean boolean22 = mongoDBRiverDefinition18.isDisableIndexRefresh();
        java.lang.String str23 = mongoDBRiverDefinition18.getMongoLocalUser();
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter24 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str25 = serializedObjectSupporter24.deserializeObjectString11();
        java.lang.String str26 = serializedObjectSupporter24.deserializeObjectString17();
        org.elasticsearch.river.RiverSettings riverSettings27 = serializedObjectSupporter24.deserializeObjectRiverSettings3();
        java.lang.String str28 = serializedObjectSupporter24.deserializeObjectString16();
        org.elasticsearch.river.RiverSettings riverSettings29 = serializedObjectSupporter24.deserializeObjectRiverSettings3();
        mongoDBRiverDefinition18.serializedObjectSupporter = serializedObjectSupporter24;
        java.lang.Object obj31 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (byte) 10);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        java.lang.Object obj7 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        docScoreSearchScript0.setNextScore((float) (byte) 100);
        java.lang.Object obj11 = docScoreSearchScript0.unwrap((java.lang.Object) (-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long12 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        java.lang.Object obj7 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet11 = builder10.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder10.mongoCollection("size");
        builder13.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder13);
        java.lang.String str17 = mongoDBRiverDefinition16.getTHROTTLE_SIZE_FIELD();
        java.lang.String str18 = mongoDBRiverDefinition16.getGRIDFS_FIELD();
        java.lang.String str19 = mongoDBRiverDefinition16.getINITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD();
        java.lang.String str20 = mongoDBRiverDefinition16.getPORT_FIELD();
        int int21 = mongoDBRiverDefinition16.throttleSize;
        com.mongodb.BasicDBObject basicDBObject22 = mongoDBRiverDefinition16.mongoCollectionFilter;
        java.lang.Object obj23 = docScoreSearchScript0.unwrap((java.lang.Object) basicDBObject22);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder24.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet27 = builder24.includeFields;
        boolean boolean28 = builder24.getmongoGridFS();
        builder24.setdropCollection(false);
        java.lang.Object obj31 = docScoreSearchScript0.unwrap((java.lang.Object) builder24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long32 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("connect_timeout", "advanced_transformation");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        docScoreSearchScript0.setNextScore((float) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder5.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet8 = builder7.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder7.mongoCollection("size");
        int int11 = builder7.getsocketTimeout();
        builder7.setmongoSecondaryReadPreference(false);
        builder7.setskipInitialImport(true);
        builder7.riverName = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder7.storeStatistics(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder20.advancedTransformation(false);
        builder20.mongoAdminPassword = "name";
        boolean boolean25 = builder20.mongoSecondaryReadPreference;
        java.lang.String str26 = builder20.mongoAdminUser;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory27 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject29 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript30 = docScoreNativeScriptFactory27.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject29);
        builder20.setmongoCollectionFilter(basicDBObject29);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder7.mongoOplogFilter(basicDBObject29);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject29);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820217755", "local");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("secondary_read_preference", "flush_interval");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        java.lang.Object obj7 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        docScoreSearchScript0.setNextScore((float) (byte) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet13 = builder12.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder12.mongoCollection("size");
        builder15.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder15);
        java.lang.String str19 = mongoDBRiverDefinition18.getACTIONS_FIELD();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp20 = mongoDBRiverDefinition18.initialTimestamp;
        int int21 = mongoDBRiverDefinition18.connectTimeout;
        boolean boolean22 = mongoDBRiverDefinition18.isDisableIndexRefresh();
        java.lang.String str23 = mongoDBRiverDefinition18.getMongoLocalUser();
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter24 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str25 = serializedObjectSupporter24.deserializeObjectString11();
        java.lang.String str26 = serializedObjectSupporter24.deserializeObjectString17();
        org.elasticsearch.river.RiverSettings riverSettings27 = serializedObjectSupporter24.deserializeObjectRiverSettings3();
        java.lang.String str28 = serializedObjectSupporter24.deserializeObjectString16();
        org.elasticsearch.river.RiverSettings riverSettings29 = serializedObjectSupporter24.deserializeObjectRiverSettings3();
        mongoDBRiverDefinition18.serializedObjectSupporter = serializedObjectSupporter24;
        java.lang.Object obj31 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float32 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        docScoreSearchScript0.setNextVar("advanced_transformation", (java.lang.Object) "filter");
        docScoreSearchScript0.setNextScore((float) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float8 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet9 = builder8.parentTypes;
        builder8.indexName = "disable_index_refresh";
        builder8.setriverName("ssl_verify_certificate");
        builder8.setmongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = builder8.initialTimestamp;
        builder8.riverIndexName = "db";
        docScoreSearchScript0.setNextVar("null.size", (java.lang.Object) builder8);
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        docScoreSearchScript0.setNextScore((-1.0f));
        docScoreSearchScript0.setNextScore((float) 0L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) '#');
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("exclude_fields", "user");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        java.lang.Object obj7 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        docScoreSearchScript0.setNextScore((float) (byte) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet13 = builder12.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder12.mongoCollection("size");
        builder15.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder15);
        java.lang.String str19 = mongoDBRiverDefinition18.getACTIONS_FIELD();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp20 = mongoDBRiverDefinition18.initialTimestamp;
        int int21 = mongoDBRiverDefinition18.connectTimeout;
        boolean boolean22 = mongoDBRiverDefinition18.isDisableIndexRefresh();
        java.lang.String str23 = mongoDBRiverDefinition18.getMongoLocalUser();
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter24 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str25 = serializedObjectSupporter24.deserializeObjectString11();
        java.lang.String str26 = serializedObjectSupporter24.deserializeObjectString17();
        org.elasticsearch.river.RiverSettings riverSettings27 = serializedObjectSupporter24.deserializeObjectRiverSettings3();
        java.lang.String str28 = serializedObjectSupporter24.deserializeObjectString16();
        org.elasticsearch.river.RiverSettings riverSettings29 = serializedObjectSupporter24.deserializeObjectRiverSettings3();
        mongoDBRiverDefinition18.serializedObjectSupporter = serializedObjectSupporter24;
        java.lang.Object obj31 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(100);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        docScoreSearchScript0.setNextScore((float) 0L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(0);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        docScoreSearchScript0.setNextVar("advanced_transformation", (java.lang.Object) "filter");
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet11 = builder10.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder10.mongoCollection("size");
        builder13.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder13);
        java.lang.String str17 = mongoDBRiverDefinition16.getTHROTTLE_SIZE_FIELD();
        boolean boolean18 = mongoDBRiverDefinition16.getmongoGridFS();
        com.mongodb.BasicDBObject basicDBObject19 = mongoDBRiverDefinition16.mongoOplogFilter;
        boolean boolean20 = mongoDBRiverDefinition16.isMongoGridFS();
        java.lang.String str21 = mongoDBRiverDefinition16.mongoCollection;
        java.lang.Object obj22 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition16);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet26 = builder25.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder25.mongoCollection("size");
        builder28.script = "skip_initial_import";
        builder28.setstatisticsIndexName("ssl_verify_certificate");
        builder28.mongoSSLVerifyCertificate = true;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder28.riverIndexName("mongodb-1638820218424");
        com.mongodb.BasicDBObject basicDBObject37 = builder28.mongoCollectionFilter;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject37);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        java.lang.Object obj7 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        docScoreSearchScript0.setNextScore((float) (byte) 100);
        java.lang.Object obj11 = docScoreSearchScript0.unwrap((java.lang.Object) (-1));
        docScoreSearchScript0.setNextScore((float) 27017);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj14 = docScoreSearchScript0.run();
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        docScoreSearchScript0.setNextScore((float) '4');
        docScoreSearchScript0.setNextScore(10.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj10 = docScoreSearchScript0.run();
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet9 = builder8.parentTypes;
        builder8.indexName = "disable_index_refresh";
        builder8.setriverName("ssl_verify_certificate");
        builder8.setmongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = builder8.initialTimestamp;
        builder8.riverIndexName = "db";
        docScoreSearchScript0.setNextVar("null.size", (java.lang.Object) builder8);
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        docScoreSearchScript0.setNextScore((-1.0f));
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder24.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet27 = builder26.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder26.mongoCollection("size");
        builder29.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition32 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder29);
        java.lang.String str33 = mongoDBRiverDefinition32.getTHROTTLE_SIZE_FIELD();
        java.lang.String str34 = mongoDBRiverDefinition32.getADMIN_DB_FIELD();
        java.lang.String str35 = mongoDBRiverDefinition32.getNAME_FIELD();
        boolean boolean36 = mongoDBRiverDefinition32.mongoUseSSL;
        java.lang.String str37 = mongoDBRiverDefinition32.getEXCLUDE_FIELDS_FIELD();
        com.mongodb.BasicDBObject basicDBObject38 = mongoDBRiverDefinition32.mongoCollectionFilter;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject38);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("filter", "password");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder1 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder3 = builder1.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet4 = builder3.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = builder3.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.socketTimeout(0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.advancedTransformation(false);
        builder11.setmongoCollection("hi!");
        builder11.storeStatistics = false;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder16.advancedTransformation(false);
        builder16.mongoAdminPassword = "name";
        boolean boolean21 = builder16.mongoSecondaryReadPreference;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory22 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject24 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript25 = docScoreNativeScriptFactory22.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject24);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory26 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject28 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript29 = docScoreNativeScriptFactory26.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject28);
        com.mongodb.BasicDBObject basicDBObject31 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript32 = docScoreNativeScriptFactory26.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject31);
        org.elasticsearch.script.ExecutableScript executableScript33 = docScoreNativeScriptFactory22.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject31);
        builder16.setmongoCollectionFilter(basicDBObject31);
        builder16.mongoLocalPassword = "initial_timestamp";
        java.util.List<com.mongodb.ServerAddress> serverAddressList37 = builder16.mongoServers;
        builder11.mongoServers = serverAddressList37;
        builder6.setmongoServers(serverAddressList37);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder6.mongoLocalUser("mongodb-1638820218424");
        java.lang.Object obj42 = docScoreSearchScript0.unwrap((java.lang.Object) builder6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long43 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet9 = builder8.parentTypes;
        builder8.indexName = "disable_index_refresh";
        builder8.setriverName("ssl_verify_certificate");
        builder8.setmongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = builder8.initialTimestamp;
        builder8.riverIndexName = "db";
        builder8.setscript("db");
        docScoreSearchScript0.setNextVar("user", (java.lang.Object) "db");
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue23 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DEFAULT_BULK_SIZE;
        docScoreSearchScript0.setNextVar("script_type", (java.lang.Object) byteSizeValue23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float25 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "localhost");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("options", "credentials");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        java.lang.Object obj7 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        docScoreSearchScript0.setNextScore((float) (byte) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet13 = builder10.includeFields;
        boolean boolean14 = builder10.getmongoGridFS();
        java.util.Set<java.lang.String> strSet15 = builder10.parentTypes;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder10.advancedTransformation(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.advancedTransformation(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory21 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject23 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript24 = docScoreNativeScriptFactory21.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject23);
        builder18.setmongoCollectionFilter(basicDBObject23);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder18.mongoDb("mongodb-1638820218387");
        java.lang.String[] strArray33 = new java.lang.String[] { "throttle_size", "", "db", "db", "local" };
        java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        builder18.setparentTypes((java.util.Set<java.lang.String>) strSet34);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder10.parentTypes((java.util.Set<java.lang.String>) strSet34);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder38.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet41 = builder40.parentTypes;
        java.util.List<com.mongodb.ServerAddress> serverAddressList42 = builder40.mongoServers;
        builder37.mongoServers = serverAddressList42;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder37.skipInitialImport(true);
        java.lang.Object obj46 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        docScoreSearchScript0.setNextScore((float) 1L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double49 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        docScoreSearchScript0.setNextScore((float) '4');
        docScoreSearchScript0.setNextScore((float) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (short) -1);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("include_collection", "mongodb-1638820217755");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        docScoreSearchScript0.setNextScore((float) '4');
        docScoreSearchScript0.setNextScore(10.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet13 = builder12.parentTypes;
        boolean boolean14 = builder12.skipInitialImport;
        com.mongodb.MongoClientOptions mongoClientOptions15 = builder12.getmongoClientOptions();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder12.mongoLocalUser("mongodb-1638820218424");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.advancedTransformation(false);
        builder18.mongoAdminPassword = "name";
        boolean boolean23 = builder18.mongoSecondaryReadPreference;
        com.mongodb.BasicDBObject basicDBObject24 = builder18.mongoOplogFilter;
        builder18.setdisableIndexRefresh(false);
        java.lang.String str27 = builder18.gettypeName();
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory28 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject30 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript31 = docScoreNativeScriptFactory28.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject30);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory32 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject34 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript35 = docScoreNativeScriptFactory32.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject34);
        com.mongodb.BasicDBObject basicDBObject37 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript38 = docScoreNativeScriptFactory32.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject37);
        org.elasticsearch.script.ExecutableScript executableScript39 = docScoreNativeScriptFactory28.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject37);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder18.mongoCollectionFilter(basicDBObject37);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder17.mongoOplogFilter(basicDBObject37);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject37);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("password", "socket_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet9 = builder8.parentTypes;
        builder8.indexName = "disable_index_refresh";
        builder8.setriverName("ssl_verify_certificate");
        builder8.setmongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = builder8.initialTimestamp;
        builder8.riverIndexName = "db";
        builder8.setscript("db");
        docScoreSearchScript0.setNextVar("user", (java.lang.Object) "db");
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue23 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DEFAULT_BULK_SIZE;
        docScoreSearchScript0.setNextVar("script_type", (java.lang.Object) byteSizeValue23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (short) -1);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        docScoreSearchScript0.setNextScore((float) (byte) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.advancedTransformation(false);
        builder9.mongoAdminPassword = "name";
        boolean boolean14 = builder9.mongoSecondaryReadPreference;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory15 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject17 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript18 = docScoreNativeScriptFactory15.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject17);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory19 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject21 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript22 = docScoreNativeScriptFactory19.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject21);
        com.mongodb.BasicDBObject basicDBObject24 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript25 = docScoreNativeScriptFactory19.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject24);
        org.elasticsearch.script.ExecutableScript executableScript26 = docScoreNativeScriptFactory15.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject24);
        builder9.setmongoCollectionFilter(basicDBObject24);
        builder9.mongoLocalPassword = "initial_timestamp";
        java.util.List<com.mongodb.ServerAddress> serverAddressList30 = builder9.mongoServers;
        java.lang.String str31 = builder9.statisticsIndexName;
        boolean boolean32 = builder9.getadvancedTransformation();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder9.riverIndexName("gridfs");
        docScoreSearchScript0.setNextVar("credentials", (java.lang.Object) builder34);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (byte) -1);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        docScoreSearchScript0.setNextVar("advanced_transformation", (java.lang.Object) "filter");
        docScoreSearchScript0.setNextScore((float) 100L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float8 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        java.lang.Object obj7 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet11 = builder10.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder10.mongoCollection("size");
        builder13.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder13);
        java.lang.String str17 = mongoDBRiverDefinition16.getTHROTTLE_SIZE_FIELD();
        java.lang.String str18 = mongoDBRiverDefinition16.getGRIDFS_FIELD();
        java.lang.String str19 = mongoDBRiverDefinition16.getINITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD();
        java.lang.String str20 = mongoDBRiverDefinition16.getPORT_FIELD();
        int int21 = mongoDBRiverDefinition16.throttleSize;
        com.mongodb.BasicDBObject basicDBObject22 = mongoDBRiverDefinition16.mongoCollectionFilter;
        java.lang.Object obj23 = docScoreSearchScript0.unwrap((java.lang.Object) basicDBObject22);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder24.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet27 = builder24.includeFields;
        boolean boolean28 = builder24.getmongoGridFS();
        builder24.setdropCollection(false);
        java.lang.Object obj31 = docScoreSearchScript0.unwrap((java.lang.Object) builder24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (short) 0);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        java.lang.Object obj7 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        docScoreSearchScript0.setNextScore((float) (byte) 100);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript11 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("include_fields", (java.lang.Object) docScoreSearchScript11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long13 = docScoreSearchScript11.runAsLong();
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        docScoreSearchScript0.setNextScore((float) 0);
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double7 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        java.lang.Object obj7 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        docScoreSearchScript0.setNextScore((float) (byte) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet13 = builder10.includeFields;
        boolean boolean14 = builder10.getmongoGridFS();
        java.util.Set<java.lang.String> strSet15 = builder10.parentTypes;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder10.advancedTransformation(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.advancedTransformation(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory21 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject23 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript24 = docScoreNativeScriptFactory21.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject23);
        builder18.setmongoCollectionFilter(basicDBObject23);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder18.mongoDb("mongodb-1638820218387");
        java.lang.String[] strArray33 = new java.lang.String[] { "throttle_size", "", "db", "db", "local" };
        java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        builder18.setparentTypes((java.util.Set<java.lang.String>) strSet34);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder10.parentTypes((java.util.Set<java.lang.String>) strSet34);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder38.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet41 = builder40.parentTypes;
        java.util.List<com.mongodb.ServerAddress> serverAddressList42 = builder40.mongoServers;
        builder37.mongoServers = serverAddressList42;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder37.skipInitialImport(true);
        java.lang.Object obj46 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float47 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("flush_interval", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("servers", "mongodb-1638820218424");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet9 = builder8.parentTypes;
        builder8.indexName = "disable_index_refresh";
        builder8.setriverName("ssl_verify_certificate");
        builder8.setmongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = builder8.initialTimestamp;
        builder8.riverIndexName = "db";
        docScoreSearchScript0.setNextVar("null.size", (java.lang.Object) builder8);
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        docScoreSearchScript0.setNextScore((-1.0f));
        docScoreSearchScript0.setNextScore((float) 0L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double26 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        docScoreSearchScript0.setNextVar("advanced_transformation", (java.lang.Object) "filter");
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet11 = builder10.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder10.mongoCollection("size");
        builder13.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder13);
        java.lang.String str17 = mongoDBRiverDefinition16.getTHROTTLE_SIZE_FIELD();
        boolean boolean18 = mongoDBRiverDefinition16.getmongoGridFS();
        com.mongodb.BasicDBObject basicDBObject19 = mongoDBRiverDefinition16.mongoOplogFilter;
        boolean boolean20 = mongoDBRiverDefinition16.isMongoGridFS();
        java.lang.String str21 = mongoDBRiverDefinition16.mongoCollection;
        java.lang.Object obj22 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj23 = docScoreSearchScript0.run();
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        java.lang.Object obj7 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet11 = builder10.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder10.mongoCollection("size");
        builder13.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder13);
        java.lang.String str17 = mongoDBRiverDefinition16.getTHROTTLE_SIZE_FIELD();
        java.lang.String str18 = mongoDBRiverDefinition16.getGRIDFS_FIELD();
        java.lang.String str19 = mongoDBRiverDefinition16.getINITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD();
        java.lang.String str20 = mongoDBRiverDefinition16.getPORT_FIELD();
        int int21 = mongoDBRiverDefinition16.throttleSize;
        com.mongodb.BasicDBObject basicDBObject22 = mongoDBRiverDefinition16.mongoCollectionFilter;
        java.lang.Object obj23 = docScoreSearchScript0.unwrap((java.lang.Object) basicDBObject22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double24 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        java.lang.Object obj7 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        docScoreSearchScript0.setNextScore((float) (byte) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.advancedTransformation(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory14 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject16 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript17 = docScoreNativeScriptFactory14.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject16);
        builder11.setmongoCollectionFilter(basicDBObject16);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder11.mongoDb("mongodb-1638820218387");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.advancedTransformation(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory24 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject26 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript27 = docScoreNativeScriptFactory24.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject26);
        builder21.setmongoCollectionFilter(basicDBObject26);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder21.mongoDb("mongodb-1638820218387");
        java.lang.String[] strArray36 = new java.lang.String[] { "throttle_size", "", "db", "db", "local" };
        java.util.LinkedHashSet<java.lang.String> strSet37 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet37, strArray36);
        builder21.setparentTypes((java.util.Set<java.lang.String>) strSet37);
        builder20.parentTypes = strSet37;
        com.mongodb.BasicDBObject basicDBObject41 = builder20.mongoCollectionFilter;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder20.importAllCollections(true);
        builder43.setmongoGridFS(false);
        boolean boolean46 = builder43.getadvancedTransformation();
        docScoreSearchScript0.setNextVar("mongodb-1638820218449", (java.lang.Object) builder43);
        docScoreSearchScript0.setNextScore((float) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(8);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        docScoreSearchScript0.setNextScore((float) '4');
        docScoreSearchScript0.setNextScore((float) '4');
        docScoreSearchScript0.setNextScore((float) 1000);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj12 = docScoreSearchScript0.run();
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet9 = builder8.parentTypes;
        builder8.indexName = "disable_index_refresh";
        builder8.setriverName("ssl_verify_certificate");
        builder8.setmongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = builder8.initialTimestamp;
        builder8.riverIndexName = "db";
        builder8.setscript("db");
        docScoreSearchScript0.setNextVar("user", (java.lang.Object) "db");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj22 = docScoreSearchScript0.run();
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        docScoreSearchScript0.setNextScore((float) '4');
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter9 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString15();
        java.lang.String str11 = serializedObjectSupporter9.deserializeObjectString6();
        java.lang.String str12 = serializedObjectSupporter9.deserializeObjectString9();
        org.elasticsearch.river.RiverSettings riverSettings13 = serializedObjectSupporter9.deserializeObjectRiverSettings9();
        java.lang.String str14 = serializedObjectSupporter9.deserializeObjectString3();
        java.lang.String str15 = serializedObjectSupporter9.deserializeObjectString11();
        java.lang.String str16 = serializedObjectSupporter9.deserializeObjectString5();
        docScoreSearchScript0.setNextVar("localhost", (java.lang.Object) str16);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long18 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        docScoreSearchScript0.setNextVar("advanced_transformation", (java.lang.Object) "filter");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj6 = docScoreSearchScript0.run();
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        docScoreSearchScript0.setNextVar("advanced_transformation", (java.lang.Object) "filter");
        docScoreSearchScript0.setNextScore((float) 100L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double8 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        java.lang.Object obj7 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        docScoreSearchScript0.setNextScore((float) (byte) 100);
        java.lang.Object obj11 = docScoreSearchScript0.unwrap((java.lang.Object) (-1));
        docScoreSearchScript0.setNextScore((-1.0f));
        docScoreSearchScript0.setNextScore((float) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double16 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("credentials", "index");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet9 = builder8.parentTypes;
        builder8.indexName = "disable_index_refresh";
        builder8.setriverName("ssl_verify_certificate");
        builder8.setmongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = builder8.initialTimestamp;
        builder8.riverIndexName = "db";
        docScoreSearchScript0.setNextVar("null.size", (java.lang.Object) builder8);
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        docScoreSearchScript0.setNextScore((-1.0f));
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextScore(0.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj28 = docScoreSearchScript0.run();
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float6 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        docScoreSearchScript0.setNextVar("advanced_transformation", (java.lang.Object) "filter");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float6 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        java.lang.Object obj7 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        docScoreSearchScript0.setNextScore((float) (byte) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet13 = builder10.includeFields;
        boolean boolean14 = builder10.getmongoGridFS();
        java.util.Set<java.lang.String> strSet15 = builder10.parentTypes;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder10.advancedTransformation(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.advancedTransformation(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory21 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject23 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript24 = docScoreNativeScriptFactory21.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject23);
        builder18.setmongoCollectionFilter(basicDBObject23);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder18.mongoDb("mongodb-1638820218387");
        java.lang.String[] strArray33 = new java.lang.String[] { "throttle_size", "", "db", "db", "local" };
        java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        builder18.setparentTypes((java.util.Set<java.lang.String>) strSet34);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder10.parentTypes((java.util.Set<java.lang.String>) strSet34);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder38.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet41 = builder40.parentTypes;
        java.util.List<com.mongodb.ServerAddress> serverAddressList42 = builder40.mongoServers;
        builder37.mongoServers = serverAddressList42;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder37.skipInitialImport(true);
        java.lang.Object obj46 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter48 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str49 = serializedObjectSupporter48.deserializeObjectString15();
        java.lang.String str50 = serializedObjectSupporter48.deserializeObjectString6();
        java.lang.String str51 = serializedObjectSupporter48.deserializeObjectString2();
        java.lang.String str52 = serializedObjectSupporter48.deserializeObjectString7();
        java.lang.String str53 = serializedObjectSupporter48.deserializeObjectString18();
        docScoreSearchScript0.setNextVar("mongodb-1638820218387", (java.lang.Object) serializedObjectSupporter48);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (short) -1);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("disable_index_refresh", "mongodb-1638820218449");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        docScoreSearchScript0.setNextScore((float) '4');
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter9 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString15();
        java.lang.String str11 = serializedObjectSupporter9.deserializeObjectString6();
        java.lang.String str12 = serializedObjectSupporter9.deserializeObjectString9();
        org.elasticsearch.river.RiverSettings riverSettings13 = serializedObjectSupporter9.deserializeObjectRiverSettings9();
        java.lang.String str14 = serializedObjectSupporter9.deserializeObjectString3();
        java.lang.String str15 = serializedObjectSupporter9.deserializeObjectString11();
        java.lang.String str16 = serializedObjectSupporter9.deserializeObjectString5();
        docScoreSearchScript0.setNextVar("localhost", (java.lang.Object) str16);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet21 = builder20.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder22.advancedTransformation(false);
        builder22.mongoAdminPassword = "name";
        java.lang.String str27 = builder22.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet31 = builder30.parentTypes;
        boolean boolean32 = builder30.skipInitialImport;
        java.lang.String[] strArray63 = new java.lang.String[] { "disable_index_refresh", "port", "secondary_read_preference", "import_all_collections", "bulk_timeout", "type", "script", "mongodb-1638820218449", "options", "gridfs", "port", "throttle_size", "ssl", "concurrent_bulk_requests", "hi!", "advanced_transformation", "bulk_size", "local", "name", "exclude_fields", "import_all_collections", "script_type", "socket_timeout", "type", "store_statistics", "store_statistics", "servers", "localhost", "ssl", "ssl_verify_certificate" };
        java.util.LinkedHashSet<java.lang.String> strSet64 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet64, strArray63);
        builder30.setincludeFields((java.util.Set<java.lang.String>) strSet64);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder67 = builder22.includeFields((java.util.Set<java.lang.String>) strSet64);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder68 = builder20.excludeFields((java.util.Set<java.lang.String>) strSet64);
        java.lang.String str69 = builder20.getindexName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder71 = builder20.mongoGridFS(false);
        builder20.setdisableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder74 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder76 = builder74.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet77 = builder76.parentTypes;
        boolean boolean78 = builder76.skipInitialImport;
        int int79 = builder76.getsocketTimeout();
        java.util.Set<java.lang.String> strSet80 = builder76.excludeFields;
        com.mongodb.BasicDBObject basicDBObject81 = builder76.getmongoCollectionFilter();
        builder20.setmongoCollectionFilter(basicDBObject81);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject81);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        java.lang.Object obj7 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        docScoreSearchScript0.setNextScore((float) (byte) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.advancedTransformation(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory14 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject16 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript17 = docScoreNativeScriptFactory14.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject16);
        builder11.setmongoCollectionFilter(basicDBObject16);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder11.mongoDb("mongodb-1638820218387");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.advancedTransformation(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory24 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject26 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript27 = docScoreNativeScriptFactory24.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject26);
        builder21.setmongoCollectionFilter(basicDBObject26);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder21.mongoDb("mongodb-1638820218387");
        java.lang.String[] strArray36 = new java.lang.String[] { "throttle_size", "", "db", "db", "local" };
        java.util.LinkedHashSet<java.lang.String> strSet37 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet37, strArray36);
        builder21.setparentTypes((java.util.Set<java.lang.String>) strSet37);
        builder20.parentTypes = strSet37;
        com.mongodb.BasicDBObject basicDBObject41 = builder20.mongoCollectionFilter;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder20.importAllCollections(true);
        builder43.setmongoGridFS(false);
        boolean boolean46 = builder43.getadvancedTransformation();
        docScoreSearchScript0.setNextVar("mongodb-1638820218449", (java.lang.Object) builder43);
        docScoreSearchScript0.setNextScore((float) (short) -1);
        docScoreSearchScript0.setNextScore((float) (-1));
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder52.advancedTransformation(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory55 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject57 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript58 = docScoreNativeScriptFactory55.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject57);
        builder52.setmongoCollectionFilter(basicDBObject57);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = builder52.mongoDb("mongodb-1638820218387");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder64 = builder62.advancedTransformation(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory65 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject67 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript68 = docScoreNativeScriptFactory65.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject67);
        builder62.setmongoCollectionFilter(basicDBObject67);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder71 = builder62.mongoDb("mongodb-1638820218387");
        java.lang.String[] strArray77 = new java.lang.String[] { "throttle_size", "", "db", "db", "local" };
        java.util.LinkedHashSet<java.lang.String> strSet78 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet78, strArray77);
        builder62.setparentTypes((java.util.Set<java.lang.String>) strSet78);
        builder61.parentTypes = strSet78;
        com.mongodb.BasicDBObject basicDBObject82 = builder61.mongoCollectionFilter;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder84 = builder61.importAllCollections(true);
        builder84.setmongoGridFS(false);
        boolean boolean87 = builder84.getadvancedTransformation();
        boolean boolean88 = builder84.getimportAllCollections();
        boolean boolean89 = builder84.getmongoUseSSL();
        java.lang.Object obj90 = docScoreSearchScript0.unwrap((java.lang.Object) boolean89);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float91 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        java.lang.Object obj7 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        docScoreSearchScript0.setNextScore((float) (byte) 100);
        java.lang.Object obj11 = docScoreSearchScript0.unwrap((java.lang.Object) (-1));
        docScoreSearchScript0.setNextScore((float) 27017);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder14.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet17 = builder16.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder16.mongoCollection("size");
        builder19.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder19);
        java.lang.String str23 = mongoDBRiverDefinition22.getTypeName();
        java.util.List<com.mongodb.ServerAddress> serverAddressList24 = mongoDBRiverDefinition22.getMongoServers();
        java.lang.Object obj25 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(0);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        java.lang.Object obj7 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        docScoreSearchScript0.setNextScore((float) (byte) 100);
        java.lang.Object obj11 = docScoreSearchScript0.unwrap((java.lang.Object) (-1));
        docScoreSearchScript0.setNextScore((-1.0f));
        docScoreSearchScript0.setNextScore((float) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float16 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("_river", "include_fields");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        java.lang.Object obj7 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        docScoreSearchScript0.setNextScore((float) (byte) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet13 = builder10.includeFields;
        boolean boolean14 = builder10.getmongoGridFS();
        java.util.Set<java.lang.String> strSet15 = builder10.parentTypes;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder10.advancedTransformation(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.advancedTransformation(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory21 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject23 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript24 = docScoreNativeScriptFactory21.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject23);
        builder18.setmongoCollectionFilter(basicDBObject23);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder18.mongoDb("mongodb-1638820218387");
        java.lang.String[] strArray33 = new java.lang.String[] { "throttle_size", "", "db", "db", "local" };
        java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        builder18.setparentTypes((java.util.Set<java.lang.String>) strSet34);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder10.parentTypes((java.util.Set<java.lang.String>) strSet34);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder38.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet41 = builder40.parentTypes;
        java.util.List<com.mongodb.ServerAddress> serverAddressList42 = builder40.mongoServers;
        builder37.mongoServers = serverAddressList42;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder37.skipInitialImport(true);
        java.lang.Object obj46 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter48 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str49 = serializedObjectSupporter48.deserializeObjectString15();
        java.lang.String str50 = serializedObjectSupporter48.deserializeObjectString6();
        java.lang.String str51 = serializedObjectSupporter48.deserializeObjectString2();
        java.lang.String str52 = serializedObjectSupporter48.deserializeObjectString7();
        java.lang.String str53 = serializedObjectSupporter48.deserializeObjectString18();
        docScoreSearchScript0.setNextVar("mongodb-1638820218387", (java.lang.Object) serializedObjectSupporter48);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(0);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        java.lang.Object obj7 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        docScoreSearchScript0.setNextScore((float) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long10 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        docScoreSearchScript0.setNextScore((float) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long8 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        java.lang.Object obj7 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet11 = builder10.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder10.mongoCollection("size");
        builder13.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder13);
        java.lang.String str17 = mongoDBRiverDefinition16.getTHROTTLE_SIZE_FIELD();
        java.lang.String str18 = mongoDBRiverDefinition16.getGRIDFS_FIELD();
        java.lang.String str19 = mongoDBRiverDefinition16.getINITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD();
        java.lang.String str20 = mongoDBRiverDefinition16.getPORT_FIELD();
        int int21 = mongoDBRiverDefinition16.throttleSize;
        com.mongodb.BasicDBObject basicDBObject22 = mongoDBRiverDefinition16.mongoCollectionFilter;
        java.lang.Object obj23 = docScoreSearchScript0.unwrap((java.lang.Object) basicDBObject22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long24 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        java.lang.Object obj7 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        docScoreSearchScript0.setNextScore((float) (byte) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.advancedTransformation(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory14 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject16 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript17 = docScoreNativeScriptFactory14.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject16);
        builder11.setmongoCollectionFilter(basicDBObject16);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder11.mongoDb("mongodb-1638820218387");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.advancedTransformation(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory24 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject26 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript27 = docScoreNativeScriptFactory24.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject26);
        builder21.setmongoCollectionFilter(basicDBObject26);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder21.mongoDb("mongodb-1638820218387");
        java.lang.String[] strArray36 = new java.lang.String[] { "throttle_size", "", "db", "db", "local" };
        java.util.LinkedHashSet<java.lang.String> strSet37 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet37, strArray36);
        builder21.setparentTypes((java.util.Set<java.lang.String>) strSet37);
        builder20.parentTypes = strSet37;
        com.mongodb.BasicDBObject basicDBObject41 = builder20.mongoCollectionFilter;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder20.importAllCollections(true);
        builder43.setmongoGridFS(false);
        boolean boolean46 = builder43.getadvancedTransformation();
        docScoreSearchScript0.setNextVar("mongodb-1638820218449", (java.lang.Object) builder43);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder49.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet52 = builder51.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder51.mongoCollection("size");
        builder54.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition57 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder54);
        java.lang.String str58 = mongoDBRiverDefinition57.getTHROTTLE_SIZE_FIELD();
        java.lang.String str59 = mongoDBRiverDefinition57.getADMIN_DB_FIELD();
        boolean boolean60 = mongoDBRiverDefinition57.mongoSecondaryReadPreference;
        java.lang.String str61 = mongoDBRiverDefinition57.getDROP_COLLECTION_FIELD();
        java.util.Set<java.lang.String> strSet62 = mongoDBRiverDefinition57.excludeFields;
        java.lang.String str63 = mongoDBRiverDefinition57.getPARENT_TYPES_FIELD();
        java.lang.String str64 = mongoDBRiverDefinition57.getACTIONS_FIELD();
        boolean boolean65 = mongoDBRiverDefinition57.getmongoSecondaryReadPreference();
        docScoreSearchScript0.setNextVar("connect_timeout", (java.lang.Object) boolean65);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float67 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        java.lang.Object obj7 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        docScoreSearchScript0.setNextScore((float) (byte) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.advancedTransformation(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory14 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject16 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript17 = docScoreNativeScriptFactory14.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject16);
        builder11.setmongoCollectionFilter(basicDBObject16);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder11.mongoDb("mongodb-1638820218387");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.advancedTransformation(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory24 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject26 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript27 = docScoreNativeScriptFactory24.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject26);
        builder21.setmongoCollectionFilter(basicDBObject26);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder21.mongoDb("mongodb-1638820218387");
        java.lang.String[] strArray36 = new java.lang.String[] { "throttle_size", "", "db", "db", "local" };
        java.util.LinkedHashSet<java.lang.String> strSet37 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet37, strArray36);
        builder21.setparentTypes((java.util.Set<java.lang.String>) strSet37);
        builder20.parentTypes = strSet37;
        com.mongodb.BasicDBObject basicDBObject41 = builder20.mongoCollectionFilter;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder20.importAllCollections(true);
        builder43.setmongoGridFS(false);
        boolean boolean46 = builder43.getadvancedTransformation();
        docScoreSearchScript0.setNextVar("mongodb-1638820218449", (java.lang.Object) builder43);
        docScoreSearchScript0.setNextScore((float) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double50 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet9 = builder8.parentTypes;
        builder8.indexName = "disable_index_refresh";
        builder8.setriverName("ssl_verify_certificate");
        builder8.setmongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = builder8.initialTimestamp;
        builder8.riverIndexName = "db";
        docScoreSearchScript0.setNextVar("null.size", (java.lang.Object) builder8);
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        docScoreSearchScript0.setNextScore((-1.0f));
        docScoreSearchScript0.setNextScore((float) 0L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (short) 1);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        docScoreSearchScript0.setNextVar("advanced_transformation", (java.lang.Object) "filter");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet10 = builder9.parentTypes;
        boolean boolean11 = builder9.skipInitialImport;
        com.mongodb.MongoClientOptions mongoClientOptions12 = builder9.getmongoClientOptions();
        builder9.indexName = "servers";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder9.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.advancedTransformation(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory20 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject22 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript23 = docScoreNativeScriptFactory20.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject22);
        builder17.setmongoCollectionFilter(basicDBObject22);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder17.mongoDb("mongodb-1638820218387");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.advancedTransformation(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory30 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject32 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript33 = docScoreNativeScriptFactory30.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject32);
        builder27.setmongoCollectionFilter(basicDBObject32);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder27.mongoDb("mongodb-1638820218387");
        java.lang.String[] strArray42 = new java.lang.String[] { "throttle_size", "", "db", "db", "local" };
        java.util.LinkedHashSet<java.lang.String> strSet43 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet43, strArray42);
        builder27.setparentTypes((java.util.Set<java.lang.String>) strSet43);
        builder26.parentTypes = strSet43;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder16.excludeFields((java.util.Set<java.lang.String>) strSet43);
        java.lang.String str48 = builder47.getscript();
        java.lang.String str49 = builder47.indexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder47.socketTimeout((int) ' ');
        docScoreSearchScript0.setNextVar("password", (java.lang.Object) builder51);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder53.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet56 = builder55.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = builder55.mongoCollection("size");
        int int59 = builder55.getsocketTimeout();
        builder55.setmongoSecondaryReadPreference(false);
        builder55.setskipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder65 = builder55.mongoDb("concurrent_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder66 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder68 = builder66.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet69 = builder68.parentTypes;
        builder68.indexName = "disable_index_refresh";
        builder68.setriverName("ssl_verify_certificate");
        builder68.setmongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp76 = builder68.initialTimestamp;
        builder68.riverIndexName = "db";
        com.mongodb.BasicDBObject basicDBObject79 = builder68.mongoCollectionFilter;
        builder65.setmongoOplogFilter(basicDBObject79);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject79);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        docScoreSearchScript0.setNextScore((float) '4');
        docScoreSearchScript0.setNextScore((float) (-1L));
        docScoreSearchScript0.setNextScore((float) 8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj12 = docScoreSearchScript0.run();
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        docScoreSearchScript0.setNextScore((float) 0);
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj7 = docScoreSearchScript0.run();
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("parent_types", "null.size");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        java.lang.Object obj7 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        docScoreSearchScript0.setNextScore((float) (byte) 100);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript11 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("include_fields", (java.lang.Object) docScoreSearchScript11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long13 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        docScoreSearchScript0.setNextScore((float) '4');
        docScoreSearchScript0.setNextScore((float) (-1L));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(27017);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        docScoreSearchScript0.setNextVar("advanced_transformation", (java.lang.Object) "filter");
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        docScoreSearchScript0.setNextScore((float) 'a');
        docScoreSearchScript0.setNextScore((float) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double12 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (byte) 0);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        docScoreSearchScript0.setNextVar("advanced_transformation", (java.lang.Object) "filter");
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (short) 100);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet9 = builder8.parentTypes;
        builder8.indexName = "disable_index_refresh";
        builder8.setriverName("ssl_verify_certificate");
        builder8.setmongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = builder8.initialTimestamp;
        builder8.riverIndexName = "db";
        docScoreSearchScript0.setNextVar("null.size", (java.lang.Object) builder8);
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double22 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        docScoreSearchScript0.setNextVar("advanced_transformation", (java.lang.Object) "filter");
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((-1));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        docScoreSearchScript0.setNextVar("advanced_transformation", (java.lang.Object) "filter");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet10 = builder9.parentTypes;
        boolean boolean11 = builder9.skipInitialImport;
        com.mongodb.MongoClientOptions mongoClientOptions12 = builder9.getmongoClientOptions();
        builder9.indexName = "servers";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder9.disableIndexRefresh(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder17.advancedTransformation(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory20 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject22 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript23 = docScoreNativeScriptFactory20.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject22);
        builder17.setmongoCollectionFilter(basicDBObject22);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder17.mongoDb("mongodb-1638820218387");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.advancedTransformation(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory30 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject32 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript33 = docScoreNativeScriptFactory30.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject32);
        builder27.setmongoCollectionFilter(basicDBObject32);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder27.mongoDb("mongodb-1638820218387");
        java.lang.String[] strArray42 = new java.lang.String[] { "throttle_size", "", "db", "db", "local" };
        java.util.LinkedHashSet<java.lang.String> strSet43 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet43, strArray42);
        builder27.setparentTypes((java.util.Set<java.lang.String>) strSet43);
        builder26.parentTypes = strSet43;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder16.excludeFields((java.util.Set<java.lang.String>) strSet43);
        java.lang.String str48 = builder47.getscript();
        java.lang.String str49 = builder47.indexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder47.socketTimeout((int) ' ');
        docScoreSearchScript0.setNextVar("password", (java.lang.Object) builder51);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj53 = docScoreSearchScript0.run();
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        java.lang.Object obj7 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter9 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString11();
        org.elasticsearch.river.RiverSettings riverSettings11 = serializedObjectSupporter9.deserializeObjectRiverSettings2();
        java.lang.String str12 = serializedObjectSupporter9.deserializeObjectString9();
        java.lang.String str13 = serializedObjectSupporter9.deserializeObjectString9();
        java.lang.String str14 = serializedObjectSupporter9.deserializeObjectString4();
        docScoreSearchScript0.setNextVar("credentials", (java.lang.Object) str14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (short) -1);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        docScoreSearchScript0.setNextScore((float) 1L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double7 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        java.lang.Object obj7 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        docScoreSearchScript0.setNextScore((float) (byte) 100);
        java.lang.Object obj11 = docScoreSearchScript0.unwrap((java.lang.Object) (-1));
        docScoreSearchScript0.setNextScore((-1.0f));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long14 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        docScoreSearchScript0.setNextScore((float) 1L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float7 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        docScoreSearchScript0.setNextScore((float) '4');
        docScoreSearchScript0.setNextScore((float) '4');
        docScoreSearchScript0.setNextScore((float) 1000);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(0);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        docScoreSearchScript0.setNextVar("advanced_transformation", (java.lang.Object) "filter");
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        docScoreSearchScript0.setNextScore((float) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((-1));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        docScoreSearchScript0.setNextScore((float) 1L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((-1));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("exclude_fields", "drop_collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        docScoreSearchScript0.setNextScore((float) '4');
        docScoreSearchScript0.setNextScore((float) '4');
        docScoreSearchScript0.setNextScore((float) 1000);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double12 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        docScoreSearchScript0.setNextScore((float) '4');
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter9 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString11();
        java.lang.String str11 = serializedObjectSupporter9.deserializeObjectString17();
        java.lang.String str12 = serializedObjectSupporter9.deserializeObjectString7();
        java.lang.String str13 = serializedObjectSupporter9.deserializeObjectString7();
        java.lang.String str14 = serializedObjectSupporter9.deserializeObjectString8();
        java.lang.String str15 = serializedObjectSupporter9.deserializeObjectString16();
        org.elasticsearch.river.RiverSettings riverSettings16 = serializedObjectSupporter9.deserializeObjectRiverSettings9();
        java.lang.String str17 = serializedObjectSupporter9.deserializeObjectString5();
        java.lang.String str18 = serializedObjectSupporter9.deserializeObjectString12();
        java.lang.String str19 = serializedObjectSupporter9.deserializeObjectString10();
        java.lang.String str20 = serializedObjectSupporter9.deserializeObjectString14();
        org.elasticsearch.river.RiverSettings riverSettings21 = serializedObjectSupporter9.deserializeObjectRiverSettings3();
        org.elasticsearch.river.RiverSettings riverSettings22 = serializedObjectSupporter9.deserializeObjectRiverSettings5();
        docScoreSearchScript0.setNextVar("filter", (java.lang.Object) serializedObjectSupporter9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(32);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        docScoreSearchScript0.setNextScore((float) 1L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long7 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        java.lang.Object obj7 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet11 = builder10.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder10.mongoCollection("size");
        builder13.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder13);
        java.lang.String str17 = mongoDBRiverDefinition16.getTHROTTLE_SIZE_FIELD();
        java.lang.String str18 = mongoDBRiverDefinition16.getGRIDFS_FIELD();
        java.lang.String str19 = mongoDBRiverDefinition16.getINITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD();
        java.lang.String str20 = mongoDBRiverDefinition16.getPORT_FIELD();
        int int21 = mongoDBRiverDefinition16.throttleSize;
        com.mongodb.BasicDBObject basicDBObject22 = mongoDBRiverDefinition16.mongoCollectionFilter;
        java.lang.Object obj23 = docScoreSearchScript0.unwrap((java.lang.Object) basicDBObject22);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder24.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet27 = builder24.includeFields;
        boolean boolean28 = builder24.getmongoGridFS();
        builder24.setdropCollection(false);
        java.lang.Object obj31 = docScoreSearchScript0.unwrap((java.lang.Object) builder24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj32 = docScoreSearchScript0.run();
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        docScoreSearchScript0.setNextVar("advanced_transformation", (java.lang.Object) "filter");
        docScoreSearchScript0.setNextScore((float) 1L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float8 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        java.lang.Object obj7 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        docScoreSearchScript0.setNextScore((float) (byte) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet13 = builder10.includeFields;
        boolean boolean14 = builder10.getmongoGridFS();
        java.util.Set<java.lang.String> strSet15 = builder10.parentTypes;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder10.advancedTransformation(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.advancedTransformation(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory21 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject23 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript24 = docScoreNativeScriptFactory21.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject23);
        builder18.setmongoCollectionFilter(basicDBObject23);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder18.mongoDb("mongodb-1638820218387");
        java.lang.String[] strArray33 = new java.lang.String[] { "throttle_size", "", "db", "db", "local" };
        java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        builder18.setparentTypes((java.util.Set<java.lang.String>) strSet34);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder10.parentTypes((java.util.Set<java.lang.String>) strSet34);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder38.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet41 = builder40.parentTypes;
        java.util.List<com.mongodb.ServerAddress> serverAddressList42 = builder40.mongoServers;
        builder37.mongoServers = serverAddressList42;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder37.skipInitialImport(true);
        java.lang.Object obj46 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        docScoreSearchScript0.setNextScore((float) 1L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (short) 0);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet9 = builder8.parentTypes;
        builder8.indexName = "disable_index_refresh";
        builder8.setriverName("ssl_verify_certificate");
        builder8.setmongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = builder8.initialTimestamp;
        builder8.riverIndexName = "db";
        builder8.setscript("db");
        docScoreSearchScript0.setNextVar("user", (java.lang.Object) "db");
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue23 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DEFAULT_BULK_SIZE;
        docScoreSearchScript0.setNextVar("script_type", (java.lang.Object) byteSizeValue23);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder25.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet28 = builder27.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder27.mongoCollection("size");
        int int31 = builder27.getsocketTimeout();
        builder27.setmongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet37 = builder36.parentTypes;
        java.util.List<com.mongodb.ServerAddress> serverAddressList38 = builder36.mongoServers;
        builder27.setmongoServers(serverAddressList38);
        builder27.setthrottleSize(0);
        boolean boolean42 = builder27.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder27.disableIndexRefresh(false);
        builder27.setriverIndexName("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder27.indexName("exclude_fields");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder48.typeName("bulk");
        java.lang.Object obj51 = docScoreSearchScript0.unwrap((java.lang.Object) builder48);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double52 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long3 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet9 = builder8.parentTypes;
        builder8.indexName = "disable_index_refresh";
        builder8.setriverName("ssl_verify_certificate");
        builder8.setmongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = builder8.initialTimestamp;
        builder8.riverIndexName = "db";
        docScoreSearchScript0.setNextVar("null.size", (java.lang.Object) builder8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long20 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        java.lang.Object obj7 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        docScoreSearchScript0.setNextScore((float) (byte) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.advancedTransformation(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory14 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject16 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript17 = docScoreNativeScriptFactory14.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject16);
        builder11.setmongoCollectionFilter(basicDBObject16);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder11.mongoDb("mongodb-1638820218387");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.advancedTransformation(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory24 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject26 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript27 = docScoreNativeScriptFactory24.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject26);
        builder21.setmongoCollectionFilter(basicDBObject26);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder21.mongoDb("mongodb-1638820218387");
        java.lang.String[] strArray36 = new java.lang.String[] { "throttle_size", "", "db", "db", "local" };
        java.util.LinkedHashSet<java.lang.String> strSet37 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet37, strArray36);
        builder21.setparentTypes((java.util.Set<java.lang.String>) strSet37);
        builder20.parentTypes = strSet37;
        com.mongodb.BasicDBObject basicDBObject41 = builder20.mongoCollectionFilter;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder20.importAllCollections(true);
        builder43.setmongoGridFS(false);
        boolean boolean46 = builder43.getadvancedTransformation();
        docScoreSearchScript0.setNextVar("mongodb-1638820218449", (java.lang.Object) builder43);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder49.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet52 = builder51.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder51.mongoCollection("size");
        builder54.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition57 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder54);
        java.lang.String str58 = mongoDBRiverDefinition57.getTHROTTLE_SIZE_FIELD();
        java.lang.String str59 = mongoDBRiverDefinition57.getADMIN_DB_FIELD();
        boolean boolean60 = mongoDBRiverDefinition57.mongoSecondaryReadPreference;
        java.lang.String str61 = mongoDBRiverDefinition57.getDROP_COLLECTION_FIELD();
        java.util.Set<java.lang.String> strSet62 = mongoDBRiverDefinition57.excludeFields;
        java.lang.String str63 = mongoDBRiverDefinition57.getPARENT_TYPES_FIELD();
        java.lang.String str64 = mongoDBRiverDefinition57.getACTIONS_FIELD();
        boolean boolean65 = mongoDBRiverDefinition57.getmongoSecondaryReadPreference();
        docScoreSearchScript0.setNextVar("connect_timeout", (java.lang.Object) boolean65);
        com.mongodb.BasicDBObject basicDBObject68 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject68);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        docScoreSearchScript0.setNextScore((float) '4');
        docScoreSearchScript0.setNextScore((float) '4');
        docScoreSearchScript0.setNextScore((float) 1000);
        docScoreSearchScript0.setNextScore((float) (-1L));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double14 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("host", "admin");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        docScoreSearchScript0.setNextScore((float) 0L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj5 = docScoreSearchScript0.run();
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("size", "null.size");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        docScoreSearchScript0.setNextVar("advanced_transformation", (java.lang.Object) "filter");
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        docScoreSearchScript0.setNextScore((float) 'a');
        docScoreSearchScript0.setNextScore((float) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(8);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        docScoreSearchScript0.setNextScore((float) '4');
        docScoreSearchScript0.setNextScore((float) (-1L));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long10 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "mongodb-1638820218326");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        java.lang.Object obj7 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet11 = builder10.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder10.mongoCollection("size");
        int int14 = builder10.getsocketTimeout();
        builder10.settypeName("initial_timestamp");
        builder10.setriverName("size");
        java.util.Set<java.lang.String> strSet19 = builder10.excludeFields;
        java.lang.String str20 = builder10.getmongoDb();
        boolean boolean21 = builder10.getimportAllCollections();
        com.mongodb.BasicDBObject basicDBObject23 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder10.mongoOplogFilter(basicDBObject23);
        builder24.setmongoAdminUser("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder24.script("initial_timestamp");
        builder28.setsocketTimeout((int) (short) -1);
        com.mongodb.BasicDBObject basicDBObject31 = builder28.getmongoCollectionFilter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject31);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        docScoreSearchScript0.setNextScore((float) (byte) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.advancedTransformation(false);
        builder9.mongoAdminPassword = "name";
        boolean boolean14 = builder9.mongoSecondaryReadPreference;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory15 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject17 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript18 = docScoreNativeScriptFactory15.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject17);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory19 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject21 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript22 = docScoreNativeScriptFactory19.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject21);
        com.mongodb.BasicDBObject basicDBObject24 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript25 = docScoreNativeScriptFactory19.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject24);
        org.elasticsearch.script.ExecutableScript executableScript26 = docScoreNativeScriptFactory15.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject24);
        builder9.setmongoCollectionFilter(basicDBObject24);
        builder9.mongoLocalPassword = "initial_timestamp";
        java.util.List<com.mongodb.ServerAddress> serverAddressList30 = builder9.mongoServers;
        java.lang.String str31 = builder9.statisticsIndexName;
        boolean boolean32 = builder9.getadvancedTransformation();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder9.riverIndexName("gridfs");
        docScoreSearchScript0.setNextVar("credentials", (java.lang.Object) builder34);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder36.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet39 = builder38.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder38.mongoCollection("size");
        builder38.setscript("index");
        java.lang.Object obj44 = docScoreSearchScript0.unwrap((java.lang.Object) "index");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double45 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        docScoreSearchScript0.setNextVar("advanced_transformation", (java.lang.Object) "filter");
        docScoreSearchScript0.setNextScore((float) 100L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) '4');
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        java.lang.Object obj7 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double8 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218264", "size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        java.lang.Object obj7 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        docScoreSearchScript0.setNextScore((float) (byte) 100);
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript11 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextVar("include_fields", (java.lang.Object) docScoreSearchScript11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float13 = docScoreSearchScript11.runAsFloat();
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        docScoreSearchScript0.setNextVar("advanced_transformation", (java.lang.Object) "filter");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = builder7.advancedTransformation(false);
        builder7.mongoAdminPassword = "name";
        java.lang.String str12 = builder7.mongoCollection;
        java.util.Set<java.lang.String> strSet13 = builder7.includeFields;
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp14 = builder7.getinitialTimestamp();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet18 = builder15.includeFields;
        boolean boolean19 = builder15.getmongoGridFS();
        java.util.Set<java.lang.String> strSet20 = builder15.parentTypes;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder15.advancedTransformation(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.advancedTransformation(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory26 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject28 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript29 = docScoreNativeScriptFactory26.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject28);
        builder23.setmongoCollectionFilter(basicDBObject28);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder23.mongoDb("mongodb-1638820218387");
        java.lang.String[] strArray38 = new java.lang.String[] { "throttle_size", "", "db", "db", "local" };
        java.util.LinkedHashSet<java.lang.String> strSet39 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet39, strArray38);
        builder23.setparentTypes((java.util.Set<java.lang.String>) strSet39);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder15.parentTypes((java.util.Set<java.lang.String>) strSet39);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder7.includeFields((java.util.Set<java.lang.String>) strSet39);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter44 = builder7.serializedObjectSupporter;
        docScoreSearchScript0.setNextVar("initial_timestamp", (java.lang.Object) builder7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (short) 0);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        java.lang.Object obj7 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        docScoreSearchScript0.setNextScore((float) (byte) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.advancedTransformation(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory14 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject16 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript17 = docScoreNativeScriptFactory14.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject16);
        builder11.setmongoCollectionFilter(basicDBObject16);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder11.mongoDb("mongodb-1638820218387");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.advancedTransformation(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory24 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject26 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript27 = docScoreNativeScriptFactory24.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject26);
        builder21.setmongoCollectionFilter(basicDBObject26);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder21.mongoDb("mongodb-1638820218387");
        java.lang.String[] strArray36 = new java.lang.String[] { "throttle_size", "", "db", "db", "local" };
        java.util.LinkedHashSet<java.lang.String> strSet37 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet37, strArray36);
        builder21.setparentTypes((java.util.Set<java.lang.String>) strSet37);
        builder20.parentTypes = strSet37;
        com.mongodb.BasicDBObject basicDBObject41 = builder20.mongoCollectionFilter;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder20.importAllCollections(true);
        builder43.setmongoGridFS(false);
        boolean boolean46 = builder43.getadvancedTransformation();
        docScoreSearchScript0.setNextVar("mongodb-1638820218449", (java.lang.Object) builder43);
        docScoreSearchScript0.setNextScore((float) (short) -1);
        docScoreSearchScript0.setNextScore((float) (-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (byte) -1);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet9 = builder8.parentTypes;
        builder8.indexName = "disable_index_refresh";
        builder8.setriverName("ssl_verify_certificate");
        builder8.setmongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = builder8.initialTimestamp;
        builder8.riverIndexName = "db";
        builder8.setscript("db");
        docScoreSearchScript0.setNextVar("user", (java.lang.Object) "db");
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue23 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DEFAULT_BULK_SIZE;
        docScoreSearchScript0.setNextVar("script_type", (java.lang.Object) byteSizeValue23);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj25 = docScoreSearchScript0.run();
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        docScoreSearchScript0.setNextVar("advanced_transformation", (java.lang.Object) "filter");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet9 = builder8.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder8.mongoCollection("size");
        int int12 = builder8.getsocketTimeout();
        builder8.settypeName("initial_timestamp");
        builder8.setriverName("size");
        java.util.Set<java.lang.String> strSet17 = builder8.excludeFields;
        java.lang.String str18 = builder8.getmongoDb();
        boolean boolean19 = builder8.getimportAllCollections();
        com.mongodb.BasicDBObject basicDBObject21 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder8.mongoOplogFilter(basicDBObject21);
        java.util.Set<java.lang.String> strSet23 = builder8.excludeFields;
        builder8.setriverIndexName("bulk_size");
        java.lang.Object obj26 = docScoreSearchScript0.unwrap((java.lang.Object) "bulk_size");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long27 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        docScoreSearchScript0.setNextScore((float) '4');
        docScoreSearchScript0.setNextScore((float) (-1L));
        docScoreSearchScript0.setNextScore((float) 8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (byte) -1);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218449", "db");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        docScoreSearchScript0.setNextVar("advanced_transformation", (java.lang.Object) "filter");
        docScoreSearchScript0.setNextScore((float) 100L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet12 = builder11.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder14 = builder11.mongoCollection("size");
        builder14.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder14);
        java.lang.String str18 = mongoDBRiverDefinition17.getTHROTTLE_SIZE_FIELD();
        java.lang.String str19 = mongoDBRiverDefinition17.getADMIN_DB_FIELD();
        boolean boolean20 = mongoDBRiverDefinition17.mongoSecondaryReadPreference;
        java.lang.String str21 = mongoDBRiverDefinition17.getDROP_COLLECTION_FIELD();
        java.util.Set<java.lang.String> strSet22 = mongoDBRiverDefinition17.excludeFields;
        boolean boolean23 = mongoDBRiverDefinition17.isMongoGridFS();
        boolean boolean24 = mongoDBRiverDefinition17.isStoreStatistics();
        java.lang.String str25 = mongoDBRiverDefinition17.getCOLLECTION_FIELD();
        java.lang.String str26 = mongoDBRiverDefinition17.mongoAdminPassword;
        boolean boolean27 = mongoDBRiverDefinition17.isMongoGridFS();
        boolean boolean28 = mongoDBRiverDefinition17.getmongoSecondaryReadPreference();
        java.lang.String str29 = mongoDBRiverDefinition17.getOPTIONS_FIELD();
        docScoreSearchScript0.setNextVar("", (java.lang.Object) str29);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float31 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        java.lang.Object obj7 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        docScoreSearchScript0.setNextScore((float) (byte) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.advancedTransformation(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory14 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject16 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript17 = docScoreNativeScriptFactory14.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject16);
        builder11.setmongoCollectionFilter(basicDBObject16);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder11.mongoDb("mongodb-1638820218387");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.advancedTransformation(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory24 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject26 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript27 = docScoreNativeScriptFactory24.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject26);
        builder21.setmongoCollectionFilter(basicDBObject26);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder21.mongoDb("mongodb-1638820218387");
        java.lang.String[] strArray36 = new java.lang.String[] { "throttle_size", "", "db", "db", "local" };
        java.util.LinkedHashSet<java.lang.String> strSet37 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet37, strArray36);
        builder21.setparentTypes((java.util.Set<java.lang.String>) strSet37);
        builder20.parentTypes = strSet37;
        com.mongodb.BasicDBObject basicDBObject41 = builder20.mongoCollectionFilter;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder20.importAllCollections(true);
        builder43.setmongoGridFS(false);
        boolean boolean46 = builder43.getadvancedTransformation();
        docScoreSearchScript0.setNextVar("mongodb-1638820218449", (java.lang.Object) builder43);
        docScoreSearchScript0.setNextScore((float) (short) -1);
        docScoreSearchScript0.setNextScore((float) (-1));
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory52 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject54 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript55 = docScoreNativeScriptFactory52.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject54);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory56 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject58 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript59 = docScoreNativeScriptFactory56.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject58);
        com.mongodb.BasicDBObject basicDBObject61 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript62 = docScoreNativeScriptFactory56.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject61);
        org.elasticsearch.script.ExecutableScript executableScript63 = docScoreNativeScriptFactory52.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject61);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject61);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet9 = builder8.parentTypes;
        builder8.indexName = "disable_index_refresh";
        builder8.setriverName("ssl_verify_certificate");
        builder8.setmongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = builder8.initialTimestamp;
        builder8.riverIndexName = "db";
        docScoreSearchScript0.setNextVar("null.size", (java.lang.Object) builder8);
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        docScoreSearchScript0.setNextScore((-1.0f));
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextScore(0.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long28 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("_river", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        docScoreSearchScript0.setNextVar("advanced_transformation", (java.lang.Object) "filter");
        docScoreSearchScript0.setNextScore((float) 100L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.advancedTransformation(false);
        builder8.mongoAdminPassword = "name";
        boolean boolean13 = builder8.mongoSecondaryReadPreference;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory14 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject16 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript17 = docScoreNativeScriptFactory14.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject16);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory18 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject20 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript21 = docScoreNativeScriptFactory18.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject20);
        com.mongodb.BasicDBObject basicDBObject23 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript24 = docScoreNativeScriptFactory18.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject23);
        org.elasticsearch.script.ExecutableScript executableScript25 = docScoreNativeScriptFactory14.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject23);
        builder8.setmongoCollectionFilter(basicDBObject23);
        builder8.mongoLocalPassword = "initial_timestamp";
        java.util.List<com.mongodb.ServerAddress> serverAddressList29 = builder8.mongoServers;
        builder8.advancedTransformation = false;
        com.mongodb.BasicDBObject basicDBObject32 = builder8.getmongoCollectionFilter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject32);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        docScoreSearchScript0.setNextVar("advanced_transformation", (java.lang.Object) "filter");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet9 = builder8.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder8.mongoCollection("size");
        int int12 = builder8.getsocketTimeout();
        builder8.settypeName("initial_timestamp");
        builder8.setriverName("size");
        java.util.Set<java.lang.String> strSet17 = builder8.excludeFields;
        java.lang.String str18 = builder8.getmongoDb();
        boolean boolean19 = builder8.getimportAllCollections();
        com.mongodb.BasicDBObject basicDBObject21 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder8.mongoOplogFilter(basicDBObject21);
        java.util.Set<java.lang.String> strSet23 = builder8.excludeFields;
        builder8.setriverIndexName("bulk_size");
        java.lang.Object obj26 = docScoreSearchScript0.unwrap((java.lang.Object) "bulk_size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.advancedTransformation(false);
        builder27.mongoAdminPassword = "name";
        java.lang.String str32 = builder27.mongoCollection;
        java.util.Set<java.lang.String> strSet33 = builder27.includeFields;
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp34 = builder27.getinitialTimestamp();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder35 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder35.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet38 = builder37.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder39.advancedTransformation(false);
        builder39.mongoAdminPassword = "name";
        java.lang.String str44 = builder39.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder45.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet48 = builder47.parentTypes;
        boolean boolean49 = builder47.skipInitialImport;
        java.lang.String[] strArray80 = new java.lang.String[] { "disable_index_refresh", "port", "secondary_read_preference", "import_all_collections", "bulk_timeout", "type", "script", "mongodb-1638820218449", "options", "gridfs", "port", "throttle_size", "ssl", "concurrent_bulk_requests", "hi!", "advanced_transformation", "bulk_size", "local", "name", "exclude_fields", "import_all_collections", "script_type", "socket_timeout", "type", "store_statistics", "store_statistics", "servers", "localhost", "ssl", "ssl_verify_certificate" };
        java.util.LinkedHashSet<java.lang.String> strSet81 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet81, strArray80);
        builder47.setincludeFields((java.util.Set<java.lang.String>) strSet81);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder84 = builder39.includeFields((java.util.Set<java.lang.String>) strSet81);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder85 = builder37.excludeFields((java.util.Set<java.lang.String>) strSet81);
        builder27.includeFields = strSet81;
        builder27.setscript("advanced_transformation");
        com.mongodb.BasicDBObject basicDBObject89 = builder27.mongoCollectionFilter;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject89);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        java.lang.Object obj7 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter9 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString11();
        org.elasticsearch.river.RiverSettings riverSettings11 = serializedObjectSupporter9.deserializeObjectRiverSettings2();
        java.lang.String str12 = serializedObjectSupporter9.deserializeObjectString9();
        java.lang.String str13 = serializedObjectSupporter9.deserializeObjectString9();
        java.lang.String str14 = serializedObjectSupporter9.deserializeObjectString4();
        docScoreSearchScript0.setNextVar("credentials", (java.lang.Object) str14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float16 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        docScoreSearchScript0.setNextScore((float) (byte) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.advancedTransformation(false);
        builder9.mongoAdminPassword = "name";
        boolean boolean14 = builder9.mongoSecondaryReadPreference;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory15 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject17 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript18 = docScoreNativeScriptFactory15.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject17);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory19 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject21 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript22 = docScoreNativeScriptFactory19.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject21);
        com.mongodb.BasicDBObject basicDBObject24 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript25 = docScoreNativeScriptFactory19.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject24);
        org.elasticsearch.script.ExecutableScript executableScript26 = docScoreNativeScriptFactory15.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject24);
        builder9.setmongoCollectionFilter(basicDBObject24);
        builder9.mongoLocalPassword = "initial_timestamp";
        java.util.List<com.mongodb.ServerAddress> serverAddressList30 = builder9.mongoServers;
        java.lang.String str31 = builder9.statisticsIndexName;
        boolean boolean32 = builder9.getadvancedTransformation();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder9.riverIndexName("gridfs");
        docScoreSearchScript0.setNextVar("credentials", (java.lang.Object) builder34);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder36.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet39 = builder38.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder38.mongoCollection("size");
        builder38.setscript("index");
        java.lang.Object obj44 = docScoreSearchScript0.unwrap((java.lang.Object) "index");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder46.advancedTransformation(false);
        builder46.mongoAdminPassword = "name";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder46.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder46.mongoAdminPassword("index");
        java.lang.String str55 = builder54.mongoDb;
        builder54.setscriptType("user");
        boolean boolean58 = builder54.mongoGridFS;
        docScoreSearchScript0.setNextVar("collection", (java.lang.Object) boolean58);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj60 = docScoreSearchScript0.run();
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextScore((float) 1000);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float7 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "drop_collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        docScoreSearchScript0.setNextScore((float) 27017);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long7 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addPrefix("bulk", "null.size");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_timeout", "gridfs");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        docScoreSearchScript0.setNextVar("advanced_transformation", (java.lang.Object) "filter");
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float8 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        java.lang.Object obj7 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        docScoreSearchScript0.setNextScore((float) (byte) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder11.advancedTransformation(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory14 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject16 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript17 = docScoreNativeScriptFactory14.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject16);
        builder11.setmongoCollectionFilter(basicDBObject16);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder11.mongoDb("mongodb-1638820218387");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder21.advancedTransformation(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory24 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject26 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript27 = docScoreNativeScriptFactory24.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject26);
        builder21.setmongoCollectionFilter(basicDBObject26);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder21.mongoDb("mongodb-1638820218387");
        java.lang.String[] strArray36 = new java.lang.String[] { "throttle_size", "", "db", "db", "local" };
        java.util.LinkedHashSet<java.lang.String> strSet37 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet37, strArray36);
        builder21.setparentTypes((java.util.Set<java.lang.String>) strSet37);
        builder20.parentTypes = strSet37;
        com.mongodb.BasicDBObject basicDBObject41 = builder20.mongoCollectionFilter;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder20.importAllCollections(true);
        builder43.setmongoGridFS(false);
        boolean boolean46 = builder43.getadvancedTransformation();
        docScoreSearchScript0.setNextVar("mongodb-1638820218449", (java.lang.Object) builder43);
        docScoreSearchScript0.setNextScore((float) (short) -1);
        docScoreSearchScript0.setNextScore((float) (-1));
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder52.advancedTransformation(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory55 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject57 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript58 = docScoreNativeScriptFactory55.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject57);
        builder52.setmongoCollectionFilter(basicDBObject57);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = builder52.mongoDb("mongodb-1638820218387");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder64 = builder62.advancedTransformation(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory65 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject67 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript68 = docScoreNativeScriptFactory65.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject67);
        builder62.setmongoCollectionFilter(basicDBObject67);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder71 = builder62.mongoDb("mongodb-1638820218387");
        java.lang.String[] strArray77 = new java.lang.String[] { "throttle_size", "", "db", "db", "local" };
        java.util.LinkedHashSet<java.lang.String> strSet78 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet78, strArray77);
        builder62.setparentTypes((java.util.Set<java.lang.String>) strSet78);
        builder61.parentTypes = strSet78;
        com.mongodb.BasicDBObject basicDBObject82 = builder61.mongoCollectionFilter;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder84 = builder61.importAllCollections(true);
        builder84.setmongoGridFS(false);
        boolean boolean87 = builder84.getadvancedTransformation();
        boolean boolean88 = builder84.getimportAllCollections();
        boolean boolean89 = builder84.getmongoUseSSL();
        java.lang.Object obj90 = docScoreSearchScript0.unwrap((java.lang.Object) boolean89);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(0);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("options", "servers");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("mongodb-1638820218408", "initial_timestamp");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        docScoreSearchScript0.setNextScore((float) '4');
        docScoreSearchScript0.setNextScore((float) '4');
        docScoreSearchScript0.setNextScore((float) 1000);
        docScoreSearchScript0.setNextScore((float) 1L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj14 = docScoreSearchScript0.run();
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        docScoreSearchScript0.setNextScore((float) (byte) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.advancedTransformation(false);
        builder9.mongoAdminPassword = "name";
        boolean boolean14 = builder9.mongoSecondaryReadPreference;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory15 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject17 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript18 = docScoreNativeScriptFactory15.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject17);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory19 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject21 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript22 = docScoreNativeScriptFactory19.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject21);
        com.mongodb.BasicDBObject basicDBObject24 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript25 = docScoreNativeScriptFactory19.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject24);
        org.elasticsearch.script.ExecutableScript executableScript26 = docScoreNativeScriptFactory15.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject24);
        builder9.setmongoCollectionFilter(basicDBObject24);
        builder9.mongoLocalPassword = "initial_timestamp";
        java.util.List<com.mongodb.ServerAddress> serverAddressList30 = builder9.mongoServers;
        java.lang.String str31 = builder9.statisticsIndexName;
        boolean boolean32 = builder9.getadvancedTransformation();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder9.riverIndexName("gridfs");
        docScoreSearchScript0.setNextVar("credentials", (java.lang.Object) builder34);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder36.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet39 = builder38.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder38.mongoCollection("size");
        builder38.setscript("index");
        java.lang.Object obj44 = docScoreSearchScript0.unwrap((java.lang.Object) "index");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder45.advancedTransformation(false);
        builder45.mongoAdminPassword = "name";
        java.lang.String str50 = builder45.mongoCollection;
        java.util.Set<java.lang.String> strSet51 = builder45.includeFields;
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp52 = builder45.getinitialTimestamp();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder53 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder53.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet56 = builder53.includeFields;
        boolean boolean57 = builder53.getmongoGridFS();
        java.util.Set<java.lang.String> strSet58 = builder53.parentTypes;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder53.advancedTransformation(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = builder61.advancedTransformation(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory64 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject66 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript67 = docScoreNativeScriptFactory64.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject66);
        builder61.setmongoCollectionFilter(basicDBObject66);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder70 = builder61.mongoDb("mongodb-1638820218387");
        java.lang.String[] strArray76 = new java.lang.String[] { "throttle_size", "", "db", "db", "local" };
        java.util.LinkedHashSet<java.lang.String> strSet77 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet77, strArray76);
        builder61.setparentTypes((java.util.Set<java.lang.String>) strSet77);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder80 = builder53.parentTypes((java.util.Set<java.lang.String>) strSet77);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder81 = builder45.includeFields((java.util.Set<java.lang.String>) strSet77);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter82 = builder45.serializedObjectSupporter;
        builder45.setstoreStatistics(false);
        com.mongodb.BasicDBObject basicDBObject85 = builder45.getmongoCollectionFilter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject85);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        docScoreSearchScript0.setNextScore((float) '4');
        docScoreSearchScript0.setNextScore((float) '4');
        docScoreSearchScript0.setNextScore((float) 1000);
        docScoreSearchScript0.setNextScore((float) (-1L));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj14 = docScoreSearchScript0.run();
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        docScoreSearchScript0.setNextScore((float) 1L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj7 = docScoreSearchScript0.run();
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet9 = builder8.parentTypes;
        builder8.indexName = "disable_index_refresh";
        builder8.setriverName("ssl_verify_certificate");
        builder8.setmongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = builder8.initialTimestamp;
        builder8.riverIndexName = "db";
        docScoreSearchScript0.setNextVar("null.size", (java.lang.Object) builder8);
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        docScoreSearchScript0.setNextScore((-1.0f));
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextScore((float) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float28 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextScore((float) 1000);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(1);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        docScoreSearchScript0.setNextScore((float) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(0);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet9 = builder8.parentTypes;
        builder8.indexName = "disable_index_refresh";
        builder8.setriverName("ssl_verify_certificate");
        builder8.setmongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = builder8.initialTimestamp;
        builder8.riverIndexName = "db";
        docScoreSearchScript0.setNextVar("null.size", (java.lang.Object) builder8);
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        docScoreSearchScript0.setNextScore((-1.0f));
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextScore((float) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj28 = docScoreSearchScript0.run();
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        java.lang.Object obj7 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder8.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet11 = builder10.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder10.mongoCollection("size");
        builder13.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder13);
        java.lang.String str17 = mongoDBRiverDefinition16.getTHROTTLE_SIZE_FIELD();
        java.lang.String str18 = mongoDBRiverDefinition16.getADMIN_DB_FIELD();
        java.lang.String str19 = mongoDBRiverDefinition16.getNAME_FIELD();
        boolean boolean20 = mongoDBRiverDefinition16.mongoGridFS;
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue21 = mongoDBRiverDefinition16.getDEFAULT_BULK_SIZE();
        java.lang.Object obj22 = docScoreSearchScript0.unwrap((java.lang.Object) byteSizeValue21);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder23.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet26 = builder25.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder25.mongoCollection("size");
        int int29 = builder25.getsocketTimeout();
        builder25.setmongoSecondaryReadPreference(false);
        builder25.setskipInitialImport(true);
        builder25.riverName = "";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder25.storeStatistics(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder38.advancedTransformation(false);
        builder38.mongoAdminPassword = "name";
        boolean boolean43 = builder38.mongoSecondaryReadPreference;
        java.lang.String str44 = builder38.mongoAdminUser;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory45 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject47 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript48 = docScoreNativeScriptFactory45.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject47);
        builder38.setmongoCollectionFilter(basicDBObject47);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder25.mongoOplogFilter(basicDBObject47);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject47);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet9 = builder8.parentTypes;
        builder8.indexName = "disable_index_refresh";
        builder8.setriverName("ssl_verify_certificate");
        builder8.setmongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = builder8.initialTimestamp;
        builder8.riverIndexName = "db";
        docScoreSearchScript0.setNextVar("null.size", (java.lang.Object) builder8);
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        docScoreSearchScript0.setNextScore((float) (short) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder24.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet27 = builder26.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder26.mongoCollection("size");
        builder29.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition32 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder29);
        java.lang.String str33 = mongoDBRiverDefinition32.getTHROTTLE_SIZE_FIELD();
        java.lang.String str34 = mongoDBRiverDefinition32.getADMIN_DB_FIELD();
        java.lang.String str35 = mongoDBRiverDefinition32.riverName;
        boolean boolean36 = mongoDBRiverDefinition32.storeStatistics;
        java.lang.String str37 = mongoDBRiverDefinition32.getTHROTTLE_SIZE_FIELD();
        com.mongodb.BasicDBObject basicDBObject38 = mongoDBRiverDefinition32.mongoCollectionFilter;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject38);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script_type", "mongodb-1638820217755");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        docScoreSearchScript0.setNextScore((float) (byte) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.advancedTransformation(false);
        builder9.mongoAdminPassword = "name";
        boolean boolean14 = builder9.mongoSecondaryReadPreference;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory15 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject17 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript18 = docScoreNativeScriptFactory15.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject17);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory19 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject21 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript22 = docScoreNativeScriptFactory19.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject21);
        com.mongodb.BasicDBObject basicDBObject24 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript25 = docScoreNativeScriptFactory19.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject24);
        org.elasticsearch.script.ExecutableScript executableScript26 = docScoreNativeScriptFactory15.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject24);
        builder9.setmongoCollectionFilter(basicDBObject24);
        builder9.mongoLocalPassword = "initial_timestamp";
        java.util.List<com.mongodb.ServerAddress> serverAddressList30 = builder9.mongoServers;
        java.lang.String str31 = builder9.statisticsIndexName;
        boolean boolean32 = builder9.getadvancedTransformation();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder9.riverIndexName("gridfs");
        docScoreSearchScript0.setNextVar("credentials", (java.lang.Object) builder34);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder36.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet39 = builder38.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder38.mongoCollection("size");
        builder38.setscript("index");
        java.lang.Object obj44 = docScoreSearchScript0.unwrap((java.lang.Object) "index");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder46.advancedTransformation(false);
        builder46.mongoAdminPassword = "name";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder46.mongoUseSSL(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder46.mongoAdminPassword("index");
        java.lang.String str55 = builder54.mongoDb;
        builder54.setscriptType("user");
        boolean boolean58 = builder54.mongoGridFS;
        docScoreSearchScript0.setNextVar("collection", (java.lang.Object) boolean58);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((-1));
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet9 = builder8.parentTypes;
        builder8.indexName = "disable_index_refresh";
        builder8.setriverName("ssl_verify_certificate");
        builder8.setmongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = builder8.initialTimestamp;
        builder8.riverIndexName = "db";
        docScoreSearchScript0.setNextVar("null.size", (java.lang.Object) builder8);
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        docScoreSearchScript0.setNextScore((-1.0f));
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextScore(0.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet31 = builder30.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder33 = builder30.mongoCollection("size");
        builder33.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition36 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder33);
        java.lang.String str37 = mongoDBRiverDefinition36.getTHROTTLE_SIZE_FIELD();
        java.lang.String str38 = mongoDBRiverDefinition36.getADMIN_DB_FIELD();
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue39 = mongoDBRiverDefinition36.getDEFAULT_BULK_SIZE();
        boolean boolean40 = mongoDBRiverDefinition36.getmongoGridFS();
        boolean boolean41 = mongoDBRiverDefinition36.isDisableIndexRefresh();
        boolean boolean42 = mongoDBRiverDefinition36.isMongoUseSSL();
        java.lang.String str43 = mongoDBRiverDefinition36.getEXCLUDE_FIELDS_FIELD();
        java.util.List<com.mongodb.ServerAddress> serverAddressList44 = mongoDBRiverDefinition36.mongoServers;
        java.lang.String str45 = mongoDBRiverDefinition36.getMongoLocalUser();
        int int46 = mongoDBRiverDefinition36.throttleSize;
        java.lang.String str47 = mongoDBRiverDefinition36.getINCLUDE_COLLECTION_FIELD();
        java.lang.String str48 = mongoDBRiverDefinition36.getDEFAULT_DB_HOST();
        com.mongodb.BasicDBObject basicDBObject49 = mongoDBRiverDefinition36.getMongoCollectionFilter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject49);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        docScoreSearchScript0.setNextScore((float) '4');
        docScoreSearchScript0.setNextScore(10.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double10 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        java.lang.Object obj7 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        docScoreSearchScript0.setNextScore((float) (byte) 100);
        java.lang.Object obj11 = docScoreSearchScript0.unwrap((java.lang.Object) (-1));
        docScoreSearchScript0.setNextScore((-1.0f));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double14 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("skip_initial_import", "size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        docScoreSearchScript0.setNextScore((float) '4');
        docScoreSearchScript0.setNextScore((float) (-1L));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float10 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet9 = builder8.parentTypes;
        builder8.indexName = "disable_index_refresh";
        builder8.setriverName("ssl_verify_certificate");
        builder8.setmongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = builder8.initialTimestamp;
        builder8.riverIndexName = "db";
        builder8.setscript("db");
        docScoreSearchScript0.setNextVar("user", (java.lang.Object) "db");
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue23 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DEFAULT_BULK_SIZE;
        docScoreSearchScript0.setNextVar("script_type", (java.lang.Object) byteSizeValue23);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder25.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet28 = builder27.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder27.mongoCollection("size");
        int int31 = builder27.getsocketTimeout();
        builder27.setmongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet37 = builder36.parentTypes;
        java.util.List<com.mongodb.ServerAddress> serverAddressList38 = builder36.mongoServers;
        builder27.setmongoServers(serverAddressList38);
        builder27.setthrottleSize(0);
        boolean boolean42 = builder27.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder27.disableIndexRefresh(false);
        builder27.setriverIndexName("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder27.indexName("exclude_fields");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder48.typeName("bulk");
        java.lang.Object obj51 = docScoreSearchScript0.unwrap((java.lang.Object) builder48);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder52.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet55 = builder54.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder57 = builder54.advancedTransformation(false);
        builder54.setimportAllCollections(false);
        builder54.riverName = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = builder54.mongoDb("mongodb-1638820218424");
        builder54.setstatisticsTypeName("host");
        java.lang.Object obj66 = docScoreSearchScript0.unwrap((java.lang.Object) builder54);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double67 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        docScoreSearchScript0.setNextScore((float) (byte) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.advancedTransformation(false);
        builder9.mongoAdminPassword = "name";
        boolean boolean14 = builder9.mongoSecondaryReadPreference;
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory15 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject17 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript18 = docScoreNativeScriptFactory15.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject17);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory19 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject21 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript22 = docScoreNativeScriptFactory19.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject21);
        com.mongodb.BasicDBObject basicDBObject24 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript25 = docScoreNativeScriptFactory19.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject24);
        org.elasticsearch.script.ExecutableScript executableScript26 = docScoreNativeScriptFactory15.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject24);
        builder9.setmongoCollectionFilter(basicDBObject24);
        builder9.mongoLocalPassword = "initial_timestamp";
        java.util.List<com.mongodb.ServerAddress> serverAddressList30 = builder9.mongoServers;
        java.lang.String str31 = builder9.statisticsIndexName;
        boolean boolean32 = builder9.getadvancedTransformation();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder9.riverIndexName("gridfs");
        docScoreSearchScript0.setNextVar("credentials", (java.lang.Object) builder34);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder39 = builder37.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet40 = builder39.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder39.mongoCollection("size");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder39.mongoLocalPassword("drop_collection");
        boolean boolean45 = builder39.advancedTransformation;
        docScoreSearchScript0.setNextVar("servers", (java.lang.Object) builder39);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double47 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        java.lang.Object obj7 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        docScoreSearchScript0.setNextScore((float) (byte) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet13 = builder10.includeFields;
        boolean boolean14 = builder10.getmongoGridFS();
        java.util.Set<java.lang.String> strSet15 = builder10.parentTypes;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder10.advancedTransformation(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.advancedTransformation(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory21 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject23 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript24 = docScoreNativeScriptFactory21.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject23);
        builder18.setmongoCollectionFilter(basicDBObject23);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder18.mongoDb("mongodb-1638820218387");
        java.lang.String[] strArray33 = new java.lang.String[] { "throttle_size", "", "db", "db", "local" };
        java.util.LinkedHashSet<java.lang.String> strSet34 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet34, strArray33);
        builder18.setparentTypes((java.util.Set<java.lang.String>) strSet34);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder37 = builder10.parentTypes((java.util.Set<java.lang.String>) strSet34);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder38.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet41 = builder40.parentTypes;
        java.util.List<com.mongodb.ServerAddress> serverAddressList42 = builder40.mongoServers;
        builder37.mongoServers = serverAddressList42;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder37.skipInitialImport(true);
        java.lang.Object obj46 = docScoreSearchScript0.unwrap((java.lang.Object) true);
        docScoreSearchScript0.setNextScore((float) 1L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj49 = docScoreSearchScript0.run();
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        docScoreSearchScript0.setNextVar("advanced_transformation", (java.lang.Object) "filter");
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextScore((float) (byte) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder12 = builder10.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet13 = builder12.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = builder12.advancedTransformation(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder15.statisticsTypeName("");
        java.lang.Object obj18 = docScoreSearchScript0.unwrap((java.lang.Object) "");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj19 = docScoreSearchScript0.run();
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        docScoreSearchScript0.setNextScore((float) '4');
        docScoreSearchScript0.setNextScore((float) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long10 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet9 = builder8.parentTypes;
        builder8.indexName = "disable_index_refresh";
        builder8.setriverName("ssl_verify_certificate");
        builder8.setmongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = builder8.initialTimestamp;
        builder8.riverIndexName = "db";
        docScoreSearchScript0.setNextVar("null.size", (java.lang.Object) builder8);
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        docScoreSearchScript0.setNextScore((float) (short) 100);
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter25 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        org.elasticsearch.river.RiverSettings riverSettings26 = serializedObjectSupporter25.deserializeObjectRiverSettings9();
        org.elasticsearch.river.RiverSettings riverSettings27 = serializedObjectSupporter25.deserializeObjectRiverSettings8();
        java.lang.String str28 = serializedObjectSupporter25.deserializeObjectString13();
        java.lang.String str29 = serializedObjectSupporter25.deserializeObjectString13();
        java.lang.String str30 = serializedObjectSupporter25.deserializeObjectString1();
        docScoreSearchScript0.setNextVar("", (java.lang.Object) str30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double32 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script_type", "localhost");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        java.lang.Object obj7 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        docScoreSearchScript0.setNextScore((float) (byte) 100);
        java.lang.Object obj11 = docScoreSearchScript0.unwrap((java.lang.Object) (-1));
        docScoreSearchScript0.setNextScore((-1.0f));
        docScoreSearchScript0.setNextScore((float) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (short) 10);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        docScoreSearchScript0.setNextVar("advanced_transformation", (java.lang.Object) "filter");
        docScoreSearchScript0.setNextScore((float) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder9.advancedTransformation(false);
        org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory docScoreNativeScriptFactory12 = new org.elasticsearch.script.ScriptService.DocScoreNativeScriptFactory();
        com.mongodb.BasicDBObject basicDBObject14 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.convertToBasicDBObject("");
        org.elasticsearch.script.ExecutableScript executableScript15 = docScoreNativeScriptFactory12.newScript((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject14);
        builder9.setmongoCollectionFilter(basicDBObject14);
        java.lang.String str17 = builder9.mongoDb;
        builder9.setmongoGridFS(false);
        java.lang.String str20 = builder9.getincludeCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder9.script("drop_collection");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder22.mongoSSLVerifyCertificate(false);
        docScoreSearchScript0.setNextVar("password", (java.lang.Object) builder24);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) '#');
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet9 = builder8.parentTypes;
        builder8.indexName = "disable_index_refresh";
        builder8.setriverName("ssl_verify_certificate");
        builder8.setmongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = builder8.initialTimestamp;
        builder8.riverIndexName = "db";
        docScoreSearchScript0.setNextVar("null.size", (java.lang.Object) builder8);
        docScoreSearchScript0.setNextScore((float) (byte) 0);
        docScoreSearchScript0.setNextScore((-1.0f));
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextVar("null.size", (java.lang.Object) "mongodb-1638820218363");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double31 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet9 = builder8.parentTypes;
        builder8.indexName = "disable_index_refresh";
        builder8.setriverName("ssl_verify_certificate");
        builder8.setmongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = builder8.initialTimestamp;
        builder8.riverIndexName = "db";
        builder8.setscript("db");
        docScoreSearchScript0.setNextVar("user", (java.lang.Object) "db");
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue23 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DEFAULT_BULK_SIZE;
        docScoreSearchScript0.setNextVar("script_type", (java.lang.Object) byteSizeValue23);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder25.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet28 = builder27.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder27.mongoCollection("size");
        int int31 = builder27.getsocketTimeout();
        builder27.setmongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet37 = builder36.parentTypes;
        java.util.List<com.mongodb.ServerAddress> serverAddressList38 = builder36.mongoServers;
        builder27.setmongoServers(serverAddressList38);
        builder27.setthrottleSize(0);
        boolean boolean42 = builder27.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder27.disableIndexRefresh(false);
        builder27.setriverIndexName("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder27.indexName("exclude_fields");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder48.typeName("bulk");
        java.lang.Object obj51 = docScoreSearchScript0.unwrap((java.lang.Object) builder48);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder52.advancedTransformation(false);
        builder52.mongoAdminPassword = "name";
        builder52.mongoSSLVerifyCertificate = true;
        builder52.setmongoLocalPassword("throttle_size");
        builder52.settypeName("mongodb-1638820218424");
        int int63 = builder52.getconnectTimeout();
        java.lang.String str64 = builder52.getmongoDb();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder65 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder67 = builder65.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet68 = builder67.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder70 = builder67.mongoCollection("size");
        builder70.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition73 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder70);
        boolean boolean74 = mongoDBRiverDefinition73.getadvancedTransformation();
        java.lang.String str75 = mongoDBRiverDefinition73.getDEFAULT_DB_HOST();
        java.lang.String str76 = mongoDBRiverDefinition73.getINCLUDE_FIELDS_FIELD();
        java.lang.String str77 = mongoDBRiverDefinition73.getSECONDARY_READ_PREFERENCE_FIELD();
        java.lang.String str78 = mongoDBRiverDefinition73.getBULK_FIELD();
        java.lang.String str79 = mongoDBRiverDefinition73.getBULK_SIZE_FIELD();
        com.mongodb.BasicDBObject basicDBObject80 = mongoDBRiverDefinition73.getMongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder81 = builder52.mongoCollectionFilter(basicDBObject80);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject80);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        docScoreSearchScript0.setNextScore((float) 0L);
        docScoreSearchScript0.setNextScore((float) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double7 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("gridfs", "null.size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        java.lang.Object obj4 = docScoreSearchScript0.unwrap((java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder6 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = builder6.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet9 = builder8.parentTypes;
        builder8.indexName = "disable_index_refresh";
        builder8.setriverName("ssl_verify_certificate");
        builder8.setmongoSecondaryReadPreference(true);
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp16 = builder8.initialTimestamp;
        builder8.riverIndexName = "db";
        builder8.setscript("db");
        docScoreSearchScript0.setNextVar("user", (java.lang.Object) "db");
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue23 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.DEFAULT_BULK_SIZE;
        docScoreSearchScript0.setNextVar("script_type", (java.lang.Object) byteSizeValue23);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder25.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet28 = builder27.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder27.mongoCollection("size");
        int int31 = builder27.getsocketTimeout();
        builder27.setmongoSecondaryReadPreference(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder34.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet37 = builder36.parentTypes;
        java.util.List<com.mongodb.ServerAddress> serverAddressList38 = builder36.mongoServers;
        builder27.setmongoServers(serverAddressList38);
        builder27.setthrottleSize(0);
        boolean boolean42 = builder27.getdropCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder27.disableIndexRefresh(false);
        builder27.setriverIndexName("initial_timestamp");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder48 = builder27.indexName("exclude_fields");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder48.typeName("bulk");
        java.lang.Object obj51 = docScoreSearchScript0.unwrap((java.lang.Object) builder48);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) ' ');
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        java.lang.Object obj2 = docScoreSearchScript0.unwrap((java.lang.Object) (-1L));
        docScoreSearchScript0.setNextVar("bulk_timeout", (java.lang.Object) "admin");
        docScoreSearchScript0.setNextScore((float) '4');
        org.elasticsearch.river.mongodb.SerializedObjectSupporter serializedObjectSupporter9 = new org.elasticsearch.river.mongodb.SerializedObjectSupporter();
        java.lang.String str10 = serializedObjectSupporter9.deserializeObjectString15();
        java.lang.String str11 = serializedObjectSupporter9.deserializeObjectString6();
        java.lang.String str12 = serializedObjectSupporter9.deserializeObjectString9();
        org.elasticsearch.river.RiverSettings riverSettings13 = serializedObjectSupporter9.deserializeObjectRiverSettings9();
        java.lang.String str14 = serializedObjectSupporter9.deserializeObjectString3();
        java.lang.String str15 = serializedObjectSupporter9.deserializeObjectString11();
        java.lang.String str16 = serializedObjectSupporter9.deserializeObjectString5();
        docScoreSearchScript0.setNextVar("localhost", (java.lang.Object) str16);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder18.advancedTransformation(false);
        java.util.Set<java.lang.String> strSet21 = builder20.includeFields;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder23 = builder20.mongoCollection("size");
        builder23.setindexName("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition26 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder23);
        java.lang.String str27 = mongoDBRiverDefinition26.getTHROTTLE_SIZE_FIELD();
        boolean boolean28 = mongoDBRiverDefinition26.getmongoSecondaryReadPreference();
        boolean boolean29 = mongoDBRiverDefinition26.mongoSecondaryReadPreference;
        java.lang.String str30 = mongoDBRiverDefinition26.getSSL_CONNECTION_FIELD();
        java.lang.String str31 = mongoDBRiverDefinition26.getUSER_FIELD();
        com.mongodb.BasicDBObject basicDBObject32 = mongoDBRiverDefinition26.mongoCollectionFilter;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject32);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "_river");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }
}

