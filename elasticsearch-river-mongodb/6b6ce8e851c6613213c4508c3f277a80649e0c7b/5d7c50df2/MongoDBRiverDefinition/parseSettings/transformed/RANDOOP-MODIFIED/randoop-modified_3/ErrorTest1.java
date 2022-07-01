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
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("hi!", "port");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test502");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script.default_lang", "null.null");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test503");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("actions", "ssl_verify_certificate");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test504");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("name", "type");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test505");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("db", "connect_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test506");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder2.setriverIndexName("admin");
        builder2.storeStatistics = false;
        docScoreSearchScript0.setNextVar("import_all_collections", (java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean9 = builder8.getimportAllCollections();
        java.lang.String str10 = builder8.getmongoAdminUser();
        java.lang.String str11 = builder8.typeName;
        builder8.setmongoCollection("gridfs");
        builder8.setconnectTimeout((int) (short) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder8.build();
        builder8.importAllCollections = true;
        java.lang.Object obj19 = docScoreSearchScript0.unwrap((java.lang.Object) builder8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder20);
        builder20.setskipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder20.mongoDb("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder20.disableIndexRefresh(false);
        java.lang.Object obj28 = docScoreSearchScript0.unwrap((java.lang.Object) builder27);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj29 = docScoreSearchScript0.run();
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test507");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("store_statistics", "hi!.null");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test508");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder2.setriverIndexName("admin");
        builder2.storeStatistics = false;
        docScoreSearchScript0.setNextVar("import_all_collections", (java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        builder8.setskipInitialImport(true);
        builder8.scriptType = "admin";
        java.lang.String[] strArray16 = new java.lang.String[] { "", "password" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        builder8.setincludeFields((java.util.Set<java.lang.String>) strSet17);
        builder8.setmongoDb("filter");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        com.mongodb.MongoClientOptions mongoClientOptions23 = mongoDBRiverDefinition22.getMongoClientOptions();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp24 = mongoDBRiverDefinition22.initialTimestamp;
        java.lang.Object obj25 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition22);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder26);
        builder26.setskipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = builder26.mongoDb("hi!");
        builder31.isMongos = true;
        builder31.indexName = "password";
        builder31.disableIndexRefresh = true;
        builder31.connectTimeout = (short) -1;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray53 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet54 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet54, strArray53);
        builder40.parentTypes = strSet54;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder58 = builder40.throttleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder58.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition61 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder60);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = builder60.dropCollection(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder65 = builder63.dropCollection(false);
        java.lang.String str66 = builder65.getstatisticsTypeName();
        com.mongodb.BasicDBObject basicDBObject67 = builder65.mongoCollectionFilter;
        builder31.mongoCollectionFilter = basicDBObject67;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject67);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test509");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder2.setriverIndexName("admin");
        builder2.storeStatistics = false;
        docScoreSearchScript0.setNextVar("import_all_collections", (java.lang.Object) false);
        docScoreSearchScript0.setNextScore((float) '4');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder11);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition13 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder11);
        java.lang.String str14 = mongoDBRiverDefinition13.getDISABLE_INDEX_REFRESH_FIELD();
        java.lang.Boolean boolean15 = mongoDBRiverDefinition13.isMongos();
        boolean boolean16 = mongoDBRiverDefinition13.dropCollection;
        java.lang.String str17 = mongoDBRiverDefinition13.getADMIN_DB_FIELD();
        docScoreSearchScript0.setNextVar("credentials", (java.lang.Object) mongoDBRiverDefinition13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float19 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test510");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("exclude_fields", "hi!.null");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test511");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("db", "store_statistics");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test512");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 1000);
        docScoreSearchScript0.setNextScore((float) 1000);
        docScoreSearchScript0.setNextScore(10.0f);
        docScoreSearchScript0.setNextScore(0.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        builder9.parentTypes = strSet23;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder9.throttleSize((int) (byte) 0);
        int int28 = builder9.getconnectTimeout();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition30 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder29);
        builder29.setskipInitialImport(true);
        builder29.scriptType = "admin";
        java.lang.String[] strArray37 = new java.lang.String[] { "", "password" };
        java.util.LinkedHashSet<java.lang.String> strSet38 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet38, strArray37);
        builder29.setincludeFields((java.util.Set<java.lang.String>) strSet38);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder9.excludeFields((java.util.Set<java.lang.String>) strSet38);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder9.advancedTransformation(false);
        java.lang.Object obj44 = docScoreSearchScript0.unwrap((java.lang.Object) builder9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition46 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder45);
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue47 = mongoDBRiverDefinition46.getDEFAULT_BULK_SIZE();
        java.lang.String str48 = mongoDBRiverDefinition46.getINITIAL_TIMESTAMP_FIELD();
        int int49 = mongoDBRiverDefinition46.getSocketTimeout();
        java.lang.String str50 = mongoDBRiverDefinition46.getTHROTTLE_SIZE_FIELD();
        java.lang.String str51 = mongoDBRiverDefinition46.getMongoCollection();
        boolean boolean52 = mongoDBRiverDefinition46.getmongoSSLVerifyCertificate();
        java.util.Set<java.lang.String> strSet53 = mongoDBRiverDefinition46.includeFields;
        java.lang.Object obj54 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition46);
        docScoreSearchScript0.setNextScore((float) 8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(1000);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test513");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("connect_timeout", "type");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test514");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("hi!.null", "null.null");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test515");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("localhost", "size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test516");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("concurrent_bulk_requests", "exclude_fields");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test517");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("connect_timeout", "include_collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test518");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("is_mongos", "host");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test519");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("secondary_read_preference", "ssl_verify_certificate");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test520");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((float) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (byte) 1);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test521");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("gridfs", "concurrent_requests");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test522");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "type");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test523");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("servers", "drop_collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test524");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("advanced_transformation", "secondary_read_preference");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test525");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder2.setriverIndexName("admin");
        builder2.storeStatistics = false;
        docScoreSearchScript0.setNextVar("import_all_collections", (java.lang.Object) false);
        docScoreSearchScript0.setNextScore((float) '4');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        builder10.parentTypes = strSet24;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder10.throttleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder28.scriptType("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder32.mongoAdminUser("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder32.throttleSize((int) '4');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder36.disableIndexRefresh(false);
        java.lang.Object obj39 = docScoreSearchScript0.unwrap((java.lang.Object) builder36);
        docScoreSearchScript0.setNextScore((float) 100L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition43 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder42);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition44 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder42);
        java.lang.String str45 = mongoDBRiverDefinition44.getDISABLE_INDEX_REFRESH_FIELD();
        java.util.Set<java.lang.String> strSet46 = mongoDBRiverDefinition44.getParentTypes();
        java.lang.String str47 = mongoDBRiverDefinition44.getADMIN_DB_FIELD();
        java.lang.String str48 = mongoDBRiverDefinition44.getSECONDARY_READ_PREFERENCE_FIELD();
        java.util.Set<java.lang.String> strSet49 = mongoDBRiverDefinition44.excludeFields;
        java.util.Set<java.lang.String> strSet50 = mongoDBRiverDefinition44.getIncludeFields();
        java.lang.Object obj51 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition44);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double52 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test526");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "filter");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test527");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("concurrent_bulk_requests", "hi!");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test528");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "bulk");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test529");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("db", "filter");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test530");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("socket_timeout", "filter");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test531");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "is_mongos");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test532");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        builder2.parentTypes = strSet16;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder2.throttleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder21);
        int int23 = builder21.getsocketTimeout();
        java.lang.String str24 = builder21.getincludeCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet39 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet39, strArray38);
        builder25.parentTypes = strSet39;
        builder21.excludeFields = strSet39;
        builder2.parentTypes = strSet39;
        docScoreSearchScript0.setNextVar("host", (java.lang.Object) strSet39);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long45 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test533");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("exclude_fields", "secondary_read_preference");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test534");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder2.setriverIndexName("admin");
        builder2.storeStatistics = false;
        docScoreSearchScript0.setNextVar("import_all_collections", (java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean9 = builder8.getimportAllCollections();
        java.lang.String str10 = builder8.getmongoAdminUser();
        java.lang.String str11 = builder8.typeName;
        builder8.setmongoCollection("gridfs");
        builder8.setconnectTimeout((int) (short) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder8.build();
        builder8.importAllCollections = true;
        java.lang.Object obj19 = docScoreSearchScript0.unwrap((java.lang.Object) builder8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder20);
        java.lang.String str22 = mongoDBRiverDefinition21.scriptType;
        java.lang.String str23 = mongoDBRiverDefinition21.getTypeName();
        int int24 = mongoDBRiverDefinition21.getDEFAULT_SOCKET_TIMEOUT();
        java.lang.String str25 = mongoDBRiverDefinition21.getBULK_TIMEOUT_FIELD();
        java.lang.Object obj26 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition21);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean29 = builder28.getimportAllCollections();
        java.lang.String str30 = builder28.getmongoAdminUser();
        java.lang.String str31 = builder28.typeName;
        builder28.setmongoCollection("gridfs");
        java.lang.String str34 = builder28.riverIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder28.dropCollection(true);
        docScoreSearchScript0.setNextVar("hi!.null", (java.lang.Object) true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float38 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test535");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("is_mongos", "filter");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test536");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("credentials", "options");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test537");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder2.setriverIndexName("admin");
        builder2.storeStatistics = false;
        docScoreSearchScript0.setNextVar("import_all_collections", (java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean9 = builder8.getimportAllCollections();
        java.lang.String str10 = builder8.getmongoAdminUser();
        java.lang.String str11 = builder8.typeName;
        builder8.setmongoCollection("gridfs");
        builder8.setconnectTimeout((int) (short) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder8.build();
        builder8.importAllCollections = true;
        java.lang.Object obj19 = docScoreSearchScript0.unwrap((java.lang.Object) builder8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(1000);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test538");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((float) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double5 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test539");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("throttle_size", "ssl");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test540");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("concurrent_bulk_requests", "local");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test541");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder2.setriverIndexName("admin");
        builder2.storeStatistics = false;
        docScoreSearchScript0.setNextVar("import_all_collections", (java.lang.Object) false);
        docScoreSearchScript0.setNextScore((float) '4');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        builder10.parentTypes = strSet24;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder10.throttleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder28.scriptType("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder32.mongoAdminUser("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder32.throttleSize((int) '4');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder36.disableIndexRefresh(false);
        java.lang.Object obj39 = docScoreSearchScript0.unwrap((java.lang.Object) builder36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double40 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test542");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script.disable_dynamic", "password");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test543");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder2.setriverIndexName("admin");
        builder2.storeStatistics = false;
        docScoreSearchScript0.setNextVar("import_all_collections", (java.lang.Object) false);
        docScoreSearchScript0.setNextScore((float) '4');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder11);
        int int13 = builder11.getsocketTimeout();
        boolean boolean14 = builder11.advancedTransformation;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean16 = builder15.getimportAllCollections();
        java.lang.String str17 = builder15.getmongoAdminUser();
        java.util.List<com.mongodb.ServerAddress> serverAddressList18 = builder15.getmongoServers();
        builder11.mongoServers = serverAddressList18;
        java.lang.String str20 = builder11.mongoCollection;
        docScoreSearchScript0.setNextVar("user.null", (java.lang.Object) builder11);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean23 = builder22.getimportAllCollections();
        java.lang.String str24 = builder22.getmongoAdminUser();
        java.util.List<com.mongodb.ServerAddress> serverAddressList25 = builder22.getmongoServers();
        boolean boolean26 = builder22.getmongoGridFS();
        builder22.setdropCollection(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder22.mongoSecondaryReadPreference(true);
        com.mongodb.MongoClientOptions mongoClientOptions31 = builder30.mongoClientOptions;
        builder30.setmongoAdminPassword("bulk");
        java.util.Set<java.lang.String> strSet34 = builder30.getincludeFields();
        java.lang.Object obj35 = docScoreSearchScript0.unwrap((java.lang.Object) builder30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double36 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test544");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("options", "options");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test545");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("collection", "filter");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test546");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "password");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test547");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("options", "user.null");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test548");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("admin", "bulk");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test549");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("db", "hi!.null");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test550");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("hi!.null", "sandbox");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test551");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("collection", "hi!.null");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test552");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("parent_types", "concurrent_bulk_requests");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test553");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("db", "collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test554");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script.default_lang", "script.disable_dynamic");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test555");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("connect_timeout", "initial_timestamp");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test556");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder2.setriverIndexName("admin");
        builder2.storeStatistics = false;
        docScoreSearchScript0.setNextVar("import_all_collections", (java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean9 = builder8.getimportAllCollections();
        java.lang.String str10 = builder8.getmongoAdminUser();
        java.lang.String str11 = builder8.typeName;
        builder8.setmongoCollection("gridfs");
        builder8.setconnectTimeout((int) (short) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder8.build();
        builder8.importAllCollections = true;
        java.lang.Object obj19 = docScoreSearchScript0.unwrap((java.lang.Object) builder8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder20);
        java.lang.String str22 = mongoDBRiverDefinition21.scriptType;
        java.lang.String str23 = mongoDBRiverDefinition21.getTypeName();
        int int24 = mongoDBRiverDefinition21.getDEFAULT_SOCKET_TIMEOUT();
        java.lang.String str25 = mongoDBRiverDefinition21.getBULK_TIMEOUT_FIELD();
        java.lang.Object obj26 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition21);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder27);
        java.lang.String str29 = mongoDBRiverDefinition28.getSSL_CONNECTION_FIELD();
        int int30 = mongoDBRiverDefinition28.getDEFAULT_CONNECT_TIMEOUT();
        java.lang.String str31 = mongoDBRiverDefinition28.getADMIN_DB_FIELD();
        int int32 = mongoDBRiverDefinition28.connectTimeout;
        java.lang.Object obj33 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition28);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (byte) 1);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test557");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("concurrent_requests", "concurrent_bulk_requests");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test558");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("exclude_fields", "script.default_lang");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test559");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script.disable_dynamic", "flush_interval");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test560");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("skip_initial_import", "filter");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test561");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("socket_timeout", "gridfs");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test562");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("parent_types", "script.default_lang");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test563");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("user.null", "is_mongos");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test564");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("user", "socket_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test565");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk", "bulk_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test566");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script.default_lang", "connect_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test567");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("ssl_verify_certificate", "sandbox");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test568");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("local", "include_fields");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test569");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("ssl", "collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test570");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("import_all_collections", "credentials");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test571");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 1000);
        docScoreSearchScript0.setNextScore((float) (byte) 10);
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((float) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(0);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test572");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("localhost", "sandbox");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test573");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("throttle_size", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test574");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "index");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test575");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("store_statistics", "ssl_verify_certificate");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test576");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("port", "include_collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test577");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("type", "ssl_verify_certificate");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test578");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("db", "script.default_lang");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test579");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("initial_timestamp", "localhost");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test580");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript2 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript2.setNextScore((float) 1000);
        docScoreSearchScript2.setNextScore((float) 1000);
        docScoreSearchScript0.setNextVar("include_fields", (java.lang.Object) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        builder8.parentTypes = strSet22;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder8.throttleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder26.indexName("initial_timestamp");
        boolean boolean31 = builder26.getimportAllCollections();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition33 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder32);
        int int34 = builder32.getsocketTimeout();
        boolean boolean35 = builder32.advancedTransformation;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean37 = builder36.getimportAllCollections();
        java.lang.String str38 = builder36.getmongoAdminUser();
        java.util.List<com.mongodb.ServerAddress> serverAddressList39 = builder36.getmongoServers();
        builder32.mongoServers = serverAddressList39;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder26.mongoServers(serverAddressList39);
        java.lang.String str42 = builder26.statisticsIndexName;
        java.lang.Object obj43 = docScoreSearchScript0.unwrap((java.lang.Object) builder26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj44 = docScoreSearchScript0.run();
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test581");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("include_collection", "actions");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test582");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script", "parent_types");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test583");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("hi!.null", "script.disable_dynamic");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test584");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("ssl_verify_certificate", "user.null");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test585");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("secondary_read_preference", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test586");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder2.setriverIndexName("admin");
        builder2.storeStatistics = false;
        docScoreSearchScript0.setNextVar("import_all_collections", (java.lang.Object) false);
        docScoreSearchScript0.setNextScore((float) '4');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        builder10.parentTypes = strSet24;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder10.throttleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder28.scriptType("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder32.mongoAdminUser("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder32.throttleSize((int) '4');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder36.disableIndexRefresh(false);
        java.lang.Object obj39 = docScoreSearchScript0.unwrap((java.lang.Object) builder36);
        docScoreSearchScript0.setNextScore((float) 100L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition43 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder42);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition44 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder42);
        java.lang.String str45 = mongoDBRiverDefinition44.getDISABLE_INDEX_REFRESH_FIELD();
        java.util.Set<java.lang.String> strSet46 = mongoDBRiverDefinition44.getParentTypes();
        java.lang.String str47 = mongoDBRiverDefinition44.getADMIN_DB_FIELD();
        java.lang.String str48 = mongoDBRiverDefinition44.getSECONDARY_READ_PREFERENCE_FIELD();
        java.util.Set<java.lang.String> strSet49 = mongoDBRiverDefinition44.excludeFields;
        java.util.Set<java.lang.String> strSet50 = mongoDBRiverDefinition44.getIncludeFields();
        java.lang.Object obj51 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition44);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float52 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test587");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk", "credentials");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test588");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 1000);
        docScoreSearchScript0.setNextScore((float) (byte) 10);
        docScoreSearchScript0.setNextScore(0.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean8 = builder7.getimportAllCollections();
        java.lang.String str9 = builder7.mongoAdminUser;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = builder7.storeStatistics(true);
        boolean boolean12 = builder7.disableIndexRefresh;
        boolean boolean13 = builder7.getmongoUseSSL();
        builder7.setstoreStatistics(true);
        builder7.isMongos = true;
        boolean boolean18 = builder7.getstoreStatistics();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder19);
        builder19.setskipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder19.mongoDb("hi!");
        builder24.isMongos = true;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder24);
        java.lang.String str28 = builder24.riverIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition29 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder24);
        com.mongodb.BasicDBObject basicDBObject30 = mongoDBRiverDefinition29.mongoCollectionFilter;
        builder7.setmongoCollectionFilter(basicDBObject30);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject30);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test589");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript2 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript2.setNextScore((float) 1000);
        docScoreSearchScript2.setNextScore((float) 1000);
        docScoreSearchScript0.setNextVar("include_fields", (java.lang.Object) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        builder9.parentTypes = strSet23;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder9.throttleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.typeName("disable_index_refresh");
        docScoreSearchScript0.setNextVar("parent_types", (java.lang.Object) builder29);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition33 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder32);
        builder32.setskipInitialImport(true);
        builder32.scriptType = "admin";
        builder32.setstoreStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder32.isMongos((java.lang.Boolean) false);
        java.lang.String str42 = builder32.mongoAdminUser;
        docScoreSearchScript0.setNextVar("drop_collection", (java.lang.Object) str42);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition46 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder45);
        java.lang.String str47 = mongoDBRiverDefinition46.scriptType;
        boolean boolean48 = mongoDBRiverDefinition46.isSkipInitialImport();
        java.lang.String str49 = mongoDBRiverDefinition46.getMongoLocalPassword();
        java.lang.String str50 = mongoDBRiverDefinition46.getSKIP_INITIAL_IMPORT_FIELD();
        boolean boolean51 = mongoDBRiverDefinition46.getskipInitialImport();
        docScoreSearchScript0.setNextVar("sandbox", (java.lang.Object) boolean51);
        docScoreSearchScript0.setNextScore((float) 0L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float55 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test590");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("connect_timeout", "null.null");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test591");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((-1.0f));
        docScoreSearchScript0.setNextScore((float) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj5 = docScoreSearchScript0.run();
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test592");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("exclude_fields", "admin");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test593");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "script.disable_dynamic");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test594");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 1000);
        docScoreSearchScript0.setNextScore((float) 1000);
        docScoreSearchScript0.setNextScore(10.0f);
        docScoreSearchScript0.setNextScore(0.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder9);
        builder9.setskipInitialImport(true);
        builder9.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder9.skipInitialImport(false);
        java.lang.String str17 = builder16.getstatisticsTypeName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder16.importAllCollections(true);
        boolean boolean20 = builder19.disableIndexRefresh;
        builder19.scriptType = "socket_timeout";
        java.util.List<com.mongodb.ServerAddress> serverAddressList23 = builder19.mongoServers;
        java.lang.Object obj24 = docScoreSearchScript0.unwrap((java.lang.Object) serverAddressList23);
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float27 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test595");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        builder2.parentTypes = strSet16;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder2.throttleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder21);
        int int23 = builder21.getsocketTimeout();
        java.lang.String str24 = builder21.getincludeCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet39 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet39, strArray38);
        builder25.parentTypes = strSet39;
        builder21.excludeFields = strSet39;
        builder2.parentTypes = strSet39;
        docScoreSearchScript0.setNextVar("host", (java.lang.Object) strSet39);
        docScoreSearchScript0.setNextScore((float) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((-1));
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test596");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder2.setriverIndexName("admin");
        builder2.storeStatistics = false;
        docScoreSearchScript0.setNextVar("import_all_collections", (java.lang.Object) false);
        docScoreSearchScript0.setNextScore((float) '4');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        builder10.parentTypes = strSet24;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder10.throttleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder28.scriptType("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder32.mongoAdminUser("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder32.throttleSize((int) '4');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder36.disableIndexRefresh(false);
        java.lang.Object obj39 = docScoreSearchScript0.unwrap((java.lang.Object) builder36);
        docScoreSearchScript0.setNextScore((float) 100L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition43 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder42);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition44 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder42);
        java.lang.String str45 = mongoDBRiverDefinition44.getDISABLE_INDEX_REFRESH_FIELD();
        java.util.Set<java.lang.String> strSet46 = mongoDBRiverDefinition44.getParentTypes();
        java.lang.String str47 = mongoDBRiverDefinition44.getADMIN_DB_FIELD();
        java.lang.String str48 = mongoDBRiverDefinition44.getSECONDARY_READ_PREFERENCE_FIELD();
        java.util.Set<java.lang.String> strSet49 = mongoDBRiverDefinition44.excludeFields;
        java.util.Set<java.lang.String> strSet50 = mongoDBRiverDefinition44.getIncludeFields();
        java.lang.Object obj51 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition44);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long52 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test597");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("parent_types", "flush_interval");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test598");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test599");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("parent_types", "disable_index_refresh");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test600");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script.default_lang", "concurrent_requests");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test601");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("flush_interval", "drop_collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test602");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "gridfs");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test603");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey(".scripts", "socket_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test604");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("hi!.null", "bulk_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test605");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("socket_timeout", "credentials");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test606");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("import_all_collections", "hi!.null");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test607");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("ssl", "script_type");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test608");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("exclude_fields", "disable_index_refresh");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test609");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("index", "type");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test610");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder2);
        builder2.setskipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder2.mongoDb("hi!");
        builder7.indexName = "skip_initial_import";
        builder7.connectTimeout = 1;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder7.importAllCollections(false);
        docScoreSearchScript0.setNextVar("exclude_fields", (java.lang.Object) builder7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long15 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test611");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("options", "include_fields");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test612");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("options", "include_collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test613");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("type", "hi!.null");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test614");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 1000);
        docScoreSearchScript0.setNextScore((float) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (byte) 10);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test615");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("user.null", "drop_collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test616");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("hi!.null", "actions");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test617");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("sandbox", "admin");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test618");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder2);
        builder2.setskipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder2.mongoDb("hi!");
        builder7.indexName = "skip_initial_import";
        builder7.connectTimeout = 1;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder7.importAllCollections(false);
        docScoreSearchScript0.setNextVar("exclude_fields", (java.lang.Object) builder7);
        docScoreSearchScript0.setNextScore((float) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float17 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test619");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("type", "bulk_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test620");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script", "throttle_size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test621");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("advanced_transformation", "password");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test622");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("user.null", "store_statistics");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test623");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder2.setriverIndexName("admin");
        builder2.storeStatistics = false;
        docScoreSearchScript0.setNextVar("import_all_collections", (java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean9 = builder8.getimportAllCollections();
        java.lang.String str10 = builder8.getmongoAdminUser();
        java.lang.String str11 = builder8.typeName;
        builder8.setmongoCollection("gridfs");
        builder8.setconnectTimeout((int) (short) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder8.build();
        builder8.importAllCollections = true;
        java.lang.Object obj19 = docScoreSearchScript0.unwrap((java.lang.Object) builder8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (byte) 1);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test624");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("user.null", "user.null");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test625");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("import_all_collections", "initial_timestamp");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test626");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("type", "port");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test627");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("options", "is_mongos");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test628");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("credentials", "store_statistics");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test629");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script.default_lang", "db");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test630");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder2.setriverIndexName("admin");
        builder2.storeStatistics = false;
        docScoreSearchScript0.setNextVar("import_all_collections", (java.lang.Object) false);
        docScoreSearchScript0.setNextScore((float) '4');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        builder10.parentTypes = strSet24;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder10.throttleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder28.scriptType("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder32.mongoAdminUser("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder32.throttleSize((int) '4');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder36.disableIndexRefresh(false);
        java.lang.Object obj39 = docScoreSearchScript0.unwrap((java.lang.Object) builder36);
        docScoreSearchScript0.setNextScore((float) 100L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float42 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test631");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script", "credentials");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test632");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey(".scripts", "concurrent_bulk_requests");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test633");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("options", "size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test634");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("db", "port");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test635");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("null.gridfs", "socket_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test636");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 1000);
        docScoreSearchScript0.setNextScore((float) (byte) 10);
        docScoreSearchScript0.setNextScore((float) 60000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder7);
        java.lang.String str9 = mongoDBRiverDefinition8.getEXCLUDE_FIELDS_FIELD();
        java.lang.String str10 = mongoDBRiverDefinition8.getRiverName();
        java.lang.String str11 = mongoDBRiverDefinition8.getSIZE_FIELD();
        java.lang.String str12 = mongoDBRiverDefinition8.getSSL_VERIFY_CERT_FIELD();
        java.lang.String str13 = mongoDBRiverDefinition8.mongoLocalPassword;
        java.lang.Object obj14 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj15 = docScoreSearchScript0.run();
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test637");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("flush_interval", "user");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test638");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("actions", "null.null");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test639");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("parent_types", "store_statistics");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test640");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("port", "admin");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test641");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script.default_lang", "null.gridfs");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test642");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("include_collection", "ssl_verify_certificate");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test643");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("admin", "store_statistics");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test644");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("collection", "parent_types");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test645");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script.default_lang", "bulk_size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test646");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("disable_index_refresh", "skip_initial_import");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test647");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        builder2.parentTypes = strSet16;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder2.throttleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder21);
        int int23 = builder21.getsocketTimeout();
        java.lang.String str24 = builder21.getincludeCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet39 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet39, strArray38);
        builder25.parentTypes = strSet39;
        builder21.excludeFields = strSet39;
        builder2.parentTypes = strSet39;
        docScoreSearchScript0.setNextVar("host", (java.lang.Object) strSet39);
        docScoreSearchScript0.setNextScore((float) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(100);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test648");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("advanced_transformation", "actions");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test649");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("null.null", "options");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test650");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("ssl_verify_certificate", "script");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test651");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "null.gridfs");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test652");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("gridfs", "admin");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test653");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        builder4.parentTypes = strSet18;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder4.throttleSize((int) (byte) 0);
        int int23 = builder4.getconnectTimeout();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder24);
        builder24.setskipInitialImport(true);
        builder24.scriptType = "admin";
        java.lang.String[] strArray32 = new java.lang.String[] { "", "password" };
        java.util.LinkedHashSet<java.lang.String> strSet33 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet33, strArray32);
        builder24.setincludeFields((java.util.Set<java.lang.String>) strSet33);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder4.excludeFields((java.util.Set<java.lang.String>) strSet33);
        builder36.statisticsTypeName = "throttle_size";
        java.lang.String str39 = builder36.scriptType;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition40 = builder36.build();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder36.statisticsIndexName("size");
        docScoreSearchScript0.setNextVar("name", (java.lang.Object) builder42);
        docScoreSearchScript0.setNextScore(1.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double46 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test654");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder2);
        builder2.setskipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder2.mongoDb("hi!");
        builder7.indexName = "skip_initial_import";
        builder7.connectTimeout = 1;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder7.importAllCollections(false);
        docScoreSearchScript0.setNextVar("exclude_fields", (java.lang.Object) builder7);
        docScoreSearchScript0.setNextScore((float) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder17);
        builder17.setskipInitialImport(true);
        builder17.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = builder17.skipInitialImport(false);
        com.mongodb.BasicDBObject basicDBObject25 = builder17.getmongoCollectionFilter();
        builder17.setscriptType("collection");
        com.mongodb.BasicDBObject basicDBObject28 = builder17.mongoOplogFilter;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder17.includeCollection("");
        java.lang.String str31 = builder17.mongoCollection;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition32 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder17);
        boolean boolean33 = mongoDBRiverDefinition32.isImportAllCollections();
        java.lang.String str34 = mongoDBRiverDefinition32.mongoAdminUser;
        java.lang.String str35 = mongoDBRiverDefinition32.mongoLocalPassword;
        java.lang.String str36 = mongoDBRiverDefinition32.getIMPORT_ALL_COLLECTIONS_FIELD();
        com.mongodb.BasicDBObject basicDBObject37 = mongoDBRiverDefinition32.mongoCollectionFilter;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject37);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test655");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("hi!.null", "type");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test656");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("initial_timestamp", "script.disable_dynamic");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test657");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 1000);
        docScoreSearchScript0.setNextScore((-1.0f));
        docScoreSearchScript0.setNextScore((float) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) 'a');
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test658");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("is_mongos", "name");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test659");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("actions", "actions");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test660");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("concurrent_bulk_requests", "flush_interval");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test661");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("concurrent_requests", "gridfs");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test662");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder2.setriverIndexName("admin");
        builder2.storeStatistics = false;
        docScoreSearchScript0.setNextVar("import_all_collections", (java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        builder8.setskipInitialImport(true);
        builder8.scriptType = "admin";
        java.lang.String[] strArray16 = new java.lang.String[] { "", "password" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        builder8.setincludeFields((java.util.Set<java.lang.String>) strSet17);
        builder8.setmongoDb("filter");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        com.mongodb.MongoClientOptions mongoClientOptions23 = mongoDBRiverDefinition22.getMongoClientOptions();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp24 = mongoDBRiverDefinition22.initialTimestamp;
        java.lang.Object obj25 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double26 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test663");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "servers");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test664");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("is_mongos", "socket_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test665");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("size", "bulk_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test666");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("disable_index_refresh", "servers");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test667");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("admin", "ssl_verify_certificate");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test668");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("flush_interval", "concurrent_requests");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test669");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder2.setriverIndexName("admin");
        builder2.storeStatistics = false;
        docScoreSearchScript0.setNextVar("import_all_collections", (java.lang.Object) false);
        docScoreSearchScript0.setNextScore((float) '4');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder11);
        int int13 = builder11.getsocketTimeout();
        boolean boolean14 = builder11.advancedTransformation;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean16 = builder15.getimportAllCollections();
        java.lang.String str17 = builder15.getmongoAdminUser();
        java.util.List<com.mongodb.ServerAddress> serverAddressList18 = builder15.getmongoServers();
        builder11.mongoServers = serverAddressList18;
        java.lang.String str20 = builder11.mongoCollection;
        docScoreSearchScript0.setNextVar("user.null", (java.lang.Object) builder11);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean23 = builder22.getimportAllCollections();
        java.lang.String str24 = builder22.getmongoAdminUser();
        java.util.List<com.mongodb.ServerAddress> serverAddressList25 = builder22.getmongoServers();
        boolean boolean26 = builder22.getmongoGridFS();
        builder22.setdropCollection(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder22.mongoSecondaryReadPreference(true);
        com.mongodb.MongoClientOptions mongoClientOptions31 = builder30.mongoClientOptions;
        builder30.setmongoAdminPassword("bulk");
        java.util.Set<java.lang.String> strSet34 = builder30.getincludeFields();
        java.lang.Object obj35 = docScoreSearchScript0.unwrap((java.lang.Object) builder30);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet50 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet50, strArray49);
        builder36.parentTypes = strSet50;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder54 = builder36.script("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = builder54.indexName("password");
        builder56.setimportAllCollections(true);
        java.lang.String str59 = builder56.getscript();
        builder56.indexName = "socket_timeout";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition62 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder56);
        java.lang.String str63 = mongoDBRiverDefinition62.indexName;
        com.mongodb.BasicDBObject basicDBObject64 = mongoDBRiverDefinition62.getMongoCollectionFilter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject64);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test670");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("hi!", "script_type");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test671");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test672");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script", "options");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test673");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 1000);
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (short) 0);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test674");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("ssl", "connect_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test675");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("disable_index_refresh", "include_collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test676");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script", "disable_index_refresh");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test677");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("include_collection", "advanced_transformation");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test678");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("db", "flush_interval");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test679");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("servers", "sandbox");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test680");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("password", "type");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test681");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("admin", "advanced_transformation");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test682");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey(".scripts", "credentials");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test683");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("ssl", "null.gridfs");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test684");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("user.null", "advanced_transformation");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test685");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("null.null", "hi!");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test686");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("throttle_size", "type");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test687");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script.disable_dynamic", "skip_initial_import");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test688");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 1000);
        docScoreSearchScript0.setNextScore((float) 1000);
        docScoreSearchScript0.setNextScore(10.0f);
        docScoreSearchScript0.setNextScore((float) (byte) 10);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder9);
        java.lang.String str11 = builder9.getindexName();
        boolean boolean12 = builder9.getmongoSSLVerifyCertificate();
        java.lang.String str13 = builder9.typeName;
        builder9.socketTimeout = 0;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = builder9.typeName("bulk");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder9.mongoSecondaryReadPreference(false);
        java.lang.Object obj20 = docScoreSearchScript0.unwrap((java.lang.Object) builder9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(27017);
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test689");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        builder2.parentTypes = strSet16;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder2.throttleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder21);
        int int23 = builder21.getsocketTimeout();
        java.lang.String str24 = builder21.getincludeCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet39 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet39, strArray38);
        builder25.parentTypes = strSet39;
        builder21.excludeFields = strSet39;
        builder2.parentTypes = strSet39;
        docScoreSearchScript0.setNextVar("host", (java.lang.Object) strSet39);
        docScoreSearchScript0.setNextScore((float) (short) 100);
        docScoreSearchScript0.setNextScore((float) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj49 = docScoreSearchScript0.run();
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test690");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script.default_lang", "ssl_verify_certificate");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test691");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("credentials", "user");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test692");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 1000);
        docScoreSearchScript0.setNextScore((float) 1000);
        docScoreSearchScript0.setNextScore(10.0f);
        docScoreSearchScript0.setNextScore(0.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder9);
        builder9.setskipInitialImport(true);
        builder9.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder9.skipInitialImport(false);
        java.lang.String str17 = builder16.getstatisticsTypeName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder16.importAllCollections(true);
        boolean boolean20 = builder19.disableIndexRefresh;
        builder19.scriptType = "socket_timeout";
        java.util.List<com.mongodb.ServerAddress> serverAddressList23 = builder19.mongoServers;
        java.lang.Object obj24 = docScoreSearchScript0.unwrap((java.lang.Object) serverAddressList23);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition26 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder25);
        java.lang.String str27 = mongoDBRiverDefinition26.getSSL_CONNECTION_FIELD();
        java.lang.String str28 = mongoDBRiverDefinition26.getACTIONS_FIELD();
        boolean boolean29 = mongoDBRiverDefinition26.isSkipInitialImport();
        java.lang.String str30 = mongoDBRiverDefinition26.riverIndexName;
        com.mongodb.BasicDBObject basicDBObject31 = mongoDBRiverDefinition26.mongoCollectionFilter;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject31);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test693");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk", "index");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test694");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("size", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test695");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript2 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript2.setNextScore((float) 1000);
        docScoreSearchScript2.setNextScore((float) 1000);
        docScoreSearchScript0.setNextVar("include_fields", (java.lang.Object) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        builder9.parentTypes = strSet23;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder9.throttleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.typeName("disable_index_refresh");
        docScoreSearchScript0.setNextVar("parent_types", (java.lang.Object) builder29);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition33 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder32);
        builder32.setskipInitialImport(true);
        builder32.scriptType = "admin";
        builder32.setstoreStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder32.isMongos((java.lang.Boolean) false);
        java.lang.String str42 = builder32.mongoAdminUser;
        docScoreSearchScript0.setNextVar("drop_collection", (java.lang.Object) str42);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition45 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder44);
        java.lang.String str46 = mongoDBRiverDefinition45.getSSL_CONNECTION_FIELD();
        int int47 = mongoDBRiverDefinition45.getDEFAULT_CONNECT_TIMEOUT();
        boolean boolean48 = mongoDBRiverDefinition45.dropCollection;
        java.lang.String str49 = mongoDBRiverDefinition45.getMongoAdminPassword();
        java.lang.Object obj50 = docScoreSearchScript0.unwrap((java.lang.Object) str49);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean52 = builder51.getimportAllCollections();
        java.lang.String str53 = builder51.mongoAdminUser;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder51.storeStatistics(true);
        boolean boolean56 = builder51.disableIndexRefresh;
        builder51.mongoAdminPassword = "index";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder51.riverName("options");
        builder51.skipInitialImport = true;
        java.lang.Object obj63 = docScoreSearchScript0.unwrap((java.lang.Object) builder51);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long64 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test696");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript2 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript2.setNextScore((float) 1000);
        docScoreSearchScript2.setNextScore((float) 1000);
        docScoreSearchScript0.setNextVar("include_fields", (java.lang.Object) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        builder9.parentTypes = strSet23;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder9.throttleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.typeName("disable_index_refresh");
        docScoreSearchScript0.setNextVar("parent_types", (java.lang.Object) builder29);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition33 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder32);
        builder32.setskipInitialImport(true);
        builder32.scriptType = "admin";
        builder32.setstoreStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder32.isMongos((java.lang.Boolean) false);
        java.lang.String str42 = builder32.mongoAdminUser;
        docScoreSearchScript0.setNextVar("drop_collection", (java.lang.Object) str42);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition45 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder44);
        builder44.setskipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder44.mongoDb("hi!");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp50 = builder44.initialTimestamp;
        builder44.skipInitialImport = false;
        java.lang.String str53 = builder44.getmongoCollection();
        builder44.setmongoDb("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition56 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder44);
        java.lang.Object obj57 = docScoreSearchScript0.unwrap((java.lang.Object) builder44);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float58 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test697");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey(".scripts", "concurrent_requests");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test698");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("skip_initial_import", "bulk");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test699");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("hi!.null", "bulk_size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test700");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("secondary_read_preference", "concurrent_requests");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test701");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("concurrent_requests", "name");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test702");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_timeout", "user");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test703");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("user.null", "script.default_lang");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test704");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("secondary_read_preference", "name");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test705");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("import_all_collections", "exclude_fields");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test706");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder2.setriverIndexName("admin");
        builder2.storeStatistics = false;
        docScoreSearchScript0.setNextVar("import_all_collections", (java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean9 = builder8.getimportAllCollections();
        java.lang.String str10 = builder8.getmongoAdminUser();
        java.lang.String str11 = builder8.typeName;
        builder8.setmongoCollection("gridfs");
        builder8.setconnectTimeout((int) (short) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder8.build();
        builder8.importAllCollections = true;
        java.lang.Object obj19 = docScoreSearchScript0.unwrap((java.lang.Object) builder8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder20);
        java.lang.String str22 = mongoDBRiverDefinition21.scriptType;
        java.lang.String str23 = mongoDBRiverDefinition21.getTypeName();
        int int24 = mongoDBRiverDefinition21.getDEFAULT_SOCKET_TIMEOUT();
        java.lang.String str25 = mongoDBRiverDefinition21.getBULK_TIMEOUT_FIELD();
        java.lang.Object obj26 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition21);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean29 = builder28.getimportAllCollections();
        java.lang.String str30 = builder28.getmongoAdminUser();
        java.lang.String str31 = builder28.typeName;
        builder28.setmongoCollection("gridfs");
        java.lang.String str34 = builder28.riverIndexName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder28.dropCollection(true);
        docScoreSearchScript0.setNextVar("hi!.null", (java.lang.Object) true);
        docScoreSearchScript0.setNextScore((float) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long40 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test707");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("is_mongos", "script");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test708");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("port", "ssl_verify_certificate");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test709");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("ssl", "parent_types");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test710");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder2.setriverIndexName("admin");
        builder2.storeStatistics = false;
        docScoreSearchScript0.setNextVar("import_all_collections", (java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean9 = builder8.getimportAllCollections();
        java.lang.String str10 = builder8.getmongoAdminUser();
        java.lang.String str11 = builder8.typeName;
        builder8.setmongoCollection("gridfs");
        builder8.setconnectTimeout((int) (short) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder8.build();
        builder8.importAllCollections = true;
        java.lang.Object obj19 = docScoreSearchScript0.unwrap((java.lang.Object) builder8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder20);
        builder20.setskipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = builder20.mongoDb("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder20.disableIndexRefresh(false);
        java.lang.Object obj28 = docScoreSearchScript0.unwrap((java.lang.Object) builder27);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition31 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder30);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition32 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder30);
        boolean boolean33 = mongoDBRiverDefinition32.skipInitialImport;
        boolean boolean34 = mongoDBRiverDefinition32.isImportAllCollections();
        java.lang.String str35 = mongoDBRiverDefinition32.typeName;
        java.lang.String str36 = mongoDBRiverDefinition32.getRiverIndexName();
        boolean boolean37 = mongoDBRiverDefinition32.dropCollection;
        docScoreSearchScript0.setNextVar("servers", (java.lang.Object) mongoDBRiverDefinition32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj39 = docScoreSearchScript0.run();
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test711");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder2.setriverIndexName("admin");
        builder2.storeStatistics = false;
        docScoreSearchScript0.setNextVar("import_all_collections", (java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean9 = builder8.getimportAllCollections();
        java.lang.String str10 = builder8.getmongoAdminUser();
        java.lang.String str11 = builder8.typeName;
        builder8.setmongoCollection("gridfs");
        builder8.setconnectTimeout((int) (short) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder8.build();
        builder8.importAllCollections = true;
        java.lang.Object obj19 = docScoreSearchScript0.unwrap((java.lang.Object) builder8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder20);
        java.lang.String str22 = mongoDBRiverDefinition21.scriptType;
        java.lang.String str23 = mongoDBRiverDefinition21.getTypeName();
        int int24 = mongoDBRiverDefinition21.getDEFAULT_SOCKET_TIMEOUT();
        java.lang.String str25 = mongoDBRiverDefinition21.getBULK_TIMEOUT_FIELD();
        java.lang.Object obj26 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float27 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test712");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("is_mongos", ".scripts");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test713");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("null.null", "filter");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test714");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("concurrent_bulk_requests", "secondary_read_preference");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test715");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("hi!", "store_statistics");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test716");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("localhost", "ssl_verify_certificate");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test717");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("actions", "type");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test718");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("sandbox", "sandbox");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test719");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 1000);
        docScoreSearchScript0.setNextScore((float) 1000);
        docScoreSearchScript0.setNextScore(10.0f);
        docScoreSearchScript0.setNextScore(0.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        builder9.parentTypes = strSet23;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder9.throttleSize((int) (byte) 0);
        int int28 = builder9.getconnectTimeout();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition30 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder29);
        builder29.setskipInitialImport(true);
        builder29.scriptType = "admin";
        java.lang.String[] strArray37 = new java.lang.String[] { "", "password" };
        java.util.LinkedHashSet<java.lang.String> strSet38 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet38, strArray37);
        builder29.setincludeFields((java.util.Set<java.lang.String>) strSet38);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder9.excludeFields((java.util.Set<java.lang.String>) strSet38);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder9.advancedTransformation(false);
        java.lang.Object obj44 = docScoreSearchScript0.unwrap((java.lang.Object) builder9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition46 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder45);
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue47 = mongoDBRiverDefinition46.getDEFAULT_BULK_SIZE();
        java.lang.String str48 = mongoDBRiverDefinition46.getINITIAL_TIMESTAMP_FIELD();
        int int49 = mongoDBRiverDefinition46.getSocketTimeout();
        java.lang.String str50 = mongoDBRiverDefinition46.getTHROTTLE_SIZE_FIELD();
        java.lang.String str51 = mongoDBRiverDefinition46.getMongoCollection();
        boolean boolean52 = mongoDBRiverDefinition46.getmongoSSLVerifyCertificate();
        java.util.Set<java.lang.String> strSet53 = mongoDBRiverDefinition46.includeFields;
        java.lang.Object obj54 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition46);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (byte) -1);
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test720");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("filter", "admin");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test721");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript2 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript2.setNextScore((float) 1000);
        docScoreSearchScript2.setNextScore((float) 1000);
        docScoreSearchScript0.setNextVar("include_fields", (java.lang.Object) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        builder9.parentTypes = strSet23;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder9.throttleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.typeName("disable_index_refresh");
        docScoreSearchScript0.setNextVar("parent_types", (java.lang.Object) builder29);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition33 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder32);
        builder32.setskipInitialImport(true);
        builder32.scriptType = "admin";
        builder32.setstoreStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder32.isMongos((java.lang.Boolean) false);
        java.lang.String str42 = builder32.mongoAdminUser;
        docScoreSearchScript0.setNextVar("drop_collection", (java.lang.Object) str42);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition45 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder44);
        java.lang.String str46 = mongoDBRiverDefinition45.getSSL_CONNECTION_FIELD();
        int int47 = mongoDBRiverDefinition45.getDEFAULT_CONNECT_TIMEOUT();
        boolean boolean48 = mongoDBRiverDefinition45.dropCollection;
        java.lang.String str49 = mongoDBRiverDefinition45.getMongoAdminPassword();
        java.lang.Object obj50 = docScoreSearchScript0.unwrap((java.lang.Object) str49);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean52 = builder51.getimportAllCollections();
        java.lang.String str53 = builder51.mongoAdminUser;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = builder51.storeStatistics(true);
        boolean boolean56 = builder51.disableIndexRefresh;
        builder51.mongoAdminPassword = "index";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder60 = builder51.riverName("options");
        builder51.skipInitialImport = true;
        java.lang.Object obj63 = docScoreSearchScript0.unwrap((java.lang.Object) builder51);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (byte) 0);
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test722");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("index", "name");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test723");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("name", "gridfs");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test724");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        builder4.parentTypes = strSet18;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder4.throttleSize((int) (byte) 0);
        int int23 = builder4.getconnectTimeout();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder24);
        builder24.setskipInitialImport(true);
        builder24.scriptType = "admin";
        java.lang.String[] strArray32 = new java.lang.String[] { "", "password" };
        java.util.LinkedHashSet<java.lang.String> strSet33 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet33, strArray32);
        builder24.setincludeFields((java.util.Set<java.lang.String>) strSet33);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder4.excludeFields((java.util.Set<java.lang.String>) strSet33);
        builder36.statisticsTypeName = "throttle_size";
        java.lang.String str39 = builder36.scriptType;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition40 = builder36.build();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder36.statisticsIndexName("size");
        docScoreSearchScript0.setNextVar("name", (java.lang.Object) builder42);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition45 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder44);
        java.lang.String str46 = mongoDBRiverDefinition45.getSSL_CONNECTION_FIELD();
        int int47 = mongoDBRiverDefinition45.getDEFAULT_CONNECT_TIMEOUT();
        boolean boolean48 = mongoDBRiverDefinition45.dropCollection;
        java.lang.String str49 = mongoDBRiverDefinition45.getCONCURRENT_REQUESTS_FIELD();
        java.lang.String str50 = mongoDBRiverDefinition45.getSCRIPT_FIELD();
        java.lang.String str51 = mongoDBRiverDefinition45.riverIndexName;
        java.lang.String str52 = mongoDBRiverDefinition45.getINDEX_OBJECT();
        java.lang.String str53 = mongoDBRiverDefinition45.getPORT_FIELD();
        boolean boolean54 = mongoDBRiverDefinition45.skipInitialImport;
        boolean boolean55 = mongoDBRiverDefinition45.getmongoUseSSL();
        java.lang.Object obj56 = docScoreSearchScript0.unwrap((java.lang.Object) boolean55);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (short) 10);
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test725");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("port", "null.null");
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test726");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script.default_lang", "localhost");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test727");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("options", "ssl_verify_certificate");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test728");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("disable_index_refresh", "is_mongos");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test729");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script.disable_dynamic", "size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test730");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript2 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript2.setNextScore((float) 1000);
        docScoreSearchScript2.setNextScore((float) 1000);
        docScoreSearchScript0.setNextVar("include_fields", (java.lang.Object) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        builder9.parentTypes = strSet23;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder9.throttleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.typeName("disable_index_refresh");
        docScoreSearchScript0.setNextVar("parent_types", (java.lang.Object) builder29);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition33 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder32);
        builder32.setskipInitialImport(true);
        builder32.scriptType = "admin";
        builder32.setstoreStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder32.isMongos((java.lang.Boolean) false);
        java.lang.String str42 = builder32.mongoAdminUser;
        docScoreSearchScript0.setNextVar("drop_collection", (java.lang.Object) str42);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean45 = builder44.getimportAllCollections();
        java.lang.String str46 = builder44.getmongoAdminUser();
        java.lang.String str47 = builder44.typeName;
        builder44.setindexName("user");
        java.lang.Object obj50 = docScoreSearchScript0.unwrap((java.lang.Object) "user");
        docScoreSearchScript0.setNextScore((float) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(100);
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test731");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("secondary_read_preference", "sandbox");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test732");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("name", "socket_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test733");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_timeout", "concurrent_requests");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test734");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("gridfs", "user.null");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test735");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("disable_index_refresh", "script_type");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test736");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_timeout", "actions");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test737");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript2 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript2.setNextScore((float) 1000);
        docScoreSearchScript2.setNextScore((float) 1000);
        docScoreSearchScript0.setNextVar("include_fields", (java.lang.Object) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        builder9.parentTypes = strSet23;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder9.throttleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.typeName("disable_index_refresh");
        docScoreSearchScript0.setNextVar("parent_types", (java.lang.Object) builder29);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition33 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder32);
        builder32.setskipInitialImport(true);
        builder32.scriptType = "admin";
        builder32.setstoreStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder32.isMongos((java.lang.Boolean) false);
        java.lang.String str42 = builder32.mongoAdminUser;
        docScoreSearchScript0.setNextVar("drop_collection", (java.lang.Object) str42);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition46 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder45);
        java.lang.String str47 = mongoDBRiverDefinition46.scriptType;
        boolean boolean48 = mongoDBRiverDefinition46.isSkipInitialImport();
        java.lang.String str49 = mongoDBRiverDefinition46.getMongoLocalPassword();
        java.lang.String str50 = mongoDBRiverDefinition46.getSKIP_INITIAL_IMPORT_FIELD();
        boolean boolean51 = mongoDBRiverDefinition46.getskipInitialImport();
        docScoreSearchScript0.setNextVar("sandbox", (java.lang.Object) boolean51);
        docScoreSearchScript0.setNextScore((float) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float55 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test738");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("secondary_read_preference", "ssl");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test739");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder2.setriverIndexName("admin");
        builder2.storeStatistics = false;
        docScoreSearchScript0.setNextVar("import_all_collections", (java.lang.Object) false);
        docScoreSearchScript0.setNextScore((float) '4');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        builder10.parentTypes = strSet24;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder10.throttleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder28.scriptType("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder32.mongoAdminUser("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder32.throttleSize((int) '4');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder36.disableIndexRefresh(false);
        java.lang.Object obj39 = docScoreSearchScript0.unwrap((java.lang.Object) builder36);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(8);
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test740");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("throttle_size", "bulk_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test741");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder2.setriverIndexName("admin");
        builder2.storeStatistics = false;
        docScoreSearchScript0.setNextVar("import_all_collections", (java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean9 = builder8.getimportAllCollections();
        java.lang.String str10 = builder8.getmongoAdminUser();
        java.lang.String str11 = builder8.typeName;
        builder8.setmongoCollection("gridfs");
        builder8.setconnectTimeout((int) (short) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder8.build();
        builder8.importAllCollections = true;
        java.lang.Object obj19 = docScoreSearchScript0.unwrap((java.lang.Object) builder8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder20);
        java.lang.String str22 = mongoDBRiverDefinition21.scriptType;
        java.lang.String str23 = mongoDBRiverDefinition21.getTypeName();
        int int24 = mongoDBRiverDefinition21.getDEFAULT_SOCKET_TIMEOUT();
        java.lang.String str25 = mongoDBRiverDefinition21.getBULK_TIMEOUT_FIELD();
        java.lang.Object obj26 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition21);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder27);
        java.lang.String str29 = mongoDBRiverDefinition28.getSSL_CONNECTION_FIELD();
        int int30 = mongoDBRiverDefinition28.getDEFAULT_CONNECT_TIMEOUT();
        java.lang.String str31 = mongoDBRiverDefinition28.getADMIN_DB_FIELD();
        int int32 = mongoDBRiverDefinition28.connectTimeout;
        java.lang.Object obj33 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition28);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double34 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test742");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("advanced_transformation", "concurrent_bulk_requests");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test743");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("size", "exclude_fields");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test744");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("name", "bulk_size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test745");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 1000);
        docScoreSearchScript0.setNextScore((float) (byte) 10);
        docScoreSearchScript0.setNextScore(0.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(0);
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test746");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore(0.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(0);
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test747");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("parent_types", "localhost");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test748");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("user.null", "include_fields");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test749");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("ssl", "script.default_lang");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test750");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder2.setriverIndexName("admin");
        builder2.storeStatistics = false;
        docScoreSearchScript0.setNextVar("import_all_collections", (java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        builder8.setskipInitialImport(true);
        builder8.scriptType = "admin";
        java.lang.String[] strArray16 = new java.lang.String[] { "", "password" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        builder8.setincludeFields((java.util.Set<java.lang.String>) strSet17);
        builder8.setmongoDb("filter");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        com.mongodb.MongoClientOptions mongoClientOptions23 = mongoDBRiverDefinition22.getMongoClientOptions();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp24 = mongoDBRiverDefinition22.initialTimestamp;
        java.lang.Object obj25 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj26 = docScoreSearchScript0.run();
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test751");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("exclude_fields", "user.null");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test752");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("secondary_read_preference", "actions");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test753");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("connect_timeout", "script");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test754");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script_type", "store_statistics");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test755");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("concurrent_requests", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test756");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 1000);
        docScoreSearchScript0.setNextScore((float) (byte) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder5 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean6 = builder5.getimportAllCollections();
        java.lang.String str7 = builder5.getmongoAdminUser();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = builder5.mongoGridFS(false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder5);
        java.lang.String str12 = mongoDBRiverDefinition11.getINITIAL_TIMESTAMP_SCRIPT_FIELD();
        java.lang.Object obj13 = docScoreSearchScript0.unwrap((java.lang.Object) str12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj14 = docScoreSearchScript0.run();
    }

    @Test
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test757");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("filter", "bulk_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test758");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("host", "disable_index_refresh");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test759");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("name", "disable_index_refresh");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test760");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder2.setriverIndexName("admin");
        builder2.storeStatistics = false;
        docScoreSearchScript0.setNextVar("import_all_collections", (java.lang.Object) false);
        docScoreSearchScript0.setNextScore((float) '4');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        builder10.parentTypes = strSet24;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder10.throttleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder28.scriptType("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder32.mongoAdminUser("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder32.throttleSize((int) '4');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder36.disableIndexRefresh(false);
        java.lang.Object obj39 = docScoreSearchScript0.unwrap((java.lang.Object) builder36);
        docScoreSearchScript0.setNextScore((float) 100L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition43 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder42);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition44 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder42);
        java.lang.String str45 = mongoDBRiverDefinition44.getDISABLE_INDEX_REFRESH_FIELD();
        java.util.Set<java.lang.String> strSet46 = mongoDBRiverDefinition44.getParentTypes();
        java.lang.String str47 = mongoDBRiverDefinition44.getADMIN_DB_FIELD();
        java.lang.String str48 = mongoDBRiverDefinition44.getSECONDARY_READ_PREFERENCE_FIELD();
        java.util.Set<java.lang.String> strSet49 = mongoDBRiverDefinition44.excludeFields;
        java.util.Set<java.lang.String> strSet50 = mongoDBRiverDefinition44.getIncludeFields();
        java.lang.Object obj51 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition44);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition53 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder52);
        java.lang.String str54 = mongoDBRiverDefinition53.getSSL_CONNECTION_FIELD();
        java.lang.String str55 = mongoDBRiverDefinition53.getBULK_SIZE_FIELD();
        java.util.Set<java.lang.String> strSet56 = mongoDBRiverDefinition53.parentTypes;
        java.lang.String str57 = mongoDBRiverDefinition53.getNAME_FIELD();
        boolean boolean58 = mongoDBRiverDefinition53.advancedTransformation;
        java.lang.Object obj59 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition53);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long60 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test761");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("advanced_transformation", "host");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test762");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("size", "script.default_lang");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test763");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("name", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test764");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("ssl_verify_certificate", "store_statistics");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test765");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("options", "exclude_fields");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test766");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "connect_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test767");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("local", "import_all_collections");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test768");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script_type", "disable_index_refresh");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test769");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript2 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript2.setNextScore((float) 1000);
        docScoreSearchScript2.setNextScore((float) 1000);
        docScoreSearchScript0.setNextVar("include_fields", (java.lang.Object) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        builder9.parentTypes = strSet23;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder9.throttleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.typeName("disable_index_refresh");
        docScoreSearchScript0.setNextVar("parent_types", (java.lang.Object) builder29);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition33 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder32);
        builder32.setskipInitialImport(true);
        builder32.scriptType = "admin";
        builder32.setstoreStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder32.isMongos((java.lang.Boolean) false);
        java.lang.String str42 = builder32.mongoAdminUser;
        docScoreSearchScript0.setNextVar("drop_collection", (java.lang.Object) str42);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float44 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test770");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_timeout", "servers");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test771");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("user.null", "credentials");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test772");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("size", "ssl_verify_certificate");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test773");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk", "localhost");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test774");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("drop_collection", "disable_index_refresh");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test775");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder2.setriverIndexName("admin");
        builder2.storeStatistics = false;
        docScoreSearchScript0.setNextVar("import_all_collections", (java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean9 = builder8.getimportAllCollections();
        java.lang.String str10 = builder8.getmongoAdminUser();
        java.lang.String str11 = builder8.typeName;
        builder8.setmongoCollection("gridfs");
        builder8.setconnectTimeout((int) (short) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder8.build();
        builder8.importAllCollections = true;
        java.lang.Object obj19 = docScoreSearchScript0.unwrap((java.lang.Object) builder8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder20);
        java.lang.String str22 = mongoDBRiverDefinition21.scriptType;
        java.lang.String str23 = mongoDBRiverDefinition21.getTypeName();
        int int24 = mongoDBRiverDefinition21.getDEFAULT_SOCKET_TIMEOUT();
        java.lang.String str25 = mongoDBRiverDefinition21.getBULK_TIMEOUT_FIELD();
        java.lang.Object obj26 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj27 = docScoreSearchScript0.run();
    }

    @Test
    public void test776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test776");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        builder4.parentTypes = strSet18;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder4.throttleSize((int) (byte) 0);
        int int23 = builder4.getconnectTimeout();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder24);
        builder24.setskipInitialImport(true);
        builder24.scriptType = "admin";
        java.lang.String[] strArray32 = new java.lang.String[] { "", "password" };
        java.util.LinkedHashSet<java.lang.String> strSet33 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet33, strArray32);
        builder24.setincludeFields((java.util.Set<java.lang.String>) strSet33);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder4.excludeFields((java.util.Set<java.lang.String>) strSet33);
        builder36.statisticsTypeName = "throttle_size";
        java.lang.String str39 = builder36.scriptType;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition40 = builder36.build();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder36.statisticsIndexName("size");
        docScoreSearchScript0.setNextVar("name", (java.lang.Object) builder42);
        docScoreSearchScript0.setNextScore((float) 30000);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float46 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test777");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("ssl_verify_certificate", "include_fields");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test778");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("connect_timeout", "port");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test779");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("import_all_collections", "advanced_transformation");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test780");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 1000);
        docScoreSearchScript0.setNextScore((-1.0f));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float5 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test781");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("ssl", "import_all_collections");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test782");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript2 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript2.setNextScore((float) 1000);
        docScoreSearchScript2.setNextScore((float) 1000);
        docScoreSearchScript0.setNextVar("include_fields", (java.lang.Object) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        builder8.parentTypes = strSet22;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = builder8.throttleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder26.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder26.indexName("initial_timestamp");
        boolean boolean31 = builder26.getimportAllCollections();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition33 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder32);
        int int34 = builder32.getsocketTimeout();
        boolean boolean35 = builder32.advancedTransformation;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean37 = builder36.getimportAllCollections();
        java.lang.String str38 = builder36.getmongoAdminUser();
        java.util.List<com.mongodb.ServerAddress> serverAddressList39 = builder36.getmongoServers();
        builder32.mongoServers = serverAddressList39;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder26.mongoServers(serverAddressList39);
        java.lang.String str42 = builder26.statisticsIndexName;
        java.lang.Object obj43 = docScoreSearchScript0.unwrap((java.lang.Object) builder26);
        docScoreSearchScript0.setNextScore((float) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj46 = docScoreSearchScript0.run();
    }

    @Test
    public void test783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test783");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("flush_interval", "servers");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test784");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("store_statistics", "size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test785");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("connect_timeout", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test786");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("user", "name");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test787");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("filter", "host");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test788");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("socket_timeout", "parent_types");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test789");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("localhost", "disable_index_refresh");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test790");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        builder2.parentTypes = strSet16;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder2.throttleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder21);
        int int23 = builder21.getsocketTimeout();
        java.lang.String str24 = builder21.getincludeCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet39 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet39, strArray38);
        builder25.parentTypes = strSet39;
        builder21.excludeFields = strSet39;
        builder2.parentTypes = strSet39;
        docScoreSearchScript0.setNextVar("host", (java.lang.Object) strSet39);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (short) 100);
    }

    @Test
    public void test791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test791");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        builder4.parentTypes = strSet18;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder4.throttleSize((int) (byte) 0);
        int int23 = builder4.getconnectTimeout();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder24);
        builder24.setskipInitialImport(true);
        builder24.scriptType = "admin";
        java.lang.String[] strArray32 = new java.lang.String[] { "", "password" };
        java.util.LinkedHashSet<java.lang.String> strSet33 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet33, strArray32);
        builder24.setincludeFields((java.util.Set<java.lang.String>) strSet33);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder4.excludeFields((java.util.Set<java.lang.String>) strSet33);
        builder36.statisticsTypeName = "throttle_size";
        java.lang.String str39 = builder36.scriptType;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition40 = builder36.build();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder36.statisticsIndexName("size");
        docScoreSearchScript0.setNextVar("name", (java.lang.Object) builder42);
        docScoreSearchScript0.setNextScore(1.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition47 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder46);
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue48 = mongoDBRiverDefinition47.getDEFAULT_BULK_SIZE();
        int int49 = mongoDBRiverDefinition47.getDEFAULT_SOCKET_TIMEOUT();
        java.lang.String str50 = mongoDBRiverDefinition47.getINDEX_OBJECT();
        boolean boolean51 = mongoDBRiverDefinition47.getmongoSSLVerifyCertificate();
        java.lang.String str52 = mongoDBRiverDefinition47.getADMIN_DB_FIELD();
        java.lang.Object obj53 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition47);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long54 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test792");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("sandbox", "hi!.null");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test793");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("hi!", "credentials");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test794");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script.default_lang", "exclude_fields");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test795");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script.default_lang", "is_mongos");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test796");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("initial_timestamp", "credentials");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test797");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("null.null", "flush_interval");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test798");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((-1.0f));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long3 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test799");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("db", "secondary_read_preference");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test800");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("socket_timeout", "bulk");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test801");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 1000);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) ' ');
    }

    @Test
    public void test802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test802");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("null.gridfs", "user.null");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test803");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 1000);
        docScoreSearchScript0.setNextScore((float) 1000);
        docScoreSearchScript0.setNextScore(10.0f);
        docScoreSearchScript0.setNextScore(100.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float9 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test804");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_size", "concurrent_requests");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test805");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script.default_lang", "socket_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test806");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script.default_lang", "skip_initial_import");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test807");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("sandbox", "credentials");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test808");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder2.setriverIndexName("admin");
        builder2.storeStatistics = false;
        docScoreSearchScript0.setNextVar("import_all_collections", (java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean9 = builder8.getimportAllCollections();
        java.lang.String str10 = builder8.getmongoAdminUser();
        java.lang.String str11 = builder8.typeName;
        builder8.setmongoCollection("gridfs");
        builder8.setconnectTimeout((int) (short) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder8.build();
        builder8.importAllCollections = true;
        java.lang.Object obj19 = docScoreSearchScript0.unwrap((java.lang.Object) builder8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder20);
        java.lang.String str22 = mongoDBRiverDefinition21.scriptType;
        java.lang.String str23 = mongoDBRiverDefinition21.getTypeName();
        int int24 = mongoDBRiverDefinition21.getDEFAULT_SOCKET_TIMEOUT();
        java.lang.String str25 = mongoDBRiverDefinition21.getBULK_TIMEOUT_FIELD();
        java.lang.Object obj26 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition21);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder27);
        java.lang.String str29 = mongoDBRiverDefinition28.getSSL_CONNECTION_FIELD();
        int int30 = mongoDBRiverDefinition28.getDEFAULT_CONNECT_TIMEOUT();
        java.lang.String str31 = mongoDBRiverDefinition28.getADMIN_DB_FIELD();
        int int32 = mongoDBRiverDefinition28.connectTimeout;
        java.lang.Object obj33 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition28);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float34 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test809");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript2 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript2.setNextScore((float) 1000);
        docScoreSearchScript2.setNextScore((float) 1000);
        docScoreSearchScript0.setNextVar("include_fields", (java.lang.Object) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        builder9.parentTypes = strSet23;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder9.throttleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.typeName("disable_index_refresh");
        docScoreSearchScript0.setNextVar("parent_types", (java.lang.Object) builder29);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray44 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet45 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet45, strArray44);
        builder31.parentTypes = strSet45;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder31.throttleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition50 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder31);
        java.lang.String str51 = mongoDBRiverDefinition50.mongoLocalPassword;
        java.lang.String str52 = mongoDBRiverDefinition50.getCREDENTIALS_FIELD();
        java.lang.Object obj53 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition50);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(30000);
    }

    @Test
    public void test810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test810");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("connect_timeout", "bulk");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test811");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder2.setriverIndexName("admin");
        builder2.storeStatistics = false;
        docScoreSearchScript0.setNextVar("import_all_collections", (java.lang.Object) false);
        docScoreSearchScript0.setNextScore((float) '4');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder11 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition12 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder11);
        int int13 = builder11.getsocketTimeout();
        boolean boolean14 = builder11.advancedTransformation;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder15 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean16 = builder15.getimportAllCollections();
        java.lang.String str17 = builder15.getmongoAdminUser();
        java.util.List<com.mongodb.ServerAddress> serverAddressList18 = builder15.getmongoServers();
        builder11.mongoServers = serverAddressList18;
        java.lang.String str20 = builder11.mongoCollection;
        docScoreSearchScript0.setNextVar("user.null", (java.lang.Object) builder11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float22 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test812");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript2 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript2.setNextScore((float) 1000);
        docScoreSearchScript2.setNextScore((float) 1000);
        docScoreSearchScript0.setNextVar("include_fields", (java.lang.Object) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        builder9.parentTypes = strSet23;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder9.throttleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.typeName("disable_index_refresh");
        docScoreSearchScript0.setNextVar("parent_types", (java.lang.Object) builder29);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition33 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder32);
        builder32.setskipInitialImport(true);
        builder32.scriptType = "admin";
        builder32.setstoreStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder32.isMongos((java.lang.Boolean) false);
        java.lang.String str42 = builder32.mongoAdminUser;
        docScoreSearchScript0.setNextVar("drop_collection", (java.lang.Object) str42);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition46 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder45);
        java.lang.String str47 = mongoDBRiverDefinition46.scriptType;
        boolean boolean48 = mongoDBRiverDefinition46.isSkipInitialImport();
        java.lang.String str49 = mongoDBRiverDefinition46.getMongoLocalPassword();
        java.lang.String str50 = mongoDBRiverDefinition46.getSKIP_INITIAL_IMPORT_FIELD();
        boolean boolean51 = mongoDBRiverDefinition46.getskipInitialImport();
        docScoreSearchScript0.setNextVar("sandbox", (java.lang.Object) boolean51);
        docScoreSearchScript0.setNextScore((float) 0L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean56 = builder55.getimportAllCollections();
        java.lang.String str57 = builder55.getmongoAdminUser();
        java.lang.String str58 = builder55.typeName;
        builder55.setmongoCollection("gridfs");
        builder55.setconnectTimeout((int) (short) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition63 = builder55.build();
        org.elasticsearch.common.logging.ESLogger eSLogger64 = mongoDBRiverDefinition63.getlogger();
        java.lang.String str65 = mongoDBRiverDefinition63.getTHROTTLE_SIZE_FIELD();
        com.mongodb.BasicDBObject basicDBObject66 = mongoDBRiverDefinition63.mongoCollectionFilter;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject66);
    }

    @Test
    public void test813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test813");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("ssl", "script.disable_dynamic");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test814");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("collection", "user");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test815");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder2.setriverIndexName("admin");
        builder2.storeStatistics = false;
        docScoreSearchScript0.setNextVar("import_all_collections", (java.lang.Object) false);
        docScoreSearchScript0.setNextScore((float) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double10 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test816");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("filter", "servers");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test817");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("throttle_size", "user");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test818");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("sandbox", "connect_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test819");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("type", "local");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test820");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("secondary_read_preference", "localhost");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test821");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("index", "script.disable_dynamic");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test822");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("include_fields", "concurrent_bulk_requests");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test823");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script", "localhost");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test824");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("options", "flush_interval");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test825");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        builder2.parentTypes = strSet16;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder2.throttleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder21);
        int int23 = builder21.getsocketTimeout();
        java.lang.String str24 = builder21.getincludeCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet39 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet39, strArray38);
        builder25.parentTypes = strSet39;
        builder21.excludeFields = strSet39;
        builder2.parentTypes = strSet39;
        docScoreSearchScript0.setNextVar("host", (java.lang.Object) strSet39);
        docScoreSearchScript0.setNextScore((float) (short) 100);
        docScoreSearchScript0.setNextScore((float) '#');
        docScoreSearchScript0.setNextScore((-1.0f));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double51 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test826");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("initial_timestamp", "user.null");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test827");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript2 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript2.setNextScore((float) 1000);
        docScoreSearchScript2.setNextScore((float) 1000);
        docScoreSearchScript0.setNextVar("include_fields", (java.lang.Object) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        builder9.parentTypes = strSet23;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder9.throttleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.typeName("disable_index_refresh");
        docScoreSearchScript0.setNextVar("parent_types", (java.lang.Object) builder29);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition33 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder32);
        builder32.setskipInitialImport(true);
        builder32.scriptType = "admin";
        builder32.setstoreStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder32.isMongos((java.lang.Boolean) false);
        java.lang.String str42 = builder32.mongoAdminUser;
        docScoreSearchScript0.setNextVar("drop_collection", (java.lang.Object) str42);
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition47 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder46);
        builder46.setskipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = builder46.mongoDb("hi!");
        builder51.isMongos = true;
        builder51.indexName = "password";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder56 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition57 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder56);
        builder56.setskipInitialImport(true);
        builder56.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder63 = builder56.skipInitialImport(false);
        com.mongodb.BasicDBObject basicDBObject64 = builder56.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder65 = builder51.mongoOplogFilter(basicDBObject64);
        builder65.setscript("concurrent_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder69 = builder65.socketTimeout(1000);
        java.lang.Object obj70 = docScoreSearchScript0.unwrap((java.lang.Object) builder69);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double71 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test828");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("port", "bulk_size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test829");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk", "script.default_lang");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test830");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("gridfs", "hi!");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test831");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder2.setriverIndexName("admin");
        builder2.storeStatistics = false;
        docScoreSearchScript0.setNextVar("import_all_collections", (java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.scriptType;
        java.lang.String str11 = mongoDBRiverDefinition9.getSSL_CONNECTION_FIELD();
        boolean boolean12 = mongoDBRiverDefinition9.isImportAllCollections();
        boolean boolean13 = mongoDBRiverDefinition9.isMongoGridFS();
        boolean boolean14 = mongoDBRiverDefinition9.getmongoSecondaryReadPreference();
        boolean boolean15 = mongoDBRiverDefinition9.mongoGridFS;
        java.lang.Object obj16 = docScoreSearchScript0.unwrap((java.lang.Object) boolean15);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder17 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder17);
        java.lang.String str19 = mongoDBRiverDefinition18.getSERVERS_FIELD();
        java.lang.String str20 = mongoDBRiverDefinition18.getGRIDFS_FIELD();
        java.lang.String str21 = mongoDBRiverDefinition18.getACTIONS_FIELD();
        int int22 = mongoDBRiverDefinition18.getSocketTimeout();
        java.lang.String str23 = mongoDBRiverDefinition18.mongoCollection;
        java.lang.String str24 = mongoDBRiverDefinition18.getHOST_FIELD();
        java.lang.String str25 = mongoDBRiverDefinition18.getSERVERS_FIELD();
        java.lang.Object obj26 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((-1));
    }

    @Test
    public void test832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test832");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("store_statistics", "admin");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test833");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("servers", "credentials");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test834");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("store_statistics", "socket_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test835");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("localhost", "initial_timestamp");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test836");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder2);
        builder2.setskipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder2.mongoDb("hi!");
        builder7.indexName = "skip_initial_import";
        builder7.connectTimeout = 1;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder7.importAllCollections(false);
        docScoreSearchScript0.setNextVar("exclude_fields", (java.lang.Object) builder7);
        docScoreSearchScript0.setNextScore((float) '#');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet32, strArray31);
        builder18.parentTypes = strSet32;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder18.throttleSize((int) (byte) 0);
        java.lang.String str37 = builder36.getstatisticsIndexName();
        builder36.setmongoDb("name");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean41 = builder40.getimportAllCollections();
        java.lang.String str42 = builder40.getmongoAdminUser();
        java.lang.String str43 = builder40.typeName;
        boolean boolean44 = builder40.getstoreStatistics();
        boolean boolean45 = builder40.mongoUseSSL;
        java.util.List<com.mongodb.ServerAddress> serverAddressList46 = builder40.mongoServers;
        builder36.setmongoServers(serverAddressList46);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition48 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder36);
        builder36.setisMongos((java.lang.Boolean) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder52 = builder36.riverIndexName("ssl");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition53 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder52);
        docScoreSearchScript0.setNextVar("options", (java.lang.Object) mongoDBRiverDefinition53);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long55 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test837");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript2 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript2.setNextScore((float) 1000);
        docScoreSearchScript2.setNextScore((float) 1000);
        docScoreSearchScript0.setNextVar("include_fields", (java.lang.Object) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        builder9.parentTypes = strSet23;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder9.throttleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.typeName("disable_index_refresh");
        docScoreSearchScript0.setNextVar("parent_types", (java.lang.Object) builder29);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder31 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray44 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet45 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet45, strArray44);
        builder31.parentTypes = strSet45;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder31.throttleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition50 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder31);
        java.lang.String str51 = mongoDBRiverDefinition50.mongoLocalPassword;
        java.lang.String str52 = mongoDBRiverDefinition50.getCREDENTIALS_FIELD();
        java.lang.Object obj53 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition50);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float54 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test838");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("throttle_size", "connect_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test839");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script.disable_dynamic", "script.disable_dynamic");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test840");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("db", "socket_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test841");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_size", "gridfs");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test842");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script", "sandbox");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test843");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("servers", "script");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test844");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 1000);
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long5 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test845");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("user", "index");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test846");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("advanced_transformation", "admin");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test847");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("advanced_transformation", "port");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test848");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey(".scripts", "store_statistics");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test849");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 1000);
        docScoreSearchScript0.setNextScore((float) 1000);
        docScoreSearchScript0.setNextScore(10.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        builder8.setskipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder8.mongoDb("hi!");
        builder13.isMongos = true;
        java.lang.String str16 = builder13.typeName;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder18 = builder13.mongoSSLVerifyCertificate(false);
        builder18.mongoSSLVerifyCertificate = false;
        docScoreSearchScript0.setNextVar("actions", (java.lang.Object) false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double22 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test850");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("size", "servers");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test851");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("", "drop_collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test852");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("actions", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test853");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript2 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript2.setNextScore((float) 1000);
        docScoreSearchScript2.setNextScore((float) 1000);
        docScoreSearchScript0.setNextVar("include_fields", (java.lang.Object) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        builder9.parentTypes = strSet23;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder9.throttleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.typeName("disable_index_refresh");
        docScoreSearchScript0.setNextVar("parent_types", (java.lang.Object) builder29);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition33 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder32);
        builder32.setskipInitialImport(true);
        builder32.scriptType = "admin";
        builder32.setstoreStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder32.isMongos((java.lang.Boolean) false);
        java.lang.String str42 = builder32.mongoAdminUser;
        docScoreSearchScript0.setNextVar("drop_collection", (java.lang.Object) str42);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition45 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder44);
        builder44.setskipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder44.mongoDb("hi!");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp50 = builder44.initialTimestamp;
        builder44.skipInitialImport = false;
        java.lang.String str53 = builder44.getmongoCollection();
        builder44.setmongoDb("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition56 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder44);
        java.lang.Object obj57 = docScoreSearchScript0.unwrap((java.lang.Object) builder44);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (byte) 10);
    }

    @Test
    public void test854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test854");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder2.setriverIndexName("admin");
        builder2.storeStatistics = false;
        docScoreSearchScript0.setNextVar("import_all_collections", (java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean9 = builder8.getimportAllCollections();
        java.lang.String str10 = builder8.getmongoAdminUser();
        java.lang.String str11 = builder8.typeName;
        builder8.setmongoCollection("gridfs");
        builder8.setconnectTimeout((int) (short) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder8.build();
        builder8.importAllCollections = true;
        java.lang.Object obj19 = docScoreSearchScript0.unwrap((java.lang.Object) builder8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder20);
        java.lang.String str22 = mongoDBRiverDefinition21.scriptType;
        java.lang.String str23 = mongoDBRiverDefinition21.getTypeName();
        int int24 = mongoDBRiverDefinition21.getDEFAULT_SOCKET_TIMEOUT();
        java.lang.String str25 = mongoDBRiverDefinition21.getBULK_TIMEOUT_FIELD();
        java.lang.Object obj26 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition21);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder27);
        java.lang.String str29 = mongoDBRiverDefinition28.getSSL_CONNECTION_FIELD();
        int int30 = mongoDBRiverDefinition28.getDEFAULT_CONNECT_TIMEOUT();
        java.lang.String str31 = mongoDBRiverDefinition28.getADMIN_DB_FIELD();
        int int32 = mongoDBRiverDefinition28.connectTimeout;
        java.lang.Object obj33 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition28);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean35 = builder34.getimportAllCollections();
        java.lang.String str36 = builder34.getmongoAdminUser();
        java.lang.String str37 = builder34.typeName;
        java.lang.String str38 = builder34.getmongoLocalUser();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder40 = builder34.disableIndexRefresh(true);
        boolean boolean41 = builder34.importAllCollections;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder34.riverName("parent_types");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = builder43.riverIndexName("is_mongos");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = builder43.connectTimeout(100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder43.mongoGridFS(true);
        com.mongodb.BasicDBObject basicDBObject50 = builder43.mongoCollectionFilter;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject50);
    }

    @Test
    public void test855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test855");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("concurrent_requests", "ssl_verify_certificate");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test856");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("secondary_read_preference", "include_collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test857");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("exclude_fields", "null.gridfs");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test858");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 1000);
        docScoreSearchScript0.setNextScore((-1.0f));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj5 = docScoreSearchScript0.run();
    }

    @Test
    public void test859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test859");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 1000);
        docScoreSearchScript0.setNextScore((float) (byte) 10);
        docScoreSearchScript0.setNextScore(0.0f);
        docScoreSearchScript0.setNextScore((float) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (short) 100);
    }

    @Test
    public void test860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test860");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("disable_index_refresh", "gridfs");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test861");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("host", "include_collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test862");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("concurrent_requests", "index");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test863");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk", "servers");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test864");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script.default_lang", "filter");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test865");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script", "is_mongos");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test866");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("user", "drop_collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test867");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("connect_timeout", "script.disable_dynamic");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test868");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("import_all_collections", "parent_types");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test869");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("user", "script.default_lang");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test870");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder2.setriverIndexName("admin");
        builder2.storeStatistics = false;
        docScoreSearchScript0.setNextVar("import_all_collections", (java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        builder8.setskipInitialImport(true);
        builder8.scriptType = "admin";
        java.lang.String[] strArray16 = new java.lang.String[] { "", "password" };
        java.util.LinkedHashSet<java.lang.String> strSet17 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        builder8.setincludeFields((java.util.Set<java.lang.String>) strSet17);
        builder8.setmongoDb("filter");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        com.mongodb.MongoClientOptions mongoClientOptions23 = mongoDBRiverDefinition22.getMongoClientOptions();
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp24 = mongoDBRiverDefinition22.initialTimestamp;
        java.lang.Object obj25 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition22);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder26 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet40 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet40, strArray39);
        builder26.parentTypes = strSet40;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = builder26.script("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder46 = builder44.indexName("password");
        builder46.setimportAllCollections(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition49 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder46);
        java.lang.String str50 = builder46.mongoDb;
        builder46.typeName = "script";
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp53 = builder46.initialTimestamp;
        builder46.setisMongos((java.lang.Boolean) true);
        boolean boolean56 = builder46.getdisableIndexRefresh();
        java.lang.Object obj57 = docScoreSearchScript0.unwrap((java.lang.Object) boolean56);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(0);
    }

    @Test
    public void test871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test871");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("advanced_transformation", "ssl");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test872");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.addRemovePrefix("", "null.null", true);
    }

    @Test
    public void test873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test873");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("collection", "");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test874");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("ssl", "initial_timestamp");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test875");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("localhost", "store_statistics");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test876");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script.disable_dynamic", "local");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test877");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("localhost", "local");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test878");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder2.setriverIndexName("admin");
        builder2.storeStatistics = false;
        docScoreSearchScript0.setNextVar("import_all_collections", (java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder8);
        java.lang.String str10 = mongoDBRiverDefinition9.scriptType;
        java.lang.String str11 = mongoDBRiverDefinition9.getSSL_CONNECTION_FIELD();
        boolean boolean12 = mongoDBRiverDefinition9.isImportAllCollections();
        boolean boolean13 = mongoDBRiverDefinition9.isMongoGridFS();
        boolean boolean14 = mongoDBRiverDefinition9.getmongoSecondaryReadPreference();
        boolean boolean15 = mongoDBRiverDefinition9.mongoGridFS;
        java.lang.Object obj16 = docScoreSearchScript0.unwrap((java.lang.Object) boolean15);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId(60000);
    }

    @Test
    public void test879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test879");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("concurrent_bulk_requests", "options");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test880");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script_type", "index");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test881");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 1000);
        docScoreSearchScript0.setNextScore((float) 1000);
        docScoreSearchScript0.setNextScore(10.0f);
        docScoreSearchScript0.setNextScore(0.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder9);
        builder9.setskipInitialImport(true);
        builder9.scriptType = "admin";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder16 = builder9.skipInitialImport(false);
        java.lang.String str17 = builder16.getstatisticsTypeName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder19 = builder16.importAllCollections(true);
        boolean boolean20 = builder19.disableIndexRefresh;
        builder19.scriptType = "socket_timeout";
        java.util.List<com.mongodb.ServerAddress> serverAddressList23 = builder19.mongoServers;
        java.lang.Object obj24 = docScoreSearchScript0.unwrap((java.lang.Object) serverAddressList23);
        docScoreSearchScript0.setNextScore((float) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj27 = docScoreSearchScript0.run();
    }

    @Test
    public void test882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test882");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("skip_initial_import", "import_all_collections");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test883");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("host", "concurrent_requests");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test884");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("password", "name");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test885");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("flush_interval", "password");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test886");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        builder2.parentTypes = strSet16;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = builder2.throttleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition22 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder21);
        int int23 = builder21.getsocketTimeout();
        java.lang.String str24 = builder21.getincludeCollection();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet39 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet39, strArray38);
        builder25.parentTypes = strSet39;
        builder21.excludeFields = strSet39;
        builder2.parentTypes = strSet39;
        docScoreSearchScript0.setNextVar("host", (java.lang.Object) strSet39);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj45 = docScoreSearchScript0.run();
    }

    @Test
    public void test887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test887");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("disable_index_refresh", "concurrent_requests");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test888");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("name", "collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test889");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript2 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript2.setNextScore((float) 1000);
        docScoreSearchScript2.setNextScore((float) 1000);
        docScoreSearchScript0.setNextVar("include_fields", (java.lang.Object) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        builder9.parentTypes = strSet23;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder9.throttleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.typeName("disable_index_refresh");
        docScoreSearchScript0.setNextVar("parent_types", (java.lang.Object) builder29);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition33 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder32);
        builder32.setskipInitialImport(true);
        builder32.scriptType = "admin";
        builder32.setstoreStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder32.isMongos((java.lang.Boolean) false);
        java.lang.String str42 = builder32.mongoAdminUser;
        docScoreSearchScript0.setNextVar("drop_collection", (java.lang.Object) str42);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder44 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition45 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder44);
        builder44.setskipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder49 = builder44.mongoDb("hi!");
        org.elasticsearch.river.mongodb.Timestamp<?> wildcardTimestamp50 = builder44.initialTimestamp;
        builder44.skipInitialImport = false;
        java.lang.String str53 = builder44.getmongoCollection();
        builder44.setmongoDb("credentials");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition56 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder44);
        java.lang.Object obj57 = docScoreSearchScript0.unwrap((java.lang.Object) builder44);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        long long58 = docScoreSearchScript0.runAsLong();
    }

    @Test
    public void test890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test890");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_timeout", "port");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test891");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("secondary_read_preference", "admin");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test892");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("connect_timeout", "bulk_timeout");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test893");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("drop_collection", "local");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test894");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder2.setriverIndexName("admin");
        builder2.storeStatistics = false;
        docScoreSearchScript0.setNextVar("import_all_collections", (java.lang.Object) false);
        docScoreSearchScript0.setNextScore((float) '4');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        builder10.parentTypes = strSet24;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder10.throttleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = builder28.typeName("disable_index_refresh");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = builder28.scriptType("port");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder34 = builder32.mongoAdminUser("servers");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder32.throttleSize((int) '4');
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder38 = builder36.disableIndexRefresh(false);
        java.lang.Object obj39 = docScoreSearchScript0.unwrap((java.lang.Object) builder36);
        docScoreSearchScript0.setNextScore((float) 100L);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition43 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder42);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition44 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder42);
        java.lang.String str45 = mongoDBRiverDefinition44.getDISABLE_INDEX_REFRESH_FIELD();
        java.util.Set<java.lang.String> strSet46 = mongoDBRiverDefinition44.getParentTypes();
        java.lang.String str47 = mongoDBRiverDefinition44.getADMIN_DB_FIELD();
        java.lang.String str48 = mongoDBRiverDefinition44.getSECONDARY_READ_PREFERENCE_FIELD();
        java.util.Set<java.lang.String> strSet49 = mongoDBRiverDefinition44.excludeFields;
        java.util.Set<java.lang.String> strSet50 = mongoDBRiverDefinition44.getIncludeFields();
        java.lang.Object obj51 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition44);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (byte) 100);
    }

    @Test
    public void test895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test895");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_timeout", "concurrent_bulk_requests");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test896");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("gridfs", "throttle_size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test897");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_size", "local");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test898");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("skip_initial_import", "initial_timestamp");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test899");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("user", "advanced_transformation");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test900");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("script", "type");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test901");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("local", "null.null");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test902");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("ssl", "include_collection");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test903");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder2.setriverIndexName("admin");
        builder2.storeStatistics = false;
        docScoreSearchScript0.setNextVar("import_all_collections", (java.lang.Object) false);
        docScoreSearchScript0.setNextScore((float) 30000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder10 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet24 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet24, strArray23);
        builder10.parentTypes = strSet24;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder28 = builder10.throttleSize((int) (byte) 0);
        int int29 = builder10.getconnectTimeout();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder30 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition31 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder30);
        builder30.setskipInitialImport(true);
        builder30.scriptType = "admin";
        java.lang.String[] strArray38 = new java.lang.String[] { "", "password" };
        java.util.LinkedHashSet<java.lang.String> strSet39 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet39, strArray38);
        builder30.setincludeFields((java.util.Set<java.lang.String>) strSet39);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder10.excludeFields((java.util.Set<java.lang.String>) strSet39);
        builder42.statisticsTypeName = "throttle_size";
        builder42.script = "initial_timestamp";
        com.mongodb.BasicDBObject basicDBObject47 = builder42.getmongoCollectionFilter();
        java.lang.String str48 = builder42.getriverIndexName();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition49 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder42);
        java.lang.String str50 = builder42.scriptType;
        boolean boolean51 = builder42.skipInitialImport;
        com.mongodb.BasicDBObject basicDBObject52 = builder42.getmongoCollectionFilter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextSource((java.util.Map<java.lang.String, java.lang.Object>) basicDBObject52);
    }

    @Test
    public void test904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test904");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey(".scripts", "flush_interval");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test905");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("bulk_size", "ssl");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test906");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        builder4.parentTypes = strSet18;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder4.throttleSize((int) (byte) 0);
        int int23 = builder4.getconnectTimeout();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder24);
        builder24.setskipInitialImport(true);
        builder24.scriptType = "admin";
        java.lang.String[] strArray32 = new java.lang.String[] { "", "password" };
        java.util.LinkedHashSet<java.lang.String> strSet33 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet33, strArray32);
        builder24.setincludeFields((java.util.Set<java.lang.String>) strSet33);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder4.excludeFields((java.util.Set<java.lang.String>) strSet33);
        builder36.statisticsTypeName = "throttle_size";
        java.lang.String str39 = builder36.scriptType;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition40 = builder36.build();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder36.statisticsIndexName("size");
        docScoreSearchScript0.setNextVar("name", (java.lang.Object) builder42);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition46 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder45);
        builder45.setskipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder50 = builder45.mongoDb("hi!");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder51 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition52 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder51);
        builder51.setskipInitialImport(true);
        builder51.scriptType = "admin";
        builder51.setstoreStatistics(true);
        boolean boolean59 = builder51.importAllCollections;
        int int60 = builder51.throttleSize;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder61 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean62 = builder61.getimportAllCollections();
        java.lang.String str63 = builder61.getmongoAdminUser();
        java.lang.String str64 = builder61.typeName;
        java.util.List<com.mongodb.ServerAddress> serverAddressList65 = builder61.mongoServers;
        builder51.setmongoServers(serverAddressList65);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder67 = builder45.mongoServers(serverAddressList65);
        builder45.setriverIndexName("concurrent_bulk_requests");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder70 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray83 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet84 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet84, strArray83);
        builder70.parentTypes = strSet84;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder88 = builder70.script("port");
        builder88.setindexName("flush_interval");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder92 = builder88.mongoLocalPassword("");
        com.mongodb.BasicDBObject basicDBObject93 = builder92.getmongoCollectionFilter();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder94 = builder45.mongoOplogFilter(basicDBObject93);
        boolean boolean95 = builder94.advancedTransformation;
        docScoreSearchScript0.setNextVar("socket_timeout", (java.lang.Object) boolean95);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double97 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test907");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        builder2.setriverIndexName("admin");
        builder2.storeStatistics = false;
        docScoreSearchScript0.setNextVar("import_all_collections", (java.lang.Object) false);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder8 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        boolean boolean9 = builder8.getimportAllCollections();
        java.lang.String str10 = builder8.getmongoAdminUser();
        java.lang.String str11 = builder8.typeName;
        builder8.setmongoCollection("gridfs");
        builder8.setconnectTimeout((int) (short) -1);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition16 = builder8.build();
        builder8.importAllCollections = true;
        java.lang.Object obj19 = docScoreSearchScript0.unwrap((java.lang.Object) builder8);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder20 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition21 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder20);
        java.lang.String str22 = mongoDBRiverDefinition21.scriptType;
        java.lang.String str23 = mongoDBRiverDefinition21.getTypeName();
        int int24 = mongoDBRiverDefinition21.getDEFAULT_SOCKET_TIMEOUT();
        java.lang.String str25 = mongoDBRiverDefinition21.getBULK_TIMEOUT_FIELD();
        java.lang.Object obj26 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition21);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition28 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder27);
        java.lang.String str29 = mongoDBRiverDefinition28.getSSL_CONNECTION_FIELD();
        int int30 = mongoDBRiverDefinition28.getDEFAULT_CONNECT_TIMEOUT();
        java.lang.String str31 = mongoDBRiverDefinition28.getADMIN_DB_FIELD();
        int int32 = mongoDBRiverDefinition28.connectTimeout;
        java.lang.Object obj33 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition28);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        docScoreSearchScript0.setNextDocId((int) (short) 100);
    }

    @Test
    public void test908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test908");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 1000);
        docScoreSearchScript0.setNextScore((float) 1000);
        docScoreSearchScript0.setNextScore(10.0f);
        docScoreSearchScript0.setNextScore(0.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        builder9.parentTypes = strSet23;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder9.throttleSize((int) (byte) 0);
        int int28 = builder9.getconnectTimeout();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition30 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder29);
        builder29.setskipInitialImport(true);
        builder29.scriptType = "admin";
        java.lang.String[] strArray37 = new java.lang.String[] { "", "password" };
        java.util.LinkedHashSet<java.lang.String> strSet38 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet38, strArray37);
        builder29.setincludeFields((java.util.Set<java.lang.String>) strSet38);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder9.excludeFields((java.util.Set<java.lang.String>) strSet38);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder9.advancedTransformation(false);
        java.lang.Object obj44 = docScoreSearchScript0.unwrap((java.lang.Object) builder9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition46 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder45);
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue47 = mongoDBRiverDefinition46.getDEFAULT_BULK_SIZE();
        java.lang.String str48 = mongoDBRiverDefinition46.getINITIAL_TIMESTAMP_FIELD();
        int int49 = mongoDBRiverDefinition46.getSocketTimeout();
        java.lang.String str50 = mongoDBRiverDefinition46.getTHROTTLE_SIZE_FIELD();
        java.lang.String str51 = mongoDBRiverDefinition46.getMongoCollection();
        boolean boolean52 = mongoDBRiverDefinition46.getmongoSSLVerifyCertificate();
        java.util.Set<java.lang.String> strSet53 = mongoDBRiverDefinition46.includeFields;
        java.lang.Object obj54 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition46);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double55 = docScoreSearchScript0.runAsDouble();
    }

    @Test
    public void test909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test909");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("host", "throttle_size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test910");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder2 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition3 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder2);
        builder2.setskipInitialImport(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder7 = builder2.mongoDb("hi!");
        builder7.indexName = "skip_initial_import";
        builder7.connectTimeout = 1;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder13 = builder7.importAllCollections(false);
        docScoreSearchScript0.setNextVar("exclude_fields", (java.lang.Object) builder7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float15 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test911");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("port", "servers");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test912");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 1000);
        docScoreSearchScript0.setNextScore((float) 1000);
        docScoreSearchScript0.setNextScore(10.0f);
        docScoreSearchScript0.setNextScore(0.0f);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        builder9.parentTypes = strSet23;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder9.throttleSize((int) (byte) 0);
        int int28 = builder9.getconnectTimeout();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition30 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder29);
        builder29.setskipInitialImport(true);
        builder29.scriptType = "admin";
        java.lang.String[] strArray37 = new java.lang.String[] { "", "password" };
        java.util.LinkedHashSet<java.lang.String> strSet38 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet38, strArray37);
        builder29.setincludeFields((java.util.Set<java.lang.String>) strSet38);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder9.excludeFields((java.util.Set<java.lang.String>) strSet38);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder43 = builder9.advancedTransformation(false);
        java.lang.Object obj44 = docScoreSearchScript0.unwrap((java.lang.Object) builder9);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition46 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder45);
        org.elasticsearch.common.unit.ByteSizeValue byteSizeValue47 = mongoDBRiverDefinition46.getDEFAULT_BULK_SIZE();
        java.lang.String str48 = mongoDBRiverDefinition46.getINITIAL_TIMESTAMP_FIELD();
        int int49 = mongoDBRiverDefinition46.getSocketTimeout();
        java.lang.String str50 = mongoDBRiverDefinition46.getTHROTTLE_SIZE_FIELD();
        java.lang.String str51 = mongoDBRiverDefinition46.getMongoCollection();
        boolean boolean52 = mongoDBRiverDefinition46.getmongoSSLVerifyCertificate();
        java.util.Set<java.lang.String> strSet53 = mongoDBRiverDefinition46.includeFields;
        java.lang.Object obj54 = docScoreSearchScript0.unwrap((java.lang.Object) mongoDBRiverDefinition46);
        docScoreSearchScript0.setNextScore((float) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Object obj57 = docScoreSearchScript0.run();
    }

    @Test
    public void test913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test913");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("size", "name");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test914");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = org.elasticsearch.river.mongodb.MongoDBRiverDefinition.removePrefix("index", "null.null");
    }

    @Test
    public void test915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test915");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("admin", "concurrent_bulk_requests");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test916");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("null.gridfs", "port");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test917");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("connect_timeout", "servers");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test918");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("initial_timestamp", "throttle_size");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test919");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript2 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript2.setNextScore((float) 1000);
        docScoreSearchScript2.setNextScore((float) 1000);
        docScoreSearchScript0.setNextVar("include_fields", (java.lang.Object) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder9 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet23, strArray22);
        builder9.parentTypes = strSet23;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder27 = builder9.throttleSize((int) (byte) 0);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder29 = builder27.typeName("disable_index_refresh");
        docScoreSearchScript0.setNextVar("parent_types", (java.lang.Object) builder29);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder32 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition33 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder32);
        builder32.setskipInitialImport(true);
        builder32.scriptType = "admin";
        builder32.setstoreStatistics(true);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder41 = builder32.isMongos((java.lang.Boolean) false);
        java.lang.String str42 = builder32.mongoAdminUser;
        docScoreSearchScript0.setNextVar("drop_collection", (java.lang.Object) str42);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder45 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition46 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder45);
        java.lang.String str47 = mongoDBRiverDefinition46.scriptType;
        boolean boolean48 = mongoDBRiverDefinition46.isSkipInitialImport();
        java.lang.String str49 = mongoDBRiverDefinition46.getMongoLocalPassword();
        java.lang.String str50 = mongoDBRiverDefinition46.getSKIP_INITIAL_IMPORT_FIELD();
        boolean boolean51 = mongoDBRiverDefinition46.getskipInitialImport();
        docScoreSearchScript0.setNextVar("sandbox", (java.lang.Object) boolean51);
        docScoreSearchScript0.setNextScore((float) (short) 100);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder55 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition56 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder55);
        int int57 = builder55.getsocketTimeout();
        boolean boolean58 = builder55.advancedTransformation;
        builder55.setriverName("include_fields");
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder62 = builder55.disableIndexRefresh(true);
        builder55.script = "throttle_size";
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder66 = builder55.skipInitialImport(true);
        builder55.setstatisticsIndexName("");
        java.lang.Object obj69 = docScoreSearchScript0.unwrap((java.lang.Object) builder55);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float70 = docScoreSearchScript0.runAsFloat();
    }

    @Test
    public void test920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test920");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("options", "servers");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test921");
        org.elasticsearch.script.ScriptService.CacheKey cacheKey2 = new org.elasticsearch.script.ScriptService.CacheKey("host", "ssl");
        org.junit.Assert.assertTrue("Contract failed: !cacheKey2.equals(null)", !cacheKey2.equals(null));
    }

    @Test
    public void test922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test922");
        org.elasticsearch.script.ScriptService.DocScoreSearchScript docScoreSearchScript0 = new org.elasticsearch.script.ScriptService.DocScoreSearchScript();
        docScoreSearchScript0.setNextScore((float) 1000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder4 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "", "", "exclude_fields", "socket_timeout", "script.default_lang", "gridfs", "hi!", "servers", "", "", "servers" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        builder4.parentTypes = strSet18;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder22 = builder4.throttleSize((int) (byte) 0);
        int int23 = builder4.getconnectTimeout();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder24 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition25 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder24);
        builder24.setskipInitialImport(true);
        builder24.scriptType = "admin";
        java.lang.String[] strArray32 = new java.lang.String[] { "", "password" };
        java.util.LinkedHashSet<java.lang.String> strSet33 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet33, strArray32);
        builder24.setincludeFields((java.util.Set<java.lang.String>) strSet33);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder36 = builder4.excludeFields((java.util.Set<java.lang.String>) strSet33);
        builder36.statisticsTypeName = "throttle_size";
        java.lang.String str39 = builder36.scriptType;
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition40 = builder36.build();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder42 = builder36.statisticsIndexName("size");
        docScoreSearchScript0.setNextVar("name", (java.lang.Object) builder42);
        docScoreSearchScript0.setNextScore((float) 30000);
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder builder47 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition.Builder();
        org.elasticsearch.river.mongodb.MongoDBRiverDefinition mongoDBRiverDefinition48 = new org.elasticsearch.river.mongodb.MongoDBRiverDefinition(builder47);
        java.lang.String str49 = mongoDBRiverDefinition48.scriptType;
        java.lang.String str50 = mongoDBRiverDefinition48.getSSL_CONNECTION_FIELD();
        boolean boolean51 = mongoDBRiverDefinition48.isImportAllCollections();
        boolean boolean52 = mongoDBRiverDefinition48.isMongoGridFS();
        java.lang.String str53 = mongoDBRiverDefinition48.getINITIAL_TIMESTAMP_SCRIPT_TYPE_FIELD();
        java.lang.String str54 = mongoDBRiverDefinition48.getSOCKET_TIMEOUT();
        java.lang.String str55 = mongoDBRiverDefinition48.getMongoOplogNamespace();
        java.lang.String str56 = mongoDBRiverDefinition48.getIMPORT_ALL_COLLECTIONS_FIELD();
        java.lang.String str57 = mongoDBRiverDefinition48.getCONCURRENT_BULK_REQUESTS_FIELD();
        docScoreSearchScript0.setNextVar("", (java.lang.Object) mongoDBRiverDefinition48);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        float float59 = docScoreSearchScript0.runAsFloat();
    }
}

